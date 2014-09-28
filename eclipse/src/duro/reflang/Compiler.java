package duro.reflang;

import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Stack;
import java.util.stream.Collectors;

import org.antlr.v4.runtime.ANTLRErrorListener;
import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.Parser;
import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.RecognitionException;
import org.antlr.v4.runtime.Recognizer;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.atn.ATNConfigSet;
import org.antlr.v4.runtime.atn.PredictionMode;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.ParseTreeListener;
import org.antlr.v4.runtime.tree.ParseTreeWalker;
import org.antlr.v4.runtime.tree.RuleNode;
import org.antlr.v4.runtime.tree.TerminalNode;

import duro.debugging.Debug;
import duro.reflang.antlr4.DuroBaseListener;
import duro.reflang.antlr4.DuroLexer;
import duro.reflang.antlr4.DuroListener;
import duro.reflang.antlr4.DuroParser;
import duro.reflang.antlr4.DuroParser.ArgumentParameterContext;
import duro.reflang.antlr4.DuroParser.ArrayContext;
import duro.reflang.antlr4.DuroParser.ArrayOperandContext;
import duro.reflang.antlr4.DuroParser.BehaviorElementContext;
import duro.reflang.antlr4.DuroParser.BehaviorElementsContext;
import duro.reflang.antlr4.DuroParser.BehaviorElementsSingleContext;
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
import duro.reflang.antlr4.DuroParser.ClosureBodyContext;
import duro.reflang.antlr4.DuroParser.ClosureLiteralContext;
import duro.reflang.antlr4.DuroParser.ConditionalExpressionConditionContext;
import duro.reflang.antlr4.DuroParser.ConditionalExpressionContext;
import duro.reflang.antlr4.DuroParser.ConditionalExpressionFalseContext;
import duro.reflang.antlr4.DuroParser.ConditionalExpressionTrueContext;
import duro.reflang.antlr4.DuroParser.DictProcess2Context;
import duro.reflang.antlr4.DuroParser.DictProcessContext;
import duro.reflang.antlr4.DuroParser.DictProcessEntry2Context;
import duro.reflang.antlr4.DuroParser.DictProcessEntryContext;
import duro.reflang.antlr4.DuroParser.DictProcessEntryPrototypeAssignmentContext;
import duro.reflang.antlr4.DuroParser.DictProcessEntryQuotedAssignmentContext;
import duro.reflang.antlr4.DuroParser.DictProcessEntryQuotedAssignmentValueContext;
import duro.reflang.antlr4.DuroParser.DictProcessEntryRegularAssignmentContext;
import duro.reflang.antlr4.DuroParser.ElseStatementContext;
import duro.reflang.antlr4.DuroParser.ExplicitMessageExchangeContext;
import duro.reflang.antlr4.DuroParser.ForInStatementBodyContext;
import duro.reflang.antlr4.DuroParser.ForInStatementContext;
import duro.reflang.antlr4.DuroParser.ForInStatementVarContext;
import duro.reflang.antlr4.DuroParser.ForStatementBodyContext;
import duro.reflang.antlr4.DuroParser.ForStatementConditionContext;
import duro.reflang.antlr4.DuroParser.ForStatementContext;
import duro.reflang.antlr4.DuroParser.ForStatementUpdateContext;
import duro.reflang.antlr4.DuroParser.FrameContext;
import duro.reflang.antlr4.DuroParser.FunctionBodyContext;
import duro.reflang.antlr4.DuroParser.FunctionDefinitionContext;
import duro.reflang.antlr4.DuroParser.FunctionLiteralContext;
import duro.reflang.antlr4.DuroParser.IfStatementConditionContext;
import duro.reflang.antlr4.DuroParser.IfStatementOnTrueContext;
import duro.reflang.antlr4.DuroParser.IndexAccessContext;
import duro.reflang.antlr4.DuroParser.IndexAssignmentContext;
import duro.reflang.antlr4.DuroParser.IndexAssignmentKeyContext;
import duro.reflang.antlr4.DuroParser.IntegerContext;
import duro.reflang.antlr4.DuroParser.InterfaceIdContext;
import duro.reflang.antlr4.DuroParser.LookupContext;
import duro.reflang.antlr4.DuroParser.MemberAccessContext;
import duro.reflang.antlr4.DuroParser.MemberAssignmentContext;
import duro.reflang.antlr4.DuroParser.MessageExchangeContext;
import duro.reflang.antlr4.DuroParser.NilContext;
import duro.reflang.antlr4.DuroParser.PauseContext;
import duro.reflang.antlr4.DuroParser.PrimitiveContext;
import duro.reflang.antlr4.DuroParser.PrimitiveOperand2Context;
import duro.reflang.antlr4.DuroParser.ProgramContext;
import duro.reflang.antlr4.DuroParser.ProgramElementContentContext;
import duro.reflang.antlr4.DuroParser.ProgramElementsContext;
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
import duro.reflang.antlr4.DuroParser.YieldStatementExpressionContext;
import duro.runtime.CustomProcess;
import duro.runtime.Instruction;

public class Compiler {
	private MessageCollector errors = new MessageCollector();
	
	private void appendError(ParserRuleContext ctx, String message) {
		errors.appendMessage(ctx.getStart().getLine(), ctx.getStart().getCharPositionInLine(), message);
	}
	
	private void appendError(int line, int charPositionInLine, String message) {
		errors.appendMessage(line, charPositionInLine, message);
	}
	
	private void appendErrors(MessageCollector errors) {
		this.errors.appendMessages(errors);
	}
	
	public boolean hasErrors() {
		return errors.hasMessages();
	}
	
	public void printErrors() {
		errors.printMessages();
	}
	
