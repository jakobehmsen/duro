package duro.reflang;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Hashtable;
import java.util.List;
import java.util.Set;
import java.util.function.Supplier;
import java.util.stream.Collectors;

import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

import duro.reflang.antlr4.DuroBaseVisitor;
import duro.reflang.antlr4.DuroLexer;
import duro.reflang.antlr4.DuroParser.AccessContext;
import duro.reflang.antlr4.DuroParser.ArrayContext;
import duro.reflang.antlr4.DuroParser.AssignmentContext;
import duro.reflang.antlr4.DuroParser.BehaviorParamsContext;
import duro.reflang.antlr4.DuroParser.BinaryMessageContext;
import duro.reflang.antlr4.DuroParser.BinaryMessageOperandChainContext;
import duro.reflang.antlr4.DuroParser.BinaryMessageOperandContext;
import duro.reflang.antlr4.DuroParser.ClosureContext;
import duro.reflang.antlr4.DuroParser.DictContext;
import duro.reflang.antlr4.DuroParser.DictEntryContext;
import duro.reflang.antlr4.DuroParser.ExpressionChainContext;
import duro.reflang.antlr4.DuroParser.ExpressionContext;
import duro.reflang.antlr4.DuroParser.GroupingContext;
import duro.reflang.antlr4.DuroParser.IdContext;
import duro.reflang.antlr4.DuroParser.IndexAccessContext;
import duro.reflang.antlr4.DuroParser.IndexAssignmentContext;
import duro.reflang.antlr4.DuroParser.IntegerContext;
import duro.reflang.antlr4.DuroParser.InterfaceIdContext;
import duro.reflang.antlr4.DuroParser.MessageChainContext;
import duro.reflang.antlr4.DuroParser.MessageExchangeContext;
import duro.reflang.antlr4.DuroParser.MultiArgMessageArgNoParChainContext;
import duro.reflang.antlr4.DuroParser.MultiArgMessageArgNoParContext;
import duro.reflang.antlr4.DuroParser.MultiArgMessageArgsWithParContext;
import duro.reflang.antlr4.DuroParser.MultiArgMessageNoParContext;
import duro.reflang.antlr4.DuroParser.MultiArgMessageNoParTailContext;
import duro.reflang.antlr4.DuroParser.MultiArgMessageWithParContext;
import duro.reflang.antlr4.DuroParser.ParArgContext;
import duro.reflang.antlr4.DuroParser.ProgramContext;
import duro.reflang.antlr4.DuroParser.PseudoVarContext;
import duro.reflang.antlr4.DuroParser.SelectorContext;
import duro.reflang.antlr4.DuroParser.SelfMultiArgMessageNoParContext;
import duro.reflang.antlr4.DuroParser.SelfMultiArgMessageWithParContext;
import duro.reflang.antlr4.DuroParser.SelfSingleArgMessageNoParContext;
import duro.reflang.antlr4.DuroParser.SingleArgMessageNoParContext;
import duro.reflang.antlr4.DuroParser.SlotAccessContext;
import duro.reflang.antlr4.DuroParser.SlotAssignmentContext;
import duro.reflang.antlr4.DuroParser.StringContext;
import duro.reflang.antlr4.DuroParser.UnaryMessageContext;
import duro.reflang.antlr4.DuroParser.VariableDeclarationContext;
import duro.runtime.Instruction;
import duro.runtime.Selector;

public class BodyVisitor extends DuroBaseVisitor<Object> {
	private Hashtable<Selector, PrimitiveVisitorFactory> primitiveMap;
	private MessageCollector errors;
	private ArrayList<Runnable> endHandlers;
	private CodeEmitter instructions;
	private boolean mustBeExpression;
	private OrdinalAllocator idToParameterOrdinalMap;
	private OrdinalAllocator idToVariableOrdinalMap;
	private Set<String> fields;

