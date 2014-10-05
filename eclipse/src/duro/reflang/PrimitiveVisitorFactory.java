package duro.reflang;

import java.util.ArrayList;
import java.util.Hashtable;
import java.util.List;

import org.antlr.v4.runtime.ParserRuleContext;

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

	public static class IfElse implements PrimitiveVisitorFactory {
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
					ParserRuleContext condition = args.get(0);
					ParserRuleContext trueBlock = args.get(1);
					ParserRuleContext falseBlock = args.size() > 2 ? args.get(2) : null;
					
					condition.accept(new BodyVisitor(primitiveMap, errors, endHandlers, instructions, true, idToParameterOrdinalMap, idToVariableOrdinalMap));
					
					int conditionalJumpIndex = instructions.size();
					instructions.add(null);
					
					OrdinalAllocator trueBlockIdToVariableOrdinalMap = idToVariableOrdinalMap.newInnerStart();
					trueBlock.accept(new BodyVisitor(primitiveMap, errors, endHandlers, instructions, mustBeExpression, idToParameterOrdinalMap, trueBlockIdToVariableOrdinalMap));
					
					// After statement on true is generated, then a jump should be generated
					// Leave a spot allocated here and write to it later
					int jumpIndex = instructions.size();
					instructions.add(null);

					// Now, the spot allocated for a conditional jump can be populated
					int ifEndIndex = instructions.size();
					int ifJump = ifEndIndex - conditionalJumpIndex;
					instructions.set(conditionalJumpIndex, new Instruction(Instruction.OPCODE_IF_FALSE, ifJump));

					if(falseBlock != null) {
						OrdinalAllocator falseBlockIdToVariableOrdinalMap = idToVariableOrdinalMap.newInnerStart();
						falseBlock.accept(new BodyVisitor(primitiveMap, errors, endHandlers, instructions, mustBeExpression, idToParameterOrdinalMap, falseBlockIdToVariableOrdinalMap));
					} else {
						if(mustBeExpression)
							instructions.add(new Instruction(Instruction.OPCODE_LOAD_NULL));
					}

					// Now, the spot allocated for a jump can be populated
					int elseEndIndex = instructions.size();
					int elseJump = elseEndIndex - jumpIndex;
					instructions.set(jumpIndex, new Instruction(Instruction.OPCODE_JUMP, elseJump));
				}
			};
		}
	}
}
