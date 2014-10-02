package duro.reflang;

import java.util.List;

import duro.reflang.antlr4_2.DuroParser.MultiArgMessageContext;
import duro.runtime.Instruction;

public interface PrimitiveGeneratorFactory {
	PrimitiveGenerator create(MultiArgMessageContext ctx);
	
	public static class ConstInstruction implements PrimitiveGeneratorFactory {
		private Instruction instruction;
		private boolean doesReturn;

		public ConstInstruction(Instruction instruction, boolean doesReturn) {
			this.instruction = instruction;
			this.doesReturn = doesReturn;
		}
		
		@Override
		public PrimitiveGenerator create(MultiArgMessageContext ctx) {
			return new PrimitiveGenerator() {
				@Override
				public void enterPrimitive(List<Instruction> instructions) { }
				
				@Override
				public void exitPrimitive(List<Instruction> instructions) {
					instructions.add(instruction);
					if(!doesReturn)
						instructions.add(new Instruction(Instruction.OPCODE_LOAD_NULL));
				}
			};
		}
	}
}
