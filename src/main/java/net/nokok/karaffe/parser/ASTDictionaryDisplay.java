/* Generated By:JJTree: Do not edit this line. ASTDictionaryDisplay.java Version 6.0 */
/* JavaCCOptions:MULTI=true,NODE_USES_PARSER=false,VISITOR=true,TRACK_TOKENS=false,NODE_PREFIX=AST,NODE_EXTENDS=,NODE_FACTORY=,SUPPORT_CLASS_VISIBILITY_PUBLIC=true */
package net.nokok.karaffe.parser;

public
class ASTDictionaryDisplay extends SimpleNode {
  public ASTDictionaryDisplay(int id) {
    super(id);
  }

  public ASTDictionaryDisplay(Parser p, int id) {
    super(p, id);
  }


  /** Accept the visitor. **/
  public Object jjtAccept(ParserVisitor visitor, Object data) throws net.nokok.karaffe.parser.excptn.ParserException {

    return
    visitor.visit(this, data);
  }
}
/* JavaCC - OriginalChecksum=e8cc94a3ef1139a7e3d46cb9da85ae18 (do not edit this line) */
