package com.tomawesome;


import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.misc.Interval;
import org.antlr.v4.runtime.tree.ErrorNode;
import org.antlr.v4.runtime.tree.TerminalNode;

import java.util.ArrayList;
import java.util.List;





/*
* Logos++ Extractor
* Extracts the Logos++ Lines for use by Logos--
* */
public class LogosXXExtractor implements LogosXXParserListener
{
	// Generic unit to simplify making a list of all Logos++ code
	public class LogosXXUnit
	{
		int startLineNumber;
		int endLineNumber;
		String rawline;
		String specificClassID;
	}




	// Unit specific for %hookswiftf
	public class HookSwiftFUnit extends LogosXXUnit
	{
		String target;
		String returnType;
		String methodName;
		String parameterList;
		String function;
	}



	// Unit specific for %hookswift
	public class HookSwiftUnit extends LogosXXUnit
	{
		String appName;
		String className;
		String hookedContents;
	}




	// Unit specific for %hookswiftf
	public class CallSwiftUnit extends LogosXXUnit
	{
		String returnType;
		String friendlyFunctionName;
		String typeList;
		String argumentList;
	}




	// Collection of all pieces of Logos++ code to simplify translation
	List<LogosXXUnit> logosxxCode = new ArrayList<>();




	public String getFullText(ParserRuleContext context)
	{
		if (context.start == null || context.stop == null || context.start.getStartIndex() < 0 || context.stop.getStopIndex() < 0)
			return context.getText(); // Fallback

		return context.start.getInputStream().getText(Interval.of(context.start.getStartIndex(), context.stop.getStopIndex()));
	}




	@Override
	public void enterLogosxx(LogosXXParser.LogosxxContext ctx)
	{

	}



	@Override
	public void exitLogosxx(LogosXXParser.LogosxxContext ctx)
	{

	}



	@Override
	public void enterLogosxxTopLevel(LogosXXParser.LogosxxTopLevelContext ctx)
	{

	}



	@Override
	public void exitLogosxxTopLevel(LogosXXParser.LogosxxTopLevelContext ctx)
	{

	}



	@Override
	public void enterConfig(LogosXXParser.ConfigContext ctx)
	{

	}



	@Override
	public void exitConfig(LogosXXParser.ConfigContext ctx)
	{

	}



	@Override
	public void enterHookf(LogosXXParser.HookfContext ctx)
	{

	}



	@Override
	public void exitHookf(LogosXXParser.HookfContext ctx)
	{

	}



	@Override
	public void enterHookswiftf(LogosXXParser.HookswiftfContext ctx)
	{
	}



	@Override
	public void exitHookswiftf(LogosXXParser.HookswiftfContext ctx)
	{
		//       0    1     2     3     4    5     6         7.............
		// %hookswift (returnType , methodID , parameterList ) {...}
		HookSwiftFUnit unit = new HookSwiftFUnit();
		unit.specificClassID = "hookswiftf";

		unit.rawline = getFullText(ctx); //ctx.getText();
		unit.startLineNumber = ctx.start.getLine();
		unit.endLineNumber = ctx.stop.getLine();

		unit.target = ctx.getChild(2).getText();
		unit.returnType = ctx.getChild(4).getText();
		unit.methodName = ctx.getChild(6).getText();
		unit.parameterList = ctx.parameterList().getText();
		unit.function = ctx.logosFusedCompoundStatement().getText();


		logosxxCode.add(unit);

		/*
		%hookswiftf(returnType, appclassID, methodID, parameterList)
		{
			....
		}
		*/

		// becomes

		/*
		returnType (*orig_methodID)(parameterList) = NULL;

		returnType hook_methodID(parameterList)
		{
		   ...
		}

		%ctor {
			%init(CLASSNAME = objc_getClass("APPNAME.CLASSNAME"));
			MSHookFunction(MSFindSymbol(NULL, methodID),
						   (void*)hook_methodID,
						   (void**)&orig_methodID);
		}
		*/
	}



	@Override
	public void enterCtor(LogosXXParser.CtorContext ctx)
	{

	}



	@Override
	public void exitCtor(LogosXXParser.CtorContext ctx)
	{

	}



	@Override
	public void enterDtor(LogosXXParser.DtorContext ctx)
	{

	}



	@Override
	public void exitDtor(LogosXXParser.DtorContext ctx)
	{

	}



	@Override
	public void enterLogosxxBlockLevel(LogosXXParser.LogosxxBlockLevelContext ctx)
	{

	}



	@Override
	public void exitLogosxxBlockLevel(LogosXXParser.LogosxxBlockLevelContext ctx)
	{

	}



	@Override
	public void enterGroup(LogosXXParser.GroupContext ctx)
	{

	}



	@Override
	public void exitGroup(LogosXXParser.GroupContext ctx)
	{

	}



	@Override
	public void enterGroupContents(LogosXXParser.GroupContentsContext ctx)
	{

	}



	@Override
	public void exitGroupContents(LogosXXParser.GroupContentsContext ctx)
	{

	}



	@Override
	public void enterHook(LogosXXParser.HookContext ctx)
	{

	}



	@Override
	public void exitHook(LogosXXParser.HookContext ctx)
	{

	}



	@Override
	public void enterHookContents(LogosXXParser.HookContentsContext ctx)
	{

	}



	@Override
	public void exitHookContents(LogosXXParser.HookContentsContext ctx)
	{

	}



	@Override
	public void enterHookswift(LogosXXParser.HookswiftContext ctx)
	{

	}



