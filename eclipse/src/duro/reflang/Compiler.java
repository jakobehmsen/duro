package duro.reflang;

import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Hashtable;
import java.util.Stack;

import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.ParseTreeListener;
import org.antlr.v4.runtime.tree.ParseTreeWalker;
import org.antlr.v4.runtime.tree.RuleNode;
import org.antlr.v4.runtime.tree.TerminalNode;

import duro.reflang.antlr4.DuroBaseListener;
import duro.reflang.antlr4.DuroLexer;
import duro.reflang.antlr4.DuroListener;
import duro.reflang.antlr4.DuroParser;
import duro.reflang.antlr4.DuroParser.ArrayContext;
import duro.reflang.antlr4.DuroParser.ArrayOperandContext;
import duro.reflang.antlr4.DuroParser.BinaryExpressionArithmetic1ApplicationContext;
import duro.reflang.antlr4.DuroParser.BinaryExpressionArithmetic2ApplicationContext;
import duro.reflang.antlr4.DuroParser.BinaryExpressionEqualityApplicationContext;
import duro.reflang.antlr4.DuroParser.BinaryExpressionEqualityContext;
import duro.reflang.antlr4.DuroParser.BinaryExpressionGreaterLessApplicationContext;
import duro.reflang.antlr4.DuroParser.BinaryExpressionGreaterLessContext;
import duro.reflang.antlr4.DuroParser.BinaryExpressionLogicalAndApplicationContext;
import duro.reflang.antlr4.DuroParser.BinaryExpressionLogicalAndContext;
import duro.reflang.antlr4.DuroParser.BinaryExpressionLogicalOrApplicationContext;
import duro.reflang.antlr4.DuroParser.BinaryExpressionLogicalOrContext;
import duro.reflang.antlr4.DuroParser.BoolContext;
import duro.reflang.antlr4.DuroParser.BreakStatementContext;
import duro.reflang.antlr4.DuroParser.ComputedMemberAccessContext;
import duro.reflang.antlr4.DuroParser.ComputedMemberAssignmentContext;
import duro.reflang.antlr4.DuroParser.ComputedMemberAssignmentKeyContext;
import duro.reflang.antlr4.DuroParser.DictProcessContext;
import duro.reflang.antlr4.DuroParser.DictProcessEntryContext;
import duro.reflang.antlr4.DuroParser.ElseStatementContext;
import duro.reflang.antlr4.DuroParser.ExplicitMessageExchangeContext;
import duro.reflang.antlr4.DuroParser.ForInStatementBodyContext;
import duro.reflang.antlr4.DuroParser.ForInStatementContext;
import duro.reflang.antlr4.DuroParser.ForInStatementVarContext;
import duro.reflang.antlr4.DuroParser.ForStatementBodyContext;
import duro.reflang.antlr4.DuroParser.ForStatementConditionContext;
import duro.reflang.antlr4.DuroParser.ForStatementContext;
import duro.reflang.antlr4.DuroParser.ForStatementUpdateContext;
import duro.reflang.antlr4.DuroParser.FunctionBodyContext;
import duro.reflang.antlr4.DuroParser.FunctionDefinitionContext;
import duro.reflang.antlr4.DuroParser.FunctionLiteralContext;
import duro.reflang.antlr4.DuroParser.IfStatementConditionContext;
import duro.reflang.antlr4.DuroParser.IfStatementOnTrueContext;
import duro.reflang.antlr4.DuroParser.IntegerContext;
import duro.reflang.antlr4.DuroParser.LookupContext;
import duro.reflang.antlr4.DuroParser.MemberAccessContext;
import duro.reflang.antlr4.DuroParser.MemberAssignmentContext;
import duro.reflang.antlr4.DuroParser.NilContext;
import duro.reflang.antlr4.DuroParser.PauseContext;
import duro.reflang.antlr4.DuroParser.PrimitiveBodyContext;
import duro.reflang.antlr4.DuroParser.PrimitiveCallContext;
import duro.reflang.antlr4.DuroParser.ProgramContext;
import duro.reflang.antlr4.DuroParser.ReturnStatementContext;
import duro.reflang.antlr4.DuroParser.SelfContext;
import duro.reflang.antlr4.DuroParser.StringContext;
import duro.reflang.antlr4.DuroParser.ThisMessageExchangeContext;
import duro.reflang.antlr4.DuroParser.TopExpressionContext;
import duro.reflang.antlr4.DuroParser.UnaryExpressionNotApplicationContext;
import duro.reflang.antlr4.DuroParser.UnaryExpressionPostIncDecApplicationComputedMemberAccessReceiverContext;
import duro.reflang.antlr4.DuroParser.UnaryExpressionPostIncDecApplicationContext;
import duro.reflang.antlr4.DuroParser.UnaryExpressionPostIncDecApplicationMemberAccessContext;
import duro.reflang.antlr4.DuroParser.UnaryExpressionPostIncDecApplicationVariableContext;
import duro.reflang.antlr4.DuroParser.VariableAssignmentContext;
import duro.reflang.antlr4.DuroParser.VariableDeclarationAndAssignmentContext;
import duro.reflang.antlr4.DuroParser.VariableDeclarationContext;
import duro.reflang.antlr4.DuroParser.WhileStatementBodyContext;
import duro.reflang.antlr4.DuroParser.WhileStatementConditionContext;
import duro.reflang.antlr4.DuroParser.WhileStatementContext;
import duro.reflang.antlr4.DuroParser.YieldStatementContext;
import duro.runtime.CallFrameInfo;
import duro.runtime.CustomProcess;
import duro.runtime.Instruction;

public class Compiler {
	public static duro.runtime.Process compile(InputStream sourceCode) throws IOException {
		CharStream charStream = new ANTLRInputStream(sourceCode);
		DuroLexer lexer = new DuroLexer(charStream);
		TokenStream tokenStream = new CommonTokenStream(lexer);
		DuroParser parser = new DuroParser(tokenStream);
		
		ProgramContext programCtx = parser.program();
		
		Hashtable<String, Integer> idToParameterOrdinalMap = new Hashtable<String, Integer>();
		BodyInfo bodyInfo = getBodyInfo(idToParameterOrdinalMap, programCtx);
		
		return new CustomProcess(bodyInfo.localCount, bodyInfo.instructions.toArray(new Instruction[bodyInfo.instructions.size()]));
	}
	
