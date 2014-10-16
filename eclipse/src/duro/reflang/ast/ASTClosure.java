package duro.reflang.ast;

public class ASTClosure implements AST {
	public final int parameterCount;
	public final int parameterOffset;
	public final AST body;
	
	public ASTClosure(int parameterCount, int parameterOffset, AST body) {
		this.parameterCount = parameterCount;
		this.parameterOffset = parameterOffset;
		this.body = body;
	}

	@Override
	public void accept(ASTVisitor visitor) {
		visitor.visitClosure(this);
	}
}
