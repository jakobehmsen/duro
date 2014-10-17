package duro.reflang.ast;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.function.Function;
import java.util.stream.Collectors;

import org.antlr.v4.runtime.ParserRuleContext;
import org.omg.CORBA.IntHolder;

import duro.reflang.MessageCollector;
import duro.reflang.OrdinalAllocator;
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
import duro.reflang.antlr4.DuroParser.IntegerContext;
import duro.reflang.antlr4.DuroParser.InterfaceIdContext;
import duro.reflang.antlr4.DuroParser.MessageChainContext;
import duro.reflang.antlr4.DuroParser.MessageExchangeContext;
import duro.reflang.antlr4.DuroParser.MultiArgMessageArgNoParChainContext;
import duro.reflang.antlr4.DuroParser.MultiArgMessageArgNoParContext;
import duro.reflang.antlr4.DuroParser.MultiArgMessageNoParContext;
import duro.reflang.antlr4.DuroParser.MultiArgMessageNoParTailContext;
import duro.reflang.antlr4.DuroParser.ParArgContext;
import duro.reflang.antlr4.DuroParser.ProgramContext;
import duro.reflang.antlr4.DuroParser.PseudoVarContext;
import duro.reflang.antlr4.DuroParser.SelectorContext;
import duro.reflang.antlr4.DuroParser.SelfMultiArgMessageNoParContext;
import duro.reflang.antlr4.DuroParser.SelfSingleArgMessageNoParContext;
import duro.reflang.antlr4.DuroParser.SingleArgMessageNoParContext;
import duro.reflang.antlr4.DuroParser.StringContext;
import duro.reflang.antlr4.DuroParser.UnaryMessageContext;
import duro.reflang.antlr4.DuroParser.VariableDeclarationContext;

public class ANTLRToAST extends DuroBaseVisitor<ASTBuilder> {
	private OrdinalAllocator idToParameterOrdinalMap;
	private OrdinalAllocator idToVariableOrdinalMap;
	private MessageCollector errors;
	private Set<String> accessFields;
	private Set<String> assignFields;
	
	public ANTLRToAST(OrdinalAllocator idToParameterOrdinalMap, OrdinalAllocator idToVariableOrdinalMap, MessageCollector errors, Set<String> accessFields, Set<String> assignFields) {
		this.idToParameterOrdinalMap = idToParameterOrdinalMap;
		this.idToVariableOrdinalMap = idToVariableOrdinalMap;
		this.errors = errors;
		this.accessFields = accessFields;
		this.assignFields = assignFields;
	}

	@Override
	public ASTBuilder visitProgram(ProgramContext ctx) {
		ASTBuilder bodyBuilder = appendGrouping(ctx.expression());
		return () -> new ASTProgram(bodyBuilder.build());
	}
	
	@Override
	public ASTBuilder visitGrouping(GroupingContext ctx) {
		return appendGrouping(ctx.expression());
	}
	
	private ASTBuilder appendGrouping(List<ExpressionContext> expressions) {
		ASTBuilder[] itemBuilders = new ASTBuilder[expressions.size()];
		for(int i = 0; i < itemBuilders.length; i++)
			itemBuilders[i] = expressions.get(i).accept(this);
		return new ASTReducer(itemBuilders, asts -> new ASTGrouping(asts));
	}
	
	@Override
	public ASTBuilder visitInterfaceId(InterfaceIdContext ctx) {
		String id = ctx.id().getText();
		idToVariableOrdinalMap = idToVariableOrdinalMap.newInnerStart();
		ASTBuilder bodyBuilder = ctx.expression().accept(this);
		idToVariableOrdinalMap = idToVariableOrdinalMap.getOuter();
		
		return () -> new ASTInterfaceId(id, bodyBuilder.build());
	}
	
	@Override
	public ASTBuilder visitMessageExchange(MessageExchangeContext ctx) {
		return appendMessageExchange(ctx.receiver(), ctx.messageChain().stream().map(x -> (ParserRuleContext)x).collect(Collectors.toList()), ctx.messageEnd());
	}
	
	private ASTBuilder appendMessageExchange(ParserRuleContext receiver, List<ParserRuleContext> chain, ParserRuleContext end) {
		ASTBuilder receiverBuilder = receiver.accept(this);
		
		for(ParserRuleContext chainPart: chain) {
			ASTBuilderFromReceiver messageBuilder = (ASTBuilderFromReceiver)chainPart.accept(this);
			receiverBuilder = messageBuilder.createBuilder(receiverBuilder);
		}
		
		if(end != null) {
			ASTBuilderFromReceiver messageBuilder = (ASTBuilderFromReceiver)end.accept(this);
			receiverBuilder = messageBuilder.createBuilder(receiverBuilder);
		}
		
		return receiverBuilder;
	}
	
