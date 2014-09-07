package duro.reflang;

import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Hashtable;

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
import duro.reflang.antlr4.DuroParser.BinaryExpressionContext;
import duro.reflang.antlr4.DuroParser.BoolContext;
import duro.reflang.antlr4.DuroParser.FunctionBodyContext;
import duro.reflang.antlr4.DuroParser.FunctionDefinitionContext;
import duro.reflang.antlr4.DuroParser.IntegerContext;
import duro.reflang.antlr4.DuroParser.LookupContext;
import duro.reflang.antlr4.DuroParser.PauseContext;
import duro.reflang.antlr4.DuroParser.PrimitiveBodyContext;
import duro.reflang.antlr4.DuroParser.PrimitiveCallContext;
import duro.reflang.antlr4.DuroParser.ProgramContext;
import duro.reflang.antlr4.DuroParser.ReturnStatementContext;
import duro.reflang.antlr4.DuroParser.ThisMessageExchangeContext;
import duro.reflang.antlr4.DuroParser.TopExpressionContext;
import duro.reflang.antlr4.DuroParser.VariableAssignmentContext;
import duro.reflang.antlr4.DuroParser.VariableDeclarationAndAssignmentContext;
import duro.reflang.antlr4.DuroParser.VariableDeclarationContext;
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
			
			@Override
			public void exitBinaryExpression(BinaryExpressionContext ctx) {
				// Should this be translated into a message exchange?
//				appendMessageExchange(ctx.BIN_OP(), 1);

				int binaryOpCode;
				
				switch(ctx.BIN_OP().getText()) {
				case "+":
					binaryOpCode = Instruction.OPCODE_SP_ADD;
					break;
				case "-":
					binaryOpCode = Instruction.OPCODE_SP_SUB;
					break;
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
				int symbolCode = SymbolTable.getSymbolCodeFromId(id);
				
				instructions.add(new Instruction(Instruction.OPCODE_CALL, symbolCode, argumentCount));
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
				int symbolCode = SymbolTable.getSymbolCodeFromId(id);

				CallFrameInfo callFrameInfo = new CallFrameInfo(
					parameterCount, functionBodyInfo.idToOrdinalMap.size(), functionBodyInfo.instructions.toArray(new Instruction[functionBodyInfo.instructions.size()]));
				instructions.add(new Instruction(Instruction.OPCODE_LOAD_THIS));
				instructions.add(new Instruction(Instruction.OPCODE_LOAD_FUNC, callFrameInfo));
				instructions.add(new Instruction(Instruction.OPCODE_DEF, symbolCode));
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
			
			@Override
			public void exitTopExpression(TopExpressionContext ctx) {
				instructions.add(new Instruction(Instruction.OPCODE_POP));
			}
			
			@Override
			public void exitReturnStatement(ReturnStatementContext ctx) {
				instructions.add(new Instruction(Instruction.OPCODE_RET));
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