	@Override
	public void exitHookswift(LogosXXParser.HookswiftContext ctx)
	{
		//      0        1    2    3           4          5
		// %hookswift AppName . ClassName hookedContents %end

		HookSwiftUnit unit = new HookSwiftUnit();
		unit.specificClassID = "hookswift";

		unit.rawline = getFullText(ctx);//ctx.getText();
		unit.startLineNumber = ctx.start.getLine();
		unit.endLineNumber = ctx.stop.getLine();

		unit.appName = ctx.getChild(1).getText();
		unit.className = ctx.getChild(3).getText();
		String hookContents = "";
		for (LogosXXParser.HookContentsContext hookedContent : ctx.hookContents())
		{
			hookContents += hookedContent.getText().replace("return", "return "); // because ANTLR is annoying
		}
		unit.hookedContents = hookContents;

		logosxxCode.add(unit);

		/*
		%hookswift Music.MusicPlayerTimeControl
		- (id)initWithFrame:(CGRect)frame {
		  return CGRectMake(frame.origin.x, (int) frame.origin.y + 20, frame.size.width, frame.size.height);
		}
		%end


		BECOMES


		%hook MusicPlayerTimeControl
		- (id)initWithFrame:(CGRect)frame {
		  return CGRectMake(frame.origin.x, (int) frame.origin.y + 20, frame.size.width, frame.size.height);
		}
		%end


		%ctor
		{
		  %init(MusicPlayerTimeControl=objc_getClass("Music.PlayerTimeControl"));
		}
		*/
	}



	@Override
	public void enterNewcontent(LogosXXParser.NewcontentContext ctx)
	{

	}



	@Override
	public void exitNewcontent(LogosXXParser.NewcontentContext ctx)
	{

	}



	@Override
	public void enterSubclass(LogosXXParser.SubclassContext ctx)
	{

	}



	@Override
	public void exitSubclass(LogosXXParser.SubclassContext ctx)
	{

	}



	@Override
	public void enterProperty(LogosXXParser.PropertyContext ctx)
	{

	}



	@Override
	public void exitProperty(LogosXXParser.PropertyContext ctx)
	{

	}



	@Override
	public void enterLogosxxFunctionLevel(LogosXXParser.LogosxxFunctionLevelContext ctx)
	{

	}



	@Override
	public void exitLogosxxFunctionLevel(LogosXXParser.LogosxxFunctionLevelContext ctx)
	{

	}



	@Override
	public void enterInit(LogosXXParser.InitContext ctx)
	{

	}



	@Override
	public void exitInit(LogosXXParser.InitContext ctx)
	{

	}



	@Override
	public void enterInitexpr(LogosXXParser.InitexprContext ctx)
	{

	}



	@Override
	public void exitInitexpr(LogosXXParser.InitexprContext ctx)
	{

	}



	@Override
	public void enterClasseval(LogosXXParser.ClassevalContext ctx)
	{

	}



	@Override
	public void exitClasseval(LogosXXParser.ClassevalContext ctx)
	{

	}



	@Override
	public void enterCallswift(LogosXXParser.CallswiftContext ctx)
	{

	}



	@Override
	public void exitCallswift(LogosXXParser.CallswiftContext ctx)
	{
		//        0   1       2    3      4...................................
		// %callswift ( returnType , methodID ( typeList ) , ( argumentList ) ;

		CallSwiftUnit unit = new CallSwiftUnit();
		unit.specificClassID = "callswift";

		unit.rawline = getFullText(ctx);//ctx.getText();
		unit.startLineNumber = ctx.start.getLine();
		unit.endLineNumber = ctx.stop.getLine();

		unit.returnType = ctx.getChild(2).getText();
		unit.friendlyFunctionName = ctx.getChild(4).getText();
		unit.typeList = ctx.typeList().getText();
		unit.argumentList = ctx.argumentExpressionList().getText();


		logosxxCode.add(unit);


		/*
		%callswift void MANGLEDNAME (void) ();
		*/

		// becomes

		/*
		void (*symbol_MANGLEDNAME)(void) = MSHookSymbol(NULL, "MANGLEDNAME");
//		symbol_MANGLEDNAME();
		*/
	}



	@Override
	public void enterTypeList(LogosXXParser.TypeListContext ctx)
	{

	}



	@Override
	public void exitTypeList(LogosXXParser.TypeListContext ctx)
	{

	}



	@Override
	public void enterOrig(LogosXXParser.OrigContext ctx)
	{

	}



	@Override
	public void exitOrig(LogosXXParser.OrigContext ctx)
	{

	}



	@Override
	public void enterLog(LogosXXParser.LogContext ctx)
	{

	}



	@Override
	public void exitLog(LogosXXParser.LogContext ctx)
	{

	}



	@Override
	public void enterLogexpr(LogosXXParser.LogexprContext ctx)
	{

	}



	@Override
	public void exitLogexpr(LogosXXParser.LogexprContext ctx)
	{

	}



	@Override
	public void enterLogosFusedClassMethodDefinition(LogosXXParser.LogosFusedClassMethodDefinitionContext ctx)
	{

	}



	@Override
	public void exitLogosFusedClassMethodDefinition(LogosXXParser.LogosFusedClassMethodDefinitionContext ctx)
	{

	}



	@Override
	public void enterLogosFusedInstanceMethodDefinition(LogosXXParser.LogosFusedInstanceMethodDefinitionContext ctx)
	{

	}



	@Override
	public void exitLogosFusedInstanceMethodDefinition(LogosXXParser.LogosFusedInstanceMethodDefinitionContext ctx)
	{

	}



	@Override
	public void enterLogosFusedMethodDefinition(LogosXXParser.LogosFusedMethodDefinitionContext ctx)
	{

	}



	@Override
	public void exitLogosFusedMethodDefinition(LogosXXParser.LogosFusedMethodDefinitionContext ctx)
	{

	}



	@Override
	public void enterLogosFusedCompoundStatement(LogosXXParser.LogosFusedCompoundStatementContext ctx)
	{

	}



	@Override
	public void exitLogosFusedCompoundStatement(LogosXXParser.LogosFusedCompoundStatementContext ctx)
	{

	}



	@Override
	public void enterHookedFunctionExpression(LogosXXParser.HookedFunctionExpressionContext ctx)
	{

	}



