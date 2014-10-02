package duro.reflang;

import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Hashtable;
import java.util.Stack;
import java.util.function.Consumer;
import java.util.function.Supplier;
import java.util.stream.Collectors;

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
import org.antlr.v4.runtime.tree.TerminalNode;

import duro.debugging.Debug;
import duro.reflang.antlr4_2.DuroBaseListener;
import duro.reflang.antlr4_2.DuroLexer;
import duro.reflang.antlr4_2.DuroListener;
import duro.reflang.antlr4_2.DuroParser;
import duro.reflang.antlr4_2.DuroParser.AssignmentContext;
import duro.reflang.antlr4_2.DuroParser.BinaryMessageContext;
import duro.reflang.antlr4_2.DuroParser.BinaryOperatorContext;
import duro.reflang.antlr4_2.DuroParser.IdContext;
import duro.reflang.antlr4_2.DuroParser.IntegerContext;
import duro.reflang.antlr4_2.DuroParser.MultiArgMessageArgContext;
import duro.reflang.antlr4_2.DuroParser.MultiArgMessageContext;
import duro.reflang.antlr4_2.DuroParser.ProgramContext;
import duro.reflang.antlr4_2.DuroParser.RootExpressionContext;
import duro.reflang.antlr4_2.DuroParser.StringContext;
import duro.runtime.CustomProcess;
import duro.runtime.Instruction;
import duro.runtime.Selector;

public class Compiler_NEW {
	private Hashtable<Selector, PrimitiveGeneratorFactory> primitiveMap = new Hashtable<Selector, PrimitiveGeneratorFactory>();
	private MessageCollector errors = new MessageCollector();
	private ArrayList<Runnable> endHandlers = new ArrayList<Runnable>();
	
	public Compiler_NEW() {
		primitiveMap.put(Selector.get("write", 1), new PrimitiveGeneratorFactory.ConstInstruction(new Instruction(Instruction.OPCODE_SP_WRITE), false));
	}
	
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
	
