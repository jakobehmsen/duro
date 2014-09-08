package duro.reflang;

import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Hashtable;
import java.util.Stack;

import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CommonTokenStream;
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
import duro.reflang.antlr4.DuroParser.BinaryExpressionArithmetic1ApplicationContext;
import duro.reflang.antlr4.DuroParser.BinaryExpressionArithmetic2ApplicationContext;
import duro.reflang.antlr4.DuroParser.BinaryExpressionLogicalAndApplicationContext;
import duro.reflang.antlr4.DuroParser.BinaryExpressionLogicalOrApplicationContext;
import duro.reflang.antlr4.DuroParser.BinaryExpressionLogicalOrContext;
import duro.reflang.antlr4.DuroParser.BoolContext;
import duro.reflang.antlr4.DuroParser.ElseStatementContext;
import duro.reflang.antlr4.DuroParser.FunctionBodyContext;
import duro.reflang.antlr4.DuroParser.FunctionDefinitionContext;
import duro.reflang.antlr4.DuroParser.IfStatementConditionContext;
import duro.reflang.antlr4.DuroParser.IfStatementOnTrueContext;
import duro.reflang.antlr4.DuroParser.IntegerContext;
import duro.reflang.antlr4.DuroParser.LookupContext;
import duro.reflang.antlr4.DuroParser.PauseContext;
import duro.reflang.antlr4.DuroParser.PrimitiveBodyContext;
import duro.reflang.antlr4.DuroParser.PrimitiveCallContext;
import duro.reflang.antlr4.DuroParser.ProgramContext;
import duro.reflang.antlr4.DuroParser.PropertyGetContext;
import duro.reflang.antlr4.DuroParser.PropertySetContext;
import duro.reflang.antlr4.DuroParser.ReturnStatementContext;
import duro.reflang.antlr4.DuroParser.SelfContext;
import duro.reflang.antlr4.DuroParser.StringContext;
import duro.reflang.antlr4.DuroParser.ThisMessageExchangeContext;
import duro.reflang.antlr4.DuroParser.TopExpressionContext;
import duro.reflang.antlr4.DuroParser.VariableAssignmentContext;
import duro.reflang.antlr4.DuroParser.VariableDeclarationAndAssignmentContext;
import duro.reflang.antlr4.DuroParser.VariableDeclarationContext;
import duro.reflang.antlr4.DuroParser.WhileStatementBodyContext;
import duro.reflang.antlr4.DuroParser.WhileStatementConditionContext;
import duro.reflang.antlr4.DuroParser.WhileStatementContext;
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
		
		return new CustomProcess(bodyInfo.idToOrdinalMap.size(), bodyInfo.instructions.toArray(new Instruction[bodyInfo.instructions.size()]));
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
			final ConditionalTreeWalker walker, final Hashtable<String, Integer> idToParameterOrdinalMap, final Hashtable<String, Integer> idToVariableOrdinalMap, final ArrayList<Instruction> instructions) {
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
				
				int conditionalJumpIndex = instructions.size();
				instructions.add(null);
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
					int conditionalJump = orEndIndex - (orConditionalJumpIndex + 1);
					instructions.set(orConditionalJumpIndex, new Instruction(Instruction.OPCODE_DUP));
					instructions.set(orConditionalJumpIndex + 1, new Instruction(Instruction.OPCODE_IF_TRUE, conditionalJump));
				}
			}
			
			@Override
			public void exitBinaryExpressionLogicalAndApplication(BinaryExpressionLogicalAndApplicationContext ctx) {
				instructions.add(new Instruction(Instruction.OPCODE_SP_AND));
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
				default:
					binaryOpCode = -1;
					break;
				}
				
				instructions.add(new Instruction(binaryOpCode));
			}
			
			@Override
			public void exitVariableAssignment(VariableAssignmentContext ctx) {
				String id = ctx.ID().getText();
				int ordinal = idToVariableOrdinalMap.get(id);

				instructions.add(new Instruction(Instruction.OPCODE_DUP));
				instructions.add(new Instruction(Instruction.OPCODE_STORE, ordinal));
			}
			
			@Override
			public void enterLookup(LookupContext ctx) {
				String id = ctx.ID().getText();
				
				Integer parameterOrdinal = idToParameterOrdinalMap.get(id);
				if(parameterOrdinal != null) {
					instructions.add(new Instruction(Instruction.OPCODE_LOAD_ARG, parameterOrdinal));
					
					return;
				}
				
				int ordinal = idToVariableOrdinalMap.get(id);
				instructions.add(new Instruction(Instruction.OPCODE_LOAD_LOC, ordinal));
			}
			
			@Override
			public void enterThisMessageExchange(ThisMessageExchangeContext ctx) {
				instructions.add(new Instruction(Instruction.OPCODE_LOAD_THIS));
			}
			
			@Override
			public void exitThisMessageExchange(ThisMessageExchangeContext ctx) {
				int argumentCount = ctx.messageExchange().expression().size();
				appendMessageExchange(ctx.messageExchange().ID(), argumentCount);
			}
			
			private void appendMessageExchange(TerminalNode node, int argumentCount) {
				String id = node.getText();
//				int symbolCode = SymbolTable.getSymbolCodeFromId(id);
				
				instructions.add(new Instruction(Instruction.OPCODE_CALL, id, argumentCount));
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
				String string = rawString.substring(1, rawString.length() - 1)
					.replace("\\n", "\n")
					.replace("\\r", "\r")
					.replace("\\t", "\t");
				
				instructions.add(new Instruction(Instruction.OPCODE_LOAD_STRING, string));
			}
			
			@Override
			public void enterSelf(SelfContext ctx) {
				instructions.add(new Instruction(Instruction.OPCODE_LOAD_THIS));
			}
			
			@Override
			public void enterPause(PauseContext ctx) {
				instructions.add(new Instruction(Instruction.OPCODE_PAUSE));
			}
			
			@Override
			public void exitVariableDeclarationAndAssignment(VariableDeclarationAndAssignmentContext ctx) {
				int ordinal = declareVariable(ctx.ID());
				
				instructions.add(new Instruction(Instruction.OPCODE_STORE, ordinal));
			}
			
			@Override
			public void enterVariableDeclaration(VariableDeclarationContext ctx) {
				declareVariable(ctx.ID());
			}
			
			@Override
			public void exitReturnStatement(ReturnStatementContext ctx) {
				instructions.add(new Instruction(Instruction.OPCODE_RET));
			}
			
			@Override
			public void enterFunctionDefinition(FunctionDefinitionContext ctx) {
				walker.suspendWalkWithin(ctx);
			}
			
			@Override
			public void exitFunctionDefinition(FunctionDefinitionContext ctx) {
				int parameterCount = ctx.functionParameters().getChildCount();
				Hashtable<String, Integer> idToParameterOrdinalMap = new Hashtable<String, Integer>();
				for(int i = 0; i < parameterCount; i++) {
					String parameterId = ctx.functionParameters().getChild(i).getText();
					idToParameterOrdinalMap.put(parameterId, i);
				}
				BodyInfo functionBodyInfo = getBodyInfo(idToParameterOrdinalMap, ctx.functionBody());
				String id = ctx.ID().getText();
//				int symbolCode = SymbolTable.getSymbolCodeFromId(id);

				CallFrameInfo callFrameInfo = new CallFrameInfo(
					parameterCount, functionBodyInfo.idToOrdinalMap.size(), functionBodyInfo.instructions.toArray(new Instruction[functionBodyInfo.instructions.size()]));
				instructions.add(new Instruction(Instruction.OPCODE_LOAD_THIS));
				instructions.add(new Instruction(Instruction.OPCODE_LOAD_FUNC, callFrameInfo));
				instructions.add(new Instruction(Instruction.OPCODE_DEF, id));
			}
			
			@Override
			public void exitFunctionBody(FunctionBodyContext ctx) {
				if(instructions.get(instructions.size() - 1).opcode != Instruction.OPCODE_RET) {
					instructions.add(new Instruction(Instruction.OPCODE_LOAD_NULL));
					instructions.add(new Instruction(Instruction.OPCODE_RET));
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
			}
			
			@Override
			public void exitPropertySet(PropertySetContext ctx) {
				instructions.add(new Instruction(Instruction.OPCODE_SET));
			}
			
			@Override
			public void exitPropertyGet(PropertyGetContext ctx) {
				instructions.add(new Instruction(Instruction.OPCODE_GET));
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
	
	private static BodyInfo getBodyInfo(Hashtable<String, Integer> idToParameterOrdinalMap, ParseTree tree) {
		Hashtable<String, Integer> idToOrdinalMap = new Hashtable<String, Integer>();
		ArrayList<Instruction> instructions = new ArrayList<Instruction>();
		
		ConditionalTreeWalker walker = new ConditionalTreeWalker();
		walker.walk(createBodyListener(walker, idToParameterOrdinalMap, idToOrdinalMap, instructions), tree);
		
		return new BodyInfo(idToOrdinalMap, instructions);
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
	}
	
	private static Object getLiteral(ParseTree tree) {
		ParseTreeWalker walker = new ParseTreeWalker();
		LiteralDuroListener listener = new LiteralDuroListener();
		walker.walk(listener, tree);
		
		return listener.getLiteral();
	}
	
	private static class BodyInfo {
		private final Hashtable<String, Integer> idToOrdinalMap;
		private final ArrayList<Instruction> instructions;
		
		public BodyInfo(Hashtable<String, Integer> idToOrdinalMap, ArrayList<Instruction> instructions) {
			this.idToOrdinalMap = idToOrdinalMap;
			this.instructions = instructions;
		} 
	}
}
