package duro.reflang;

import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInput;
import java.io.ObjectInputStream;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;
import java.io.StringWriter;
import java.util.HashSet;
import java.util.Hashtable;
import java.util.Set;

import org.antlr.v4.runtime.ANTLRErrorListener;
import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.Parser;
import org.antlr.v4.runtime.RecognitionException;
import org.antlr.v4.runtime.Recognizer;
import org.antlr.v4.runtime.atn.ATNConfigSet;
import org.antlr.v4.runtime.atn.PredictionMode;
import org.antlr.v4.runtime.dfa.DFA;

import duro.debugging.Debug;
import duro.io.TreeWriter;
import duro.reflang.antlr4.DuroLexer;
import duro.reflang.antlr4.DuroParser;
import duro.reflang.antlr4.DuroParser.ProgramContext;
import duro.reflang.ast.ANTLRToAST;
import duro.reflang.ast.AST;
import duro.reflang.ast.ASTBuilder;
import duro.reflang.ast.ASTToCode;
import duro.runtime.FrameInfo;
import duro.runtime.Instruction;
import duro.runtime.Selector;

public class Compiler {
	private MessageCollector errors = new MessageCollector();
	
	private void appendError(int line, int charPositionInLine, String message) {
		errors.appendMessage(line, charPositionInLine, message);
	}
	
	public boolean hasErrors() {
		return errors.hasMessages();
	}
	
	public void printErrors() {
		errors.printMessages();
	}
	
