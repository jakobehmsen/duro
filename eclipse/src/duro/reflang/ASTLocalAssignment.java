package duro.reflang;

public class ASTLocalAssignment implements AST {
	public final int ordinal;
	public final AST value;
	
	public ASTLocalAssignment(int ordinal, AST value) {
		this.ordinal = ordinal;
		this.value = value;
	}

	@Override
	public void accept(ASTVisitor visitor) {
		visitor.visitLocalAssignment(this);
	}
}