	private DuroListener createBodyListener(
			final ConditionalTreeWalker walker, OrdinalAllocator idToParameterOrdinalMap, OrdinalAllocator idToVariableOrdinalMap, 
			final ArrayList<Instruction> instructions) {
		return new DuroBaseListener() {
			@Override
			public void exitProgram(ProgramContext ctx) {
				instructions.add(new Instruction(Instruction.OPCODE_FINISH));
			}
			
			@Override
			public void exitRootExpression(RootExpressionContext ctx) {
				instructions.add(new Instruction(Instruction.OPCODE_POP));
			}
			
			@Override
			public void enterAssignment(AssignmentContext ctx) {
				String id = ctx.id().getText();
				
				if(ctx.op.getType() == DuroLexer.ASSIGN && idToVariableOrdinalMap.isDeclared(id))
					return;

				// Member assignment for this
				if(ctx.op.getType() == DuroLexer.ASSIGN_QUOTED) {
					walker.suspendWalkWithin(ctx); // Rhs is quoted
					
					OrdinalAllocator newIdToParameterOrdinalMap = new OrdinalAllocator();
					OrdinalAllocator newIdToVariableOrdinalMap = new OrdinalAllocator();
					for(IdContext parameterIdNode: ctx.behaviorParams().id()) {
						String parameterId = parameterIdNode.getText();
						newIdToParameterOrdinalMap.declare(parameterId);
					}
					BodyInfo functionBodyInfo = getBodyInfo(newIdToParameterOrdinalMap, newIdToVariableOrdinalMap, ctx.expression());
					int parameterCount = newIdToParameterOrdinalMap.size();
					int selectorParameterCount = newIdToParameterOrdinalMap.sizeExceptEnd();
					
					newIdToParameterOrdinalMap.generate();
					newIdToVariableOrdinalMap.generate();

					instructions.add(new Instruction(Instruction.OPCODE_LOAD_THIS));
					onEnd(() -> {
						Instruction[] bodyInstructions = functionBodyInfo.instructions.toArray(new Instruction[functionBodyInfo.instructions.size()]);
						return new Instruction(Instruction.OPCODE_SP_NEW_BEHAVIOR, parameterCount, functionBodyInfo.localCount, bodyInstructions);
					});
					instructions.add(new Instruction(Instruction.OPCODE_DUP1));
					instructions.add(new Instruction(Instruction.OPCODE_SET, id, selectorParameterCount));
				}
			}
			
			@Override
			public void exitAssignment(AssignmentContext ctx) {
				String id = ctx.id().getText();
				
				// newValue
				
				switch(ctx.op.getType()) {
				case DuroLexer.ASSIGN: {
					instructions.add(new Instruction(Instruction.OPCODE_DUP));
					// newValue, newValue
					if(idToVariableOrdinalMap.isDeclared(id)) {
						// Variable assignment
						idToVariableOrdinalMap.ordinalFor(id, instructions, firstOrdinal -> new Instruction(Instruction.OPCODE_STORE_LOC, firstOrdinal));
					} else {
						instructions.add(new Instruction(Instruction.OPCODE_LOAD_THIS));
						// newValue, newValue, receiver
						instructions.add(new Instruction(Instruction.OPCODE_SWAP));
						// newValue, receiver, newValue
						instructions.add(new Instruction(Instruction.OPCODE_SET, id, 0));
					}
					break;
				} case DuroLexer.ASSIGN_PROTO: {
					instructions.add(new Instruction(Instruction.OPCODE_DUP));
					// newValue, newValue
					instructions.add(new Instruction(Instruction.OPCODE_LOAD_THIS));
					// newValue, newValue, receiver
					instructions.add(new Instruction(Instruction.OPCODE_SWAP));
					// newValue, receiver, newValue
					instructions.add(new Instruction(Instruction.OPCODE_SET_PROTO, id, 0));
					break;
				}
				}
				
				// newValue
			}
			
			@Override
			public void exitBinaryMessage(BinaryMessageContext ctx) {
				String id = ctx.BIN_OP().getText();
				instructions.add(new Instruction(Instruction.OPCODE_SEND, id, 1));
			}
			
			private Stack<PrimitiveGenerator> primitiveGeneratorStack = new Stack<PrimitiveGenerator>();
			
			@Override
			public void enterMultiArgMessage(MultiArgMessageContext ctx) {
				String id = ctx.ID_UNCAP().getText() + ctx.ID_CAP().stream().map(x -> x.getText()).collect(Collectors.joining());
				int parameterCount = ctx.multiArgMessageArgs().size();
				PrimitiveGeneratorFactory primitiveGeneratorFactory = primitiveMap.get(Selector.get(id, parameterCount));
				
				if(primitiveGeneratorFactory != null) {
					PrimitiveGenerator primitiveGenerator = primitiveGeneratorFactory.create(ctx);
					primitiveGenerator.enterPrimitive(instructions);
					primitiveGeneratorStack.push(primitiveGenerator);
				} else
					primitiveGeneratorStack.push(null);
			}
			
			@Override
			public void exitMultiArgMessage(MultiArgMessageContext ctx) {
				PrimitiveGenerator primitiveGenerator = primitiveGeneratorStack.pop();
				
				if(primitiveGenerator != null)
					primitiveGenerator.exitPrimitive(instructions);
			}
			
			@Override
			public void enterInteger(IntegerContext ctx) {
				int value = Integer.parseInt(ctx.INT().getText());
				instructions.add(new Instruction(Instruction.OPCODE_LOAD_INT, value));
			}
			
			@Override
			public void enterString(StringContext ctx) {
				String rawString = ctx.getText();
				// Should the string enter properly prepared?
				// - i.e., no need for filtering the string.
				String string = extractStringLiteral(rawString);
				
				instructions.add(new Instruction(Instruction.OPCODE_LOAD_STRING, string));
			}
			
			private void onEnd(Supplier<Instruction> instructionSup) {
				Compiler_NEW.this.onEnd(instructions, instructionSup);
			}
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