	public FrameInfo compile(InputStream sourceCode) throws IOException, CompilationException {
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
		
		// Syntax errors?
		if(errors.hasMessages())
			throw new CompilationException(errors);

		long endParse = System.currentTimeMillis();
		Debug.println(Debug.LEVEL_MEDIUM, "Parsed program.");
		Debug.println(Debug.LEVEL_MEDIUM, "Parse time: " + (endParse - startParse));

		long startGen = System.currentTimeMillis();
		OrdinalAllocator idToParameterOrdinalMap = new OrdinalAllocator();
		OrdinalAllocator idToVariableOrdinalMap = new OrdinalAllocator();
		Debug.println(Debug.LEVEL_MEDIUM, "Generating program...");
		
		Hashtable<Selector, PrimitiveVisitorFactory> primitiveMap = new Hashtable<Selector, PrimitiveVisitorFactory>();
		primitiveMap.put(Selector.get("ifElse", 3), new PrimitiveVisitorFactory.IfElse());
		primitiveMap.put(Selector.get("if", 2), new PrimitiveVisitorFactory.IfElse());
		primitiveMap.put(Selector.get("while", 2), new PrimitiveVisitorFactory.While());
		primitiveMap.put(Selector.get("not", 1), new PrimitiveVisitorFactory.ConstInstruction(new Instruction(Instruction.OPCODE_SP_BOOLEAN_NOT), true));
		primitiveMap.put(Selector.get("pause", 0), new PrimitiveVisitorFactory.ConstInstruction(new Instruction(Instruction.OPCODE_PAUSE), true));
		primitiveMap.put(Selector.get("finish", 0), new PrimitiveVisitorFactory.ConstInstruction(new Instruction(Instruction.OPCODE_FINISH), true));
		primitiveMap.put(Selector.get("eval", 1), new PrimitiveVisitorFactory.Eval());
		primitiveMap.put(Selector.get("evalWith", 2), new PrimitiveVisitorFactory.Eval());
		primitiveMap.put(Selector.get("evalWithWith", 3), new PrimitiveVisitorFactory.Eval());
		primitiveMap.put(Selector.get("evalWithWithWith", 4), new PrimitiveVisitorFactory.Eval());
		primitiveMap.put(Selector.get("evalWithWithWithWith", 5), new PrimitiveVisitorFactory.Eval());
//		primitiveMap.put(Selector.get("doHandle", 2), new PrimitiveVisitorFactory.ConstInstruction(new Instruction(Instruction.OPCODE_DO_HANDLE), true));
		primitiveMap.put(Selector.get("return", 1), new PrimitiveVisitorFactory.ConstInstruction(new Instruction(Instruction.OPCODE_RET), true));

		primitiveMap.put(Selector.get("classField", 2), new PrimitiveVisitorFactory.ClassField());
		primitiveMap.put(Selector.get("onInvoke", 4), new PrimitiveVisitorFactory.InstanceInvoke());
		primitiveMap.put(Selector.get("onInvokeWith", 5), new PrimitiveVisitorFactory.InstanceInvoke());
		primitiveMap.put(Selector.get("onInvokeWith", 6), new PrimitiveVisitorFactory.InstanceInvoke());
		primitiveMap.put(Selector.get("onInvokeWith", 7), new PrimitiveVisitorFactory.InstanceInvoke());
		primitiveMap.put(Selector.get("newInstance", 1), new PrimitiveVisitorFactory.NewInstance());
		primitiveMap.put(Selector.get("newInstanceWith", 1), new PrimitiveVisitorFactory.NewInstance());
		primitiveMap.put(Selector.get("newInstanceWith", 2), new PrimitiveVisitorFactory.NewInstance());
		primitiveMap.put(Selector.get("newInstanceWith", 3), new PrimitiveVisitorFactory.NewInstance());
		primitiveMap.put(Selector.get("newInstanceWith", 4), new PrimitiveVisitorFactory.NewInstance());

		primitiveMap.put(Selector.get("isSet", 2), new PrimitiveVisitorFactory.IsSet());
		primitiveMap.put(Selector.get("slotsSet", 2), new PrimitiveVisitorFactory.ConstInstruction(new Instruction(Instruction.OPCODE_SLOTS_SET), true));
		primitiveMap.put(Selector.get("slotsSetProto", 2), new PrimitiveVisitorFactory.ConstInstruction(new Instruction(Instruction.OPCODE_SLOTS_SET_PROTO), true));
		primitiveMap.put(Selector.get("slotsGet", 2), new PrimitiveVisitorFactory.ConstInstruction(new Instruction(Instruction.OPCODE_SLOTS_GET), true));
		primitiveMap.put(Selector.get("slotsIsDefined", 2), new PrimitiveVisitorFactory.ConstInstruction(new Instruction(Instruction.OPCODE_SLOTS_IS_DEFINED), true));
		primitiveMap.put(Selector.get("slotsNames", 2), new PrimitiveVisitorFactory.ConstInstruction(new Instruction(Instruction.OPCODE_SLOTS_NAMES), true));

		primitiveMap.put(Selector.get("arrayGet", 2), new PrimitiveVisitorFactory.ConstInstruction(new Instruction(Instruction.OPCODE_SP_ARRAY_GET), true));
		primitiveMap.put(Selector.get("arraySet", 3), new PrimitiveVisitorFactory.ConstInstruction(new Instruction(Instruction.OPCODE_SP_ARRAY_SET), false));
		
		primitiveMap.put(Selector.get("stringConcat", 2), new PrimitiveVisitorFactory.ConstInstruction(new Instruction(Instruction.OPCODE_SP_STRING_CONCAT), true));
		primitiveMap.put(Selector.get("stringEqual", 2), new PrimitiveVisitorFactory.ConstInstruction(new Instruction(Instruction.OPCODE_SP_STRING_EQUAL), true));

		primitiveMap.put(Selector.get("intAdd", 2), new PrimitiveVisitorFactory.ConstInstruction(new Instruction(Instruction.OPCODE_SP_INT_ADD), true));
		primitiveMap.put(Selector.get("intSub", 2), new PrimitiveVisitorFactory.ConstInstruction(new Instruction(Instruction.OPCODE_SP_INT_SUB), true));
		primitiveMap.put(Selector.get("intMult", 2), new PrimitiveVisitorFactory.ConstInstruction(new Instruction(Instruction.OPCODE_SP_INT_MULT), true));
		primitiveMap.put(Selector.get("intDiv", 2), new PrimitiveVisitorFactory.ConstInstruction(new Instruction(Instruction.OPCODE_SP_INT_DIV), true));
		primitiveMap.put(Selector.get("intRem", 2), new PrimitiveVisitorFactory.ConstInstruction(new Instruction(Instruction.OPCODE_SP_INT_REM), true));
		primitiveMap.put(Selector.get("intEqual", 2), new PrimitiveVisitorFactory.ConstInstruction(new Instruction(Instruction.OPCODE_SP_INT_EQUAL), true));
		primitiveMap.put(Selector.get("intGreater", 2), new PrimitiveVisitorFactory.ConstInstruction(new Instruction(Instruction.OPCODE_SP_INT_GREATER), true));
		primitiveMap.put(Selector.get("intLess", 2), new PrimitiveVisitorFactory.ConstInstruction(new Instruction(Instruction.OPCODE_SP_INT_LESS), true));
		primitiveMap.put(Selector.get("intToString", 1), new PrimitiveVisitorFactory.ConstInstruction(new Instruction(Instruction.OPCODE_SP_INT_TO_STRING), true));

		primitiveMap.put(Selector.get("frameSender", 1), new PrimitiveVisitorFactory.ConstInstruction(new Instruction(Instruction.OPCODE_SP_FRAME_SENDER), true));
		primitiveMap.put(Selector.get("frameSetSender", 2), new PrimitiveVisitorFactory.ConstInstruction(new Instruction(Instruction.OPCODE_SP_FRAME_SET_SENDER), false));
		primitiveMap.put(Selector.get("frameResume", 2), new PrimitiveVisitorFactory.ConstInstruction(new Instruction(Instruction.OPCODE_SP_FRAME_RESUME), true));

		primitiveMap.put(Selector.get("refEqual", 2), new PrimitiveVisitorFactory.ConstInstruction(new Instruction(Instruction.OPCODE_SP_REF_EQUAL), true));
		primitiveMap.put(Selector.get("newDict", 0), new PrimitiveVisitorFactory.ConstInstruction(new Instruction(Instruction.OPCODE_SP_NEW_DICT), true));
		primitiveMap.put(Selector.get("newArray", 1), new PrimitiveVisitorFactory.ConstInstruction(new Instruction(Instruction.OPCODE_SP_NEW_ARRAY), true));
		primitiveMap.put(Selector.get("arrayLength", 1), new PrimitiveVisitorFactory.ConstInstruction(new Instruction(Instruction.OPCODE_SP_ARRAY_LENGTH), true));
		primitiveMap.put(Selector.get("load", 1), new PrimitiveVisitorFactory.ConstInstruction(new Instruction(Instruction.OPCODE_SP_LOAD), false));
		primitiveMap.put(Selector.get("clone", 1), new PrimitiveVisitorFactory.ConstInstruction(new Instruction(Instruction.OPCODE_SP_CLONE), true));

		Set<String> fields = new HashSet<String>();
		ANTLRToAST antlrProgramVisitor = new ANTLRToAST(idToParameterOrdinalMap, idToVariableOrdinalMap, errors, fields, fields);
		ASTBuilder programAstBuilder = programCtx.accept(antlrProgramVisitor);
		int parameterOffset = 1;
		idToParameterOrdinalMap.generate(parameterOffset);
		int variableOffset = parameterOffset + idToParameterOrdinalMap.size();
		idToVariableOrdinalMap.generate(variableOffset);
		AST programAst = programAstBuilder.build();

		// Semantic errors?
		if(errors.hasMessages())
			throw new CompilationException(errors);
		
		StringWriter astStringWriter = new StringWriter();
		TreeWriter astWriter = new TreeWriter(astStringWriter);
		programAst.writeTo(astWriter);
		Debug.println(Debug.LEVEL_MEDIUM, "Generated ast:\n" + astStringWriter.toString());
		
		// Postpone code generation from ast's till runtime?
		// Instead, a single instruction, GENERATE with the ast as an operand, is generated?
		CodeEmitter instructions = new CodeEmitter();
		ASTToCode programAstToCode = new ASTToCode(primitiveMap, instructions, false);
		programAst.accept(programAstToCode);
		
		long endGen = System.currentTimeMillis();
		Debug.println(Debug.LEVEL_MEDIUM, "Generated program.");
		Debug.println(Debug.LEVEL_MEDIUM, "Generate time: " + (endGen - startGen));
		
		CodeEmission code = instructions.generate();
		
		int localCount = 1 + idToParameterOrdinalMap.size() + idToVariableOrdinalMap.size();
		return new FrameInfo(localCount, code.getMaxStackSize(), code.toArray(new Instruction[code.size()]));
	}
	
