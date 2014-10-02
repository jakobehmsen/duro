package duro.reflang;

import java.util.ArrayList;
import java.util.Hashtable;
import java.util.function.Supplier;
import java.util.stream.Collectors;

import org.antlr.v4.runtime.ParserRuleContext;

import duro.reflang.antlr4_2.DuroBaseVisitor;
import duro.reflang.antlr4_2.DuroLexer;
import duro.reflang.antlr4_2.DuroParser.AccessContext;
import duro.reflang.antlr4_2.DuroParser.AssignmentContext;
import duro.reflang.antlr4_2.DuroParser.BinaryMessageContext;
import duro.reflang.antlr4_2.DuroParser.IdContext;
import duro.reflang.antlr4_2.DuroParser.IntegerContext;
import duro.reflang.antlr4_2.DuroParser.MultiArgMessageArgContext;
import duro.reflang.antlr4_2.DuroParser.MultiArgMessageArgsContext;
import duro.reflang.antlr4_2.DuroParser.MultiArgMessageContext;
import duro.reflang.antlr4_2.DuroParser.ProgramContext;
import duro.reflang.antlr4_2.DuroParser.StringContext;
import duro.reflang.antlr4_2.DuroParser.VariableDeclarationContext;
import duro.runtime.Instruction;
import duro.runtime.Selector;

public class BodyVisitor extends DuroBaseVisitor<Object> {
	private Hashtable<Selector, PrimitiveVisitorFactory> primitiveMap;
	private MessageCollector errors;
	private ArrayList<Runnable> endHandlers;
	private ArrayList<Instruction> instructions;
	private boolean mustBeExpression;
	private OrdinalAllocator idToParameterOrdinalMap;
	private OrdinalAllocator idToVariableOrdinalMap;

	public BodyVisitor(Hashtable<Selector, PrimitiveVisitorFactory> primitiveMap, MessageCollector errors, ArrayList<Runnable> endHandlers) {
		this.primitiveMap = primitiveMap;
		this.errors = errors;
		this.endHandlers = endHandlers;
		this.instructions = new ArrayList<Instruction>();
		this.mustBeExpression = true;
		this.idToParameterOrdinalMap = new OrdinalAllocator();
		this.idToVariableOrdinalMap = new OrdinalAllocator();
	}

	public BodyVisitor(Hashtable<Selector, PrimitiveVisitorFactory> primitiveMap, MessageCollector errors, ArrayList<Runnable> endHandlers, 
			ArrayList<Instruction> instructions,
			boolean mustBeExpression, OrdinalAllocator idToParameterOrdinalMap,
			OrdinalAllocator idToVariableOrdinalMap) {
		this.primitiveMap = primitiveMap;
		this.errors = errors;
		this.endHandlers = endHandlers;
		this.instructions = instructions;
		this.mustBeExpression = mustBeExpression;
		this.idToParameterOrdinalMap = idToParameterOrdinalMap;
		this.idToVariableOrdinalMap = idToVariableOrdinalMap;
	}
	
	@Override
	public Object visitProgram(ProgramContext ctx) {
		BodyVisitor rootExpressionInterceptor = new BodyVisitor(primitiveMap, errors, endHandlers, instructions, false, idToParameterOrdinalMap, idToVariableOrdinalMap);

		for(int i = 0; i < ctx.expression().size() ; i++)
			ctx.expression(i).accept(rootExpressionInterceptor);

		instructions.add(new Instruction(Instruction.OPCODE_FINISH));
		
		return null;
	}
	
