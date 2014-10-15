package duro.reflang;

public class ASTInteger implements AST {
	public final int integer;
	
	public ASTInteger(int integer) {
		this.integer = integer;
	}

	public void accept(ASTVisitor visitor) {
		visitor.visitInteger(this);
	}
}
