// Generated from C:\github\duro\eclipse\src\duro\reflang\antlr4\Duro.g4 by ANTLR 4.1
package duro.reflang.antlr4;
import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link DuroParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface DuroVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link DuroParser#variableAssignment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariableAssignment(@NotNull DuroParser.VariableAssignmentContext ctx);

	/**
	 * Visit a parse tree produced by {@link DuroParser#binaryExpression1}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBinaryExpression1(@NotNull DuroParser.BinaryExpression1Context ctx);

	/**
	 * Visit a parse tree produced by {@link DuroParser#bool}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBool(@NotNull DuroParser.BoolContext ctx);

	/**
	 * Visit a parse tree produced by {@link DuroParser#binaryExpression2}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBinaryExpression2(@NotNull DuroParser.BinaryExpression2Context ctx);

	/**
	 * Visit a parse tree produced by {@link DuroParser#program}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProgram(@NotNull DuroParser.ProgramContext ctx);

	/**
	 * Visit a parse tree produced by {@link DuroParser#integer}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInteger(@NotNull DuroParser.IntegerContext ctx);

	/**
	 * Visit a parse tree produced by {@link DuroParser#returnStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReturnStatement(@NotNull DuroParser.ReturnStatementContext ctx);

	/**
	 * Visit a parse tree produced by {@link DuroParser#topExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTopExpression(@NotNull DuroParser.TopExpressionContext ctx);

	/**
	 * Visit a parse tree produced by {@link DuroParser#literal}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLiteral(@NotNull DuroParser.LiteralContext ctx);

	/**
	 * Visit a parse tree produced by {@link DuroParser#variableStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariableStatement(@NotNull DuroParser.VariableStatementContext ctx);

	/**
	 * Visit a parse tree produced by {@link DuroParser#programElement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProgramElement(@NotNull DuroParser.ProgramElementContext ctx);

	/**
	 * Visit a parse tree produced by {@link DuroParser#primitiveOperand}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrimitiveOperand(@NotNull DuroParser.PrimitiveOperandContext ctx);

	/**
	 * Visit a parse tree produced by {@link DuroParser#ifStatementOnTrue}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIfStatementOnTrue(@NotNull DuroParser.IfStatementOnTrueContext ctx);

	/**
	 * Visit a parse tree produced by {@link DuroParser#functionParameters}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionParameters(@NotNull DuroParser.FunctionParametersContext ctx);

	/**
	 * Visit a parse tree produced by {@link DuroParser#ifStatementOnFalse}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIfStatementOnFalse(@NotNull DuroParser.IfStatementOnFalseContext ctx);

	/**
	 * Visit a parse tree produced by {@link DuroParser#lookup}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLookup(@NotNull DuroParser.LookupContext ctx);

	/**
	 * Visit a parse tree produced by {@link DuroParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpression(@NotNull DuroParser.ExpressionContext ctx);

	/**
	 * Visit a parse tree produced by {@link DuroParser#functionDefinition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionDefinition(@NotNull DuroParser.FunctionDefinitionContext ctx);

	/**
	 * Visit a parse tree produced by {@link DuroParser#variableDeclarationAndAssignment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariableDeclarationAndAssignment(@NotNull DuroParser.VariableDeclarationAndAssignmentContext ctx);

	/**
	 * Visit a parse tree produced by {@link DuroParser#ifStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIfStatement(@NotNull DuroParser.IfStatementContext ctx);

	/**
	 * Visit a parse tree produced by {@link DuroParser#ifStatementCondition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIfStatementCondition(@NotNull DuroParser.IfStatementConditionContext ctx);

	/**
	 * Visit a parse tree produced by {@link DuroParser#binaryExpression2Application}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBinaryExpression2Application(@NotNull DuroParser.BinaryExpression2ApplicationContext ctx);

	/**
	 * Visit a parse tree produced by {@link DuroParser#programElements}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProgramElements(@NotNull DuroParser.ProgramElementsContext ctx);

	/**
	 * Visit a parse tree produced by {@link DuroParser#pause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPause(@NotNull DuroParser.PauseContext ctx);

	/**
	 * Visit a parse tree produced by {@link DuroParser#variableDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariableDeclaration(@NotNull DuroParser.VariableDeclarationContext ctx);

	/**
	 * Visit a parse tree produced by {@link DuroParser#primitiveCall}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrimitiveCall(@NotNull DuroParser.PrimitiveCallContext ctx);

	/**
	 * Visit a parse tree produced by {@link DuroParser#binaryExpression1Application}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBinaryExpression1Application(@NotNull DuroParser.BinaryExpression1ApplicationContext ctx);

	/**
	 * Visit a parse tree produced by {@link DuroParser#elseStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitElseStatement(@NotNull DuroParser.ElseStatementContext ctx);

	/**
	 * Visit a parse tree produced by {@link DuroParser#thisMessageExchange}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitThisMessageExchange(@NotNull DuroParser.ThisMessageExchangeContext ctx);

	/**
	 * Visit a parse tree produced by {@link DuroParser#messageExchange}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMessageExchange(@NotNull DuroParser.MessageExchangeContext ctx);

	/**
	 * Visit a parse tree produced by {@link DuroParser#undelimitedStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUndelimitedStatement(@NotNull DuroParser.UndelimitedStatementContext ctx);

	/**
	 * Visit a parse tree produced by {@link DuroParser#primitiveBody}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrimitiveBody(@NotNull DuroParser.PrimitiveBodyContext ctx);

	/**
	 * Visit a parse tree produced by {@link DuroParser#functionBody}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionBody(@NotNull DuroParser.FunctionBodyContext ctx);

	/**
	 * Visit a parse tree produced by {@link DuroParser#delimitedStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDelimitedStatement(@NotNull DuroParser.DelimitedStatementContext ctx);

	/**
	 * Visit a parse tree produced by {@link DuroParser#binaryExpression2Operand}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBinaryExpression2Operand(@NotNull DuroParser.BinaryExpression2OperandContext ctx);
}