	@Override
	public Object visitAssignment(AssignmentContext ctx) {
		String id = ctx.id().getText();				
		
		switch(ctx.op.getType()) {
		case DuroLexer.ASSIGN: {
			// newValue, newValue
			if(idToVariableOrdinalMap.isDeclared(id)) {
				ctx.expression().accept(new BodyVisitor(primitiveMap, errors, endHandlers, instructions, true, idToParameterOrdinalMap, idToVariableOrdinalMap));
//				append(true, idToParameterOrdinalMap, idToVariableOrdinalMap, ctx.expression(), instructions);
				if(mustBeExpression)
					instructions.add(new Instruction(Instruction.OPCODE_DUP));
				// Variable assignment
				idToVariableOrdinalMap.ordinalFor(id, instructions, firstOrdinal -> new Instruction(Instruction.OPCODE_STORE_LOC, firstOrdinal));
			} else {
				instructions.add(new Instruction(Instruction.OPCODE_LOAD_THIS));
				// receiver
				ctx.expression().accept(new BodyVisitor(primitiveMap, errors, endHandlers, instructions, true, idToParameterOrdinalMap, idToVariableOrdinalMap));
//				append(true, idToParameterOrdinalMap, idToVariableOrdinalMap, ctx.expression(), instructions);
				// receiver, newValue
				if(mustBeExpression)
					instructions.add(new Instruction(Instruction.OPCODE_DUP1));
					// newValue, receiver, newValue
				instructions.add(new Instruction(Instruction.OPCODE_SET, id, 0));
				// newValue | e
			}
			break;
		} case DuroLexer.ASSIGN_PROTO: {
			if(!mustBeExpression)
				instructions.add(new Instruction(Instruction.OPCODE_LOAD_THIS));
			ctx.expression().accept(new BodyVisitor(primitiveMap, errors, endHandlers, instructions, true, idToParameterOrdinalMap, idToVariableOrdinalMap));
//			append(true, idToParameterOrdinalMap, idToVariableOrdinalMap, ctx.expression(), instructions);
			if(mustBeExpression)
				instructions.add(new Instruction(Instruction.OPCODE_DUP));
				// newValue, newValue
			if(mustBeExpression) {
				instructions.add(new Instruction(Instruction.OPCODE_LOAD_THIS));
				// newValue, newValue, receiver
				instructions.add(new Instruction(Instruction.OPCODE_SWAP));
				// newValue, receiver, newValue
			}
			instructions.add(new Instruction(Instruction.OPCODE_SET_PROTO, id, 0));
			break;
		}
		}

		// Member assignment for this
		if(ctx.op.getType() == DuroLexer.ASSIGN_QUOTED) {
			BodyVisitor functionBodyInterceptor = new BodyVisitor(primitiveMap, errors, endHandlers);
			for(IdContext parameterIdNode: ctx.behaviorParams().id()) {
				String parameterId = parameterIdNode.getText();
				functionBodyInterceptor.idToParameterOrdinalMap.declare(parameterId);
			}
			ctx.expression().accept(functionBodyInterceptor);
			int parameterCount = functionBodyInterceptor.idToParameterOrdinalMap.size();
			int selectorParameterCount = functionBodyInterceptor.idToParameterOrdinalMap.sizeExceptEnd();
			int variableCount = functionBodyInterceptor.idToVariableOrdinalMap.size();
			
			functionBodyInterceptor.idToParameterOrdinalMap.generate();
			functionBodyInterceptor.idToVariableOrdinalMap.generate();

			instructions.add(new Instruction(Instruction.OPCODE_LOAD_THIS));
			onEnd(() -> {
				Instruction[] bodyInstructions = functionBodyInterceptor.instructions.toArray(new Instruction[functionBodyInterceptor.instructions.size()]);
				return new Instruction(Instruction.OPCODE_SP_NEW_BEHAVIOR, parameterCount, variableCount, bodyInstructions);
			});
			if(mustBeExpression)
				instructions.add(new Instruction(Instruction.OPCODE_DUP1));
			instructions.add(new Instruction(Instruction.OPCODE_SET, id, selectorParameterCount));
		}
		
		return null;
	}
	
	@Override
	public Object visitVariableDeclaration(VariableDeclarationContext ctx) {
		if(!idToVariableOrdinalMap.isDeclaredLocally(ctx.id().getText()) && !idToParameterOrdinalMap.isDeclared(ctx.id().getText())) {
			idToVariableOrdinalMap.declare(ctx.id().getText());

			if(ctx.expression() == null) { 
				if(mustBeExpression)
					instructions.add(new Instruction(Instruction.OPCODE_LOAD_NULL));
			} else {
				ctx.expression().accept(new BodyVisitor(primitiveMap, errors, endHandlers, instructions, true, idToParameterOrdinalMap, idToVariableOrdinalMap));
				if(mustBeExpression)
					instructions.add(new Instruction(Instruction.OPCODE_DUP));
				idToVariableOrdinalMap.declare(ctx.id().getText(), instructions, variableOrdinal -> new Instruction(Instruction.OPCODE_STORE_LOC, variableOrdinal));
			}
		} else {
			appendError(ctx, "Variable '" + ctx.id().getText() + "' is already declared in this scope.");
		}
		
		return null;
	}
	
