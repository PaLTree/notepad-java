/* Generated By:JJTree: Do not edit this line. ASTTypeAliasModifier.java Version 6.0 */
/* JavaCCOptions:MULTI=true,NODE_USES_PARSER=false,VISITOR=true,TRACK_TOKENS=false,NODE_PREFIX=AST,NODE_EXTENDS=,NODE_FACTORY=,SUPPORT_CLASS_VISIBILITY_PUBLIC=true */
package net.nokok.karaffe.parser;

public
class ASTTypeAliasModifier extends SimpleNode {
  public ASTTypeAliasModifier(int id) {
    super(id);
  }

  public ASTTypeAliasModifier(Parser p, int id) {
    super(p, id);
  }


  /** Accept the visitor. **/
  public Object jjtAccept(ParserVisitor visitor, Object data) throws net.nokok.karaffe.parser.excptn.ParserException {

    return
    visitor.visit(this, data);
  }
}
/* JavaCC - OriginalChecksum=b958e3c6e5131696110356f2dc14b774 (do not edit this line) */