	@Override
	public void exitHookedFunctionExpression(LogosXXParser.HookedFunctionExpressionContext ctx)
	{

	}



	@Override
	public void enterCppTemplateFunctionCallStatement(LogosXXParser.CppTemplateFunctionCallStatementContext ctx)
	{

	}



	@Override
	public void exitCppTemplateFunctionCallStatement(LogosXXParser.CppTemplateFunctionCallStatementContext ctx)
	{

	}



	@Override
	public void enterTranslationUnit(LogosXXParser.TranslationUnitContext ctx)
	{

	}



	@Override
	public void exitTranslationUnit(LogosXXParser.TranslationUnitContext ctx)
	{

	}



	@Override
	public void enterTopLevelDeclaration(LogosXXParser.TopLevelDeclarationContext ctx)
	{

	}



	@Override
	public void exitTopLevelDeclaration(LogosXXParser.TopLevelDeclarationContext ctx)
	{

	}



	@Override
	public void enterImportDeclaration(LogosXXParser.ImportDeclarationContext ctx)
	{

	}



	@Override
	public void exitImportDeclaration(LogosXXParser.ImportDeclarationContext ctx)
	{

	}



	@Override
	public void enterClassInterface(LogosXXParser.ClassInterfaceContext ctx)
	{

	}



	@Override
	public void exitClassInterface(LogosXXParser.ClassInterfaceContext ctx)
	{

	}



	@Override
	public void enterCategoryInterface(LogosXXParser.CategoryInterfaceContext ctx)
	{

	}



	@Override
	public void exitCategoryInterface(LogosXXParser.CategoryInterfaceContext ctx)
	{

	}



	@Override
	public void enterClassImplementation(LogosXXParser.ClassImplementationContext ctx)
	{

	}



	@Override
	public void exitClassImplementation(LogosXXParser.ClassImplementationContext ctx)
	{

	}



	@Override
	public void enterCategoryImplementation(LogosXXParser.CategoryImplementationContext ctx)
	{

	}



	@Override
	public void exitCategoryImplementation(LogosXXParser.CategoryImplementationContext ctx)
	{

	}



	@Override
	public void enterGenericTypeSpecifier(LogosXXParser.GenericTypeSpecifierContext ctx)
	{

	}



	@Override
	public void exitGenericTypeSpecifier(LogosXXParser.GenericTypeSpecifierContext ctx)
	{

	}



	@Override
	public void enterProtocolDeclaration(LogosXXParser.ProtocolDeclarationContext ctx)
	{

	}



	@Override
	public void exitProtocolDeclaration(LogosXXParser.ProtocolDeclarationContext ctx)
	{

	}



	@Override
	public void enterProtocolDeclarationSection(LogosXXParser.ProtocolDeclarationSectionContext ctx)
	{

	}



	@Override
	public void exitProtocolDeclarationSection(LogosXXParser.ProtocolDeclarationSectionContext ctx)
	{

	}



	@Override
	public void enterProtocolDeclarationList(LogosXXParser.ProtocolDeclarationListContext ctx)
	{

	}



	@Override
	public void exitProtocolDeclarationList(LogosXXParser.ProtocolDeclarationListContext ctx)
	{

	}



	@Override
	public void enterClassDeclarationList(LogosXXParser.ClassDeclarationListContext ctx)
	{

	}



	@Override
	public void exitClassDeclarationList(LogosXXParser.ClassDeclarationListContext ctx)
	{

	}



	@Override
	public void enterProtocolList(LogosXXParser.ProtocolListContext ctx)
	{

	}



	@Override
	public void exitProtocolList(LogosXXParser.ProtocolListContext ctx)
	{

	}



	@Override
	public void enterPropertyDeclaration(LogosXXParser.PropertyDeclarationContext ctx)
	{

	}



	@Override
	public void exitPropertyDeclaration(LogosXXParser.PropertyDeclarationContext ctx)
	{

	}



	@Override
	public void enterPropertyAttributesList(LogosXXParser.PropertyAttributesListContext ctx)
	{

	}



	@Override
	public void exitPropertyAttributesList(LogosXXParser.PropertyAttributesListContext ctx)
	{

	}



	@Override
	public void enterPropertyAttribute(LogosXXParser.PropertyAttributeContext ctx)
	{

	}



	@Override
	public void exitPropertyAttribute(LogosXXParser.PropertyAttributeContext ctx)
	{

	}



	@Override
	public void enterProtocolName(LogosXXParser.ProtocolNameContext ctx)
	{

	}



	@Override
	public void exitProtocolName(LogosXXParser.ProtocolNameContext ctx)
	{

	}



	@Override
	public void enterInstanceVariables(LogosXXParser.InstanceVariablesContext ctx)
	{

	}



	@Override
	public void exitInstanceVariables(LogosXXParser.InstanceVariablesContext ctx)
	{

	}



	@Override
	public void enterVisibilitySection(LogosXXParser.VisibilitySectionContext ctx)
	{

	}



	@Override
	public void exitVisibilitySection(LogosXXParser.VisibilitySectionContext ctx)
	{

	}



	@Override
	public void enterAccessModifier(LogosXXParser.AccessModifierContext ctx)
	{

	}



	@Override
	public void exitAccessModifier(LogosXXParser.AccessModifierContext ctx)
	{

	}



	@Override
	public void enterInterfaceDeclarationList(LogosXXParser.InterfaceDeclarationListContext ctx)
	{

	}



	@Override
	public void exitInterfaceDeclarationList(LogosXXParser.InterfaceDeclarationListContext ctx)
	{

	}



	@Override
	public void enterClassMethodDeclaration(LogosXXParser.ClassMethodDeclarationContext ctx)
	{

	}



	@Override
	public void exitClassMethodDeclaration(LogosXXParser.ClassMethodDeclarationContext ctx)
	{

	}



