/* Generated By:JJTree: Do not edit this line. ASTAtomicType.java */

package net.sourceforge.pmd.jerry.ast.xpath;

import net.sourceforge.pmd.jerry.ast.xpath.custom.ImageNode;

public class ASTAtomicType extends ImageNode {
  public ASTAtomicType(int id) {
    super(id);
  }

  public ASTAtomicType(XPath2Parser p, int id) {
    super(p, id);
  }


  /** Accept the visitor. **/
  public Object jjtAccept(XPath2ParserVisitor visitor, Object data) {
    return visitor.visit(this, data);
  }
}