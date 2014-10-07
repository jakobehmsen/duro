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
	
	public static class While implements PrimitiveVisitorFactory {
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
					ParserRuleContext body = args.get(1);
					
					int jumpIndex = instructions.size();
					
					condition.accept(new BodyVisitor(primitiveMap, errors, endHandlers, instructions, true, idToParameterOrdinalMap, idToVariableOrdinalMap));
					
					int conditionalJumpIndex = instructions.size();
					instructions.add(null);
					
					OrdinalAllocator bodyIdToVariableOrdinalMap = idToVariableOrdinalMap.newInnerStart();
					body.accept(new BodyVisitor(primitiveMap, errors, endHandlers, instructions, false, idToParameterOrdinalMap, bodyIdToVariableOrdinalMap));

					int whileBodyEndIndex = instructions.size();
					int jump = jumpIndex - whileBodyEndIndex;
					instructions.add(new Instruction(Instruction.OPCODE_JUMP, jump));
					
					int whileEndIndex = instructions.size();
					int conditionalJump = whileEndIndex - conditionalJumpIndex;
					instructions.set(conditionalJumpIndex, new Instruction(Instruction.OPCODE_IF_FALSE, conditionalJump));
					
					if(mustBeExpression)
						instructions.add(new Instruction(Instruction.OPCODE_LOAD_NULL));

				}
			};
		}
	}
	
	public static class Eval implements PrimitiveVisitorFactory {
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
					BodyVisitor argVisitor = new BodyVisitor(primitiveMap, errors, endHandlers, instructions, true, idToParameterOrdinalMap, idToVariableOrdinalMap);
					
					// Append eval arguments first
					ParserRuleContext closureArg = args.get(0);
					for(int i = 1; i < args.size(); i++)
						args.get(i).accept(argVisitor);
					// Then closure
					closureArg.accept(argVisitor);
					
					int closureArgCount = args.size() - 1;
					
					switch(closureArgCount) {
					case 0:
						instructions.add(new Instruction(Instruction.OPCODE_CALL_CLOSURE_0));
						break;
					case 1:
						instructions.add(new Instruction(Instruction.OPCODE_CALL_CLOSURE_1));
						break;
					case 2:
						instructions.add(new Instruction(Instruction.OPCODE_CALL_CLOSURE_2));
						break;
					case 3:
						instructions.add(new Instruction(Instruction.OPCODE_CALL_CLOSURE_3));
						break;
					default:
						instructions.add(new Instruction(Instruction.OPCODE_CALL_CLOSURE));
						break;
					}
				}
			};
		}
	}
}
