package duro.reflang;

public interface AST {
	void accept(ASTVisitor visitor);
}