	public BodyVisitor(Hashtable<Selector, PrimitiveVisitorFactory> primitiveMap, MessageCollector errors, ArrayList<Runnable> endHandlers, Set<String> fields) {
		this.primitiveMap = primitiveMap;
		this.errors = errors;
		this.endHandlers = endHandlers;
		this.instructions = new CodeEmitter();
		this.mustBeExpression = true;
		this.idToParameterOrdinalMap = new OrdinalAllocator();
		this.idToVariableOrdinalMap = new OrdinalAllocator();
		this.fields = fields;
	}

	public BodyVisitor(Hashtable<Selector, PrimitiveVisitorFactory> primitiveMap, MessageCollector errors, ArrayList<Runnable> endHandlers, 
			CodeEmitter instructions, boolean mustBeExpression, OrdinalAllocator idToParameterOrdinalMap, OrdinalAllocator idToVariableOrdinalMap, 
			Set<String> fields) {
		this.primitiveMap = primitiveMap;
		this.errors = errors;
		this.endHandlers = endHandlers;
		this.instructions = instructions;
		this.mustBeExpression = mustBeExpression;
		this.idToParameterOrdinalMap = idToParameterOrdinalMap;
		this.idToVariableOrdinalMap = idToVariableOrdinalMap;
		this.fields = fields;
	}
	
	private BodyVisitor startDict(Set<String> fields) {
		return new BodyVisitor(primitiveMap, errors, endHandlers, instructions, mustBeExpression, idToParameterOrdinalMap, idToVariableOrdinalMap, fields);
	}
	
	private BodyVisitor startInner(boolean mustBeExpression) {
		return new BodyVisitor(primitiveMap, errors, endHandlers, instructions, mustBeExpression, idToParameterOrdinalMap, idToVariableOrdinalMap, fields);
	}
	
	private BodyVisitor startInner(OrdinalAllocator idToParameterOrdinalMap, OrdinalAllocator idToVariableOrdinalMap) {
		return new BodyVisitor(primitiveMap, errors, endHandlers, new CodeEmitter(), true, idToParameterOrdinalMap, idToVariableOrdinalMap, fields);
	}
	
