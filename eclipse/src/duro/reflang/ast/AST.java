package duro.reflang.ast;

import duro.io.WritableTree;

public interface AST extends WritableTree {
	void accept(ASTVisitor visitor);
}