	@Override
	public void enterInstanceMethodDeclaration(LogosXXParser.InstanceMethodDeclarationContext ctx)
	{

	}



	@Override
	public void exitInstanceMethodDeclaration(LogosXXParser.InstanceMethodDeclarationContext ctx)
	{

	}



	@Override
	public void enterMethodDeclaration(LogosXXParser.MethodDeclarationContext ctx)
	{

	}



	@Override
	public void exitMethodDeclaration(LogosXXParser.MethodDeclarationContext ctx)
	{

	}



	@Override
	public void enterImplementationDefinitionList(LogosXXParser.ImplementationDefinitionListContext ctx)
	{

	}



	@Override
	public void exitImplementationDefinitionList(LogosXXParser.ImplementationDefinitionListContext ctx)
	{

	}



	@Override
	public void enterClassMethodDefinition(LogosXXParser.ClassMethodDefinitionContext ctx)
	{

	}



	@Override
	public void exitClassMethodDefinition(LogosXXParser.ClassMethodDefinitionContext ctx)
	{

	}



	@Override
	public void enterInstanceMethodDefinition(LogosXXParser.InstanceMethodDefinitionContext ctx)
	{

	}



	@Override
	public void exitInstanceMethodDefinition(LogosXXParser.InstanceMethodDefinitionContext ctx)
	{

	}



	@Override
	public void enterMethodDefinition(LogosXXParser.MethodDefinitionContext ctx)
	{

	}



	@Override
	public void exitMethodDefinition(LogosXXParser.MethodDefinitionContext ctx)
	{

	}



	@Override
	public void enterMethodSelector(LogosXXParser.MethodSelectorContext ctx)
	{

	}



	@Override
	public void exitMethodSelector(LogosXXParser.MethodSelectorContext ctx)
	{

	}



	@Override
	public void enterKeywordDeclarator(LogosXXParser.KeywordDeclaratorContext ctx)
	{

	}



	@Override
	public void exitKeywordDeclarator(LogosXXParser.KeywordDeclaratorContext ctx)
	{

	}



	@Override
	public void enterSelector(LogosXXParser.SelectorContext ctx)
	{

	}



	@Override
	public void exitSelector(LogosXXParser.SelectorContext ctx)
	{

	}



	@Override
	public void enterMethodType(LogosXXParser.MethodTypeContext ctx)
	{

	}



	@Override
	public void exitMethodType(LogosXXParser.MethodTypeContext ctx)
	{

	}



	@Override
	public void enterPropertyImplementation(LogosXXParser.PropertyImplementationContext ctx)
	{

	}



	@Override
	public void exitPropertyImplementation(LogosXXParser.PropertyImplementationContext ctx)
	{

	}



	@Override
	public void enterPropertySynthesizeList(LogosXXParser.PropertySynthesizeListContext ctx)
	{

	}



	@Override
	public void exitPropertySynthesizeList(LogosXXParser.PropertySynthesizeListContext ctx)
	{

	}



	@Override
	public void enterPropertySynthesizeItem(LogosXXParser.PropertySynthesizeItemContext ctx)
	{

	}



	@Override
	public void exitPropertySynthesizeItem(LogosXXParser.PropertySynthesizeItemContext ctx)
	{

	}



	@Override
	public void enterBlockType(LogosXXParser.BlockTypeContext ctx)
	{

	}



	@Override
	public void exitBlockType(LogosXXParser.BlockTypeContext ctx)
	{

	}



	@Override
	public void enterGenericsSpecifier(LogosXXParser.GenericsSpecifierContext ctx)
	{

	}



	@Override
	public void exitGenericsSpecifier(LogosXXParser.GenericsSpecifierContext ctx)
	{

	}



	@Override
	public void enterTypeSpecifierWithPrefixes(LogosXXParser.TypeSpecifierWithPrefixesContext ctx)
	{

	}



	@Override
	public void exitTypeSpecifierWithPrefixes(LogosXXParser.TypeSpecifierWithPrefixesContext ctx)
	{

	}



	@Override
	public void enterDictionaryExpression(LogosXXParser.DictionaryExpressionContext ctx)
	{

	}



	@Override
	public void exitDictionaryExpression(LogosXXParser.DictionaryExpressionContext ctx)
	{

	}



	@Override
	public void enterDictionaryPair(LogosXXParser.DictionaryPairContext ctx)
	{

	}



	@Override
	public void exitDictionaryPair(LogosXXParser.DictionaryPairContext ctx)
	{

	}



	@Override
	public void enterArrayExpression(LogosXXParser.ArrayExpressionContext ctx)
	{

	}



	@Override
	public void exitArrayExpression(LogosXXParser.ArrayExpressionContext ctx)
	{

	}



	@Override
	public void enterBoxExpression(LogosXXParser.BoxExpressionContext ctx)
	{

	}



	@Override
	public void exitBoxExpression(LogosXXParser.BoxExpressionContext ctx)
	{

	}



	@Override
	public void enterBlockParameters(LogosXXParser.BlockParametersContext ctx)
	{

	}



	@Override
	public void exitBlockParameters(LogosXXParser.BlockParametersContext ctx)
	{

	}



	@Override
	public void enterTypeVariableDeclaratorOrName(LogosXXParser.TypeVariableDeclaratorOrNameContext ctx)
	{

	}



	@Override
	public void exitTypeVariableDeclaratorOrName(LogosXXParser.TypeVariableDeclaratorOrNameContext ctx)
	{

	}



	@Override
	public void enterBlockExpression(LogosXXParser.BlockExpressionContext ctx)
	{

	}



	@Override
	public void exitBlockExpression(LogosXXParser.BlockExpressionContext ctx)
	{

	}



	@Override
	public void enterMessageExpression(LogosXXParser.MessageExpressionContext ctx)
	{

	}



