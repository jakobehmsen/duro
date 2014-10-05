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

import com.sun.xml.internal.ws.assembler.jaxws.MustUnderstandTubeFactory;

import duro.debugging.Debug;
//import duro.reflang.antlr4_2.DuroParser.TopExpressionContext;
import duro.reflang.antlr4_2.DuroBaseListener;
import duro.reflang.antlr4_2.DuroLexer;
import duro.reflang.antlr4_2.DuroListener;
import duro.reflang.antlr4_2.DuroParser;
import duro.reflang.antlr4_2.DuroParser.AccessContext;
import duro.reflang.antlr4_2.DuroParser.AssignmentContext;
import duro.reflang.antlr4_2.DuroParser.BinaryMessageContext;
import duro.reflang.antlr4_2.DuroParser.BinaryOperatorContext;
import duro.reflang.antlr4_2.DuroParser.IdContext;
import duro.reflang.antlr4_2.DuroParser.IntegerContext;
//import duro.reflang.antlr4_2.DuroParser.MultiArgMessageArgContext;
//import duro.reflang.antlr4_2.DuroParser.MultiArgMessageContext;
import duro.reflang.antlr4_2.DuroParser.ProgramContext;
import duro.reflang.antlr4_2.DuroParser.StringContext;
//import duro.reflang.antlr4_2.DuroParser.TopExpressionsContext;
import duro.reflang.antlr4_2.DuroParser.VariableDeclarationContext;
import duro.runtime.CustomProcess;
import duro.runtime.Instruction;
import duro.runtime.Selector;

public class Compiler_NEW {
//	private Hashtable<Selector, PrimitiveGeneratorFactory> primitiveMap = new Hashtable<Selector, PrimitiveGeneratorFactory>();
	private MessageCollector errors = new MessageCollector();
	private ArrayList<Runnable> endHandlers = new ArrayList<Runnable>();
	
	public Compiler_NEW() {
//		primitiveMap.put(Selector.get("write", 1), new PrimitiveGeneratorFactory.ConstInstruction(new Instruction(Instruction.OPCODE_SP_WRITE), false));
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

		long endParse = System.currentTimeMillis();
		Debug.println(Debug.LEVEL_MEDIUM, "Parsed program.");
		Debug.println(Debug.LEVEL_MEDIUM, "Parse time: " + (endParse - startParse));

		long startGen = System.currentTimeMillis();
		OrdinalAllocator idToParameterOrdinalMap = new OrdinalAllocator();
		OrdinalAllocator idToVariableOrdinalMap = new OrdinalAllocator();
		Debug.println(Debug.LEVEL_MEDIUM, "Generating program...");
//		BodyInfo bodyInfo = getBodyInfo(idToParameterOrdinalMap, idToVariableOrdinalMap, programCtx);
//		idToParameterOrdinalMap.generate();
//		idToVariableOrdinalMap.generate();
		Hashtable<Selector, PrimitiveVisitorFactory> primitiveMap = new Hashtable<Selector, PrimitiveVisitorFactory>();
		primitiveMap.put(Selector.get("ifElse", 3), new PrimitiveVisitorFactory.IfElse());
		primitiveMap.put(Selector.get("if", 2), new PrimitiveVisitorFactory.IfElse());
		primitiveMap.put(Selector.get("write", 1), new PrimitiveVisitorFactory.ConstInstruction(new Instruction(Instruction.OPCODE_SP_WRITE), false));
		primitiveMap.put(Selector.get("readln", 0), new PrimitiveVisitorFactory.ConstInstruction(new Instruction(Instruction.OPCODE_SP_NEXT_LINE), true));
		primitiveMap.put(Selector.get("eval", 1), new PrimitiveVisitorFactory.ConstInstruction(new Instruction(Instruction.OPCODE_CALL_CLOSURE), true));
		ArrayList<Instruction> instructions = new ArrayList<Instruction>();
		BodyVisitor programVisitor = new BodyVisitor(primitiveMap, errors, endHandlers, instructions, true, idToParameterOrdinalMap, idToVariableOrdinalMap);
//		Walker walker = new Walker();
//		walker.walk(programInterceptor, programCtx);
		programCtx.accept(programVisitor);
		idToParameterOrdinalMap.generate();
		idToVariableOrdinalMap.generate();
		for(Runnable handler: endHandlers)
			handler.run();
		long endGen = System.currentTimeMillis();
		Debug.println(Debug.LEVEL_MEDIUM, "Generated program.");
		Debug.println(Debug.LEVEL_MEDIUM, "Generate time: " + (endGen - startGen));
		
//		return new CustomProcess(idToParameterOrdinalMap.size(), bodyInfo.localCount, bodyInfo.instructions.toArray(new Instruction[bodyInfo.instructions.size()]));
		return new CustomProcess(idToParameterOrdinalMap.size(), idToVariableOrdinalMap.size(), instructions.toArray(new Instruction[instructions.size()]));
	}
	
