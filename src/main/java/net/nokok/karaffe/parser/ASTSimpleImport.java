/* Generated By:JJTree: Do not edit this line. ASTSimpleImport.java Version 6.0 */
/* JavaCCOptions:MULTI=true,NODE_USES_PARSER=false,VISITOR=true,TRACK_TOKENS=false,NODE_PREFIX=AST,NODE_EXTENDS=,NODE_FACTORY=,SUPPORT_CLASS_VISIBILITY_PUBLIC=true */
package net.nokok.karaffe.parser;

public
class ASTSimpleImport extends SimpleNode {
  public ASTSimpleImport(int id) {
    super(id);
  }

  public ASTSimpleImport(Parser p, int id) {
    super(p, id);
  }


  /** Accept the visitor. **/
  public Object jjtAccept(ParserVisitor visitor, Object data) throws net.nokok.karaffe.parser.excptn.ParserException {

    return
    visitor.visit(this, data);
  }
}
/* JavaCC - OriginalChecksum=9cde7bdfc03331dbc4e8f658697b9eb1 (do not edit this line) */
