/* Generated By:JJTree: Do not edit this line. ASTClassCtorDecl.java Version 6.0 */
/* JavaCCOptions:MULTI=true,NODE_USES_PARSER=false,VISITOR=true,TRACK_TOKENS=false,NODE_PREFIX=AST,NODE_EXTENDS=,NODE_FACTORY=,SUPPORT_CLASS_VISIBILITY_PUBLIC=true */
package net.nokok.karaffe.parser;

public
class ASTClassCtorDecl extends SimpleNode {
  public ASTClassCtorDecl(int id) {
    super(id);
  }

  public ASTClassCtorDecl(Parser p, int id) {
    super(p, id);
  }


  /** Accept the visitor. **/
  public Object jjtAccept(ParserVisitor visitor, Object data) throws net.nokok.karaffe.parser.excptn.ParserException {

    return
    visitor.visit(this, data);
  }
}
/* JavaCC - OriginalChecksum=699fe88caff2d2522219449afc92f9fe (do not edit this line) */
