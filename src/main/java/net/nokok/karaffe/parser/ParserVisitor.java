/* Generated By:JavaCC: Do not edit this line. ParserVisitor.java Version 6.0_1 */
package net.nokok.karaffe.parser;

public interface ParserVisitor
{
  public Object visit(SimpleNode node, Object data) throws net.nokok.karaffe.parser.excptn.ParserException;
  public Object visit(ASTCompileUnit node, Object data) throws net.nokok.karaffe.parser.excptn.ParserException;
  public Object visit(ASTPackageDecl node, Object data) throws net.nokok.karaffe.parser.excptn.ParserException;
  public Object visit(ASTImportStmt node, Object data) throws net.nokok.karaffe.parser.excptn.ParserException;
  public Object visit(ASTSimpleImport node, Object data) throws net.nokok.karaffe.parser.excptn.ParserException;
  public Object visit(ASTAliasImport node, Object data) throws net.nokok.karaffe.parser.excptn.ParserException;
  public Object visit(ASTImportAfter node, Object data) throws net.nokok.karaffe.parser.excptn.ParserException;
  public Object visit(ASTTypeName node, Object data) throws net.nokok.karaffe.parser.excptn.ParserException;
  public Object visit(ASTTypeDecl node, Object data) throws net.nokok.karaffe.parser.excptn.ParserException;
  public Object visit(ASTClassDecl node, Object data) throws net.nokok.karaffe.parser.excptn.ParserException;
  public Object visit(ASTClassModifiers node, Object data) throws net.nokok.karaffe.parser.excptn.ParserException;
  public Object visit(ASTPublicModifier node, Object data) throws net.nokok.karaffe.parser.excptn.ParserException;
  public Object visit(ASTProtectedModifier node, Object data) throws net.nokok.karaffe.parser.excptn.ParserException;
  public Object visit(ASTPrivateModifier node, Object data) throws net.nokok.karaffe.parser.excptn.ParserException;
  public Object visit(ASTAbstractModifier node, Object data) throws net.nokok.karaffe.parser.excptn.ParserException;
  public Object visit(ASTStaticModifier node, Object data) throws net.nokok.karaffe.parser.excptn.ParserException;
  public Object visit(ASTFinalModifier node, Object data) throws net.nokok.karaffe.parser.excptn.ParserException;
  public Object visit(ASTTypeParameters node, Object data) throws net.nokok.karaffe.parser.excptn.ParserException;
  public Object visit(ASTTypeParameter node, Object data) throws net.nokok.karaffe.parser.excptn.ParserException;
  public Object visit(ASTTypeBound node, Object data) throws net.nokok.karaffe.parser.excptn.ParserException;
  public Object visit(ASTClassOrInterfaceType node, Object data) throws net.nokok.karaffe.parser.excptn.ParserException;
  public Object visit(ASTClassType node, Object data) throws net.nokok.karaffe.parser.excptn.ParserException;
  public Object visit(ASTAdditionalBound node, Object data) throws net.nokok.karaffe.parser.excptn.ParserException;
  public Object visit(ASTSuperType node, Object data) throws net.nokok.karaffe.parser.excptn.ParserException;
  public Object visit(ASTInterfaces node, Object data) throws net.nokok.karaffe.parser.excptn.ParserException;
  public Object visit(ASTInterfaceType node, Object data) throws net.nokok.karaffe.parser.excptn.ParserException;
  public Object visit(ASTClassBody node, Object data) throws net.nokok.karaffe.parser.excptn.ParserException;
  public Object visit(ASTClassCtorDecl node, Object data) throws net.nokok.karaffe.parser.excptn.ParserException;
  public Object visit(ASTCtorModifier node, Object data) throws net.nokok.karaffe.parser.excptn.ParserException;
  public Object visit(ASTFormalParameters node, Object data) throws net.nokok.karaffe.parser.excptn.ParserException;
  public Object visit(ASTFormalParameter node, Object data) throws net.nokok.karaffe.parser.excptn.ParserException;
  public Object visit(ASTLastFormalParamter node, Object data) throws net.nokok.karaffe.parser.excptn.ParserException;
  public Object visit(ASTVariableModifier node, Object data) throws net.nokok.karaffe.parser.excptn.ParserException;
  public Object visit(ASTCtorBody node, Object data) throws net.nokok.karaffe.parser.excptn.ParserException;
  public Object visit(ASTExplicitCtorInvocation node, Object data) throws net.nokok.karaffe.parser.excptn.ParserException;
  public Object visit(ASTBlockStmts node, Object data) throws net.nokok.karaffe.parser.excptn.ParserException;
  public Object visit(ASTBlockStmt node, Object data) throws net.nokok.karaffe.parser.excptn.ParserException;
  public Object visit(ASTLocalValDecl node, Object data) throws net.nokok.karaffe.parser.excptn.ParserException;
  public Object visit(ASTVariableInitializer node, Object data) throws net.nokok.karaffe.parser.excptn.ParserException;
  public Object visit(ASTVariableType node, Object data) throws net.nokok.karaffe.parser.excptn.ParserException;
  public Object visit(ASTFieldDecl node, Object data) throws net.nokok.karaffe.parser.excptn.ParserException;
  public Object visit(ASTFieldModifier node, Object data) throws net.nokok.karaffe.parser.excptn.ParserException;
  public Object visit(ASTFieldInitializer node, Object data) throws net.nokok.karaffe.parser.excptn.ParserException;
  public Object visit(ASTFuncDecl node, Object data) throws net.nokok.karaffe.parser.excptn.ParserException;
  public Object visit(ASTFuncModifier node, Object data) throws net.nokok.karaffe.parser.excptn.ParserException;
  public Object visit(ASTReturnType node, Object data) throws net.nokok.karaffe.parser.excptn.ParserException;
  public Object visit(ASTFuncBody node, Object data) throws net.nokok.karaffe.parser.excptn.ParserException;
  public Object visit(ASTAlgebraicDataTypeDecl node, Object data) throws net.nokok.karaffe.parser.excptn.ParserException;
  public Object visit(ASTAlgebraicDataTypeBody node, Object data) throws net.nokok.karaffe.parser.excptn.ParserException;
  public Object visit(ASTAlgebraicDataCtorBinding node, Object data) throws net.nokok.karaffe.parser.excptn.ParserException;
  public Object visit(ASTInterfaceDecl node, Object data) throws net.nokok.karaffe.parser.excptn.ParserException;
  public Object visit(ASTInterfaceModifier node, Object data) throws net.nokok.karaffe.parser.excptn.ParserException;
  public Object visit(ASTExtendsInterfaces node, Object data) throws net.nokok.karaffe.parser.excptn.ParserException;
  public Object visit(ASTInterfaceBody node, Object data) throws net.nokok.karaffe.parser.excptn.ParserException;
  public Object visit(ASTInterfaceMember node, Object data) throws net.nokok.karaffe.parser.excptn.ParserException;
  public Object visit(ASTConstantDecl node, Object data) throws net.nokok.karaffe.parser.excptn.ParserException;
  public Object visit(ASTConstantModifier node, Object data) throws net.nokok.karaffe.parser.excptn.ParserException;
  public Object visit(ASTInterfaceMethodDecl node, Object data) throws net.nokok.karaffe.parser.excptn.ParserException;
  public Object visit(ASTTypeAliasDecl node, Object data) throws net.nokok.karaffe.parser.excptn.ParserException;
  public Object visit(ASTTypeAliasModifier node, Object data) throws net.nokok.karaffe.parser.excptn.ParserException;
  public Object visit(ASTEnumDecl node, Object data) throws net.nokok.karaffe.parser.excptn.ParserException;
  public Object visit(ASTEnumModifier node, Object data) throws net.nokok.karaffe.parser.excptn.ParserException;
  public Object visit(ASTEnumName node, Object data) throws net.nokok.karaffe.parser.excptn.ParserException;
  public Object visit(ASTEnumMembers node, Object data) throws net.nokok.karaffe.parser.excptn.ParserException;
  public Object visit(ASTIdentifier node, Object data) throws net.nokok.karaffe.parser.excptn.ParserException;
  public Object visit(ASTExpression node, Object data) throws net.nokok.karaffe.parser.excptn.ParserException;
  public Object visit(ASTAssignmentExpr node, Object data) throws net.nokok.karaffe.parser.excptn.ParserException;
  public Object visit(ASTAssignmentOp node, Object data) throws net.nokok.karaffe.parser.excptn.ParserException;
  public Object visit(ASTLeftHandSide node, Object data) throws net.nokok.karaffe.parser.excptn.ParserException;
  public Object visit(ASTBoolOrExpr node, Object data) throws net.nokok.karaffe.parser.excptn.ParserException;
  public Object visit(ASTBoolAndExpr node, Object data) throws net.nokok.karaffe.parser.excptn.ParserException;
  public Object visit(ASTEqualityExpr node, Object data) throws net.nokok.karaffe.parser.excptn.ParserException;
  public Object visit(ASTRelationalExpr node, Object data) throws net.nokok.karaffe.parser.excptn.ParserException;
  public Object visit(ASTRangeExpr node, Object data) throws net.nokok.karaffe.parser.excptn.ParserException;
  public Object visit(ASTAdditiveExpr node, Object data) throws net.nokok.karaffe.parser.excptn.ParserException;
  public Object visit(ASTMultiplicativeExpr node, Object data) throws net.nokok.karaffe.parser.excptn.ParserException;
  public Object visit(ASTUnaryExpr node, Object data) throws net.nokok.karaffe.parser.excptn.ParserException;
  public Object visit(ASTUnaryExprNotPlusMinus node, Object data) throws net.nokok.karaffe.parser.excptn.ParserException;
  public Object visit(ASTCastExpr node, Object data) throws net.nokok.karaffe.parser.excptn.ParserException;
  public Object visit(ASTCheckExpr node, Object data) throws net.nokok.karaffe.parser.excptn.ParserException;
  public Object visit(ASTPostFixExpr node, Object data) throws net.nokok.karaffe.parser.excptn.ParserException;
  public Object visit(ASTPrimary node, Object data) throws net.nokok.karaffe.parser.excptn.ParserException;
  public Object visit(ASTListDisplay node, Object data) throws net.nokok.karaffe.parser.excptn.ParserException;
  public Object visit(ASTDictionaryDisplay node, Object data) throws net.nokok.karaffe.parser.excptn.ParserException;
  public Object visit(ASTDictionaryPair node, Object data) throws net.nokok.karaffe.parser.excptn.ParserException;
  public Object visit(ASTTupleDisplay node, Object data) throws net.nokok.karaffe.parser.excptn.ParserException;
  public Object visit(ASTIfExpr node, Object data) throws net.nokok.karaffe.parser.excptn.ParserException;
  public Object visit(ASTIfBody node, Object data) throws net.nokok.karaffe.parser.excptn.ParserException;
  public Object visit(ASTWhileLoopExpr node, Object data) throws net.nokok.karaffe.parser.excptn.ParserException;
  public Object visit(ASTLiteral node, Object data) throws net.nokok.karaffe.parser.excptn.ParserException;
  public Object visit(ASTIntLiteral node, Object data) throws net.nokok.karaffe.parser.excptn.ParserException;
  public Object visit(ASTDecimalIntLiteral node, Object data) throws net.nokok.karaffe.parser.excptn.ParserException;
  public Object visit(ASTHexIntLiteral node, Object data) throws net.nokok.karaffe.parser.excptn.ParserException;
  public Object visit(ASTOctIntLiteral node, Object data) throws net.nokok.karaffe.parser.excptn.ParserException;
  public Object visit(ASTBinaryIntLiteral node, Object data) throws net.nokok.karaffe.parser.excptn.ParserException;
  public Object visit(ASTFloatLiteral node, Object data) throws net.nokok.karaffe.parser.excptn.ParserException;
  public Object visit(ASTDecimalFPLiteral node, Object data) throws net.nokok.karaffe.parser.excptn.ParserException;
  public Object visit(ASTHexadecimalFPLiteral node, Object data) throws net.nokok.karaffe.parser.excptn.ParserException;
  public Object visit(ASTBoolLiteral node, Object data) throws net.nokok.karaffe.parser.excptn.ParserException;
  public Object visit(ASTCharLiteral node, Object data) throws net.nokok.karaffe.parser.excptn.ParserException;
  public Object visit(ASTStringLiteral node, Object data) throws net.nokok.karaffe.parser.excptn.ParserException;
  public Object visit(ASTUndefinedLiteral node, Object data) throws net.nokok.karaffe.parser.excptn.ParserException;
  public Object visit(ASTMethodInvocation node, Object data) throws net.nokok.karaffe.parser.excptn.ParserException;
  public Object visit(ASTMethodName node, Object data) throws net.nokok.karaffe.parser.excptn.ParserException;
  public Object visit(ASTExpressionName node, Object data) throws net.nokok.karaffe.parser.excptn.ParserException;
  public Object visit(ASTArguments node, Object data) throws net.nokok.karaffe.parser.excptn.ParserException;
  public Object visit(ASTArgument node, Object data) throws net.nokok.karaffe.parser.excptn.ParserException;
  public Object visit(ASTFunctionLiteral node, Object data) throws net.nokok.karaffe.parser.excptn.ParserException;
  public Object visit(ASTFuncLiteralArg node, Object data) throws net.nokok.karaffe.parser.excptn.ParserException;
  public Object visit(ASTIdentifierTypeBinding node, Object data) throws net.nokok.karaffe.parser.excptn.ParserException;
  public Object visit(ASTAmbiguousName node, Object data) throws net.nokok.karaffe.parser.excptn.ParserException;
  public Object visit(ASTStatement node, Object data) throws net.nokok.karaffe.parser.excptn.ParserException;
  public Object visit(ASTFuncAlias node, Object data) throws net.nokok.karaffe.parser.excptn.ParserException;
  public Object visit(ASTFunctionName node, Object data) throws net.nokok.karaffe.parser.excptn.ParserException;
}
/* JavaCC - OriginalChecksum=a6eaed15b98fb80ac6b2b20a9246953e (do not edit this line) */
