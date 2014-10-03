package duro.reflang;

import java.util.ArrayList;
import java.util.Hashtable;

import duro.reflang.antlr4_2.DuroBaseVisitor;
import duro.reflang.antlr4_2.DuroParser.MultiArgMessageArgNoParContext;
import duro.reflang.antlr4_2.DuroParser.MultiArgMessageArgsNoParContext;
import duro.reflang.antlr4_2.DuroParser.MultiArgMessageNoParContext;
import duro.runtime.Instruction;
import duro.runtime.Selector;

public interface PrimitiveVisitorFactory {
	DuroBaseVisitor<Object> create(Hashtable<Selector, PrimitiveVisitorFactory> primitiveMap, MessageCollector errors, ArrayList<Runnable> endHandlers, 
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
		public DuroBaseVisitor<Object> create(
				Hashtable<Selector, PrimitiveVisitorFactory> primitiveMap,
				MessageCollector errors, ArrayList<Runnable> endHandlers,
				ArrayList<Instruction> instructions, boolean mustBeExpression,
				OrdinalAllocator idToParameterOrdinalMap,
				OrdinalAllocator idToVariableOrdinalMap) {
			return new BodyVisitor(primitiveMap, errors, endHandlers, instructions, mustBeExpression, idToParameterOrdinalMap, idToVariableOrdinalMap) {
				@Override
				public Object visitMultiArgMessageNoPar(MultiArgMessageNoParContext ctx) {
					for(MultiArgMessageArgsNoParContext argsCtx: ctx.multiArgMessageArgsNoPar()) {
						for(MultiArgMessageArgNoParContext argCtx: argsCtx.multiArgMessageArgNoPar()) {
							argCtx.accept(new BodyVisitor(primitiveMap, errors, endHandlers, instructions, true, idToParameterOrdinalMap, idToVariableOrdinalMap));
						}
					}
					
					instructions.add(instruction);
					if(mustBeExpression && !doesReturn)
						instructions.add(new Instruction(Instruction.OPCODE_LOAD_NULL));
					
					return null;
				}
			};
		}
	}
}
