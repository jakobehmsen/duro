package duro.preflang.ast;

import java.util.List;

public abstract class ASTBuilderFromReceiver implements ASTBuilder {
	@Override
	public void build(List<AST> sequence) {
		createBuilder(sequenceReceiver -> sequenceReceiver.add(ASTImplicitReceiver.INSTANCE)).build(sequence);
	}
	
	public abstract ASTBuilder createBuilder(ASTBuilder receiver);
}