	private DuroListener createBodyListener(
			final ConditionalTreeWalker walker, boolean mustBeExpression, OrdinalAllocator idToParameterOrdinalMap, 
			OrdinalAllocator idToVariableOrdinalMap, final ArrayList<Instruction> instructions) {
		return new DuroBaseListener() {
			@Override
			public void enterProgram(ProgramContext ctx) {
				walker.suspendWalkWithin(ctx);
				
				for(int i = 0; i < ctx.expression().size() ; i++)
					append(false, idToParameterOrdinalMap, idToVariableOrdinalMap, ctx.expression(i), instructions);

				instructions.add(new Instruction(Instruction.OPCODE_FINISH));
			}
			
//			@Override
//			public void enterTopExpressions(TopExpressionsContext ctx) {
//				walker.suspendWalkWithin(ctx);
//
//				if(ctx.topExpression().size() > 0) {
//					for(int i = 0; i < ctx.topExpression().size() - 1; i++)
//						append(false, idToParameterOrdinalMap, idToVariableOrdinalMap, ctx.topExpression(i), instructions);
//					
//					append(true, idToParameterOrdinalMap, idToVariableOrdinalMap, ctx.topExpression(ctx.topExpression().size() - 1), instructions);
//				}
//			}
			
			@Override
			public void enterAssignment(AssignmentContext ctx) {
				walker.suspendWalkWithin(ctx);
				
				String id = ctx.id().getText();
				
//				if(ctx.op.getType() == DuroLexer.ASSIGN && idToVariableOrdinalMap.isDeclared(id))
//					return;
				
				
				
				switch(ctx.op.getType()) {
				case DuroLexer.ASSIGN: {
					// newValue, newValue
					if(idToVariableOrdinalMap.isDeclared(id)) {
						append(true, idToParameterOrdinalMap, idToVariableOrdinalMap, ctx.expression(), instructions);
						if(mustBeExpression)
							instructions.add(new Instruction(Instruction.OPCODE_DUP));
						// Variable assignment
						idToVariableOrdinalMap.ordinalFor(id, instructions, firstOrdinal -> new Instruction(Instruction.OPCODE_STORE_LOC, firstOrdinal));
					} else {
						instructions.add(new Instruction(Instruction.OPCODE_LOAD_THIS));
						// receiver
						append(true, idToParameterOrdinalMap, idToVariableOrdinalMap, ctx.expression(), instructions);
						// receiver, newValue
						if(mustBeExpression)
							instructions.add(new Instruction(Instruction.OPCODE_DUP1));
							// newValue, receiver, newValue
						instructions.add(new Instruction(Instruction.OPCODE_SET, id, 0));
						// newValue | e
					}
					break;
				} case DuroLexer.ASSIGN_PROTO: {
					if(!mustBeExpression)
						instructions.add(new Instruction(Instruction.OPCODE_LOAD_THIS));
					append(true, idToParameterOrdinalMap, idToVariableOrdinalMap, ctx.expression(), instructions);
					if(mustBeExpression)
						instructions.add(new Instruction(Instruction.OPCODE_DUP));
						// newValue, newValue
					if(mustBeExpression) {
						instructions.add(new Instruction(Instruction.OPCODE_LOAD_THIS));
						// newValue, newValue, receiver
						instructions.add(new Instruction(Instruction.OPCODE_SWAP));
						// newValue, receiver, newValue
					}
					instructions.add(new Instruction(Instruction.OPCODE_SET_PROTO, id, 0));
					break;
				}
				}

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
					if(mustBeExpression)
						instructions.add(new Instruction(Instruction.OPCODE_DUP1));
					instructions.add(new Instruction(Instruction.OPCODE_SET, id, selectorParameterCount));
				}
			}
			
			@Override
			public void exitAssignment(AssignmentContext ctx) {
//				String id = ctx.id().getText();
//				
//				// newValue
//				
//				switch(ctx.op.getType()) {
//				case DuroLexer.ASSIGN: {
//					instructions.add(new Instruction(Instruction.OPCODE_DUP));
//					// newValue, newValue
//					if(idToVariableOrdinalMap.isDeclared(id)) {
//						// Variable assignment
//						idToVariableOrdinalMap.ordinalFor(id, instructions, firstOrdinal -> new Instruction(Instruction.OPCODE_STORE_LOC, firstOrdinal));
//					} else {
//						instructions.add(new Instruction(Instruction.OPCODE_LOAD_THIS));
//						// newValue, newValue, receiver
//						instructions.add(new Instruction(Instruction.OPCODE_SWAP));
//						// newValue, receiver, newValue
//						instructions.add(new Instruction(Instruction.OPCODE_SET, id, 0));
//					}
//					break;
//				} case DuroLexer.ASSIGN_PROTO: {
//					instructions.add(new Instruction(Instruction.OPCODE_DUP));
//					// newValue, newValue
//					instructions.add(new Instruction(Instruction.OPCODE_LOAD_THIS));
//					// newValue, newValue, receiver
//					instructions.add(new Instruction(Instruction.OPCODE_SWAP));
//					// newValue, receiver, newValue
//					instructions.add(new Instruction(Instruction.OPCODE_SET_PROTO, id, 0));
//					break;
//				}
//				}
//				
//				// newValue
			}
			
			@Override
			public void enterVariableDeclaration(VariableDeclarationContext ctx) {
				walker.suspendWalkWithin(ctx);
				
				if(!idToVariableOrdinalMap.isDeclaredLocally(ctx.id().getText()) && !idToParameterOrdinalMap.isDeclared(ctx.id().getText())) {
					idToVariableOrdinalMap.declare(ctx.id().getText());

					if(ctx.expression() == null) { 
						if(mustBeExpression)
							instructions.add(new Instruction(Instruction.OPCODE_LOAD_NULL));
					} else {
						append(true, idToParameterOrdinalMap, idToVariableOrdinalMap, ctx.expression(), instructions);
						if(mustBeExpression)
							instructions.add(new Instruction(Instruction.OPCODE_DUP));
						idToVariableOrdinalMap.declare(ctx.id().getText(), instructions, variableOrdinal -> new Instruction(Instruction.OPCODE_STORE_LOC, variableOrdinal));
					}
				} else {
					appendError(ctx, "Variable '" + ctx.id().getText() + "' is already declared in this scope.");
				}
			}
			
			@Override
			public void exitBinaryMessage(BinaryMessageContext ctx) {
				String id = ctx.BIN_OP().getText();
				instructions.add(new Instruction(Instruction.OPCODE_SEND, id, 1));
			}
			
//			private Stack<PrimitiveGenerator> primitiveGeneratorStack = new Stack<PrimitiveGenerator>();
			
//			@Override
//			public void enterMultiArgMessage(MultiArgMessageContext ctx) {
//				walker.suspendWalkWithin(ctx);
//				// For each argument of a message, mustBeExpresion should be true
//				
//				// Should be for self message exchange only?
//				String id = ctx.ID_UNCAP().getText() + ctx.ID_CAP().stream().map(x -> x.getText()).collect(Collectors.joining());
//				int parameterCount = ctx.multiArgMessageArgs().size();
////				PrimitiveGeneratorFactory primitiveGeneratorFactory = primitiveMap.get(Selector.get(id, parameterCount));
////				
////				if(primitiveGeneratorFactory != null) {
////					// What about "mustBeExpression"?
////					PrimitiveGenerator primitiveGenerator = primitiveGeneratorFactory.create(ctx);
////					primitiveGenerator.enterPrimitive(instructions);
////					primitiveGeneratorStack.push(primitiveGenerator);
////				} else {
////					primitiveGeneratorStack.push(null);
////				}
//			}
			
//			@Override
//			public void enterMultiArgMessageArg(MultiArgMessageArgContext ctx) {
////				if(primitiveGeneratorStack.pop() == null) {
////					walker.suspendWalkWithin(ctx);
////					for(int i = 0; i < ctx.expression().size(); i++)
////						append(true, idToParameterOrdinalMap, idToVariableOrdinalMap, ctx.expression(i), instructions);
////				}
//			}
			
//			@Override
//			public void exitMultiArgMessage(MultiArgMessageContext ctx) {
////				PrimitiveGenerator primitiveGenerator = primitiveGeneratorStack.pop();
////				
////				if(primitiveGenerator != null)
////					primitiveGenerator.exitPrimitive(instructions);
//			}
			
			@Override
			public void enterAccess(AccessContext ctx) {
				if(mustBeExpression) {
					String id = ctx.id().getText();
					
					if(idToParameterOrdinalMap.isDeclared(id)) {
						// Load argument
						idToParameterOrdinalMap.ordinalFor(id, instructions, parameterOrdinal -> new Instruction(Instruction.OPCODE_LOAD_ARG, parameterOrdinal));
						return;
					}
					
					if(idToVariableOrdinalMap.isDeclared(id)) {
						// Load variable
						idToVariableOrdinalMap.ordinalFor(id, instructions, variableOrdinal -> new Instruction(Instruction.OPCODE_LOAD_LOC, variableOrdinal));
						return;
					}
					
					// Get member
					instructions.add(new Instruction(Instruction.OPCODE_LOAD_THIS));
					instructions.add(new Instruction(Instruction.OPCODE_GET, id, 0));
				}
			}
			
			@Override
			public void enterInteger(IntegerContext ctx) {
				if(mustBeExpression) {
					int value = Integer.parseInt(ctx.INT().getText());
					instructions.add(new Instruction(Instruction.OPCODE_LOAD_INT, value));
				}
			}
			
			@Override
			public void enterString(StringContext ctx) {
				if(mustBeExpression) {
					String rawString = ctx.getText();
					// Should the string enter properly prepared?
					// - i.e., no need for filtering the string.
					String string = extractStringLiteral(rawString);
					
					instructions.add(new Instruction(Instruction.OPCODE_LOAD_STRING, string));
				}
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
		
		append(true, idToParameterOrdinalMap, idToVariableOrdinalMap, tree, instructions);
		
		int variableCount = idToVariableOrdinalMap.size();

		return new BodyInfo(variableCount, instructions);
	}
	
	private void append(boolean mustBeExpression, OrdinalAllocator idToParameterOrdinalMap, OrdinalAllocator idToVariableOrdinalMap, ParseTree tree, ArrayList<Instruction> instructions) {
		ConditionalTreeWalker walker = new ConditionalTreeWalker();
		walker.walk(
			createBodyListener(walker, mustBeExpression, idToParameterOrdinalMap, idToVariableOrdinalMap, instructions), 
			tree
		);
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
