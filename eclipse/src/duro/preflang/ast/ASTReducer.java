package duro.preflang.ast;

import java.util.List;
import java.util.function.Function;

public class ASTReducer implements ASTBuilder {
	private ASTBuilder[] builders;
	private Function<AST[], AST> reducer;
	
	public ASTReducer(ASTBuilder[] builders, Function<AST[], AST> reducer) {
		this.builders = builders;
		this.reducer = reducer;
	}

	@Override
	public void build(List<AST> sequence) {
		AST[] asts = new AST[builders.length];
		for(int i = 0; i < asts.length; i++)
			asts[i] = builders[i].buildAsGrouping();
		sequence.add(reducer.apply(asts));
	}
}
