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
	 * Visit a parse tree produced by {@link DuroParser#variableStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariableStatement(@NotNull DuroParser.VariableStatementContext ctx);

	/**
	 * Visit a parse tree produced by {@link DuroParser#variableDeclation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariableDeclation(@NotNull DuroParser.VariableDeclationContext ctx);

	/**
	 * Visit a parse tree produced by {@link DuroParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpression(@NotNull DuroParser.ExpressionContext ctx);

	/**
	 * Visit a parse tree produced by {@link DuroParser#variableAssignment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariableAssignment(@NotNull DuroParser.VariableAssignmentContext ctx);

	/**
	 * Visit a parse tree produced by {@link DuroParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatement(@NotNull DuroParser.StatementContext ctx);

	/**
	 * Visit a parse tree produced by {@link DuroParser#variableDeclarationAndAssignment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariableDeclarationAndAssignment(@NotNull DuroParser.VariableDeclarationAndAssignmentContext ctx);

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
	 * Visit a parse tree produced by {@link DuroParser#topExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTopExpression(@NotNull DuroParser.TopExpressionContext ctx);

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
	 * Visit a parse tree produced by {@link DuroParser#literal}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLiteral(@NotNull DuroParser.LiteralContext ctx);
}