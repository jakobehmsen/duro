package duro.reflang;

public class ASTArray implements AST {
	public final AST[] items;
	
	public ASTArray(AST[] items) {
		this.items = items;
	}

	@Override
	public void accept(ASTVisitor visitor) {
		visitor.visitArray(this);
	}
}
