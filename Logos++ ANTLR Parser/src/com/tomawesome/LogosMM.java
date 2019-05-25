package com.tomawesome;



import java.io.File;
import java.io.FileInputStream;

import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.*;

import java.util.regex.Matcher;
import java.util.regex.MatchResult;
import java.util.regex.Pattern;

import java.util.stream.Stream;


import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTreeWalker;



import static com.tomawesome.SwiftFunctionNameMangler.mangleFunction;





/*
* Logos--
* Translates from Logos++ to plain Logos
* */

public class LogosMM
{
	private class TranslatedUnit
	{
		int originalStartLineNumber;
		int originalEndLineNumber;

		String logosCode;


		public int getOriginalStartLineNumber()
		{
			return originalStartLineNumber;
		}
	}



	public void translate(String path)
	{
		if (!path.endsWith(".xxm"))
		{
			System.out.println("[logos--] WARNING: File does not end with the Logos++ extension ('xxm'). Ignoring and Proceeding.");
		}


		File sourceFile = new File(path);

		if (!sourceFile.exists() || sourceFile.isDirectory())
		{
			System.out.println("[logos--] ERROR: File does not exist or is not a file.");


			return;
		}


		List<LogosXXExtractor.LogosXXUnit> extractedLogosXX = extractLogosXX(path);

		if (extractedLogosXX.size() == 0)
		{
			System.out.println("[logos--] No Logos++ Code Found.");


			return;
		}



		List<TranslatedUnit> translations = new ArrayList<TranslatedUnit>();
		boolean highLevelPassNeeded = false;
		for (LogosXXExtractor.LogosXXUnit rawUnit : extractedLogosXX)
		{
			if (rawUnit.specificClassID == "hookswiftf")
			{
				if (!rawUnit.rawline.contains("%callswift")) // for low-level pass, translate higher levels if we can
				{
					LogosXXExtractor.HookSwiftFUnit unit = (LogosXXExtractor.HookSwiftFUnit) rawUnit;

					String rawTranslation = String.format("static %s (*orig_%s)(%s) = NULL;\n" +
									"\n" +
									"%s hook_%s(%s) %s\n" +
									"\n" +
									"%%ctor {\n" +
									"    %%init(%s = objc_getClass(\"%s\"));\n" +
									"    MSHookFunction(MSFindSymbol(NULL, \"%s\"),\n" +
									"                   (void*)hook_%s,\n" +
									"                   (void**)&orig_%s);\n" +
									"}",
							unit.returnType, unit.methodName.replace("@", "").replace("\"", ""), unit.parameterList,
							unit.returnType, unit.methodName.replace("@", "").replace("\"", ""), unit.parameterList, fixOrigs(unit),
							unit.target.replace("@", "").replace("\"", "").substring(unit.target.indexOf(".") - 1), unit.target.replace("@", "").replace("\"", ""),
							unit.methodName.replace("@", "").replace("\"", ""),
							unit.methodName.replace("@", "").replace("\"", ""),
							unit.methodName.replace("@", "").replace("\"", ""));


					TranslatedUnit translation = new TranslatedUnit();

					translation.originalStartLineNumber = unit.startLineNumber;
					translation.originalEndLineNumber = unit.endLineNumber;
					translation.logosCode = rawTranslation;

					translations.add(translation);
				}
				else
				{
					highLevelPassNeeded = true;
				}
			}
			else if (rawUnit.specificClassID == "hookswift")
			{
				if (!rawUnit.rawline.contains("%callswift")) // for low-level pass, translate higher levels if we can
				{
					LogosXXExtractor.HookSwiftUnit unit = (LogosXXExtractor.HookSwiftUnit) rawUnit;

					String rawTranslation = String.format("%%hook %s%s\n" +
									"%s\n" +
									"%%end\n\n" +
									"%%ctor \n{\n" +
									"	%%init(%s%s=objc_getClass(\"%s\"));\n" +
									"}", unit.appName, unit.className,
							unit.hookedContents,
							unit.appName, unit.className, unit.appName + "." + unit.className);


					TranslatedUnit translation = new TranslatedUnit();

					translation.originalStartLineNumber = unit.startLineNumber;
					translation.originalEndLineNumber = unit.endLineNumber;
					translation.logosCode = rawTranslation;

					translations.add(translation);
				}
				else
				{
					highLevelPassNeeded = true;
				}
			}
			else if (rawUnit.specificClassID == "callswift")
			{
				LogosXXExtractor.CallSwiftUnit unit = (LogosXXExtractor.CallSwiftUnit) rawUnit;

				String rawTranslation = String.format("%s (*symbol_%s)(%s) = MSFindSymbol(NULL, \"%s\");\n" +
								"symbol_%s(%s);",
						unit.returnType, mangleFunction(unit.returnType, unit.friendlyFunctionName.replace("\"", ""), unit.typeList.replace("(", "").replace(")", "")), unit.typeList, mangleFunction(unit.returnType, unit.friendlyFunctionName.replace("\"", ""), unit.typeList.replace("(", "").replace(")", "")),
						mangleFunction(unit.returnType, unit.friendlyFunctionName.replace("\"", ""), unit.typeList.replace("(", "").replace(")", "")), unit.argumentList);


				TranslatedUnit translation = new TranslatedUnit();

				translation.originalStartLineNumber = unit.startLineNumber;
				translation.originalEndLineNumber = unit.endLineNumber;
				translation.logosCode = rawTranslation + "\n";

				translations.add(translation);
			}
		}

		translations.sort(Comparator.comparing(TranslatedUnit::getOriginalStartLineNumber));



		Stream<String> readFileStream = null;

		try
		{
			readFileStream = Files.lines(Paths.get(path));
		}
		catch (IOException e)
		{
			e.printStackTrace();
		}


		FileOutputStream lowLevelPassTranslation = null;

		try
		{
			File output = new File("out/LLP-Tweak.xm");

			if (!output.exists())
			{
				output.createNewFile();
			}

			lowLevelPassTranslation = new FileOutputStream(output);

			// because lambda
			final int[] currentLine = {1};
			final int[] sleepUntil = {0};
			final int[] nextTranslation = {0};
			FileOutputStream finalLowLevelPassTranslation = lowLevelPassTranslation;

			readFileStream.forEach(line ->
			{
				if (currentLine[0] > sleepUntil[0])
				{
					if (nextTranslation[0] < translations.size())
					{
						if (currentLine[0] == translations.get(nextTranslation[0]).originalStartLineNumber)
						{
//							System.out.print(translations.get(nextTranslation[0]).logosCode);
							try
							{
								finalLowLevelPassTranslation.write(translations.get(nextTranslation[0]).logosCode.getBytes());
							} catch (IOException e)
							{
								e.printStackTrace();
							}
							sleepUntil[0] = translations.get(nextTranslation[0]).originalEndLineNumber;
							nextTranslation[0]++;
						} else
						{
//							System.out.println(line);
							try
							{
								finalLowLevelPassTranslation.write((line + "\n").getBytes());
							} catch (IOException e)
							{
								e.printStackTrace();
							}
						}
					}
					else // cheap workaround for crummy checks
					{
//						System.out.println(line);
						try
						{
							finalLowLevelPassTranslation.write((line + "\n").getBytes());
						} catch (IOException e)
						{
							e.printStackTrace();
						}
					}
				}


				currentLine[0]++;
			});
		}
		catch (IOException e)
		{

		}
		finally
		{
			try
			{
				if (lowLevelPassTranslation != null)
				{
					lowLevelPassTranslation.close();
				}
			}
			catch (IOException ioe)
			{
				System.out.println("Error in closing the Stream");
			}
		}


		if (highLevelPassNeeded)
		{
			List<LogosXXExtractor.LogosXXUnit> higherLogosXX = extractLogosXX("out/LLP-Tweak.xm");

			if (higherLogosXX.size() == 0)
			{
				System.out.println("[logos--] No High-Level Logos++ Code Found."); //should never hit this


				return;
			}

			List<TranslatedUnit> highLevelTranslations = new ArrayList<TranslatedUnit>();

			for (LogosXXExtractor.LogosXXUnit rawUnit : higherLogosXX)
			{
				if (rawUnit.specificClassID == "hookswiftf")
				{
					LogosXXExtractor.HookSwiftFUnit unit = (LogosXXExtractor.HookSwiftFUnit) rawUnit;

					String rawTranslation = String.format("static %s (*orig_%s)(%s) = NULL;\n" +
									"\n" +
									"%s hook_%s(%s) %s\n" +
									"\n" +
									"%%ctor {\n" +
									"    %%init(%s = objc_getClass(\"%s\"));\n" +
									"    MSHookFunction(MSFindSymbol(NULL, \"%s\"),\n" +
									"                   (void*)hook_%s,\n" +
									"                   (void**)&orig_%s);\n" +
									"}",
							unit.returnType, unit.methodName.replace("@", "").replace("\"", ""), unit.parameterList,
							unit.returnType, unit.methodName.replace("@", "").replace("\"", ""), unit.parameterList, fixOrigs(unit),
							unit.target.replace("@", "").replace("\"", "").substring(unit.target.indexOf(".") - 1), unit.target.replace("@", "").replace("\"", ""),
							unit.methodName.replace("@", "").replace("\"", ""),
							unit.methodName.replace("@", "").replace("\"", ""),
							unit.methodName.replace("@", "").replace("\"", ""));


					TranslatedUnit translation = new TranslatedUnit();

					translation.originalStartLineNumber = unit.startLineNumber;
					translation.originalEndLineNumber = unit.endLineNumber;
					translation.logosCode = rawTranslation + "\n";

					highLevelTranslations.add(translation);
				}
				else if (rawUnit.specificClassID == "hookswift")
				{
					System.out.println("WE HAVE A HOOK SWIFT");
					LogosXXExtractor.HookSwiftUnit unit = (LogosXXExtractor.HookSwiftUnit) rawUnit;

					String rawTranslation = String.format("%%hook %s\n" +
									"%s\n" +
									"%%end\n\n" +
									"%%ctor \n{\n" +
									"	%%init(%s=objc_getClass(\"%s\"));\n" +
									"}", unit.className,
							unit.hookedContents,
							unit.className, unit.appName + "." + unit.className);


					TranslatedUnit translation = new TranslatedUnit();

					translation.originalStartLineNumber = unit.startLineNumber;
					translation.originalEndLineNumber = unit.endLineNumber;
					translation.logosCode = rawTranslation + "\n";

					System.out.println("   TRANSLATION: \n" + translation.logosCode);
					highLevelTranslations.add(translation);
				}
			}


			highLevelTranslations.sort(Comparator.comparing(TranslatedUnit::getOriginalStartLineNumber));


			Stream<String> readLLPFileStream = null;

			try
			{
				readLLPFileStream = Files.lines(Paths.get("out/LLP-Tweak.xm"));
			}
			catch (IOException e)
			{
				e.printStackTrace();
			}


			FileOutputStream highLevelPassTranslation = null;

			try
			{
				File output = new File("out/HLP-Tweak.xm");

				if (!output.exists())
				{
					output.createNewFile();
				}

				highLevelPassTranslation = new FileOutputStream(output);

				// because lambda
				final int[] currentLine = {1};
				final int[] sleepUntil = {0};
				final int[] nextTranslation = {0};
				FileOutputStream finalHighLevelPassTranslation = highLevelPassTranslation;

				readLLPFileStream.forEach(line ->
				{
					if (currentLine[0] > sleepUntil[0])
					{
						if (nextTranslation[0] < highLevelTranslations.size())
						{
							if (currentLine[0] == highLevelTranslations.get(nextTranslation[0]).originalStartLineNumber)
							{
								try
								{
									finalHighLevelPassTranslation.write(highLevelTranslations.get(nextTranslation[0]).logosCode.getBytes());
								} catch (IOException e)
								{
									e.printStackTrace();
								}
								sleepUntil[0] = highLevelTranslations.get(nextTranslation[0]).originalEndLineNumber;
								nextTranslation[0]++;
							} else
							{
								try
								{
									finalHighLevelPassTranslation.write((line + "\n").getBytes());
								} catch (IOException e)
								{
									e.printStackTrace();
								}
							}
						}
						else // cheap workaround for crummy checks
						{
							try
							{
								finalHighLevelPassTranslation.write((line + "\n").getBytes());
							} catch (IOException e)
							{
								e.printStackTrace();
							}
						}
					}


					currentLine[0]++;
				});
			}
			catch (IOException e)
			{

			}
			finally
			{
				try
				{
					if (lowLevelPassTranslation != null)
					{
						lowLevelPassTranslation.close();
					}
				}
				catch (IOException ioe)
				{
					System.out.println("Error in closing the Stream");
				}
			}
		}

		// rename
	}




