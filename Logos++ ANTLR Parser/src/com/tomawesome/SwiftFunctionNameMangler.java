package com.tomawesome;


import java.util.ArrayList;
import java.util.Arrays;





public class SwiftFunctionNameMangler
{
	public static String mangleFunction(String returnType, String nameDetails, String parameterList)
	{
		String mangled = "";


		mangled += mangleNameDetails(nameDetails);
		mangled += mangleParameters(parameterList);
		mangled += mangleReturnType(returnType);


		return mangled;
	}




	// DOES NOT SUPPORT IMPLICIT GETTER/SETTER/MATERIALIZER OF VARIABLES
	// DOES NOT SUPPORT IMPLICIT CONSTRUCTOR/DESTRUCTOR OR ALLOCATOR/DEALLOCATOR OF CLASSES
	public static String mangleNameDetails(String name)
	{
		String mangled = "_TFC";
		String[] split = name.split("\\.");

		if (split.length == 3) // Encapsulated Function: AppName.ClassName.FunctionName
		{
			mangled += split[0].length() + split[0];
			mangled += split[1].length() + split[1];
			mangled += split[2].length() + split[2];
			mangled += "f";
		}
		else  if(split.length == 2) //Regular Function: AppName.FunctionName
		{
			mangled += split[0].length() + split[0];
			mangled += split[1].length() + split[1];
			mangled += "F";
		}


		return mangled;
	}




	// DOES NOT SUPPORT SEVERAL SWIFT BUILTINS
	public static String mangleParameters(String parameterList)
	{
		String mangled = "";


		if (parameterList == "") // No Parameters
		{
			return "T_";
		}


		for (String type : parameterList.split("\\s*,\\s*"))
		{
			if (type.equals("NSArray"))
			{
				mangled += "Sa";
			}
			else if (type.equals("BOOL"))
			{
				mangled += "Sb";
			}
			else if (type.equals("double"))
			{
				mangled += "Sd";
			}
			else if (type.equals("float"))
			{
				mangled += "Sf";
			}
			else if (type.equals("int"))
			{
				mangled += "Si";
			}
			else if (type.equals("u_int64_t") || type.equals("u_int32_t")) // Generic UInt
			{
				mangled += "Su";
			}
			else if (type.equals("NSString"))
			{
				mangled += "SS";
			}
		}


		return mangled;
	}




	// DOES NOT SUPPORT SEVERAL SWIFT BUILTINS
	public static String mangleReturnType(String returnType)
	{
		String mangled = "";


		if (returnType.equals("void")) // No Parameters
		{
			return "T_";
		}


		if (returnType.equals("NSArray"))
		{
			mangled += "Sa";
		}
		else if (returnType.equals("BOOL"))
		{
			mangled += "Sb";
		}
		else if (returnType.equals("double"))
		{
			mangled += "Sd";
		}
		else if (returnType.equals("float"))
		{
			mangled += "Sf";
		}
		else if (returnType.equals("int"))
		{
			mangled += "Si";
		}
		else if (returnType.equals("u_int64_t") || returnType.equals("u_int32_t")) // Generic UInt
		{
			mangled += "Su";
		}
		else if (returnType.equals("NSString"))
		{
			mangled += "SS";
		}


		return mangled;
	}
}
