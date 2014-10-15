package duro.reflang;

public interface ASTBuilderFromReceiver extends ASTBuilder {
	ASTBuilder createBuilder(ASTBuilder receiver);
}
