/* Generated By:JJTree: Do not edit this line. ASTInterfaceDecl.java Version 6.0 */
/* JavaCCOptions:MULTI=true,NODE_USES_PARSER=false,VISITOR=true,TRACK_TOKENS=false,NODE_PREFIX=AST,NODE_EXTENDS=,NODE_FACTORY=,SUPPORT_CLASS_VISIBILITY_PUBLIC=true */
package net.nokok.karaffe.parser;

public
class ASTInterfaceDecl extends SimpleNode {
  public ASTInterfaceDecl(int id) {
    super(id);
  }

  public ASTInterfaceDecl(Parser p, int id) {
    super(p, id);
  }


  /** Accept the visitor. **/
  public Object jjtAccept(ParserVisitor visitor, Object data) throws net.nokok.karaffe.parser.excptn.ParserException {

    return
    visitor.visit(this, data);
  }
}
/* JavaCC - OriginalChecksum=01ed680a260b9d564f7f68e313a60df2 (do not edit this line) */
