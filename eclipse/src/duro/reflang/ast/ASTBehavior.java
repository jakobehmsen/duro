package duro.reflang.ast;

public class ASTBehavior implements AST {
	public final int localCount;
	public final AST body;
	
	public ASTBehavior(int localCount, AST body) {
		this.localCount = localCount;
		this.body = body;
	}

	@Override
	public void accept(ASTVisitor visitor) {
		visitor.visitBehavior(this);
	}
}
