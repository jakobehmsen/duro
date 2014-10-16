package duro.reflang.ast;

public class ASTLocalAccess implements AST {
	public final int ordinal;
	
	public ASTLocalAccess(int ordinal) {
		this.ordinal = ordinal;
	}

	@Override
	public void accept(ASTVisitor visitor) {
		visitor.visitLocalAccess(this);
	}
}
