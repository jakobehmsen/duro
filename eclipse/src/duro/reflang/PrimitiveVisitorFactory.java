package duro.reflang;

import java.util.ArrayList;
import java.util.Hashtable;
import java.util.List;

import org.antlr.v4.runtime.ParserRuleContext;

import duro.reflang.antlr4_2.DuroBaseVisitor;
import duro.reflang.antlr4_2.DuroParser.ExpressionContext;
import duro.reflang.antlr4_2.DuroParser.MultiArgMessageArgNoParContext;
import duro.reflang.antlr4_2.DuroParser.MultiArgMessageArgsNoParContext;
import duro.reflang.antlr4_2.DuroParser.MultiArgMessageArgsWithParContext;
import duro.reflang.antlr4_2.DuroParser.MultiArgMessageNoParContext;
import duro.reflang.antlr4_2.DuroParser.MultiArgMessageWithParContext;
import duro.runtime.Instruction;
import duro.runtime.Selector;

public interface PrimitiveVisitorFactory {
	PrimitiveVisitor create(Hashtable<Selector, PrimitiveVisitorFactory> primitiveMap, MessageCollector errors, ArrayList<Runnable> endHandlers, 
			ArrayList<Instruction> instructions,
			boolean mustBeExpression, OrdinalAllocator idToParameterOrdinalMap,
			OrdinalAllocator idToVariableOrdinalMap);
	
	public static class ConstInstruction implements PrimitiveVisitorFactory {
		private Instruction instruction;
		private boolean doesReturn;

		public ConstInstruction(Instruction instruction, boolean doesReturn) {
			this.instruction = instruction;
			this.doesReturn = doesReturn;
		}

		@Override
		public PrimitiveVisitor create(
				Hashtable<Selector, PrimitiveVisitorFactory> primitiveMap,
				MessageCollector errors, ArrayList<Runnable> endHandlers,
				ArrayList<Instruction> instructions, boolean mustBeExpression,
				OrdinalAllocator idToParameterOrdinalMap,
				OrdinalAllocator idToVariableOrdinalMap) {
			return new PrimitiveVisitor() {
				@Override
				public void visitPrimitive(String id, List<ParserRuleContext> args) {
					for(ParserRuleContext arg: args)
						arg.accept(new BodyVisitor(primitiveMap, errors, endHandlers, instructions, true, idToParameterOrdinalMap, idToVariableOrdinalMap));
					
					instructions.add(instruction);
					if(mustBeExpression && !doesReturn)
						instructions.add(new Instruction(Instruction.OPCODE_LOAD_NULL));
				}
			};
		}
	}
}