	public CustomProcess compile(InputStream sourceCode) throws IOException {
		CharStream charStream = new ANTLRInputStream(sourceCode);
		DuroLexer lexer = new DuroLexer(charStream);
		CommonTokenStream tokenStream = new CommonTokenStream(lexer);
		DuroParser parser = new DuroParser(tokenStream);
		parser.removeErrorListeners();
		parser.addErrorListener(new ANTLRErrorListener() {
			@Override
			public void syntaxError(Recognizer<?,?> recognizer, java.lang.Object offendingSymbol, int line, int charPositionInLine, java.lang.String msg, RecognitionException e) {
				appendError(line, charPositionInLine, msg);
			}
			
			@Override
			public void reportContextSensitivity(Parser recognizer, DFA dfa, int startIndex, int stopIndex, int prediction, ATNConfigSet configs) {
				new String();
			}
			
			@Override
			public void reportAttemptingFullContext(Parser recognizer, DFA dfa, int startIndex, int stopIndex, java.util.BitSet conflictingAlts, ATNConfigSet configs) {
				new String();
			}
			
			@Override
			public void reportAmbiguity(Parser recognizer, DFA dfa, int startIndex, int stopIndex, boolean exact, java.util.BitSet ambigAlts, ATNConfigSet configs) {
				new String();
			}
		});
		
		Debug.println(Debug.LEVEL_HIGH, "Parsing program...");
		ProgramContext programCtx;
		
		// Parsing approach following https://theantlrguy.atlassian.net/wiki/pages/viewpage.action?pageId=1900591
		parser.getInterpreter().setPredictionMode(PredictionMode.SLL);
		try {
			programCtx = parser.program();  // STAGE 1
		}
		catch (Exception ex) {
			tokenStream.reset(); // rewind input stream
		    parser.reset();
		    parser.getInterpreter().setPredictionMode(PredictionMode.LL);
		    programCtx = parser.program();  // STAGE 2
		    // if we parse ok, it's LL not SLL
		}
		
		Debug.println(Debug.LEVEL_HIGH, "Parsed program.");
		
		OrdinalAllocator idToParameterOrdinalMap = new OrdinalAllocator();
		OrdinalAllocator idToVariableOrdinalMap = new OrdinalAllocator();
		Debug.println(Debug.LEVEL_HIGH, "Generating program...");
		BodyInfo bodyInfo = getBodyInfo(idToParameterOrdinalMap, idToVariableOrdinalMap, programCtx);
		Debug.println(Debug.LEVEL_HIGH, "Generated program.");
		
		return new CustomProcess(idToParameterOrdinalMap.size(), bodyInfo.localCount, bodyInfo.instructions.toArray(new Instruction[bodyInfo.instructions.size()]));
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
	
	private DuroListener createBodyListener(
			final ConditionalTreeWalker walker, OrdinalAllocator idToParameterOrdinalMap, OrdinalAllocator idToVariableOrdinalMapArg, 
			final ArrayList<Instruction> instructions, final ArrayList<YieldStatementContext> yieldStatements) {
		return new DuroBaseListener() {
			OrdinalAllocator idToVariableOrdinalMap = idToVariableOrdinalMapArg;
			
			@Override
			public void exitProgram(ProgramContext ctx) {
				// Add finish instruction to the end
				instructions.add(new Instruction(Instruction.OPCODE_FINISH));
			}
			

			Stack<Integer> conditionalConditionalJumpIndexesStack = new Stack<Integer>();
			Stack<Integer> conditionalJumpIndexStack = new Stack<Integer>();
			
			@Override
			public void enterConditionalExpression(ConditionalExpressionContext ctx) {
				
			}
			
			@Override
			public void exitConditionalExpressionCondition(ConditionalExpressionConditionContext ctx) {
				// [<bool>]
				instructions.add(new Instruction(Instruction.OPCODE_DUP));
				int conditionalJumpIndex = instructions.size();
				instructions.add(null); // If false, jump to else expression
				conditionalConditionalJumpIndexesStack.add(conditionalJumpIndex);
			}
			
			@Override
			public void exitConditionalExpressionTrue(ConditionalExpressionTrueContext ctx) {
				int jumpIndex = instructions.size();
				conditionalJumpIndexStack.push(jumpIndex);
				instructions.add(null); // Jump to the end of the conditional expression
				
				int trueEndIndex = instructions.size();
				
				int conditionalConditionalJumpIndex = conditionalConditionalJumpIndexesStack.pop();
				int conditionalJump = trueEndIndex - conditionalConditionalJumpIndex;
				instructions.set(conditionalConditionalJumpIndex, new Instruction(Instruction.OPCODE_IF_FALSE, conditionalJump));
			}
			
			@Override
			public void exitConditionalExpressionFalse(ConditionalExpressionFalseContext ctx) {
				int jumpIndex = conditionalJumpIndexStack.pop();
				int jump = instructions.size() - jumpIndex;
				instructions.set(jumpIndex, new Instruction(Instruction.OPCODE_JUMP, jump));
			}
			
			@Override
			public void exitConditionalExpression(ConditionalExpressionContext ctx) {
				
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
				instructions.add(new Instruction(Instruction.OPCODE_SP_BOOLEAN_OR));
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
				instructions.add(new Instruction(Instruction.OPCODE_SP_BOOLEAN_AND));
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
				String operatorId = ctx.op.getText();
				instructions.add(new Instruction(Instruction.OPCODE_SEND, operatorId, 1));
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
			Stack<Integer> greaterLessOperandCountStack = new Stack<Integer>();
			
			@Override
			public void enterBinaryExpressionGreaterLess(BinaryExpressionGreaterLessContext ctx) {
				int operandCount = ctx.binaryExpressionGreaterLessApplication().size() + 1;
				greaterLessOperandCountStack.push(operandCount);
				
				if(operandCount > 2) {
					greaterLessConditionalJumpIndexesStack.add(new ArrayList<Integer>());
				}
			}
			
			@Override
			public void exitBinaryExpressionGreaterLessApplication(BinaryExpressionGreaterLessApplicationContext ctx) {
				int operandCount = greaterLessOperandCountStack.peek();
				
				if(operandCount > 2) {
					ArrayList<Integer> greaterLessConditionalJumpIndexes = greaterLessConditionalJumpIndexesStack.peek();
					
					instructions.add(new Instruction(Instruction.OPCODE_DUP));
					instructions.add(new Instruction(Instruction.OPCODE_SWAP1));
					
					appendGreaterLessOperator(ctx);
	
					int conditionalJumpIndex = instructions.size();
					instructions.add(null);
					greaterLessConditionalJumpIndexes.add(conditionalJumpIndex);
				} else if(operandCount == 2){
					appendGreaterLessOperator(ctx);
				}
			}

			private void appendGreaterLessOperator(BinaryExpressionGreaterLessApplicationContext ctx) {
				String operator = ctx.op.getText();
				instructions.add(new Instruction(Instruction.OPCODE_SEND, operator, 1));
			}
			
			@Override
			public void exitBinaryExpressionGreaterLess(BinaryExpressionGreaterLessContext ctx) {
				int operandCount = greaterLessOperandCountStack.pop();

				if(operandCount > 2) {
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
			}
			
			
			
			@Override
			public void exitBinaryExpressionArithmetic1Application(BinaryExpressionArithmetic1ApplicationContext ctx) {
				String id = ctx.BIN_OP1().getText();
				instructions.add(new Instruction(Instruction.OPCODE_SEND, id, 1));
			}
			
			@Override
			public void exitBinaryExpressionArithmetic2Application(BinaryExpressionArithmetic2ApplicationContext ctx) {
				String id = ctx.BIN_OP2().getText();
				instructions.add(new Instruction(Instruction.OPCODE_SEND, id, 1));
			}
			
			@Override
			public void exitUnaryExpressionNotApplication(UnaryExpressionNotApplicationContext ctx) {
				instructions.add(new Instruction(Instruction.OPCODE_SP_BOOLEAN_NOT));
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
					
					if(idToVariableOrdinalMap.isDeclared(id))
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
					instructions.add(new Instruction(Instruction.OPCODE_POP));
					break;
				}
			}
			
			private void appendUnaryExpressionPostIncDecApplicationVariable(UnaryExpressionPostIncDecApplicationContext ctx, ParserRuleContext targetCtx) {
				String id = ((UnaryExpressionPostIncDecApplicationVariableContext)targetCtx).ID().getText();
				int ordinal = idToVariableOrdinalMap.ordinalFor(id);
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
				instructions.add(new Instruction(Instruction.OPCODE_GET, id, 0));
				// receiver, value
				instructions.add(new Instruction(Instruction.OPCODE_DUP1));
				// value, receiver, value
				instructions.add(new Instruction(Instruction.OPCODE_LOAD_INT, 1));
				// value, receiver, value, 1
				appendIncDec(ctx.op);
				// value, receiver, value'
				instructions.add(new Instruction(Instruction.OPCODE_SET, id, 0));
				// value
			}
			
			private void appendIncDec(Token opToken) {
				switch(opToken.getType()) {
				case DuroLexer.DOUBLE_PLUS:
					instructions.add(new Instruction(Instruction.OPCODE_SEND, "+", 1));
					break;
				case DuroLexer.DOUBLE_MINUS:
					instructions.add(new Instruction(Instruction.OPCODE_SEND, "-", 1));
					break;
				}
			}
			
			@Override
			public void enterVariableAssignment(VariableAssignmentContext ctx) {
				String firstId = ctx.ID(0).getText();
				
				if(idToVariableOrdinalMap.isDeclared(firstId)) {
					// Variable assignment
					int firstOrdinal = idToVariableOrdinalMap.ordinalFor(firstId);
					
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
						instructions.add(new Instruction(Instruction.OPCODE_GET, firstId, 0));
						// oldValue
						break;
					}
					}
				}
			}
			
			@Override
			public void exitVariableAssignment(VariableAssignmentContext ctx) {
				String firstId = ctx.ID(0).getText();

				if(idToVariableOrdinalMap.isDeclared(firstId)) {
					int firstOrdinal = idToVariableOrdinalMap.ordinalFor(firstId);
					// Variable assignment
					switch(ctx.op.getType()) {
					case DuroLexer.ASSIGN: {
						instructions.add(new Instruction(Instruction.OPCODE_DUP_ANY, 0, ctx.ID().size() - 1));
						
						for(int i = 0; i < ctx.ID().size(); i++) {
							String id = ctx.ID(i).getText();
							int ordinal = idToVariableOrdinalMap.ordinalFor(id);
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
							instructions.add(new Instruction(Instruction.OPCODE_LOAD_THIS));
							instructions.add(new Instruction(Instruction.OPCODE_SWAP));
							instructions.add(new Instruction(Instruction.OPCODE_SET, id, 0));
						}
						
						break;
					} default: {
						// Multiple returns values are not supported here yet.
						
						// oldValue, newValuePart
						appendAssignmentReducer(ctx.op);
						// newValue
						instructions.add(new Instruction(Instruction.OPCODE_DUP));
						// newValue, newValue
						instructions.add(new Instruction(Instruction.OPCODE_LOAD_THIS));
						// newValue, newValue, receiver
						instructions.add(new Instruction(Instruction.OPCODE_SWAP));
						// newValue, receiver, newValue
						instructions.add(new Instruction(Instruction.OPCODE_SET, firstId, 0));
						// newValue
						break;
					}
					}
				}
			}
			
			private void appendAssignmentReducer(Token op) {
				switch(op.getType()) {
				case DuroLexer.ASSIGN_ADD:
					instructions.add(new Instruction(Instruction.OPCODE_SEND, "+", 1));
					break;
				case DuroLexer.ASSIGN_SUB:
					instructions.add(new Instruction(Instruction.OPCODE_SEND, "-", 1));
					break;
				case DuroLexer.ASSIGN_MULT:
					instructions.add(new Instruction(Instruction.OPCODE_SEND, "*", 1));
					break;
				case DuroLexer.ASSIGN_DIV:
					instructions.add(new Instruction(Instruction.OPCODE_SEND, "/", 1));
					break;
				case DuroLexer.ASSIGN_REM:
					instructions.add(new Instruction(Instruction.OPCODE_SEND, "%", 1));
					break;
				}
			}
			
			@Override
			public void enterLookup(LookupContext ctx) {
				String id = ctx.ID().getText();
				
				Integer parameterOrdinal = idToParameterOrdinalMap.ordinalFor(id);
				if(parameterOrdinal != null) {
					// Load argument
					instructions.add(new Instruction(Instruction.OPCODE_LOAD_ARG, parameterOrdinal));
					return;
				}
				
				Integer variableOrdinal = idToVariableOrdinalMap.ordinalFor(id);
				if(variableOrdinal != null) {
					// Load variable
					instructions.add(new Instruction(Instruction.OPCODE_LOAD_LOC, variableOrdinal));
					return;
				}
				
				// Get member
				instructions.add(new Instruction(Instruction.OPCODE_LOAD_THIS));
				instructions.add(new Instruction(Instruction.OPCODE_GET, id, 0));
			}
			
			@Override
			public void enterArgumentParameter(ArgumentParameterContext ctx) {
				int parameterOrdinal = idToParameterOrdinalMap.declare(ctx.ID().getText());
				instructions.add(new Instruction(Instruction.OPCODE_LOAD_ARG, parameterOrdinal));
			}
			
			@Override
			public void enterThisMessageExchange(ThisMessageExchangeContext ctx) {
				String id = ctx.messageExchange().messageId().getText();
				if(idToParameterOrdinalMap.isDeclared(id)) {
					// Call argument
					int ordinal = idToParameterOrdinalMap.ordinalFor(id);
					instructions.add(new Instruction(Instruction.OPCODE_LOAD_ARG, ordinal));
				} else if(idToVariableOrdinalMap.isDeclared(id)) {
					// Call variable
					int ordinal = idToVariableOrdinalMap.ordinalFor(id);
					instructions.add(new Instruction(Instruction.OPCODE_LOAD_LOC, ordinal));
				} else {
					instructions.add(new Instruction(Instruction.OPCODE_LOAD_THIS));
				}
			}
			
			private int getMessageExchangeArgumentCount(MessageExchangeContext ctx) {
				if(ctx.messageExchangeExpressionArguments() != null)
					return ctx.messageExchangeExpressionArguments().expression().size();
				else
					return ctx.messageExchangeLiteralArguments().literal().size();
			}
			
			@Override
			public void exitThisMessageExchange(ThisMessageExchangeContext ctx) {
				int argumentCount = getMessageExchangeArgumentCount(ctx.messageExchange());
				
				String id = ctx.messageExchange().messageId().getText();
				if(idToParameterOrdinalMap.isDeclared(id)) {
					// Call argument
					instructions.add(new Instruction(Instruction.OPCODE_CALL, argumentCount));
				} else if(idToVariableOrdinalMap.isDeclared(id)) {
					// Call variable
					instructions.add(new Instruction(Instruction.OPCODE_CALL, argumentCount));
				} else {
					appendMessageExchange(id, argumentCount);
				}
			}
			
			private void appendMessageExchange(String id, int argumentCount) {
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
				instructions.add(new Instruction(Instruction.OPCODE_DUP));
			}
			
			@Override
			public void exitDictProcessEntry(DictProcessEntryContext ctx) {
				String id = ctx.messageId().getText();
				
				instructions.add(new Instruction(Instruction.OPCODE_SET, id, 0));
			}
			
			
			
			@Override
			public void enterDictProcess2(DictProcess2Context ctx) {
				instructions.add(new Instruction(Instruction.OPCODE_SP_NEW_DICT));
			}
			
			@Override
			public void enterDictProcessEntry2(DictProcessEntry2Context ctx) {
				instructions.add(new Instruction(Instruction.OPCODE_DUP));
			}
			
			@Override
			public void exitDictProcessEntryRegularAssignment(DictProcessEntryRegularAssignmentContext ctx) {
				String id = ctx.messageId().getText();
				
				instructions.add(new Instruction(Instruction.OPCODE_SET, id, 0));
			}
			
			@Override
			public void exitDictProcessEntryPrototypeAssignment(DictProcessEntryPrototypeAssignmentContext ctx) {
				String id = ctx.messageId().getText();
				
				instructions.add(new Instruction(Instruction.OPCODE_SET_PROTO, id, 0));
			}
			
			@Override
			public void enterDictProcessEntryQuotedAssignment(DictProcessEntryQuotedAssignmentContext ctx) {
				walker.suspendWalkWithin(ctx);
			}
			
			@Override
			public void exitDictProcessEntryQuotedAssignmentValue(DictProcessEntryQuotedAssignmentValueContext ctx) {
				if(yieldStatements.size() > 0) {
					instructions.add(new Instruction(Instruction.OPCODE_LOAD_NULL));
					instructions.add(new Instruction(Instruction.OPCODE_RET));
				} else if(instructions.size() == 0) {
					instructions.add(new Instruction(Instruction.OPCODE_LOAD_NULL));
					instructions.add(new Instruction(Instruction.OPCODE_RET));
				} else if(!Instruction.isReturn(instructions.get(instructions.size() - 1).opcode)) {
					instructions.add(new Instruction(Instruction.OPCODE_RET));
				}
			}
			
			@Override
			public void exitDictProcessEntryQuotedAssignment(DictProcessEntryQuotedAssignmentContext ctx) {
				String id = ctx.messageId().getText();
				
				OrdinalAllocator newIdToParameterOrdinalMap = new OrdinalAllocator();
				OrdinalAllocator newIdToVariableOrdinalMap = new OrdinalAllocator();
				BodyInfo functionBodyInfo = getBodyInfo(newIdToParameterOrdinalMap, newIdToVariableOrdinalMap, ctx.dictProcessEntryQuotedAssignmentValue());
				int parameterCount = newIdToParameterOrdinalMap.size();

				Instruction[] bodyInstructions = functionBodyInfo.instructions.toArray(new Instruction[functionBodyInfo.instructions.size()]);
				instructions.add(new Instruction(Instruction.OPCODE_SP_NEW_BEHAVIOR, parameterCount, functionBodyInfo.localCount, bodyInstructions)); // Should this create a function process?
				instructions.add(new Instruction(Instruction.OPCODE_SET, id, parameterCount));
			}
			
			
			@Override
			public void enterFunctionLiteral(FunctionLiteralContext ctx) {
				walker.suspendWalkWithin(ctx);
			}
			
			@Override
			public void exitFunctionLiteral(FunctionLiteralContext ctx) {
				OrdinalAllocator newIdToParameterOrdinalMap = new OrdinalAllocator();
				OrdinalAllocator newIdToVariableOrdinalMap = new OrdinalAllocator();
				for(TerminalNode parameterIdNode: ctx.functionParameters().ID()) {
					String parameterId = parameterIdNode.getText();
					newIdToParameterOrdinalMap.declare(parameterId);
				}
				BodyInfo functionBodyInfo = getBodyInfo(newIdToParameterOrdinalMap, newIdToVariableOrdinalMap, ctx.functionBody());
				int parameterCount = newIdToParameterOrdinalMap.size();

				Instruction[] bodyInstructions = functionBodyInfo.instructions.toArray(new Instruction[functionBodyInfo.instructions.size()]);
				instructions.add(new Instruction(Instruction.OPCODE_SP_NEW_BEHAVIOR, parameterCount, functionBodyInfo.localCount, bodyInstructions)); // Should this create a function process?
			}
			
			@Override
			public void enterClosureLiteral(ClosureLiteralContext ctx) {
				// TODO: Instead of this, there could be a stack of instructions, where it is the top instructions that are manipulated
				// In exit body, the instructions stack can be popped
				walker.suspendWalkWithin(ctx);
			}

			@Override
			public void exitClosureBody(ClosureBodyContext ctx) {
				if(instructions.size() > 0) {
					if(!Instruction.isReturn(instructions.get(instructions.size() - 1).opcode)) {
						instructions.add(new Instruction(Instruction.OPCODE_RET));
					}
				} else {
					if(yieldStatements.size() > 0) {
						instructions.add(new Instruction(Instruction.OPCODE_LOAD_NULL));
						instructions.add(new Instruction(Instruction.OPCODE_RET));
					} else {
						instructions.add(new Instruction(Instruction.OPCODE_LOAD_NULL));
						instructions.add(new Instruction(Instruction.OPCODE_RET));
					}
				}
			}
			
			@Override
			public void exitClosureLiteral(ClosureLiteralContext ctx) {
				OrdinalAllocator newIdToVariableOrdinalMap = idToVariableOrdinalMap.newInner();
				OrdinalAllocator newIdToParameterOrdinalMap = idToParameterOrdinalMap.newInner();
				for(TerminalNode parameterIdNode: ctx.closureParameters().ID()) {
					String parameterId = parameterIdNode.getText();
					newIdToParameterOrdinalMap.declare(parameterId);
				}
				BodyInfo functionBodyInfo = getBodyInfo(newIdToParameterOrdinalMap, newIdToVariableOrdinalMap, ctx.closureBody());
				int parameterCount = newIdToParameterOrdinalMap.size();
				int closureParameterOffset = newIdToParameterOrdinalMap.getLocalParameterOffset();
				int closureParameterCount = newIdToParameterOrdinalMap.getLocalParameterCount();
				
				Instruction[] bodyInstructions = functionBodyInfo.instructions.toArray(new Instruction[functionBodyInfo.instructions.size()]);
				
				instructions.add(new Instruction(Instruction.OPCODE_SP_NEW_BEHAVIOR, parameterCount, functionBodyInfo.localCount, bodyInstructions));
				instructions.add(new Instruction(Instruction.OPCODE_SP_NEW_CLOSURE, closureParameterOffset, closureParameterCount));
				// [closure]
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
				instructions.add(new Instruction(Instruction.OPCODE_SEND, "set", 2));
				instructions.add(new Instruction(Instruction.OPCODE_POP));
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
			public void enterFrame(FrameContext ctx) {
				instructions.add(new Instruction(Instruction.OPCODE_LOAD_THIS_FRAME));
			}
			
			@Override
			public void enterPrimitiveOperand2(PrimitiveOperand2Context ctx) {
				walker.suspendWalkWithin(ctx);
			}
			
			@Override
			public void exitPrimitiveOperand2(PrimitiveOperand2Context ctx) {
				super.exitPrimitiveOperand2(ctx);
			}
			
			@Override
			public void exitPrimitive(PrimitiveContext ctx) {
				MessageCollector errors = new MessageCollector();
				
				String opcodeId = ctx.ID().getText();

				Integer opcode = Instruction.getOpcodeFromId(opcodeId);
				
				Object[] operands = new Object[Math.max(ctx.primitiveOperand2().size(), 3)];
				
				if(opcode != null) {
					if(Instruction.isExpressionCompatible(opcode)) {
						Class<?>[] expectedOperandTypes = Instruction.getOperandTypes(opcode);
						
						Class<?>[] actualOperandTypes = new Class<?>[ctx.primitiveOperand2().size()];
						
						for(int i = 0; i < ctx.primitiveOperand2().size(); i++) {
							operands[i] = getLiteral(ctx.primitiveOperand2().get(i));
							actualOperandTypes[i] = operands[i].getClass();
						}
						
						if(!Arrays.equals(expectedOperandTypes, actualOperandTypes)) {
							int givenOperandCount = ctx.primitiveOperand2().size();	
							String givenOperandsStr = givenOperandCount > 0 
								? noun(givenOperandCount, "Operand")  + " " + operandsToString(operands, givenOperandCount)
								: "No operands";
							String expectedOperandsStr = expectedOperandTypes.length > 0 
									? "operand sequence " + literalTypesToString(expectedOperandTypes) + " was"
									: "no operands where";
							errors.appendMessage(ctx, 
								givenOperandsStr + " " + wasWhere(givenOperandCount) + 
								" given when " + expectedOperandsStr + " expected for opcode '" + opcodeId + "'.");
						}
						
						if(ctx.primitiveArgument().size() != Instruction.getPopCount(opcode)) {
							String was1 = nounWasWhere(ctx.primitiveArgument().size(), "argument");
							String was2 = nounWasWhere(Instruction.getPopCount(opcode), "argument");
							errors.appendMessage(ctx, 
								ctx.primitiveArgument().size() + " " + was1 + " given when " + 
								Instruction.getPopCount(opcode) + " " + was2 +
								" expected for opcode '" + opcodeId + "'.");
						}
					} else {
						errors.appendMessage(ctx, "Opcode '" + opcodeId + "' not compatible with expressions");
					}
				} else {
					errors.appendMessage(ctx, "Invalid opcode '" + opcodeId + "'.");
				}
				
				if(!errors.hasMessages()) {
					instructions.add(new Instruction(opcode, operands[0], operands[1], operands[2]));
					if(!Instruction.doesReturn(opcode)) {
						instructions.add(new Instruction(Instruction.OPCODE_LOAD_NULL));
					}
				}
				appendErrors(errors);
			}
			
			private String nounWasWhere(int count, String noun) {
				return count == 1 ? noun + " was" : noun + "s where";
			}
			
			private String noun(int count, String noun) {
				return count == 1 ? noun : noun + "s";
			}
			
			private String wasWhere(int count) {
				return count == 1 ? "was" : "where";
			}
			
			private String operandsToString(Object[] operands, int count) {
				if(operands.length > 0) {
					return Arrays.asList(operands).stream().limit(count).map(x -> {
						return x.getClass().getSimpleName() + "(" + x + ")";
					}).collect(Collectors.joining(", "));
				}
				return "no";
			}
			
			private String literalTypesToString(Class<?>[] literalTypes) {
				if(literalTypes.length > 0) {
					return Arrays.asList(literalTypes).stream().map(x -> {
						return x.getSimpleName();
					}).collect(Collectors.joining(", ", "(", ")"));
				}
				return "no";
			}
			
			@Override
			public void enterPause(PauseContext ctx) {
				instructions.add(new Instruction(Instruction.OPCODE_PAUSE));
				instructions.add(new Instruction(Instruction.OPCODE_LOAD_NULL));
			}
			
			@Override
			public void exitVariableDeclarationAndAssignment(VariableDeclarationAndAssignmentContext ctx) {
				for(TerminalNode idNode: ctx.ID()) {
					if(!idToVariableOrdinalMap.isDeclaredLocally(idNode.getText()) && !idToParameterOrdinalMap.isDeclared(idNode.getText())) {
						int ordinal = idToVariableOrdinalMap.declare(idNode.getText());
						instructions.add(new Instruction(Instruction.OPCODE_DUP));
						instructions.add(new Instruction(Instruction.OPCODE_STORE_LOC, ordinal));
					} else {
						appendError(ctx, "Variable '" + idNode.getText() + "' is already declared in this scope.");
					}
				}
			}
			
			@Override
			public void enterVariableDeclaration(VariableDeclarationContext ctx) {
				if(!idToVariableOrdinalMap.isDeclaredLocally(ctx.ID().getText()) && !idToParameterOrdinalMap.isDeclared(ctx.ID().getText())) {
					idToVariableOrdinalMap.declare(ctx.ID().getText());
					instructions.add(new Instruction(Instruction.OPCODE_LOAD_NULL));
				} else {
					appendError(ctx, "Variable '" + ctx.ID().getText() + "' is already declared in this scope.");
				}
			}
			
			@Override
			public void exitReturnStatement(ReturnStatementContext ctx) {
				if(ctx.expression() == null)
					instructions.add(new Instruction(Instruction.OPCODE_LOAD_NULL));
				instructions.add(new Instruction(Instruction.OPCODE_RET));
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
			public void exitFunctionDefinition(FunctionDefinitionContext ctx) {
				String id = ctx.messageId().getText();
				OrdinalAllocator newIdToParameterOrdinalMap = new OrdinalAllocator();
				OrdinalAllocator newIdToVariableOrdinalMap = new OrdinalAllocator();
				for(TerminalNode parameterIdNode: ctx.functionParameters().ID()) {
					String parameterId = parameterIdNode.getText();
					newIdToParameterOrdinalMap.declare(parameterId);
				}
				BodyInfo functionBodyInfo = getBodyInfo(newIdToParameterOrdinalMap, newIdToVariableOrdinalMap, ctx.functionBody());
			
				Instruction[] bodyInstructions = functionBodyInfo.instructions.toArray(new Instruction[functionBodyInfo.instructions.size()]);
				int parameterCount = newIdToParameterOrdinalMap.size();
				
				instructions.add(new Instruction(Instruction.OPCODE_LOAD_THIS));
				// this
				instructions.add(new Instruction(Instruction.OPCODE_SP_NEW_BEHAVIOR, parameterCount, functionBodyInfo.localCount, bodyInstructions)); // Should this create a function process?
				// this, behavior
				instructions.add(new Instruction(Instruction.OPCODE_DUP1));
				// behavior, this, behavior
				instructions.add(new Instruction(Instruction.OPCODE_SET, id, parameterCount));
				// behavior
			}
			
			@Override
			public void enterYieldStatementExpression(YieldStatementExpressionContext ctx) {
				int generatableOrdinal = idToParameterOrdinalMap.declare("generator");
				instructions.add(new Instruction(Instruction.OPCODE_LOAD_ARG, generatableOrdinal));
				// generator
			}
			
			@Override
			public void exitYieldStatementExpression(YieldStatementExpressionContext ctx) {
				// generator, value
				instructions.add(new Instruction(Instruction.OPCODE_DUP1));
				// value, generator, value
				instructions.add(new Instruction(Instruction.OPCODE_SEND, "put", 1));
				// value, <resume value>
				instructions.add(new Instruction(Instruction.OPCODE_POP));
				// value
			}
			
			@Override
			public void exitYieldStatement(YieldStatementContext ctx) {
				yieldStatements.add(ctx);
			}
			
			@Override
			public void exitFunctionBody(FunctionBodyContext ctx) {
				if(yieldStatements.size() > 0) {
					instructions.add(new Instruction(Instruction.OPCODE_LOAD_NULL));
					instructions.add(new Instruction(Instruction.OPCODE_RET));
				} else if(instructions.size() == 0/* || !Instruction.isReturn(instructions.get(instructions.size() - 1).opcode)*/) {
					instructions.add(new Instruction(Instruction.OPCODE_LOAD_NULL));
					instructions.add(new Instruction(Instruction.OPCODE_RET));
				} else if(!Instruction.isReturn(instructions.get(instructions.size() - 1).opcode)) {
					instructions.add(new Instruction(Instruction.OPCODE_RET));
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
			public void enterIfStatementOnTrue(IfStatementOnTrueContext ctx) {
				idToVariableOrdinalMap = idToVariableOrdinalMap.newInner();
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
				
				idToVariableOrdinalMap = idToVariableOrdinalMap.getOuter();
			}
			
			@Override
			public void enterElseStatement(ElseStatementContext ctx) {
				idToVariableOrdinalMap = idToVariableOrdinalMap.newInner();
				
				if(ctx.ifStatementOnFalse() == null)
					instructions.add(new Instruction(Instruction.OPCODE_LOAD_NULL));
			}
			
			@Override
			public void exitElseStatement(ElseStatementContext ctx) {
				int jumpIndex = ifJumpIndexStack.pop();
				// Now, the spot allocated for a jump can be populated
				int elseEndIndex = instructions.size();
				int jump = elseEndIndex - jumpIndex;
				instructions.set(jumpIndex, new Instruction(Instruction.OPCODE_JUMP, jump));
				
				idToVariableOrdinalMap = idToVariableOrdinalMap.getOuter();
			}
			
			private Stack<Integer> whileConditionalJumpIndexStack = new Stack<Integer>();
			private Stack<Integer> whileJumpIndexStack = new Stack<Integer>();
			
			@Override
			public void enterWhileStatement(WhileStatementContext ctx) {
				startBreakable();
				idToVariableOrdinalMap = idToVariableOrdinalMap.newInner();
				
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

				idToVariableOrdinalMap = idToVariableOrdinalMap.getOuter();
				endBreakable();
				
				instructions.add(new Instruction(Instruction.OPCODE_LOAD_NULL));
			}
			
			

			private Stack<Integer> forConditionalJumpIndexStack = new Stack<Integer>();
			private Stack<Integer> forJumpIndexStack = new Stack<Integer>();
			
			@Override
			public void enterForStatement(ForStatementContext ctx) {
				startBreakable();
				idToVariableOrdinalMap = idToVariableOrdinalMap.newInner();
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

				ParseTree updateElement = ctx.forStatementUpdate().programElementContent();
				walker.walk(
					createBodyListener(walker, idToParameterOrdinalMap, idToVariableOrdinalMap, instructions, yieldStatements), 
					updateElement
				);
				
				int indexAtCondition = forJumpIndexStack.pop();
				int conditionJump = indexAtCondition - instructions.size();
				instructions.add(new Instruction(Instruction.OPCODE_JUMP, conditionJump));
				
				int conditionalJumpIndex = forConditionalJumpIndexStack.pop();
				int conditionalJump = instructions.size() - conditionalJumpIndex;
				instructions.set(conditionalJumpIndex, new Instruction(Instruction.OPCODE_IF_FALSE, conditionalJump));

				idToVariableOrdinalMap = idToVariableOrdinalMap.getOuter();
				endBreakable();
				
				instructions.add(new Instruction(Instruction.OPCODE_LOAD_NULL));
			}
			
			
			
			private Stack<Integer> forInConditionalJumpIndexStack = new Stack<Integer>();
			private Stack<Integer> forInJumpIndexStack = new Stack<Integer>();
			
			@Override
			public void enterForInStatement(ForInStatementContext ctx) {
				startBreakable();
				idToVariableOrdinalMap = idToVariableOrdinalMap.newInner();

				for(ForInStatementVarContext varCtx: ctx.forInStatementVar())
					idToVariableOrdinalMap.declare(varCtx.ID().getText());
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
				instructions.add(new Instruction(Instruction.OPCODE_SEND, "atEnd", 0));
				// iterator, bool
				int conditionalJumpIndex = instructions.size();
				forInConditionalJumpIndexStack.push(conditionalJumpIndex);
				instructions.add(null);
				// iterator
				
				for(ForInStatementVarContext varCtx: forInStatementCtx.forInStatementVar()) {
					// iterator
					instructions.add(new Instruction(Instruction.OPCODE_DUP));
					// iterator, iterator
					instructions.add(new Instruction(Instruction.OPCODE_SEND, "next", 0));
					// iterator, next
					String id = varCtx.ID().getText();
					int ordinal = idToVariableOrdinalMap.ordinalFor(id);
					instructions.add(new Instruction(Instruction.OPCODE_STORE_LOC, ordinal));
					// iterator
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
				instructions.set(conditionalJumpIndex, new Instruction(Instruction.OPCODE_IF_TRUE, conditionalJump));

				// iterator
				instructions.add(new Instruction(Instruction.OPCODE_POP));
				// 
			}
			
			@Override
			public void exitForInStatement(ForInStatementContext ctx) {
				idToVariableOrdinalMap = idToVariableOrdinalMap.getOuter();
				endBreakable();

				instructions.add(new Instruction(Instruction.OPCODE_LOAD_NULL));
			}
			
			@Override
			public void enterInterfaceId(InterfaceIdContext ctx) {
				idToVariableOrdinalMap = idToVariableOrdinalMap.newInner();
				String interfaceId = ctx.ID().getText();
				instructions.add(new Instruction(Instruction.OPCODE_EXTEND_INTER_ID, interfaceId));
			}
			
			@Override
			public void exitInterfaceId(InterfaceIdContext ctx) {
				instructions.add(new Instruction(Instruction.OPCODE_SHRINK_INTER_ID));
				idToVariableOrdinalMap = idToVariableOrdinalMap.getOuter();
			}
			
			@Override
			public void exitMemberAccess(MemberAccessContext ctx) {
				String id = ctx.messageId().getText();
				instructions.add(new Instruction(Instruction.OPCODE_GET, id, 0));
			}
			
			@Override
			public void exitIndexAccess(IndexAccessContext ctx) {
				instructions.add(new Instruction(Instruction.OPCODE_SEND, "get", 1));
			}
			
			@Override
			public void exitExplicitMessageExchange(ExplicitMessageExchangeContext ctx) {
				int argumentCount = getMessageExchangeArgumentCount(ctx.messageExchange());
				String id = ctx.messageExchange().messageId().getText();
				appendMessageExchange(id, argumentCount);
			}
			
			@Override
			public void enterMemberAssignment(MemberAssignmentContext ctx) {
				// receiver
				switch(ctx.op.getType()) {
				case DuroLexer.ASSIGN:
				case DuroLexer.PROTO_ASSIGN:
					break;
				default:
					String id = ctx.messageId().getText();
					// For computed value +=, -=, ...
					instructions.add(new Instruction(Instruction.OPCODE_DUP)); // Dup receiver
					// receiver, receiver
					instructions.add(new Instruction(Instruction.OPCODE_GET, id, 0));
					// receiver, oldValue
					break;
				}
			}
			
			@Override
			public void exitMemberAssignment(MemberAssignmentContext ctx) {
				String id = ctx.messageId().getText();
				
				switch(ctx.op.getType()) {
				case DuroLexer.ASSIGN:
					// receiver, value
					instructions.add(new Instruction(Instruction.OPCODE_DUP1));
					// value, receiver, value
					instructions.add(new Instruction(Instruction.OPCODE_SET, id, 0));
					// value
					break;
				case DuroLexer.PROTO_ASSIGN:
					// receiver, value
					instructions.add(new Instruction(Instruction.OPCODE_DUP1));
					// value, receiver, value
					instructions.add(new Instruction(Instruction.OPCODE_SET_PROTO, id, 0));
					// value
					break;
				default:
					// receiver, oldValue, newValuePart
					appendAssignmentReducer(ctx.op);
					// receiver, newValue
					instructions.add(new Instruction(Instruction.OPCODE_DUP1));
					// newValue, receiver, newValue
					instructions.add(new Instruction(Instruction.OPCODE_SWAP));
					// newValue, receiver, id, newValue
					instructions.add(new Instruction(Instruction.OPCODE_SET, id, 0));
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
						createBodyListener(walker, idToParameterOrdinalMap, idToVariableOrdinalMap, instructions, yieldStatements), 
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
					instructions.add(new Instruction(Instruction.OPCODE_POP));
					break;
				default:
					// receiver, id, oldValue, newValuePart
					appendAssignmentReducer(ctx.op);
					// receiver, id, newValue
					instructions.add(new Instruction(Instruction.OPCODE_DUP2));
					// newValue, receiver, id, newValue
					instructions.add(new Instruction(Instruction.OPCODE_SEND, "set", 2));
					instructions.add(new Instruction(Instruction.OPCODE_POP));
					// newValue
					break;
				}
			}
			
			private Stack<Integer> programElementCountStack = new Stack<Integer>();
			private Stack<Integer> programElementIndexStack = new Stack<Integer>();
			
			@Override
			public void enterProgramElements(ProgramElementsContext ctx) {
				programElementCountStack.push(null);
				programElementIndexStack.push(null);
			}
			
			public void exitProgramElements(ProgramElementsContext ctx) {
				programElementCountStack.pop();
				programElementIndexStack.pop();
			}
			
			@Override
			public void enterProgramElementContent(ProgramElementContentContext ctx) {
				programElementCountStack.push(null);
				programElementIndexStack.push(null);
			}
			
			@Override
			public void exitProgramElementContent(ProgramElementContentContext ctx) {
				programElementCountStack.pop();
				programElementIndexStack.pop();
			}
			
			@Override
			public void enterBehaviorElements(BehaviorElementsContext ctx) {
				programElementCountStack.push(ctx.behaviorElement().size());
				programElementIndexStack.push(0);
			}
			
			@Override
			public void exitBehaviorElement(BehaviorElementContext ctx) {
				programElementIndexStack.set(programElementIndexStack.size() - 1, programElementIndexStack.peek() + 1);
			}
			
			@Override
			public void exitBehaviorElements(BehaviorElementsContext ctx) {
				programElementCountStack.pop();
				programElementIndexStack.pop();
			}
			
			@Override
			public void enterBehaviorElementsSingle(BehaviorElementsSingleContext ctx) {
				programElementCountStack.push(1);
				programElementIndexStack.push(0);
			}
			
			@Override
			public void exitBehaviorElementsSingle(BehaviorElementsSingleContext ctx) {
				programElementCountStack.pop();
				programElementIndexStack.pop();
			}
			
			@Override
			public void exitTopExpression(TopExpressionContext ctx) {
				if(programElementCountStack.size() > 0) {
					// Is within behavior elements
					Integer programElementCount = programElementCountStack.peek();
					Integer programElementIndex = programElementIndexStack.peek();
					
					if(programElementCount != null && programElementIndex != null) {
						if(programElementIndex + 1 < programElementCount)
							instructions.add(new Instruction(Instruction.OPCODE_POP));
					} else {
						// Always pop
						instructions.add(new Instruction(Instruction.OPCODE_POP));
					}
				} else {
					// Is at root
					instructions.add(new Instruction(Instruction.OPCODE_POP));
				}
			}
		};
	}
	
	private static String extractStringLiteral(String rawString) {
		return rawString.substring(1, rawString.length() - 1)
			.replace("\\n", "\n")
			.replace("\\r", "\r")
			.replace("\\t", "\t");
	}
	
	private BodyInfo getBodyInfo(
			OrdinalAllocator idToParameterOrdinalMap, OrdinalAllocator idToVariableOrdinalMap, ParseTree tree) {
		ArrayList<Instruction> instructions = new ArrayList<Instruction>();
		ArrayList<YieldStatementContext> yieldStatements = new ArrayList<YieldStatementContext>();
		
		ConditionalTreeWalker walker = new ConditionalTreeWalker();
		walker.walk(
			createBodyListener(walker, idToParameterOrdinalMap, idToVariableOrdinalMap, instructions, yieldStatements), 
			tree
		);
		
		int variableCount = idToVariableOrdinalMap.size();
		
		if(yieldStatements.size() > 0) {
			// Generatable/generator
			// Function returns iterables
			
			int distinctYieldCount = (int)yieldStatements.stream().map(i -> i.yieldStatementExpression().size()).distinct().count();
			if(distinctYieldCount > 1)
				throw new RuntimeException("Multiple distinct yield counts.");
			
			ArrayList<Instruction> iteratorInstructions = instructions;
			ArrayList<Instruction> generatorInstructions = new ArrayList<Instruction>();
			
			int argumentOffset = idToParameterOrdinalMap.ordinalFor("generator");
			int parameterCount = idToParameterOrdinalMap.size();
			int closureParameterCount = 1;

			Instruction[] bodyInstructions = iteratorInstructions.toArray(new Instruction[iteratorInstructions.size()]);

			generatorInstructions.add(new Instruction(Instruction.OPCODE_LOAD_THIS, 1));
			// This
			generatorInstructions.add(new Instruction(Instruction.OPCODE_GET, "Generatable", 0));
			// Generatable
			generatorInstructions.add(new Instruction(Instruction.OPCODE_SP_NEW_BEHAVIOR, parameterCount, variableCount, bodyInstructions));
			// Generatable, Behavior
			generatorInstructions.add(new Instruction(Instruction.OPCODE_SP_NEW_CLOSURE, argumentOffset, closureParameterCount));
			// Generatable, Closure
			generatorInstructions.add(new Instruction(Instruction.OPCODE_SEND, "on", 1));
			// a generatable
			generatorInstructions.add(new Instruction(Instruction.OPCODE_RET));
			
			return new BodyInfo(variableCount, generatorInstructions);
		} else
			return new BodyInfo(variableCount, instructions);
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
