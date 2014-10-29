package duro.reflang.ast;

public interface ASTVisitor2 {
	void visitArray(AST2Array ast);
	void visitBehavior(AST2Behavior ast);
	void visitClosure(AST2Closure ast);
	void visitDict(AST2Dict ast);
	void visitFalse(AST2False ast);
	void visitFrame(AST2Frame ast);
	void visitGrouping(AST2Grouping ast);
}
