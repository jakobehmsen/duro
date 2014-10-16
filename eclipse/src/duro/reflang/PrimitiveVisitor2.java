package duro.reflang;

import duro.reflang.ast.AST;

public interface PrimitiveVisitor2 {
	void visitPrimitive(String id, AST[] args);
}
