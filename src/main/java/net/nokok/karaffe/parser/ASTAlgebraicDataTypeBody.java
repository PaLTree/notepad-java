/* Generated By:JJTree: Do not edit this line. ASTAlgebraicDataTypeBody.java Version 6.0 */
/* JavaCCOptions:MULTI=true,NODE_USES_PARSER=false,VISITOR=true,TRACK_TOKENS=false,NODE_PREFIX=AST,NODE_EXTENDS=,NODE_FACTORY=,SUPPORT_CLASS_VISIBILITY_PUBLIC=true */
package net.nokok.karaffe.parser;

public
class ASTAlgebraicDataTypeBody extends SimpleNode {
  public ASTAlgebraicDataTypeBody(int id) {
    super(id);
  }

  public ASTAlgebraicDataTypeBody(Parser p, int id) {
    super(p, id);
  }


  /** Accept the visitor. **/
  public Object jjtAccept(ParserVisitor visitor, Object data) throws net.nokok.karaffe.parser.excptn.ParserException {

    return
    visitor.visit(this, data);
  }
}
/* JavaCC - OriginalChecksum=3bcb4f8b72ff0f42878cf4612a6f22d5 (do not edit this line) */
