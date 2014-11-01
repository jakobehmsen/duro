package duro.reflang;

import duro.reflang.ast2.AST;

public interface PrimitiveVisitor2 {
	void visitPrimitive(String id, AST[] args);
}
