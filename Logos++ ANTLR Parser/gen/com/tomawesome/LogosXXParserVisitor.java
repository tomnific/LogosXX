// Generated from /Users/Tom/Garage/School/Projects/Language Creation/Logos++/Logos++ ANTLR Parser/src/com/tomawesome/LogosXXParser.g4 by ANTLR 4.7.2
package com.tomawesome;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link LogosXXParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface LogosXXParserVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link LogosXXParser#logosxx}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLogosxx(LogosXXParser.LogosxxContext ctx);
	/**
	 * Visit a parse tree produced by {@link LogosXXParser#logosxxTopLevel}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLogosxxTopLevel(LogosXXParser.LogosxxTopLevelContext ctx);
	/**
	 * Visit a parse tree produced by {@link LogosXXParser#config}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConfig(LogosXXParser.ConfigContext ctx);
	/**
	 * Visit a parse tree produced by {@link LogosXXParser#hookf}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHookf(LogosXXParser.HookfContext ctx);
	/**
	 * Visit a parse tree produced by {@link LogosXXParser#hookswiftf}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHookswiftf(LogosXXParser.HookswiftfContext ctx);
	/**
	 * Visit a parse tree produced by {@link LogosXXParser#ctor}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCtor(LogosXXParser.CtorContext ctx);
	/**
	 * Visit a parse tree produced by {@link LogosXXParser#dtor}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDtor(LogosXXParser.DtorContext ctx);
	/**
	 * Visit a parse tree produced by {@link LogosXXParser#logosxxBlockLevel}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLogosxxBlockLevel(LogosXXParser.LogosxxBlockLevelContext ctx);
	/**
	 * Visit a parse tree produced by {@link LogosXXParser#group}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGroup(LogosXXParser.GroupContext ctx);
	/**
	 * Visit a parse tree produced by {@link LogosXXParser#groupContents}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGroupContents(LogosXXParser.GroupContentsContext ctx);
	/**
	 * Visit a parse tree produced by {@link LogosXXParser#hook}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHook(LogosXXParser.HookContext ctx);
	/**
	 * Visit a parse tree produced by {@link LogosXXParser#hookContents}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHookContents(LogosXXParser.HookContentsContext ctx);
	/**
	 * Visit a parse tree produced by {@link LogosXXParser#hookswift}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHookswift(LogosXXParser.HookswiftContext ctx);
	/**
	 * Visit a parse tree produced by {@link LogosXXParser#newcontent}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNewcontent(LogosXXParser.NewcontentContext ctx);
	/**
	 * Visit a parse tree produced by {@link LogosXXParser#subclass}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSubclass(LogosXXParser.SubclassContext ctx);
	/**
	 * Visit a parse tree produced by {@link LogosXXParser#property}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProperty(LogosXXParser.PropertyContext ctx);
	/**
	 * Visit a parse tree produced by {@link LogosXXParser#logosxxFunctionLevel}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLogosxxFunctionLevel(LogosXXParser.LogosxxFunctionLevelContext ctx);
	/**
	 * Visit a parse tree produced by {@link LogosXXParser#init}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInit(LogosXXParser.InitContext ctx);
	/**
	 * Visit a parse tree produced by {@link LogosXXParser#initexpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInitexpr(LogosXXParser.InitexprContext ctx);
	/**
	 * Visit a parse tree produced by {@link LogosXXParser#classeval}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClasseval(LogosXXParser.ClassevalContext ctx);
	/**
	 * Visit a parse tree produced by {@link LogosXXParser#callswift}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCallswift(LogosXXParser.CallswiftContext ctx);
	/**
	 * Visit a parse tree produced by {@link LogosXXParser#typeList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeList(LogosXXParser.TypeListContext ctx);
	/**
	 * Visit a parse tree produced by {@link LogosXXParser#orig}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOrig(LogosXXParser.OrigContext ctx);
	/**
	 * Visit a parse tree produced by {@link LogosXXParser#log}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLog(LogosXXParser.LogContext ctx);
	/**
	 * Visit a parse tree produced by {@link LogosXXParser#logexpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLogexpr(LogosXXParser.LogexprContext ctx);
	/**
	 * Visit a parse tree produced by {@link LogosXXParser#logosFusedClassMethodDefinition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLogosFusedClassMethodDefinition(LogosXXParser.LogosFusedClassMethodDefinitionContext ctx);
	/**
	 * Visit a parse tree produced by {@link LogosXXParser#logosFusedInstanceMethodDefinition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLogosFusedInstanceMethodDefinition(LogosXXParser.LogosFusedInstanceMethodDefinitionContext ctx);
	/**
	 * Visit a parse tree produced by {@link LogosXXParser#logosFusedMethodDefinition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLogosFusedMethodDefinition(LogosXXParser.LogosFusedMethodDefinitionContext ctx);
	/**
	 * Visit a parse tree produced by {@link LogosXXParser#logosFusedCompoundStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLogosFusedCompoundStatement(LogosXXParser.LogosFusedCompoundStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link LogosXXParser#hookedFunctionExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHookedFunctionExpression(LogosXXParser.HookedFunctionExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link LogosXXParser#cppTemplateFunctionCallStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCppTemplateFunctionCallStatement(LogosXXParser.CppTemplateFunctionCallStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link LogosXXParser#translationUnit}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTranslationUnit(LogosXXParser.TranslationUnitContext ctx);
	/**
	 * Visit a parse tree produced by {@link LogosXXParser#topLevelDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTopLevelDeclaration(LogosXXParser.TopLevelDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link LogosXXParser#importDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitImportDeclaration(LogosXXParser.ImportDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link LogosXXParser#classInterface}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClassInterface(LogosXXParser.ClassInterfaceContext ctx);
	/**
	 * Visit a parse tree produced by {@link LogosXXParser#categoryInterface}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCategoryInterface(LogosXXParser.CategoryInterfaceContext ctx);
	/**
	 * Visit a parse tree produced by {@link LogosXXParser#classImplementation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClassImplementation(LogosXXParser.ClassImplementationContext ctx);
	/**
	 * Visit a parse tree produced by {@link LogosXXParser#categoryImplementation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCategoryImplementation(LogosXXParser.CategoryImplementationContext ctx);
	/**
	 * Visit a parse tree produced by {@link LogosXXParser#genericTypeSpecifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGenericTypeSpecifier(LogosXXParser.GenericTypeSpecifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link LogosXXParser#protocolDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProtocolDeclaration(LogosXXParser.ProtocolDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link LogosXXParser#protocolDeclarationSection}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProtocolDeclarationSection(LogosXXParser.ProtocolDeclarationSectionContext ctx);
	/**
	 * Visit a parse tree produced by {@link LogosXXParser#protocolDeclarationList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProtocolDeclarationList(LogosXXParser.ProtocolDeclarationListContext ctx);
	/**
	 * Visit a parse tree produced by {@link LogosXXParser#classDeclarationList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClassDeclarationList(LogosXXParser.ClassDeclarationListContext ctx);
	/**
	 * Visit a parse tree produced by {@link LogosXXParser#protocolList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProtocolList(LogosXXParser.ProtocolListContext ctx);
	/**
	 * Visit a parse tree produced by {@link LogosXXParser#propertyDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPropertyDeclaration(LogosXXParser.PropertyDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link LogosXXParser#propertyAttributesList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPropertyAttributesList(LogosXXParser.PropertyAttributesListContext ctx);
	/**
	 * Visit a parse tree produced by {@link LogosXXParser#propertyAttribute}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPropertyAttribute(LogosXXParser.PropertyAttributeContext ctx);
	/**
	 * Visit a parse tree produced by {@link LogosXXParser#protocolName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProtocolName(LogosXXParser.ProtocolNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link LogosXXParser#instanceVariables}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInstanceVariables(LogosXXParser.InstanceVariablesContext ctx);
	/**
	 * Visit a parse tree produced by {@link LogosXXParser#visibilitySection}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVisibilitySection(LogosXXParser.VisibilitySectionContext ctx);
	/**
	 * Visit a parse tree produced by {@link LogosXXParser#accessModifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAccessModifier(LogosXXParser.AccessModifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link LogosXXParser#interfaceDeclarationList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInterfaceDeclarationList(LogosXXParser.InterfaceDeclarationListContext ctx);
	/**
	 * Visit a parse tree produced by {@link LogosXXParser#classMethodDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClassMethodDeclaration(LogosXXParser.ClassMethodDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link LogosXXParser#instanceMethodDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInstanceMethodDeclaration(LogosXXParser.InstanceMethodDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link LogosXXParser#methodDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMethodDeclaration(LogosXXParser.MethodDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link LogosXXParser#implementationDefinitionList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitImplementationDefinitionList(LogosXXParser.ImplementationDefinitionListContext ctx);
	/**
	 * Visit a parse tree produced by {@link LogosXXParser#classMethodDefinition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClassMethodDefinition(LogosXXParser.ClassMethodDefinitionContext ctx);
	/**
	 * Visit a parse tree produced by {@link LogosXXParser#instanceMethodDefinition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInstanceMethodDefinition(LogosXXParser.InstanceMethodDefinitionContext ctx);
	/**
	 * Visit a parse tree produced by {@link LogosXXParser#methodDefinition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMethodDefinition(LogosXXParser.MethodDefinitionContext ctx);
	/**
	 * Visit a parse tree produced by {@link LogosXXParser#methodSelector}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMethodSelector(LogosXXParser.MethodSelectorContext ctx);
	/**
	 * Visit a parse tree produced by {@link LogosXXParser#keywordDeclarator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitKeywordDeclarator(LogosXXParser.KeywordDeclaratorContext ctx);
	/**
	 * Visit a parse tree produced by {@link LogosXXParser#selector}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSelector(LogosXXParser.SelectorContext ctx);
	/**
	 * Visit a parse tree produced by {@link LogosXXParser#methodType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMethodType(LogosXXParser.MethodTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link LogosXXParser#propertyImplementation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPropertyImplementation(LogosXXParser.PropertyImplementationContext ctx);
	/**
	 * Visit a parse tree produced by {@link LogosXXParser#propertySynthesizeList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPropertySynthesizeList(LogosXXParser.PropertySynthesizeListContext ctx);
	/**
	 * Visit a parse tree produced by {@link LogosXXParser#propertySynthesizeItem}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPropertySynthesizeItem(LogosXXParser.PropertySynthesizeItemContext ctx);
	/**
	 * Visit a parse tree produced by {@link LogosXXParser#blockType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlockType(LogosXXParser.BlockTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link LogosXXParser#genericsSpecifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGenericsSpecifier(LogosXXParser.GenericsSpecifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link LogosXXParser#typeSpecifierWithPrefixes}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeSpecifierWithPrefixes(LogosXXParser.TypeSpecifierWithPrefixesContext ctx);
	/**
	 * Visit a parse tree produced by {@link LogosXXParser#dictionaryExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDictionaryExpression(LogosXXParser.DictionaryExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link LogosXXParser#dictionaryPair}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDictionaryPair(LogosXXParser.DictionaryPairContext ctx);
	/**
	 * Visit a parse tree produced by {@link LogosXXParser#arrayExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArrayExpression(LogosXXParser.ArrayExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link LogosXXParser#boxExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBoxExpression(LogosXXParser.BoxExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link LogosXXParser#blockParameters}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlockParameters(LogosXXParser.BlockParametersContext ctx);
	/**
	 * Visit a parse tree produced by {@link LogosXXParser#typeVariableDeclaratorOrName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeVariableDeclaratorOrName(LogosXXParser.TypeVariableDeclaratorOrNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link LogosXXParser#blockExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlockExpression(LogosXXParser.BlockExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link LogosXXParser#messageExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMessageExpression(LogosXXParser.MessageExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link LogosXXParser#receiver}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReceiver(LogosXXParser.ReceiverContext ctx);
	/**
	 * Visit a parse tree produced by {@link LogosXXParser#messageSelector}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMessageSelector(LogosXXParser.MessageSelectorContext ctx);
	/**
	 * Visit a parse tree produced by {@link LogosXXParser#keywordArgument}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitKeywordArgument(LogosXXParser.KeywordArgumentContext ctx);
	/**
	 * Visit a parse tree produced by {@link LogosXXParser#keywordArgumentType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitKeywordArgumentType(LogosXXParser.KeywordArgumentTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link LogosXXParser#selectorExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSelectorExpression(LogosXXParser.SelectorExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link LogosXXParser#selectorName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSelectorName(LogosXXParser.SelectorNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link LogosXXParser#protocolExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProtocolExpression(LogosXXParser.ProtocolExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link LogosXXParser#encodeExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEncodeExpression(LogosXXParser.EncodeExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link LogosXXParser#typeVariableDeclarator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeVariableDeclarator(LogosXXParser.TypeVariableDeclaratorContext ctx);
	/**
	 * Visit a parse tree produced by {@link LogosXXParser#throwStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitThrowStatement(LogosXXParser.ThrowStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link LogosXXParser#tryBlock}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTryBlock(LogosXXParser.TryBlockContext ctx);
	/**
	 * Visit a parse tree produced by {@link LogosXXParser#catchStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCatchStatement(LogosXXParser.CatchStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link LogosXXParser#synchronizedStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSynchronizedStatement(LogosXXParser.SynchronizedStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link LogosXXParser#autoreleaseStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAutoreleaseStatement(LogosXXParser.AutoreleaseStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link LogosXXParser#functionDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionDeclaration(LogosXXParser.FunctionDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link LogosXXParser#functionDefinition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionDefinition(LogosXXParser.FunctionDefinitionContext ctx);
	/**
	 * Visit a parse tree produced by {@link LogosXXParser#functionSignature}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionSignature(LogosXXParser.FunctionSignatureContext ctx);
	/**
	 * Visit a parse tree produced by {@link LogosXXParser#attribute}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAttribute(LogosXXParser.AttributeContext ctx);
	/**
	 * Visit a parse tree produced by {@link LogosXXParser#attributeName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAttributeName(LogosXXParser.AttributeNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link LogosXXParser#attributeParameters}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAttributeParameters(LogosXXParser.AttributeParametersContext ctx);
	/**
	 * Visit a parse tree produced by {@link LogosXXParser#attributeParameterList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAttributeParameterList(LogosXXParser.AttributeParameterListContext ctx);
	/**
	 * Visit a parse tree produced by {@link LogosXXParser#attributeParameter}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAttributeParameter(LogosXXParser.AttributeParameterContext ctx);
	/**
	 * Visit a parse tree produced by {@link LogosXXParser#attributeParameterAssignment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAttributeParameterAssignment(LogosXXParser.AttributeParameterAssignmentContext ctx);
	/**
	 * Visit a parse tree produced by {@link LogosXXParser#declaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclaration(LogosXXParser.DeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link LogosXXParser#functionCallExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionCallExpression(LogosXXParser.FunctionCallExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link LogosXXParser#enumDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEnumDeclaration(LogosXXParser.EnumDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link LogosXXParser#varDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVarDeclaration(LogosXXParser.VarDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link LogosXXParser#typedefDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypedefDeclaration(LogosXXParser.TypedefDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link LogosXXParser#typeDeclaratorList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeDeclaratorList(LogosXXParser.TypeDeclaratorListContext ctx);
	/**
	 * Visit a parse tree produced by {@link LogosXXParser#typeDeclarator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeDeclarator(LogosXXParser.TypeDeclaratorContext ctx);
	/**
	 * Visit a parse tree produced by {@link LogosXXParser#declarationSpecifiers}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclarationSpecifiers(LogosXXParser.DeclarationSpecifiersContext ctx);
	/**
	 * Visit a parse tree produced by {@link LogosXXParser#attributeSpecifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAttributeSpecifier(LogosXXParser.AttributeSpecifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link LogosXXParser#initDeclaratorList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInitDeclaratorList(LogosXXParser.InitDeclaratorListContext ctx);
	/**
	 * Visit a parse tree produced by {@link LogosXXParser#initDeclarator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInitDeclarator(LogosXXParser.InitDeclaratorContext ctx);
	/**
	 * Visit a parse tree produced by {@link LogosXXParser#structOrUnionSpecifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStructOrUnionSpecifier(LogosXXParser.StructOrUnionSpecifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link LogosXXParser#fieldDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFieldDeclaration(LogosXXParser.FieldDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link LogosXXParser#specifierQualifierList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSpecifierQualifierList(LogosXXParser.SpecifierQualifierListContext ctx);
	/**
	 * Visit a parse tree produced by {@link LogosXXParser#ibOutletQualifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIbOutletQualifier(LogosXXParser.IbOutletQualifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link LogosXXParser#arcBehaviourSpecifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArcBehaviourSpecifier(LogosXXParser.ArcBehaviourSpecifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link LogosXXParser#nullabilitySpecifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNullabilitySpecifier(LogosXXParser.NullabilitySpecifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link LogosXXParser#storageClassSpecifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStorageClassSpecifier(LogosXXParser.StorageClassSpecifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link LogosXXParser#typePrefix}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypePrefix(LogosXXParser.TypePrefixContext ctx);
	/**
	 * Visit a parse tree produced by {@link LogosXXParser#typeQualifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeQualifier(LogosXXParser.TypeQualifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link LogosXXParser#protocolQualifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProtocolQualifier(LogosXXParser.ProtocolQualifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link LogosXXParser#typeSpecifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeSpecifier(LogosXXParser.TypeSpecifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link LogosXXParser#typeofExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeofExpression(LogosXXParser.TypeofExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link LogosXXParser#fieldDeclaratorList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFieldDeclaratorList(LogosXXParser.FieldDeclaratorListContext ctx);
	/**
	 * Visit a parse tree produced by {@link LogosXXParser#fieldDeclarator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFieldDeclarator(LogosXXParser.FieldDeclaratorContext ctx);
	/**
	 * Visit a parse tree produced by {@link LogosXXParser#enumSpecifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEnumSpecifier(LogosXXParser.EnumSpecifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link LogosXXParser#enumeratorList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEnumeratorList(LogosXXParser.EnumeratorListContext ctx);
	/**
	 * Visit a parse tree produced by {@link LogosXXParser#enumerator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEnumerator(LogosXXParser.EnumeratorContext ctx);
	/**
	 * Visit a parse tree produced by {@link LogosXXParser#enumeratorIdentifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEnumeratorIdentifier(LogosXXParser.EnumeratorIdentifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link LogosXXParser#directDeclarator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDirectDeclarator(LogosXXParser.DirectDeclaratorContext ctx);
	/**
	 * Visit a parse tree produced by {@link LogosXXParser#declaratorSuffix}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclaratorSuffix(LogosXXParser.DeclaratorSuffixContext ctx);
	/**
	 * Visit a parse tree produced by {@link LogosXXParser#parameterList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParameterList(LogosXXParser.ParameterListContext ctx);
	/**
	 * Visit a parse tree produced by {@link LogosXXParser#pointer}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPointer(LogosXXParser.PointerContext ctx);
	/**
	 * Visit a parse tree produced by {@link LogosXXParser#macro}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMacro(LogosXXParser.MacroContext ctx);
	/**
	 * Visit a parse tree produced by {@link LogosXXParser#arrayInitializer}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArrayInitializer(LogosXXParser.ArrayInitializerContext ctx);
	/**
	 * Visit a parse tree produced by {@link LogosXXParser#structInitializer}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStructInitializer(LogosXXParser.StructInitializerContext ctx);
	/**
	 * Visit a parse tree produced by {@link LogosXXParser#initializerList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInitializerList(LogosXXParser.InitializerListContext ctx);
	/**
	 * Visit a parse tree produced by {@link LogosXXParser#typeName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeName(LogosXXParser.TypeNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link LogosXXParser#abstractDeclarator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAbstractDeclarator(LogosXXParser.AbstractDeclaratorContext ctx);
	/**
	 * Visit a parse tree produced by {@link LogosXXParser#abstractDeclaratorSuffix}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAbstractDeclaratorSuffix(LogosXXParser.AbstractDeclaratorSuffixContext ctx);
	/**
	 * Visit a parse tree produced by {@link LogosXXParser#parameterDeclarationList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParameterDeclarationList(LogosXXParser.ParameterDeclarationListContext ctx);
	/**
	 * Visit a parse tree produced by {@link LogosXXParser#parameterDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParameterDeclaration(LogosXXParser.ParameterDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link LogosXXParser#declarator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclarator(LogosXXParser.DeclaratorContext ctx);
	/**
	 * Visit a parse tree produced by {@link LogosXXParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatement(LogosXXParser.StatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link LogosXXParser#labeledStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLabeledStatement(LogosXXParser.LabeledStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link LogosXXParser#rangeExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRangeExpression(LogosXXParser.RangeExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link LogosXXParser#compoundStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCompoundStatement(LogosXXParser.CompoundStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link LogosXXParser#selectionStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSelectionStatement(LogosXXParser.SelectionStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link LogosXXParser#switchStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSwitchStatement(LogosXXParser.SwitchStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link LogosXXParser#switchBlock}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSwitchBlock(LogosXXParser.SwitchBlockContext ctx);
	/**
	 * Visit a parse tree produced by {@link LogosXXParser#switchSection}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSwitchSection(LogosXXParser.SwitchSectionContext ctx);
	/**
	 * Visit a parse tree produced by {@link LogosXXParser#switchLabel}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSwitchLabel(LogosXXParser.SwitchLabelContext ctx);
	/**
	 * Visit a parse tree produced by {@link LogosXXParser#iterationStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIterationStatement(LogosXXParser.IterationStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link LogosXXParser#whileStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhileStatement(LogosXXParser.WhileStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link LogosXXParser#doStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDoStatement(LogosXXParser.DoStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link LogosXXParser#forStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitForStatement(LogosXXParser.ForStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link LogosXXParser#forLoopInitializer}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitForLoopInitializer(LogosXXParser.ForLoopInitializerContext ctx);
	/**
	 * Visit a parse tree produced by {@link LogosXXParser#forInStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitForInStatement(LogosXXParser.ForInStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link LogosXXParser#jumpStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJumpStatement(LogosXXParser.JumpStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link LogosXXParser#expressions}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpressions(LogosXXParser.ExpressionsContext ctx);
	/**
	 * Visit a parse tree produced by {@link LogosXXParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpression(LogosXXParser.ExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link LogosXXParser#assignmentOperator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignmentOperator(LogosXXParser.AssignmentOperatorContext ctx);
	/**
	 * Visit a parse tree produced by {@link LogosXXParser#castExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCastExpression(LogosXXParser.CastExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link LogosXXParser#initializer}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInitializer(LogosXXParser.InitializerContext ctx);
	/**
	 * Visit a parse tree produced by {@link LogosXXParser#constantExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConstantExpression(LogosXXParser.ConstantExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link LogosXXParser#unaryExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnaryExpression(LogosXXParser.UnaryExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link LogosXXParser#unaryOperator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnaryOperator(LogosXXParser.UnaryOperatorContext ctx);
	/**
	 * Visit a parse tree produced by {@link LogosXXParser#postfixExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPostfixExpression(LogosXXParser.PostfixExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link LogosXXParser#postfix}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPostfix(LogosXXParser.PostfixContext ctx);
	/**
	 * Visit a parse tree produced by {@link LogosXXParser#argumentExpressionList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArgumentExpressionList(LogosXXParser.ArgumentExpressionListContext ctx);
	/**
	 * Visit a parse tree produced by {@link LogosXXParser#argumentExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArgumentExpression(LogosXXParser.ArgumentExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link LogosXXParser#primaryExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrimaryExpression(LogosXXParser.PrimaryExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link LogosXXParser#constant}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConstant(LogosXXParser.ConstantContext ctx);
	/**
	 * Visit a parse tree produced by {@link LogosXXParser#stringLiteral}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStringLiteral(LogosXXParser.StringLiteralContext ctx);
	/**
	 * Visit a parse tree produced by {@link LogosXXParser#identifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIdentifier(LogosXXParser.IdentifierContext ctx);
}