	@Override
	public Object visitBinaryMessage(BinaryMessageContext ctx) {
		visitChildren(ctx);
		
		String id = ctx.BIN_OP().getText();
		instructions.add(new Instruction(Instruction.OPCODE_SEND, id, 1));
		
		return null;
	}
	
	@Override
	public Object visitMultiArgMessage(MultiArgMessageContext ctx) {
		// For each argument of a message, mustBeExpresion should be true
		
		// Should be for self message exchange only?
		String id = ctx.ID_UNCAP().getText() + ctx.ID_CAP().stream().map(x -> x.getText()).collect(Collectors.joining());
		int parameterCount = ctx.multiArgMessageArgs().size();
		PrimitiveVisitorFactory primitiveVisitorFactory = primitiveMap.get(Selector.get(id, parameterCount));
		
		if(primitiveVisitorFactory != null) {
			// What about "mustBeExpression"?
			DuroBaseVisitor<Object> primitiveInterceptor = primitiveVisitorFactory.create(primitiveMap, errors, endHandlers, instructions, mustBeExpression, idToParameterOrdinalMap, idToVariableOrdinalMap);
			ctx.accept(primitiveInterceptor);
		} else {
			for(MultiArgMessageArgsContext argsCtx: ctx.multiArgMessageArgs()) {
				for(MultiArgMessageArgContext argCtx: argsCtx.multiArgMessageArg()) {
					argCtx.accept(new BodyVisitor(primitiveMap, errors, endHandlers, instructions, true, idToParameterOrdinalMap, idToVariableOrdinalMap));
				}
			}
		}
		
		return null;
	}
	
	@Override
	public Object visitAccess(AccessContext ctx) {
		if(mustBeExpression) {
			String id = ctx.id().getText();
			
			if(idToParameterOrdinalMap.isDeclared(id)) {
				// Load argument
				idToParameterOrdinalMap.ordinalFor(id, instructions, parameterOrdinal -> new Instruction(Instruction.OPCODE_LOAD_ARG, parameterOrdinal));
				return null;
			}
			
			if(idToVariableOrdinalMap.isDeclared(id)) {
				// Load variable
				idToVariableOrdinalMap.ordinalFor(id, instructions, variableOrdinal -> new Instruction(Instruction.OPCODE_LOAD_LOC, variableOrdinal));
				return null;
			}
			
			// Get member
			instructions.add(new Instruction(Instruction.OPCODE_LOAD_THIS));
			instructions.add(new Instruction(Instruction.OPCODE_GET, id, 0));
		}
		
		return null;
	}
	
	@Override
	public Object visitInteger(IntegerContext ctx) {
		if(mustBeExpression) {
			int value = Integer.parseInt(ctx.INT().getText());
			instructions.add(new Instruction(Instruction.OPCODE_LOAD_INT, value));
		}
		
		return null;
	}
	
	@Override
	public Object visitString(StringContext ctx) {
		if(mustBeExpression) {
			String rawString = ctx.getText();
			// Should the string enter properly prepared?
			// - i.e., no need for filtering the string.
			String string = extractStringLiteral(rawString);
			
			instructions.add(new Instruction(Instruction.OPCODE_LOAD_STRING, string));
		}
		
		return null;
	}
	
	private static String extractStringLiteral(String rawString) {
		return rawString.substring(1, rawString.length() - 1)
			.replace("\\n", "\n")
			.replace("\\r", "\r")
			.replace("\\t", "\t");
	}
	
	private void onEnd(Supplier<Instruction> instructionSup) {
		int index = instructions.size();
		instructions.add(null);
		endHandlers.add(() -> {
			Instruction instruction = instructionSup.get();
			instructions.set(index, instruction);
		});
	}
	
	private void appendError(ParserRuleContext ctx, String message) {
		appendError(ctx.getStart().getLine(), ctx.getStart().getCharPositionInLine(), message);
	}
	
	private void appendError(int line, int charPositionInLine, String message) {
		errors.appendMessage(line, charPositionInLine, message);
	}
}
