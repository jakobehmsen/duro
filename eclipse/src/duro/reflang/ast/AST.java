package duro.reflang.ast;

public interface AST {
	void accept(ASTVisitor visitor);
}
