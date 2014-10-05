package duro.reflang;

import java.util.ArrayList;
import java.util.Hashtable;
import java.util.List;
import java.util.function.Supplier;
import java.util.stream.Collectors;

import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

import duro.reflang.antlr4_2.DuroBaseVisitor;
import duro.reflang.antlr4_2.DuroLexer;
import duro.reflang.antlr4_2.DuroParser.AccessContext;
import duro.reflang.antlr4_2.DuroParser.AssignmentContext;
import duro.reflang.antlr4_2.DuroParser.BehaviorParamsContext;
import duro.reflang.antlr4_2.DuroParser.BinaryMessageContext;
import duro.reflang.antlr4_2.DuroParser.BinaryMessageOperandChainContext;
import duro.reflang.antlr4_2.DuroParser.BinaryMessageOperandContext;
import duro.reflang.antlr4_2.DuroParser.ClosureContext;
import duro.reflang.antlr4_2.DuroParser.DictContext;
import duro.reflang.antlr4_2.DuroParser.DictEntryContext;
import duro.reflang.antlr4_2.DuroParser.ExpressionContext;
import duro.reflang.antlr4_2.DuroParser.GroupingContext;
import duro.reflang.antlr4_2.DuroParser.IdContext;
import duro.reflang.antlr4_2.DuroParser.IndexAccessContext;
import duro.reflang.antlr4_2.DuroParser.IntegerContext;
import duro.reflang.antlr4_2.DuroParser.InterfaceIdContext;
import duro.reflang.antlr4_2.DuroParser.MessageChainContext;
import duro.reflang.antlr4_2.DuroParser.MessageExchangeContext;
import duro.reflang.antlr4_2.DuroParser.MultiArgMessageArgNoParChainContext;
import duro.reflang.antlr4_2.DuroParser.MultiArgMessageArgNoParContext;
import duro.reflang.antlr4_2.DuroParser.MultiArgMessageArgsNoParContext;
import duro.reflang.antlr4_2.DuroParser.MultiArgMessageArgsWithParContext;
import duro.reflang.antlr4_2.DuroParser.MultiArgMessageNoParContext;
import duro.reflang.antlr4_2.DuroParser.MultiArgMessageWithParContext;
import duro.reflang.antlr4_2.DuroParser.ParArgContext;
import duro.reflang.antlr4_2.DuroParser.ProgramContext;
import duro.reflang.antlr4_2.DuroParser.PseudoVarContext;
import duro.reflang.antlr4_2.DuroParser.SelectorContext;
import duro.reflang.antlr4_2.DuroParser.SelfMultiArgMessageNoParContext;
import duro.reflang.antlr4_2.DuroParser.SelfMultiArgMessageWithParContext;
import duro.reflang.antlr4_2.DuroParser.SlotAccessContext;
import duro.reflang.antlr4_2.DuroParser.SlotAssignmentContext;
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
	public Object visitInterfaceId(InterfaceIdContext ctx) {
		idToVariableOrdinalMap = idToVariableOrdinalMap.newInnerStart();
		String interfaceId = ctx.id().getText();
		instructions.add(new Instruction(Instruction.OPCODE_EXTEND_INTER_ID, interfaceId));

		ctx.expression().accept(this);
		
		instructions.add(new Instruction(Instruction.OPCODE_SHRINK_INTER_ID));
		idToVariableOrdinalMap = idToVariableOrdinalMap.getOuter();
		
		return null;
	}
	
	@Override
	public Object visitMessageExchange(MessageExchangeContext ctx) {
		if(!mustBeExpression) {
			if(ctx.messageChain() != null) {
				BodyVisitor messageExchangeVisitor = new BodyVisitor(primitiveMap, errors, endHandlers, instructions, true, idToParameterOrdinalMap, idToVariableOrdinalMap);
				ctx.receiver().accept(messageExchangeVisitor);
				
				MessageChainContext chain = ctx.messageChain();
				
				while(chain != null) {
					messageExchangeVisitor.mustBeExpression = chain.messageChain() != null;
					chain.accept(messageExchangeVisitor);
					chain = chain.messageChain();
				}

			} else {
				ctx.receiver().accept(new BodyVisitor(primitiveMap, errors, endHandlers, instructions, false, idToParameterOrdinalMap, idToVariableOrdinalMap));
			}
		} else {
			super.visitMessageExchange(ctx);
		}
		
		return false;
	}
	
	@Override
	public Object visitBinaryMessageOperand(BinaryMessageOperandContext ctx) {
		if(!mustBeExpression) {
			if(ctx.binaryMessageOperandChain() != null) {
				BodyVisitor messageExchangeVisitor = new BodyVisitor(primitiveMap, errors, endHandlers, instructions, true, idToParameterOrdinalMap, idToVariableOrdinalMap);
				ctx.receiver().accept(messageExchangeVisitor);
				
				BinaryMessageOperandChainContext chain = ctx.binaryMessageOperandChain();
				
				while(chain != null) {
					messageExchangeVisitor.mustBeExpression = chain.binaryMessageOperandChain() != null;
					chain.accept(messageExchangeVisitor);
					chain = chain.binaryMessageOperandChain();
				}

			} else {
				ctx.receiver().accept(new BodyVisitor(primitiveMap, errors, endHandlers, instructions, false, idToParameterOrdinalMap, idToVariableOrdinalMap));
			}
		} else {
			super.visitBinaryMessageOperand(ctx);
		}
		
		return false;
	}
	
	@Override
	public Object visitMultiArgMessageArgNoPar(MultiArgMessageArgNoParContext ctx) {
		if(!mustBeExpression) {
			if(ctx.multiArgMessageArgNoParChain() != null) {
				BodyVisitor messageExchangeVisitor = new BodyVisitor(primitiveMap, errors, endHandlers, instructions, true, idToParameterOrdinalMap, idToVariableOrdinalMap);
				ctx.receiver().accept(messageExchangeVisitor);
				
				MultiArgMessageArgNoParChainContext chain = ctx.multiArgMessageArgNoParChain();
				
				while(chain != null) {
					messageExchangeVisitor.mustBeExpression = chain.multiArgMessageArgNoParChain() != null;
					chain.accept(messageExchangeVisitor);
					chain = chain.multiArgMessageArgNoParChain();
				}

			} else {
				ctx.receiver().accept(new BodyVisitor(primitiveMap, errors, endHandlers, instructions, false, idToParameterOrdinalMap, idToVariableOrdinalMap));
			}
		} else {
			super.visitMultiArgMessageArgNoPar(ctx);
		}
		
		return false;
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
		
		if(!mustBeExpression)
			instructions.add(new Instruction(Instruction.OPCODE_POP));
		
		return null;
	}
	
	@Override
	public Object visitSelfMultiArgMessageNoPar(SelfMultiArgMessageNoParContext ctx) {
		appendMultiArgMessageNoPar(ctx.multiArgMessageNoPar(), true);
		
		return null;
	}
	
	@Override
	public Object visitMultiArgMessageNoPar(MultiArgMessageNoParContext ctx) {
		appendMultiArgMessageNoPar(ctx, false);
		
		return null;
	}

	private void appendMultiArgMessageNoPar(MultiArgMessageNoParContext ctx, boolean isForSelf) {
		String id = ctx.ID_UNCAP().getText() + ctx.ID_CAP().stream().map(x -> x.getText()).collect(Collectors.joining());
		ArrayList<ParserRuleContext> args = new ArrayList<ParserRuleContext>();
		for(MultiArgMessageArgsNoParContext argsCtx: ctx.multiArgMessageArgsNoPar()) {
			for(MultiArgMessageArgNoParContext argCtx: argsCtx.multiArgMessageArgNoPar())
				args.add(argCtx);
		}
		
		appendMultiArgMessage(id, args, isForSelf);
	}
	
	@Override
	public Object visitSelfMultiArgMessageWithPar(SelfMultiArgMessageWithParContext ctx) {
		appendMultiArgMessageWithPar(ctx.multiArgMessageWithPar(), true);
		
		return null;
	}
	
	@Override
	public Object visitMultiArgMessageWithPar(MultiArgMessageWithParContext ctx) {
		appendMultiArgMessageWithPar(ctx, false);
		
		return null;
	}

	private void appendMultiArgMessageWithPar(MultiArgMessageWithParContext ctx, boolean isForSelf) {
		String id = ctx.ID_UNCAP().getText() + ctx.ID_CAP().stream().map(x -> x.getText()).collect(Collectors.joining());
		ArrayList<ParserRuleContext> args = new ArrayList<ParserRuleContext>();
		for(MultiArgMessageArgsWithParContext argsCtx: ctx.multiArgMessageArgsWithPar()) {
			for(ExpressionContext argCtx: argsCtx.expression())
				args.add(argCtx);
		}
		
		appendMultiArgMessage(id, args, isForSelf);
	}
	
	protected void appendMultiArgMessage(String id, List<ParserRuleContext> args, boolean isForSelf) {
		int parameterCount = args.size();
		PrimitiveVisitorFactory primitiveVisitorFactory = primitiveMap.get(Selector.get(id, parameterCount));
		
		if(primitiveVisitorFactory != null) {
			PrimitiveVisitor primitiveInterceptor = primitiveVisitorFactory.create(primitiveMap, errors, endHandlers, instructions, mustBeExpression, idToParameterOrdinalMap, idToVariableOrdinalMap);
			primitiveInterceptor.visitPrimitive(id, args);
		} else {
			if(isForSelf)
				instructions.add(new Instruction(Instruction.OPCODE_LOAD_THIS));
			ParseTreeVisitor<Object> argsVisitor = mustBeExpression ? this : new BodyVisitor(primitiveMap, errors, endHandlers, instructions, true, idToParameterOrdinalMap, idToVariableOrdinalMap);
			for(ParserRuleContext argCtx: args)
				argCtx.accept(argsVisitor);
			
			instructions.add(new Instruction(Instruction.OPCODE_SEND, id, parameterCount));
			
			if(!mustBeExpression)
				instructions.add(new Instruction(Instruction.OPCODE_POP));
		}
	}
	
	@Override
	public Object visitGrouping(GroupingContext ctx) {
		BodyVisitor expressionVisitor = new BodyVisitor(primitiveMap, errors, endHandlers, instructions, true, idToParameterOrdinalMap, idToVariableOrdinalMap);
		appendGroup(ctx.expression(), mustBeExpression, expressionVisitor);
		
		return null;
	}
	
	@Override
	public Object visitAssignment(AssignmentContext ctx) {
		String id = ctx.id().getText();				
		
		switch(ctx.op.getType()) {
		case DuroLexer.ASSIGN: {
			// newValue, newValue
			if(idToVariableOrdinalMap.isDeclared(id))
				appendAssignVariable(ctx.expression(), id);
			else {
				instructions.add(new Instruction(Instruction.OPCODE_LOAD_THIS));
				appendAssignSlot(ctx.expression(), id, mustBeExpression);
			}
			break;
		} case DuroLexer.ASSIGN_PROTO: {
			instructions.add(new Instruction(Instruction.OPCODE_LOAD_THIS));
			appendAssignProto(ctx.expression(), id, mustBeExpression);
			break;
		}
		}

		// Quoted member assignment for this
		if(ctx.op.getType() == DuroLexer.ASSIGN_QUOTED) {
			instructions.add(new Instruction(Instruction.OPCODE_LOAD_THIS));
			appendAssignQuoted(ctx.behaviorParams(), ctx.expression(), id, mustBeExpression);
		}
		
		return null;
	}
	
	@Override
	public Object visitSlotAssignment(SlotAssignmentContext ctx) {
		String id = ctx.id().getText();				
		
		switch(ctx.op.getType()) {
		case DuroLexer.ASSIGN: {
			appendAssignSlot(ctx.expression(), id, mustBeExpression);
			break;
		} case DuroLexer.ASSIGN_PROTO: {
			appendAssignProto(ctx.expression(), id, mustBeExpression);
			break;
		} case DuroLexer.ASSIGN_QUOTED: {
			appendAssignQuoted(ctx.behaviorParams(), ctx.expression(), id, mustBeExpression);
			break;
		}
		}
		
		return null;
	}
	
	public Object visitIndexAssignment(duro.reflang.antlr4_2.DuroParser.IndexAssignmentContext ctx) {
		// receiver
		ExpressionContext indexCtx = ctx.expression(0);
		indexCtx.accept(new BodyVisitor(primitiveMap, errors, endHandlers, instructions, true, idToParameterOrdinalMap, idToVariableOrdinalMap));
		// receiver, index
		ExpressionContext valueCtx = ctx.expression(1);
		valueCtx.accept(new BodyVisitor(primitiveMap, errors, endHandlers, instructions, true, idToParameterOrdinalMap, idToVariableOrdinalMap));
		// receiver, index, value
		instructions.add(new Instruction(Instruction.OPCODE_SEND, "[]", 2));
		// result
		
		if(!mustBeExpression)
			instructions.add(new Instruction(Instruction.OPCODE_POP));
		
		return null;
	}

	private void appendAssignVariable(ExpressionContext valueCtx, String id) {
		valueCtx.accept(new BodyVisitor(primitiveMap, errors, endHandlers, instructions, true, idToParameterOrdinalMap, idToVariableOrdinalMap));
		if(mustBeExpression)
			instructions.add(new Instruction(Instruction.OPCODE_DUP));
		// Variable assignment
		idToVariableOrdinalMap.ordinalFor(id, instructions, firstOrdinal -> new Instruction(Instruction.OPCODE_STORE_LOC, firstOrdinal));
	}

	private void appendAssignSlot(ExpressionContext valueCtx, String id, boolean returnValue) {
		appendAssignSlot(valueCtx, id, Instruction.OPCODE_SET, returnValue);
	}

	private void appendAssignProto(ExpressionContext valueCtx, String id, boolean returnValue) {
		appendAssignSlot(valueCtx, id, Instruction.OPCODE_SET_PROTO, returnValue);
	}

	private void appendAssignSlot(ExpressionContext valueCtx, String id, int opcodeAssign, boolean returnValue) {
		// receiver
		valueCtx.accept(new BodyVisitor(primitiveMap, errors, endHandlers, instructions, true, idToParameterOrdinalMap, idToVariableOrdinalMap));
		// receiver, newValue
		if(returnValue)
			instructions.add(new Instruction(Instruction.OPCODE_DUP1));
			// newValue, receiver, newValue
		instructions.add(new Instruction(opcodeAssign, id, 0));
		// newValue | e
	}

	private void appendAssignQuoted(BehaviorParamsContext paramsCtx, ExpressionContext valueCtx, String id, boolean returnValue) {
		BodyVisitor functionBodyInterceptor = new BodyVisitor(primitiveMap, errors, endHandlers);
		for(IdContext parameterIdNode: paramsCtx.id()) {
			String parameterId = parameterIdNode.getText();
			functionBodyInterceptor.idToParameterOrdinalMap.declare(parameterId);
		}
		valueCtx.accept(functionBodyInterceptor);
		functionBodyInterceptor.instructions.add(new Instruction(Instruction.OPCODE_RET));
		int parameterCount = functionBodyInterceptor.idToParameterOrdinalMap.size();
		int selectorParameterCount = functionBodyInterceptor.idToParameterOrdinalMap.sizeExceptEnd();
		int variableCount = functionBodyInterceptor.idToVariableOrdinalMap.size();
		
		functionBodyInterceptor.idToParameterOrdinalMap.generate();
		functionBodyInterceptor.idToVariableOrdinalMap.generate();

		onEnd(() -> {
			Instruction[] bodyInstructions = functionBodyInterceptor.instructions.toArray(new Instruction[functionBodyInterceptor.instructions.size()]);
			return new Instruction(Instruction.OPCODE_SP_NEW_BEHAVIOR, parameterCount, variableCount, bodyInstructions);
		});
		if(returnValue)
			instructions.add(new Instruction(Instruction.OPCODE_DUP1));
		instructions.add(new Instruction(Instruction.OPCODE_SET, id, selectorParameterCount));
	}
	
	@Override
	public Object visitSlotAccess(SlotAccessContext ctx) {
		if(mustBeExpression) {
			String id = getSelectorId(ctx.selector());
			instructions.add(new Instruction(Instruction.OPCODE_GET, id, 0));
		}
		
		return null;
	}
	
	@Override
	public Object visitIndexAccess(IndexAccessContext ctx) {
		if(mustBeExpression) {
			ctx.expression().accept(new BodyVisitor(primitiveMap, errors, endHandlers, instructions, true, idToParameterOrdinalMap, idToVariableOrdinalMap));
			instructions.add(new Instruction(Instruction.OPCODE_SEND, "[]", 1));
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
	public Object visitParArg(ParArgContext ctx) {
		idToParameterOrdinalMap.declare(ctx.id().getText(), instructions, parameterOrdinal -> new Instruction(Instruction.OPCODE_LOAD_ARG, parameterOrdinal));

		return null;
	}
	
	@Override
	public Object visitDict(DictContext ctx) {
		instructions.add(new Instruction(Instruction.OPCODE_SP_NEW_DICT));
		
		for(DictEntryContext entryCtx: ctx.dictEntry()) {
			instructions.add(new Instruction(Instruction.OPCODE_DUP));
			
			String id = getSelectorId(entryCtx.selector());
			
			switch(entryCtx.op.getType()) {
			case DuroLexer.ASSIGN:
				appendAssignSlot(entryCtx.expression(), id, false);
				break;
			case DuroLexer.ASSIGN_PROTO:
				appendAssignProto(entryCtx.expression(), id, false);
				break;
			case DuroLexer.ASSIGN_QUOTED:
				appendAssignQuoted(entryCtx.behaviorParams(), entryCtx.expression(), id, false);
				break;
			}
		}
		
		return null;
	}
	
	@Override
	public Object visitClosure(ClosureContext ctx) {
		if(mustBeExpression) {
			OrdinalAllocator newIdToVariableOrdinalMap = idToVariableOrdinalMap.newInnerEnd();
			OrdinalAllocator newIdToParameterOrdinalMap = idToParameterOrdinalMap.newInnerEnd();
			BodyVisitor closureBodyInterceptor = new BodyVisitor(primitiveMap, errors, endHandlers, new ArrayList<Instruction>(), true, newIdToParameterOrdinalMap, newIdToVariableOrdinalMap);
			for(IdContext parameterIdNode: ctx.behaviorParams().id()) {
				String parameterId = parameterIdNode.getText();
				closureBodyInterceptor.idToParameterOrdinalMap.declare(parameterId);
			}
			appendGroup(ctx.expression(), true, closureBodyInterceptor);
			closureBodyInterceptor.instructions.add(new Instruction(Instruction.OPCODE_RET));
			int parameterCount = closureBodyInterceptor.idToParameterOrdinalMap.size();
			int closureParameterCount = closureBodyInterceptor.idToParameterOrdinalMap.sizeExceptEnd();
			int variableCount = closureBodyInterceptor.idToVariableOrdinalMap.size();
			
			closureBodyInterceptor.idToParameterOrdinalMap.generate();
			closureBodyInterceptor.idToVariableOrdinalMap.generate();

			onEnd(() -> {
				Instruction[] bodyInstructions = closureBodyInterceptor.instructions.toArray(new Instruction[closureBodyInterceptor.instructions.size()]);
				return new Instruction(Instruction.OPCODE_SP_NEW_BEHAVIOR, parameterCount, variableCount, bodyInstructions);
			});
			newIdToParameterOrdinalMap.getLocalParameterOffset(instructions, closureParameterOffset -> 
				new Instruction(Instruction.OPCODE_SP_NEW_CLOSURE, closureParameterOffset, closureParameterCount));
		}

		return null;
	}
	
	private void appendGroup(List<ExpressionContext> group, boolean lastMustBeExpression, BodyVisitor expressionVisitor) {
		// Only last expression have a pop instruction appended
		for(int i = 0; i < group.size(); i++) {
			if(lastMustBeExpression)
				expressionVisitor.mustBeExpression = i == group.size() - 1; // If last
			else
				expressionVisitor.mustBeExpression = false;
			group.get(i).accept(expressionVisitor);
		}
	}
	
	@Override
	public Object visitPseudoVar(PseudoVarContext ctx) {
		switch(ctx.PSEUDO_VAR().getText()) {
		case "this":
			instructions.add(new Instruction(Instruction.OPCODE_LOAD_THIS));
			break;
		case "null":
			instructions.add(new Instruction(Instruction.OPCODE_LOAD_NULL));
			break;
		case "true":
			instructions.add(new Instruction(Instruction.OPCODE_LOAD_TRUE));
			break;
		case "false":
			instructions.add(new Instruction(Instruction.OPCODE_LOAD_FALSE));
			break;
		case "frame":
			instructions.add(new Instruction(Instruction.OPCODE_LOAD_FRAME));
			break;
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
	
	private static String getSelectorId(SelectorContext ctx) {
		return ctx.getText();
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
