package duro.reflang;

import duro.reflang.ast.AST;
import duro.reflang.ast.ASTClosure;
import duro.reflang.ast.ASTToCode;
import duro.runtime.Instruction;

public interface PrimitiveVisitorFactory2 {
	PrimitiveVisitor2 create(ASTToCode visitor, CodeEmitter instructions, boolean mustBeExpression);
	
	public static class ConstInstruction implements PrimitiveVisitorFactory2 {
		private Instruction instruction;
		private boolean doesReturn;

		public ConstInstruction(Instruction instruction, boolean doesReturn) {
			this.instruction = instruction;
			this.doesReturn = doesReturn;
		}
		
		@Override
		public PrimitiveVisitor2 create(ASTToCode visitor, CodeEmitter instructions, boolean mustBeExpression) {
			return new PrimitiveVisitor2() {
				@Override
				public void visitPrimitive(String id, AST[] args) {
					for(AST arg: args)
						visitor.visitAsExpression(arg);
					
					instructions.addSingle(instruction);
					if(mustBeExpression && !doesReturn)
						instructions.addSingle(new Instruction(Instruction.OPCODE_LOAD_NULL));
				}
			};
		}
	}
	
	public static class Util {
		public static void acceptClosureBodyOrCall(ASTToCode visitor, AST expression, CodeEmitter instructions, boolean mustBeExpression) {
			if(expression instanceof ASTClosure) {
				ASTClosure closure = (ASTClosure)expression;
				visitor.visit(closure.body, mustBeExpression);
			} else {
				instructions.addSingle(new Instruction(Instruction.OPCODE_CALL_CLOSURE_0));
			}
		}
	}

	public static class IfElse implements PrimitiveVisitorFactory2 {
		@Override
		public PrimitiveVisitor2 create(ASTToCode visitor, CodeEmitter instructions, boolean mustBeExpression) {
			return new PrimitiveVisitor2() {
				@Override
				public void visitPrimitive(String id, AST[] args) {
					AST condition = args[0];
					AST trueBlock = args[1];
					AST falseBlock = args.length > 2 ? args[2] : null;
					
					Util.acceptClosureBodyOrCall(visitor, condition, instructions, true);
					
					Label labelElse = new Label();
					Label labelEnd = new Label();
					
					instructions.jump(jump -> new Instruction(Instruction.OPCODE_IF_FALSE, jump), labelElse);
					
					Util.acceptClosureBodyOrCall(visitor, trueBlock, instructions, mustBeExpression);
					
					instructions.jump(jump -> new Instruction(Instruction.OPCODE_JUMP, jump), labelEnd);

					instructions.label(labelElse);

					if(falseBlock != null) {
						Util.acceptClosureBodyOrCall(visitor, falseBlock, instructions, mustBeExpression);
					} else {
						if(mustBeExpression)
							instructions.addSingle(new Instruction(Instruction.OPCODE_LOAD_NULL));
					}

					instructions.label(labelEnd);
				}

			};
		}
	}
	
	public static class While implements PrimitiveVisitorFactory2 {
		@Override
		public PrimitiveVisitor2 create(ASTToCode visitor, CodeEmitter instructions, boolean mustBeExpression) {
			return new PrimitiveVisitor2() {
				@Override
				public void visitPrimitive(String id, AST[] args) {
					AST condition = args[0];
					AST body = args[1];
					
					Label labelLoop = new Label();
					Label labelEnd = new Label();

					instructions.label(labelLoop);
					Util.acceptClosureBodyOrCall(visitor, condition, instructions, true);
					
					instructions.jump(jump -> new Instruction(Instruction.OPCODE_IF_FALSE, jump), labelEnd);
					
					Util.acceptClosureBodyOrCall(visitor, body, instructions, false);
					
					instructions.jump(jump -> new Instruction(Instruction.OPCODE_JUMP, jump), labelLoop);
					
					instructions.label(labelEnd);
					
					if(mustBeExpression)
						instructions.addSingle(new Instruction(Instruction.OPCODE_LOAD_NULL));
				}
			};
		}
	}
	
	public static class Eval implements PrimitiveVisitorFactory2 {
		@Override
		public PrimitiveVisitor2 create(ASTToCode visitor, CodeEmitter instructions, boolean mustBeExpression) {
			return new PrimitiveVisitor2() {
				@Override
				public void visitPrimitive(String id, AST[] args) {
					// Append eval arguments first
					AST closureArg = args[0];
					for(int i = 1; i < args.length; i++)
						visitor.visitAsExpression(args[i]);
					// Then closure
					visitor.visitAsExpression(closureArg);
					
					int closureArgCount = args.length - 1;
					
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
