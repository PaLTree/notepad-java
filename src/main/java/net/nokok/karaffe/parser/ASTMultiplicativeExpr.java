/* Generated By:JJTree: Do not edit this line. ASTMultiplicativeExpr.java Version 6.0 */
/* JavaCCOptions:MULTI=true,NODE_USES_PARSER=false,VISITOR=true,TRACK_TOKENS=false,NODE_PREFIX=AST,NODE_EXTENDS=,NODE_FACTORY=,SUPPORT_CLASS_VISIBILITY_PUBLIC=true */
package net.nokok.karaffe.parser;

public
class ASTMultiplicativeExpr extends SimpleNode {
  public ASTMultiplicativeExpr(int id) {
    super(id);
  }

  public ASTMultiplicativeExpr(Parser p, int id) {
    super(p, id);
  }


  /** Accept the visitor. **/
  public Object jjtAccept(ParserVisitor visitor, Object data) throws net.nokok.karaffe.parser.excptn.ParserException {

    return
    visitor.visit(this, data);
  }
}
/* JavaCC - OriginalChecksum=228ffdf1826a64564b034338a1c9ea76 (do not edit this line) */
