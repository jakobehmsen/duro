package duro.reflang.ast;

public interface ASTBuilderFromReceiver extends ASTBuilder {
	ASTBuilder createBuilder(ASTBuilder receiver);
}
