package duro.reflang;

import duro.reflang.ast.AST;

public interface PrimitiveVisitor {
	void visitPrimitive(String id, AST[] args);
}
