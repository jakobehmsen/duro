package duro.reflang;

import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Hashtable;

import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.tree.ParseTreeWalker;
import org.antlr.v4.runtime.tree.TerminalNode;

import duro.reflang.antlr4.DuroBaseListener;
import duro.reflang.antlr4.DuroLexer;
import duro.reflang.antlr4.DuroParser;
import duro.reflang.antlr4.DuroParser.IntegerContext;
import duro.reflang.antlr4.DuroParser.PauseContext;
import duro.reflang.antlr4.DuroParser.ProgramContext;
import duro.reflang.antlr4.DuroParser.TopExpressionContext;
import duro.reflang.antlr4.DuroParser.VariableAssignmentContext;
import duro.reflang.antlr4.DuroParser.VariableDeclarationAndAssignmentContext;
import duro.reflang.antlr4.DuroParser.VariableDeclarationContext;
import duro.runtime.CustomProcess;
import duro.runtime.Instruction;

public class Compiler {
	public static duro.runtime.Process compile(InputStream sourceCode) throws IOException {
		CharStream charStream = new ANTLRInputStream(sourceCode);
		DuroLexer lexer = new DuroLexer(charStream);
		TokenStream tokenStream = new CommonTokenStream(lexer);
		DuroParser parser = new DuroParser(tokenStream);
		
		ProgramContext programCtx = parser.program();

		final Hashtable<String, Integer> idToIndexMap = new Hashtable<String, Integer>();
		final ArrayList<Instruction> instructions = new ArrayList<Instruction>();
		
		ParseTreeWalker walker = new ParseTreeWalker();
		
		walker.walk(new DuroBaseListener() {
			@Override
			public void enterInteger(IntegerContext ctx) {
				int value = Integer.parseInt(ctx.INT().getText());
				instructions.add(new Instruction(Instruction.OPCODE_LOAD_INT, value));
			}
			
			@Override
			public void exitVariableDeclarationAndAssignment(VariableDeclarationAndAssignmentContext ctx) {
				int index = declareVariable(ctx.ID());
				
				instructions.add(new Instruction(Instruction.OPCODE_STORE, index));
			}
			
			@Override
			public void exitVariableAssignment(VariableAssignmentContext ctx) {
				String id = ctx.ID().getText();
				int index = idToIndexMap.get(id);

				instructions.add(new Instruction(Instruction.OPCODE_DUP));
				instructions.add(new Instruction(Instruction.OPCODE_STORE, index));
			}
			
			@Override
			public void exitVariableDeclaration(VariableDeclarationContext ctx) {
				declareVariable(ctx.ID());
			}
			
			@Override
			public void enterPause(PauseContext ctx) {
				instructions.add(new Instruction(Instruction.OPCODE_PAUSE));
			}
			
			@Override
			public void exitTopExpression(TopExpressionContext ctx) {
				instructions.add(new Instruction(Instruction.OPCODE_POP));
			}
			
			private int declareVariable(TerminalNode idNode) {
				String id = idNode.getText();
				Integer index = idToIndexMap.get(id);
				
				if(index == null) {
					index = idToIndexMap.size();
					idToIndexMap.put(id, index);
				}
				
				return index;
			}
		}, programCtx);
		
		// Add finish instruction to the end
		instructions.add(new Instruction(Instruction.OPCODE_FINISH));
		
		return new CustomProcess(idToIndexMap.size(), instructions.toArray(new Instruction[instructions.size()]));
	}
}
