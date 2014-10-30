package duro.reflang.ast2;

public abstract class ASTBuilderFromReceiver implements ASTBuilder {
	@Override
	public AST2 build() {
//		return createBuilder(() -> AST2This.INSTANCE).build();
		return createBuilder(() -> AST2ImplicitReceiver.INSTANCE).build();
	}
	
	public abstract ASTBuilder createBuilder(ASTBuilder receiver);
}
