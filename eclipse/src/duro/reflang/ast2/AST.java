package duro.reflang.ast2;

import duro.io.WritableTree;

public interface AST extends WritableTree {
	void accept(ASTVisitor visitor);
}
