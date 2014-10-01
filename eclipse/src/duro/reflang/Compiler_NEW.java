package duro.reflang;

import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.function.Supplier;

import org.antlr.v4.runtime.ANTLRErrorListener;
import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.Parser;
import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.RecognitionException;
import org.antlr.v4.runtime.Recognizer;
import org.antlr.v4.runtime.atn.ATNConfigSet;
import org.antlr.v4.runtime.atn.PredictionMode;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.ParseTreeListener;
import org.antlr.v4.runtime.tree.ParseTreeWalker;
import org.antlr.v4.runtime.tree.RuleNode;

import duro.debugging.Debug;
import duro.reflang.antlr4_2.DuroBaseListener;
import duro.reflang.antlr4_2.DuroLexer;
import duro.reflang.antlr4_2.DuroListener;
import duro.reflang.antlr4_2.DuroParser;
import duro.reflang.antlr4_2.DuroParser.ProgramContext;
import duro.runtime.CustomProcess;
import duro.runtime.Instruction;

public class Compiler_NEW {
	private MessageCollector errors = new MessageCollector();
	private ArrayList<Runnable> endHandlers = new ArrayList<Runnable>();
	
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
		
		long startParse = System.currentTimeMillis();
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
		
		Debug.println(Debug.LEVEL_MEDIUM, "Parsed program.");
		long endParse = System.currentTimeMillis();
		Debug.println(Debug.LEVEL_MEDIUM, "Parse time: " + (endParse - startParse));

		long startGen = System.currentTimeMillis();
		OrdinalAllocator idToParameterOrdinalMap = new OrdinalAllocator();
		OrdinalAllocator idToVariableOrdinalMap = new OrdinalAllocator();
		Debug.println(Debug.LEVEL_MEDIUM, "Generating program...");
		BodyInfo bodyInfo = getBodyInfo(idToParameterOrdinalMap, idToVariableOrdinalMap, programCtx);
		idToParameterOrdinalMap.generate();
		idToVariableOrdinalMap.generate();
		for(Runnable handler: endHandlers)
			handler.run();
		Debug.println(Debug.LEVEL_MEDIUM, "Generated program.");
		long endGen = System.currentTimeMillis();
		Debug.println(Debug.LEVEL_MEDIUM, "Generate time: " + (endGen - startGen));
		
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
			final ConditionalTreeWalker walker, OrdinalAllocator idToParameterOrdinalMap, OrdinalAllocator idToVariableOrdinalMap, 
			final ArrayList<Instruction> instructions) {
		return new DuroBaseListener() {
		};
	}
	
	private void onEnd(ArrayList<Instruction> instructions, Supplier<Instruction> instructionSup) {
		int index = instructions.size();
		instructions.add(null);
		endHandlers.add(() -> {
			Instruction instruction = instructionSup.get();
			instructions.set(index, instruction);
		});
	}
	
	private static String extractStringLiteral(String rawString) {
		return rawString.substring(1, rawString.length() - 1)
			.replace("\\n", "\n")
			.replace("\\r", "\r")
			.replace("\\t", "\t");
	}
	
	private BodyInfo getBodyInfo(OrdinalAllocator idToParameterOrdinalMap, OrdinalAllocator idToVariableOrdinalMap, ParseTree tree) {
		ArrayList<Instruction> instructions = new ArrayList<Instruction>();
		
		ConditionalTreeWalker walker = new ConditionalTreeWalker();
		walker.walk(
			createBodyListener(walker, idToParameterOrdinalMap, idToVariableOrdinalMap, instructions), 
			tree
		);
		
		int variableCount = idToVariableOrdinalMap.size();

		return new BodyInfo(variableCount, instructions);
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
