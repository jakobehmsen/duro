package duro.reflang.ast;

public abstract class ASTBuilderFromReceiver implements ASTBuilder {
	@Override
	public AST build() {
		return createBuilder(() -> ASTThis.INSTANCE).build();
	}
	
	public abstract ASTBuilder createBuilder(ASTBuilder receiver);
}