	@Override
	public Object visitProgram(ProgramContext ctx) {
		BodyVisitor rootExpressionInterceptor = startInner(false);

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
				BodyVisitor messageExchangeVisitor = startInner(true);
				ctx.receiver().accept(messageExchangeVisitor);
				
				MessageChainContext chain = ctx.messageChain();
				
				while(chain != null) {
					messageExchangeVisitor.mustBeExpression = chain.messageChain() != null;
					chain.accept(messageExchangeVisitor);
					chain = chain.messageChain();
				}

			} else {
				ctx.receiver().accept(startInner(false));
			}
		} else {
			super.visitMessageExchange(ctx);
		}
		
		return false;
	}
	
	@Override
	public Object visitExpression(ExpressionContext ctx) {
		ParserRuleContext expr = (ParserRuleContext)ctx.getChild(0);
		if(!mustBeExpression) {
			if(ctx.expressionChain().size() > 0) {
				BodyVisitor messageExchangeVisitor = startInner(true);
				expr.accept(messageExchangeVisitor);
				
				for(int i = 0; i < ctx.expressionChain().size(); i++) {
					ExpressionChainContext chain = ctx.expressionChain(i);
					messageExchangeVisitor.mustBeExpression = i < ctx.expressionChain().size() - 1;
					chain.accept(messageExchangeVisitor);
				}
			} else {
				expr.accept(this);
			}
		} else {
			expr.accept(this);
		}
		
		return null;
	}
	
	@Override
	public Object visitBinaryMessageOperand(BinaryMessageOperandContext ctx) {
		if(!mustBeExpression) {
			if(ctx.binaryMessageOperandChain() != null) {
				BodyVisitor messageExchangeVisitor = startInner(true);
				ctx.receiver().accept(messageExchangeVisitor);
				
				BinaryMessageOperandChainContext chain = ctx.binaryMessageOperandChain();
				
				while(chain != null) {
					messageExchangeVisitor.mustBeExpression = chain.binaryMessageOperandChain() != null;
					chain.accept(messageExchangeVisitor);
					chain = chain.binaryMessageOperandChain();
				}

			} else {
				ctx.receiver().accept(startInner(false));
			}
		} else {
			super.visitBinaryMessageOperand(ctx);
		}
		
		return false;
	}
	
	@Override
	public Object visitMultiArgMessageArgNoPar(MultiArgMessageArgNoParContext ctx) {
		if(!mustBeExpression) {
			if(ctx.selfSingleArgMessageNoPar() != null) {
				ctx.selfSingleArgMessageNoPar().accept(startInner(false));
			} else {
				if(ctx.multiArgMessageArgNoParChain() != null) {
					BodyVisitor messageExchangeVisitor = startInner(true);
					ctx.multiArgMessageArgNoParReceiver().accept(messageExchangeVisitor);
					
					MultiArgMessageArgNoParChainContext chain = ctx.multiArgMessageArgNoParChain();
					
					while(chain != null) {
						messageExchangeVisitor.mustBeExpression = chain.multiArgMessageArgNoParChain() != null;
						chain.accept(messageExchangeVisitor);
						chain = chain.multiArgMessageArgNoParChain();
					}
	
				} else {
					ctx.multiArgMessageArgNoParReceiver().accept(startInner(false));
				}
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
				ctx.expression().accept(startInner(true));
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
		String id = 
			ctx.multiArgMessageNoParHead().ID_UNCAP().getText() + 
			ctx.multiArgMessageNoParTail().stream().map(x -> x.ID_CAP().getText()).collect(Collectors.joining());
		ArrayList<ParserRuleContext> args = new ArrayList<ParserRuleContext>();
		
		for(ParserRuleContext argCtx: ctx.multiArgMessageNoParHead().multiArgMessageArgsNoPar().multiArgMessageArgNoPar()) {
			if(ctx.multiArgMessageNoParHead().modifier.getType() == DuroLexer.SINGLE_QUOTE) {
				// Wrap arg into closure
				argCtx = wrapIntoClosure(ctx, ctx.invokingState, argCtx);
			}
			args.add(argCtx);
		}

		for(MultiArgMessageNoParTailContext tailCtx: ctx.multiArgMessageNoParTail()) {
			for(ParserRuleContext argCtx: tailCtx.multiArgMessageArgsNoPar().multiArgMessageArgNoPar()) {
				if(tailCtx.modifier.getType() == DuroLexer.SINGLE_QUOTE) {
					// Wrap arg into closure
					argCtx = wrapIntoClosure(ctx, ctx.invokingState, argCtx);
				}
				args.add(argCtx);
			}
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
			for(ParserRuleContext argCtx: argsCtx.multiArgMessageArgsWithParArg())
				args.add(argCtx);
		}
		
		appendMultiArgMessage(id, args, isForSelf);
	}
	
	@Override
	public Object visitSelfSingleArgMessageNoPar(SelfSingleArgMessageNoParContext ctx) {
		appendSingleArgMessageNoPar(ctx.singleArgMessageNoPar(), true);
		
		return null;
	}
	
	@Override
	public Object visitSingleArgMessageNoPar(SingleArgMessageNoParContext ctx) {
		appendSingleArgMessageNoPar(ctx, false);
		
		return null;
	}

	private void appendSingleArgMessageNoPar(SingleArgMessageNoParContext ctx, boolean isForSelf) {
		String id = ctx.ID_UNCAP().getText();
		ArrayList<ParserRuleContext> args = new ArrayList<ParserRuleContext>();
		ParserRuleContext argCtx = ctx.multiArgMessageArgNoPar();
		if(ctx.modifier.getType() == DuroLexer.SINGLE_QUOTE) {
			// Wrap arg into closure
			argCtx = wrapIntoClosure(ctx, ctx.invokingState, argCtx);
		}
		args.add(argCtx);
		
		appendMultiArgMessage(id, args, isForSelf);
	}
	
	private ParserRuleContext wrapIntoClosure(ParserRuleContext parent, int invokingState, ParserRuleContext argCtx) {
		ClosureContext argClosureCtx = new ClosureContext(parent, invokingState);
		argClosureCtx.addChild(new BehaviorParamsContext(argClosureCtx, invokingState));
		ExpressionContext body = new ExpressionContext(argClosureCtx, invokingState);
		body.addChild(argCtx);
		argClosureCtx.addChild(body);
		return argClosureCtx;
	}

	@Override
	public Object visitUnaryMessage(UnaryMessageContext ctx) {
		String id = ctx.ID_UNCAP().getText();
		ArrayList<ParserRuleContext> args = new ArrayList<ParserRuleContext>();;
		
		appendMultiArgMessage(id, args, false);
		
		return null;
	}
	
	protected void appendMultiArgMessage(String id, List<ParserRuleContext> args, boolean isForSelf) {
		int parameterCount = args.size();
		PrimitiveVisitorFactory primitiveVisitorFactory = primitiveMap.get(Selector.get(id, parameterCount));
		
		if(primitiveVisitorFactory != null) {
			PrimitiveVisitor primitiveInterceptor = primitiveVisitorFactory.create(primitiveMap, errors, endHandlers, instructions, mustBeExpression, idToParameterOrdinalMap, idToVariableOrdinalMap, fields);
			primitiveInterceptor.visitPrimitive(id, args);
		} else {
			if(isForSelf)
				instructions.add(new Instruction(Instruction.OPCODE_LOAD_THIS));
			ParseTreeVisitor<Object> argsVisitor = mustBeExpression ? this : startInner(true);
			for(ParserRuleContext argCtx: args)
				argCtx.accept(argsVisitor);
			
			instructions.add(new Instruction(Instruction.OPCODE_SEND, id, parameterCount));
			
			if(!mustBeExpression)
				instructions.add(new Instruction(Instruction.OPCODE_POP));
		}
	}
	
	@Override
	public Object visitGrouping(GroupingContext ctx) {
		BodyVisitor expressionVisitor = startInner(mustBeExpression);
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
		String id = getSelectorId(ctx.selector());
		
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
	
	public Object visitIndexAssignment(IndexAssignmentContext ctx) {
		// receiver
		ExpressionContext indexCtx = ctx.expression(0);
		indexCtx.accept(startInner(true));
		// receiver, index
		ExpressionContext valueCtx = ctx.expression(1);
		valueCtx.accept(startInner(true));
		// receiver, index, value
		instructions.add(new Instruction(Instruction.OPCODE_SEND, "[]", 2));
		// result
		
		if(!mustBeExpression)
			instructions.add(new Instruction(Instruction.OPCODE_POP));
		
		return null;
	}

	private void appendAssignVariable(ExpressionContext valueCtx, String id) {
		valueCtx.accept(startInner(true));
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
		valueCtx.accept(startInner(true));
		// receiver, newValue
		if(returnValue)
			instructions.add(new Instruction(Instruction.OPCODE_DUP1));
			// newValue, receiver, newValue
		/* The sequence could be changed as follows for set instructions:
		[value, target]
		
		This way, a simple dup operation can be performed:
		[value, value, target]
		*/
		instructions.add(new Instruction(opcodeAssign, id, 0));
		// newValue | e
		
		fields.add(id);
	}

	private void appendAssignQuoted(BehaviorParamsContext paramsCtx, ExpressionContext valueCtx, String id, boolean returnValue) {
		BodyVisitor functionBodyInterceptor = new BodyVisitor(primitiveMap, errors, endHandlers, fields);
		for(IdContext parameterIdNode: paramsCtx.id()) {
			String parameterId = parameterIdNode.getText();
			functionBodyInterceptor.idToParameterOrdinalMap.declare(parameterId);
		}
		valueCtx.accept(functionBodyInterceptor);
		functionBodyInterceptor.instructions.add(new Instruction(Instruction.OPCODE_RET));
		int parameterCount = functionBodyInterceptor.idToParameterOrdinalMap.size();
		int selectorParameterCount = functionBodyInterceptor.idToParameterOrdinalMap.sizeExceptEnd();
		int variableCount = functionBodyInterceptor.idToVariableOrdinalMap.size();
		
		/*Start from 1 since zero is used for self*/
		int parameterOffset = 1;
		functionBodyInterceptor.idToParameterOrdinalMap.generate(parameterOffset);
		int variableOffset = parameterOffset + functionBodyInterceptor.idToParameterOrdinalMap.size();
		functionBodyInterceptor.idToVariableOrdinalMap.generate(variableOffset);

		onEnd(() -> {
			Instruction[] bodyInstructions = functionBodyInterceptor.instructions.toArray(new Instruction[functionBodyInterceptor.instructions.size()]);
			// localCount should be irrelevant because locals of the closed frame is used
			int localCount = 1 + parameterCount + variableCount; 
			return new Instruction(Instruction.OPCODE_SP_NEW_BEHAVIOR, localCount, functionBodyInterceptor.instructions.getMaxStackSize(), bodyInstructions);
		});
		if(returnValue)
			instructions.add(new Instruction(Instruction.OPCODE_DUP1));
		/* The sequence could be changed as follows for set instructions:
		[value, target]
		
		This way, a simple dup operation can be performed:
		[value, value, target]
		*/
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
			ctx.expression().accept(startInner(true));
			instructions.add(new Instruction(Instruction.OPCODE_SEND, "[]", 1));
		}
		
		return null;
	}
	
	@Override
	public Object visitAccess(AccessContext ctx) {
		String id = ctx.id().getText();
		
		if(idToParameterOrdinalMap.isDeclared(id)) {
			if(mustBeExpression) {
				// Load argument
//				idToParameterOrdinalMap.ordinalFor(id, instructions, parameterOrdinal -> new Instruction(Instruction.OPCODE_LOAD_ARG, parameterOrdinal));
				idToParameterOrdinalMap.ordinalFor(id, instructions, parameterOrdinal -> new Instruction(Instruction.OPCODE_LOAD_LOC, parameterOrdinal));
			}
			return null;
		}
		
		if(idToVariableOrdinalMap.isDeclared(id)) {
			if(mustBeExpression) {
				// Load variable
				idToVariableOrdinalMap.ordinalFor(id, instructions, variableOrdinal -> new Instruction(Instruction.OPCODE_LOAD_LOC, variableOrdinal));
			}
			return null;
		}

		// Up to three instructions
		instructions.add(new Instruction(Instruction.OPCODE_LOAD_THIS));
		
		boolean accessMustBeExpression = mustBeExpression;
		onEnd(() -> {
			if(fields.contains(id)) {
				// Get member
				if(accessMustBeExpression) {
					return new Instruction(Instruction.OPCODE_GET, id, 0);
				} else {
					return new Instruction(Instruction.OPCODE_POP, id, 0);
				}
			} else {
				// Message to self
				return new Instruction(Instruction.OPCODE_SEND, id, 0);
			}
		});
		onEnd(() -> {
			if(fields.contains(id)) {
				// Get member
				return new Instruction(Instruction.OPCODE_NONE, id, 0);
			} else {
				if(accessMustBeExpression) {
					return new Instruction(Instruction.OPCODE_NONE, id, 0);
				} else {
					// Message to self
					return new Instruction(Instruction.OPCODE_POP, id, 0);
				}
			}
		});
		
		return null;
	}
	
	@Override
	public Object visitParArg(ParArgContext ctx) {
//		idToParameterOrdinalMap.declare(ctx.id().getText(), instructions, parameterOrdinal -> new Instruction(Instruction.OPCODE_LOAD_ARG, parameterOrdinal));
		idToParameterOrdinalMap.declare(ctx.id().getText(), instructions, parameterOrdinal -> new Instruction(Instruction.OPCODE_LOAD_LOC, parameterOrdinal));

		return null;
	}
	
	@Override
	public Object visitDict(DictContext ctx) {
		instructions.add(new Instruction(Instruction.OPCODE_SP_NEW_DICT));
		
		BodyVisitor dictVisitor = startDict(new HashSet<String>());
		
		for(DictEntryContext entryCtx: ctx.dictEntry()) {
			instructions.add(new Instruction(Instruction.OPCODE_DUP));
			
			String id = getSelectorId(entryCtx.selector());
			
			switch(entryCtx.op.getType()) {
			case DuroLexer.ASSIGN:
				dictVisitor.appendAssignSlot(entryCtx.expression(), id, false);
				break;
			case DuroLexer.ASSIGN_PROTO:
				dictVisitor.appendAssignProto(entryCtx.expression(), id, false);
				break;
			case DuroLexer.ASSIGN_QUOTED:
				dictVisitor.appendAssignQuoted(entryCtx.behaviorParams(), entryCtx.expression(), id, false);
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
			BodyVisitor closureBodyVisitor = startInner(newIdToParameterOrdinalMap, newIdToVariableOrdinalMap);
			for(IdContext parameterIdNode: ctx.behaviorParams().id()) {
				String parameterId = parameterIdNode.getText();
				closureBodyVisitor.idToParameterOrdinalMap.declare(parameterId);
			}
			appendGroup(ctx.expression(), true, closureBodyVisitor);
			closureBodyVisitor.instructions.add(new Instruction(Instruction.OPCODE_RET));
			int parameterCount = closureBodyVisitor.idToParameterOrdinalMap.size();
			int closureParameterCount = closureBodyVisitor.idToParameterOrdinalMap.sizeExceptEnd();
			int variableCount = closureBodyVisitor.idToVariableOrdinalMap.size();
			
//			closureBodyVisitor.idToParameterOrdinalMap.generate();
//			closureBodyVisitor.idToVariableOrdinalMap.generate();

			onEnd(() -> {
				Instruction[] bodyInstructions = closureBodyVisitor.instructions.toArray(new Instruction[closureBodyVisitor.instructions.size()]);
				int localCount = 1 + parameterCount + variableCount;
				return new Instruction(Instruction.OPCODE_SP_NEW_BEHAVIOR, localCount, closureBodyVisitor.instructions.getMaxStackSize(), bodyInstructions);
			});
			newIdToParameterOrdinalMap.getLocalParameterOffset(instructions, closureParameterOffset -> 
				new Instruction(Instruction.OPCODE_SP_NEW_CLOSURE, closureParameterOffset, closureParameterCount));
		}

		return null;
	}
	
	@Override
	public Object visitArray(ArrayContext ctx) {
		if(mustBeExpression) {
			int length = ctx.expression().size();
			instructions.add(new Instruction(Instruction.OPCODE_LOAD_INT, length));
			instructions.add(new Instruction(Instruction.OPCODE_SP_NEW_ARRAY));
			BodyVisitor itemVisitor = startInner(true);
			
			for(int i = 0; i < length; i++) {
				instructions.add(new Instruction(Instruction.OPCODE_DUP));
				instructions.add(new Instruction(Instruction.OPCODE_LOAD_INT, i));
				ExpressionContext item = ctx.expression(i);
				item.accept(itemVisitor);
				instructions.add(new Instruction(Instruction.OPCODE_SP_ARRAY_SET));
			}
		}
		
		return null;
	}
	
	public void appendGroup(List<ExpressionContext> group) {
		appendGroup(group, mustBeExpression, this);
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
			instructions.add(new Instruction(Instruction.OPCODE_LOAD_THIS_FRAME));
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
