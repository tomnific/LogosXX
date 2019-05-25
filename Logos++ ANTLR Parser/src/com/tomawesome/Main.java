package com.tomawesome;


import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;





public class Main
{

    public static void main(String[] args) throws Exception
    {
//        FileInputStream inputStream;
//
//        if (args.length == 1)
//        {
//            inputStream = new FileInputStream(args[0]);
//        }
//        else
//        {
//            inputStream = new FileInputStream("inputs/Tweak.xxm");
//        }
//
//        ANTLRInputStream input = new ANTLRInputStream(inputStream);
//
//
//        LogosXXLexer lexer = new LogosXXLexer(input);
//
//        CommonTokenStream tokens = new CommonTokenStream(lexer);
//
//        LogosXXParser parser = new LogosXXParser(tokens);
//
//        parser.logosTopLevel();

        LogosMM translator = new LogosMM();

        translator.translate("inputs/Tweak.xxm");
    }
}
