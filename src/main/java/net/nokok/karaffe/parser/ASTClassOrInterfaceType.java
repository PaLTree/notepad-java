/* Generated By:JJTree: Do not edit this line. ASTClassOrInterfaceType.java Version 6.0 */
/* JavaCCOptions:MULTI=true,NODE_USES_PARSER=false,VISITOR=true,TRACK_TOKENS=false,NODE_PREFIX=AST,NODE_EXTENDS=,NODE_FACTORY=,SUPPORT_CLASS_VISIBILITY_PUBLIC=true */
package net.nokok.karaffe.parser;

public
class ASTClassOrInterfaceType extends SimpleNode {
  public ASTClassOrInterfaceType(int id) {
    super(id);
  }

  public ASTClassOrInterfaceType(Parser p, int id) {
    super(p, id);
  }


  /** Accept the visitor. **/
  public Object jjtAccept(ParserVisitor visitor, Object data) throws net.nokok.karaffe.parser.excptn.ParserException {

    return
    visitor.visit(this, data);
  }
}
/* JavaCC - OriginalChecksum=2567882d21d6e1784d0c3bbfd16c60f2 (do not edit this line) */
