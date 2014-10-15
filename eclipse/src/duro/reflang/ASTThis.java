package duro.reflang;

public class ASTThis implements AST {
	public static final ASTThis INSTANCE = new ASTThis();
	
	@Override
	public void accept(ASTVisitor visitor) {
		visitor.visitThis(this);
	}
}
