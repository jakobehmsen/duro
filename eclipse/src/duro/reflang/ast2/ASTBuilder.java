package duro.reflang.ast2;

import java.util.ArrayList;
import java.util.List;

public interface ASTBuilder {
	void build(List<AST> sequence);
	default AST buildAsGrouping() {
		ArrayList<AST> sequence = new ArrayList<AST>();
		build(sequence);
		return new ASTGrouping(sequence.toArray(new AST[sequence.size()]));
	}
}
