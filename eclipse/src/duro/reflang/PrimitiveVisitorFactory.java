package duro.reflang;

import java.util.ArrayList;
import java.util.Hashtable;

import duro.reflang.antlr4_2.DuroBaseVisitor;
import duro.reflang.antlr4_2.DuroParser.MultiArgMessageArgContext;
import duro.reflang.antlr4_2.DuroParser.MultiArgMessageArgsContext;
import duro.reflang.antlr4_2.DuroParser.MultiArgMessageContext;
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
				public Object visitMultiArgMessage(MultiArgMessageContext ctx) {
					for(MultiArgMessageArgsContext argsCtx: ctx.multiArgMessageArgs()) {
						for(MultiArgMessageArgContext argCtx: argsCtx.multiArgMessageArg()) {
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