	@Override
	public void exitMessageExpression(LogosXXParser.MessageExpressionContext ctx)
	{

	}



	@Override
	public void enterReceiver(LogosXXParser.ReceiverContext ctx)
	{

	}



	@Override
	public void exitReceiver(LogosXXParser.ReceiverContext ctx)
	{

	}



	@Override
	public void enterMessageSelector(LogosXXParser.MessageSelectorContext ctx)
	{

	}



	@Override
	public void exitMessageSelector(LogosXXParser.MessageSelectorContext ctx)
	{

	}



	@Override
	public void enterKeywordArgument(LogosXXParser.KeywordArgumentContext ctx)
	{

	}



	@Override
	public void exitKeywordArgument(LogosXXParser.KeywordArgumentContext ctx)
	{

	}



	@Override
	public void enterKeywordArgumentType(LogosXXParser.KeywordArgumentTypeContext ctx)
	{

	}



	@Override
	public void exitKeywordArgumentType(LogosXXParser.KeywordArgumentTypeContext ctx)
	{

	}



	@Override
	public void enterSelectorExpression(LogosXXParser.SelectorExpressionContext ctx)
	{

	}



	@Override
	public void exitSelectorExpression(LogosXXParser.SelectorExpressionContext ctx)
	{

	}



	@Override
	public void enterSelectorName(LogosXXParser.SelectorNameContext ctx)
	{

	}



	@Override
	public void exitSelectorName(LogosXXParser.SelectorNameContext ctx)
	{

	}



	@Override
	public void enterProtocolExpression(LogosXXParser.ProtocolExpressionContext ctx)
	{

	}



	@Override
	public void exitProtocolExpression(LogosXXParser.ProtocolExpressionContext ctx)
	{

	}



	@Override
	public void enterEncodeExpression(LogosXXParser.EncodeExpressionContext ctx)
	{

	}



	@Override
	public void exitEncodeExpression(LogosXXParser.EncodeExpressionContext ctx)
	{

	}



	@Override
	public void enterTypeVariableDeclarator(LogosXXParser.TypeVariableDeclaratorContext ctx)
	{

	}



	@Override
	public void exitTypeVariableDeclarator(LogosXXParser.TypeVariableDeclaratorContext ctx)
	{

	}



	@Override
	public void enterThrowStatement(LogosXXParser.ThrowStatementContext ctx)
	{

	}



	@Override
	public void exitThrowStatement(LogosXXParser.ThrowStatementContext ctx)
	{

	}



	@Override
	public void enterTryBlock(LogosXXParser.TryBlockContext ctx)
	{

	}



	@Override
	public void exitTryBlock(LogosXXParser.TryBlockContext ctx)
	{

	}



	@Override
	public void enterCatchStatement(LogosXXParser.CatchStatementContext ctx)
	{

	}



	@Override
	public void exitCatchStatement(LogosXXParser.CatchStatementContext ctx)
	{

	}



	@Override
	public void enterSynchronizedStatement(LogosXXParser.SynchronizedStatementContext ctx)
	{

	}



	@Override
	public void exitSynchronizedStatement(LogosXXParser.SynchronizedStatementContext ctx)
	{

	}



	@Override
	public void enterAutoreleaseStatement(LogosXXParser.AutoreleaseStatementContext ctx)
	{

	}



	@Override
	public void exitAutoreleaseStatement(LogosXXParser.AutoreleaseStatementContext ctx)
	{

	}



	@Override
	public void enterFunctionDeclaration(LogosXXParser.FunctionDeclarationContext ctx)
	{

	}



	@Override
	public void exitFunctionDeclaration(LogosXXParser.FunctionDeclarationContext ctx)
	{

	}



	@Override
	public void enterFunctionDefinition(LogosXXParser.FunctionDefinitionContext ctx)
	{

	}



	@Override
	public void exitFunctionDefinition(LogosXXParser.FunctionDefinitionContext ctx)
	{

	}



	@Override
	public void enterFunctionSignature(LogosXXParser.FunctionSignatureContext ctx)
	{

	}



	@Override
	public void exitFunctionSignature(LogosXXParser.FunctionSignatureContext ctx)
	{

	}



	@Override
	public void enterAttribute(LogosXXParser.AttributeContext ctx)
	{

	}



	@Override
	public void exitAttribute(LogosXXParser.AttributeContext ctx)
	{

	}



	@Override
	public void enterAttributeName(LogosXXParser.AttributeNameContext ctx)
	{

	}



	@Override
	public void exitAttributeName(LogosXXParser.AttributeNameContext ctx)
	{

	}



	@Override
	public void enterAttributeParameters(LogosXXParser.AttributeParametersContext ctx)
	{

	}



	@Override
	public void exitAttributeParameters(LogosXXParser.AttributeParametersContext ctx)
	{

	}



	@Override
	public void enterAttributeParameterList(LogosXXParser.AttributeParameterListContext ctx)
	{

	}



	@Override
	public void exitAttributeParameterList(LogosXXParser.AttributeParameterListContext ctx)
	{

	}



	@Override
	public void enterAttributeParameter(LogosXXParser.AttributeParameterContext ctx)
	{

	}



	@Override
	public void exitAttributeParameter(LogosXXParser.AttributeParameterContext ctx)
	{

	}



	@Override
	public void enterAttributeParameterAssignment(LogosXXParser.AttributeParameterAssignmentContext ctx)
	{

	}



	@Override
	public void exitAttributeParameterAssignment(LogosXXParser.AttributeParameterAssignmentContext ctx)
	{

	}



	@Override
	public void enterDeclaration(LogosXXParser.DeclarationContext ctx)
	{

	}



	@Override
	public void exitDeclaration(LogosXXParser.DeclarationContext ctx)
	{

	}



	@Override
	public void enterFunctionCallExpression(LogosXXParser.FunctionCallExpressionContext ctx)
	{

	}



