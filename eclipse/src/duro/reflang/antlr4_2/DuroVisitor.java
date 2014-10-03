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
	 * Visit a parse tree produced by {@link DuroParser#string}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitString(@NotNull DuroParser.StringContext ctx);

	/**
	 * Visit a parse tree produced by {@link DuroParser#multiArgMessageArgsWithPar}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMultiArgMessageArgsWithPar(@NotNull DuroParser.MultiArgMessageArgsWithParContext ctx);

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
	 * Visit a parse tree produced by {@link DuroParser#selfMultiArgMessageWithPar}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSelfMultiArgMessageWithPar(@NotNull DuroParser.SelfMultiArgMessageWithParContext ctx);

	/**
	 * Visit a parse tree produced by {@link DuroParser#multiArgMessageNoPar}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMultiArgMessageNoPar(@NotNull DuroParser.MultiArgMessageNoParContext ctx);

	/**
	 * Visit a parse tree produced by {@link DuroParser#multiArgMessageArgWithPar}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMultiArgMessageArgWithPar(@NotNull DuroParser.MultiArgMessageArgWithParContext ctx);

	/**
	 * Visit a parse tree produced by {@link DuroParser#multiArgMessageArgNoPar}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMultiArgMessageArgNoPar(@NotNull DuroParser.MultiArgMessageArgNoParContext ctx);

	/**
	 * Visit a parse tree produced by {@link DuroParser#multiArgMessageWithPar}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMultiArgMessageWithPar(@NotNull DuroParser.MultiArgMessageWithParContext ctx);

	/**
	 * Visit a parse tree produced by {@link DuroParser#dict}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDict(@NotNull DuroParser.DictContext ctx);

	/**
	 * Visit a parse tree produced by {@link DuroParser#binaryMessageOperandChain}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBinaryMessageOperandChain(@NotNull DuroParser.BinaryMessageOperandChainContext ctx);

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
	 * Visit a parse tree produced by {@link DuroParser#multiArgMessageArgNoParChain}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMultiArgMessageArgNoParChain(@NotNull DuroParser.MultiArgMessageArgNoParChainContext ctx);

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
	 * Visit a parse tree produced by {@link DuroParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpression(@NotNull DuroParser.ExpressionContext ctx);

	/**
	 * Visit a parse tree produced by {@link DuroParser#receiver}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReceiver(@NotNull DuroParser.ReceiverContext ctx);

	/**
	 * Visit a parse tree produced by {@link DuroParser#selfMultiArgMessageNoPar}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSelfMultiArgMessageNoPar(@NotNull DuroParser.SelfMultiArgMessageNoParContext ctx);

	/**
	 * Visit a parse tree produced by {@link DuroParser#assignment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignment(@NotNull DuroParser.AssignmentContext ctx);

	/**
	 * Visit a parse tree produced by {@link DuroParser#slotAssignment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSlotAssignment(@NotNull DuroParser.SlotAssignmentContext ctx);

	/**
	 * Visit a parse tree produced by {@link DuroParser#behaviorParams}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBehaviorParams(@NotNull DuroParser.BehaviorParamsContext ctx);

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
	 * Visit a parse tree produced by {@link DuroParser#multiArgMessageArgsNoPar}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMultiArgMessageArgsNoPar(@NotNull DuroParser.MultiArgMessageArgsNoParContext ctx);

	/**
	 * Visit a parse tree produced by {@link DuroParser#messageChain}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMessageChain(@NotNull DuroParser.MessageChainContext ctx);

	/**
	 * Visit a parse tree produced by {@link DuroParser#indexAssignment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIndexAssignment(@NotNull DuroParser.IndexAssignmentContext ctx);
}