	@Override
	public ASTBuilder visitExpression(ExpressionContext ctx) {
		ParserRuleContext receiver = (ParserRuleContext)ctx.getChild(0);

		return appendMessageExchange(receiver, ctx.expressionChain().stream().map(x -> (ParserRuleContext)x).collect(Collectors.toList()), ctx.expressionEnd());
		
//		if(ctx.expressionChain().size() > 0) {
//			ASTBuilder receiverBuilder = receiver.accept(this);
//			
//			for(int i = 0; i < ctx.expressionChain().size(); i++) {
//				ExpressionChainContext chain = ctx.expressionChain(i);
//				ASTBuilderFromReceiver messageBuilder = (ASTBuilderFromReceiver)chain.accept(this);
//				receiverBuilder = messageBuilder.createBuilder(receiverBuilder);
//			}
//
//			return receiverBuilder;
//		} else
//			return receiver.accept(this);
	}
	
	@Override
	public ASTBuilder visitMultiArgMessageArgNoPar(MultiArgMessageArgNoParContext ctx) {
		if(ctx.selfSingleArgMessageNoPar() != null) {
			return ctx.selfSingleArgMessageNoPar().accept(this);
		} else {
			return appendMessageExchange(
				ctx.multiArgMessageArgNoParReceiver(), 
				ctx.multiArgMessageArgNoParChain().stream().map(x -> (ParserRuleContext)x).collect(Collectors.toList()), 
				ctx.multiArgMessageArgNoParEnd());
//			if(ctx.multiArgMessageArgNoParChain() != null) {
//				ASTBuilder receiverBuilder = ctx.multiArgMessageArgNoParReceiver().accept(this);
//				
//				MultiArgMessageArgNoParChainContext chain = ctx.multiArgMessageArgNoParChain();
//				
//				while(chain != null) {
//					ASTBuilderFromReceiver messageBuilder = (ASTBuilderFromReceiver)chain.accept(this);
//					receiverBuilder = messageBuilder.createBuilder(receiverBuilder);
//					chain = chain.multiArgMessageArgNoParChain();
//				}
//
//				return receiverBuilder;
//			} else
//				return ctx.multiArgMessageArgNoParReceiver().accept(this);
		}
	}
	
	@Override
	public ASTBuilder visitVariableDeclaration(VariableDeclarationContext ctx) {
		String id = ctx.id().getText();
		
		if(!idToVariableOrdinalMap.isDeclaredLocally(id) && !idToParameterOrdinalMap.isDeclared(id)) {
			idToVariableOrdinalMap.declare(id);

			if(ctx.expression() != null)
				return appendAssignVariable(ctx.expression(), id);
		} else {
			appendError(ctx, "Variable '" + ctx.id().getText() + "' is already declared in this scope.");
		}
		
		return () -> ASTEmpty.INSTANCE;
	}
	
	@Override
	public ASTBuilder visitBinaryMessage(BinaryMessageContext ctx) {
		String id = ctx.BIN_OP().getText();
		
		return appendMultiArgMessage(id, Arrays.asList(ctx.binaryMessageOperand()));
	}
	
	@Override
	public ASTBuilder visitIndexAccess(IndexAccessContext ctx) {
		String id = "[]";
		
		return appendMultiArgMessage(id, Arrays.asList(ctx.expression()));
	}
	
	@Override
	public ASTBuilder visitBinaryMessageOperand(BinaryMessageOperandContext ctx) {
		if(ctx.binaryMessageOperandChain() != null) {
			ASTBuilder receiverBuilder = ctx.receiver().accept(this);
			
			BinaryMessageOperandChainContext chain = ctx.binaryMessageOperandChain();
			
			while(chain != null) {
				ASTBuilderFromReceiver messageBuilder = (ASTBuilderFromReceiver)chain.accept(this);
				receiverBuilder = messageBuilder.createBuilder(receiverBuilder);
				chain = chain.binaryMessageOperandChain();
			}

			return receiverBuilder;
		} else
			return ctx.receiver().accept(this);
	}
	
	@Override
	public ASTBuilder visitSelfMultiArgMessageNoPar(SelfMultiArgMessageNoParContext ctx) {
		return appendMultiArgMessageNoPar(ctx.multiArgMessageNoPar()).createBuilder(() -> ASTThis.INSTANCE);
	}
	