	@Override
	public void exitFunctionCallExpression(LogosXXParser.FunctionCallExpressionContext ctx)
	{

	}



	@Override
	public void enterEnumDeclaration(LogosXXParser.EnumDeclarationContext ctx)
	{

	}



	@Override
	public void exitEnumDeclaration(LogosXXParser.EnumDeclarationContext ctx)
	{

	}



	@Override
	public void enterVarDeclaration(LogosXXParser.VarDeclarationContext ctx)
	{

	}



	@Override
	public void exitVarDeclaration(LogosXXParser.VarDeclarationContext ctx)
	{

	}



	@Override
	public void enterTypedefDeclaration(LogosXXParser.TypedefDeclarationContext ctx)
	{

	}



	@Override
	public void exitTypedefDeclaration(LogosXXParser.TypedefDeclarationContext ctx)
	{

	}



	@Override
	public void enterTypeDeclaratorList(LogosXXParser.TypeDeclaratorListContext ctx)
	{

	}



	@Override
	public void exitTypeDeclaratorList(LogosXXParser.TypeDeclaratorListContext ctx)
	{

	}



	@Override
	public void enterTypeDeclarator(LogosXXParser.TypeDeclaratorContext ctx)
	{

	}



	@Override
	public void exitTypeDeclarator(LogosXXParser.TypeDeclaratorContext ctx)
	{

	}



	@Override
	public void enterDeclarationSpecifiers(LogosXXParser.DeclarationSpecifiersContext ctx)
	{

	}



	@Override
	public void exitDeclarationSpecifiers(LogosXXParser.DeclarationSpecifiersContext ctx)
	{

	}



	@Override
	public void enterAttributeSpecifier(LogosXXParser.AttributeSpecifierContext ctx)
	{

	}



	@Override
	public void exitAttributeSpecifier(LogosXXParser.AttributeSpecifierContext ctx)
	{

	}



	@Override
	public void enterInitDeclaratorList(LogosXXParser.InitDeclaratorListContext ctx)
	{

	}



	@Override
	public void exitInitDeclaratorList(LogosXXParser.InitDeclaratorListContext ctx)
	{

	}



	@Override
	public void enterInitDeclarator(LogosXXParser.InitDeclaratorContext ctx)
	{

	}



	@Override
	public void exitInitDeclarator(LogosXXParser.InitDeclaratorContext ctx)
	{

	}



	@Override
	public void enterStructOrUnionSpecifier(LogosXXParser.StructOrUnionSpecifierContext ctx)
	{

	}



	@Override
	public void exitStructOrUnionSpecifier(LogosXXParser.StructOrUnionSpecifierContext ctx)
	{

	}



	@Override
	public void enterFieldDeclaration(LogosXXParser.FieldDeclarationContext ctx)
	{

	}



	@Override
	public void exitFieldDeclaration(LogosXXParser.FieldDeclarationContext ctx)
	{

	}



	@Override
	public void enterSpecifierQualifierList(LogosXXParser.SpecifierQualifierListContext ctx)
	{

	}



	@Override
	public void exitSpecifierQualifierList(LogosXXParser.SpecifierQualifierListContext ctx)
	{

	}



	@Override
	public void enterIbOutletQualifier(LogosXXParser.IbOutletQualifierContext ctx)
	{

	}



	@Override
	public void exitIbOutletQualifier(LogosXXParser.IbOutletQualifierContext ctx)
	{

	}



	@Override
	public void enterArcBehaviourSpecifier(LogosXXParser.ArcBehaviourSpecifierContext ctx)
	{

	}



	@Override
	public void exitArcBehaviourSpecifier(LogosXXParser.ArcBehaviourSpecifierContext ctx)
	{

	}



	@Override
	public void enterNullabilitySpecifier(LogosXXParser.NullabilitySpecifierContext ctx)
	{

	}



	@Override
	public void exitNullabilitySpecifier(LogosXXParser.NullabilitySpecifierContext ctx)
	{

	}



	@Override
	public void enterStorageClassSpecifier(LogosXXParser.StorageClassSpecifierContext ctx)
	{

	}



	@Override
	public void exitStorageClassSpecifier(LogosXXParser.StorageClassSpecifierContext ctx)
	{

	}



	@Override
	public void enterTypePrefix(LogosXXParser.TypePrefixContext ctx)
	{

	}



	@Override
	public void exitTypePrefix(LogosXXParser.TypePrefixContext ctx)
	{

	}



	@Override
	public void enterTypeQualifier(LogosXXParser.TypeQualifierContext ctx)
	{

	}



	@Override
	public void exitTypeQualifier(LogosXXParser.TypeQualifierContext ctx)
	{

	}



	@Override
	public void enterProtocolQualifier(LogosXXParser.ProtocolQualifierContext ctx)
	{

	}



	@Override
	public void exitProtocolQualifier(LogosXXParser.ProtocolQualifierContext ctx)
	{

	}



	@Override
	public void enterTypeSpecifier(LogosXXParser.TypeSpecifierContext ctx)
	{

	}



	@Override
	public void exitTypeSpecifier(LogosXXParser.TypeSpecifierContext ctx)
	{

	}



	@Override
	public void enterTypeofExpression(LogosXXParser.TypeofExpressionContext ctx)
	{

	}



	@Override
	public void exitTypeofExpression(LogosXXParser.TypeofExpressionContext ctx)
	{

	}



	@Override
	public void enterFieldDeclaratorList(LogosXXParser.FieldDeclaratorListContext ctx)
	{

	}



	@Override
	public void exitFieldDeclaratorList(LogosXXParser.FieldDeclaratorListContext ctx)
	{

	}



	@Override
	public void enterFieldDeclarator(LogosXXParser.FieldDeclaratorContext ctx)
	{

	}



	@Override
	public void exitFieldDeclarator(LogosXXParser.FieldDeclaratorContext ctx)
	{

	}



