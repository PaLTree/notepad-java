/* Generated By:JJTree: Do not edit this line. ASTUnaryExprNotPlusMinus.java Version 6.0 */
/* JavaCCOptions:MULTI=true,NODE_USES_PARSER=false,VISITOR=true,TRACK_TOKENS=false,NODE_PREFIX=AST,NODE_EXTENDS=,NODE_FACTORY=,SUPPORT_CLASS_VISIBILITY_PUBLIC=true */
package net.nokok.karaffe.parser;

public
class ASTUnaryExprNotPlusMinus extends SimpleNode {
  public ASTUnaryExprNotPlusMinus(int id) {
    super(id);
  }

  public ASTUnaryExprNotPlusMinus(Parser p, int id) {
    super(p, id);
  }


  /** Accept the visitor. **/
  public Object jjtAccept(ParserVisitor visitor, Object data) throws net.nokok.karaffe.parser.excptn.ParserException {

    return
    visitor.visit(this, data);
  }
}
/* JavaCC - OriginalChecksum=d4773ee21e64f8fcd3645bc40e8fba90 (do not edit this line) */