	private static class ConditionalTreeWalker extends ParseTreeWalker {
		private boolean suspendWalk;
		private RuleNode ruleSuspendedAt;
		
		@Override
		protected void enterRule(ParseTreeListener listener, RuleNode r) {
			if(!suspendWalk)
				super.enterRule(listener, r);
		}
		
		@Override
		protected void exitRule(ParseTreeListener listener, RuleNode r) {
			if(ruleSuspendedAt == r)
				suspendWalk = false;
			
			if(!suspendWalk)
				super.exitRule(listener, r);
		}
		
		public void suspendWalkWithin(RuleNode r) {
			suspendWalk = true;
			ruleSuspendedAt = r;
		}
	}
	
	private static DuroListener createBodyListener(
			final ConditionalTreeWalker walker, final Hashtable<String, Integer> idToParameterOrdinalMap, final Hashtable<String, Integer> idToVariableOrdinalMap, 
			final ArrayList<Instruction> instructions, final ArrayList<YieldStatementContext> yieldStatements) {
		return new DuroBaseListener() {
			@Override
			public void exitProgram(ProgramContext ctx) {
				// Add finish instruction to the end
				instructions.add(new Instruction(Instruction.OPCODE_FINISH));
			}
			
			
			
			Stack<ArrayList<Integer>> orConditionalJumpIndexesStack = new Stack<ArrayList<Integer>>();
			
			@Override
			public void enterBinaryExpressionLogicalOr(BinaryExpressionLogicalOrContext ctx) {
				orConditionalJumpIndexesStack.push(new ArrayList<Integer>());
			}
			
			@Override
			public void enterBinaryExpressionLogicalOrApplication(BinaryExpressionLogicalOrApplicationContext ctx) {
				ArrayList<Integer> orConditionalJumpIndexes = orConditionalJumpIndexesStack.peek();
				
				instructions.add(new Instruction(Instruction.OPCODE_DUP));
				int conditionalJumpIndex = instructions.size();
				instructions.add(null);
				orConditionalJumpIndexes.add(conditionalJumpIndex);
			}
			
			@Override
			public void exitBinaryExpressionLogicalOrApplication(BinaryExpressionLogicalOrApplicationContext ctx) {
				instructions.add(new Instruction(Instruction.OPCODE_SP_OR));
			}
			
			@Override
			public void exitBinaryExpressionLogicalOr(BinaryExpressionLogicalOrContext ctx) {
				int orEndIndex = instructions.size();
				
				ArrayList<Integer> orConditionalJumpIndexes = orConditionalJumpIndexesStack.pop();
				
				for(int orConditionalJumpIndex: orConditionalJumpIndexes) {
					int conditionalJump = orEndIndex - orConditionalJumpIndex;
					// If true, skip the rest
					instructions.set(orConditionalJumpIndex, new Instruction(Instruction.OPCODE_IF_TRUE, conditionalJump));
				}
			}
			
			
			
			Stack<ArrayList<Integer>> andConditionalJumpIndexesStack = new Stack<ArrayList<Integer>>();
			
			@Override
			public void enterBinaryExpressionLogicalAnd(BinaryExpressionLogicalAndContext ctx) {
				andConditionalJumpIndexesStack.push(new ArrayList<Integer>());
			}
			
			@Override
			public void enterBinaryExpressionLogicalAndApplication(BinaryExpressionLogicalAndApplicationContext ctx) {
				ArrayList<Integer> andConditionalJumpIndexes = andConditionalJumpIndexesStack.peek();
				
				instructions.add(new Instruction(Instruction.OPCODE_DUP));
				int conditionalJumpIndex = instructions.size();
				instructions.add(null);
				andConditionalJumpIndexes.add(conditionalJumpIndex);
			}
			
			@Override
			public void exitBinaryExpressionLogicalAndApplication(BinaryExpressionLogicalAndApplicationContext ctx) {
				instructions.add(new Instruction(Instruction.OPCODE_SP_AND));
			}
			
			@Override
			public void exitBinaryExpressionLogicalAnd(BinaryExpressionLogicalAndContext ctx) {
				int andEndIndex = instructions.size();
				
				ArrayList<Integer> andConditionalJumpIndexes = andConditionalJumpIndexesStack.pop();
				
				for(int andConditionalJumpIndex: andConditionalJumpIndexes) {
					int conditionalJump = andEndIndex - andConditionalJumpIndex;
					// If false, skip the rest
					instructions.set(andConditionalJumpIndex, new Instruction(Instruction.OPCODE_IF_FALSE, conditionalJump));
				}
			}
			
			

			
			Stack<ArrayList<Integer>> equalsConditionalJumpIndexesStack = new Stack<ArrayList<Integer>>();
			
			@Override
			public void enterBinaryExpressionEquality(BinaryExpressionEqualityContext ctx) {
				equalsConditionalJumpIndexesStack.add(new ArrayList<Integer>());
			}
			
			@Override
			public void exitBinaryExpressionEqualityApplication(BinaryExpressionEqualityApplicationContext ctx) {
				ArrayList<Integer> equalsConditionalJumpIndexes = equalsConditionalJumpIndexesStack.peek();
				
				instructions.add(new Instruction(Instruction.OPCODE_DUP));
				instructions.add(new Instruction(Instruction.OPCODE_SWAP1));
				instructions.add(new Instruction(Instruction.OPCODE_SP_EQUALS));
				if(ctx.op.getType() == DuroLexer.NOT_EQUALS)
					instructions.add(new Instruction(Instruction.OPCODE_SP_NOT));
				int conditionalJumpIndex = instructions.size();
				instructions.add(null);
				equalsConditionalJumpIndexes.add(conditionalJumpIndex);
			}
			
			@Override
			public void exitBinaryExpressionEquality(BinaryExpressionEqualityContext ctx) {
				ArrayList<Integer> equalsConditionalJumpIndexes = equalsConditionalJumpIndexesStack.pop();
				
				if(equalsConditionalJumpIndexes.size() > 0) {
					// If there were any applications
					instructions.add(new Instruction(Instruction.OPCODE_LOAD_TRUE));
					instructions.add(new Instruction(Instruction.OPCODE_JUMP, 2));
	
					int equalsEndIndex = instructions.size();
					
					for(int equalsConditionalJumpIndex: equalsConditionalJumpIndexes) {
						int conditionalJump = equalsEndIndex - equalsConditionalJumpIndex;
						// If false, skip the rest
						instructions.set(equalsConditionalJumpIndex, new Instruction(Instruction.OPCODE_IF_FALSE, conditionalJump));
					}
					
					instructions.add(new Instruction(Instruction.OPCODE_LOAD_FALSE));
					
					instructions.add(new Instruction(Instruction.OPCODE_SWAP));
					instructions.add(new Instruction(Instruction.OPCODE_POP));
				}
			}
			
			

			Stack<ArrayList<Integer>> greaterLessConditionalJumpIndexesStack = new Stack<ArrayList<Integer>>();
			
			@Override
			public void enterBinaryExpressionGreaterLess(BinaryExpressionGreaterLessContext ctx) {
				greaterLessConditionalJumpIndexesStack.add(new ArrayList<Integer>());
			}
			
			@Override
			public void exitBinaryExpressionGreaterLessApplication(BinaryExpressionGreaterLessApplicationContext ctx) {
				ArrayList<Integer> greaterLessConditionalJumpIndexes = greaterLessConditionalJumpIndexesStack.peek();
				
				instructions.add(new Instruction(Instruction.OPCODE_DUP));
				instructions.add(new Instruction(Instruction.OPCODE_SWAP1));
				
				switch(ctx.op.getType()) {
				case DuroLexer.GREATER_THAN:
					instructions.add(new Instruction(Instruction.OPCODE_SP_GREATER));
					break;
				case DuroLexer.GREATER_THAN_OR_EQUALS:
					instructions.add(new Instruction(Instruction.OPCODE_SP_GREATER_EQUALS));
					break;
				case DuroLexer.LESS_THAN:
					instructions.add(new Instruction(Instruction.OPCODE_SP_LESS));
					break;
				case DuroLexer.LESS_THAN_OR_EQUALS:
					instructions.add(new Instruction(Instruction.OPCODE_SP_LESS_EQUALS));
					break;
				}

				int conditionalJumpIndex = instructions.size();
				instructions.add(null);
				greaterLessConditionalJumpIndexes.add(conditionalJumpIndex);
			}
			
			@Override
			public void exitBinaryExpressionGreaterLess(BinaryExpressionGreaterLessContext ctx) {
				ArrayList<Integer> greaterLessConditionalJumpIndexes = greaterLessConditionalJumpIndexesStack.pop();
				
				if(greaterLessConditionalJumpIndexes.size() > 0) {
					// If there were any applications
					instructions.add(new Instruction(Instruction.OPCODE_LOAD_TRUE));
					instructions.add(new Instruction(Instruction.OPCODE_JUMP, 2));
	
					int equalsEndIndex = instructions.size();
					
					for(int greaterLessConditionalJumpIndex: greaterLessConditionalJumpIndexes) {
						int conditionalJump = equalsEndIndex - greaterLessConditionalJumpIndex;
						// If false, skip the rest
						instructions.set(greaterLessConditionalJumpIndex, new Instruction(Instruction.OPCODE_IF_FALSE, conditionalJump));
					}
					
					instructions.add(new Instruction(Instruction.OPCODE_LOAD_FALSE));
					
					instructions.add(new Instruction(Instruction.OPCODE_SWAP));
					instructions.add(new Instruction(Instruction.OPCODE_POP));
				}
			}
			
			
			
			@Override
			public void exitBinaryExpressionArithmetic1Application(BinaryExpressionArithmetic1ApplicationContext ctx) {
				int binaryOpCode;
				
				switch(ctx.BIN_OP1().getText()) {
				case "+":
					binaryOpCode = Instruction.OPCODE_SP_ADD;
					break;
				case "-":
					binaryOpCode = Instruction.OPCODE_SP_SUB;
					break;
				default:
					binaryOpCode = -1;
					break;
				}
				
				instructions.add(new Instruction(binaryOpCode));
			}
			
			@Override
			public void exitBinaryExpressionArithmetic2Application(BinaryExpressionArithmetic2ApplicationContext ctx) {
				int binaryOpCode;
				
				switch(ctx.BIN_OP2().getText()) {
				case "*":
					binaryOpCode = Instruction.OPCODE_SP_MULT;
					break;
				case "/":
					binaryOpCode = Instruction.OPCODE_SP_DIV;
					break;
				case "%":
					binaryOpCode = Instruction.OPCODE_SP_REM;
					break;
				default:
					binaryOpCode = -1;
					break;
				}
				
				instructions.add(new Instruction(binaryOpCode));
			}
			
			@Override
			public void exitUnaryExpressionNotApplication(UnaryExpressionNotApplicationContext ctx) {
				instructions.add(new Instruction(Instruction.OPCODE_SP_NOT));
			}
			
			@Override
			public void exitUnaryExpressionPostIncDecApplicationComputedMemberAccessReceiver(UnaryExpressionPostIncDecApplicationComputedMemberAccessReceiverContext ctx) {
				instructions.add(new Instruction(Instruction.OPCODE_DUP)); // Dup receiver
			}
			
			@Override
			public void exitUnaryExpressionPostIncDecApplication(UnaryExpressionPostIncDecApplicationContext ctx) {
				ParserRuleContext targetCtx = (ParserRuleContext)ctx.getChild(0);
				switch(targetCtx.getRuleIndex()) {
				case DuroParser.RULE_unaryExpressionPostIncDecApplicationVariable: {
					String id = ((UnaryExpressionPostIncDecApplicationVariableContext)targetCtx).ID().getText();
					int ordinal = idToVariableOrdinalMap.get(id);
					instructions.add(new Instruction(Instruction.OPCODE_LOAD_LOC, ordinal));
					instructions.add(new Instruction(Instruction.OPCODE_DUP));
					instructions.add(new Instruction(Instruction.OPCODE_LOAD_INT, 1));
					appendIncDec(ctx.op);
					instructions.add(new Instruction(Instruction.OPCODE_STORE_LOC, ordinal));
					break;
				} case DuroParser.RULE_unaryExpressionPostIncDecApplicationMemberAccess: {
					instructions.add(new Instruction(Instruction.OPCODE_DUP)); // Dup receiver
					// receiver, receiver
					String id = ((UnaryExpressionPostIncDecApplicationMemberAccessContext)targetCtx).ID().getText();
					instructions.add(new Instruction(Instruction.OPCODE_LOAD_STRING, id));
					// receiver, receiver, id
					instructions.add(new Instruction(Instruction.OPCODE_GET));
					// receiver, value
					instructions.add(new Instruction(Instruction.OPCODE_DUP1));
					// value, receiver, value
					instructions.add(new Instruction(Instruction.OPCODE_LOAD_INT, 1));
					// value, receiver, value, 1
					appendIncDec(ctx.op);
					// value, receiver, value'
					instructions.add(new Instruction(Instruction.OPCODE_LOAD_STRING, id));
					// value, receiver, value', id
					instructions.add(new Instruction(Instruction.OPCODE_SWAP));
					// value, receiver, id, value'
					instructions.add(new Instruction(Instruction.OPCODE_SET));
					// value
					break;
				} case DuroParser.RULE_unaryExpressionPostIncDecApplicationComputedMemberAccess:
					// receiver, receiver, id
					instructions.add(new Instruction(Instruction.OPCODE_DUP1));
					// receiver, id, receiver, id
					instructions.add(new Instruction(Instruction.OPCODE_GET));
					// receiver, id, value
					instructions.add(new Instruction(Instruction.OPCODE_DUP2));
					// value, receiver, id, value,
					instructions.add(new Instruction(Instruction.OPCODE_LOAD_INT, 1));
					// value, receiver, id, value, 1
					appendIncDec(ctx.op);
					// value, receiver, id, value'
					instructions.add(new Instruction(Instruction.OPCODE_SET));
					break;
				}
			}
			
			private void appendIncDec(Token opToken) {
				switch(opToken.getType()) {
				case DuroLexer.DOUBLE_PLUS:
					instructions.add(new Instruction(Instruction.OPCODE_SP_ADD));
					break;
				case DuroLexer.DOUBLE_MINUS:
					instructions.add(new Instruction(Instruction.OPCODE_SP_SUB));
					break;
				}
			}
			
			@Override
			public void enterVariableAssignment(VariableAssignmentContext ctx) {
				String firstId = ctx.ID(0).getText();
				int firstOrdinal = idToVariableOrdinalMap.get(firstId);
				
				switch(ctx.op.getType()) {
				case DuroLexer.ASSIGN: {
					break;
				} default: {
					instructions.add(new Instruction(Instruction.OPCODE_LOAD_LOC, firstOrdinal));
					// oldValue
					break;
				}
				}
			}
			
			@Override
			public void exitVariableAssignment(VariableAssignmentContext ctx) {
				String firstId = ctx.ID(0).getText();
				int firstOrdinal = idToVariableOrdinalMap.get(firstId);
				
				switch(ctx.op.getType()) {
				case DuroLexer.ASSIGN: {
					instructions.add(new Instruction(Instruction.OPCODE_DUP_ANY, 0, ctx.ID().size() - 1));
					
					for(int i = 0; i < ctx.ID().size(); i++) {
						String id = ctx.ID(i).getText();
						int ordinal = idToVariableOrdinalMap.get(id);
						instructions.add(new Instruction(Instruction.OPCODE_STORE_LOC, ordinal));
					}
					
					break;
				} default: {
					// Multiple returns values are not supported here yet.
					
					// oldValue, newValuePart
					appendAssignmentReducer(ctx.op);
					// newValue
					instructions.add(new Instruction(Instruction.OPCODE_DUP));
					// newValue, newValue
					instructions.add(new Instruction(Instruction.OPCODE_STORE_LOC, firstOrdinal));
					// newValue
					break;
				}
				}
			}
			
			private void appendAssignmentReducer(Token op) {
				switch(op.getType()) {
				case DuroLexer.ASSIGN_ADD:
					instructions.add(new Instruction(Instruction.OPCODE_SP_ADD));
					break;
				case DuroLexer.ASSIGN_SUB:
					instructions.add(new Instruction(Instruction.OPCODE_SP_SUB));
					break;
				case DuroLexer.ASSIGN_MULT:
					instructions.add(new Instruction(Instruction.OPCODE_SP_MULT));
					break;
				case DuroLexer.ASSIGN_DIV:
					instructions.add(new Instruction(Instruction.OPCODE_SP_DIV));
					break;
				case DuroLexer.ASSIGN_REM:
					instructions.add(new Instruction(Instruction.OPCODE_SP_REM));
					break;
				}
			}
			
			@Override
			public void enterLookup(LookupContext ctx) {
				String id = ctx.ID().getText();
				
				Integer parameterOrdinal = idToParameterOrdinalMap.get(id);
				if(parameterOrdinal != null) {
					// Load argument
					instructions.add(new Instruction(Instruction.OPCODE_LOAD_ARG, parameterOrdinal));
					return;
				}
				
				Integer variableOrdinal = idToVariableOrdinalMap.get(id);
				if(variableOrdinal != null) {
					// Load variable
					instructions.add(new Instruction(Instruction.OPCODE_LOAD_LOC, variableOrdinal));
					return;
				}
				
				// Get member
				instructions.add(new Instruction(Instruction.OPCODE_LOAD_THIS));
				instructions.add(new Instruction(Instruction.OPCODE_LOAD_STRING, id));
				instructions.add(new Instruction(Instruction.OPCODE_GET));
			}
			
			@Override
			public void enterThisMessageExchange(ThisMessageExchangeContext ctx) {
				String id = ctx.messageExchange().ID().getText();
				if(idToParameterOrdinalMap.containsKey(id)) {
					// Call argument
					int ordinal = idToParameterOrdinalMap.get(id);
					instructions.add(new Instruction(Instruction.OPCODE_LOAD_ARG, ordinal));
				} else if(idToVariableOrdinalMap.containsKey(id)) {
					// Call variable
					int ordinal = idToVariableOrdinalMap.get(id);
					instructions.add(new Instruction(Instruction.OPCODE_LOAD_LOC, ordinal));
				} else {
					instructions.add(new Instruction(Instruction.OPCODE_LOAD_THIS));
				}
			}
			
			@Override
			public void exitThisMessageExchange(ThisMessageExchangeContext ctx) {
				int argumentCount = ctx.messageExchange().expression().size();
				
				String id = ctx.messageExchange().ID().getText();
				if(idToParameterOrdinalMap.containsKey(id)) {
					// Call argument
					instructions.add(new Instruction(Instruction.OPCODE_CALL, argumentCount));
				} else if(idToVariableOrdinalMap.containsKey(id)) {
					// Call variable
					instructions.add(new Instruction(Instruction.OPCODE_CALL, argumentCount));
				} else {
					appendMessageExchange(ctx.messageExchange().ID(), argumentCount);
				}
			}
			
			private void appendMessageExchange(TerminalNode node, int argumentCount) {
				String id = node.getText();
				
				// Currently: just resolve function and then call it.
				instructions.add(new Instruction(Instruction.OPCODE_SEND, id, argumentCount));
			}
			
			@Override
			public void enterInteger(IntegerContext ctx) {
				int value = Integer.parseInt(ctx.INT().getText());
				instructions.add(new Instruction(Instruction.OPCODE_LOAD_INT, value));
			}
			
			@Override
			public void enterBool(BoolContext ctx) {
				boolean value = Boolean.parseBoolean(ctx.getText());
				
				if(value)
					instructions.add(new Instruction(Instruction.OPCODE_LOAD_TRUE, value));
				else
					instructions.add(new Instruction(Instruction.OPCODE_LOAD_FALSE, value));
			}
			
			@Override
			public void enterString(StringContext ctx) {
				String rawString = ctx.getText();
				// Should the string enter properly prepared?
				// - i.e., no need for filtering the string.
				String string = extractStringLiteral(rawString);
				
				instructions.add(new Instruction(Instruction.OPCODE_LOAD_STRING, string));
			}
			
			@Override
			public void enterDictProcess(DictProcessContext ctx) {
				instructions.add(new Instruction(Instruction.OPCODE_SP_NEW_DICT));
			}
			
			@Override
			public void enterDictProcessEntry(DictProcessEntryContext ctx) {
				String id = ctx.ID().getText();
				
				instructions.add(new Instruction(Instruction.OPCODE_DUP));
				instructions.add(new Instruction(Instruction.OPCODE_LOAD_STRING, id));
			}
			
			@Override
			public void exitDictProcessEntry(DictProcessEntryContext ctx) {
				instructions.add(new Instruction(Instruction.OPCODE_DEF));
			}
			
			@Override
			public void exitFunctionLiteral(FunctionLiteralContext ctx) {
				int parameterCount = ctx.functionParameters().getChildCount();
				Hashtable<String, Integer> idToParameterOrdinalMap = new Hashtable<String, Integer>();
				for(int i = 0; i < parameterCount; i++) {
					String parameterId = ctx.functionParameters().getChild(i).getText();
					idToParameterOrdinalMap.put(parameterId, i);
				}
				BodyInfo functionBodyInfo = getBodyInfo(idToParameterOrdinalMap, ctx.functionBody());

				CallFrameInfo callFrameInfo = new CallFrameInfo(
					parameterCount, functionBodyInfo.localCount, functionBodyInfo.instructions.toArray(new Instruction[functionBodyInfo.instructions.size()]));
				instructions.add(new Instruction(Instruction.OPCODE_LOAD_FUNC, callFrameInfo));
			}
			
			Stack<Integer> arrayOperandNumberStack = new Stack<Integer>();
			
			@Override
			public void enterArray(ArrayContext ctx) {
				int length = ctx.arrayOperand().size();
				instructions.add(new Instruction(Instruction.OPCODE_LOAD_INT, length));
				instructions.add(new Instruction(Instruction.OPCODE_SP_NEW_ARRAY));
				
				arrayOperandNumberStack.push(0);
			}
			
			@Override
			public void enterArrayOperand(ArrayOperandContext ctx) {
				int arrayOperandNumber = arrayOperandNumberStack.peek();
				
				instructions.add(new Instruction(Instruction.OPCODE_DUP));
				instructions.add(new Instruction(Instruction.OPCODE_LOAD_INT, arrayOperandNumber));
				
				arrayOperandNumberStack.set(arrayOperandNumberStack.size() - 1, arrayOperandNumber + 1);
			}
			
			@Override
			public void exitArrayOperand(ArrayOperandContext ctx) {
				instructions.add(new Instruction(Instruction.OPCODE_DEF));
			}
			
			@Override
			public void exitArray(ArrayContext ctx) {
				arrayOperandNumberStack.pop();
			}
			
			@Override
			public void enterSelf(SelfContext ctx) {
				instructions.add(new Instruction(Instruction.OPCODE_LOAD_THIS));
			}
			
			@Override
			public void enterNil(NilContext ctx) {
				instructions.add(new Instruction(Instruction.OPCODE_LOAD_NULL));
			}
			
			@Override
			public void enterFunctionLiteral(FunctionLiteralContext ctx) {
				walker.suspendWalkWithin(ctx);
			}
			
			@Override
			public void enterPause(PauseContext ctx) {
				instructions.add(new Instruction(Instruction.OPCODE_PAUSE));
			}
			
			@Override
			public void exitVariableDeclarationAndAssignment(VariableDeclarationAndAssignmentContext ctx) {
				//for(int i = ctx.ID().size() - 1; i >= 0; i--) {
				for(int i = 0; i < ctx.ID().size(); i++) {
					TerminalNode id = ctx.ID(i);
					int ordinal = declareVariable(id);
					instructions.add(new Instruction(Instruction.OPCODE_STORE_LOC, ordinal));
				}
			}
			
			@Override
			public void enterVariableDeclaration(VariableDeclarationContext ctx) {
				declareVariable(ctx.ID());
			}
			
			@Override
			public void exitReturnStatement(ReturnStatementContext ctx) {
				int returnCount = ctx.expression().size();
				instructions.add(new Instruction(Instruction.OPCODE_RET, returnCount));
			}
			
			private Stack<ArrayList<Integer>> breakIndexesStack = new Stack<ArrayList<Integer>>();
			
			private void startBreakable() {
				breakIndexesStack.push(new ArrayList<Integer>());
			}
			
			private void endBreakable() {
				ArrayList<Integer> breakIndexes = breakIndexesStack.pop();
				for(int breakIndex: breakIndexes)
					instructions.set(breakIndex, new Instruction(Instruction.OPCODE_JUMP, instructions.size() - breakIndex));
			}
			
			@Override
			public void enterBreakStatement(BreakStatementContext ctx) {
				ArrayList<Integer> breakIndexes = breakIndexesStack.peek();
				breakIndexes.add(instructions.size());
				instructions.add(null);
			}
			
			@Override
			public void enterFunctionDefinition(FunctionDefinitionContext ctx) {
				walker.suspendWalkWithin(ctx);
			}
			
			@Override
			public void enterYieldStatement(YieldStatementContext ctx) {
				instructions.add(new Instruction(Instruction.OPCODE_LOAD_TRUE));
			}
			
			@Override
			public void exitYieldStatement(YieldStatementContext ctx) {
				yieldStatements.add(ctx);
				int yieldCount = ctx.expression().size();
				instructions.add(new Instruction(Instruction.OPCODE_RET, yieldCount + 1));
			}
			
			@Override
			public void exitFunctionDefinition(FunctionDefinitionContext ctx) {
				int parameterCount = ctx.functionParameters().ID().size();
				Hashtable<String, Integer> idToParameterOrdinalMap = new Hashtable<String, Integer>();
				for(int i = 0; i < parameterCount; i++) {
					String parameterId = ctx.functionParameters().ID(i).getText();
					idToParameterOrdinalMap.put(parameterId, i);
				}
				BodyInfo functionBodyInfo = getBodyInfo(idToParameterOrdinalMap, ctx.functionBody());
				String id = ctx.ID().getText();

				CallFrameInfo callFrameInfo = new CallFrameInfo(
					parameterCount, functionBodyInfo.localCount, functionBodyInfo.instructions.toArray(new Instruction[functionBodyInfo.instructions.size()]));
				instructions.add(new Instruction(Instruction.OPCODE_LOAD_THIS));
				instructions.add(new Instruction(Instruction.OPCODE_LOAD_STRING, id));
				instructions.add(new Instruction(Instruction.OPCODE_LOAD_FUNC, callFrameInfo));
				instructions.add(new Instruction(Instruction.OPCODE_DEF));
			}
			
			@Override
			public void exitFunctionBody(FunctionBodyContext ctx) {
				if(yieldStatements.size() > 0) {
					instructions.add(new Instruction(Instruction.OPCODE_LOAD_FALSE));
					int yieldCount = yieldStatements.stream().map(i -> i.expression().size()).distinct().findFirst().get();
					for(int i = 0; i < yieldCount; i++)
						instructions.add(new Instruction(Instruction.OPCODE_LOAD_NULL));
					instructions.add(new Instruction(Instruction.OPCODE_RET, yieldCount + 1));
				} else if(instructions.size() > 0 && !Instruction.isReturn(instructions.get(instructions.size() - 1).opcode)) {
					instructions.add(new Instruction(Instruction.OPCODE_LOAD_NULL));
					instructions.add(new Instruction(Instruction.OPCODE_RET, 1));
				}
			}
			
			@Override
			public void enterPrimitiveBody(PrimitiveBodyContext ctx) {
				walker.suspendWalkWithin(ctx);
			}
			
			@Override
			public void exitPrimitiveBody(PrimitiveBodyContext ctx) {
				for(PrimitiveCallContext primitiveCallCtx: ctx.primitiveCall()) {
					String opcodeId = primitiveCallCtx.ID().getText();
					Object operand1 = null;
					Object operand2 = null;
					if(primitiveCallCtx.primitiveOperand().size() > 0) {
						operand1 = getLiteral(primitiveCallCtx.primitiveOperand().get(0));

						if(primitiveCallCtx.primitiveOperand().size() > 1) {
							operand2 = getLiteral(primitiveCallCtx.primitiveOperand().get(1));
						}
					}
					
					int opcode = Instruction.getOpcodeFromId(opcodeId);
					instructions.add(new Instruction(opcode, operand1, operand2));
				}
			}
			
			private Stack<Integer> ifConditionalJumpIndexStack = new Stack<Integer>();
			private Stack<Integer> ifJumpIndexStack = new Stack<Integer>();
			
			@Override
			public void exitIfStatementCondition(IfStatementConditionContext ctx) {
				// After condition is generated, then a conditional jump should be generated
				// Leave a spot allocated here and write to it later
				int conditionalJumpIndex = instructions.size();
				ifConditionalJumpIndexStack.push(conditionalJumpIndex);
				instructions.add(null);
			}
			
			@Override
			public void exitIfStatementOnTrue(IfStatementOnTrueContext ctx) {
				// After statement on true is generated, then a jump should be generated
				// Leave a spot allocated here and write to it later
				int jumpIndex = instructions.size();
				ifJumpIndexStack.push(jumpIndex);
				instructions.add(null);

				int conditionalJumpIndex = ifConditionalJumpIndexStack.pop();
				// Now, the spot allocated for a conditional jump can be populated
				int ifEndIndex = instructions.size();
				int jump = ifEndIndex - conditionalJumpIndex;
				instructions.set(conditionalJumpIndex, new Instruction(Instruction.OPCODE_IF_FALSE, jump));
			}
			
			@Override
			public void exitElseStatement(ElseStatementContext ctx) {
				int jumpIndex = ifJumpIndexStack.pop();
				// Now, the spot allocated for a jump can be populated
				int elseEndIndex = instructions.size();
				int jump = elseEndIndex - jumpIndex;
				instructions.set(jumpIndex, new Instruction(Instruction.OPCODE_JUMP, jump));
			}
			
			private Stack<Integer> whileConditionalJumpIndexStack = new Stack<Integer>();
			private Stack<Integer> whileJumpIndexStack = new Stack<Integer>();
			
			@Override
			public void enterWhileStatement(WhileStatementContext ctx) {
				startBreakable();
				
				int jumpIndex = instructions.size();
				whileJumpIndexStack.push(jumpIndex);
			}
			
			@Override
			public void exitWhileStatementCondition(WhileStatementConditionContext ctx) {
				int conditionalJumpIndex = instructions.size();
				whileConditionalJumpIndexStack.push(conditionalJumpIndex);
				instructions.add(null);
			}
			
			@Override
			public void exitWhileStatementBody(WhileStatementBodyContext ctx) {
				int jumpIndex = whileJumpIndexStack.pop();
				int whileBodyEndIndex = instructions.size();
				int jump = jumpIndex - whileBodyEndIndex;
				instructions.add(new Instruction(Instruction.OPCODE_JUMP, jump));
			}
			
			@Override
			public void exitWhileStatement(WhileStatementContext ctx) {
				int whileEndIndex = instructions.size();
				int conditionalJumpIndex = whileConditionalJumpIndexStack.pop();
				int conditionalJump = whileEndIndex - conditionalJumpIndex;
				instructions.set(conditionalJumpIndex, new Instruction(Instruction.OPCODE_IF_FALSE, conditionalJump));

				endBreakable();
			}
			
			

			private Stack<Integer> forConditionalJumpIndexStack = new Stack<Integer>();
			private Stack<Integer> forJumpIndexStack = new Stack<Integer>();
			
			@Override
			public void enterForStatement(ForStatementContext ctx) {
				startBreakable();
			}
			
			@Override
			public void enterForStatementCondition(ForStatementConditionContext ctx) {
				forJumpIndexStack.push(instructions.size());
			}
			
			@Override
			public void enterForStatementUpdate(ForStatementUpdateContext ctx) {
				// Postpone generation of update till after body
				walker.suspendWalkWithin(ctx);
			}
			
			@Override
			public void enterForStatementBody(ForStatementBodyContext ctx) {
				int conditionalJumpIndex = instructions.size();
				forConditionalJumpIndexStack.push(conditionalJumpIndex);
				instructions.add(null);
			}
			
			@Override
			public void exitForStatement(ForStatementContext ctx) {
				ConditionalTreeWalker walker = new ConditionalTreeWalker();
				// Why isn't the walked here?????
				ParseTree updateElement = ctx.forStatementUpdate().delimitedProgramElement();
				walker.walk(createBodyListener(walker, idToParameterOrdinalMap, idToVariableOrdinalMap, instructions, yieldStatements), updateElement);
				
				int indexAtCondition = forJumpIndexStack.pop();
				int conditionJump = indexAtCondition - instructions.size();
				instructions.add(new Instruction(Instruction.OPCODE_JUMP, conditionJump));
				
				int conditionalJumpIndex = forConditionalJumpIndexStack.pop();
				int conditionalJump = instructions.size() - conditionalJumpIndex;
				instructions.set(conditionalJumpIndex, new Instruction(Instruction.OPCODE_IF_FALSE, conditionalJump));

				endBreakable();
			}
			
			
			
			private Stack<Integer> forInConditionalJumpIndexStack = new Stack<Integer>();
			private Stack<Integer> forInJumpIndexStack = new Stack<Integer>();
			
			@Override
			public void enterForInStatement(ForInStatementContext ctx) {
				startBreakable();

				for(ForInStatementVarContext varCtx: ctx.forInStatementVar())
					declareVariable(varCtx.ID());
			}
			
			@Override
			public void enterForInStatementBody(ForInStatementBodyContext ctx) {
				ForInStatementContext forInStatementCtx = (ForInStatementContext)ctx.getParent();

				// iterable
				instructions.add(new Instruction(Instruction.OPCODE_SEND, "iterator", 0));
				// iterator
				int jumpIndex = instructions.size();
				forInJumpIndexStack.push(jumpIndex);
				instructions.add(new Instruction(Instruction.OPCODE_DUP));
				// iterator, iterator
				instructions.add(new Instruction(Instruction.OPCODE_SEND, "next", 0));
				// iterator, nextValues..., hadNext
				int conditionalJumpIndex = instructions.size();
				forInConditionalJumpIndexStack.push(conditionalJumpIndex);
				instructions.add(null);
				// iterator, nextValues...
				for(ForInStatementVarContext varCtx: forInStatementCtx.forInStatementVar()) {
					String id = varCtx.ID().getText();
					int ordinal = idToVariableOrdinalMap.get(id);
					instructions.add(new Instruction(Instruction.OPCODE_STORE_LOC, ordinal));
				}
				// iterator
			}
			
			@Override
			public void exitForInStatementBody(ForInStatementBodyContext ctx) {
				int jumpIndex = forInJumpIndexStack.pop();
				int jump = jumpIndex - instructions.size();
				instructions.add(new Instruction(Instruction.OPCODE_JUMP, jump));
				
				int conditionalJumpIndex = forInConditionalJumpIndexStack.pop();
				int conditionalJump = instructions.size() - conditionalJumpIndex;
				instructions.set(conditionalJumpIndex, new Instruction(Instruction.OPCODE_IF_FALSE, conditionalJump));

				ForInStatementContext forInStatementCtx = (ForInStatementContext)ctx.getParent();
				// iterator, nextValues...
				
				for(int i = 0; i < forInStatementCtx.forInStatementVar().size(); i++)
					instructions.add(new Instruction(Instruction.OPCODE_POP));
				// iterator
				instructions.add(new Instruction(Instruction.OPCODE_POP));
				// 
			}
			
			@Override
			public void exitForInStatement(ForInStatementContext ctx) {
			}
			
			
			@Override
			public void enterMemberAccess(MemberAccessContext ctx) {
				String id = ctx.ID().getText();
				instructions.add(new Instruction(Instruction.OPCODE_LOAD_STRING, id));
			}
			
			@Override
			public void exitMemberAccess(MemberAccessContext ctx) {
				instructions.add(new Instruction(Instruction.OPCODE_GET));
			}
			
			@Override
			public void exitComputedMemberAccess(ComputedMemberAccessContext ctx) {
				instructions.add(new Instruction(Instruction.OPCODE_GET));
			}
			
			@Override
			public void exitExplicitMessageExchange(ExplicitMessageExchangeContext ctx) {
				int argumentCount = ctx.messageExchange().expression().size();
				appendMessageExchange(ctx.messageExchange().ID(), argumentCount);
			}
			
			@Override
			public void enterMemberAssignment(MemberAssignmentContext ctx) {
				// receiver
				String id = ctx.ID().getText();
				
				switch(ctx.op.getType()) {
				case DuroLexer.ASSIGN:
					instructions.add(new Instruction(Instruction.OPCODE_LOAD_STRING, id));
					// receiver, id
					break;
				default:
					// For computed value +=, -=, ...
					instructions.add(new Instruction(Instruction.OPCODE_DUP)); // Dup receiver
					// receiver, receiver
					instructions.add(new Instruction(Instruction.OPCODE_LOAD_STRING, id));
					// receiver, receiver, id
					instructions.add(new Instruction(Instruction.OPCODE_GET));
					// receiver, oldValue
					break;
				}
			}
			
			@Override
			public void exitMemberAssignment(MemberAssignmentContext ctx) {
				switch(ctx.op.getType()) {
				case DuroLexer.ASSIGN:
					// receiver, id, value
					instructions.add(new Instruction(Instruction.OPCODE_DUP2));
					// value, receiver, id, value
					instructions.add(new Instruction(Instruction.OPCODE_SET));
					break;
				default:
					String id = ctx.ID().getText();
					
					// receiver, oldValue, newValuePart
					appendAssignmentReducer(ctx.op);
					// receiver, newValue
					instructions.add(new Instruction(Instruction.OPCODE_DUP1));
					// newValue, receiver, newValue
					instructions.add(new Instruction(Instruction.OPCODE_LOAD_STRING, id));
					// newValue, receiver, newValue, id
					instructions.add(new Instruction(Instruction.OPCODE_SWAP));
					// newValue, receiver, id, newValue
					instructions.add(new Instruction(Instruction.OPCODE_SET));
					// newValue
					break;
				}
			}
			
			
			
			@Override
			public void enterComputedMemberAssignment(ComputedMemberAssignmentContext ctx) {
				// receiver

				if(ctx.op.getType() != DuroLexer.ASSIGN) {
					// For computed value +=, -=, ...
					instructions.add(new Instruction(Instruction.OPCODE_DUP)); // Dup receiver
					// receiver, receiver
					ParseTree keyExpression = ctx.computedMemberAssignmentKey().expression();
					walker.walk(createBodyListener(walker, idToParameterOrdinalMap, idToVariableOrdinalMap, instructions, yieldStatements), keyExpression);
					// receiver, receiver, id
					instructions.add(new Instruction(Instruction.OPCODE_DUP1));
					// receiver, id, receiver, id
					instructions.add(new Instruction(Instruction.OPCODE_GET));
					// receiver, id, oldValue
				}
			}
			
			@Override
			public void enterComputedMemberAssignmentKey(ComputedMemberAssignmentKeyContext ctx) {
				ComputedMemberAssignmentContext computedMemberAssignmentCtx = (ComputedMemberAssignmentContext)ctx.getParent();
						
				if(computedMemberAssignmentCtx.op.getType() != DuroLexer.ASSIGN)
					walker.suspendWalkWithin(ctx);
			}
			
			@Override
			public void exitComputedMemberAssignment(ComputedMemberAssignmentContext ctx) {
				switch(ctx.op.getType()) {
				case DuroLexer.ASSIGN:
					// receiver, id, value
					instructions.add(new Instruction(Instruction.OPCODE_DUP2));
					// value, receiver, id, value
					instructions.add(new Instruction(Instruction.OPCODE_SET));
					break;
				default:
					// receiver, id, oldValue, newValuePart
					appendAssignmentReducer(ctx.op);
					// receiver, id, newValue
					instructions.add(new Instruction(Instruction.OPCODE_DUP2));
					// newValue, receiver, id, newValue
					instructions.add(new Instruction(Instruction.OPCODE_SET));
					// newValue
					break;
				}
			}
			
			
			
			@Override
			public void exitTopExpression(TopExpressionContext ctx) {
				instructions.add(new Instruction(Instruction.OPCODE_POP));
			}
			
			private int declareVariable(TerminalNode idNode) {
				String id = idNode.getText();
				Integer ordinal = idToVariableOrdinalMap.get(id);
				
				if(ordinal == null) {
					ordinal = idToVariableOrdinalMap.size();
					idToVariableOrdinalMap.put(id, ordinal);
				}
				
				return ordinal;
			}
		};
	}
	