	List<LogosXXExtractor.LogosXXUnit> extractLogosXX(String path)
	{
		try
		{
			FileInputStream sourceInputStream = new FileInputStream(path);


			ANTLRInputStream source =  new ANTLRInputStream(sourceInputStream);


			LogosXXLexer lexer = new LogosXXLexer(source);


			CommonTokenStream tokens = new CommonTokenStream(lexer);


			LogosXXParser parser = new LogosXXParser(tokens);


			LogosXXParser.LogosxxContext tree = parser.logosxx();

			LogosXXExtractor extractor = new LogosXXExtractor();

			ParseTreeWalker.DEFAULT.walk(extractor, tree);


			return extractor.logosxxCode;
		}
		catch (Exception e)
		{
			System.out.println("[logos--] ERROR: " + e.getLocalizedMessage());
		}


		return null;
	}




//	List<LogosXXExtractor.LogosXXUnit> extractHigherLevelLogosXX(String path)
//	{
//		try
//		{
//			FileInputStream sourceInputStream = new FileInputStream(path);
//
//
//			ANTLRInputStream source =  new ANTLRInputStream(sourceInputStream);
//
//
//			LogosXXLexer lexer = new LogosXXLexer(source);
//
//
//			CommonTokenStream tokens = new CommonTokenStream(lexer);
//
//
//			LogosXXParser parser = new LogosXXParser(tokens);
//
//
//			LogosXXParser.LogosxxContext tree = parser.logosxx();
//
//			LogosXXExtractor extractor = new LogosXXExtractor();
//
//			ParseTreeWalker.DEFAULT.walk(extractor, tree);
//
//
//
//			List<LogosXXExtractor.LogosXXUnit> extracted = new ArrayList<>();
//
//			for (LogosXXExtractor.LogosXXUnit rawUnit : extractor.logosxxCode)
//			{
//				if ()
//			}
//
//
//
//			return extracted;
//		}
//		catch (Exception e)
//		{
//			System.out.println("[logos--] ERROR: " + e.getLocalizedMessage());
//		}
//
//
//		return null;
//	}




