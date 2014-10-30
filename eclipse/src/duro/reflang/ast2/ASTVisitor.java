package duro.reflang.ast2;


public interface ASTVisitor {
	void visitArray(ASTArray ast);
	void visitBehavior(ASTBehavior ast);
	void visitClosure(ASTClosure ast);
	void visitDict(ASTDict ast);
	void visitFalse(ASTFalse ast);
	void visitFrame(ASTFrame ast);
	void visitGrouping(ASTGrouping ast);
	void visitImplicitReceiver(ASTImplicitReceiver ast);
	void visitInteger(ASTInteger ast);
	void visitInterfaceId(ASTInterfaceId ast);
	void visitVariableAccess(ASTVariableAccess ast);
	void visitParameterAccess(ASTParameterAccess ast);
	void visitVariableAssignment(ASTVariableAssignment ast);
	void visitMessage(ASTMessage ast);
	void visitMessageExchange(ASTMessageExchange ast);
	void visitNull(ASTNull ast);
	void visitProgram(ASTProgram ast);
	void visitSlotAccess(ASTSlotAccess ast);
	void visitSlotAssignment(ASTSlotAssignment ast);
	void visitSpawn(ASTSpawn ast);
	void visitString(ASTString ast);
	void visitThis(ASTThis ast);
	void visitTrue(ASTTrue ast2True);
}
