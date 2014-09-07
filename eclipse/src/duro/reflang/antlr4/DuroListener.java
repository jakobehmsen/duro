// Generated from C:\github\duro\eclipse\src\duro\reflang\antlr4\Duro.g4 by ANTLR 4.1
package duro.reflang.antlr4;
import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link DuroParser}.
 */
public interface DuroListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link DuroParser#variableAssignment}.
	 * @param ctx the parse tree
	 */
	void enterVariableAssignment(@NotNull DuroParser.VariableAssignmentContext ctx);
	/**
	 * Exit a parse tree produced by {@link DuroParser#variableAssignment}.
	 * @param ctx the parse tree
	 */
	void exitVariableAssignment(@NotNull DuroParser.VariableAssignmentContext ctx);

	/**
	 * Enter a parse tree produced by {@link DuroParser#binaryExpression1}.
	 * @param ctx the parse tree
	 */
	void enterBinaryExpression1(@NotNull DuroParser.BinaryExpression1Context ctx);
	/**
	 * Exit a parse tree produced by {@link DuroParser#binaryExpression1}.
	 * @param ctx the parse tree
	 */
	void exitBinaryExpression1(@NotNull DuroParser.BinaryExpression1Context ctx);

	/**
	 * Enter a parse tree produced by {@link DuroParser#bool}.
	 * @param ctx the parse tree
	 */
	void enterBool(@NotNull DuroParser.BoolContext ctx);
	/**
	 * Exit a parse tree produced by {@link DuroParser#bool}.
	 * @param ctx the parse tree
	 */
	void exitBool(@NotNull DuroParser.BoolContext ctx);

	/**
	 * Enter a parse tree produced by {@link DuroParser#string}.
	 * @param ctx the parse tree
	 */
	void enterString(@NotNull DuroParser.StringContext ctx);
	/**
	 * Exit a parse tree produced by {@link DuroParser#string}.
	 * @param ctx the parse tree
	 */
	void exitString(@NotNull DuroParser.StringContext ctx);

	/**
	 * Enter a parse tree produced by {@link DuroParser#binaryExpression2}.
	 * @param ctx the parse tree
	 */
	void enterBinaryExpression2(@NotNull DuroParser.BinaryExpression2Context ctx);
	/**
	 * Exit a parse tree produced by {@link DuroParser#binaryExpression2}.
	 * @param ctx the parse tree
	 */
	void exitBinaryExpression2(@NotNull DuroParser.BinaryExpression2Context ctx);

	/**
	 * Enter a parse tree produced by {@link DuroParser#program}.
	 * @param ctx the parse tree
	 */
	void enterProgram(@NotNull DuroParser.ProgramContext ctx);
	/**
	 * Exit a parse tree produced by {@link DuroParser#program}.
	 * @param ctx the parse tree
	 */
	void exitProgram(@NotNull DuroParser.ProgramContext ctx);

	/**
	 * Enter a parse tree produced by {@link DuroParser#integer}.
	 * @param ctx the parse tree
	 */
	void enterInteger(@NotNull DuroParser.IntegerContext ctx);
	/**
	 * Exit a parse tree produced by {@link DuroParser#integer}.
	 * @param ctx the parse tree
	 */
	void exitInteger(@NotNull DuroParser.IntegerContext ctx);

	/**
	 * Enter a parse tree produced by {@link DuroParser#returnStatement}.
	 * @param ctx the parse tree
	 */
	void enterReturnStatement(@NotNull DuroParser.ReturnStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link DuroParser#returnStatement}.
	 * @param ctx the parse tree
	 */
	void exitReturnStatement(@NotNull DuroParser.ReturnStatementContext ctx);

	/**
	 * Enter a parse tree produced by {@link DuroParser#topExpression}.
	 * @param ctx the parse tree
	 */
	void enterTopExpression(@NotNull DuroParser.TopExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link DuroParser#topExpression}.
	 * @param ctx the parse tree
	 */
	void exitTopExpression(@NotNull DuroParser.TopExpressionContext ctx);

	/**
	 * Enter a parse tree produced by {@link DuroParser#whileStatementBody}.
	 * @param ctx the parse tree
	 */
	void enterWhileStatementBody(@NotNull DuroParser.WhileStatementBodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link DuroParser#whileStatementBody}.
	 * @param ctx the parse tree
	 */
	void exitWhileStatementBody(@NotNull DuroParser.WhileStatementBodyContext ctx);

	/**
	 * Enter a parse tree produced by {@link DuroParser#literal}.
	 * @param ctx the parse tree
	 */
	void enterLiteral(@NotNull DuroParser.LiteralContext ctx);
	/**
	 * Exit a parse tree produced by {@link DuroParser#literal}.
	 * @param ctx the parse tree
	 */
	void exitLiteral(@NotNull DuroParser.LiteralContext ctx);

	/**
	 * Enter a parse tree produced by {@link DuroParser#variableStatement}.
	 * @param ctx the parse tree
	 */
	void enterVariableStatement(@NotNull DuroParser.VariableStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link DuroParser#variableStatement}.
	 * @param ctx the parse tree
	 */
	void exitVariableStatement(@NotNull DuroParser.VariableStatementContext ctx);

	/**
	 * Enter a parse tree produced by {@link DuroParser#programElement}.
	 * @param ctx the parse tree
	 */
	void enterProgramElement(@NotNull DuroParser.ProgramElementContext ctx);
	/**
	 * Exit a parse tree produced by {@link DuroParser#programElement}.
	 * @param ctx the parse tree
	 */
	void exitProgramElement(@NotNull DuroParser.ProgramElementContext ctx);

	/**
	 * Enter a parse tree produced by {@link DuroParser#primitiveOperand}.
	 * @param ctx the parse tree
	 */
	void enterPrimitiveOperand(@NotNull DuroParser.PrimitiveOperandContext ctx);
	/**
	 * Exit a parse tree produced by {@link DuroParser#primitiveOperand}.
	 * @param ctx the parse tree
	 */
	void exitPrimitiveOperand(@NotNull DuroParser.PrimitiveOperandContext ctx);

	/**
	 * Enter a parse tree produced by {@link DuroParser#ifStatementOnTrue}.
	 * @param ctx the parse tree
	 */
	void enterIfStatementOnTrue(@NotNull DuroParser.IfStatementOnTrueContext ctx);
	/**
	 * Exit a parse tree produced by {@link DuroParser#ifStatementOnTrue}.
	 * @param ctx the parse tree
	 */
	void exitIfStatementOnTrue(@NotNull DuroParser.IfStatementOnTrueContext ctx);

	/**
	 * Enter a parse tree produced by {@link DuroParser#operationChain}.
	 * @param ctx the parse tree
	 */
	void enterOperationChain(@NotNull DuroParser.OperationChainContext ctx);
	/**
	 * Exit a parse tree produced by {@link DuroParser#operationChain}.
	 * @param ctx the parse tree
	 */
	void exitOperationChain(@NotNull DuroParser.OperationChainContext ctx);

	/**
	 * Enter a parse tree produced by {@link DuroParser#functionParameters}.
	 * @param ctx the parse tree
	 */
	void enterFunctionParameters(@NotNull DuroParser.FunctionParametersContext ctx);
	/**
	 * Exit a parse tree produced by {@link DuroParser#functionParameters}.
	 * @param ctx the parse tree
	 */
	void exitFunctionParameters(@NotNull DuroParser.FunctionParametersContext ctx);

	/**
	 * Enter a parse tree produced by {@link DuroParser#ifStatementOnFalse}.
	 * @param ctx the parse tree
	 */
	void enterIfStatementOnFalse(@NotNull DuroParser.IfStatementOnFalseContext ctx);
	/**
	 * Exit a parse tree produced by {@link DuroParser#ifStatementOnFalse}.
	 * @param ctx the parse tree
	 */
	void exitIfStatementOnFalse(@NotNull DuroParser.IfStatementOnFalseContext ctx);

	/**
	 * Enter a parse tree produced by {@link DuroParser#lookup}.
	 * @param ctx the parse tree
	 */
	void enterLookup(@NotNull DuroParser.LookupContext ctx);
	/**
	 * Exit a parse tree produced by {@link DuroParser#lookup}.
	 * @param ctx the parse tree
	 */
	void exitLookup(@NotNull DuroParser.LookupContext ctx);

	/**
	 * Enter a parse tree produced by {@link DuroParser#whileStatementCondition}.
	 * @param ctx the parse tree
	 */
	void enterWhileStatementCondition(@NotNull DuroParser.WhileStatementConditionContext ctx);
	/**
	 * Exit a parse tree produced by {@link DuroParser#whileStatementCondition}.
	 * @param ctx the parse tree
	 */
	void exitWhileStatementCondition(@NotNull DuroParser.WhileStatementConditionContext ctx);

	/**
	 * Enter a parse tree produced by {@link DuroParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpression(@NotNull DuroParser.ExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link DuroParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpression(@NotNull DuroParser.ExpressionContext ctx);

	/**
	 * Enter a parse tree produced by {@link DuroParser#functionDefinition}.
	 * @param ctx the parse tree
	 */
	void enterFunctionDefinition(@NotNull DuroParser.FunctionDefinitionContext ctx);
	/**
	 * Exit a parse tree produced by {@link DuroParser#functionDefinition}.
	 * @param ctx the parse tree
	 */
	void exitFunctionDefinition(@NotNull DuroParser.FunctionDefinitionContext ctx);

	/**
	 * Enter a parse tree produced by {@link DuroParser#propertySet}.
	 * @param ctx the parse tree
	 */
	void enterPropertySet(@NotNull DuroParser.PropertySetContext ctx);
	/**
	 * Exit a parse tree produced by {@link DuroParser#propertySet}.
	 * @param ctx the parse tree
	 */
	void exitPropertySet(@NotNull DuroParser.PropertySetContext ctx);

	/**
	 * Enter a parse tree produced by {@link DuroParser#variableDeclarationAndAssignment}.
	 * @param ctx the parse tree
	 */
	void enterVariableDeclarationAndAssignment(@NotNull DuroParser.VariableDeclarationAndAssignmentContext ctx);
	/**
	 * Exit a parse tree produced by {@link DuroParser#variableDeclarationAndAssignment}.
	 * @param ctx the parse tree
	 */
	void exitVariableDeclarationAndAssignment(@NotNull DuroParser.VariableDeclarationAndAssignmentContext ctx);

	/**
	 * Enter a parse tree produced by {@link DuroParser#ifStatement}.
	 * @param ctx the parse tree
	 */
	void enterIfStatement(@NotNull DuroParser.IfStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link DuroParser#ifStatement}.
	 * @param ctx the parse tree
	 */
	void exitIfStatement(@NotNull DuroParser.IfStatementContext ctx);

	/**
	 * Enter a parse tree produced by {@link DuroParser#ifStatementCondition}.
	 * @param ctx the parse tree
	 */
	void enterIfStatementCondition(@NotNull DuroParser.IfStatementConditionContext ctx);
	/**
	 * Exit a parse tree produced by {@link DuroParser#ifStatementCondition}.
	 * @param ctx the parse tree
	 */
	void exitIfStatementCondition(@NotNull DuroParser.IfStatementConditionContext ctx);

	/**
	 * Enter a parse tree produced by {@link DuroParser#propertyGet}.
	 * @param ctx the parse tree
	 */
	void enterPropertyGet(@NotNull DuroParser.PropertyGetContext ctx);
	/**
	 * Exit a parse tree produced by {@link DuroParser#propertyGet}.
	 * @param ctx the parse tree
	 */
	void exitPropertyGet(@NotNull DuroParser.PropertyGetContext ctx);

	/**
	 * Enter a parse tree produced by {@link DuroParser#binaryExpression2Application}.
	 * @param ctx the parse tree
	 */
	void enterBinaryExpression2Application(@NotNull DuroParser.BinaryExpression2ApplicationContext ctx);
	/**
	 * Exit a parse tree produced by {@link DuroParser#binaryExpression2Application}.
	 * @param ctx the parse tree
	 */
	void exitBinaryExpression2Application(@NotNull DuroParser.BinaryExpression2ApplicationContext ctx);

	/**
	 * Enter a parse tree produced by {@link DuroParser#programElements}.
	 * @param ctx the parse tree
	 */
	void enterProgramElements(@NotNull DuroParser.ProgramElementsContext ctx);
	/**
	 * Exit a parse tree produced by {@link DuroParser#programElements}.
	 * @param ctx the parse tree
	 */
	void exitProgramElements(@NotNull DuroParser.ProgramElementsContext ctx);

	/**
	 * Enter a parse tree produced by {@link DuroParser#pause}.
	 * @param ctx the parse tree
	 */
	void enterPause(@NotNull DuroParser.PauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link DuroParser#pause}.
	 * @param ctx the parse tree
	 */
	void exitPause(@NotNull DuroParser.PauseContext ctx);

	/**
	 * Enter a parse tree produced by {@link DuroParser#variableDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterVariableDeclaration(@NotNull DuroParser.VariableDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link DuroParser#variableDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitVariableDeclaration(@NotNull DuroParser.VariableDeclarationContext ctx);

	/**
	 * Enter a parse tree produced by {@link DuroParser#whileStatement}.
	 * @param ctx the parse tree
	 */
	void enterWhileStatement(@NotNull DuroParser.WhileStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link DuroParser#whileStatement}.
	 * @param ctx the parse tree
	 */
	void exitWhileStatement(@NotNull DuroParser.WhileStatementContext ctx);

	/**
	 * Enter a parse tree produced by {@link DuroParser#primitiveCall}.
	 * @param ctx the parse tree
	 */
	void enterPrimitiveCall(@NotNull DuroParser.PrimitiveCallContext ctx);
	/**
	 * Exit a parse tree produced by {@link DuroParser#primitiveCall}.
	 * @param ctx the parse tree
	 */
	void exitPrimitiveCall(@NotNull DuroParser.PrimitiveCallContext ctx);

	/**
	 * Enter a parse tree produced by {@link DuroParser#binaryExpression1Application}.
	 * @param ctx the parse tree
	 */
	void enterBinaryExpression1Application(@NotNull DuroParser.BinaryExpression1ApplicationContext ctx);
	/**
	 * Exit a parse tree produced by {@link DuroParser#binaryExpression1Application}.
	 * @param ctx the parse tree
	 */
	void exitBinaryExpression1Application(@NotNull DuroParser.BinaryExpression1ApplicationContext ctx);

	/**
	 * Enter a parse tree produced by {@link DuroParser#elseStatement}.
	 * @param ctx the parse tree
	 */
	void enterElseStatement(@NotNull DuroParser.ElseStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link DuroParser#elseStatement}.
	 * @param ctx the parse tree
	 */
	void exitElseStatement(@NotNull DuroParser.ElseStatementContext ctx);

	/**
	 * Enter a parse tree produced by {@link DuroParser#thisMessageExchange}.
	 * @param ctx the parse tree
	 */
	void enterThisMessageExchange(@NotNull DuroParser.ThisMessageExchangeContext ctx);
	/**
	 * Exit a parse tree produced by {@link DuroParser#thisMessageExchange}.
	 * @param ctx the parse tree
	 */
	void exitThisMessageExchange(@NotNull DuroParser.ThisMessageExchangeContext ctx);

	/**
	 * Enter a parse tree produced by {@link DuroParser#messageExchange}.
	 * @param ctx the parse tree
	 */
	void enterMessageExchange(@NotNull DuroParser.MessageExchangeContext ctx);
	/**
	 * Exit a parse tree produced by {@link DuroParser#messageExchange}.
	 * @param ctx the parse tree
	 */
	void exitMessageExchange(@NotNull DuroParser.MessageExchangeContext ctx);

	/**
	 * Enter a parse tree produced by {@link DuroParser#self}.
	 * @param ctx the parse tree
	 */
	void enterSelf(@NotNull DuroParser.SelfContext ctx);
	/**
	 * Exit a parse tree produced by {@link DuroParser#self}.
	 * @param ctx the parse tree
	 */
	void exitSelf(@NotNull DuroParser.SelfContext ctx);

	/**
	 * Enter a parse tree produced by {@link DuroParser#undelimitedStatement}.
	 * @param ctx the parse tree
	 */
	void enterUndelimitedStatement(@NotNull DuroParser.UndelimitedStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link DuroParser#undelimitedStatement}.
	 * @param ctx the parse tree
	 */
	void exitUndelimitedStatement(@NotNull DuroParser.UndelimitedStatementContext ctx);

	/**
	 * Enter a parse tree produced by {@link DuroParser#primitiveBody}.
	 * @param ctx the parse tree
	 */
	void enterPrimitiveBody(@NotNull DuroParser.PrimitiveBodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link DuroParser#primitiveBody}.
	 * @param ctx the parse tree
	 */
	void exitPrimitiveBody(@NotNull DuroParser.PrimitiveBodyContext ctx);

	/**
	 * Enter a parse tree produced by {@link DuroParser#functionBody}.
	 * @param ctx the parse tree
	 */
	void enterFunctionBody(@NotNull DuroParser.FunctionBodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link DuroParser#functionBody}.
	 * @param ctx the parse tree
	 */
	void exitFunctionBody(@NotNull DuroParser.FunctionBodyContext ctx);

	/**
	 * Enter a parse tree produced by {@link DuroParser#delimitedStatement}.
	 * @param ctx the parse tree
	 */
	void enterDelimitedStatement(@NotNull DuroParser.DelimitedStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link DuroParser#delimitedStatement}.
	 * @param ctx the parse tree
	 */
	void exitDelimitedStatement(@NotNull DuroParser.DelimitedStatementContext ctx);

	/**
	 * Enter a parse tree produced by {@link DuroParser#binaryExpression2Operand}.
	 * @param ctx the parse tree
	 */
	void enterBinaryExpression2Operand(@NotNull DuroParser.BinaryExpression2OperandContext ctx);
	/**
	 * Exit a parse tree produced by {@link DuroParser#binaryExpression2Operand}.
	 * @param ctx the parse tree
	 */
	void exitBinaryExpression2Operand(@NotNull DuroParser.BinaryExpression2OperandContext ctx);
}