	String fixOrigs (LogosXXExtractor.HookSwiftFUnit unit)
	{
		String orig = " orig_" + unit.methodName.replace("@", "").replace("\"", "");


		String translatedFunction = unit.function.replaceAll("%orig\\(", orig + "(");


		String argumentsList = "";
		for (MatchResult match : allMatches(Pattern.compile("([A-Za-z]*)(?=[,|)])"), unit.parameterList))
		{
			argumentsList += (match.group() + ",");
		}

		if (argumentsList.length() > 0)
		{
			argumentsList = argumentsList.substring(0, argumentsList.length() - 1); // remove trailing comma
		}

		translatedFunction = unit.function.replace("%orig;", orig + "(" + argumentsList + ");");


		return translatedFunction;
	}




	// https://stackoverflow.com/questions/6020384/create-array-of-regex-matches
	public static Iterable<MatchResult> allMatches(
			final Pattern p, final CharSequence input) {
		return new Iterable<MatchResult>() {
			public Iterator<MatchResult> iterator() {
				return new Iterator<MatchResult>() {
					// Use a matcher internally.
					final Matcher matcher = p.matcher(input);
					// Keep a match around that supports any interleaving of hasNext/next calls.
					MatchResult pending;

					public boolean hasNext() {
						// Lazily fill pending, and avoid calling find() multiple times if the
						// clients call hasNext() repeatedly before sampling via next().
						if (pending == null && matcher.find()) {
							pending = matcher.toMatchResult();
						}
						return pending != null;
					}

					public MatchResult next() {
						// Fill pending if necessary (as when clients call next() without
						// checking hasNext()), throw if not possible.
						if (!hasNext()) { throw new NoSuchElementException(); }
						// Consume pending so next call to hasNext() does a find().
						MatchResult next = pending;
						pending = null;
						return next;
					}

					/** Required to satisfy the interface, but unsupported. */
					public void remove() { throw new UnsupportedOperationException(); }
				};
			}
		};
	}
}
