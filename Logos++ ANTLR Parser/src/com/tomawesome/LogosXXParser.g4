parser grammar LogosXXParser;
import ObjectiveCParser;

options { tokenVocab=LogosXXLexer;} // Objective-C Lexer comes in via this as well




/*
 Parser Rules
*/
logosxx : (logosxxTopLevel | topLevelDeclaration)* EOF;



//Top Level
logosxxTopLevel : config
                | hookf
                | hookswiftf
                | ctor
                | dtor
                | logosxxBlockLevel
                ;


config : LOGOS_CONFIG (LP (IDENTIFIER ASSIGNMENT (IDENTIFIER|DECIMAL_LITERAL))* RP) SEMI; // iffy


hookf : LOGOS_HOOKF (LP typeName ',' (methodSelector | stringLiteral) ',' parameterList? RP) logosFusedCompoundStatement;

hookswiftf : LOGOS_HOOKSWIFTF (LP stringLiteral ',' typeName ',' (methodSelector | stringLiteral) ',' parameterList? RP) logosFusedCompoundStatement;


ctor : LOGOS_CTOR logosFusedCompoundStatement;


dtor : LOGOS_DTOR logosFusedCompoundStatement;



// Block Level
logosxxBlockLevel : group
                  | hook
                  | hookswift
                  | newcontent
                  | subclass
                  | property
                  ;


group : LOGOS_GROUP IDENTIFIER groupContents* LOGOS_END; // technically ends with an end with any content between - but maybe that's up to the actual translator

groupContents : hook
              | hookswift
              | newcontent
              | subclass
              | property
              ;


hook : LOGOS_HOOK IDENTIFIER hookContents* LOGOS_END;

hookContents : logosFusedClassMethodDefinition
             | logosFusedInstanceMethodDefinition
             ;


hookswift : LOGOS_HOOKSWIFT IDENTIFIER DOT IDENTIFIER hookContents* LOGOS_END;


newcontent : LOGOS_NEW (logosFusedInstanceMethodDefinition | logosFusedClassMethodDefinition); // needs a newline to be perfectly accurate


subclass : LOGOS_SUBCLASS IDENTIFIER COLON IDENTIFIER (LT protocolList GT)? (property | logosFusedClassMethodDefinition | logosFusedInstanceMethodDefinition)* LOGOS_END;


property : LOGOS_PROPERTY (LP propertyAttributesList RP)? typeName IDENTIFIER;



// Function Level
logosxxFunctionLevel : init
                     | classeval
                     | callswift
                     | orig
                     | log
                     ;


init : LOGOS_INIT SEMI // TODO - more complex options
     | LOGOS_INIT initexpr SEMI
     ;

initexpr : LP typeName '=' expression (COMMA initexpr)* RP;


classeval : LOGOS_CLASS LP (ADD|SUB)? IDENTIFIER RP;


callswift : LOGOS_CALLSWIFT LP typeName ',' stringLiteral ',' (LP typeList? RP) ',' (LP argumentExpressionList? RP) RP ';';

typeList :  typeName (',' typeName)*;

//argumentList : IDENTIFIER (',' IDENTIFIER)*;


orig : LOGOS_ORIG ((LP parameterList? RP))?;


log : LOGOS_LOG SEMI
    | LOGOS_LOG LP (logexpr)? RP SEMI;

logexpr : LP typeName RP expression (COMMA logexpr)*;



// Generic
logosFusedClassMethodDefinition : '+' logosFusedMethodDefinition
                                | classMethodDefinition
                                ;


logosFusedInstanceMethodDefinition : '-' logosFusedMethodDefinition
                                   | instanceMethodDefinition
                                   ;


logosFusedMethodDefinition : methodType? methodSelector initDeclaratorList? ';'? logosFusedCompoundStatement
                           | methodDefinition;


logosFusedCompoundStatement : '{' (declaration | statement | logosxxFunctionLevel | cppTemplateFunctionCallStatement | hookedFunctionExpression)* '}'
                            | compoundStatement
                            ;


hookedFunctionExpression : 'void' LP '*' IDENTIFIER RP LP typeList RP ('=' expression | ';');


cppTemplateFunctionCallStatement : IDENTIFIER LT typeName* POINTER? GT (LP argumentExpressionList? RP) (DOT IDENTIFIER)? assignmentOperator assignmentExpression=expression;