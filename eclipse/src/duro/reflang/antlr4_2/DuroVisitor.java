// Generated from C:\github\duro\eclipse\src\duro\reflang\antlr4_2\Duro.g4 by ANTLR 4.1
package duro.reflang.antlr4_2;
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
	 * Visit a parse tree produced by {@link DuroParser#pseudoVar}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPseudoVar(@NotNull DuroParser.PseudoVarContext ctx);

	/**
	 * Visit a parse tree produced by {@link DuroParser#variableAssignment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariableAssignment(@NotNull DuroParser.VariableAssignmentContext ctx);

	/**
	 * Visit a parse tree produced by {@link DuroParser#access}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAccess(@NotNull DuroParser.AccessContext ctx);

	/**
	 * Visit a parse tree produced by {@link DuroParser#binaryMessageOperand}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBinaryMessageOperand(@NotNull DuroParser.BinaryMessageOperandContext ctx);

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
	 * Visit a parse tree produced by {@link DuroParser#dictEntry}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDictEntry(@NotNull DuroParser.DictEntryContext ctx);

	/**
	 * Visit a parse tree produced by {@link DuroParser#literal}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLiteral(@NotNull DuroParser.LiteralContext ctx);

	/**
	 * Visit a parse tree produced by {@link DuroParser#multiArgMessageArg}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMultiArgMessageArg(@NotNull DuroParser.MultiArgMessageArgContext ctx);

	/**
	 * Visit a parse tree produced by {@link DuroParser#rootExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRootExpression(@NotNull DuroParser.RootExpressionContext ctx);

	/**
	 * Visit a parse tree produced by {@link DuroParser#multiArgMessage}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMultiArgMessage(@NotNull DuroParser.MultiArgMessageContext ctx);

	/**
	 * Visit a parse tree produced by {@link DuroParser#multiArgMessageArgs}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMultiArgMessageArgs(@NotNull DuroParser.MultiArgMessageArgsContext ctx);

	/**
	 * Visit a parse tree produced by {@link DuroParser#dict}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDict(@NotNull DuroParser.DictContext ctx);

	/**
	 * Visit a parse tree produced by {@link DuroParser#selector}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSelector(@NotNull DuroParser.SelectorContext ctx);

	/**
	 * Visit a parse tree produced by {@link DuroParser#id}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitId(@NotNull DuroParser.IdContext ctx);

	/**
	 * Visit a parse tree produced by {@link DuroParser#nonBinaryMessage}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNonBinaryMessage(@NotNull DuroParser.NonBinaryMessageContext ctx);

	/**
	 * Visit a parse tree produced by {@link DuroParser#slotAccess}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSlotAccess(@NotNull DuroParser.SlotAccessContext ctx);

	/**
	 * Visit a parse tree produced by {@link DuroParser#closure}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClosure(@NotNull DuroParser.ClosureContext ctx);

	/**
	 * Visit a parse tree produced by {@link DuroParser#parArg}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParArg(@NotNull DuroParser.ParArgContext ctx);

	/**
	 * Visit a parse tree produced by {@link DuroParser#topExpressions}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTopExpressions(@NotNull DuroParser.TopExpressionsContext ctx);

	/**
	 * Visit a parse tree produced by {@link DuroParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpression(@NotNull DuroParser.ExpressionContext ctx);

	/**
	 * Visit a parse tree produced by {@link DuroParser#slotAssignment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSlotAssignment(@NotNull DuroParser.SlotAssignmentContext ctx);

	/**
	 * Visit a parse tree produced by {@link DuroParser#returnExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReturnExpr(@NotNull DuroParser.ReturnExprContext ctx);

	/**
	 * Visit a parse tree produced by {@link DuroParser#behaviorParams}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBehaviorParams(@NotNull DuroParser.BehaviorParamsContext ctx);

	/**
	 * Visit a parse tree produced by {@link DuroParser#message}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMessage(@NotNull DuroParser.MessageContext ctx);

	/**
	 * Visit a parse tree produced by {@link DuroParser#indexOperator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIndexOperator(@NotNull DuroParser.IndexOperatorContext ctx);

	/**
	 * Visit a parse tree produced by {@link DuroParser#grouping}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGrouping(@NotNull DuroParser.GroupingContext ctx);

	/**
	 * Visit a parse tree produced by {@link DuroParser#selfMessageExchange}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSelfMessageExchange(@NotNull DuroParser.SelfMessageExchangeContext ctx);

	/**
	 * Visit a parse tree produced by {@link DuroParser#indexAssign}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIndexAssign(@NotNull DuroParser.IndexAssignContext ctx);

	/**
	 * Visit a parse tree produced by {@link DuroParser#variableDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariableDeclaration(@NotNull DuroParser.VariableDeclarationContext ctx);

	/**
	 * Visit a parse tree produced by {@link DuroParser#binaryMessage}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBinaryMessage(@NotNull DuroParser.BinaryMessageContext ctx);

	/**
	 * Visit a parse tree produced by {@link DuroParser#indexAccess}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIndexAccess(@NotNull DuroParser.IndexAccessContext ctx);

	/**
	 * Visit a parse tree produced by {@link DuroParser#binaryOperator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBinaryOperator(@NotNull DuroParser.BinaryOperatorContext ctx);

	/**
	 * Visit a parse tree produced by {@link DuroParser#messageExchange}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMessageExchange(@NotNull DuroParser.MessageExchangeContext ctx);

	/**
	 * Visit a parse tree produced by {@link DuroParser#atom}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAtom(@NotNull DuroParser.AtomContext ctx);
}