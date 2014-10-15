package duro.reflang;

public interface ASTVisitor {
	void visitMessageExchange(ASTMessageExchange ast);
	void visitMessage(ASTMessage ast);
	void visitThis(ASTThis ast);
	void visitNull(ASTNull ast);
	void visitTrue(ASTTrue ast);
	void visitFalse(ASTFalse ast);
	void visitFrame(ASTFrame ast);
	void visitString(ASTString ast);
	void visitInteger(ASTInteger ast);
	void visitLocalAssignment(ASTLocalAssignment ast);
	void visitLocalAccess(ASTLocalAccess ast);
	void visitSlotAccess(ASTSlotAccess ast);
	void visitSlotAssignment(ASTSlotAssignment ast);
	void visitGrouping(ASTGrouping ast);
	void visitClosure(ASTClosure ast);
	void visitInterfaceId(ASTInterfaceId ast);
	void visitDict(ASTDict astDict);
	void visitArray(ASTArray ast);
}
