/* Generated By:JJTree: Do not edit this line. ASTUndefinedLiteral.java Version 6.0 */
/* JavaCCOptions:MULTI=true,NODE_USES_PARSER=false,VISITOR=true,TRACK_TOKENS=false,NODE_PREFIX=AST,NODE_EXTENDS=,NODE_FACTORY=,SUPPORT_CLASS_VISIBILITY_PUBLIC=true */
package net.nokok.karaffe.parser;

public
class ASTUndefinedLiteral extends SimpleNode {
  public ASTUndefinedLiteral(int id) {
    super(id);
  }

  public ASTUndefinedLiteral(Parser p, int id) {
    super(p, id);
  }


  /** Accept the visitor. **/
  public Object jjtAccept(ParserVisitor visitor, Object data) throws net.nokok.karaffe.parser.excptn.ParserException {

    return
    visitor.visit(this, data);
  }
}
/* JavaCC - OriginalChecksum=148338fe89bcbcb0b2eaa3060d975158 (do not edit this line) */
