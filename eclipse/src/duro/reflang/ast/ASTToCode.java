package duro.reflang.ast;

import java.util.Hashtable;

import duro.reflang.CodeEmission;
import duro.reflang.CodeEmitter;
import duro.reflang.PrimitiveVisitorFactory;
import duro.runtime.Instruction;
import duro.runtime.Selector;

public class ASTToCode implements ASTVisitor {
	private Hashtable<Selector, PrimitiveVisitorFactory> primitiveMap;
	private CodeEmitter instructions;
	private boolean mustBeExpression;

	public ASTToCode(Hashtable<Selector, PrimitiveVisitorFactory> primitiveMap, CodeEmitter instructions, boolean mustBeExpression) {
		this.primitiveMap = primitiveMap;
		this.instructions = instructions;
		this.mustBeExpression = mustBeExpression;
	}

	@Override
	public void visitMessageExchange(ASTMessageExchange ast) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void visitMessage(ASTMessage ast) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void visitThis(ASTThis ast) {
		if(mustBeExpression)
			instructions.addSingle(new Instruction(Instruction.OPCODE_LOAD_THIS));
	}

	@Override
	public void visitNull(ASTNull ast) {
		if(mustBeExpression)
			instructions.addSingle(new Instruction(Instruction.OPCODE_LOAD_NULL));
	}

	@Override
	public void visitTrue(ASTTrue ast) {
		if(mustBeExpression)
			instructions.addSingle(new Instruction(Instruction.OPCODE_LOAD_TRUE));
	}

	@Override
	public void visitFalse(ASTFalse ast) {
		if(mustBeExpression)
			instructions.addSingle(new Instruction(Instruction.OPCODE_LOAD_FALSE));
	}

	@Override
	public void visitFrame(ASTFrame ast) {
		if(mustBeExpression)
			instructions.addSingle(new Instruction(Instruction.OPCODE_LOAD_THIS_FRAME));
	}

	@Override
	public void visitString(ASTString ast) {
		if(mustBeExpression)
			instructions.addSingle(new Instruction(Instruction.OPCODE_LOAD_STRING, ast.string));
	}

	@Override
	public void visitInteger(ASTInteger ast) {
		if(mustBeExpression)
			instructions.addSingle(new Instruction(Instruction.OPCODE_LOAD_INT, ast.integer));
	}

	@Override
	public void visitLocalAssignment(ASTLocalAssignment ast) {
		visitAsExpression(ast.value);
		if(mustBeExpression)
			instructions.addSingle(new Instruction(Instruction.OPCODE_DUP));
		instructions.addSingle(new Instruction(Instruction.OPCODE_STORE_LOC, ast.ordinal));
	}

	@Override
	public void visitLocalAccess(ASTLocalAccess ast) {
		if(mustBeExpression)
			instructions.addSingle(new Instruction(Instruction.OPCODE_LOAD_LOC, ast.ordinal));
	}

	@Override
	public void visitSlotAccess(ASTSlotAccess ast) {
		if(mustBeExpression) {
			ast.receiver.accept(this);
			instructions.addSingle(new Instruction(Instruction.OPCODE_GET, ast.id, ast.arity));
		}
	}

	@Override
	public void visitSlotAssignment(ASTSlotAssignment ast) {
		visitAsExpression(ast.receiver);
		visitAsExpression(ast.value);
		if(mustBeExpression)
			instructions.addSingle(new Instruction(Instruction.OPCODE_DUP1));
		instructions.addSingle(new Instruction(Instruction.OPCODE_SET, ast.id, ast.arity));
	}

	@Override
	public void visitGrouping(ASTGrouping ast) {
		for(int i = 0; i < ast.items.length; i++) {
			boolean itemMustBeExpression = mustBeExpression ? i == ast.items.length - 1 : false;
			visit(ast.items[i], itemMustBeExpression);
		}
	}

	@Override
	public void visitClosure(ASTClosure ast) {
		ASTToCode bodyVisitor = new ASTToCode(primitiveMap, instructions, mustBeExpression);
		ast.body.accept(bodyVisitor);
		CodeEmission bodyCode = bodyVisitor.instructions.generate();
		Instruction[] bodyInstructions = bodyCode.toArray(new Instruction[bodyCode.size()]);
		instructions.addSingle(new Instruction(Instruction.OPCODE_SP_NEW_BEHAVIOR, 0 /*Zero because inherited from frame*/, bodyCode.getMaxStackSize(), bodyInstructions));
		instructions.addSingle(new Instruction(Instruction.OPCODE_SP_NEW_CLOSURE, ast.parameterOffset, ast.parameterCount));
	}

	@Override
	public void visitInterfaceId(ASTInterfaceId ast) {
		instructions.addSingle(new Instruction(Instruction.OPCODE_EXTEND_INTER_ID, ast.id));
		ast.accept(this);
		instructions.addSingle(new Instruction(Instruction.OPCODE_SHRINK_INTER_ID));
	}

	@Override
	public void visitDict(ASTDict astDict) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void visitArray(ASTArray ast) {
		// TODO Auto-generated method stub
		
	}
	
	private void visitAsExpression(AST ast) {
		visit(ast, true);
	}
	
	private void visit(AST ast, boolean astMustBeExpression) {
		if(this.mustBeExpression != astMustBeExpression) {
			boolean mustExpressionTmp = mustBeExpression;
			mustBeExpression = astMustBeExpression;
			ast.accept(this);
			mustBeExpression = mustExpressionTmp;
		} else
			ast.accept(this);
	}
}
