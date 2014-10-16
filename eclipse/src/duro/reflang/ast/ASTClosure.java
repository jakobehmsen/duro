package duro.reflang.ast;

public class ASTClosure implements AST {
	public final int parameterOffset;
	public final int parameterCount;
	public final AST body;
	
	public ASTClosure(int parameterOffset, int parameterCount, AST body) {
		this.parameterOffset = parameterOffset;
		this.parameterCount = parameterCount;
		this.body = body;
	}

	@Override
	public void accept(ASTVisitor visitor) {
		visitor.visitClosure(this);
	}
}
