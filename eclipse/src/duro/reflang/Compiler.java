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
import duro.reflang.antlr4.DuroParser.FunctionBodyContext;
import duro.reflang.antlr4.DuroParser.FunctionDefinitionContext;
import duro.reflang.antlr4.DuroParser.IntegerContext;
import duro.reflang.antlr4.DuroParser.LookupContext;
import duro.reflang.antlr4.DuroParser.PauseContext;
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

//		final Hashtable<String, Integer> idToOrdinalMap = new Hashtable<String, Integer>();
//		final ArrayList<Instruction> instructions = new ArrayList<Instruction>();
//		
//		final ConditionalTreeWalker walker = new ConditionalTreeWalker();
//		
//		walker.walk(new DuroBaseListener() {
//			@Override
//			public void exitVariableAssignment(VariableAssignmentContext ctx) {
//				String id = ctx.ID().getText();
//				int ordinal = idToOrdinalMap.get(id);
//
//				instructions.add(new Instruction(Instruction.OPCODE_DUP));
//				instructions.add(new Instruction(Instruction.OPCODE_STORE, ordinal));
//			}
//			
//			@Override
//			public void enterLookup(LookupContext ctx) {
//				String id = ctx.ID().getText();
//				int ordinal = idToOrdinalMap.get(id);
//				
//				instructions.add(new Instruction(Instruction.OPCODE_LOAD_LOC, ordinal));
//			}
//			
//			@Override
//			public void exitThisMessageExchange(ThisMessageExchangeContext ctx) {
//				String id = ctx.messageExchange().ID().getText();
//				int symbolCode = SymbolTable.getSymbolCodeFromId(id);
//				int argumentCount = ctx.messageExchange().expression().size();
//
//				instructions.add(new Instruction(Instruction.OPCODE_LOAD_THIS));
//				instructions.add(new Instruction(Instruction.OPCODE_CALL, symbolCode, argumentCount));
//			}
//			
//			@Override
//			public void enterInteger(IntegerContext ctx) {
//				int value = Integer.parseInt(ctx.INT().getText());
//				instructions.add(new Instruction(Instruction.OPCODE_LOAD_INT, value));
//			}
//			
//			@Override
//			public void enterPause(PauseContext ctx) {
//				instructions.add(new Instruction(Instruction.OPCODE_PAUSE));
//			}
//			
//			@Override
//			public void exitVariableDeclarationAndAssignment(VariableDeclarationAndAssignmentContext ctx) {
//				int ordinal = declareVariable(ctx.ID());
//				
//				instructions.add(new Instruction(Instruction.OPCODE_STORE, ordinal));
//			}
//			
//			@Override
//			public void enterVariableDeclaration(VariableDeclarationContext ctx) {
//				declareVariable(ctx.ID());
//			}
//			
//			@Override
//			public void enterFunction(FunctionContext ctx) {
//				insideFunction = true;
//				// TODO Auto-generated method stub
//				super.enterFunction(ctx);
//			}
//			
//			@Override
//			public void exitTopExpression(TopExpressionContext ctx) {
//				instructions.add(new Instruction(Instruction.OPCODE_POP));
//			}
//			
//			private int declareVariable(TerminalNode idNode) {
//				String id = idNode.getText();
//				Integer ordinal = idToOrdinalMap.get(id);
//				
//				if(ordinal == null) {
//					ordinal = idToOrdinalMap.size();
//					idToOrdinalMap.put(id, ordinal);
//				}
//				
//				return ordinal;
//			}
//		}, programCtx);
		
		
		BodyInfo bodyInfo = getBodyInfo(programCtx);
		
//		// Add finish instruction to the end
//		bodyInfo.instructions.add(new Instruction(Instruction.OPCODE_FINISH));
		
		return new CustomProcess(bodyInfo.idToOrdinalMap.size(), bodyInfo.instructions.toArray(new Instruction[bodyInfo.instructions.size()]));
	}
	
	private static class ConditionalTreeWalker extends ParseTreeWalker {
		private boolean suspendWalk;
		
		@Override
		protected void enterRule(ParseTreeListener listener, RuleNode r) {
			if(!suspendWalk)
				super.enterRule(listener, r);
		}
		
		@Override
		protected void exitRule(ParseTreeListener listener, RuleNode r) {
			if(!suspendWalk)
				super.exitRule(listener, r);
		}
		
		public void suspendWalk() {
			suspendWalk = true;
		}
		
		public void resumeWalk() {
			suspendWalk = false;
		}
	}
	
	private static DuroListener createBodyListener(final ConditionalTreeWalker walker, final Hashtable<String, Integer> idToOrdinalMap, final ArrayList<Instruction> instructions) {
		return new DuroBaseListener() {
			@Override
			public void exitProgram(ProgramContext ctx) {
				// Add finish instruction to the end
				instructions.add(new Instruction(Instruction.OPCODE_FINISH));
			}
			
			@Override
			public void exitBinaryExpression(BinaryExpressionContext ctx) {
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
				int ordinal = idToOrdinalMap.get(id);

				instructions.add(new Instruction(Instruction.OPCODE_DUP));
				instructions.add(new Instruction(Instruction.OPCODE_STORE, ordinal));
			}
			
			@Override
			public void enterLookup(LookupContext ctx) {
				String id = ctx.ID().getText();
				int ordinal = idToOrdinalMap.get(id);
				
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
				walker.suspendWalk();
			}
			
			@Override
			public void exitFunctionDefinition(FunctionDefinitionContext ctx) {
				int parameterCount = ctx.functionParameters().getChildCount();
				BodyInfo functionBodyInfo = getBodyInfo(ctx.functionBody());

				CallFrameInfo callFrameInfo = new CallFrameInfo(
					parameterCount, functionBodyInfo.idToOrdinalMap.size(), functionBodyInfo.instructions.toArray(new Instruction[functionBodyInfo.instructions.size()]));
//				instructions.add(new Instruction(Instruction.OPCODE_LOAD_FUNCTION, callFrameInfo));
//				instructions.add(new Instruction(Instruction.OPCODE_LOAD_DEFINE));
				
				walker.resumeWalk();
			}
			
			@Override
			public void exitFunctionBody(FunctionBodyContext ctx) {
				if(instructions.get(instructions.size() - 1).opcode != Instruction.OPCODE_RET) {
					instructions.add(new Instruction(Instruction.OPCODE_LOAD_NULL));
					instructions.add(new Instruction(Instruction.OPCODE_RET));
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
				Integer ordinal = idToOrdinalMap.get(id);
				
				if(ordinal == null) {
					ordinal = idToOrdinalMap.size();
					idToOrdinalMap.put(id, ordinal);
				}
				
				return ordinal;
			}
		};
	}
	
	private static BodyInfo getBodyInfo(ParseTree tree) {
		Hashtable<String, Integer> idToOrdinalMap = new Hashtable<String, Integer>();
		ArrayList<Instruction> instructions = new ArrayList<Instruction>();
		
		ConditionalTreeWalker walker = new ConditionalTreeWalker();
		walker.walk(createBodyListener(walker, idToOrdinalMap, instructions), tree);
		
		instructions.add(new Instruction(Instruction.OPCODE_FINISH));
		
		return new BodyInfo(idToOrdinalMap, instructions);
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
