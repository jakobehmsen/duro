package duro.reflang;

import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Hashtable;
import java.util.Map;
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
import duro.reflang.antlr4.DuroParser.IndexAccessContext;
import duro.reflang.antlr4.DuroParser.IndexAssignmentContext;
import duro.reflang.antlr4.DuroParser.IndexAssignmentKeyContext;
import duro.reflang.antlr4.DuroParser.IntegerContext;
import duro.reflang.antlr4.DuroParser.LiteralContext;
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
import duro.reflang.antlr4.DuroParser.UnaryExpressionPostIncDecApplicationContext;
import duro.reflang.antlr4.DuroParser.UnaryExpressionPostIncDecApplicationIndexAccessReceiverContext;
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
		BodyInfo bodyInfo = getBodyInfo(idToParameterOrdinalMap, programCtx, new Hashtable<String, Integer>(), new Hashtable<String, Integer>());
		
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
			final ArrayList<Instruction> instructions, final ArrayList<YieldStatementContext> yieldStatements, 
			final Hashtable<String, Integer> immediateIdToParameterOrdinalMap, final Hashtable<String, Integer> immediateIdToVariableOrdinalMap,
			final HashSet<String> closedParameterIds, final HashSet<String> closedVariableIds) {
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
			public void exitUnaryExpressionPostIncDecApplicationIndexAccessReceiver(UnaryExpressionPostIncDecApplicationIndexAccessReceiverContext ctx) {
				instructions.add(new Instruction(Instruction.OPCODE_DUP)); // Dup receiver
			}
			
			@Override
			public void exitUnaryExpressionPostIncDecApplication(UnaryExpressionPostIncDecApplicationContext ctx) {
				ParserRuleContext targetCtx = (ParserRuleContext)ctx.getChild(0);
				switch(targetCtx.getRuleIndex()) {
				case DuroParser.RULE_unaryExpressionPostIncDecApplicationVariable: {
					// Either variable assignment or member assignment
					String id = ((UnaryExpressionPostIncDecApplicationVariableContext)targetCtx).ID().getText();;
					
					if(idToVariableOrdinalMap.containsKey(id))
						appendUnaryExpressionPostIncDecApplicationVariable(ctx, targetCtx);
					else {
						instructions.add(new Instruction(Instruction.OPCODE_LOAD_THIS));
						// receiver
						appendUnaryExpressionPostIncDecApplicationMemberAccess(ctx, id);
					}
					
					break;
				} case DuroParser.RULE_unaryExpressionPostIncDecApplicationMemberAccess: {
					String id = ((UnaryExpressionPostIncDecApplicationMemberAccessContext)targetCtx).ID().getText();
					appendUnaryExpressionPostIncDecApplicationMemberAccess(ctx, id);
					break;
				} case DuroParser.RULE_unaryExpressionPostIncDecApplicationIndexAccess:
					// receiver, receiver, id
					instructions.add(new Instruction(Instruction.OPCODE_DUP1));
					// receiver, id, receiver, id
					instructions.add(new Instruction(Instruction.OPCODE_SEND, "get", 1));
					// receiver, id, value
					instructions.add(new Instruction(Instruction.OPCODE_DUP2));
					// value, receiver, id, value,
					instructions.add(new Instruction(Instruction.OPCODE_LOAD_INT, 1));
					// value, receiver, id, value, 1
					appendIncDec(ctx.op);
					// value, receiver, id, value'
					instructions.add(new Instruction(Instruction.OPCODE_SEND, "set", 2));
					break;
				}
			}
			
			private void appendUnaryExpressionPostIncDecApplicationVariable(UnaryExpressionPostIncDecApplicationContext ctx, ParserRuleContext targetCtx) {
				String id = ((UnaryExpressionPostIncDecApplicationVariableContext)targetCtx).ID().getText();
				int ordinal = idToVariableOrdinalMap.get(id);
				instructions.add(new Instruction(Instruction.OPCODE_LOAD_LOC, ordinal));
				instructions.add(new Instruction(Instruction.OPCODE_DUP));
				instructions.add(new Instruction(Instruction.OPCODE_LOAD_INT, 1));
				appendIncDec(ctx.op);
				instructions.add(new Instruction(Instruction.OPCODE_STORE_LOC, ordinal));
			}
			
			private void appendUnaryExpressionPostIncDecApplicationMemberAccess(UnaryExpressionPostIncDecApplicationContext ctx, String id) {
				// receiver
				instructions.add(new Instruction(Instruction.OPCODE_DUP)); // Dup receiver
				// receiver, receiver
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
				
				if(idToVariableOrdinalMap.containsKey(firstId)) {
					// Variable assignment
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
				} else {
					// Member assignment for this
					switch(ctx.op.getType()) {
					case DuroLexer.ASSIGN: {
						break;
					} default: {
						instructions.add(new Instruction(Instruction.OPCODE_LOAD_THIS));
						instructions.add(new Instruction(Instruction.OPCODE_LOAD_STRING, firstId));
						instructions.add(new Instruction(Instruction.OPCODE_GET));
						// oldValue
						break;
					}
					}
				}
			}
			
			@Override
			public void exitVariableAssignment(VariableAssignmentContext ctx) {
				String firstId = ctx.ID(0).getText();

				if(idToVariableOrdinalMap.containsKey(firstId)) {
					int firstOrdinal = idToVariableOrdinalMap.get(firstId);
					// Variable assignment
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
				} else {
					// Member assignment for this
					switch(ctx.op.getType()) {
					case DuroLexer.ASSIGN: {
						instructions.add(new Instruction(Instruction.OPCODE_DUP_ANY, 0, ctx.ID().size() - 1));
						
						for(int i = 0; i < ctx.ID().size(); i++) {
							String id = ctx.ID(i).getText();
							instructions.add(new Instruction(Instruction.OPCODE_LOAD_STRING, id));
							instructions.add(new Instruction(Instruction.OPCODE_LOAD_THIS));
							instructions.add(new Instruction(Instruction.OPCODE_SWAP_ANY, 0, 2));
							instructions.add(new Instruction(Instruction.OPCODE_SET));
						}
						
						break;
					} default: {
						// Multiple returns values are not supported here yet.
						
						// oldValue, newValuePart
						appendAssignmentReducer(ctx.op);
						// newValue
						instructions.add(new Instruction(Instruction.OPCODE_DUP));
						// newValue, newValue
						instructions.add(new Instruction(Instruction.OPCODE_LOAD_STRING, firstId));
						// newValue, newValue, id
						instructions.add(new Instruction(Instruction.OPCODE_LOAD_THIS));
						// newValue, newValue, id, receiver
						instructions.add(new Instruction(Instruction.OPCODE_SWAP_ANY, 0, 2));
						// newValue, receiver, id, newValue
						instructions.add(new Instruction(Instruction.OPCODE_SET));
						// newValue
						break;
					}
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
					if(parameterOrdinal == 2)
						new String();
					instructions.add(new Instruction(Instruction.OPCODE_LOAD_ARG, parameterOrdinal));
					return;
				}
				
				Integer variableOrdinal = idToVariableOrdinalMap.get(id);
				if(variableOrdinal != null) {
					// Load variable
					instructions.add(new Instruction(Instruction.OPCODE_LOAD_LOC, variableOrdinal));
					return;
				}
				
				Integer immediateParameterOrdinal = immediateIdToParameterOrdinalMap.get(id);
				if(immediateParameterOrdinal != null)
					closedParameterIds.add(id);

				Integer immediateVariableOrdinal = immediateIdToVariableOrdinalMap.get(id);
				if(immediateVariableOrdinal != null)
					closedVariableIds.add(id);
				
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
			
//			private Stack<HashSet<String>> entryClosedParameterIdsStack = new Stack<HashSet<String>>();
//			private Stack<HashSet<String>> entryClosedVariablesIdsStack = new Stack<HashSet<String>>();
			
			@Override
			public void enterDictProcess(DictProcessContext ctx) {
//				entryClosedParameterIdsStack.push(new HashSet<String>());
//				entryClosedVariablesIdsStack.push(new HashSet<String>());
				
				// The dict becomes the immediate lexical context
				// Thus immediateIdToParameterOrdinalMap and immediateIdToVariableOrdinalMap should be empty
				
				/*
				var x = 5;
				var dict = {
					i: 0,
					y: function() {
						return x + i;
					}
				}
				=>
				var x = 5;
				var dict = {
					x: x,
					i: 0,
					y: function() {
						return x + i;
					}
				}
				*/
				
				/*
				What about:
				
				var x = 5;
				var dict = {
					x: 7,
					i: 0,
					y: function() {
						return x + i;
					}
				}
				=> // No change?
				var x = 5;
				var dict = {
					x: 7, // x in y is assumed to refer to this x?
					i: 0,
					y: function() {
						return x + i;
					}
				}
				*/
				
				instructions.add(new Instruction(Instruction.OPCODE_SP_NEW_DICT));
			}
			
			@Override
			public void enterDictProcessEntry(DictProcessEntryContext ctx) {
//				walker.suspendWalkWithin(ctx);
				
				String id = ctx.ID().getText();
				
//				Hashtable<String, Integer> entryImmediateIdToParameterOrdinalMap = new Hashtable<String, Integer>();
//				Hashtable<String, Integer> entryImmediateIdToVariableOrdinalMap = new Hashtable<String, Integer>();
//				
//				HashSet<String> entryClosedParameterIds = entryClosedParameterIdsStack.peek();
//				HashSet<String> entryClosedVariableIds = entryClosedVariablesIdsStack.peek();
				
				instructions.add(new Instruction(Instruction.OPCODE_DUP));
				instructions.add(new Instruction(Instruction.OPCODE_LOAD_STRING, id));
//				ConditionalTreeWalker walker = new ConditionalTreeWalker();
//				walker.walk(
//					createBodyListener(
//						walker, idToParameterOrdinalMap, idToVariableOrdinalMap, instructions, yieldStatements, 
//						entryImmediateIdToParameterOrdinalMap, entryImmediateIdToVariableOrdinalMap, entryClosedParameterIds, entryClosedVariableIds),
//					ctx.expression()
//				);
//				instructions.add(new Instruction(Instruction.OPCODE_DEF));
			}
			
			@Override
			public void exitDictProcessEntry(DictProcessEntryContext ctx) {
				instructions.add(new Instruction(Instruction.OPCODE_DEF));
			}
			
			@Override
			public void exitDictProcess(DictProcessContext ctx) {
//				HashSet<String> entryClosedParameterIds = entryClosedParameterIdsStack.pop();
//				HashSet<String> entryClosedVariableIds = entryClosedVariablesIdsStack.pop();
//				
//				new String();
			}
			
			@Override
			public void enterFunctionLiteral(FunctionLiteralContext ctx) {
				walker.suspendWalkWithin(ctx);
			}
			
			@Override
			public void exitFunctionLiteral(FunctionLiteralContext ctx) {
				int parameterCount = ctx.functionParameters().ID().size();
				Hashtable<String, Integer> newIdToParameterOrdinalMap = new Hashtable<String, Integer>();
				for(int i = 0; i < parameterCount; i++) {
					String parameterId = ctx.functionParameters().ID(i).getText();
					newIdToParameterOrdinalMap.put(parameterId, i);
				}
				BodyInfo functionBodyInfo = getBodyInfo(newIdToParameterOrdinalMap, ctx.functionBody(), idToParameterOrdinalMap, idToVariableOrdinalMap);

				CallFrameInfo callFrameInfo = new CallFrameInfo(
					parameterCount, functionBodyInfo.localCount, functionBodyInfo.instructions.toArray(new Instruction[functionBodyInfo.instructions.size()]));

//				if(functionBodyInfo.isClosure) {
//					// Figure out whether to create a closure here or not:
//					// If the function is creating as the right hand side of a entry of a dictionary literal... how should this be handled?
//					// It's all about the this
//					
//					// Perhaps, it should be possible to let processes act as proxies, by overwriting the proxy to the
//					/*
//					var proxyFunc = {
//						call: function(x) {
//							// sender is the this of top-1
//							as sender function(x) {
//								
//							}
//						}
//					};
//					
//					var o = {
//						f: proxyFunc
//					};
//					*/
//					generateClosure(functionBodyInfo, callFrameInfo);
//				} else {
					instructions.add(new Instruction(Instruction.OPCODE_LOAD_FUNC, callFrameInfo)); // Should this create a function process?
//				}
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
			public void enterPause(PauseContext ctx) {
				instructions.add(new Instruction(Instruction.OPCODE_PAUSE));
			}
			
			@Override
			public void exitVariableDeclarationAndAssignment(VariableDeclarationAndAssignmentContext ctx) {
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
				Hashtable<String, Integer> newIdToParameterOrdinalMap = new Hashtable<String, Integer>();
				for(int i = 0; i < parameterCount; i++) {
					String parameterId = ctx.functionParameters().ID(i).getText();
					newIdToParameterOrdinalMap.put(parameterId, i);
				}
				BodyInfo functionBodyInfo = getBodyInfo(newIdToParameterOrdinalMap, ctx.functionBody(), idToParameterOrdinalMap, idToVariableOrdinalMap);
				String id = ctx.ID().getText();

				CallFrameInfo callFrameInfo = new CallFrameInfo(
					parameterCount, functionBodyInfo.localCount, functionBodyInfo.instructions.toArray(new Instruction[functionBodyInfo.instructions.size()]));
				
//				if(functionBodyInfo.isClosure) {
//					// [target]
//					instructions.add(new Instruction(Instruction.OPCODE_LOAD_THIS));
//					// [target, id]
//					instructions.add(new Instruction(Instruction.OPCODE_LOAD_STRING, id));
//					
//					generateClosure(functionBodyInfo, callFrameInfo);
//					
//					// [target, id, closure]
//					instructions.add(new Instruction(Instruction.OPCODE_DEF));
//					// []
//				} else {
					instructions.add(new Instruction(Instruction.OPCODE_LOAD_THIS));
					instructions.add(new Instruction(Instruction.OPCODE_LOAD_STRING, id));
					instructions.add(new Instruction(Instruction.OPCODE_LOAD_FUNC, callFrameInfo)); // Should this create a function process?
					instructions.add(new Instruction(Instruction.OPCODE_DEF));
//				}
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
			
			private void generateClosure(BodyInfo functionBodyInfo, CallFrameInfo callFrameInfo) {
				/*

				var v;
				function()
					return v;
				}
				=>
				{
					call: function() {
						as sender {
							return v;
						}
					}
				}
				 
				*/
				
//				CallFrameInfo proxyCallFrameInfo = new CallFrameInfo(callFrameInfo.argumentCount, 0, new Instruction[] {
//					new Instruction(Instruction.OPCODE_DO_AS_SENDER, callFrameInfo.instructions),
//					new Instruction(Instruction.OPCODE_RET_FORWARD)
//				});
				
				// Create new object to represent a closure
				instructions.add(new Instruction(Instruction.OPCODE_SP_NEW_DICT));
				// [closure]
				
				// Associate each lexically closed id usage as members to the new object
				// First parameter ids as members
				for(Map.Entry<String, Integer> idAndOrdinal: functionBodyInfo.closedParameterIdsAndOrdinals.entrySet()) {
					instructions.add(new Instruction(Instruction.OPCODE_DUP));
					// [closure, closure]
					instructions.add(new Instruction(Instruction.OPCODE_LOAD_STRING, idAndOrdinal.getKey()));
					// [closure, closure, id]
					instructions.add(new Instruction(Instruction.OPCODE_LOAD_ARG, idAndOrdinal.getValue()));
					// [closure, closure, id, value]
					instructions.add(new Instruction(Instruction.OPCODE_SET));
					// [closure]
				}
				// Then variable ids as members
				for(Map.Entry<String, Integer> idAndOrdinal: functionBodyInfo.closedVariableIdsAndOrdinals.entrySet()) {
					instructions.add(new Instruction(Instruction.OPCODE_DUP));
					// [closure, closure]
					instructions.add(new Instruction(Instruction.OPCODE_LOAD_STRING, idAndOrdinal.getKey()));
					// [closure, closure, id]
					instructions.add(new Instruction(Instruction.OPCODE_LOAD_LOC, idAndOrdinal.getValue()));
					// [closure, closure, id, value]
					instructions.add(new Instruction(Instruction.OPCODE_SET));
					// [closure]
				}
				
				// Associate call member to callFrameInfo
				instructions.add(new Instruction(Instruction.OPCODE_DUP));
				// [closure, closure]
				instructions.add(new Instruction(Instruction.OPCODE_LOAD_STRING, "call"));
				// [closure, closure, "call"]
				instructions.add(new Instruction(Instruction.OPCODE_LOAD_FUNC, callFrameInfo)); // Should this create a function process?
				// [closure, closure, "call", function]
				instructions.add(new Instruction(Instruction.OPCODE_SET));
				// [closure]
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

				ParseTree updateElement = ctx.forStatementUpdate().delimitedProgramElement();
				walker.walk(
					createBodyListener(
						walker, idToParameterOrdinalMap, idToVariableOrdinalMap, instructions, yieldStatements, immediateIdToParameterOrdinalMap, immediateIdToVariableOrdinalMap,
						closedParameterIds, closedVariableIds), 
					updateElement
				);
				
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
			public void exitIndexAccess(IndexAccessContext ctx) {
				instructions.add(new Instruction(Instruction.OPCODE_SEND, "get", 1));
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
			public void enterIndexAssignment(IndexAssignmentContext ctx) {
				// receiver

				if(ctx.op.getType() != DuroLexer.ASSIGN) {
					// For computed value +=, -=, ...
					instructions.add(new Instruction(Instruction.OPCODE_DUP)); // Dup receiver
					// receiver, receiver
					ParseTree keyExpression = ctx.indexAssignmentKey().expression();
					walker.walk(
						createBodyListener(
							walker, idToParameterOrdinalMap, idToVariableOrdinalMap, instructions, yieldStatements, immediateIdToParameterOrdinalMap, immediateIdToVariableOrdinalMap,
							closedParameterIds, closedVariableIds), 
						keyExpression
					);
					// receiver, receiver, id
					instructions.add(new Instruction(Instruction.OPCODE_DUP1));
					// receiver, id, receiver, id
					instructions.add(new Instruction(Instruction.OPCODE_SEND, "get", 1));
					// receiver, id, oldValue
				}
			}
			
			@Override
			public void enterIndexAssignmentKey(IndexAssignmentKeyContext ctx) {
				IndexAssignmentContext computedMemberAssignmentCtx = (IndexAssignmentContext)ctx.getParent();
						
				if(computedMemberAssignmentCtx.op.getType() != DuroLexer.ASSIGN)
					walker.suspendWalkWithin(ctx);
			}
			
			@Override
			public void exitIndexAssignment(IndexAssignmentContext ctx) {
				switch(ctx.op.getType()) {
				case DuroLexer.ASSIGN:
					// receiver, id, value
					instructions.add(new Instruction(Instruction.OPCODE_DUP2));
					// value, receiver, id, value
					instructions.add(new Instruction(Instruction.OPCODE_SEND, "set", 2));
					break;
				default:
					// receiver, id, oldValue, newValuePart
					appendAssignmentReducer(ctx.op);
					// receiver, id, newValue
					instructions.add(new Instruction(Instruction.OPCODE_DUP2));
					// newValue, receiver, id, newValue
					instructions.add(new Instruction(Instruction.OPCODE_SEND, "set", 2));
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
	
	private static BodyInfo getBodyInfo(
			Hashtable<String, Integer> idToParameterOrdinalMap, ParseTree tree, 
			final Hashtable<String, Integer> immediateIdToParameterOrdinalMap, final Hashtable<String, Integer> immediateIdToVariableOrdinalMap) {
		Hashtable<String, Integer> idToVariableOrdinalMap = new Hashtable<String, Integer>();
		ArrayList<Instruction> instructions = new ArrayList<Instruction>();
		ArrayList<YieldStatementContext> yieldStatements = new ArrayList<YieldStatementContext>();
		
		HashSet<String> closedParameterIds = new HashSet<String>();
		HashSet<String> closedVariableIds = new HashSet<String>();
		
		ConditionalTreeWalker walker = new ConditionalTreeWalker();
		walker.walk(
			createBodyListener(
				walker, idToParameterOrdinalMap, idToVariableOrdinalMap, instructions, yieldStatements, immediateIdToParameterOrdinalMap, immediateIdToVariableOrdinalMap,
				closedParameterIds, closedVariableIds), 
			tree
		);
		
		int variableCount = idToVariableOrdinalMap.size();

		boolean isClosure = closedParameterIds.size() > 0 || closedVariableIds.size() > 0;
		
		Hashtable<String, Integer> closedParameterIdsAndOrdinals = new Hashtable<String, Integer>();
		Hashtable<String, Integer> closedVariableIdsAndOrdinals = new Hashtable<String, Integer>();
		
		if(isClosure) {
			for(String closedParameterId: closedParameterIds) {
				int ordinal = immediateIdToParameterOrdinalMap.get(closedParameterId);
				closedParameterIdsAndOrdinals.put(closedParameterId, ordinal);
			}

			for(String closedVariableId: closedVariableIds) {
				int ordinal = immediateIdToVariableOrdinalMap.get(closedVariableId);
				closedVariableIdsAndOrdinals.put(closedVariableId, ordinal);
			}
		}
		
		if(yieldStatements.size() > 0) {
			// Generatable/generator
			// Function returns iterables
			
			int distinctYieldCount = (int)yieldStatements.stream().map(i -> i.expression().size()).distinct().count();
			if(distinctYieldCount > 1)
				throw new RuntimeException("Multiple distinct yield counts.");
			
			ArrayList<Instruction> iteratorInstructions = instructions;
			ArrayList<Instruction> generatorInstructions = new ArrayList<Instruction>();
			
			int parameterCount = idToParameterOrdinalMap.size();

			generatorInstructions.add(new Instruction(Instruction.OPCODE_LOAD_FUNC, new CallFrameInfo(parameterCount, variableCount, iteratorInstructions.toArray(new Instruction[iteratorInstructions.size()]))));
			// Forward arguments
			for(int i = 0; i < parameterCount; i++)
				generatorInstructions.add(new Instruction(Instruction.OPCODE_LOAD_ARG, i));
			// A generator is a special object, which understands a single kind of message: next
			generatorInstructions.add(new Instruction(Instruction.OPCODE_SP_NEW_GENERATABLE, parameterCount));
			generatorInstructions.add(new Instruction(Instruction.OPCODE_RET, 1));
			
			return new BodyInfo(isClosure, closedParameterIdsAndOrdinals, closedVariableIdsAndOrdinals, variableCount, generatorInstructions);
		} else
			return new BodyInfo(isClosure, closedParameterIdsAndOrdinals, closedVariableIdsAndOrdinals, variableCount, instructions);
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
		private final boolean isClosure;
		private final Hashtable<String, Integer> closedParameterIdsAndOrdinals;
		private final Hashtable<String, Integer> closedVariableIdsAndOrdinals;
		private final int localCount;
		private final ArrayList<Instruction> instructions;
		
		public BodyInfo(boolean isClosure, Hashtable<String, Integer> closedParameterIdsAndOrdinals, Hashtable<String, Integer> closedVariableIdsAndOrdinals, int ordinalCount, ArrayList<Instruction> instructions) {
			this.isClosure = isClosure;
			this.closedParameterIdsAndOrdinals = closedParameterIdsAndOrdinals;
			this.closedVariableIdsAndOrdinals = closedVariableIdsAndOrdinals;
			this.localCount = ordinalCount;
			this.instructions = instructions;
		} 
	}
}
