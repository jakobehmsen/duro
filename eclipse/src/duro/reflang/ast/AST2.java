package duro.reflang.ast;

import duro.io.WritableTree;

public interface AST2 extends WritableTree {
	void accept(ASTVisitor2 visitor);
}
