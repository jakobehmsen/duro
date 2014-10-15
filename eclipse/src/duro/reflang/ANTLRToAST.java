package duro.reflang;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

import org.antlr.v4.runtime.ParserRuleContext;
import org.omg.CORBA.IntHolder;

import duro.reflang.antlr4.DuroBaseVisitor;
import duro.reflang.antlr4.DuroLexer;
import duro.reflang.antlr4.DuroParser.ArrayContext;
import duro.reflang.antlr4.DuroParser.AssignmentContext;
import duro.reflang.antlr4.DuroParser.BehaviorParamsContext;
import duro.reflang.antlr4.DuroParser.BinaryMessageContext;
import duro.reflang.antlr4.DuroParser.BinaryMessageOperandChainContext;
import duro.reflang.antlr4.DuroParser.BinaryMessageOperandContext;
import duro.reflang.antlr4.DuroParser.ClosureContext;
import duro.reflang.antlr4.DuroParser.ExpressionChainContext;
import duro.reflang.antlr4.DuroParser.ExpressionContext;
import duro.reflang.antlr4.DuroParser.GroupingContext;
import duro.reflang.antlr4.DuroParser.IdContext;
import duro.reflang.antlr4.DuroParser.IntegerContext;
import duro.reflang.antlr4.DuroParser.InterfaceIdContext;
import duro.reflang.antlr4.DuroParser.MessageChainContext;
import duro.reflang.antlr4.DuroParser.MessageExchangeContext;
import duro.reflang.antlr4.DuroParser.MultiArgMessageArgNoParChainContext;
import duro.reflang.antlr4.DuroParser.MultiArgMessageArgNoParContext;
import duro.reflang.antlr4.DuroParser.MultiArgMessageNoParContext;
import duro.reflang.antlr4.DuroParser.MultiArgMessageNoParTailContext;
import duro.reflang.antlr4.DuroParser.ProgramContext;
import duro.reflang.antlr4.DuroParser.PseudoVarContext;
import duro.reflang.antlr4.DuroParser.SelfMultiArgMessageNoParContext;
import duro.reflang.antlr4.DuroParser.SelfSingleArgMessageNoParContext;
import duro.reflang.antlr4.DuroParser.SingleArgMessageNoParContext;
import duro.reflang.antlr4.DuroParser.StringContext;
import duro.reflang.antlr4.DuroParser.UnaryMessageContext;
import duro.reflang.antlr4.DuroParser.VariableDeclarationContext;
import duro.runtime.Instruction;

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
		ASTBuilder[] itemBuilders = new ASTBuilder[ctx.expression().size()];
		for(int i = 0; i < itemBuilders.length; i++)
			itemBuilders[i] = ctx.expression(i).accept(this);
		return new ASTReducer(itemBuilders, asts -> new ASTGrouping(asts));
	}
	
	@Override
	public ASTBuilder visitGrouping(GroupingContext ctx) {
		ASTBuilder[] itemBuilders = new ASTBuilder[ctx.expression().size()];
		for(int i = 0; i < itemBuilders.length; i++)
			itemBuilders[i] = ctx.expression(i).accept(this);
		return new ASTReducer(itemBuilders, asts -> new ASTGrouping(asts));
	}
	
	@Override
	public ASTBuilder visitInterfaceId(InterfaceIdContext ctx) {
		String id = ctx.id().getText();
		ASTBuilder bodyBuilder = ctx.expression().accept(this);
		
		return () -> new ASTInterfaceId(id, bodyBuilder.build());
	}
	
	@Override
	public ASTBuilder visitMessageExchange(MessageExchangeContext ctx) {
		if(ctx.messageChain() != null) {
			ASTBuilder receiverBuilder = ctx.receiver().accept(this);
			
			MessageChainContext chain = ctx.messageChain();
			
			while(chain != null) {
				ASTBuilder messageReceiverBuilder = receiverBuilder;
				// "messageBuilder" could be slot
				// Thus, something that, when composed with the receiver, generates a new composite reciever
				// - e.g. a message exchange or a slot access
				ASTBuilder messageBuilder = chain.accept(this);
				receiverBuilder = () -> new ASTMessageExchange(messageReceiverBuilder.build(), (ASTMessage)messageBuilder.build());
				chain = chain.messageChain();
			}

			return receiverBuilder;
		} else {
			return ctx.receiver().accept(this);
		}
	}
	
	@Override
	public ASTBuilder visitExpression(ExpressionContext ctx) {
		ParserRuleContext expr = (ParserRuleContext)ctx.getChild(0);
		if(ctx.expressionChain().size() > 0) {
			ASTBuilder receiverBuilder = expr.accept(this);
			
			for(int i = 0; i < ctx.expressionChain().size(); i++) {
				ExpressionChainContext chain = ctx.expressionChain(i);
				ASTBuilder messageReceiverBuilder = receiverBuilder;
				ASTBuilder messageBuilder = chain.accept(this);
				receiverBuilder = () -> new ASTMessageExchange(messageReceiverBuilder.build(), (ASTMessage)messageBuilder.build());
			}

			return receiverBuilder;
		} else
			return expr.accept(this);
	}
	
	@Override
	public ASTBuilder visitMultiArgMessageArgNoPar(MultiArgMessageArgNoParContext ctx) {
		if(ctx.selfSingleArgMessageNoPar() != null) {
			return ctx.selfSingleArgMessageNoPar().accept(this);
		} else {
			if(ctx.multiArgMessageArgNoParChain() != null) {
				ASTBuilder receiverBuilder = ctx.multiArgMessageArgNoParReceiver().accept(this);
				
				MultiArgMessageArgNoParChainContext chain = ctx.multiArgMessageArgNoParChain();
				
				while(chain != null) {
					ASTBuilder messageReceiverBuilder = receiverBuilder;
					ASTBuilder messageBuilder = chain.accept(this);
					receiverBuilder = () -> new ASTMessageExchange(messageReceiverBuilder.build(), (ASTMessage)messageBuilder.build());
					chain = chain.multiArgMessageArgNoParChain();
				}

				return receiverBuilder;
			} else
				return ctx.multiArgMessageArgNoParReceiver().accept(this);
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
		ASTBuilder argumentBuilder = ctx.binaryMessageOperand().accept(this);
		String id = ctx.BIN_OP().getText();
		
		return () -> new ASTMessage(id, new AST[]{argumentBuilder.build()});
	}
	
	@Override
	public ASTBuilder visitBinaryMessageOperand(BinaryMessageOperandContext ctx) {
		if(ctx.binaryMessageOperandChain() != null) {
			ASTBuilder receiverBuilder = ctx.receiver().accept(this);
			
			BinaryMessageOperandChainContext chain = ctx.binaryMessageOperandChain();
			
			while(chain != null) {
				ASTBuilder messageReceiverBuilder = receiverBuilder;
				ASTBuilder messageBuilder = chain.accept(this);
				receiverBuilder = () -> new ASTMessageExchange(messageReceiverBuilder.build(), (ASTMessage)messageBuilder.build());
				chain = chain.binaryMessageOperandChain();
			}

			return receiverBuilder;
		} else
			return ctx.receiver().accept(this);
	}
	
	@Override
	public ASTBuilder visitSelfMultiArgMessageNoPar(SelfMultiArgMessageNoParContext ctx) {
		return appendMultiArgMessageNoPar(ctx.multiArgMessageNoPar(), true);
	}
	
	@Override
	public ASTBuilder visitMultiArgMessageNoPar(MultiArgMessageNoParContext ctx) {
		return appendMultiArgMessageNoPar(ctx, false);
	}
	
	private ASTBuilder appendMultiArgMessageNoPar(MultiArgMessageNoParContext ctx, boolean isForSelf) {
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
		
		return appendMultiArgMessage(id, args, isForSelf);
	}	
	
	protected ASTBuilder appendMultiArgMessage(String id, List<ParserRuleContext> args, boolean isForSelf) {
		int parameterCount = args.size();
		
		ASTBuilder[] argumentBuilders = new ASTBuilder[parameterCount];
		for(int i = 0; i < argumentBuilders.length; i++)
			argumentBuilders[i] = args.get(i).accept(this);
		
		if(isForSelf)
			return new ASTReducer(argumentBuilders, argumentAsts -> new ASTMessageExchange(ASTThis.INSTANCE ,new ASTMessage(id, argumentAsts)));
		
		return new ASTReducer(argumentBuilders, argumentAsts -> new ASTMessage(id, argumentAsts));
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
		return appendSingleArgMessageNoPar(ctx.singleArgMessageNoPar(), true);
	}
	
	@Override
	public ASTBuilder visitSingleArgMessageNoPar(SingleArgMessageNoParContext ctx) {
		return appendSingleArgMessageNoPar(ctx, false);
	}

	private ASTBuilder appendSingleArgMessageNoPar(SingleArgMessageNoParContext ctx, boolean isForSelf) {
		String id = ctx.ID_UNCAP().getText();
		ArrayList<ParserRuleContext> args = new ArrayList<ParserRuleContext>();
		ParserRuleContext argCtx = ctx.multiArgMessageArgNoPar();
		if(ctx.modifier.getType() == DuroLexer.SINGLE_QUOTE) {
			// Wrap arg into closure
			argCtx = wrapIntoClosure(ctx, ctx.invokingState, argCtx);
		}
		args.add(argCtx);
		
		return appendMultiArgMessage(id, args, isForSelf);
	}

	@Override
	public ASTBuilder visitUnaryMessage(UnaryMessageContext ctx) {
		String id = ctx.ID_UNCAP().getText();
		ArrayList<ParserRuleContext> args = new ArrayList<ParserRuleContext>();;
		
		return appendMultiArgMessage(id, args, false);
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
				return () -> new ASTSlotAssignment(ASTSlotAssignment.TYPE_REGULAR, ASTThis.INSTANCE, id, valueBuilder.build());
			}
		} case DuroLexer.ASSIGN_PROTO: {
			// Modify accessFields/assignFields?
			ASTBuilder valueBuilder = ctx.expression().accept(this);
			return () -> new ASTSlotAssignment(ASTSlotAssignment.TYPE_PROTO, ASTThis.INSTANCE, id, valueBuilder.build());
		} case DuroLexer.ASSIGN_QUOTED: {
			ASTBuilder valueBuilder = appendAssignQuoted(ctx.behaviorParams(), ctx.expression());
			return () -> new ASTSlotAssignment(ASTSlotAssignment.TYPE_REGULAR, ASTThis.INSTANCE, id, valueBuilder.build());
		}
		}
		
		return null;
	}

	private ASTBuilder appendAssignVariable(ExpressionContext valueCtx, String id) {
		IntHolder ordinalHolder = new IntHolder();
		ASTBuilder valueBuilder = valueCtx.accept(this);
		idToVariableOrdinalMap.ordinalFor(id, ordinal -> ordinalHolder.value = ordinal);
		
		return () -> new ASTLocalAssignment(ordinalHolder.value, valueBuilder.build());
	}

	private ASTBuilder appendAssignSlot(ExpressionContext valueCtx, String id, boolean returnValue) {
		return appendAssignSlot(valueCtx, id, ASTSlotAssignment.TYPE_REGULAR, returnValue);
	}

	private ASTBuilder appendAssignProto(ExpressionContext valueCtx, String id, boolean returnValue) {
		return appendAssignSlot(valueCtx, id, ASTSlotAssignment.TYPE_PROTO, returnValue);
	}

	private ASTBuilder appendAssignSlot(ExpressionContext valueCtx, String id, int type, boolean returnValue) {
//		// receiver
//		valueCtx.accept(startInner(true));
//		// receiver, newValue
//		if(returnValue)
//			instructions.addSingle(new Instruction(Instruction.OPCODE_DUP1));
//			// newValue, receiver, newValue
//		/* The sequence could be changed as follows for set instructions:
//		[value, target]
//		
//		This way, a simple dup operation can be performed:
//		[value, value, target]
//		*/
//		instructions.addSingle(new Instruction(opcodeAssign, id, 0));
//		// newValue | e
		
		assignFields.add(id);
		
		ASTBuilder valueBuilder = valueCtx.accept(this);
		
		return () -> new ASTSlotAssignment(type, null, id, valueBuilder.build());
	}

	private ASTBuilder appendAssignQuoted(BehaviorParamsContext paramsCtx, ExpressionContext valueCtx) {
		ANTLRToAST functionBodyInterceptor = new ANTLRToAST(new OrdinalAllocator(), new OrdinalAllocator(), errors, accessFields, assignFields);
		for(IdContext parameterIdNode: paramsCtx.id()) {
			String parameterId = parameterIdNode.getText();
			functionBodyInterceptor.idToParameterOrdinalMap.declare(parameterId);
		}
		
		ASTBuilder valueBuilder = valueCtx.accept(functionBodyInterceptor);
		
		/*Start from 1 since zero is used for self*/
		int parameterOffset = 1;
		functionBodyInterceptor.idToParameterOrdinalMap.generate(parameterOffset);
		int variableOffset = parameterOffset + functionBodyInterceptor.idToParameterOrdinalMap.size();
		functionBodyInterceptor.idToVariableOrdinalMap.generate(variableOffset);
		
		return valueBuilder;
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
