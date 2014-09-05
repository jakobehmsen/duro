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
	 * Enter a parse tree produced by {@link DuroParser#assignment}.
	 * @param ctx the parse tree
	 */
	void enterAssignment(@NotNull DuroParser.AssignmentContext ctx);
	/**
	 * Exit a parse tree produced by {@link DuroParser#assignment}.
	 * @param ctx the parse tree
	 */
	void exitAssignment(@NotNull DuroParser.AssignmentContext ctx);

	/**
	 * Enter a parse tree produced by {@link DuroParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatement(@NotNull DuroParser.StatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link DuroParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatement(@NotNull DuroParser.StatementContext ctx);

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
	 * Enter a parse tree produced by {@link DuroParser#literal}.
	 * @param ctx the parse tree
	 */
	void enterLiteral(@NotNull DuroParser.LiteralContext ctx);
	/**
	 * Exit a parse tree produced by {@link DuroParser#literal}.
	 * @param ctx the parse tree
	 */
	void exitLiteral(@NotNull DuroParser.LiteralContext ctx);
}