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
	 * Enter a parse tree produced by {@link DuroParser#binaryExpressionGreaterLessApplication}.
	 * @param ctx the parse tree
	 */
	void enterBinaryExpressionGreaterLessApplication(@NotNull DuroParser.BinaryExpressionGreaterLessApplicationContext ctx);
	/**
	 * Exit a parse tree produced by {@link DuroParser#binaryExpressionGreaterLessApplication}.
	 * @param ctx the parse tree
	 */
	void exitBinaryExpressionGreaterLessApplication(@NotNull DuroParser.BinaryExpressionGreaterLessApplicationContext ctx);

	/**
	 * Enter a parse tree produced by {@link DuroParser#binaryExpressionLogicalOr}.
	 * @param ctx the parse tree
	 */
	void enterBinaryExpressionLogicalOr(@NotNull DuroParser.BinaryExpressionLogicalOrContext ctx);
	/**
	 * Exit a parse tree produced by {@link DuroParser#binaryExpressionLogicalOr}.
	 * @param ctx the parse tree
	 */
	void exitBinaryExpressionLogicalOr(@NotNull DuroParser.BinaryExpressionLogicalOrContext ctx);

	/**
	 * Enter a parse tree produced by {@link DuroParser#binaryExpressionLogicalAndApplication}.
	 * @param ctx the parse tree
	 */
	void enterBinaryExpressionLogicalAndApplication(@NotNull DuroParser.BinaryExpressionLogicalAndApplicationContext ctx);
	/**
	 * Exit a parse tree produced by {@link DuroParser#binaryExpressionLogicalAndApplication}.
	 * @param ctx the parse tree
	 */
	void exitBinaryExpressionLogicalAndApplication(@NotNull DuroParser.BinaryExpressionLogicalAndApplicationContext ctx);

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
	 * Enter a parse tree produced by {@link DuroParser#forStatementInitialization}.
	 * @param ctx the parse tree
	 */
	void enterForStatementInitialization(@NotNull DuroParser.ForStatementInitializationContext ctx);
	/**
	 * Exit a parse tree produced by {@link DuroParser#forStatementInitialization}.
	 * @param ctx the parse tree
	 */
	void exitForStatementInitialization(@NotNull DuroParser.ForStatementInitializationContext ctx);

	/**
	 * Enter a parse tree produced by {@link DuroParser#unaryExpressionNotApplication}.
	 * @param ctx the parse tree
	 */
	void enterUnaryExpressionNotApplication(@NotNull DuroParser.UnaryExpressionNotApplicationContext ctx);
	/**
	 * Exit a parse tree produced by {@link DuroParser#unaryExpressionNotApplication}.
	 * @param ctx the parse tree
	 */
	void exitUnaryExpressionNotApplication(@NotNull DuroParser.UnaryExpressionNotApplicationContext ctx);

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
	 * Enter a parse tree produced by {@link DuroParser#unaryExpressionPostIncDec}.
	 * @param ctx the parse tree
	 */
	void enterUnaryExpressionPostIncDec(@NotNull DuroParser.UnaryExpressionPostIncDecContext ctx);
	/**
	 * Exit a parse tree produced by {@link DuroParser#unaryExpressionPostIncDec}.
	 * @param ctx the parse tree
	 */
	void exitUnaryExpressionPostIncDec(@NotNull DuroParser.UnaryExpressionPostIncDecContext ctx);

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
	 * Enter a parse tree produced by {@link DuroParser#nil}.
	 * @param ctx the parse tree
	 */
	void enterNil(@NotNull DuroParser.NilContext ctx);
	/**
	 * Exit a parse tree produced by {@link DuroParser#nil}.
	 * @param ctx the parse tree
	 */
	void exitNil(@NotNull DuroParser.NilContext ctx);

	/**
	 * Enter a parse tree produced by {@link DuroParser#arrayOperand}.
	 * @param ctx the parse tree
	 */
	void enterArrayOperand(@NotNull DuroParser.ArrayOperandContext ctx);
	/**
	 * Exit a parse tree produced by {@link DuroParser#arrayOperand}.
	 * @param ctx the parse tree
	 */
	void exitArrayOperand(@NotNull DuroParser.ArrayOperandContext ctx);

	/**
	 * Enter a parse tree produced by {@link DuroParser#memberAssignmentValue}.
	 * @param ctx the parse tree
	 */
	void enterMemberAssignmentValue(@NotNull DuroParser.MemberAssignmentValueContext ctx);
	/**
	 * Exit a parse tree produced by {@link DuroParser#memberAssignmentValue}.
	 * @param ctx the parse tree
	 */
	void exitMemberAssignmentValue(@NotNull DuroParser.MemberAssignmentValueContext ctx);

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
	 * Enter a parse tree produced by {@link DuroParser#unaryExpressionPostIncDecApplicationVariable}.
	 * @param ctx the parse tree
	 */
	void enterUnaryExpressionPostIncDecApplicationVariable(@NotNull DuroParser.UnaryExpressionPostIncDecApplicationVariableContext ctx);
	/**
	 * Exit a parse tree produced by {@link DuroParser#unaryExpressionPostIncDecApplicationVariable}.
	 * @param ctx the parse tree
	 */
	void exitUnaryExpressionPostIncDecApplicationVariable(@NotNull DuroParser.UnaryExpressionPostIncDecApplicationVariableContext ctx);

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
	 * Enter a parse tree produced by {@link DuroParser#memberAccess}.
	 * @param ctx the parse tree
	 */
	void enterMemberAccess(@NotNull DuroParser.MemberAccessContext ctx);
	/**
	 * Exit a parse tree produced by {@link DuroParser#memberAccess}.
	 * @param ctx the parse tree
	 */
	void exitMemberAccess(@NotNull DuroParser.MemberAccessContext ctx);

	/**
	 * Enter a parse tree produced by {@link DuroParser#explicitMessageExchange}.
	 * @param ctx the parse tree
	 */
	void enterExplicitMessageExchange(@NotNull DuroParser.ExplicitMessageExchangeContext ctx);
	/**
	 * Exit a parse tree produced by {@link DuroParser#explicitMessageExchange}.
	 * @param ctx the parse tree
	 */
	void exitExplicitMessageExchange(@NotNull DuroParser.ExplicitMessageExchangeContext ctx);

	/**
	 * Enter a parse tree produced by {@link DuroParser#memberAssignment}.
	 * @param ctx the parse tree
	 */
	void enterMemberAssignment(@NotNull DuroParser.MemberAssignmentContext ctx);
	/**
	 * Exit a parse tree produced by {@link DuroParser#memberAssignment}.
	 * @param ctx the parse tree
	 */
	void exitMemberAssignment(@NotNull DuroParser.MemberAssignmentContext ctx);

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
	 * Enter a parse tree produced by {@link DuroParser#grouping}.
	 * @param ctx the parse tree
	 */
	void enterGrouping(@NotNull DuroParser.GroupingContext ctx);
	/**
	 * Exit a parse tree produced by {@link DuroParser#grouping}.
	 * @param ctx the parse tree
	 */
	void exitGrouping(@NotNull DuroParser.GroupingContext ctx);

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
	 * Enter a parse tree produced by {@link DuroParser#binaryExpressionArithmetic1Application}.
	 * @param ctx the parse tree
	 */
	void enterBinaryExpressionArithmetic1Application(@NotNull DuroParser.BinaryExpressionArithmetic1ApplicationContext ctx);
	/**
	 * Exit a parse tree produced by {@link DuroParser#binaryExpressionArithmetic1Application}.
	 * @param ctx the parse tree
	 */
	void exitBinaryExpressionArithmetic1Application(@NotNull DuroParser.BinaryExpressionArithmetic1ApplicationContext ctx);

	/**
	 * Enter a parse tree produced by {@link DuroParser#forStatementBody}.
	 * @param ctx the parse tree
	 */
	void enterForStatementBody(@NotNull DuroParser.ForStatementBodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link DuroParser#forStatementBody}.
	 * @param ctx the parse tree
	 */
	void exitForStatementBody(@NotNull DuroParser.ForStatementBodyContext ctx);

	/**
	 * Enter a parse tree produced by {@link DuroParser#unaryExpressionPostIncDecApplicationMemberAccess}.
	 * @param ctx the parse tree
	 */
	void enterUnaryExpressionPostIncDecApplicationMemberAccess(@NotNull DuroParser.UnaryExpressionPostIncDecApplicationMemberAccessContext ctx);
	/**
	 * Exit a parse tree produced by {@link DuroParser#unaryExpressionPostIncDecApplicationMemberAccess}.
	 * @param ctx the parse tree
	 */
	void exitUnaryExpressionPostIncDecApplicationMemberAccess(@NotNull DuroParser.UnaryExpressionPostIncDecApplicationMemberAccessContext ctx);

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
	 * Enter a parse tree produced by {@link DuroParser#binaryExpressionEquality}.
	 * @param ctx the parse tree
	 */
	void enterBinaryExpressionEquality(@NotNull DuroParser.BinaryExpressionEqualityContext ctx);
	/**
	 * Exit a parse tree produced by {@link DuroParser#binaryExpressionEquality}.
	 * @param ctx the parse tree
	 */
	void exitBinaryExpressionEquality(@NotNull DuroParser.BinaryExpressionEqualityContext ctx);

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
	 * Enter a parse tree produced by {@link DuroParser#functionLiteral}.
	 * @param ctx the parse tree
	 */
	void enterFunctionLiteral(@NotNull DuroParser.FunctionLiteralContext ctx);
	/**
	 * Exit a parse tree produced by {@link DuroParser#functionLiteral}.
	 * @param ctx the parse tree
	 */
	void exitFunctionLiteral(@NotNull DuroParser.FunctionLiteralContext ctx);

	/**
	 * Enter a parse tree produced by {@link DuroParser#unaryExpressionPostIncDecApplicationComputedMemberAccessReceiver}.
	 * @param ctx the parse tree
	 */
	void enterUnaryExpressionPostIncDecApplicationComputedMemberAccessReceiver(@NotNull DuroParser.UnaryExpressionPostIncDecApplicationComputedMemberAccessReceiverContext ctx);
	/**
	 * Exit a parse tree produced by {@link DuroParser#unaryExpressionPostIncDecApplicationComputedMemberAccessReceiver}.
	 * @param ctx the parse tree
	 */
	void exitUnaryExpressionPostIncDecApplicationComputedMemberAccessReceiver(@NotNull DuroParser.UnaryExpressionPostIncDecApplicationComputedMemberAccessReceiverContext ctx);

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
	 * Enter a parse tree produced by {@link DuroParser#binaryExpressionLogicalOrApplication}.
	 * @param ctx the parse tree
	 */
	void enterBinaryExpressionLogicalOrApplication(@NotNull DuroParser.BinaryExpressionLogicalOrApplicationContext ctx);
	/**
	 * Exit a parse tree produced by {@link DuroParser#binaryExpressionLogicalOrApplication}.
	 * @param ctx the parse tree
	 */
	void exitBinaryExpressionLogicalOrApplication(@NotNull DuroParser.BinaryExpressionLogicalOrApplicationContext ctx);

	/**
	 * Enter a parse tree produced by {@link DuroParser#binaryExpressionArithmetic2}.
	 * @param ctx the parse tree
	 */
	void enterBinaryExpressionArithmetic2(@NotNull DuroParser.BinaryExpressionArithmetic2Context ctx);
	/**
	 * Exit a parse tree produced by {@link DuroParser#binaryExpressionArithmetic2}.
	 * @param ctx the parse tree
	 */
	void exitBinaryExpressionArithmetic2(@NotNull DuroParser.BinaryExpressionArithmetic2Context ctx);

	/**
	 * Enter a parse tree produced by {@link DuroParser#binaryExpressionArithmetic1}.
	 * @param ctx the parse tree
	 */
	void enterBinaryExpressionArithmetic1(@NotNull DuroParser.BinaryExpressionArithmetic1Context ctx);
	/**
	 * Exit a parse tree produced by {@link DuroParser#binaryExpressionArithmetic1}.
	 * @param ctx the parse tree
	 */
	void exitBinaryExpressionArithmetic1(@NotNull DuroParser.BinaryExpressionArithmetic1Context ctx);

	/**
	 * Enter a parse tree produced by {@link DuroParser#binaryExpressionArithmetic2Application}.
	 * @param ctx the parse tree
	 */
	void enterBinaryExpressionArithmetic2Application(@NotNull DuroParser.BinaryExpressionArithmetic2ApplicationContext ctx);
	/**
	 * Exit a parse tree produced by {@link DuroParser#binaryExpressionArithmetic2Application}.
	 * @param ctx the parse tree
	 */
	void exitBinaryExpressionArithmetic2Application(@NotNull DuroParser.BinaryExpressionArithmetic2ApplicationContext ctx);

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
	 * Enter a parse tree produced by {@link DuroParser#unaryExpressionPostIncDecApplicationComputedMemberAccess}.
	 * @param ctx the parse tree
	 */
	void enterUnaryExpressionPostIncDecApplicationComputedMemberAccess(@NotNull DuroParser.UnaryExpressionPostIncDecApplicationComputedMemberAccessContext ctx);
	/**
	 * Exit a parse tree produced by {@link DuroParser#unaryExpressionPostIncDecApplicationComputedMemberAccess}.
	 * @param ctx the parse tree
	 */
	void exitUnaryExpressionPostIncDecApplicationComputedMemberAccess(@NotNull DuroParser.UnaryExpressionPostIncDecApplicationComputedMemberAccessContext ctx);

	/**
	 * Enter a parse tree produced by {@link DuroParser#delimitedProgramElement}.
	 * @param ctx the parse tree
	 */
	void enterDelimitedProgramElement(@NotNull DuroParser.DelimitedProgramElementContext ctx);
	/**
	 * Exit a parse tree produced by {@link DuroParser#delimitedProgramElement}.
	 * @param ctx the parse tree
	 */
	void exitDelimitedProgramElement(@NotNull DuroParser.DelimitedProgramElementContext ctx);

	/**
	 * Enter a parse tree produced by {@link DuroParser#unaryExpressionPostIncDecApplication}.
	 * @param ctx the parse tree
	 */
	void enterUnaryExpressionPostIncDecApplication(@NotNull DuroParser.UnaryExpressionPostIncDecApplicationContext ctx);
	/**
	 * Exit a parse tree produced by {@link DuroParser#unaryExpressionPostIncDecApplication}.
	 * @param ctx the parse tree
	 */
	void exitUnaryExpressionPostIncDecApplication(@NotNull DuroParser.UnaryExpressionPostIncDecApplicationContext ctx);

	/**
	 * Enter a parse tree produced by {@link DuroParser#computedMemberAssignmentValue}.
	 * @param ctx the parse tree
	 */
	void enterComputedMemberAssignmentValue(@NotNull DuroParser.ComputedMemberAssignmentValueContext ctx);
	/**
	 * Exit a parse tree produced by {@link DuroParser#computedMemberAssignmentValue}.
	 * @param ctx the parse tree
	 */
	void exitComputedMemberAssignmentValue(@NotNull DuroParser.ComputedMemberAssignmentValueContext ctx);

	/**
	 * Enter a parse tree produced by {@link DuroParser#computedMemberAssignment}.
	 * @param ctx the parse tree
	 */
	void enterComputedMemberAssignment(@NotNull DuroParser.ComputedMemberAssignmentContext ctx);
	/**
	 * Exit a parse tree produced by {@link DuroParser#computedMemberAssignment}.
	 * @param ctx the parse tree
	 */
	void exitComputedMemberAssignment(@NotNull DuroParser.ComputedMemberAssignmentContext ctx);

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
	 * Enter a parse tree produced by {@link DuroParser#unaryExpressionNot}.
	 * @param ctx the parse tree
	 */
	void enterUnaryExpressionNot(@NotNull DuroParser.UnaryExpressionNotContext ctx);
	/**
	 * Exit a parse tree produced by {@link DuroParser#unaryExpressionNot}.
	 * @param ctx the parse tree
	 */
	void exitUnaryExpressionNot(@NotNull DuroParser.UnaryExpressionNotContext ctx);

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
	 * Enter a parse tree produced by {@link DuroParser#binaryExpressionGreaterLess}.
	 * @param ctx the parse tree
	 */
	void enterBinaryExpressionGreaterLess(@NotNull DuroParser.BinaryExpressionGreaterLessContext ctx);
	/**
	 * Exit a parse tree produced by {@link DuroParser#binaryExpressionGreaterLess}.
	 * @param ctx the parse tree
	 */
	void exitBinaryExpressionGreaterLess(@NotNull DuroParser.BinaryExpressionGreaterLessContext ctx);

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
	 * Enter a parse tree produced by {@link DuroParser#dictProcessEntry}.
	 * @param ctx the parse tree
	 */
	void enterDictProcessEntry(@NotNull DuroParser.DictProcessEntryContext ctx);
	/**
	 * Exit a parse tree produced by {@link DuroParser#dictProcessEntry}.
	 * @param ctx the parse tree
	 */
	void exitDictProcessEntry(@NotNull DuroParser.DictProcessEntryContext ctx);

	/**
	 * Enter a parse tree produced by {@link DuroParser#binaryExpressionEqualityApplication}.
	 * @param ctx the parse tree
	 */
	void enterBinaryExpressionEqualityApplication(@NotNull DuroParser.BinaryExpressionEqualityApplicationContext ctx);
	/**
	 * Exit a parse tree produced by {@link DuroParser#binaryExpressionEqualityApplication}.
	 * @param ctx the parse tree
	 */
	void exitBinaryExpressionEqualityApplication(@NotNull DuroParser.BinaryExpressionEqualityApplicationContext ctx);

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
	 * Enter a parse tree produced by {@link DuroParser#array}.
	 * @param ctx the parse tree
	 */
	void enterArray(@NotNull DuroParser.ArrayContext ctx);
	/**
	 * Exit a parse tree produced by {@link DuroParser#array}.
	 * @param ctx the parse tree
	 */
	void exitArray(@NotNull DuroParser.ArrayContext ctx);

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
	 * Enter a parse tree produced by {@link DuroParser#computedMemberAssignmentKey}.
	 * @param ctx the parse tree
	 */
	void enterComputedMemberAssignmentKey(@NotNull DuroParser.ComputedMemberAssignmentKeyContext ctx);
	/**
	 * Exit a parse tree produced by {@link DuroParser#computedMemberAssignmentKey}.
	 * @param ctx the parse tree
	 */
	void exitComputedMemberAssignmentKey(@NotNull DuroParser.ComputedMemberAssignmentKeyContext ctx);

	/**
	 * Enter a parse tree produced by {@link DuroParser#operationEnd}.
	 * @param ctx the parse tree
	 */
	void enterOperationEnd(@NotNull DuroParser.OperationEndContext ctx);
	/**
	 * Exit a parse tree produced by {@link DuroParser#operationEnd}.
	 * @param ctx the parse tree
	 */
	void exitOperationEnd(@NotNull DuroParser.OperationEndContext ctx);

	/**
	 * Enter a parse tree produced by {@link DuroParser#binaryExpressionLogicalAnd}.
	 * @param ctx the parse tree
	 */
	void enterBinaryExpressionLogicalAnd(@NotNull DuroParser.BinaryExpressionLogicalAndContext ctx);
	/**
	 * Exit a parse tree produced by {@link DuroParser#binaryExpressionLogicalAnd}.
	 * @param ctx the parse tree
	 */
	void exitBinaryExpressionLogicalAnd(@NotNull DuroParser.BinaryExpressionLogicalAndContext ctx);

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
	 * Enter a parse tree produced by {@link DuroParser#dictProcess}.
	 * @param ctx the parse tree
	 */
	void enterDictProcess(@NotNull DuroParser.DictProcessContext ctx);
	/**
	 * Exit a parse tree produced by {@link DuroParser#dictProcess}.
	 * @param ctx the parse tree
	 */
	void exitDictProcess(@NotNull DuroParser.DictProcessContext ctx);

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
	 * Enter a parse tree produced by {@link DuroParser#forStatement}.
	 * @param ctx the parse tree
	 */
	void enterForStatement(@NotNull DuroParser.ForStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link DuroParser#forStatement}.
	 * @param ctx the parse tree
	 */
	void exitForStatement(@NotNull DuroParser.ForStatementContext ctx);

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
	 * Enter a parse tree produced by {@link DuroParser#forInStatementBody}.
	 * @param ctx the parse tree
	 */
	void enterForInStatementBody(@NotNull DuroParser.ForInStatementBodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link DuroParser#forInStatementBody}.
	 * @param ctx the parse tree
	 */
	void exitForInStatementBody(@NotNull DuroParser.ForInStatementBodyContext ctx);

	/**
	 * Enter a parse tree produced by {@link DuroParser#forStatementCondition}.
	 * @param ctx the parse tree
	 */
	void enterForStatementCondition(@NotNull DuroParser.ForStatementConditionContext ctx);
	/**
	 * Exit a parse tree produced by {@link DuroParser#forStatementCondition}.
	 * @param ctx the parse tree
	 */
	void exitForStatementCondition(@NotNull DuroParser.ForStatementConditionContext ctx);

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
	 * Enter a parse tree produced by {@link DuroParser#forStatementUpdate}.
	 * @param ctx the parse tree
	 */
	void enterForStatementUpdate(@NotNull DuroParser.ForStatementUpdateContext ctx);
	/**
	 * Exit a parse tree produced by {@link DuroParser#forStatementUpdate}.
	 * @param ctx the parse tree
	 */
	void exitForStatementUpdate(@NotNull DuroParser.ForStatementUpdateContext ctx);

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
	 * Enter a parse tree produced by {@link DuroParser#forInStatement}.
	 * @param ctx the parse tree
	 */
	void enterForInStatement(@NotNull DuroParser.ForInStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link DuroParser#forInStatement}.
	 * @param ctx the parse tree
	 */
	void exitForInStatement(@NotNull DuroParser.ForInStatementContext ctx);

	/**
	 * Enter a parse tree produced by {@link DuroParser#unaryExpressionPostIncDecOperand}.
	 * @param ctx the parse tree
	 */
	void enterUnaryExpressionPostIncDecOperand(@NotNull DuroParser.UnaryExpressionPostIncDecOperandContext ctx);
	/**
	 * Exit a parse tree produced by {@link DuroParser#unaryExpressionPostIncDecOperand}.
	 * @param ctx the parse tree
	 */
	void exitUnaryExpressionPostIncDecOperand(@NotNull DuroParser.UnaryExpressionPostIncDecOperandContext ctx);

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
	 * Enter a parse tree produced by {@link DuroParser#computedMemberAccess}.
	 * @param ctx the parse tree
	 */
	void enterComputedMemberAccess(@NotNull DuroParser.ComputedMemberAccessContext ctx);
	/**
	 * Exit a parse tree produced by {@link DuroParser#computedMemberAccess}.
	 * @param ctx the parse tree
	 */
	void exitComputedMemberAccess(@NotNull DuroParser.ComputedMemberAccessContext ctx);
}