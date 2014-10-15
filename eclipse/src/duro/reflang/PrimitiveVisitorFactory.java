package duro.reflang;

import java.util.Hashtable;
import java.util.List;
import java.util.Set;

import org.antlr.v4.runtime.ParserRuleContext;

import duro.reflang.antlr4.DuroParser;
import duro.reflang.antlr4.DuroParser.ClosureContext;
import duro.runtime.Instruction;
import duro.runtime.Selector;

public interface PrimitiveVisitorFactory {
	PrimitiveVisitor create(Hashtable<Selector, PrimitiveVisitorFactory> primitiveMap, MessageCollector errors, PendingCodeEmitter instructions, 
			boolean mustBeExpression,
			OrdinalAllocator idToParameterOrdinalMap, OrdinalAllocator idToVariableOrdinalMap,
			Set<String> accessFields, Set<String> assignFields);
	
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
				MessageCollector errors, PendingCodeEmitter instructions,
				boolean mustBeExpression, OrdinalAllocator idToParameterOrdinalMap,
				OrdinalAllocator idToVariableOrdinalMap,
				Set<String> accessFields, Set<String> assignFields) {
			return new PrimitiveVisitor() {
				@Override
				public void visitPrimitive(String id, List<ParserRuleContext> args) {
					for(ParserRuleContext arg: args)
						arg.accept(new BodyVisitor(primitiveMap, errors, instructions, true, idToParameterOrdinalMap, idToVariableOrdinalMap, accessFields, assignFields));
					
					instructions.addSingle(instruction);
					if(mustBeExpression && !doesReturn)
						instructions.addSingle(new Instruction(Instruction.OPCODE_LOAD_NULL));
				}
			};
		}
	}
	
	public static class Util {
		public static void acceptClosureBodyOrCall(ParserRuleContext expression, Hashtable<Selector, PrimitiveVisitorFactory> primitiveMap,
				MessageCollector errors, PendingCodeEmitter instructions,
				boolean mustBeExpression, OrdinalAllocator idToParameterOrdinalMap,
				OrdinalAllocator idToVariableOrdinalMap,
				Set<String> accessFields, Set<String> assignFields) {
			if(expression.getRuleIndex() == DuroParser.RULE_closure) {
				ClosureContext closure = (ClosureContext)expression;
				new BodyVisitor(primitiveMap, errors, instructions, mustBeExpression, idToParameterOrdinalMap, idToVariableOrdinalMap, accessFields, assignFields).appendGroup(closure.expression());
			} else {
				instructions.addSingle(new Instruction(Instruction.OPCODE_CALL_CLOSURE_0));
			}
		}
	}

	public static class IfElse implements PrimitiveVisitorFactory {
		@Override
		public PrimitiveVisitor create(
				Hashtable<Selector, PrimitiveVisitorFactory> primitiveMap,
				MessageCollector errors, PendingCodeEmitter instructions,
				boolean mustBeExpression, OrdinalAllocator idToParameterOrdinalMap,
				OrdinalAllocator idToVariableOrdinalMap,
				Set<String> accessFields, Set<String> assignFields) {
			return new PrimitiveVisitor() {
				@Override
				public void visitPrimitive(String id, List<ParserRuleContext> args) {
					ParserRuleContext condition = args.get(0);
					ParserRuleContext trueBlock = args.get(1);
					ParserRuleContext falseBlock = args.size() > 2 ? args.get(2) : null;
					
					acceptClosureBodyOrCall(condition, idToVariableOrdinalMap, true);
					
					Label labelElse = new Label();
					Label labelEnd = new Label();
					
					instructions.jump(jump -> new Instruction(Instruction.OPCODE_IF_FALSE, jump), labelElse);
					
					OrdinalAllocator trueBlockIdToVariableOrdinalMap = idToVariableOrdinalMap.newInnerStart();
					acceptClosureBodyOrCall(trueBlock, trueBlockIdToVariableOrdinalMap, mustBeExpression);
					
					instructions.jump(jump -> new Instruction(Instruction.OPCODE_JUMP, jump), labelEnd);

					instructions.label(labelElse);

					if(falseBlock != null) {
						OrdinalAllocator falseBlockIdToVariableOrdinalMap = idToVariableOrdinalMap.newInnerStart();
						acceptClosureBodyOrCall(falseBlock, falseBlockIdToVariableOrdinalMap, mustBeExpression);
					} else {
						if(mustBeExpression)
							instructions.addSingle(new Instruction(Instruction.OPCODE_LOAD_NULL));
					}

					instructions.label(labelEnd);
				}

				private void acceptClosureBodyOrCall(ParserRuleContext expression, OrdinalAllocator idToVariableOrdinalMap, boolean mustBeExpression) {
					Util.acceptClosureBodyOrCall(expression, primitiveMap, errors, instructions, mustBeExpression, idToParameterOrdinalMap, idToVariableOrdinalMap, accessFields, assignFields);
				}
			};
		}
	}
	
	public static class While implements PrimitiveVisitorFactory {
		@Override
		public PrimitiveVisitor create(
				Hashtable<Selector, PrimitiveVisitorFactory> primitiveMap,
				MessageCollector errors, PendingCodeEmitter instructions,
				boolean mustBeExpression, OrdinalAllocator idToParameterOrdinalMap,
				OrdinalAllocator idToVariableOrdinalMap,
				Set<String> accessFields, Set<String> assignFields) {
			return new PrimitiveVisitor() {
				@Override
				public void visitPrimitive(String id, List<ParserRuleContext> args) {
					ParserRuleContext condition = args.get(0);
					ParserRuleContext body = args.get(1);
					
					Label labelLoop = new Label();
					Label labelEnd = new Label();

					instructions.label(labelLoop);
					acceptClosureBodyOrCall(condition, idToVariableOrdinalMap, true);
					
					instructions.jump(jump -> new Instruction(Instruction.OPCODE_IF_FALSE, jump), labelEnd);
					
					OrdinalAllocator bodyIdToVariableOrdinalMap = idToVariableOrdinalMap.newInnerStart();
					acceptClosureBodyOrCall(body, bodyIdToVariableOrdinalMap, false);
					
					instructions.jump(jump -> new Instruction(Instruction.OPCODE_JUMP, jump), labelLoop);
					
					instructions.label(labelEnd);
					
					if(mustBeExpression)
						instructions.addSingle(new Instruction(Instruction.OPCODE_LOAD_NULL));
				}

				private void acceptClosureBodyOrCall(ParserRuleContext expression, OrdinalAllocator idToVariableOrdinalMap, boolean mustBeExpression) {
					Util.acceptClosureBodyOrCall(expression, primitiveMap, errors, instructions, mustBeExpression, idToParameterOrdinalMap, idToVariableOrdinalMap, accessFields, assignFields);
				}
			};
		}
	}
	
	public static class Eval implements PrimitiveVisitorFactory {
		@Override
		public PrimitiveVisitor create(
				Hashtable<Selector, PrimitiveVisitorFactory> primitiveMap,
				MessageCollector errors, PendingCodeEmitter instructions,
				boolean mustBeExpression, OrdinalAllocator idToParameterOrdinalMap,
				OrdinalAllocator idToVariableOrdinalMap,
				Set<String> accessFields, Set<String> assignFields) {
			return new PrimitiveVisitor() {
				@Override
				public void visitPrimitive(String id, List<ParserRuleContext> args) {
					BodyVisitor argVisitor = new BodyVisitor(primitiveMap, errors, instructions, true, idToParameterOrdinalMap, idToVariableOrdinalMap, accessFields, assignFields);
					
					// Append eval arguments first
					ParserRuleContext closureArg = args.get(0);
					for(int i = 1; i < args.size(); i++)
						args.get(i).accept(argVisitor);
					// Then closure
					closureArg.accept(argVisitor);
					
					int closureArgCount = args.size() - 1;
					
					switch(closureArgCount) {
					case 0:
						instructions.addSingle(new Instruction(Instruction.OPCODE_CALL_CLOSURE_0));
						break;
					case 1:
						instructions.addSingle(new Instruction(Instruction.OPCODE_CALL_CLOSURE_1));
						break;
					case 2:
						instructions.addSingle(new Instruction(Instruction.OPCODE_CALL_CLOSURE_2));
						break;
					case 3:
						instructions.addSingle(new Instruction(Instruction.OPCODE_CALL_CLOSURE_3));
						break;
					default:
						instructions.addSingle(new Instruction(Instruction.OPCODE_CALL_CLOSURE, closureArgCount));
						break;
					}
					
					if(!mustBeExpression)
						instructions.addSingle(new Instruction(Instruction.OPCODE_POP, closureArgCount));
				}
			};
		}
	}
}