	public FrameInfo load(String sourcePath, String codePath) throws FileNotFoundException, IOException, ClassNotFoundException, CompilationException {
		FrameInfo process = null;
		
		File mainObjectSourceFile = new File(sourcePath);
		File mainObjectCodeFile = new File(codePath);
		long mainObjectSourceFileLastModified = mainObjectSourceFile.lastModified();
		
		boolean shouldCompile = true;
		
		if(mainObjectCodeFile.exists()) {
			try (ObjectInput oo = new ObjectInputStream(new FileInputStream(codePath))) {
				long compilationSourceLastModified = (long) oo.readLong();
				if(compilationSourceLastModified == mainObjectSourceFileLastModified) {
					process = (FrameInfo) oo.readObject();
					shouldCompile = false;
					Debug.println(Debug.LEVEL_MEDIUM, "Loaded object file for '" + sourcePath + "'.");
				} else {
					Debug.println(Debug.LEVEL_MEDIUM, "Object file for '" + sourcePath + "' is out of date.");
				}
		    }
		} else {
			Debug.println(Debug.LEVEL_MEDIUM, "Missing object file for '" + sourcePath + "'.");
		}
		
		if(shouldCompile) {
			Debug.println(Debug.LEVEL_MEDIUM, "Compiling '" + sourcePath + "' into '" + codePath + "'...");
			FileInputStream inputStream;
			try {
				inputStream = new FileInputStream(sourcePath);
				process = compile(inputStream);
				
				if(hasErrors()) {
					System.err.println("Errors were found during compilation of '" + sourcePath + "':");
					printErrors();
				} else {
					
					try (ObjectOutput oo = new ObjectOutputStream(new FileOutputStream(codePath))) {
						oo.writeLong(mainObjectSourceFileLastModified);
				        oo.writeObject(process);
				    }
					
					Debug.println(Debug.LEVEL_MEDIUM, "Compiled '" + codePath + "' into '" + codePath + "'.");
				}
			} catch (IOException e) {
				System.err.println("Compilation of '" + sourcePath + "' failed.");
				e.printStackTrace();
			}
		}
		
		return process;
	}

	public static void warmup() {
		String testSource = 
			"var x = 0\n" + 
			"var c = {if' true, true Else: false}\n" + 
			"obj = #[x = 0 y => x]";
		
		Compiler compiler = new Compiler();
		try {
			for(int i = 0; i < 10; i++)
				try {
					compiler.compile(new ByteArrayInputStream(testSource.getBytes("UTF-8")));
				} catch (CompilationException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