	@Override
	public void enterEnumSpecifier(LogosXXParser.EnumSpecifierContext ctx)
	{

	}



	@Override
	public void exitEnumSpecifier(LogosXXParser.EnumSpecifierContext ctx)
	{

	}



	@Override
	public void enterEnumeratorList(LogosXXParser.EnumeratorListContext ctx)
	{

	}



	@Override
	public void exitEnumeratorList(LogosXXParser.EnumeratorListContext ctx)
	{

	}



	@Override
	public void enterEnumerator(LogosXXParser.EnumeratorContext ctx)
	{

	}



	@Override
	public void exitEnumerator(LogosXXParser.EnumeratorContext ctx)
	{

	}



	@Override
	public void enterEnumeratorIdentifier(LogosXXParser.EnumeratorIdentifierContext ctx)
	{

	}



	@Override
	public void exitEnumeratorIdentifier(LogosXXParser.EnumeratorIdentifierContext ctx)
	{

	}



	@Override
	public void enterDirectDeclarator(LogosXXParser.DirectDeclaratorContext ctx)
	{

	}



	@Override
	public void exitDirectDeclarator(LogosXXParser.DirectDeclaratorContext ctx)
	{

	}



	@Override
	public void enterDeclaratorSuffix(LogosXXParser.DeclaratorSuffixContext ctx)
	{

	}



	@Override
	public void exitDeclaratorSuffix(LogosXXParser.DeclaratorSuffixContext ctx)
	{

	}



	@Override
	public void enterParameterList(LogosXXParser.ParameterListContext ctx)
	{

	}



	@Override
	public void exitParameterList(LogosXXParser.ParameterListContext ctx)
	{

	}



	@Override
	public void enterPointer(LogosXXParser.PointerContext ctx)
	{

	}



	@Override
	public void exitPointer(LogosXXParser.PointerContext ctx)
	{

	}



	@Override
	public void enterMacro(LogosXXParser.MacroContext ctx)
	{

	}



	@Override
	public void exitMacro(LogosXXParser.MacroContext ctx)
	{

	}



	@Override
	public void enterArrayInitializer(LogosXXParser.ArrayInitializerContext ctx)
	{

	}



	@Override
	public void exitArrayInitializer(LogosXXParser.ArrayInitializerContext ctx)
	{

	}



	@Override
	public void enterStructInitializer(LogosXXParser.StructInitializerContext ctx)
	{

	}



	@Override
	public void exitStructInitializer(LogosXXParser.StructInitializerContext ctx)
	{

	}



	@Override
	public void enterInitializerList(LogosXXParser.InitializerListContext ctx)
	{

	}



	@Override
	public void exitInitializerList(LogosXXParser.InitializerListContext ctx)
	{

	}



	@Override
	public void enterTypeName(LogosXXParser.TypeNameContext ctx)
	{

	}



	@Override
	public void exitTypeName(LogosXXParser.TypeNameContext ctx)
	{

	}



	@Override
	public void enterAbstractDeclarator(LogosXXParser.AbstractDeclaratorContext ctx)
	{

	}



	@Override
	public void exitAbstractDeclarator(LogosXXParser.AbstractDeclaratorContext ctx)
	{

	}



	@Override
	public void enterAbstractDeclaratorSuffix(LogosXXParser.AbstractDeclaratorSuffixContext ctx)
	{

	}



	@Override
	public void exitAbstractDeclaratorSuffix(LogosXXParser.AbstractDeclaratorSuffixContext ctx)
	{

	}



	@Override
	public void enterParameterDeclarationList(LogosXXParser.ParameterDeclarationListContext ctx)
	{

	}



	@Override
	public void exitParameterDeclarationList(LogosXXParser.ParameterDeclarationListContext ctx)
	{

	}



	@Override
	public void enterParameterDeclaration(LogosXXParser.ParameterDeclarationContext ctx)
	{

	}



	@Override
	public void exitParameterDeclaration(LogosXXParser.ParameterDeclarationContext ctx)
	{

	}



	@Override
	public void enterDeclarator(LogosXXParser.DeclaratorContext ctx)
	{

	}



	@Override
	public void exitDeclarator(LogosXXParser.DeclaratorContext ctx)
	{

	}



	@Override
	public void enterStatement(LogosXXParser.StatementContext ctx)
	{

	}



	@Override
	public void exitStatement(LogosXXParser.StatementContext ctx)
	{

	}



	@Override
	public void enterLabeledStatement(LogosXXParser.LabeledStatementContext ctx)
	{

	}



	@Override
	public void exitLabeledStatement(LogosXXParser.LabeledStatementContext ctx)
	{

	}



	@Override
	public void enterRangeExpression(LogosXXParser.RangeExpressionContext ctx)
	{

	}



	@Override
	public void exitRangeExpression(LogosXXParser.RangeExpressionContext ctx)
	{

	}



	@Override
	public void enterCompoundStatement(LogosXXParser.CompoundStatementContext ctx)
	{

	}



	@Override
	public void exitCompoundStatement(LogosXXParser.CompoundStatementContext ctx)
	{

	}



	@Override
	public void enterSelectionStatement(LogosXXParser.SelectionStatementContext ctx)
	{

	}



	@Override
	public void exitSelectionStatement(LogosXXParser.SelectionStatementContext ctx)
	{

	}



	@Override
	public void enterSwitchStatement(LogosXXParser.SwitchStatementContext ctx)
	{

	}



	@Override
	public void exitSwitchStatement(LogosXXParser.SwitchStatementContext ctx)
	{

	}



	@Override
	public void enterSwitchBlock(LogosXXParser.SwitchBlockContext ctx)
	{

	}



	@Override
	public void exitSwitchBlock(LogosXXParser.SwitchBlockContext ctx)
	{

	}



	@Override
	public void enterSwitchSection(LogosXXParser.SwitchSectionContext ctx)
	{

	}



