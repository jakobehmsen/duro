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
		visitAsExpression(ast.receiver);
		for(int i = 0; i < ast.message.arguments.length; i++)
			visitAsExpression(ast.message.arguments[i]);
		instructions.addSingle(new Instruction(Instruction.OPCODE_SEND, ast.message.id, ast.message.arguments.length));
		if(!mustBeExpression)
			instructions.addSingle(new Instruction(Instruction.OPCODE_POP));
	}

	@Override
	public void visitMessage(ASTMessage ast) { }

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

		appendSlotAssignment(ast.id, ast.type, ast.arity, ast.value);
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
		ASTToCode bodyVisitor = new ASTToCode(primitiveMap, instructions, true);
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
	public void visitDict(ASTDict ast) {
		if(mustBeExpression) {
			instructions.addSingle(new Instruction(Instruction.OPCODE_SP_NEW_DICT));
			for(ASTDict.Entry entry: ast.entries) {
				instructions.addSingle(new Instruction(Instruction.OPCODE_DUP));
				appendSlotAssignment(entry.id, entry.type, entry.arity, entry.value);
			}
		}
	}
	
	private void appendSlotAssignment(String id, int type, int arity, AST value) {
		switch(type) {
		case ASTSlotAssignment.TYPE_REGULAR:
			value.accept(this);
			instructions.addSingle(new Instruction(Instruction.OPCODE_SET, id, arity));
			break;
		case ASTSlotAssignment.TYPE_PROTO:
			value.accept(this);
			instructions.addSingle(new Instruction(Instruction.OPCODE_SET_PROTO, id, arity));
			break;
		case ASTSlotAssignment.TYPE_QUOTED:
			ASTToCode bodyVisitor = new ASTToCode(primitiveMap, instructions, true);
			ASTBehavior behavior = (ASTBehavior)value;
			behavior.body.accept(bodyVisitor);
			CodeEmission bodyCode = bodyVisitor.instructions.generate();
			Instruction[] bodyInstructions = bodyCode.toArray(new Instruction[bodyCode.size()]);
			instructions.addSingle(new Instruction(Instruction.OPCODE_SP_NEW_BEHAVIOR, behavior.localCount, bodyCode.getMaxStackSize(), bodyInstructions));
			instructions.addSingle(new Instruction(Instruction.OPCODE_SET, id, arity));
			break;
		}
	}

	@Override
	public void visitArray(ASTArray ast) {
		if(mustBeExpression) {
			int length = ast.items.length;
			instructions.addSingle(new Instruction(Instruction.OPCODE_LOAD_INT, length));
			instructions.addSingle(new Instruction(Instruction.OPCODE_SP_NEW_ARRAY));
			
			for(int i = 0; i < length; i++) {
				instructions.addSingle(new Instruction(Instruction.OPCODE_DUP));
				instructions.addSingle(new Instruction(Instruction.OPCODE_LOAD_INT, i));
				ast.items[i].accept(this);
				instructions.addSingle(new Instruction(Instruction.OPCODE_SP_ARRAY_SET));
			}
		}
	}
	
	@Override
	public void visitBehavior(ASTBehavior ast) { }
	
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