	private static String extractStringLiteral(String rawString) {
		return rawString.substring(1, rawString.length() - 1)
			.replace("\\n", "\n")
			.replace("\\r", "\r")
			.replace("\\t", "\t");
	}
	
	private static BodyInfo getBodyInfo(Hashtable<String, Integer> idToParameterOrdinalMap, ParseTree tree) {
		Hashtable<String, Integer> idToOrdinalMap = new Hashtable<String, Integer>();
		ArrayList<Instruction> instructions = new ArrayList<Instruction>();
		ArrayList<YieldStatementContext> yieldStatements = new ArrayList<YieldStatementContext>();
		
		ConditionalTreeWalker walker = new ConditionalTreeWalker();
		walker.walk(createBodyListener(walker, idToParameterOrdinalMap, idToOrdinalMap, instructions, yieldStatements), tree);
		
		if(yieldStatements.size() > 0) {
			// Generatable/generator
			// Function returns iterables
			
			int distinctYieldCount = (int)yieldStatements.stream().map(i -> i.expression().size()).distinct().count();
			if(distinctYieldCount > 1)
				throw new RuntimeException("Multiple distinct yield counts.");
			
			ArrayList<Instruction> iteratorInstructions = instructions;
			ArrayList<Instruction> generatorInstructions = new ArrayList<Instruction>();
			
			int parameterCount = idToParameterOrdinalMap.size();
			int variableCount = idToOrdinalMap.size();

			generatorInstructions.add(new Instruction(Instruction.OPCODE_LOAD_FUNC, new CallFrameInfo(parameterCount, variableCount, iteratorInstructions.toArray(new Instruction[iteratorInstructions.size()]))));
			// Forward arguments
			for(int i = 0; i < parameterCount; i++)
				generatorInstructions.add(new Instruction(Instruction.OPCODE_LOAD_ARG, i));
			// A generator is a special object, which understands a single kind of message: next
			generatorInstructions.add(new Instruction(Instruction.OPCODE_SP_NEW_GENERATABLE, parameterCount));
			generatorInstructions.add(new Instruction(Instruction.OPCODE_RET, 1));
			
			return new BodyInfo(idToOrdinalMap.size(), generatorInstructions);
		} else
			return new BodyInfo(idToOrdinalMap.size(), instructions);
	}
	
	private static class LiteralDuroListener extends DuroBaseListener {
		private Object literal;
		
		public Object getLiteral() {
			return literal;
		}
		
		@Override
		public void enterInteger(IntegerContext ctx) {
			literal = Integer.parseInt(ctx.INT().getText());
		}
		
		@Override
		public void enterString(StringContext ctx) {
			literal = extractStringLiteral(ctx.STRING_LITERAL().getText());
		}
	}
	
	private static Object getLiteral(ParseTree tree) {
		ParseTreeWalker walker = new ParseTreeWalker();
		LiteralDuroListener listener = new LiteralDuroListener();
		walker.walk(listener, tree);
		
		return listener.getLiteral();
	}
	
	private static class BodyInfo {
		private final int localCount;
		private final ArrayList<Instruction> instructions;
		
		public BodyInfo(int ordinalCount, ArrayList<Instruction> instructions) {
			this.localCount = ordinalCount;
			this.instructions = instructions;
		} 
	}
}
