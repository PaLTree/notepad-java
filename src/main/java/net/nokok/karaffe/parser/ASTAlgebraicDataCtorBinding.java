/* Generated By:JJTree: Do not edit this line. ASTAlgebraicDataCtorBinding.java Version 6.0 */
/* JavaCCOptions:MULTI=true,NODE_USES_PARSER=false,VISITOR=true,TRACK_TOKENS=false,NODE_PREFIX=AST,NODE_EXTENDS=,NODE_FACTORY=,SUPPORT_CLASS_VISIBILITY_PUBLIC=true */
package net.nokok.karaffe.parser;

public
class ASTAlgebraicDataCtorBinding extends SimpleNode {
  public ASTAlgebraicDataCtorBinding(int id) {
    super(id);
  }

  public ASTAlgebraicDataCtorBinding(Parser p, int id) {
    super(p, id);
  }


  /** Accept the visitor. **/
  public Object jjtAccept(ParserVisitor visitor, Object data) throws net.nokok.karaffe.parser.excptn.ParserException {

    return
    visitor.visit(this, data);
  }
}
/* JavaCC - OriginalChecksum=45ea3cace4876832afc45d52e871f3aa (do not edit this line) */
