package duro.reflang.ast2;

import duro.io.WritableTree;

public interface AST2 extends WritableTree {
	void accept(ASTVisitor2 visitor);
}
