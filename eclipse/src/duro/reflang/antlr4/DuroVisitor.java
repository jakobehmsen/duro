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
	 * Visit a parse tree produced by {@link DuroParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpression(@NotNull DuroParser.ExpressionContext ctx);

	/**
	 * Visit a parse tree produced by {@link DuroParser#assignment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignment(@NotNull DuroParser.AssignmentContext ctx);

	/**
	 * Visit a parse tree produced by {@link DuroParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatement(@NotNull DuroParser.StatementContext ctx);

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