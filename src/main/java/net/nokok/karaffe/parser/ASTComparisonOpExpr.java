/* Generated By:JJTree: Do not edit this line. ASTComparisonOpExpr.java Version 6.0 */
/* JavaCCOptions:MULTI=true,NODE_USES_PARSER=false,VISITOR=true,TRACK_TOKENS=false,NODE_PREFIX=AST,NODE_EXTENDS=,NODE_FACTORY=,SUPPORT_CLASS_VISIBILITY_PUBLIC=true */
package net.nokok.karaffe.parser;

public
class ASTComparisonOpExpr extends SimpleNode {
  public ASTComparisonOpExpr(int id) {
    super(id);
  }

  public ASTComparisonOpExpr(KaraffeParser p, int id) {
    super(p, id);
  }


  /** Accept the visitor. **/
  public Object jjtAccept(KaraffeParserVisitor visitor, Object data) throws net.nokok.karaffe.parser.excptn.KaraffeParserException {

    return
    visitor.visit(this, data);
  }
}
/* JavaCC - OriginalChecksum=b8551bc7294edc8551657d678db02d9f (do not edit this line) */