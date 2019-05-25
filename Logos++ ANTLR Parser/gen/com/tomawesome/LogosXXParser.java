// Generated from /Users/Tom/Garage/School/Projects/Language Creation/Logos++/Logos++ ANTLR Parser/src/com/tomawesome/LogosXXParser.g4 by ANTLR 4.7.2
package com.tomawesome;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class LogosXXParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.7.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		LOGOS_CONFIG=1, LOGOS_HOOKF=2, LOGOS_HOOKSWIFTF=3, LOGOS_CTOR=4, LOGOS_DTOR=5, 
		LOGOS_GROUP=6, LOGOS_HOOK=7, LOGOS_HOOKSWIFT=8, LOGOS_NEW=9, LOGOS_SUBCLASS=10, 
		LOGOS_PROPERTY=11, LOGOS_END=12, LOGOS_INIT=13, LOGOS_CLASS=14, LOGOS_CALLSWIFT=15, 
		LOGOS_ORIG=16, LOGOS_LOG=17, AUTO=18, BREAK=19, CASE=20, CHAR=21, CONST=22, 
		CONTINUE=23, DEFAULT=24, DO=25, DOUBLE=26, ELSE=27, ENUM=28, EXTERN=29, 
		FLOAT=30, FOR=31, GOTO=32, IF=33, INLINE=34, INT=35, LONG=36, REGISTER=37, 
		RESTRICT=38, RETURN=39, SHORT=40, SIGNED=41, SIZEOF=42, STATIC=43, STRUCT=44, 
		SWITCH=45, TYPEDEF=46, UNION=47, UNSIGNED=48, VOID=49, VOLATILE=50, WHILE=51, 
		BOOL_=52, COMPLEX=53, IMAGINERY=54, TRUE=55, FALSE=56, BOOL=57, Class=58, 
		BYCOPY=59, BYREF=60, ID=61, IMP=62, IN=63, INOUT=64, NIL=65, NO=66, NULL=67, 
		ONEWAY=68, OUT=69, PROTOCOL_=70, SEL=71, SELF=72, SUPER=73, YES=74, AUTORELEASEPOOL=75, 
		CATCH=76, CLASS=77, DYNAMIC=78, ENCODE=79, END=80, FINALLY=81, IMPLEMENTATION=82, 
		INTERFACE=83, IMPORT=84, PACKAGE=85, PROTOCOL=86, OPTIONAL=87, PRIVATE=88, 
		PROPERTY=89, PROTECTED=90, PUBLIC=91, REQUIRED=92, SELECTOR=93, SYNCHRONIZED=94, 
		SYNTHESIZE=95, THROW=96, TRY=97, ATOMIC=98, NONATOMIC=99, RETAIN=100, 
		ATTRIBUTE=101, AUTORELEASING_QUALIFIER=102, BLOCK=103, BRIDGE=104, BRIDGE_RETAINED=105, 
		BRIDGE_TRANSFER=106, COVARIANT=107, CONTRAVARIANT=108, DEPRECATED=109, 
		KINDOF=110, STRONG_QUALIFIER=111, TYPEOF=112, UNSAFE_UNRETAINED_QUALIFIER=113, 
		UNUSED=114, WEAK_QUALIFIER=115, NULL_UNSPECIFIED=116, NULLABLE=117, NONNULL=118, 
		NULL_RESETTABLE=119, NS_INLINE=120, NS_ENUM=121, NS_OPTIONS=122, ASSIGN=123, 
		COPY=124, GETTER=125, SETTER=126, STRONG=127, READONLY=128, READWRITE=129, 
		WEAK=130, UNSAFE_UNRETAINED=131, IB_OUTLET=132, IB_OUTLET_COLLECTION=133, 
		IB_INSPECTABLE=134, IB_DESIGNABLE=135, NS_ASSUME_NONNULL_BEGIN=136, NS_ASSUME_NONNULL_END=137, 
		EXTERN_SUFFIX=138, IOS_SUFFIX=139, MAC_SUFFIX=140, TVOS_PROHIBITED=141, 
		IDENTIFIER=142, LP=143, RP=144, LBRACE=145, RBRACE=146, LBRACK=147, RBRACK=148, 
		SEMI=149, COMMA=150, DOT=151, STRUCTACCESS=152, AT=153, ASSIGNMENT=154, 
		GT=155, LT=156, BANG=157, TILDE=158, QUESTION=159, COLON=160, EQUAL=161, 
		LE=162, GE=163, NOTEQUAL=164, AND=165, OR=166, INC=167, DEC=168, ADD=169, 
		SUB=170, MUL=171, DIV=172, BITAND=173, BITOR=174, BITXOR=175, MOD=176, 
		ADD_ASSIGN=177, SUB_ASSIGN=178, MUL_ASSIGN=179, DIV_ASSIGN=180, AND_ASSIGN=181, 
		OR_ASSIGN=182, XOR_ASSIGN=183, MOD_ASSIGN=184, LSHIFT_ASSIGN=185, RSHIFT_ASSIGN=186, 
		ELIPSIS=187, CHARACTER_LITERAL=188, STRING_START=189, HEX_LITERAL=190, 
		OCTAL_LITERAL=191, BINARY_LITERAL=192, DECIMAL_LITERAL=193, FLOATING_POINT_LITERAL=194, 
		WS=195, MULTI_COMMENT=196, SINGLE_COMMENT=197, BACKSLASH=198, SHARP=199, 
		STRING_NEWLINE=200, STRING_END=201, STRING_VALUE=202, DIRECTIVE_IMPORT=203, 
		DIRECTIVE_INCLUDE=204, DIRECTIVE_PRAGMA=205, DIRECTIVE_DEFINE=206, DIRECTIVE_DEFINED=207, 
		DIRECTIVE_IF=208, DIRECTIVE_ELIF=209, DIRECTIVE_ELSE=210, DIRECTIVE_UNDEF=211, 
		DIRECTIVE_IFDEF=212, DIRECTIVE_IFNDEF=213, DIRECTIVE_ENDIF=214, DIRECTIVE_TRUE=215, 
		DIRECTIVE_FALSE=216, DIRECTIVE_ERROR=217, DIRECTIVE_WARNING=218, DIRECTIVE_BANG=219, 
		DIRECTIVE_LP=220, DIRECTIVE_RP=221, DIRECTIVE_EQUAL=222, DIRECTIVE_NOTEQUAL=223, 
		DIRECTIVE_AND=224, DIRECTIVE_OR=225, DIRECTIVE_LT=226, DIRECTIVE_GT=227, 
		DIRECTIVE_LE=228, DIRECTIVE_GE=229, DIRECTIVE_STRING=230, DIRECTIVE_ID=231, 
		DIRECTIVE_DECIMAL_LITERAL=232, DIRECTIVE_FLOAT=233, DIRECTIVE_NEWLINE=234, 
		DIRECTIVE_MULTI_COMMENT=235, DIRECTIVE_SINGLE_COMMENT=236, DIRECTIVE_BACKSLASH_NEWLINE=237, 
		DIRECTIVE_TEXT_NEWLINE=238, DIRECTIVE_TEXT=239, POINTER=240;
	public static final int
		RULE_logosxx = 0, RULE_logosxxTopLevel = 1, RULE_config = 2, RULE_hookf = 3, 
		RULE_hookswiftf = 4, RULE_ctor = 5, RULE_dtor = 6, RULE_logosxxBlockLevel = 7, 
		RULE_group = 8, RULE_groupContents = 9, RULE_hook = 10, RULE_hookContents = 11, 
		RULE_hookswift = 12, RULE_newcontent = 13, RULE_subclass = 14, RULE_property = 15, 
		RULE_logosxxFunctionLevel = 16, RULE_init = 17, RULE_initexpr = 18, RULE_classeval = 19, 
		RULE_callswift = 20, RULE_typeList = 21, RULE_orig = 22, RULE_log = 23, 
		RULE_logexpr = 24, RULE_logosFusedClassMethodDefinition = 25, RULE_logosFusedInstanceMethodDefinition = 26, 
		RULE_logosFusedMethodDefinition = 27, RULE_logosFusedCompoundStatement = 28, 
		RULE_hookedFunctionExpression = 29, RULE_cppTemplateFunctionCallStatement = 30, 
		RULE_translationUnit = 31, RULE_topLevelDeclaration = 32, RULE_importDeclaration = 33, 
		RULE_classInterface = 34, RULE_categoryInterface = 35, RULE_classImplementation = 36, 
		RULE_categoryImplementation = 37, RULE_genericTypeSpecifier = 38, RULE_protocolDeclaration = 39, 
		RULE_protocolDeclarationSection = 40, RULE_protocolDeclarationList = 41, 
		RULE_classDeclarationList = 42, RULE_protocolList = 43, RULE_propertyDeclaration = 44, 
		RULE_propertyAttributesList = 45, RULE_propertyAttribute = 46, RULE_protocolName = 47, 
		RULE_instanceVariables = 48, RULE_visibilitySection = 49, RULE_accessModifier = 50, 
		RULE_interfaceDeclarationList = 51, RULE_classMethodDeclaration = 52, 
		RULE_instanceMethodDeclaration = 53, RULE_methodDeclaration = 54, RULE_implementationDefinitionList = 55, 
		RULE_classMethodDefinition = 56, RULE_instanceMethodDefinition = 57, RULE_methodDefinition = 58, 
		RULE_methodSelector = 59, RULE_keywordDeclarator = 60, RULE_selector = 61, 
		RULE_methodType = 62, RULE_propertyImplementation = 63, RULE_propertySynthesizeList = 64, 
		RULE_propertySynthesizeItem = 65, RULE_blockType = 66, RULE_genericsSpecifier = 67, 
		RULE_typeSpecifierWithPrefixes = 68, RULE_dictionaryExpression = 69, RULE_dictionaryPair = 70, 
		RULE_arrayExpression = 71, RULE_boxExpression = 72, RULE_blockParameters = 73, 
		RULE_typeVariableDeclaratorOrName = 74, RULE_blockExpression = 75, RULE_messageExpression = 76, 
		RULE_receiver = 77, RULE_messageSelector = 78, RULE_keywordArgument = 79, 
		RULE_keywordArgumentType = 80, RULE_selectorExpression = 81, RULE_selectorName = 82, 
		RULE_protocolExpression = 83, RULE_encodeExpression = 84, RULE_typeVariableDeclarator = 85, 
		RULE_throwStatement = 86, RULE_tryBlock = 87, RULE_catchStatement = 88, 
		RULE_synchronizedStatement = 89, RULE_autoreleaseStatement = 90, RULE_functionDeclaration = 91, 
		RULE_functionDefinition = 92, RULE_functionSignature = 93, RULE_attribute = 94, 
		RULE_attributeName = 95, RULE_attributeParameters = 96, RULE_attributeParameterList = 97, 
		RULE_attributeParameter = 98, RULE_attributeParameterAssignment = 99, 
		RULE_declaration = 100, RULE_functionCallExpression = 101, RULE_enumDeclaration = 102, 
		RULE_varDeclaration = 103, RULE_typedefDeclaration = 104, RULE_typeDeclaratorList = 105, 
		RULE_typeDeclarator = 106, RULE_declarationSpecifiers = 107, RULE_attributeSpecifier = 108, 
		RULE_initDeclaratorList = 109, RULE_initDeclarator = 110, RULE_structOrUnionSpecifier = 111, 
		RULE_fieldDeclaration = 112, RULE_specifierQualifierList = 113, RULE_ibOutletQualifier = 114, 
		RULE_arcBehaviourSpecifier = 115, RULE_nullabilitySpecifier = 116, RULE_storageClassSpecifier = 117, 
		RULE_typePrefix = 118, RULE_typeQualifier = 119, RULE_protocolQualifier = 120, 
		RULE_typeSpecifier = 121, RULE_typeofExpression = 122, RULE_fieldDeclaratorList = 123, 
		RULE_fieldDeclarator = 124, RULE_enumSpecifier = 125, RULE_enumeratorList = 126, 
		RULE_enumerator = 127, RULE_enumeratorIdentifier = 128, RULE_directDeclarator = 129, 
		RULE_declaratorSuffix = 130, RULE_parameterList = 131, RULE_pointer = 132, 
		RULE_macro = 133, RULE_arrayInitializer = 134, RULE_structInitializer = 135, 
		RULE_initializerList = 136, RULE_typeName = 137, RULE_abstractDeclarator = 138, 
		RULE_abstractDeclaratorSuffix = 139, RULE_parameterDeclarationList = 140, 
		RULE_parameterDeclaration = 141, RULE_declarator = 142, RULE_statement = 143, 
		RULE_labeledStatement = 144, RULE_rangeExpression = 145, RULE_compoundStatement = 146, 
		RULE_selectionStatement = 147, RULE_switchStatement = 148, RULE_switchBlock = 149, 
		RULE_switchSection = 150, RULE_switchLabel = 151, RULE_iterationStatement = 152, 
		RULE_whileStatement = 153, RULE_doStatement = 154, RULE_forStatement = 155, 
		RULE_forLoopInitializer = 156, RULE_forInStatement = 157, RULE_jumpStatement = 158, 
		RULE_expressions = 159, RULE_expression = 160, RULE_assignmentOperator = 161, 
		RULE_castExpression = 162, RULE_initializer = 163, RULE_constantExpression = 164, 
		RULE_unaryExpression = 165, RULE_unaryOperator = 166, RULE_postfixExpression = 167, 
		RULE_postfix = 168, RULE_argumentExpressionList = 169, RULE_argumentExpression = 170, 
		RULE_primaryExpression = 171, RULE_constant = 172, RULE_stringLiteral = 173, 
		RULE_identifier = 174;
	private static String[] makeRuleNames() {
		return new String[] {
			"logosxx", "logosxxTopLevel", "config", "hookf", "hookswiftf", "ctor", 
			"dtor", "logosxxBlockLevel", "group", "groupContents", "hook", "hookContents", 
			"hookswift", "newcontent", "subclass", "property", "logosxxFunctionLevel", 
			"init", "initexpr", "classeval", "callswift", "typeList", "orig", "log", 
			"logexpr", "logosFusedClassMethodDefinition", "logosFusedInstanceMethodDefinition", 
			"logosFusedMethodDefinition", "logosFusedCompoundStatement", "hookedFunctionExpression", 
			"cppTemplateFunctionCallStatement", "translationUnit", "topLevelDeclaration", 
			"importDeclaration", "classInterface", "categoryInterface", "classImplementation", 
			"categoryImplementation", "genericTypeSpecifier", "protocolDeclaration", 
			"protocolDeclarationSection", "protocolDeclarationList", "classDeclarationList", 
			"protocolList", "propertyDeclaration", "propertyAttributesList", "propertyAttribute", 
			"protocolName", "instanceVariables", "visibilitySection", "accessModifier", 
			"interfaceDeclarationList", "classMethodDeclaration", "instanceMethodDeclaration", 
			"methodDeclaration", "implementationDefinitionList", "classMethodDefinition", 
			"instanceMethodDefinition", "methodDefinition", "methodSelector", "keywordDeclarator", 
			"selector", "methodType", "propertyImplementation", "propertySynthesizeList", 
			"propertySynthesizeItem", "blockType", "genericsSpecifier", "typeSpecifierWithPrefixes", 
			"dictionaryExpression", "dictionaryPair", "arrayExpression", "boxExpression", 
			"blockParameters", "typeVariableDeclaratorOrName", "blockExpression", 
			"messageExpression", "receiver", "messageSelector", "keywordArgument", 
			"keywordArgumentType", "selectorExpression", "selectorName", "protocolExpression", 
			"encodeExpression", "typeVariableDeclarator", "throwStatement", "tryBlock", 
			"catchStatement", "synchronizedStatement", "autoreleaseStatement", "functionDeclaration", 
			"functionDefinition", "functionSignature", "attribute", "attributeName", 
			"attributeParameters", "attributeParameterList", "attributeParameter", 
			"attributeParameterAssignment", "declaration", "functionCallExpression", 
			"enumDeclaration", "varDeclaration", "typedefDeclaration", "typeDeclaratorList", 
			"typeDeclarator", "declarationSpecifiers", "attributeSpecifier", "initDeclaratorList", 
			"initDeclarator", "structOrUnionSpecifier", "fieldDeclaration", "specifierQualifierList", 
			"ibOutletQualifier", "arcBehaviourSpecifier", "nullabilitySpecifier", 
			"storageClassSpecifier", "typePrefix", "typeQualifier", "protocolQualifier", 
			"typeSpecifier", "typeofExpression", "fieldDeclaratorList", "fieldDeclarator", 
			"enumSpecifier", "enumeratorList", "enumerator", "enumeratorIdentifier", 
			"directDeclarator", "declaratorSuffix", "parameterList", "pointer", "macro", 
			"arrayInitializer", "structInitializer", "initializerList", "typeName", 
			"abstractDeclarator", "abstractDeclaratorSuffix", "parameterDeclarationList", 
			"parameterDeclaration", "declarator", "statement", "labeledStatement", 
			"rangeExpression", "compoundStatement", "selectionStatement", "switchStatement", 
			"switchBlock", "switchSection", "switchLabel", "iterationStatement", 
			"whileStatement", "doStatement", "forStatement", "forLoopInitializer", 
			"forInStatement", "jumpStatement", "expressions", "expression", "assignmentOperator", 
			"castExpression", "initializer", "constantExpression", "unaryExpression", 
			"unaryOperator", "postfixExpression", "postfix", "argumentExpressionList", 
			"argumentExpression", "primaryExpression", "constant", "stringLiteral", 
			"identifier"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'%config'", "'%hookf'", "'%hookswiftf'", "'%ctor'", "'%dtor'", 
			"'%group'", "'%hook'", "'%hookswift'", "'%new\n'", "'%subclass'", "'%property'", 
			"'%end'", "'%init'", "'%class'", "'%callswift'", "'%orig'", "'%log'", 
			"'auto'", "'break'", "'case'", "'char'", "'const'", "'continue'", "'default'", 
			"'do'", "'double'", null, "'enum'", "'extern'", "'float'", "'for'", "'goto'", 
			null, "'inline'", "'int'", "'long'", "'register'", "'restrict'", "'return'", 
			"'short'", "'signed'", "'sizeof'", "'static'", "'struct'", "'switch'", 
			"'typedef'", "'union'", "'unsigned'", "'void'", "'volatile'", "'while'", 
			"'_Bool'", "'_Complex'", "'_Imaginery'", "'true'", "'false'", "'BOOL'", 
			"'Class'", "'bycopy'", "'byref'", "'id'", "'IMP'", "'in'", "'inout'", 
			"'nil'", "'NO'", "'NULL'", "'oneway'", "'out'", "'Protocol'", "'SEL'", 
			"'self'", "'super'", "'YES'", "'@autoreleasepool'", "'@catch'", "'@class'", 
			"'@dynamic'", "'@encode'", "'@end'", "'@finally'", "'@implementation'", 
			"'@interface'", "'@import'", "'@package'", "'@protocol'", "'@optional'", 
			"'@private'", "'@property'", "'@protected'", "'@public'", "'@required'", 
			"'@selector'", "'@synchronized'", "'@synthesize'", "'@throw'", "'@try'", 
			"'atomic'", "'nonatomic'", "'retain'", "'__attribute__'", "'__autoreleasing'", 
			"'__block'", "'__bridge'", "'__bridge_retained'", "'__bridge_transfer'", 
			"'__covariant'", "'__contravariant'", "'__deprecated'", "'__kindof'", 
			"'__strong'", null, "'__unsafe_unretained'", "'__unused'", "'__weak'", 
			null, null, null, "'null_resettable'", "'NS_INLINE'", "'NS_ENUM'", "'NS_OPTIONS'", 
			"'assign'", "'copy'", "'getter'", "'setter'", "'strong'", "'readonly'", 
			"'readwrite'", "'weak'", "'unsafe_unretained'", "'IBOutlet'", "'IBOutletCollection'", 
			"'IBInspectable'", "'IB_DESIGNABLE'", null, null, null, null, null, "'__TVOS_PROHIBITED'", 
			null, null, null, "'{'", "'}'", "'['", "']'", "';'", "','", "'.'", "'->'", 
			"'@'", "'='", null, null, null, "'~'", "'?'", "':'", null, null, null, 
			null, null, null, "'++'", "'--'", "'+'", "'-'", "'*'", "'/'", "'&'", 
			"'|'", "'^'", "'%'", "'+='", "'-='", "'*='", "'/='", "'&='", "'|='", 
			"'^='", "'%='", "'<<='", "'>>='", "'...'", null, null, null, null, null, 
			null, null, null, null, null, "'\\'", null, null, null, null, null, null, 
			null, null, "'defined'", null, "'elif'", null, "'undef'", "'ifdef'", 
			"'ifndef'", "'endif'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "LOGOS_CONFIG", "LOGOS_HOOKF", "LOGOS_HOOKSWIFTF", "LOGOS_CTOR", 
			"LOGOS_DTOR", "LOGOS_GROUP", "LOGOS_HOOK", "LOGOS_HOOKSWIFT", "LOGOS_NEW", 
			"LOGOS_SUBCLASS", "LOGOS_PROPERTY", "LOGOS_END", "LOGOS_INIT", "LOGOS_CLASS", 
			"LOGOS_CALLSWIFT", "LOGOS_ORIG", "LOGOS_LOG", "AUTO", "BREAK", "CASE", 
			"CHAR", "CONST", "CONTINUE", "DEFAULT", "DO", "DOUBLE", "ELSE", "ENUM", 
			"EXTERN", "FLOAT", "FOR", "GOTO", "IF", "INLINE", "INT", "LONG", "REGISTER", 
			"RESTRICT", "RETURN", "SHORT", "SIGNED", "SIZEOF", "STATIC", "STRUCT", 
			"SWITCH", "TYPEDEF", "UNION", "UNSIGNED", "VOID", "VOLATILE", "WHILE", 
			"BOOL_", "COMPLEX", "IMAGINERY", "TRUE", "FALSE", "BOOL", "Class", "BYCOPY", 
			"BYREF", "ID", "IMP", "IN", "INOUT", "NIL", "NO", "NULL", "ONEWAY", "OUT", 
			"PROTOCOL_", "SEL", "SELF", "SUPER", "YES", "AUTORELEASEPOOL", "CATCH", 
			"CLASS", "DYNAMIC", "ENCODE", "END", "FINALLY", "IMPLEMENTATION", "INTERFACE", 
			"IMPORT", "PACKAGE", "PROTOCOL", "OPTIONAL", "PRIVATE", "PROPERTY", "PROTECTED", 
			"PUBLIC", "REQUIRED", "SELECTOR", "SYNCHRONIZED", "SYNTHESIZE", "THROW", 
			"TRY", "ATOMIC", "NONATOMIC", "RETAIN", "ATTRIBUTE", "AUTORELEASING_QUALIFIER", 
			"BLOCK", "BRIDGE", "BRIDGE_RETAINED", "BRIDGE_TRANSFER", "COVARIANT", 
			"CONTRAVARIANT", "DEPRECATED", "KINDOF", "STRONG_QUALIFIER", "TYPEOF", 
			"UNSAFE_UNRETAINED_QUALIFIER", "UNUSED", "WEAK_QUALIFIER", "NULL_UNSPECIFIED", 
			"NULLABLE", "NONNULL", "NULL_RESETTABLE", "NS_INLINE", "NS_ENUM", "NS_OPTIONS", 
			"ASSIGN", "COPY", "GETTER", "SETTER", "STRONG", "READONLY", "READWRITE", 
			"WEAK", "UNSAFE_UNRETAINED", "IB_OUTLET", "IB_OUTLET_COLLECTION", "IB_INSPECTABLE", 
			"IB_DESIGNABLE", "NS_ASSUME_NONNULL_BEGIN", "NS_ASSUME_NONNULL_END", 
			"EXTERN_SUFFIX", "IOS_SUFFIX", "MAC_SUFFIX", "TVOS_PROHIBITED", "IDENTIFIER", 
			"LP", "RP", "LBRACE", "RBRACE", "LBRACK", "RBRACK", "SEMI", "COMMA", 
			"DOT", "STRUCTACCESS", "AT", "ASSIGNMENT", "GT", "LT", "BANG", "TILDE", 
			"QUESTION", "COLON", "EQUAL", "LE", "GE", "NOTEQUAL", "AND", "OR", "INC", 
			"DEC", "ADD", "SUB", "MUL", "DIV", "BITAND", "BITOR", "BITXOR", "MOD", 
			"ADD_ASSIGN", "SUB_ASSIGN", "MUL_ASSIGN", "DIV_ASSIGN", "AND_ASSIGN", 
			"OR_ASSIGN", "XOR_ASSIGN", "MOD_ASSIGN", "LSHIFT_ASSIGN", "RSHIFT_ASSIGN", 
			"ELIPSIS", "CHARACTER_LITERAL", "STRING_START", "HEX_LITERAL", "OCTAL_LITERAL", 
			"BINARY_LITERAL", "DECIMAL_LITERAL", "FLOATING_POINT_LITERAL", "WS", 
			"MULTI_COMMENT", "SINGLE_COMMENT", "BACKSLASH", "SHARP", "STRING_NEWLINE", 
			"STRING_END", "STRING_VALUE", "DIRECTIVE_IMPORT", "DIRECTIVE_INCLUDE", 
			"DIRECTIVE_PRAGMA", "DIRECTIVE_DEFINE", "DIRECTIVE_DEFINED", "DIRECTIVE_IF", 
			"DIRECTIVE_ELIF", "DIRECTIVE_ELSE", "DIRECTIVE_UNDEF", "DIRECTIVE_IFDEF", 
			"DIRECTIVE_IFNDEF", "DIRECTIVE_ENDIF", "DIRECTIVE_TRUE", "DIRECTIVE_FALSE", 
			"DIRECTIVE_ERROR", "DIRECTIVE_WARNING", "DIRECTIVE_BANG", "DIRECTIVE_LP", 
			"DIRECTIVE_RP", "DIRECTIVE_EQUAL", "DIRECTIVE_NOTEQUAL", "DIRECTIVE_AND", 
			"DIRECTIVE_OR", "DIRECTIVE_LT", "DIRECTIVE_GT", "DIRECTIVE_LE", "DIRECTIVE_GE", 
			"DIRECTIVE_STRING", "DIRECTIVE_ID", "DIRECTIVE_DECIMAL_LITERAL", "DIRECTIVE_FLOAT", 
			"DIRECTIVE_NEWLINE", "DIRECTIVE_MULTI_COMMENT", "DIRECTIVE_SINGLE_COMMENT", 
			"DIRECTIVE_BACKSLASH_NEWLINE", "DIRECTIVE_TEXT_NEWLINE", "DIRECTIVE_TEXT", 
			"POINTER"
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}

	@Override
	public String getGrammarFileName() { return "LogosXXParser.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public LogosXXParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class LogosxxContext extends ParserRuleContext {
		public TerminalNode EOF() { return getToken(LogosXXParser.EOF, 0); }
		public List<LogosxxTopLevelContext> logosxxTopLevel() {
			return getRuleContexts(LogosxxTopLevelContext.class);
		}
		public LogosxxTopLevelContext logosxxTopLevel(int i) {
			return getRuleContext(LogosxxTopLevelContext.class,i);
		}
		public List<TopLevelDeclarationContext> topLevelDeclaration() {
			return getRuleContexts(TopLevelDeclarationContext.class);
		}
		public TopLevelDeclarationContext topLevelDeclaration(int i) {
			return getRuleContext(TopLevelDeclarationContext.class,i);
		}
		public LogosxxContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_logosxx; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LogosXXParserListener ) ((LogosXXParserListener)listener).enterLogosxx(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LogosXXParserListener ) ((LogosXXParserListener)listener).exitLogosxx(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LogosXXParserVisitor ) return ((LogosXXParserVisitor<? extends T>)visitor).visitLogosxx(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LogosxxContext logosxx() throws RecognitionException {
		LogosxxContext _localctx = new LogosxxContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_logosxx);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(354);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << LOGOS_CONFIG) | (1L << LOGOS_HOOKF) | (1L << LOGOS_HOOKSWIFTF) | (1L << LOGOS_CTOR) | (1L << LOGOS_DTOR) | (1L << LOGOS_GROUP) | (1L << LOGOS_HOOK) | (1L << LOGOS_HOOKSWIFT) | (1L << LOGOS_NEW) | (1L << LOGOS_SUBCLASS) | (1L << LOGOS_PROPERTY) | (1L << AUTO) | (1L << CHAR) | (1L << CONST) | (1L << DOUBLE) | (1L << ENUM) | (1L << EXTERN) | (1L << FLOAT) | (1L << INLINE) | (1L << INT) | (1L << LONG) | (1L << REGISTER) | (1L << RESTRICT) | (1L << SHORT) | (1L << SIGNED) | (1L << STATIC) | (1L << STRUCT) | (1L << TYPEDEF) | (1L << UNION) | (1L << UNSIGNED) | (1L << VOID) | (1L << VOLATILE) | (1L << BOOL) | (1L << Class) | (1L << BYCOPY) | (1L << BYREF) | (1L << ID) | (1L << IMP) | (1L << IN))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (INOUT - 64)) | (1L << (ONEWAY - 64)) | (1L << (OUT - 64)) | (1L << (PROTOCOL_ - 64)) | (1L << (SEL - 64)) | (1L << (SELF - 64)) | (1L << (SUPER - 64)) | (1L << (CLASS - 64)) | (1L << (IMPLEMENTATION - 64)) | (1L << (INTERFACE - 64)) | (1L << (IMPORT - 64)) | (1L << (PROTOCOL - 64)) | (1L << (ATOMIC - 64)) | (1L << (NONATOMIC - 64)) | (1L << (RETAIN - 64)) | (1L << (ATTRIBUTE - 64)) | (1L << (AUTORELEASING_QUALIFIER - 64)) | (1L << (BLOCK - 64)) | (1L << (BRIDGE - 64)) | (1L << (BRIDGE_RETAINED - 64)) | (1L << (BRIDGE_TRANSFER - 64)) | (1L << (COVARIANT - 64)) | (1L << (CONTRAVARIANT - 64)) | (1L << (DEPRECATED - 64)) | (1L << (KINDOF - 64)) | (1L << (STRONG_QUALIFIER - 64)) | (1L << (TYPEOF - 64)) | (1L << (UNSAFE_UNRETAINED_QUALIFIER - 64)) | (1L << (UNUSED - 64)) | (1L << (WEAK_QUALIFIER - 64)) | (1L << (NULL_UNSPECIFIED - 64)) | (1L << (NULLABLE - 64)) | (1L << (NONNULL - 64)) | (1L << (NULL_RESETTABLE - 64)) | (1L << (NS_INLINE - 64)) | (1L << (NS_ENUM - 64)) | (1L << (NS_OPTIONS - 64)) | (1L << (ASSIGN - 64)) | (1L << (COPY - 64)) | (1L << (GETTER - 64)) | (1L << (SETTER - 64)) | (1L << (STRONG - 64)))) != 0) || ((((_la - 128)) & ~0x3f) == 0 && ((1L << (_la - 128)) & ((1L << (READONLY - 128)) | (1L << (READWRITE - 128)) | (1L << (WEAK - 128)) | (1L << (UNSAFE_UNRETAINED - 128)) | (1L << (IB_OUTLET - 128)) | (1L << (IB_OUTLET_COLLECTION - 128)) | (1L << (IB_INSPECTABLE - 128)) | (1L << (IB_DESIGNABLE - 128)) | (1L << (IDENTIFIER - 128)))) != 0)) {
				{
				setState(352);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case LOGOS_CONFIG:
				case LOGOS_HOOKF:
				case LOGOS_HOOKSWIFTF:
				case LOGOS_CTOR:
				case LOGOS_DTOR:
				case LOGOS_GROUP:
				case LOGOS_HOOK:
				case LOGOS_HOOKSWIFT:
				case LOGOS_NEW:
				case LOGOS_SUBCLASS:
				case LOGOS_PROPERTY:
					{
					setState(350);
					logosxxTopLevel();
					}
					break;
				case AUTO:
				case CHAR:
				case CONST:
				case DOUBLE:
				case ENUM:
				case EXTERN:
				case FLOAT:
				case INLINE:
				case INT:
				case LONG:
				case REGISTER:
				case RESTRICT:
				case SHORT:
				case SIGNED:
				case STATIC:
				case STRUCT:
				case TYPEDEF:
				case UNION:
				case UNSIGNED:
				case VOID:
				case VOLATILE:
				case BOOL:
				case Class:
				case BYCOPY:
				case BYREF:
				case ID:
				case IMP:
				case IN:
				case INOUT:
				case ONEWAY:
				case OUT:
				case PROTOCOL_:
				case SEL:
				case SELF:
				case SUPER:
				case CLASS:
				case IMPLEMENTATION:
				case INTERFACE:
				case IMPORT:
				case PROTOCOL:
				case ATOMIC:
				case NONATOMIC:
				case RETAIN:
				case ATTRIBUTE:
				case AUTORELEASING_QUALIFIER:
				case BLOCK:
				case BRIDGE:
				case BRIDGE_RETAINED:
				case BRIDGE_TRANSFER:
				case COVARIANT:
				case CONTRAVARIANT:
				case DEPRECATED:
				case KINDOF:
				case STRONG_QUALIFIER:
				case TYPEOF:
				case UNSAFE_UNRETAINED_QUALIFIER:
				case UNUSED:
				case WEAK_QUALIFIER:
				case NULL_UNSPECIFIED:
				case NULLABLE:
				case NONNULL:
				case NULL_RESETTABLE:
				case NS_INLINE:
				case NS_ENUM:
				case NS_OPTIONS:
				case ASSIGN:
				case COPY:
				case GETTER:
				case SETTER:
				case STRONG:
				case READONLY:
				case READWRITE:
				case WEAK:
				case UNSAFE_UNRETAINED:
				case IB_OUTLET:
				case IB_OUTLET_COLLECTION:
				case IB_INSPECTABLE:
				case IB_DESIGNABLE:
				case IDENTIFIER:
					{
					setState(351);
					topLevelDeclaration();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(356);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(357);
			match(EOF);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class LogosxxTopLevelContext extends ParserRuleContext {
		public ConfigContext config() {
			return getRuleContext(ConfigContext.class,0);
		}
		public HookfContext hookf() {
			return getRuleContext(HookfContext.class,0);
		}
		public HookswiftfContext hookswiftf() {
			return getRuleContext(HookswiftfContext.class,0);
		}
		public CtorContext ctor() {
			return getRuleContext(CtorContext.class,0);
		}
		public DtorContext dtor() {
			return getRuleContext(DtorContext.class,0);
		}
		public LogosxxBlockLevelContext logosxxBlockLevel() {
			return getRuleContext(LogosxxBlockLevelContext.class,0);
		}
		public LogosxxTopLevelContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_logosxxTopLevel; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LogosXXParserListener ) ((LogosXXParserListener)listener).enterLogosxxTopLevel(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LogosXXParserListener ) ((LogosXXParserListener)listener).exitLogosxxTopLevel(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LogosXXParserVisitor ) return ((LogosXXParserVisitor<? extends T>)visitor).visitLogosxxTopLevel(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LogosxxTopLevelContext logosxxTopLevel() throws RecognitionException {
		LogosxxTopLevelContext _localctx = new LogosxxTopLevelContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_logosxxTopLevel);
		try {
			setState(365);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LOGOS_CONFIG:
				enterOuterAlt(_localctx, 1);
				{
				setState(359);
				config();
				}
				break;
			case LOGOS_HOOKF:
				enterOuterAlt(_localctx, 2);
				{
				setState(360);
				hookf();
				}
				break;
			case LOGOS_HOOKSWIFTF:
				enterOuterAlt(_localctx, 3);
				{
				setState(361);
				hookswiftf();
				}
				break;
			case LOGOS_CTOR:
				enterOuterAlt(_localctx, 4);
				{
				setState(362);
				ctor();
				}
				break;
			case LOGOS_DTOR:
				enterOuterAlt(_localctx, 5);
				{
				setState(363);
				dtor();
				}
				break;
			case LOGOS_GROUP:
			case LOGOS_HOOK:
			case LOGOS_HOOKSWIFT:
			case LOGOS_NEW:
			case LOGOS_SUBCLASS:
			case LOGOS_PROPERTY:
				enterOuterAlt(_localctx, 6);
				{
				setState(364);
				logosxxBlockLevel();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ConfigContext extends ParserRuleContext {
		public TerminalNode LOGOS_CONFIG() { return getToken(LogosXXParser.LOGOS_CONFIG, 0); }
		public TerminalNode SEMI() { return getToken(LogosXXParser.SEMI, 0); }
		public TerminalNode LP() { return getToken(LogosXXParser.LP, 0); }
		public TerminalNode RP() { return getToken(LogosXXParser.RP, 0); }
		public List<TerminalNode> IDENTIFIER() { return getTokens(LogosXXParser.IDENTIFIER); }
		public TerminalNode IDENTIFIER(int i) {
			return getToken(LogosXXParser.IDENTIFIER, i);
		}
		public List<TerminalNode> ASSIGNMENT() { return getTokens(LogosXXParser.ASSIGNMENT); }
		public TerminalNode ASSIGNMENT(int i) {
			return getToken(LogosXXParser.ASSIGNMENT, i);
		}
		public List<TerminalNode> DECIMAL_LITERAL() { return getTokens(LogosXXParser.DECIMAL_LITERAL); }
		public TerminalNode DECIMAL_LITERAL(int i) {
			return getToken(LogosXXParser.DECIMAL_LITERAL, i);
		}
		public ConfigContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_config; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LogosXXParserListener ) ((LogosXXParserListener)listener).enterConfig(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LogosXXParserListener ) ((LogosXXParserListener)listener).exitConfig(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LogosXXParserVisitor ) return ((LogosXXParserVisitor<? extends T>)visitor).visitConfig(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConfigContext config() throws RecognitionException {
		ConfigContext _localctx = new ConfigContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_config);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(367);
			match(LOGOS_CONFIG);
			{
			setState(368);
			match(LP);
			setState(374);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==IDENTIFIER) {
				{
				{
				setState(369);
				match(IDENTIFIER);
				setState(370);
				match(ASSIGNMENT);
				setState(371);
				_la = _input.LA(1);
				if ( !(_la==IDENTIFIER || _la==DECIMAL_LITERAL) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				}
				setState(376);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(377);
			match(RP);
			}
			setState(379);
			match(SEMI);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class HookfContext extends ParserRuleContext {
		public TerminalNode LOGOS_HOOKF() { return getToken(LogosXXParser.LOGOS_HOOKF, 0); }
		public LogosFusedCompoundStatementContext logosFusedCompoundStatement() {
			return getRuleContext(LogosFusedCompoundStatementContext.class,0);
		}
		public TerminalNode LP() { return getToken(LogosXXParser.LP, 0); }
		public TypeNameContext typeName() {
			return getRuleContext(TypeNameContext.class,0);
		}
		public List<TerminalNode> COMMA() { return getTokens(LogosXXParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(LogosXXParser.COMMA, i);
		}
		public TerminalNode RP() { return getToken(LogosXXParser.RP, 0); }
		public MethodSelectorContext methodSelector() {
			return getRuleContext(MethodSelectorContext.class,0);
		}
		public StringLiteralContext stringLiteral() {
			return getRuleContext(StringLiteralContext.class,0);
		}
		public ParameterListContext parameterList() {
			return getRuleContext(ParameterListContext.class,0);
		}
		public HookfContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_hookf; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LogosXXParserListener ) ((LogosXXParserListener)listener).enterHookf(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LogosXXParserListener ) ((LogosXXParserListener)listener).exitHookf(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LogosXXParserVisitor ) return ((LogosXXParserVisitor<? extends T>)visitor).visitHookf(this);
			else return visitor.visitChildren(this);
		}
	}

	public final HookfContext hookf() throws RecognitionException {
		HookfContext _localctx = new HookfContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_hookf);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(381);
			match(LOGOS_HOOKF);
			{
			setState(382);
			match(LP);
			setState(383);
			typeName();
			setState(384);
			match(COMMA);
			setState(387);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case RETURN:
			case BOOL:
			case Class:
			case BYCOPY:
			case BYREF:
			case ID:
			case IMP:
			case IN:
			case INOUT:
			case ONEWAY:
			case OUT:
			case PROTOCOL_:
			case SEL:
			case SELF:
			case SUPER:
			case ATOMIC:
			case NONATOMIC:
			case RETAIN:
			case AUTORELEASING_QUALIFIER:
			case BLOCK:
			case BRIDGE_RETAINED:
			case BRIDGE_TRANSFER:
			case COVARIANT:
			case CONTRAVARIANT:
			case DEPRECATED:
			case KINDOF:
			case UNUSED:
			case NULL_UNSPECIFIED:
			case NULLABLE:
			case NONNULL:
			case NULL_RESETTABLE:
			case NS_INLINE:
			case NS_ENUM:
			case NS_OPTIONS:
			case ASSIGN:
			case COPY:
			case GETTER:
			case SETTER:
			case STRONG:
			case READONLY:
			case READWRITE:
			case WEAK:
			case UNSAFE_UNRETAINED:
			case IB_OUTLET:
			case IB_OUTLET_COLLECTION:
			case IB_INSPECTABLE:
			case IB_DESIGNABLE:
			case IDENTIFIER:
			case COLON:
				{
				setState(385);
				methodSelector();
				}
				break;
			case STRING_START:
				{
				setState(386);
				stringLiteral();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(389);
			match(COMMA);
			setState(391);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 18)) & ~0x3f) == 0 && ((1L << (_la - 18)) & ((1L << (AUTO - 18)) | (1L << (CHAR - 18)) | (1L << (CONST - 18)) | (1L << (DOUBLE - 18)) | (1L << (ENUM - 18)) | (1L << (EXTERN - 18)) | (1L << (FLOAT - 18)) | (1L << (INLINE - 18)) | (1L << (INT - 18)) | (1L << (LONG - 18)) | (1L << (REGISTER - 18)) | (1L << (RESTRICT - 18)) | (1L << (SHORT - 18)) | (1L << (SIGNED - 18)) | (1L << (STATIC - 18)) | (1L << (STRUCT - 18)) | (1L << (UNION - 18)) | (1L << (UNSIGNED - 18)) | (1L << (VOID - 18)) | (1L << (VOLATILE - 18)) | (1L << (BOOL - 18)) | (1L << (Class - 18)) | (1L << (BYCOPY - 18)) | (1L << (BYREF - 18)) | (1L << (ID - 18)) | (1L << (IMP - 18)) | (1L << (IN - 18)) | (1L << (INOUT - 18)) | (1L << (ONEWAY - 18)) | (1L << (OUT - 18)) | (1L << (PROTOCOL_ - 18)) | (1L << (SEL - 18)) | (1L << (SELF - 18)) | (1L << (SUPER - 18)))) != 0) || ((((_la - 98)) & ~0x3f) == 0 && ((1L << (_la - 98)) & ((1L << (ATOMIC - 98)) | (1L << (NONATOMIC - 98)) | (1L << (RETAIN - 98)) | (1L << (ATTRIBUTE - 98)) | (1L << (AUTORELEASING_QUALIFIER - 98)) | (1L << (BLOCK - 98)) | (1L << (BRIDGE - 98)) | (1L << (BRIDGE_RETAINED - 98)) | (1L << (BRIDGE_TRANSFER - 98)) | (1L << (COVARIANT - 98)) | (1L << (CONTRAVARIANT - 98)) | (1L << (DEPRECATED - 98)) | (1L << (KINDOF - 98)) | (1L << (STRONG_QUALIFIER - 98)) | (1L << (TYPEOF - 98)) | (1L << (UNSAFE_UNRETAINED_QUALIFIER - 98)) | (1L << (UNUSED - 98)) | (1L << (WEAK_QUALIFIER - 98)) | (1L << (NULL_UNSPECIFIED - 98)) | (1L << (NULLABLE - 98)) | (1L << (NONNULL - 98)) | (1L << (NULL_RESETTABLE - 98)) | (1L << (NS_INLINE - 98)) | (1L << (NS_ENUM - 98)) | (1L << (NS_OPTIONS - 98)) | (1L << (ASSIGN - 98)) | (1L << (COPY - 98)) | (1L << (GETTER - 98)) | (1L << (SETTER - 98)) | (1L << (STRONG - 98)) | (1L << (READONLY - 98)) | (1L << (READWRITE - 98)) | (1L << (WEAK - 98)) | (1L << (UNSAFE_UNRETAINED - 98)) | (1L << (IB_OUTLET - 98)) | (1L << (IB_OUTLET_COLLECTION - 98)) | (1L << (IB_INSPECTABLE - 98)) | (1L << (IB_DESIGNABLE - 98)) | (1L << (IDENTIFIER - 98)))) != 0)) {
				{
				setState(390);
				parameterList();
				}
			}

			setState(393);
			match(RP);
			}
			setState(395);
			logosFusedCompoundStatement();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class HookswiftfContext extends ParserRuleContext {
		public TerminalNode LOGOS_HOOKSWIFTF() { return getToken(LogosXXParser.LOGOS_HOOKSWIFTF, 0); }
		public LogosFusedCompoundStatementContext logosFusedCompoundStatement() {
			return getRuleContext(LogosFusedCompoundStatementContext.class,0);
		}
		public TerminalNode LP() { return getToken(LogosXXParser.LP, 0); }
		public List<StringLiteralContext> stringLiteral() {
			return getRuleContexts(StringLiteralContext.class);
		}
		public StringLiteralContext stringLiteral(int i) {
			return getRuleContext(StringLiteralContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(LogosXXParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(LogosXXParser.COMMA, i);
		}
		public TypeNameContext typeName() {
			return getRuleContext(TypeNameContext.class,0);
		}
		public TerminalNode RP() { return getToken(LogosXXParser.RP, 0); }
		public MethodSelectorContext methodSelector() {
			return getRuleContext(MethodSelectorContext.class,0);
		}
		public ParameterListContext parameterList() {
			return getRuleContext(ParameterListContext.class,0);
		}
		public HookswiftfContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_hookswiftf; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LogosXXParserListener ) ((LogosXXParserListener)listener).enterHookswiftf(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LogosXXParserListener ) ((LogosXXParserListener)listener).exitHookswiftf(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LogosXXParserVisitor ) return ((LogosXXParserVisitor<? extends T>)visitor).visitHookswiftf(this);
			else return visitor.visitChildren(this);
		}
	}

	public final HookswiftfContext hookswiftf() throws RecognitionException {
		HookswiftfContext _localctx = new HookswiftfContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_hookswiftf);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(397);
			match(LOGOS_HOOKSWIFTF);
			{
			setState(398);
			match(LP);
			setState(399);
			stringLiteral();
			setState(400);
			match(COMMA);
			setState(401);
			typeName();
			setState(402);
			match(COMMA);
			setState(405);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case RETURN:
			case BOOL:
			case Class:
			case BYCOPY:
			case BYREF:
			case ID:
			case IMP:
			case IN:
			case INOUT:
			case ONEWAY:
			case OUT:
			case PROTOCOL_:
			case SEL:
			case SELF:
			case SUPER:
			case ATOMIC:
			case NONATOMIC:
			case RETAIN:
			case AUTORELEASING_QUALIFIER:
			case BLOCK:
			case BRIDGE_RETAINED:
			case BRIDGE_TRANSFER:
			case COVARIANT:
			case CONTRAVARIANT:
			case DEPRECATED:
			case KINDOF:
			case UNUSED:
			case NULL_UNSPECIFIED:
			case NULLABLE:
			case NONNULL:
			case NULL_RESETTABLE:
			case NS_INLINE:
			case NS_ENUM:
			case NS_OPTIONS:
			case ASSIGN:
			case COPY:
			case GETTER:
			case SETTER:
			case STRONG:
			case READONLY:
			case READWRITE:
			case WEAK:
			case UNSAFE_UNRETAINED:
			case IB_OUTLET:
			case IB_OUTLET_COLLECTION:
			case IB_INSPECTABLE:
			case IB_DESIGNABLE:
			case IDENTIFIER:
			case COLON:
				{
				setState(403);
				methodSelector();
				}
				break;
			case STRING_START:
				{
				setState(404);
				stringLiteral();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(407);
			match(COMMA);
			setState(409);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 18)) & ~0x3f) == 0 && ((1L << (_la - 18)) & ((1L << (AUTO - 18)) | (1L << (CHAR - 18)) | (1L << (CONST - 18)) | (1L << (DOUBLE - 18)) | (1L << (ENUM - 18)) | (1L << (EXTERN - 18)) | (1L << (FLOAT - 18)) | (1L << (INLINE - 18)) | (1L << (INT - 18)) | (1L << (LONG - 18)) | (1L << (REGISTER - 18)) | (1L << (RESTRICT - 18)) | (1L << (SHORT - 18)) | (1L << (SIGNED - 18)) | (1L << (STATIC - 18)) | (1L << (STRUCT - 18)) | (1L << (UNION - 18)) | (1L << (UNSIGNED - 18)) | (1L << (VOID - 18)) | (1L << (VOLATILE - 18)) | (1L << (BOOL - 18)) | (1L << (Class - 18)) | (1L << (BYCOPY - 18)) | (1L << (BYREF - 18)) | (1L << (ID - 18)) | (1L << (IMP - 18)) | (1L << (IN - 18)) | (1L << (INOUT - 18)) | (1L << (ONEWAY - 18)) | (1L << (OUT - 18)) | (1L << (PROTOCOL_ - 18)) | (1L << (SEL - 18)) | (1L << (SELF - 18)) | (1L << (SUPER - 18)))) != 0) || ((((_la - 98)) & ~0x3f) == 0 && ((1L << (_la - 98)) & ((1L << (ATOMIC - 98)) | (1L << (NONATOMIC - 98)) | (1L << (RETAIN - 98)) | (1L << (ATTRIBUTE - 98)) | (1L << (AUTORELEASING_QUALIFIER - 98)) | (1L << (BLOCK - 98)) | (1L << (BRIDGE - 98)) | (1L << (BRIDGE_RETAINED - 98)) | (1L << (BRIDGE_TRANSFER - 98)) | (1L << (COVARIANT - 98)) | (1L << (CONTRAVARIANT - 98)) | (1L << (DEPRECATED - 98)) | (1L << (KINDOF - 98)) | (1L << (STRONG_QUALIFIER - 98)) | (1L << (TYPEOF - 98)) | (1L << (UNSAFE_UNRETAINED_QUALIFIER - 98)) | (1L << (UNUSED - 98)) | (1L << (WEAK_QUALIFIER - 98)) | (1L << (NULL_UNSPECIFIED - 98)) | (1L << (NULLABLE - 98)) | (1L << (NONNULL - 98)) | (1L << (NULL_RESETTABLE - 98)) | (1L << (NS_INLINE - 98)) | (1L << (NS_ENUM - 98)) | (1L << (NS_OPTIONS - 98)) | (1L << (ASSIGN - 98)) | (1L << (COPY - 98)) | (1L << (GETTER - 98)) | (1L << (SETTER - 98)) | (1L << (STRONG - 98)) | (1L << (READONLY - 98)) | (1L << (READWRITE - 98)) | (1L << (WEAK - 98)) | (1L << (UNSAFE_UNRETAINED - 98)) | (1L << (IB_OUTLET - 98)) | (1L << (IB_OUTLET_COLLECTION - 98)) | (1L << (IB_INSPECTABLE - 98)) | (1L << (IB_DESIGNABLE - 98)) | (1L << (IDENTIFIER - 98)))) != 0)) {
				{
				setState(408);
				parameterList();
				}
			}

			setState(411);
			match(RP);
			}
			setState(413);
			logosFusedCompoundStatement();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CtorContext extends ParserRuleContext {
		public TerminalNode LOGOS_CTOR() { return getToken(LogosXXParser.LOGOS_CTOR, 0); }
		public LogosFusedCompoundStatementContext logosFusedCompoundStatement() {
			return getRuleContext(LogosFusedCompoundStatementContext.class,0);
		}
		public CtorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ctor; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LogosXXParserListener ) ((LogosXXParserListener)listener).enterCtor(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LogosXXParserListener ) ((LogosXXParserListener)listener).exitCtor(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LogosXXParserVisitor ) return ((LogosXXParserVisitor<? extends T>)visitor).visitCtor(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CtorContext ctor() throws RecognitionException {
		CtorContext _localctx = new CtorContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_ctor);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(415);
			match(LOGOS_CTOR);
			setState(416);
			logosFusedCompoundStatement();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DtorContext extends ParserRuleContext {
		public TerminalNode LOGOS_DTOR() { return getToken(LogosXXParser.LOGOS_DTOR, 0); }
		public LogosFusedCompoundStatementContext logosFusedCompoundStatement() {
			return getRuleContext(LogosFusedCompoundStatementContext.class,0);
		}
		public DtorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dtor; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LogosXXParserListener ) ((LogosXXParserListener)listener).enterDtor(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LogosXXParserListener ) ((LogosXXParserListener)listener).exitDtor(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LogosXXParserVisitor ) return ((LogosXXParserVisitor<? extends T>)visitor).visitDtor(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DtorContext dtor() throws RecognitionException {
		DtorContext _localctx = new DtorContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_dtor);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(418);
			match(LOGOS_DTOR);
			setState(419);
			logosFusedCompoundStatement();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class LogosxxBlockLevelContext extends ParserRuleContext {
		public GroupContext group() {
			return getRuleContext(GroupContext.class,0);
		}
		public HookContext hook() {
			return getRuleContext(HookContext.class,0);
		}
		public HookswiftContext hookswift() {
			return getRuleContext(HookswiftContext.class,0);
		}
		public NewcontentContext newcontent() {
			return getRuleContext(NewcontentContext.class,0);
		}
		public SubclassContext subclass() {
			return getRuleContext(SubclassContext.class,0);
		}
		public PropertyContext property() {
			return getRuleContext(PropertyContext.class,0);
		}
		public LogosxxBlockLevelContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_logosxxBlockLevel; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LogosXXParserListener ) ((LogosXXParserListener)listener).enterLogosxxBlockLevel(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LogosXXParserListener ) ((LogosXXParserListener)listener).exitLogosxxBlockLevel(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LogosXXParserVisitor ) return ((LogosXXParserVisitor<? extends T>)visitor).visitLogosxxBlockLevel(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LogosxxBlockLevelContext logosxxBlockLevel() throws RecognitionException {
		LogosxxBlockLevelContext _localctx = new LogosxxBlockLevelContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_logosxxBlockLevel);
		try {
			setState(427);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LOGOS_GROUP:
				enterOuterAlt(_localctx, 1);
				{
				setState(421);
				group();
				}
				break;
			case LOGOS_HOOK:
				enterOuterAlt(_localctx, 2);
				{
				setState(422);
				hook();
				}
				break;
			case LOGOS_HOOKSWIFT:
				enterOuterAlt(_localctx, 3);
				{
				setState(423);
				hookswift();
				}
				break;
			case LOGOS_NEW:
				enterOuterAlt(_localctx, 4);
				{
				setState(424);
				newcontent();
				}
				break;
			case LOGOS_SUBCLASS:
				enterOuterAlt(_localctx, 5);
				{
				setState(425);
				subclass();
				}
				break;
			case LOGOS_PROPERTY:
				enterOuterAlt(_localctx, 6);
				{
				setState(426);
				property();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class GroupContext extends ParserRuleContext {
		public TerminalNode LOGOS_GROUP() { return getToken(LogosXXParser.LOGOS_GROUP, 0); }
		public TerminalNode IDENTIFIER() { return getToken(LogosXXParser.IDENTIFIER, 0); }
		public TerminalNode LOGOS_END() { return getToken(LogosXXParser.LOGOS_END, 0); }
		public List<GroupContentsContext> groupContents() {
			return getRuleContexts(GroupContentsContext.class);
		}
		public GroupContentsContext groupContents(int i) {
			return getRuleContext(GroupContentsContext.class,i);
		}
		public GroupContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_group; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LogosXXParserListener ) ((LogosXXParserListener)listener).enterGroup(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LogosXXParserListener ) ((LogosXXParserListener)listener).exitGroup(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LogosXXParserVisitor ) return ((LogosXXParserVisitor<? extends T>)visitor).visitGroup(this);
			else return visitor.visitChildren(this);
		}
	}

	public final GroupContext group() throws RecognitionException {
		GroupContext _localctx = new GroupContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_group);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(429);
			match(LOGOS_GROUP);
			setState(430);
			match(IDENTIFIER);
			setState(434);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << LOGOS_HOOK) | (1L << LOGOS_HOOKSWIFT) | (1L << LOGOS_NEW) | (1L << LOGOS_SUBCLASS) | (1L << LOGOS_PROPERTY))) != 0)) {
				{
				{
				setState(431);
				groupContents();
				}
				}
				setState(436);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(437);
			match(LOGOS_END);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class GroupContentsContext extends ParserRuleContext {
		public HookContext hook() {
			return getRuleContext(HookContext.class,0);
		}
		public HookswiftContext hookswift() {
			return getRuleContext(HookswiftContext.class,0);
		}
		public NewcontentContext newcontent() {
			return getRuleContext(NewcontentContext.class,0);
		}
		public SubclassContext subclass() {
			return getRuleContext(SubclassContext.class,0);
		}
		public PropertyContext property() {
			return getRuleContext(PropertyContext.class,0);
		}
		public GroupContentsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_groupContents; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LogosXXParserListener ) ((LogosXXParserListener)listener).enterGroupContents(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LogosXXParserListener ) ((LogosXXParserListener)listener).exitGroupContents(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LogosXXParserVisitor ) return ((LogosXXParserVisitor<? extends T>)visitor).visitGroupContents(this);
			else return visitor.visitChildren(this);
		}
	}

	public final GroupContentsContext groupContents() throws RecognitionException {
		GroupContentsContext _localctx = new GroupContentsContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_groupContents);
		try {
			setState(444);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LOGOS_HOOK:
				enterOuterAlt(_localctx, 1);
				{
				setState(439);
				hook();
				}
				break;
			case LOGOS_HOOKSWIFT:
				enterOuterAlt(_localctx, 2);
				{
				setState(440);
				hookswift();
				}
				break;
			case LOGOS_NEW:
				enterOuterAlt(_localctx, 3);
				{
				setState(441);
				newcontent();
				}
				break;
			case LOGOS_SUBCLASS:
				enterOuterAlt(_localctx, 4);
				{
				setState(442);
				subclass();
				}
				break;
			case LOGOS_PROPERTY:
				enterOuterAlt(_localctx, 5);
				{
				setState(443);
				property();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class HookContext extends ParserRuleContext {
		public TerminalNode LOGOS_HOOK() { return getToken(LogosXXParser.LOGOS_HOOK, 0); }
		public TerminalNode IDENTIFIER() { return getToken(LogosXXParser.IDENTIFIER, 0); }
		public TerminalNode LOGOS_END() { return getToken(LogosXXParser.LOGOS_END, 0); }
		public List<HookContentsContext> hookContents() {
			return getRuleContexts(HookContentsContext.class);
		}
		public HookContentsContext hookContents(int i) {
			return getRuleContext(HookContentsContext.class,i);
		}
		public HookContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_hook; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LogosXXParserListener ) ((LogosXXParserListener)listener).enterHook(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LogosXXParserListener ) ((LogosXXParserListener)listener).exitHook(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LogosXXParserVisitor ) return ((LogosXXParserVisitor<? extends T>)visitor).visitHook(this);
			else return visitor.visitChildren(this);
		}
	}

	public final HookContext hook() throws RecognitionException {
		HookContext _localctx = new HookContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_hook);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(446);
			match(LOGOS_HOOK);
			setState(447);
			match(IDENTIFIER);
			setState(451);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==ADD || _la==SUB) {
				{
				{
				setState(448);
				hookContents();
				}
				}
				setState(453);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(454);
			match(LOGOS_END);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class HookContentsContext extends ParserRuleContext {
		public LogosFusedClassMethodDefinitionContext logosFusedClassMethodDefinition() {
			return getRuleContext(LogosFusedClassMethodDefinitionContext.class,0);
		}
		public LogosFusedInstanceMethodDefinitionContext logosFusedInstanceMethodDefinition() {
			return getRuleContext(LogosFusedInstanceMethodDefinitionContext.class,0);
		}
		public HookContentsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_hookContents; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LogosXXParserListener ) ((LogosXXParserListener)listener).enterHookContents(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LogosXXParserListener ) ((LogosXXParserListener)listener).exitHookContents(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LogosXXParserVisitor ) return ((LogosXXParserVisitor<? extends T>)visitor).visitHookContents(this);
			else return visitor.visitChildren(this);
		}
	}

	public final HookContentsContext hookContents() throws RecognitionException {
		HookContentsContext _localctx = new HookContentsContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_hookContents);
		try {
			setState(458);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ADD:
				enterOuterAlt(_localctx, 1);
				{
				setState(456);
				logosFusedClassMethodDefinition();
				}
				break;
			case SUB:
				enterOuterAlt(_localctx, 2);
				{
				setState(457);
				logosFusedInstanceMethodDefinition();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class HookswiftContext extends ParserRuleContext {
		public TerminalNode LOGOS_HOOKSWIFT() { return getToken(LogosXXParser.LOGOS_HOOKSWIFT, 0); }
		public List<TerminalNode> IDENTIFIER() { return getTokens(LogosXXParser.IDENTIFIER); }
		public TerminalNode IDENTIFIER(int i) {
			return getToken(LogosXXParser.IDENTIFIER, i);
		}
		public TerminalNode DOT() { return getToken(LogosXXParser.DOT, 0); }
		public TerminalNode LOGOS_END() { return getToken(LogosXXParser.LOGOS_END, 0); }
		public List<HookContentsContext> hookContents() {
			return getRuleContexts(HookContentsContext.class);
		}
		public HookContentsContext hookContents(int i) {
			return getRuleContext(HookContentsContext.class,i);
		}
		public HookswiftContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_hookswift; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LogosXXParserListener ) ((LogosXXParserListener)listener).enterHookswift(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LogosXXParserListener ) ((LogosXXParserListener)listener).exitHookswift(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LogosXXParserVisitor ) return ((LogosXXParserVisitor<? extends T>)visitor).visitHookswift(this);
			else return visitor.visitChildren(this);
		}
	}

	public final HookswiftContext hookswift() throws RecognitionException {
		HookswiftContext _localctx = new HookswiftContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_hookswift);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(460);
			match(LOGOS_HOOKSWIFT);
			setState(461);
			match(IDENTIFIER);
			setState(462);
			match(DOT);
			setState(463);
			match(IDENTIFIER);
			setState(467);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==ADD || _la==SUB) {
				{
				{
				setState(464);
				hookContents();
				}
				}
				setState(469);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(470);
			match(LOGOS_END);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class NewcontentContext extends ParserRuleContext {
		public TerminalNode LOGOS_NEW() { return getToken(LogosXXParser.LOGOS_NEW, 0); }
		public LogosFusedInstanceMethodDefinitionContext logosFusedInstanceMethodDefinition() {
			return getRuleContext(LogosFusedInstanceMethodDefinitionContext.class,0);
		}
		public LogosFusedClassMethodDefinitionContext logosFusedClassMethodDefinition() {
			return getRuleContext(LogosFusedClassMethodDefinitionContext.class,0);
		}
		public NewcontentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_newcontent; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LogosXXParserListener ) ((LogosXXParserListener)listener).enterNewcontent(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LogosXXParserListener ) ((LogosXXParserListener)listener).exitNewcontent(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LogosXXParserVisitor ) return ((LogosXXParserVisitor<? extends T>)visitor).visitNewcontent(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NewcontentContext newcontent() throws RecognitionException {
		NewcontentContext _localctx = new NewcontentContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_newcontent);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(472);
			match(LOGOS_NEW);
			setState(475);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case SUB:
				{
				setState(473);
				logosFusedInstanceMethodDefinition();
				}
				break;
			case ADD:
				{
				setState(474);
				logosFusedClassMethodDefinition();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SubclassContext extends ParserRuleContext {
		public TerminalNode LOGOS_SUBCLASS() { return getToken(LogosXXParser.LOGOS_SUBCLASS, 0); }
		public List<TerminalNode> IDENTIFIER() { return getTokens(LogosXXParser.IDENTIFIER); }
		public TerminalNode IDENTIFIER(int i) {
			return getToken(LogosXXParser.IDENTIFIER, i);
		}
		public TerminalNode COLON() { return getToken(LogosXXParser.COLON, 0); }
		public TerminalNode LOGOS_END() { return getToken(LogosXXParser.LOGOS_END, 0); }
		public TerminalNode LT() { return getToken(LogosXXParser.LT, 0); }
		public ProtocolListContext protocolList() {
			return getRuleContext(ProtocolListContext.class,0);
		}
		public TerminalNode GT() { return getToken(LogosXXParser.GT, 0); }
		public List<PropertyContext> property() {
			return getRuleContexts(PropertyContext.class);
		}
		public PropertyContext property(int i) {
			return getRuleContext(PropertyContext.class,i);
		}
		public List<LogosFusedClassMethodDefinitionContext> logosFusedClassMethodDefinition() {
			return getRuleContexts(LogosFusedClassMethodDefinitionContext.class);
		}
		public LogosFusedClassMethodDefinitionContext logosFusedClassMethodDefinition(int i) {
			return getRuleContext(LogosFusedClassMethodDefinitionContext.class,i);
		}
		public List<LogosFusedInstanceMethodDefinitionContext> logosFusedInstanceMethodDefinition() {
			return getRuleContexts(LogosFusedInstanceMethodDefinitionContext.class);
		}
		public LogosFusedInstanceMethodDefinitionContext logosFusedInstanceMethodDefinition(int i) {
			return getRuleContext(LogosFusedInstanceMethodDefinitionContext.class,i);
		}
		public SubclassContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_subclass; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LogosXXParserListener ) ((LogosXXParserListener)listener).enterSubclass(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LogosXXParserListener ) ((LogosXXParserListener)listener).exitSubclass(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LogosXXParserVisitor ) return ((LogosXXParserVisitor<? extends T>)visitor).visitSubclass(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SubclassContext subclass() throws RecognitionException {
		SubclassContext _localctx = new SubclassContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_subclass);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(477);
			match(LOGOS_SUBCLASS);
			setState(478);
			match(IDENTIFIER);
			setState(479);
			match(COLON);
			setState(480);
			match(IDENTIFIER);
			setState(485);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LT) {
				{
				setState(481);
				match(LT);
				setState(482);
				protocolList();
				setState(483);
				match(GT);
				}
			}

			setState(492);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==LOGOS_PROPERTY || _la==ADD || _la==SUB) {
				{
				setState(490);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case LOGOS_PROPERTY:
					{
					setState(487);
					property();
					}
					break;
				case ADD:
					{
					setState(488);
					logosFusedClassMethodDefinition();
					}
					break;
				case SUB:
					{
					setState(489);
					logosFusedInstanceMethodDefinition();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(494);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(495);
			match(LOGOS_END);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PropertyContext extends ParserRuleContext {
		public TerminalNode LOGOS_PROPERTY() { return getToken(LogosXXParser.LOGOS_PROPERTY, 0); }
		public TypeNameContext typeName() {
			return getRuleContext(TypeNameContext.class,0);
		}
		public TerminalNode IDENTIFIER() { return getToken(LogosXXParser.IDENTIFIER, 0); }
		public TerminalNode LP() { return getToken(LogosXXParser.LP, 0); }
		public PropertyAttributesListContext propertyAttributesList() {
			return getRuleContext(PropertyAttributesListContext.class,0);
		}
		public TerminalNode RP() { return getToken(LogosXXParser.RP, 0); }
		public PropertyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_property; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LogosXXParserListener ) ((LogosXXParserListener)listener).enterProperty(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LogosXXParserListener ) ((LogosXXParserListener)listener).exitProperty(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LogosXXParserVisitor ) return ((LogosXXParserVisitor<? extends T>)visitor).visitProperty(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PropertyContext property() throws RecognitionException {
		PropertyContext _localctx = new PropertyContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_property);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(497);
			match(LOGOS_PROPERTY);
			setState(502);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LP) {
				{
				setState(498);
				match(LP);
				setState(499);
				propertyAttributesList();
				setState(500);
				match(RP);
				}
			}

			setState(504);
			typeName();
			setState(505);
			match(IDENTIFIER);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class LogosxxFunctionLevelContext extends ParserRuleContext {
		public InitContext init() {
			return getRuleContext(InitContext.class,0);
		}
		public ClassevalContext classeval() {
			return getRuleContext(ClassevalContext.class,0);
		}
		public CallswiftContext callswift() {
			return getRuleContext(CallswiftContext.class,0);
		}
		public OrigContext orig() {
			return getRuleContext(OrigContext.class,0);
		}
		public LogContext log() {
			return getRuleContext(LogContext.class,0);
		}
		public LogosxxFunctionLevelContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_logosxxFunctionLevel; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LogosXXParserListener ) ((LogosXXParserListener)listener).enterLogosxxFunctionLevel(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LogosXXParserListener ) ((LogosXXParserListener)listener).exitLogosxxFunctionLevel(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LogosXXParserVisitor ) return ((LogosXXParserVisitor<? extends T>)visitor).visitLogosxxFunctionLevel(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LogosxxFunctionLevelContext logosxxFunctionLevel() throws RecognitionException {
		LogosxxFunctionLevelContext _localctx = new LogosxxFunctionLevelContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_logosxxFunctionLevel);
		try {
			setState(512);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LOGOS_INIT:
				enterOuterAlt(_localctx, 1);
				{
				setState(507);
				init();
				}
				break;
			case LOGOS_CLASS:
				enterOuterAlt(_localctx, 2);
				{
				setState(508);
				classeval();
				}
				break;
			case LOGOS_CALLSWIFT:
				enterOuterAlt(_localctx, 3);
				{
				setState(509);
				callswift();
				}
				break;
			case LOGOS_ORIG:
				enterOuterAlt(_localctx, 4);
				{
				setState(510);
				orig();
				}
				break;
			case LOGOS_LOG:
				enterOuterAlt(_localctx, 5);
				{
				setState(511);
				log();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class InitContext extends ParserRuleContext {
		public TerminalNode LOGOS_INIT() { return getToken(LogosXXParser.LOGOS_INIT, 0); }
		public TerminalNode SEMI() { return getToken(LogosXXParser.SEMI, 0); }
		public InitexprContext initexpr() {
			return getRuleContext(InitexprContext.class,0);
		}
		public InitContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_init; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LogosXXParserListener ) ((LogosXXParserListener)listener).enterInit(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LogosXXParserListener ) ((LogosXXParserListener)listener).exitInit(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LogosXXParserVisitor ) return ((LogosXXParserVisitor<? extends T>)visitor).visitInit(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InitContext init() throws RecognitionException {
		InitContext _localctx = new InitContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_init);
		try {
			setState(520);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,20,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(514);
				match(LOGOS_INIT);
				setState(515);
				match(SEMI);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(516);
				match(LOGOS_INIT);
				setState(517);
				initexpr();
				setState(518);
				match(SEMI);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class InitexprContext extends ParserRuleContext {
		public TerminalNode LP() { return getToken(LogosXXParser.LP, 0); }
		public TypeNameContext typeName() {
			return getRuleContext(TypeNameContext.class,0);
		}
		public TerminalNode ASSIGNMENT() { return getToken(LogosXXParser.ASSIGNMENT, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode RP() { return getToken(LogosXXParser.RP, 0); }
		public List<TerminalNode> COMMA() { return getTokens(LogosXXParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(LogosXXParser.COMMA, i);
		}
		public List<InitexprContext> initexpr() {
			return getRuleContexts(InitexprContext.class);
		}
		public InitexprContext initexpr(int i) {
			return getRuleContext(InitexprContext.class,i);
		}
		public InitexprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_initexpr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LogosXXParserListener ) ((LogosXXParserListener)listener).enterInitexpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LogosXXParserListener ) ((LogosXXParserListener)listener).exitInitexpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LogosXXParserVisitor ) return ((LogosXXParserVisitor<? extends T>)visitor).visitInitexpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InitexprContext initexpr() throws RecognitionException {
		InitexprContext _localctx = new InitexprContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_initexpr);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(522);
			match(LP);
			setState(523);
			typeName();
			setState(524);
			match(ASSIGNMENT);
			setState(525);
			expression(0);
			setState(530);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(526);
				match(COMMA);
				setState(527);
				initexpr();
				}
				}
				setState(532);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(533);
			match(RP);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ClassevalContext extends ParserRuleContext {
		public TerminalNode LOGOS_CLASS() { return getToken(LogosXXParser.LOGOS_CLASS, 0); }
		public TerminalNode LP() { return getToken(LogosXXParser.LP, 0); }
		public TerminalNode IDENTIFIER() { return getToken(LogosXXParser.IDENTIFIER, 0); }
		public TerminalNode RP() { return getToken(LogosXXParser.RP, 0); }
		public TerminalNode ADD() { return getToken(LogosXXParser.ADD, 0); }
		public TerminalNode SUB() { return getToken(LogosXXParser.SUB, 0); }
		public ClassevalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classeval; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LogosXXParserListener ) ((LogosXXParserListener)listener).enterClasseval(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LogosXXParserListener ) ((LogosXXParserListener)listener).exitClasseval(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LogosXXParserVisitor ) return ((LogosXXParserVisitor<? extends T>)visitor).visitClasseval(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ClassevalContext classeval() throws RecognitionException {
		ClassevalContext _localctx = new ClassevalContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_classeval);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(535);
			match(LOGOS_CLASS);
			setState(536);
			match(LP);
			setState(538);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ADD || _la==SUB) {
				{
				setState(537);
				_la = _input.LA(1);
				if ( !(_la==ADD || _la==SUB) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
			}

			setState(540);
			match(IDENTIFIER);
			setState(541);
			match(RP);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CallswiftContext extends ParserRuleContext {
		public TerminalNode LOGOS_CALLSWIFT() { return getToken(LogosXXParser.LOGOS_CALLSWIFT, 0); }
		public List<TerminalNode> LP() { return getTokens(LogosXXParser.LP); }
		public TerminalNode LP(int i) {
			return getToken(LogosXXParser.LP, i);
		}
		public TypeNameContext typeName() {
			return getRuleContext(TypeNameContext.class,0);
		}
		public List<TerminalNode> COMMA() { return getTokens(LogosXXParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(LogosXXParser.COMMA, i);
		}
		public StringLiteralContext stringLiteral() {
			return getRuleContext(StringLiteralContext.class,0);
		}
		public List<TerminalNode> RP() { return getTokens(LogosXXParser.RP); }
		public TerminalNode RP(int i) {
			return getToken(LogosXXParser.RP, i);
		}
		public TerminalNode SEMI() { return getToken(LogosXXParser.SEMI, 0); }
		public TypeListContext typeList() {
			return getRuleContext(TypeListContext.class,0);
		}
		public ArgumentExpressionListContext argumentExpressionList() {
			return getRuleContext(ArgumentExpressionListContext.class,0);
		}
		public CallswiftContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_callswift; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LogosXXParserListener ) ((LogosXXParserListener)listener).enterCallswift(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LogosXXParserListener ) ((LogosXXParserListener)listener).exitCallswift(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LogosXXParserVisitor ) return ((LogosXXParserVisitor<? extends T>)visitor).visitCallswift(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CallswiftContext callswift() throws RecognitionException {
		CallswiftContext _localctx = new CallswiftContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_callswift);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(543);
			match(LOGOS_CALLSWIFT);
			setState(544);
			match(LP);
			setState(545);
			typeName();
			setState(546);
			match(COMMA);
			setState(547);
			stringLiteral();
			setState(548);
			match(COMMA);
			{
			setState(549);
			match(LP);
			setState(551);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 21)) & ~0x3f) == 0 && ((1L << (_la - 21)) & ((1L << (CHAR - 21)) | (1L << (CONST - 21)) | (1L << (DOUBLE - 21)) | (1L << (ENUM - 21)) | (1L << (FLOAT - 21)) | (1L << (INLINE - 21)) | (1L << (INT - 21)) | (1L << (LONG - 21)) | (1L << (RESTRICT - 21)) | (1L << (SHORT - 21)) | (1L << (SIGNED - 21)) | (1L << (STRUCT - 21)) | (1L << (UNION - 21)) | (1L << (UNSIGNED - 21)) | (1L << (VOID - 21)) | (1L << (VOLATILE - 21)) | (1L << (BOOL - 21)) | (1L << (Class - 21)) | (1L << (BYCOPY - 21)) | (1L << (BYREF - 21)) | (1L << (ID - 21)) | (1L << (IMP - 21)) | (1L << (IN - 21)) | (1L << (INOUT - 21)) | (1L << (ONEWAY - 21)) | (1L << (OUT - 21)) | (1L << (PROTOCOL_ - 21)) | (1L << (SEL - 21)) | (1L << (SELF - 21)) | (1L << (SUPER - 21)))) != 0) || ((((_la - 98)) & ~0x3f) == 0 && ((1L << (_la - 98)) & ((1L << (ATOMIC - 98)) | (1L << (NONATOMIC - 98)) | (1L << (RETAIN - 98)) | (1L << (AUTORELEASING_QUALIFIER - 98)) | (1L << (BLOCK - 98)) | (1L << (BRIDGE - 98)) | (1L << (BRIDGE_RETAINED - 98)) | (1L << (BRIDGE_TRANSFER - 98)) | (1L << (COVARIANT - 98)) | (1L << (CONTRAVARIANT - 98)) | (1L << (DEPRECATED - 98)) | (1L << (KINDOF - 98)) | (1L << (STRONG_QUALIFIER - 98)) | (1L << (TYPEOF - 98)) | (1L << (UNSAFE_UNRETAINED_QUALIFIER - 98)) | (1L << (UNUSED - 98)) | (1L << (WEAK_QUALIFIER - 98)) | (1L << (NULL_UNSPECIFIED - 98)) | (1L << (NULLABLE - 98)) | (1L << (NONNULL - 98)) | (1L << (NULL_RESETTABLE - 98)) | (1L << (NS_INLINE - 98)) | (1L << (NS_ENUM - 98)) | (1L << (NS_OPTIONS - 98)) | (1L << (ASSIGN - 98)) | (1L << (COPY - 98)) | (1L << (GETTER - 98)) | (1L << (SETTER - 98)) | (1L << (STRONG - 98)) | (1L << (READONLY - 98)) | (1L << (READWRITE - 98)) | (1L << (WEAK - 98)) | (1L << (UNSAFE_UNRETAINED - 98)) | (1L << (IB_OUTLET - 98)) | (1L << (IB_OUTLET_COLLECTION - 98)) | (1L << (IB_INSPECTABLE - 98)) | (1L << (IB_DESIGNABLE - 98)) | (1L << (IDENTIFIER - 98)))) != 0)) {
				{
				setState(550);
				typeList();
				}
			}

			setState(553);
			match(RP);
			}
			setState(555);
			match(COMMA);
			{
			setState(556);
			match(LP);
			setState(558);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 21)) & ~0x3f) == 0 && ((1L << (_la - 21)) & ((1L << (CHAR - 21)) | (1L << (DOUBLE - 21)) | (1L << (ENUM - 21)) | (1L << (FLOAT - 21)) | (1L << (INT - 21)) | (1L << (LONG - 21)) | (1L << (SHORT - 21)) | (1L << (SIGNED - 21)) | (1L << (SIZEOF - 21)) | (1L << (STRUCT - 21)) | (1L << (UNION - 21)) | (1L << (UNSIGNED - 21)) | (1L << (VOID - 21)) | (1L << (TRUE - 21)) | (1L << (FALSE - 21)) | (1L << (BOOL - 21)) | (1L << (Class - 21)) | (1L << (BYCOPY - 21)) | (1L << (BYREF - 21)) | (1L << (ID - 21)) | (1L << (IMP - 21)) | (1L << (IN - 21)) | (1L << (INOUT - 21)) | (1L << (NIL - 21)) | (1L << (NO - 21)) | (1L << (NULL - 21)) | (1L << (ONEWAY - 21)) | (1L << (OUT - 21)) | (1L << (PROTOCOL_ - 21)) | (1L << (SEL - 21)) | (1L << (SELF - 21)) | (1L << (SUPER - 21)) | (1L << (YES - 21)) | (1L << (ENCODE - 21)))) != 0) || ((((_la - 86)) & ~0x3f) == 0 && ((1L << (_la - 86)) & ((1L << (PROTOCOL - 86)) | (1L << (SELECTOR - 86)) | (1L << (ATOMIC - 86)) | (1L << (NONATOMIC - 86)) | (1L << (RETAIN - 86)) | (1L << (AUTORELEASING_QUALIFIER - 86)) | (1L << (BLOCK - 86)) | (1L << (BRIDGE_RETAINED - 86)) | (1L << (BRIDGE_TRANSFER - 86)) | (1L << (COVARIANT - 86)) | (1L << (CONTRAVARIANT - 86)) | (1L << (DEPRECATED - 86)) | (1L << (KINDOF - 86)) | (1L << (TYPEOF - 86)) | (1L << (UNUSED - 86)) | (1L << (NULL_UNSPECIFIED - 86)) | (1L << (NULLABLE - 86)) | (1L << (NONNULL - 86)) | (1L << (NULL_RESETTABLE - 86)) | (1L << (NS_INLINE - 86)) | (1L << (NS_ENUM - 86)) | (1L << (NS_OPTIONS - 86)) | (1L << (ASSIGN - 86)) | (1L << (COPY - 86)) | (1L << (GETTER - 86)) | (1L << (SETTER - 86)) | (1L << (STRONG - 86)) | (1L << (READONLY - 86)) | (1L << (READWRITE - 86)) | (1L << (WEAK - 86)) | (1L << (UNSAFE_UNRETAINED - 86)) | (1L << (IB_OUTLET - 86)) | (1L << (IB_OUTLET_COLLECTION - 86)) | (1L << (IB_INSPECTABLE - 86)) | (1L << (IB_DESIGNABLE - 86)) | (1L << (IDENTIFIER - 86)) | (1L << (LP - 86)) | (1L << (LBRACK - 86)))) != 0) || ((((_la - 153)) & ~0x3f) == 0 && ((1L << (_la - 153)) & ((1L << (AT - 153)) | (1L << (BANG - 153)) | (1L << (TILDE - 153)) | (1L << (INC - 153)) | (1L << (DEC - 153)) | (1L << (ADD - 153)) | (1L << (SUB - 153)) | (1L << (MUL - 153)) | (1L << (BITAND - 153)) | (1L << (BITXOR - 153)) | (1L << (CHARACTER_LITERAL - 153)) | (1L << (STRING_START - 153)) | (1L << (HEX_LITERAL - 153)) | (1L << (OCTAL_LITERAL - 153)) | (1L << (BINARY_LITERAL - 153)) | (1L << (DECIMAL_LITERAL - 153)) | (1L << (FLOATING_POINT_LITERAL - 153)))) != 0)) {
				{
				setState(557);
				argumentExpressionList();
				}
			}

			setState(560);
			match(RP);
			}
			setState(562);
			match(RP);
			setState(563);
			match(SEMI);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TypeListContext extends ParserRuleContext {
		public List<TypeNameContext> typeName() {
			return getRuleContexts(TypeNameContext.class);
		}
		public TypeNameContext typeName(int i) {
			return getRuleContext(TypeNameContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(LogosXXParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(LogosXXParser.COMMA, i);
		}
		public TypeListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LogosXXParserListener ) ((LogosXXParserListener)listener).enterTypeList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LogosXXParserListener ) ((LogosXXParserListener)listener).exitTypeList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LogosXXParserVisitor ) return ((LogosXXParserVisitor<? extends T>)visitor).visitTypeList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeListContext typeList() throws RecognitionException {
		TypeListContext _localctx = new TypeListContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_typeList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(565);
			typeName();
			setState(570);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(566);
				match(COMMA);
				setState(567);
				typeName();
				}
				}
				setState(572);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class OrigContext extends ParserRuleContext {
		public TerminalNode LOGOS_ORIG() { return getToken(LogosXXParser.LOGOS_ORIG, 0); }
		public TerminalNode LP() { return getToken(LogosXXParser.LP, 0); }
		public TerminalNode RP() { return getToken(LogosXXParser.RP, 0); }
		public ParameterListContext parameterList() {
			return getRuleContext(ParameterListContext.class,0);
		}
		public OrigContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_orig; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LogosXXParserListener ) ((LogosXXParserListener)listener).enterOrig(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LogosXXParserListener ) ((LogosXXParserListener)listener).exitOrig(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LogosXXParserVisitor ) return ((LogosXXParserVisitor<? extends T>)visitor).visitOrig(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OrigContext orig() throws RecognitionException {
		OrigContext _localctx = new OrigContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_orig);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(573);
			match(LOGOS_ORIG);
			setState(579);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,27,_ctx) ) {
			case 1:
				{
				{
				setState(574);
				match(LP);
				setState(576);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (((((_la - 18)) & ~0x3f) == 0 && ((1L << (_la - 18)) & ((1L << (AUTO - 18)) | (1L << (CHAR - 18)) | (1L << (CONST - 18)) | (1L << (DOUBLE - 18)) | (1L << (ENUM - 18)) | (1L << (EXTERN - 18)) | (1L << (FLOAT - 18)) | (1L << (INLINE - 18)) | (1L << (INT - 18)) | (1L << (LONG - 18)) | (1L << (REGISTER - 18)) | (1L << (RESTRICT - 18)) | (1L << (SHORT - 18)) | (1L << (SIGNED - 18)) | (1L << (STATIC - 18)) | (1L << (STRUCT - 18)) | (1L << (UNION - 18)) | (1L << (UNSIGNED - 18)) | (1L << (VOID - 18)) | (1L << (VOLATILE - 18)) | (1L << (BOOL - 18)) | (1L << (Class - 18)) | (1L << (BYCOPY - 18)) | (1L << (BYREF - 18)) | (1L << (ID - 18)) | (1L << (IMP - 18)) | (1L << (IN - 18)) | (1L << (INOUT - 18)) | (1L << (ONEWAY - 18)) | (1L << (OUT - 18)) | (1L << (PROTOCOL_ - 18)) | (1L << (SEL - 18)) | (1L << (SELF - 18)) | (1L << (SUPER - 18)))) != 0) || ((((_la - 98)) & ~0x3f) == 0 && ((1L << (_la - 98)) & ((1L << (ATOMIC - 98)) | (1L << (NONATOMIC - 98)) | (1L << (RETAIN - 98)) | (1L << (ATTRIBUTE - 98)) | (1L << (AUTORELEASING_QUALIFIER - 98)) | (1L << (BLOCK - 98)) | (1L << (BRIDGE - 98)) | (1L << (BRIDGE_RETAINED - 98)) | (1L << (BRIDGE_TRANSFER - 98)) | (1L << (COVARIANT - 98)) | (1L << (CONTRAVARIANT - 98)) | (1L << (DEPRECATED - 98)) | (1L << (KINDOF - 98)) | (1L << (STRONG_QUALIFIER - 98)) | (1L << (TYPEOF - 98)) | (1L << (UNSAFE_UNRETAINED_QUALIFIER - 98)) | (1L << (UNUSED - 98)) | (1L << (WEAK_QUALIFIER - 98)) | (1L << (NULL_UNSPECIFIED - 98)) | (1L << (NULLABLE - 98)) | (1L << (NONNULL - 98)) | (1L << (NULL_RESETTABLE - 98)) | (1L << (NS_INLINE - 98)) | (1L << (NS_ENUM - 98)) | (1L << (NS_OPTIONS - 98)) | (1L << (ASSIGN - 98)) | (1L << (COPY - 98)) | (1L << (GETTER - 98)) | (1L << (SETTER - 98)) | (1L << (STRONG - 98)) | (1L << (READONLY - 98)) | (1L << (READWRITE - 98)) | (1L << (WEAK - 98)) | (1L << (UNSAFE_UNRETAINED - 98)) | (1L << (IB_OUTLET - 98)) | (1L << (IB_OUTLET_COLLECTION - 98)) | (1L << (IB_INSPECTABLE - 98)) | (1L << (IB_DESIGNABLE - 98)) | (1L << (IDENTIFIER - 98)))) != 0)) {
					{
					setState(575);
					parameterList();
					}
				}

				setState(578);
				match(RP);
				}
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class LogContext extends ParserRuleContext {
		public TerminalNode LOGOS_LOG() { return getToken(LogosXXParser.LOGOS_LOG, 0); }
		public TerminalNode SEMI() { return getToken(LogosXXParser.SEMI, 0); }
		public TerminalNode LP() { return getToken(LogosXXParser.LP, 0); }
		public TerminalNode RP() { return getToken(LogosXXParser.RP, 0); }
		public LogexprContext logexpr() {
			return getRuleContext(LogexprContext.class,0);
		}
		public LogContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_log; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LogosXXParserListener ) ((LogosXXParserListener)listener).enterLog(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LogosXXParserListener ) ((LogosXXParserListener)listener).exitLog(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LogosXXParserVisitor ) return ((LogosXXParserVisitor<? extends T>)visitor).visitLog(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LogContext log() throws RecognitionException {
		LogContext _localctx = new LogContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_log);
		int _la;
		try {
			setState(590);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,29,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(581);
				match(LOGOS_LOG);
				setState(582);
				match(SEMI);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(583);
				match(LOGOS_LOG);
				setState(584);
				match(LP);
				setState(586);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LP) {
					{
					setState(585);
					logexpr();
					}
				}

				setState(588);
				match(RP);
				setState(589);
				match(SEMI);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class LogexprContext extends ParserRuleContext {
		public TerminalNode LP() { return getToken(LogosXXParser.LP, 0); }
		public TypeNameContext typeName() {
			return getRuleContext(TypeNameContext.class,0);
		}
		public TerminalNode RP() { return getToken(LogosXXParser.RP, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public List<TerminalNode> COMMA() { return getTokens(LogosXXParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(LogosXXParser.COMMA, i);
		}
		public List<LogexprContext> logexpr() {
			return getRuleContexts(LogexprContext.class);
		}
		public LogexprContext logexpr(int i) {
			return getRuleContext(LogexprContext.class,i);
		}
		public LogexprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_logexpr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LogosXXParserListener ) ((LogosXXParserListener)listener).enterLogexpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LogosXXParserListener ) ((LogosXXParserListener)listener).exitLogexpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LogosXXParserVisitor ) return ((LogosXXParserVisitor<? extends T>)visitor).visitLogexpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LogexprContext logexpr() throws RecognitionException {
		LogexprContext _localctx = new LogexprContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_logexpr);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(592);
			match(LP);
			setState(593);
			typeName();
			setState(594);
			match(RP);
			setState(595);
			expression(0);
			setState(600);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,30,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(596);
					match(COMMA);
					setState(597);
					logexpr();
					}
					} 
				}
				setState(602);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,30,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class LogosFusedClassMethodDefinitionContext extends ParserRuleContext {
		public TerminalNode ADD() { return getToken(LogosXXParser.ADD, 0); }
		public LogosFusedMethodDefinitionContext logosFusedMethodDefinition() {
			return getRuleContext(LogosFusedMethodDefinitionContext.class,0);
		}
		public ClassMethodDefinitionContext classMethodDefinition() {
			return getRuleContext(ClassMethodDefinitionContext.class,0);
		}
		public LogosFusedClassMethodDefinitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_logosFusedClassMethodDefinition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LogosXXParserListener ) ((LogosXXParserListener)listener).enterLogosFusedClassMethodDefinition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LogosXXParserListener ) ((LogosXXParserListener)listener).exitLogosFusedClassMethodDefinition(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LogosXXParserVisitor ) return ((LogosXXParserVisitor<? extends T>)visitor).visitLogosFusedClassMethodDefinition(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LogosFusedClassMethodDefinitionContext logosFusedClassMethodDefinition() throws RecognitionException {
		LogosFusedClassMethodDefinitionContext _localctx = new LogosFusedClassMethodDefinitionContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_logosFusedClassMethodDefinition);
		try {
			setState(606);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,31,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(603);
				match(ADD);
				setState(604);
				logosFusedMethodDefinition();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(605);
				classMethodDefinition();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class LogosFusedInstanceMethodDefinitionContext extends ParserRuleContext {
		public TerminalNode SUB() { return getToken(LogosXXParser.SUB, 0); }
		public LogosFusedMethodDefinitionContext logosFusedMethodDefinition() {
			return getRuleContext(LogosFusedMethodDefinitionContext.class,0);
		}
		public InstanceMethodDefinitionContext instanceMethodDefinition() {
			return getRuleContext(InstanceMethodDefinitionContext.class,0);
		}
		public LogosFusedInstanceMethodDefinitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_logosFusedInstanceMethodDefinition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LogosXXParserListener ) ((LogosXXParserListener)listener).enterLogosFusedInstanceMethodDefinition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LogosXXParserListener ) ((LogosXXParserListener)listener).exitLogosFusedInstanceMethodDefinition(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LogosXXParserVisitor ) return ((LogosXXParserVisitor<? extends T>)visitor).visitLogosFusedInstanceMethodDefinition(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LogosFusedInstanceMethodDefinitionContext logosFusedInstanceMethodDefinition() throws RecognitionException {
		LogosFusedInstanceMethodDefinitionContext _localctx = new LogosFusedInstanceMethodDefinitionContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_logosFusedInstanceMethodDefinition);
		try {
			setState(611);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,32,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(608);
				match(SUB);
				setState(609);
				logosFusedMethodDefinition();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(610);
				instanceMethodDefinition();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class LogosFusedMethodDefinitionContext extends ParserRuleContext {
		public MethodSelectorContext methodSelector() {
			return getRuleContext(MethodSelectorContext.class,0);
		}
		public LogosFusedCompoundStatementContext logosFusedCompoundStatement() {
			return getRuleContext(LogosFusedCompoundStatementContext.class,0);
		}
		public MethodTypeContext methodType() {
			return getRuleContext(MethodTypeContext.class,0);
		}
		public InitDeclaratorListContext initDeclaratorList() {
			return getRuleContext(InitDeclaratorListContext.class,0);
		}
		public TerminalNode SEMI() { return getToken(LogosXXParser.SEMI, 0); }
		public MethodDefinitionContext methodDefinition() {
			return getRuleContext(MethodDefinitionContext.class,0);
		}
		public LogosFusedMethodDefinitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_logosFusedMethodDefinition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LogosXXParserListener ) ((LogosXXParserListener)listener).enterLogosFusedMethodDefinition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LogosXXParserListener ) ((LogosXXParserListener)listener).exitLogosFusedMethodDefinition(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LogosXXParserVisitor ) return ((LogosXXParserVisitor<? extends T>)visitor).visitLogosFusedMethodDefinition(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LogosFusedMethodDefinitionContext logosFusedMethodDefinition() throws RecognitionException {
		LogosFusedMethodDefinitionContext _localctx = new LogosFusedMethodDefinitionContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_logosFusedMethodDefinition);
		int _la;
		try {
			setState(626);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,36,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(614);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LP) {
					{
					setState(613);
					methodType();
					}
				}

				setState(616);
				methodSelector();
				setState(618);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (((((_la - 57)) & ~0x3f) == 0 && ((1L << (_la - 57)) & ((1L << (BOOL - 57)) | (1L << (Class - 57)) | (1L << (BYCOPY - 57)) | (1L << (BYREF - 57)) | (1L << (ID - 57)) | (1L << (IMP - 57)) | (1L << (IN - 57)) | (1L << (INOUT - 57)) | (1L << (ONEWAY - 57)) | (1L << (OUT - 57)) | (1L << (PROTOCOL_ - 57)) | (1L << (SEL - 57)) | (1L << (SELF - 57)) | (1L << (SUPER - 57)) | (1L << (ATOMIC - 57)) | (1L << (NONATOMIC - 57)) | (1L << (RETAIN - 57)) | (1L << (AUTORELEASING_QUALIFIER - 57)) | (1L << (BLOCK - 57)) | (1L << (BRIDGE_RETAINED - 57)) | (1L << (BRIDGE_TRANSFER - 57)) | (1L << (COVARIANT - 57)) | (1L << (CONTRAVARIANT - 57)) | (1L << (DEPRECATED - 57)) | (1L << (KINDOF - 57)) | (1L << (UNUSED - 57)) | (1L << (NULL_UNSPECIFIED - 57)) | (1L << (NULLABLE - 57)) | (1L << (NONNULL - 57)) | (1L << (NULL_RESETTABLE - 57)) | (1L << (NS_INLINE - 57)))) != 0) || ((((_la - 121)) & ~0x3f) == 0 && ((1L << (_la - 121)) & ((1L << (NS_ENUM - 121)) | (1L << (NS_OPTIONS - 121)) | (1L << (ASSIGN - 121)) | (1L << (COPY - 121)) | (1L << (GETTER - 121)) | (1L << (SETTER - 121)) | (1L << (STRONG - 121)) | (1L << (READONLY - 121)) | (1L << (READWRITE - 121)) | (1L << (WEAK - 121)) | (1L << (UNSAFE_UNRETAINED - 121)) | (1L << (IB_OUTLET - 121)) | (1L << (IB_OUTLET_COLLECTION - 121)) | (1L << (IB_INSPECTABLE - 121)) | (1L << (IB_DESIGNABLE - 121)) | (1L << (IDENTIFIER - 121)) | (1L << (LP - 121)) | (1L << (MUL - 121)))) != 0)) {
					{
					setState(617);
					initDeclaratorList();
					}
				}

				setState(621);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==SEMI) {
					{
					setState(620);
					match(SEMI);
					}
				}

				setState(623);
				logosFusedCompoundStatement();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(625);
				methodDefinition();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class LogosFusedCompoundStatementContext extends ParserRuleContext {
		public TerminalNode LBRACE() { return getToken(LogosXXParser.LBRACE, 0); }
		public TerminalNode RBRACE() { return getToken(LogosXXParser.RBRACE, 0); }
		public List<DeclarationContext> declaration() {
			return getRuleContexts(DeclarationContext.class);
		}
		public DeclarationContext declaration(int i) {
			return getRuleContext(DeclarationContext.class,i);
		}
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public List<LogosxxFunctionLevelContext> logosxxFunctionLevel() {
			return getRuleContexts(LogosxxFunctionLevelContext.class);
		}
		public LogosxxFunctionLevelContext logosxxFunctionLevel(int i) {
			return getRuleContext(LogosxxFunctionLevelContext.class,i);
		}
		public List<CppTemplateFunctionCallStatementContext> cppTemplateFunctionCallStatement() {
			return getRuleContexts(CppTemplateFunctionCallStatementContext.class);
		}
		public CppTemplateFunctionCallStatementContext cppTemplateFunctionCallStatement(int i) {
			return getRuleContext(CppTemplateFunctionCallStatementContext.class,i);
		}
		public List<HookedFunctionExpressionContext> hookedFunctionExpression() {
			return getRuleContexts(HookedFunctionExpressionContext.class);
		}
		public HookedFunctionExpressionContext hookedFunctionExpression(int i) {
			return getRuleContext(HookedFunctionExpressionContext.class,i);
		}
		public CompoundStatementContext compoundStatement() {
			return getRuleContext(CompoundStatementContext.class,0);
		}
		public LogosFusedCompoundStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_logosFusedCompoundStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LogosXXParserListener ) ((LogosXXParserListener)listener).enterLogosFusedCompoundStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LogosXXParserListener ) ((LogosXXParserListener)listener).exitLogosFusedCompoundStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LogosXXParserVisitor ) return ((LogosXXParserVisitor<? extends T>)visitor).visitLogosFusedCompoundStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LogosFusedCompoundStatementContext logosFusedCompoundStatement() throws RecognitionException {
		LogosFusedCompoundStatementContext _localctx = new LogosFusedCompoundStatementContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_logosFusedCompoundStatement);
		int _la;
		try {
			setState(641);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,39,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(628);
				match(LBRACE);
				setState(636);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (((((_la - 13)) & ~0x3f) == 0 && ((1L << (_la - 13)) & ((1L << (LOGOS_INIT - 13)) | (1L << (LOGOS_CLASS - 13)) | (1L << (LOGOS_CALLSWIFT - 13)) | (1L << (LOGOS_ORIG - 13)) | (1L << (LOGOS_LOG - 13)) | (1L << (AUTO - 13)) | (1L << (BREAK - 13)) | (1L << (CHAR - 13)) | (1L << (CONST - 13)) | (1L << (CONTINUE - 13)) | (1L << (DO - 13)) | (1L << (DOUBLE - 13)) | (1L << (ENUM - 13)) | (1L << (EXTERN - 13)) | (1L << (FLOAT - 13)) | (1L << (FOR - 13)) | (1L << (GOTO - 13)) | (1L << (IF - 13)) | (1L << (INLINE - 13)) | (1L << (INT - 13)) | (1L << (LONG - 13)) | (1L << (REGISTER - 13)) | (1L << (RESTRICT - 13)) | (1L << (RETURN - 13)) | (1L << (SHORT - 13)) | (1L << (SIGNED - 13)) | (1L << (SIZEOF - 13)) | (1L << (STATIC - 13)) | (1L << (STRUCT - 13)) | (1L << (SWITCH - 13)) | (1L << (TYPEDEF - 13)) | (1L << (UNION - 13)) | (1L << (UNSIGNED - 13)) | (1L << (VOID - 13)) | (1L << (VOLATILE - 13)) | (1L << (WHILE - 13)) | (1L << (TRUE - 13)) | (1L << (FALSE - 13)) | (1L << (BOOL - 13)) | (1L << (Class - 13)) | (1L << (BYCOPY - 13)) | (1L << (BYREF - 13)) | (1L << (ID - 13)) | (1L << (IMP - 13)) | (1L << (IN - 13)) | (1L << (INOUT - 13)) | (1L << (NIL - 13)) | (1L << (NO - 13)) | (1L << (NULL - 13)) | (1L << (ONEWAY - 13)) | (1L << (OUT - 13)) | (1L << (PROTOCOL_ - 13)) | (1L << (SEL - 13)) | (1L << (SELF - 13)) | (1L << (SUPER - 13)) | (1L << (YES - 13)) | (1L << (AUTORELEASEPOOL - 13)))) != 0) || ((((_la - 79)) & ~0x3f) == 0 && ((1L << (_la - 79)) & ((1L << (ENCODE - 79)) | (1L << (PROTOCOL - 79)) | (1L << (SELECTOR - 79)) | (1L << (SYNCHRONIZED - 79)) | (1L << (THROW - 79)) | (1L << (TRY - 79)) | (1L << (ATOMIC - 79)) | (1L << (NONATOMIC - 79)) | (1L << (RETAIN - 79)) | (1L << (ATTRIBUTE - 79)) | (1L << (AUTORELEASING_QUALIFIER - 79)) | (1L << (BLOCK - 79)) | (1L << (BRIDGE - 79)) | (1L << (BRIDGE_RETAINED - 79)) | (1L << (BRIDGE_TRANSFER - 79)) | (1L << (COVARIANT - 79)) | (1L << (CONTRAVARIANT - 79)) | (1L << (DEPRECATED - 79)) | (1L << (KINDOF - 79)) | (1L << (STRONG_QUALIFIER - 79)) | (1L << (TYPEOF - 79)) | (1L << (UNSAFE_UNRETAINED_QUALIFIER - 79)) | (1L << (UNUSED - 79)) | (1L << (WEAK_QUALIFIER - 79)) | (1L << (NULL_UNSPECIFIED - 79)) | (1L << (NULLABLE - 79)) | (1L << (NONNULL - 79)) | (1L << (NULL_RESETTABLE - 79)) | (1L << (NS_INLINE - 79)) | (1L << (NS_ENUM - 79)) | (1L << (NS_OPTIONS - 79)) | (1L << (ASSIGN - 79)) | (1L << (COPY - 79)) | (1L << (GETTER - 79)) | (1L << (SETTER - 79)) | (1L << (STRONG - 79)) | (1L << (READONLY - 79)) | (1L << (READWRITE - 79)) | (1L << (WEAK - 79)) | (1L << (UNSAFE_UNRETAINED - 79)) | (1L << (IB_OUTLET - 79)) | (1L << (IB_OUTLET_COLLECTION - 79)) | (1L << (IB_INSPECTABLE - 79)) | (1L << (IB_DESIGNABLE - 79)) | (1L << (IDENTIFIER - 79)))) != 0) || ((((_la - 143)) & ~0x3f) == 0 && ((1L << (_la - 143)) & ((1L << (LP - 143)) | (1L << (LBRACE - 143)) | (1L << (LBRACK - 143)) | (1L << (SEMI - 143)) | (1L << (AT - 143)) | (1L << (BANG - 143)) | (1L << (TILDE - 143)) | (1L << (INC - 143)) | (1L << (DEC - 143)) | (1L << (ADD - 143)) | (1L << (SUB - 143)) | (1L << (MUL - 143)) | (1L << (BITAND - 143)) | (1L << (BITXOR - 143)) | (1L << (CHARACTER_LITERAL - 143)) | (1L << (STRING_START - 143)) | (1L << (HEX_LITERAL - 143)) | (1L << (OCTAL_LITERAL - 143)) | (1L << (BINARY_LITERAL - 143)) | (1L << (DECIMAL_LITERAL - 143)) | (1L << (FLOATING_POINT_LITERAL - 143)))) != 0)) {
					{
					setState(634);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,37,_ctx) ) {
					case 1:
						{
						setState(629);
						declaration();
						}
						break;
					case 2:
						{
						setState(630);
						statement();
						}
						break;
					case 3:
						{
						setState(631);
						logosxxFunctionLevel();
						}
						break;
					case 4:
						{
						setState(632);
						cppTemplateFunctionCallStatement();
						}
						break;
					case 5:
						{
						setState(633);
						hookedFunctionExpression();
						}
						break;
					}
					}
					setState(638);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(639);
				match(RBRACE);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(640);
				compoundStatement();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class HookedFunctionExpressionContext extends ParserRuleContext {
		public TerminalNode VOID() { return getToken(LogosXXParser.VOID, 0); }
		public List<TerminalNode> LP() { return getTokens(LogosXXParser.LP); }
		public TerminalNode LP(int i) {
			return getToken(LogosXXParser.LP, i);
		}
		public TerminalNode MUL() { return getToken(LogosXXParser.MUL, 0); }
		public TerminalNode IDENTIFIER() { return getToken(LogosXXParser.IDENTIFIER, 0); }
		public List<TerminalNode> RP() { return getTokens(LogosXXParser.RP); }
		public TerminalNode RP(int i) {
			return getToken(LogosXXParser.RP, i);
		}
		public TypeListContext typeList() {
			return getRuleContext(TypeListContext.class,0);
		}
		public TerminalNode ASSIGNMENT() { return getToken(LogosXXParser.ASSIGNMENT, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode SEMI() { return getToken(LogosXXParser.SEMI, 0); }
		public HookedFunctionExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_hookedFunctionExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LogosXXParserListener ) ((LogosXXParserListener)listener).enterHookedFunctionExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LogosXXParserListener ) ((LogosXXParserListener)listener).exitHookedFunctionExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LogosXXParserVisitor ) return ((LogosXXParserVisitor<? extends T>)visitor).visitHookedFunctionExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final HookedFunctionExpressionContext hookedFunctionExpression() throws RecognitionException {
		HookedFunctionExpressionContext _localctx = new HookedFunctionExpressionContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_hookedFunctionExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(643);
			match(VOID);
			setState(644);
			match(LP);
			setState(645);
			match(MUL);
			setState(646);
			match(IDENTIFIER);
			setState(647);
			match(RP);
			setState(648);
			match(LP);
			setState(649);
			typeList();
			setState(650);
			match(RP);
			setState(654);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ASSIGNMENT:
				{
				setState(651);
				match(ASSIGNMENT);
				setState(652);
				expression(0);
				}
				break;
			case SEMI:
				{
				setState(653);
				match(SEMI);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CppTemplateFunctionCallStatementContext extends ParserRuleContext {
		public ExpressionContext assignmentExpression;
		public List<TerminalNode> IDENTIFIER() { return getTokens(LogosXXParser.IDENTIFIER); }
		public TerminalNode IDENTIFIER(int i) {
			return getToken(LogosXXParser.IDENTIFIER, i);
		}
		public TerminalNode LT() { return getToken(LogosXXParser.LT, 0); }
		public TerminalNode GT() { return getToken(LogosXXParser.GT, 0); }
		public AssignmentOperatorContext assignmentOperator() {
			return getRuleContext(AssignmentOperatorContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode LP() { return getToken(LogosXXParser.LP, 0); }
		public TerminalNode RP() { return getToken(LogosXXParser.RP, 0); }
		public List<TypeNameContext> typeName() {
			return getRuleContexts(TypeNameContext.class);
		}
		public TypeNameContext typeName(int i) {
			return getRuleContext(TypeNameContext.class,i);
		}
		public TerminalNode POINTER() { return getToken(LogosXXParser.POINTER, 0); }
		public TerminalNode DOT() { return getToken(LogosXXParser.DOT, 0); }
		public ArgumentExpressionListContext argumentExpressionList() {
			return getRuleContext(ArgumentExpressionListContext.class,0);
		}
		public CppTemplateFunctionCallStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cppTemplateFunctionCallStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LogosXXParserListener ) ((LogosXXParserListener)listener).enterCppTemplateFunctionCallStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LogosXXParserListener ) ((LogosXXParserListener)listener).exitCppTemplateFunctionCallStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LogosXXParserVisitor ) return ((LogosXXParserVisitor<? extends T>)visitor).visitCppTemplateFunctionCallStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CppTemplateFunctionCallStatementContext cppTemplateFunctionCallStatement() throws RecognitionException {
		CppTemplateFunctionCallStatementContext _localctx = new CppTemplateFunctionCallStatementContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_cppTemplateFunctionCallStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(656);
			match(IDENTIFIER);
			setState(657);
			match(LT);
			setState(661);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((((_la - 21)) & ~0x3f) == 0 && ((1L << (_la - 21)) & ((1L << (CHAR - 21)) | (1L << (CONST - 21)) | (1L << (DOUBLE - 21)) | (1L << (ENUM - 21)) | (1L << (FLOAT - 21)) | (1L << (INLINE - 21)) | (1L << (INT - 21)) | (1L << (LONG - 21)) | (1L << (RESTRICT - 21)) | (1L << (SHORT - 21)) | (1L << (SIGNED - 21)) | (1L << (STRUCT - 21)) | (1L << (UNION - 21)) | (1L << (UNSIGNED - 21)) | (1L << (VOID - 21)) | (1L << (VOLATILE - 21)) | (1L << (BOOL - 21)) | (1L << (Class - 21)) | (1L << (BYCOPY - 21)) | (1L << (BYREF - 21)) | (1L << (ID - 21)) | (1L << (IMP - 21)) | (1L << (IN - 21)) | (1L << (INOUT - 21)) | (1L << (ONEWAY - 21)) | (1L << (OUT - 21)) | (1L << (PROTOCOL_ - 21)) | (1L << (SEL - 21)) | (1L << (SELF - 21)) | (1L << (SUPER - 21)))) != 0) || ((((_la - 98)) & ~0x3f) == 0 && ((1L << (_la - 98)) & ((1L << (ATOMIC - 98)) | (1L << (NONATOMIC - 98)) | (1L << (RETAIN - 98)) | (1L << (AUTORELEASING_QUALIFIER - 98)) | (1L << (BLOCK - 98)) | (1L << (BRIDGE - 98)) | (1L << (BRIDGE_RETAINED - 98)) | (1L << (BRIDGE_TRANSFER - 98)) | (1L << (COVARIANT - 98)) | (1L << (CONTRAVARIANT - 98)) | (1L << (DEPRECATED - 98)) | (1L << (KINDOF - 98)) | (1L << (STRONG_QUALIFIER - 98)) | (1L << (TYPEOF - 98)) | (1L << (UNSAFE_UNRETAINED_QUALIFIER - 98)) | (1L << (UNUSED - 98)) | (1L << (WEAK_QUALIFIER - 98)) | (1L << (NULL_UNSPECIFIED - 98)) | (1L << (NULLABLE - 98)) | (1L << (NONNULL - 98)) | (1L << (NULL_RESETTABLE - 98)) | (1L << (NS_INLINE - 98)) | (1L << (NS_ENUM - 98)) | (1L << (NS_OPTIONS - 98)) | (1L << (ASSIGN - 98)) | (1L << (COPY - 98)) | (1L << (GETTER - 98)) | (1L << (SETTER - 98)) | (1L << (STRONG - 98)) | (1L << (READONLY - 98)) | (1L << (READWRITE - 98)) | (1L << (WEAK - 98)) | (1L << (UNSAFE_UNRETAINED - 98)) | (1L << (IB_OUTLET - 98)) | (1L << (IB_OUTLET_COLLECTION - 98)) | (1L << (IB_INSPECTABLE - 98)) | (1L << (IB_DESIGNABLE - 98)) | (1L << (IDENTIFIER - 98)))) != 0)) {
				{
				{
				setState(658);
				typeName();
				}
				}
				setState(663);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(665);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==POINTER) {
				{
				setState(664);
				match(POINTER);
				}
			}

			setState(667);
			match(GT);
			{
			setState(668);
			match(LP);
			setState(670);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 21)) & ~0x3f) == 0 && ((1L << (_la - 21)) & ((1L << (CHAR - 21)) | (1L << (DOUBLE - 21)) | (1L << (ENUM - 21)) | (1L << (FLOAT - 21)) | (1L << (INT - 21)) | (1L << (LONG - 21)) | (1L << (SHORT - 21)) | (1L << (SIGNED - 21)) | (1L << (SIZEOF - 21)) | (1L << (STRUCT - 21)) | (1L << (UNION - 21)) | (1L << (UNSIGNED - 21)) | (1L << (VOID - 21)) | (1L << (TRUE - 21)) | (1L << (FALSE - 21)) | (1L << (BOOL - 21)) | (1L << (Class - 21)) | (1L << (BYCOPY - 21)) | (1L << (BYREF - 21)) | (1L << (ID - 21)) | (1L << (IMP - 21)) | (1L << (IN - 21)) | (1L << (INOUT - 21)) | (1L << (NIL - 21)) | (1L << (NO - 21)) | (1L << (NULL - 21)) | (1L << (ONEWAY - 21)) | (1L << (OUT - 21)) | (1L << (PROTOCOL_ - 21)) | (1L << (SEL - 21)) | (1L << (SELF - 21)) | (1L << (SUPER - 21)) | (1L << (YES - 21)) | (1L << (ENCODE - 21)))) != 0) || ((((_la - 86)) & ~0x3f) == 0 && ((1L << (_la - 86)) & ((1L << (PROTOCOL - 86)) | (1L << (SELECTOR - 86)) | (1L << (ATOMIC - 86)) | (1L << (NONATOMIC - 86)) | (1L << (RETAIN - 86)) | (1L << (AUTORELEASING_QUALIFIER - 86)) | (1L << (BLOCK - 86)) | (1L << (BRIDGE_RETAINED - 86)) | (1L << (BRIDGE_TRANSFER - 86)) | (1L << (COVARIANT - 86)) | (1L << (CONTRAVARIANT - 86)) | (1L << (DEPRECATED - 86)) | (1L << (KINDOF - 86)) | (1L << (TYPEOF - 86)) | (1L << (UNUSED - 86)) | (1L << (NULL_UNSPECIFIED - 86)) | (1L << (NULLABLE - 86)) | (1L << (NONNULL - 86)) | (1L << (NULL_RESETTABLE - 86)) | (1L << (NS_INLINE - 86)) | (1L << (NS_ENUM - 86)) | (1L << (NS_OPTIONS - 86)) | (1L << (ASSIGN - 86)) | (1L << (COPY - 86)) | (1L << (GETTER - 86)) | (1L << (SETTER - 86)) | (1L << (STRONG - 86)) | (1L << (READONLY - 86)) | (1L << (READWRITE - 86)) | (1L << (WEAK - 86)) | (1L << (UNSAFE_UNRETAINED - 86)) | (1L << (IB_OUTLET - 86)) | (1L << (IB_OUTLET_COLLECTION - 86)) | (1L << (IB_INSPECTABLE - 86)) | (1L << (IB_DESIGNABLE - 86)) | (1L << (IDENTIFIER - 86)) | (1L << (LP - 86)) | (1L << (LBRACK - 86)))) != 0) || ((((_la - 153)) & ~0x3f) == 0 && ((1L << (_la - 153)) & ((1L << (AT - 153)) | (1L << (BANG - 153)) | (1L << (TILDE - 153)) | (1L << (INC - 153)) | (1L << (DEC - 153)) | (1L << (ADD - 153)) | (1L << (SUB - 153)) | (1L << (MUL - 153)) | (1L << (BITAND - 153)) | (1L << (BITXOR - 153)) | (1L << (CHARACTER_LITERAL - 153)) | (1L << (STRING_START - 153)) | (1L << (HEX_LITERAL - 153)) | (1L << (OCTAL_LITERAL - 153)) | (1L << (BINARY_LITERAL - 153)) | (1L << (DECIMAL_LITERAL - 153)) | (1L << (FLOATING_POINT_LITERAL - 153)))) != 0)) {
				{
				setState(669);
				argumentExpressionList();
				}
			}

			setState(672);
			match(RP);
			}
			setState(676);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==DOT) {
				{
				setState(674);
				match(DOT);
				setState(675);
				match(IDENTIFIER);
				}
			}

			setState(678);
			assignmentOperator();
			setState(679);
			((CppTemplateFunctionCallStatementContext)_localctx).assignmentExpression = expression(0);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TranslationUnitContext extends ParserRuleContext {
		public TerminalNode EOF() { return getToken(LogosXXParser.EOF, 0); }
		public List<TopLevelDeclarationContext> topLevelDeclaration() {
			return getRuleContexts(TopLevelDeclarationContext.class);
		}
		public TopLevelDeclarationContext topLevelDeclaration(int i) {
			return getRuleContext(TopLevelDeclarationContext.class,i);
		}
		public TranslationUnitContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_translationUnit; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LogosXXParserListener ) ((LogosXXParserListener)listener).enterTranslationUnit(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LogosXXParserListener ) ((LogosXXParserListener)listener).exitTranslationUnit(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LogosXXParserVisitor ) return ((LogosXXParserVisitor<? extends T>)visitor).visitTranslationUnit(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TranslationUnitContext translationUnit() throws RecognitionException {
		TranslationUnitContext _localctx = new TranslationUnitContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_translationUnit);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(684);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((((_la - 18)) & ~0x3f) == 0 && ((1L << (_la - 18)) & ((1L << (AUTO - 18)) | (1L << (CHAR - 18)) | (1L << (CONST - 18)) | (1L << (DOUBLE - 18)) | (1L << (ENUM - 18)) | (1L << (EXTERN - 18)) | (1L << (FLOAT - 18)) | (1L << (INLINE - 18)) | (1L << (INT - 18)) | (1L << (LONG - 18)) | (1L << (REGISTER - 18)) | (1L << (RESTRICT - 18)) | (1L << (SHORT - 18)) | (1L << (SIGNED - 18)) | (1L << (STATIC - 18)) | (1L << (STRUCT - 18)) | (1L << (TYPEDEF - 18)) | (1L << (UNION - 18)) | (1L << (UNSIGNED - 18)) | (1L << (VOID - 18)) | (1L << (VOLATILE - 18)) | (1L << (BOOL - 18)) | (1L << (Class - 18)) | (1L << (BYCOPY - 18)) | (1L << (BYREF - 18)) | (1L << (ID - 18)) | (1L << (IMP - 18)) | (1L << (IN - 18)) | (1L << (INOUT - 18)) | (1L << (ONEWAY - 18)) | (1L << (OUT - 18)) | (1L << (PROTOCOL_ - 18)) | (1L << (SEL - 18)) | (1L << (SELF - 18)) | (1L << (SUPER - 18)) | (1L << (CLASS - 18)))) != 0) || ((((_la - 82)) & ~0x3f) == 0 && ((1L << (_la - 82)) & ((1L << (IMPLEMENTATION - 82)) | (1L << (INTERFACE - 82)) | (1L << (IMPORT - 82)) | (1L << (PROTOCOL - 82)) | (1L << (ATOMIC - 82)) | (1L << (NONATOMIC - 82)) | (1L << (RETAIN - 82)) | (1L << (ATTRIBUTE - 82)) | (1L << (AUTORELEASING_QUALIFIER - 82)) | (1L << (BLOCK - 82)) | (1L << (BRIDGE - 82)) | (1L << (BRIDGE_RETAINED - 82)) | (1L << (BRIDGE_TRANSFER - 82)) | (1L << (COVARIANT - 82)) | (1L << (CONTRAVARIANT - 82)) | (1L << (DEPRECATED - 82)) | (1L << (KINDOF - 82)) | (1L << (STRONG_QUALIFIER - 82)) | (1L << (TYPEOF - 82)) | (1L << (UNSAFE_UNRETAINED_QUALIFIER - 82)) | (1L << (UNUSED - 82)) | (1L << (WEAK_QUALIFIER - 82)) | (1L << (NULL_UNSPECIFIED - 82)) | (1L << (NULLABLE - 82)) | (1L << (NONNULL - 82)) | (1L << (NULL_RESETTABLE - 82)) | (1L << (NS_INLINE - 82)) | (1L << (NS_ENUM - 82)) | (1L << (NS_OPTIONS - 82)) | (1L << (ASSIGN - 82)) | (1L << (COPY - 82)) | (1L << (GETTER - 82)) | (1L << (SETTER - 82)) | (1L << (STRONG - 82)) | (1L << (READONLY - 82)) | (1L << (READWRITE - 82)) | (1L << (WEAK - 82)) | (1L << (UNSAFE_UNRETAINED - 82)) | (1L << (IB_OUTLET - 82)) | (1L << (IB_OUTLET_COLLECTION - 82)) | (1L << (IB_INSPECTABLE - 82)) | (1L << (IB_DESIGNABLE - 82)) | (1L << (IDENTIFIER - 82)))) != 0)) {
				{
				{
				setState(681);
				topLevelDeclaration();
				}
				}
				setState(686);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(687);
			match(EOF);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TopLevelDeclarationContext extends ParserRuleContext {
		public ImportDeclarationContext importDeclaration() {
			return getRuleContext(ImportDeclarationContext.class,0);
		}
		public FunctionDeclarationContext functionDeclaration() {
			return getRuleContext(FunctionDeclarationContext.class,0);
		}
		public DeclarationContext declaration() {
			return getRuleContext(DeclarationContext.class,0);
		}
		public ClassInterfaceContext classInterface() {
			return getRuleContext(ClassInterfaceContext.class,0);
		}
		public ClassImplementationContext classImplementation() {
			return getRuleContext(ClassImplementationContext.class,0);
		}
		public CategoryInterfaceContext categoryInterface() {
			return getRuleContext(CategoryInterfaceContext.class,0);
		}
		public CategoryImplementationContext categoryImplementation() {
			return getRuleContext(CategoryImplementationContext.class,0);
		}
		public ProtocolDeclarationContext protocolDeclaration() {
			return getRuleContext(ProtocolDeclarationContext.class,0);
		}
		public ProtocolDeclarationListContext protocolDeclarationList() {
			return getRuleContext(ProtocolDeclarationListContext.class,0);
		}
		public ClassDeclarationListContext classDeclarationList() {
			return getRuleContext(ClassDeclarationListContext.class,0);
		}
		public FunctionDefinitionContext functionDefinition() {
			return getRuleContext(FunctionDefinitionContext.class,0);
		}
		public TopLevelDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_topLevelDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LogosXXParserListener ) ((LogosXXParserListener)listener).enterTopLevelDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LogosXXParserListener ) ((LogosXXParserListener)listener).exitTopLevelDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LogosXXParserVisitor ) return ((LogosXXParserVisitor<? extends T>)visitor).visitTopLevelDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TopLevelDeclarationContext topLevelDeclaration() throws RecognitionException {
		TopLevelDeclarationContext _localctx = new TopLevelDeclarationContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_topLevelDeclaration);
		try {
			setState(700);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,46,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(689);
				importDeclaration();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(690);
				functionDeclaration();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(691);
				declaration();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(692);
				classInterface();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(693);
				classImplementation();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(694);
				categoryInterface();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(695);
				categoryImplementation();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(696);
				protocolDeclaration();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(697);
				protocolDeclarationList();
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(698);
				classDeclarationList();
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(699);
				functionDefinition();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ImportDeclarationContext extends ParserRuleContext {
		public TerminalNode IMPORT() { return getToken(LogosXXParser.IMPORT, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode SEMI() { return getToken(LogosXXParser.SEMI, 0); }
		public ImportDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_importDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LogosXXParserListener ) ((LogosXXParserListener)listener).enterImportDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LogosXXParserListener ) ((LogosXXParserListener)listener).exitImportDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LogosXXParserVisitor ) return ((LogosXXParserVisitor<? extends T>)visitor).visitImportDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ImportDeclarationContext importDeclaration() throws RecognitionException {
		ImportDeclarationContext _localctx = new ImportDeclarationContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_importDeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(702);
			match(IMPORT);
			setState(703);
			identifier();
			setState(704);
			match(SEMI);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ClassInterfaceContext extends ParserRuleContext {
		public GenericTypeSpecifierContext className;
		public IdentifierContext superclassName;
		public TerminalNode INTERFACE() { return getToken(LogosXXParser.INTERFACE, 0); }
		public TerminalNode END() { return getToken(LogosXXParser.END, 0); }
		public GenericTypeSpecifierContext genericTypeSpecifier() {
			return getRuleContext(GenericTypeSpecifierContext.class,0);
		}
		public TerminalNode IB_DESIGNABLE() { return getToken(LogosXXParser.IB_DESIGNABLE, 0); }
		public TerminalNode COLON() { return getToken(LogosXXParser.COLON, 0); }
		public TerminalNode LT() { return getToken(LogosXXParser.LT, 0); }
		public ProtocolListContext protocolList() {
			return getRuleContext(ProtocolListContext.class,0);
		}
		public TerminalNode GT() { return getToken(LogosXXParser.GT, 0); }
		public InstanceVariablesContext instanceVariables() {
			return getRuleContext(InstanceVariablesContext.class,0);
		}
		public InterfaceDeclarationListContext interfaceDeclarationList() {
			return getRuleContext(InterfaceDeclarationListContext.class,0);
		}
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public ClassInterfaceContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classInterface; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LogosXXParserListener ) ((LogosXXParserListener)listener).enterClassInterface(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LogosXXParserListener ) ((LogosXXParserListener)listener).exitClassInterface(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LogosXXParserVisitor ) return ((LogosXXParserVisitor<? extends T>)visitor).visitClassInterface(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ClassInterfaceContext classInterface() throws RecognitionException {
		ClassInterfaceContext _localctx = new ClassInterfaceContext(_ctx, getState());
		enterRule(_localctx, 68, RULE_classInterface);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(707);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==IB_DESIGNABLE) {
				{
				setState(706);
				match(IB_DESIGNABLE);
				}
			}

			setState(709);
			match(INTERFACE);
			setState(710);
			((ClassInterfaceContext)_localctx).className = genericTypeSpecifier();
			setState(713);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COLON) {
				{
				setState(711);
				match(COLON);
				setState(712);
				((ClassInterfaceContext)_localctx).superclassName = identifier();
				}
			}

			setState(719);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LT) {
				{
				setState(715);
				match(LT);
				setState(716);
				protocolList();
				setState(717);
				match(GT);
				}
			}

			setState(722);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LBRACE) {
				{
				setState(721);
				instanceVariables();
				}
			}

			setState(725);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << AUTO) | (1L << CHAR) | (1L << CONST) | (1L << DOUBLE) | (1L << ENUM) | (1L << EXTERN) | (1L << FLOAT) | (1L << INLINE) | (1L << INT) | (1L << LONG) | (1L << REGISTER) | (1L << RESTRICT) | (1L << SHORT) | (1L << SIGNED) | (1L << STATIC) | (1L << STRUCT) | (1L << TYPEDEF) | (1L << UNION) | (1L << UNSIGNED) | (1L << VOID) | (1L << VOLATILE) | (1L << BOOL) | (1L << Class) | (1L << BYCOPY) | (1L << BYREF) | (1L << ID) | (1L << IMP) | (1L << IN))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (INOUT - 64)) | (1L << (ONEWAY - 64)) | (1L << (OUT - 64)) | (1L << (PROTOCOL_ - 64)) | (1L << (SEL - 64)) | (1L << (SELF - 64)) | (1L << (SUPER - 64)) | (1L << (PROPERTY - 64)) | (1L << (ATOMIC - 64)) | (1L << (NONATOMIC - 64)) | (1L << (RETAIN - 64)) | (1L << (ATTRIBUTE - 64)) | (1L << (AUTORELEASING_QUALIFIER - 64)) | (1L << (BLOCK - 64)) | (1L << (BRIDGE - 64)) | (1L << (BRIDGE_RETAINED - 64)) | (1L << (BRIDGE_TRANSFER - 64)) | (1L << (COVARIANT - 64)) | (1L << (CONTRAVARIANT - 64)) | (1L << (DEPRECATED - 64)) | (1L << (KINDOF - 64)) | (1L << (STRONG_QUALIFIER - 64)) | (1L << (TYPEOF - 64)) | (1L << (UNSAFE_UNRETAINED_QUALIFIER - 64)) | (1L << (UNUSED - 64)) | (1L << (WEAK_QUALIFIER - 64)) | (1L << (NULL_UNSPECIFIED - 64)) | (1L << (NULLABLE - 64)) | (1L << (NONNULL - 64)) | (1L << (NULL_RESETTABLE - 64)) | (1L << (NS_INLINE - 64)) | (1L << (NS_ENUM - 64)) | (1L << (NS_OPTIONS - 64)) | (1L << (ASSIGN - 64)) | (1L << (COPY - 64)) | (1L << (GETTER - 64)) | (1L << (SETTER - 64)) | (1L << (STRONG - 64)))) != 0) || ((((_la - 128)) & ~0x3f) == 0 && ((1L << (_la - 128)) & ((1L << (READONLY - 128)) | (1L << (READWRITE - 128)) | (1L << (WEAK - 128)) | (1L << (UNSAFE_UNRETAINED - 128)) | (1L << (IB_OUTLET - 128)) | (1L << (IB_OUTLET_COLLECTION - 128)) | (1L << (IB_INSPECTABLE - 128)) | (1L << (IB_DESIGNABLE - 128)) | (1L << (IDENTIFIER - 128)) | (1L << (ADD - 128)) | (1L << (SUB - 128)))) != 0)) {
				{
				setState(724);
				interfaceDeclarationList();
				}
			}

			setState(727);
			match(END);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CategoryInterfaceContext extends ParserRuleContext {
		public GenericTypeSpecifierContext categoryName;
		public IdentifierContext className;
		public TerminalNode INTERFACE() { return getToken(LogosXXParser.INTERFACE, 0); }
		public TerminalNode LP() { return getToken(LogosXXParser.LP, 0); }
		public TerminalNode RP() { return getToken(LogosXXParser.RP, 0); }
		public TerminalNode END() { return getToken(LogosXXParser.END, 0); }
		public GenericTypeSpecifierContext genericTypeSpecifier() {
			return getRuleContext(GenericTypeSpecifierContext.class,0);
		}
		public TerminalNode LT() { return getToken(LogosXXParser.LT, 0); }
		public ProtocolListContext protocolList() {
			return getRuleContext(ProtocolListContext.class,0);
		}
		public TerminalNode GT() { return getToken(LogosXXParser.GT, 0); }
		public InstanceVariablesContext instanceVariables() {
			return getRuleContext(InstanceVariablesContext.class,0);
		}
		public InterfaceDeclarationListContext interfaceDeclarationList() {
			return getRuleContext(InterfaceDeclarationListContext.class,0);
		}
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public CategoryInterfaceContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_categoryInterface; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LogosXXParserListener ) ((LogosXXParserListener)listener).enterCategoryInterface(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LogosXXParserListener ) ((LogosXXParserListener)listener).exitCategoryInterface(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LogosXXParserVisitor ) return ((LogosXXParserVisitor<? extends T>)visitor).visitCategoryInterface(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CategoryInterfaceContext categoryInterface() throws RecognitionException {
		CategoryInterfaceContext _localctx = new CategoryInterfaceContext(_ctx, getState());
		enterRule(_localctx, 70, RULE_categoryInterface);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(729);
			match(INTERFACE);
			setState(730);
			((CategoryInterfaceContext)_localctx).categoryName = genericTypeSpecifier();
			setState(731);
			match(LP);
			setState(733);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 57)) & ~0x3f) == 0 && ((1L << (_la - 57)) & ((1L << (BOOL - 57)) | (1L << (Class - 57)) | (1L << (BYCOPY - 57)) | (1L << (BYREF - 57)) | (1L << (ID - 57)) | (1L << (IMP - 57)) | (1L << (IN - 57)) | (1L << (INOUT - 57)) | (1L << (ONEWAY - 57)) | (1L << (OUT - 57)) | (1L << (PROTOCOL_ - 57)) | (1L << (SEL - 57)) | (1L << (SELF - 57)) | (1L << (SUPER - 57)) | (1L << (ATOMIC - 57)) | (1L << (NONATOMIC - 57)) | (1L << (RETAIN - 57)) | (1L << (AUTORELEASING_QUALIFIER - 57)) | (1L << (BLOCK - 57)) | (1L << (BRIDGE_RETAINED - 57)) | (1L << (BRIDGE_TRANSFER - 57)) | (1L << (COVARIANT - 57)) | (1L << (CONTRAVARIANT - 57)) | (1L << (DEPRECATED - 57)) | (1L << (KINDOF - 57)) | (1L << (UNUSED - 57)) | (1L << (NULL_UNSPECIFIED - 57)) | (1L << (NULLABLE - 57)) | (1L << (NONNULL - 57)) | (1L << (NULL_RESETTABLE - 57)) | (1L << (NS_INLINE - 57)))) != 0) || ((((_la - 121)) & ~0x3f) == 0 && ((1L << (_la - 121)) & ((1L << (NS_ENUM - 121)) | (1L << (NS_OPTIONS - 121)) | (1L << (ASSIGN - 121)) | (1L << (COPY - 121)) | (1L << (GETTER - 121)) | (1L << (SETTER - 121)) | (1L << (STRONG - 121)) | (1L << (READONLY - 121)) | (1L << (READWRITE - 121)) | (1L << (WEAK - 121)) | (1L << (UNSAFE_UNRETAINED - 121)) | (1L << (IB_OUTLET - 121)) | (1L << (IB_OUTLET_COLLECTION - 121)) | (1L << (IB_INSPECTABLE - 121)) | (1L << (IB_DESIGNABLE - 121)) | (1L << (IDENTIFIER - 121)))) != 0)) {
				{
				setState(732);
				((CategoryInterfaceContext)_localctx).className = identifier();
				}
			}

			setState(735);
			match(RP);
			setState(740);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LT) {
				{
				setState(736);
				match(LT);
				setState(737);
				protocolList();
				setState(738);
				match(GT);
				}
			}

			setState(743);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LBRACE) {
				{
				setState(742);
				instanceVariables();
				}
			}

			setState(746);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << AUTO) | (1L << CHAR) | (1L << CONST) | (1L << DOUBLE) | (1L << ENUM) | (1L << EXTERN) | (1L << FLOAT) | (1L << INLINE) | (1L << INT) | (1L << LONG) | (1L << REGISTER) | (1L << RESTRICT) | (1L << SHORT) | (1L << SIGNED) | (1L << STATIC) | (1L << STRUCT) | (1L << TYPEDEF) | (1L << UNION) | (1L << UNSIGNED) | (1L << VOID) | (1L << VOLATILE) | (1L << BOOL) | (1L << Class) | (1L << BYCOPY) | (1L << BYREF) | (1L << ID) | (1L << IMP) | (1L << IN))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (INOUT - 64)) | (1L << (ONEWAY - 64)) | (1L << (OUT - 64)) | (1L << (PROTOCOL_ - 64)) | (1L << (SEL - 64)) | (1L << (SELF - 64)) | (1L << (SUPER - 64)) | (1L << (PROPERTY - 64)) | (1L << (ATOMIC - 64)) | (1L << (NONATOMIC - 64)) | (1L << (RETAIN - 64)) | (1L << (ATTRIBUTE - 64)) | (1L << (AUTORELEASING_QUALIFIER - 64)) | (1L << (BLOCK - 64)) | (1L << (BRIDGE - 64)) | (1L << (BRIDGE_RETAINED - 64)) | (1L << (BRIDGE_TRANSFER - 64)) | (1L << (COVARIANT - 64)) | (1L << (CONTRAVARIANT - 64)) | (1L << (DEPRECATED - 64)) | (1L << (KINDOF - 64)) | (1L << (STRONG_QUALIFIER - 64)) | (1L << (TYPEOF - 64)) | (1L << (UNSAFE_UNRETAINED_QUALIFIER - 64)) | (1L << (UNUSED - 64)) | (1L << (WEAK_QUALIFIER - 64)) | (1L << (NULL_UNSPECIFIED - 64)) | (1L << (NULLABLE - 64)) | (1L << (NONNULL - 64)) | (1L << (NULL_RESETTABLE - 64)) | (1L << (NS_INLINE - 64)) | (1L << (NS_ENUM - 64)) | (1L << (NS_OPTIONS - 64)) | (1L << (ASSIGN - 64)) | (1L << (COPY - 64)) | (1L << (GETTER - 64)) | (1L << (SETTER - 64)) | (1L << (STRONG - 64)))) != 0) || ((((_la - 128)) & ~0x3f) == 0 && ((1L << (_la - 128)) & ((1L << (READONLY - 128)) | (1L << (READWRITE - 128)) | (1L << (WEAK - 128)) | (1L << (UNSAFE_UNRETAINED - 128)) | (1L << (IB_OUTLET - 128)) | (1L << (IB_OUTLET_COLLECTION - 128)) | (1L << (IB_INSPECTABLE - 128)) | (1L << (IB_DESIGNABLE - 128)) | (1L << (IDENTIFIER - 128)) | (1L << (ADD - 128)) | (1L << (SUB - 128)))) != 0)) {
				{
				setState(745);
				interfaceDeclarationList();
				}
			}

			setState(748);
			match(END);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ClassImplementationContext extends ParserRuleContext {
		public GenericTypeSpecifierContext className;
		public IdentifierContext superclassName;
		public TerminalNode IMPLEMENTATION() { return getToken(LogosXXParser.IMPLEMENTATION, 0); }
		public TerminalNode END() { return getToken(LogosXXParser.END, 0); }
		public GenericTypeSpecifierContext genericTypeSpecifier() {
			return getRuleContext(GenericTypeSpecifierContext.class,0);
		}
		public TerminalNode COLON() { return getToken(LogosXXParser.COLON, 0); }
		public InstanceVariablesContext instanceVariables() {
			return getRuleContext(InstanceVariablesContext.class,0);
		}
		public ImplementationDefinitionListContext implementationDefinitionList() {
			return getRuleContext(ImplementationDefinitionListContext.class,0);
		}
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public ClassImplementationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classImplementation; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LogosXXParserListener ) ((LogosXXParserListener)listener).enterClassImplementation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LogosXXParserListener ) ((LogosXXParserListener)listener).exitClassImplementation(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LogosXXParserVisitor ) return ((LogosXXParserVisitor<? extends T>)visitor).visitClassImplementation(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ClassImplementationContext classImplementation() throws RecognitionException {
		ClassImplementationContext _localctx = new ClassImplementationContext(_ctx, getState());
		enterRule(_localctx, 72, RULE_classImplementation);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(750);
			match(IMPLEMENTATION);
			setState(751);
			((ClassImplementationContext)_localctx).className = genericTypeSpecifier();
			setState(754);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COLON) {
				{
				setState(752);
				match(COLON);
				setState(753);
				((ClassImplementationContext)_localctx).superclassName = identifier();
				}
			}

			setState(757);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LBRACE) {
				{
				setState(756);
				instanceVariables();
				}
			}

			setState(760);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << AUTO) | (1L << CHAR) | (1L << CONST) | (1L << DOUBLE) | (1L << ENUM) | (1L << EXTERN) | (1L << FLOAT) | (1L << INLINE) | (1L << INT) | (1L << LONG) | (1L << REGISTER) | (1L << RESTRICT) | (1L << SHORT) | (1L << SIGNED) | (1L << STATIC) | (1L << STRUCT) | (1L << TYPEDEF) | (1L << UNION) | (1L << UNSIGNED) | (1L << VOID) | (1L << VOLATILE) | (1L << BOOL) | (1L << Class) | (1L << BYCOPY) | (1L << BYREF) | (1L << ID) | (1L << IMP) | (1L << IN))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (INOUT - 64)) | (1L << (ONEWAY - 64)) | (1L << (OUT - 64)) | (1L << (PROTOCOL_ - 64)) | (1L << (SEL - 64)) | (1L << (SELF - 64)) | (1L << (SUPER - 64)) | (1L << (DYNAMIC - 64)) | (1L << (SYNTHESIZE - 64)) | (1L << (ATOMIC - 64)) | (1L << (NONATOMIC - 64)) | (1L << (RETAIN - 64)) | (1L << (ATTRIBUTE - 64)) | (1L << (AUTORELEASING_QUALIFIER - 64)) | (1L << (BLOCK - 64)) | (1L << (BRIDGE - 64)) | (1L << (BRIDGE_RETAINED - 64)) | (1L << (BRIDGE_TRANSFER - 64)) | (1L << (COVARIANT - 64)) | (1L << (CONTRAVARIANT - 64)) | (1L << (DEPRECATED - 64)) | (1L << (KINDOF - 64)) | (1L << (STRONG_QUALIFIER - 64)) | (1L << (TYPEOF - 64)) | (1L << (UNSAFE_UNRETAINED_QUALIFIER - 64)) | (1L << (UNUSED - 64)) | (1L << (WEAK_QUALIFIER - 64)) | (1L << (NULL_UNSPECIFIED - 64)) | (1L << (NULLABLE - 64)) | (1L << (NONNULL - 64)) | (1L << (NULL_RESETTABLE - 64)) | (1L << (NS_INLINE - 64)) | (1L << (NS_ENUM - 64)) | (1L << (NS_OPTIONS - 64)) | (1L << (ASSIGN - 64)) | (1L << (COPY - 64)) | (1L << (GETTER - 64)) | (1L << (SETTER - 64)) | (1L << (STRONG - 64)))) != 0) || ((((_la - 128)) & ~0x3f) == 0 && ((1L << (_la - 128)) & ((1L << (READONLY - 128)) | (1L << (READWRITE - 128)) | (1L << (WEAK - 128)) | (1L << (UNSAFE_UNRETAINED - 128)) | (1L << (IB_OUTLET - 128)) | (1L << (IB_OUTLET_COLLECTION - 128)) | (1L << (IB_INSPECTABLE - 128)) | (1L << (IB_DESIGNABLE - 128)) | (1L << (IDENTIFIER - 128)) | (1L << (ADD - 128)) | (1L << (SUB - 128)))) != 0)) {
				{
				setState(759);
				implementationDefinitionList();
				}
			}

			setState(762);
			match(END);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CategoryImplementationContext extends ParserRuleContext {
		public GenericTypeSpecifierContext categoryName;
		public IdentifierContext className;
		public TerminalNode IMPLEMENTATION() { return getToken(LogosXXParser.IMPLEMENTATION, 0); }
		public TerminalNode LP() { return getToken(LogosXXParser.LP, 0); }
		public TerminalNode RP() { return getToken(LogosXXParser.RP, 0); }
		public TerminalNode END() { return getToken(LogosXXParser.END, 0); }
		public GenericTypeSpecifierContext genericTypeSpecifier() {
			return getRuleContext(GenericTypeSpecifierContext.class,0);
		}
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public ImplementationDefinitionListContext implementationDefinitionList() {
			return getRuleContext(ImplementationDefinitionListContext.class,0);
		}
		public CategoryImplementationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_categoryImplementation; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LogosXXParserListener ) ((LogosXXParserListener)listener).enterCategoryImplementation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LogosXXParserListener ) ((LogosXXParserListener)listener).exitCategoryImplementation(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LogosXXParserVisitor ) return ((LogosXXParserVisitor<? extends T>)visitor).visitCategoryImplementation(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CategoryImplementationContext categoryImplementation() throws RecognitionException {
		CategoryImplementationContext _localctx = new CategoryImplementationContext(_ctx, getState());
		enterRule(_localctx, 74, RULE_categoryImplementation);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(764);
			match(IMPLEMENTATION);
			setState(765);
			((CategoryImplementationContext)_localctx).categoryName = genericTypeSpecifier();
			setState(766);
			match(LP);
			setState(767);
			((CategoryImplementationContext)_localctx).className = identifier();
			setState(768);
			match(RP);
			setState(770);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << AUTO) | (1L << CHAR) | (1L << CONST) | (1L << DOUBLE) | (1L << ENUM) | (1L << EXTERN) | (1L << FLOAT) | (1L << INLINE) | (1L << INT) | (1L << LONG) | (1L << REGISTER) | (1L << RESTRICT) | (1L << SHORT) | (1L << SIGNED) | (1L << STATIC) | (1L << STRUCT) | (1L << TYPEDEF) | (1L << UNION) | (1L << UNSIGNED) | (1L << VOID) | (1L << VOLATILE) | (1L << BOOL) | (1L << Class) | (1L << BYCOPY) | (1L << BYREF) | (1L << ID) | (1L << IMP) | (1L << IN))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (INOUT - 64)) | (1L << (ONEWAY - 64)) | (1L << (OUT - 64)) | (1L << (PROTOCOL_ - 64)) | (1L << (SEL - 64)) | (1L << (SELF - 64)) | (1L << (SUPER - 64)) | (1L << (DYNAMIC - 64)) | (1L << (SYNTHESIZE - 64)) | (1L << (ATOMIC - 64)) | (1L << (NONATOMIC - 64)) | (1L << (RETAIN - 64)) | (1L << (ATTRIBUTE - 64)) | (1L << (AUTORELEASING_QUALIFIER - 64)) | (1L << (BLOCK - 64)) | (1L << (BRIDGE - 64)) | (1L << (BRIDGE_RETAINED - 64)) | (1L << (BRIDGE_TRANSFER - 64)) | (1L << (COVARIANT - 64)) | (1L << (CONTRAVARIANT - 64)) | (1L << (DEPRECATED - 64)) | (1L << (KINDOF - 64)) | (1L << (STRONG_QUALIFIER - 64)) | (1L << (TYPEOF - 64)) | (1L << (UNSAFE_UNRETAINED_QUALIFIER - 64)) | (1L << (UNUSED - 64)) | (1L << (WEAK_QUALIFIER - 64)) | (1L << (NULL_UNSPECIFIED - 64)) | (1L << (NULLABLE - 64)) | (1L << (NONNULL - 64)) | (1L << (NULL_RESETTABLE - 64)) | (1L << (NS_INLINE - 64)) | (1L << (NS_ENUM - 64)) | (1L << (NS_OPTIONS - 64)) | (1L << (ASSIGN - 64)) | (1L << (COPY - 64)) | (1L << (GETTER - 64)) | (1L << (SETTER - 64)) | (1L << (STRONG - 64)))) != 0) || ((((_la - 128)) & ~0x3f) == 0 && ((1L << (_la - 128)) & ((1L << (READONLY - 128)) | (1L << (READWRITE - 128)) | (1L << (WEAK - 128)) | (1L << (UNSAFE_UNRETAINED - 128)) | (1L << (IB_OUTLET - 128)) | (1L << (IB_OUTLET_COLLECTION - 128)) | (1L << (IB_INSPECTABLE - 128)) | (1L << (IB_DESIGNABLE - 128)) | (1L << (IDENTIFIER - 128)) | (1L << (ADD - 128)) | (1L << (SUB - 128)))) != 0)) {
				{
				setState(769);
				implementationDefinitionList();
				}
			}

			setState(772);
			match(END);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class GenericTypeSpecifierContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public GenericsSpecifierContext genericsSpecifier() {
			return getRuleContext(GenericsSpecifierContext.class,0);
		}
		public TerminalNode LT() { return getToken(LogosXXParser.LT, 0); }
		public ProtocolListContext protocolList() {
			return getRuleContext(ProtocolListContext.class,0);
		}
		public TerminalNode GT() { return getToken(LogosXXParser.GT, 0); }
		public GenericTypeSpecifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_genericTypeSpecifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LogosXXParserListener ) ((LogosXXParserListener)listener).enterGenericTypeSpecifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LogosXXParserListener ) ((LogosXXParserListener)listener).exitGenericTypeSpecifier(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LogosXXParserVisitor ) return ((LogosXXParserVisitor<? extends T>)visitor).visitGenericTypeSpecifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final GenericTypeSpecifierContext genericTypeSpecifier() throws RecognitionException {
		GenericTypeSpecifierContext _localctx = new GenericTypeSpecifierContext(_ctx, getState());
		enterRule(_localctx, 76, RULE_genericTypeSpecifier);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(774);
			identifier();
			setState(780);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,60,_ctx) ) {
			case 1:
				{
				{
				setState(775);
				match(LT);
				setState(776);
				protocolList();
				setState(777);
				match(GT);
				}
				}
				break;
			case 2:
				{
				setState(779);
				genericsSpecifier();
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ProtocolDeclarationContext extends ParserRuleContext {
		public TerminalNode PROTOCOL() { return getToken(LogosXXParser.PROTOCOL, 0); }
		public ProtocolNameContext protocolName() {
			return getRuleContext(ProtocolNameContext.class,0);
		}
		public TerminalNode END() { return getToken(LogosXXParser.END, 0); }
		public TerminalNode LT() { return getToken(LogosXXParser.LT, 0); }
		public ProtocolListContext protocolList() {
			return getRuleContext(ProtocolListContext.class,0);
		}
		public TerminalNode GT() { return getToken(LogosXXParser.GT, 0); }
		public List<ProtocolDeclarationSectionContext> protocolDeclarationSection() {
			return getRuleContexts(ProtocolDeclarationSectionContext.class);
		}
		public ProtocolDeclarationSectionContext protocolDeclarationSection(int i) {
			return getRuleContext(ProtocolDeclarationSectionContext.class,i);
		}
		public ProtocolDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_protocolDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LogosXXParserListener ) ((LogosXXParserListener)listener).enterProtocolDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LogosXXParserListener ) ((LogosXXParserListener)listener).exitProtocolDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LogosXXParserVisitor ) return ((LogosXXParserVisitor<? extends T>)visitor).visitProtocolDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProtocolDeclarationContext protocolDeclaration() throws RecognitionException {
		ProtocolDeclarationContext _localctx = new ProtocolDeclarationContext(_ctx, getState());
		enterRule(_localctx, 78, RULE_protocolDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(782);
			match(PROTOCOL);
			setState(783);
			protocolName();
			setState(788);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LT) {
				{
				setState(784);
				match(LT);
				setState(785);
				protocolList();
				setState(786);
				match(GT);
				}
			}

			setState(793);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << AUTO) | (1L << CHAR) | (1L << CONST) | (1L << DOUBLE) | (1L << ENUM) | (1L << EXTERN) | (1L << FLOAT) | (1L << INLINE) | (1L << INT) | (1L << LONG) | (1L << REGISTER) | (1L << RESTRICT) | (1L << SHORT) | (1L << SIGNED) | (1L << STATIC) | (1L << STRUCT) | (1L << TYPEDEF) | (1L << UNION) | (1L << UNSIGNED) | (1L << VOID) | (1L << VOLATILE) | (1L << BOOL) | (1L << Class) | (1L << BYCOPY) | (1L << BYREF) | (1L << ID) | (1L << IMP) | (1L << IN))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (INOUT - 64)) | (1L << (ONEWAY - 64)) | (1L << (OUT - 64)) | (1L << (PROTOCOL_ - 64)) | (1L << (SEL - 64)) | (1L << (SELF - 64)) | (1L << (SUPER - 64)) | (1L << (OPTIONAL - 64)) | (1L << (PROPERTY - 64)) | (1L << (REQUIRED - 64)) | (1L << (ATOMIC - 64)) | (1L << (NONATOMIC - 64)) | (1L << (RETAIN - 64)) | (1L << (ATTRIBUTE - 64)) | (1L << (AUTORELEASING_QUALIFIER - 64)) | (1L << (BLOCK - 64)) | (1L << (BRIDGE - 64)) | (1L << (BRIDGE_RETAINED - 64)) | (1L << (BRIDGE_TRANSFER - 64)) | (1L << (COVARIANT - 64)) | (1L << (CONTRAVARIANT - 64)) | (1L << (DEPRECATED - 64)) | (1L << (KINDOF - 64)) | (1L << (STRONG_QUALIFIER - 64)) | (1L << (TYPEOF - 64)) | (1L << (UNSAFE_UNRETAINED_QUALIFIER - 64)) | (1L << (UNUSED - 64)) | (1L << (WEAK_QUALIFIER - 64)) | (1L << (NULL_UNSPECIFIED - 64)) | (1L << (NULLABLE - 64)) | (1L << (NONNULL - 64)) | (1L << (NULL_RESETTABLE - 64)) | (1L << (NS_INLINE - 64)) | (1L << (NS_ENUM - 64)) | (1L << (NS_OPTIONS - 64)) | (1L << (ASSIGN - 64)) | (1L << (COPY - 64)) | (1L << (GETTER - 64)) | (1L << (SETTER - 64)) | (1L << (STRONG - 64)))) != 0) || ((((_la - 128)) & ~0x3f) == 0 && ((1L << (_la - 128)) & ((1L << (READONLY - 128)) | (1L << (READWRITE - 128)) | (1L << (WEAK - 128)) | (1L << (UNSAFE_UNRETAINED - 128)) | (1L << (IB_OUTLET - 128)) | (1L << (IB_OUTLET_COLLECTION - 128)) | (1L << (IB_INSPECTABLE - 128)) | (1L << (IB_DESIGNABLE - 128)) | (1L << (IDENTIFIER - 128)) | (1L << (ADD - 128)) | (1L << (SUB - 128)))) != 0)) {
				{
				{
				setState(790);
				protocolDeclarationSection();
				}
				}
				setState(795);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(796);
			match(END);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ProtocolDeclarationSectionContext extends ParserRuleContext {
		public Token modifier;
		public TerminalNode REQUIRED() { return getToken(LogosXXParser.REQUIRED, 0); }
		public TerminalNode OPTIONAL() { return getToken(LogosXXParser.OPTIONAL, 0); }
		public List<InterfaceDeclarationListContext> interfaceDeclarationList() {
			return getRuleContexts(InterfaceDeclarationListContext.class);
		}
		public InterfaceDeclarationListContext interfaceDeclarationList(int i) {
			return getRuleContext(InterfaceDeclarationListContext.class,i);
		}
		public ProtocolDeclarationSectionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_protocolDeclarationSection; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LogosXXParserListener ) ((LogosXXParserListener)listener).enterProtocolDeclarationSection(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LogosXXParserListener ) ((LogosXXParserListener)listener).exitProtocolDeclarationSection(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LogosXXParserVisitor ) return ((LogosXXParserVisitor<? extends T>)visitor).visitProtocolDeclarationSection(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProtocolDeclarationSectionContext protocolDeclarationSection() throws RecognitionException {
		ProtocolDeclarationSectionContext _localctx = new ProtocolDeclarationSectionContext(_ctx, getState());
		enterRule(_localctx, 80, RULE_protocolDeclarationSection);
		int _la;
		try {
			int _alt;
			setState(810);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case OPTIONAL:
			case REQUIRED:
				enterOuterAlt(_localctx, 1);
				{
				setState(798);
				((ProtocolDeclarationSectionContext)_localctx).modifier = _input.LT(1);
				_la = _input.LA(1);
				if ( !(_la==OPTIONAL || _la==REQUIRED) ) {
					((ProtocolDeclarationSectionContext)_localctx).modifier = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(802);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,63,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(799);
						interfaceDeclarationList();
						}
						} 
					}
					setState(804);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,63,_ctx);
				}
				}
				break;
			case AUTO:
			case CHAR:
			case CONST:
			case DOUBLE:
			case ENUM:
			case EXTERN:
			case FLOAT:
			case INLINE:
			case INT:
			case LONG:
			case REGISTER:
			case RESTRICT:
			case SHORT:
			case SIGNED:
			case STATIC:
			case STRUCT:
			case TYPEDEF:
			case UNION:
			case UNSIGNED:
			case VOID:
			case VOLATILE:
			case BOOL:
			case Class:
			case BYCOPY:
			case BYREF:
			case ID:
			case IMP:
			case IN:
			case INOUT:
			case ONEWAY:
			case OUT:
			case PROTOCOL_:
			case SEL:
			case SELF:
			case SUPER:
			case PROPERTY:
			case ATOMIC:
			case NONATOMIC:
			case RETAIN:
			case ATTRIBUTE:
			case AUTORELEASING_QUALIFIER:
			case BLOCK:
			case BRIDGE:
			case BRIDGE_RETAINED:
			case BRIDGE_TRANSFER:
			case COVARIANT:
			case CONTRAVARIANT:
			case DEPRECATED:
			case KINDOF:
			case STRONG_QUALIFIER:
			case TYPEOF:
			case UNSAFE_UNRETAINED_QUALIFIER:
			case UNUSED:
			case WEAK_QUALIFIER:
			case NULL_UNSPECIFIED:
			case NULLABLE:
			case NONNULL:
			case NULL_RESETTABLE:
			case NS_INLINE:
			case NS_ENUM:
			case NS_OPTIONS:
			case ASSIGN:
			case COPY:
			case GETTER:
			case SETTER:
			case STRONG:
			case READONLY:
			case READWRITE:
			case WEAK:
			case UNSAFE_UNRETAINED:
			case IB_OUTLET:
			case IB_OUTLET_COLLECTION:
			case IB_INSPECTABLE:
			case IB_DESIGNABLE:
			case IDENTIFIER:
			case ADD:
			case SUB:
				enterOuterAlt(_localctx, 2);
				{
				setState(806); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(805);
						interfaceDeclarationList();
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(808); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,64,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ProtocolDeclarationListContext extends ParserRuleContext {
		public TerminalNode PROTOCOL() { return getToken(LogosXXParser.PROTOCOL, 0); }
		public ProtocolListContext protocolList() {
			return getRuleContext(ProtocolListContext.class,0);
		}
		public TerminalNode SEMI() { return getToken(LogosXXParser.SEMI, 0); }
		public ProtocolDeclarationListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_protocolDeclarationList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LogosXXParserListener ) ((LogosXXParserListener)listener).enterProtocolDeclarationList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LogosXXParserListener ) ((LogosXXParserListener)listener).exitProtocolDeclarationList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LogosXXParserVisitor ) return ((LogosXXParserVisitor<? extends T>)visitor).visitProtocolDeclarationList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProtocolDeclarationListContext protocolDeclarationList() throws RecognitionException {
		ProtocolDeclarationListContext _localctx = new ProtocolDeclarationListContext(_ctx, getState());
		enterRule(_localctx, 82, RULE_protocolDeclarationList);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(812);
			match(PROTOCOL);
			setState(813);
			protocolList();
			setState(814);
			match(SEMI);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ClassDeclarationListContext extends ParserRuleContext {
		public TerminalNode CLASS() { return getToken(LogosXXParser.CLASS, 0); }
		public List<IdentifierContext> identifier() {
			return getRuleContexts(IdentifierContext.class);
		}
		public IdentifierContext identifier(int i) {
			return getRuleContext(IdentifierContext.class,i);
		}
		public TerminalNode SEMI() { return getToken(LogosXXParser.SEMI, 0); }
		public List<TerminalNode> COMMA() { return getTokens(LogosXXParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(LogosXXParser.COMMA, i);
		}
		public ClassDeclarationListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classDeclarationList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LogosXXParserListener ) ((LogosXXParserListener)listener).enterClassDeclarationList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LogosXXParserListener ) ((LogosXXParserListener)listener).exitClassDeclarationList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LogosXXParserVisitor ) return ((LogosXXParserVisitor<? extends T>)visitor).visitClassDeclarationList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ClassDeclarationListContext classDeclarationList() throws RecognitionException {
		ClassDeclarationListContext _localctx = new ClassDeclarationListContext(_ctx, getState());
		enterRule(_localctx, 84, RULE_classDeclarationList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(816);
			match(CLASS);
			setState(817);
			identifier();
			setState(822);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(818);
				match(COMMA);
				setState(819);
				identifier();
				}
				}
				setState(824);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(825);
			match(SEMI);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ProtocolListContext extends ParserRuleContext {
		public List<ProtocolNameContext> protocolName() {
			return getRuleContexts(ProtocolNameContext.class);
		}
		public ProtocolNameContext protocolName(int i) {
			return getRuleContext(ProtocolNameContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(LogosXXParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(LogosXXParser.COMMA, i);
		}
		public ProtocolListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_protocolList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LogosXXParserListener ) ((LogosXXParserListener)listener).enterProtocolList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LogosXXParserListener ) ((LogosXXParserListener)listener).exitProtocolList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LogosXXParserVisitor ) return ((LogosXXParserVisitor<? extends T>)visitor).visitProtocolList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProtocolListContext protocolList() throws RecognitionException {
		ProtocolListContext _localctx = new ProtocolListContext(_ctx, getState());
		enterRule(_localctx, 86, RULE_protocolList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(827);
			protocolName();
			setState(832);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(828);
				match(COMMA);
				setState(829);
				protocolName();
				}
				}
				setState(834);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PropertyDeclarationContext extends ParserRuleContext {
		public TerminalNode PROPERTY() { return getToken(LogosXXParser.PROPERTY, 0); }
		public FieldDeclarationContext fieldDeclaration() {
			return getRuleContext(FieldDeclarationContext.class,0);
		}
		public TerminalNode LP() { return getToken(LogosXXParser.LP, 0); }
		public PropertyAttributesListContext propertyAttributesList() {
			return getRuleContext(PropertyAttributesListContext.class,0);
		}
		public TerminalNode RP() { return getToken(LogosXXParser.RP, 0); }
		public IbOutletQualifierContext ibOutletQualifier() {
			return getRuleContext(IbOutletQualifierContext.class,0);
		}
		public TerminalNode IB_INSPECTABLE() { return getToken(LogosXXParser.IB_INSPECTABLE, 0); }
		public PropertyDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_propertyDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LogosXXParserListener ) ((LogosXXParserListener)listener).enterPropertyDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LogosXXParserListener ) ((LogosXXParserListener)listener).exitPropertyDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LogosXXParserVisitor ) return ((LogosXXParserVisitor<? extends T>)visitor).visitPropertyDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PropertyDeclarationContext propertyDeclaration() throws RecognitionException {
		PropertyDeclarationContext _localctx = new PropertyDeclarationContext(_ctx, getState());
		enterRule(_localctx, 88, RULE_propertyDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(835);
			match(PROPERTY);
			setState(840);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LP) {
				{
				setState(836);
				match(LP);
				setState(837);
				propertyAttributesList();
				setState(838);
				match(RP);
				}
			}

			setState(843);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,69,_ctx) ) {
			case 1:
				{
				setState(842);
				ibOutletQualifier();
				}
				break;
			}
			setState(846);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,70,_ctx) ) {
			case 1:
				{
				setState(845);
				match(IB_INSPECTABLE);
				}
				break;
			}
			setState(848);
			fieldDeclaration();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PropertyAttributesListContext extends ParserRuleContext {
		public List<PropertyAttributeContext> propertyAttribute() {
			return getRuleContexts(PropertyAttributeContext.class);
		}
		public PropertyAttributeContext propertyAttribute(int i) {
			return getRuleContext(PropertyAttributeContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(LogosXXParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(LogosXXParser.COMMA, i);
		}
		public PropertyAttributesListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_propertyAttributesList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LogosXXParserListener ) ((LogosXXParserListener)listener).enterPropertyAttributesList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LogosXXParserListener ) ((LogosXXParserListener)listener).exitPropertyAttributesList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LogosXXParserVisitor ) return ((LogosXXParserVisitor<? extends T>)visitor).visitPropertyAttributesList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PropertyAttributesListContext propertyAttributesList() throws RecognitionException {
		PropertyAttributesListContext _localctx = new PropertyAttributesListContext(_ctx, getState());
		enterRule(_localctx, 90, RULE_propertyAttributesList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(850);
			propertyAttribute();
			setState(855);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(851);
				match(COMMA);
				setState(852);
				propertyAttribute();
				}
				}
				setState(857);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PropertyAttributeContext extends ParserRuleContext {
		public TerminalNode ATOMIC() { return getToken(LogosXXParser.ATOMIC, 0); }
		public TerminalNode NONATOMIC() { return getToken(LogosXXParser.NONATOMIC, 0); }
		public TerminalNode STRONG() { return getToken(LogosXXParser.STRONG, 0); }
		public TerminalNode WEAK() { return getToken(LogosXXParser.WEAK, 0); }
		public TerminalNode RETAIN() { return getToken(LogosXXParser.RETAIN, 0); }
		public TerminalNode ASSIGN() { return getToken(LogosXXParser.ASSIGN, 0); }
		public TerminalNode UNSAFE_UNRETAINED() { return getToken(LogosXXParser.UNSAFE_UNRETAINED, 0); }
		public TerminalNode COPY() { return getToken(LogosXXParser.COPY, 0); }
		public TerminalNode READONLY() { return getToken(LogosXXParser.READONLY, 0); }
		public TerminalNode READWRITE() { return getToken(LogosXXParser.READWRITE, 0); }
		public TerminalNode GETTER() { return getToken(LogosXXParser.GETTER, 0); }
		public TerminalNode ASSIGNMENT() { return getToken(LogosXXParser.ASSIGNMENT, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode SETTER() { return getToken(LogosXXParser.SETTER, 0); }
		public TerminalNode COLON() { return getToken(LogosXXParser.COLON, 0); }
		public NullabilitySpecifierContext nullabilitySpecifier() {
			return getRuleContext(NullabilitySpecifierContext.class,0);
		}
		public PropertyAttributeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_propertyAttribute; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LogosXXParserListener ) ((LogosXXParserListener)listener).enterPropertyAttribute(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LogosXXParserListener ) ((LogosXXParserListener)listener).exitPropertyAttribute(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LogosXXParserVisitor ) return ((LogosXXParserVisitor<? extends T>)visitor).visitPropertyAttribute(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PropertyAttributeContext propertyAttribute() throws RecognitionException {
		PropertyAttributeContext _localctx = new PropertyAttributeContext(_ctx, getState());
		enterRule(_localctx, 92, RULE_propertyAttribute);
		try {
			setState(878);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,72,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(858);
				match(ATOMIC);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(859);
				match(NONATOMIC);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(860);
				match(STRONG);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(861);
				match(WEAK);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(862);
				match(RETAIN);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(863);
				match(ASSIGN);
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(864);
				match(UNSAFE_UNRETAINED);
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(865);
				match(COPY);
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(866);
				match(READONLY);
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(867);
				match(READWRITE);
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(868);
				match(GETTER);
				setState(869);
				match(ASSIGNMENT);
				setState(870);
				identifier();
				}
				break;
			case 12:
				enterOuterAlt(_localctx, 12);
				{
				setState(871);
				match(SETTER);
				setState(872);
				match(ASSIGNMENT);
				setState(873);
				identifier();
				setState(874);
				match(COLON);
				}
				break;
			case 13:
				enterOuterAlt(_localctx, 13);
				{
				setState(876);
				nullabilitySpecifier();
				}
				break;
			case 14:
				enterOuterAlt(_localctx, 14);
				{
				setState(877);
				identifier();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ProtocolNameContext extends ParserRuleContext {
		public TerminalNode LT() { return getToken(LogosXXParser.LT, 0); }
		public ProtocolListContext protocolList() {
			return getRuleContext(ProtocolListContext.class,0);
		}
		public TerminalNode GT() { return getToken(LogosXXParser.GT, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode COVARIANT() { return getToken(LogosXXParser.COVARIANT, 0); }
		public TerminalNode CONTRAVARIANT() { return getToken(LogosXXParser.CONTRAVARIANT, 0); }
		public ProtocolNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_protocolName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LogosXXParserListener ) ((LogosXXParserListener)listener).enterProtocolName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LogosXXParserListener ) ((LogosXXParserListener)listener).exitProtocolName(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LogosXXParserVisitor ) return ((LogosXXParserVisitor<? extends T>)visitor).visitProtocolName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProtocolNameContext protocolName() throws RecognitionException {
		ProtocolNameContext _localctx = new ProtocolNameContext(_ctx, getState());
		enterRule(_localctx, 94, RULE_protocolName);
		int _la;
		try {
			setState(888);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LT:
				enterOuterAlt(_localctx, 1);
				{
				setState(880);
				match(LT);
				setState(881);
				protocolList();
				setState(882);
				match(GT);
				}
				break;
			case BOOL:
			case Class:
			case BYCOPY:
			case BYREF:
			case ID:
			case IMP:
			case IN:
			case INOUT:
			case ONEWAY:
			case OUT:
			case PROTOCOL_:
			case SEL:
			case SELF:
			case SUPER:
			case ATOMIC:
			case NONATOMIC:
			case RETAIN:
			case AUTORELEASING_QUALIFIER:
			case BLOCK:
			case BRIDGE_RETAINED:
			case BRIDGE_TRANSFER:
			case COVARIANT:
			case CONTRAVARIANT:
			case DEPRECATED:
			case KINDOF:
			case UNUSED:
			case NULL_UNSPECIFIED:
			case NULLABLE:
			case NONNULL:
			case NULL_RESETTABLE:
			case NS_INLINE:
			case NS_ENUM:
			case NS_OPTIONS:
			case ASSIGN:
			case COPY:
			case GETTER:
			case SETTER:
			case STRONG:
			case READONLY:
			case READWRITE:
			case WEAK:
			case UNSAFE_UNRETAINED:
			case IB_OUTLET:
			case IB_OUTLET_COLLECTION:
			case IB_INSPECTABLE:
			case IB_DESIGNABLE:
			case IDENTIFIER:
				enterOuterAlt(_localctx, 2);
				{
				setState(885);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,73,_ctx) ) {
				case 1:
					{
					setState(884);
					_la = _input.LA(1);
					if ( !(_la==COVARIANT || _la==CONTRAVARIANT) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					}
					break;
				}
				setState(887);
				identifier();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class InstanceVariablesContext extends ParserRuleContext {
		public TerminalNode LBRACE() { return getToken(LogosXXParser.LBRACE, 0); }
		public TerminalNode RBRACE() { return getToken(LogosXXParser.RBRACE, 0); }
		public List<VisibilitySectionContext> visibilitySection() {
			return getRuleContexts(VisibilitySectionContext.class);
		}
		public VisibilitySectionContext visibilitySection(int i) {
			return getRuleContext(VisibilitySectionContext.class,i);
		}
		public InstanceVariablesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_instanceVariables; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LogosXXParserListener ) ((LogosXXParserListener)listener).enterInstanceVariables(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LogosXXParserListener ) ((LogosXXParserListener)listener).exitInstanceVariables(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LogosXXParserVisitor ) return ((LogosXXParserVisitor<? extends T>)visitor).visitInstanceVariables(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InstanceVariablesContext instanceVariables() throws RecognitionException {
		InstanceVariablesContext _localctx = new InstanceVariablesContext(_ctx, getState());
		enterRule(_localctx, 96, RULE_instanceVariables);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(890);
			match(LBRACE);
			setState(894);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((((_la - 21)) & ~0x3f) == 0 && ((1L << (_la - 21)) & ((1L << (CHAR - 21)) | (1L << (CONST - 21)) | (1L << (DOUBLE - 21)) | (1L << (ENUM - 21)) | (1L << (FLOAT - 21)) | (1L << (INLINE - 21)) | (1L << (INT - 21)) | (1L << (LONG - 21)) | (1L << (RESTRICT - 21)) | (1L << (SHORT - 21)) | (1L << (SIGNED - 21)) | (1L << (STRUCT - 21)) | (1L << (UNION - 21)) | (1L << (UNSIGNED - 21)) | (1L << (VOID - 21)) | (1L << (VOLATILE - 21)) | (1L << (BOOL - 21)) | (1L << (Class - 21)) | (1L << (BYCOPY - 21)) | (1L << (BYREF - 21)) | (1L << (ID - 21)) | (1L << (IMP - 21)) | (1L << (IN - 21)) | (1L << (INOUT - 21)) | (1L << (ONEWAY - 21)) | (1L << (OUT - 21)) | (1L << (PROTOCOL_ - 21)) | (1L << (SEL - 21)) | (1L << (SELF - 21)) | (1L << (SUPER - 21)))) != 0) || ((((_la - 85)) & ~0x3f) == 0 && ((1L << (_la - 85)) & ((1L << (PACKAGE - 85)) | (1L << (PRIVATE - 85)) | (1L << (PROTECTED - 85)) | (1L << (PUBLIC - 85)) | (1L << (ATOMIC - 85)) | (1L << (NONATOMIC - 85)) | (1L << (RETAIN - 85)) | (1L << (AUTORELEASING_QUALIFIER - 85)) | (1L << (BLOCK - 85)) | (1L << (BRIDGE - 85)) | (1L << (BRIDGE_RETAINED - 85)) | (1L << (BRIDGE_TRANSFER - 85)) | (1L << (COVARIANT - 85)) | (1L << (CONTRAVARIANT - 85)) | (1L << (DEPRECATED - 85)) | (1L << (KINDOF - 85)) | (1L << (STRONG_QUALIFIER - 85)) | (1L << (TYPEOF - 85)) | (1L << (UNSAFE_UNRETAINED_QUALIFIER - 85)) | (1L << (UNUSED - 85)) | (1L << (WEAK_QUALIFIER - 85)) | (1L << (NULL_UNSPECIFIED - 85)) | (1L << (NULLABLE - 85)) | (1L << (NONNULL - 85)) | (1L << (NULL_RESETTABLE - 85)) | (1L << (NS_INLINE - 85)) | (1L << (NS_ENUM - 85)) | (1L << (NS_OPTIONS - 85)) | (1L << (ASSIGN - 85)) | (1L << (COPY - 85)) | (1L << (GETTER - 85)) | (1L << (SETTER - 85)) | (1L << (STRONG - 85)) | (1L << (READONLY - 85)) | (1L << (READWRITE - 85)) | (1L << (WEAK - 85)) | (1L << (UNSAFE_UNRETAINED - 85)) | (1L << (IB_OUTLET - 85)) | (1L << (IB_OUTLET_COLLECTION - 85)) | (1L << (IB_INSPECTABLE - 85)) | (1L << (IB_DESIGNABLE - 85)) | (1L << (IDENTIFIER - 85)))) != 0)) {
				{
				{
				setState(891);
				visibilitySection();
				}
				}
				setState(896);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(897);
			match(RBRACE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class VisibilitySectionContext extends ParserRuleContext {
		public AccessModifierContext accessModifier() {
			return getRuleContext(AccessModifierContext.class,0);
		}
		public List<FieldDeclarationContext> fieldDeclaration() {
			return getRuleContexts(FieldDeclarationContext.class);
		}
		public FieldDeclarationContext fieldDeclaration(int i) {
			return getRuleContext(FieldDeclarationContext.class,i);
		}
		public VisibilitySectionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_visibilitySection; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LogosXXParserListener ) ((LogosXXParserListener)listener).enterVisibilitySection(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LogosXXParserListener ) ((LogosXXParserListener)listener).exitVisibilitySection(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LogosXXParserVisitor ) return ((LogosXXParserVisitor<? extends T>)visitor).visitVisibilitySection(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VisibilitySectionContext visibilitySection() throws RecognitionException {
		VisibilitySectionContext _localctx = new VisibilitySectionContext(_ctx, getState());
		enterRule(_localctx, 98, RULE_visibilitySection);
		try {
			int _alt;
			setState(911);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case PACKAGE:
			case PRIVATE:
			case PROTECTED:
			case PUBLIC:
				enterOuterAlt(_localctx, 1);
				{
				setState(899);
				accessModifier();
				setState(903);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,76,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(900);
						fieldDeclaration();
						}
						} 
					}
					setState(905);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,76,_ctx);
				}
				}
				break;
			case CHAR:
			case CONST:
			case DOUBLE:
			case ENUM:
			case FLOAT:
			case INLINE:
			case INT:
			case LONG:
			case RESTRICT:
			case SHORT:
			case SIGNED:
			case STRUCT:
			case UNION:
			case UNSIGNED:
			case VOID:
			case VOLATILE:
			case BOOL:
			case Class:
			case BYCOPY:
			case BYREF:
			case ID:
			case IMP:
			case IN:
			case INOUT:
			case ONEWAY:
			case OUT:
			case PROTOCOL_:
			case SEL:
			case SELF:
			case SUPER:
			case ATOMIC:
			case NONATOMIC:
			case RETAIN:
			case AUTORELEASING_QUALIFIER:
			case BLOCK:
			case BRIDGE:
			case BRIDGE_RETAINED:
			case BRIDGE_TRANSFER:
			case COVARIANT:
			case CONTRAVARIANT:
			case DEPRECATED:
			case KINDOF:
			case STRONG_QUALIFIER:
			case TYPEOF:
			case UNSAFE_UNRETAINED_QUALIFIER:
			case UNUSED:
			case WEAK_QUALIFIER:
			case NULL_UNSPECIFIED:
			case NULLABLE:
			case NONNULL:
			case NULL_RESETTABLE:
			case NS_INLINE:
			case NS_ENUM:
			case NS_OPTIONS:
			case ASSIGN:
			case COPY:
			case GETTER:
			case SETTER:
			case STRONG:
			case READONLY:
			case READWRITE:
			case WEAK:
			case UNSAFE_UNRETAINED:
			case IB_OUTLET:
			case IB_OUTLET_COLLECTION:
			case IB_INSPECTABLE:
			case IB_DESIGNABLE:
			case IDENTIFIER:
				enterOuterAlt(_localctx, 2);
				{
				setState(907); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(906);
						fieldDeclaration();
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(909); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,77,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AccessModifierContext extends ParserRuleContext {
		public TerminalNode PRIVATE() { return getToken(LogosXXParser.PRIVATE, 0); }
		public TerminalNode PROTECTED() { return getToken(LogosXXParser.PROTECTED, 0); }
		public TerminalNode PACKAGE() { return getToken(LogosXXParser.PACKAGE, 0); }
		public TerminalNode PUBLIC() { return getToken(LogosXXParser.PUBLIC, 0); }
		public AccessModifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_accessModifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LogosXXParserListener ) ((LogosXXParserListener)listener).enterAccessModifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LogosXXParserListener ) ((LogosXXParserListener)listener).exitAccessModifier(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LogosXXParserVisitor ) return ((LogosXXParserVisitor<? extends T>)visitor).visitAccessModifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AccessModifierContext accessModifier() throws RecognitionException {
		AccessModifierContext _localctx = new AccessModifierContext(_ctx, getState());
		enterRule(_localctx, 100, RULE_accessModifier);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(913);
			_la = _input.LA(1);
			if ( !(((((_la - 85)) & ~0x3f) == 0 && ((1L << (_la - 85)) & ((1L << (PACKAGE - 85)) | (1L << (PRIVATE - 85)) | (1L << (PROTECTED - 85)) | (1L << (PUBLIC - 85)))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class InterfaceDeclarationListContext extends ParserRuleContext {
		public List<DeclarationContext> declaration() {
			return getRuleContexts(DeclarationContext.class);
		}
		public DeclarationContext declaration(int i) {
			return getRuleContext(DeclarationContext.class,i);
		}
		public List<ClassMethodDeclarationContext> classMethodDeclaration() {
			return getRuleContexts(ClassMethodDeclarationContext.class);
		}
		public ClassMethodDeclarationContext classMethodDeclaration(int i) {
			return getRuleContext(ClassMethodDeclarationContext.class,i);
		}
		public List<InstanceMethodDeclarationContext> instanceMethodDeclaration() {
			return getRuleContexts(InstanceMethodDeclarationContext.class);
		}
		public InstanceMethodDeclarationContext instanceMethodDeclaration(int i) {
			return getRuleContext(InstanceMethodDeclarationContext.class,i);
		}
		public List<PropertyDeclarationContext> propertyDeclaration() {
			return getRuleContexts(PropertyDeclarationContext.class);
		}
		public PropertyDeclarationContext propertyDeclaration(int i) {
			return getRuleContext(PropertyDeclarationContext.class,i);
		}
		public List<FunctionDeclarationContext> functionDeclaration() {
			return getRuleContexts(FunctionDeclarationContext.class);
		}
		public FunctionDeclarationContext functionDeclaration(int i) {
			return getRuleContext(FunctionDeclarationContext.class,i);
		}
		public InterfaceDeclarationListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_interfaceDeclarationList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LogosXXParserListener ) ((LogosXXParserListener)listener).enterInterfaceDeclarationList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LogosXXParserListener ) ((LogosXXParserListener)listener).exitInterfaceDeclarationList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LogosXXParserVisitor ) return ((LogosXXParserVisitor<? extends T>)visitor).visitInterfaceDeclarationList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InterfaceDeclarationListContext interfaceDeclarationList() throws RecognitionException {
		InterfaceDeclarationListContext _localctx = new InterfaceDeclarationListContext(_ctx, getState());
		enterRule(_localctx, 102, RULE_interfaceDeclarationList);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(920); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					setState(920);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,79,_ctx) ) {
					case 1:
						{
						setState(915);
						declaration();
						}
						break;
					case 2:
						{
						setState(916);
						classMethodDeclaration();
						}
						break;
					case 3:
						{
						setState(917);
						instanceMethodDeclaration();
						}
						break;
					case 4:
						{
						setState(918);
						propertyDeclaration();
						}
						break;
					case 5:
						{
						setState(919);
						functionDeclaration();
						}
						break;
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(922); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,80,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ClassMethodDeclarationContext extends ParserRuleContext {
		public TerminalNode ADD() { return getToken(LogosXXParser.ADD, 0); }
		public MethodDeclarationContext methodDeclaration() {
			return getRuleContext(MethodDeclarationContext.class,0);
		}
		public ClassMethodDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classMethodDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LogosXXParserListener ) ((LogosXXParserListener)listener).enterClassMethodDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LogosXXParserListener ) ((LogosXXParserListener)listener).exitClassMethodDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LogosXXParserVisitor ) return ((LogosXXParserVisitor<? extends T>)visitor).visitClassMethodDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ClassMethodDeclarationContext classMethodDeclaration() throws RecognitionException {
		ClassMethodDeclarationContext _localctx = new ClassMethodDeclarationContext(_ctx, getState());
		enterRule(_localctx, 104, RULE_classMethodDeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(924);
			match(ADD);
			setState(925);
			methodDeclaration();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class InstanceMethodDeclarationContext extends ParserRuleContext {
		public TerminalNode SUB() { return getToken(LogosXXParser.SUB, 0); }
		public MethodDeclarationContext methodDeclaration() {
			return getRuleContext(MethodDeclarationContext.class,0);
		}
		public InstanceMethodDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_instanceMethodDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LogosXXParserListener ) ((LogosXXParserListener)listener).enterInstanceMethodDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LogosXXParserListener ) ((LogosXXParserListener)listener).exitInstanceMethodDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LogosXXParserVisitor ) return ((LogosXXParserVisitor<? extends T>)visitor).visitInstanceMethodDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InstanceMethodDeclarationContext instanceMethodDeclaration() throws RecognitionException {
		InstanceMethodDeclarationContext _localctx = new InstanceMethodDeclarationContext(_ctx, getState());
		enterRule(_localctx, 106, RULE_instanceMethodDeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(927);
			match(SUB);
			setState(928);
			methodDeclaration();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class MethodDeclarationContext extends ParserRuleContext {
		public MethodSelectorContext methodSelector() {
			return getRuleContext(MethodSelectorContext.class,0);
		}
		public TerminalNode SEMI() { return getToken(LogosXXParser.SEMI, 0); }
		public MethodTypeContext methodType() {
			return getRuleContext(MethodTypeContext.class,0);
		}
		public MacroContext macro() {
			return getRuleContext(MacroContext.class,0);
		}
		public MethodDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_methodDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LogosXXParserListener ) ((LogosXXParserListener)listener).enterMethodDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LogosXXParserListener ) ((LogosXXParserListener)listener).exitMethodDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LogosXXParserVisitor ) return ((LogosXXParserVisitor<? extends T>)visitor).visitMethodDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MethodDeclarationContext methodDeclaration() throws RecognitionException {
		MethodDeclarationContext _localctx = new MethodDeclarationContext(_ctx, getState());
		enterRule(_localctx, 108, RULE_methodDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(931);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LP) {
				{
				setState(930);
				methodType();
				}
			}

			setState(933);
			methodSelector();
			setState(935);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 57)) & ~0x3f) == 0 && ((1L << (_la - 57)) & ((1L << (BOOL - 57)) | (1L << (Class - 57)) | (1L << (BYCOPY - 57)) | (1L << (BYREF - 57)) | (1L << (ID - 57)) | (1L << (IMP - 57)) | (1L << (IN - 57)) | (1L << (INOUT - 57)) | (1L << (ONEWAY - 57)) | (1L << (OUT - 57)) | (1L << (PROTOCOL_ - 57)) | (1L << (SEL - 57)) | (1L << (SELF - 57)) | (1L << (SUPER - 57)) | (1L << (ATOMIC - 57)) | (1L << (NONATOMIC - 57)) | (1L << (RETAIN - 57)) | (1L << (AUTORELEASING_QUALIFIER - 57)) | (1L << (BLOCK - 57)) | (1L << (BRIDGE_RETAINED - 57)) | (1L << (BRIDGE_TRANSFER - 57)) | (1L << (COVARIANT - 57)) | (1L << (CONTRAVARIANT - 57)) | (1L << (DEPRECATED - 57)) | (1L << (KINDOF - 57)) | (1L << (UNUSED - 57)) | (1L << (NULL_UNSPECIFIED - 57)) | (1L << (NULLABLE - 57)) | (1L << (NONNULL - 57)) | (1L << (NULL_RESETTABLE - 57)) | (1L << (NS_INLINE - 57)))) != 0) || ((((_la - 121)) & ~0x3f) == 0 && ((1L << (_la - 121)) & ((1L << (NS_ENUM - 121)) | (1L << (NS_OPTIONS - 121)) | (1L << (ASSIGN - 121)) | (1L << (COPY - 121)) | (1L << (GETTER - 121)) | (1L << (SETTER - 121)) | (1L << (STRONG - 121)) | (1L << (READONLY - 121)) | (1L << (READWRITE - 121)) | (1L << (WEAK - 121)) | (1L << (UNSAFE_UNRETAINED - 121)) | (1L << (IB_OUTLET - 121)) | (1L << (IB_OUTLET_COLLECTION - 121)) | (1L << (IB_INSPECTABLE - 121)) | (1L << (IB_DESIGNABLE - 121)) | (1L << (IDENTIFIER - 121)))) != 0)) {
				{
				setState(934);
				macro();
				}
			}

			setState(937);
			match(SEMI);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ImplementationDefinitionListContext extends ParserRuleContext {
		public List<FunctionDefinitionContext> functionDefinition() {
			return getRuleContexts(FunctionDefinitionContext.class);
		}
		public FunctionDefinitionContext functionDefinition(int i) {
			return getRuleContext(FunctionDefinitionContext.class,i);
		}
		public List<DeclarationContext> declaration() {
			return getRuleContexts(DeclarationContext.class);
		}
		public DeclarationContext declaration(int i) {
			return getRuleContext(DeclarationContext.class,i);
		}
		public List<ClassMethodDefinitionContext> classMethodDefinition() {
			return getRuleContexts(ClassMethodDefinitionContext.class);
		}
		public ClassMethodDefinitionContext classMethodDefinition(int i) {
			return getRuleContext(ClassMethodDefinitionContext.class,i);
		}
		public List<InstanceMethodDefinitionContext> instanceMethodDefinition() {
			return getRuleContexts(InstanceMethodDefinitionContext.class);
		}
		public InstanceMethodDefinitionContext instanceMethodDefinition(int i) {
			return getRuleContext(InstanceMethodDefinitionContext.class,i);
		}
		public List<PropertyImplementationContext> propertyImplementation() {
			return getRuleContexts(PropertyImplementationContext.class);
		}
		public PropertyImplementationContext propertyImplementation(int i) {
			return getRuleContext(PropertyImplementationContext.class,i);
		}
		public ImplementationDefinitionListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_implementationDefinitionList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LogosXXParserListener ) ((LogosXXParserListener)listener).enterImplementationDefinitionList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LogosXXParserListener ) ((LogosXXParserListener)listener).exitImplementationDefinitionList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LogosXXParserVisitor ) return ((LogosXXParserVisitor<? extends T>)visitor).visitImplementationDefinitionList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ImplementationDefinitionListContext implementationDefinitionList() throws RecognitionException {
		ImplementationDefinitionListContext _localctx = new ImplementationDefinitionListContext(_ctx, getState());
		enterRule(_localctx, 110, RULE_implementationDefinitionList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(944); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				setState(944);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,83,_ctx) ) {
				case 1:
					{
					setState(939);
					functionDefinition();
					}
					break;
				case 2:
					{
					setState(940);
					declaration();
					}
					break;
				case 3:
					{
					setState(941);
					classMethodDefinition();
					}
					break;
				case 4:
					{
					setState(942);
					instanceMethodDefinition();
					}
					break;
				case 5:
					{
					setState(943);
					propertyImplementation();
					}
					break;
				}
				}
				setState(946); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << AUTO) | (1L << CHAR) | (1L << CONST) | (1L << DOUBLE) | (1L << ENUM) | (1L << EXTERN) | (1L << FLOAT) | (1L << INLINE) | (1L << INT) | (1L << LONG) | (1L << REGISTER) | (1L << RESTRICT) | (1L << SHORT) | (1L << SIGNED) | (1L << STATIC) | (1L << STRUCT) | (1L << TYPEDEF) | (1L << UNION) | (1L << UNSIGNED) | (1L << VOID) | (1L << VOLATILE) | (1L << BOOL) | (1L << Class) | (1L << BYCOPY) | (1L << BYREF) | (1L << ID) | (1L << IMP) | (1L << IN))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (INOUT - 64)) | (1L << (ONEWAY - 64)) | (1L << (OUT - 64)) | (1L << (PROTOCOL_ - 64)) | (1L << (SEL - 64)) | (1L << (SELF - 64)) | (1L << (SUPER - 64)) | (1L << (DYNAMIC - 64)) | (1L << (SYNTHESIZE - 64)) | (1L << (ATOMIC - 64)) | (1L << (NONATOMIC - 64)) | (1L << (RETAIN - 64)) | (1L << (ATTRIBUTE - 64)) | (1L << (AUTORELEASING_QUALIFIER - 64)) | (1L << (BLOCK - 64)) | (1L << (BRIDGE - 64)) | (1L << (BRIDGE_RETAINED - 64)) | (1L << (BRIDGE_TRANSFER - 64)) | (1L << (COVARIANT - 64)) | (1L << (CONTRAVARIANT - 64)) | (1L << (DEPRECATED - 64)) | (1L << (KINDOF - 64)) | (1L << (STRONG_QUALIFIER - 64)) | (1L << (TYPEOF - 64)) | (1L << (UNSAFE_UNRETAINED_QUALIFIER - 64)) | (1L << (UNUSED - 64)) | (1L << (WEAK_QUALIFIER - 64)) | (1L << (NULL_UNSPECIFIED - 64)) | (1L << (NULLABLE - 64)) | (1L << (NONNULL - 64)) | (1L << (NULL_RESETTABLE - 64)) | (1L << (NS_INLINE - 64)) | (1L << (NS_ENUM - 64)) | (1L << (NS_OPTIONS - 64)) | (1L << (ASSIGN - 64)) | (1L << (COPY - 64)) | (1L << (GETTER - 64)) | (1L << (SETTER - 64)) | (1L << (STRONG - 64)))) != 0) || ((((_la - 128)) & ~0x3f) == 0 && ((1L << (_la - 128)) & ((1L << (READONLY - 128)) | (1L << (READWRITE - 128)) | (1L << (WEAK - 128)) | (1L << (UNSAFE_UNRETAINED - 128)) | (1L << (IB_OUTLET - 128)) | (1L << (IB_OUTLET_COLLECTION - 128)) | (1L << (IB_INSPECTABLE - 128)) | (1L << (IB_DESIGNABLE - 128)) | (1L << (IDENTIFIER - 128)) | (1L << (ADD - 128)) | (1L << (SUB - 128)))) != 0) );
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ClassMethodDefinitionContext extends ParserRuleContext {
		public TerminalNode ADD() { return getToken(LogosXXParser.ADD, 0); }
		public MethodDefinitionContext methodDefinition() {
			return getRuleContext(MethodDefinitionContext.class,0);
		}
		public ClassMethodDefinitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classMethodDefinition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LogosXXParserListener ) ((LogosXXParserListener)listener).enterClassMethodDefinition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LogosXXParserListener ) ((LogosXXParserListener)listener).exitClassMethodDefinition(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LogosXXParserVisitor ) return ((LogosXXParserVisitor<? extends T>)visitor).visitClassMethodDefinition(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ClassMethodDefinitionContext classMethodDefinition() throws RecognitionException {
		ClassMethodDefinitionContext _localctx = new ClassMethodDefinitionContext(_ctx, getState());
		enterRule(_localctx, 112, RULE_classMethodDefinition);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(948);
			match(ADD);
			setState(949);
			methodDefinition();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class InstanceMethodDefinitionContext extends ParserRuleContext {
		public TerminalNode SUB() { return getToken(LogosXXParser.SUB, 0); }
		public MethodDefinitionContext methodDefinition() {
			return getRuleContext(MethodDefinitionContext.class,0);
		}
		public InstanceMethodDefinitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_instanceMethodDefinition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LogosXXParserListener ) ((LogosXXParserListener)listener).enterInstanceMethodDefinition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LogosXXParserListener ) ((LogosXXParserListener)listener).exitInstanceMethodDefinition(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LogosXXParserVisitor ) return ((LogosXXParserVisitor<? extends T>)visitor).visitInstanceMethodDefinition(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InstanceMethodDefinitionContext instanceMethodDefinition() throws RecognitionException {
		InstanceMethodDefinitionContext _localctx = new InstanceMethodDefinitionContext(_ctx, getState());
		enterRule(_localctx, 114, RULE_instanceMethodDefinition);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(951);
			match(SUB);
			setState(952);
			methodDefinition();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class MethodDefinitionContext extends ParserRuleContext {
		public MethodSelectorContext methodSelector() {
			return getRuleContext(MethodSelectorContext.class,0);
		}
		public CompoundStatementContext compoundStatement() {
			return getRuleContext(CompoundStatementContext.class,0);
		}
		public MethodTypeContext methodType() {
			return getRuleContext(MethodTypeContext.class,0);
		}
		public InitDeclaratorListContext initDeclaratorList() {
			return getRuleContext(InitDeclaratorListContext.class,0);
		}
		public TerminalNode SEMI() { return getToken(LogosXXParser.SEMI, 0); }
		public MethodDefinitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_methodDefinition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LogosXXParserListener ) ((LogosXXParserListener)listener).enterMethodDefinition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LogosXXParserListener ) ((LogosXXParserListener)listener).exitMethodDefinition(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LogosXXParserVisitor ) return ((LogosXXParserVisitor<? extends T>)visitor).visitMethodDefinition(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MethodDefinitionContext methodDefinition() throws RecognitionException {
		MethodDefinitionContext _localctx = new MethodDefinitionContext(_ctx, getState());
		enterRule(_localctx, 116, RULE_methodDefinition);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(955);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LP) {
				{
				setState(954);
				methodType();
				}
			}

			setState(957);
			methodSelector();
			setState(959);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 57)) & ~0x3f) == 0 && ((1L << (_la - 57)) & ((1L << (BOOL - 57)) | (1L << (Class - 57)) | (1L << (BYCOPY - 57)) | (1L << (BYREF - 57)) | (1L << (ID - 57)) | (1L << (IMP - 57)) | (1L << (IN - 57)) | (1L << (INOUT - 57)) | (1L << (ONEWAY - 57)) | (1L << (OUT - 57)) | (1L << (PROTOCOL_ - 57)) | (1L << (SEL - 57)) | (1L << (SELF - 57)) | (1L << (SUPER - 57)) | (1L << (ATOMIC - 57)) | (1L << (NONATOMIC - 57)) | (1L << (RETAIN - 57)) | (1L << (AUTORELEASING_QUALIFIER - 57)) | (1L << (BLOCK - 57)) | (1L << (BRIDGE_RETAINED - 57)) | (1L << (BRIDGE_TRANSFER - 57)) | (1L << (COVARIANT - 57)) | (1L << (CONTRAVARIANT - 57)) | (1L << (DEPRECATED - 57)) | (1L << (KINDOF - 57)) | (1L << (UNUSED - 57)) | (1L << (NULL_UNSPECIFIED - 57)) | (1L << (NULLABLE - 57)) | (1L << (NONNULL - 57)) | (1L << (NULL_RESETTABLE - 57)) | (1L << (NS_INLINE - 57)))) != 0) || ((((_la - 121)) & ~0x3f) == 0 && ((1L << (_la - 121)) & ((1L << (NS_ENUM - 121)) | (1L << (NS_OPTIONS - 121)) | (1L << (ASSIGN - 121)) | (1L << (COPY - 121)) | (1L << (GETTER - 121)) | (1L << (SETTER - 121)) | (1L << (STRONG - 121)) | (1L << (READONLY - 121)) | (1L << (READWRITE - 121)) | (1L << (WEAK - 121)) | (1L << (UNSAFE_UNRETAINED - 121)) | (1L << (IB_OUTLET - 121)) | (1L << (IB_OUTLET_COLLECTION - 121)) | (1L << (IB_INSPECTABLE - 121)) | (1L << (IB_DESIGNABLE - 121)) | (1L << (IDENTIFIER - 121)) | (1L << (LP - 121)) | (1L << (MUL - 121)))) != 0)) {
				{
				setState(958);
				initDeclaratorList();
				}
			}

			setState(962);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==SEMI) {
				{
				setState(961);
				match(SEMI);
				}
			}

			setState(964);
			compoundStatement();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class MethodSelectorContext extends ParserRuleContext {
		public SelectorContext selector() {
			return getRuleContext(SelectorContext.class,0);
		}
		public List<KeywordDeclaratorContext> keywordDeclarator() {
			return getRuleContexts(KeywordDeclaratorContext.class);
		}
		public KeywordDeclaratorContext keywordDeclarator(int i) {
			return getRuleContext(KeywordDeclaratorContext.class,i);
		}
		public TerminalNode COMMA() { return getToken(LogosXXParser.COMMA, 0); }
		public TerminalNode ELIPSIS() { return getToken(LogosXXParser.ELIPSIS, 0); }
		public MethodSelectorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_methodSelector; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LogosXXParserListener ) ((LogosXXParserListener)listener).enterMethodSelector(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LogosXXParserListener ) ((LogosXXParserListener)listener).exitMethodSelector(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LogosXXParserVisitor ) return ((LogosXXParserVisitor<? extends T>)visitor).visitMethodSelector(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MethodSelectorContext methodSelector() throws RecognitionException {
		MethodSelectorContext _localctx = new MethodSelectorContext(_ctx, getState());
		enterRule(_localctx, 118, RULE_methodSelector);
		try {
			int _alt;
			setState(976);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,90,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(966);
				selector();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(968); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(967);
						keywordDeclarator();
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(970); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,88,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				setState(974);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,89,_ctx) ) {
				case 1:
					{
					setState(972);
					match(COMMA);
					setState(973);
					match(ELIPSIS);
					}
					break;
				}
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class KeywordDeclaratorContext extends ParserRuleContext {
		public TerminalNode COLON() { return getToken(LogosXXParser.COLON, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public SelectorContext selector() {
			return getRuleContext(SelectorContext.class,0);
		}
		public List<MethodTypeContext> methodType() {
			return getRuleContexts(MethodTypeContext.class);
		}
		public MethodTypeContext methodType(int i) {
			return getRuleContext(MethodTypeContext.class,i);
		}
		public ArcBehaviourSpecifierContext arcBehaviourSpecifier() {
			return getRuleContext(ArcBehaviourSpecifierContext.class,0);
		}
		public KeywordDeclaratorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_keywordDeclarator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LogosXXParserListener ) ((LogosXXParserListener)listener).enterKeywordDeclarator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LogosXXParserListener ) ((LogosXXParserListener)listener).exitKeywordDeclarator(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LogosXXParserVisitor ) return ((LogosXXParserVisitor<? extends T>)visitor).visitKeywordDeclarator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final KeywordDeclaratorContext keywordDeclarator() throws RecognitionException {
		KeywordDeclaratorContext _localctx = new KeywordDeclaratorContext(_ctx, getState());
		enterRule(_localctx, 120, RULE_keywordDeclarator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(979);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 39)) & ~0x3f) == 0 && ((1L << (_la - 39)) & ((1L << (RETURN - 39)) | (1L << (BOOL - 39)) | (1L << (Class - 39)) | (1L << (BYCOPY - 39)) | (1L << (BYREF - 39)) | (1L << (ID - 39)) | (1L << (IMP - 39)) | (1L << (IN - 39)) | (1L << (INOUT - 39)) | (1L << (ONEWAY - 39)) | (1L << (OUT - 39)) | (1L << (PROTOCOL_ - 39)) | (1L << (SEL - 39)) | (1L << (SELF - 39)) | (1L << (SUPER - 39)) | (1L << (ATOMIC - 39)) | (1L << (NONATOMIC - 39)) | (1L << (RETAIN - 39)) | (1L << (AUTORELEASING_QUALIFIER - 39)))) != 0) || ((((_la - 103)) & ~0x3f) == 0 && ((1L << (_la - 103)) & ((1L << (BLOCK - 103)) | (1L << (BRIDGE_RETAINED - 103)) | (1L << (BRIDGE_TRANSFER - 103)) | (1L << (COVARIANT - 103)) | (1L << (CONTRAVARIANT - 103)) | (1L << (DEPRECATED - 103)) | (1L << (KINDOF - 103)) | (1L << (UNUSED - 103)) | (1L << (NULL_UNSPECIFIED - 103)) | (1L << (NULLABLE - 103)) | (1L << (NONNULL - 103)) | (1L << (NULL_RESETTABLE - 103)) | (1L << (NS_INLINE - 103)) | (1L << (NS_ENUM - 103)) | (1L << (NS_OPTIONS - 103)) | (1L << (ASSIGN - 103)) | (1L << (COPY - 103)) | (1L << (GETTER - 103)) | (1L << (SETTER - 103)) | (1L << (STRONG - 103)) | (1L << (READONLY - 103)) | (1L << (READWRITE - 103)) | (1L << (WEAK - 103)) | (1L << (UNSAFE_UNRETAINED - 103)) | (1L << (IB_OUTLET - 103)) | (1L << (IB_OUTLET_COLLECTION - 103)) | (1L << (IB_INSPECTABLE - 103)) | (1L << (IB_DESIGNABLE - 103)) | (1L << (IDENTIFIER - 103)))) != 0)) {
				{
				setState(978);
				selector();
				}
			}

			setState(981);
			match(COLON);
			setState(985);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==LP) {
				{
				{
				setState(982);
				methodType();
				}
				}
				setState(987);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(989);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,93,_ctx) ) {
			case 1:
				{
				setState(988);
				arcBehaviourSpecifier();
				}
				break;
			}
			setState(991);
			identifier();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SelectorContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode RETURN() { return getToken(LogosXXParser.RETURN, 0); }
		public SelectorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_selector; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LogosXXParserListener ) ((LogosXXParserListener)listener).enterSelector(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LogosXXParserListener ) ((LogosXXParserListener)listener).exitSelector(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LogosXXParserVisitor ) return ((LogosXXParserVisitor<? extends T>)visitor).visitSelector(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SelectorContext selector() throws RecognitionException {
		SelectorContext _localctx = new SelectorContext(_ctx, getState());
		enterRule(_localctx, 122, RULE_selector);
		try {
			setState(995);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case BOOL:
			case Class:
			case BYCOPY:
			case BYREF:
			case ID:
			case IMP:
			case IN:
			case INOUT:
			case ONEWAY:
			case OUT:
			case PROTOCOL_:
			case SEL:
			case SELF:
			case SUPER:
			case ATOMIC:
			case NONATOMIC:
			case RETAIN:
			case AUTORELEASING_QUALIFIER:
			case BLOCK:
			case BRIDGE_RETAINED:
			case BRIDGE_TRANSFER:
			case COVARIANT:
			case CONTRAVARIANT:
			case DEPRECATED:
			case KINDOF:
			case UNUSED:
			case NULL_UNSPECIFIED:
			case NULLABLE:
			case NONNULL:
			case NULL_RESETTABLE:
			case NS_INLINE:
			case NS_ENUM:
			case NS_OPTIONS:
			case ASSIGN:
			case COPY:
			case GETTER:
			case SETTER:
			case STRONG:
			case READONLY:
			case READWRITE:
			case WEAK:
			case UNSAFE_UNRETAINED:
			case IB_OUTLET:
			case IB_OUTLET_COLLECTION:
			case IB_INSPECTABLE:
			case IB_DESIGNABLE:
			case IDENTIFIER:
				enterOuterAlt(_localctx, 1);
				{
				setState(993);
				identifier();
				}
				break;
			case RETURN:
				enterOuterAlt(_localctx, 2);
				{
				setState(994);
				match(RETURN);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class MethodTypeContext extends ParserRuleContext {
		public TerminalNode LP() { return getToken(LogosXXParser.LP, 0); }
		public TypeNameContext typeName() {
			return getRuleContext(TypeNameContext.class,0);
		}
		public TerminalNode RP() { return getToken(LogosXXParser.RP, 0); }
		public MethodTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_methodType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LogosXXParserListener ) ((LogosXXParserListener)listener).enterMethodType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LogosXXParserListener ) ((LogosXXParserListener)listener).exitMethodType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LogosXXParserVisitor ) return ((LogosXXParserVisitor<? extends T>)visitor).visitMethodType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MethodTypeContext methodType() throws RecognitionException {
		MethodTypeContext _localctx = new MethodTypeContext(_ctx, getState());
		enterRule(_localctx, 124, RULE_methodType);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(997);
			match(LP);
			setState(998);
			typeName();
			setState(999);
			match(RP);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PropertyImplementationContext extends ParserRuleContext {
		public TerminalNode SYNTHESIZE() { return getToken(LogosXXParser.SYNTHESIZE, 0); }
		public PropertySynthesizeListContext propertySynthesizeList() {
			return getRuleContext(PropertySynthesizeListContext.class,0);
		}
		public TerminalNode SEMI() { return getToken(LogosXXParser.SEMI, 0); }
		public TerminalNode DYNAMIC() { return getToken(LogosXXParser.DYNAMIC, 0); }
		public PropertyImplementationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_propertyImplementation; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LogosXXParserListener ) ((LogosXXParserListener)listener).enterPropertyImplementation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LogosXXParserListener ) ((LogosXXParserListener)listener).exitPropertyImplementation(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LogosXXParserVisitor ) return ((LogosXXParserVisitor<? extends T>)visitor).visitPropertyImplementation(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PropertyImplementationContext propertyImplementation() throws RecognitionException {
		PropertyImplementationContext _localctx = new PropertyImplementationContext(_ctx, getState());
		enterRule(_localctx, 126, RULE_propertyImplementation);
		try {
			setState(1009);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case SYNTHESIZE:
				enterOuterAlt(_localctx, 1);
				{
				setState(1001);
				match(SYNTHESIZE);
				setState(1002);
				propertySynthesizeList();
				setState(1003);
				match(SEMI);
				}
				break;
			case DYNAMIC:
				enterOuterAlt(_localctx, 2);
				{
				setState(1005);
				match(DYNAMIC);
				setState(1006);
				propertySynthesizeList();
				setState(1007);
				match(SEMI);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PropertySynthesizeListContext extends ParserRuleContext {
		public List<PropertySynthesizeItemContext> propertySynthesizeItem() {
			return getRuleContexts(PropertySynthesizeItemContext.class);
		}
		public PropertySynthesizeItemContext propertySynthesizeItem(int i) {
			return getRuleContext(PropertySynthesizeItemContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(LogosXXParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(LogosXXParser.COMMA, i);
		}
		public PropertySynthesizeListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_propertySynthesizeList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LogosXXParserListener ) ((LogosXXParserListener)listener).enterPropertySynthesizeList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LogosXXParserListener ) ((LogosXXParserListener)listener).exitPropertySynthesizeList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LogosXXParserVisitor ) return ((LogosXXParserVisitor<? extends T>)visitor).visitPropertySynthesizeList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PropertySynthesizeListContext propertySynthesizeList() throws RecognitionException {
		PropertySynthesizeListContext _localctx = new PropertySynthesizeListContext(_ctx, getState());
		enterRule(_localctx, 128, RULE_propertySynthesizeList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1011);
			propertySynthesizeItem();
			setState(1016);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(1012);
				match(COMMA);
				setState(1013);
				propertySynthesizeItem();
				}
				}
				setState(1018);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PropertySynthesizeItemContext extends ParserRuleContext {
		public List<IdentifierContext> identifier() {
			return getRuleContexts(IdentifierContext.class);
		}
		public IdentifierContext identifier(int i) {
			return getRuleContext(IdentifierContext.class,i);
		}
		public TerminalNode ASSIGNMENT() { return getToken(LogosXXParser.ASSIGNMENT, 0); }
		public PropertySynthesizeItemContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_propertySynthesizeItem; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LogosXXParserListener ) ((LogosXXParserListener)listener).enterPropertySynthesizeItem(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LogosXXParserListener ) ((LogosXXParserListener)listener).exitPropertySynthesizeItem(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LogosXXParserVisitor ) return ((LogosXXParserVisitor<? extends T>)visitor).visitPropertySynthesizeItem(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PropertySynthesizeItemContext propertySynthesizeItem() throws RecognitionException {
		PropertySynthesizeItemContext _localctx = new PropertySynthesizeItemContext(_ctx, getState());
		enterRule(_localctx, 130, RULE_propertySynthesizeItem);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1019);
			identifier();
			setState(1022);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ASSIGNMENT) {
				{
				setState(1020);
				match(ASSIGNMENT);
				setState(1021);
				identifier();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class BlockTypeContext extends ParserRuleContext {
		public List<TypeSpecifierContext> typeSpecifier() {
			return getRuleContexts(TypeSpecifierContext.class);
		}
		public TypeSpecifierContext typeSpecifier(int i) {
			return getRuleContext(TypeSpecifierContext.class,i);
		}
		public TerminalNode LP() { return getToken(LogosXXParser.LP, 0); }
		public TerminalNode BITXOR() { return getToken(LogosXXParser.BITXOR, 0); }
		public TerminalNode RP() { return getToken(LogosXXParser.RP, 0); }
		public List<NullabilitySpecifierContext> nullabilitySpecifier() {
			return getRuleContexts(NullabilitySpecifierContext.class);
		}
		public NullabilitySpecifierContext nullabilitySpecifier(int i) {
			return getRuleContext(NullabilitySpecifierContext.class,i);
		}
		public BlockParametersContext blockParameters() {
			return getRuleContext(BlockParametersContext.class,0);
		}
		public BlockTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_blockType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LogosXXParserListener ) ((LogosXXParserListener)listener).enterBlockType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LogosXXParserListener ) ((LogosXXParserListener)listener).exitBlockType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LogosXXParserVisitor ) return ((LogosXXParserVisitor<? extends T>)visitor).visitBlockType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BlockTypeContext blockType() throws RecognitionException {
		BlockTypeContext _localctx = new BlockTypeContext(_ctx, getState());
		enterRule(_localctx, 132, RULE_blockType);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1025);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,98,_ctx) ) {
			case 1:
				{
				setState(1024);
				nullabilitySpecifier();
				}
				break;
			}
			setState(1027);
			typeSpecifier();
			setState(1029);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 116)) & ~0x3f) == 0 && ((1L << (_la - 116)) & ((1L << (NULL_UNSPECIFIED - 116)) | (1L << (NULLABLE - 116)) | (1L << (NONNULL - 116)) | (1L << (NULL_RESETTABLE - 116)))) != 0)) {
				{
				setState(1028);
				nullabilitySpecifier();
				}
			}

			setState(1031);
			match(LP);
			setState(1032);
			match(BITXOR);
			setState(1035);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,100,_ctx) ) {
			case 1:
				{
				setState(1033);
				nullabilitySpecifier();
				}
				break;
			case 2:
				{
				setState(1034);
				typeSpecifier();
				}
				break;
			}
			setState(1037);
			match(RP);
			setState(1039);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LP) {
				{
				setState(1038);
				blockParameters();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class GenericsSpecifierContext extends ParserRuleContext {
		public TerminalNode LT() { return getToken(LogosXXParser.LT, 0); }
		public TerminalNode GT() { return getToken(LogosXXParser.GT, 0); }
		public List<TypeSpecifierWithPrefixesContext> typeSpecifierWithPrefixes() {
			return getRuleContexts(TypeSpecifierWithPrefixesContext.class);
		}
		public TypeSpecifierWithPrefixesContext typeSpecifierWithPrefixes(int i) {
			return getRuleContext(TypeSpecifierWithPrefixesContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(LogosXXParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(LogosXXParser.COMMA, i);
		}
		public GenericsSpecifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_genericsSpecifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LogosXXParserListener ) ((LogosXXParserListener)listener).enterGenericsSpecifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LogosXXParserListener ) ((LogosXXParserListener)listener).exitGenericsSpecifier(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LogosXXParserVisitor ) return ((LogosXXParserVisitor<? extends T>)visitor).visitGenericsSpecifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final GenericsSpecifierContext genericsSpecifier() throws RecognitionException {
		GenericsSpecifierContext _localctx = new GenericsSpecifierContext(_ctx, getState());
		enterRule(_localctx, 134, RULE_genericsSpecifier);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1041);
			match(LT);
			setState(1050);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 21)) & ~0x3f) == 0 && ((1L << (_la - 21)) & ((1L << (CHAR - 21)) | (1L << (DOUBLE - 21)) | (1L << (ENUM - 21)) | (1L << (FLOAT - 21)) | (1L << (INLINE - 21)) | (1L << (INT - 21)) | (1L << (LONG - 21)) | (1L << (SHORT - 21)) | (1L << (SIGNED - 21)) | (1L << (STRUCT - 21)) | (1L << (UNION - 21)) | (1L << (UNSIGNED - 21)) | (1L << (VOID - 21)) | (1L << (BOOL - 21)) | (1L << (Class - 21)) | (1L << (BYCOPY - 21)) | (1L << (BYREF - 21)) | (1L << (ID - 21)) | (1L << (IMP - 21)) | (1L << (IN - 21)) | (1L << (INOUT - 21)) | (1L << (ONEWAY - 21)) | (1L << (OUT - 21)) | (1L << (PROTOCOL_ - 21)) | (1L << (SEL - 21)) | (1L << (SELF - 21)) | (1L << (SUPER - 21)))) != 0) || ((((_la - 98)) & ~0x3f) == 0 && ((1L << (_la - 98)) & ((1L << (ATOMIC - 98)) | (1L << (NONATOMIC - 98)) | (1L << (RETAIN - 98)) | (1L << (AUTORELEASING_QUALIFIER - 98)) | (1L << (BLOCK - 98)) | (1L << (BRIDGE - 98)) | (1L << (BRIDGE_RETAINED - 98)) | (1L << (BRIDGE_TRANSFER - 98)) | (1L << (COVARIANT - 98)) | (1L << (CONTRAVARIANT - 98)) | (1L << (DEPRECATED - 98)) | (1L << (KINDOF - 98)) | (1L << (TYPEOF - 98)) | (1L << (UNUSED - 98)) | (1L << (NULL_UNSPECIFIED - 98)) | (1L << (NULLABLE - 98)) | (1L << (NONNULL - 98)) | (1L << (NULL_RESETTABLE - 98)) | (1L << (NS_INLINE - 98)) | (1L << (NS_ENUM - 98)) | (1L << (NS_OPTIONS - 98)) | (1L << (ASSIGN - 98)) | (1L << (COPY - 98)) | (1L << (GETTER - 98)) | (1L << (SETTER - 98)) | (1L << (STRONG - 98)) | (1L << (READONLY - 98)) | (1L << (READWRITE - 98)) | (1L << (WEAK - 98)) | (1L << (UNSAFE_UNRETAINED - 98)) | (1L << (IB_OUTLET - 98)) | (1L << (IB_OUTLET_COLLECTION - 98)) | (1L << (IB_INSPECTABLE - 98)) | (1L << (IB_DESIGNABLE - 98)) | (1L << (IDENTIFIER - 98)))) != 0)) {
				{
				setState(1042);
				typeSpecifierWithPrefixes();
				setState(1047);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(1043);
					match(COMMA);
					setState(1044);
					typeSpecifierWithPrefixes();
					}
					}
					setState(1049);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(1052);
			match(GT);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TypeSpecifierWithPrefixesContext extends ParserRuleContext {
		public TypeSpecifierContext typeSpecifier() {
			return getRuleContext(TypeSpecifierContext.class,0);
		}
		public List<TypePrefixContext> typePrefix() {
			return getRuleContexts(TypePrefixContext.class);
		}
		public TypePrefixContext typePrefix(int i) {
			return getRuleContext(TypePrefixContext.class,i);
		}
		public TypeSpecifierWithPrefixesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeSpecifierWithPrefixes; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LogosXXParserListener ) ((LogosXXParserListener)listener).enterTypeSpecifierWithPrefixes(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LogosXXParserListener ) ((LogosXXParserListener)listener).exitTypeSpecifierWithPrefixes(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LogosXXParserVisitor ) return ((LogosXXParserVisitor<? extends T>)visitor).visitTypeSpecifierWithPrefixes(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeSpecifierWithPrefixesContext typeSpecifierWithPrefixes() throws RecognitionException {
		TypeSpecifierWithPrefixesContext _localctx = new TypeSpecifierWithPrefixesContext(_ctx, getState());
		enterRule(_localctx, 136, RULE_typeSpecifierWithPrefixes);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1057);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,104,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1054);
					typePrefix();
					}
					} 
				}
				setState(1059);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,104,_ctx);
			}
			setState(1060);
			typeSpecifier();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DictionaryExpressionContext extends ParserRuleContext {
		public TerminalNode AT() { return getToken(LogosXXParser.AT, 0); }
		public TerminalNode LBRACE() { return getToken(LogosXXParser.LBRACE, 0); }
		public TerminalNode RBRACE() { return getToken(LogosXXParser.RBRACE, 0); }
		public List<DictionaryPairContext> dictionaryPair() {
			return getRuleContexts(DictionaryPairContext.class);
		}
		public DictionaryPairContext dictionaryPair(int i) {
			return getRuleContext(DictionaryPairContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(LogosXXParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(LogosXXParser.COMMA, i);
		}
		public DictionaryExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dictionaryExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LogosXXParserListener ) ((LogosXXParserListener)listener).enterDictionaryExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LogosXXParserListener ) ((LogosXXParserListener)listener).exitDictionaryExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LogosXXParserVisitor ) return ((LogosXXParserVisitor<? extends T>)visitor).visitDictionaryExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DictionaryExpressionContext dictionaryExpression() throws RecognitionException {
		DictionaryExpressionContext _localctx = new DictionaryExpressionContext(_ctx, getState());
		enterRule(_localctx, 138, RULE_dictionaryExpression);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1062);
			match(AT);
			setState(1063);
			match(LBRACE);
			setState(1075);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 42)) & ~0x3f) == 0 && ((1L << (_la - 42)) & ((1L << (SIZEOF - 42)) | (1L << (TRUE - 42)) | (1L << (FALSE - 42)) | (1L << (BOOL - 42)) | (1L << (Class - 42)) | (1L << (BYCOPY - 42)) | (1L << (BYREF - 42)) | (1L << (ID - 42)) | (1L << (IMP - 42)) | (1L << (IN - 42)) | (1L << (INOUT - 42)) | (1L << (NIL - 42)) | (1L << (NO - 42)) | (1L << (NULL - 42)) | (1L << (ONEWAY - 42)) | (1L << (OUT - 42)) | (1L << (PROTOCOL_ - 42)) | (1L << (SEL - 42)) | (1L << (SELF - 42)) | (1L << (SUPER - 42)) | (1L << (YES - 42)) | (1L << (ENCODE - 42)) | (1L << (PROTOCOL - 42)) | (1L << (SELECTOR - 42)) | (1L << (ATOMIC - 42)) | (1L << (NONATOMIC - 42)) | (1L << (RETAIN - 42)) | (1L << (AUTORELEASING_QUALIFIER - 42)) | (1L << (BLOCK - 42)) | (1L << (BRIDGE_RETAINED - 42)))) != 0) || ((((_la - 106)) & ~0x3f) == 0 && ((1L << (_la - 106)) & ((1L << (BRIDGE_TRANSFER - 106)) | (1L << (COVARIANT - 106)) | (1L << (CONTRAVARIANT - 106)) | (1L << (DEPRECATED - 106)) | (1L << (KINDOF - 106)) | (1L << (UNUSED - 106)) | (1L << (NULL_UNSPECIFIED - 106)) | (1L << (NULLABLE - 106)) | (1L << (NONNULL - 106)) | (1L << (NULL_RESETTABLE - 106)) | (1L << (NS_INLINE - 106)) | (1L << (NS_ENUM - 106)) | (1L << (NS_OPTIONS - 106)) | (1L << (ASSIGN - 106)) | (1L << (COPY - 106)) | (1L << (GETTER - 106)) | (1L << (SETTER - 106)) | (1L << (STRONG - 106)) | (1L << (READONLY - 106)) | (1L << (READWRITE - 106)) | (1L << (WEAK - 106)) | (1L << (UNSAFE_UNRETAINED - 106)) | (1L << (IB_OUTLET - 106)) | (1L << (IB_OUTLET_COLLECTION - 106)) | (1L << (IB_INSPECTABLE - 106)) | (1L << (IB_DESIGNABLE - 106)) | (1L << (IDENTIFIER - 106)) | (1L << (LP - 106)) | (1L << (LBRACK - 106)) | (1L << (AT - 106)) | (1L << (BANG - 106)) | (1L << (TILDE - 106)) | (1L << (INC - 106)) | (1L << (DEC - 106)) | (1L << (ADD - 106)))) != 0) || ((((_la - 170)) & ~0x3f) == 0 && ((1L << (_la - 170)) & ((1L << (SUB - 170)) | (1L << (MUL - 170)) | (1L << (BITAND - 170)) | (1L << (BITXOR - 170)) | (1L << (CHARACTER_LITERAL - 170)) | (1L << (STRING_START - 170)) | (1L << (HEX_LITERAL - 170)) | (1L << (OCTAL_LITERAL - 170)) | (1L << (BINARY_LITERAL - 170)) | (1L << (DECIMAL_LITERAL - 170)) | (1L << (FLOATING_POINT_LITERAL - 170)))) != 0)) {
				{
				setState(1064);
				dictionaryPair();
				setState(1069);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,105,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(1065);
						match(COMMA);
						setState(1066);
						dictionaryPair();
						}
						} 
					}
					setState(1071);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,105,_ctx);
				}
				setState(1073);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COMMA) {
					{
					setState(1072);
					match(COMMA);
					}
				}

				}
			}

			setState(1077);
			match(RBRACE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DictionaryPairContext extends ParserRuleContext {
		public CastExpressionContext castExpression() {
			return getRuleContext(CastExpressionContext.class,0);
		}
		public TerminalNode COLON() { return getToken(LogosXXParser.COLON, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public DictionaryPairContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dictionaryPair; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LogosXXParserListener ) ((LogosXXParserListener)listener).enterDictionaryPair(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LogosXXParserListener ) ((LogosXXParserListener)listener).exitDictionaryPair(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LogosXXParserVisitor ) return ((LogosXXParserVisitor<? extends T>)visitor).visitDictionaryPair(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DictionaryPairContext dictionaryPair() throws RecognitionException {
		DictionaryPairContext _localctx = new DictionaryPairContext(_ctx, getState());
		enterRule(_localctx, 140, RULE_dictionaryPair);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1079);
			castExpression();
			setState(1080);
			match(COLON);
			setState(1081);
			expression(0);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ArrayExpressionContext extends ParserRuleContext {
		public TerminalNode AT() { return getToken(LogosXXParser.AT, 0); }
		public TerminalNode LBRACK() { return getToken(LogosXXParser.LBRACK, 0); }
		public TerminalNode RBRACK() { return getToken(LogosXXParser.RBRACK, 0); }
		public ExpressionsContext expressions() {
			return getRuleContext(ExpressionsContext.class,0);
		}
		public TerminalNode COMMA() { return getToken(LogosXXParser.COMMA, 0); }
		public ArrayExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arrayExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LogosXXParserListener ) ((LogosXXParserListener)listener).enterArrayExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LogosXXParserListener ) ((LogosXXParserListener)listener).exitArrayExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LogosXXParserVisitor ) return ((LogosXXParserVisitor<? extends T>)visitor).visitArrayExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArrayExpressionContext arrayExpression() throws RecognitionException {
		ArrayExpressionContext _localctx = new ArrayExpressionContext(_ctx, getState());
		enterRule(_localctx, 142, RULE_arrayExpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1083);
			match(AT);
			setState(1084);
			match(LBRACK);
			setState(1089);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 42)) & ~0x3f) == 0 && ((1L << (_la - 42)) & ((1L << (SIZEOF - 42)) | (1L << (TRUE - 42)) | (1L << (FALSE - 42)) | (1L << (BOOL - 42)) | (1L << (Class - 42)) | (1L << (BYCOPY - 42)) | (1L << (BYREF - 42)) | (1L << (ID - 42)) | (1L << (IMP - 42)) | (1L << (IN - 42)) | (1L << (INOUT - 42)) | (1L << (NIL - 42)) | (1L << (NO - 42)) | (1L << (NULL - 42)) | (1L << (ONEWAY - 42)) | (1L << (OUT - 42)) | (1L << (PROTOCOL_ - 42)) | (1L << (SEL - 42)) | (1L << (SELF - 42)) | (1L << (SUPER - 42)) | (1L << (YES - 42)) | (1L << (ENCODE - 42)) | (1L << (PROTOCOL - 42)) | (1L << (SELECTOR - 42)) | (1L << (ATOMIC - 42)) | (1L << (NONATOMIC - 42)) | (1L << (RETAIN - 42)) | (1L << (AUTORELEASING_QUALIFIER - 42)) | (1L << (BLOCK - 42)) | (1L << (BRIDGE_RETAINED - 42)))) != 0) || ((((_la - 106)) & ~0x3f) == 0 && ((1L << (_la - 106)) & ((1L << (BRIDGE_TRANSFER - 106)) | (1L << (COVARIANT - 106)) | (1L << (CONTRAVARIANT - 106)) | (1L << (DEPRECATED - 106)) | (1L << (KINDOF - 106)) | (1L << (UNUSED - 106)) | (1L << (NULL_UNSPECIFIED - 106)) | (1L << (NULLABLE - 106)) | (1L << (NONNULL - 106)) | (1L << (NULL_RESETTABLE - 106)) | (1L << (NS_INLINE - 106)) | (1L << (NS_ENUM - 106)) | (1L << (NS_OPTIONS - 106)) | (1L << (ASSIGN - 106)) | (1L << (COPY - 106)) | (1L << (GETTER - 106)) | (1L << (SETTER - 106)) | (1L << (STRONG - 106)) | (1L << (READONLY - 106)) | (1L << (READWRITE - 106)) | (1L << (WEAK - 106)) | (1L << (UNSAFE_UNRETAINED - 106)) | (1L << (IB_OUTLET - 106)) | (1L << (IB_OUTLET_COLLECTION - 106)) | (1L << (IB_INSPECTABLE - 106)) | (1L << (IB_DESIGNABLE - 106)) | (1L << (IDENTIFIER - 106)) | (1L << (LP - 106)) | (1L << (LBRACK - 106)) | (1L << (AT - 106)) | (1L << (BANG - 106)) | (1L << (TILDE - 106)) | (1L << (INC - 106)) | (1L << (DEC - 106)) | (1L << (ADD - 106)))) != 0) || ((((_la - 170)) & ~0x3f) == 0 && ((1L << (_la - 170)) & ((1L << (SUB - 170)) | (1L << (MUL - 170)) | (1L << (BITAND - 170)) | (1L << (BITXOR - 170)) | (1L << (CHARACTER_LITERAL - 170)) | (1L << (STRING_START - 170)) | (1L << (HEX_LITERAL - 170)) | (1L << (OCTAL_LITERAL - 170)) | (1L << (BINARY_LITERAL - 170)) | (1L << (DECIMAL_LITERAL - 170)) | (1L << (FLOATING_POINT_LITERAL - 170)))) != 0)) {
				{
				setState(1085);
				expressions();
				setState(1087);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COMMA) {
					{
					setState(1086);
					match(COMMA);
					}
				}

				}
			}

			setState(1091);
			match(RBRACK);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class BoxExpressionContext extends ParserRuleContext {
		public TerminalNode AT() { return getToken(LogosXXParser.AT, 0); }
		public TerminalNode LP() { return getToken(LogosXXParser.LP, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode RP() { return getToken(LogosXXParser.RP, 0); }
		public ConstantContext constant() {
			return getRuleContext(ConstantContext.class,0);
		}
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public BoxExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_boxExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LogosXXParserListener ) ((LogosXXParserListener)listener).enterBoxExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LogosXXParserListener ) ((LogosXXParserListener)listener).exitBoxExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LogosXXParserVisitor ) return ((LogosXXParserVisitor<? extends T>)visitor).visitBoxExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BoxExpressionContext boxExpression() throws RecognitionException {
		BoxExpressionContext _localctx = new BoxExpressionContext(_ctx, getState());
		enterRule(_localctx, 144, RULE_boxExpression);
		try {
			setState(1103);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,111,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1093);
				match(AT);
				setState(1094);
				match(LP);
				setState(1095);
				expression(0);
				setState(1096);
				match(RP);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1098);
				match(AT);
				setState(1101);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case TRUE:
				case FALSE:
				case NIL:
				case NO:
				case NULL:
				case YES:
				case ADD:
				case SUB:
				case CHARACTER_LITERAL:
				case HEX_LITERAL:
				case OCTAL_LITERAL:
				case BINARY_LITERAL:
				case DECIMAL_LITERAL:
				case FLOATING_POINT_LITERAL:
					{
					setState(1099);
					constant();
					}
					break;
				case BOOL:
				case Class:
				case BYCOPY:
				case BYREF:
				case ID:
				case IMP:
				case IN:
				case INOUT:
				case ONEWAY:
				case OUT:
				case PROTOCOL_:
				case SEL:
				case SELF:
				case SUPER:
				case ATOMIC:
				case NONATOMIC:
				case RETAIN:
				case AUTORELEASING_QUALIFIER:
				case BLOCK:
				case BRIDGE_RETAINED:
				case BRIDGE_TRANSFER:
				case COVARIANT:
				case CONTRAVARIANT:
				case DEPRECATED:
				case KINDOF:
				case UNUSED:
				case NULL_UNSPECIFIED:
				case NULLABLE:
				case NONNULL:
				case NULL_RESETTABLE:
				case NS_INLINE:
				case NS_ENUM:
				case NS_OPTIONS:
				case ASSIGN:
				case COPY:
				case GETTER:
				case SETTER:
				case STRONG:
				case READONLY:
				case READWRITE:
				case WEAK:
				case UNSAFE_UNRETAINED:
				case IB_OUTLET:
				case IB_OUTLET_COLLECTION:
				case IB_INSPECTABLE:
				case IB_DESIGNABLE:
				case IDENTIFIER:
					{
					setState(1100);
					identifier();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class BlockParametersContext extends ParserRuleContext {
		public TerminalNode LP() { return getToken(LogosXXParser.LP, 0); }
		public TerminalNode RP() { return getToken(LogosXXParser.RP, 0); }
		public List<TypeVariableDeclaratorOrNameContext> typeVariableDeclaratorOrName() {
			return getRuleContexts(TypeVariableDeclaratorOrNameContext.class);
		}
		public TypeVariableDeclaratorOrNameContext typeVariableDeclaratorOrName(int i) {
			return getRuleContext(TypeVariableDeclaratorOrNameContext.class,i);
		}
		public TerminalNode VOID() { return getToken(LogosXXParser.VOID, 0); }
		public List<TerminalNode> COMMA() { return getTokens(LogosXXParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(LogosXXParser.COMMA, i);
		}
		public BlockParametersContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_blockParameters; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LogosXXParserListener ) ((LogosXXParserListener)listener).enterBlockParameters(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LogosXXParserListener ) ((LogosXXParserListener)listener).exitBlockParameters(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LogosXXParserVisitor ) return ((LogosXXParserVisitor<? extends T>)visitor).visitBlockParameters(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BlockParametersContext blockParameters() throws RecognitionException {
		BlockParametersContext _localctx = new BlockParametersContext(_ctx, getState());
		enterRule(_localctx, 146, RULE_blockParameters);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1105);
			match(LP);
			setState(1117);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 18)) & ~0x3f) == 0 && ((1L << (_la - 18)) & ((1L << (AUTO - 18)) | (1L << (CHAR - 18)) | (1L << (CONST - 18)) | (1L << (DOUBLE - 18)) | (1L << (ENUM - 18)) | (1L << (EXTERN - 18)) | (1L << (FLOAT - 18)) | (1L << (INLINE - 18)) | (1L << (INT - 18)) | (1L << (LONG - 18)) | (1L << (REGISTER - 18)) | (1L << (RESTRICT - 18)) | (1L << (SHORT - 18)) | (1L << (SIGNED - 18)) | (1L << (STATIC - 18)) | (1L << (STRUCT - 18)) | (1L << (UNION - 18)) | (1L << (UNSIGNED - 18)) | (1L << (VOID - 18)) | (1L << (VOLATILE - 18)) | (1L << (BOOL - 18)) | (1L << (Class - 18)) | (1L << (BYCOPY - 18)) | (1L << (BYREF - 18)) | (1L << (ID - 18)) | (1L << (IMP - 18)) | (1L << (IN - 18)) | (1L << (INOUT - 18)) | (1L << (ONEWAY - 18)) | (1L << (OUT - 18)) | (1L << (PROTOCOL_ - 18)) | (1L << (SEL - 18)) | (1L << (SELF - 18)) | (1L << (SUPER - 18)))) != 0) || ((((_la - 98)) & ~0x3f) == 0 && ((1L << (_la - 98)) & ((1L << (ATOMIC - 98)) | (1L << (NONATOMIC - 98)) | (1L << (RETAIN - 98)) | (1L << (ATTRIBUTE - 98)) | (1L << (AUTORELEASING_QUALIFIER - 98)) | (1L << (BLOCK - 98)) | (1L << (BRIDGE - 98)) | (1L << (BRIDGE_RETAINED - 98)) | (1L << (BRIDGE_TRANSFER - 98)) | (1L << (COVARIANT - 98)) | (1L << (CONTRAVARIANT - 98)) | (1L << (DEPRECATED - 98)) | (1L << (KINDOF - 98)) | (1L << (STRONG_QUALIFIER - 98)) | (1L << (TYPEOF - 98)) | (1L << (UNSAFE_UNRETAINED_QUALIFIER - 98)) | (1L << (UNUSED - 98)) | (1L << (WEAK_QUALIFIER - 98)) | (1L << (NULL_UNSPECIFIED - 98)) | (1L << (NULLABLE - 98)) | (1L << (NONNULL - 98)) | (1L << (NULL_RESETTABLE - 98)) | (1L << (NS_INLINE - 98)) | (1L << (NS_ENUM - 98)) | (1L << (NS_OPTIONS - 98)) | (1L << (ASSIGN - 98)) | (1L << (COPY - 98)) | (1L << (GETTER - 98)) | (1L << (SETTER - 98)) | (1L << (STRONG - 98)) | (1L << (READONLY - 98)) | (1L << (READWRITE - 98)) | (1L << (WEAK - 98)) | (1L << (UNSAFE_UNRETAINED - 98)) | (1L << (IB_OUTLET - 98)) | (1L << (IB_OUTLET_COLLECTION - 98)) | (1L << (IB_INSPECTABLE - 98)) | (1L << (IB_DESIGNABLE - 98)) | (1L << (IDENTIFIER - 98)))) != 0)) {
				{
				setState(1108);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,112,_ctx) ) {
				case 1:
					{
					setState(1106);
					typeVariableDeclaratorOrName();
					}
					break;
				case 2:
					{
					setState(1107);
					match(VOID);
					}
					break;
				}
				setState(1114);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(1110);
					match(COMMA);
					setState(1111);
					typeVariableDeclaratorOrName();
					}
					}
					setState(1116);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(1119);
			match(RP);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TypeVariableDeclaratorOrNameContext extends ParserRuleContext {
		public TypeVariableDeclaratorContext typeVariableDeclarator() {
			return getRuleContext(TypeVariableDeclaratorContext.class,0);
		}
		public TypeNameContext typeName() {
			return getRuleContext(TypeNameContext.class,0);
		}
		public TypeVariableDeclaratorOrNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeVariableDeclaratorOrName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LogosXXParserListener ) ((LogosXXParserListener)listener).enterTypeVariableDeclaratorOrName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LogosXXParserListener ) ((LogosXXParserListener)listener).exitTypeVariableDeclaratorOrName(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LogosXXParserVisitor ) return ((LogosXXParserVisitor<? extends T>)visitor).visitTypeVariableDeclaratorOrName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeVariableDeclaratorOrNameContext typeVariableDeclaratorOrName() throws RecognitionException {
		TypeVariableDeclaratorOrNameContext _localctx = new TypeVariableDeclaratorOrNameContext(_ctx, getState());
		enterRule(_localctx, 148, RULE_typeVariableDeclaratorOrName);
		try {
			setState(1123);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,115,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1121);
				typeVariableDeclarator();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1122);
				typeName();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class BlockExpressionContext extends ParserRuleContext {
		public TerminalNode BITXOR() { return getToken(LogosXXParser.BITXOR, 0); }
		public CompoundStatementContext compoundStatement() {
			return getRuleContext(CompoundStatementContext.class,0);
		}
		public TypeSpecifierContext typeSpecifier() {
			return getRuleContext(TypeSpecifierContext.class,0);
		}
		public NullabilitySpecifierContext nullabilitySpecifier() {
			return getRuleContext(NullabilitySpecifierContext.class,0);
		}
		public BlockParametersContext blockParameters() {
			return getRuleContext(BlockParametersContext.class,0);
		}
		public BlockExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_blockExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LogosXXParserListener ) ((LogosXXParserListener)listener).enterBlockExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LogosXXParserListener ) ((LogosXXParserListener)listener).exitBlockExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LogosXXParserVisitor ) return ((LogosXXParserVisitor<? extends T>)visitor).visitBlockExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BlockExpressionContext blockExpression() throws RecognitionException {
		BlockExpressionContext _localctx = new BlockExpressionContext(_ctx, getState());
		enterRule(_localctx, 150, RULE_blockExpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1125);
			match(BITXOR);
			setState(1127);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,116,_ctx) ) {
			case 1:
				{
				setState(1126);
				typeSpecifier();
				}
				break;
			}
			setState(1130);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 116)) & ~0x3f) == 0 && ((1L << (_la - 116)) & ((1L << (NULL_UNSPECIFIED - 116)) | (1L << (NULLABLE - 116)) | (1L << (NONNULL - 116)) | (1L << (NULL_RESETTABLE - 116)))) != 0)) {
				{
				setState(1129);
				nullabilitySpecifier();
				}
			}

			setState(1133);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LP) {
				{
				setState(1132);
				blockParameters();
				}
			}

			setState(1135);
			compoundStatement();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class MessageExpressionContext extends ParserRuleContext {
		public TerminalNode LBRACK() { return getToken(LogosXXParser.LBRACK, 0); }
		public ReceiverContext receiver() {
			return getRuleContext(ReceiverContext.class,0);
		}
		public MessageSelectorContext messageSelector() {
			return getRuleContext(MessageSelectorContext.class,0);
		}
		public TerminalNode RBRACK() { return getToken(LogosXXParser.RBRACK, 0); }
		public MessageExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_messageExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LogosXXParserListener ) ((LogosXXParserListener)listener).enterMessageExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LogosXXParserListener ) ((LogosXXParserListener)listener).exitMessageExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LogosXXParserVisitor ) return ((LogosXXParserVisitor<? extends T>)visitor).visitMessageExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MessageExpressionContext messageExpression() throws RecognitionException {
		MessageExpressionContext _localctx = new MessageExpressionContext(_ctx, getState());
		enterRule(_localctx, 152, RULE_messageExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1137);
			match(LBRACK);
			setState(1138);
			receiver();
			setState(1139);
			messageSelector();
			setState(1140);
			match(RBRACK);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ReceiverContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TypeSpecifierContext typeSpecifier() {
			return getRuleContext(TypeSpecifierContext.class,0);
		}
		public ReceiverContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_receiver; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LogosXXParserListener ) ((LogosXXParserListener)listener).enterReceiver(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LogosXXParserListener ) ((LogosXXParserListener)listener).exitReceiver(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LogosXXParserVisitor ) return ((LogosXXParserVisitor<? extends T>)visitor).visitReceiver(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ReceiverContext receiver() throws RecognitionException {
		ReceiverContext _localctx = new ReceiverContext(_ctx, getState());
		enterRule(_localctx, 154, RULE_receiver);
		try {
			setState(1144);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,119,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1142);
				expression(0);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1143);
				typeSpecifier();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class MessageSelectorContext extends ParserRuleContext {
		public SelectorContext selector() {
			return getRuleContext(SelectorContext.class,0);
		}
		public List<KeywordArgumentContext> keywordArgument() {
			return getRuleContexts(KeywordArgumentContext.class);
		}
		public KeywordArgumentContext keywordArgument(int i) {
			return getRuleContext(KeywordArgumentContext.class,i);
		}
		public MessageSelectorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_messageSelector; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LogosXXParserListener ) ((LogosXXParserListener)listener).enterMessageSelector(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LogosXXParserListener ) ((LogosXXParserListener)listener).exitMessageSelector(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LogosXXParserVisitor ) return ((LogosXXParserVisitor<? extends T>)visitor).visitMessageSelector(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MessageSelectorContext messageSelector() throws RecognitionException {
		MessageSelectorContext _localctx = new MessageSelectorContext(_ctx, getState());
		enterRule(_localctx, 156, RULE_messageSelector);
		int _la;
		try {
			setState(1152);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,121,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1146);
				selector();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1148); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(1147);
					keywordArgument();
					}
					}
					setState(1150); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( ((((_la - 39)) & ~0x3f) == 0 && ((1L << (_la - 39)) & ((1L << (RETURN - 39)) | (1L << (BOOL - 39)) | (1L << (Class - 39)) | (1L << (BYCOPY - 39)) | (1L << (BYREF - 39)) | (1L << (ID - 39)) | (1L << (IMP - 39)) | (1L << (IN - 39)) | (1L << (INOUT - 39)) | (1L << (ONEWAY - 39)) | (1L << (OUT - 39)) | (1L << (PROTOCOL_ - 39)) | (1L << (SEL - 39)) | (1L << (SELF - 39)) | (1L << (SUPER - 39)) | (1L << (ATOMIC - 39)) | (1L << (NONATOMIC - 39)) | (1L << (RETAIN - 39)) | (1L << (AUTORELEASING_QUALIFIER - 39)))) != 0) || ((((_la - 103)) & ~0x3f) == 0 && ((1L << (_la - 103)) & ((1L << (BLOCK - 103)) | (1L << (BRIDGE_RETAINED - 103)) | (1L << (BRIDGE_TRANSFER - 103)) | (1L << (COVARIANT - 103)) | (1L << (CONTRAVARIANT - 103)) | (1L << (DEPRECATED - 103)) | (1L << (KINDOF - 103)) | (1L << (UNUSED - 103)) | (1L << (NULL_UNSPECIFIED - 103)) | (1L << (NULLABLE - 103)) | (1L << (NONNULL - 103)) | (1L << (NULL_RESETTABLE - 103)) | (1L << (NS_INLINE - 103)) | (1L << (NS_ENUM - 103)) | (1L << (NS_OPTIONS - 103)) | (1L << (ASSIGN - 103)) | (1L << (COPY - 103)) | (1L << (GETTER - 103)) | (1L << (SETTER - 103)) | (1L << (STRONG - 103)) | (1L << (READONLY - 103)) | (1L << (READWRITE - 103)) | (1L << (WEAK - 103)) | (1L << (UNSAFE_UNRETAINED - 103)) | (1L << (IB_OUTLET - 103)) | (1L << (IB_OUTLET_COLLECTION - 103)) | (1L << (IB_INSPECTABLE - 103)) | (1L << (IB_DESIGNABLE - 103)) | (1L << (IDENTIFIER - 103)) | (1L << (COLON - 103)))) != 0) );
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class KeywordArgumentContext extends ParserRuleContext {
		public TerminalNode COLON() { return getToken(LogosXXParser.COLON, 0); }
		public List<KeywordArgumentTypeContext> keywordArgumentType() {
			return getRuleContexts(KeywordArgumentTypeContext.class);
		}
		public KeywordArgumentTypeContext keywordArgumentType(int i) {
			return getRuleContext(KeywordArgumentTypeContext.class,i);
		}
		public SelectorContext selector() {
			return getRuleContext(SelectorContext.class,0);
		}
		public List<TerminalNode> COMMA() { return getTokens(LogosXXParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(LogosXXParser.COMMA, i);
		}
		public KeywordArgumentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_keywordArgument; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LogosXXParserListener ) ((LogosXXParserListener)listener).enterKeywordArgument(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LogosXXParserListener ) ((LogosXXParserListener)listener).exitKeywordArgument(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LogosXXParserVisitor ) return ((LogosXXParserVisitor<? extends T>)visitor).visitKeywordArgument(this);
			else return visitor.visitChildren(this);
		}
	}

	public final KeywordArgumentContext keywordArgument() throws RecognitionException {
		KeywordArgumentContext _localctx = new KeywordArgumentContext(_ctx, getState());
		enterRule(_localctx, 158, RULE_keywordArgument);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1155);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 39)) & ~0x3f) == 0 && ((1L << (_la - 39)) & ((1L << (RETURN - 39)) | (1L << (BOOL - 39)) | (1L << (Class - 39)) | (1L << (BYCOPY - 39)) | (1L << (BYREF - 39)) | (1L << (ID - 39)) | (1L << (IMP - 39)) | (1L << (IN - 39)) | (1L << (INOUT - 39)) | (1L << (ONEWAY - 39)) | (1L << (OUT - 39)) | (1L << (PROTOCOL_ - 39)) | (1L << (SEL - 39)) | (1L << (SELF - 39)) | (1L << (SUPER - 39)) | (1L << (ATOMIC - 39)) | (1L << (NONATOMIC - 39)) | (1L << (RETAIN - 39)) | (1L << (AUTORELEASING_QUALIFIER - 39)))) != 0) || ((((_la - 103)) & ~0x3f) == 0 && ((1L << (_la - 103)) & ((1L << (BLOCK - 103)) | (1L << (BRIDGE_RETAINED - 103)) | (1L << (BRIDGE_TRANSFER - 103)) | (1L << (COVARIANT - 103)) | (1L << (CONTRAVARIANT - 103)) | (1L << (DEPRECATED - 103)) | (1L << (KINDOF - 103)) | (1L << (UNUSED - 103)) | (1L << (NULL_UNSPECIFIED - 103)) | (1L << (NULLABLE - 103)) | (1L << (NONNULL - 103)) | (1L << (NULL_RESETTABLE - 103)) | (1L << (NS_INLINE - 103)) | (1L << (NS_ENUM - 103)) | (1L << (NS_OPTIONS - 103)) | (1L << (ASSIGN - 103)) | (1L << (COPY - 103)) | (1L << (GETTER - 103)) | (1L << (SETTER - 103)) | (1L << (STRONG - 103)) | (1L << (READONLY - 103)) | (1L << (READWRITE - 103)) | (1L << (WEAK - 103)) | (1L << (UNSAFE_UNRETAINED - 103)) | (1L << (IB_OUTLET - 103)) | (1L << (IB_OUTLET_COLLECTION - 103)) | (1L << (IB_INSPECTABLE - 103)) | (1L << (IB_DESIGNABLE - 103)) | (1L << (IDENTIFIER - 103)))) != 0)) {
				{
				setState(1154);
				selector();
				}
			}

			setState(1157);
			match(COLON);
			setState(1158);
			keywordArgumentType();
			setState(1163);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(1159);
				match(COMMA);
				setState(1160);
				keywordArgumentType();
				}
				}
				setState(1165);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class KeywordArgumentTypeContext extends ParserRuleContext {
		public ExpressionsContext expressions() {
			return getRuleContext(ExpressionsContext.class,0);
		}
		public NullabilitySpecifierContext nullabilitySpecifier() {
			return getRuleContext(NullabilitySpecifierContext.class,0);
		}
		public TerminalNode LBRACE() { return getToken(LogosXXParser.LBRACE, 0); }
		public InitializerListContext initializerList() {
			return getRuleContext(InitializerListContext.class,0);
		}
		public TerminalNode RBRACE() { return getToken(LogosXXParser.RBRACE, 0); }
		public KeywordArgumentTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_keywordArgumentType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LogosXXParserListener ) ((LogosXXParserListener)listener).enterKeywordArgumentType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LogosXXParserListener ) ((LogosXXParserListener)listener).exitKeywordArgumentType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LogosXXParserVisitor ) return ((LogosXXParserVisitor<? extends T>)visitor).visitKeywordArgumentType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final KeywordArgumentTypeContext keywordArgumentType() throws RecognitionException {
		KeywordArgumentTypeContext _localctx = new KeywordArgumentTypeContext(_ctx, getState());
		enterRule(_localctx, 160, RULE_keywordArgumentType);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1166);
			expressions();
			setState(1168);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,124,_ctx) ) {
			case 1:
				{
				setState(1167);
				nullabilitySpecifier();
				}
				break;
			}
			setState(1174);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LBRACE) {
				{
				setState(1170);
				match(LBRACE);
				setState(1171);
				initializerList();
				setState(1172);
				match(RBRACE);
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SelectorExpressionContext extends ParserRuleContext {
		public TerminalNode SELECTOR() { return getToken(LogosXXParser.SELECTOR, 0); }
		public TerminalNode LP() { return getToken(LogosXXParser.LP, 0); }
		public SelectorNameContext selectorName() {
			return getRuleContext(SelectorNameContext.class,0);
		}
		public TerminalNode RP() { return getToken(LogosXXParser.RP, 0); }
		public SelectorExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_selectorExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LogosXXParserListener ) ((LogosXXParserListener)listener).enterSelectorExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LogosXXParserListener ) ((LogosXXParserListener)listener).exitSelectorExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LogosXXParserVisitor ) return ((LogosXXParserVisitor<? extends T>)visitor).visitSelectorExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SelectorExpressionContext selectorExpression() throws RecognitionException {
		SelectorExpressionContext _localctx = new SelectorExpressionContext(_ctx, getState());
		enterRule(_localctx, 162, RULE_selectorExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1176);
			match(SELECTOR);
			setState(1177);
			match(LP);
			setState(1178);
			selectorName();
			setState(1179);
			match(RP);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SelectorNameContext extends ParserRuleContext {
		public List<SelectorContext> selector() {
			return getRuleContexts(SelectorContext.class);
		}
		public SelectorContext selector(int i) {
			return getRuleContext(SelectorContext.class,i);
		}
		public List<TerminalNode> COLON() { return getTokens(LogosXXParser.COLON); }
		public TerminalNode COLON(int i) {
			return getToken(LogosXXParser.COLON, i);
		}
		public SelectorNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_selectorName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LogosXXParserListener ) ((LogosXXParserListener)listener).enterSelectorName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LogosXXParserListener ) ((LogosXXParserListener)listener).exitSelectorName(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LogosXXParserVisitor ) return ((LogosXXParserVisitor<? extends T>)visitor).visitSelectorName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SelectorNameContext selectorName() throws RecognitionException {
		SelectorNameContext _localctx = new SelectorNameContext(_ctx, getState());
		enterRule(_localctx, 164, RULE_selectorName);
		int _la;
		try {
			setState(1190);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,128,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1181);
				selector();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1186); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(1183);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (((((_la - 39)) & ~0x3f) == 0 && ((1L << (_la - 39)) & ((1L << (RETURN - 39)) | (1L << (BOOL - 39)) | (1L << (Class - 39)) | (1L << (BYCOPY - 39)) | (1L << (BYREF - 39)) | (1L << (ID - 39)) | (1L << (IMP - 39)) | (1L << (IN - 39)) | (1L << (INOUT - 39)) | (1L << (ONEWAY - 39)) | (1L << (OUT - 39)) | (1L << (PROTOCOL_ - 39)) | (1L << (SEL - 39)) | (1L << (SELF - 39)) | (1L << (SUPER - 39)) | (1L << (ATOMIC - 39)) | (1L << (NONATOMIC - 39)) | (1L << (RETAIN - 39)) | (1L << (AUTORELEASING_QUALIFIER - 39)))) != 0) || ((((_la - 103)) & ~0x3f) == 0 && ((1L << (_la - 103)) & ((1L << (BLOCK - 103)) | (1L << (BRIDGE_RETAINED - 103)) | (1L << (BRIDGE_TRANSFER - 103)) | (1L << (COVARIANT - 103)) | (1L << (CONTRAVARIANT - 103)) | (1L << (DEPRECATED - 103)) | (1L << (KINDOF - 103)) | (1L << (UNUSED - 103)) | (1L << (NULL_UNSPECIFIED - 103)) | (1L << (NULLABLE - 103)) | (1L << (NONNULL - 103)) | (1L << (NULL_RESETTABLE - 103)) | (1L << (NS_INLINE - 103)) | (1L << (NS_ENUM - 103)) | (1L << (NS_OPTIONS - 103)) | (1L << (ASSIGN - 103)) | (1L << (COPY - 103)) | (1L << (GETTER - 103)) | (1L << (SETTER - 103)) | (1L << (STRONG - 103)) | (1L << (READONLY - 103)) | (1L << (READWRITE - 103)) | (1L << (WEAK - 103)) | (1L << (UNSAFE_UNRETAINED - 103)) | (1L << (IB_OUTLET - 103)) | (1L << (IB_OUTLET_COLLECTION - 103)) | (1L << (IB_INSPECTABLE - 103)) | (1L << (IB_DESIGNABLE - 103)) | (1L << (IDENTIFIER - 103)))) != 0)) {
						{
						setState(1182);
						selector();
						}
					}

					setState(1185);
					match(COLON);
					}
					}
					setState(1188); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( ((((_la - 39)) & ~0x3f) == 0 && ((1L << (_la - 39)) & ((1L << (RETURN - 39)) | (1L << (BOOL - 39)) | (1L << (Class - 39)) | (1L << (BYCOPY - 39)) | (1L << (BYREF - 39)) | (1L << (ID - 39)) | (1L << (IMP - 39)) | (1L << (IN - 39)) | (1L << (INOUT - 39)) | (1L << (ONEWAY - 39)) | (1L << (OUT - 39)) | (1L << (PROTOCOL_ - 39)) | (1L << (SEL - 39)) | (1L << (SELF - 39)) | (1L << (SUPER - 39)) | (1L << (ATOMIC - 39)) | (1L << (NONATOMIC - 39)) | (1L << (RETAIN - 39)) | (1L << (AUTORELEASING_QUALIFIER - 39)))) != 0) || ((((_la - 103)) & ~0x3f) == 0 && ((1L << (_la - 103)) & ((1L << (BLOCK - 103)) | (1L << (BRIDGE_RETAINED - 103)) | (1L << (BRIDGE_TRANSFER - 103)) | (1L << (COVARIANT - 103)) | (1L << (CONTRAVARIANT - 103)) | (1L << (DEPRECATED - 103)) | (1L << (KINDOF - 103)) | (1L << (UNUSED - 103)) | (1L << (NULL_UNSPECIFIED - 103)) | (1L << (NULLABLE - 103)) | (1L << (NONNULL - 103)) | (1L << (NULL_RESETTABLE - 103)) | (1L << (NS_INLINE - 103)) | (1L << (NS_ENUM - 103)) | (1L << (NS_OPTIONS - 103)) | (1L << (ASSIGN - 103)) | (1L << (COPY - 103)) | (1L << (GETTER - 103)) | (1L << (SETTER - 103)) | (1L << (STRONG - 103)) | (1L << (READONLY - 103)) | (1L << (READWRITE - 103)) | (1L << (WEAK - 103)) | (1L << (UNSAFE_UNRETAINED - 103)) | (1L << (IB_OUTLET - 103)) | (1L << (IB_OUTLET_COLLECTION - 103)) | (1L << (IB_INSPECTABLE - 103)) | (1L << (IB_DESIGNABLE - 103)) | (1L << (IDENTIFIER - 103)) | (1L << (COLON - 103)))) != 0) );
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ProtocolExpressionContext extends ParserRuleContext {
		public TerminalNode PROTOCOL() { return getToken(LogosXXParser.PROTOCOL, 0); }
		public TerminalNode LP() { return getToken(LogosXXParser.LP, 0); }
		public ProtocolNameContext protocolName() {
			return getRuleContext(ProtocolNameContext.class,0);
		}
		public TerminalNode RP() { return getToken(LogosXXParser.RP, 0); }
		public ProtocolExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_protocolExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LogosXXParserListener ) ((LogosXXParserListener)listener).enterProtocolExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LogosXXParserListener ) ((LogosXXParserListener)listener).exitProtocolExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LogosXXParserVisitor ) return ((LogosXXParserVisitor<? extends T>)visitor).visitProtocolExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProtocolExpressionContext protocolExpression() throws RecognitionException {
		ProtocolExpressionContext _localctx = new ProtocolExpressionContext(_ctx, getState());
		enterRule(_localctx, 166, RULE_protocolExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1192);
			match(PROTOCOL);
			setState(1193);
			match(LP);
			setState(1194);
			protocolName();
			setState(1195);
			match(RP);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class EncodeExpressionContext extends ParserRuleContext {
		public TerminalNode ENCODE() { return getToken(LogosXXParser.ENCODE, 0); }
		public TerminalNode LP() { return getToken(LogosXXParser.LP, 0); }
		public TypeNameContext typeName() {
			return getRuleContext(TypeNameContext.class,0);
		}
		public TerminalNode RP() { return getToken(LogosXXParser.RP, 0); }
		public EncodeExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_encodeExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LogosXXParserListener ) ((LogosXXParserListener)listener).enterEncodeExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LogosXXParserListener ) ((LogosXXParserListener)listener).exitEncodeExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LogosXXParserVisitor ) return ((LogosXXParserVisitor<? extends T>)visitor).visitEncodeExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EncodeExpressionContext encodeExpression() throws RecognitionException {
		EncodeExpressionContext _localctx = new EncodeExpressionContext(_ctx, getState());
		enterRule(_localctx, 168, RULE_encodeExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1197);
			match(ENCODE);
			setState(1198);
			match(LP);
			setState(1199);
			typeName();
			setState(1200);
			match(RP);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TypeVariableDeclaratorContext extends ParserRuleContext {
		public DeclarationSpecifiersContext declarationSpecifiers() {
			return getRuleContext(DeclarationSpecifiersContext.class,0);
		}
		public DeclaratorContext declarator() {
			return getRuleContext(DeclaratorContext.class,0);
		}
		public TypeVariableDeclaratorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeVariableDeclarator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LogosXXParserListener ) ((LogosXXParserListener)listener).enterTypeVariableDeclarator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LogosXXParserListener ) ((LogosXXParserListener)listener).exitTypeVariableDeclarator(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LogosXXParserVisitor ) return ((LogosXXParserVisitor<? extends T>)visitor).visitTypeVariableDeclarator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeVariableDeclaratorContext typeVariableDeclarator() throws RecognitionException {
		TypeVariableDeclaratorContext _localctx = new TypeVariableDeclaratorContext(_ctx, getState());
		enterRule(_localctx, 170, RULE_typeVariableDeclarator);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1202);
			declarationSpecifiers();
			setState(1203);
			declarator();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ThrowStatementContext extends ParserRuleContext {
		public TerminalNode THROW() { return getToken(LogosXXParser.THROW, 0); }
		public TerminalNode LP() { return getToken(LogosXXParser.LP, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode RP() { return getToken(LogosXXParser.RP, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ThrowStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_throwStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LogosXXParserListener ) ((LogosXXParserListener)listener).enterThrowStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LogosXXParserListener ) ((LogosXXParserListener)listener).exitThrowStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LogosXXParserVisitor ) return ((LogosXXParserVisitor<? extends T>)visitor).visitThrowStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ThrowStatementContext throwStatement() throws RecognitionException {
		ThrowStatementContext _localctx = new ThrowStatementContext(_ctx, getState());
		enterRule(_localctx, 172, RULE_throwStatement);
		try {
			setState(1212);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,129,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1205);
				match(THROW);
				setState(1206);
				match(LP);
				setState(1207);
				identifier();
				setState(1208);
				match(RP);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1210);
				match(THROW);
				setState(1211);
				expression(0);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TryBlockContext extends ParserRuleContext {
		public CompoundStatementContext tryStatement;
		public CompoundStatementContext finallyStatement;
		public TerminalNode TRY() { return getToken(LogosXXParser.TRY, 0); }
		public List<CompoundStatementContext> compoundStatement() {
			return getRuleContexts(CompoundStatementContext.class);
		}
		public CompoundStatementContext compoundStatement(int i) {
			return getRuleContext(CompoundStatementContext.class,i);
		}
		public List<CatchStatementContext> catchStatement() {
			return getRuleContexts(CatchStatementContext.class);
		}
		public CatchStatementContext catchStatement(int i) {
			return getRuleContext(CatchStatementContext.class,i);
		}
		public TerminalNode FINALLY() { return getToken(LogosXXParser.FINALLY, 0); }
		public TryBlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tryBlock; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LogosXXParserListener ) ((LogosXXParserListener)listener).enterTryBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LogosXXParserListener ) ((LogosXXParserListener)listener).exitTryBlock(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LogosXXParserVisitor ) return ((LogosXXParserVisitor<? extends T>)visitor).visitTryBlock(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TryBlockContext tryBlock() throws RecognitionException {
		TryBlockContext _localctx = new TryBlockContext(_ctx, getState());
		enterRule(_localctx, 174, RULE_tryBlock);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1214);
			match(TRY);
			setState(1215);
			((TryBlockContext)_localctx).tryStatement = compoundStatement();
			setState(1219);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==CATCH) {
				{
				{
				setState(1216);
				catchStatement();
				}
				}
				setState(1221);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1224);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==FINALLY) {
				{
				setState(1222);
				match(FINALLY);
				setState(1223);
				((TryBlockContext)_localctx).finallyStatement = compoundStatement();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CatchStatementContext extends ParserRuleContext {
		public TerminalNode CATCH() { return getToken(LogosXXParser.CATCH, 0); }
		public TerminalNode LP() { return getToken(LogosXXParser.LP, 0); }
		public TypeVariableDeclaratorContext typeVariableDeclarator() {
			return getRuleContext(TypeVariableDeclaratorContext.class,0);
		}
		public TerminalNode RP() { return getToken(LogosXXParser.RP, 0); }
		public CompoundStatementContext compoundStatement() {
			return getRuleContext(CompoundStatementContext.class,0);
		}
		public CatchStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_catchStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LogosXXParserListener ) ((LogosXXParserListener)listener).enterCatchStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LogosXXParserListener ) ((LogosXXParserListener)listener).exitCatchStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LogosXXParserVisitor ) return ((LogosXXParserVisitor<? extends T>)visitor).visitCatchStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CatchStatementContext catchStatement() throws RecognitionException {
		CatchStatementContext _localctx = new CatchStatementContext(_ctx, getState());
		enterRule(_localctx, 176, RULE_catchStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1226);
			match(CATCH);
			setState(1227);
			match(LP);
			setState(1228);
			typeVariableDeclarator();
			setState(1229);
			match(RP);
			setState(1230);
			compoundStatement();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SynchronizedStatementContext extends ParserRuleContext {
		public TerminalNode SYNCHRONIZED() { return getToken(LogosXXParser.SYNCHRONIZED, 0); }
		public TerminalNode LP() { return getToken(LogosXXParser.LP, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode RP() { return getToken(LogosXXParser.RP, 0); }
		public CompoundStatementContext compoundStatement() {
			return getRuleContext(CompoundStatementContext.class,0);
		}
		public SynchronizedStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_synchronizedStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LogosXXParserListener ) ((LogosXXParserListener)listener).enterSynchronizedStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LogosXXParserListener ) ((LogosXXParserListener)listener).exitSynchronizedStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LogosXXParserVisitor ) return ((LogosXXParserVisitor<? extends T>)visitor).visitSynchronizedStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SynchronizedStatementContext synchronizedStatement() throws RecognitionException {
		SynchronizedStatementContext _localctx = new SynchronizedStatementContext(_ctx, getState());
		enterRule(_localctx, 178, RULE_synchronizedStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1232);
			match(SYNCHRONIZED);
			setState(1233);
			match(LP);
			setState(1234);
			expression(0);
			setState(1235);
			match(RP);
			setState(1236);
			compoundStatement();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AutoreleaseStatementContext extends ParserRuleContext {
		public TerminalNode AUTORELEASEPOOL() { return getToken(LogosXXParser.AUTORELEASEPOOL, 0); }
		public CompoundStatementContext compoundStatement() {
			return getRuleContext(CompoundStatementContext.class,0);
		}
		public AutoreleaseStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_autoreleaseStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LogosXXParserListener ) ((LogosXXParserListener)listener).enterAutoreleaseStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LogosXXParserListener ) ((LogosXXParserListener)listener).exitAutoreleaseStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LogosXXParserVisitor ) return ((LogosXXParserVisitor<? extends T>)visitor).visitAutoreleaseStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AutoreleaseStatementContext autoreleaseStatement() throws RecognitionException {
		AutoreleaseStatementContext _localctx = new AutoreleaseStatementContext(_ctx, getState());
		enterRule(_localctx, 180, RULE_autoreleaseStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1238);
			match(AUTORELEASEPOOL);
			setState(1239);
			compoundStatement();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FunctionDeclarationContext extends ParserRuleContext {
		public FunctionSignatureContext functionSignature() {
			return getRuleContext(FunctionSignatureContext.class,0);
		}
		public TerminalNode SEMI() { return getToken(LogosXXParser.SEMI, 0); }
		public FunctionDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LogosXXParserListener ) ((LogosXXParserListener)listener).enterFunctionDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LogosXXParserListener ) ((LogosXXParserListener)listener).exitFunctionDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LogosXXParserVisitor ) return ((LogosXXParserVisitor<? extends T>)visitor).visitFunctionDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunctionDeclarationContext functionDeclaration() throws RecognitionException {
		FunctionDeclarationContext _localctx = new FunctionDeclarationContext(_ctx, getState());
		enterRule(_localctx, 182, RULE_functionDeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1241);
			functionSignature();
			setState(1242);
			match(SEMI);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FunctionDefinitionContext extends ParserRuleContext {
		public FunctionSignatureContext functionSignature() {
			return getRuleContext(FunctionSignatureContext.class,0);
		}
		public CompoundStatementContext compoundStatement() {
			return getRuleContext(CompoundStatementContext.class,0);
		}
		public FunctionDefinitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionDefinition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LogosXXParserListener ) ((LogosXXParserListener)listener).enterFunctionDefinition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LogosXXParserListener ) ((LogosXXParserListener)listener).exitFunctionDefinition(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LogosXXParserVisitor ) return ((LogosXXParserVisitor<? extends T>)visitor).visitFunctionDefinition(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunctionDefinitionContext functionDefinition() throws RecognitionException {
		FunctionDefinitionContext _localctx = new FunctionDefinitionContext(_ctx, getState());
		enterRule(_localctx, 184, RULE_functionDefinition);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1244);
			functionSignature();
			setState(1245);
			compoundStatement();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FunctionSignatureContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode LP() { return getToken(LogosXXParser.LP, 0); }
		public TerminalNode RP() { return getToken(LogosXXParser.RP, 0); }
		public DeclarationSpecifiersContext declarationSpecifiers() {
			return getRuleContext(DeclarationSpecifiersContext.class,0);
		}
		public AttributeSpecifierContext attributeSpecifier() {
			return getRuleContext(AttributeSpecifierContext.class,0);
		}
		public ParameterListContext parameterList() {
			return getRuleContext(ParameterListContext.class,0);
		}
		public FunctionSignatureContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionSignature; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LogosXXParserListener ) ((LogosXXParserListener)listener).enterFunctionSignature(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LogosXXParserListener ) ((LogosXXParserListener)listener).exitFunctionSignature(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LogosXXParserVisitor ) return ((LogosXXParserVisitor<? extends T>)visitor).visitFunctionSignature(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunctionSignatureContext functionSignature() throws RecognitionException {
		FunctionSignatureContext _localctx = new FunctionSignatureContext(_ctx, getState());
		enterRule(_localctx, 186, RULE_functionSignature);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1248);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,132,_ctx) ) {
			case 1:
				{
				setState(1247);
				declarationSpecifiers();
				}
				break;
			}
			setState(1250);
			identifier();
			{
			setState(1251);
			match(LP);
			setState(1253);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 18)) & ~0x3f) == 0 && ((1L << (_la - 18)) & ((1L << (AUTO - 18)) | (1L << (CHAR - 18)) | (1L << (CONST - 18)) | (1L << (DOUBLE - 18)) | (1L << (ENUM - 18)) | (1L << (EXTERN - 18)) | (1L << (FLOAT - 18)) | (1L << (INLINE - 18)) | (1L << (INT - 18)) | (1L << (LONG - 18)) | (1L << (REGISTER - 18)) | (1L << (RESTRICT - 18)) | (1L << (SHORT - 18)) | (1L << (SIGNED - 18)) | (1L << (STATIC - 18)) | (1L << (STRUCT - 18)) | (1L << (UNION - 18)) | (1L << (UNSIGNED - 18)) | (1L << (VOID - 18)) | (1L << (VOLATILE - 18)) | (1L << (BOOL - 18)) | (1L << (Class - 18)) | (1L << (BYCOPY - 18)) | (1L << (BYREF - 18)) | (1L << (ID - 18)) | (1L << (IMP - 18)) | (1L << (IN - 18)) | (1L << (INOUT - 18)) | (1L << (ONEWAY - 18)) | (1L << (OUT - 18)) | (1L << (PROTOCOL_ - 18)) | (1L << (SEL - 18)) | (1L << (SELF - 18)) | (1L << (SUPER - 18)))) != 0) || ((((_la - 98)) & ~0x3f) == 0 && ((1L << (_la - 98)) & ((1L << (ATOMIC - 98)) | (1L << (NONATOMIC - 98)) | (1L << (RETAIN - 98)) | (1L << (ATTRIBUTE - 98)) | (1L << (AUTORELEASING_QUALIFIER - 98)) | (1L << (BLOCK - 98)) | (1L << (BRIDGE - 98)) | (1L << (BRIDGE_RETAINED - 98)) | (1L << (BRIDGE_TRANSFER - 98)) | (1L << (COVARIANT - 98)) | (1L << (CONTRAVARIANT - 98)) | (1L << (DEPRECATED - 98)) | (1L << (KINDOF - 98)) | (1L << (STRONG_QUALIFIER - 98)) | (1L << (TYPEOF - 98)) | (1L << (UNSAFE_UNRETAINED_QUALIFIER - 98)) | (1L << (UNUSED - 98)) | (1L << (WEAK_QUALIFIER - 98)) | (1L << (NULL_UNSPECIFIED - 98)) | (1L << (NULLABLE - 98)) | (1L << (NONNULL - 98)) | (1L << (NULL_RESETTABLE - 98)) | (1L << (NS_INLINE - 98)) | (1L << (NS_ENUM - 98)) | (1L << (NS_OPTIONS - 98)) | (1L << (ASSIGN - 98)) | (1L << (COPY - 98)) | (1L << (GETTER - 98)) | (1L << (SETTER - 98)) | (1L << (STRONG - 98)) | (1L << (READONLY - 98)) | (1L << (READWRITE - 98)) | (1L << (WEAK - 98)) | (1L << (UNSAFE_UNRETAINED - 98)) | (1L << (IB_OUTLET - 98)) | (1L << (IB_OUTLET_COLLECTION - 98)) | (1L << (IB_INSPECTABLE - 98)) | (1L << (IB_DESIGNABLE - 98)) | (1L << (IDENTIFIER - 98)))) != 0)) {
				{
				setState(1252);
				parameterList();
				}
			}

			setState(1255);
			match(RP);
			}
			setState(1258);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ATTRIBUTE) {
				{
				setState(1257);
				attributeSpecifier();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AttributeContext extends ParserRuleContext {
		public AttributeNameContext attributeName() {
			return getRuleContext(AttributeNameContext.class,0);
		}
		public AttributeParametersContext attributeParameters() {
			return getRuleContext(AttributeParametersContext.class,0);
		}
		public AttributeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_attribute; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LogosXXParserListener ) ((LogosXXParserListener)listener).enterAttribute(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LogosXXParserListener ) ((LogosXXParserListener)listener).exitAttribute(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LogosXXParserVisitor ) return ((LogosXXParserVisitor<? extends T>)visitor).visitAttribute(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AttributeContext attribute() throws RecognitionException {
		AttributeContext _localctx = new AttributeContext(_ctx, getState());
		enterRule(_localctx, 188, RULE_attribute);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1260);
			attributeName();
			setState(1262);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LP) {
				{
				setState(1261);
				attributeParameters();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AttributeNameContext extends ParserRuleContext {
		public TerminalNode CONST() { return getToken(LogosXXParser.CONST, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public AttributeNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_attributeName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LogosXXParserListener ) ((LogosXXParserListener)listener).enterAttributeName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LogosXXParserListener ) ((LogosXXParserListener)listener).exitAttributeName(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LogosXXParserVisitor ) return ((LogosXXParserVisitor<? extends T>)visitor).visitAttributeName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AttributeNameContext attributeName() throws RecognitionException {
		AttributeNameContext _localctx = new AttributeNameContext(_ctx, getState());
		enterRule(_localctx, 190, RULE_attributeName);
		try {
			setState(1266);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case CONST:
				enterOuterAlt(_localctx, 1);
				{
				setState(1264);
				match(CONST);
				}
				break;
			case BOOL:
			case Class:
			case BYCOPY:
			case BYREF:
			case ID:
			case IMP:
			case IN:
			case INOUT:
			case ONEWAY:
			case OUT:
			case PROTOCOL_:
			case SEL:
			case SELF:
			case SUPER:
			case ATOMIC:
			case NONATOMIC:
			case RETAIN:
			case AUTORELEASING_QUALIFIER:
			case BLOCK:
			case BRIDGE_RETAINED:
			case BRIDGE_TRANSFER:
			case COVARIANT:
			case CONTRAVARIANT:
			case DEPRECATED:
			case KINDOF:
			case UNUSED:
			case NULL_UNSPECIFIED:
			case NULLABLE:
			case NONNULL:
			case NULL_RESETTABLE:
			case NS_INLINE:
			case NS_ENUM:
			case NS_OPTIONS:
			case ASSIGN:
			case COPY:
			case GETTER:
			case SETTER:
			case STRONG:
			case READONLY:
			case READWRITE:
			case WEAK:
			case UNSAFE_UNRETAINED:
			case IB_OUTLET:
			case IB_OUTLET_COLLECTION:
			case IB_INSPECTABLE:
			case IB_DESIGNABLE:
			case IDENTIFIER:
				enterOuterAlt(_localctx, 2);
				{
				setState(1265);
				identifier();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AttributeParametersContext extends ParserRuleContext {
		public TerminalNode LP() { return getToken(LogosXXParser.LP, 0); }
		public TerminalNode RP() { return getToken(LogosXXParser.RP, 0); }
		public AttributeParameterListContext attributeParameterList() {
			return getRuleContext(AttributeParameterListContext.class,0);
		}
		public AttributeParametersContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_attributeParameters; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LogosXXParserListener ) ((LogosXXParserListener)listener).enterAttributeParameters(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LogosXXParserListener ) ((LogosXXParserListener)listener).exitAttributeParameters(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LogosXXParserVisitor ) return ((LogosXXParserVisitor<? extends T>)visitor).visitAttributeParameters(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AttributeParametersContext attributeParameters() throws RecognitionException {
		AttributeParametersContext _localctx = new AttributeParametersContext(_ctx, getState());
		enterRule(_localctx, 192, RULE_attributeParameters);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1268);
			match(LP);
			setState(1270);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 22)) & ~0x3f) == 0 && ((1L << (_la - 22)) & ((1L << (CONST - 22)) | (1L << (TRUE - 22)) | (1L << (FALSE - 22)) | (1L << (BOOL - 22)) | (1L << (Class - 22)) | (1L << (BYCOPY - 22)) | (1L << (BYREF - 22)) | (1L << (ID - 22)) | (1L << (IMP - 22)) | (1L << (IN - 22)) | (1L << (INOUT - 22)) | (1L << (NIL - 22)) | (1L << (NO - 22)) | (1L << (NULL - 22)) | (1L << (ONEWAY - 22)) | (1L << (OUT - 22)) | (1L << (PROTOCOL_ - 22)) | (1L << (SEL - 22)) | (1L << (SELF - 22)) | (1L << (SUPER - 22)) | (1L << (YES - 22)))) != 0) || ((((_la - 98)) & ~0x3f) == 0 && ((1L << (_la - 98)) & ((1L << (ATOMIC - 98)) | (1L << (NONATOMIC - 98)) | (1L << (RETAIN - 98)) | (1L << (AUTORELEASING_QUALIFIER - 98)) | (1L << (BLOCK - 98)) | (1L << (BRIDGE_RETAINED - 98)) | (1L << (BRIDGE_TRANSFER - 98)) | (1L << (COVARIANT - 98)) | (1L << (CONTRAVARIANT - 98)) | (1L << (DEPRECATED - 98)) | (1L << (KINDOF - 98)) | (1L << (UNUSED - 98)) | (1L << (NULL_UNSPECIFIED - 98)) | (1L << (NULLABLE - 98)) | (1L << (NONNULL - 98)) | (1L << (NULL_RESETTABLE - 98)) | (1L << (NS_INLINE - 98)) | (1L << (NS_ENUM - 98)) | (1L << (NS_OPTIONS - 98)) | (1L << (ASSIGN - 98)) | (1L << (COPY - 98)) | (1L << (GETTER - 98)) | (1L << (SETTER - 98)) | (1L << (STRONG - 98)) | (1L << (READONLY - 98)) | (1L << (READWRITE - 98)) | (1L << (WEAK - 98)) | (1L << (UNSAFE_UNRETAINED - 98)) | (1L << (IB_OUTLET - 98)) | (1L << (IB_OUTLET_COLLECTION - 98)) | (1L << (IB_INSPECTABLE - 98)) | (1L << (IB_DESIGNABLE - 98)) | (1L << (IDENTIFIER - 98)))) != 0) || ((((_la - 169)) & ~0x3f) == 0 && ((1L << (_la - 169)) & ((1L << (ADD - 169)) | (1L << (SUB - 169)) | (1L << (CHARACTER_LITERAL - 169)) | (1L << (STRING_START - 169)) | (1L << (HEX_LITERAL - 169)) | (1L << (OCTAL_LITERAL - 169)) | (1L << (BINARY_LITERAL - 169)) | (1L << (DECIMAL_LITERAL - 169)) | (1L << (FLOATING_POINT_LITERAL - 169)))) != 0)) {
				{
				setState(1269);
				attributeParameterList();
				}
			}

			setState(1272);
			match(RP);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AttributeParameterListContext extends ParserRuleContext {
		public List<AttributeParameterContext> attributeParameter() {
			return getRuleContexts(AttributeParameterContext.class);
		}
		public AttributeParameterContext attributeParameter(int i) {
			return getRuleContext(AttributeParameterContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(LogosXXParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(LogosXXParser.COMMA, i);
		}
		public AttributeParameterListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_attributeParameterList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LogosXXParserListener ) ((LogosXXParserListener)listener).enterAttributeParameterList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LogosXXParserListener ) ((LogosXXParserListener)listener).exitAttributeParameterList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LogosXXParserVisitor ) return ((LogosXXParserVisitor<? extends T>)visitor).visitAttributeParameterList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AttributeParameterListContext attributeParameterList() throws RecognitionException {
		AttributeParameterListContext _localctx = new AttributeParameterListContext(_ctx, getState());
		enterRule(_localctx, 194, RULE_attributeParameterList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1274);
			attributeParameter();
			setState(1279);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(1275);
				match(COMMA);
				setState(1276);
				attributeParameter();
				}
				}
				setState(1281);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AttributeParameterContext extends ParserRuleContext {
		public AttributeContext attribute() {
			return getRuleContext(AttributeContext.class,0);
		}
		public ConstantContext constant() {
			return getRuleContext(ConstantContext.class,0);
		}
		public StringLiteralContext stringLiteral() {
			return getRuleContext(StringLiteralContext.class,0);
		}
		public AttributeParameterAssignmentContext attributeParameterAssignment() {
			return getRuleContext(AttributeParameterAssignmentContext.class,0);
		}
		public AttributeParameterContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_attributeParameter; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LogosXXParserListener ) ((LogosXXParserListener)listener).enterAttributeParameter(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LogosXXParserListener ) ((LogosXXParserListener)listener).exitAttributeParameter(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LogosXXParserVisitor ) return ((LogosXXParserVisitor<? extends T>)visitor).visitAttributeParameter(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AttributeParameterContext attributeParameter() throws RecognitionException {
		AttributeParameterContext _localctx = new AttributeParameterContext(_ctx, getState());
		enterRule(_localctx, 196, RULE_attributeParameter);
		try {
			setState(1286);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,139,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1282);
				attribute();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1283);
				constant();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1284);
				stringLiteral();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1285);
				attributeParameterAssignment();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AttributeParameterAssignmentContext extends ParserRuleContext {
		public List<AttributeNameContext> attributeName() {
			return getRuleContexts(AttributeNameContext.class);
		}
		public AttributeNameContext attributeName(int i) {
			return getRuleContext(AttributeNameContext.class,i);
		}
		public TerminalNode ASSIGNMENT() { return getToken(LogosXXParser.ASSIGNMENT, 0); }
		public ConstantContext constant() {
			return getRuleContext(ConstantContext.class,0);
		}
		public StringLiteralContext stringLiteral() {
			return getRuleContext(StringLiteralContext.class,0);
		}
		public AttributeParameterAssignmentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_attributeParameterAssignment; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LogosXXParserListener ) ((LogosXXParserListener)listener).enterAttributeParameterAssignment(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LogosXXParserListener ) ((LogosXXParserListener)listener).exitAttributeParameterAssignment(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LogosXXParserVisitor ) return ((LogosXXParserVisitor<? extends T>)visitor).visitAttributeParameterAssignment(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AttributeParameterAssignmentContext attributeParameterAssignment() throws RecognitionException {
		AttributeParameterAssignmentContext _localctx = new AttributeParameterAssignmentContext(_ctx, getState());
		enterRule(_localctx, 198, RULE_attributeParameterAssignment);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1288);
			attributeName();
			setState(1289);
			match(ASSIGNMENT);
			setState(1293);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case TRUE:
			case FALSE:
			case NIL:
			case NO:
			case NULL:
			case YES:
			case ADD:
			case SUB:
			case CHARACTER_LITERAL:
			case HEX_LITERAL:
			case OCTAL_LITERAL:
			case BINARY_LITERAL:
			case DECIMAL_LITERAL:
			case FLOATING_POINT_LITERAL:
				{
				setState(1290);
				constant();
				}
				break;
			case CONST:
			case BOOL:
			case Class:
			case BYCOPY:
			case BYREF:
			case ID:
			case IMP:
			case IN:
			case INOUT:
			case ONEWAY:
			case OUT:
			case PROTOCOL_:
			case SEL:
			case SELF:
			case SUPER:
			case ATOMIC:
			case NONATOMIC:
			case RETAIN:
			case AUTORELEASING_QUALIFIER:
			case BLOCK:
			case BRIDGE_RETAINED:
			case BRIDGE_TRANSFER:
			case COVARIANT:
			case CONTRAVARIANT:
			case DEPRECATED:
			case KINDOF:
			case UNUSED:
			case NULL_UNSPECIFIED:
			case NULLABLE:
			case NONNULL:
			case NULL_RESETTABLE:
			case NS_INLINE:
			case NS_ENUM:
			case NS_OPTIONS:
			case ASSIGN:
			case COPY:
			case GETTER:
			case SETTER:
			case STRONG:
			case READONLY:
			case READWRITE:
			case WEAK:
			case UNSAFE_UNRETAINED:
			case IB_OUTLET:
			case IB_OUTLET_COLLECTION:
			case IB_INSPECTABLE:
			case IB_DESIGNABLE:
			case IDENTIFIER:
				{
				setState(1291);
				attributeName();
				}
				break;
			case STRING_START:
				{
				setState(1292);
				stringLiteral();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DeclarationContext extends ParserRuleContext {
		public FunctionCallExpressionContext functionCallExpression() {
			return getRuleContext(FunctionCallExpressionContext.class,0);
		}
		public EnumDeclarationContext enumDeclaration() {
			return getRuleContext(EnumDeclarationContext.class,0);
		}
		public VarDeclarationContext varDeclaration() {
			return getRuleContext(VarDeclarationContext.class,0);
		}
		public TypedefDeclarationContext typedefDeclaration() {
			return getRuleContext(TypedefDeclarationContext.class,0);
		}
		public DeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LogosXXParserListener ) ((LogosXXParserListener)listener).enterDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LogosXXParserListener ) ((LogosXXParserListener)listener).exitDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LogosXXParserVisitor ) return ((LogosXXParserVisitor<? extends T>)visitor).visitDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DeclarationContext declaration() throws RecognitionException {
		DeclarationContext _localctx = new DeclarationContext(_ctx, getState());
		enterRule(_localctx, 200, RULE_declaration);
		try {
			setState(1299);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,141,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1295);
				functionCallExpression();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1296);
				enumDeclaration();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1297);
				varDeclaration();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1298);
				typedefDeclaration();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FunctionCallExpressionContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode LP() { return getToken(LogosXXParser.LP, 0); }
		public DirectDeclaratorContext directDeclarator() {
			return getRuleContext(DirectDeclaratorContext.class,0);
		}
		public TerminalNode RP() { return getToken(LogosXXParser.RP, 0); }
		public TerminalNode SEMI() { return getToken(LogosXXParser.SEMI, 0); }
		public List<AttributeSpecifierContext> attributeSpecifier() {
			return getRuleContexts(AttributeSpecifierContext.class);
		}
		public AttributeSpecifierContext attributeSpecifier(int i) {
			return getRuleContext(AttributeSpecifierContext.class,i);
		}
		public FunctionCallExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionCallExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LogosXXParserListener ) ((LogosXXParserListener)listener).enterFunctionCallExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LogosXXParserListener ) ((LogosXXParserListener)listener).exitFunctionCallExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LogosXXParserVisitor ) return ((LogosXXParserVisitor<? extends T>)visitor).visitFunctionCallExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunctionCallExpressionContext functionCallExpression() throws RecognitionException {
		FunctionCallExpressionContext _localctx = new FunctionCallExpressionContext(_ctx, getState());
		enterRule(_localctx, 202, RULE_functionCallExpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1302);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ATTRIBUTE) {
				{
				setState(1301);
				attributeSpecifier();
				}
			}

			setState(1304);
			identifier();
			setState(1306);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ATTRIBUTE) {
				{
				setState(1305);
				attributeSpecifier();
				}
			}

			setState(1308);
			match(LP);
			setState(1309);
			directDeclarator();
			setState(1310);
			match(RP);
			setState(1311);
			match(SEMI);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class EnumDeclarationContext extends ParserRuleContext {
		public EnumSpecifierContext enumSpecifier() {
			return getRuleContext(EnumSpecifierContext.class,0);
		}
		public TerminalNode SEMI() { return getToken(LogosXXParser.SEMI, 0); }
		public AttributeSpecifierContext attributeSpecifier() {
			return getRuleContext(AttributeSpecifierContext.class,0);
		}
		public TerminalNode TYPEDEF() { return getToken(LogosXXParser.TYPEDEF, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public EnumDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_enumDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LogosXXParserListener ) ((LogosXXParserListener)listener).enterEnumDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LogosXXParserListener ) ((LogosXXParserListener)listener).exitEnumDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LogosXXParserVisitor ) return ((LogosXXParserVisitor<? extends T>)visitor).visitEnumDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EnumDeclarationContext enumDeclaration() throws RecognitionException {
		EnumDeclarationContext _localctx = new EnumDeclarationContext(_ctx, getState());
		enterRule(_localctx, 204, RULE_enumDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1314);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ATTRIBUTE) {
				{
				setState(1313);
				attributeSpecifier();
				}
			}

			setState(1317);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==TYPEDEF) {
				{
				setState(1316);
				match(TYPEDEF);
				}
			}

			setState(1319);
			enumSpecifier();
			setState(1321);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 57)) & ~0x3f) == 0 && ((1L << (_la - 57)) & ((1L << (BOOL - 57)) | (1L << (Class - 57)) | (1L << (BYCOPY - 57)) | (1L << (BYREF - 57)) | (1L << (ID - 57)) | (1L << (IMP - 57)) | (1L << (IN - 57)) | (1L << (INOUT - 57)) | (1L << (ONEWAY - 57)) | (1L << (OUT - 57)) | (1L << (PROTOCOL_ - 57)) | (1L << (SEL - 57)) | (1L << (SELF - 57)) | (1L << (SUPER - 57)) | (1L << (ATOMIC - 57)) | (1L << (NONATOMIC - 57)) | (1L << (RETAIN - 57)) | (1L << (AUTORELEASING_QUALIFIER - 57)) | (1L << (BLOCK - 57)) | (1L << (BRIDGE_RETAINED - 57)) | (1L << (BRIDGE_TRANSFER - 57)) | (1L << (COVARIANT - 57)) | (1L << (CONTRAVARIANT - 57)) | (1L << (DEPRECATED - 57)) | (1L << (KINDOF - 57)) | (1L << (UNUSED - 57)) | (1L << (NULL_UNSPECIFIED - 57)) | (1L << (NULLABLE - 57)) | (1L << (NONNULL - 57)) | (1L << (NULL_RESETTABLE - 57)) | (1L << (NS_INLINE - 57)))) != 0) || ((((_la - 121)) & ~0x3f) == 0 && ((1L << (_la - 121)) & ((1L << (NS_ENUM - 121)) | (1L << (NS_OPTIONS - 121)) | (1L << (ASSIGN - 121)) | (1L << (COPY - 121)) | (1L << (GETTER - 121)) | (1L << (SETTER - 121)) | (1L << (STRONG - 121)) | (1L << (READONLY - 121)) | (1L << (READWRITE - 121)) | (1L << (WEAK - 121)) | (1L << (UNSAFE_UNRETAINED - 121)) | (1L << (IB_OUTLET - 121)) | (1L << (IB_OUTLET_COLLECTION - 121)) | (1L << (IB_INSPECTABLE - 121)) | (1L << (IB_DESIGNABLE - 121)) | (1L << (IDENTIFIER - 121)))) != 0)) {
				{
				setState(1320);
				identifier();
				}
			}

			setState(1323);
			match(SEMI);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class VarDeclarationContext extends ParserRuleContext {
		public TerminalNode SEMI() { return getToken(LogosXXParser.SEMI, 0); }
		public DeclarationSpecifiersContext declarationSpecifiers() {
			return getRuleContext(DeclarationSpecifiersContext.class,0);
		}
		public InitDeclaratorListContext initDeclaratorList() {
			return getRuleContext(InitDeclaratorListContext.class,0);
		}
		public VarDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_varDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LogosXXParserListener ) ((LogosXXParserListener)listener).enterVarDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LogosXXParserListener ) ((LogosXXParserListener)listener).exitVarDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LogosXXParserVisitor ) return ((LogosXXParserVisitor<? extends T>)visitor).visitVarDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VarDeclarationContext varDeclaration() throws RecognitionException {
		VarDeclarationContext _localctx = new VarDeclarationContext(_ctx, getState());
		enterRule(_localctx, 206, RULE_varDeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1329);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,147,_ctx) ) {
			case 1:
				{
				setState(1325);
				declarationSpecifiers();
				setState(1326);
				initDeclaratorList();
				}
				break;
			case 2:
				{
				setState(1328);
				declarationSpecifiers();
				}
				break;
			}
			setState(1331);
			match(SEMI);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TypedefDeclarationContext extends ParserRuleContext {
		public TerminalNode TYPEDEF() { return getToken(LogosXXParser.TYPEDEF, 0); }
		public TerminalNode SEMI() { return getToken(LogosXXParser.SEMI, 0); }
		public DeclarationSpecifiersContext declarationSpecifiers() {
			return getRuleContext(DeclarationSpecifiersContext.class,0);
		}
		public TypeDeclaratorListContext typeDeclaratorList() {
			return getRuleContext(TypeDeclaratorListContext.class,0);
		}
		public AttributeSpecifierContext attributeSpecifier() {
			return getRuleContext(AttributeSpecifierContext.class,0);
		}
		public TypedefDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typedefDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LogosXXParserListener ) ((LogosXXParserListener)listener).enterTypedefDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LogosXXParserListener ) ((LogosXXParserListener)listener).exitTypedefDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LogosXXParserVisitor ) return ((LogosXXParserVisitor<? extends T>)visitor).visitTypedefDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypedefDeclarationContext typedefDeclaration() throws RecognitionException {
		TypedefDeclarationContext _localctx = new TypedefDeclarationContext(_ctx, getState());
		enterRule(_localctx, 208, RULE_typedefDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1334);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ATTRIBUTE) {
				{
				setState(1333);
				attributeSpecifier();
				}
			}

			setState(1336);
			match(TYPEDEF);
			setState(1341);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,149,_ctx) ) {
			case 1:
				{
				setState(1337);
				declarationSpecifiers();
				setState(1338);
				typeDeclaratorList();
				}
				break;
			case 2:
				{
				setState(1340);
				declarationSpecifiers();
				}
				break;
			}
			setState(1343);
			match(SEMI);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TypeDeclaratorListContext extends ParserRuleContext {
		public List<TypeDeclaratorContext> typeDeclarator() {
			return getRuleContexts(TypeDeclaratorContext.class);
		}
		public TypeDeclaratorContext typeDeclarator(int i) {
			return getRuleContext(TypeDeclaratorContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(LogosXXParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(LogosXXParser.COMMA, i);
		}
		public TypeDeclaratorListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeDeclaratorList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LogosXXParserListener ) ((LogosXXParserListener)listener).enterTypeDeclaratorList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LogosXXParserListener ) ((LogosXXParserListener)listener).exitTypeDeclaratorList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LogosXXParserVisitor ) return ((LogosXXParserVisitor<? extends T>)visitor).visitTypeDeclaratorList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeDeclaratorListContext typeDeclaratorList() throws RecognitionException {
		TypeDeclaratorListContext _localctx = new TypeDeclaratorListContext(_ctx, getState());
		enterRule(_localctx, 210, RULE_typeDeclaratorList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1345);
			typeDeclarator();
			setState(1350);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(1346);
				match(COMMA);
				setState(1347);
				typeDeclarator();
				}
				}
				setState(1352);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TypeDeclaratorContext extends ParserRuleContext {
		public DirectDeclaratorContext directDeclarator() {
			return getRuleContext(DirectDeclaratorContext.class,0);
		}
		public PointerContext pointer() {
			return getRuleContext(PointerContext.class,0);
		}
		public TypeDeclaratorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeDeclarator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LogosXXParserListener ) ((LogosXXParserListener)listener).enterTypeDeclarator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LogosXXParserListener ) ((LogosXXParserListener)listener).exitTypeDeclarator(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LogosXXParserVisitor ) return ((LogosXXParserVisitor<? extends T>)visitor).visitTypeDeclarator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeDeclaratorContext typeDeclarator() throws RecognitionException {
		TypeDeclaratorContext _localctx = new TypeDeclaratorContext(_ctx, getState());
		enterRule(_localctx, 212, RULE_typeDeclarator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1354);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==MUL) {
				{
				setState(1353);
				pointer();
				}
			}

			setState(1356);
			directDeclarator();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DeclarationSpecifiersContext extends ParserRuleContext {
		public List<StorageClassSpecifierContext> storageClassSpecifier() {
			return getRuleContexts(StorageClassSpecifierContext.class);
		}
		public StorageClassSpecifierContext storageClassSpecifier(int i) {
			return getRuleContext(StorageClassSpecifierContext.class,i);
		}
		public List<AttributeSpecifierContext> attributeSpecifier() {
			return getRuleContexts(AttributeSpecifierContext.class);
		}
		public AttributeSpecifierContext attributeSpecifier(int i) {
			return getRuleContext(AttributeSpecifierContext.class,i);
		}
		public List<ArcBehaviourSpecifierContext> arcBehaviourSpecifier() {
			return getRuleContexts(ArcBehaviourSpecifierContext.class);
		}
		public ArcBehaviourSpecifierContext arcBehaviourSpecifier(int i) {
			return getRuleContext(ArcBehaviourSpecifierContext.class,i);
		}
		public List<NullabilitySpecifierContext> nullabilitySpecifier() {
			return getRuleContexts(NullabilitySpecifierContext.class);
		}
		public NullabilitySpecifierContext nullabilitySpecifier(int i) {
			return getRuleContext(NullabilitySpecifierContext.class,i);
		}
		public List<IbOutletQualifierContext> ibOutletQualifier() {
			return getRuleContexts(IbOutletQualifierContext.class);
		}
		public IbOutletQualifierContext ibOutletQualifier(int i) {
			return getRuleContext(IbOutletQualifierContext.class,i);
		}
		public List<TypePrefixContext> typePrefix() {
			return getRuleContexts(TypePrefixContext.class);
		}
		public TypePrefixContext typePrefix(int i) {
			return getRuleContext(TypePrefixContext.class,i);
		}
		public List<TypeQualifierContext> typeQualifier() {
			return getRuleContexts(TypeQualifierContext.class);
		}
		public TypeQualifierContext typeQualifier(int i) {
			return getRuleContext(TypeQualifierContext.class,i);
		}
		public List<TypeSpecifierContext> typeSpecifier() {
			return getRuleContexts(TypeSpecifierContext.class);
		}
		public TypeSpecifierContext typeSpecifier(int i) {
			return getRuleContext(TypeSpecifierContext.class,i);
		}
		public DeclarationSpecifiersContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declarationSpecifiers; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LogosXXParserListener ) ((LogosXXParserListener)listener).enterDeclarationSpecifiers(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LogosXXParserListener ) ((LogosXXParserListener)listener).exitDeclarationSpecifiers(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LogosXXParserVisitor ) return ((LogosXXParserVisitor<? extends T>)visitor).visitDeclarationSpecifiers(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DeclarationSpecifiersContext declarationSpecifiers() throws RecognitionException {
		DeclarationSpecifiersContext _localctx = new DeclarationSpecifiersContext(_ctx, getState());
		enterRule(_localctx, 214, RULE_declarationSpecifiers);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1366); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					setState(1366);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,152,_ctx) ) {
					case 1:
						{
						setState(1358);
						storageClassSpecifier();
						}
						break;
					case 2:
						{
						setState(1359);
						attributeSpecifier();
						}
						break;
					case 3:
						{
						setState(1360);
						arcBehaviourSpecifier();
						}
						break;
					case 4:
						{
						setState(1361);
						nullabilitySpecifier();
						}
						break;
					case 5:
						{
						setState(1362);
						ibOutletQualifier();
						}
						break;
					case 6:
						{
						setState(1363);
						typePrefix();
						}
						break;
					case 7:
						{
						setState(1364);
						typeQualifier();
						}
						break;
					case 8:
						{
						setState(1365);
						typeSpecifier();
						}
						break;
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(1368); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,153,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AttributeSpecifierContext extends ParserRuleContext {
		public TerminalNode ATTRIBUTE() { return getToken(LogosXXParser.ATTRIBUTE, 0); }
		public List<TerminalNode> LP() { return getTokens(LogosXXParser.LP); }
		public TerminalNode LP(int i) {
			return getToken(LogosXXParser.LP, i);
		}
		public List<AttributeContext> attribute() {
			return getRuleContexts(AttributeContext.class);
		}
		public AttributeContext attribute(int i) {
			return getRuleContext(AttributeContext.class,i);
		}
		public List<TerminalNode> RP() { return getTokens(LogosXXParser.RP); }
		public TerminalNode RP(int i) {
			return getToken(LogosXXParser.RP, i);
		}
		public List<TerminalNode> COMMA() { return getTokens(LogosXXParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(LogosXXParser.COMMA, i);
		}
		public AttributeSpecifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_attributeSpecifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LogosXXParserListener ) ((LogosXXParserListener)listener).enterAttributeSpecifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LogosXXParserListener ) ((LogosXXParserListener)listener).exitAttributeSpecifier(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LogosXXParserVisitor ) return ((LogosXXParserVisitor<? extends T>)visitor).visitAttributeSpecifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AttributeSpecifierContext attributeSpecifier() throws RecognitionException {
		AttributeSpecifierContext _localctx = new AttributeSpecifierContext(_ctx, getState());
		enterRule(_localctx, 216, RULE_attributeSpecifier);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1370);
			match(ATTRIBUTE);
			setState(1371);
			match(LP);
			setState(1372);
			match(LP);
			setState(1373);
			attribute();
			setState(1378);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(1374);
				match(COMMA);
				setState(1375);
				attribute();
				}
				}
				setState(1380);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1381);
			match(RP);
			setState(1382);
			match(RP);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class InitDeclaratorListContext extends ParserRuleContext {
		public List<InitDeclaratorContext> initDeclarator() {
			return getRuleContexts(InitDeclaratorContext.class);
		}
		public InitDeclaratorContext initDeclarator(int i) {
			return getRuleContext(InitDeclaratorContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(LogosXXParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(LogosXXParser.COMMA, i);
		}
		public InitDeclaratorListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_initDeclaratorList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LogosXXParserListener ) ((LogosXXParserListener)listener).enterInitDeclaratorList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LogosXXParserListener ) ((LogosXXParserListener)listener).exitInitDeclaratorList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LogosXXParserVisitor ) return ((LogosXXParserVisitor<? extends T>)visitor).visitInitDeclaratorList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InitDeclaratorListContext initDeclaratorList() throws RecognitionException {
		InitDeclaratorListContext _localctx = new InitDeclaratorListContext(_ctx, getState());
		enterRule(_localctx, 218, RULE_initDeclaratorList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1384);
			initDeclarator();
			setState(1389);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(1385);
				match(COMMA);
				setState(1386);
				initDeclarator();
				}
				}
				setState(1391);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class InitDeclaratorContext extends ParserRuleContext {
		public DeclaratorContext declarator() {
			return getRuleContext(DeclaratorContext.class,0);
		}
		public TerminalNode ASSIGNMENT() { return getToken(LogosXXParser.ASSIGNMENT, 0); }
		public InitializerContext initializer() {
			return getRuleContext(InitializerContext.class,0);
		}
		public InitDeclaratorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_initDeclarator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LogosXXParserListener ) ((LogosXXParserListener)listener).enterInitDeclarator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LogosXXParserListener ) ((LogosXXParserListener)listener).exitInitDeclarator(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LogosXXParserVisitor ) return ((LogosXXParserVisitor<? extends T>)visitor).visitInitDeclarator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InitDeclaratorContext initDeclarator() throws RecognitionException {
		InitDeclaratorContext _localctx = new InitDeclaratorContext(_ctx, getState());
		enterRule(_localctx, 220, RULE_initDeclarator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1392);
			declarator();
			setState(1395);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ASSIGNMENT) {
				{
				setState(1393);
				match(ASSIGNMENT);
				setState(1394);
				initializer();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class StructOrUnionSpecifierContext extends ParserRuleContext {
		public TerminalNode STRUCT() { return getToken(LogosXXParser.STRUCT, 0); }
		public TerminalNode UNION() { return getToken(LogosXXParser.UNION, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode LBRACE() { return getToken(LogosXXParser.LBRACE, 0); }
		public TerminalNode RBRACE() { return getToken(LogosXXParser.RBRACE, 0); }
		public List<FieldDeclarationContext> fieldDeclaration() {
			return getRuleContexts(FieldDeclarationContext.class);
		}
		public FieldDeclarationContext fieldDeclaration(int i) {
			return getRuleContext(FieldDeclarationContext.class,i);
		}
		public StructOrUnionSpecifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_structOrUnionSpecifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LogosXXParserListener ) ((LogosXXParserListener)listener).enterStructOrUnionSpecifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LogosXXParserListener ) ((LogosXXParserListener)listener).exitStructOrUnionSpecifier(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LogosXXParserVisitor ) return ((LogosXXParserVisitor<? extends T>)visitor).visitStructOrUnionSpecifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StructOrUnionSpecifierContext structOrUnionSpecifier() throws RecognitionException {
		StructOrUnionSpecifierContext _localctx = new StructOrUnionSpecifierContext(_ctx, getState());
		enterRule(_localctx, 222, RULE_structOrUnionSpecifier);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1397);
			_la = _input.LA(1);
			if ( !(_la==STRUCT || _la==UNION) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(1410);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,159,_ctx) ) {
			case 1:
				{
				setState(1398);
				identifier();
				}
				break;
			case 2:
				{
				setState(1400);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (((((_la - 57)) & ~0x3f) == 0 && ((1L << (_la - 57)) & ((1L << (BOOL - 57)) | (1L << (Class - 57)) | (1L << (BYCOPY - 57)) | (1L << (BYREF - 57)) | (1L << (ID - 57)) | (1L << (IMP - 57)) | (1L << (IN - 57)) | (1L << (INOUT - 57)) | (1L << (ONEWAY - 57)) | (1L << (OUT - 57)) | (1L << (PROTOCOL_ - 57)) | (1L << (SEL - 57)) | (1L << (SELF - 57)) | (1L << (SUPER - 57)) | (1L << (ATOMIC - 57)) | (1L << (NONATOMIC - 57)) | (1L << (RETAIN - 57)) | (1L << (AUTORELEASING_QUALIFIER - 57)) | (1L << (BLOCK - 57)) | (1L << (BRIDGE_RETAINED - 57)) | (1L << (BRIDGE_TRANSFER - 57)) | (1L << (COVARIANT - 57)) | (1L << (CONTRAVARIANT - 57)) | (1L << (DEPRECATED - 57)) | (1L << (KINDOF - 57)) | (1L << (UNUSED - 57)) | (1L << (NULL_UNSPECIFIED - 57)) | (1L << (NULLABLE - 57)) | (1L << (NONNULL - 57)) | (1L << (NULL_RESETTABLE - 57)) | (1L << (NS_INLINE - 57)))) != 0) || ((((_la - 121)) & ~0x3f) == 0 && ((1L << (_la - 121)) & ((1L << (NS_ENUM - 121)) | (1L << (NS_OPTIONS - 121)) | (1L << (ASSIGN - 121)) | (1L << (COPY - 121)) | (1L << (GETTER - 121)) | (1L << (SETTER - 121)) | (1L << (STRONG - 121)) | (1L << (READONLY - 121)) | (1L << (READWRITE - 121)) | (1L << (WEAK - 121)) | (1L << (UNSAFE_UNRETAINED - 121)) | (1L << (IB_OUTLET - 121)) | (1L << (IB_OUTLET_COLLECTION - 121)) | (1L << (IB_INSPECTABLE - 121)) | (1L << (IB_DESIGNABLE - 121)) | (1L << (IDENTIFIER - 121)))) != 0)) {
					{
					setState(1399);
					identifier();
					}
				}

				setState(1402);
				match(LBRACE);
				setState(1404); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(1403);
					fieldDeclaration();
					}
					}
					setState(1406); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( ((((_la - 21)) & ~0x3f) == 0 && ((1L << (_la - 21)) & ((1L << (CHAR - 21)) | (1L << (CONST - 21)) | (1L << (DOUBLE - 21)) | (1L << (ENUM - 21)) | (1L << (FLOAT - 21)) | (1L << (INLINE - 21)) | (1L << (INT - 21)) | (1L << (LONG - 21)) | (1L << (RESTRICT - 21)) | (1L << (SHORT - 21)) | (1L << (SIGNED - 21)) | (1L << (STRUCT - 21)) | (1L << (UNION - 21)) | (1L << (UNSIGNED - 21)) | (1L << (VOID - 21)) | (1L << (VOLATILE - 21)) | (1L << (BOOL - 21)) | (1L << (Class - 21)) | (1L << (BYCOPY - 21)) | (1L << (BYREF - 21)) | (1L << (ID - 21)) | (1L << (IMP - 21)) | (1L << (IN - 21)) | (1L << (INOUT - 21)) | (1L << (ONEWAY - 21)) | (1L << (OUT - 21)) | (1L << (PROTOCOL_ - 21)) | (1L << (SEL - 21)) | (1L << (SELF - 21)) | (1L << (SUPER - 21)))) != 0) || ((((_la - 98)) & ~0x3f) == 0 && ((1L << (_la - 98)) & ((1L << (ATOMIC - 98)) | (1L << (NONATOMIC - 98)) | (1L << (RETAIN - 98)) | (1L << (AUTORELEASING_QUALIFIER - 98)) | (1L << (BLOCK - 98)) | (1L << (BRIDGE - 98)) | (1L << (BRIDGE_RETAINED - 98)) | (1L << (BRIDGE_TRANSFER - 98)) | (1L << (COVARIANT - 98)) | (1L << (CONTRAVARIANT - 98)) | (1L << (DEPRECATED - 98)) | (1L << (KINDOF - 98)) | (1L << (STRONG_QUALIFIER - 98)) | (1L << (TYPEOF - 98)) | (1L << (UNSAFE_UNRETAINED_QUALIFIER - 98)) | (1L << (UNUSED - 98)) | (1L << (WEAK_QUALIFIER - 98)) | (1L << (NULL_UNSPECIFIED - 98)) | (1L << (NULLABLE - 98)) | (1L << (NONNULL - 98)) | (1L << (NULL_RESETTABLE - 98)) | (1L << (NS_INLINE - 98)) | (1L << (NS_ENUM - 98)) | (1L << (NS_OPTIONS - 98)) | (1L << (ASSIGN - 98)) | (1L << (COPY - 98)) | (1L << (GETTER - 98)) | (1L << (SETTER - 98)) | (1L << (STRONG - 98)) | (1L << (READONLY - 98)) | (1L << (READWRITE - 98)) | (1L << (WEAK - 98)) | (1L << (UNSAFE_UNRETAINED - 98)) | (1L << (IB_OUTLET - 98)) | (1L << (IB_OUTLET_COLLECTION - 98)) | (1L << (IB_INSPECTABLE - 98)) | (1L << (IB_DESIGNABLE - 98)) | (1L << (IDENTIFIER - 98)))) != 0) );
				setState(1408);
				match(RBRACE);
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FieldDeclarationContext extends ParserRuleContext {
		public SpecifierQualifierListContext specifierQualifierList() {
			return getRuleContext(SpecifierQualifierListContext.class,0);
		}
		public FieldDeclaratorListContext fieldDeclaratorList() {
			return getRuleContext(FieldDeclaratorListContext.class,0);
		}
		public TerminalNode SEMI() { return getToken(LogosXXParser.SEMI, 0); }
		public MacroContext macro() {
			return getRuleContext(MacroContext.class,0);
		}
		public FieldDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fieldDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LogosXXParserListener ) ((LogosXXParserListener)listener).enterFieldDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LogosXXParserListener ) ((LogosXXParserListener)listener).exitFieldDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LogosXXParserVisitor ) return ((LogosXXParserVisitor<? extends T>)visitor).visitFieldDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FieldDeclarationContext fieldDeclaration() throws RecognitionException {
		FieldDeclarationContext _localctx = new FieldDeclarationContext(_ctx, getState());
		enterRule(_localctx, 224, RULE_fieldDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1412);
			specifierQualifierList();
			setState(1413);
			fieldDeclaratorList();
			setState(1415);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 57)) & ~0x3f) == 0 && ((1L << (_la - 57)) & ((1L << (BOOL - 57)) | (1L << (Class - 57)) | (1L << (BYCOPY - 57)) | (1L << (BYREF - 57)) | (1L << (ID - 57)) | (1L << (IMP - 57)) | (1L << (IN - 57)) | (1L << (INOUT - 57)) | (1L << (ONEWAY - 57)) | (1L << (OUT - 57)) | (1L << (PROTOCOL_ - 57)) | (1L << (SEL - 57)) | (1L << (SELF - 57)) | (1L << (SUPER - 57)) | (1L << (ATOMIC - 57)) | (1L << (NONATOMIC - 57)) | (1L << (RETAIN - 57)) | (1L << (AUTORELEASING_QUALIFIER - 57)) | (1L << (BLOCK - 57)) | (1L << (BRIDGE_RETAINED - 57)) | (1L << (BRIDGE_TRANSFER - 57)) | (1L << (COVARIANT - 57)) | (1L << (CONTRAVARIANT - 57)) | (1L << (DEPRECATED - 57)) | (1L << (KINDOF - 57)) | (1L << (UNUSED - 57)) | (1L << (NULL_UNSPECIFIED - 57)) | (1L << (NULLABLE - 57)) | (1L << (NONNULL - 57)) | (1L << (NULL_RESETTABLE - 57)) | (1L << (NS_INLINE - 57)))) != 0) || ((((_la - 121)) & ~0x3f) == 0 && ((1L << (_la - 121)) & ((1L << (NS_ENUM - 121)) | (1L << (NS_OPTIONS - 121)) | (1L << (ASSIGN - 121)) | (1L << (COPY - 121)) | (1L << (GETTER - 121)) | (1L << (SETTER - 121)) | (1L << (STRONG - 121)) | (1L << (READONLY - 121)) | (1L << (READWRITE - 121)) | (1L << (WEAK - 121)) | (1L << (UNSAFE_UNRETAINED - 121)) | (1L << (IB_OUTLET - 121)) | (1L << (IB_OUTLET_COLLECTION - 121)) | (1L << (IB_INSPECTABLE - 121)) | (1L << (IB_DESIGNABLE - 121)) | (1L << (IDENTIFIER - 121)))) != 0)) {
				{
				setState(1414);
				macro();
				}
			}

			setState(1417);
			match(SEMI);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SpecifierQualifierListContext extends ParserRuleContext {
		public List<ArcBehaviourSpecifierContext> arcBehaviourSpecifier() {
			return getRuleContexts(ArcBehaviourSpecifierContext.class);
		}
		public ArcBehaviourSpecifierContext arcBehaviourSpecifier(int i) {
			return getRuleContext(ArcBehaviourSpecifierContext.class,i);
		}
		public List<NullabilitySpecifierContext> nullabilitySpecifier() {
			return getRuleContexts(NullabilitySpecifierContext.class);
		}
		public NullabilitySpecifierContext nullabilitySpecifier(int i) {
			return getRuleContext(NullabilitySpecifierContext.class,i);
		}
		public List<IbOutletQualifierContext> ibOutletQualifier() {
			return getRuleContexts(IbOutletQualifierContext.class);
		}
		public IbOutletQualifierContext ibOutletQualifier(int i) {
			return getRuleContext(IbOutletQualifierContext.class,i);
		}
		public List<TypePrefixContext> typePrefix() {
			return getRuleContexts(TypePrefixContext.class);
		}
		public TypePrefixContext typePrefix(int i) {
			return getRuleContext(TypePrefixContext.class,i);
		}
		public List<TypeQualifierContext> typeQualifier() {
			return getRuleContexts(TypeQualifierContext.class);
		}
		public TypeQualifierContext typeQualifier(int i) {
			return getRuleContext(TypeQualifierContext.class,i);
		}
		public List<TypeSpecifierContext> typeSpecifier() {
			return getRuleContexts(TypeSpecifierContext.class);
		}
		public TypeSpecifierContext typeSpecifier(int i) {
			return getRuleContext(TypeSpecifierContext.class,i);
		}
		public SpecifierQualifierListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_specifierQualifierList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LogosXXParserListener ) ((LogosXXParserListener)listener).enterSpecifierQualifierList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LogosXXParserListener ) ((LogosXXParserListener)listener).exitSpecifierQualifierList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LogosXXParserVisitor ) return ((LogosXXParserVisitor<? extends T>)visitor).visitSpecifierQualifierList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SpecifierQualifierListContext specifierQualifierList() throws RecognitionException {
		SpecifierQualifierListContext _localctx = new SpecifierQualifierListContext(_ctx, getState());
		enterRule(_localctx, 226, RULE_specifierQualifierList);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1425); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					setState(1425);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,161,_ctx) ) {
					case 1:
						{
						setState(1419);
						arcBehaviourSpecifier();
						}
						break;
					case 2:
						{
						setState(1420);
						nullabilitySpecifier();
						}
						break;
					case 3:
						{
						setState(1421);
						ibOutletQualifier();
						}
						break;
					case 4:
						{
						setState(1422);
						typePrefix();
						}
						break;
					case 5:
						{
						setState(1423);
						typeQualifier();
						}
						break;
					case 6:
						{
						setState(1424);
						typeSpecifier();
						}
						break;
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(1427); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,162,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class IbOutletQualifierContext extends ParserRuleContext {
		public TerminalNode IB_OUTLET_COLLECTION() { return getToken(LogosXXParser.IB_OUTLET_COLLECTION, 0); }
		public TerminalNode LP() { return getToken(LogosXXParser.LP, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode RP() { return getToken(LogosXXParser.RP, 0); }
		public TerminalNode IB_OUTLET() { return getToken(LogosXXParser.IB_OUTLET, 0); }
		public IbOutletQualifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ibOutletQualifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LogosXXParserListener ) ((LogosXXParserListener)listener).enterIbOutletQualifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LogosXXParserListener ) ((LogosXXParserListener)listener).exitIbOutletQualifier(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LogosXXParserVisitor ) return ((LogosXXParserVisitor<? extends T>)visitor).visitIbOutletQualifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IbOutletQualifierContext ibOutletQualifier() throws RecognitionException {
		IbOutletQualifierContext _localctx = new IbOutletQualifierContext(_ctx, getState());
		enterRule(_localctx, 228, RULE_ibOutletQualifier);
		try {
			setState(1435);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IB_OUTLET_COLLECTION:
				enterOuterAlt(_localctx, 1);
				{
				setState(1429);
				match(IB_OUTLET_COLLECTION);
				setState(1430);
				match(LP);
				setState(1431);
				identifier();
				setState(1432);
				match(RP);
				}
				break;
			case IB_OUTLET:
				enterOuterAlt(_localctx, 2);
				{
				setState(1434);
				match(IB_OUTLET);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ArcBehaviourSpecifierContext extends ParserRuleContext {
		public TerminalNode WEAK_QUALIFIER() { return getToken(LogosXXParser.WEAK_QUALIFIER, 0); }
		public TerminalNode STRONG_QUALIFIER() { return getToken(LogosXXParser.STRONG_QUALIFIER, 0); }
		public TerminalNode AUTORELEASING_QUALIFIER() { return getToken(LogosXXParser.AUTORELEASING_QUALIFIER, 0); }
		public TerminalNode UNSAFE_UNRETAINED_QUALIFIER() { return getToken(LogosXXParser.UNSAFE_UNRETAINED_QUALIFIER, 0); }
		public ArcBehaviourSpecifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arcBehaviourSpecifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LogosXXParserListener ) ((LogosXXParserListener)listener).enterArcBehaviourSpecifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LogosXXParserListener ) ((LogosXXParserListener)listener).exitArcBehaviourSpecifier(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LogosXXParserVisitor ) return ((LogosXXParserVisitor<? extends T>)visitor).visitArcBehaviourSpecifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArcBehaviourSpecifierContext arcBehaviourSpecifier() throws RecognitionException {
		ArcBehaviourSpecifierContext _localctx = new ArcBehaviourSpecifierContext(_ctx, getState());
		enterRule(_localctx, 230, RULE_arcBehaviourSpecifier);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1437);
			_la = _input.LA(1);
			if ( !(((((_la - 102)) & ~0x3f) == 0 && ((1L << (_la - 102)) & ((1L << (AUTORELEASING_QUALIFIER - 102)) | (1L << (STRONG_QUALIFIER - 102)) | (1L << (UNSAFE_UNRETAINED_QUALIFIER - 102)) | (1L << (WEAK_QUALIFIER - 102)))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class NullabilitySpecifierContext extends ParserRuleContext {
		public TerminalNode NULL_UNSPECIFIED() { return getToken(LogosXXParser.NULL_UNSPECIFIED, 0); }
		public TerminalNode NULLABLE() { return getToken(LogosXXParser.NULLABLE, 0); }
		public TerminalNode NONNULL() { return getToken(LogosXXParser.NONNULL, 0); }
		public TerminalNode NULL_RESETTABLE() { return getToken(LogosXXParser.NULL_RESETTABLE, 0); }
		public NullabilitySpecifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_nullabilitySpecifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LogosXXParserListener ) ((LogosXXParserListener)listener).enterNullabilitySpecifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LogosXXParserListener ) ((LogosXXParserListener)listener).exitNullabilitySpecifier(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LogosXXParserVisitor ) return ((LogosXXParserVisitor<? extends T>)visitor).visitNullabilitySpecifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NullabilitySpecifierContext nullabilitySpecifier() throws RecognitionException {
		NullabilitySpecifierContext _localctx = new NullabilitySpecifierContext(_ctx, getState());
		enterRule(_localctx, 232, RULE_nullabilitySpecifier);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1439);
			_la = _input.LA(1);
			if ( !(((((_la - 116)) & ~0x3f) == 0 && ((1L << (_la - 116)) & ((1L << (NULL_UNSPECIFIED - 116)) | (1L << (NULLABLE - 116)) | (1L << (NONNULL - 116)) | (1L << (NULL_RESETTABLE - 116)))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class StorageClassSpecifierContext extends ParserRuleContext {
		public TerminalNode AUTO() { return getToken(LogosXXParser.AUTO, 0); }
		public TerminalNode REGISTER() { return getToken(LogosXXParser.REGISTER, 0); }
		public TerminalNode STATIC() { return getToken(LogosXXParser.STATIC, 0); }
		public TerminalNode EXTERN() { return getToken(LogosXXParser.EXTERN, 0); }
		public StorageClassSpecifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_storageClassSpecifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LogosXXParserListener ) ((LogosXXParserListener)listener).enterStorageClassSpecifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LogosXXParserListener ) ((LogosXXParserListener)listener).exitStorageClassSpecifier(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LogosXXParserVisitor ) return ((LogosXXParserVisitor<? extends T>)visitor).visitStorageClassSpecifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StorageClassSpecifierContext storageClassSpecifier() throws RecognitionException {
		StorageClassSpecifierContext _localctx = new StorageClassSpecifierContext(_ctx, getState());
		enterRule(_localctx, 234, RULE_storageClassSpecifier);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1441);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << AUTO) | (1L << EXTERN) | (1L << REGISTER) | (1L << STATIC))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TypePrefixContext extends ParserRuleContext {
		public TerminalNode BRIDGE() { return getToken(LogosXXParser.BRIDGE, 0); }
		public TerminalNode BRIDGE_TRANSFER() { return getToken(LogosXXParser.BRIDGE_TRANSFER, 0); }
		public TerminalNode BRIDGE_RETAINED() { return getToken(LogosXXParser.BRIDGE_RETAINED, 0); }
		public TerminalNode BLOCK() { return getToken(LogosXXParser.BLOCK, 0); }
		public TerminalNode INLINE() { return getToken(LogosXXParser.INLINE, 0); }
		public TerminalNode NS_INLINE() { return getToken(LogosXXParser.NS_INLINE, 0); }
		public TerminalNode KINDOF() { return getToken(LogosXXParser.KINDOF, 0); }
		public TypePrefixContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typePrefix; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LogosXXParserListener ) ((LogosXXParserListener)listener).enterTypePrefix(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LogosXXParserListener ) ((LogosXXParserListener)listener).exitTypePrefix(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LogosXXParserVisitor ) return ((LogosXXParserVisitor<? extends T>)visitor).visitTypePrefix(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypePrefixContext typePrefix() throws RecognitionException {
		TypePrefixContext _localctx = new TypePrefixContext(_ctx, getState());
		enterRule(_localctx, 236, RULE_typePrefix);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1443);
			_la = _input.LA(1);
			if ( !(_la==INLINE || ((((_la - 103)) & ~0x3f) == 0 && ((1L << (_la - 103)) & ((1L << (BLOCK - 103)) | (1L << (BRIDGE - 103)) | (1L << (BRIDGE_RETAINED - 103)) | (1L << (BRIDGE_TRANSFER - 103)) | (1L << (KINDOF - 103)) | (1L << (NS_INLINE - 103)))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TypeQualifierContext extends ParserRuleContext {
		public TerminalNode CONST() { return getToken(LogosXXParser.CONST, 0); }
		public TerminalNode VOLATILE() { return getToken(LogosXXParser.VOLATILE, 0); }
		public TerminalNode RESTRICT() { return getToken(LogosXXParser.RESTRICT, 0); }
		public ProtocolQualifierContext protocolQualifier() {
			return getRuleContext(ProtocolQualifierContext.class,0);
		}
		public TypeQualifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeQualifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LogosXXParserListener ) ((LogosXXParserListener)listener).enterTypeQualifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LogosXXParserListener ) ((LogosXXParserListener)listener).exitTypeQualifier(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LogosXXParserVisitor ) return ((LogosXXParserVisitor<? extends T>)visitor).visitTypeQualifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeQualifierContext typeQualifier() throws RecognitionException {
		TypeQualifierContext _localctx = new TypeQualifierContext(_ctx, getState());
		enterRule(_localctx, 238, RULE_typeQualifier);
		try {
			setState(1449);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case CONST:
				enterOuterAlt(_localctx, 1);
				{
				setState(1445);
				match(CONST);
				}
				break;
			case VOLATILE:
				enterOuterAlt(_localctx, 2);
				{
				setState(1446);
				match(VOLATILE);
				}
				break;
			case RESTRICT:
				enterOuterAlt(_localctx, 3);
				{
				setState(1447);
				match(RESTRICT);
				}
				break;
			case BYCOPY:
			case BYREF:
			case IN:
			case INOUT:
			case ONEWAY:
			case OUT:
				enterOuterAlt(_localctx, 4);
				{
				setState(1448);
				protocolQualifier();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ProtocolQualifierContext extends ParserRuleContext {
		public TerminalNode IN() { return getToken(LogosXXParser.IN, 0); }
		public TerminalNode OUT() { return getToken(LogosXXParser.OUT, 0); }
		public TerminalNode INOUT() { return getToken(LogosXXParser.INOUT, 0); }
		public TerminalNode BYCOPY() { return getToken(LogosXXParser.BYCOPY, 0); }
		public TerminalNode BYREF() { return getToken(LogosXXParser.BYREF, 0); }
		public TerminalNode ONEWAY() { return getToken(LogosXXParser.ONEWAY, 0); }
		public ProtocolQualifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_protocolQualifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LogosXXParserListener ) ((LogosXXParserListener)listener).enterProtocolQualifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LogosXXParserListener ) ((LogosXXParserListener)listener).exitProtocolQualifier(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LogosXXParserVisitor ) return ((LogosXXParserVisitor<? extends T>)visitor).visitProtocolQualifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProtocolQualifierContext protocolQualifier() throws RecognitionException {
		ProtocolQualifierContext _localctx = new ProtocolQualifierContext(_ctx, getState());
		enterRule(_localctx, 240, RULE_protocolQualifier);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1451);
			_la = _input.LA(1);
			if ( !(((((_la - 59)) & ~0x3f) == 0 && ((1L << (_la - 59)) & ((1L << (BYCOPY - 59)) | (1L << (BYREF - 59)) | (1L << (IN - 59)) | (1L << (INOUT - 59)) | (1L << (ONEWAY - 59)) | (1L << (OUT - 59)))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TypeSpecifierContext extends ParserRuleContext {
		public TerminalNode VOID() { return getToken(LogosXXParser.VOID, 0); }
		public TerminalNode CHAR() { return getToken(LogosXXParser.CHAR, 0); }
		public TerminalNode SHORT() { return getToken(LogosXXParser.SHORT, 0); }
		public TerminalNode INT() { return getToken(LogosXXParser.INT, 0); }
		public TerminalNode LONG() { return getToken(LogosXXParser.LONG, 0); }
		public TerminalNode FLOAT() { return getToken(LogosXXParser.FLOAT, 0); }
		public TerminalNode DOUBLE() { return getToken(LogosXXParser.DOUBLE, 0); }
		public TerminalNode SIGNED() { return getToken(LogosXXParser.SIGNED, 0); }
		public TerminalNode UNSIGNED() { return getToken(LogosXXParser.UNSIGNED, 0); }
		public TypeofExpressionContext typeofExpression() {
			return getRuleContext(TypeofExpressionContext.class,0);
		}
		public GenericTypeSpecifierContext genericTypeSpecifier() {
			return getRuleContext(GenericTypeSpecifierContext.class,0);
		}
		public StructOrUnionSpecifierContext structOrUnionSpecifier() {
			return getRuleContext(StructOrUnionSpecifierContext.class,0);
		}
		public EnumSpecifierContext enumSpecifier() {
			return getRuleContext(EnumSpecifierContext.class,0);
		}
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public PointerContext pointer() {
			return getRuleContext(PointerContext.class,0);
		}
		public TypeSpecifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeSpecifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LogosXXParserListener ) ((LogosXXParserListener)listener).enterTypeSpecifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LogosXXParserListener ) ((LogosXXParserListener)listener).exitTypeSpecifier(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LogosXXParserVisitor ) return ((LogosXXParserVisitor<? extends T>)visitor).visitTypeSpecifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeSpecifierContext typeSpecifier() throws RecognitionException {
		TypeSpecifierContext _localctx = new TypeSpecifierContext(_ctx, getState());
		enterRule(_localctx, 242, RULE_typeSpecifier);
		try {
			setState(1470);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,166,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1453);
				match(VOID);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1454);
				match(CHAR);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1455);
				match(SHORT);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1456);
				match(INT);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(1457);
				match(LONG);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(1458);
				match(FLOAT);
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(1459);
				match(DOUBLE);
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(1460);
				match(SIGNED);
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(1461);
				match(UNSIGNED);
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(1462);
				typeofExpression();
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(1463);
				genericTypeSpecifier();
				}
				break;
			case 12:
				enterOuterAlt(_localctx, 12);
				{
				setState(1464);
				structOrUnionSpecifier();
				}
				break;
			case 13:
				enterOuterAlt(_localctx, 13);
				{
				setState(1465);
				enumSpecifier();
				}
				break;
			case 14:
				enterOuterAlt(_localctx, 14);
				{
				setState(1466);
				identifier();
				setState(1468);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,165,_ctx) ) {
				case 1:
					{
					setState(1467);
					pointer();
					}
					break;
				}
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TypeofExpressionContext extends ParserRuleContext {
		public TerminalNode TYPEOF() { return getToken(LogosXXParser.TYPEOF, 0); }
		public TerminalNode LP() { return getToken(LogosXXParser.LP, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode RP() { return getToken(LogosXXParser.RP, 0); }
		public TypeofExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeofExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LogosXXParserListener ) ((LogosXXParserListener)listener).enterTypeofExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LogosXXParserListener ) ((LogosXXParserListener)listener).exitTypeofExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LogosXXParserVisitor ) return ((LogosXXParserVisitor<? extends T>)visitor).visitTypeofExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeofExpressionContext typeofExpression() throws RecognitionException {
		TypeofExpressionContext _localctx = new TypeofExpressionContext(_ctx, getState());
		enterRule(_localctx, 244, RULE_typeofExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1472);
			match(TYPEOF);
			{
			setState(1473);
			match(LP);
			setState(1474);
			expression(0);
			setState(1475);
			match(RP);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FieldDeclaratorListContext extends ParserRuleContext {
		public List<FieldDeclaratorContext> fieldDeclarator() {
			return getRuleContexts(FieldDeclaratorContext.class);
		}
		public FieldDeclaratorContext fieldDeclarator(int i) {
			return getRuleContext(FieldDeclaratorContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(LogosXXParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(LogosXXParser.COMMA, i);
		}
		public FieldDeclaratorListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fieldDeclaratorList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LogosXXParserListener ) ((LogosXXParserListener)listener).enterFieldDeclaratorList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LogosXXParserListener ) ((LogosXXParserListener)listener).exitFieldDeclaratorList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LogosXXParserVisitor ) return ((LogosXXParserVisitor<? extends T>)visitor).visitFieldDeclaratorList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FieldDeclaratorListContext fieldDeclaratorList() throws RecognitionException {
		FieldDeclaratorListContext _localctx = new FieldDeclaratorListContext(_ctx, getState());
		enterRule(_localctx, 246, RULE_fieldDeclaratorList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1477);
			fieldDeclarator();
			setState(1482);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(1478);
				match(COMMA);
				setState(1479);
				fieldDeclarator();
				}
				}
				setState(1484);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FieldDeclaratorContext extends ParserRuleContext {
		public DeclaratorContext declarator() {
			return getRuleContext(DeclaratorContext.class,0);
		}
		public TerminalNode COLON() { return getToken(LogosXXParser.COLON, 0); }
		public ConstantContext constant() {
			return getRuleContext(ConstantContext.class,0);
		}
		public FieldDeclaratorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fieldDeclarator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LogosXXParserListener ) ((LogosXXParserListener)listener).enterFieldDeclarator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LogosXXParserListener ) ((LogosXXParserListener)listener).exitFieldDeclarator(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LogosXXParserVisitor ) return ((LogosXXParserVisitor<? extends T>)visitor).visitFieldDeclarator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FieldDeclaratorContext fieldDeclarator() throws RecognitionException {
		FieldDeclaratorContext _localctx = new FieldDeclaratorContext(_ctx, getState());
		enterRule(_localctx, 248, RULE_fieldDeclarator);
		int _la;
		try {
			setState(1491);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,169,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1485);
				declarator();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1487);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (((((_la - 57)) & ~0x3f) == 0 && ((1L << (_la - 57)) & ((1L << (BOOL - 57)) | (1L << (Class - 57)) | (1L << (BYCOPY - 57)) | (1L << (BYREF - 57)) | (1L << (ID - 57)) | (1L << (IMP - 57)) | (1L << (IN - 57)) | (1L << (INOUT - 57)) | (1L << (ONEWAY - 57)) | (1L << (OUT - 57)) | (1L << (PROTOCOL_ - 57)) | (1L << (SEL - 57)) | (1L << (SELF - 57)) | (1L << (SUPER - 57)) | (1L << (ATOMIC - 57)) | (1L << (NONATOMIC - 57)) | (1L << (RETAIN - 57)) | (1L << (AUTORELEASING_QUALIFIER - 57)) | (1L << (BLOCK - 57)) | (1L << (BRIDGE_RETAINED - 57)) | (1L << (BRIDGE_TRANSFER - 57)) | (1L << (COVARIANT - 57)) | (1L << (CONTRAVARIANT - 57)) | (1L << (DEPRECATED - 57)) | (1L << (KINDOF - 57)) | (1L << (UNUSED - 57)) | (1L << (NULL_UNSPECIFIED - 57)) | (1L << (NULLABLE - 57)) | (1L << (NONNULL - 57)) | (1L << (NULL_RESETTABLE - 57)) | (1L << (NS_INLINE - 57)))) != 0) || ((((_la - 121)) & ~0x3f) == 0 && ((1L << (_la - 121)) & ((1L << (NS_ENUM - 121)) | (1L << (NS_OPTIONS - 121)) | (1L << (ASSIGN - 121)) | (1L << (COPY - 121)) | (1L << (GETTER - 121)) | (1L << (SETTER - 121)) | (1L << (STRONG - 121)) | (1L << (READONLY - 121)) | (1L << (READWRITE - 121)) | (1L << (WEAK - 121)) | (1L << (UNSAFE_UNRETAINED - 121)) | (1L << (IB_OUTLET - 121)) | (1L << (IB_OUTLET_COLLECTION - 121)) | (1L << (IB_INSPECTABLE - 121)) | (1L << (IB_DESIGNABLE - 121)) | (1L << (IDENTIFIER - 121)) | (1L << (LP - 121)) | (1L << (MUL - 121)))) != 0)) {
					{
					setState(1486);
					declarator();
					}
				}

				setState(1489);
				match(COLON);
				setState(1490);
				constant();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class EnumSpecifierContext extends ParserRuleContext {
		public TerminalNode ENUM() { return getToken(LogosXXParser.ENUM, 0); }
		public List<IdentifierContext> identifier() {
			return getRuleContexts(IdentifierContext.class);
		}
		public IdentifierContext identifier(int i) {
			return getRuleContext(IdentifierContext.class,i);
		}
		public TerminalNode LBRACE() { return getToken(LogosXXParser.LBRACE, 0); }
		public EnumeratorListContext enumeratorList() {
			return getRuleContext(EnumeratorListContext.class,0);
		}
		public TerminalNode RBRACE() { return getToken(LogosXXParser.RBRACE, 0); }
		public TerminalNode COLON() { return getToken(LogosXXParser.COLON, 0); }
		public TypeNameContext typeName() {
			return getRuleContext(TypeNameContext.class,0);
		}
		public TerminalNode LP() { return getToken(LogosXXParser.LP, 0); }
		public TerminalNode COMMA() { return getToken(LogosXXParser.COMMA, 0); }
		public TerminalNode RP() { return getToken(LogosXXParser.RP, 0); }
		public TerminalNode NS_OPTIONS() { return getToken(LogosXXParser.NS_OPTIONS, 0); }
		public TerminalNode NS_ENUM() { return getToken(LogosXXParser.NS_ENUM, 0); }
		public EnumSpecifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_enumSpecifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LogosXXParserListener ) ((LogosXXParserListener)listener).enterEnumSpecifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LogosXXParserListener ) ((LogosXXParserListener)listener).exitEnumSpecifier(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LogosXXParserVisitor ) return ((LogosXXParserVisitor<? extends T>)visitor).visitEnumSpecifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EnumSpecifierContext enumSpecifier() throws RecognitionException {
		EnumSpecifierContext _localctx = new EnumSpecifierContext(_ctx, getState());
		enterRule(_localctx, 250, RULE_enumSpecifier);
		int _la;
		try {
			setState(1524);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ENUM:
				enterOuterAlt(_localctx, 1);
				{
				setState(1493);
				match(ENUM);
				setState(1499);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,171,_ctx) ) {
				case 1:
					{
					setState(1495);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (((((_la - 57)) & ~0x3f) == 0 && ((1L << (_la - 57)) & ((1L << (BOOL - 57)) | (1L << (Class - 57)) | (1L << (BYCOPY - 57)) | (1L << (BYREF - 57)) | (1L << (ID - 57)) | (1L << (IMP - 57)) | (1L << (IN - 57)) | (1L << (INOUT - 57)) | (1L << (ONEWAY - 57)) | (1L << (OUT - 57)) | (1L << (PROTOCOL_ - 57)) | (1L << (SEL - 57)) | (1L << (SELF - 57)) | (1L << (SUPER - 57)) | (1L << (ATOMIC - 57)) | (1L << (NONATOMIC - 57)) | (1L << (RETAIN - 57)) | (1L << (AUTORELEASING_QUALIFIER - 57)) | (1L << (BLOCK - 57)) | (1L << (BRIDGE_RETAINED - 57)) | (1L << (BRIDGE_TRANSFER - 57)) | (1L << (COVARIANT - 57)) | (1L << (CONTRAVARIANT - 57)) | (1L << (DEPRECATED - 57)) | (1L << (KINDOF - 57)) | (1L << (UNUSED - 57)) | (1L << (NULL_UNSPECIFIED - 57)) | (1L << (NULLABLE - 57)) | (1L << (NONNULL - 57)) | (1L << (NULL_RESETTABLE - 57)) | (1L << (NS_INLINE - 57)))) != 0) || ((((_la - 121)) & ~0x3f) == 0 && ((1L << (_la - 121)) & ((1L << (NS_ENUM - 121)) | (1L << (NS_OPTIONS - 121)) | (1L << (ASSIGN - 121)) | (1L << (COPY - 121)) | (1L << (GETTER - 121)) | (1L << (SETTER - 121)) | (1L << (STRONG - 121)) | (1L << (READONLY - 121)) | (1L << (READWRITE - 121)) | (1L << (WEAK - 121)) | (1L << (UNSAFE_UNRETAINED - 121)) | (1L << (IB_OUTLET - 121)) | (1L << (IB_OUTLET_COLLECTION - 121)) | (1L << (IB_INSPECTABLE - 121)) | (1L << (IB_DESIGNABLE - 121)) | (1L << (IDENTIFIER - 121)))) != 0)) {
						{
						setState(1494);
						identifier();
						}
					}

					setState(1497);
					match(COLON);
					setState(1498);
					typeName();
					}
					break;
				}
				setState(1512);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case BOOL:
				case Class:
				case BYCOPY:
				case BYREF:
				case ID:
				case IMP:
				case IN:
				case INOUT:
				case ONEWAY:
				case OUT:
				case PROTOCOL_:
				case SEL:
				case SELF:
				case SUPER:
				case ATOMIC:
				case NONATOMIC:
				case RETAIN:
				case AUTORELEASING_QUALIFIER:
				case BLOCK:
				case BRIDGE_RETAINED:
				case BRIDGE_TRANSFER:
				case COVARIANT:
				case CONTRAVARIANT:
				case DEPRECATED:
				case KINDOF:
				case UNUSED:
				case NULL_UNSPECIFIED:
				case NULLABLE:
				case NONNULL:
				case NULL_RESETTABLE:
				case NS_INLINE:
				case NS_ENUM:
				case NS_OPTIONS:
				case ASSIGN:
				case COPY:
				case GETTER:
				case SETTER:
				case STRONG:
				case READONLY:
				case READWRITE:
				case WEAK:
				case UNSAFE_UNRETAINED:
				case IB_OUTLET:
				case IB_OUTLET_COLLECTION:
				case IB_INSPECTABLE:
				case IB_DESIGNABLE:
				case IDENTIFIER:
					{
					setState(1501);
					identifier();
					setState(1506);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,172,_ctx) ) {
					case 1:
						{
						setState(1502);
						match(LBRACE);
						setState(1503);
						enumeratorList();
						setState(1504);
						match(RBRACE);
						}
						break;
					}
					}
					break;
				case LBRACE:
					{
					setState(1508);
					match(LBRACE);
					setState(1509);
					enumeratorList();
					setState(1510);
					match(RBRACE);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				break;
			case NS_ENUM:
			case NS_OPTIONS:
				enterOuterAlt(_localctx, 2);
				{
				setState(1514);
				_la = _input.LA(1);
				if ( !(_la==NS_ENUM || _la==NS_OPTIONS) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(1515);
				match(LP);
				setState(1516);
				typeName();
				setState(1517);
				match(COMMA);
				setState(1518);
				identifier();
				setState(1519);
				match(RP);
				setState(1520);
				match(LBRACE);
				setState(1521);
				enumeratorList();
				setState(1522);
				match(RBRACE);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class EnumeratorListContext extends ParserRuleContext {
		public List<EnumeratorContext> enumerator() {
			return getRuleContexts(EnumeratorContext.class);
		}
		public EnumeratorContext enumerator(int i) {
			return getRuleContext(EnumeratorContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(LogosXXParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(LogosXXParser.COMMA, i);
		}
		public EnumeratorListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_enumeratorList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LogosXXParserListener ) ((LogosXXParserListener)listener).enterEnumeratorList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LogosXXParserListener ) ((LogosXXParserListener)listener).exitEnumeratorList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LogosXXParserVisitor ) return ((LogosXXParserVisitor<? extends T>)visitor).visitEnumeratorList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EnumeratorListContext enumeratorList() throws RecognitionException {
		EnumeratorListContext _localctx = new EnumeratorListContext(_ctx, getState());
		enterRule(_localctx, 252, RULE_enumeratorList);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1526);
			enumerator();
			setState(1531);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,175,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1527);
					match(COMMA);
					setState(1528);
					enumerator();
					}
					} 
				}
				setState(1533);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,175,_ctx);
			}
			setState(1535);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COMMA) {
				{
				setState(1534);
				match(COMMA);
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class EnumeratorContext extends ParserRuleContext {
		public EnumeratorIdentifierContext enumeratorIdentifier() {
			return getRuleContext(EnumeratorIdentifierContext.class,0);
		}
		public TerminalNode ASSIGNMENT() { return getToken(LogosXXParser.ASSIGNMENT, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public EnumeratorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_enumerator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LogosXXParserListener ) ((LogosXXParserListener)listener).enterEnumerator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LogosXXParserListener ) ((LogosXXParserListener)listener).exitEnumerator(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LogosXXParserVisitor ) return ((LogosXXParserVisitor<? extends T>)visitor).visitEnumerator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EnumeratorContext enumerator() throws RecognitionException {
		EnumeratorContext _localctx = new EnumeratorContext(_ctx, getState());
		enterRule(_localctx, 254, RULE_enumerator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1537);
			enumeratorIdentifier();
			setState(1540);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ASSIGNMENT) {
				{
				setState(1538);
				match(ASSIGNMENT);
				setState(1539);
				expression(0);
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class EnumeratorIdentifierContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode DEFAULT() { return getToken(LogosXXParser.DEFAULT, 0); }
		public EnumeratorIdentifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_enumeratorIdentifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LogosXXParserListener ) ((LogosXXParserListener)listener).enterEnumeratorIdentifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LogosXXParserListener ) ((LogosXXParserListener)listener).exitEnumeratorIdentifier(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LogosXXParserVisitor ) return ((LogosXXParserVisitor<? extends T>)visitor).visitEnumeratorIdentifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EnumeratorIdentifierContext enumeratorIdentifier() throws RecognitionException {
		EnumeratorIdentifierContext _localctx = new EnumeratorIdentifierContext(_ctx, getState());
		enterRule(_localctx, 256, RULE_enumeratorIdentifier);
		try {
			setState(1544);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case BOOL:
			case Class:
			case BYCOPY:
			case BYREF:
			case ID:
			case IMP:
			case IN:
			case INOUT:
			case ONEWAY:
			case OUT:
			case PROTOCOL_:
			case SEL:
			case SELF:
			case SUPER:
			case ATOMIC:
			case NONATOMIC:
			case RETAIN:
			case AUTORELEASING_QUALIFIER:
			case BLOCK:
			case BRIDGE_RETAINED:
			case BRIDGE_TRANSFER:
			case COVARIANT:
			case CONTRAVARIANT:
			case DEPRECATED:
			case KINDOF:
			case UNUSED:
			case NULL_UNSPECIFIED:
			case NULLABLE:
			case NONNULL:
			case NULL_RESETTABLE:
			case NS_INLINE:
			case NS_ENUM:
			case NS_OPTIONS:
			case ASSIGN:
			case COPY:
			case GETTER:
			case SETTER:
			case STRONG:
			case READONLY:
			case READWRITE:
			case WEAK:
			case UNSAFE_UNRETAINED:
			case IB_OUTLET:
			case IB_OUTLET_COLLECTION:
			case IB_INSPECTABLE:
			case IB_DESIGNABLE:
			case IDENTIFIER:
				enterOuterAlt(_localctx, 1);
				{
				setState(1542);
				identifier();
				}
				break;
			case DEFAULT:
				enterOuterAlt(_localctx, 2);
				{
				setState(1543);
				match(DEFAULT);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DirectDeclaratorContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode LP() { return getToken(LogosXXParser.LP, 0); }
		public DeclaratorContext declarator() {
			return getRuleContext(DeclaratorContext.class,0);
		}
		public TerminalNode RP() { return getToken(LogosXXParser.RP, 0); }
		public List<DeclaratorSuffixContext> declaratorSuffix() {
			return getRuleContexts(DeclaratorSuffixContext.class);
		}
		public DeclaratorSuffixContext declaratorSuffix(int i) {
			return getRuleContext(DeclaratorSuffixContext.class,i);
		}
		public TerminalNode BITXOR() { return getToken(LogosXXParser.BITXOR, 0); }
		public BlockParametersContext blockParameters() {
			return getRuleContext(BlockParametersContext.class,0);
		}
		public NullabilitySpecifierContext nullabilitySpecifier() {
			return getRuleContext(NullabilitySpecifierContext.class,0);
		}
		public DirectDeclaratorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_directDeclarator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LogosXXParserListener ) ((LogosXXParserListener)listener).enterDirectDeclarator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LogosXXParserListener ) ((LogosXXParserListener)listener).exitDirectDeclarator(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LogosXXParserVisitor ) return ((LogosXXParserVisitor<? extends T>)visitor).visitDirectDeclarator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DirectDeclaratorContext directDeclarator() throws RecognitionException {
		DirectDeclaratorContext _localctx = new DirectDeclaratorContext(_ctx, getState());
		enterRule(_localctx, 258, RULE_directDeclarator);
		int _la;
		try {
			setState(1569);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,183,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1551);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case BOOL:
				case Class:
				case BYCOPY:
				case BYREF:
				case ID:
				case IMP:
				case IN:
				case INOUT:
				case ONEWAY:
				case OUT:
				case PROTOCOL_:
				case SEL:
				case SELF:
				case SUPER:
				case ATOMIC:
				case NONATOMIC:
				case RETAIN:
				case AUTORELEASING_QUALIFIER:
				case BLOCK:
				case BRIDGE_RETAINED:
				case BRIDGE_TRANSFER:
				case COVARIANT:
				case CONTRAVARIANT:
				case DEPRECATED:
				case KINDOF:
				case UNUSED:
				case NULL_UNSPECIFIED:
				case NULLABLE:
				case NONNULL:
				case NULL_RESETTABLE:
				case NS_INLINE:
				case NS_ENUM:
				case NS_OPTIONS:
				case ASSIGN:
				case COPY:
				case GETTER:
				case SETTER:
				case STRONG:
				case READONLY:
				case READWRITE:
				case WEAK:
				case UNSAFE_UNRETAINED:
				case IB_OUTLET:
				case IB_OUTLET_COLLECTION:
				case IB_INSPECTABLE:
				case IB_DESIGNABLE:
				case IDENTIFIER:
					{
					setState(1546);
					identifier();
					}
					break;
				case LP:
					{
					setState(1547);
					match(LP);
					setState(1548);
					declarator();
					setState(1549);
					match(RP);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(1556);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==LBRACK) {
					{
					{
					setState(1553);
					declaratorSuffix();
					}
					}
					setState(1558);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1559);
				match(LP);
				setState(1560);
				match(BITXOR);
				setState(1562);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,181,_ctx) ) {
				case 1:
					{
					setState(1561);
					nullabilitySpecifier();
					}
					break;
				}
				setState(1565);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (((((_la - 57)) & ~0x3f) == 0 && ((1L << (_la - 57)) & ((1L << (BOOL - 57)) | (1L << (Class - 57)) | (1L << (BYCOPY - 57)) | (1L << (BYREF - 57)) | (1L << (ID - 57)) | (1L << (IMP - 57)) | (1L << (IN - 57)) | (1L << (INOUT - 57)) | (1L << (ONEWAY - 57)) | (1L << (OUT - 57)) | (1L << (PROTOCOL_ - 57)) | (1L << (SEL - 57)) | (1L << (SELF - 57)) | (1L << (SUPER - 57)) | (1L << (ATOMIC - 57)) | (1L << (NONATOMIC - 57)) | (1L << (RETAIN - 57)) | (1L << (AUTORELEASING_QUALIFIER - 57)) | (1L << (BLOCK - 57)) | (1L << (BRIDGE_RETAINED - 57)) | (1L << (BRIDGE_TRANSFER - 57)) | (1L << (COVARIANT - 57)) | (1L << (CONTRAVARIANT - 57)) | (1L << (DEPRECATED - 57)) | (1L << (KINDOF - 57)) | (1L << (UNUSED - 57)) | (1L << (NULL_UNSPECIFIED - 57)) | (1L << (NULLABLE - 57)) | (1L << (NONNULL - 57)) | (1L << (NULL_RESETTABLE - 57)) | (1L << (NS_INLINE - 57)))) != 0) || ((((_la - 121)) & ~0x3f) == 0 && ((1L << (_la - 121)) & ((1L << (NS_ENUM - 121)) | (1L << (NS_OPTIONS - 121)) | (1L << (ASSIGN - 121)) | (1L << (COPY - 121)) | (1L << (GETTER - 121)) | (1L << (SETTER - 121)) | (1L << (STRONG - 121)) | (1L << (READONLY - 121)) | (1L << (READWRITE - 121)) | (1L << (WEAK - 121)) | (1L << (UNSAFE_UNRETAINED - 121)) | (1L << (IB_OUTLET - 121)) | (1L << (IB_OUTLET_COLLECTION - 121)) | (1L << (IB_INSPECTABLE - 121)) | (1L << (IB_DESIGNABLE - 121)) | (1L << (IDENTIFIER - 121)))) != 0)) {
					{
					setState(1564);
					identifier();
					}
				}

				setState(1567);
				match(RP);
				setState(1568);
				blockParameters();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DeclaratorSuffixContext extends ParserRuleContext {
		public TerminalNode LBRACK() { return getToken(LogosXXParser.LBRACK, 0); }
		public TerminalNode RBRACK() { return getToken(LogosXXParser.RBRACK, 0); }
		public ConstantExpressionContext constantExpression() {
			return getRuleContext(ConstantExpressionContext.class,0);
		}
		public DeclaratorSuffixContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declaratorSuffix; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LogosXXParserListener ) ((LogosXXParserListener)listener).enterDeclaratorSuffix(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LogosXXParserListener ) ((LogosXXParserListener)listener).exitDeclaratorSuffix(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LogosXXParserVisitor ) return ((LogosXXParserVisitor<? extends T>)visitor).visitDeclaratorSuffix(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DeclaratorSuffixContext declaratorSuffix() throws RecognitionException {
		DeclaratorSuffixContext _localctx = new DeclaratorSuffixContext(_ctx, getState());
		enterRule(_localctx, 260, RULE_declaratorSuffix);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1571);
			match(LBRACK);
			setState(1573);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 55)) & ~0x3f) == 0 && ((1L << (_la - 55)) & ((1L << (TRUE - 55)) | (1L << (FALSE - 55)) | (1L << (BOOL - 55)) | (1L << (Class - 55)) | (1L << (BYCOPY - 55)) | (1L << (BYREF - 55)) | (1L << (ID - 55)) | (1L << (IMP - 55)) | (1L << (IN - 55)) | (1L << (INOUT - 55)) | (1L << (NIL - 55)) | (1L << (NO - 55)) | (1L << (NULL - 55)) | (1L << (ONEWAY - 55)) | (1L << (OUT - 55)) | (1L << (PROTOCOL_ - 55)) | (1L << (SEL - 55)) | (1L << (SELF - 55)) | (1L << (SUPER - 55)) | (1L << (YES - 55)) | (1L << (ATOMIC - 55)) | (1L << (NONATOMIC - 55)) | (1L << (RETAIN - 55)) | (1L << (AUTORELEASING_QUALIFIER - 55)) | (1L << (BLOCK - 55)) | (1L << (BRIDGE_RETAINED - 55)) | (1L << (BRIDGE_TRANSFER - 55)) | (1L << (COVARIANT - 55)) | (1L << (CONTRAVARIANT - 55)) | (1L << (DEPRECATED - 55)) | (1L << (KINDOF - 55)) | (1L << (UNUSED - 55)) | (1L << (NULL_UNSPECIFIED - 55)) | (1L << (NULLABLE - 55)) | (1L << (NONNULL - 55)))) != 0) || ((((_la - 119)) & ~0x3f) == 0 && ((1L << (_la - 119)) & ((1L << (NULL_RESETTABLE - 119)) | (1L << (NS_INLINE - 119)) | (1L << (NS_ENUM - 119)) | (1L << (NS_OPTIONS - 119)) | (1L << (ASSIGN - 119)) | (1L << (COPY - 119)) | (1L << (GETTER - 119)) | (1L << (SETTER - 119)) | (1L << (STRONG - 119)) | (1L << (READONLY - 119)) | (1L << (READWRITE - 119)) | (1L << (WEAK - 119)) | (1L << (UNSAFE_UNRETAINED - 119)) | (1L << (IB_OUTLET - 119)) | (1L << (IB_OUTLET_COLLECTION - 119)) | (1L << (IB_INSPECTABLE - 119)) | (1L << (IB_DESIGNABLE - 119)) | (1L << (IDENTIFIER - 119)) | (1L << (ADD - 119)) | (1L << (SUB - 119)))) != 0) || ((((_la - 188)) & ~0x3f) == 0 && ((1L << (_la - 188)) & ((1L << (CHARACTER_LITERAL - 188)) | (1L << (HEX_LITERAL - 188)) | (1L << (OCTAL_LITERAL - 188)) | (1L << (BINARY_LITERAL - 188)) | (1L << (DECIMAL_LITERAL - 188)) | (1L << (FLOATING_POINT_LITERAL - 188)))) != 0)) {
				{
				setState(1572);
				constantExpression();
				}
			}

			setState(1575);
			match(RBRACK);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ParameterListContext extends ParserRuleContext {
		public ParameterDeclarationListContext parameterDeclarationList() {
			return getRuleContext(ParameterDeclarationListContext.class,0);
		}
		public TerminalNode COMMA() { return getToken(LogosXXParser.COMMA, 0); }
		public TerminalNode ELIPSIS() { return getToken(LogosXXParser.ELIPSIS, 0); }
		public ParameterListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parameterList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LogosXXParserListener ) ((LogosXXParserListener)listener).enterParameterList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LogosXXParserListener ) ((LogosXXParserListener)listener).exitParameterList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LogosXXParserVisitor ) return ((LogosXXParserVisitor<? extends T>)visitor).visitParameterList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ParameterListContext parameterList() throws RecognitionException {
		ParameterListContext _localctx = new ParameterListContext(_ctx, getState());
		enterRule(_localctx, 262, RULE_parameterList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1577);
			parameterDeclarationList();
			setState(1580);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COMMA) {
				{
				setState(1578);
				match(COMMA);
				setState(1579);
				match(ELIPSIS);
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PointerContext extends ParserRuleContext {
		public TerminalNode MUL() { return getToken(LogosXXParser.MUL, 0); }
		public DeclarationSpecifiersContext declarationSpecifiers() {
			return getRuleContext(DeclarationSpecifiersContext.class,0);
		}
		public PointerContext pointer() {
			return getRuleContext(PointerContext.class,0);
		}
		public PointerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_pointer; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LogosXXParserListener ) ((LogosXXParserListener)listener).enterPointer(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LogosXXParserListener ) ((LogosXXParserListener)listener).exitPointer(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LogosXXParserVisitor ) return ((LogosXXParserVisitor<? extends T>)visitor).visitPointer(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PointerContext pointer() throws RecognitionException {
		PointerContext _localctx = new PointerContext(_ctx, getState());
		enterRule(_localctx, 264, RULE_pointer);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1582);
			match(MUL);
			setState(1584);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,186,_ctx) ) {
			case 1:
				{
				setState(1583);
				declarationSpecifiers();
				}
				break;
			}
			setState(1587);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,187,_ctx) ) {
			case 1:
				{
				setState(1586);
				pointer();
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class MacroContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode LP() { return getToken(LogosXXParser.LP, 0); }
		public List<PrimaryExpressionContext> primaryExpression() {
			return getRuleContexts(PrimaryExpressionContext.class);
		}
		public PrimaryExpressionContext primaryExpression(int i) {
			return getRuleContext(PrimaryExpressionContext.class,i);
		}
		public TerminalNode RP() { return getToken(LogosXXParser.RP, 0); }
		public List<TerminalNode> COMMA() { return getTokens(LogosXXParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(LogosXXParser.COMMA, i);
		}
		public MacroContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_macro; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LogosXXParserListener ) ((LogosXXParserListener)listener).enterMacro(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LogosXXParserListener ) ((LogosXXParserListener)listener).exitMacro(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LogosXXParserVisitor ) return ((LogosXXParserVisitor<? extends T>)visitor).visitMacro(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MacroContext macro() throws RecognitionException {
		MacroContext _localctx = new MacroContext(_ctx, getState());
		enterRule(_localctx, 266, RULE_macro);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1589);
			identifier();
			setState(1601);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LP) {
				{
				setState(1590);
				match(LP);
				setState(1591);
				primaryExpression();
				setState(1596);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(1592);
					match(COMMA);
					setState(1593);
					primaryExpression();
					}
					}
					setState(1598);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1599);
				match(RP);
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ArrayInitializerContext extends ParserRuleContext {
		public TerminalNode LBRACE() { return getToken(LogosXXParser.LBRACE, 0); }
		public TerminalNode RBRACE() { return getToken(LogosXXParser.RBRACE, 0); }
		public ExpressionsContext expressions() {
			return getRuleContext(ExpressionsContext.class,0);
		}
		public TerminalNode COMMA() { return getToken(LogosXXParser.COMMA, 0); }
		public ArrayInitializerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arrayInitializer; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LogosXXParserListener ) ((LogosXXParserListener)listener).enterArrayInitializer(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LogosXXParserListener ) ((LogosXXParserListener)listener).exitArrayInitializer(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LogosXXParserVisitor ) return ((LogosXXParserVisitor<? extends T>)visitor).visitArrayInitializer(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArrayInitializerContext arrayInitializer() throws RecognitionException {
		ArrayInitializerContext _localctx = new ArrayInitializerContext(_ctx, getState());
		enterRule(_localctx, 268, RULE_arrayInitializer);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1603);
			match(LBRACE);
			setState(1608);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 42)) & ~0x3f) == 0 && ((1L << (_la - 42)) & ((1L << (SIZEOF - 42)) | (1L << (TRUE - 42)) | (1L << (FALSE - 42)) | (1L << (BOOL - 42)) | (1L << (Class - 42)) | (1L << (BYCOPY - 42)) | (1L << (BYREF - 42)) | (1L << (ID - 42)) | (1L << (IMP - 42)) | (1L << (IN - 42)) | (1L << (INOUT - 42)) | (1L << (NIL - 42)) | (1L << (NO - 42)) | (1L << (NULL - 42)) | (1L << (ONEWAY - 42)) | (1L << (OUT - 42)) | (1L << (PROTOCOL_ - 42)) | (1L << (SEL - 42)) | (1L << (SELF - 42)) | (1L << (SUPER - 42)) | (1L << (YES - 42)) | (1L << (ENCODE - 42)) | (1L << (PROTOCOL - 42)) | (1L << (SELECTOR - 42)) | (1L << (ATOMIC - 42)) | (1L << (NONATOMIC - 42)) | (1L << (RETAIN - 42)) | (1L << (AUTORELEASING_QUALIFIER - 42)) | (1L << (BLOCK - 42)) | (1L << (BRIDGE_RETAINED - 42)))) != 0) || ((((_la - 106)) & ~0x3f) == 0 && ((1L << (_la - 106)) & ((1L << (BRIDGE_TRANSFER - 106)) | (1L << (COVARIANT - 106)) | (1L << (CONTRAVARIANT - 106)) | (1L << (DEPRECATED - 106)) | (1L << (KINDOF - 106)) | (1L << (UNUSED - 106)) | (1L << (NULL_UNSPECIFIED - 106)) | (1L << (NULLABLE - 106)) | (1L << (NONNULL - 106)) | (1L << (NULL_RESETTABLE - 106)) | (1L << (NS_INLINE - 106)) | (1L << (NS_ENUM - 106)) | (1L << (NS_OPTIONS - 106)) | (1L << (ASSIGN - 106)) | (1L << (COPY - 106)) | (1L << (GETTER - 106)) | (1L << (SETTER - 106)) | (1L << (STRONG - 106)) | (1L << (READONLY - 106)) | (1L << (READWRITE - 106)) | (1L << (WEAK - 106)) | (1L << (UNSAFE_UNRETAINED - 106)) | (1L << (IB_OUTLET - 106)) | (1L << (IB_OUTLET_COLLECTION - 106)) | (1L << (IB_INSPECTABLE - 106)) | (1L << (IB_DESIGNABLE - 106)) | (1L << (IDENTIFIER - 106)) | (1L << (LP - 106)) | (1L << (LBRACK - 106)) | (1L << (AT - 106)) | (1L << (BANG - 106)) | (1L << (TILDE - 106)) | (1L << (INC - 106)) | (1L << (DEC - 106)) | (1L << (ADD - 106)))) != 0) || ((((_la - 170)) & ~0x3f) == 0 && ((1L << (_la - 170)) & ((1L << (SUB - 170)) | (1L << (MUL - 170)) | (1L << (BITAND - 170)) | (1L << (BITXOR - 170)) | (1L << (CHARACTER_LITERAL - 170)) | (1L << (STRING_START - 170)) | (1L << (HEX_LITERAL - 170)) | (1L << (OCTAL_LITERAL - 170)) | (1L << (BINARY_LITERAL - 170)) | (1L << (DECIMAL_LITERAL - 170)) | (1L << (FLOATING_POINT_LITERAL - 170)))) != 0)) {
				{
				setState(1604);
				expressions();
				setState(1606);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COMMA) {
					{
					setState(1605);
					match(COMMA);
					}
				}

				}
			}

			setState(1610);
			match(RBRACE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class StructInitializerContext extends ParserRuleContext {
		public TerminalNode LBRACE() { return getToken(LogosXXParser.LBRACE, 0); }
		public TerminalNode RBRACE() { return getToken(LogosXXParser.RBRACE, 0); }
		public List<TerminalNode> DOT() { return getTokens(LogosXXParser.DOT); }
		public TerminalNode DOT(int i) {
			return getToken(LogosXXParser.DOT, i);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(LogosXXParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(LogosXXParser.COMMA, i);
		}
		public StructInitializerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_structInitializer; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LogosXXParserListener ) ((LogosXXParserListener)listener).enterStructInitializer(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LogosXXParserListener ) ((LogosXXParserListener)listener).exitStructInitializer(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LogosXXParserVisitor ) return ((LogosXXParserVisitor<? extends T>)visitor).visitStructInitializer(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StructInitializerContext structInitializer() throws RecognitionException {
		StructInitializerContext _localctx = new StructInitializerContext(_ctx, getState());
		enterRule(_localctx, 270, RULE_structInitializer);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1612);
			match(LBRACE);
			setState(1626);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==DOT) {
				{
				setState(1613);
				match(DOT);
				setState(1614);
				expression(0);
				setState(1620);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,192,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(1615);
						match(COMMA);
						setState(1616);
						match(DOT);
						setState(1617);
						expression(0);
						}
						} 
					}
					setState(1622);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,192,_ctx);
				}
				setState(1624);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COMMA) {
					{
					setState(1623);
					match(COMMA);
					}
				}

				}
			}

			setState(1628);
			match(RBRACE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class InitializerListContext extends ParserRuleContext {
		public List<InitializerContext> initializer() {
			return getRuleContexts(InitializerContext.class);
		}
		public InitializerContext initializer(int i) {
			return getRuleContext(InitializerContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(LogosXXParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(LogosXXParser.COMMA, i);
		}
		public InitializerListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_initializerList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LogosXXParserListener ) ((LogosXXParserListener)listener).enterInitializerList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LogosXXParserListener ) ((LogosXXParserListener)listener).exitInitializerList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LogosXXParserVisitor ) return ((LogosXXParserVisitor<? extends T>)visitor).visitInitializerList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InitializerListContext initializerList() throws RecognitionException {
		InitializerListContext _localctx = new InitializerListContext(_ctx, getState());
		enterRule(_localctx, 272, RULE_initializerList);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1630);
			initializer();
			setState(1635);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,195,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1631);
					match(COMMA);
					setState(1632);
					initializer();
					}
					} 
				}
				setState(1637);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,195,_ctx);
			}
			setState(1639);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COMMA) {
				{
				setState(1638);
				match(COMMA);
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TypeNameContext extends ParserRuleContext {
		public SpecifierQualifierListContext specifierQualifierList() {
			return getRuleContext(SpecifierQualifierListContext.class,0);
		}
		public AbstractDeclaratorContext abstractDeclarator() {
			return getRuleContext(AbstractDeclaratorContext.class,0);
		}
		public BlockTypeContext blockType() {
			return getRuleContext(BlockTypeContext.class,0);
		}
		public TypeNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LogosXXParserListener ) ((LogosXXParserListener)listener).enterTypeName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LogosXXParserListener ) ((LogosXXParserListener)listener).exitTypeName(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LogosXXParserVisitor ) return ((LogosXXParserVisitor<? extends T>)visitor).visitTypeName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeNameContext typeName() throws RecognitionException {
		TypeNameContext _localctx = new TypeNameContext(_ctx, getState());
		enterRule(_localctx, 274, RULE_typeName);
		int _la;
		try {
			setState(1646);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,198,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1641);
				specifierQualifierList();
				setState(1643);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (((((_la - 143)) & ~0x3f) == 0 && ((1L << (_la - 143)) & ((1L << (LP - 143)) | (1L << (LBRACK - 143)) | (1L << (MUL - 143)))) != 0)) {
					{
					setState(1642);
					abstractDeclarator();
					}
				}

				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1645);
				blockType();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AbstractDeclaratorContext extends ParserRuleContext {
		public PointerContext pointer() {
			return getRuleContext(PointerContext.class,0);
		}
		public AbstractDeclaratorContext abstractDeclarator() {
			return getRuleContext(AbstractDeclaratorContext.class,0);
		}
		public TerminalNode LP() { return getToken(LogosXXParser.LP, 0); }
		public TerminalNode RP() { return getToken(LogosXXParser.RP, 0); }
		public List<AbstractDeclaratorSuffixContext> abstractDeclaratorSuffix() {
			return getRuleContexts(AbstractDeclaratorSuffixContext.class);
		}
		public AbstractDeclaratorSuffixContext abstractDeclaratorSuffix(int i) {
			return getRuleContext(AbstractDeclaratorSuffixContext.class,i);
		}
		public List<TerminalNode> LBRACK() { return getTokens(LogosXXParser.LBRACK); }
		public TerminalNode LBRACK(int i) {
			return getToken(LogosXXParser.LBRACK, i);
		}
		public List<TerminalNode> RBRACK() { return getTokens(LogosXXParser.RBRACK); }
		public TerminalNode RBRACK(int i) {
			return getToken(LogosXXParser.RBRACK, i);
		}
		public List<ConstantExpressionContext> constantExpression() {
			return getRuleContexts(ConstantExpressionContext.class);
		}
		public ConstantExpressionContext constantExpression(int i) {
			return getRuleContext(ConstantExpressionContext.class,i);
		}
		public AbstractDeclaratorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_abstractDeclarator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LogosXXParserListener ) ((LogosXXParserListener)listener).enterAbstractDeclarator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LogosXXParserListener ) ((LogosXXParserListener)listener).exitAbstractDeclarator(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LogosXXParserVisitor ) return ((LogosXXParserVisitor<? extends T>)visitor).visitAbstractDeclarator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AbstractDeclaratorContext abstractDeclarator() throws RecognitionException {
		AbstractDeclaratorContext _localctx = new AbstractDeclaratorContext(_ctx, getState());
		enterRule(_localctx, 276, RULE_abstractDeclarator);
		int _la;
		try {
			setState(1671);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case MUL:
				enterOuterAlt(_localctx, 1);
				{
				setState(1648);
				pointer();
				setState(1650);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (((((_la - 143)) & ~0x3f) == 0 && ((1L << (_la - 143)) & ((1L << (LP - 143)) | (1L << (LBRACK - 143)) | (1L << (MUL - 143)))) != 0)) {
					{
					setState(1649);
					abstractDeclarator();
					}
				}

				}
				break;
			case LP:
				enterOuterAlt(_localctx, 2);
				{
				setState(1652);
				match(LP);
				setState(1654);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (((((_la - 143)) & ~0x3f) == 0 && ((1L << (_la - 143)) & ((1L << (LP - 143)) | (1L << (LBRACK - 143)) | (1L << (MUL - 143)))) != 0)) {
					{
					setState(1653);
					abstractDeclarator();
					}
				}

				setState(1656);
				match(RP);
				setState(1658); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(1657);
					abstractDeclaratorSuffix();
					}
					}
					setState(1660); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==LP || _la==LBRACK );
				}
				break;
			case LBRACK:
				enterOuterAlt(_localctx, 3);
				{
				setState(1667); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(1662);
					match(LBRACK);
					setState(1664);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (((((_la - 55)) & ~0x3f) == 0 && ((1L << (_la - 55)) & ((1L << (TRUE - 55)) | (1L << (FALSE - 55)) | (1L << (BOOL - 55)) | (1L << (Class - 55)) | (1L << (BYCOPY - 55)) | (1L << (BYREF - 55)) | (1L << (ID - 55)) | (1L << (IMP - 55)) | (1L << (IN - 55)) | (1L << (INOUT - 55)) | (1L << (NIL - 55)) | (1L << (NO - 55)) | (1L << (NULL - 55)) | (1L << (ONEWAY - 55)) | (1L << (OUT - 55)) | (1L << (PROTOCOL_ - 55)) | (1L << (SEL - 55)) | (1L << (SELF - 55)) | (1L << (SUPER - 55)) | (1L << (YES - 55)) | (1L << (ATOMIC - 55)) | (1L << (NONATOMIC - 55)) | (1L << (RETAIN - 55)) | (1L << (AUTORELEASING_QUALIFIER - 55)) | (1L << (BLOCK - 55)) | (1L << (BRIDGE_RETAINED - 55)) | (1L << (BRIDGE_TRANSFER - 55)) | (1L << (COVARIANT - 55)) | (1L << (CONTRAVARIANT - 55)) | (1L << (DEPRECATED - 55)) | (1L << (KINDOF - 55)) | (1L << (UNUSED - 55)) | (1L << (NULL_UNSPECIFIED - 55)) | (1L << (NULLABLE - 55)) | (1L << (NONNULL - 55)))) != 0) || ((((_la - 119)) & ~0x3f) == 0 && ((1L << (_la - 119)) & ((1L << (NULL_RESETTABLE - 119)) | (1L << (NS_INLINE - 119)) | (1L << (NS_ENUM - 119)) | (1L << (NS_OPTIONS - 119)) | (1L << (ASSIGN - 119)) | (1L << (COPY - 119)) | (1L << (GETTER - 119)) | (1L << (SETTER - 119)) | (1L << (STRONG - 119)) | (1L << (READONLY - 119)) | (1L << (READWRITE - 119)) | (1L << (WEAK - 119)) | (1L << (UNSAFE_UNRETAINED - 119)) | (1L << (IB_OUTLET - 119)) | (1L << (IB_OUTLET_COLLECTION - 119)) | (1L << (IB_INSPECTABLE - 119)) | (1L << (IB_DESIGNABLE - 119)) | (1L << (IDENTIFIER - 119)) | (1L << (ADD - 119)) | (1L << (SUB - 119)))) != 0) || ((((_la - 188)) & ~0x3f) == 0 && ((1L << (_la - 188)) & ((1L << (CHARACTER_LITERAL - 188)) | (1L << (HEX_LITERAL - 188)) | (1L << (OCTAL_LITERAL - 188)) | (1L << (BINARY_LITERAL - 188)) | (1L << (DECIMAL_LITERAL - 188)) | (1L << (FLOATING_POINT_LITERAL - 188)))) != 0)) {
						{
						setState(1663);
						constantExpression();
						}
					}

					setState(1666);
					match(RBRACK);
					}
					}
					setState(1669); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==LBRACK );
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AbstractDeclaratorSuffixContext extends ParserRuleContext {
		public TerminalNode LBRACK() { return getToken(LogosXXParser.LBRACK, 0); }
		public TerminalNode RBRACK() { return getToken(LogosXXParser.RBRACK, 0); }
		public ConstantExpressionContext constantExpression() {
			return getRuleContext(ConstantExpressionContext.class,0);
		}
		public TerminalNode LP() { return getToken(LogosXXParser.LP, 0); }
		public TerminalNode RP() { return getToken(LogosXXParser.RP, 0); }
		public ParameterDeclarationListContext parameterDeclarationList() {
			return getRuleContext(ParameterDeclarationListContext.class,0);
		}
		public AbstractDeclaratorSuffixContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_abstractDeclaratorSuffix; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LogosXXParserListener ) ((LogosXXParserListener)listener).enterAbstractDeclaratorSuffix(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LogosXXParserListener ) ((LogosXXParserListener)listener).exitAbstractDeclaratorSuffix(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LogosXXParserVisitor ) return ((LogosXXParserVisitor<? extends T>)visitor).visitAbstractDeclaratorSuffix(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AbstractDeclaratorSuffixContext abstractDeclaratorSuffix() throws RecognitionException {
		AbstractDeclaratorSuffixContext _localctx = new AbstractDeclaratorSuffixContext(_ctx, getState());
		enterRule(_localctx, 278, RULE_abstractDeclaratorSuffix);
		int _la;
		try {
			setState(1683);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LBRACK:
				enterOuterAlt(_localctx, 1);
				{
				setState(1673);
				match(LBRACK);
				setState(1675);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (((((_la - 55)) & ~0x3f) == 0 && ((1L << (_la - 55)) & ((1L << (TRUE - 55)) | (1L << (FALSE - 55)) | (1L << (BOOL - 55)) | (1L << (Class - 55)) | (1L << (BYCOPY - 55)) | (1L << (BYREF - 55)) | (1L << (ID - 55)) | (1L << (IMP - 55)) | (1L << (IN - 55)) | (1L << (INOUT - 55)) | (1L << (NIL - 55)) | (1L << (NO - 55)) | (1L << (NULL - 55)) | (1L << (ONEWAY - 55)) | (1L << (OUT - 55)) | (1L << (PROTOCOL_ - 55)) | (1L << (SEL - 55)) | (1L << (SELF - 55)) | (1L << (SUPER - 55)) | (1L << (YES - 55)) | (1L << (ATOMIC - 55)) | (1L << (NONATOMIC - 55)) | (1L << (RETAIN - 55)) | (1L << (AUTORELEASING_QUALIFIER - 55)) | (1L << (BLOCK - 55)) | (1L << (BRIDGE_RETAINED - 55)) | (1L << (BRIDGE_TRANSFER - 55)) | (1L << (COVARIANT - 55)) | (1L << (CONTRAVARIANT - 55)) | (1L << (DEPRECATED - 55)) | (1L << (KINDOF - 55)) | (1L << (UNUSED - 55)) | (1L << (NULL_UNSPECIFIED - 55)) | (1L << (NULLABLE - 55)) | (1L << (NONNULL - 55)))) != 0) || ((((_la - 119)) & ~0x3f) == 0 && ((1L << (_la - 119)) & ((1L << (NULL_RESETTABLE - 119)) | (1L << (NS_INLINE - 119)) | (1L << (NS_ENUM - 119)) | (1L << (NS_OPTIONS - 119)) | (1L << (ASSIGN - 119)) | (1L << (COPY - 119)) | (1L << (GETTER - 119)) | (1L << (SETTER - 119)) | (1L << (STRONG - 119)) | (1L << (READONLY - 119)) | (1L << (READWRITE - 119)) | (1L << (WEAK - 119)) | (1L << (UNSAFE_UNRETAINED - 119)) | (1L << (IB_OUTLET - 119)) | (1L << (IB_OUTLET_COLLECTION - 119)) | (1L << (IB_INSPECTABLE - 119)) | (1L << (IB_DESIGNABLE - 119)) | (1L << (IDENTIFIER - 119)) | (1L << (ADD - 119)) | (1L << (SUB - 119)))) != 0) || ((((_la - 188)) & ~0x3f) == 0 && ((1L << (_la - 188)) & ((1L << (CHARACTER_LITERAL - 188)) | (1L << (HEX_LITERAL - 188)) | (1L << (OCTAL_LITERAL - 188)) | (1L << (BINARY_LITERAL - 188)) | (1L << (DECIMAL_LITERAL - 188)) | (1L << (FLOATING_POINT_LITERAL - 188)))) != 0)) {
					{
					setState(1674);
					constantExpression();
					}
				}

				setState(1677);
				match(RBRACK);
				}
				break;
			case LP:
				enterOuterAlt(_localctx, 2);
				{
				setState(1678);
				match(LP);
				setState(1680);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (((((_la - 18)) & ~0x3f) == 0 && ((1L << (_la - 18)) & ((1L << (AUTO - 18)) | (1L << (CHAR - 18)) | (1L << (CONST - 18)) | (1L << (DOUBLE - 18)) | (1L << (ENUM - 18)) | (1L << (EXTERN - 18)) | (1L << (FLOAT - 18)) | (1L << (INLINE - 18)) | (1L << (INT - 18)) | (1L << (LONG - 18)) | (1L << (REGISTER - 18)) | (1L << (RESTRICT - 18)) | (1L << (SHORT - 18)) | (1L << (SIGNED - 18)) | (1L << (STATIC - 18)) | (1L << (STRUCT - 18)) | (1L << (UNION - 18)) | (1L << (UNSIGNED - 18)) | (1L << (VOID - 18)) | (1L << (VOLATILE - 18)) | (1L << (BOOL - 18)) | (1L << (Class - 18)) | (1L << (BYCOPY - 18)) | (1L << (BYREF - 18)) | (1L << (ID - 18)) | (1L << (IMP - 18)) | (1L << (IN - 18)) | (1L << (INOUT - 18)) | (1L << (ONEWAY - 18)) | (1L << (OUT - 18)) | (1L << (PROTOCOL_ - 18)) | (1L << (SEL - 18)) | (1L << (SELF - 18)) | (1L << (SUPER - 18)))) != 0) || ((((_la - 98)) & ~0x3f) == 0 && ((1L << (_la - 98)) & ((1L << (ATOMIC - 98)) | (1L << (NONATOMIC - 98)) | (1L << (RETAIN - 98)) | (1L << (ATTRIBUTE - 98)) | (1L << (AUTORELEASING_QUALIFIER - 98)) | (1L << (BLOCK - 98)) | (1L << (BRIDGE - 98)) | (1L << (BRIDGE_RETAINED - 98)) | (1L << (BRIDGE_TRANSFER - 98)) | (1L << (COVARIANT - 98)) | (1L << (CONTRAVARIANT - 98)) | (1L << (DEPRECATED - 98)) | (1L << (KINDOF - 98)) | (1L << (STRONG_QUALIFIER - 98)) | (1L << (TYPEOF - 98)) | (1L << (UNSAFE_UNRETAINED_QUALIFIER - 98)) | (1L << (UNUSED - 98)) | (1L << (WEAK_QUALIFIER - 98)) | (1L << (NULL_UNSPECIFIED - 98)) | (1L << (NULLABLE - 98)) | (1L << (NONNULL - 98)) | (1L << (NULL_RESETTABLE - 98)) | (1L << (NS_INLINE - 98)) | (1L << (NS_ENUM - 98)) | (1L << (NS_OPTIONS - 98)) | (1L << (ASSIGN - 98)) | (1L << (COPY - 98)) | (1L << (GETTER - 98)) | (1L << (SETTER - 98)) | (1L << (STRONG - 98)) | (1L << (READONLY - 98)) | (1L << (READWRITE - 98)) | (1L << (WEAK - 98)) | (1L << (UNSAFE_UNRETAINED - 98)) | (1L << (IB_OUTLET - 98)) | (1L << (IB_OUTLET_COLLECTION - 98)) | (1L << (IB_INSPECTABLE - 98)) | (1L << (IB_DESIGNABLE - 98)) | (1L << (IDENTIFIER - 98)))) != 0)) {
					{
					setState(1679);
					parameterDeclarationList();
					}
				}

				setState(1682);
				match(RP);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ParameterDeclarationListContext extends ParserRuleContext {
		public List<ParameterDeclarationContext> parameterDeclaration() {
			return getRuleContexts(ParameterDeclarationContext.class);
		}
		public ParameterDeclarationContext parameterDeclaration(int i) {
			return getRuleContext(ParameterDeclarationContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(LogosXXParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(LogosXXParser.COMMA, i);
		}
		public ParameterDeclarationListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parameterDeclarationList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LogosXXParserListener ) ((LogosXXParserListener)listener).enterParameterDeclarationList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LogosXXParserListener ) ((LogosXXParserListener)listener).exitParameterDeclarationList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LogosXXParserVisitor ) return ((LogosXXParserVisitor<? extends T>)visitor).visitParameterDeclarationList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ParameterDeclarationListContext parameterDeclarationList() throws RecognitionException {
		ParameterDeclarationListContext _localctx = new ParameterDeclarationListContext(_ctx, getState());
		enterRule(_localctx, 280, RULE_parameterDeclarationList);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1685);
			parameterDeclaration();
			setState(1690);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,208,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1686);
					match(COMMA);
					setState(1687);
					parameterDeclaration();
					}
					} 
				}
				setState(1692);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,208,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ParameterDeclarationContext extends ParserRuleContext {
		public DeclarationSpecifiersContext declarationSpecifiers() {
			return getRuleContext(DeclarationSpecifiersContext.class,0);
		}
		public DeclaratorContext declarator() {
			return getRuleContext(DeclaratorContext.class,0);
		}
		public TerminalNode VOID() { return getToken(LogosXXParser.VOID, 0); }
		public ParameterDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parameterDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LogosXXParserListener ) ((LogosXXParserListener)listener).enterParameterDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LogosXXParserListener ) ((LogosXXParserListener)listener).exitParameterDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LogosXXParserVisitor ) return ((LogosXXParserVisitor<? extends T>)visitor).visitParameterDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ParameterDeclarationContext parameterDeclaration() throws RecognitionException {
		ParameterDeclarationContext _localctx = new ParameterDeclarationContext(_ctx, getState());
		enterRule(_localctx, 282, RULE_parameterDeclaration);
		try {
			setState(1697);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,209,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1693);
				declarationSpecifiers();
				setState(1694);
				declarator();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1696);
				match(VOID);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DeclaratorContext extends ParserRuleContext {
		public DirectDeclaratorContext directDeclarator() {
			return getRuleContext(DirectDeclaratorContext.class,0);
		}
		public PointerContext pointer() {
			return getRuleContext(PointerContext.class,0);
		}
		public DeclaratorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declarator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LogosXXParserListener ) ((LogosXXParserListener)listener).enterDeclarator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LogosXXParserListener ) ((LogosXXParserListener)listener).exitDeclarator(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LogosXXParserVisitor ) return ((LogosXXParserVisitor<? extends T>)visitor).visitDeclarator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DeclaratorContext declarator() throws RecognitionException {
		DeclaratorContext _localctx = new DeclaratorContext(_ctx, getState());
		enterRule(_localctx, 284, RULE_declarator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1700);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==MUL) {
				{
				setState(1699);
				pointer();
				}
			}

			setState(1702);
			directDeclarator();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class StatementContext extends ParserRuleContext {
		public LabeledStatementContext labeledStatement() {
			return getRuleContext(LabeledStatementContext.class,0);
		}
		public TerminalNode SEMI() { return getToken(LogosXXParser.SEMI, 0); }
		public CompoundStatementContext compoundStatement() {
			return getRuleContext(CompoundStatementContext.class,0);
		}
		public SelectionStatementContext selectionStatement() {
			return getRuleContext(SelectionStatementContext.class,0);
		}
		public IterationStatementContext iterationStatement() {
			return getRuleContext(IterationStatementContext.class,0);
		}
		public JumpStatementContext jumpStatement() {
			return getRuleContext(JumpStatementContext.class,0);
		}
		public SynchronizedStatementContext synchronizedStatement() {
			return getRuleContext(SynchronizedStatementContext.class,0);
		}
		public AutoreleaseStatementContext autoreleaseStatement() {
			return getRuleContext(AutoreleaseStatementContext.class,0);
		}
		public ThrowStatementContext throwStatement() {
			return getRuleContext(ThrowStatementContext.class,0);
		}
		public TryBlockContext tryBlock() {
			return getRuleContext(TryBlockContext.class,0);
		}
		public ExpressionsContext expressions() {
			return getRuleContext(ExpressionsContext.class,0);
		}
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LogosXXParserListener ) ((LogosXXParserListener)listener).enterStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LogosXXParserListener ) ((LogosXXParserListener)listener).exitStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LogosXXParserVisitor ) return ((LogosXXParserVisitor<? extends T>)visitor).visitStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 286, RULE_statement);
		try {
			setState(1745);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,221,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1704);
				labeledStatement();
				setState(1706);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,211,_ctx) ) {
				case 1:
					{
					setState(1705);
					match(SEMI);
					}
					break;
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1708);
				compoundStatement();
				setState(1710);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,212,_ctx) ) {
				case 1:
					{
					setState(1709);
					match(SEMI);
					}
					break;
				}
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1712);
				selectionStatement();
				setState(1714);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,213,_ctx) ) {
				case 1:
					{
					setState(1713);
					match(SEMI);
					}
					break;
				}
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1716);
				iterationStatement();
				setState(1718);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,214,_ctx) ) {
				case 1:
					{
					setState(1717);
					match(SEMI);
					}
					break;
				}
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(1720);
				jumpStatement();
				setState(1722);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,215,_ctx) ) {
				case 1:
					{
					setState(1721);
					match(SEMI);
					}
					break;
				}
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(1724);
				synchronizedStatement();
				setState(1726);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,216,_ctx) ) {
				case 1:
					{
					setState(1725);
					match(SEMI);
					}
					break;
				}
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(1728);
				autoreleaseStatement();
				setState(1730);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,217,_ctx) ) {
				case 1:
					{
					setState(1729);
					match(SEMI);
					}
					break;
				}
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(1732);
				throwStatement();
				setState(1734);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,218,_ctx) ) {
				case 1:
					{
					setState(1733);
					match(SEMI);
					}
					break;
				}
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(1736);
				tryBlock();
				setState(1738);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,219,_ctx) ) {
				case 1:
					{
					setState(1737);
					match(SEMI);
					}
					break;
				}
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(1740);
				expressions();
				setState(1742);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,220,_ctx) ) {
				case 1:
					{
					setState(1741);
					match(SEMI);
					}
					break;
				}
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(1744);
				match(SEMI);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class LabeledStatementContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode COLON() { return getToken(LogosXXParser.COLON, 0); }
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public LabeledStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_labeledStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LogosXXParserListener ) ((LogosXXParserListener)listener).enterLabeledStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LogosXXParserListener ) ((LogosXXParserListener)listener).exitLabeledStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LogosXXParserVisitor ) return ((LogosXXParserVisitor<? extends T>)visitor).visitLabeledStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LabeledStatementContext labeledStatement() throws RecognitionException {
		LabeledStatementContext _localctx = new LabeledStatementContext(_ctx, getState());
		enterRule(_localctx, 288, RULE_labeledStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1747);
			identifier();
			setState(1748);
			match(COLON);
			setState(1749);
			statement();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class RangeExpressionContext extends ParserRuleContext {
		public List<ConstantExpressionContext> constantExpression() {
			return getRuleContexts(ConstantExpressionContext.class);
		}
		public ConstantExpressionContext constantExpression(int i) {
			return getRuleContext(ConstantExpressionContext.class,i);
		}
		public TerminalNode ELIPSIS() { return getToken(LogosXXParser.ELIPSIS, 0); }
		public RangeExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_rangeExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LogosXXParserListener ) ((LogosXXParserListener)listener).enterRangeExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LogosXXParserListener ) ((LogosXXParserListener)listener).exitRangeExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LogosXXParserVisitor ) return ((LogosXXParserVisitor<? extends T>)visitor).visitRangeExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RangeExpressionContext rangeExpression() throws RecognitionException {
		RangeExpressionContext _localctx = new RangeExpressionContext(_ctx, getState());
		enterRule(_localctx, 290, RULE_rangeExpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1751);
			constantExpression();
			setState(1754);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ELIPSIS) {
				{
				setState(1752);
				match(ELIPSIS);
				setState(1753);
				constantExpression();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CompoundStatementContext extends ParserRuleContext {
		public TerminalNode LBRACE() { return getToken(LogosXXParser.LBRACE, 0); }
		public TerminalNode RBRACE() { return getToken(LogosXXParser.RBRACE, 0); }
		public List<DeclarationContext> declaration() {
			return getRuleContexts(DeclarationContext.class);
		}
		public DeclarationContext declaration(int i) {
			return getRuleContext(DeclarationContext.class,i);
		}
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public CompoundStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_compoundStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LogosXXParserListener ) ((LogosXXParserListener)listener).enterCompoundStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LogosXXParserListener ) ((LogosXXParserListener)listener).exitCompoundStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LogosXXParserVisitor ) return ((LogosXXParserVisitor<? extends T>)visitor).visitCompoundStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CompoundStatementContext compoundStatement() throws RecognitionException {
		CompoundStatementContext _localctx = new CompoundStatementContext(_ctx, getState());
		enterRule(_localctx, 292, RULE_compoundStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1756);
			match(LBRACE);
			setState(1761);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((((_la - 18)) & ~0x3f) == 0 && ((1L << (_la - 18)) & ((1L << (AUTO - 18)) | (1L << (BREAK - 18)) | (1L << (CHAR - 18)) | (1L << (CONST - 18)) | (1L << (CONTINUE - 18)) | (1L << (DO - 18)) | (1L << (DOUBLE - 18)) | (1L << (ENUM - 18)) | (1L << (EXTERN - 18)) | (1L << (FLOAT - 18)) | (1L << (FOR - 18)) | (1L << (GOTO - 18)) | (1L << (IF - 18)) | (1L << (INLINE - 18)) | (1L << (INT - 18)) | (1L << (LONG - 18)) | (1L << (REGISTER - 18)) | (1L << (RESTRICT - 18)) | (1L << (RETURN - 18)) | (1L << (SHORT - 18)) | (1L << (SIGNED - 18)) | (1L << (SIZEOF - 18)) | (1L << (STATIC - 18)) | (1L << (STRUCT - 18)) | (1L << (SWITCH - 18)) | (1L << (TYPEDEF - 18)) | (1L << (UNION - 18)) | (1L << (UNSIGNED - 18)) | (1L << (VOID - 18)) | (1L << (VOLATILE - 18)) | (1L << (WHILE - 18)) | (1L << (TRUE - 18)) | (1L << (FALSE - 18)) | (1L << (BOOL - 18)) | (1L << (Class - 18)) | (1L << (BYCOPY - 18)) | (1L << (BYREF - 18)) | (1L << (ID - 18)) | (1L << (IMP - 18)) | (1L << (IN - 18)) | (1L << (INOUT - 18)) | (1L << (NIL - 18)) | (1L << (NO - 18)) | (1L << (NULL - 18)) | (1L << (ONEWAY - 18)) | (1L << (OUT - 18)) | (1L << (PROTOCOL_ - 18)) | (1L << (SEL - 18)) | (1L << (SELF - 18)) | (1L << (SUPER - 18)) | (1L << (YES - 18)) | (1L << (AUTORELEASEPOOL - 18)) | (1L << (ENCODE - 18)))) != 0) || ((((_la - 86)) & ~0x3f) == 0 && ((1L << (_la - 86)) & ((1L << (PROTOCOL - 86)) | (1L << (SELECTOR - 86)) | (1L << (SYNCHRONIZED - 86)) | (1L << (THROW - 86)) | (1L << (TRY - 86)) | (1L << (ATOMIC - 86)) | (1L << (NONATOMIC - 86)) | (1L << (RETAIN - 86)) | (1L << (ATTRIBUTE - 86)) | (1L << (AUTORELEASING_QUALIFIER - 86)) | (1L << (BLOCK - 86)) | (1L << (BRIDGE - 86)) | (1L << (BRIDGE_RETAINED - 86)) | (1L << (BRIDGE_TRANSFER - 86)) | (1L << (COVARIANT - 86)) | (1L << (CONTRAVARIANT - 86)) | (1L << (DEPRECATED - 86)) | (1L << (KINDOF - 86)) | (1L << (STRONG_QUALIFIER - 86)) | (1L << (TYPEOF - 86)) | (1L << (UNSAFE_UNRETAINED_QUALIFIER - 86)) | (1L << (UNUSED - 86)) | (1L << (WEAK_QUALIFIER - 86)) | (1L << (NULL_UNSPECIFIED - 86)) | (1L << (NULLABLE - 86)) | (1L << (NONNULL - 86)) | (1L << (NULL_RESETTABLE - 86)) | (1L << (NS_INLINE - 86)) | (1L << (NS_ENUM - 86)) | (1L << (NS_OPTIONS - 86)) | (1L << (ASSIGN - 86)) | (1L << (COPY - 86)) | (1L << (GETTER - 86)) | (1L << (SETTER - 86)) | (1L << (STRONG - 86)) | (1L << (READONLY - 86)) | (1L << (READWRITE - 86)) | (1L << (WEAK - 86)) | (1L << (UNSAFE_UNRETAINED - 86)) | (1L << (IB_OUTLET - 86)) | (1L << (IB_OUTLET_COLLECTION - 86)) | (1L << (IB_INSPECTABLE - 86)) | (1L << (IB_DESIGNABLE - 86)) | (1L << (IDENTIFIER - 86)) | (1L << (LP - 86)) | (1L << (LBRACE - 86)) | (1L << (LBRACK - 86)) | (1L << (SEMI - 86)))) != 0) || ((((_la - 153)) & ~0x3f) == 0 && ((1L << (_la - 153)) & ((1L << (AT - 153)) | (1L << (BANG - 153)) | (1L << (TILDE - 153)) | (1L << (INC - 153)) | (1L << (DEC - 153)) | (1L << (ADD - 153)) | (1L << (SUB - 153)) | (1L << (MUL - 153)) | (1L << (BITAND - 153)) | (1L << (BITXOR - 153)) | (1L << (CHARACTER_LITERAL - 153)) | (1L << (STRING_START - 153)) | (1L << (HEX_LITERAL - 153)) | (1L << (OCTAL_LITERAL - 153)) | (1L << (BINARY_LITERAL - 153)) | (1L << (DECIMAL_LITERAL - 153)) | (1L << (FLOATING_POINT_LITERAL - 153)))) != 0)) {
				{
				setState(1759);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,223,_ctx) ) {
				case 1:
					{
					setState(1757);
					declaration();
					}
					break;
				case 2:
					{
					setState(1758);
					statement();
					}
					break;
				}
				}
				setState(1763);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1764);
			match(RBRACE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SelectionStatementContext extends ParserRuleContext {
		public StatementContext ifBody;
		public StatementContext elseBody;
		public TerminalNode IF() { return getToken(LogosXXParser.IF, 0); }
		public TerminalNode LP() { return getToken(LogosXXParser.LP, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode RP() { return getToken(LogosXXParser.RP, 0); }
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public TerminalNode ELSE() { return getToken(LogosXXParser.ELSE, 0); }
		public SwitchStatementContext switchStatement() {
			return getRuleContext(SwitchStatementContext.class,0);
		}
		public SelectionStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_selectionStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LogosXXParserListener ) ((LogosXXParserListener)listener).enterSelectionStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LogosXXParserListener ) ((LogosXXParserListener)listener).exitSelectionStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LogosXXParserVisitor ) return ((LogosXXParserVisitor<? extends T>)visitor).visitSelectionStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SelectionStatementContext selectionStatement() throws RecognitionException {
		SelectionStatementContext _localctx = new SelectionStatementContext(_ctx, getState());
		enterRule(_localctx, 294, RULE_selectionStatement);
		try {
			setState(1776);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IF:
				enterOuterAlt(_localctx, 1);
				{
				setState(1766);
				match(IF);
				setState(1767);
				match(LP);
				setState(1768);
				expression(0);
				setState(1769);
				match(RP);
				setState(1770);
				((SelectionStatementContext)_localctx).ifBody = statement();
				setState(1773);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,225,_ctx) ) {
				case 1:
					{
					setState(1771);
					match(ELSE);
					setState(1772);
					((SelectionStatementContext)_localctx).elseBody = statement();
					}
					break;
				}
				}
				break;
			case SWITCH:
				enterOuterAlt(_localctx, 2);
				{
				setState(1775);
				switchStatement();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SwitchStatementContext extends ParserRuleContext {
		public TerminalNode SWITCH() { return getToken(LogosXXParser.SWITCH, 0); }
		public TerminalNode LP() { return getToken(LogosXXParser.LP, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode RP() { return getToken(LogosXXParser.RP, 0); }
		public SwitchBlockContext switchBlock() {
			return getRuleContext(SwitchBlockContext.class,0);
		}
		public SwitchStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_switchStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LogosXXParserListener ) ((LogosXXParserListener)listener).enterSwitchStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LogosXXParserListener ) ((LogosXXParserListener)listener).exitSwitchStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LogosXXParserVisitor ) return ((LogosXXParserVisitor<? extends T>)visitor).visitSwitchStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SwitchStatementContext switchStatement() throws RecognitionException {
		SwitchStatementContext _localctx = new SwitchStatementContext(_ctx, getState());
		enterRule(_localctx, 296, RULE_switchStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1778);
			match(SWITCH);
			setState(1779);
			match(LP);
			setState(1780);
			expression(0);
			setState(1781);
			match(RP);
			setState(1782);
			switchBlock();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SwitchBlockContext extends ParserRuleContext {
		public TerminalNode LBRACE() { return getToken(LogosXXParser.LBRACE, 0); }
		public TerminalNode RBRACE() { return getToken(LogosXXParser.RBRACE, 0); }
		public List<SwitchSectionContext> switchSection() {
			return getRuleContexts(SwitchSectionContext.class);
		}
		public SwitchSectionContext switchSection(int i) {
			return getRuleContext(SwitchSectionContext.class,i);
		}
		public SwitchBlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_switchBlock; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LogosXXParserListener ) ((LogosXXParserListener)listener).enterSwitchBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LogosXXParserListener ) ((LogosXXParserListener)listener).exitSwitchBlock(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LogosXXParserVisitor ) return ((LogosXXParserVisitor<? extends T>)visitor).visitSwitchBlock(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SwitchBlockContext switchBlock() throws RecognitionException {
		SwitchBlockContext _localctx = new SwitchBlockContext(_ctx, getState());
		enterRule(_localctx, 298, RULE_switchBlock);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1784);
			match(LBRACE);
			setState(1788);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==CASE || _la==DEFAULT) {
				{
				{
				setState(1785);
				switchSection();
				}
				}
				setState(1790);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1791);
			match(RBRACE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SwitchSectionContext extends ParserRuleContext {
		public List<SwitchLabelContext> switchLabel() {
			return getRuleContexts(SwitchLabelContext.class);
		}
		public SwitchLabelContext switchLabel(int i) {
			return getRuleContext(SwitchLabelContext.class,i);
		}
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public SwitchSectionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_switchSection; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LogosXXParserListener ) ((LogosXXParserListener)listener).enterSwitchSection(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LogosXXParserListener ) ((LogosXXParserListener)listener).exitSwitchSection(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LogosXXParserVisitor ) return ((LogosXXParserVisitor<? extends T>)visitor).visitSwitchSection(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SwitchSectionContext switchSection() throws RecognitionException {
		SwitchSectionContext _localctx = new SwitchSectionContext(_ctx, getState());
		enterRule(_localctx, 300, RULE_switchSection);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1794); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(1793);
				switchLabel();
				}
				}
				setState(1796); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==CASE || _la==DEFAULT );
			setState(1799); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(1798);
				statement();
				}
				}
				setState(1801); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( ((((_la - 19)) & ~0x3f) == 0 && ((1L << (_la - 19)) & ((1L << (BREAK - 19)) | (1L << (CONTINUE - 19)) | (1L << (DO - 19)) | (1L << (FOR - 19)) | (1L << (GOTO - 19)) | (1L << (IF - 19)) | (1L << (RETURN - 19)) | (1L << (SIZEOF - 19)) | (1L << (SWITCH - 19)) | (1L << (WHILE - 19)) | (1L << (TRUE - 19)) | (1L << (FALSE - 19)) | (1L << (BOOL - 19)) | (1L << (Class - 19)) | (1L << (BYCOPY - 19)) | (1L << (BYREF - 19)) | (1L << (ID - 19)) | (1L << (IMP - 19)) | (1L << (IN - 19)) | (1L << (INOUT - 19)) | (1L << (NIL - 19)) | (1L << (NO - 19)) | (1L << (NULL - 19)) | (1L << (ONEWAY - 19)) | (1L << (OUT - 19)) | (1L << (PROTOCOL_ - 19)) | (1L << (SEL - 19)) | (1L << (SELF - 19)) | (1L << (SUPER - 19)) | (1L << (YES - 19)) | (1L << (AUTORELEASEPOOL - 19)) | (1L << (ENCODE - 19)))) != 0) || ((((_la - 86)) & ~0x3f) == 0 && ((1L << (_la - 86)) & ((1L << (PROTOCOL - 86)) | (1L << (SELECTOR - 86)) | (1L << (SYNCHRONIZED - 86)) | (1L << (THROW - 86)) | (1L << (TRY - 86)) | (1L << (ATOMIC - 86)) | (1L << (NONATOMIC - 86)) | (1L << (RETAIN - 86)) | (1L << (AUTORELEASING_QUALIFIER - 86)) | (1L << (BLOCK - 86)) | (1L << (BRIDGE_RETAINED - 86)) | (1L << (BRIDGE_TRANSFER - 86)) | (1L << (COVARIANT - 86)) | (1L << (CONTRAVARIANT - 86)) | (1L << (DEPRECATED - 86)) | (1L << (KINDOF - 86)) | (1L << (UNUSED - 86)) | (1L << (NULL_UNSPECIFIED - 86)) | (1L << (NULLABLE - 86)) | (1L << (NONNULL - 86)) | (1L << (NULL_RESETTABLE - 86)) | (1L << (NS_INLINE - 86)) | (1L << (NS_ENUM - 86)) | (1L << (NS_OPTIONS - 86)) | (1L << (ASSIGN - 86)) | (1L << (COPY - 86)) | (1L << (GETTER - 86)) | (1L << (SETTER - 86)) | (1L << (STRONG - 86)) | (1L << (READONLY - 86)) | (1L << (READWRITE - 86)) | (1L << (WEAK - 86)) | (1L << (UNSAFE_UNRETAINED - 86)) | (1L << (IB_OUTLET - 86)) | (1L << (IB_OUTLET_COLLECTION - 86)) | (1L << (IB_INSPECTABLE - 86)) | (1L << (IB_DESIGNABLE - 86)) | (1L << (IDENTIFIER - 86)) | (1L << (LP - 86)) | (1L << (LBRACE - 86)) | (1L << (LBRACK - 86)) | (1L << (SEMI - 86)))) != 0) || ((((_la - 153)) & ~0x3f) == 0 && ((1L << (_la - 153)) & ((1L << (AT - 153)) | (1L << (BANG - 153)) | (1L << (TILDE - 153)) | (1L << (INC - 153)) | (1L << (DEC - 153)) | (1L << (ADD - 153)) | (1L << (SUB - 153)) | (1L << (MUL - 153)) | (1L << (BITAND - 153)) | (1L << (BITXOR - 153)) | (1L << (CHARACTER_LITERAL - 153)) | (1L << (STRING_START - 153)) | (1L << (HEX_LITERAL - 153)) | (1L << (OCTAL_LITERAL - 153)) | (1L << (BINARY_LITERAL - 153)) | (1L << (DECIMAL_LITERAL - 153)) | (1L << (FLOATING_POINT_LITERAL - 153)))) != 0) );
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SwitchLabelContext extends ParserRuleContext {
		public TerminalNode CASE() { return getToken(LogosXXParser.CASE, 0); }
		public TerminalNode COLON() { return getToken(LogosXXParser.COLON, 0); }
		public RangeExpressionContext rangeExpression() {
			return getRuleContext(RangeExpressionContext.class,0);
		}
		public TerminalNode LP() { return getToken(LogosXXParser.LP, 0); }
		public TerminalNode RP() { return getToken(LogosXXParser.RP, 0); }
		public TerminalNode DEFAULT() { return getToken(LogosXXParser.DEFAULT, 0); }
		public SwitchLabelContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_switchLabel; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LogosXXParserListener ) ((LogosXXParserListener)listener).enterSwitchLabel(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LogosXXParserListener ) ((LogosXXParserListener)listener).exitSwitchLabel(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LogosXXParserVisitor ) return ((LogosXXParserVisitor<? extends T>)visitor).visitSwitchLabel(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SwitchLabelContext switchLabel() throws RecognitionException {
		SwitchLabelContext _localctx = new SwitchLabelContext(_ctx, getState());
		enterRule(_localctx, 302, RULE_switchLabel);
		try {
			setState(1815);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case CASE:
				enterOuterAlt(_localctx, 1);
				{
				setState(1803);
				match(CASE);
				setState(1809);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case TRUE:
				case FALSE:
				case BOOL:
				case Class:
				case BYCOPY:
				case BYREF:
				case ID:
				case IMP:
				case IN:
				case INOUT:
				case NIL:
				case NO:
				case NULL:
				case ONEWAY:
				case OUT:
				case PROTOCOL_:
				case SEL:
				case SELF:
				case SUPER:
				case YES:
				case ATOMIC:
				case NONATOMIC:
				case RETAIN:
				case AUTORELEASING_QUALIFIER:
				case BLOCK:
				case BRIDGE_RETAINED:
				case BRIDGE_TRANSFER:
				case COVARIANT:
				case CONTRAVARIANT:
				case DEPRECATED:
				case KINDOF:
				case UNUSED:
				case NULL_UNSPECIFIED:
				case NULLABLE:
				case NONNULL:
				case NULL_RESETTABLE:
				case NS_INLINE:
				case NS_ENUM:
				case NS_OPTIONS:
				case ASSIGN:
				case COPY:
				case GETTER:
				case SETTER:
				case STRONG:
				case READONLY:
				case READWRITE:
				case WEAK:
				case UNSAFE_UNRETAINED:
				case IB_OUTLET:
				case IB_OUTLET_COLLECTION:
				case IB_INSPECTABLE:
				case IB_DESIGNABLE:
				case IDENTIFIER:
				case ADD:
				case SUB:
				case CHARACTER_LITERAL:
				case HEX_LITERAL:
				case OCTAL_LITERAL:
				case BINARY_LITERAL:
				case DECIMAL_LITERAL:
				case FLOATING_POINT_LITERAL:
					{
					setState(1804);
					rangeExpression();
					}
					break;
				case LP:
					{
					setState(1805);
					match(LP);
					setState(1806);
					rangeExpression();
					setState(1807);
					match(RP);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(1811);
				match(COLON);
				}
				break;
			case DEFAULT:
				enterOuterAlt(_localctx, 2);
				{
				setState(1813);
				match(DEFAULT);
				setState(1814);
				match(COLON);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class IterationStatementContext extends ParserRuleContext {
		public WhileStatementContext whileStatement() {
			return getRuleContext(WhileStatementContext.class,0);
		}
		public DoStatementContext doStatement() {
			return getRuleContext(DoStatementContext.class,0);
		}
		public ForStatementContext forStatement() {
			return getRuleContext(ForStatementContext.class,0);
		}
		public ForInStatementContext forInStatement() {
			return getRuleContext(ForInStatementContext.class,0);
		}
		public IterationStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_iterationStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LogosXXParserListener ) ((LogosXXParserListener)listener).enterIterationStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LogosXXParserListener ) ((LogosXXParserListener)listener).exitIterationStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LogosXXParserVisitor ) return ((LogosXXParserVisitor<? extends T>)visitor).visitIterationStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IterationStatementContext iterationStatement() throws RecognitionException {
		IterationStatementContext _localctx = new IterationStatementContext(_ctx, getState());
		enterRule(_localctx, 304, RULE_iterationStatement);
		try {
			setState(1821);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,232,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1817);
				whileStatement();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1818);
				doStatement();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1819);
				forStatement();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1820);
				forInStatement();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class WhileStatementContext extends ParserRuleContext {
		public TerminalNode WHILE() { return getToken(LogosXXParser.WHILE, 0); }
		public TerminalNode LP() { return getToken(LogosXXParser.LP, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode RP() { return getToken(LogosXXParser.RP, 0); }
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public WhileStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_whileStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LogosXXParserListener ) ((LogosXXParserListener)listener).enterWhileStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LogosXXParserListener ) ((LogosXXParserListener)listener).exitWhileStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LogosXXParserVisitor ) return ((LogosXXParserVisitor<? extends T>)visitor).visitWhileStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final WhileStatementContext whileStatement() throws RecognitionException {
		WhileStatementContext _localctx = new WhileStatementContext(_ctx, getState());
		enterRule(_localctx, 306, RULE_whileStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1823);
			match(WHILE);
			setState(1824);
			match(LP);
			setState(1825);
			expression(0);
			setState(1826);
			match(RP);
			setState(1827);
			statement();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DoStatementContext extends ParserRuleContext {
		public TerminalNode DO() { return getToken(LogosXXParser.DO, 0); }
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public TerminalNode WHILE() { return getToken(LogosXXParser.WHILE, 0); }
		public TerminalNode LP() { return getToken(LogosXXParser.LP, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode RP() { return getToken(LogosXXParser.RP, 0); }
		public TerminalNode SEMI() { return getToken(LogosXXParser.SEMI, 0); }
		public DoStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_doStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LogosXXParserListener ) ((LogosXXParserListener)listener).enterDoStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LogosXXParserListener ) ((LogosXXParserListener)listener).exitDoStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LogosXXParserVisitor ) return ((LogosXXParserVisitor<? extends T>)visitor).visitDoStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DoStatementContext doStatement() throws RecognitionException {
		DoStatementContext _localctx = new DoStatementContext(_ctx, getState());
		enterRule(_localctx, 308, RULE_doStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1829);
			match(DO);
			setState(1830);
			statement();
			setState(1831);
			match(WHILE);
			setState(1832);
			match(LP);
			setState(1833);
			expression(0);
			setState(1834);
			match(RP);
			setState(1835);
			match(SEMI);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ForStatementContext extends ParserRuleContext {
		public TerminalNode FOR() { return getToken(LogosXXParser.FOR, 0); }
		public TerminalNode LP() { return getToken(LogosXXParser.LP, 0); }
		public List<TerminalNode> SEMI() { return getTokens(LogosXXParser.SEMI); }
		public TerminalNode SEMI(int i) {
			return getToken(LogosXXParser.SEMI, i);
		}
		public TerminalNode RP() { return getToken(LogosXXParser.RP, 0); }
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public ForLoopInitializerContext forLoopInitializer() {
			return getRuleContext(ForLoopInitializerContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ExpressionsContext expressions() {
			return getRuleContext(ExpressionsContext.class,0);
		}
		public ForStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_forStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LogosXXParserListener ) ((LogosXXParserListener)listener).enterForStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LogosXXParserListener ) ((LogosXXParserListener)listener).exitForStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LogosXXParserVisitor ) return ((LogosXXParserVisitor<? extends T>)visitor).visitForStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ForStatementContext forStatement() throws RecognitionException {
		ForStatementContext _localctx = new ForStatementContext(_ctx, getState());
		enterRule(_localctx, 310, RULE_forStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1837);
			match(FOR);
			setState(1838);
			match(LP);
			setState(1840);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 18)) & ~0x3f) == 0 && ((1L << (_la - 18)) & ((1L << (AUTO - 18)) | (1L << (CHAR - 18)) | (1L << (CONST - 18)) | (1L << (DOUBLE - 18)) | (1L << (ENUM - 18)) | (1L << (EXTERN - 18)) | (1L << (FLOAT - 18)) | (1L << (INLINE - 18)) | (1L << (INT - 18)) | (1L << (LONG - 18)) | (1L << (REGISTER - 18)) | (1L << (RESTRICT - 18)) | (1L << (SHORT - 18)) | (1L << (SIGNED - 18)) | (1L << (SIZEOF - 18)) | (1L << (STATIC - 18)) | (1L << (STRUCT - 18)) | (1L << (UNION - 18)) | (1L << (UNSIGNED - 18)) | (1L << (VOID - 18)) | (1L << (VOLATILE - 18)) | (1L << (TRUE - 18)) | (1L << (FALSE - 18)) | (1L << (BOOL - 18)) | (1L << (Class - 18)) | (1L << (BYCOPY - 18)) | (1L << (BYREF - 18)) | (1L << (ID - 18)) | (1L << (IMP - 18)) | (1L << (IN - 18)) | (1L << (INOUT - 18)) | (1L << (NIL - 18)) | (1L << (NO - 18)) | (1L << (NULL - 18)) | (1L << (ONEWAY - 18)) | (1L << (OUT - 18)) | (1L << (PROTOCOL_ - 18)) | (1L << (SEL - 18)) | (1L << (SELF - 18)) | (1L << (SUPER - 18)) | (1L << (YES - 18)) | (1L << (ENCODE - 18)))) != 0) || ((((_la - 86)) & ~0x3f) == 0 && ((1L << (_la - 86)) & ((1L << (PROTOCOL - 86)) | (1L << (SELECTOR - 86)) | (1L << (ATOMIC - 86)) | (1L << (NONATOMIC - 86)) | (1L << (RETAIN - 86)) | (1L << (ATTRIBUTE - 86)) | (1L << (AUTORELEASING_QUALIFIER - 86)) | (1L << (BLOCK - 86)) | (1L << (BRIDGE - 86)) | (1L << (BRIDGE_RETAINED - 86)) | (1L << (BRIDGE_TRANSFER - 86)) | (1L << (COVARIANT - 86)) | (1L << (CONTRAVARIANT - 86)) | (1L << (DEPRECATED - 86)) | (1L << (KINDOF - 86)) | (1L << (STRONG_QUALIFIER - 86)) | (1L << (TYPEOF - 86)) | (1L << (UNSAFE_UNRETAINED_QUALIFIER - 86)) | (1L << (UNUSED - 86)) | (1L << (WEAK_QUALIFIER - 86)) | (1L << (NULL_UNSPECIFIED - 86)) | (1L << (NULLABLE - 86)) | (1L << (NONNULL - 86)) | (1L << (NULL_RESETTABLE - 86)) | (1L << (NS_INLINE - 86)) | (1L << (NS_ENUM - 86)) | (1L << (NS_OPTIONS - 86)) | (1L << (ASSIGN - 86)) | (1L << (COPY - 86)) | (1L << (GETTER - 86)) | (1L << (SETTER - 86)) | (1L << (STRONG - 86)) | (1L << (READONLY - 86)) | (1L << (READWRITE - 86)) | (1L << (WEAK - 86)) | (1L << (UNSAFE_UNRETAINED - 86)) | (1L << (IB_OUTLET - 86)) | (1L << (IB_OUTLET_COLLECTION - 86)) | (1L << (IB_INSPECTABLE - 86)) | (1L << (IB_DESIGNABLE - 86)) | (1L << (IDENTIFIER - 86)) | (1L << (LP - 86)) | (1L << (LBRACK - 86)))) != 0) || ((((_la - 153)) & ~0x3f) == 0 && ((1L << (_la - 153)) & ((1L << (AT - 153)) | (1L << (BANG - 153)) | (1L << (TILDE - 153)) | (1L << (INC - 153)) | (1L << (DEC - 153)) | (1L << (ADD - 153)) | (1L << (SUB - 153)) | (1L << (MUL - 153)) | (1L << (BITAND - 153)) | (1L << (BITXOR - 153)) | (1L << (CHARACTER_LITERAL - 153)) | (1L << (STRING_START - 153)) | (1L << (HEX_LITERAL - 153)) | (1L << (OCTAL_LITERAL - 153)) | (1L << (BINARY_LITERAL - 153)) | (1L << (DECIMAL_LITERAL - 153)) | (1L << (FLOATING_POINT_LITERAL - 153)))) != 0)) {
				{
				setState(1839);
				forLoopInitializer();
				}
			}

			setState(1842);
			match(SEMI);
			setState(1844);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 42)) & ~0x3f) == 0 && ((1L << (_la - 42)) & ((1L << (SIZEOF - 42)) | (1L << (TRUE - 42)) | (1L << (FALSE - 42)) | (1L << (BOOL - 42)) | (1L << (Class - 42)) | (1L << (BYCOPY - 42)) | (1L << (BYREF - 42)) | (1L << (ID - 42)) | (1L << (IMP - 42)) | (1L << (IN - 42)) | (1L << (INOUT - 42)) | (1L << (NIL - 42)) | (1L << (NO - 42)) | (1L << (NULL - 42)) | (1L << (ONEWAY - 42)) | (1L << (OUT - 42)) | (1L << (PROTOCOL_ - 42)) | (1L << (SEL - 42)) | (1L << (SELF - 42)) | (1L << (SUPER - 42)) | (1L << (YES - 42)) | (1L << (ENCODE - 42)) | (1L << (PROTOCOL - 42)) | (1L << (SELECTOR - 42)) | (1L << (ATOMIC - 42)) | (1L << (NONATOMIC - 42)) | (1L << (RETAIN - 42)) | (1L << (AUTORELEASING_QUALIFIER - 42)) | (1L << (BLOCK - 42)) | (1L << (BRIDGE_RETAINED - 42)))) != 0) || ((((_la - 106)) & ~0x3f) == 0 && ((1L << (_la - 106)) & ((1L << (BRIDGE_TRANSFER - 106)) | (1L << (COVARIANT - 106)) | (1L << (CONTRAVARIANT - 106)) | (1L << (DEPRECATED - 106)) | (1L << (KINDOF - 106)) | (1L << (UNUSED - 106)) | (1L << (NULL_UNSPECIFIED - 106)) | (1L << (NULLABLE - 106)) | (1L << (NONNULL - 106)) | (1L << (NULL_RESETTABLE - 106)) | (1L << (NS_INLINE - 106)) | (1L << (NS_ENUM - 106)) | (1L << (NS_OPTIONS - 106)) | (1L << (ASSIGN - 106)) | (1L << (COPY - 106)) | (1L << (GETTER - 106)) | (1L << (SETTER - 106)) | (1L << (STRONG - 106)) | (1L << (READONLY - 106)) | (1L << (READWRITE - 106)) | (1L << (WEAK - 106)) | (1L << (UNSAFE_UNRETAINED - 106)) | (1L << (IB_OUTLET - 106)) | (1L << (IB_OUTLET_COLLECTION - 106)) | (1L << (IB_INSPECTABLE - 106)) | (1L << (IB_DESIGNABLE - 106)) | (1L << (IDENTIFIER - 106)) | (1L << (LP - 106)) | (1L << (LBRACK - 106)) | (1L << (AT - 106)) | (1L << (BANG - 106)) | (1L << (TILDE - 106)) | (1L << (INC - 106)) | (1L << (DEC - 106)) | (1L << (ADD - 106)))) != 0) || ((((_la - 170)) & ~0x3f) == 0 && ((1L << (_la - 170)) & ((1L << (SUB - 170)) | (1L << (MUL - 170)) | (1L << (BITAND - 170)) | (1L << (BITXOR - 170)) | (1L << (CHARACTER_LITERAL - 170)) | (1L << (STRING_START - 170)) | (1L << (HEX_LITERAL - 170)) | (1L << (OCTAL_LITERAL - 170)) | (1L << (BINARY_LITERAL - 170)) | (1L << (DECIMAL_LITERAL - 170)) | (1L << (FLOATING_POINT_LITERAL - 170)))) != 0)) {
				{
				setState(1843);
				expression(0);
				}
			}

			setState(1846);
			match(SEMI);
			setState(1848);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 42)) & ~0x3f) == 0 && ((1L << (_la - 42)) & ((1L << (SIZEOF - 42)) | (1L << (TRUE - 42)) | (1L << (FALSE - 42)) | (1L << (BOOL - 42)) | (1L << (Class - 42)) | (1L << (BYCOPY - 42)) | (1L << (BYREF - 42)) | (1L << (ID - 42)) | (1L << (IMP - 42)) | (1L << (IN - 42)) | (1L << (INOUT - 42)) | (1L << (NIL - 42)) | (1L << (NO - 42)) | (1L << (NULL - 42)) | (1L << (ONEWAY - 42)) | (1L << (OUT - 42)) | (1L << (PROTOCOL_ - 42)) | (1L << (SEL - 42)) | (1L << (SELF - 42)) | (1L << (SUPER - 42)) | (1L << (YES - 42)) | (1L << (ENCODE - 42)) | (1L << (PROTOCOL - 42)) | (1L << (SELECTOR - 42)) | (1L << (ATOMIC - 42)) | (1L << (NONATOMIC - 42)) | (1L << (RETAIN - 42)) | (1L << (AUTORELEASING_QUALIFIER - 42)) | (1L << (BLOCK - 42)) | (1L << (BRIDGE_RETAINED - 42)))) != 0) || ((((_la - 106)) & ~0x3f) == 0 && ((1L << (_la - 106)) & ((1L << (BRIDGE_TRANSFER - 106)) | (1L << (COVARIANT - 106)) | (1L << (CONTRAVARIANT - 106)) | (1L << (DEPRECATED - 106)) | (1L << (KINDOF - 106)) | (1L << (UNUSED - 106)) | (1L << (NULL_UNSPECIFIED - 106)) | (1L << (NULLABLE - 106)) | (1L << (NONNULL - 106)) | (1L << (NULL_RESETTABLE - 106)) | (1L << (NS_INLINE - 106)) | (1L << (NS_ENUM - 106)) | (1L << (NS_OPTIONS - 106)) | (1L << (ASSIGN - 106)) | (1L << (COPY - 106)) | (1L << (GETTER - 106)) | (1L << (SETTER - 106)) | (1L << (STRONG - 106)) | (1L << (READONLY - 106)) | (1L << (READWRITE - 106)) | (1L << (WEAK - 106)) | (1L << (UNSAFE_UNRETAINED - 106)) | (1L << (IB_OUTLET - 106)) | (1L << (IB_OUTLET_COLLECTION - 106)) | (1L << (IB_INSPECTABLE - 106)) | (1L << (IB_DESIGNABLE - 106)) | (1L << (IDENTIFIER - 106)) | (1L << (LP - 106)) | (1L << (LBRACK - 106)) | (1L << (AT - 106)) | (1L << (BANG - 106)) | (1L << (TILDE - 106)) | (1L << (INC - 106)) | (1L << (DEC - 106)) | (1L << (ADD - 106)))) != 0) || ((((_la - 170)) & ~0x3f) == 0 && ((1L << (_la - 170)) & ((1L << (SUB - 170)) | (1L << (MUL - 170)) | (1L << (BITAND - 170)) | (1L << (BITXOR - 170)) | (1L << (CHARACTER_LITERAL - 170)) | (1L << (STRING_START - 170)) | (1L << (HEX_LITERAL - 170)) | (1L << (OCTAL_LITERAL - 170)) | (1L << (BINARY_LITERAL - 170)) | (1L << (DECIMAL_LITERAL - 170)) | (1L << (FLOATING_POINT_LITERAL - 170)))) != 0)) {
				{
				setState(1847);
				expressions();
				}
			}

			setState(1850);
			match(RP);
			setState(1851);
			statement();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ForLoopInitializerContext extends ParserRuleContext {
		public DeclarationSpecifiersContext declarationSpecifiers() {
			return getRuleContext(DeclarationSpecifiersContext.class,0);
		}
		public InitDeclaratorListContext initDeclaratorList() {
			return getRuleContext(InitDeclaratorListContext.class,0);
		}
		public ExpressionsContext expressions() {
			return getRuleContext(ExpressionsContext.class,0);
		}
		public ForLoopInitializerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_forLoopInitializer; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LogosXXParserListener ) ((LogosXXParserListener)listener).enterForLoopInitializer(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LogosXXParserListener ) ((LogosXXParserListener)listener).exitForLoopInitializer(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LogosXXParserVisitor ) return ((LogosXXParserVisitor<? extends T>)visitor).visitForLoopInitializer(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ForLoopInitializerContext forLoopInitializer() throws RecognitionException {
		ForLoopInitializerContext _localctx = new ForLoopInitializerContext(_ctx, getState());
		enterRule(_localctx, 312, RULE_forLoopInitializer);
		try {
			setState(1857);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,236,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1853);
				declarationSpecifiers();
				setState(1854);
				initDeclaratorList();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1856);
				expressions();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ForInStatementContext extends ParserRuleContext {
		public TerminalNode FOR() { return getToken(LogosXXParser.FOR, 0); }
		public TerminalNode LP() { return getToken(LogosXXParser.LP, 0); }
		public TypeVariableDeclaratorContext typeVariableDeclarator() {
			return getRuleContext(TypeVariableDeclaratorContext.class,0);
		}
		public TerminalNode IN() { return getToken(LogosXXParser.IN, 0); }
		public TerminalNode RP() { return getToken(LogosXXParser.RP, 0); }
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ForInStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_forInStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LogosXXParserListener ) ((LogosXXParserListener)listener).enterForInStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LogosXXParserListener ) ((LogosXXParserListener)listener).exitForInStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LogosXXParserVisitor ) return ((LogosXXParserVisitor<? extends T>)visitor).visitForInStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ForInStatementContext forInStatement() throws RecognitionException {
		ForInStatementContext _localctx = new ForInStatementContext(_ctx, getState());
		enterRule(_localctx, 314, RULE_forInStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1859);
			match(FOR);
			setState(1860);
			match(LP);
			setState(1861);
			typeVariableDeclarator();
			setState(1862);
			match(IN);
			setState(1864);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 42)) & ~0x3f) == 0 && ((1L << (_la - 42)) & ((1L << (SIZEOF - 42)) | (1L << (TRUE - 42)) | (1L << (FALSE - 42)) | (1L << (BOOL - 42)) | (1L << (Class - 42)) | (1L << (BYCOPY - 42)) | (1L << (BYREF - 42)) | (1L << (ID - 42)) | (1L << (IMP - 42)) | (1L << (IN - 42)) | (1L << (INOUT - 42)) | (1L << (NIL - 42)) | (1L << (NO - 42)) | (1L << (NULL - 42)) | (1L << (ONEWAY - 42)) | (1L << (OUT - 42)) | (1L << (PROTOCOL_ - 42)) | (1L << (SEL - 42)) | (1L << (SELF - 42)) | (1L << (SUPER - 42)) | (1L << (YES - 42)) | (1L << (ENCODE - 42)) | (1L << (PROTOCOL - 42)) | (1L << (SELECTOR - 42)) | (1L << (ATOMIC - 42)) | (1L << (NONATOMIC - 42)) | (1L << (RETAIN - 42)) | (1L << (AUTORELEASING_QUALIFIER - 42)) | (1L << (BLOCK - 42)) | (1L << (BRIDGE_RETAINED - 42)))) != 0) || ((((_la - 106)) & ~0x3f) == 0 && ((1L << (_la - 106)) & ((1L << (BRIDGE_TRANSFER - 106)) | (1L << (COVARIANT - 106)) | (1L << (CONTRAVARIANT - 106)) | (1L << (DEPRECATED - 106)) | (1L << (KINDOF - 106)) | (1L << (UNUSED - 106)) | (1L << (NULL_UNSPECIFIED - 106)) | (1L << (NULLABLE - 106)) | (1L << (NONNULL - 106)) | (1L << (NULL_RESETTABLE - 106)) | (1L << (NS_INLINE - 106)) | (1L << (NS_ENUM - 106)) | (1L << (NS_OPTIONS - 106)) | (1L << (ASSIGN - 106)) | (1L << (COPY - 106)) | (1L << (GETTER - 106)) | (1L << (SETTER - 106)) | (1L << (STRONG - 106)) | (1L << (READONLY - 106)) | (1L << (READWRITE - 106)) | (1L << (WEAK - 106)) | (1L << (UNSAFE_UNRETAINED - 106)) | (1L << (IB_OUTLET - 106)) | (1L << (IB_OUTLET_COLLECTION - 106)) | (1L << (IB_INSPECTABLE - 106)) | (1L << (IB_DESIGNABLE - 106)) | (1L << (IDENTIFIER - 106)) | (1L << (LP - 106)) | (1L << (LBRACK - 106)) | (1L << (AT - 106)) | (1L << (BANG - 106)) | (1L << (TILDE - 106)) | (1L << (INC - 106)) | (1L << (DEC - 106)) | (1L << (ADD - 106)))) != 0) || ((((_la - 170)) & ~0x3f) == 0 && ((1L << (_la - 170)) & ((1L << (SUB - 170)) | (1L << (MUL - 170)) | (1L << (BITAND - 170)) | (1L << (BITXOR - 170)) | (1L << (CHARACTER_LITERAL - 170)) | (1L << (STRING_START - 170)) | (1L << (HEX_LITERAL - 170)) | (1L << (OCTAL_LITERAL - 170)) | (1L << (BINARY_LITERAL - 170)) | (1L << (DECIMAL_LITERAL - 170)) | (1L << (FLOATING_POINT_LITERAL - 170)))) != 0)) {
				{
				setState(1863);
				expression(0);
				}
			}

			setState(1866);
			match(RP);
			setState(1867);
			statement();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class JumpStatementContext extends ParserRuleContext {
		public TerminalNode GOTO() { return getToken(LogosXXParser.GOTO, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode CONTINUE() { return getToken(LogosXXParser.CONTINUE, 0); }
		public TerminalNode BREAK() { return getToken(LogosXXParser.BREAK, 0); }
		public TerminalNode RETURN() { return getToken(LogosXXParser.RETURN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public JumpStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_jumpStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LogosXXParserListener ) ((LogosXXParserListener)listener).enterJumpStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LogosXXParserListener ) ((LogosXXParserListener)listener).exitJumpStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LogosXXParserVisitor ) return ((LogosXXParserVisitor<? extends T>)visitor).visitJumpStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final JumpStatementContext jumpStatement() throws RecognitionException {
		JumpStatementContext _localctx = new JumpStatementContext(_ctx, getState());
		enterRule(_localctx, 316, RULE_jumpStatement);
		try {
			setState(1877);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case GOTO:
				enterOuterAlt(_localctx, 1);
				{
				setState(1869);
				match(GOTO);
				setState(1870);
				identifier();
				}
				break;
			case CONTINUE:
				enterOuterAlt(_localctx, 2);
				{
				setState(1871);
				match(CONTINUE);
				}
				break;
			case BREAK:
				enterOuterAlt(_localctx, 3);
				{
				setState(1872);
				match(BREAK);
				}
				break;
			case RETURN:
				enterOuterAlt(_localctx, 4);
				{
				setState(1873);
				match(RETURN);
				setState(1875);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,238,_ctx) ) {
				case 1:
					{
					setState(1874);
					expression(0);
					}
					break;
				}
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExpressionsContext extends ParserRuleContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(LogosXXParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(LogosXXParser.COMMA, i);
		}
		public ExpressionsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expressions; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LogosXXParserListener ) ((LogosXXParserListener)listener).enterExpressions(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LogosXXParserListener ) ((LogosXXParserListener)listener).exitExpressions(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LogosXXParserVisitor ) return ((LogosXXParserVisitor<? extends T>)visitor).visitExpressions(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressionsContext expressions() throws RecognitionException {
		ExpressionsContext _localctx = new ExpressionsContext(_ctx, getState());
		enterRule(_localctx, 318, RULE_expressions);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1879);
			expression(0);
			setState(1884);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,240,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1880);
					match(COMMA);
					setState(1881);
					expression(0);
					}
					} 
				}
				setState(1886);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,240,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExpressionContext extends ParserRuleContext {
		public ExpressionContext assignmentExpression;
		public Token op;
		public ExpressionContext trueExpression;
		public ExpressionContext falseExpression;
		public CastExpressionContext castExpression() {
			return getRuleContext(CastExpressionContext.class,0);
		}
		public TerminalNode LP() { return getToken(LogosXXParser.LP, 0); }
		public CompoundStatementContext compoundStatement() {
			return getRuleContext(CompoundStatementContext.class,0);
		}
		public TerminalNode RP() { return getToken(LogosXXParser.RP, 0); }
		public UnaryExpressionContext unaryExpression() {
			return getRuleContext(UnaryExpressionContext.class,0);
		}
		public AssignmentOperatorContext assignmentOperator() {
			return getRuleContext(AssignmentOperatorContext.class,0);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode MUL() { return getToken(LogosXXParser.MUL, 0); }
		public TerminalNode DIV() { return getToken(LogosXXParser.DIV, 0); }
		public TerminalNode MOD() { return getToken(LogosXXParser.MOD, 0); }
		public TerminalNode ADD() { return getToken(LogosXXParser.ADD, 0); }
		public TerminalNode SUB() { return getToken(LogosXXParser.SUB, 0); }
		public List<TerminalNode> LT() { return getTokens(LogosXXParser.LT); }
		public TerminalNode LT(int i) {
			return getToken(LogosXXParser.LT, i);
		}
		public List<TerminalNode> GT() { return getTokens(LogosXXParser.GT); }
		public TerminalNode GT(int i) {
			return getToken(LogosXXParser.GT, i);
		}
		public TerminalNode LE() { return getToken(LogosXXParser.LE, 0); }
		public TerminalNode GE() { return getToken(LogosXXParser.GE, 0); }
		public TerminalNode NOTEQUAL() { return getToken(LogosXXParser.NOTEQUAL, 0); }
		public TerminalNode EQUAL() { return getToken(LogosXXParser.EQUAL, 0); }
		public TerminalNode BITAND() { return getToken(LogosXXParser.BITAND, 0); }
		public TerminalNode BITXOR() { return getToken(LogosXXParser.BITXOR, 0); }
		public TerminalNode BITOR() { return getToken(LogosXXParser.BITOR, 0); }
		public TerminalNode AND() { return getToken(LogosXXParser.AND, 0); }
		public TerminalNode OR() { return getToken(LogosXXParser.OR, 0); }
		public TerminalNode QUESTION() { return getToken(LogosXXParser.QUESTION, 0); }
		public TerminalNode COLON() { return getToken(LogosXXParser.COLON, 0); }
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LogosXXParserListener ) ((LogosXXParserListener)listener).enterExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LogosXXParserListener ) ((LogosXXParserListener)listener).exitExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LogosXXParserVisitor ) return ((LogosXXParserVisitor<? extends T>)visitor).visitExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressionContext expression() throws RecognitionException {
		return expression(0);
	}

	private ExpressionContext expression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExpressionContext _localctx = new ExpressionContext(_ctx, _parentState);
		ExpressionContext _prevctx = _localctx;
		int _startState = 320;
		enterRecursionRule(_localctx, 320, RULE_expression, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1897);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,241,_ctx) ) {
			case 1:
				{
				setState(1888);
				castExpression();
				}
				break;
			case 2:
				{
				setState(1889);
				match(LP);
				setState(1890);
				compoundStatement();
				setState(1891);
				match(RP);
				}
				break;
			case 3:
				{
				setState(1893);
				unaryExpression();
				setState(1894);
				assignmentOperator();
				setState(1895);
				((ExpressionContext)_localctx).assignmentExpression = expression(1);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(1943);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,245,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(1941);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,244,_ctx) ) {
					case 1:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1899);
						if (!(precpred(_ctx, 13))) throw new FailedPredicateException(this, "precpred(_ctx, 13)");
						setState(1900);
						((ExpressionContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !(((((_la - 171)) & ~0x3f) == 0 && ((1L << (_la - 171)) & ((1L << (MUL - 171)) | (1L << (DIV - 171)) | (1L << (MOD - 171)))) != 0)) ) {
							((ExpressionContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(1901);
						expression(14);
						}
						break;
					case 2:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1902);
						if (!(precpred(_ctx, 12))) throw new FailedPredicateException(this, "precpred(_ctx, 12)");
						setState(1903);
						((ExpressionContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==ADD || _la==SUB) ) {
							((ExpressionContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(1904);
						expression(13);
						}
						break;
					case 3:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1905);
						if (!(precpred(_ctx, 11))) throw new FailedPredicateException(this, "precpred(_ctx, 11)");
						setState(1910);
						_errHandler.sync(this);
						switch (_input.LA(1)) {
						case LT:
							{
							setState(1906);
							match(LT);
							setState(1907);
							match(LT);
							}
							break;
						case GT:
							{
							setState(1908);
							match(GT);
							setState(1909);
							match(GT);
							}
							break;
						default:
							throw new NoViableAltException(this);
						}
						setState(1912);
						expression(12);
						}
						break;
					case 4:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1913);
						if (!(precpred(_ctx, 10))) throw new FailedPredicateException(this, "precpred(_ctx, 10)");
						setState(1914);
						((ExpressionContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !(((((_la - 155)) & ~0x3f) == 0 && ((1L << (_la - 155)) & ((1L << (GT - 155)) | (1L << (LT - 155)) | (1L << (LE - 155)) | (1L << (GE - 155)))) != 0)) ) {
							((ExpressionContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(1915);
						expression(11);
						}
						break;
					case 5:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1916);
						if (!(precpred(_ctx, 9))) throw new FailedPredicateException(this, "precpred(_ctx, 9)");
						setState(1917);
						((ExpressionContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==EQUAL || _la==NOTEQUAL) ) {
							((ExpressionContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(1918);
						expression(10);
						}
						break;
					case 6:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1919);
						if (!(precpred(_ctx, 8))) throw new FailedPredicateException(this, "precpred(_ctx, 8)");
						setState(1920);
						((ExpressionContext)_localctx).op = match(BITAND);
						setState(1921);
						expression(9);
						}
						break;
					case 7:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1922);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(1923);
						((ExpressionContext)_localctx).op = match(BITXOR);
						setState(1924);
						expression(8);
						}
						break;
					case 8:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1925);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(1926);
						((ExpressionContext)_localctx).op = match(BITOR);
						setState(1927);
						expression(7);
						}
						break;
					case 9:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1928);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(1929);
						((ExpressionContext)_localctx).op = match(AND);
						setState(1930);
						expression(6);
						}
						break;
					case 10:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1931);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(1932);
						((ExpressionContext)_localctx).op = match(OR);
						setState(1933);
						expression(5);
						}
						break;
					case 11:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1934);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(1935);
						match(QUESTION);
						setState(1937);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if (((((_la - 42)) & ~0x3f) == 0 && ((1L << (_la - 42)) & ((1L << (SIZEOF - 42)) | (1L << (TRUE - 42)) | (1L << (FALSE - 42)) | (1L << (BOOL - 42)) | (1L << (Class - 42)) | (1L << (BYCOPY - 42)) | (1L << (BYREF - 42)) | (1L << (ID - 42)) | (1L << (IMP - 42)) | (1L << (IN - 42)) | (1L << (INOUT - 42)) | (1L << (NIL - 42)) | (1L << (NO - 42)) | (1L << (NULL - 42)) | (1L << (ONEWAY - 42)) | (1L << (OUT - 42)) | (1L << (PROTOCOL_ - 42)) | (1L << (SEL - 42)) | (1L << (SELF - 42)) | (1L << (SUPER - 42)) | (1L << (YES - 42)) | (1L << (ENCODE - 42)) | (1L << (PROTOCOL - 42)) | (1L << (SELECTOR - 42)) | (1L << (ATOMIC - 42)) | (1L << (NONATOMIC - 42)) | (1L << (RETAIN - 42)) | (1L << (AUTORELEASING_QUALIFIER - 42)) | (1L << (BLOCK - 42)) | (1L << (BRIDGE_RETAINED - 42)))) != 0) || ((((_la - 106)) & ~0x3f) == 0 && ((1L << (_la - 106)) & ((1L << (BRIDGE_TRANSFER - 106)) | (1L << (COVARIANT - 106)) | (1L << (CONTRAVARIANT - 106)) | (1L << (DEPRECATED - 106)) | (1L << (KINDOF - 106)) | (1L << (UNUSED - 106)) | (1L << (NULL_UNSPECIFIED - 106)) | (1L << (NULLABLE - 106)) | (1L << (NONNULL - 106)) | (1L << (NULL_RESETTABLE - 106)) | (1L << (NS_INLINE - 106)) | (1L << (NS_ENUM - 106)) | (1L << (NS_OPTIONS - 106)) | (1L << (ASSIGN - 106)) | (1L << (COPY - 106)) | (1L << (GETTER - 106)) | (1L << (SETTER - 106)) | (1L << (STRONG - 106)) | (1L << (READONLY - 106)) | (1L << (READWRITE - 106)) | (1L << (WEAK - 106)) | (1L << (UNSAFE_UNRETAINED - 106)) | (1L << (IB_OUTLET - 106)) | (1L << (IB_OUTLET_COLLECTION - 106)) | (1L << (IB_INSPECTABLE - 106)) | (1L << (IB_DESIGNABLE - 106)) | (1L << (IDENTIFIER - 106)) | (1L << (LP - 106)) | (1L << (LBRACK - 106)) | (1L << (AT - 106)) | (1L << (BANG - 106)) | (1L << (TILDE - 106)) | (1L << (INC - 106)) | (1L << (DEC - 106)) | (1L << (ADD - 106)))) != 0) || ((((_la - 170)) & ~0x3f) == 0 && ((1L << (_la - 170)) & ((1L << (SUB - 170)) | (1L << (MUL - 170)) | (1L << (BITAND - 170)) | (1L << (BITXOR - 170)) | (1L << (CHARACTER_LITERAL - 170)) | (1L << (STRING_START - 170)) | (1L << (HEX_LITERAL - 170)) | (1L << (OCTAL_LITERAL - 170)) | (1L << (BINARY_LITERAL - 170)) | (1L << (DECIMAL_LITERAL - 170)) | (1L << (FLOATING_POINT_LITERAL - 170)))) != 0)) {
							{
							setState(1936);
							((ExpressionContext)_localctx).trueExpression = expression(0);
							}
						}

						setState(1939);
						match(COLON);
						setState(1940);
						((ExpressionContext)_localctx).falseExpression = expression(4);
						}
						break;
					}
					} 
				}
				setState(1945);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,245,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class AssignmentOperatorContext extends ParserRuleContext {
		public TerminalNode ASSIGNMENT() { return getToken(LogosXXParser.ASSIGNMENT, 0); }
		public TerminalNode MUL_ASSIGN() { return getToken(LogosXXParser.MUL_ASSIGN, 0); }
		public TerminalNode DIV_ASSIGN() { return getToken(LogosXXParser.DIV_ASSIGN, 0); }
		public TerminalNode MOD_ASSIGN() { return getToken(LogosXXParser.MOD_ASSIGN, 0); }
		public TerminalNode ADD_ASSIGN() { return getToken(LogosXXParser.ADD_ASSIGN, 0); }
		public TerminalNode SUB_ASSIGN() { return getToken(LogosXXParser.SUB_ASSIGN, 0); }
		public TerminalNode LSHIFT_ASSIGN() { return getToken(LogosXXParser.LSHIFT_ASSIGN, 0); }
		public TerminalNode RSHIFT_ASSIGN() { return getToken(LogosXXParser.RSHIFT_ASSIGN, 0); }
		public TerminalNode AND_ASSIGN() { return getToken(LogosXXParser.AND_ASSIGN, 0); }
		public TerminalNode XOR_ASSIGN() { return getToken(LogosXXParser.XOR_ASSIGN, 0); }
		public TerminalNode OR_ASSIGN() { return getToken(LogosXXParser.OR_ASSIGN, 0); }
		public AssignmentOperatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignmentOperator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LogosXXParserListener ) ((LogosXXParserListener)listener).enterAssignmentOperator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LogosXXParserListener ) ((LogosXXParserListener)listener).exitAssignmentOperator(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LogosXXParserVisitor ) return ((LogosXXParserVisitor<? extends T>)visitor).visitAssignmentOperator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AssignmentOperatorContext assignmentOperator() throws RecognitionException {
		AssignmentOperatorContext _localctx = new AssignmentOperatorContext(_ctx, getState());
		enterRule(_localctx, 322, RULE_assignmentOperator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1946);
			_la = _input.LA(1);
			if ( !(((((_la - 154)) & ~0x3f) == 0 && ((1L << (_la - 154)) & ((1L << (ASSIGNMENT - 154)) | (1L << (ADD_ASSIGN - 154)) | (1L << (SUB_ASSIGN - 154)) | (1L << (MUL_ASSIGN - 154)) | (1L << (DIV_ASSIGN - 154)) | (1L << (AND_ASSIGN - 154)) | (1L << (OR_ASSIGN - 154)) | (1L << (XOR_ASSIGN - 154)) | (1L << (MOD_ASSIGN - 154)) | (1L << (LSHIFT_ASSIGN - 154)) | (1L << (RSHIFT_ASSIGN - 154)))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CastExpressionContext extends ParserRuleContext {
		public UnaryExpressionContext unaryExpression() {
			return getRuleContext(UnaryExpressionContext.class,0);
		}
		public TerminalNode LP() { return getToken(LogosXXParser.LP, 0); }
		public TypeNameContext typeName() {
			return getRuleContext(TypeNameContext.class,0);
		}
		public TerminalNode RP() { return getToken(LogosXXParser.RP, 0); }
		public CastExpressionContext castExpression() {
			return getRuleContext(CastExpressionContext.class,0);
		}
		public InitializerContext initializer() {
			return getRuleContext(InitializerContext.class,0);
		}
		public CastExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_castExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LogosXXParserListener ) ((LogosXXParserListener)listener).enterCastExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LogosXXParserListener ) ((LogosXXParserListener)listener).exitCastExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LogosXXParserVisitor ) return ((LogosXXParserVisitor<? extends T>)visitor).visitCastExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CastExpressionContext castExpression() throws RecognitionException {
		CastExpressionContext _localctx = new CastExpressionContext(_ctx, getState());
		enterRule(_localctx, 324, RULE_castExpression);
		try {
			setState(1957);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,247,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1948);
				unaryExpression();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				{
				setState(1949);
				match(LP);
				setState(1950);
				typeName();
				setState(1951);
				match(RP);
				}
				setState(1955);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,246,_ctx) ) {
				case 1:
					{
					setState(1953);
					castExpression();
					}
					break;
				case 2:
					{
					setState(1954);
					initializer();
					}
					break;
				}
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class InitializerContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ArrayInitializerContext arrayInitializer() {
			return getRuleContext(ArrayInitializerContext.class,0);
		}
		public StructInitializerContext structInitializer() {
			return getRuleContext(StructInitializerContext.class,0);
		}
		public InitializerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_initializer; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LogosXXParserListener ) ((LogosXXParserListener)listener).enterInitializer(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LogosXXParserListener ) ((LogosXXParserListener)listener).exitInitializer(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LogosXXParserVisitor ) return ((LogosXXParserVisitor<? extends T>)visitor).visitInitializer(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InitializerContext initializer() throws RecognitionException {
		InitializerContext _localctx = new InitializerContext(_ctx, getState());
		enterRule(_localctx, 326, RULE_initializer);
		try {
			setState(1962);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,248,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1959);
				expression(0);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1960);
				arrayInitializer();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1961);
				structInitializer();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ConstantExpressionContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public ConstantContext constant() {
			return getRuleContext(ConstantContext.class,0);
		}
		public ConstantExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constantExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LogosXXParserListener ) ((LogosXXParserListener)listener).enterConstantExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LogosXXParserListener ) ((LogosXXParserListener)listener).exitConstantExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LogosXXParserVisitor ) return ((LogosXXParserVisitor<? extends T>)visitor).visitConstantExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConstantExpressionContext constantExpression() throws RecognitionException {
		ConstantExpressionContext _localctx = new ConstantExpressionContext(_ctx, getState());
		enterRule(_localctx, 328, RULE_constantExpression);
		try {
			setState(1966);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case BOOL:
			case Class:
			case BYCOPY:
			case BYREF:
			case ID:
			case IMP:
			case IN:
			case INOUT:
			case ONEWAY:
			case OUT:
			case PROTOCOL_:
			case SEL:
			case SELF:
			case SUPER:
			case ATOMIC:
			case NONATOMIC:
			case RETAIN:
			case AUTORELEASING_QUALIFIER:
			case BLOCK:
			case BRIDGE_RETAINED:
			case BRIDGE_TRANSFER:
			case COVARIANT:
			case CONTRAVARIANT:
			case DEPRECATED:
			case KINDOF:
			case UNUSED:
			case NULL_UNSPECIFIED:
			case NULLABLE:
			case NONNULL:
			case NULL_RESETTABLE:
			case NS_INLINE:
			case NS_ENUM:
			case NS_OPTIONS:
			case ASSIGN:
			case COPY:
			case GETTER:
			case SETTER:
			case STRONG:
			case READONLY:
			case READWRITE:
			case WEAK:
			case UNSAFE_UNRETAINED:
			case IB_OUTLET:
			case IB_OUTLET_COLLECTION:
			case IB_INSPECTABLE:
			case IB_DESIGNABLE:
			case IDENTIFIER:
				enterOuterAlt(_localctx, 1);
				{
				setState(1964);
				identifier();
				}
				break;
			case TRUE:
			case FALSE:
			case NIL:
			case NO:
			case NULL:
			case YES:
			case ADD:
			case SUB:
			case CHARACTER_LITERAL:
			case HEX_LITERAL:
			case OCTAL_LITERAL:
			case BINARY_LITERAL:
			case DECIMAL_LITERAL:
			case FLOATING_POINT_LITERAL:
				enterOuterAlt(_localctx, 2);
				{
				setState(1965);
				constant();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class UnaryExpressionContext extends ParserRuleContext {
		public Token op;
		public PostfixExpressionContext postfixExpression() {
			return getRuleContext(PostfixExpressionContext.class,0);
		}
		public TerminalNode SIZEOF() { return getToken(LogosXXParser.SIZEOF, 0); }
		public UnaryExpressionContext unaryExpression() {
			return getRuleContext(UnaryExpressionContext.class,0);
		}
		public TerminalNode LP() { return getToken(LogosXXParser.LP, 0); }
		public TypeSpecifierContext typeSpecifier() {
			return getRuleContext(TypeSpecifierContext.class,0);
		}
		public TerminalNode RP() { return getToken(LogosXXParser.RP, 0); }
		public TerminalNode INC() { return getToken(LogosXXParser.INC, 0); }
		public TerminalNode DEC() { return getToken(LogosXXParser.DEC, 0); }
		public UnaryOperatorContext unaryOperator() {
			return getRuleContext(UnaryOperatorContext.class,0);
		}
		public CastExpressionContext castExpression() {
			return getRuleContext(CastExpressionContext.class,0);
		}
		public UnaryExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unaryExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LogosXXParserListener ) ((LogosXXParserListener)listener).enterUnaryExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LogosXXParserListener ) ((LogosXXParserListener)listener).exitUnaryExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LogosXXParserVisitor ) return ((LogosXXParserVisitor<? extends T>)visitor).visitUnaryExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final UnaryExpressionContext unaryExpression() throws RecognitionException {
		UnaryExpressionContext _localctx = new UnaryExpressionContext(_ctx, getState());
		enterRule(_localctx, 330, RULE_unaryExpression);
		int _la;
		try {
			setState(1982);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,251,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1968);
				postfixExpression(0);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1969);
				match(SIZEOF);
				setState(1975);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,250,_ctx) ) {
				case 1:
					{
					setState(1970);
					unaryExpression();
					}
					break;
				case 2:
					{
					setState(1971);
					match(LP);
					setState(1972);
					typeSpecifier();
					setState(1973);
					match(RP);
					}
					break;
				}
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1977);
				((UnaryExpressionContext)_localctx).op = _input.LT(1);
				_la = _input.LA(1);
				if ( !(_la==INC || _la==DEC) ) {
					((UnaryExpressionContext)_localctx).op = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(1978);
				unaryExpression();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1979);
				unaryOperator();
				setState(1980);
				castExpression();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class UnaryOperatorContext extends ParserRuleContext {
		public TerminalNode BITAND() { return getToken(LogosXXParser.BITAND, 0); }
		public TerminalNode MUL() { return getToken(LogosXXParser.MUL, 0); }
		public TerminalNode ADD() { return getToken(LogosXXParser.ADD, 0); }
		public TerminalNode SUB() { return getToken(LogosXXParser.SUB, 0); }
		public TerminalNode TILDE() { return getToken(LogosXXParser.TILDE, 0); }
		public TerminalNode BANG() { return getToken(LogosXXParser.BANG, 0); }
		public UnaryOperatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unaryOperator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LogosXXParserListener ) ((LogosXXParserListener)listener).enterUnaryOperator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LogosXXParserListener ) ((LogosXXParserListener)listener).exitUnaryOperator(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LogosXXParserVisitor ) return ((LogosXXParserVisitor<? extends T>)visitor).visitUnaryOperator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final UnaryOperatorContext unaryOperator() throws RecognitionException {
		UnaryOperatorContext _localctx = new UnaryOperatorContext(_ctx, getState());
		enterRule(_localctx, 332, RULE_unaryOperator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1984);
			_la = _input.LA(1);
			if ( !(((((_la - 157)) & ~0x3f) == 0 && ((1L << (_la - 157)) & ((1L << (BANG - 157)) | (1L << (TILDE - 157)) | (1L << (ADD - 157)) | (1L << (SUB - 157)) | (1L << (MUL - 157)) | (1L << (BITAND - 157)))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PostfixExpressionContext extends ParserRuleContext {
		public PrimaryExpressionContext primaryExpression() {
			return getRuleContext(PrimaryExpressionContext.class,0);
		}
		public List<PostfixContext> postfix() {
			return getRuleContexts(PostfixContext.class);
		}
		public PostfixContext postfix(int i) {
			return getRuleContext(PostfixContext.class,i);
		}
		public PostfixExpressionContext postfixExpression() {
			return getRuleContext(PostfixExpressionContext.class,0);
		}
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode DOT() { return getToken(LogosXXParser.DOT, 0); }
		public TerminalNode STRUCTACCESS() { return getToken(LogosXXParser.STRUCTACCESS, 0); }
		public PostfixExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_postfixExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LogosXXParserListener ) ((LogosXXParserListener)listener).enterPostfixExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LogosXXParserListener ) ((LogosXXParserListener)listener).exitPostfixExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LogosXXParserVisitor ) return ((LogosXXParserVisitor<? extends T>)visitor).visitPostfixExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PostfixExpressionContext postfixExpression() throws RecognitionException {
		return postfixExpression(0);
	}

	private PostfixExpressionContext postfixExpression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		PostfixExpressionContext _localctx = new PostfixExpressionContext(_ctx, _parentState);
		PostfixExpressionContext _prevctx = _localctx;
		int _startState = 334;
		enterRecursionRule(_localctx, 334, RULE_postfixExpression, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(1987);
			primaryExpression();
			setState(1991);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,252,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1988);
					postfix();
					}
					} 
				}
				setState(1993);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,252,_ctx);
			}
			}
			_ctx.stop = _input.LT(-1);
			setState(2005);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,254,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new PostfixExpressionContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_postfixExpression);
					setState(1994);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(1995);
					_la = _input.LA(1);
					if ( !(_la==DOT || _la==STRUCTACCESS) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(1996);
					identifier();
					setState(2000);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,253,_ctx);
					while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
						if ( _alt==1 ) {
							{
							{
							setState(1997);
							postfix();
							}
							} 
						}
						setState(2002);
						_errHandler.sync(this);
						_alt = getInterpreter().adaptivePredict(_input,253,_ctx);
					}
					}
					} 
				}
				setState(2007);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,254,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class PostfixContext extends ParserRuleContext {
		public Token RP;
		public List<Token> macroArguments = new ArrayList<Token>();
		public Token _tset3106;
		public Token op;
		public TerminalNode LBRACK() { return getToken(LogosXXParser.LBRACK, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode RBRACK() { return getToken(LogosXXParser.RBRACK, 0); }
		public TerminalNode LP() { return getToken(LogosXXParser.LP, 0); }
		public List<TerminalNode> RP() { return getTokens(LogosXXParser.RP); }
		public TerminalNode RP(int i) {
			return getToken(LogosXXParser.RP, i);
		}
		public ArgumentExpressionListContext argumentExpressionList() {
			return getRuleContext(ArgumentExpressionListContext.class,0);
		}
		public List<TerminalNode> COMMA() { return getTokens(LogosXXParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(LogosXXParser.COMMA, i);
		}
		public TerminalNode INC() { return getToken(LogosXXParser.INC, 0); }
		public TerminalNode DEC() { return getToken(LogosXXParser.DEC, 0); }
		public PostfixContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_postfix; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LogosXXParserListener ) ((LogosXXParserListener)listener).enterPostfix(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LogosXXParserListener ) ((LogosXXParserListener)listener).exitPostfix(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LogosXXParserVisitor ) return ((LogosXXParserVisitor<? extends T>)visitor).visitPostfix(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PostfixContext postfix() throws RecognitionException {
		PostfixContext _localctx = new PostfixContext(_ctx, getState());
		enterRule(_localctx, 336, RULE_postfix);
		int _la;
		try {
			setState(2026);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,258,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2008);
				match(LBRACK);
				setState(2009);
				expression(0);
				setState(2010);
				match(RBRACK);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2012);
				match(LP);
				setState(2014);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (((((_la - 21)) & ~0x3f) == 0 && ((1L << (_la - 21)) & ((1L << (CHAR - 21)) | (1L << (DOUBLE - 21)) | (1L << (ENUM - 21)) | (1L << (FLOAT - 21)) | (1L << (INT - 21)) | (1L << (LONG - 21)) | (1L << (SHORT - 21)) | (1L << (SIGNED - 21)) | (1L << (SIZEOF - 21)) | (1L << (STRUCT - 21)) | (1L << (UNION - 21)) | (1L << (UNSIGNED - 21)) | (1L << (VOID - 21)) | (1L << (TRUE - 21)) | (1L << (FALSE - 21)) | (1L << (BOOL - 21)) | (1L << (Class - 21)) | (1L << (BYCOPY - 21)) | (1L << (BYREF - 21)) | (1L << (ID - 21)) | (1L << (IMP - 21)) | (1L << (IN - 21)) | (1L << (INOUT - 21)) | (1L << (NIL - 21)) | (1L << (NO - 21)) | (1L << (NULL - 21)) | (1L << (ONEWAY - 21)) | (1L << (OUT - 21)) | (1L << (PROTOCOL_ - 21)) | (1L << (SEL - 21)) | (1L << (SELF - 21)) | (1L << (SUPER - 21)) | (1L << (YES - 21)) | (1L << (ENCODE - 21)))) != 0) || ((((_la - 86)) & ~0x3f) == 0 && ((1L << (_la - 86)) & ((1L << (PROTOCOL - 86)) | (1L << (SELECTOR - 86)) | (1L << (ATOMIC - 86)) | (1L << (NONATOMIC - 86)) | (1L << (RETAIN - 86)) | (1L << (AUTORELEASING_QUALIFIER - 86)) | (1L << (BLOCK - 86)) | (1L << (BRIDGE_RETAINED - 86)) | (1L << (BRIDGE_TRANSFER - 86)) | (1L << (COVARIANT - 86)) | (1L << (CONTRAVARIANT - 86)) | (1L << (DEPRECATED - 86)) | (1L << (KINDOF - 86)) | (1L << (TYPEOF - 86)) | (1L << (UNUSED - 86)) | (1L << (NULL_UNSPECIFIED - 86)) | (1L << (NULLABLE - 86)) | (1L << (NONNULL - 86)) | (1L << (NULL_RESETTABLE - 86)) | (1L << (NS_INLINE - 86)) | (1L << (NS_ENUM - 86)) | (1L << (NS_OPTIONS - 86)) | (1L << (ASSIGN - 86)) | (1L << (COPY - 86)) | (1L << (GETTER - 86)) | (1L << (SETTER - 86)) | (1L << (STRONG - 86)) | (1L << (READONLY - 86)) | (1L << (READWRITE - 86)) | (1L << (WEAK - 86)) | (1L << (UNSAFE_UNRETAINED - 86)) | (1L << (IB_OUTLET - 86)) | (1L << (IB_OUTLET_COLLECTION - 86)) | (1L << (IB_INSPECTABLE - 86)) | (1L << (IB_DESIGNABLE - 86)) | (1L << (IDENTIFIER - 86)) | (1L << (LP - 86)) | (1L << (LBRACK - 86)))) != 0) || ((((_la - 153)) & ~0x3f) == 0 && ((1L << (_la - 153)) & ((1L << (AT - 153)) | (1L << (BANG - 153)) | (1L << (TILDE - 153)) | (1L << (INC - 153)) | (1L << (DEC - 153)) | (1L << (ADD - 153)) | (1L << (SUB - 153)) | (1L << (MUL - 153)) | (1L << (BITAND - 153)) | (1L << (BITXOR - 153)) | (1L << (CHARACTER_LITERAL - 153)) | (1L << (STRING_START - 153)) | (1L << (HEX_LITERAL - 153)) | (1L << (OCTAL_LITERAL - 153)) | (1L << (BINARY_LITERAL - 153)) | (1L << (DECIMAL_LITERAL - 153)) | (1L << (FLOATING_POINT_LITERAL - 153)))) != 0)) {
					{
					setState(2013);
					argumentExpressionList();
					}
				}

				setState(2016);
				match(RP);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(2017);
				match(LP);
				setState(2020); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					setState(2020);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,256,_ctx) ) {
					case 1:
						{
						setState(2018);
						match(COMMA);
						}
						break;
					case 2:
						{
						setState(2019);
						((PostfixContext)_localctx)._tset3106 = _input.LT(1);
						_la = _input.LA(1);
						if ( _la <= 0 || (_la==RP) ) {
							((PostfixContext)_localctx)._tset3106 = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						((PostfixContext)_localctx).macroArguments.add(((PostfixContext)_localctx)._tset3106);
						}
						break;
					}
					}
					setState(2022); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << LOGOS_CONFIG) | (1L << LOGOS_HOOKF) | (1L << LOGOS_HOOKSWIFTF) | (1L << LOGOS_CTOR) | (1L << LOGOS_DTOR) | (1L << LOGOS_GROUP) | (1L << LOGOS_HOOK) | (1L << LOGOS_HOOKSWIFT) | (1L << LOGOS_NEW) | (1L << LOGOS_SUBCLASS) | (1L << LOGOS_PROPERTY) | (1L << LOGOS_END) | (1L << LOGOS_INIT) | (1L << LOGOS_CLASS) | (1L << LOGOS_CALLSWIFT) | (1L << LOGOS_ORIG) | (1L << LOGOS_LOG) | (1L << AUTO) | (1L << BREAK) | (1L << CASE) | (1L << CHAR) | (1L << CONST) | (1L << CONTINUE) | (1L << DEFAULT) | (1L << DO) | (1L << DOUBLE) | (1L << ELSE) | (1L << ENUM) | (1L << EXTERN) | (1L << FLOAT) | (1L << FOR) | (1L << GOTO) | (1L << IF) | (1L << INLINE) | (1L << INT) | (1L << LONG) | (1L << REGISTER) | (1L << RESTRICT) | (1L << RETURN) | (1L << SHORT) | (1L << SIGNED) | (1L << SIZEOF) | (1L << STATIC) | (1L << STRUCT) | (1L << SWITCH) | (1L << TYPEDEF) | (1L << UNION) | (1L << UNSIGNED) | (1L << VOID) | (1L << VOLATILE) | (1L << WHILE) | (1L << BOOL_) | (1L << COMPLEX) | (1L << IMAGINERY) | (1L << TRUE) | (1L << FALSE) | (1L << BOOL) | (1L << Class) | (1L << BYCOPY) | (1L << BYREF) | (1L << ID) | (1L << IMP) | (1L << IN))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (INOUT - 64)) | (1L << (NIL - 64)) | (1L << (NO - 64)) | (1L << (NULL - 64)) | (1L << (ONEWAY - 64)) | (1L << (OUT - 64)) | (1L << (PROTOCOL_ - 64)) | (1L << (SEL - 64)) | (1L << (SELF - 64)) | (1L << (SUPER - 64)) | (1L << (YES - 64)) | (1L << (AUTORELEASEPOOL - 64)) | (1L << (CATCH - 64)) | (1L << (CLASS - 64)) | (1L << (DYNAMIC - 64)) | (1L << (ENCODE - 64)) | (1L << (END - 64)) | (1L << (FINALLY - 64)) | (1L << (IMPLEMENTATION - 64)) | (1L << (INTERFACE - 64)) | (1L << (IMPORT - 64)) | (1L << (PACKAGE - 64)) | (1L << (PROTOCOL - 64)) | (1L << (OPTIONAL - 64)) | (1L << (PRIVATE - 64)) | (1L << (PROPERTY - 64)) | (1L << (PROTECTED - 64)) | (1L << (PUBLIC - 64)) | (1L << (REQUIRED - 64)) | (1L << (SELECTOR - 64)) | (1L << (SYNCHRONIZED - 64)) | (1L << (SYNTHESIZE - 64)) | (1L << (THROW - 64)) | (1L << (TRY - 64)) | (1L << (ATOMIC - 64)) | (1L << (NONATOMIC - 64)) | (1L << (RETAIN - 64)) | (1L << (ATTRIBUTE - 64)) | (1L << (AUTORELEASING_QUALIFIER - 64)) | (1L << (BLOCK - 64)) | (1L << (BRIDGE - 64)) | (1L << (BRIDGE_RETAINED - 64)) | (1L << (BRIDGE_TRANSFER - 64)) | (1L << (COVARIANT - 64)) | (1L << (CONTRAVARIANT - 64)) | (1L << (DEPRECATED - 64)) | (1L << (KINDOF - 64)) | (1L << (STRONG_QUALIFIER - 64)) | (1L << (TYPEOF - 64)) | (1L << (UNSAFE_UNRETAINED_QUALIFIER - 64)) | (1L << (UNUSED - 64)) | (1L << (WEAK_QUALIFIER - 64)) | (1L << (NULL_UNSPECIFIED - 64)) | (1L << (NULLABLE - 64)) | (1L << (NONNULL - 64)) | (1L << (NULL_RESETTABLE - 64)) | (1L << (NS_INLINE - 64)) | (1L << (NS_ENUM - 64)) | (1L << (NS_OPTIONS - 64)) | (1L << (ASSIGN - 64)) | (1L << (COPY - 64)) | (1L << (GETTER - 64)) | (1L << (SETTER - 64)) | (1L << (STRONG - 64)))) != 0) || ((((_la - 128)) & ~0x3f) == 0 && ((1L << (_la - 128)) & ((1L << (READONLY - 128)) | (1L << (READWRITE - 128)) | (1L << (WEAK - 128)) | (1L << (UNSAFE_UNRETAINED - 128)) | (1L << (IB_OUTLET - 128)) | (1L << (IB_OUTLET_COLLECTION - 128)) | (1L << (IB_INSPECTABLE - 128)) | (1L << (IB_DESIGNABLE - 128)) | (1L << (NS_ASSUME_NONNULL_BEGIN - 128)) | (1L << (NS_ASSUME_NONNULL_END - 128)) | (1L << (EXTERN_SUFFIX - 128)) | (1L << (IOS_SUFFIX - 128)) | (1L << (MAC_SUFFIX - 128)) | (1L << (TVOS_PROHIBITED - 128)) | (1L << (IDENTIFIER - 128)) | (1L << (LP - 128)) | (1L << (LBRACE - 128)) | (1L << (RBRACE - 128)) | (1L << (LBRACK - 128)) | (1L << (RBRACK - 128)) | (1L << (SEMI - 128)) | (1L << (COMMA - 128)) | (1L << (DOT - 128)) | (1L << (STRUCTACCESS - 128)) | (1L << (AT - 128)) | (1L << (ASSIGNMENT - 128)) | (1L << (GT - 128)) | (1L << (LT - 128)) | (1L << (BANG - 128)) | (1L << (TILDE - 128)) | (1L << (QUESTION - 128)) | (1L << (COLON - 128)) | (1L << (EQUAL - 128)) | (1L << (LE - 128)) | (1L << (GE - 128)) | (1L << (NOTEQUAL - 128)) | (1L << (AND - 128)) | (1L << (OR - 128)) | (1L << (INC - 128)) | (1L << (DEC - 128)) | (1L << (ADD - 128)) | (1L << (SUB - 128)) | (1L << (MUL - 128)) | (1L << (DIV - 128)) | (1L << (BITAND - 128)) | (1L << (BITOR - 128)) | (1L << (BITXOR - 128)) | (1L << (MOD - 128)) | (1L << (ADD_ASSIGN - 128)) | (1L << (SUB_ASSIGN - 128)) | (1L << (MUL_ASSIGN - 128)) | (1L << (DIV_ASSIGN - 128)) | (1L << (AND_ASSIGN - 128)) | (1L << (OR_ASSIGN - 128)) | (1L << (XOR_ASSIGN - 128)) | (1L << (MOD_ASSIGN - 128)) | (1L << (LSHIFT_ASSIGN - 128)) | (1L << (RSHIFT_ASSIGN - 128)) | (1L << (ELIPSIS - 128)) | (1L << (CHARACTER_LITERAL - 128)) | (1L << (STRING_START - 128)) | (1L << (HEX_LITERAL - 128)) | (1L << (OCTAL_LITERAL - 128)))) != 0) || ((((_la - 192)) & ~0x3f) == 0 && ((1L << (_la - 192)) & ((1L << (BINARY_LITERAL - 192)) | (1L << (DECIMAL_LITERAL - 192)) | (1L << (FLOATING_POINT_LITERAL - 192)) | (1L << (WS - 192)) | (1L << (MULTI_COMMENT - 192)) | (1L << (SINGLE_COMMENT - 192)) | (1L << (BACKSLASH - 192)) | (1L << (SHARP - 192)) | (1L << (STRING_NEWLINE - 192)) | (1L << (STRING_END - 192)) | (1L << (STRING_VALUE - 192)) | (1L << (DIRECTIVE_IMPORT - 192)) | (1L << (DIRECTIVE_INCLUDE - 192)) | (1L << (DIRECTIVE_PRAGMA - 192)) | (1L << (DIRECTIVE_DEFINE - 192)) | (1L << (DIRECTIVE_DEFINED - 192)) | (1L << (DIRECTIVE_IF - 192)) | (1L << (DIRECTIVE_ELIF - 192)) | (1L << (DIRECTIVE_ELSE - 192)) | (1L << (DIRECTIVE_UNDEF - 192)) | (1L << (DIRECTIVE_IFDEF - 192)) | (1L << (DIRECTIVE_IFNDEF - 192)) | (1L << (DIRECTIVE_ENDIF - 192)) | (1L << (DIRECTIVE_TRUE - 192)) | (1L << (DIRECTIVE_FALSE - 192)) | (1L << (DIRECTIVE_ERROR - 192)) | (1L << (DIRECTIVE_WARNING - 192)) | (1L << (DIRECTIVE_BANG - 192)) | (1L << (DIRECTIVE_LP - 192)) | (1L << (DIRECTIVE_RP - 192)) | (1L << (DIRECTIVE_EQUAL - 192)) | (1L << (DIRECTIVE_NOTEQUAL - 192)) | (1L << (DIRECTIVE_AND - 192)) | (1L << (DIRECTIVE_OR - 192)) | (1L << (DIRECTIVE_LT - 192)) | (1L << (DIRECTIVE_GT - 192)) | (1L << (DIRECTIVE_LE - 192)) | (1L << (DIRECTIVE_GE - 192)) | (1L << (DIRECTIVE_STRING - 192)) | (1L << (DIRECTIVE_ID - 192)) | (1L << (DIRECTIVE_DECIMAL_LITERAL - 192)) | (1L << (DIRECTIVE_FLOAT - 192)) | (1L << (DIRECTIVE_NEWLINE - 192)) | (1L << (DIRECTIVE_MULTI_COMMENT - 192)) | (1L << (DIRECTIVE_SINGLE_COMMENT - 192)) | (1L << (DIRECTIVE_BACKSLASH_NEWLINE - 192)) | (1L << (DIRECTIVE_TEXT_NEWLINE - 192)) | (1L << (DIRECTIVE_TEXT - 192)) | (1L << (POINTER - 192)))) != 0) );
				setState(2024);
				match(RP);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(2025);
				((PostfixContext)_localctx).op = _input.LT(1);
				_la = _input.LA(1);
				if ( !(_la==INC || _la==DEC) ) {
					((PostfixContext)_localctx).op = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ArgumentExpressionListContext extends ParserRuleContext {
		public List<ArgumentExpressionContext> argumentExpression() {
			return getRuleContexts(ArgumentExpressionContext.class);
		}
		public ArgumentExpressionContext argumentExpression(int i) {
			return getRuleContext(ArgumentExpressionContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(LogosXXParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(LogosXXParser.COMMA, i);
		}
		public ArgumentExpressionListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_argumentExpressionList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LogosXXParserListener ) ((LogosXXParserListener)listener).enterArgumentExpressionList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LogosXXParserListener ) ((LogosXXParserListener)listener).exitArgumentExpressionList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LogosXXParserVisitor ) return ((LogosXXParserVisitor<? extends T>)visitor).visitArgumentExpressionList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArgumentExpressionListContext argumentExpressionList() throws RecognitionException {
		ArgumentExpressionListContext _localctx = new ArgumentExpressionListContext(_ctx, getState());
		enterRule(_localctx, 338, RULE_argumentExpressionList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2028);
			argumentExpression();
			setState(2033);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(2029);
				match(COMMA);
				setState(2030);
				argumentExpression();
				}
				}
				setState(2035);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ArgumentExpressionContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TypeSpecifierContext typeSpecifier() {
			return getRuleContext(TypeSpecifierContext.class,0);
		}
		public ArgumentExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_argumentExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LogosXXParserListener ) ((LogosXXParserListener)listener).enterArgumentExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LogosXXParserListener ) ((LogosXXParserListener)listener).exitArgumentExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LogosXXParserVisitor ) return ((LogosXXParserVisitor<? extends T>)visitor).visitArgumentExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArgumentExpressionContext argumentExpression() throws RecognitionException {
		ArgumentExpressionContext _localctx = new ArgumentExpressionContext(_ctx, getState());
		enterRule(_localctx, 340, RULE_argumentExpression);
		try {
			setState(2038);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,260,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2036);
				expression(0);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2037);
				typeSpecifier();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PrimaryExpressionContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public ConstantContext constant() {
			return getRuleContext(ConstantContext.class,0);
		}
		public StringLiteralContext stringLiteral() {
			return getRuleContext(StringLiteralContext.class,0);
		}
		public TerminalNode LP() { return getToken(LogosXXParser.LP, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode RP() { return getToken(LogosXXParser.RP, 0); }
		public MessageExpressionContext messageExpression() {
			return getRuleContext(MessageExpressionContext.class,0);
		}
		public SelectorExpressionContext selectorExpression() {
			return getRuleContext(SelectorExpressionContext.class,0);
		}
		public ProtocolExpressionContext protocolExpression() {
			return getRuleContext(ProtocolExpressionContext.class,0);
		}
		public EncodeExpressionContext encodeExpression() {
			return getRuleContext(EncodeExpressionContext.class,0);
		}
		public DictionaryExpressionContext dictionaryExpression() {
			return getRuleContext(DictionaryExpressionContext.class,0);
		}
		public ArrayExpressionContext arrayExpression() {
			return getRuleContext(ArrayExpressionContext.class,0);
		}
		public BoxExpressionContext boxExpression() {
			return getRuleContext(BoxExpressionContext.class,0);
		}
		public BlockExpressionContext blockExpression() {
			return getRuleContext(BlockExpressionContext.class,0);
		}
		public PrimaryExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_primaryExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LogosXXParserListener ) ((LogosXXParserListener)listener).enterPrimaryExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LogosXXParserListener ) ((LogosXXParserListener)listener).exitPrimaryExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LogosXXParserVisitor ) return ((LogosXXParserVisitor<? extends T>)visitor).visitPrimaryExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PrimaryExpressionContext primaryExpression() throws RecognitionException {
		PrimaryExpressionContext _localctx = new PrimaryExpressionContext(_ctx, getState());
		enterRule(_localctx, 342, RULE_primaryExpression);
		try {
			setState(2055);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,261,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2040);
				identifier();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2041);
				constant();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(2042);
				stringLiteral();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(2043);
				match(LP);
				setState(2044);
				expression(0);
				setState(2045);
				match(RP);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(2047);
				messageExpression();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(2048);
				selectorExpression();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(2049);
				protocolExpression();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(2050);
				encodeExpression();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(2051);
				dictionaryExpression();
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(2052);
				arrayExpression();
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(2053);
				boxExpression();
				}
				break;
			case 12:
				enterOuterAlt(_localctx, 12);
				{
				setState(2054);
				blockExpression();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ConstantContext extends ParserRuleContext {
		public TerminalNode HEX_LITERAL() { return getToken(LogosXXParser.HEX_LITERAL, 0); }
		public TerminalNode OCTAL_LITERAL() { return getToken(LogosXXParser.OCTAL_LITERAL, 0); }
		public TerminalNode BINARY_LITERAL() { return getToken(LogosXXParser.BINARY_LITERAL, 0); }
		public TerminalNode DECIMAL_LITERAL() { return getToken(LogosXXParser.DECIMAL_LITERAL, 0); }
		public TerminalNode ADD() { return getToken(LogosXXParser.ADD, 0); }
		public TerminalNode SUB() { return getToken(LogosXXParser.SUB, 0); }
		public TerminalNode FLOATING_POINT_LITERAL() { return getToken(LogosXXParser.FLOATING_POINT_LITERAL, 0); }
		public TerminalNode CHARACTER_LITERAL() { return getToken(LogosXXParser.CHARACTER_LITERAL, 0); }
		public TerminalNode NIL() { return getToken(LogosXXParser.NIL, 0); }
		public TerminalNode NULL() { return getToken(LogosXXParser.NULL, 0); }
		public TerminalNode YES() { return getToken(LogosXXParser.YES, 0); }
		public TerminalNode NO() { return getToken(LogosXXParser.NO, 0); }
		public TerminalNode TRUE() { return getToken(LogosXXParser.TRUE, 0); }
		public TerminalNode FALSE() { return getToken(LogosXXParser.FALSE, 0); }
		public ConstantContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constant; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LogosXXParserListener ) ((LogosXXParserListener)listener).enterConstant(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LogosXXParserListener ) ((LogosXXParserListener)listener).exitConstant(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LogosXXParserVisitor ) return ((LogosXXParserVisitor<? extends T>)visitor).visitConstant(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConstantContext constant() throws RecognitionException {
		ConstantContext _localctx = new ConstantContext(_ctx, getState());
		enterRule(_localctx, 344, RULE_constant);
		int _la;
		try {
			setState(2075);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,264,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2057);
				match(HEX_LITERAL);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2058);
				match(OCTAL_LITERAL);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(2059);
				match(BINARY_LITERAL);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(2061);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==ADD || _la==SUB) {
					{
					setState(2060);
					_la = _input.LA(1);
					if ( !(_la==ADD || _la==SUB) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					}
				}

				setState(2063);
				match(DECIMAL_LITERAL);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(2065);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==ADD || _la==SUB) {
					{
					setState(2064);
					_la = _input.LA(1);
					if ( !(_la==ADD || _la==SUB) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					}
				}

				setState(2067);
				match(FLOATING_POINT_LITERAL);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(2068);
				match(CHARACTER_LITERAL);
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(2069);
				match(NIL);
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(2070);
				match(NULL);
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(2071);
				match(YES);
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(2072);
				match(NO);
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(2073);
				match(TRUE);
				}
				break;
			case 12:
				enterOuterAlt(_localctx, 12);
				{
				setState(2074);
				match(FALSE);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class StringLiteralContext extends ParserRuleContext {
		public List<TerminalNode> STRING_START() { return getTokens(LogosXXParser.STRING_START); }
		public TerminalNode STRING_START(int i) {
			return getToken(LogosXXParser.STRING_START, i);
		}
		public List<TerminalNode> STRING_END() { return getTokens(LogosXXParser.STRING_END); }
		public TerminalNode STRING_END(int i) {
			return getToken(LogosXXParser.STRING_END, i);
		}
		public List<TerminalNode> STRING_VALUE() { return getTokens(LogosXXParser.STRING_VALUE); }
		public TerminalNode STRING_VALUE(int i) {
			return getToken(LogosXXParser.STRING_VALUE, i);
		}
		public List<TerminalNode> STRING_NEWLINE() { return getTokens(LogosXXParser.STRING_NEWLINE); }
		public TerminalNode STRING_NEWLINE(int i) {
			return getToken(LogosXXParser.STRING_NEWLINE, i);
		}
		public StringLiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stringLiteral; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LogosXXParserListener ) ((LogosXXParserListener)listener).enterStringLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LogosXXParserListener ) ((LogosXXParserListener)listener).exitStringLiteral(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LogosXXParserVisitor ) return ((LogosXXParserVisitor<? extends T>)visitor).visitStringLiteral(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StringLiteralContext stringLiteral() throws RecognitionException {
		StringLiteralContext _localctx = new StringLiteralContext(_ctx, getState());
		enterRule(_localctx, 346, RULE_stringLiteral);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(2085); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(2077);
					match(STRING_START);
					setState(2081);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==STRING_NEWLINE || _la==STRING_VALUE) {
						{
						{
						setState(2078);
						_la = _input.LA(1);
						if ( !(_la==STRING_NEWLINE || _la==STRING_VALUE) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						}
						}
						setState(2083);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(2084);
					match(STRING_END);
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(2087); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,266,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class IdentifierContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(LogosXXParser.IDENTIFIER, 0); }
		public TerminalNode BOOL() { return getToken(LogosXXParser.BOOL, 0); }
		public TerminalNode Class() { return getToken(LogosXXParser.Class, 0); }
		public TerminalNode BYCOPY() { return getToken(LogosXXParser.BYCOPY, 0); }
		public TerminalNode BYREF() { return getToken(LogosXXParser.BYREF, 0); }
		public TerminalNode ID() { return getToken(LogosXXParser.ID, 0); }
		public TerminalNode IMP() { return getToken(LogosXXParser.IMP, 0); }
		public TerminalNode IN() { return getToken(LogosXXParser.IN, 0); }
		public TerminalNode INOUT() { return getToken(LogosXXParser.INOUT, 0); }
		public TerminalNode ONEWAY() { return getToken(LogosXXParser.ONEWAY, 0); }
		public TerminalNode OUT() { return getToken(LogosXXParser.OUT, 0); }
		public TerminalNode PROTOCOL_() { return getToken(LogosXXParser.PROTOCOL_, 0); }
		public TerminalNode SEL() { return getToken(LogosXXParser.SEL, 0); }
		public TerminalNode SELF() { return getToken(LogosXXParser.SELF, 0); }
		public TerminalNode SUPER() { return getToken(LogosXXParser.SUPER, 0); }
		public TerminalNode ATOMIC() { return getToken(LogosXXParser.ATOMIC, 0); }
		public TerminalNode NONATOMIC() { return getToken(LogosXXParser.NONATOMIC, 0); }
		public TerminalNode RETAIN() { return getToken(LogosXXParser.RETAIN, 0); }
		public TerminalNode AUTORELEASING_QUALIFIER() { return getToken(LogosXXParser.AUTORELEASING_QUALIFIER, 0); }
		public TerminalNode BLOCK() { return getToken(LogosXXParser.BLOCK, 0); }
		public TerminalNode BRIDGE_RETAINED() { return getToken(LogosXXParser.BRIDGE_RETAINED, 0); }
		public TerminalNode BRIDGE_TRANSFER() { return getToken(LogosXXParser.BRIDGE_TRANSFER, 0); }
		public TerminalNode COVARIANT() { return getToken(LogosXXParser.COVARIANT, 0); }
		public TerminalNode CONTRAVARIANT() { return getToken(LogosXXParser.CONTRAVARIANT, 0); }
		public TerminalNode DEPRECATED() { return getToken(LogosXXParser.DEPRECATED, 0); }
		public TerminalNode KINDOF() { return getToken(LogosXXParser.KINDOF, 0); }
		public TerminalNode UNUSED() { return getToken(LogosXXParser.UNUSED, 0); }
		public TerminalNode NS_INLINE() { return getToken(LogosXXParser.NS_INLINE, 0); }
		public TerminalNode NS_ENUM() { return getToken(LogosXXParser.NS_ENUM, 0); }
		public TerminalNode NS_OPTIONS() { return getToken(LogosXXParser.NS_OPTIONS, 0); }
		public TerminalNode NULL_UNSPECIFIED() { return getToken(LogosXXParser.NULL_UNSPECIFIED, 0); }
		public TerminalNode NULLABLE() { return getToken(LogosXXParser.NULLABLE, 0); }
		public TerminalNode NONNULL() { return getToken(LogosXXParser.NONNULL, 0); }
		public TerminalNode NULL_RESETTABLE() { return getToken(LogosXXParser.NULL_RESETTABLE, 0); }
		public TerminalNode ASSIGN() { return getToken(LogosXXParser.ASSIGN, 0); }
		public TerminalNode COPY() { return getToken(LogosXXParser.COPY, 0); }
		public TerminalNode GETTER() { return getToken(LogosXXParser.GETTER, 0); }
		public TerminalNode SETTER() { return getToken(LogosXXParser.SETTER, 0); }
		public TerminalNode STRONG() { return getToken(LogosXXParser.STRONG, 0); }
		public TerminalNode READONLY() { return getToken(LogosXXParser.READONLY, 0); }
		public TerminalNode READWRITE() { return getToken(LogosXXParser.READWRITE, 0); }
		public TerminalNode WEAK() { return getToken(LogosXXParser.WEAK, 0); }
		public TerminalNode UNSAFE_UNRETAINED() { return getToken(LogosXXParser.UNSAFE_UNRETAINED, 0); }
		public TerminalNode IB_OUTLET() { return getToken(LogosXXParser.IB_OUTLET, 0); }
		public TerminalNode IB_OUTLET_COLLECTION() { return getToken(LogosXXParser.IB_OUTLET_COLLECTION, 0); }
		public TerminalNode IB_INSPECTABLE() { return getToken(LogosXXParser.IB_INSPECTABLE, 0); }
		public TerminalNode IB_DESIGNABLE() { return getToken(LogosXXParser.IB_DESIGNABLE, 0); }
		public IdentifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_identifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LogosXXParserListener ) ((LogosXXParserListener)listener).enterIdentifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LogosXXParserListener ) ((LogosXXParserListener)listener).exitIdentifier(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LogosXXParserVisitor ) return ((LogosXXParserVisitor<? extends T>)visitor).visitIdentifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IdentifierContext identifier() throws RecognitionException {
		IdentifierContext _localctx = new IdentifierContext(_ctx, getState());
		enterRule(_localctx, 348, RULE_identifier);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2089);
			_la = _input.LA(1);
			if ( !(((((_la - 57)) & ~0x3f) == 0 && ((1L << (_la - 57)) & ((1L << (BOOL - 57)) | (1L << (Class - 57)) | (1L << (BYCOPY - 57)) | (1L << (BYREF - 57)) | (1L << (ID - 57)) | (1L << (IMP - 57)) | (1L << (IN - 57)) | (1L << (INOUT - 57)) | (1L << (ONEWAY - 57)) | (1L << (OUT - 57)) | (1L << (PROTOCOL_ - 57)) | (1L << (SEL - 57)) | (1L << (SELF - 57)) | (1L << (SUPER - 57)) | (1L << (ATOMIC - 57)) | (1L << (NONATOMIC - 57)) | (1L << (RETAIN - 57)) | (1L << (AUTORELEASING_QUALIFIER - 57)) | (1L << (BLOCK - 57)) | (1L << (BRIDGE_RETAINED - 57)) | (1L << (BRIDGE_TRANSFER - 57)) | (1L << (COVARIANT - 57)) | (1L << (CONTRAVARIANT - 57)) | (1L << (DEPRECATED - 57)) | (1L << (KINDOF - 57)) | (1L << (UNUSED - 57)) | (1L << (NULL_UNSPECIFIED - 57)) | (1L << (NULLABLE - 57)) | (1L << (NONNULL - 57)) | (1L << (NULL_RESETTABLE - 57)) | (1L << (NS_INLINE - 57)))) != 0) || ((((_la - 121)) & ~0x3f) == 0 && ((1L << (_la - 121)) & ((1L << (NS_ENUM - 121)) | (1L << (NS_OPTIONS - 121)) | (1L << (ASSIGN - 121)) | (1L << (COPY - 121)) | (1L << (GETTER - 121)) | (1L << (SETTER - 121)) | (1L << (STRONG - 121)) | (1L << (READONLY - 121)) | (1L << (READWRITE - 121)) | (1L << (WEAK - 121)) | (1L << (UNSAFE_UNRETAINED - 121)) | (1L << (IB_OUTLET - 121)) | (1L << (IB_OUTLET_COLLECTION - 121)) | (1L << (IB_INSPECTABLE - 121)) | (1L << (IB_DESIGNABLE - 121)) | (1L << (IDENTIFIER - 121)))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 160:
			return expression_sempred((ExpressionContext)_localctx, predIndex);
		case 167:
			return postfixExpression_sempred((PostfixExpressionContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expression_sempred(ExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 13);
		case 1:
			return precpred(_ctx, 12);
		case 2:
			return precpred(_ctx, 11);
		case 3:
			return precpred(_ctx, 10);
		case 4:
			return precpred(_ctx, 9);
		case 5:
			return precpred(_ctx, 8);
		case 6:
			return precpred(_ctx, 7);
		case 7:
			return precpred(_ctx, 6);
		case 8:
			return precpred(_ctx, 5);
		case 9:
			return precpred(_ctx, 4);
		case 10:
			return precpred(_ctx, 3);
		}
		return true;
	}
	private boolean postfixExpression_sempred(PostfixExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 11:
			return precpred(_ctx, 1);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\u00f2\u082e\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\4<\t<\4=\t="+
		"\4>\t>\4?\t?\4@\t@\4A\tA\4B\tB\4C\tC\4D\tD\4E\tE\4F\tF\4G\tG\4H\tH\4I"+
		"\tI\4J\tJ\4K\tK\4L\tL\4M\tM\4N\tN\4O\tO\4P\tP\4Q\tQ\4R\tR\4S\tS\4T\tT"+
		"\4U\tU\4V\tV\4W\tW\4X\tX\4Y\tY\4Z\tZ\4[\t[\4\\\t\\\4]\t]\4^\t^\4_\t_\4"+
		"`\t`\4a\ta\4b\tb\4c\tc\4d\td\4e\te\4f\tf\4g\tg\4h\th\4i\ti\4j\tj\4k\t"+
		"k\4l\tl\4m\tm\4n\tn\4o\to\4p\tp\4q\tq\4r\tr\4s\ts\4t\tt\4u\tu\4v\tv\4"+
		"w\tw\4x\tx\4y\ty\4z\tz\4{\t{\4|\t|\4}\t}\4~\t~\4\177\t\177\4\u0080\t\u0080"+
		"\4\u0081\t\u0081\4\u0082\t\u0082\4\u0083\t\u0083\4\u0084\t\u0084\4\u0085"+
		"\t\u0085\4\u0086\t\u0086\4\u0087\t\u0087\4\u0088\t\u0088\4\u0089\t\u0089"+
		"\4\u008a\t\u008a\4\u008b\t\u008b\4\u008c\t\u008c\4\u008d\t\u008d\4\u008e"+
		"\t\u008e\4\u008f\t\u008f\4\u0090\t\u0090\4\u0091\t\u0091\4\u0092\t\u0092"+
		"\4\u0093\t\u0093\4\u0094\t\u0094\4\u0095\t\u0095\4\u0096\t\u0096\4\u0097"+
		"\t\u0097\4\u0098\t\u0098\4\u0099\t\u0099\4\u009a\t\u009a\4\u009b\t\u009b"+
		"\4\u009c\t\u009c\4\u009d\t\u009d\4\u009e\t\u009e\4\u009f\t\u009f\4\u00a0"+
		"\t\u00a0\4\u00a1\t\u00a1\4\u00a2\t\u00a2\4\u00a3\t\u00a3\4\u00a4\t\u00a4"+
		"\4\u00a5\t\u00a5\4\u00a6\t\u00a6\4\u00a7\t\u00a7\4\u00a8\t\u00a8\4\u00a9"+
		"\t\u00a9\4\u00aa\t\u00aa\4\u00ab\t\u00ab\4\u00ac\t\u00ac\4\u00ad\t\u00ad"+
		"\4\u00ae\t\u00ae\4\u00af\t\u00af\4\u00b0\t\u00b0\3\2\3\2\7\2\u0163\n\2"+
		"\f\2\16\2\u0166\13\2\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\3\5\3\u0170\n\3\3\4"+
		"\3\4\3\4\3\4\3\4\7\4\u0177\n\4\f\4\16\4\u017a\13\4\3\4\3\4\3\4\3\4\3\5"+
		"\3\5\3\5\3\5\3\5\3\5\5\5\u0186\n\5\3\5\3\5\5\5\u018a\n\5\3\5\3\5\3\5\3"+
		"\5\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\5\6\u0198\n\6\3\6\3\6\5\6\u019c\n\6"+
		"\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3\t\5\t\u01ae"+
		"\n\t\3\n\3\n\3\n\7\n\u01b3\n\n\f\n\16\n\u01b6\13\n\3\n\3\n\3\13\3\13\3"+
		"\13\3\13\3\13\5\13\u01bf\n\13\3\f\3\f\3\f\7\f\u01c4\n\f\f\f\16\f\u01c7"+
		"\13\f\3\f\3\f\3\r\3\r\5\r\u01cd\n\r\3\16\3\16\3\16\3\16\3\16\7\16\u01d4"+
		"\n\16\f\16\16\16\u01d7\13\16\3\16\3\16\3\17\3\17\3\17\5\17\u01de\n\17"+
		"\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\5\20\u01e8\n\20\3\20\3\20\3\20"+
		"\7\20\u01ed\n\20\f\20\16\20\u01f0\13\20\3\20\3\20\3\21\3\21\3\21\3\21"+
		"\3\21\5\21\u01f9\n\21\3\21\3\21\3\21\3\22\3\22\3\22\3\22\3\22\5\22\u0203"+
		"\n\22\3\23\3\23\3\23\3\23\3\23\3\23\5\23\u020b\n\23\3\24\3\24\3\24\3\24"+
		"\3\24\3\24\7\24\u0213\n\24\f\24\16\24\u0216\13\24\3\24\3\24\3\25\3\25"+
		"\3\25\5\25\u021d\n\25\3\25\3\25\3\25\3\26\3\26\3\26\3\26\3\26\3\26\3\26"+
		"\3\26\5\26\u022a\n\26\3\26\3\26\3\26\3\26\3\26\5\26\u0231\n\26\3\26\3"+
		"\26\3\26\3\26\3\26\3\27\3\27\3\27\7\27\u023b\n\27\f\27\16\27\u023e\13"+
		"\27\3\30\3\30\3\30\5\30\u0243\n\30\3\30\5\30\u0246\n\30\3\31\3\31\3\31"+
		"\3\31\3\31\5\31\u024d\n\31\3\31\3\31\5\31\u0251\n\31\3\32\3\32\3\32\3"+
		"\32\3\32\3\32\7\32\u0259\n\32\f\32\16\32\u025c\13\32\3\33\3\33\3\33\5"+
		"\33\u0261\n\33\3\34\3\34\3\34\5\34\u0266\n\34\3\35\5\35\u0269\n\35\3\35"+
		"\3\35\5\35\u026d\n\35\3\35\5\35\u0270\n\35\3\35\3\35\3\35\5\35\u0275\n"+
		"\35\3\36\3\36\3\36\3\36\3\36\3\36\7\36\u027d\n\36\f\36\16\36\u0280\13"+
		"\36\3\36\3\36\5\36\u0284\n\36\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37"+
		"\3\37\3\37\3\37\5\37\u0291\n\37\3 \3 \3 \7 \u0296\n \f \16 \u0299\13 "+
		"\3 \5 \u029c\n \3 \3 \3 \5 \u02a1\n \3 \3 \3 \3 \5 \u02a7\n \3 \3 \3 "+
		"\3!\7!\u02ad\n!\f!\16!\u02b0\13!\3!\3!\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\""+
		"\3\"\3\"\3\"\5\"\u02bf\n\"\3#\3#\3#\3#\3$\5$\u02c6\n$\3$\3$\3$\3$\5$\u02cc"+
		"\n$\3$\3$\3$\3$\5$\u02d2\n$\3$\5$\u02d5\n$\3$\5$\u02d8\n$\3$\3$\3%\3%"+
		"\3%\3%\5%\u02e0\n%\3%\3%\3%\3%\3%\5%\u02e7\n%\3%\5%\u02ea\n%\3%\5%\u02ed"+
		"\n%\3%\3%\3&\3&\3&\3&\5&\u02f5\n&\3&\5&\u02f8\n&\3&\5&\u02fb\n&\3&\3&"+
		"\3\'\3\'\3\'\3\'\3\'\3\'\5\'\u0305\n\'\3\'\3\'\3(\3(\3(\3(\3(\3(\5(\u030f"+
		"\n(\3)\3)\3)\3)\3)\3)\5)\u0317\n)\3)\7)\u031a\n)\f)\16)\u031d\13)\3)\3"+
		")\3*\3*\7*\u0323\n*\f*\16*\u0326\13*\3*\6*\u0329\n*\r*\16*\u032a\5*\u032d"+
		"\n*\3+\3+\3+\3+\3,\3,\3,\3,\7,\u0337\n,\f,\16,\u033a\13,\3,\3,\3-\3-\3"+
		"-\7-\u0341\n-\f-\16-\u0344\13-\3.\3.\3.\3.\3.\5.\u034b\n.\3.\5.\u034e"+
		"\n.\3.\5.\u0351\n.\3.\3.\3/\3/\3/\7/\u0358\n/\f/\16/\u035b\13/\3\60\3"+
		"\60\3\60\3\60\3\60\3\60\3\60\3\60\3\60\3\60\3\60\3\60\3\60\3\60\3\60\3"+
		"\60\3\60\3\60\3\60\3\60\5\60\u0371\n\60\3\61\3\61\3\61\3\61\3\61\5\61"+
		"\u0378\n\61\3\61\5\61\u037b\n\61\3\62\3\62\7\62\u037f\n\62\f\62\16\62"+
		"\u0382\13\62\3\62\3\62\3\63\3\63\7\63\u0388\n\63\f\63\16\63\u038b\13\63"+
		"\3\63\6\63\u038e\n\63\r\63\16\63\u038f\5\63\u0392\n\63\3\64\3\64\3\65"+
		"\3\65\3\65\3\65\3\65\6\65\u039b\n\65\r\65\16\65\u039c\3\66\3\66\3\66\3"+
		"\67\3\67\3\67\38\58\u03a6\n8\38\38\58\u03aa\n8\38\38\39\39\39\39\39\6"+
		"9\u03b3\n9\r9\169\u03b4\3:\3:\3:\3;\3;\3;\3<\5<\u03be\n<\3<\3<\5<\u03c2"+
		"\n<\3<\5<\u03c5\n<\3<\3<\3=\3=\6=\u03cb\n=\r=\16=\u03cc\3=\3=\5=\u03d1"+
		"\n=\5=\u03d3\n=\3>\5>\u03d6\n>\3>\3>\7>\u03da\n>\f>\16>\u03dd\13>\3>\5"+
		">\u03e0\n>\3>\3>\3?\3?\5?\u03e6\n?\3@\3@\3@\3@\3A\3A\3A\3A\3A\3A\3A\3"+
		"A\5A\u03f4\nA\3B\3B\3B\7B\u03f9\nB\fB\16B\u03fc\13B\3C\3C\3C\5C\u0401"+
		"\nC\3D\5D\u0404\nD\3D\3D\5D\u0408\nD\3D\3D\3D\3D\5D\u040e\nD\3D\3D\5D"+
		"\u0412\nD\3E\3E\3E\3E\7E\u0418\nE\fE\16E\u041b\13E\5E\u041d\nE\3E\3E\3"+
		"F\7F\u0422\nF\fF\16F\u0425\13F\3F\3F\3G\3G\3G\3G\3G\7G\u042e\nG\fG\16"+
		"G\u0431\13G\3G\5G\u0434\nG\5G\u0436\nG\3G\3G\3H\3H\3H\3H\3I\3I\3I\3I\5"+
		"I\u0442\nI\5I\u0444\nI\3I\3I\3J\3J\3J\3J\3J\3J\3J\3J\5J\u0450\nJ\5J\u0452"+
		"\nJ\3K\3K\3K\5K\u0457\nK\3K\3K\7K\u045b\nK\fK\16K\u045e\13K\5K\u0460\n"+
		"K\3K\3K\3L\3L\5L\u0466\nL\3M\3M\5M\u046a\nM\3M\5M\u046d\nM\3M\5M\u0470"+
		"\nM\3M\3M\3N\3N\3N\3N\3N\3O\3O\5O\u047b\nO\3P\3P\6P\u047f\nP\rP\16P\u0480"+
		"\5P\u0483\nP\3Q\5Q\u0486\nQ\3Q\3Q\3Q\3Q\7Q\u048c\nQ\fQ\16Q\u048f\13Q\3"+
		"R\3R\5R\u0493\nR\3R\3R\3R\3R\5R\u0499\nR\3S\3S\3S\3S\3S\3T\3T\5T\u04a2"+
		"\nT\3T\6T\u04a5\nT\rT\16T\u04a6\5T\u04a9\nT\3U\3U\3U\3U\3U\3V\3V\3V\3"+
		"V\3V\3W\3W\3W\3X\3X\3X\3X\3X\3X\3X\5X\u04bf\nX\3Y\3Y\3Y\7Y\u04c4\nY\f"+
		"Y\16Y\u04c7\13Y\3Y\3Y\5Y\u04cb\nY\3Z\3Z\3Z\3Z\3Z\3Z\3[\3[\3[\3[\3[\3["+
		"\3\\\3\\\3\\\3]\3]\3]\3^\3^\3^\3_\5_\u04e3\n_\3_\3_\3_\5_\u04e8\n_\3_"+
		"\3_\3_\5_\u04ed\n_\3`\3`\5`\u04f1\n`\3a\3a\5a\u04f5\na\3b\3b\5b\u04f9"+
		"\nb\3b\3b\3c\3c\3c\7c\u0500\nc\fc\16c\u0503\13c\3d\3d\3d\3d\5d\u0509\n"+
		"d\3e\3e\3e\3e\3e\5e\u0510\ne\3f\3f\3f\3f\5f\u0516\nf\3g\5g\u0519\ng\3"+
		"g\3g\5g\u051d\ng\3g\3g\3g\3g\3g\3h\5h\u0525\nh\3h\5h\u0528\nh\3h\3h\5"+
		"h\u052c\nh\3h\3h\3i\3i\3i\3i\5i\u0534\ni\3i\3i\3j\5j\u0539\nj\3j\3j\3"+
		"j\3j\3j\5j\u0540\nj\3j\3j\3k\3k\3k\7k\u0547\nk\fk\16k\u054a\13k\3l\5l"+
		"\u054d\nl\3l\3l\3m\3m\3m\3m\3m\3m\3m\3m\6m\u0559\nm\rm\16m\u055a\3n\3"+
		"n\3n\3n\3n\3n\7n\u0563\nn\fn\16n\u0566\13n\3n\3n\3n\3o\3o\3o\7o\u056e"+
		"\no\fo\16o\u0571\13o\3p\3p\3p\5p\u0576\np\3q\3q\3q\5q\u057b\nq\3q\3q\6"+
		"q\u057f\nq\rq\16q\u0580\3q\3q\5q\u0585\nq\3r\3r\3r\5r\u058a\nr\3r\3r\3"+
		"s\3s\3s\3s\3s\3s\6s\u0594\ns\rs\16s\u0595\3t\3t\3t\3t\3t\3t\5t\u059e\n"+
		"t\3u\3u\3v\3v\3w\3w\3x\3x\3y\3y\3y\3y\5y\u05ac\ny\3z\3z\3{\3{\3{\3{\3"+
		"{\3{\3{\3{\3{\3{\3{\3{\3{\3{\3{\5{\u05bf\n{\5{\u05c1\n{\3|\3|\3|\3|\3"+
		"|\3}\3}\3}\7}\u05cb\n}\f}\16}\u05ce\13}\3~\3~\5~\u05d2\n~\3~\3~\5~\u05d6"+
		"\n~\3\177\3\177\5\177\u05da\n\177\3\177\3\177\5\177\u05de\n\177\3\177"+
		"\3\177\3\177\3\177\3\177\5\177\u05e5\n\177\3\177\3\177\3\177\3\177\5\177"+
		"\u05eb\n\177\3\177\3\177\3\177\3\177\3\177\3\177\3\177\3\177\3\177\3\177"+
		"\5\177\u05f7\n\177\3\u0080\3\u0080\3\u0080\7\u0080\u05fc\n\u0080\f\u0080"+
		"\16\u0080\u05ff\13\u0080\3\u0080\5\u0080\u0602\n\u0080\3\u0081\3\u0081"+
		"\3\u0081\5\u0081\u0607\n\u0081\3\u0082\3\u0082\5\u0082\u060b\n\u0082\3"+
		"\u0083\3\u0083\3\u0083\3\u0083\3\u0083\5\u0083\u0612\n\u0083\3\u0083\7"+
		"\u0083\u0615\n\u0083\f\u0083\16\u0083\u0618\13\u0083\3\u0083\3\u0083\3"+
		"\u0083\5\u0083\u061d\n\u0083\3\u0083\5\u0083\u0620\n\u0083\3\u0083\3\u0083"+
		"\5\u0083\u0624\n\u0083\3\u0084\3\u0084\5\u0084\u0628\n\u0084\3\u0084\3"+
		"\u0084\3\u0085\3\u0085\3\u0085\5\u0085\u062f\n\u0085\3\u0086\3\u0086\5"+
		"\u0086\u0633\n\u0086\3\u0086\5\u0086\u0636\n\u0086\3\u0087\3\u0087\3\u0087"+
		"\3\u0087\3\u0087\7\u0087\u063d\n\u0087\f\u0087\16\u0087\u0640\13\u0087"+
		"\3\u0087\3\u0087\5\u0087\u0644\n\u0087\3\u0088\3\u0088\3\u0088\5\u0088"+
		"\u0649\n\u0088\5\u0088\u064b\n\u0088\3\u0088\3\u0088\3\u0089\3\u0089\3"+
		"\u0089\3\u0089\3\u0089\3\u0089\7\u0089\u0655\n\u0089\f\u0089\16\u0089"+
		"\u0658\13\u0089\3\u0089\5\u0089\u065b\n\u0089\5\u0089\u065d\n\u0089\3"+
		"\u0089\3\u0089\3\u008a\3\u008a\3\u008a\7\u008a\u0664\n\u008a\f\u008a\16"+
		"\u008a\u0667\13\u008a\3\u008a\5\u008a\u066a\n\u008a\3\u008b\3\u008b\5"+
		"\u008b\u066e\n\u008b\3\u008b\5\u008b\u0671\n\u008b\3\u008c\3\u008c\5\u008c"+
		"\u0675\n\u008c\3\u008c\3\u008c\5\u008c\u0679\n\u008c\3\u008c\3\u008c\6"+
		"\u008c\u067d\n\u008c\r\u008c\16\u008c\u067e\3\u008c\3\u008c\5\u008c\u0683"+
		"\n\u008c\3\u008c\6\u008c\u0686\n\u008c\r\u008c\16\u008c\u0687\5\u008c"+
		"\u068a\n\u008c\3\u008d\3\u008d\5\u008d\u068e\n\u008d\3\u008d\3\u008d\3"+
		"\u008d\5\u008d\u0693\n\u008d\3\u008d\5\u008d\u0696\n\u008d\3\u008e\3\u008e"+
		"\3\u008e\7\u008e\u069b\n\u008e\f\u008e\16\u008e\u069e\13\u008e\3\u008f"+
		"\3\u008f\3\u008f\3\u008f\5\u008f\u06a4\n\u008f\3\u0090\5\u0090\u06a7\n"+
		"\u0090\3\u0090\3\u0090\3\u0091\3\u0091\5\u0091\u06ad\n\u0091\3\u0091\3"+
		"\u0091\5\u0091\u06b1\n\u0091\3\u0091\3\u0091\5\u0091\u06b5\n\u0091\3\u0091"+
		"\3\u0091\5\u0091\u06b9\n\u0091\3\u0091\3\u0091\5\u0091\u06bd\n\u0091\3"+
		"\u0091\3\u0091\5\u0091\u06c1\n\u0091\3\u0091\3\u0091\5\u0091\u06c5\n\u0091"+
		"\3\u0091\3\u0091\5\u0091\u06c9\n\u0091\3\u0091\3\u0091\5\u0091\u06cd\n"+
		"\u0091\3\u0091\3\u0091\5\u0091\u06d1\n\u0091\3\u0091\5\u0091\u06d4\n\u0091"+
		"\3\u0092\3\u0092\3\u0092\3\u0092\3\u0093\3\u0093\3\u0093\5\u0093\u06dd"+
		"\n\u0093\3\u0094\3\u0094\3\u0094\7\u0094\u06e2\n\u0094\f\u0094\16\u0094"+
		"\u06e5\13\u0094\3\u0094\3\u0094\3\u0095\3\u0095\3\u0095\3\u0095\3\u0095"+
		"\3\u0095\3\u0095\5\u0095\u06f0\n\u0095\3\u0095\5\u0095\u06f3\n\u0095\3"+
		"\u0096\3\u0096\3\u0096\3\u0096\3\u0096\3\u0096\3\u0097\3\u0097\7\u0097"+
		"\u06fd\n\u0097\f\u0097\16\u0097\u0700\13\u0097\3\u0097\3\u0097\3\u0098"+
		"\6\u0098\u0705\n\u0098\r\u0098\16\u0098\u0706\3\u0098\6\u0098\u070a\n"+
		"\u0098\r\u0098\16\u0098\u070b\3\u0099\3\u0099\3\u0099\3\u0099\3\u0099"+
		"\3\u0099\5\u0099\u0714\n\u0099\3\u0099\3\u0099\3\u0099\3\u0099\5\u0099"+
		"\u071a\n\u0099\3\u009a\3\u009a\3\u009a\3\u009a\5\u009a\u0720\n\u009a\3"+
		"\u009b\3\u009b\3\u009b\3\u009b\3\u009b\3\u009b\3\u009c\3\u009c\3\u009c"+
		"\3\u009c\3\u009c\3\u009c\3\u009c\3\u009c\3\u009d\3\u009d\3\u009d\5\u009d"+
		"\u0733\n\u009d\3\u009d\3\u009d\5\u009d\u0737\n\u009d\3\u009d\3\u009d\5"+
		"\u009d\u073b\n\u009d\3\u009d\3\u009d\3\u009d\3\u009e\3\u009e\3\u009e\3"+
		"\u009e\5\u009e\u0744\n\u009e\3\u009f\3\u009f\3\u009f\3\u009f\3\u009f\5"+
		"\u009f\u074b\n\u009f\3\u009f\3\u009f\3\u009f\3\u00a0\3\u00a0\3\u00a0\3"+
		"\u00a0\3\u00a0\3\u00a0\5\u00a0\u0756\n\u00a0\5\u00a0\u0758\n\u00a0\3\u00a1"+
		"\3\u00a1\3\u00a1\7\u00a1\u075d\n\u00a1\f\u00a1\16\u00a1\u0760\13\u00a1"+
		"\3\u00a2\3\u00a2\3\u00a2\3\u00a2\3\u00a2\3\u00a2\3\u00a2\3\u00a2\3\u00a2"+
		"\3\u00a2\5\u00a2\u076c\n\u00a2\3\u00a2\3\u00a2\3\u00a2\3\u00a2\3\u00a2"+
		"\3\u00a2\3\u00a2\3\u00a2\3\u00a2\3\u00a2\3\u00a2\5\u00a2\u0779\n\u00a2"+
		"\3\u00a2\3\u00a2\3\u00a2\3\u00a2\3\u00a2\3\u00a2\3\u00a2\3\u00a2\3\u00a2"+
		"\3\u00a2\3\u00a2\3\u00a2\3\u00a2\3\u00a2\3\u00a2\3\u00a2\3\u00a2\3\u00a2"+
		"\3\u00a2\3\u00a2\3\u00a2\3\u00a2\3\u00a2\3\u00a2\3\u00a2\5\u00a2\u0794"+
		"\n\u00a2\3\u00a2\3\u00a2\7\u00a2\u0798\n\u00a2\f\u00a2\16\u00a2\u079b"+
		"\13\u00a2\3\u00a3\3\u00a3\3\u00a4\3\u00a4\3\u00a4\3\u00a4\3\u00a4\3\u00a4"+
		"\3\u00a4\5\u00a4\u07a6\n\u00a4\5\u00a4\u07a8\n\u00a4\3\u00a5\3\u00a5\3"+
		"\u00a5\5\u00a5\u07ad\n\u00a5\3\u00a6\3\u00a6\5\u00a6\u07b1\n\u00a6\3\u00a7"+
		"\3\u00a7\3\u00a7\3\u00a7\3\u00a7\3\u00a7\3\u00a7\5\u00a7\u07ba\n\u00a7"+
		"\3\u00a7\3\u00a7\3\u00a7\3\u00a7\3\u00a7\5\u00a7\u07c1\n\u00a7\3\u00a8"+
		"\3\u00a8\3\u00a9\3\u00a9\3\u00a9\7\u00a9\u07c8\n\u00a9\f\u00a9\16\u00a9"+
		"\u07cb\13\u00a9\3\u00a9\3\u00a9\3\u00a9\3\u00a9\7\u00a9\u07d1\n\u00a9"+
		"\f\u00a9\16\u00a9\u07d4\13\u00a9\7\u00a9\u07d6\n\u00a9\f\u00a9\16\u00a9"+
		"\u07d9\13\u00a9\3\u00aa\3\u00aa\3\u00aa\3\u00aa\3\u00aa\3\u00aa\5\u00aa"+
		"\u07e1\n\u00aa\3\u00aa\3\u00aa\3\u00aa\3\u00aa\6\u00aa\u07e7\n\u00aa\r"+
		"\u00aa\16\u00aa\u07e8\3\u00aa\3\u00aa\5\u00aa\u07ed\n\u00aa\3\u00ab\3"+
		"\u00ab\3\u00ab\7\u00ab\u07f2\n\u00ab\f\u00ab\16\u00ab\u07f5\13\u00ab\3"+
		"\u00ac\3\u00ac\5\u00ac\u07f9\n\u00ac\3\u00ad\3\u00ad\3\u00ad\3\u00ad\3"+
		"\u00ad\3\u00ad\3\u00ad\3\u00ad\3\u00ad\3\u00ad\3\u00ad\3\u00ad\3\u00ad"+
		"\3\u00ad\3\u00ad\5\u00ad\u080a\n\u00ad\3\u00ae\3\u00ae\3\u00ae\3\u00ae"+
		"\5\u00ae\u0810\n\u00ae\3\u00ae\3\u00ae\5\u00ae\u0814\n\u00ae\3\u00ae\3"+
		"\u00ae\3\u00ae\3\u00ae\3\u00ae\3\u00ae\3\u00ae\3\u00ae\5\u00ae\u081e\n"+
		"\u00ae\3\u00af\3\u00af\7\u00af\u0822\n\u00af\f\u00af\16\u00af\u0825\13"+
		"\u00af\3\u00af\6\u00af\u0828\n\u00af\r\u00af\16\u00af\u0829\3\u00b0\3"+
		"\u00b0\3\u00b0\2\4\u0142\u0150\u00b1\2\4\6\b\n\f\16\20\22\24\26\30\32"+
		"\34\36 \"$&(*,.\60\62\64\668:<>@BDFHJLNPRTVXZ\\^`bdfhjlnprtvxz|~\u0080"+
		"\u0082\u0084\u0086\u0088\u008a\u008c\u008e\u0090\u0092\u0094\u0096\u0098"+
		"\u009a\u009c\u009e\u00a0\u00a2\u00a4\u00a6\u00a8\u00aa\u00ac\u00ae\u00b0"+
		"\u00b2\u00b4\u00b6\u00b8\u00ba\u00bc\u00be\u00c0\u00c2\u00c4\u00c6\u00c8"+
		"\u00ca\u00cc\u00ce\u00d0\u00d2\u00d4\u00d6\u00d8\u00da\u00dc\u00de\u00e0"+
		"\u00e2\u00e4\u00e6\u00e8\u00ea\u00ec\u00ee\u00f0\u00f2\u00f4\u00f6\u00f8"+
		"\u00fa\u00fc\u00fe\u0100\u0102\u0104\u0106\u0108\u010a\u010c\u010e\u0110"+
		"\u0112\u0114\u0116\u0118\u011a\u011c\u011e\u0120\u0122\u0124\u0126\u0128"+
		"\u012a\u012c\u012e\u0130\u0132\u0134\u0136\u0138\u013a\u013c\u013e\u0140"+
		"\u0142\u0144\u0146\u0148\u014a\u014c\u014e\u0150\u0152\u0154\u0156\u0158"+
		"\u015a\u015c\u015e\2\30\4\2\u0090\u0090\u00c3\u00c3\3\2\u00ab\u00ac\4"+
		"\2YY^^\3\2mn\5\2WWZZ\\]\4\2..\61\61\6\2hhqqssuu\3\2vy\6\2\24\24\37\37"+
		"\'\'--\6\2$$ilppzz\5\2=>ABFG\3\2{|\4\2\u00ad\u00ae\u00b2\u00b2\4\2\u009d"+
		"\u009e\u00a4\u00a5\4\2\u00a3\u00a3\u00a6\u00a6\4\2\u009c\u009c\u00b3\u00bc"+
		"\3\2\u00a9\u00aa\5\2\u009f\u00a0\u00ab\u00ad\u00af\u00af\3\2\u0099\u009a"+
		"\3\2\u0092\u0092\4\2\u00ca\u00ca\u00cc\u00cc\n\2;BFKdfhikpttv\u0089\u0090"+
		"\u0090\2\u0906\2\u0164\3\2\2\2\4\u016f\3\2\2\2\6\u0171\3\2\2\2\b\u017f"+
		"\3\2\2\2\n\u018f\3\2\2\2\f\u01a1\3\2\2\2\16\u01a4\3\2\2\2\20\u01ad\3\2"+
		"\2\2\22\u01af\3\2\2\2\24\u01be\3\2\2\2\26\u01c0\3\2\2\2\30\u01cc\3\2\2"+
		"\2\32\u01ce\3\2\2\2\34\u01da\3\2\2\2\36\u01df\3\2\2\2 \u01f3\3\2\2\2\""+
		"\u0202\3\2\2\2$\u020a\3\2\2\2&\u020c\3\2\2\2(\u0219\3\2\2\2*\u0221\3\2"+
		"\2\2,\u0237\3\2\2\2.\u023f\3\2\2\2\60\u0250\3\2\2\2\62\u0252\3\2\2\2\64"+
		"\u0260\3\2\2\2\66\u0265\3\2\2\28\u0274\3\2\2\2:\u0283\3\2\2\2<\u0285\3"+
		"\2\2\2>\u0292\3\2\2\2@\u02ae\3\2\2\2B\u02be\3\2\2\2D\u02c0\3\2\2\2F\u02c5"+
		"\3\2\2\2H\u02db\3\2\2\2J\u02f0\3\2\2\2L\u02fe\3\2\2\2N\u0308\3\2\2\2P"+
		"\u0310\3\2\2\2R\u032c\3\2\2\2T\u032e\3\2\2\2V\u0332\3\2\2\2X\u033d\3\2"+
		"\2\2Z\u0345\3\2\2\2\\\u0354\3\2\2\2^\u0370\3\2\2\2`\u037a\3\2\2\2b\u037c"+
		"\3\2\2\2d\u0391\3\2\2\2f\u0393\3\2\2\2h\u039a\3\2\2\2j\u039e\3\2\2\2l"+
		"\u03a1\3\2\2\2n\u03a5\3\2\2\2p\u03b2\3\2\2\2r\u03b6\3\2\2\2t\u03b9\3\2"+
		"\2\2v\u03bd\3\2\2\2x\u03d2\3\2\2\2z\u03d5\3\2\2\2|\u03e5\3\2\2\2~\u03e7"+
		"\3\2\2\2\u0080\u03f3\3\2\2\2\u0082\u03f5\3\2\2\2\u0084\u03fd\3\2\2\2\u0086"+
		"\u0403\3\2\2\2\u0088\u0413\3\2\2\2\u008a\u0423\3\2\2\2\u008c\u0428\3\2"+
		"\2\2\u008e\u0439\3\2\2\2\u0090\u043d\3\2\2\2\u0092\u0451\3\2\2\2\u0094"+
		"\u0453\3\2\2\2\u0096\u0465\3\2\2\2\u0098\u0467\3\2\2\2\u009a\u0473\3\2"+
		"\2\2\u009c\u047a\3\2\2\2\u009e\u0482\3\2\2\2\u00a0\u0485\3\2\2\2\u00a2"+
		"\u0490\3\2\2\2\u00a4\u049a\3\2\2\2\u00a6\u04a8\3\2\2\2\u00a8\u04aa\3\2"+
		"\2\2\u00aa\u04af\3\2\2\2\u00ac\u04b4\3\2\2\2\u00ae\u04be\3\2\2\2\u00b0"+
		"\u04c0\3\2\2\2\u00b2\u04cc\3\2\2\2\u00b4\u04d2\3\2\2\2\u00b6\u04d8\3\2"+
		"\2\2\u00b8\u04db\3\2\2\2\u00ba\u04de\3\2\2\2\u00bc\u04e2\3\2\2\2\u00be"+
		"\u04ee\3\2\2\2\u00c0\u04f4\3\2\2\2\u00c2\u04f6\3\2\2\2\u00c4\u04fc\3\2"+
		"\2\2\u00c6\u0508\3\2\2\2\u00c8\u050a\3\2\2\2\u00ca\u0515\3\2\2\2\u00cc"+
		"\u0518\3\2\2\2\u00ce\u0524\3\2\2\2\u00d0\u0533\3\2\2\2\u00d2\u0538\3\2"+
		"\2\2\u00d4\u0543\3\2\2\2\u00d6\u054c\3\2\2\2\u00d8\u0558\3\2\2\2\u00da"+
		"\u055c\3\2\2\2\u00dc\u056a\3\2\2\2\u00de\u0572\3\2\2\2\u00e0\u0577\3\2"+
		"\2\2\u00e2\u0586\3\2\2\2\u00e4\u0593\3\2\2\2\u00e6\u059d\3\2\2\2\u00e8"+
		"\u059f\3\2\2\2\u00ea\u05a1\3\2\2\2\u00ec\u05a3\3\2\2\2\u00ee\u05a5\3\2"+
		"\2\2\u00f0\u05ab\3\2\2\2\u00f2\u05ad\3\2\2\2\u00f4\u05c0\3\2\2\2\u00f6"+
		"\u05c2\3\2\2\2\u00f8\u05c7\3\2\2\2\u00fa\u05d5\3\2\2\2\u00fc\u05f6\3\2"+
		"\2\2\u00fe\u05f8\3\2\2\2\u0100\u0603\3\2\2\2\u0102\u060a\3\2\2\2\u0104"+
		"\u0623\3\2\2\2\u0106\u0625\3\2\2\2\u0108\u062b\3\2\2\2\u010a\u0630\3\2"+
		"\2\2\u010c\u0637\3\2\2\2\u010e\u0645\3\2\2\2\u0110\u064e\3\2\2\2\u0112"+
		"\u0660\3\2\2\2\u0114\u0670\3\2\2\2\u0116\u0689\3\2\2\2\u0118\u0695\3\2"+
		"\2\2\u011a\u0697\3\2\2\2\u011c\u06a3\3\2\2\2\u011e\u06a6\3\2\2\2\u0120"+
		"\u06d3\3\2\2\2\u0122\u06d5\3\2\2\2\u0124\u06d9\3\2\2\2\u0126\u06de\3\2"+
		"\2\2\u0128\u06f2\3\2\2\2\u012a\u06f4\3\2\2\2\u012c\u06fa\3\2\2\2\u012e"+
		"\u0704\3\2\2\2\u0130\u0719\3\2\2\2\u0132\u071f\3\2\2\2\u0134\u0721\3\2"+
		"\2\2\u0136\u0727\3\2\2\2\u0138\u072f\3\2\2\2\u013a\u0743\3\2\2\2\u013c"+
		"\u0745\3\2\2\2\u013e\u0757\3\2\2\2\u0140\u0759\3\2\2\2\u0142\u076b\3\2"+
		"\2\2\u0144\u079c\3\2\2\2\u0146\u07a7\3\2\2\2\u0148\u07ac\3\2\2\2\u014a"+
		"\u07b0\3\2\2\2\u014c\u07c0\3\2\2\2\u014e\u07c2\3\2\2\2\u0150\u07c4\3\2"+
		"\2\2\u0152\u07ec\3\2\2\2\u0154\u07ee\3\2\2\2\u0156\u07f8\3\2\2\2\u0158"+
		"\u0809\3\2\2\2\u015a\u081d\3\2\2\2\u015c\u0827\3\2\2\2\u015e\u082b\3\2"+
		"\2\2\u0160\u0163\5\4\3\2\u0161\u0163\5B\"\2\u0162\u0160\3\2\2\2\u0162"+
		"\u0161\3\2\2\2\u0163\u0166\3\2\2\2\u0164\u0162\3\2\2\2\u0164\u0165\3\2"+
		"\2\2\u0165\u0167\3\2\2\2\u0166\u0164\3\2\2\2\u0167\u0168\7\2\2\3\u0168"+
		"\3\3\2\2\2\u0169\u0170\5\6\4\2\u016a\u0170\5\b\5\2\u016b\u0170\5\n\6\2"+
		"\u016c\u0170\5\f\7\2\u016d\u0170\5\16\b\2\u016e\u0170\5\20\t\2\u016f\u0169"+
		"\3\2\2\2\u016f\u016a\3\2\2\2\u016f\u016b\3\2\2\2\u016f\u016c\3\2\2\2\u016f"+
		"\u016d\3\2\2\2\u016f\u016e\3\2\2\2\u0170\5\3\2\2\2\u0171\u0172\7\3\2\2"+
		"\u0172\u0178\7\u0091\2\2\u0173\u0174\7\u0090\2\2\u0174\u0175\7\u009c\2"+
		"\2\u0175\u0177\t\2\2\2\u0176\u0173\3\2\2\2\u0177\u017a\3\2\2\2\u0178\u0176"+
		"\3\2\2\2\u0178\u0179\3\2\2\2\u0179\u017b\3\2\2\2\u017a\u0178\3\2\2\2\u017b"+
		"\u017c\7\u0092\2\2\u017c\u017d\3\2\2\2\u017d\u017e\7\u0097\2\2\u017e\7"+
		"\3\2\2\2\u017f\u0180\7\4\2\2\u0180\u0181\7\u0091\2\2\u0181\u0182\5\u0114"+
		"\u008b\2\u0182\u0185\7\u0098\2\2\u0183\u0186\5x=\2\u0184\u0186\5\u015c"+
		"\u00af\2\u0185\u0183\3\2\2\2\u0185\u0184\3\2\2\2\u0186\u0187\3\2\2\2\u0187"+
		"\u0189\7\u0098\2\2\u0188\u018a\5\u0108\u0085\2\u0189\u0188\3\2\2\2\u0189"+
		"\u018a\3\2\2\2\u018a\u018b\3\2\2\2\u018b\u018c\7\u0092\2\2\u018c\u018d"+
		"\3\2\2\2\u018d\u018e\5:\36\2\u018e\t\3\2\2\2\u018f\u0190\7\5\2\2\u0190"+
		"\u0191\7\u0091\2\2\u0191\u0192\5\u015c\u00af\2\u0192\u0193\7\u0098\2\2"+
		"\u0193\u0194\5\u0114\u008b\2\u0194\u0197\7\u0098\2\2\u0195\u0198\5x=\2"+
		"\u0196\u0198\5\u015c\u00af\2\u0197\u0195\3\2\2\2\u0197\u0196\3\2\2\2\u0198"+
		"\u0199\3\2\2\2\u0199\u019b\7\u0098\2\2\u019a\u019c\5\u0108\u0085\2\u019b"+
		"\u019a\3\2\2\2\u019b\u019c\3\2\2\2\u019c\u019d\3\2\2\2\u019d\u019e\7\u0092"+
		"\2\2\u019e\u019f\3\2\2\2\u019f\u01a0\5:\36\2\u01a0\13\3\2\2\2\u01a1\u01a2"+
		"\7\6\2\2\u01a2\u01a3\5:\36\2\u01a3\r\3\2\2\2\u01a4\u01a5\7\7\2\2\u01a5"+
		"\u01a6\5:\36\2\u01a6\17\3\2\2\2\u01a7\u01ae\5\22\n\2\u01a8\u01ae\5\26"+
		"\f\2\u01a9\u01ae\5\32\16\2\u01aa\u01ae\5\34\17\2\u01ab\u01ae\5\36\20\2"+
		"\u01ac\u01ae\5 \21\2\u01ad\u01a7\3\2\2\2\u01ad\u01a8\3\2\2\2\u01ad\u01a9"+
		"\3\2\2\2\u01ad\u01aa\3\2\2\2\u01ad\u01ab\3\2\2\2\u01ad\u01ac\3\2\2\2\u01ae"+
		"\21\3\2\2\2\u01af\u01b0\7\b\2\2\u01b0\u01b4\7\u0090\2\2\u01b1\u01b3\5"+
		"\24\13\2\u01b2\u01b1\3\2\2\2\u01b3\u01b6\3\2\2\2\u01b4\u01b2\3\2\2\2\u01b4"+
		"\u01b5\3\2\2\2\u01b5\u01b7\3\2\2\2\u01b6\u01b4\3\2\2\2\u01b7\u01b8\7\16"+
		"\2\2\u01b8\23\3\2\2\2\u01b9\u01bf\5\26\f\2\u01ba\u01bf\5\32\16\2\u01bb"+
		"\u01bf\5\34\17\2\u01bc\u01bf\5\36\20\2\u01bd\u01bf\5 \21\2\u01be\u01b9"+
		"\3\2\2\2\u01be\u01ba\3\2\2\2\u01be\u01bb\3\2\2\2\u01be\u01bc\3\2\2\2\u01be"+
		"\u01bd\3\2\2\2\u01bf\25\3\2\2\2\u01c0\u01c1\7\t\2\2\u01c1\u01c5\7\u0090"+
		"\2\2\u01c2\u01c4\5\30\r\2\u01c3\u01c2\3\2\2\2\u01c4\u01c7\3\2\2\2\u01c5"+
		"\u01c3\3\2\2\2\u01c5\u01c6\3\2\2\2\u01c6\u01c8\3\2\2\2\u01c7\u01c5\3\2"+
		"\2\2\u01c8\u01c9\7\16\2\2\u01c9\27\3\2\2\2\u01ca\u01cd\5\64\33\2\u01cb"+
		"\u01cd\5\66\34\2\u01cc\u01ca\3\2\2\2\u01cc\u01cb\3\2\2\2\u01cd\31\3\2"+
		"\2\2\u01ce\u01cf\7\n\2\2\u01cf\u01d0\7\u0090\2\2\u01d0\u01d1\7\u0099\2"+
		"\2\u01d1\u01d5\7\u0090\2\2\u01d2\u01d4\5\30\r\2\u01d3\u01d2\3\2\2\2\u01d4"+
		"\u01d7\3\2\2\2\u01d5\u01d3\3\2\2\2\u01d5\u01d6\3\2\2\2\u01d6\u01d8\3\2"+
		"\2\2\u01d7\u01d5\3\2\2\2\u01d8\u01d9\7\16\2\2\u01d9\33\3\2\2\2\u01da\u01dd"+
		"\7\13\2\2\u01db\u01de\5\66\34\2\u01dc\u01de\5\64\33\2\u01dd\u01db\3\2"+
		"\2\2\u01dd\u01dc\3\2\2\2\u01de\35\3\2\2\2\u01df\u01e0\7\f\2\2\u01e0\u01e1"+
		"\7\u0090\2\2\u01e1\u01e2\7\u00a2\2\2\u01e2\u01e7\7\u0090\2\2\u01e3\u01e4"+
		"\7\u009e\2\2\u01e4\u01e5\5X-\2\u01e5\u01e6\7\u009d\2\2\u01e6\u01e8\3\2"+
		"\2\2\u01e7\u01e3\3\2\2\2\u01e7\u01e8\3\2\2\2\u01e8\u01ee\3\2\2\2\u01e9"+
		"\u01ed\5 \21\2\u01ea\u01ed\5\64\33\2\u01eb\u01ed\5\66\34\2\u01ec\u01e9"+
		"\3\2\2\2\u01ec\u01ea\3\2\2\2\u01ec\u01eb\3\2\2\2\u01ed\u01f0\3\2\2\2\u01ee"+
		"\u01ec\3\2\2\2\u01ee\u01ef\3\2\2\2\u01ef\u01f1\3\2\2\2\u01f0\u01ee\3\2"+
		"\2\2\u01f1\u01f2\7\16\2\2\u01f2\37\3\2\2\2\u01f3\u01f8\7\r\2\2\u01f4\u01f5"+
		"\7\u0091\2\2\u01f5\u01f6\5\\/\2\u01f6\u01f7\7\u0092\2\2\u01f7\u01f9\3"+
		"\2\2\2\u01f8\u01f4\3\2\2\2\u01f8\u01f9\3\2\2\2\u01f9\u01fa\3\2\2\2\u01fa"+
		"\u01fb\5\u0114\u008b\2\u01fb\u01fc\7\u0090\2\2\u01fc!\3\2\2\2\u01fd\u0203"+
		"\5$\23\2\u01fe\u0203\5(\25\2\u01ff\u0203\5*\26\2\u0200\u0203\5.\30\2\u0201"+
		"\u0203\5\60\31\2\u0202\u01fd\3\2\2\2\u0202\u01fe\3\2\2\2\u0202\u01ff\3"+
		"\2\2\2\u0202\u0200\3\2\2\2\u0202\u0201\3\2\2\2\u0203#\3\2\2\2\u0204\u0205"+
		"\7\17\2\2\u0205\u020b\7\u0097\2\2\u0206\u0207\7\17\2\2\u0207\u0208\5&"+
		"\24\2\u0208\u0209\7\u0097\2\2\u0209\u020b\3\2\2\2\u020a\u0204\3\2\2\2"+
		"\u020a\u0206\3\2\2\2\u020b%\3\2\2\2\u020c\u020d\7\u0091\2\2\u020d\u020e"+
		"\5\u0114\u008b\2\u020e\u020f\7\u009c\2\2\u020f\u0214\5\u0142\u00a2\2\u0210"+
		"\u0211\7\u0098\2\2\u0211\u0213\5&\24\2\u0212\u0210\3\2\2\2\u0213\u0216"+
		"\3\2\2\2\u0214\u0212\3\2\2\2\u0214\u0215\3\2\2\2\u0215\u0217\3\2\2\2\u0216"+
		"\u0214\3\2\2\2\u0217\u0218\7\u0092\2\2\u0218\'\3\2\2\2\u0219\u021a\7\20"+
		"\2\2\u021a\u021c\7\u0091\2\2\u021b\u021d\t\3\2\2\u021c\u021b\3\2\2\2\u021c"+
		"\u021d\3\2\2\2\u021d\u021e\3\2\2\2\u021e\u021f\7\u0090\2\2\u021f\u0220"+
		"\7\u0092\2\2\u0220)\3\2\2\2\u0221\u0222\7\21\2\2\u0222\u0223\7\u0091\2"+
		"\2\u0223\u0224\5\u0114\u008b\2\u0224\u0225\7\u0098\2\2\u0225\u0226\5\u015c"+
		"\u00af\2\u0226\u0227\7\u0098\2\2\u0227\u0229\7\u0091\2\2\u0228\u022a\5"+
		",\27\2\u0229\u0228\3\2\2\2\u0229\u022a\3\2\2\2\u022a\u022b\3\2\2\2\u022b"+
		"\u022c\7\u0092\2\2\u022c\u022d\3\2\2\2\u022d\u022e\7\u0098\2\2\u022e\u0230"+
		"\7\u0091\2\2\u022f\u0231\5\u0154\u00ab\2\u0230\u022f\3\2\2\2\u0230\u0231"+
		"\3\2\2\2\u0231\u0232\3\2\2\2\u0232\u0233\7\u0092\2\2\u0233\u0234\3\2\2"+
		"\2\u0234\u0235\7\u0092\2\2\u0235\u0236\7\u0097\2\2\u0236+\3\2\2\2\u0237"+
		"\u023c\5\u0114\u008b\2\u0238\u0239\7\u0098\2\2\u0239\u023b\5\u0114\u008b"+
		"\2\u023a\u0238\3\2\2\2\u023b\u023e\3\2\2\2\u023c\u023a\3\2\2\2\u023c\u023d"+
		"\3\2\2\2\u023d-\3\2\2\2\u023e\u023c\3\2\2\2\u023f\u0245\7\22\2\2\u0240"+
		"\u0242\7\u0091\2\2\u0241\u0243\5\u0108\u0085\2\u0242\u0241\3\2\2\2\u0242"+
		"\u0243\3\2\2\2\u0243\u0244\3\2\2\2\u0244\u0246\7\u0092\2\2\u0245\u0240"+
		"\3\2\2\2\u0245\u0246\3\2\2\2\u0246/\3\2\2\2\u0247\u0248\7\23\2\2\u0248"+
		"\u0251\7\u0097\2\2\u0249\u024a\7\23\2\2\u024a\u024c\7\u0091\2\2\u024b"+
		"\u024d\5\62\32\2\u024c\u024b\3\2\2\2\u024c\u024d\3\2\2\2\u024d\u024e\3"+
		"\2\2\2\u024e\u024f\7\u0092\2\2\u024f\u0251\7\u0097\2\2\u0250\u0247\3\2"+
		"\2\2\u0250\u0249\3\2\2\2\u0251\61\3\2\2\2\u0252\u0253\7\u0091\2\2\u0253"+
		"\u0254\5\u0114\u008b\2\u0254\u0255\7\u0092\2\2\u0255\u025a\5\u0142\u00a2"+
		"\2\u0256\u0257\7\u0098\2\2\u0257\u0259\5\62\32\2\u0258\u0256\3\2\2\2\u0259"+
		"\u025c\3\2\2\2\u025a\u0258\3\2\2\2\u025a\u025b\3\2\2\2\u025b\63\3\2\2"+
		"\2\u025c\u025a\3\2\2\2\u025d\u025e\7\u00ab\2\2\u025e\u0261\58\35\2\u025f"+
		"\u0261\5r:\2\u0260\u025d\3\2\2\2\u0260\u025f\3\2\2\2\u0261\65\3\2\2\2"+
		"\u0262\u0263\7\u00ac\2\2\u0263\u0266\58\35\2\u0264\u0266\5t;\2\u0265\u0262"+
		"\3\2\2\2\u0265\u0264\3\2\2\2\u0266\67\3\2\2\2\u0267\u0269\5~@\2\u0268"+
		"\u0267\3\2\2\2\u0268\u0269\3\2\2\2\u0269\u026a\3\2\2\2\u026a\u026c\5x"+
		"=\2\u026b\u026d\5\u00dco\2\u026c\u026b\3\2\2\2\u026c\u026d\3\2\2\2\u026d"+
		"\u026f\3\2\2\2\u026e\u0270\7\u0097\2\2\u026f\u026e\3\2\2\2\u026f\u0270"+
		"\3\2\2\2\u0270\u0271\3\2\2\2\u0271\u0272\5:\36\2\u0272\u0275\3\2\2\2\u0273"+
		"\u0275\5v<\2\u0274\u0268\3\2\2\2\u0274\u0273\3\2\2\2\u02759\3\2\2\2\u0276"+
		"\u027e\7\u0093\2\2\u0277\u027d\5\u00caf\2\u0278\u027d\5\u0120\u0091\2"+
		"\u0279\u027d\5\"\22\2\u027a\u027d\5> \2\u027b\u027d\5<\37\2\u027c\u0277"+
		"\3\2\2\2\u027c\u0278\3\2\2\2\u027c\u0279\3\2\2\2\u027c\u027a\3\2\2\2\u027c"+
		"\u027b\3\2\2\2\u027d\u0280\3\2\2\2\u027e\u027c\3\2\2\2\u027e\u027f\3\2"+
		"\2\2\u027f\u0281\3\2\2\2\u0280\u027e\3\2\2\2\u0281\u0284\7\u0094\2\2\u0282"+
		"\u0284\5\u0126\u0094\2\u0283\u0276\3\2\2\2\u0283\u0282\3\2\2\2\u0284;"+
		"\3\2\2\2\u0285\u0286\7\63\2\2\u0286\u0287\7\u0091\2\2\u0287\u0288\7\u00ad"+
		"\2\2\u0288\u0289\7\u0090\2\2\u0289\u028a\7\u0092\2\2\u028a\u028b\7\u0091"+
		"\2\2\u028b\u028c\5,\27\2\u028c\u0290\7\u0092\2\2\u028d\u028e\7\u009c\2"+
		"\2\u028e\u0291\5\u0142\u00a2\2\u028f\u0291\7\u0097\2\2\u0290\u028d\3\2"+
		"\2\2\u0290\u028f\3\2\2\2\u0291=\3\2\2\2\u0292\u0293\7\u0090\2\2\u0293"+
		"\u0297\7\u009e\2\2\u0294\u0296\5\u0114\u008b\2\u0295\u0294\3\2\2\2\u0296"+
		"\u0299\3\2\2\2\u0297\u0295\3\2\2\2\u0297\u0298\3\2\2\2\u0298\u029b\3\2"+
		"\2\2\u0299\u0297\3\2\2\2\u029a\u029c\7\u00f2\2\2\u029b\u029a\3\2\2\2\u029b"+
		"\u029c\3\2\2\2\u029c\u029d\3\2\2\2\u029d\u029e\7\u009d\2\2\u029e\u02a0"+
		"\7\u0091\2\2\u029f\u02a1\5\u0154\u00ab\2\u02a0\u029f\3\2\2\2\u02a0\u02a1"+
		"\3\2\2\2\u02a1\u02a2\3\2\2\2\u02a2\u02a3\7\u0092\2\2\u02a3\u02a6\3\2\2"+
		"\2\u02a4\u02a5\7\u0099\2\2\u02a5\u02a7\7\u0090\2\2\u02a6\u02a4\3\2\2\2"+
		"\u02a6\u02a7\3\2\2\2\u02a7\u02a8\3\2\2\2\u02a8\u02a9\5\u0144\u00a3\2\u02a9"+
		"\u02aa\5\u0142\u00a2\2\u02aa?\3\2\2\2\u02ab\u02ad\5B\"\2\u02ac\u02ab\3"+
		"\2\2\2\u02ad\u02b0\3\2\2\2\u02ae\u02ac\3\2\2\2\u02ae\u02af\3\2\2\2\u02af"+
		"\u02b1\3\2\2\2\u02b0\u02ae\3\2\2\2\u02b1\u02b2\7\2\2\3\u02b2A\3\2\2\2"+
		"\u02b3\u02bf\5D#\2\u02b4\u02bf\5\u00b8]\2\u02b5\u02bf\5\u00caf\2\u02b6"+
		"\u02bf\5F$\2\u02b7\u02bf\5J&\2\u02b8\u02bf\5H%\2\u02b9\u02bf\5L\'\2\u02ba"+
		"\u02bf\5P)\2\u02bb\u02bf\5T+\2\u02bc\u02bf\5V,\2\u02bd\u02bf\5\u00ba^"+
		"\2\u02be\u02b3\3\2\2\2\u02be\u02b4\3\2\2\2\u02be\u02b5\3\2\2\2\u02be\u02b6"+
		"\3\2\2\2\u02be\u02b7\3\2\2\2\u02be\u02b8\3\2\2\2\u02be\u02b9\3\2\2\2\u02be"+
		"\u02ba\3\2\2\2\u02be\u02bb\3\2\2\2\u02be\u02bc\3\2\2\2\u02be\u02bd\3\2"+
		"\2\2\u02bfC\3\2\2\2\u02c0\u02c1\7V\2\2\u02c1\u02c2\5\u015e\u00b0\2\u02c2"+
		"\u02c3\7\u0097\2\2\u02c3E\3\2\2\2\u02c4\u02c6\7\u0089\2\2\u02c5\u02c4"+
		"\3\2\2\2\u02c5\u02c6\3\2\2\2\u02c6\u02c7\3\2\2\2\u02c7\u02c8\7U\2\2\u02c8"+
		"\u02cb\5N(\2\u02c9\u02ca\7\u00a2\2\2\u02ca\u02cc\5\u015e\u00b0\2\u02cb"+
		"\u02c9\3\2\2\2\u02cb\u02cc\3\2\2\2\u02cc\u02d1\3\2\2\2\u02cd\u02ce\7\u009e"+
		"\2\2\u02ce\u02cf\5X-\2\u02cf\u02d0\7\u009d\2\2\u02d0\u02d2\3\2\2\2\u02d1"+
		"\u02cd\3\2\2\2\u02d1\u02d2\3\2\2\2\u02d2\u02d4\3\2\2\2\u02d3\u02d5\5b"+
		"\62\2\u02d4\u02d3\3\2\2\2\u02d4\u02d5\3\2\2\2\u02d5\u02d7\3\2\2\2\u02d6"+
		"\u02d8\5h\65\2\u02d7\u02d6\3\2\2\2\u02d7\u02d8\3\2\2\2\u02d8\u02d9\3\2"+
		"\2\2\u02d9\u02da\7R\2\2\u02daG\3\2\2\2\u02db\u02dc\7U\2\2\u02dc\u02dd"+
		"\5N(\2\u02dd\u02df\7\u0091\2\2\u02de\u02e0\5\u015e\u00b0\2\u02df\u02de"+
		"\3\2\2\2\u02df\u02e0\3\2\2\2\u02e0\u02e1\3\2\2\2\u02e1\u02e6\7\u0092\2"+
		"\2\u02e2\u02e3\7\u009e\2\2\u02e3\u02e4\5X-\2\u02e4\u02e5\7\u009d\2\2\u02e5"+
		"\u02e7\3\2\2\2\u02e6\u02e2\3\2\2\2\u02e6\u02e7\3\2\2\2\u02e7\u02e9\3\2"+
		"\2\2\u02e8\u02ea\5b\62\2\u02e9\u02e8\3\2\2\2\u02e9\u02ea\3\2\2\2\u02ea"+
		"\u02ec\3\2\2\2\u02eb\u02ed\5h\65\2\u02ec\u02eb\3\2\2\2\u02ec\u02ed\3\2"+
		"\2\2\u02ed\u02ee\3\2\2\2\u02ee\u02ef\7R\2\2\u02efI\3\2\2\2\u02f0\u02f1"+
		"\7T\2\2\u02f1\u02f4\5N(\2\u02f2\u02f3\7\u00a2\2\2\u02f3\u02f5\5\u015e"+
		"\u00b0\2\u02f4\u02f2\3\2\2\2\u02f4\u02f5\3\2\2\2\u02f5\u02f7\3\2\2\2\u02f6"+
		"\u02f8\5b\62\2\u02f7\u02f6\3\2\2\2\u02f7\u02f8\3\2\2\2\u02f8\u02fa\3\2"+
		"\2\2\u02f9\u02fb\5p9\2\u02fa\u02f9\3\2\2\2\u02fa\u02fb\3\2\2\2\u02fb\u02fc"+
		"\3\2\2\2\u02fc\u02fd\7R\2\2\u02fdK\3\2\2\2\u02fe\u02ff\7T\2\2\u02ff\u0300"+
		"\5N(\2\u0300\u0301\7\u0091\2\2\u0301\u0302\5\u015e\u00b0\2\u0302\u0304"+
		"\7\u0092\2\2\u0303\u0305\5p9\2\u0304\u0303\3\2\2\2\u0304\u0305\3\2\2\2"+
		"\u0305\u0306\3\2\2\2\u0306\u0307\7R\2\2\u0307M\3\2\2\2\u0308\u030e\5\u015e"+
		"\u00b0\2\u0309\u030a\7\u009e\2\2\u030a\u030b\5X-\2\u030b\u030c\7\u009d"+
		"\2\2\u030c\u030f\3\2\2\2\u030d\u030f\5\u0088E\2\u030e\u0309\3\2\2\2\u030e"+
		"\u030d\3\2\2\2\u030e\u030f\3\2\2\2\u030fO\3\2\2\2\u0310\u0311\7X\2\2\u0311"+
		"\u0316\5`\61\2\u0312\u0313\7\u009e\2\2\u0313\u0314\5X-\2\u0314\u0315\7"+
		"\u009d\2\2\u0315\u0317\3\2\2\2\u0316\u0312\3\2\2\2\u0316\u0317\3\2\2\2"+
		"\u0317\u031b\3\2\2\2\u0318\u031a\5R*\2\u0319\u0318\3\2\2\2\u031a\u031d"+
		"\3\2\2\2\u031b\u0319\3\2\2\2\u031b\u031c\3\2\2\2\u031c\u031e\3\2\2\2\u031d"+
		"\u031b\3\2\2\2\u031e\u031f\7R\2\2\u031fQ\3\2\2\2\u0320\u0324\t\4\2\2\u0321"+
		"\u0323\5h\65\2\u0322\u0321\3\2\2\2\u0323\u0326\3\2\2\2\u0324\u0322\3\2"+
		"\2\2\u0324\u0325\3\2\2\2\u0325\u032d\3\2\2\2\u0326\u0324\3\2\2\2\u0327"+
		"\u0329\5h\65\2\u0328\u0327\3\2\2\2\u0329\u032a\3\2\2\2\u032a\u0328\3\2"+
		"\2\2\u032a\u032b\3\2\2\2\u032b\u032d\3\2\2\2\u032c\u0320\3\2\2\2\u032c"+
		"\u0328\3\2\2\2\u032dS\3\2\2\2\u032e\u032f\7X\2\2\u032f\u0330\5X-\2\u0330"+
		"\u0331\7\u0097\2\2\u0331U\3\2\2\2\u0332\u0333\7O\2\2\u0333\u0338\5\u015e"+
		"\u00b0\2\u0334\u0335\7\u0098\2\2\u0335\u0337\5\u015e\u00b0\2\u0336\u0334"+
		"\3\2\2\2\u0337\u033a\3\2\2\2\u0338\u0336\3\2\2\2\u0338\u0339\3\2\2\2\u0339"+
		"\u033b\3\2\2\2\u033a\u0338\3\2\2\2\u033b\u033c\7\u0097\2\2\u033cW\3\2"+
		"\2\2\u033d\u0342\5`\61\2\u033e\u033f\7\u0098\2\2\u033f\u0341\5`\61\2\u0340"+
		"\u033e\3\2\2\2\u0341\u0344\3\2\2\2\u0342\u0340\3\2\2\2\u0342\u0343\3\2"+
		"\2\2\u0343Y\3\2\2\2\u0344\u0342\3\2\2\2\u0345\u034a\7[\2\2\u0346\u0347"+
		"\7\u0091\2\2\u0347\u0348\5\\/\2\u0348\u0349\7\u0092\2\2\u0349\u034b\3"+
		"\2\2\2\u034a\u0346\3\2\2\2\u034a\u034b\3\2\2\2\u034b\u034d\3\2\2\2\u034c"+
		"\u034e\5\u00e6t\2\u034d\u034c\3\2\2\2\u034d\u034e\3\2\2\2\u034e\u0350"+
		"\3\2\2\2\u034f\u0351\7\u0088\2\2\u0350\u034f\3\2\2\2\u0350\u0351\3\2\2"+
		"\2\u0351\u0352\3\2\2\2\u0352\u0353\5\u00e2r\2\u0353[\3\2\2\2\u0354\u0359"+
		"\5^\60\2\u0355\u0356\7\u0098\2\2\u0356\u0358\5^\60\2\u0357\u0355\3\2\2"+
		"\2\u0358\u035b\3\2\2\2\u0359\u0357\3\2\2\2\u0359\u035a\3\2\2\2\u035a]"+
		"\3\2\2\2\u035b\u0359\3\2\2\2\u035c\u0371\7d\2\2\u035d\u0371\7e\2\2\u035e"+
		"\u0371\7\u0081\2\2\u035f\u0371\7\u0084\2\2\u0360\u0371\7f\2\2\u0361\u0371"+
		"\7}\2\2\u0362\u0371\7\u0085\2\2\u0363\u0371\7~\2\2\u0364\u0371\7\u0082"+
		"\2\2\u0365\u0371\7\u0083\2\2\u0366\u0367\7\177\2\2\u0367\u0368\7\u009c"+
		"\2\2\u0368\u0371\5\u015e\u00b0\2\u0369\u036a\7\u0080\2\2\u036a\u036b\7"+
		"\u009c\2\2\u036b\u036c\5\u015e\u00b0\2\u036c\u036d\7\u00a2\2\2\u036d\u0371"+
		"\3\2\2\2\u036e\u0371\5\u00eav\2\u036f\u0371\5\u015e\u00b0\2\u0370\u035c"+
		"\3\2\2\2\u0370\u035d\3\2\2\2\u0370\u035e\3\2\2\2\u0370\u035f\3\2\2\2\u0370"+
		"\u0360\3\2\2\2\u0370\u0361\3\2\2\2\u0370\u0362\3\2\2\2\u0370\u0363\3\2"+
		"\2\2\u0370\u0364\3\2\2\2\u0370\u0365\3\2\2\2\u0370\u0366\3\2\2\2\u0370"+
		"\u0369\3\2\2\2\u0370\u036e\3\2\2\2\u0370\u036f\3\2\2\2\u0371_\3\2\2\2"+
		"\u0372\u0373\7\u009e\2\2\u0373\u0374\5X-\2\u0374\u0375\7\u009d\2\2\u0375"+
		"\u037b\3\2\2\2\u0376\u0378\t\5\2\2\u0377\u0376\3\2\2\2\u0377\u0378\3\2"+
		"\2\2\u0378\u0379\3\2\2\2\u0379\u037b\5\u015e\u00b0\2\u037a\u0372\3\2\2"+
		"\2\u037a\u0377\3\2\2\2\u037ba\3\2\2\2\u037c\u0380\7\u0093\2\2\u037d\u037f"+
		"\5d\63\2\u037e\u037d\3\2\2\2\u037f\u0382\3\2\2\2\u0380\u037e\3\2\2\2\u0380"+
		"\u0381\3\2\2\2\u0381\u0383\3\2\2\2\u0382\u0380\3\2\2\2\u0383\u0384\7\u0094"+
		"\2\2\u0384c\3\2\2\2\u0385\u0389\5f\64\2\u0386\u0388\5\u00e2r\2\u0387\u0386"+
		"\3\2\2\2\u0388\u038b\3\2\2\2\u0389\u0387\3\2\2\2\u0389\u038a\3\2\2\2\u038a"+
		"\u0392\3\2\2\2\u038b\u0389\3\2\2\2\u038c\u038e\5\u00e2r\2\u038d\u038c"+
		"\3\2\2\2\u038e\u038f\3\2\2\2\u038f\u038d\3\2\2\2\u038f\u0390\3\2\2\2\u0390"+
		"\u0392\3\2\2\2\u0391\u0385\3\2\2\2\u0391\u038d\3\2\2\2\u0392e\3\2\2\2"+
		"\u0393\u0394\t\6\2\2\u0394g\3\2\2\2\u0395\u039b\5\u00caf\2\u0396\u039b"+
		"\5j\66\2\u0397\u039b\5l\67\2\u0398\u039b\5Z.\2\u0399\u039b\5\u00b8]\2"+
		"\u039a\u0395\3\2\2\2\u039a\u0396\3\2\2\2\u039a\u0397\3\2\2\2\u039a\u0398"+
		"\3\2\2\2\u039a\u0399\3\2\2\2\u039b\u039c\3\2\2\2\u039c\u039a\3\2\2\2\u039c"+
		"\u039d\3\2\2\2\u039di\3\2\2\2\u039e\u039f\7\u00ab\2\2\u039f\u03a0\5n8"+
		"\2\u03a0k\3\2\2\2\u03a1\u03a2\7\u00ac\2\2\u03a2\u03a3\5n8\2\u03a3m\3\2"+
		"\2\2\u03a4\u03a6\5~@\2\u03a5\u03a4\3\2\2\2\u03a5\u03a6\3\2\2\2\u03a6\u03a7"+
		"\3\2\2\2\u03a7\u03a9\5x=\2\u03a8\u03aa\5\u010c\u0087\2\u03a9\u03a8\3\2"+
		"\2\2\u03a9\u03aa\3\2\2\2\u03aa\u03ab\3\2\2\2\u03ab\u03ac\7\u0097\2\2\u03ac"+
		"o\3\2\2\2\u03ad\u03b3\5\u00ba^\2\u03ae\u03b3\5\u00caf\2\u03af\u03b3\5"+
		"r:\2\u03b0\u03b3\5t;\2\u03b1\u03b3\5\u0080A\2\u03b2\u03ad\3\2\2\2\u03b2"+
		"\u03ae\3\2\2\2\u03b2\u03af\3\2\2\2\u03b2\u03b0\3\2\2\2\u03b2\u03b1\3\2"+
		"\2\2\u03b3\u03b4\3\2\2\2\u03b4\u03b2\3\2\2\2\u03b4\u03b5\3\2\2\2\u03b5"+
		"q\3\2\2\2\u03b6\u03b7\7\u00ab\2\2\u03b7\u03b8\5v<\2\u03b8s\3\2\2\2\u03b9"+
		"\u03ba\7\u00ac\2\2\u03ba\u03bb\5v<\2\u03bbu\3\2\2\2\u03bc\u03be\5~@\2"+
		"\u03bd\u03bc\3\2\2\2\u03bd\u03be\3\2\2\2\u03be\u03bf\3\2\2\2\u03bf\u03c1"+
		"\5x=\2\u03c0\u03c2\5\u00dco\2\u03c1\u03c0\3\2\2\2\u03c1\u03c2\3\2\2\2"+
		"\u03c2\u03c4\3\2\2\2\u03c3\u03c5\7\u0097\2\2\u03c4\u03c3\3\2\2\2\u03c4"+
		"\u03c5\3\2\2\2\u03c5\u03c6\3\2\2\2\u03c6\u03c7\5\u0126\u0094\2\u03c7w"+
		"\3\2\2\2\u03c8\u03d3\5|?\2\u03c9\u03cb\5z>\2\u03ca\u03c9\3\2\2\2\u03cb"+
		"\u03cc\3\2\2\2\u03cc\u03ca\3\2\2\2\u03cc\u03cd\3\2\2\2\u03cd\u03d0\3\2"+
		"\2\2\u03ce\u03cf\7\u0098\2\2\u03cf\u03d1\7\u00bd\2\2\u03d0\u03ce\3\2\2"+
		"\2\u03d0\u03d1\3\2\2\2\u03d1\u03d3\3\2\2\2\u03d2\u03c8\3\2\2\2\u03d2\u03ca"+
		"\3\2\2\2\u03d3y\3\2\2\2\u03d4\u03d6\5|?\2\u03d5\u03d4\3\2\2\2\u03d5\u03d6"+
		"\3\2\2\2\u03d6\u03d7\3\2\2\2\u03d7\u03db\7\u00a2\2\2\u03d8\u03da\5~@\2"+
		"\u03d9\u03d8\3\2\2\2\u03da\u03dd\3\2\2\2\u03db\u03d9\3\2\2\2\u03db\u03dc"+
		"\3\2\2\2\u03dc\u03df\3\2\2\2\u03dd\u03db\3\2\2\2\u03de\u03e0\5\u00e8u"+
		"\2\u03df\u03de\3\2\2\2\u03df\u03e0\3\2\2\2\u03e0\u03e1\3\2\2\2\u03e1\u03e2"+
		"\5\u015e\u00b0\2\u03e2{\3\2\2\2\u03e3\u03e6\5\u015e\u00b0\2\u03e4\u03e6"+
		"\7)\2\2\u03e5\u03e3\3\2\2\2\u03e5\u03e4\3\2\2\2\u03e6}\3\2\2\2\u03e7\u03e8"+
		"\7\u0091\2\2\u03e8\u03e9\5\u0114\u008b\2\u03e9\u03ea\7\u0092\2\2\u03ea"+
		"\177\3\2\2\2\u03eb\u03ec\7a\2\2\u03ec\u03ed\5\u0082B\2\u03ed\u03ee\7\u0097"+
		"\2\2\u03ee\u03f4\3\2\2\2\u03ef\u03f0\7P\2\2\u03f0\u03f1\5\u0082B\2\u03f1"+
		"\u03f2\7\u0097\2\2\u03f2\u03f4\3\2\2\2\u03f3\u03eb\3\2\2\2\u03f3\u03ef"+
		"\3\2\2\2\u03f4\u0081\3\2\2\2\u03f5\u03fa\5\u0084C\2\u03f6\u03f7\7\u0098"+
		"\2\2\u03f7\u03f9\5\u0084C\2\u03f8\u03f6\3\2\2\2\u03f9\u03fc\3\2\2\2\u03fa"+
		"\u03f8\3\2\2\2\u03fa\u03fb\3\2\2\2\u03fb\u0083\3\2\2\2\u03fc\u03fa\3\2"+
		"\2\2\u03fd\u0400\5\u015e\u00b0\2\u03fe\u03ff\7\u009c\2\2\u03ff\u0401\5"+
		"\u015e\u00b0\2\u0400\u03fe\3\2\2\2\u0400\u0401\3\2\2\2\u0401\u0085\3\2"+
		"\2\2\u0402\u0404\5\u00eav\2\u0403\u0402\3\2\2\2\u0403\u0404\3\2\2\2\u0404"+
		"\u0405\3\2\2\2\u0405\u0407\5\u00f4{\2\u0406\u0408\5\u00eav\2\u0407\u0406"+
		"\3\2\2\2\u0407\u0408\3\2\2\2\u0408\u0409\3\2\2\2\u0409\u040a\7\u0091\2"+
		"\2\u040a\u040d\7\u00b1\2\2\u040b\u040e\5\u00eav\2\u040c\u040e\5\u00f4"+
		"{\2\u040d\u040b\3\2\2\2\u040d\u040c\3\2\2\2\u040d\u040e\3\2\2\2\u040e"+
		"\u040f\3\2\2\2\u040f\u0411\7\u0092\2\2\u0410\u0412\5\u0094K\2\u0411\u0410"+
		"\3\2\2\2\u0411\u0412\3\2\2\2\u0412\u0087\3\2\2\2\u0413\u041c\7\u009e\2"+
		"\2\u0414\u0419\5\u008aF\2\u0415\u0416\7\u0098\2\2\u0416\u0418\5\u008a"+
		"F\2\u0417\u0415\3\2\2\2\u0418\u041b\3\2\2\2\u0419\u0417\3\2\2\2\u0419"+
		"\u041a\3\2\2\2\u041a\u041d\3\2\2\2\u041b\u0419\3\2\2\2\u041c\u0414\3\2"+
		"\2\2\u041c\u041d\3\2\2\2\u041d\u041e\3\2\2\2\u041e\u041f\7\u009d\2\2\u041f"+
		"\u0089\3\2\2\2\u0420\u0422\5\u00eex\2\u0421\u0420\3\2\2\2\u0422\u0425"+
		"\3\2\2\2\u0423\u0421\3\2\2\2\u0423\u0424\3\2\2\2\u0424\u0426\3\2\2\2\u0425"+
		"\u0423\3\2\2\2\u0426\u0427\5\u00f4{\2\u0427\u008b\3\2\2\2\u0428\u0429"+
		"\7\u009b\2\2\u0429\u0435\7\u0093\2\2\u042a\u042f\5\u008eH\2\u042b\u042c"+
		"\7\u0098\2\2\u042c\u042e\5\u008eH\2\u042d\u042b\3\2\2\2\u042e\u0431\3"+
		"\2\2\2\u042f\u042d\3\2\2\2\u042f\u0430\3\2\2\2\u0430\u0433\3\2\2\2\u0431"+
		"\u042f\3\2\2\2\u0432\u0434\7\u0098\2\2\u0433\u0432\3\2\2\2\u0433\u0434"+
		"\3\2\2\2\u0434\u0436\3\2\2\2\u0435\u042a\3\2\2\2\u0435\u0436\3\2\2\2\u0436"+
		"\u0437\3\2\2\2\u0437\u0438\7\u0094\2\2\u0438\u008d\3\2\2\2\u0439\u043a"+
		"\5\u0146\u00a4\2\u043a\u043b\7\u00a2\2\2\u043b\u043c\5\u0142\u00a2\2\u043c"+
		"\u008f\3\2\2\2\u043d\u043e\7\u009b\2\2\u043e\u0443\7\u0095\2\2\u043f\u0441"+
		"\5\u0140\u00a1\2\u0440\u0442\7\u0098\2\2\u0441\u0440\3\2\2\2\u0441\u0442"+
		"\3\2\2\2\u0442\u0444\3\2\2\2\u0443\u043f\3\2\2\2\u0443\u0444\3\2\2\2\u0444"+
		"\u0445\3\2\2\2\u0445\u0446\7\u0096\2\2\u0446\u0091\3\2\2\2\u0447\u0448"+
		"\7\u009b\2\2\u0448\u0449\7\u0091\2\2\u0449\u044a\5\u0142\u00a2\2\u044a"+
		"\u044b\7\u0092\2\2\u044b\u0452\3\2\2\2\u044c\u044f\7\u009b\2\2\u044d\u0450"+
		"\5\u015a\u00ae\2\u044e\u0450\5\u015e\u00b0\2\u044f\u044d\3\2\2\2\u044f"+
		"\u044e\3\2\2\2\u0450\u0452\3\2\2\2\u0451\u0447\3\2\2\2\u0451\u044c\3\2"+
		"\2\2\u0452\u0093\3\2\2\2\u0453\u045f\7\u0091\2\2\u0454\u0457\5\u0096L"+
		"\2\u0455\u0457\7\63\2\2\u0456\u0454\3\2\2\2\u0456\u0455\3\2\2\2\u0457"+
		"\u045c\3\2\2\2\u0458\u0459\7\u0098\2\2\u0459\u045b\5\u0096L\2\u045a\u0458"+
		"\3\2\2\2\u045b\u045e\3\2\2\2\u045c\u045a\3\2\2\2\u045c\u045d\3\2\2\2\u045d"+
		"\u0460\3\2\2\2\u045e\u045c\3\2\2\2\u045f\u0456\3\2\2\2\u045f\u0460\3\2"+
		"\2\2\u0460\u0461\3\2\2\2\u0461\u0462\7\u0092\2\2\u0462\u0095\3\2\2\2\u0463"+
		"\u0466\5\u00acW\2\u0464\u0466\5\u0114\u008b\2\u0465\u0463\3\2\2\2\u0465"+
		"\u0464\3\2\2\2\u0466\u0097\3\2\2\2\u0467\u0469\7\u00b1\2\2\u0468\u046a"+
		"\5\u00f4{\2\u0469\u0468\3\2\2\2\u0469\u046a\3\2\2\2\u046a\u046c\3\2\2"+
		"\2\u046b\u046d\5\u00eav\2\u046c\u046b\3\2\2\2\u046c\u046d\3\2\2\2\u046d"+
		"\u046f\3\2\2\2\u046e\u0470\5\u0094K\2\u046f\u046e\3\2\2\2\u046f\u0470"+
		"\3\2\2\2\u0470\u0471\3\2\2\2\u0471\u0472\5\u0126\u0094\2\u0472\u0099\3"+
		"\2\2\2\u0473\u0474\7\u0095\2\2\u0474\u0475\5\u009cO\2\u0475\u0476\5\u009e"+
		"P\2\u0476\u0477\7\u0096\2\2\u0477\u009b\3\2\2\2\u0478\u047b\5\u0142\u00a2"+
		"\2\u0479\u047b\5\u00f4{\2\u047a\u0478\3\2\2\2\u047a\u0479\3\2\2\2\u047b"+
		"\u009d\3\2\2\2\u047c\u0483\5|?\2\u047d\u047f\5\u00a0Q\2\u047e\u047d\3"+
		"\2\2\2\u047f\u0480\3\2\2\2\u0480\u047e\3\2\2\2\u0480\u0481\3\2\2\2\u0481"+
		"\u0483\3\2\2\2\u0482\u047c\3\2\2\2\u0482\u047e\3\2\2\2\u0483\u009f\3\2"+
		"\2\2\u0484\u0486\5|?\2\u0485\u0484\3\2\2\2\u0485\u0486\3\2\2\2\u0486\u0487"+
		"\3\2\2\2\u0487\u0488\7\u00a2\2\2\u0488\u048d\5\u00a2R\2\u0489\u048a\7"+
		"\u0098\2\2\u048a\u048c\5\u00a2R\2\u048b\u0489\3\2\2\2\u048c\u048f\3\2"+
		"\2\2\u048d\u048b\3\2\2\2\u048d\u048e\3\2\2\2\u048e\u00a1\3\2\2\2\u048f"+
		"\u048d\3\2\2\2\u0490\u0492\5\u0140\u00a1\2\u0491\u0493\5\u00eav\2\u0492"+
		"\u0491\3\2\2\2\u0492\u0493\3\2\2\2\u0493\u0498\3\2\2\2\u0494\u0495\7\u0093"+
		"\2\2\u0495\u0496\5\u0112\u008a\2\u0496\u0497\7\u0094\2\2\u0497\u0499\3"+
		"\2\2\2\u0498\u0494\3\2\2\2\u0498\u0499\3\2\2\2\u0499\u00a3\3\2\2\2\u049a"+
		"\u049b\7_\2\2\u049b\u049c\7\u0091\2\2\u049c\u049d\5\u00a6T\2\u049d\u049e"+
		"\7\u0092\2\2\u049e\u00a5\3\2\2\2\u049f\u04a9\5|?\2\u04a0\u04a2\5|?\2\u04a1"+
		"\u04a0\3\2\2\2\u04a1\u04a2\3\2\2\2\u04a2\u04a3\3\2\2\2\u04a3\u04a5\7\u00a2"+
		"\2\2\u04a4\u04a1\3\2\2\2\u04a5\u04a6\3\2\2\2\u04a6\u04a4\3\2\2\2\u04a6"+
		"\u04a7\3\2\2\2\u04a7\u04a9\3\2\2\2\u04a8\u049f\3\2\2\2\u04a8\u04a4\3\2"+
		"\2\2\u04a9\u00a7\3\2\2\2\u04aa\u04ab\7X\2\2\u04ab\u04ac\7\u0091\2\2\u04ac"+
		"\u04ad\5`\61\2\u04ad\u04ae\7\u0092\2\2\u04ae\u00a9\3\2\2\2\u04af\u04b0"+
		"\7Q\2\2\u04b0\u04b1\7\u0091\2\2\u04b1\u04b2\5\u0114\u008b\2\u04b2\u04b3"+
		"\7\u0092\2\2\u04b3\u00ab\3\2\2\2\u04b4\u04b5\5\u00d8m\2\u04b5\u04b6\5"+
		"\u011e\u0090\2\u04b6\u00ad\3\2\2\2\u04b7\u04b8\7b\2\2\u04b8\u04b9\7\u0091"+
		"\2\2\u04b9\u04ba\5\u015e\u00b0\2\u04ba\u04bb\7\u0092\2\2\u04bb\u04bf\3"+
		"\2\2\2\u04bc\u04bd\7b\2\2\u04bd\u04bf\5\u0142\u00a2\2\u04be\u04b7\3\2"+
		"\2\2\u04be\u04bc\3\2\2\2\u04bf\u00af\3\2\2\2\u04c0\u04c1\7c\2\2\u04c1"+
		"\u04c5\5\u0126\u0094\2\u04c2\u04c4\5\u00b2Z\2\u04c3\u04c2\3\2\2\2\u04c4"+
		"\u04c7\3\2\2\2\u04c5\u04c3\3\2\2\2\u04c5\u04c6\3\2\2\2\u04c6\u04ca\3\2"+
		"\2\2\u04c7\u04c5\3\2\2\2\u04c8\u04c9\7S\2\2\u04c9\u04cb\5\u0126\u0094"+
		"\2\u04ca\u04c8\3\2\2\2\u04ca\u04cb\3\2\2\2\u04cb\u00b1\3\2\2\2\u04cc\u04cd"+
		"\7N\2\2\u04cd\u04ce\7\u0091\2\2\u04ce\u04cf\5\u00acW\2\u04cf\u04d0\7\u0092"+
		"\2\2\u04d0\u04d1\5\u0126\u0094\2\u04d1\u00b3\3\2\2\2\u04d2\u04d3\7`\2"+
		"\2\u04d3\u04d4\7\u0091\2\2\u04d4\u04d5\5\u0142\u00a2\2\u04d5\u04d6\7\u0092"+
		"\2\2\u04d6\u04d7\5\u0126\u0094\2\u04d7\u00b5\3\2\2\2\u04d8\u04d9\7M\2"+
		"\2\u04d9\u04da\5\u0126\u0094\2\u04da\u00b7\3\2\2\2\u04db\u04dc\5\u00bc"+
		"_\2\u04dc\u04dd\7\u0097\2\2\u04dd\u00b9\3\2\2\2\u04de\u04df\5\u00bc_\2"+
		"\u04df\u04e0\5\u0126\u0094\2\u04e0\u00bb\3\2\2\2\u04e1\u04e3\5\u00d8m"+
		"\2\u04e2\u04e1\3\2\2\2\u04e2\u04e3\3\2\2\2\u04e3\u04e4\3\2\2\2\u04e4\u04e5"+
		"\5\u015e\u00b0\2\u04e5\u04e7\7\u0091\2\2\u04e6\u04e8\5\u0108\u0085\2\u04e7"+
		"\u04e6\3\2\2\2\u04e7\u04e8\3\2\2\2\u04e8\u04e9\3\2\2\2\u04e9\u04ea\7\u0092"+
		"\2\2\u04ea\u04ec\3\2\2\2\u04eb\u04ed\5\u00dan\2\u04ec\u04eb\3\2\2\2\u04ec"+
		"\u04ed\3\2\2\2\u04ed\u00bd\3\2\2\2\u04ee\u04f0\5\u00c0a\2\u04ef\u04f1"+
		"\5\u00c2b\2\u04f0\u04ef\3\2\2\2\u04f0\u04f1\3\2\2\2\u04f1\u00bf\3\2\2"+
		"\2\u04f2\u04f5\7\30\2\2\u04f3\u04f5\5\u015e\u00b0\2\u04f4\u04f2\3\2\2"+
		"\2\u04f4\u04f3\3\2\2\2\u04f5\u00c1\3\2\2\2\u04f6\u04f8\7\u0091\2\2\u04f7"+
		"\u04f9\5\u00c4c\2\u04f8\u04f7\3\2\2\2\u04f8\u04f9\3\2\2\2\u04f9\u04fa"+
		"\3\2\2\2\u04fa\u04fb\7\u0092\2\2\u04fb\u00c3\3\2\2\2\u04fc\u0501\5\u00c6"+
		"d\2\u04fd\u04fe\7\u0098\2\2\u04fe\u0500\5\u00c6d\2\u04ff\u04fd\3\2\2\2"+
		"\u0500\u0503\3\2\2\2\u0501\u04ff\3\2\2\2\u0501\u0502\3\2\2\2\u0502\u00c5"+
		"\3\2\2\2\u0503\u0501\3\2\2\2\u0504\u0509\5\u00be`\2\u0505\u0509\5\u015a"+
		"\u00ae\2\u0506\u0509\5\u015c\u00af\2\u0507\u0509\5\u00c8e\2\u0508\u0504"+
		"\3\2\2\2\u0508\u0505\3\2\2\2\u0508\u0506\3\2\2\2\u0508\u0507\3\2\2\2\u0509"+
		"\u00c7\3\2\2\2\u050a\u050b\5\u00c0a\2\u050b\u050f\7\u009c\2\2\u050c\u0510"+
		"\5\u015a\u00ae\2\u050d\u0510\5\u00c0a\2\u050e\u0510\5\u015c\u00af\2\u050f"+
		"\u050c\3\2\2\2\u050f\u050d\3\2\2\2\u050f\u050e\3\2\2\2\u0510\u00c9\3\2"+
		"\2\2\u0511\u0516\5\u00ccg\2\u0512\u0516\5\u00ceh\2\u0513\u0516\5\u00d0"+
		"i\2\u0514\u0516\5\u00d2j\2\u0515\u0511\3\2\2\2\u0515\u0512\3\2\2\2\u0515"+
		"\u0513\3\2\2\2\u0515\u0514\3\2\2\2\u0516\u00cb\3\2\2\2\u0517\u0519\5\u00da"+
		"n\2\u0518\u0517\3\2\2\2\u0518\u0519\3\2\2\2\u0519\u051a\3\2\2\2\u051a"+
		"\u051c\5\u015e\u00b0\2\u051b\u051d\5\u00dan\2\u051c\u051b\3\2\2\2\u051c"+
		"\u051d\3\2\2\2\u051d\u051e\3\2\2\2\u051e\u051f\7\u0091\2\2\u051f\u0520"+
		"\5\u0104\u0083\2\u0520\u0521\7\u0092\2\2\u0521\u0522\7\u0097\2\2\u0522"+
		"\u00cd\3\2\2\2\u0523\u0525\5\u00dan\2\u0524\u0523\3\2\2\2\u0524\u0525"+
		"\3\2\2\2\u0525\u0527\3\2\2\2\u0526\u0528\7\60\2\2\u0527\u0526\3\2\2\2"+
		"\u0527\u0528\3\2\2\2\u0528\u0529\3\2\2\2\u0529\u052b\5\u00fc\177\2\u052a"+
		"\u052c\5\u015e\u00b0\2\u052b\u052a\3\2\2\2\u052b\u052c\3\2\2\2\u052c\u052d"+
		"\3\2\2\2\u052d\u052e\7\u0097\2\2\u052e\u00cf\3\2\2\2\u052f\u0530\5\u00d8"+
		"m\2\u0530\u0531\5\u00dco\2\u0531\u0534\3\2\2\2\u0532\u0534\5\u00d8m\2"+
		"\u0533\u052f\3\2\2\2\u0533\u0532\3\2\2\2\u0534\u0535\3\2\2\2\u0535\u0536"+
		"\7\u0097\2\2\u0536\u00d1\3\2\2\2\u0537\u0539\5\u00dan\2\u0538\u0537\3"+
		"\2\2\2\u0538\u0539\3\2\2\2\u0539\u053a\3\2\2\2\u053a\u053f\7\60\2\2\u053b"+
		"\u053c\5\u00d8m\2\u053c\u053d\5\u00d4k\2\u053d\u0540\3\2\2\2\u053e\u0540"+
		"\5\u00d8m\2\u053f\u053b\3\2\2\2\u053f\u053e\3\2\2\2\u0540\u0541\3\2\2"+
		"\2\u0541\u0542\7\u0097\2\2\u0542\u00d3\3\2\2\2\u0543\u0548\5\u00d6l\2"+
		"\u0544\u0545\7\u0098\2\2\u0545\u0547\5\u00d6l\2\u0546\u0544\3\2\2\2\u0547"+
		"\u054a\3\2\2\2\u0548\u0546\3\2\2\2\u0548\u0549\3\2\2\2\u0549\u00d5\3\2"+
		"\2\2\u054a\u0548\3\2\2\2\u054b\u054d\5\u010a\u0086\2\u054c\u054b\3\2\2"+
		"\2\u054c\u054d\3\2\2\2\u054d\u054e\3\2\2\2\u054e\u054f\5\u0104\u0083\2"+
		"\u054f\u00d7\3\2\2\2\u0550\u0559\5\u00ecw\2\u0551\u0559\5\u00dan\2\u0552"+
		"\u0559\5\u00e8u\2\u0553\u0559\5\u00eav\2\u0554\u0559\5\u00e6t\2\u0555"+
		"\u0559\5\u00eex\2\u0556\u0559\5\u00f0y\2\u0557\u0559\5\u00f4{\2\u0558"+
		"\u0550\3\2\2\2\u0558\u0551\3\2\2\2\u0558\u0552\3\2\2\2\u0558\u0553\3\2"+
		"\2\2\u0558\u0554\3\2\2\2\u0558\u0555\3\2\2\2\u0558\u0556\3\2\2\2\u0558"+
		"\u0557\3\2\2\2\u0559\u055a\3\2\2\2\u055a\u0558\3\2\2\2\u055a\u055b\3\2"+
		"\2\2\u055b\u00d9\3\2\2\2\u055c\u055d\7g\2\2\u055d\u055e\7\u0091\2\2\u055e"+
		"\u055f\7\u0091\2\2\u055f\u0564\5\u00be`\2\u0560\u0561\7\u0098\2\2\u0561"+
		"\u0563\5\u00be`\2\u0562\u0560\3\2\2\2\u0563\u0566\3\2\2\2\u0564\u0562"+
		"\3\2\2\2\u0564\u0565\3\2\2\2\u0565\u0567\3\2\2\2\u0566\u0564\3\2\2\2\u0567"+
		"\u0568\7\u0092\2\2\u0568\u0569\7\u0092\2\2\u0569\u00db\3\2\2\2\u056a\u056f"+
		"\5\u00dep\2\u056b\u056c\7\u0098\2\2\u056c\u056e\5\u00dep\2\u056d\u056b"+
		"\3\2\2\2\u056e\u0571\3\2\2\2\u056f\u056d\3\2\2\2\u056f\u0570\3\2\2\2\u0570"+
		"\u00dd\3\2\2\2\u0571\u056f\3\2\2\2\u0572\u0575\5\u011e\u0090\2\u0573\u0574"+
		"\7\u009c\2\2\u0574\u0576\5\u0148\u00a5\2\u0575\u0573\3\2\2\2\u0575\u0576"+
		"\3\2\2\2\u0576\u00df\3\2\2\2\u0577\u0584\t\7\2\2\u0578\u0585\5\u015e\u00b0"+
		"\2\u0579\u057b\5\u015e\u00b0\2\u057a\u0579\3\2\2\2\u057a\u057b\3\2\2\2"+
		"\u057b\u057c\3\2\2\2\u057c\u057e\7\u0093\2\2\u057d\u057f\5\u00e2r\2\u057e"+
		"\u057d\3\2\2\2\u057f\u0580\3\2\2\2\u0580\u057e\3\2\2\2\u0580\u0581\3\2"+
		"\2\2\u0581\u0582\3\2\2\2\u0582\u0583\7\u0094\2\2\u0583\u0585\3\2\2\2\u0584"+
		"\u0578\3\2\2\2\u0584\u057a\3\2\2\2\u0585\u00e1\3\2\2\2\u0586\u0587\5\u00e4"+
		"s\2\u0587\u0589\5\u00f8}\2\u0588\u058a\5\u010c\u0087\2\u0589\u0588\3\2"+
		"\2\2\u0589\u058a\3\2\2\2\u058a\u058b\3\2\2\2\u058b\u058c\7\u0097\2\2\u058c"+
		"\u00e3\3\2\2\2\u058d\u0594\5\u00e8u\2\u058e\u0594\5\u00eav\2\u058f\u0594"+
		"\5\u00e6t\2\u0590\u0594\5\u00eex\2\u0591\u0594\5\u00f0y\2\u0592\u0594"+
		"\5\u00f4{\2\u0593\u058d\3\2\2\2\u0593\u058e\3\2\2\2\u0593\u058f\3\2\2"+
		"\2\u0593\u0590\3\2\2\2\u0593\u0591\3\2\2\2\u0593\u0592\3\2\2\2\u0594\u0595"+
		"\3\2\2\2\u0595\u0593\3\2\2\2\u0595\u0596\3\2\2\2\u0596\u00e5\3\2\2\2\u0597"+
		"\u0598\7\u0087\2\2\u0598\u0599\7\u0091\2\2\u0599\u059a\5\u015e\u00b0\2"+
		"\u059a\u059b\7\u0092\2\2\u059b\u059e\3\2\2\2\u059c\u059e\7\u0086\2\2\u059d"+
		"\u0597\3\2\2\2\u059d\u059c\3\2\2\2\u059e\u00e7\3\2\2\2\u059f\u05a0\t\b"+
		"\2\2\u05a0\u00e9\3\2\2\2\u05a1\u05a2\t\t\2\2\u05a2\u00eb\3\2\2\2\u05a3"+
		"\u05a4\t\n\2\2\u05a4\u00ed\3\2\2\2\u05a5\u05a6\t\13\2\2\u05a6\u00ef\3"+
		"\2\2\2\u05a7\u05ac\7\30\2\2\u05a8\u05ac\7\64\2\2\u05a9\u05ac\7(\2\2\u05aa"+
		"\u05ac\5\u00f2z\2\u05ab\u05a7\3\2\2\2\u05ab\u05a8\3\2\2\2\u05ab\u05a9"+
		"\3\2\2\2\u05ab\u05aa\3\2\2\2\u05ac\u00f1\3\2\2\2\u05ad\u05ae\t\f\2\2\u05ae"+
		"\u00f3\3\2\2\2\u05af\u05c1\7\63\2\2\u05b0\u05c1\7\27\2\2\u05b1\u05c1\7"+
		"*\2\2\u05b2\u05c1\7%\2\2\u05b3\u05c1\7&\2\2\u05b4\u05c1\7 \2\2\u05b5\u05c1"+
		"\7\34\2\2\u05b6\u05c1\7+\2\2\u05b7\u05c1\7\62\2\2\u05b8\u05c1\5\u00f6"+
		"|\2\u05b9\u05c1\5N(\2\u05ba\u05c1\5\u00e0q\2\u05bb\u05c1\5\u00fc\177\2"+
		"\u05bc\u05be\5\u015e\u00b0\2\u05bd\u05bf\5\u010a\u0086\2\u05be\u05bd\3"+
		"\2\2\2\u05be\u05bf\3\2\2\2\u05bf\u05c1\3\2\2\2\u05c0\u05af\3\2\2\2\u05c0"+
		"\u05b0\3\2\2\2\u05c0\u05b1\3\2\2\2\u05c0\u05b2\3\2\2\2\u05c0\u05b3\3\2"+
		"\2\2\u05c0\u05b4\3\2\2\2\u05c0\u05b5\3\2\2\2\u05c0\u05b6\3\2\2\2\u05c0"+
		"\u05b7\3\2\2\2\u05c0\u05b8\3\2\2\2\u05c0\u05b9\3\2\2\2\u05c0\u05ba\3\2"+
		"\2\2\u05c0\u05bb\3\2\2\2\u05c0\u05bc\3\2\2\2\u05c1\u00f5\3\2\2\2\u05c2"+
		"\u05c3\7r\2\2\u05c3\u05c4\7\u0091\2\2\u05c4\u05c5\5\u0142\u00a2\2\u05c5"+
		"\u05c6\7\u0092\2\2\u05c6\u00f7\3\2\2\2\u05c7\u05cc\5\u00fa~\2\u05c8\u05c9"+
		"\7\u0098\2\2\u05c9\u05cb\5\u00fa~\2\u05ca\u05c8\3\2\2\2\u05cb\u05ce\3"+
		"\2\2\2\u05cc\u05ca\3\2\2\2\u05cc\u05cd\3\2\2\2\u05cd\u00f9\3\2\2\2\u05ce"+
		"\u05cc\3\2\2\2\u05cf\u05d6\5\u011e\u0090\2\u05d0\u05d2\5\u011e\u0090\2"+
		"\u05d1\u05d0\3\2\2\2\u05d1\u05d2\3\2\2\2\u05d2\u05d3\3\2\2\2\u05d3\u05d4"+
		"\7\u00a2\2\2\u05d4\u05d6\5\u015a\u00ae\2\u05d5\u05cf\3\2\2\2\u05d5\u05d1"+
		"\3\2\2\2\u05d6\u00fb\3\2\2\2\u05d7\u05dd\7\36\2\2\u05d8\u05da\5\u015e"+
		"\u00b0\2\u05d9\u05d8\3\2\2\2\u05d9\u05da\3\2\2\2\u05da\u05db\3\2\2\2\u05db"+
		"\u05dc\7\u00a2\2\2\u05dc\u05de\5\u0114\u008b\2\u05dd\u05d9\3\2\2\2\u05dd"+
		"\u05de\3\2\2\2\u05de\u05ea\3\2\2\2\u05df\u05e4\5\u015e\u00b0\2\u05e0\u05e1"+
		"\7\u0093\2\2\u05e1\u05e2\5\u00fe\u0080\2\u05e2\u05e3\7\u0094\2\2\u05e3"+
		"\u05e5\3\2\2\2\u05e4\u05e0\3\2\2\2\u05e4\u05e5\3\2\2\2\u05e5\u05eb\3\2"+
		"\2\2\u05e6\u05e7\7\u0093\2\2\u05e7\u05e8\5\u00fe\u0080\2\u05e8\u05e9\7"+
		"\u0094\2\2\u05e9\u05eb\3\2\2\2\u05ea\u05df\3\2\2\2\u05ea\u05e6\3\2\2\2"+
		"\u05eb\u05f7\3\2\2\2\u05ec\u05ed\t\r\2\2\u05ed\u05ee\7\u0091\2\2\u05ee"+
		"\u05ef\5\u0114\u008b\2\u05ef\u05f0\7\u0098\2\2\u05f0\u05f1\5\u015e\u00b0"+
		"\2\u05f1\u05f2\7\u0092\2\2\u05f2\u05f3\7\u0093\2\2\u05f3\u05f4\5\u00fe"+
		"\u0080\2\u05f4\u05f5\7\u0094\2\2\u05f5\u05f7\3\2\2\2\u05f6\u05d7\3\2\2"+
		"\2\u05f6\u05ec\3\2\2\2\u05f7\u00fd\3\2\2\2\u05f8\u05fd\5\u0100\u0081\2"+
		"\u05f9\u05fa\7\u0098\2\2\u05fa\u05fc\5\u0100\u0081\2\u05fb\u05f9\3\2\2"+
		"\2\u05fc\u05ff\3\2\2\2\u05fd\u05fb\3\2\2\2\u05fd\u05fe\3\2\2\2\u05fe\u0601"+
		"\3\2\2\2\u05ff\u05fd\3\2\2\2\u0600\u0602\7\u0098\2\2\u0601\u0600\3\2\2"+
		"\2\u0601\u0602\3\2\2\2\u0602\u00ff\3\2\2\2\u0603\u0606\5\u0102\u0082\2"+
		"\u0604\u0605\7\u009c\2\2\u0605\u0607\5\u0142\u00a2\2\u0606\u0604\3\2\2"+
		"\2\u0606\u0607\3\2\2\2\u0607\u0101\3\2\2\2\u0608\u060b\5\u015e\u00b0\2"+
		"\u0609\u060b\7\32\2\2\u060a\u0608\3\2\2\2\u060a\u0609\3\2\2\2\u060b\u0103"+
		"\3\2\2\2\u060c\u0612\5\u015e\u00b0\2\u060d\u060e\7\u0091\2\2\u060e\u060f"+
		"\5\u011e\u0090\2\u060f\u0610\7\u0092\2\2\u0610\u0612\3\2\2\2\u0611\u060c"+
		"\3\2\2\2\u0611\u060d\3\2\2\2\u0612\u0616\3\2\2\2\u0613\u0615\5\u0106\u0084"+
		"\2\u0614\u0613\3\2\2\2\u0615\u0618\3\2\2\2\u0616\u0614\3\2\2\2\u0616\u0617"+
		"\3\2\2\2\u0617\u0624\3\2\2\2\u0618\u0616\3\2\2\2\u0619\u061a\7\u0091\2"+
		"\2\u061a\u061c\7\u00b1\2\2\u061b\u061d\5\u00eav\2\u061c\u061b\3\2\2\2"+
		"\u061c\u061d\3\2\2\2\u061d\u061f\3\2\2\2\u061e\u0620\5\u015e\u00b0\2\u061f"+
		"\u061e\3\2\2\2\u061f\u0620\3\2\2\2\u0620\u0621\3\2\2\2\u0621\u0622\7\u0092"+
		"\2\2\u0622\u0624\5\u0094K\2\u0623\u0611\3\2\2\2\u0623\u0619\3\2\2\2\u0624"+
		"\u0105\3\2\2\2\u0625\u0627\7\u0095\2\2\u0626\u0628\5\u014a\u00a6\2\u0627"+
		"\u0626\3\2\2\2\u0627\u0628\3\2\2\2\u0628\u0629\3\2\2\2\u0629\u062a\7\u0096"+
		"\2\2\u062a\u0107\3\2\2\2\u062b\u062e\5\u011a\u008e\2\u062c\u062d\7\u0098"+
		"\2\2\u062d\u062f\7\u00bd\2\2\u062e\u062c\3\2\2\2\u062e\u062f\3\2\2\2\u062f"+
		"\u0109\3\2\2\2\u0630\u0632\7\u00ad\2\2\u0631\u0633\5\u00d8m\2\u0632\u0631"+
		"\3\2\2\2\u0632\u0633\3\2\2\2\u0633\u0635\3\2\2\2\u0634\u0636\5\u010a\u0086"+
		"\2\u0635\u0634\3\2\2\2\u0635\u0636\3\2\2\2\u0636\u010b\3\2\2\2\u0637\u0643"+
		"\5\u015e\u00b0\2\u0638\u0639\7\u0091\2\2\u0639\u063e\5\u0158\u00ad\2\u063a"+
		"\u063b\7\u0098\2\2\u063b\u063d\5\u0158\u00ad\2\u063c\u063a\3\2\2\2\u063d"+
		"\u0640\3\2\2\2\u063e\u063c\3\2\2\2\u063e\u063f\3\2\2\2\u063f\u0641\3\2"+
		"\2\2\u0640\u063e\3\2\2\2\u0641\u0642\7\u0092\2\2\u0642\u0644\3\2\2\2\u0643"+
		"\u0638\3\2\2\2\u0643\u0644\3\2\2\2\u0644\u010d\3\2\2\2\u0645\u064a\7\u0093"+
		"\2\2\u0646\u0648\5\u0140\u00a1\2\u0647\u0649\7\u0098\2\2\u0648\u0647\3"+
		"\2\2\2\u0648\u0649\3\2\2\2\u0649\u064b\3\2\2\2\u064a\u0646\3\2\2\2\u064a"+
		"\u064b\3\2\2\2\u064b\u064c\3\2\2\2\u064c\u064d\7\u0094\2\2\u064d\u010f"+
		"\3\2\2\2\u064e\u065c\7\u0093\2\2\u064f\u0650\7\u0099\2\2\u0650\u0656\5"+
		"\u0142\u00a2\2\u0651\u0652\7\u0098\2\2\u0652\u0653\7\u0099\2\2\u0653\u0655"+
		"\5\u0142\u00a2\2\u0654\u0651\3\2\2\2\u0655\u0658\3\2\2\2\u0656\u0654\3"+
		"\2\2\2\u0656\u0657\3\2\2\2\u0657\u065a\3\2\2\2\u0658\u0656\3\2\2\2\u0659"+
		"\u065b\7\u0098\2\2\u065a\u0659\3\2\2\2\u065a\u065b\3\2\2\2\u065b\u065d"+
		"\3\2\2\2\u065c\u064f\3\2\2\2\u065c\u065d\3\2\2\2\u065d\u065e\3\2\2\2\u065e"+
		"\u065f\7\u0094\2\2\u065f\u0111\3\2\2\2\u0660\u0665\5\u0148\u00a5\2\u0661"+
		"\u0662\7\u0098\2\2\u0662\u0664\5\u0148\u00a5\2\u0663\u0661\3\2\2\2\u0664"+
		"\u0667\3\2\2\2\u0665\u0663\3\2\2\2\u0665\u0666\3\2\2\2\u0666\u0669\3\2"+
		"\2\2\u0667\u0665\3\2\2\2\u0668\u066a\7\u0098\2\2\u0669\u0668\3\2\2\2\u0669"+
		"\u066a\3\2\2\2\u066a\u0113\3\2\2\2\u066b\u066d\5\u00e4s\2\u066c\u066e"+
		"\5\u0116\u008c\2\u066d\u066c\3\2\2\2\u066d\u066e\3\2\2\2\u066e\u0671\3"+
		"\2\2\2\u066f\u0671\5\u0086D\2\u0670\u066b\3\2\2\2\u0670\u066f\3\2\2\2"+
		"\u0671\u0115\3\2\2\2\u0672\u0674\5\u010a\u0086\2\u0673\u0675\5\u0116\u008c"+
		"\2\u0674\u0673\3\2\2\2\u0674\u0675\3\2\2\2\u0675\u068a\3\2\2\2\u0676\u0678"+
		"\7\u0091\2\2\u0677\u0679\5\u0116\u008c\2\u0678\u0677\3\2\2\2\u0678\u0679"+
		"\3\2\2\2\u0679\u067a\3\2\2\2\u067a\u067c\7\u0092\2\2\u067b\u067d\5\u0118"+
		"\u008d\2\u067c\u067b\3\2\2\2\u067d\u067e\3\2\2\2\u067e\u067c\3\2\2\2\u067e"+
		"\u067f\3\2\2\2\u067f\u068a\3\2\2\2\u0680\u0682\7\u0095\2\2\u0681\u0683"+
		"\5\u014a\u00a6\2\u0682\u0681\3\2\2\2\u0682\u0683\3\2\2\2\u0683\u0684\3"+
		"\2\2\2\u0684\u0686\7\u0096\2\2\u0685\u0680\3\2\2\2\u0686\u0687\3\2\2\2"+
		"\u0687\u0685\3\2\2\2\u0687\u0688\3\2\2\2\u0688\u068a\3\2\2\2\u0689\u0672"+
		"\3\2\2\2\u0689\u0676\3\2\2\2\u0689\u0685\3\2\2\2\u068a\u0117\3\2\2\2\u068b"+
		"\u068d\7\u0095\2\2\u068c\u068e\5\u014a\u00a6\2\u068d\u068c\3\2\2\2\u068d"+
		"\u068e\3\2\2\2\u068e\u068f\3\2\2\2\u068f\u0696\7\u0096\2\2\u0690\u0692"+
		"\7\u0091\2\2\u0691\u0693\5\u011a\u008e\2\u0692\u0691\3\2\2\2\u0692\u0693"+
		"\3\2\2\2\u0693\u0694\3\2\2\2\u0694\u0696\7\u0092\2\2\u0695\u068b\3\2\2"+
		"\2\u0695\u0690\3\2\2\2\u0696\u0119\3\2\2\2\u0697\u069c\5\u011c\u008f\2"+
		"\u0698\u0699\7\u0098\2\2\u0699\u069b\5\u011c\u008f\2\u069a\u0698\3\2\2"+
		"\2\u069b\u069e\3\2\2\2\u069c\u069a\3\2\2\2\u069c\u069d\3\2\2\2\u069d\u011b"+
		"\3\2\2\2\u069e\u069c\3\2\2\2\u069f\u06a0\5\u00d8m\2\u06a0\u06a1\5\u011e"+
		"\u0090\2\u06a1\u06a4\3\2\2\2\u06a2\u06a4\7\63\2\2\u06a3\u069f\3\2\2\2"+
		"\u06a3\u06a2\3\2\2\2\u06a4\u011d\3\2\2\2\u06a5\u06a7\5\u010a\u0086\2\u06a6"+
		"\u06a5\3\2\2\2\u06a6\u06a7\3\2\2\2\u06a7\u06a8\3\2\2\2\u06a8\u06a9\5\u0104"+
		"\u0083\2\u06a9\u011f\3\2\2\2\u06aa\u06ac\5\u0122\u0092\2\u06ab\u06ad\7"+
		"\u0097\2\2\u06ac\u06ab\3\2\2\2\u06ac\u06ad\3\2\2\2\u06ad\u06d4\3\2\2\2"+
		"\u06ae\u06b0\5\u0126\u0094\2\u06af\u06b1\7\u0097\2\2\u06b0\u06af\3\2\2"+
		"\2\u06b0\u06b1\3\2\2\2\u06b1\u06d4\3\2\2\2\u06b2\u06b4\5\u0128\u0095\2"+
		"\u06b3\u06b5\7\u0097\2\2\u06b4\u06b3\3\2\2\2\u06b4\u06b5\3\2\2\2\u06b5"+
		"\u06d4\3\2\2\2\u06b6\u06b8\5\u0132\u009a\2\u06b7\u06b9\7\u0097\2\2\u06b8"+
		"\u06b7\3\2\2\2\u06b8\u06b9\3\2\2\2\u06b9\u06d4\3\2\2\2\u06ba\u06bc\5\u013e"+
		"\u00a0\2\u06bb\u06bd\7\u0097\2\2\u06bc\u06bb\3\2\2\2\u06bc\u06bd\3\2\2"+
		"\2\u06bd\u06d4\3\2\2\2\u06be\u06c0\5\u00b4[\2\u06bf\u06c1\7\u0097\2\2"+
		"\u06c0\u06bf\3\2\2\2\u06c0\u06c1\3\2\2\2\u06c1\u06d4\3\2\2\2\u06c2\u06c4"+
		"\5\u00b6\\\2\u06c3\u06c5\7\u0097\2\2\u06c4\u06c3\3\2\2\2\u06c4\u06c5\3"+
		"\2\2\2\u06c5\u06d4\3\2\2\2\u06c6\u06c8\5\u00aeX\2\u06c7\u06c9\7\u0097"+
		"\2\2\u06c8\u06c7\3\2\2\2\u06c8\u06c9\3\2\2\2\u06c9\u06d4\3\2\2\2\u06ca"+
		"\u06cc\5\u00b0Y\2\u06cb\u06cd\7\u0097\2\2\u06cc\u06cb\3\2\2\2\u06cc\u06cd"+
		"\3\2\2\2\u06cd\u06d4\3\2\2\2\u06ce\u06d0\5\u0140\u00a1\2\u06cf\u06d1\7"+
		"\u0097\2\2\u06d0\u06cf\3\2\2\2\u06d0\u06d1\3\2\2\2\u06d1\u06d4\3\2\2\2"+
		"\u06d2\u06d4\7\u0097\2\2\u06d3\u06aa\3\2\2\2\u06d3\u06ae\3\2\2\2\u06d3"+
		"\u06b2\3\2\2\2\u06d3\u06b6\3\2\2\2\u06d3\u06ba\3\2\2\2\u06d3\u06be\3\2"+
		"\2\2\u06d3\u06c2\3\2\2\2\u06d3\u06c6\3\2\2\2\u06d3\u06ca\3\2\2\2\u06d3"+
		"\u06ce\3\2\2\2\u06d3\u06d2\3\2\2\2\u06d4\u0121\3\2\2\2\u06d5\u06d6\5\u015e"+
		"\u00b0\2\u06d6\u06d7\7\u00a2\2\2\u06d7\u06d8\5\u0120\u0091\2\u06d8\u0123"+
		"\3\2\2\2\u06d9\u06dc\5\u014a\u00a6\2\u06da\u06db\7\u00bd\2\2\u06db\u06dd"+
		"\5\u014a\u00a6\2\u06dc\u06da\3\2\2\2\u06dc\u06dd\3\2\2\2\u06dd\u0125\3"+
		"\2\2\2\u06de\u06e3\7\u0093\2\2\u06df\u06e2\5\u00caf\2\u06e0\u06e2\5\u0120"+
		"\u0091\2\u06e1\u06df\3\2\2\2\u06e1\u06e0\3\2\2\2\u06e2\u06e5\3\2\2\2\u06e3"+
		"\u06e1\3\2\2\2\u06e3\u06e4\3\2\2\2\u06e4\u06e6\3\2\2\2\u06e5\u06e3\3\2"+
		"\2\2\u06e6\u06e7\7\u0094\2\2\u06e7\u0127\3\2\2\2\u06e8\u06e9\7#\2\2\u06e9"+
		"\u06ea\7\u0091\2\2\u06ea\u06eb\5\u0142\u00a2\2\u06eb\u06ec\7\u0092\2\2"+
		"\u06ec\u06ef\5\u0120\u0091\2\u06ed\u06ee\7\35\2\2\u06ee\u06f0\5\u0120"+
		"\u0091\2\u06ef\u06ed\3\2\2\2\u06ef\u06f0\3\2\2\2\u06f0\u06f3\3\2\2\2\u06f1"+
		"\u06f3\5\u012a\u0096\2\u06f2\u06e8\3\2\2\2\u06f2\u06f1\3\2\2\2\u06f3\u0129"+
		"\3\2\2\2\u06f4\u06f5\7/\2\2\u06f5\u06f6\7\u0091\2\2\u06f6\u06f7\5\u0142"+
		"\u00a2\2\u06f7\u06f8\7\u0092\2\2\u06f8\u06f9\5\u012c\u0097\2\u06f9\u012b"+
		"\3\2\2\2\u06fa\u06fe\7\u0093\2\2\u06fb\u06fd\5\u012e\u0098\2\u06fc\u06fb"+
		"\3\2\2\2\u06fd\u0700\3\2\2\2\u06fe\u06fc\3\2\2\2\u06fe\u06ff\3\2\2\2\u06ff"+
		"\u0701\3\2\2\2\u0700\u06fe\3\2\2\2\u0701\u0702\7\u0094\2\2\u0702\u012d"+
		"\3\2\2\2\u0703\u0705\5\u0130\u0099\2\u0704\u0703\3\2\2\2\u0705\u0706\3"+
		"\2\2\2\u0706\u0704\3\2\2\2\u0706\u0707\3\2\2\2\u0707\u0709\3\2\2\2\u0708"+
		"\u070a\5\u0120\u0091\2\u0709\u0708\3\2\2\2\u070a\u070b\3\2\2\2\u070b\u0709"+
		"\3\2\2\2\u070b\u070c\3\2\2\2\u070c\u012f\3\2\2\2\u070d\u0713\7\26\2\2"+
		"\u070e\u0714\5\u0124\u0093\2\u070f\u0710\7\u0091\2\2\u0710\u0711\5\u0124"+
		"\u0093\2\u0711\u0712\7\u0092\2\2\u0712\u0714\3\2\2\2\u0713\u070e\3\2\2"+
		"\2\u0713\u070f\3\2\2\2\u0714\u0715\3\2\2\2\u0715\u0716\7\u00a2\2\2\u0716"+
		"\u071a\3\2\2\2\u0717\u0718\7\32\2\2\u0718\u071a\7\u00a2\2\2\u0719\u070d"+
		"\3\2\2\2\u0719\u0717\3\2\2\2\u071a\u0131\3\2\2\2\u071b\u0720\5\u0134\u009b"+
		"\2\u071c\u0720\5\u0136\u009c\2\u071d\u0720\5\u0138\u009d\2\u071e\u0720"+
		"\5\u013c\u009f\2\u071f\u071b\3\2\2\2\u071f\u071c\3\2\2\2\u071f\u071d\3"+
		"\2\2\2\u071f\u071e\3\2\2\2\u0720\u0133\3\2\2\2\u0721\u0722\7\65\2\2\u0722"+
		"\u0723\7\u0091\2\2\u0723\u0724\5\u0142\u00a2\2\u0724\u0725\7\u0092\2\2"+
		"\u0725\u0726\5\u0120\u0091\2\u0726\u0135\3\2\2\2\u0727\u0728\7\33\2\2"+
		"\u0728\u0729\5\u0120\u0091\2\u0729\u072a\7\65\2\2\u072a\u072b\7\u0091"+
		"\2\2\u072b\u072c\5\u0142\u00a2\2\u072c\u072d\7\u0092\2\2\u072d\u072e\7"+
		"\u0097\2\2\u072e\u0137\3\2\2\2\u072f\u0730\7!\2\2\u0730\u0732\7\u0091"+
		"\2\2\u0731\u0733\5\u013a\u009e\2\u0732\u0731\3\2\2\2\u0732\u0733\3\2\2"+
		"\2\u0733\u0734\3\2\2\2\u0734\u0736\7\u0097\2\2\u0735\u0737\5\u0142\u00a2"+
		"\2\u0736\u0735\3\2\2\2\u0736\u0737\3\2\2\2\u0737\u0738\3\2\2\2\u0738\u073a"+
		"\7\u0097\2\2\u0739\u073b\5\u0140\u00a1\2\u073a\u0739\3\2\2\2\u073a\u073b"+
		"\3\2\2\2\u073b\u073c\3\2\2\2\u073c\u073d\7\u0092\2\2\u073d\u073e\5\u0120"+
		"\u0091\2\u073e\u0139\3\2\2\2\u073f\u0740\5\u00d8m\2\u0740\u0741\5\u00dc"+
		"o\2\u0741\u0744\3\2\2\2\u0742\u0744\5\u0140\u00a1\2\u0743\u073f\3\2\2"+
		"\2\u0743\u0742\3\2\2\2\u0744\u013b\3\2\2\2\u0745\u0746\7!\2\2\u0746\u0747"+
		"\7\u0091\2\2\u0747\u0748\5\u00acW\2\u0748\u074a\7A\2\2\u0749\u074b\5\u0142"+
		"\u00a2\2\u074a\u0749\3\2\2\2\u074a\u074b\3\2\2\2\u074b\u074c\3\2\2\2\u074c"+
		"\u074d\7\u0092\2\2\u074d\u074e\5\u0120\u0091\2\u074e\u013d\3\2\2\2\u074f"+
		"\u0750\7\"\2\2\u0750\u0758\5\u015e\u00b0\2\u0751\u0758\7\31\2\2\u0752"+
		"\u0758\7\25\2\2\u0753\u0755\7)\2\2\u0754\u0756\5\u0142\u00a2\2\u0755\u0754"+
		"\3\2\2\2\u0755\u0756\3\2\2\2\u0756\u0758\3\2\2\2\u0757\u074f\3\2\2\2\u0757"+
		"\u0751\3\2\2\2\u0757\u0752\3\2\2\2\u0757\u0753\3\2\2\2\u0758\u013f\3\2"+
		"\2\2\u0759\u075e\5\u0142\u00a2\2\u075a\u075b\7\u0098\2\2\u075b\u075d\5"+
		"\u0142\u00a2\2\u075c\u075a\3\2\2\2\u075d\u0760\3\2\2\2\u075e\u075c\3\2"+
		"\2\2\u075e\u075f\3\2\2\2\u075f\u0141\3\2\2\2\u0760\u075e\3\2\2\2\u0761"+
		"\u0762\b\u00a2\1\2\u0762\u076c\5\u0146\u00a4\2\u0763\u0764\7\u0091\2\2"+
		"\u0764\u0765\5\u0126\u0094\2\u0765\u0766\7\u0092\2\2\u0766\u076c\3\2\2"+
		"\2\u0767\u0768\5\u014c\u00a7\2\u0768\u0769\5\u0144\u00a3\2\u0769\u076a"+
		"\5\u0142\u00a2\3\u076a\u076c\3\2\2\2\u076b\u0761\3\2\2\2\u076b\u0763\3"+
		"\2\2\2\u076b\u0767\3\2\2\2\u076c\u0799\3\2\2\2\u076d\u076e\f\17\2\2\u076e"+
		"\u076f\t\16\2\2\u076f\u0798\5\u0142\u00a2\20\u0770\u0771\f\16\2\2\u0771"+
		"\u0772\t\3\2\2\u0772\u0798\5\u0142\u00a2\17\u0773\u0778\f\r\2\2\u0774"+
		"\u0775\7\u009e\2\2\u0775\u0779\7\u009e\2\2\u0776\u0777\7\u009d\2\2\u0777"+
		"\u0779\7\u009d\2\2\u0778\u0774\3\2\2\2\u0778\u0776\3\2\2\2\u0779\u077a"+
		"\3\2\2\2\u077a\u0798\5\u0142\u00a2\16\u077b\u077c\f\f\2\2\u077c\u077d"+
		"\t\17\2\2\u077d\u0798\5\u0142\u00a2\r\u077e\u077f\f\13\2\2\u077f\u0780"+
		"\t\20\2\2\u0780\u0798\5\u0142\u00a2\f\u0781\u0782\f\n\2\2\u0782\u0783"+
		"\7\u00af\2\2\u0783\u0798\5\u0142\u00a2\13\u0784\u0785\f\t\2\2\u0785\u0786"+
		"\7\u00b1\2\2\u0786\u0798\5\u0142\u00a2\n\u0787\u0788\f\b\2\2\u0788\u0789"+
		"\7\u00b0\2\2\u0789\u0798\5\u0142\u00a2\t\u078a\u078b\f\7\2\2\u078b\u078c"+
		"\7\u00a7\2\2\u078c\u0798\5\u0142\u00a2\b\u078d\u078e\f\6\2\2\u078e\u078f"+
		"\7\u00a8\2\2\u078f\u0798\5\u0142\u00a2\7\u0790\u0791\f\5\2\2\u0791\u0793"+
		"\7\u00a1\2\2\u0792\u0794\5\u0142\u00a2\2\u0793\u0792\3\2\2\2\u0793\u0794"+
		"\3\2\2\2\u0794\u0795\3\2\2\2\u0795\u0796\7\u00a2\2\2\u0796\u0798\5\u0142"+
		"\u00a2\6\u0797\u076d\3\2\2\2\u0797\u0770\3\2\2\2\u0797\u0773\3\2\2\2\u0797"+
		"\u077b\3\2\2\2\u0797\u077e\3\2\2\2\u0797\u0781\3\2\2\2\u0797\u0784\3\2"+
		"\2\2\u0797\u0787\3\2\2\2\u0797\u078a\3\2\2\2\u0797\u078d\3\2\2\2\u0797"+
		"\u0790\3\2\2\2\u0798\u079b\3\2\2\2\u0799\u0797\3\2\2\2\u0799\u079a\3\2"+
		"\2\2\u079a\u0143\3\2\2\2\u079b\u0799\3\2\2\2\u079c\u079d\t\21\2\2\u079d"+
		"\u0145\3\2\2\2\u079e\u07a8\5\u014c\u00a7\2\u079f\u07a0\7\u0091\2\2\u07a0"+
		"\u07a1\5\u0114\u008b\2\u07a1\u07a2\7\u0092\2\2\u07a2\u07a5\3\2\2\2\u07a3"+
		"\u07a6\5\u0146\u00a4\2\u07a4\u07a6\5\u0148\u00a5\2\u07a5\u07a3\3\2\2\2"+
		"\u07a5\u07a4\3\2\2\2\u07a6\u07a8\3\2\2\2\u07a7\u079e\3\2\2\2\u07a7\u079f"+
		"\3\2\2\2\u07a8\u0147\3\2\2\2\u07a9\u07ad\5\u0142\u00a2\2\u07aa\u07ad\5"+
		"\u010e\u0088\2\u07ab\u07ad\5\u0110\u0089\2\u07ac\u07a9\3\2\2\2\u07ac\u07aa"+
		"\3\2\2\2\u07ac\u07ab\3\2\2\2\u07ad\u0149\3\2\2\2\u07ae\u07b1\5\u015e\u00b0"+
		"\2\u07af\u07b1\5\u015a\u00ae\2\u07b0\u07ae\3\2\2\2\u07b0\u07af\3\2\2\2"+
		"\u07b1\u014b\3\2\2\2\u07b2\u07c1\5\u0150\u00a9\2\u07b3\u07b9\7,\2\2\u07b4"+
		"\u07ba\5\u014c\u00a7\2\u07b5\u07b6\7\u0091\2\2\u07b6\u07b7\5\u00f4{\2"+
		"\u07b7\u07b8\7\u0092\2\2\u07b8\u07ba\3\2\2\2\u07b9\u07b4\3\2\2\2\u07b9"+
		"\u07b5\3\2\2\2\u07ba\u07c1\3\2\2\2\u07bb\u07bc\t\22\2\2\u07bc\u07c1\5"+
		"\u014c\u00a7\2\u07bd\u07be\5\u014e\u00a8\2\u07be\u07bf\5\u0146\u00a4\2"+
		"\u07bf\u07c1\3\2\2\2\u07c0\u07b2\3\2\2\2\u07c0\u07b3\3\2\2\2\u07c0\u07bb"+
		"\3\2\2\2\u07c0\u07bd\3\2\2\2\u07c1\u014d\3\2\2\2\u07c2\u07c3\t\23\2\2"+
		"\u07c3\u014f\3\2\2\2\u07c4\u07c5\b\u00a9\1\2\u07c5\u07c9\5\u0158\u00ad"+
		"\2\u07c6\u07c8\5\u0152\u00aa\2\u07c7\u07c6\3\2\2\2\u07c8\u07cb\3\2\2\2"+
		"\u07c9\u07c7\3\2\2\2\u07c9\u07ca\3\2\2\2\u07ca\u07d7\3\2\2\2\u07cb\u07c9"+
		"\3\2\2\2\u07cc\u07cd\f\3\2\2\u07cd\u07ce\t\24\2\2\u07ce\u07d2\5\u015e"+
		"\u00b0\2\u07cf\u07d1\5\u0152\u00aa\2\u07d0\u07cf\3\2\2\2\u07d1\u07d4\3"+
		"\2\2\2\u07d2\u07d0\3\2\2\2\u07d2\u07d3\3\2\2\2\u07d3\u07d6\3\2\2\2\u07d4"+
		"\u07d2\3\2\2\2\u07d5\u07cc\3\2\2\2\u07d6\u07d9\3\2\2\2\u07d7\u07d5\3\2"+
		"\2\2\u07d7\u07d8\3\2\2\2\u07d8\u0151\3\2\2\2\u07d9\u07d7\3\2\2\2\u07da"+
		"\u07db\7\u0095\2\2\u07db\u07dc\5\u0142\u00a2\2\u07dc\u07dd\7\u0096\2\2"+
		"\u07dd\u07ed\3\2\2\2\u07de\u07e0\7\u0091\2\2\u07df\u07e1\5\u0154\u00ab"+
		"\2\u07e0\u07df\3\2\2\2\u07e0\u07e1\3\2\2\2\u07e1\u07e2\3\2\2\2\u07e2\u07ed"+
		"\7\u0092\2\2\u07e3\u07e6\7\u0091\2\2\u07e4\u07e7\7\u0098\2\2\u07e5\u07e7"+
		"\n\25\2\2\u07e6\u07e4\3\2\2\2\u07e6\u07e5\3\2\2\2\u07e7\u07e8\3\2\2\2"+
		"\u07e8\u07e6\3\2\2\2\u07e8\u07e9\3\2\2\2\u07e9\u07ea\3\2\2\2\u07ea\u07ed"+
		"\7\u0092\2\2\u07eb\u07ed\t\22\2\2\u07ec\u07da\3\2\2\2\u07ec\u07de\3\2"+
		"\2\2\u07ec\u07e3\3\2\2\2\u07ec\u07eb\3\2\2\2\u07ed\u0153\3\2\2\2\u07ee"+
		"\u07f3\5\u0156\u00ac\2\u07ef\u07f0\7\u0098\2\2\u07f0\u07f2\5\u0156\u00ac"+
		"\2\u07f1\u07ef\3\2\2\2\u07f2\u07f5\3\2\2\2\u07f3\u07f1\3\2\2\2\u07f3\u07f4"+
		"\3\2\2\2\u07f4\u0155\3\2\2\2\u07f5\u07f3\3\2\2\2\u07f6\u07f9\5\u0142\u00a2"+
		"\2\u07f7\u07f9\5\u00f4{\2\u07f8\u07f6\3\2\2\2\u07f8\u07f7\3\2\2\2\u07f9"+
		"\u0157\3\2\2\2\u07fa\u080a\5\u015e\u00b0\2\u07fb\u080a\5\u015a\u00ae\2"+
		"\u07fc\u080a\5\u015c\u00af\2\u07fd\u07fe\7\u0091\2\2\u07fe\u07ff\5\u0142"+
		"\u00a2\2\u07ff\u0800\7\u0092\2\2\u0800\u080a\3\2\2\2\u0801\u080a\5\u009a"+
		"N\2\u0802\u080a\5\u00a4S\2\u0803\u080a\5\u00a8U\2\u0804\u080a\5\u00aa"+
		"V\2\u0805\u080a\5\u008cG\2\u0806\u080a\5\u0090I\2\u0807\u080a\5\u0092"+
		"J\2\u0808\u080a\5\u0098M\2\u0809\u07fa\3\2\2\2\u0809\u07fb\3\2\2\2\u0809"+
		"\u07fc\3\2\2\2\u0809\u07fd\3\2\2\2\u0809\u0801\3\2\2\2\u0809\u0802\3\2"+
		"\2\2\u0809\u0803\3\2\2\2\u0809\u0804\3\2\2\2\u0809\u0805\3\2\2\2\u0809"+
		"\u0806\3\2\2\2\u0809\u0807\3\2\2\2\u0809\u0808\3\2\2\2\u080a\u0159\3\2"+
		"\2\2\u080b\u081e\7\u00c0\2\2\u080c\u081e\7\u00c1\2\2\u080d\u081e\7\u00c2"+
		"\2\2\u080e\u0810\t\3\2\2\u080f\u080e\3\2\2\2\u080f\u0810\3\2\2\2\u0810"+
		"\u0811\3\2\2\2\u0811\u081e\7\u00c3\2\2\u0812\u0814\t\3\2\2\u0813\u0812"+
		"\3\2\2\2\u0813\u0814\3\2\2\2\u0814\u0815\3\2\2\2\u0815\u081e\7\u00c4\2"+
		"\2\u0816\u081e\7\u00be\2\2\u0817\u081e\7C\2\2\u0818\u081e\7E\2\2\u0819"+
		"\u081e\7L\2\2\u081a\u081e\7D\2\2\u081b\u081e\79\2\2\u081c\u081e\7:\2\2"+
		"\u081d\u080b\3\2\2\2\u081d\u080c\3\2\2\2\u081d\u080d\3\2\2\2\u081d\u080f"+
		"\3\2\2\2\u081d\u0813\3\2\2\2\u081d\u0816\3\2\2\2\u081d\u0817\3\2\2\2\u081d"+
		"\u0818\3\2\2\2\u081d\u0819\3\2\2\2\u081d\u081a\3\2\2\2\u081d\u081b\3\2"+
		"\2\2\u081d\u081c\3\2\2\2\u081e\u015b\3\2\2\2\u081f\u0823\7\u00bf\2\2\u0820"+
		"\u0822\t\26\2\2\u0821\u0820\3\2\2\2\u0822\u0825\3\2\2\2\u0823\u0821\3"+
		"\2\2\2\u0823\u0824\3\2\2\2\u0824\u0826\3\2\2\2\u0825\u0823\3\2\2\2\u0826"+
		"\u0828\7\u00cb\2\2\u0827\u081f\3\2\2\2\u0828\u0829\3\2\2\2\u0829\u0827"+
		"\3\2\2\2\u0829\u082a\3\2\2\2\u082a\u015d\3\2\2\2\u082b\u082c\t\27\2\2"+
		"\u082c\u015f\3\2\2\2\u010d\u0162\u0164\u016f\u0178\u0185\u0189\u0197\u019b"+
		"\u01ad\u01b4\u01be\u01c5\u01cc\u01d5\u01dd\u01e7\u01ec\u01ee\u01f8\u0202"+
		"\u020a\u0214\u021c\u0229\u0230\u023c\u0242\u0245\u024c\u0250\u025a\u0260"+
		"\u0265\u0268\u026c\u026f\u0274\u027c\u027e\u0283\u0290\u0297\u029b\u02a0"+
		"\u02a6\u02ae\u02be\u02c5\u02cb\u02d1\u02d4\u02d7\u02df\u02e6\u02e9\u02ec"+
		"\u02f4\u02f7\u02fa\u0304\u030e\u0316\u031b\u0324\u032a\u032c\u0338\u0342"+
		"\u034a\u034d\u0350\u0359\u0370\u0377\u037a\u0380\u0389\u038f\u0391\u039a"+
		"\u039c\u03a5\u03a9\u03b2\u03b4\u03bd\u03c1\u03c4\u03cc\u03d0\u03d2\u03d5"+
		"\u03db\u03df\u03e5\u03f3\u03fa\u0400\u0403\u0407\u040d\u0411\u0419\u041c"+
		"\u0423\u042f\u0433\u0435\u0441\u0443\u044f\u0451\u0456\u045c\u045f\u0465"+
		"\u0469\u046c\u046f\u047a\u0480\u0482\u0485\u048d\u0492\u0498\u04a1\u04a6"+
		"\u04a8\u04be\u04c5\u04ca\u04e2\u04e7\u04ec\u04f0\u04f4\u04f8\u0501\u0508"+
		"\u050f\u0515\u0518\u051c\u0524\u0527\u052b\u0533\u0538\u053f\u0548\u054c"+
		"\u0558\u055a\u0564\u056f\u0575\u057a\u0580\u0584\u0589\u0593\u0595\u059d"+
		"\u05ab\u05be\u05c0\u05cc\u05d1\u05d5\u05d9\u05dd\u05e4\u05ea\u05f6\u05fd"+
		"\u0601\u0606\u060a\u0611\u0616\u061c\u061f\u0623\u0627\u062e\u0632\u0635"+
		"\u063e\u0643\u0648\u064a\u0656\u065a\u065c\u0665\u0669\u066d\u0670\u0674"+
		"\u0678\u067e\u0682\u0687\u0689\u068d\u0692\u0695\u069c\u06a3\u06a6\u06ac"+
		"\u06b0\u06b4\u06b8\u06bc\u06c0\u06c4\u06c8\u06cc\u06d0\u06d3\u06dc\u06e1"+
		"\u06e3\u06ef\u06f2\u06fe\u0706\u070b\u0713\u0719\u071f\u0732\u0736\u073a"+
		"\u0743\u074a\u0755\u0757\u075e\u076b\u0778\u0793\u0797\u0799\u07a5\u07a7"+
		"\u07ac\u07b0\u07b9\u07c0\u07c9\u07d2\u07d7\u07e0\u07e6\u07e8\u07ec\u07f3"+
		"\u07f8\u0809\u080f\u0813\u081d\u0823\u0829";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}