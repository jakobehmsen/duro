package duro.reflang.ast2;

public abstract class ASTBuilderFromReceiver implements ASTBuilder {
	@Override
	public AST build() {
//		return createBuilder(() -> AST2This.INSTANCE).build();
		return createBuilder(() -> ASTImplicitReceiver.INSTANCE).build();
	}
	
	public abstract ASTBuilder createBuilder(ASTBuilder receiver);
}