	@Override
	public ASTBuilderFromReceiver visitMultiArgMessageNoPar(MultiArgMessageNoParContext ctx) {
		return appendMultiArgMessageNoPar(ctx);
	}
	
	private ASTBuilderFromReceiver appendMultiArgMessageNoPar(MultiArgMessageNoParContext ctx) {
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
		
		return appendMultiArgMessage(id, args);
	}	
	
	protected ASTBuilderFromReceiver appendMultiArgMessage(String id, List<ParserRuleContext> args) {
		int parameterCount = args.size();
		
		ASTBuilder[] argumentBuilders = new ASTBuilder[parameterCount];
		for(int i = 0; i < argumentBuilders.length; i++) {
			// For each argument, a local scope should be allocated
			idToParameterOrdinalMap = idToParameterOrdinalMap.newInnerStart();
			idToVariableOrdinalMap = idToVariableOrdinalMap.newInnerStart();
			argumentBuilders[i] = args.get(i).accept(this);
			idToParameterOrdinalMap = idToParameterOrdinalMap.getOuter();
			idToVariableOrdinalMap = idToVariableOrdinalMap.getOuter();
		}
		
		return new ASTBuilderFromReceiver() {
			@Override
			public AST build() {
				return null;
			}
			
			@Override
			public ASTBuilder createBuilder(ASTBuilder receiverBuilder) {
				return new ASTReducer(argumentBuilders, argumentAsts -> new ASTMessageExchange(receiverBuilder.build(), new ASTMessage(id, argumentAsts))); 
			}
		};
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
	public ASTBuilder visitSelfSingleArgMessageNoPar(SelfSingleArgMessageNoParContext ctx) {
		return appendSingleArgMessageNoPar(ctx.singleArgMessageNoPar()).createBuilder(() -> ASTThis.INSTANCE);
	}
	
	@Override
	public ASTBuilder visitSingleArgMessageNoPar(SingleArgMessageNoParContext ctx) {
		return appendSingleArgMessageNoPar(ctx);
	}

	private ASTBuilderFromReceiver appendSingleArgMessageNoPar(SingleArgMessageNoParContext ctx) {
		String id = ctx.ID_UNCAP().getText();
		ArrayList<ParserRuleContext> args = new ArrayList<ParserRuleContext>();
		ParserRuleContext argCtx = ctx.multiArgMessageArgNoPar();
		if(ctx.modifier.getType() == DuroLexer.SINGLE_QUOTE) {
			// Wrap arg into closure
			argCtx = wrapIntoClosure(ctx, ctx.invokingState, argCtx);
		}
		args.add(argCtx);
		
		return appendMultiArgMessage(id, args);
	}

	@Override
	public ASTBuilder visitUnaryMessage(UnaryMessageContext ctx) {
		String id = ctx.ID_UNCAP().getText();
		ArrayList<ParserRuleContext> args = new ArrayList<ParserRuleContext>();;
		
		return appendMultiArgMessage(id, args);
	}
	
	@Override
	public ASTBuilder visitAssignment(AssignmentContext ctx) {
		String id = ctx.id().getText();				
		
		switch(ctx.op.getType()) {
		case DuroLexer.ASSIGN: {
			// newValue, newValue
			if(idToVariableOrdinalMap.isDeclared(id))
				return appendAssignVariable(ctx.expression(), id);
			else {
				// Modify accessFields/assignFields?
				ASTBuilder valueBuilder = ctx.expression().accept(this);
				return () -> new ASTSlotAssignment(ASTSlotAssignment.TYPE_REGULAR, ASTThis.INSTANCE, id, 0, valueBuilder.build());
			}
		} case DuroLexer.ASSIGN_PROTO: {
			// Modify accessFields/assignFields?
			ASTBuilder valueBuilder = ctx.expression().accept(this);
			return () -> new ASTSlotAssignment(ASTSlotAssignment.TYPE_PROTO, ASTThis.INSTANCE, id, 0, valueBuilder.build());
		} case DuroLexer.ASSIGN_QUOTED: {
			OrdinalAllocator bodyIdToParameterOrdinalMap = new OrdinalAllocator();
			ASTBuilder valueBuilder = appendAssignQuoted(ctx.behaviorParams(), ctx.expression(), bodyIdToParameterOrdinalMap);
			int arity = bodyIdToParameterOrdinalMap.sizeExceptEnd();
			return () -> new ASTSlotAssignment(ASTSlotAssignment.TYPE_QUOTED, ASTThis.INSTANCE, id, arity, valueBuilder.build());
		}
		}
		
		return null;
	}	
	
	public ASTBuilder visitAccess(AccessContext ctx) {
		String id = ctx.id().getText();
		
		if(idToParameterOrdinalMap.isDeclared(id))
			return appendAccessParameter(id);
		
		if(idToVariableOrdinalMap.isDeclared(id))
			return appendAccessVariable(id);
		
		return () -> {
			if(Character.isUpperCase(id.charAt(0)) || accessFields.contains(id))
				return new ASTSlotAccess(ASTThis.INSTANCE, id, 0);
			else {
				// Message to self
				return new ASTMessageExchange(ASTThis.INSTANCE, new ASTMessage(id, new AST[0]));
			}
		};
	}

	private ASTBuilder appendAssignVariable(ExpressionContext valueCtx, String id) {
		return appendAssignLocal(valueCtx, id, idToVariableOrdinalMap);
	}

	private ASTBuilder appendAssignLocal(ExpressionContext valueCtx, String id, OrdinalAllocator ordinalMap) {
		IntHolder ordinalHolder = new IntHolder();
		ASTBuilder valueBuilder = valueCtx.accept(this);
		ordinalMap.ordinalFor(id, ordinal -> ordinalHolder.value = ordinal);
		
		return () -> new ASTLocalAssignment(ordinalHolder.value, valueBuilder.build());
	}

	private ASTBuilder appendAccessParameter(String id) {
		return appendAccessLocal(id, idToParameterOrdinalMap);
	}

	private ASTBuilder appendAccessVariable(String id) {
		return appendAccessLocal(id, idToVariableOrdinalMap);
	}

	private ASTBuilder appendAccessLocal(String id, OrdinalAllocator ordinalMap) {
		IntHolder ordinalHolder = new IntHolder();
		ordinalMap.ordinalFor(id, ordinal -> ordinalHolder.value = ordinal);
		
		return () -> new ASTLocalAccess(ordinalHolder.value);
	}

	private ASTBuilder appendAssignQuoted(BehaviorParamsContext paramsCtx, ExpressionContext valueCtx, OrdinalAllocator bodyIdToParameterOrdinalMap) {
		ANTLRToAST functionBodyInterceptor = new ANTLRToAST(bodyIdToParameterOrdinalMap, new OrdinalAllocator(), errors, accessFields, assignFields);
		for(IdContext parameterIdNode: paramsCtx.id()) {
			String parameterId = parameterIdNode.getText();
			functionBodyInterceptor.idToParameterOrdinalMap.declare(parameterId);
		}
		
		ASTBuilder bodyBuilder = valueCtx.accept(functionBodyInterceptor);
		
		/*Start from 1 since zero is used for self*/
		int parameterOffset = 1;
		functionBodyInterceptor.idToParameterOrdinalMap.generate(parameterOffset);
		int variableOffset = parameterOffset + functionBodyInterceptor.idToParameterOrdinalMap.size();
		functionBodyInterceptor.idToVariableOrdinalMap.generate(variableOffset);
		int localCount = 1 + functionBodyInterceptor.idToParameterOrdinalMap.size() + functionBodyInterceptor.idToVariableOrdinalMap.size();
		
		return () -> new ASTBehavior(localCount, bodyBuilder.build());
	}
	
	@Override
	public ASTBuilder visitParArg(ParArgContext ctx) {
		String id = ctx.id().getText();
		idToParameterOrdinalMap.declare(id);
		return appendAccessParameter(id);
	}
	
	@Override
	public ASTBuilder visitDict(DictContext ctx) {
		HashSet<String> fields = new HashSet<String>();
		ANTLRToAST fieldsVisitor = new ANTLRToAST(idToParameterOrdinalMap, idToVariableOrdinalMap, errors, accessFields, assignFields);
		ANTLRToAST methodsVisitor = new ANTLRToAST(idToParameterOrdinalMap, idToVariableOrdinalMap, errors, fields, fields);
		@SuppressWarnings("unchecked")
		Function<AST, ASTDict.Entry>[] entryConstructors = (Function<AST, ASTDict.Entry>[])new Function<?, ?>[ctx.dictEntry().size()]; 
		ASTBuilder[] valueBuilders = new ASTBuilder[ctx.dictEntry().size()];
		
		for(int i = 0; i < valueBuilders.length; i++) {
			DictEntryContext entryCtx = ctx.dictEntry(i);
			String id = getSelectorId(entryCtx.selector());
			valueBuilders[i] = entryCtx.expression().accept(this);
			
			switch(entryCtx.op.getType()) {
			case DuroLexer.ASSIGN:
				entryConstructors[i] = valueAst -> new ASTDict.Entry(id, ASTSlotAssignment.TYPE_REGULAR, 0, valueAst);
				valueBuilders[i] = entryCtx.expression().accept(fieldsVisitor);
				break;
			case DuroLexer.ASSIGN_PROTO:
				entryConstructors[i] = valueAst -> new ASTDict.Entry(id, ASTSlotAssignment.TYPE_PROTO, 0, valueAst);
				valueBuilders[i] = entryCtx.expression().accept(fieldsVisitor);
				break;
			case DuroLexer.ASSIGN_QUOTED:
				OrdinalAllocator bodyIdToParameterOrdinalMap = new OrdinalAllocator();
				valueBuilders[i] = methodsVisitor.appendAssignQuoted(entryCtx.behaviorParams(), entryCtx.expression(), bodyIdToParameterOrdinalMap);
				int arity = bodyIdToParameterOrdinalMap.sizeExceptEnd();
				entryConstructors[i] = valueAst -> new ASTDict.Entry(id, ASTSlotAssignment.TYPE_QUOTED, arity, valueAst);
				break;
			}
		}
		
		return new ASTReducer(valueBuilders, valueAsts -> {
			ASTDict.Entry[] entries = new ASTDict.Entry[valueBuilders.length];
			for(int i = 0; i < entries.length; i++)
				entries[i] = entryConstructors[i].apply(valueAsts[i]);
			return new ASTDict(entries);
		});
	}
	
	@Override
	public ASTBuilder visitClosure(ClosureContext ctx) {
		OrdinalAllocator newIdToVariableOrdinalMap = idToVariableOrdinalMap.newInnerEnd();
		OrdinalAllocator newIdToParameterOrdinalMap = idToParameterOrdinalMap.newInnerEnd();
		ANTLRToAST closureBodyVisitor = new ANTLRToAST(newIdToParameterOrdinalMap, newIdToVariableOrdinalMap, errors, accessFields, assignFields);
		
		for(IdContext parameterIdNode: ctx.behaviorParams().id()) {
			String parameterId = parameterIdNode.getText();
			closureBodyVisitor.idToParameterOrdinalMap.declare(parameterId);
		}
		
		ASTBuilder bodyBuilder = appendGrouping(ctx.expression());
		
		int closureParameterCount = closureBodyVisitor.idToParameterOrdinalMap.sizeExceptEnd();
		IntHolder closureParameterOffsetHolder = new IntHolder();
		newIdToParameterOrdinalMap.getLocalParameterOffset(offset -> closureParameterOffsetHolder.value = offset);
		
		return () -> new ASTClosure(closureParameterOffsetHolder.value, closureParameterCount, bodyBuilder.build());
	}
	
	private static String getSelectorId(SelectorContext ctx) {
		return ctx.getText();
	}
	
	@Override
	public ASTBuilder visitPseudoVar(PseudoVarContext ctx) {
		switch(ctx.PSEUDO_VAR().getText()) {
		case "this": return () -> ASTThis.INSTANCE;
		case "null": return () -> ASTNull.INSTANCE;
		case "true": return () -> ASTTrue.INSTANCE;
		case "false": return () -> ASTFalse.INSTANCE;
		case "frame": return () -> ASTFrame.INSTANCE;
		}
		
		return null;
	}
	
	@Override
	public ASTBuilder visitInteger(IntegerContext ctx) {
		return () -> new ASTInteger(Integer.parseInt(ctx.INT().getText()));
	}
	
	@Override
	public ASTBuilder visitString(StringContext ctx) {
		String rawString = ctx.getText();
		String string = rawString.substring(1, rawString.length() - 1)
			.replace("\\n", "\n").replace("\\r", "\r").replace("\\t", "\t");
		return () -> new ASTString(string);
	}
	
	@Override
	public ASTBuilder visitArray(ArrayContext ctx) {
		ASTBuilder[] itemBuilders = new ASTBuilder[ctx.expression().size()];
		for(int i = 0; i < itemBuilders.length; i++)
			itemBuilders[i] = ctx.expression(i).accept(this);
		return new ASTReducer(itemBuilders, asts -> new ASTArray(asts));
	}
	
	private void appendError(ParserRuleContext ctx, String message) {
		appendError(ctx.getStart().getLine(), ctx.getStart().getCharPositionInLine(), message);
	}
	
	private void appendError(int line, int charPositionInLine, String message) {
		errors.appendMessage(line, charPositionInLine, message);
	}
}
