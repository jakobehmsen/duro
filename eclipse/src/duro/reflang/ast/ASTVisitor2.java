package duro.reflang.ast;

public interface ASTVisitor2 {
	void visitArray(AST2Array ast);
	void visitBehavior(AST2Behavior ast);
	void visitClosure(AST2Closure ast);
	void visitDict(AST2Dict ast);
	void visitFalse(AST2False ast);
	void visitFrame(AST2Frame ast);
	void visitGrouping(AST2Grouping ast);
	void visitImplicitReceiver(AST2ImplicitReceiver ast);
	void visitInteger(AST2Integer ast);
	void visitInterfaceId(AST2InterfaceId ast);
	void visitVariableAccess(AST2VariableAccess ast);
	void visitParameterAccess(AST2ParameterAccess ast);
	void visitVariableAssignment(AST2VariableAssignment ast);
	void visitMessage(AST2Message ast);
	void visitMessageExchange(AST2MessageExchange ast);
	void visitNull(AST2Null ast);
	void visitProgram(AST2Program ast);
	void visitSlotAccess(AST2SlotAccess ast);
	void visitSlotAssignment(AST2SlotAssignment ast);
	void visitSpawn(AST2Spawn ast);
	void visitString(AST2String ast);
	void visitThis(AST2This ast);
	void visitTrue(AST2True ast2True);
}