	@Override
	public void exitSwitchSection(LogosXXParser.SwitchSectionContext ctx)
	{

	}



	@Override
	public void enterSwitchLabel(LogosXXParser.SwitchLabelContext ctx)
	{

	}



	@Override
	public void exitSwitchLabel(LogosXXParser.SwitchLabelContext ctx)
	{

	}



	@Override
	public void enterIterationStatement(LogosXXParser.IterationStatementContext ctx)
	{

	}



	@Override
	public void exitIterationStatement(LogosXXParser.IterationStatementContext ctx)
	{

	}



	@Override
	public void enterWhileStatement(LogosXXParser.WhileStatementContext ctx)
	{

	}



	@Override
	public void exitWhileStatement(LogosXXParser.WhileStatementContext ctx)
	{

	}



	@Override
	public void enterDoStatement(LogosXXParser.DoStatementContext ctx)
	{

	}



	@Override
	public void exitDoStatement(LogosXXParser.DoStatementContext ctx)
	{

	}



	@Override
	public void enterForStatement(LogosXXParser.ForStatementContext ctx)
	{

	}



	@Override
	public void exitForStatement(LogosXXParser.ForStatementContext ctx)
	{

	}



	@Override
	public void enterForLoopInitializer(LogosXXParser.ForLoopInitializerContext ctx)
	{

	}



	@Override
	public void exitForLoopInitializer(LogosXXParser.ForLoopInitializerContext ctx)
	{

	}



	@Override
	public void enterForInStatement(LogosXXParser.ForInStatementContext ctx)
	{

	}



	@Override
	public void exitForInStatement(LogosXXParser.ForInStatementContext ctx)
	{

	}



	@Override
	public void enterJumpStatement(LogosXXParser.JumpStatementContext ctx)
	{

	}



	@Override
	public void exitJumpStatement(LogosXXParser.JumpStatementContext ctx)
	{

	}



	@Override
	public void enterExpressions(LogosXXParser.ExpressionsContext ctx)
	{

	}



	@Override
	public void exitExpressions(LogosXXParser.ExpressionsContext ctx)
	{

	}



	@Override
	public void enterExpression(LogosXXParser.ExpressionContext ctx)
	{

	}



	@Override
	public void exitExpression(LogosXXParser.ExpressionContext ctx)
	{

	}



	@Override
	public void enterAssignmentOperator(LogosXXParser.AssignmentOperatorContext ctx)
	{

	}



	@Override
	public void exitAssignmentOperator(LogosXXParser.AssignmentOperatorContext ctx)
	{

	}



	@Override
	public void enterCastExpression(LogosXXParser.CastExpressionContext ctx)
	{

	}



	@Override
	public void exitCastExpression(LogosXXParser.CastExpressionContext ctx)
	{

	}



	@Override
	public void enterInitializer(LogosXXParser.InitializerContext ctx)
	{

	}



	@Override
	public void exitInitializer(LogosXXParser.InitializerContext ctx)
	{

	}



	@Override
	public void enterConstantExpression(LogosXXParser.ConstantExpressionContext ctx)
	{

	}



	@Override
	public void exitConstantExpression(LogosXXParser.ConstantExpressionContext ctx)
	{

	}



	@Override
	public void enterUnaryExpression(LogosXXParser.UnaryExpressionContext ctx)
	{

	}



	@Override
	public void exitUnaryExpression(LogosXXParser.UnaryExpressionContext ctx)
	{

	}



	@Override
	public void enterUnaryOperator(LogosXXParser.UnaryOperatorContext ctx)
	{

	}



	@Override
	public void exitUnaryOperator(LogosXXParser.UnaryOperatorContext ctx)
	{

	}



	@Override
	public void enterPostfixExpression(LogosXXParser.PostfixExpressionContext ctx)
	{

	}



	@Override
	public void exitPostfixExpression(LogosXXParser.PostfixExpressionContext ctx)
	{

	}



	@Override
	public void enterPostfix(LogosXXParser.PostfixContext ctx)
	{

	}



	@Override
	public void exitPostfix(LogosXXParser.PostfixContext ctx)
	{

	}



	@Override
	public void enterArgumentExpressionList(LogosXXParser.ArgumentExpressionListContext ctx)
	{

	}



	@Override
	public void exitArgumentExpressionList(LogosXXParser.ArgumentExpressionListContext ctx)
	{

	}



	@Override
	public void enterArgumentExpression(LogosXXParser.ArgumentExpressionContext ctx)
	{

	}



	@Override
	public void exitArgumentExpression(LogosXXParser.ArgumentExpressionContext ctx)
	{

	}



	@Override
	public void enterPrimaryExpression(LogosXXParser.PrimaryExpressionContext ctx)
	{

	}



	@Override
	public void exitPrimaryExpression(LogosXXParser.PrimaryExpressionContext ctx)
	{

	}



	@Override
	public void enterConstant(LogosXXParser.ConstantContext ctx)
	{

	}



	@Override
	public void exitConstant(LogosXXParser.ConstantContext ctx)
	{

	}



	@Override
	public void enterStringLiteral(LogosXXParser.StringLiteralContext ctx)
	{

	}



	@Override
	public void exitStringLiteral(LogosXXParser.StringLiteralContext ctx)
	{

	}



	@Override
	public void enterIdentifier(LogosXXParser.IdentifierContext ctx)
	{

	}



	@Override
	public void exitIdentifier(LogosXXParser.IdentifierContext ctx)
	{

	}



	@Override
	public void visitTerminal(TerminalNode terminalNode)
	{

	}



	@Override
	public void visitErrorNode(ErrorNode errorNode)
	{

	}



	@Override
	public void enterEveryRule(ParserRuleContext parserRuleContext)
	{

	}



	@Override
	public void exitEveryRule(ParserRuleContext parserRuleContext)
	{
//		System.out.println(parserRuleContext.getText());
	}
}
