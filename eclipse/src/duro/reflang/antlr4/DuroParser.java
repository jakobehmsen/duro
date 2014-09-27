// Generated from C:\github\duro\eclipse\src\duro\reflang\antlr4\Duro.g4 by ANTLR 4.1
package duro.reflang.antlr4;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class DuroParser extends Parser {
	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		STRING_LITERAL=1, LINE_TERMINATOR=2, PARAGRAPH=3, DOUBLE_AMP=4, DOUBLE_PIPE=5, 
		NOT=6, DOUBLE_PLUS=7, DOUBLE_MINUS=8, SINGLE_PIPE=9, HASH=10, DOLLAR=11, 
		OPEN_SQ=12, CLOSE_SQ=13, OPEN_BRA=14, CLOSE_BRA=15, OPEN_PAR=16, CLOSE_PAR=17, 
		ASSIGN=18, PROTO_ASSIGN=19, ASSIGN_ADD=20, ASSIGN_SUB=21, ASSIGN_MULT=22, 
		ASSIGN_DIV=23, ASSIGN_REM=24, EQUALS=25, NOT_EQUALS=26, LESS_THAN=27, 
		LESS_THAN_OR_EQUALS=28, GREATER_THAN=29, GREATER_THAN_OR_EQUALS=30, BIN_OP1=31, 
		BIN_OP2=32, INT=33, SEMICOLON=34, COMMA=35, COLON=36, QUESTION_MARK=37, 
		DOT=38, KW_VAR=39, KW_PAUSE=40, KW_FUNCTION=41, KW_RETURN=42, KW_BREAK=43, 
		KW_YIELD=44, KW_TRUE=45, KW_FALSE=46, KW_IF=47, KW_ELSE=48, KW_THIS=49, 
		KW_NULL=50, KW_FRAME=51, KW_WHILE=52, KW_FOR=53, KW_IN=54, ID=55, WS=56, 
		SINGLELINE_COMMENT=57, MULTI_LINE_COMMENT=58;
	public static final String[] tokenNames = {
		"<INVALID>", "STRING_LITERAL", "LINE_TERMINATOR", "'§'", "'&&'", "'||'", 
		"'!'", "'++'", "'--'", "'|'", "'#'", "'$'", "'['", "']'", "'{'", "'}'", 
		"'('", "')'", "'='", "'^='", "'+='", "'-='", "'*='", "'/='", "'%='", "'=='", 
		"'!='", "'<'", "'<='", "'>'", "'>='", "BIN_OP1", "BIN_OP2", "INT", "';'", 
		"','", "':'", "'?'", "'.'", "'var'", "'pause'", "'function'", "'return'", 
		"'break'", "'yield'", "'true'", "'false'", "'if'", "'else'", "'this'", 
		"'null'", "'frame'", "'while'", "'for'", "'in'", "ID", "WS", "SINGLELINE_COMMENT", 
		"MULTI_LINE_COMMENT"
	};
	public static final int
		RULE_program = 0, RULE_programElements = 1, RULE_programElementsPart = 2, 
		RULE_programElement = 3, RULE_delimitedProgramElement = 4, RULE_topExpression = 5, 
		RULE_expression = 6, RULE_conditionalExpression = 7, RULE_conditionalExpressionCondition = 8, 
		RULE_conditionalExpressionTrue = 9, RULE_conditionalExpressionFalse = 10, 
		RULE_binaryExpressionLogicalOr = 11, RULE_binaryExpressionLogicalOrApplication = 12, 
		RULE_binaryExpressionLogicalAnd = 13, RULE_binaryExpressionLogicalAndApplication = 14, 
		RULE_binaryExpressionEquality = 15, RULE_binaryExpressionEqualityApplication = 16, 
		RULE_binaryExpressionGreaterLess = 17, RULE_binaryExpressionGreaterLessApplication = 18, 
		RULE_binaryExpressionArithmetic1 = 19, RULE_binaryExpressionArithmetic1Application = 20, 
		RULE_binaryExpressionArithmetic2 = 21, RULE_binaryExpressionArithmetic2Application = 22, 
		RULE_unaryExpressionNot = 23, RULE_unaryExpressionNotApplication = 24, 
		RULE_unaryExpressionPostIncDec = 25, RULE_unaryExpressionPostIncDecApplication = 26, 
		RULE_unaryExpressionPostIncDecApplicationVariable = 27, RULE_unaryExpressionPostIncDecApplicationMemberAccess = 28, 
		RULE_unaryExpressionPostIncDecApplicationIndexAccess = 29, RULE_unaryExpressionPostIncDecApplicationIndexAccessReceiver = 30, 
		RULE_unaryExpressionPostIncDecOperand = 31, RULE_grouping = 32, RULE_variableAssignment = 33, 
		RULE_lookup = 34, RULE_argumentParameter = 35, RULE_thisMessageExchange = 36, 
		RULE_messageExchange = 37, RULE_messageId = 38, RULE_operator = 39, RULE_literal = 40, 
		RULE_integer = 41, RULE_bool = 42, RULE_string = 43, RULE_dictProcess = 44, 
		RULE_dictProcessEntry = 45, RULE_functionLiteral = 46, RULE_closureLiteral = 47, 
		RULE_closureParameters = 48, RULE_closureBody = 49, RULE_array = 50, RULE_arrayOperand = 51, 
		RULE_self = 52, RULE_nil = 53, RULE_frame = 54, RULE_primitive = 55, RULE_primitiveArgument = 56, 
		RULE_primitiveOperand2 = 57, RULE_operationChain = 58, RULE_explicitMessageExchange = 59, 
		RULE_memberAccess = 60, RULE_indexAccess = 61, RULE_operationEnd = 62, 
		RULE_memberAssignment = 63, RULE_memberAssignmentValue = 64, RULE_indexAssignment = 65, 
		RULE_indexAssignmentKey = 66, RULE_indexAssignmentValue = 67, RULE_delimitedStatement = 68, 
		RULE_pause = 69, RULE_variableStatement = 70, RULE_variableDeclarationAndAssignment = 71, 
		RULE_variableDeclaration = 72, RULE_returnStatement = 73, RULE_breakStatement = 74, 
		RULE_yieldStatement = 75, RULE_yieldStatementExpression = 76, RULE_undelimitedStatement = 77, 
		RULE_functionDefinition = 78, RULE_functionParameters = 79, RULE_functionBody = 80, 
		RULE_ifStatement = 81, RULE_ifStatementCondition = 82, RULE_ifStatementOnTrue = 83, 
		RULE_elseStatement = 84, RULE_ifStatementOnFalse = 85, RULE_whileStatement = 86, 
		RULE_whileStatementCondition = 87, RULE_whileStatementBody = 88, RULE_forStatement = 89, 
		RULE_forStatementInitialization = 90, RULE_forStatementCondition = 91, 
		RULE_forStatementUpdate = 92, RULE_forStatementBody = 93, RULE_forInStatement = 94, 
		RULE_forInStatementVar = 95, RULE_forInStatementBody = 96, RULE_interfaceId = 97, 
		RULE_interfaceIdBody = 98;
	public static final String[] ruleNames = {
		"program", "programElements", "programElementsPart", "programElement", 
		"delimitedProgramElement", "topExpression", "expression", "conditionalExpression", 
		"conditionalExpressionCondition", "conditionalExpressionTrue", "conditionalExpressionFalse", 
		"binaryExpressionLogicalOr", "binaryExpressionLogicalOrApplication", "binaryExpressionLogicalAnd", 
		"binaryExpressionLogicalAndApplication", "binaryExpressionEquality", "binaryExpressionEqualityApplication", 
		"binaryExpressionGreaterLess", "binaryExpressionGreaterLessApplication", 
		"binaryExpressionArithmetic1", "binaryExpressionArithmetic1Application", 
		"binaryExpressionArithmetic2", "binaryExpressionArithmetic2Application", 
		"unaryExpressionNot", "unaryExpressionNotApplication", "unaryExpressionPostIncDec", 
		"unaryExpressionPostIncDecApplication", "unaryExpressionPostIncDecApplicationVariable", 
		"unaryExpressionPostIncDecApplicationMemberAccess", "unaryExpressionPostIncDecApplicationIndexAccess", 
		"unaryExpressionPostIncDecApplicationIndexAccessReceiver", "unaryExpressionPostIncDecOperand", 
		"grouping", "variableAssignment", "lookup", "argumentParameter", "thisMessageExchange", 
		"messageExchange", "messageId", "operator", "literal", "integer", "bool", 
		"string", "dictProcess", "dictProcessEntry", "functionLiteral", "closureLiteral", 
		"closureParameters", "closureBody", "array", "arrayOperand", "self", "nil", 
		"frame", "primitive", "primitiveArgument", "primitiveOperand2", "operationChain", 
		"explicitMessageExchange", "memberAccess", "indexAccess", "operationEnd", 
		"memberAssignment", "memberAssignmentValue", "indexAssignment", "indexAssignmentKey", 
		"indexAssignmentValue", "delimitedStatement", "pause", "variableStatement", 
		"variableDeclarationAndAssignment", "variableDeclaration", "returnStatement", 
		"breakStatement", "yieldStatement", "yieldStatementExpression", "undelimitedStatement", 
		"functionDefinition", "functionParameters", "functionBody", "ifStatement", 
		"ifStatementCondition", "ifStatementOnTrue", "elseStatement", "ifStatementOnFalse", 
		"whileStatement", "whileStatementCondition", "whileStatementBody", "forStatement", 
		"forStatementInitialization", "forStatementCondition", "forStatementUpdate", 
		"forStatementBody", "forInStatement", "forInStatementVar", "forInStatementBody", 
		"interfaceId", "interfaceIdBody"
	};

	@Override
	public String getGrammarFileName() { return "Duro.g4"; }

	@Override
	public String[] getTokenNames() { return tokenNames; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public DuroParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class ProgramContext extends ParserRuleContext {
		public ProgramElementsContext programElements() {
			return getRuleContext(ProgramElementsContext.class,0);
		}
		public ProgramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_program; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DuroListener ) ((DuroListener)listener).enterProgram(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DuroListener ) ((DuroListener)listener).exitProgram(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DuroVisitor ) return ((DuroVisitor<? extends T>)visitor).visitProgram(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProgramContext program() throws RecognitionException {
		ProgramContext _localctx = new ProgramContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_program);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(198); programElements();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ProgramElementsContext extends ParserRuleContext {
		public List<ProgramElementsPartContext> programElementsPart() {
			return getRuleContexts(ProgramElementsPartContext.class);
		}
		public ProgramElementsPartContext programElementsPart(int i) {
			return getRuleContext(ProgramElementsPartContext.class,i);
		}
		public ProgramElementsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_programElements; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DuroListener ) ((DuroListener)listener).enterProgramElements(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DuroListener ) ((DuroListener)listener).exitProgramElements(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DuroVisitor ) return ((DuroVisitor<? extends T>)visitor).visitProgramElements(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProgramElementsContext programElements() throws RecognitionException {
		ProgramElementsContext _localctx = new ProgramElementsContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_programElements);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(203);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << STRING_LITERAL) | (1L << PARAGRAPH) | (1L << NOT) | (1L << DOLLAR) | (1L << OPEN_SQ) | (1L << OPEN_BRA) | (1L << OPEN_PAR) | (1L << EQUALS) | (1L << NOT_EQUALS) | (1L << LESS_THAN) | (1L << LESS_THAN_OR_EQUALS) | (1L << GREATER_THAN) | (1L << GREATER_THAN_OR_EQUALS) | (1L << BIN_OP1) | (1L << BIN_OP2) | (1L << INT) | (1L << COLON) | (1L << KW_VAR) | (1L << KW_PAUSE) | (1L << KW_FUNCTION) | (1L << KW_RETURN) | (1L << KW_BREAK) | (1L << KW_YIELD) | (1L << KW_TRUE) | (1L << KW_FALSE) | (1L << KW_IF) | (1L << KW_THIS) | (1L << KW_NULL) | (1L << KW_FRAME) | (1L << KW_WHILE) | (1L << KW_FOR) | (1L << ID))) != 0)) {
				{
				{
				setState(200); programElementsPart();
				}
				}
				setState(205);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ProgramElementsPartContext extends ParserRuleContext {
		public List<TerminalNode> SEMICOLON() { return getTokens(DuroParser.SEMICOLON); }
		public List<DelimitedProgramElementContext> delimitedProgramElement() {
			return getRuleContexts(DelimitedProgramElementContext.class);
		}
		public TerminalNode SEMICOLON(int i) {
			return getToken(DuroParser.SEMICOLON, i);
		}
		public UndelimitedStatementContext undelimitedStatement() {
			return getRuleContext(UndelimitedStatementContext.class,0);
		}
		public DelimitedProgramElementContext delimitedProgramElement(int i) {
			return getRuleContext(DelimitedProgramElementContext.class,i);
		}
		public ProgramElementsPartContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_programElementsPart; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DuroListener ) ((DuroListener)listener).enterProgramElementsPart(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DuroListener ) ((DuroListener)listener).exitProgramElementsPart(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DuroVisitor ) return ((DuroVisitor<? extends T>)visitor).visitProgramElementsPart(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProgramElementsPartContext programElementsPart() throws RecognitionException {
		ProgramElementsPartContext _localctx = new ProgramElementsPartContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_programElementsPart);
		int _la;
		try {
			int _alt;
			setState(215);
			switch (_input.LA(1)) {
			case STRING_LITERAL:
			case PARAGRAPH:
			case NOT:
			case OPEN_SQ:
			case OPEN_BRA:
			case OPEN_PAR:
			case EQUALS:
			case NOT_EQUALS:
			case LESS_THAN:
			case LESS_THAN_OR_EQUALS:
			case GREATER_THAN:
			case GREATER_THAN_OR_EQUALS:
			case BIN_OP1:
			case BIN_OP2:
			case INT:
			case COLON:
			case KW_VAR:
			case KW_PAUSE:
			case KW_FUNCTION:
			case KW_RETURN:
			case KW_BREAK:
			case KW_YIELD:
			case KW_TRUE:
			case KW_FALSE:
			case KW_THIS:
			case KW_NULL:
			case KW_FRAME:
			case ID:
				enterOuterAlt(_localctx, 1);
				{
				setState(210); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,2,_ctx);
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(206); delimitedProgramElement();
						setState(208);
						_la = _input.LA(1);
						if (_la==SEMICOLON) {
							{
							setState(207); match(SEMICOLON);
							}
						}

						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(212); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,2,_ctx);
				} while ( _alt!=2 && _alt!=-1 );
				}
				break;
			case DOLLAR:
			case KW_IF:
			case KW_WHILE:
			case KW_FOR:
				enterOuterAlt(_localctx, 2);
				{
				setState(214); undelimitedStatement();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ProgramElementContext extends ParserRuleContext {
		public TerminalNode SEMICOLON() { return getToken(DuroParser.SEMICOLON, 0); }
		public DelimitedProgramElementContext delimitedProgramElement() {
			return getRuleContext(DelimitedProgramElementContext.class,0);
		}
		public UndelimitedStatementContext undelimitedStatement() {
			return getRuleContext(UndelimitedStatementContext.class,0);
		}
		public ProgramElementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_programElement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DuroListener ) ((DuroListener)listener).enterProgramElement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DuroListener ) ((DuroListener)listener).exitProgramElement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DuroVisitor ) return ((DuroVisitor<? extends T>)visitor).visitProgramElement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProgramElementContext programElement() throws RecognitionException {
		ProgramElementContext _localctx = new ProgramElementContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_programElement);
		int _la;
		try {
			setState(222);
			switch (_input.LA(1)) {
			case STRING_LITERAL:
			case PARAGRAPH:
			case NOT:
			case OPEN_SQ:
			case OPEN_BRA:
			case OPEN_PAR:
			case EQUALS:
			case NOT_EQUALS:
			case LESS_THAN:
			case LESS_THAN_OR_EQUALS:
			case GREATER_THAN:
			case GREATER_THAN_OR_EQUALS:
			case BIN_OP1:
			case BIN_OP2:
			case INT:
			case COLON:
			case KW_VAR:
			case KW_PAUSE:
			case KW_FUNCTION:
			case KW_RETURN:
			case KW_BREAK:
			case KW_YIELD:
			case KW_TRUE:
			case KW_FALSE:
			case KW_THIS:
			case KW_NULL:
			case KW_FRAME:
			case ID:
				enterOuterAlt(_localctx, 1);
				{
				setState(217); delimitedProgramElement();
				setState(219);
				_la = _input.LA(1);
				if (_la==SEMICOLON) {
					{
					setState(218); match(SEMICOLON);
					}
				}

				}
				break;
			case DOLLAR:
			case KW_IF:
			case KW_WHILE:
			case KW_FOR:
				enterOuterAlt(_localctx, 2);
				{
				setState(221); undelimitedStatement();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DelimitedProgramElementContext extends ParserRuleContext {
		public TopExpressionContext topExpression() {
			return getRuleContext(TopExpressionContext.class,0);
		}
		public DelimitedStatementContext delimitedStatement() {
			return getRuleContext(DelimitedStatementContext.class,0);
		}
		public DelimitedProgramElementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_delimitedProgramElement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DuroListener ) ((DuroListener)listener).enterDelimitedProgramElement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DuroListener ) ((DuroListener)listener).exitDelimitedProgramElement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DuroVisitor ) return ((DuroVisitor<? extends T>)visitor).visitDelimitedProgramElement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DelimitedProgramElementContext delimitedProgramElement() throws RecognitionException {
		DelimitedProgramElementContext _localctx = new DelimitedProgramElementContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_delimitedProgramElement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(226);
			switch (_input.LA(1)) {
			case STRING_LITERAL:
			case PARAGRAPH:
			case NOT:
			case OPEN_SQ:
			case OPEN_BRA:
			case OPEN_PAR:
			case EQUALS:
			case NOT_EQUALS:
			case LESS_THAN:
			case LESS_THAN_OR_EQUALS:
			case GREATER_THAN:
			case GREATER_THAN_OR_EQUALS:
			case BIN_OP1:
			case BIN_OP2:
			case INT:
			case COLON:
			case KW_FUNCTION:
			case KW_TRUE:
			case KW_FALSE:
			case KW_THIS:
			case KW_NULL:
			case KW_FRAME:
			case ID:
				{
				setState(224); topExpression();
				}
				break;
			case KW_VAR:
			case KW_PAUSE:
			case KW_RETURN:
			case KW_BREAK:
			case KW_YIELD:
				{
				setState(225); delimitedStatement();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TopExpressionContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TopExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_topExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DuroListener ) ((DuroListener)listener).enterTopExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DuroListener ) ((DuroListener)listener).exitTopExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DuroVisitor ) return ((DuroVisitor<? extends T>)visitor).visitTopExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TopExpressionContext topExpression() throws RecognitionException {
		TopExpressionContext _localctx = new TopExpressionContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_topExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(228); expression();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExpressionContext extends ParserRuleContext {
		public ConditionalExpressionContext conditionalExpression() {
			return getRuleContext(ConditionalExpressionContext.class,0);
		}
		public VariableAssignmentContext variableAssignment() {
			return getRuleContext(VariableAssignmentContext.class,0);
		}
		public FunctionDefinitionContext functionDefinition() {
			return getRuleContext(FunctionDefinitionContext.class,0);
		}
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DuroListener ) ((DuroListener)listener).enterExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DuroListener ) ((DuroListener)listener).exitExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DuroVisitor ) return ((DuroVisitor<? extends T>)visitor).visitExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressionContext expression() throws RecognitionException {
		ExpressionContext _localctx = new ExpressionContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_expression);
		try {
			setState(233);
			switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(230); variableAssignment();
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(231); functionDefinition();
				}
				break;

			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(232); conditionalExpression();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ConditionalExpressionContext extends ParserRuleContext {
		public BinaryExpressionLogicalOrContext binaryExpressionLogicalOr() {
			return getRuleContext(BinaryExpressionLogicalOrContext.class,0);
		}
		public ConditionalExpressionFalseContext conditionalExpressionFalse() {
			return getRuleContext(ConditionalExpressionFalseContext.class,0);
		}
		public TerminalNode QUESTION_MARK() { return getToken(DuroParser.QUESTION_MARK, 0); }
		public TerminalNode COLON() { return getToken(DuroParser.COLON, 0); }
		public ConditionalExpressionConditionContext conditionalExpressionCondition() {
			return getRuleContext(ConditionalExpressionConditionContext.class,0);
		}
		public ConditionalExpressionTrueContext conditionalExpressionTrue() {
			return getRuleContext(ConditionalExpressionTrueContext.class,0);
		}
		public ConditionalExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_conditionalExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DuroListener ) ((DuroListener)listener).enterConditionalExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DuroListener ) ((DuroListener)listener).exitConditionalExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DuroVisitor ) return ((DuroVisitor<? extends T>)visitor).visitConditionalExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConditionalExpressionContext conditionalExpression() throws RecognitionException {
		ConditionalExpressionContext _localctx = new ConditionalExpressionContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_conditionalExpression);
		try {
			setState(242);
			switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(235); conditionalExpressionCondition();
				setState(236); match(QUESTION_MARK);
				setState(237); conditionalExpressionTrue();
				setState(238); match(COLON);
				setState(239); conditionalExpressionFalse();
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(241); binaryExpressionLogicalOr();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ConditionalExpressionConditionContext extends ParserRuleContext {
		public BinaryExpressionLogicalOrContext binaryExpressionLogicalOr() {
			return getRuleContext(BinaryExpressionLogicalOrContext.class,0);
		}
		public ConditionalExpressionConditionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_conditionalExpressionCondition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DuroListener ) ((DuroListener)listener).enterConditionalExpressionCondition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DuroListener ) ((DuroListener)listener).exitConditionalExpressionCondition(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DuroVisitor ) return ((DuroVisitor<? extends T>)visitor).visitConditionalExpressionCondition(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConditionalExpressionConditionContext conditionalExpressionCondition() throws RecognitionException {
		ConditionalExpressionConditionContext _localctx = new ConditionalExpressionConditionContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_conditionalExpressionCondition);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(244); binaryExpressionLogicalOr();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ConditionalExpressionTrueContext extends ParserRuleContext {
		public BinaryExpressionLogicalOrContext binaryExpressionLogicalOr() {
			return getRuleContext(BinaryExpressionLogicalOrContext.class,0);
		}
		public ConditionalExpressionTrueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_conditionalExpressionTrue; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DuroListener ) ((DuroListener)listener).enterConditionalExpressionTrue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DuroListener ) ((DuroListener)listener).exitConditionalExpressionTrue(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DuroVisitor ) return ((DuroVisitor<? extends T>)visitor).visitConditionalExpressionTrue(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConditionalExpressionTrueContext conditionalExpressionTrue() throws RecognitionException {
		ConditionalExpressionTrueContext _localctx = new ConditionalExpressionTrueContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_conditionalExpressionTrue);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(246); binaryExpressionLogicalOr();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ConditionalExpressionFalseContext extends ParserRuleContext {
		public BinaryExpressionLogicalOrContext binaryExpressionLogicalOr() {
			return getRuleContext(BinaryExpressionLogicalOrContext.class,0);
		}
		public ConditionalExpressionFalseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_conditionalExpressionFalse; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DuroListener ) ((DuroListener)listener).enterConditionalExpressionFalse(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DuroListener ) ((DuroListener)listener).exitConditionalExpressionFalse(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DuroVisitor ) return ((DuroVisitor<? extends T>)visitor).visitConditionalExpressionFalse(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConditionalExpressionFalseContext conditionalExpressionFalse() throws RecognitionException {
		ConditionalExpressionFalseContext _localctx = new ConditionalExpressionFalseContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_conditionalExpressionFalse);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(248); binaryExpressionLogicalOr();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class BinaryExpressionLogicalOrContext extends ParserRuleContext {
		public List<BinaryExpressionLogicalOrApplicationContext> binaryExpressionLogicalOrApplication() {
			return getRuleContexts(BinaryExpressionLogicalOrApplicationContext.class);
		}
		public BinaryExpressionLogicalOrApplicationContext binaryExpressionLogicalOrApplication(int i) {
			return getRuleContext(BinaryExpressionLogicalOrApplicationContext.class,i);
		}
		public BinaryExpressionLogicalAndContext binaryExpressionLogicalAnd() {
			return getRuleContext(BinaryExpressionLogicalAndContext.class,0);
		}
		public BinaryExpressionLogicalOrContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_binaryExpressionLogicalOr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DuroListener ) ((DuroListener)listener).enterBinaryExpressionLogicalOr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DuroListener ) ((DuroListener)listener).exitBinaryExpressionLogicalOr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DuroVisitor ) return ((DuroVisitor<? extends T>)visitor).visitBinaryExpressionLogicalOr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BinaryExpressionLogicalOrContext binaryExpressionLogicalOr() throws RecognitionException {
		BinaryExpressionLogicalOrContext _localctx = new BinaryExpressionLogicalOrContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_binaryExpressionLogicalOr);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(250); binaryExpressionLogicalAnd();
			setState(254);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,9,_ctx);
			while ( _alt!=2 && _alt!=-1 ) {
				if ( _alt==1 ) {
					{
					{
					setState(251); binaryExpressionLogicalOrApplication();
					}
					} 
				}
				setState(256);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,9,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class BinaryExpressionLogicalOrApplicationContext extends ParserRuleContext {
		public TerminalNode DOUBLE_PIPE() { return getToken(DuroParser.DOUBLE_PIPE, 0); }
		public BinaryExpressionLogicalAndContext binaryExpressionLogicalAnd() {
			return getRuleContext(BinaryExpressionLogicalAndContext.class,0);
		}
		public BinaryExpressionLogicalOrApplicationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_binaryExpressionLogicalOrApplication; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DuroListener ) ((DuroListener)listener).enterBinaryExpressionLogicalOrApplication(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DuroListener ) ((DuroListener)listener).exitBinaryExpressionLogicalOrApplication(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DuroVisitor ) return ((DuroVisitor<? extends T>)visitor).visitBinaryExpressionLogicalOrApplication(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BinaryExpressionLogicalOrApplicationContext binaryExpressionLogicalOrApplication() throws RecognitionException {
		BinaryExpressionLogicalOrApplicationContext _localctx = new BinaryExpressionLogicalOrApplicationContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_binaryExpressionLogicalOrApplication);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(257); match(DOUBLE_PIPE);
			setState(258); binaryExpressionLogicalAnd();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class BinaryExpressionLogicalAndContext extends ParserRuleContext {
		public BinaryExpressionEqualityContext binaryExpressionEquality() {
			return getRuleContext(BinaryExpressionEqualityContext.class,0);
		}
		public BinaryExpressionLogicalAndApplicationContext binaryExpressionLogicalAndApplication(int i) {
			return getRuleContext(BinaryExpressionLogicalAndApplicationContext.class,i);
		}
		public List<BinaryExpressionLogicalAndApplicationContext> binaryExpressionLogicalAndApplication() {
			return getRuleContexts(BinaryExpressionLogicalAndApplicationContext.class);
		}
		public BinaryExpressionLogicalAndContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_binaryExpressionLogicalAnd; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DuroListener ) ((DuroListener)listener).enterBinaryExpressionLogicalAnd(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DuroListener ) ((DuroListener)listener).exitBinaryExpressionLogicalAnd(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DuroVisitor ) return ((DuroVisitor<? extends T>)visitor).visitBinaryExpressionLogicalAnd(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BinaryExpressionLogicalAndContext binaryExpressionLogicalAnd() throws RecognitionException {
		BinaryExpressionLogicalAndContext _localctx = new BinaryExpressionLogicalAndContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_binaryExpressionLogicalAnd);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(260); binaryExpressionEquality();
			setState(264);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,10,_ctx);
			while ( _alt!=2 && _alt!=-1 ) {
				if ( _alt==1 ) {
					{
					{
					setState(261); binaryExpressionLogicalAndApplication();
					}
					} 
				}
				setState(266);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,10,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class BinaryExpressionLogicalAndApplicationContext extends ParserRuleContext {
		public TerminalNode DOUBLE_AMP() { return getToken(DuroParser.DOUBLE_AMP, 0); }
		public BinaryExpressionEqualityContext binaryExpressionEquality() {
			return getRuleContext(BinaryExpressionEqualityContext.class,0);
		}
		public BinaryExpressionLogicalAndApplicationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_binaryExpressionLogicalAndApplication; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DuroListener ) ((DuroListener)listener).enterBinaryExpressionLogicalAndApplication(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DuroListener ) ((DuroListener)listener).exitBinaryExpressionLogicalAndApplication(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DuroVisitor ) return ((DuroVisitor<? extends T>)visitor).visitBinaryExpressionLogicalAndApplication(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BinaryExpressionLogicalAndApplicationContext binaryExpressionLogicalAndApplication() throws RecognitionException {
		BinaryExpressionLogicalAndApplicationContext _localctx = new BinaryExpressionLogicalAndApplicationContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_binaryExpressionLogicalAndApplication);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(267); match(DOUBLE_AMP);
			setState(268); binaryExpressionEquality();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class BinaryExpressionEqualityContext extends ParserRuleContext {
		public BinaryExpressionEqualityApplicationContext binaryExpressionEqualityApplication(int i) {
			return getRuleContext(BinaryExpressionEqualityApplicationContext.class,i);
		}
		public List<BinaryExpressionEqualityApplicationContext> binaryExpressionEqualityApplication() {
			return getRuleContexts(BinaryExpressionEqualityApplicationContext.class);
		}
		public BinaryExpressionGreaterLessContext binaryExpressionGreaterLess() {
			return getRuleContext(BinaryExpressionGreaterLessContext.class,0);
		}
		public BinaryExpressionEqualityContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_binaryExpressionEquality; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DuroListener ) ((DuroListener)listener).enterBinaryExpressionEquality(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DuroListener ) ((DuroListener)listener).exitBinaryExpressionEquality(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DuroVisitor ) return ((DuroVisitor<? extends T>)visitor).visitBinaryExpressionEquality(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BinaryExpressionEqualityContext binaryExpressionEquality() throws RecognitionException {
		BinaryExpressionEqualityContext _localctx = new BinaryExpressionEqualityContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_binaryExpressionEquality);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(270); binaryExpressionGreaterLess();
			setState(274);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,11,_ctx);
			while ( _alt!=2 && _alt!=-1 ) {
				if ( _alt==1 ) {
					{
					{
					setState(271); binaryExpressionEqualityApplication();
					}
					} 
				}
				setState(276);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,11,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class BinaryExpressionEqualityApplicationContext extends ParserRuleContext {
		public Token op;
		public TerminalNode EQUALS() { return getToken(DuroParser.EQUALS, 0); }
		public TerminalNode NOT_EQUALS() { return getToken(DuroParser.NOT_EQUALS, 0); }
		public BinaryExpressionGreaterLessContext binaryExpressionGreaterLess() {
			return getRuleContext(BinaryExpressionGreaterLessContext.class,0);
		}
		public BinaryExpressionEqualityApplicationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_binaryExpressionEqualityApplication; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DuroListener ) ((DuroListener)listener).enterBinaryExpressionEqualityApplication(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DuroListener ) ((DuroListener)listener).exitBinaryExpressionEqualityApplication(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DuroVisitor ) return ((DuroVisitor<? extends T>)visitor).visitBinaryExpressionEqualityApplication(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BinaryExpressionEqualityApplicationContext binaryExpressionEqualityApplication() throws RecognitionException {
		BinaryExpressionEqualityApplicationContext _localctx = new BinaryExpressionEqualityApplicationContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_binaryExpressionEqualityApplication);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(277);
			((BinaryExpressionEqualityApplicationContext)_localctx).op = _input.LT(1);
			_la = _input.LA(1);
			if ( !(_la==EQUALS || _la==NOT_EQUALS) ) {
				((BinaryExpressionEqualityApplicationContext)_localctx).op = (Token)_errHandler.recoverInline(this);
			}
			consume();
			setState(278); binaryExpressionGreaterLess();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class BinaryExpressionGreaterLessContext extends ParserRuleContext {
		public BinaryExpressionArithmetic1Context binaryExpressionArithmetic1() {
			return getRuleContext(BinaryExpressionArithmetic1Context.class,0);
		}
		public BinaryExpressionGreaterLessApplicationContext binaryExpressionGreaterLessApplication(int i) {
			return getRuleContext(BinaryExpressionGreaterLessApplicationContext.class,i);
		}
		public List<BinaryExpressionGreaterLessApplicationContext> binaryExpressionGreaterLessApplication() {
			return getRuleContexts(BinaryExpressionGreaterLessApplicationContext.class);
		}
		public BinaryExpressionGreaterLessContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_binaryExpressionGreaterLess; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DuroListener ) ((DuroListener)listener).enterBinaryExpressionGreaterLess(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DuroListener ) ((DuroListener)listener).exitBinaryExpressionGreaterLess(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DuroVisitor ) return ((DuroVisitor<? extends T>)visitor).visitBinaryExpressionGreaterLess(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BinaryExpressionGreaterLessContext binaryExpressionGreaterLess() throws RecognitionException {
		BinaryExpressionGreaterLessContext _localctx = new BinaryExpressionGreaterLessContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_binaryExpressionGreaterLess);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(280); binaryExpressionArithmetic1();
			setState(284);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,12,_ctx);
			while ( _alt!=2 && _alt!=-1 ) {
				if ( _alt==1 ) {
					{
					{
					setState(281); binaryExpressionGreaterLessApplication();
					}
					} 
				}
				setState(286);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,12,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class BinaryExpressionGreaterLessApplicationContext extends ParserRuleContext {
		public Token op;
		public TerminalNode LESS_THAN_OR_EQUALS() { return getToken(DuroParser.LESS_THAN_OR_EQUALS, 0); }
		public BinaryExpressionArithmetic1Context binaryExpressionArithmetic1() {
			return getRuleContext(BinaryExpressionArithmetic1Context.class,0);
		}
		public TerminalNode LESS_THAN() { return getToken(DuroParser.LESS_THAN, 0); }
		public TerminalNode GREATER_THAN() { return getToken(DuroParser.GREATER_THAN, 0); }
		public TerminalNode GREATER_THAN_OR_EQUALS() { return getToken(DuroParser.GREATER_THAN_OR_EQUALS, 0); }
		public BinaryExpressionGreaterLessApplicationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_binaryExpressionGreaterLessApplication; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DuroListener ) ((DuroListener)listener).enterBinaryExpressionGreaterLessApplication(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DuroListener ) ((DuroListener)listener).exitBinaryExpressionGreaterLessApplication(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DuroVisitor ) return ((DuroVisitor<? extends T>)visitor).visitBinaryExpressionGreaterLessApplication(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BinaryExpressionGreaterLessApplicationContext binaryExpressionGreaterLessApplication() throws RecognitionException {
		BinaryExpressionGreaterLessApplicationContext _localctx = new BinaryExpressionGreaterLessApplicationContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_binaryExpressionGreaterLessApplication);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(287);
			((BinaryExpressionGreaterLessApplicationContext)_localctx).op = _input.LT(1);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << LESS_THAN) | (1L << LESS_THAN_OR_EQUALS) | (1L << GREATER_THAN) | (1L << GREATER_THAN_OR_EQUALS))) != 0)) ) {
				((BinaryExpressionGreaterLessApplicationContext)_localctx).op = (Token)_errHandler.recoverInline(this);
			}
			consume();
			setState(288); binaryExpressionArithmetic1();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class BinaryExpressionArithmetic1Context extends ParserRuleContext {
		public List<BinaryExpressionArithmetic1ApplicationContext> binaryExpressionArithmetic1Application() {
			return getRuleContexts(BinaryExpressionArithmetic1ApplicationContext.class);
		}
		public BinaryExpressionArithmetic1ApplicationContext binaryExpressionArithmetic1Application(int i) {
			return getRuleContext(BinaryExpressionArithmetic1ApplicationContext.class,i);
		}
		public BinaryExpressionArithmetic2Context binaryExpressionArithmetic2() {
			return getRuleContext(BinaryExpressionArithmetic2Context.class,0);
		}
		public BinaryExpressionArithmetic1Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_binaryExpressionArithmetic1; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DuroListener ) ((DuroListener)listener).enterBinaryExpressionArithmetic1(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DuroListener ) ((DuroListener)listener).exitBinaryExpressionArithmetic1(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DuroVisitor ) return ((DuroVisitor<? extends T>)visitor).visitBinaryExpressionArithmetic1(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BinaryExpressionArithmetic1Context binaryExpressionArithmetic1() throws RecognitionException {
		BinaryExpressionArithmetic1Context _localctx = new BinaryExpressionArithmetic1Context(_ctx, getState());
		enterRule(_localctx, 38, RULE_binaryExpressionArithmetic1);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(290); binaryExpressionArithmetic2();
			setState(294);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,13,_ctx);
			while ( _alt!=2 && _alt!=-1 ) {
				if ( _alt==1 ) {
					{
					{
					setState(291); binaryExpressionArithmetic1Application();
					}
					} 
				}
				setState(296);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,13,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class BinaryExpressionArithmetic1ApplicationContext extends ParserRuleContext {
		public TerminalNode BIN_OP1() { return getToken(DuroParser.BIN_OP1, 0); }
		public BinaryExpressionArithmetic2Context binaryExpressionArithmetic2() {
			return getRuleContext(BinaryExpressionArithmetic2Context.class,0);
		}
		public BinaryExpressionArithmetic1ApplicationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_binaryExpressionArithmetic1Application; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DuroListener ) ((DuroListener)listener).enterBinaryExpressionArithmetic1Application(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DuroListener ) ((DuroListener)listener).exitBinaryExpressionArithmetic1Application(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DuroVisitor ) return ((DuroVisitor<? extends T>)visitor).visitBinaryExpressionArithmetic1Application(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BinaryExpressionArithmetic1ApplicationContext binaryExpressionArithmetic1Application() throws RecognitionException {
		BinaryExpressionArithmetic1ApplicationContext _localctx = new BinaryExpressionArithmetic1ApplicationContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_binaryExpressionArithmetic1Application);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(297); match(BIN_OP1);
			setState(298); binaryExpressionArithmetic2();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class BinaryExpressionArithmetic2Context extends ParserRuleContext {
		public BinaryExpressionArithmetic2ApplicationContext binaryExpressionArithmetic2Application(int i) {
			return getRuleContext(BinaryExpressionArithmetic2ApplicationContext.class,i);
		}
		public UnaryExpressionNotContext unaryExpressionNot() {
			return getRuleContext(UnaryExpressionNotContext.class,0);
		}
		public List<BinaryExpressionArithmetic2ApplicationContext> binaryExpressionArithmetic2Application() {
			return getRuleContexts(BinaryExpressionArithmetic2ApplicationContext.class);
		}
		public BinaryExpressionArithmetic2Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_binaryExpressionArithmetic2; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DuroListener ) ((DuroListener)listener).enterBinaryExpressionArithmetic2(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DuroListener ) ((DuroListener)listener).exitBinaryExpressionArithmetic2(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DuroVisitor ) return ((DuroVisitor<? extends T>)visitor).visitBinaryExpressionArithmetic2(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BinaryExpressionArithmetic2Context binaryExpressionArithmetic2() throws RecognitionException {
		BinaryExpressionArithmetic2Context _localctx = new BinaryExpressionArithmetic2Context(_ctx, getState());
		enterRule(_localctx, 42, RULE_binaryExpressionArithmetic2);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(300); unaryExpressionNot();
			setState(304);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,14,_ctx);
			while ( _alt!=2 && _alt!=-1 ) {
				if ( _alt==1 ) {
					{
					{
					setState(301); binaryExpressionArithmetic2Application();
					}
					} 
				}
				setState(306);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,14,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class BinaryExpressionArithmetic2ApplicationContext extends ParserRuleContext {
		public UnaryExpressionNotContext unaryExpressionNot() {
			return getRuleContext(UnaryExpressionNotContext.class,0);
		}
		public TerminalNode BIN_OP2() { return getToken(DuroParser.BIN_OP2, 0); }
		public BinaryExpressionArithmetic2ApplicationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_binaryExpressionArithmetic2Application; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DuroListener ) ((DuroListener)listener).enterBinaryExpressionArithmetic2Application(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DuroListener ) ((DuroListener)listener).exitBinaryExpressionArithmetic2Application(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DuroVisitor ) return ((DuroVisitor<? extends T>)visitor).visitBinaryExpressionArithmetic2Application(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BinaryExpressionArithmetic2ApplicationContext binaryExpressionArithmetic2Application() throws RecognitionException {
		BinaryExpressionArithmetic2ApplicationContext _localctx = new BinaryExpressionArithmetic2ApplicationContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_binaryExpressionArithmetic2Application);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(307); match(BIN_OP2);
			setState(308); unaryExpressionNot();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class UnaryExpressionNotContext extends ParserRuleContext {
		public UnaryExpressionNotApplicationContext unaryExpressionNotApplication() {
			return getRuleContext(UnaryExpressionNotApplicationContext.class,0);
		}
		public UnaryExpressionPostIncDecContext unaryExpressionPostIncDec() {
			return getRuleContext(UnaryExpressionPostIncDecContext.class,0);
		}
		public UnaryExpressionNotContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unaryExpressionNot; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DuroListener ) ((DuroListener)listener).enterUnaryExpressionNot(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DuroListener ) ((DuroListener)listener).exitUnaryExpressionNot(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DuroVisitor ) return ((DuroVisitor<? extends T>)visitor).visitUnaryExpressionNot(this);
			else return visitor.visitChildren(this);
		}
	}

	public final UnaryExpressionNotContext unaryExpressionNot() throws RecognitionException {
		UnaryExpressionNotContext _localctx = new UnaryExpressionNotContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_unaryExpressionNot);
		try {
			setState(312);
			switch (_input.LA(1)) {
			case NOT:
				enterOuterAlt(_localctx, 1);
				{
				setState(310); unaryExpressionNotApplication();
				}
				break;
			case STRING_LITERAL:
			case PARAGRAPH:
			case OPEN_SQ:
			case OPEN_BRA:
			case OPEN_PAR:
			case EQUALS:
			case NOT_EQUALS:
			case LESS_THAN:
			case LESS_THAN_OR_EQUALS:
			case GREATER_THAN:
			case GREATER_THAN_OR_EQUALS:
			case BIN_OP1:
			case BIN_OP2:
			case INT:
			case COLON:
			case KW_FUNCTION:
			case KW_TRUE:
			case KW_FALSE:
			case KW_THIS:
			case KW_NULL:
			case KW_FRAME:
			case ID:
				enterOuterAlt(_localctx, 2);
				{
				setState(311); unaryExpressionPostIncDec();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class UnaryExpressionNotApplicationContext extends ParserRuleContext {
		public TerminalNode NOT() { return getToken(DuroParser.NOT, 0); }
		public UnaryExpressionPostIncDecContext unaryExpressionPostIncDec() {
			return getRuleContext(UnaryExpressionPostIncDecContext.class,0);
		}
		public UnaryExpressionNotApplicationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unaryExpressionNotApplication; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DuroListener ) ((DuroListener)listener).enterUnaryExpressionNotApplication(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DuroListener ) ((DuroListener)listener).exitUnaryExpressionNotApplication(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DuroVisitor ) return ((DuroVisitor<? extends T>)visitor).visitUnaryExpressionNotApplication(this);
			else return visitor.visitChildren(this);
		}
	}

	public final UnaryExpressionNotApplicationContext unaryExpressionNotApplication() throws RecognitionException {
		UnaryExpressionNotApplicationContext _localctx = new UnaryExpressionNotApplicationContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_unaryExpressionNotApplication);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(314); match(NOT);
			setState(315); unaryExpressionPostIncDec();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class UnaryExpressionPostIncDecContext extends ParserRuleContext {
		public UnaryExpressionPostIncDecApplicationContext unaryExpressionPostIncDecApplication() {
			return getRuleContext(UnaryExpressionPostIncDecApplicationContext.class,0);
		}
		public UnaryExpressionPostIncDecOperandContext unaryExpressionPostIncDecOperand() {
			return getRuleContext(UnaryExpressionPostIncDecOperandContext.class,0);
		}
		public UnaryExpressionPostIncDecContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unaryExpressionPostIncDec; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DuroListener ) ((DuroListener)listener).enterUnaryExpressionPostIncDec(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DuroListener ) ((DuroListener)listener).exitUnaryExpressionPostIncDec(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DuroVisitor ) return ((DuroVisitor<? extends T>)visitor).visitUnaryExpressionPostIncDec(this);
			else return visitor.visitChildren(this);
		}
	}

	public final UnaryExpressionPostIncDecContext unaryExpressionPostIncDec() throws RecognitionException {
		UnaryExpressionPostIncDecContext _localctx = new UnaryExpressionPostIncDecContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_unaryExpressionPostIncDec);
		try {
			setState(319);
			switch ( getInterpreter().adaptivePredict(_input,16,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(317); unaryExpressionPostIncDecApplication();
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(318); unaryExpressionPostIncDecOperand();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class UnaryExpressionPostIncDecApplicationContext extends ParserRuleContext {
		public Token op;
		public TerminalNode DOUBLE_PLUS() { return getToken(DuroParser.DOUBLE_PLUS, 0); }
		public UnaryExpressionPostIncDecApplicationMemberAccessContext unaryExpressionPostIncDecApplicationMemberAccess() {
			return getRuleContext(UnaryExpressionPostIncDecApplicationMemberAccessContext.class,0);
		}
		public UnaryExpressionPostIncDecApplicationIndexAccessContext unaryExpressionPostIncDecApplicationIndexAccess() {
			return getRuleContext(UnaryExpressionPostIncDecApplicationIndexAccessContext.class,0);
		}
		public TerminalNode DOUBLE_MINUS() { return getToken(DuroParser.DOUBLE_MINUS, 0); }
		public UnaryExpressionPostIncDecApplicationVariableContext unaryExpressionPostIncDecApplicationVariable() {
			return getRuleContext(UnaryExpressionPostIncDecApplicationVariableContext.class,0);
		}
		public UnaryExpressionPostIncDecApplicationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unaryExpressionPostIncDecApplication; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DuroListener ) ((DuroListener)listener).enterUnaryExpressionPostIncDecApplication(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DuroListener ) ((DuroListener)listener).exitUnaryExpressionPostIncDecApplication(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DuroVisitor ) return ((DuroVisitor<? extends T>)visitor).visitUnaryExpressionPostIncDecApplication(this);
			else return visitor.visitChildren(this);
		}
	}

	public final UnaryExpressionPostIncDecApplicationContext unaryExpressionPostIncDecApplication() throws RecognitionException {
		UnaryExpressionPostIncDecApplicationContext _localctx = new UnaryExpressionPostIncDecApplicationContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_unaryExpressionPostIncDecApplication);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(324);
			switch ( getInterpreter().adaptivePredict(_input,17,_ctx) ) {
			case 1:
				{
				setState(321); unaryExpressionPostIncDecApplicationVariable();
				}
				break;

			case 2:
				{
				setState(322); unaryExpressionPostIncDecApplicationMemberAccess();
				}
				break;

			case 3:
				{
				setState(323); unaryExpressionPostIncDecApplicationIndexAccess();
				}
				break;
			}
			setState(326);
			((UnaryExpressionPostIncDecApplicationContext)_localctx).op = _input.LT(1);
			_la = _input.LA(1);
			if ( !(_la==DOUBLE_PLUS || _la==DOUBLE_MINUS) ) {
				((UnaryExpressionPostIncDecApplicationContext)_localctx).op = (Token)_errHandler.recoverInline(this);
			}
			consume();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class UnaryExpressionPostIncDecApplicationVariableContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(DuroParser.ID, 0); }
		public UnaryExpressionPostIncDecApplicationVariableContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unaryExpressionPostIncDecApplicationVariable; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DuroListener ) ((DuroListener)listener).enterUnaryExpressionPostIncDecApplicationVariable(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DuroListener ) ((DuroListener)listener).exitUnaryExpressionPostIncDecApplicationVariable(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DuroVisitor ) return ((DuroVisitor<? extends T>)visitor).visitUnaryExpressionPostIncDecApplicationVariable(this);
			else return visitor.visitChildren(this);
		}
	}

	public final UnaryExpressionPostIncDecApplicationVariableContext unaryExpressionPostIncDecApplicationVariable() throws RecognitionException {
		UnaryExpressionPostIncDecApplicationVariableContext _localctx = new UnaryExpressionPostIncDecApplicationVariableContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_unaryExpressionPostIncDecApplicationVariable);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(328); match(ID);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class UnaryExpressionPostIncDecApplicationMemberAccessContext extends ParserRuleContext {
		public TerminalNode DOT() { return getToken(DuroParser.DOT, 0); }
		public TerminalNode ID() { return getToken(DuroParser.ID, 0); }
		public UnaryExpressionPostIncDecOperandContext unaryExpressionPostIncDecOperand() {
			return getRuleContext(UnaryExpressionPostIncDecOperandContext.class,0);
		}
		public UnaryExpressionPostIncDecApplicationMemberAccessContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unaryExpressionPostIncDecApplicationMemberAccess; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DuroListener ) ((DuroListener)listener).enterUnaryExpressionPostIncDecApplicationMemberAccess(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DuroListener ) ((DuroListener)listener).exitUnaryExpressionPostIncDecApplicationMemberAccess(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DuroVisitor ) return ((DuroVisitor<? extends T>)visitor).visitUnaryExpressionPostIncDecApplicationMemberAccess(this);
			else return visitor.visitChildren(this);
		}
	}

	public final UnaryExpressionPostIncDecApplicationMemberAccessContext unaryExpressionPostIncDecApplicationMemberAccess() throws RecognitionException {
		UnaryExpressionPostIncDecApplicationMemberAccessContext _localctx = new UnaryExpressionPostIncDecApplicationMemberAccessContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_unaryExpressionPostIncDecApplicationMemberAccess);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(330); unaryExpressionPostIncDecOperand();
			setState(331); match(DOT);
			setState(332); match(ID);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class UnaryExpressionPostIncDecApplicationIndexAccessContext extends ParserRuleContext {
		public TerminalNode OPEN_SQ() { return getToken(DuroParser.OPEN_SQ, 0); }
		public TerminalNode CLOSE_SQ() { return getToken(DuroParser.CLOSE_SQ, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public UnaryExpressionPostIncDecApplicationIndexAccessReceiverContext unaryExpressionPostIncDecApplicationIndexAccessReceiver() {
			return getRuleContext(UnaryExpressionPostIncDecApplicationIndexAccessReceiverContext.class,0);
		}
		public UnaryExpressionPostIncDecApplicationIndexAccessContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unaryExpressionPostIncDecApplicationIndexAccess; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DuroListener ) ((DuroListener)listener).enterUnaryExpressionPostIncDecApplicationIndexAccess(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DuroListener ) ((DuroListener)listener).exitUnaryExpressionPostIncDecApplicationIndexAccess(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DuroVisitor ) return ((DuroVisitor<? extends T>)visitor).visitUnaryExpressionPostIncDecApplicationIndexAccess(this);
			else return visitor.visitChildren(this);
		}
	}

	public final UnaryExpressionPostIncDecApplicationIndexAccessContext unaryExpressionPostIncDecApplicationIndexAccess() throws RecognitionException {
		UnaryExpressionPostIncDecApplicationIndexAccessContext _localctx = new UnaryExpressionPostIncDecApplicationIndexAccessContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_unaryExpressionPostIncDecApplicationIndexAccess);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(334); unaryExpressionPostIncDecApplicationIndexAccessReceiver();
			setState(335); match(OPEN_SQ);
			setState(336); expression();
			setState(337); match(CLOSE_SQ);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class UnaryExpressionPostIncDecApplicationIndexAccessReceiverContext extends ParserRuleContext {
		public UnaryExpressionPostIncDecOperandContext unaryExpressionPostIncDecOperand() {
			return getRuleContext(UnaryExpressionPostIncDecOperandContext.class,0);
		}
		public UnaryExpressionPostIncDecApplicationIndexAccessReceiverContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unaryExpressionPostIncDecApplicationIndexAccessReceiver; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DuroListener ) ((DuroListener)listener).enterUnaryExpressionPostIncDecApplicationIndexAccessReceiver(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DuroListener ) ((DuroListener)listener).exitUnaryExpressionPostIncDecApplicationIndexAccessReceiver(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DuroVisitor ) return ((DuroVisitor<? extends T>)visitor).visitUnaryExpressionPostIncDecApplicationIndexAccessReceiver(this);
			else return visitor.visitChildren(this);
		}
	}

	public final UnaryExpressionPostIncDecApplicationIndexAccessReceiverContext unaryExpressionPostIncDecApplicationIndexAccessReceiver() throws RecognitionException {
		UnaryExpressionPostIncDecApplicationIndexAccessReceiverContext _localctx = new UnaryExpressionPostIncDecApplicationIndexAccessReceiverContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_unaryExpressionPostIncDecApplicationIndexAccessReceiver);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(339); unaryExpressionPostIncDecOperand();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class UnaryExpressionPostIncDecOperandContext extends ParserRuleContext {
		public OperationEndContext operationEnd() {
			return getRuleContext(OperationEndContext.class,0);
		}
		public GroupingContext grouping() {
			return getRuleContext(GroupingContext.class,0);
		}
		public ThisMessageExchangeContext thisMessageExchange() {
			return getRuleContext(ThisMessageExchangeContext.class,0);
		}
		public LookupContext lookup() {
			return getRuleContext(LookupContext.class,0);
		}
		public ArgumentParameterContext argumentParameter() {
			return getRuleContext(ArgumentParameterContext.class,0);
		}
		public List<OperationChainContext> operationChain() {
			return getRuleContexts(OperationChainContext.class);
		}
		public LiteralContext literal() {
			return getRuleContext(LiteralContext.class,0);
		}
		public OperationChainContext operationChain(int i) {
			return getRuleContext(OperationChainContext.class,i);
		}
		public FrameContext frame() {
			return getRuleContext(FrameContext.class,0);
		}
		public SelfContext self() {
			return getRuleContext(SelfContext.class,0);
		}
		public NilContext nil() {
			return getRuleContext(NilContext.class,0);
		}
		public PrimitiveContext primitive() {
			return getRuleContext(PrimitiveContext.class,0);
		}
		public UnaryExpressionPostIncDecOperandContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unaryExpressionPostIncDecOperand; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DuroListener ) ((DuroListener)listener).enterUnaryExpressionPostIncDecOperand(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DuroListener ) ((DuroListener)listener).exitUnaryExpressionPostIncDecOperand(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DuroVisitor ) return ((DuroVisitor<? extends T>)visitor).visitUnaryExpressionPostIncDecOperand(this);
			else return visitor.visitChildren(this);
		}
	}

	public final UnaryExpressionPostIncDecOperandContext unaryExpressionPostIncDecOperand() throws RecognitionException {
		UnaryExpressionPostIncDecOperandContext _localctx = new UnaryExpressionPostIncDecOperandContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_unaryExpressionPostIncDecOperand);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(350);
			switch ( getInterpreter().adaptivePredict(_input,18,_ctx) ) {
			case 1:
				{
				setState(341); grouping();
				}
				break;

			case 2:
				{
				setState(342); thisMessageExchange();
				}
				break;

			case 3:
				{
				setState(343); lookup();
				}
				break;

			case 4:
				{
				setState(344); argumentParameter();
				}
				break;

			case 5:
				{
				setState(345); literal();
				}
				break;

			case 6:
				{
				setState(346); self();
				}
				break;

			case 7:
				{
				setState(347); nil();
				}
				break;

			case 8:
				{
				setState(348); frame();
				}
				break;

			case 9:
				{
				setState(349); primitive();
				}
				break;
			}
			setState(355);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,19,_ctx);
			while ( _alt!=2 && _alt!=-1 ) {
				if ( _alt==1 ) {
					{
					{
					setState(352); operationChain();
					}
					} 
				}
				setState(357);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,19,_ctx);
			}
			setState(359);
			switch ( getInterpreter().adaptivePredict(_input,20,_ctx) ) {
			case 1:
				{
				setState(358); operationEnd();
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class GroupingContext extends ParserRuleContext {
		public TerminalNode OPEN_PAR() { return getToken(DuroParser.OPEN_PAR, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode CLOSE_PAR() { return getToken(DuroParser.CLOSE_PAR, 0); }
		public GroupingContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_grouping; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DuroListener ) ((DuroListener)listener).enterGrouping(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DuroListener ) ((DuroListener)listener).exitGrouping(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DuroVisitor ) return ((DuroVisitor<? extends T>)visitor).visitGrouping(this);
			else return visitor.visitChildren(this);
		}
	}

	public final GroupingContext grouping() throws RecognitionException {
		GroupingContext _localctx = new GroupingContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_grouping);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(361); match(OPEN_PAR);
			setState(362); expression();
			setState(363); match(CLOSE_PAR);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class VariableAssignmentContext extends ParserRuleContext {
		public Token op;
		public List<TerminalNode> ID() { return getTokens(DuroParser.ID); }
		public TerminalNode ASSIGN_MULT() { return getToken(DuroParser.ASSIGN_MULT, 0); }
		public TerminalNode ASSIGN() { return getToken(DuroParser.ASSIGN, 0); }
		public TerminalNode ASSIGN_DIV() { return getToken(DuroParser.ASSIGN_DIV, 0); }
		public TerminalNode ASSIGN_REM() { return getToken(DuroParser.ASSIGN_REM, 0); }
		public TerminalNode ASSIGN_ADD() { return getToken(DuroParser.ASSIGN_ADD, 0); }
		public List<TerminalNode> COMMA() { return getTokens(DuroParser.COMMA); }
		public TerminalNode ID(int i) {
			return getToken(DuroParser.ID, i);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode ASSIGN_SUB() { return getToken(DuroParser.ASSIGN_SUB, 0); }
		public TerminalNode COMMA(int i) {
			return getToken(DuroParser.COMMA, i);
		}
		public VariableAssignmentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variableAssignment; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DuroListener ) ((DuroListener)listener).enterVariableAssignment(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DuroListener ) ((DuroListener)listener).exitVariableAssignment(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DuroVisitor ) return ((DuroVisitor<? extends T>)visitor).visitVariableAssignment(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VariableAssignmentContext variableAssignment() throws RecognitionException {
		VariableAssignmentContext _localctx = new VariableAssignmentContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_variableAssignment);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(365); match(ID);
			setState(370);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(366); match(COMMA);
				setState(367); match(ID);
				}
				}
				setState(372);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(373);
			((VariableAssignmentContext)_localctx).op = _input.LT(1);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ASSIGN) | (1L << ASSIGN_ADD) | (1L << ASSIGN_SUB) | (1L << ASSIGN_MULT) | (1L << ASSIGN_DIV) | (1L << ASSIGN_REM))) != 0)) ) {
				((VariableAssignmentContext)_localctx).op = (Token)_errHandler.recoverInline(this);
			}
			consume();
			setState(374); expression();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class LookupContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(DuroParser.ID, 0); }
		public LookupContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lookup; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DuroListener ) ((DuroListener)listener).enterLookup(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DuroListener ) ((DuroListener)listener).exitLookup(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DuroVisitor ) return ((DuroVisitor<? extends T>)visitor).visitLookup(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LookupContext lookup() throws RecognitionException {
		LookupContext _localctx = new LookupContext(_ctx, getState());
		enterRule(_localctx, 68, RULE_lookup);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(376); match(ID);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ArgumentParameterContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(DuroParser.ID, 0); }
		public TerminalNode COLON() { return getToken(DuroParser.COLON, 0); }
		public ArgumentParameterContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_argumentParameter; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DuroListener ) ((DuroListener)listener).enterArgumentParameter(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DuroListener ) ((DuroListener)listener).exitArgumentParameter(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DuroVisitor ) return ((DuroVisitor<? extends T>)visitor).visitArgumentParameter(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArgumentParameterContext argumentParameter() throws RecognitionException {
		ArgumentParameterContext _localctx = new ArgumentParameterContext(_ctx, getState());
		enterRule(_localctx, 70, RULE_argumentParameter);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(378); match(COLON);
			setState(379); match(ID);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ThisMessageExchangeContext extends ParserRuleContext {
		public MessageExchangeContext messageExchange() {
			return getRuleContext(MessageExchangeContext.class,0);
		}
		public ThisMessageExchangeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_thisMessageExchange; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DuroListener ) ((DuroListener)listener).enterThisMessageExchange(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DuroListener ) ((DuroListener)listener).exitThisMessageExchange(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DuroVisitor ) return ((DuroVisitor<? extends T>)visitor).visitThisMessageExchange(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ThisMessageExchangeContext thisMessageExchange() throws RecognitionException {
		ThisMessageExchangeContext _localctx = new ThisMessageExchangeContext(_ctx, getState());
		enterRule(_localctx, 72, RULE_thisMessageExchange);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(381); messageExchange();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class MessageExchangeContext extends ParserRuleContext {
		public MessageIdContext messageId() {
			return getRuleContext(MessageIdContext.class,0);
		}
		public List<TerminalNode> COMMA() { return getTokens(DuroParser.COMMA); }
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode OPEN_PAR() { return getToken(DuroParser.OPEN_PAR, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public TerminalNode CLOSE_PAR() { return getToken(DuroParser.CLOSE_PAR, 0); }
		public TerminalNode COMMA(int i) {
			return getToken(DuroParser.COMMA, i);
		}
		public MessageExchangeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_messageExchange; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DuroListener ) ((DuroListener)listener).enterMessageExchange(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DuroListener ) ((DuroListener)listener).exitMessageExchange(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DuroVisitor ) return ((DuroVisitor<? extends T>)visitor).visitMessageExchange(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MessageExchangeContext messageExchange() throws RecognitionException {
		MessageExchangeContext _localctx = new MessageExchangeContext(_ctx, getState());
		enterRule(_localctx, 74, RULE_messageExchange);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(383); messageId();
			setState(384); match(OPEN_PAR);
			setState(393);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << STRING_LITERAL) | (1L << PARAGRAPH) | (1L << NOT) | (1L << OPEN_SQ) | (1L << OPEN_BRA) | (1L << OPEN_PAR) | (1L << EQUALS) | (1L << NOT_EQUALS) | (1L << LESS_THAN) | (1L << LESS_THAN_OR_EQUALS) | (1L << GREATER_THAN) | (1L << GREATER_THAN_OR_EQUALS) | (1L << BIN_OP1) | (1L << BIN_OP2) | (1L << INT) | (1L << COLON) | (1L << KW_FUNCTION) | (1L << KW_TRUE) | (1L << KW_FALSE) | (1L << KW_THIS) | (1L << KW_NULL) | (1L << KW_FRAME) | (1L << ID))) != 0)) {
				{
				setState(385); expression();
				setState(390);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(386); match(COMMA);
					setState(387); expression();
					}
					}
					setState(392);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(395); match(CLOSE_PAR);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class MessageIdContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(DuroParser.ID, 0); }
		public OperatorContext operator() {
			return getRuleContext(OperatorContext.class,0);
		}
		public MessageIdContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_messageId; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DuroListener ) ((DuroListener)listener).enterMessageId(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DuroListener ) ((DuroListener)listener).exitMessageId(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DuroVisitor ) return ((DuroVisitor<? extends T>)visitor).visitMessageId(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MessageIdContext messageId() throws RecognitionException {
		MessageIdContext _localctx = new MessageIdContext(_ctx, getState());
		enterRule(_localctx, 76, RULE_messageId);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(399);
			switch (_input.LA(1)) {
			case ID:
				{
				setState(397); match(ID);
				}
				break;
			case EQUALS:
			case NOT_EQUALS:
			case LESS_THAN:
			case LESS_THAN_OR_EQUALS:
			case GREATER_THAN:
			case GREATER_THAN_OR_EQUALS:
			case BIN_OP1:
			case BIN_OP2:
				{
				setState(398); operator();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class OperatorContext extends ParserRuleContext {
		public TerminalNode EQUALS() { return getToken(DuroParser.EQUALS, 0); }
		public TerminalNode LESS_THAN_OR_EQUALS() { return getToken(DuroParser.LESS_THAN_OR_EQUALS, 0); }
		public TerminalNode BIN_OP1() { return getToken(DuroParser.BIN_OP1, 0); }
		public TerminalNode NOT_EQUALS() { return getToken(DuroParser.NOT_EQUALS, 0); }
		public TerminalNode LESS_THAN() { return getToken(DuroParser.LESS_THAN, 0); }
		public TerminalNode GREATER_THAN() { return getToken(DuroParser.GREATER_THAN, 0); }
		public TerminalNode GREATER_THAN_OR_EQUALS() { return getToken(DuroParser.GREATER_THAN_OR_EQUALS, 0); }
		public TerminalNode BIN_OP2() { return getToken(DuroParser.BIN_OP2, 0); }
		public OperatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_operator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DuroListener ) ((DuroListener)listener).enterOperator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DuroListener ) ((DuroListener)listener).exitOperator(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DuroVisitor ) return ((DuroVisitor<? extends T>)visitor).visitOperator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OperatorContext operator() throws RecognitionException {
		OperatorContext _localctx = new OperatorContext(_ctx, getState());
		enterRule(_localctx, 78, RULE_operator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(401);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << EQUALS) | (1L << NOT_EQUALS) | (1L << LESS_THAN) | (1L << LESS_THAN_OR_EQUALS) | (1L << GREATER_THAN) | (1L << GREATER_THAN_OR_EQUALS) | (1L << BIN_OP1) | (1L << BIN_OP2))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			consume();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class LiteralContext extends ParserRuleContext {
		public IntegerContext integer() {
			return getRuleContext(IntegerContext.class,0);
		}
		public DictProcessContext dictProcess() {
			return getRuleContext(DictProcessContext.class,0);
		}
		public FunctionLiteralContext functionLiteral() {
			return getRuleContext(FunctionLiteralContext.class,0);
		}
		public ClosureLiteralContext closureLiteral() {
			return getRuleContext(ClosureLiteralContext.class,0);
		}
		public StringContext string() {
			return getRuleContext(StringContext.class,0);
		}
		public BoolContext bool() {
			return getRuleContext(BoolContext.class,0);
		}
		public ArrayContext array() {
			return getRuleContext(ArrayContext.class,0);
		}
		public LiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_literal; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DuroListener ) ((DuroListener)listener).enterLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DuroListener ) ((DuroListener)listener).exitLiteral(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DuroVisitor ) return ((DuroVisitor<? extends T>)visitor).visitLiteral(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LiteralContext literal() throws RecognitionException {
		LiteralContext _localctx = new LiteralContext(_ctx, getState());
		enterRule(_localctx, 80, RULE_literal);
		try {
			setState(410);
			switch ( getInterpreter().adaptivePredict(_input,25,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(403); integer();
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(404); bool();
				}
				break;

			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(405); string();
				}
				break;

			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(406); dictProcess();
				}
				break;

			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(407); functionLiteral();
				}
				break;

			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(408); closureLiteral();
				}
				break;

			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(409); array();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class IntegerContext extends ParserRuleContext {
		public TerminalNode INT() { return getToken(DuroParser.INT, 0); }
		public IntegerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_integer; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DuroListener ) ((DuroListener)listener).enterInteger(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DuroListener ) ((DuroListener)listener).exitInteger(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DuroVisitor ) return ((DuroVisitor<? extends T>)visitor).visitInteger(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IntegerContext integer() throws RecognitionException {
		IntegerContext _localctx = new IntegerContext(_ctx, getState());
		enterRule(_localctx, 82, RULE_integer);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(412); match(INT);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class BoolContext extends ParserRuleContext {
		public TerminalNode KW_TRUE() { return getToken(DuroParser.KW_TRUE, 0); }
		public TerminalNode KW_FALSE() { return getToken(DuroParser.KW_FALSE, 0); }
		public BoolContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bool; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DuroListener ) ((DuroListener)listener).enterBool(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DuroListener ) ((DuroListener)listener).exitBool(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DuroVisitor ) return ((DuroVisitor<? extends T>)visitor).visitBool(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BoolContext bool() throws RecognitionException {
		BoolContext _localctx = new BoolContext(_ctx, getState());
		enterRule(_localctx, 84, RULE_bool);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(414);
			_la = _input.LA(1);
			if ( !(_la==KW_TRUE || _la==KW_FALSE) ) {
			_errHandler.recoverInline(this);
			}
			consume();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class StringContext extends ParserRuleContext {
		public TerminalNode STRING_LITERAL() { return getToken(DuroParser.STRING_LITERAL, 0); }
		public StringContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_string; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DuroListener ) ((DuroListener)listener).enterString(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DuroListener ) ((DuroListener)listener).exitString(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DuroVisitor ) return ((DuroVisitor<? extends T>)visitor).visitString(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StringContext string() throws RecognitionException {
		StringContext _localctx = new StringContext(_ctx, getState());
		enterRule(_localctx, 86, RULE_string);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(416); match(STRING_LITERAL);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DictProcessContext extends ParserRuleContext {
		public List<DictProcessEntryContext> dictProcessEntry() {
			return getRuleContexts(DictProcessEntryContext.class);
		}
		public List<TerminalNode> COMMA() { return getTokens(DuroParser.COMMA); }
		public DictProcessEntryContext dictProcessEntry(int i) {
			return getRuleContext(DictProcessEntryContext.class,i);
		}
		public TerminalNode CLOSE_BRA() { return getToken(DuroParser.CLOSE_BRA, 0); }
		public TerminalNode COMMA(int i) {
			return getToken(DuroParser.COMMA, i);
		}
		public TerminalNode OPEN_BRA() { return getToken(DuroParser.OPEN_BRA, 0); }
		public DictProcessContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dictProcess; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DuroListener ) ((DuroListener)listener).enterDictProcess(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DuroListener ) ((DuroListener)listener).exitDictProcess(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DuroVisitor ) return ((DuroVisitor<? extends T>)visitor).visitDictProcess(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DictProcessContext dictProcess() throws RecognitionException {
		DictProcessContext _localctx = new DictProcessContext(_ctx, getState());
		enterRule(_localctx, 88, RULE_dictProcess);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(418); match(OPEN_BRA);
			setState(427);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << EQUALS) | (1L << NOT_EQUALS) | (1L << LESS_THAN) | (1L << LESS_THAN_OR_EQUALS) | (1L << GREATER_THAN) | (1L << GREATER_THAN_OR_EQUALS) | (1L << BIN_OP1) | (1L << BIN_OP2) | (1L << ID))) != 0)) {
				{
				setState(419); dictProcessEntry();
				setState(424);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(420); match(COMMA);
					setState(421); dictProcessEntry();
					}
					}
					setState(426);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(429); match(CLOSE_BRA);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DictProcessEntryContext extends ParserRuleContext {
		public MessageIdContext messageId() {
			return getRuleContext(MessageIdContext.class,0);
		}
		public TerminalNode COLON() { return getToken(DuroParser.COLON, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public DictProcessEntryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dictProcessEntry; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DuroListener ) ((DuroListener)listener).enterDictProcessEntry(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DuroListener ) ((DuroListener)listener).exitDictProcessEntry(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DuroVisitor ) return ((DuroVisitor<? extends T>)visitor).visitDictProcessEntry(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DictProcessEntryContext dictProcessEntry() throws RecognitionException {
		DictProcessEntryContext _localctx = new DictProcessEntryContext(_ctx, getState());
		enterRule(_localctx, 90, RULE_dictProcessEntry);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(431); messageId();
			setState(432); match(COLON);
			setState(433); expression();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FunctionLiteralContext extends ParserRuleContext {
		public FunctionBodyContext functionBody() {
			return getRuleContext(FunctionBodyContext.class,0);
		}
		public TerminalNode KW_FUNCTION() { return getToken(DuroParser.KW_FUNCTION, 0); }
		public TerminalNode OPEN_PAR() { return getToken(DuroParser.OPEN_PAR, 0); }
		public FunctionParametersContext functionParameters() {
			return getRuleContext(FunctionParametersContext.class,0);
		}
		public TerminalNode CLOSE_PAR() { return getToken(DuroParser.CLOSE_PAR, 0); }
		public TerminalNode CLOSE_BRA() { return getToken(DuroParser.CLOSE_BRA, 0); }
		public TerminalNode OPEN_BRA() { return getToken(DuroParser.OPEN_BRA, 0); }
		public FunctionLiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionLiteral; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DuroListener ) ((DuroListener)listener).enterFunctionLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DuroListener ) ((DuroListener)listener).exitFunctionLiteral(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DuroVisitor ) return ((DuroVisitor<? extends T>)visitor).visitFunctionLiteral(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunctionLiteralContext functionLiteral() throws RecognitionException {
		FunctionLiteralContext _localctx = new FunctionLiteralContext(_ctx, getState());
		enterRule(_localctx, 92, RULE_functionLiteral);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(435); match(KW_FUNCTION);
			setState(436); match(OPEN_PAR);
			setState(437); functionParameters();
			setState(438); match(CLOSE_PAR);
			setState(439); match(OPEN_BRA);
			setState(440); functionBody();
			setState(441); match(CLOSE_BRA);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ClosureLiteralContext extends ParserRuleContext {
		public ClosureBodyContext closureBody() {
			return getRuleContext(ClosureBodyContext.class,0);
		}
		public TerminalNode CLOSE_BRA() { return getToken(DuroParser.CLOSE_BRA, 0); }
		public TerminalNode OPEN_BRA() { return getToken(DuroParser.OPEN_BRA, 0); }
		public ClosureParametersContext closureParameters() {
			return getRuleContext(ClosureParametersContext.class,0);
		}
		public ClosureLiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_closureLiteral; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DuroListener ) ((DuroListener)listener).enterClosureLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DuroListener ) ((DuroListener)listener).exitClosureLiteral(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DuroVisitor ) return ((DuroVisitor<? extends T>)visitor).visitClosureLiteral(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ClosureLiteralContext closureLiteral() throws RecognitionException {
		ClosureLiteralContext _localctx = new ClosureLiteralContext(_ctx, getState());
		enterRule(_localctx, 94, RULE_closureLiteral);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(443); match(OPEN_BRA);
			setState(444); closureParameters();
			setState(445); closureBody();
			setState(446); match(CLOSE_BRA);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ClosureParametersContext extends ParserRuleContext {
		public List<TerminalNode> ID() { return getTokens(DuroParser.ID); }
		public List<TerminalNode> SINGLE_PIPE() { return getTokens(DuroParser.SINGLE_PIPE); }
		public List<TerminalNode> COMMA() { return getTokens(DuroParser.COMMA); }
		public TerminalNode ID(int i) {
			return getToken(DuroParser.ID, i);
		}
		public TerminalNode SINGLE_PIPE(int i) {
			return getToken(DuroParser.SINGLE_PIPE, i);
		}
		public TerminalNode COMMA(int i) {
			return getToken(DuroParser.COMMA, i);
		}
		public ClosureParametersContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_closureParameters; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DuroListener ) ((DuroListener)listener).enterClosureParameters(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DuroListener ) ((DuroListener)listener).exitClosureParameters(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DuroVisitor ) return ((DuroVisitor<? extends T>)visitor).visitClosureParameters(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ClosureParametersContext closureParameters() throws RecognitionException {
		ClosureParametersContext _localctx = new ClosureParametersContext(_ctx, getState());
		enterRule(_localctx, 96, RULE_closureParameters);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(460);
			_la = _input.LA(1);
			if (_la==SINGLE_PIPE) {
				{
				setState(448); match(SINGLE_PIPE);
				setState(457);
				_la = _input.LA(1);
				if (_la==ID) {
					{
					setState(449); match(ID);
					setState(454);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==COMMA) {
						{
						{
						setState(450); match(COMMA);
						setState(451); match(ID);
						}
						}
						setState(456);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
				}

				setState(459); match(SINGLE_PIPE);
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ClosureBodyContext extends ParserRuleContext {
		public ProgramElementsContext programElements() {
			return getRuleContext(ProgramElementsContext.class,0);
		}
		public ClosureBodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_closureBody; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DuroListener ) ((DuroListener)listener).enterClosureBody(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DuroListener ) ((DuroListener)listener).exitClosureBody(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DuroVisitor ) return ((DuroVisitor<? extends T>)visitor).visitClosureBody(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ClosureBodyContext closureBody() throws RecognitionException {
		ClosureBodyContext _localctx = new ClosureBodyContext(_ctx, getState());
		enterRule(_localctx, 98, RULE_closureBody);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(462); programElements();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ArrayContext extends ParserRuleContext {
		public TerminalNode OPEN_SQ() { return getToken(DuroParser.OPEN_SQ, 0); }
		public TerminalNode CLOSE_SQ() { return getToken(DuroParser.CLOSE_SQ, 0); }
		public List<TerminalNode> COMMA() { return getTokens(DuroParser.COMMA); }
		public ArrayOperandContext arrayOperand(int i) {
			return getRuleContext(ArrayOperandContext.class,i);
		}
		public List<ArrayOperandContext> arrayOperand() {
			return getRuleContexts(ArrayOperandContext.class);
		}
		public TerminalNode COMMA(int i) {
			return getToken(DuroParser.COMMA, i);
		}
		public ArrayContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_array; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DuroListener ) ((DuroListener)listener).enterArray(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DuroListener ) ((DuroListener)listener).exitArray(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DuroVisitor ) return ((DuroVisitor<? extends T>)visitor).visitArray(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArrayContext array() throws RecognitionException {
		ArrayContext _localctx = new ArrayContext(_ctx, getState());
		enterRule(_localctx, 100, RULE_array);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(464); match(OPEN_SQ);
			setState(473);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << STRING_LITERAL) | (1L << PARAGRAPH) | (1L << NOT) | (1L << OPEN_SQ) | (1L << OPEN_BRA) | (1L << OPEN_PAR) | (1L << EQUALS) | (1L << NOT_EQUALS) | (1L << LESS_THAN) | (1L << LESS_THAN_OR_EQUALS) | (1L << GREATER_THAN) | (1L << GREATER_THAN_OR_EQUALS) | (1L << BIN_OP1) | (1L << BIN_OP2) | (1L << INT) | (1L << COLON) | (1L << KW_FUNCTION) | (1L << KW_TRUE) | (1L << KW_FALSE) | (1L << KW_THIS) | (1L << KW_NULL) | (1L << KW_FRAME) | (1L << ID))) != 0)) {
				{
				setState(465); arrayOperand();
				setState(470);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(466); match(COMMA);
					setState(467); arrayOperand();
					}
					}
					setState(472);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(475); match(CLOSE_SQ);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ArrayOperandContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ArrayOperandContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arrayOperand; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DuroListener ) ((DuroListener)listener).enterArrayOperand(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DuroListener ) ((DuroListener)listener).exitArrayOperand(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DuroVisitor ) return ((DuroVisitor<? extends T>)visitor).visitArrayOperand(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArrayOperandContext arrayOperand() throws RecognitionException {
		ArrayOperandContext _localctx = new ArrayOperandContext(_ctx, getState());
		enterRule(_localctx, 102, RULE_arrayOperand);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(477); expression();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SelfContext extends ParserRuleContext {
		public TerminalNode KW_THIS() { return getToken(DuroParser.KW_THIS, 0); }
		public SelfContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_self; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DuroListener ) ((DuroListener)listener).enterSelf(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DuroListener ) ((DuroListener)listener).exitSelf(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DuroVisitor ) return ((DuroVisitor<? extends T>)visitor).visitSelf(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SelfContext self() throws RecognitionException {
		SelfContext _localctx = new SelfContext(_ctx, getState());
		enterRule(_localctx, 104, RULE_self);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(479); match(KW_THIS);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class NilContext extends ParserRuleContext {
		public TerminalNode KW_NULL() { return getToken(DuroParser.KW_NULL, 0); }
		public NilContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_nil; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DuroListener ) ((DuroListener)listener).enterNil(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DuroListener ) ((DuroListener)listener).exitNil(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DuroVisitor ) return ((DuroVisitor<? extends T>)visitor).visitNil(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NilContext nil() throws RecognitionException {
		NilContext _localctx = new NilContext(_ctx, getState());
		enterRule(_localctx, 106, RULE_nil);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(481); match(KW_NULL);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FrameContext extends ParserRuleContext {
		public TerminalNode KW_FRAME() { return getToken(DuroParser.KW_FRAME, 0); }
		public FrameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_frame; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DuroListener ) ((DuroListener)listener).enterFrame(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DuroListener ) ((DuroListener)listener).exitFrame(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DuroVisitor ) return ((DuroVisitor<? extends T>)visitor).visitFrame(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FrameContext frame() throws RecognitionException {
		FrameContext _localctx = new FrameContext(_ctx, getState());
		enterRule(_localctx, 108, RULE_frame);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(483); match(KW_FRAME);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PrimitiveContext extends ParserRuleContext {
		public List<PrimitiveArgumentContext> primitiveArgument() {
			return getRuleContexts(PrimitiveArgumentContext.class);
		}
		public TerminalNode PARAGRAPH() { return getToken(DuroParser.PARAGRAPH, 0); }
		public TerminalNode ID() { return getToken(DuroParser.ID, 0); }
		public PrimitiveArgumentContext primitiveArgument(int i) {
			return getRuleContext(PrimitiveArgumentContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(DuroParser.COMMA); }
		public PrimitiveOperand2Context primitiveOperand2(int i) {
			return getRuleContext(PrimitiveOperand2Context.class,i);
		}
		public TerminalNode OPEN_PAR() { return getToken(DuroParser.OPEN_PAR, 0); }
		public TerminalNode CLOSE_PAR() { return getToken(DuroParser.CLOSE_PAR, 0); }
		public List<PrimitiveOperand2Context> primitiveOperand2() {
			return getRuleContexts(PrimitiveOperand2Context.class);
		}
		public TerminalNode COMMA(int i) {
			return getToken(DuroParser.COMMA, i);
		}
		public PrimitiveContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_primitive; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DuroListener ) ((DuroListener)listener).enterPrimitive(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DuroListener ) ((DuroListener)listener).exitPrimitive(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DuroVisitor ) return ((DuroVisitor<? extends T>)visitor).visitPrimitive(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PrimitiveContext primitive() throws RecognitionException {
		PrimitiveContext _localctx = new PrimitiveContext(_ctx, getState());
		enterRule(_localctx, 110, RULE_primitive);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(485); match(PARAGRAPH);
			setState(486); match(ID);
			setState(490);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << STRING_LITERAL) | (1L << OPEN_SQ) | (1L << OPEN_BRA) | (1L << INT) | (1L << KW_FUNCTION) | (1L << KW_TRUE) | (1L << KW_FALSE) | (1L << ID))) != 0)) {
				{
				{
				setState(487); primitiveOperand2();
				}
				}
				setState(492);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(493); match(OPEN_PAR);
			setState(502);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << STRING_LITERAL) | (1L << PARAGRAPH) | (1L << NOT) | (1L << OPEN_SQ) | (1L << OPEN_BRA) | (1L << OPEN_PAR) | (1L << EQUALS) | (1L << NOT_EQUALS) | (1L << LESS_THAN) | (1L << LESS_THAN_OR_EQUALS) | (1L << GREATER_THAN) | (1L << GREATER_THAN_OR_EQUALS) | (1L << BIN_OP1) | (1L << BIN_OP2) | (1L << INT) | (1L << COLON) | (1L << KW_FUNCTION) | (1L << KW_TRUE) | (1L << KW_FALSE) | (1L << KW_THIS) | (1L << KW_NULL) | (1L << KW_FRAME) | (1L << ID))) != 0)) {
				{
				setState(494); primitiveArgument();
				setState(499);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(495); match(COMMA);
					setState(496); primitiveArgument();
					}
					}
					setState(501);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(504); match(CLOSE_PAR);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PrimitiveArgumentContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public PrimitiveArgumentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_primitiveArgument; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DuroListener ) ((DuroListener)listener).enterPrimitiveArgument(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DuroListener ) ((DuroListener)listener).exitPrimitiveArgument(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DuroVisitor ) return ((DuroVisitor<? extends T>)visitor).visitPrimitiveArgument(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PrimitiveArgumentContext primitiveArgument() throws RecognitionException {
		PrimitiveArgumentContext _localctx = new PrimitiveArgumentContext(_ctx, getState());
		enterRule(_localctx, 112, RULE_primitiveArgument);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(506); expression();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PrimitiveOperand2Context extends ParserRuleContext {
		public TerminalNode ID() { return getToken(DuroParser.ID, 0); }
		public LiteralContext literal() {
			return getRuleContext(LiteralContext.class,0);
		}
		public PrimitiveOperand2Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_primitiveOperand2; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DuroListener ) ((DuroListener)listener).enterPrimitiveOperand2(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DuroListener ) ((DuroListener)listener).exitPrimitiveOperand2(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DuroVisitor ) return ((DuroVisitor<? extends T>)visitor).visitPrimitiveOperand2(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PrimitiveOperand2Context primitiveOperand2() throws RecognitionException {
		PrimitiveOperand2Context _localctx = new PrimitiveOperand2Context(_ctx, getState());
		enterRule(_localctx, 114, RULE_primitiveOperand2);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(510);
			switch (_input.LA(1)) {
			case STRING_LITERAL:
			case OPEN_SQ:
			case OPEN_BRA:
			case INT:
			case KW_FUNCTION:
			case KW_TRUE:
			case KW_FALSE:
				{
				setState(508); literal();
				}
				break;
			case ID:
				{
				setState(509); match(ID);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class OperationChainContext extends ParserRuleContext {
		public MemberAccessContext memberAccess() {
			return getRuleContext(MemberAccessContext.class,0);
		}
		public ExplicitMessageExchangeContext explicitMessageExchange() {
			return getRuleContext(ExplicitMessageExchangeContext.class,0);
		}
		public IndexAccessContext indexAccess() {
			return getRuleContext(IndexAccessContext.class,0);
		}
		public OperationChainContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_operationChain; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DuroListener ) ((DuroListener)listener).enterOperationChain(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DuroListener ) ((DuroListener)listener).exitOperationChain(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DuroVisitor ) return ((DuroVisitor<? extends T>)visitor).visitOperationChain(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OperationChainContext operationChain() throws RecognitionException {
		OperationChainContext _localctx = new OperationChainContext(_ctx, getState());
		enterRule(_localctx, 116, RULE_operationChain);
		try {
			setState(515);
			switch ( getInterpreter().adaptivePredict(_input,37,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(512); explicitMessageExchange();
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(513); memberAccess();
				}
				break;

			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(514); indexAccess();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExplicitMessageExchangeContext extends ParserRuleContext {
		public TerminalNode DOT() { return getToken(DuroParser.DOT, 0); }
		public MessageExchangeContext messageExchange() {
			return getRuleContext(MessageExchangeContext.class,0);
		}
		public ExplicitMessageExchangeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_explicitMessageExchange; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DuroListener ) ((DuroListener)listener).enterExplicitMessageExchange(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DuroListener ) ((DuroListener)listener).exitExplicitMessageExchange(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DuroVisitor ) return ((DuroVisitor<? extends T>)visitor).visitExplicitMessageExchange(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExplicitMessageExchangeContext explicitMessageExchange() throws RecognitionException {
		ExplicitMessageExchangeContext _localctx = new ExplicitMessageExchangeContext(_ctx, getState());
		enterRule(_localctx, 118, RULE_explicitMessageExchange);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(517); match(DOT);
			setState(518); messageExchange();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class MemberAccessContext extends ParserRuleContext {
		public TerminalNode DOT() { return getToken(DuroParser.DOT, 0); }
		public MessageIdContext messageId() {
			return getRuleContext(MessageIdContext.class,0);
		}
		public MemberAccessContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_memberAccess; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DuroListener ) ((DuroListener)listener).enterMemberAccess(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DuroListener ) ((DuroListener)listener).exitMemberAccess(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DuroVisitor ) return ((DuroVisitor<? extends T>)visitor).visitMemberAccess(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MemberAccessContext memberAccess() throws RecognitionException {
		MemberAccessContext _localctx = new MemberAccessContext(_ctx, getState());
		enterRule(_localctx, 120, RULE_memberAccess);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(520); match(DOT);
			setState(521); messageId();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class IndexAccessContext extends ParserRuleContext {
		public TerminalNode OPEN_SQ() { return getToken(DuroParser.OPEN_SQ, 0); }
		public TerminalNode CLOSE_SQ() { return getToken(DuroParser.CLOSE_SQ, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public IndexAccessContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_indexAccess; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DuroListener ) ((DuroListener)listener).enterIndexAccess(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DuroListener ) ((DuroListener)listener).exitIndexAccess(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DuroVisitor ) return ((DuroVisitor<? extends T>)visitor).visitIndexAccess(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IndexAccessContext indexAccess() throws RecognitionException {
		IndexAccessContext _localctx = new IndexAccessContext(_ctx, getState());
		enterRule(_localctx, 122, RULE_indexAccess);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(523); match(OPEN_SQ);
			setState(524); expression();
			setState(525); match(CLOSE_SQ);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class OperationEndContext extends ParserRuleContext {
		public MemberAssignmentContext memberAssignment() {
			return getRuleContext(MemberAssignmentContext.class,0);
		}
		public IndexAssignmentContext indexAssignment() {
			return getRuleContext(IndexAssignmentContext.class,0);
		}
		public OperationEndContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_operationEnd; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DuroListener ) ((DuroListener)listener).enterOperationEnd(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DuroListener ) ((DuroListener)listener).exitOperationEnd(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DuroVisitor ) return ((DuroVisitor<? extends T>)visitor).visitOperationEnd(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OperationEndContext operationEnd() throws RecognitionException {
		OperationEndContext _localctx = new OperationEndContext(_ctx, getState());
		enterRule(_localctx, 124, RULE_operationEnd);
		try {
			setState(529);
			switch (_input.LA(1)) {
			case DOT:
				enterOuterAlt(_localctx, 1);
				{
				setState(527); memberAssignment();
				}
				break;
			case OPEN_SQ:
				enterOuterAlt(_localctx, 2);
				{
				setState(528); indexAssignment();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class MemberAssignmentContext extends ParserRuleContext {
		public Token op;
		public TerminalNode DOT() { return getToken(DuroParser.DOT, 0); }
		public TerminalNode ASSIGN_MULT() { return getToken(DuroParser.ASSIGN_MULT, 0); }
		public TerminalNode ASSIGN() { return getToken(DuroParser.ASSIGN, 0); }
		public TerminalNode ASSIGN_DIV() { return getToken(DuroParser.ASSIGN_DIV, 0); }
		public TerminalNode ASSIGN_REM() { return getToken(DuroParser.ASSIGN_REM, 0); }
		public TerminalNode ASSIGN_ADD() { return getToken(DuroParser.ASSIGN_ADD, 0); }
		public MessageIdContext messageId() {
			return getRuleContext(MessageIdContext.class,0);
		}
		public MemberAssignmentValueContext memberAssignmentValue() {
			return getRuleContext(MemberAssignmentValueContext.class,0);
		}
		public TerminalNode PROTO_ASSIGN() { return getToken(DuroParser.PROTO_ASSIGN, 0); }
		public TerminalNode ASSIGN_SUB() { return getToken(DuroParser.ASSIGN_SUB, 0); }
		public MemberAssignmentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_memberAssignment; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DuroListener ) ((DuroListener)listener).enterMemberAssignment(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DuroListener ) ((DuroListener)listener).exitMemberAssignment(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DuroVisitor ) return ((DuroVisitor<? extends T>)visitor).visitMemberAssignment(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MemberAssignmentContext memberAssignment() throws RecognitionException {
		MemberAssignmentContext _localctx = new MemberAssignmentContext(_ctx, getState());
		enterRule(_localctx, 126, RULE_memberAssignment);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(531); match(DOT);
			setState(532); messageId();
			setState(533);
			((MemberAssignmentContext)_localctx).op = _input.LT(1);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ASSIGN) | (1L << PROTO_ASSIGN) | (1L << ASSIGN_ADD) | (1L << ASSIGN_SUB) | (1L << ASSIGN_MULT) | (1L << ASSIGN_DIV) | (1L << ASSIGN_REM))) != 0)) ) {
				((MemberAssignmentContext)_localctx).op = (Token)_errHandler.recoverInline(this);
			}
			consume();
			setState(534); memberAssignmentValue();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class MemberAssignmentValueContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public MemberAssignmentValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_memberAssignmentValue; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DuroListener ) ((DuroListener)listener).enterMemberAssignmentValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DuroListener ) ((DuroListener)listener).exitMemberAssignmentValue(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DuroVisitor ) return ((DuroVisitor<? extends T>)visitor).visitMemberAssignmentValue(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MemberAssignmentValueContext memberAssignmentValue() throws RecognitionException {
		MemberAssignmentValueContext _localctx = new MemberAssignmentValueContext(_ctx, getState());
		enterRule(_localctx, 128, RULE_memberAssignmentValue);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(536); expression();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class IndexAssignmentContext extends ParserRuleContext {
		public Token op;
		public TerminalNode ASSIGN_MULT() { return getToken(DuroParser.ASSIGN_MULT, 0); }
		public TerminalNode ASSIGN() { return getToken(DuroParser.ASSIGN, 0); }
		public TerminalNode OPEN_SQ() { return getToken(DuroParser.OPEN_SQ, 0); }
		public TerminalNode ASSIGN_DIV() { return getToken(DuroParser.ASSIGN_DIV, 0); }
		public TerminalNode ASSIGN_REM() { return getToken(DuroParser.ASSIGN_REM, 0); }
		public TerminalNode ASSIGN_ADD() { return getToken(DuroParser.ASSIGN_ADD, 0); }
		public TerminalNode CLOSE_SQ() { return getToken(DuroParser.CLOSE_SQ, 0); }
		public IndexAssignmentKeyContext indexAssignmentKey() {
			return getRuleContext(IndexAssignmentKeyContext.class,0);
		}
		public IndexAssignmentValueContext indexAssignmentValue() {
			return getRuleContext(IndexAssignmentValueContext.class,0);
		}
		public TerminalNode PROTO_ASSIGN() { return getToken(DuroParser.PROTO_ASSIGN, 0); }
		public TerminalNode ASSIGN_SUB() { return getToken(DuroParser.ASSIGN_SUB, 0); }
		public IndexAssignmentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_indexAssignment; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DuroListener ) ((DuroListener)listener).enterIndexAssignment(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DuroListener ) ((DuroListener)listener).exitIndexAssignment(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DuroVisitor ) return ((DuroVisitor<? extends T>)visitor).visitIndexAssignment(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IndexAssignmentContext indexAssignment() throws RecognitionException {
		IndexAssignmentContext _localctx = new IndexAssignmentContext(_ctx, getState());
		enterRule(_localctx, 130, RULE_indexAssignment);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(538); match(OPEN_SQ);
			setState(539); indexAssignmentKey();
			setState(540); match(CLOSE_SQ);
			setState(541);
			((IndexAssignmentContext)_localctx).op = _input.LT(1);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ASSIGN) | (1L << PROTO_ASSIGN) | (1L << ASSIGN_ADD) | (1L << ASSIGN_SUB) | (1L << ASSIGN_MULT) | (1L << ASSIGN_DIV) | (1L << ASSIGN_REM))) != 0)) ) {
				((IndexAssignmentContext)_localctx).op = (Token)_errHandler.recoverInline(this);
			}
			consume();
			setState(542); indexAssignmentValue();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class IndexAssignmentKeyContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public IndexAssignmentKeyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_indexAssignmentKey; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DuroListener ) ((DuroListener)listener).enterIndexAssignmentKey(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DuroListener ) ((DuroListener)listener).exitIndexAssignmentKey(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DuroVisitor ) return ((DuroVisitor<? extends T>)visitor).visitIndexAssignmentKey(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IndexAssignmentKeyContext indexAssignmentKey() throws RecognitionException {
		IndexAssignmentKeyContext _localctx = new IndexAssignmentKeyContext(_ctx, getState());
		enterRule(_localctx, 132, RULE_indexAssignmentKey);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(544); expression();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class IndexAssignmentValueContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public IndexAssignmentValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_indexAssignmentValue; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DuroListener ) ((DuroListener)listener).enterIndexAssignmentValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DuroListener ) ((DuroListener)listener).exitIndexAssignmentValue(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DuroVisitor ) return ((DuroVisitor<? extends T>)visitor).visitIndexAssignmentValue(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IndexAssignmentValueContext indexAssignmentValue() throws RecognitionException {
		IndexAssignmentValueContext _localctx = new IndexAssignmentValueContext(_ctx, getState());
		enterRule(_localctx, 134, RULE_indexAssignmentValue);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(546); expression();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DelimitedStatementContext extends ParserRuleContext {
		public YieldStatementContext yieldStatement() {
			return getRuleContext(YieldStatementContext.class,0);
		}
		public VariableStatementContext variableStatement() {
			return getRuleContext(VariableStatementContext.class,0);
		}
		public PauseContext pause() {
			return getRuleContext(PauseContext.class,0);
		}
		public ReturnStatementContext returnStatement() {
			return getRuleContext(ReturnStatementContext.class,0);
		}
		public BreakStatementContext breakStatement() {
			return getRuleContext(BreakStatementContext.class,0);
		}
		public DelimitedStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_delimitedStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DuroListener ) ((DuroListener)listener).enterDelimitedStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DuroListener ) ((DuroListener)listener).exitDelimitedStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DuroVisitor ) return ((DuroVisitor<? extends T>)visitor).visitDelimitedStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DelimitedStatementContext delimitedStatement() throws RecognitionException {
		DelimitedStatementContext _localctx = new DelimitedStatementContext(_ctx, getState());
		enterRule(_localctx, 136, RULE_delimitedStatement);
		try {
			setState(553);
			switch (_input.LA(1)) {
			case KW_PAUSE:
				enterOuterAlt(_localctx, 1);
				{
				setState(548); pause();
				}
				break;
			case KW_VAR:
				enterOuterAlt(_localctx, 2);
				{
				setState(549); variableStatement();
				}
				break;
			case KW_RETURN:
				enterOuterAlt(_localctx, 3);
				{
				setState(550); returnStatement();
				}
				break;
			case KW_BREAK:
				enterOuterAlt(_localctx, 4);
				{
				setState(551); breakStatement();
				}
				break;
			case KW_YIELD:
				enterOuterAlt(_localctx, 5);
				{
				setState(552); yieldStatement();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PauseContext extends ParserRuleContext {
		public TerminalNode KW_PAUSE() { return getToken(DuroParser.KW_PAUSE, 0); }
		public PauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_pause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DuroListener ) ((DuroListener)listener).enterPause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DuroListener ) ((DuroListener)listener).exitPause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DuroVisitor ) return ((DuroVisitor<? extends T>)visitor).visitPause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PauseContext pause() throws RecognitionException {
		PauseContext _localctx = new PauseContext(_ctx, getState());
		enterRule(_localctx, 138, RULE_pause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(555); match(KW_PAUSE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class VariableStatementContext extends ParserRuleContext {
		public VariableDeclarationContext variableDeclaration() {
			return getRuleContext(VariableDeclarationContext.class,0);
		}
		public VariableDeclarationAndAssignmentContext variableDeclarationAndAssignment() {
			return getRuleContext(VariableDeclarationAndAssignmentContext.class,0);
		}
		public VariableStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variableStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DuroListener ) ((DuroListener)listener).enterVariableStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DuroListener ) ((DuroListener)listener).exitVariableStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DuroVisitor ) return ((DuroVisitor<? extends T>)visitor).visitVariableStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VariableStatementContext variableStatement() throws RecognitionException {
		VariableStatementContext _localctx = new VariableStatementContext(_ctx, getState());
		enterRule(_localctx, 140, RULE_variableStatement);
		try {
			setState(559);
			switch ( getInterpreter().adaptivePredict(_input,40,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(557); variableDeclarationAndAssignment();
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(558); variableDeclaration();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class VariableDeclarationAndAssignmentContext extends ParserRuleContext {
		public List<TerminalNode> ID() { return getTokens(DuroParser.ID); }
		public TerminalNode ASSIGN() { return getToken(DuroParser.ASSIGN, 0); }
		public List<TerminalNode> COMMA() { return getTokens(DuroParser.COMMA); }
		public TerminalNode ID(int i) {
			return getToken(DuroParser.ID, i);
		}
		public TerminalNode KW_VAR() { return getToken(DuroParser.KW_VAR, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode COMMA(int i) {
			return getToken(DuroParser.COMMA, i);
		}
		public VariableDeclarationAndAssignmentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variableDeclarationAndAssignment; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DuroListener ) ((DuroListener)listener).enterVariableDeclarationAndAssignment(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DuroListener ) ((DuroListener)listener).exitVariableDeclarationAndAssignment(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DuroVisitor ) return ((DuroVisitor<? extends T>)visitor).visitVariableDeclarationAndAssignment(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VariableDeclarationAndAssignmentContext variableDeclarationAndAssignment() throws RecognitionException {
		VariableDeclarationAndAssignmentContext _localctx = new VariableDeclarationAndAssignmentContext(_ctx, getState());
		enterRule(_localctx, 142, RULE_variableDeclarationAndAssignment);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(561); match(KW_VAR);
			setState(562); match(ID);
			setState(567);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(563); match(COMMA);
				setState(564); match(ID);
				}
				}
				setState(569);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(570); match(ASSIGN);
			setState(571); expression();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class VariableDeclarationContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(DuroParser.ID, 0); }
		public TerminalNode KW_VAR() { return getToken(DuroParser.KW_VAR, 0); }
		public VariableDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variableDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DuroListener ) ((DuroListener)listener).enterVariableDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DuroListener ) ((DuroListener)listener).exitVariableDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DuroVisitor ) return ((DuroVisitor<? extends T>)visitor).visitVariableDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VariableDeclarationContext variableDeclaration() throws RecognitionException {
		VariableDeclarationContext _localctx = new VariableDeclarationContext(_ctx, getState());
		enterRule(_localctx, 144, RULE_variableDeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(573); match(KW_VAR);
			setState(574); match(ID);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ReturnStatementContext extends ParserRuleContext {
		public List<TerminalNode> COMMA() { return getTokens(DuroParser.COMMA); }
		public TerminalNode KW_RETURN() { return getToken(DuroParser.KW_RETURN, 0); }
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public TerminalNode COMMA(int i) {
			return getToken(DuroParser.COMMA, i);
		}
		public ReturnStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_returnStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DuroListener ) ((DuroListener)listener).enterReturnStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DuroListener ) ((DuroListener)listener).exitReturnStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DuroVisitor ) return ((DuroVisitor<? extends T>)visitor).visitReturnStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ReturnStatementContext returnStatement() throws RecognitionException {
		ReturnStatementContext _localctx = new ReturnStatementContext(_ctx, getState());
		enterRule(_localctx, 146, RULE_returnStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(576); match(KW_RETURN);
			setState(585);
			switch ( getInterpreter().adaptivePredict(_input,43,_ctx) ) {
			case 1:
				{
				setState(577); expression();
				setState(582);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(578); match(COMMA);
					setState(579); expression();
					}
					}
					setState(584);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class BreakStatementContext extends ParserRuleContext {
		public TerminalNode KW_BREAK() { return getToken(DuroParser.KW_BREAK, 0); }
		public BreakStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_breakStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DuroListener ) ((DuroListener)listener).enterBreakStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DuroListener ) ((DuroListener)listener).exitBreakStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DuroVisitor ) return ((DuroVisitor<? extends T>)visitor).visitBreakStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BreakStatementContext breakStatement() throws RecognitionException {
		BreakStatementContext _localctx = new BreakStatementContext(_ctx, getState());
		enterRule(_localctx, 148, RULE_breakStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(587); match(KW_BREAK);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class YieldStatementContext extends ParserRuleContext {
		public YieldStatementExpressionContext yieldStatementExpression(int i) {
			return getRuleContext(YieldStatementExpressionContext.class,i);
		}
		public TerminalNode KW_YIELD() { return getToken(DuroParser.KW_YIELD, 0); }
		public List<TerminalNode> COMMA() { return getTokens(DuroParser.COMMA); }
		public List<YieldStatementExpressionContext> yieldStatementExpression() {
			return getRuleContexts(YieldStatementExpressionContext.class);
		}
		public TerminalNode COMMA(int i) {
			return getToken(DuroParser.COMMA, i);
		}
		public YieldStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_yieldStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DuroListener ) ((DuroListener)listener).enterYieldStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DuroListener ) ((DuroListener)listener).exitYieldStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DuroVisitor ) return ((DuroVisitor<? extends T>)visitor).visitYieldStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final YieldStatementContext yieldStatement() throws RecognitionException {
		YieldStatementContext _localctx = new YieldStatementContext(_ctx, getState());
		enterRule(_localctx, 150, RULE_yieldStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(589); match(KW_YIELD);
			setState(590); yieldStatementExpression();
			setState(595);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(591); match(COMMA);
				setState(592); yieldStatementExpression();
				}
				}
				setState(597);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class YieldStatementExpressionContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public YieldStatementExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_yieldStatementExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DuroListener ) ((DuroListener)listener).enterYieldStatementExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DuroListener ) ((DuroListener)listener).exitYieldStatementExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DuroVisitor ) return ((DuroVisitor<? extends T>)visitor).visitYieldStatementExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final YieldStatementExpressionContext yieldStatementExpression() throws RecognitionException {
		YieldStatementExpressionContext _localctx = new YieldStatementExpressionContext(_ctx, getState());
		enterRule(_localctx, 152, RULE_yieldStatementExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(598); expression();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class UndelimitedStatementContext extends ParserRuleContext {
		public IfStatementContext ifStatement() {
			return getRuleContext(IfStatementContext.class,0);
		}
		public WhileStatementContext whileStatement() {
			return getRuleContext(WhileStatementContext.class,0);
		}
		public ForStatementContext forStatement() {
			return getRuleContext(ForStatementContext.class,0);
		}
		public InterfaceIdContext interfaceId() {
			return getRuleContext(InterfaceIdContext.class,0);
		}
		public ForInStatementContext forInStatement() {
			return getRuleContext(ForInStatementContext.class,0);
		}
		public UndelimitedStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_undelimitedStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DuroListener ) ((DuroListener)listener).enterUndelimitedStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DuroListener ) ((DuroListener)listener).exitUndelimitedStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DuroVisitor ) return ((DuroVisitor<? extends T>)visitor).visitUndelimitedStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final UndelimitedStatementContext undelimitedStatement() throws RecognitionException {
		UndelimitedStatementContext _localctx = new UndelimitedStatementContext(_ctx, getState());
		enterRule(_localctx, 154, RULE_undelimitedStatement);
		try {
			setState(605);
			switch ( getInterpreter().adaptivePredict(_input,45,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(600); ifStatement();
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(601); whileStatement();
				}
				break;

			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(602); forStatement();
				}
				break;

			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(603); forInStatement();
				}
				break;

			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(604); interfaceId();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FunctionDefinitionContext extends ParserRuleContext {
		public FunctionBodyContext functionBody() {
			return getRuleContext(FunctionBodyContext.class,0);
		}
		public MessageIdContext messageId() {
			return getRuleContext(MessageIdContext.class,0);
		}
		public TerminalNode KW_FUNCTION() { return getToken(DuroParser.KW_FUNCTION, 0); }
		public TerminalNode OPEN_PAR() { return getToken(DuroParser.OPEN_PAR, 0); }
		public FunctionParametersContext functionParameters() {
			return getRuleContext(FunctionParametersContext.class,0);
		}
		public TerminalNode CLOSE_PAR() { return getToken(DuroParser.CLOSE_PAR, 0); }
		public TerminalNode CLOSE_BRA() { return getToken(DuroParser.CLOSE_BRA, 0); }
		public TerminalNode OPEN_BRA() { return getToken(DuroParser.OPEN_BRA, 0); }
		public FunctionDefinitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionDefinition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DuroListener ) ((DuroListener)listener).enterFunctionDefinition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DuroListener ) ((DuroListener)listener).exitFunctionDefinition(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DuroVisitor ) return ((DuroVisitor<? extends T>)visitor).visitFunctionDefinition(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunctionDefinitionContext functionDefinition() throws RecognitionException {
		FunctionDefinitionContext _localctx = new FunctionDefinitionContext(_ctx, getState());
		enterRule(_localctx, 156, RULE_functionDefinition);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(607); match(KW_FUNCTION);
			setState(608); messageId();
			setState(609); match(OPEN_PAR);
			setState(610); functionParameters();
			setState(611); match(CLOSE_PAR);
			setState(612); match(OPEN_BRA);
			setState(613); functionBody();
			setState(614); match(CLOSE_BRA);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FunctionParametersContext extends ParserRuleContext {
		public List<TerminalNode> ID() { return getTokens(DuroParser.ID); }
		public List<TerminalNode> COMMA() { return getTokens(DuroParser.COMMA); }
		public TerminalNode ID(int i) {
			return getToken(DuroParser.ID, i);
		}
		public TerminalNode COMMA(int i) {
			return getToken(DuroParser.COMMA, i);
		}
		public FunctionParametersContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionParameters; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DuroListener ) ((DuroListener)listener).enterFunctionParameters(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DuroListener ) ((DuroListener)listener).exitFunctionParameters(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DuroVisitor ) return ((DuroVisitor<? extends T>)visitor).visitFunctionParameters(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunctionParametersContext functionParameters() throws RecognitionException {
		FunctionParametersContext _localctx = new FunctionParametersContext(_ctx, getState());
		enterRule(_localctx, 158, RULE_functionParameters);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(624);
			_la = _input.LA(1);
			if (_la==ID) {
				{
				setState(616); match(ID);
				setState(621);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(617); match(COMMA);
					setState(618); match(ID);
					}
					}
					setState(623);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FunctionBodyContext extends ParserRuleContext {
		public ProgramElementsContext programElements() {
			return getRuleContext(ProgramElementsContext.class,0);
		}
		public FunctionBodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionBody; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DuroListener ) ((DuroListener)listener).enterFunctionBody(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DuroListener ) ((DuroListener)listener).exitFunctionBody(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DuroVisitor ) return ((DuroVisitor<? extends T>)visitor).visitFunctionBody(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunctionBodyContext functionBody() throws RecognitionException {
		FunctionBodyContext _localctx = new FunctionBodyContext(_ctx, getState());
		enterRule(_localctx, 160, RULE_functionBody);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(626); programElements();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class IfStatementContext extends ParserRuleContext {
		public IfStatementOnTrueContext ifStatementOnTrue() {
			return getRuleContext(IfStatementOnTrueContext.class,0);
		}
		public ElseStatementContext elseStatement() {
			return getRuleContext(ElseStatementContext.class,0);
		}
		public TerminalNode OPEN_PAR() { return getToken(DuroParser.OPEN_PAR, 0); }
		public IfStatementConditionContext ifStatementCondition() {
			return getRuleContext(IfStatementConditionContext.class,0);
		}
		public TerminalNode KW_IF() { return getToken(DuroParser.KW_IF, 0); }
		public TerminalNode CLOSE_PAR() { return getToken(DuroParser.CLOSE_PAR, 0); }
		public IfStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ifStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DuroListener ) ((DuroListener)listener).enterIfStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DuroListener ) ((DuroListener)listener).exitIfStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DuroVisitor ) return ((DuroVisitor<? extends T>)visitor).visitIfStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IfStatementContext ifStatement() throws RecognitionException {
		IfStatementContext _localctx = new IfStatementContext(_ctx, getState());
		enterRule(_localctx, 162, RULE_ifStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(628); match(KW_IF);
			setState(629); match(OPEN_PAR);
			setState(630); ifStatementCondition();
			setState(631); match(CLOSE_PAR);
			setState(632); ifStatementOnTrue();
			setState(633); elseStatement();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class IfStatementConditionContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public IfStatementConditionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ifStatementCondition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DuroListener ) ((DuroListener)listener).enterIfStatementCondition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DuroListener ) ((DuroListener)listener).exitIfStatementCondition(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DuroVisitor ) return ((DuroVisitor<? extends T>)visitor).visitIfStatementCondition(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IfStatementConditionContext ifStatementCondition() throws RecognitionException {
		IfStatementConditionContext _localctx = new IfStatementConditionContext(_ctx, getState());
		enterRule(_localctx, 164, RULE_ifStatementCondition);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(635); expression();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class IfStatementOnTrueContext extends ParserRuleContext {
		public ProgramElementContext programElement() {
			return getRuleContext(ProgramElementContext.class,0);
		}
		public ProgramElementsContext programElements() {
			return getRuleContext(ProgramElementsContext.class,0);
		}
		public TerminalNode CLOSE_BRA() { return getToken(DuroParser.CLOSE_BRA, 0); }
		public TerminalNode OPEN_BRA() { return getToken(DuroParser.OPEN_BRA, 0); }
		public IfStatementOnTrueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ifStatementOnTrue; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DuroListener ) ((DuroListener)listener).enterIfStatementOnTrue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DuroListener ) ((DuroListener)listener).exitIfStatementOnTrue(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DuroVisitor ) return ((DuroVisitor<? extends T>)visitor).visitIfStatementOnTrue(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IfStatementOnTrueContext ifStatementOnTrue() throws RecognitionException {
		IfStatementOnTrueContext _localctx = new IfStatementOnTrueContext(_ctx, getState());
		enterRule(_localctx, 166, RULE_ifStatementOnTrue);
		try {
			setState(642);
			switch ( getInterpreter().adaptivePredict(_input,48,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(637); match(OPEN_BRA);
				setState(638); programElements();
				setState(639); match(CLOSE_BRA);
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(641); programElement();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ElseStatementContext extends ParserRuleContext {
		public IfStatementOnFalseContext ifStatementOnFalse() {
			return getRuleContext(IfStatementOnFalseContext.class,0);
		}
		public TerminalNode KW_ELSE() { return getToken(DuroParser.KW_ELSE, 0); }
		public ElseStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_elseStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DuroListener ) ((DuroListener)listener).enterElseStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DuroListener ) ((DuroListener)listener).exitElseStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DuroVisitor ) return ((DuroVisitor<? extends T>)visitor).visitElseStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ElseStatementContext elseStatement() throws RecognitionException {
		ElseStatementContext _localctx = new ElseStatementContext(_ctx, getState());
		enterRule(_localctx, 168, RULE_elseStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(646);
			switch ( getInterpreter().adaptivePredict(_input,49,_ctx) ) {
			case 1:
				{
				setState(644); match(KW_ELSE);
				setState(645); ifStatementOnFalse();
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class IfStatementOnFalseContext extends ParserRuleContext {
		public ProgramElementContext programElement() {
			return getRuleContext(ProgramElementContext.class,0);
		}
		public ProgramElementsContext programElements() {
			return getRuleContext(ProgramElementsContext.class,0);
		}
		public TerminalNode CLOSE_BRA() { return getToken(DuroParser.CLOSE_BRA, 0); }
		public TerminalNode OPEN_BRA() { return getToken(DuroParser.OPEN_BRA, 0); }
		public IfStatementOnFalseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ifStatementOnFalse; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DuroListener ) ((DuroListener)listener).enterIfStatementOnFalse(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DuroListener ) ((DuroListener)listener).exitIfStatementOnFalse(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DuroVisitor ) return ((DuroVisitor<? extends T>)visitor).visitIfStatementOnFalse(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IfStatementOnFalseContext ifStatementOnFalse() throws RecognitionException {
		IfStatementOnFalseContext _localctx = new IfStatementOnFalseContext(_ctx, getState());
		enterRule(_localctx, 170, RULE_ifStatementOnFalse);
		try {
			setState(653);
			switch ( getInterpreter().adaptivePredict(_input,50,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				{
				setState(648); match(OPEN_BRA);
				setState(649); programElements();
				setState(650); match(CLOSE_BRA);
				}
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(652); programElement();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class WhileStatementContext extends ParserRuleContext {
		public TerminalNode KW_WHILE() { return getToken(DuroParser.KW_WHILE, 0); }
		public WhileStatementConditionContext whileStatementCondition() {
			return getRuleContext(WhileStatementConditionContext.class,0);
		}
		public WhileStatementBodyContext whileStatementBody() {
			return getRuleContext(WhileStatementBodyContext.class,0);
		}
		public TerminalNode OPEN_PAR() { return getToken(DuroParser.OPEN_PAR, 0); }
		public TerminalNode CLOSE_PAR() { return getToken(DuroParser.CLOSE_PAR, 0); }
		public WhileStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_whileStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DuroListener ) ((DuroListener)listener).enterWhileStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DuroListener ) ((DuroListener)listener).exitWhileStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DuroVisitor ) return ((DuroVisitor<? extends T>)visitor).visitWhileStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final WhileStatementContext whileStatement() throws RecognitionException {
		WhileStatementContext _localctx = new WhileStatementContext(_ctx, getState());
		enterRule(_localctx, 172, RULE_whileStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(655); match(KW_WHILE);
			setState(656); match(OPEN_PAR);
			setState(657); whileStatementCondition();
			setState(658); match(CLOSE_PAR);
			setState(659); whileStatementBody();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class WhileStatementConditionContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public WhileStatementConditionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_whileStatementCondition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DuroListener ) ((DuroListener)listener).enterWhileStatementCondition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DuroListener ) ((DuroListener)listener).exitWhileStatementCondition(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DuroVisitor ) return ((DuroVisitor<? extends T>)visitor).visitWhileStatementCondition(this);
			else return visitor.visitChildren(this);
		}
	}

	public final WhileStatementConditionContext whileStatementCondition() throws RecognitionException {
		WhileStatementConditionContext _localctx = new WhileStatementConditionContext(_ctx, getState());
		enterRule(_localctx, 174, RULE_whileStatementCondition);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(661); expression();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class WhileStatementBodyContext extends ParserRuleContext {
		public ProgramElementContext programElement() {
			return getRuleContext(ProgramElementContext.class,0);
		}
		public ProgramElementsContext programElements() {
			return getRuleContext(ProgramElementsContext.class,0);
		}
		public TerminalNode CLOSE_BRA() { return getToken(DuroParser.CLOSE_BRA, 0); }
		public TerminalNode OPEN_BRA() { return getToken(DuroParser.OPEN_BRA, 0); }
		public WhileStatementBodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_whileStatementBody; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DuroListener ) ((DuroListener)listener).enterWhileStatementBody(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DuroListener ) ((DuroListener)listener).exitWhileStatementBody(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DuroVisitor ) return ((DuroVisitor<? extends T>)visitor).visitWhileStatementBody(this);
			else return visitor.visitChildren(this);
		}
	}

	public final WhileStatementBodyContext whileStatementBody() throws RecognitionException {
		WhileStatementBodyContext _localctx = new WhileStatementBodyContext(_ctx, getState());
		enterRule(_localctx, 176, RULE_whileStatementBody);
		try {
			setState(668);
			switch ( getInterpreter().adaptivePredict(_input,51,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(663); match(OPEN_BRA);
				setState(664); programElements();
				setState(665); match(CLOSE_BRA);
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(667); programElement();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ForStatementContext extends ParserRuleContext {
		public ForStatementConditionContext forStatementCondition() {
			return getRuleContext(ForStatementConditionContext.class,0);
		}
		public ForStatementBodyContext forStatementBody() {
			return getRuleContext(ForStatementBodyContext.class,0);
		}
		public List<TerminalNode> SEMICOLON() { return getTokens(DuroParser.SEMICOLON); }
		public TerminalNode KW_FOR() { return getToken(DuroParser.KW_FOR, 0); }
		public ForStatementInitializationContext forStatementInitialization() {
			return getRuleContext(ForStatementInitializationContext.class,0);
		}
		public ForStatementUpdateContext forStatementUpdate() {
			return getRuleContext(ForStatementUpdateContext.class,0);
		}
		public TerminalNode SEMICOLON(int i) {
			return getToken(DuroParser.SEMICOLON, i);
		}
		public TerminalNode OPEN_PAR() { return getToken(DuroParser.OPEN_PAR, 0); }
		public TerminalNode CLOSE_PAR() { return getToken(DuroParser.CLOSE_PAR, 0); }
		public ForStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_forStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DuroListener ) ((DuroListener)listener).enterForStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DuroListener ) ((DuroListener)listener).exitForStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DuroVisitor ) return ((DuroVisitor<? extends T>)visitor).visitForStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ForStatementContext forStatement() throws RecognitionException {
		ForStatementContext _localctx = new ForStatementContext(_ctx, getState());
		enterRule(_localctx, 178, RULE_forStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(670); match(KW_FOR);
			setState(671); match(OPEN_PAR);
			setState(672); forStatementInitialization();
			setState(673); match(SEMICOLON);
			setState(674); forStatementCondition();
			setState(675); match(SEMICOLON);
			setState(676); forStatementUpdate();
			setState(677); match(CLOSE_PAR);
			setState(678); forStatementBody();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ForStatementInitializationContext extends ParserRuleContext {
		public DelimitedProgramElementContext delimitedProgramElement() {
			return getRuleContext(DelimitedProgramElementContext.class,0);
		}
		public ForStatementInitializationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_forStatementInitialization; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DuroListener ) ((DuroListener)listener).enterForStatementInitialization(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DuroListener ) ((DuroListener)listener).exitForStatementInitialization(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DuroVisitor ) return ((DuroVisitor<? extends T>)visitor).visitForStatementInitialization(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ForStatementInitializationContext forStatementInitialization() throws RecognitionException {
		ForStatementInitializationContext _localctx = new ForStatementInitializationContext(_ctx, getState());
		enterRule(_localctx, 180, RULE_forStatementInitialization);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(681);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << STRING_LITERAL) | (1L << PARAGRAPH) | (1L << NOT) | (1L << OPEN_SQ) | (1L << OPEN_BRA) | (1L << OPEN_PAR) | (1L << EQUALS) | (1L << NOT_EQUALS) | (1L << LESS_THAN) | (1L << LESS_THAN_OR_EQUALS) | (1L << GREATER_THAN) | (1L << GREATER_THAN_OR_EQUALS) | (1L << BIN_OP1) | (1L << BIN_OP2) | (1L << INT) | (1L << COLON) | (1L << KW_VAR) | (1L << KW_PAUSE) | (1L << KW_FUNCTION) | (1L << KW_RETURN) | (1L << KW_BREAK) | (1L << KW_YIELD) | (1L << KW_TRUE) | (1L << KW_FALSE) | (1L << KW_THIS) | (1L << KW_NULL) | (1L << KW_FRAME) | (1L << ID))) != 0)) {
				{
				setState(680); delimitedProgramElement();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ForStatementConditionContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ForStatementConditionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_forStatementCondition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DuroListener ) ((DuroListener)listener).enterForStatementCondition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DuroListener ) ((DuroListener)listener).exitForStatementCondition(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DuroVisitor ) return ((DuroVisitor<? extends T>)visitor).visitForStatementCondition(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ForStatementConditionContext forStatementCondition() throws RecognitionException {
		ForStatementConditionContext _localctx = new ForStatementConditionContext(_ctx, getState());
		enterRule(_localctx, 182, RULE_forStatementCondition);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(684);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << STRING_LITERAL) | (1L << PARAGRAPH) | (1L << NOT) | (1L << OPEN_SQ) | (1L << OPEN_BRA) | (1L << OPEN_PAR) | (1L << EQUALS) | (1L << NOT_EQUALS) | (1L << LESS_THAN) | (1L << LESS_THAN_OR_EQUALS) | (1L << GREATER_THAN) | (1L << GREATER_THAN_OR_EQUALS) | (1L << BIN_OP1) | (1L << BIN_OP2) | (1L << INT) | (1L << COLON) | (1L << KW_FUNCTION) | (1L << KW_TRUE) | (1L << KW_FALSE) | (1L << KW_THIS) | (1L << KW_NULL) | (1L << KW_FRAME) | (1L << ID))) != 0)) {
				{
				setState(683); expression();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ForStatementUpdateContext extends ParserRuleContext {
		public DelimitedProgramElementContext delimitedProgramElement() {
			return getRuleContext(DelimitedProgramElementContext.class,0);
		}
		public ForStatementUpdateContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_forStatementUpdate; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DuroListener ) ((DuroListener)listener).enterForStatementUpdate(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DuroListener ) ((DuroListener)listener).exitForStatementUpdate(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DuroVisitor ) return ((DuroVisitor<? extends T>)visitor).visitForStatementUpdate(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ForStatementUpdateContext forStatementUpdate() throws RecognitionException {
		ForStatementUpdateContext _localctx = new ForStatementUpdateContext(_ctx, getState());
		enterRule(_localctx, 184, RULE_forStatementUpdate);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(687);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << STRING_LITERAL) | (1L << PARAGRAPH) | (1L << NOT) | (1L << OPEN_SQ) | (1L << OPEN_BRA) | (1L << OPEN_PAR) | (1L << EQUALS) | (1L << NOT_EQUALS) | (1L << LESS_THAN) | (1L << LESS_THAN_OR_EQUALS) | (1L << GREATER_THAN) | (1L << GREATER_THAN_OR_EQUALS) | (1L << BIN_OP1) | (1L << BIN_OP2) | (1L << INT) | (1L << COLON) | (1L << KW_VAR) | (1L << KW_PAUSE) | (1L << KW_FUNCTION) | (1L << KW_RETURN) | (1L << KW_BREAK) | (1L << KW_YIELD) | (1L << KW_TRUE) | (1L << KW_FALSE) | (1L << KW_THIS) | (1L << KW_NULL) | (1L << KW_FRAME) | (1L << ID))) != 0)) {
				{
				setState(686); delimitedProgramElement();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ForStatementBodyContext extends ParserRuleContext {
		public ProgramElementContext programElement() {
			return getRuleContext(ProgramElementContext.class,0);
		}
		public ProgramElementsContext programElements() {
			return getRuleContext(ProgramElementsContext.class,0);
		}
		public TerminalNode CLOSE_BRA() { return getToken(DuroParser.CLOSE_BRA, 0); }
		public TerminalNode OPEN_BRA() { return getToken(DuroParser.OPEN_BRA, 0); }
		public ForStatementBodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_forStatementBody; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DuroListener ) ((DuroListener)listener).enterForStatementBody(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DuroListener ) ((DuroListener)listener).exitForStatementBody(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DuroVisitor ) return ((DuroVisitor<? extends T>)visitor).visitForStatementBody(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ForStatementBodyContext forStatementBody() throws RecognitionException {
		ForStatementBodyContext _localctx = new ForStatementBodyContext(_ctx, getState());
		enterRule(_localctx, 186, RULE_forStatementBody);
		try {
			setState(694);
			switch ( getInterpreter().adaptivePredict(_input,55,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(689); match(OPEN_BRA);
				setState(690); programElements();
				setState(691); match(CLOSE_BRA);
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(693); programElement();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ForInStatementContext extends ParserRuleContext {
		public TerminalNode KW_FOR() { return getToken(DuroParser.KW_FOR, 0); }
		public TerminalNode KW_IN() { return getToken(DuroParser.KW_IN, 0); }
		public List<TerminalNode> COMMA() { return getTokens(DuroParser.COMMA); }
		public List<ForInStatementVarContext> forInStatementVar() {
			return getRuleContexts(ForInStatementVarContext.class);
		}
		public ForInStatementBodyContext forInStatementBody() {
			return getRuleContext(ForInStatementBodyContext.class,0);
		}
		public ForInStatementVarContext forInStatementVar(int i) {
			return getRuleContext(ForInStatementVarContext.class,i);
		}
		public TerminalNode OPEN_PAR() { return getToken(DuroParser.OPEN_PAR, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode CLOSE_PAR() { return getToken(DuroParser.CLOSE_PAR, 0); }
		public TerminalNode COMMA(int i) {
			return getToken(DuroParser.COMMA, i);
		}
		public ForInStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_forInStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DuroListener ) ((DuroListener)listener).enterForInStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DuroListener ) ((DuroListener)listener).exitForInStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DuroVisitor ) return ((DuroVisitor<? extends T>)visitor).visitForInStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ForInStatementContext forInStatement() throws RecognitionException {
		ForInStatementContext _localctx = new ForInStatementContext(_ctx, getState());
		enterRule(_localctx, 188, RULE_forInStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(696); match(KW_FOR);
			setState(697); match(OPEN_PAR);
			setState(698); forInStatementVar();
			setState(703);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(699); match(COMMA);
				setState(700); forInStatementVar();
				}
				}
				setState(705);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(706); match(KW_IN);
			setState(707); expression();
			setState(708); match(CLOSE_PAR);
			setState(709); forInStatementBody();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ForInStatementVarContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(DuroParser.ID, 0); }
		public TerminalNode KW_VAR() { return getToken(DuroParser.KW_VAR, 0); }
		public ForInStatementVarContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_forInStatementVar; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DuroListener ) ((DuroListener)listener).enterForInStatementVar(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DuroListener ) ((DuroListener)listener).exitForInStatementVar(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DuroVisitor ) return ((DuroVisitor<? extends T>)visitor).visitForInStatementVar(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ForInStatementVarContext forInStatementVar() throws RecognitionException {
		ForInStatementVarContext _localctx = new ForInStatementVarContext(_ctx, getState());
		enterRule(_localctx, 190, RULE_forInStatementVar);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(712);
			_la = _input.LA(1);
			if (_la==KW_VAR) {
				{
				setState(711); match(KW_VAR);
				}
			}

			setState(714); match(ID);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ForInStatementBodyContext extends ParserRuleContext {
		public ProgramElementContext programElement() {
			return getRuleContext(ProgramElementContext.class,0);
		}
		public ProgramElementsContext programElements() {
			return getRuleContext(ProgramElementsContext.class,0);
		}
		public TerminalNode CLOSE_BRA() { return getToken(DuroParser.CLOSE_BRA, 0); }
		public TerminalNode OPEN_BRA() { return getToken(DuroParser.OPEN_BRA, 0); }
		public ForInStatementBodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_forInStatementBody; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DuroListener ) ((DuroListener)listener).enterForInStatementBody(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DuroListener ) ((DuroListener)listener).exitForInStatementBody(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DuroVisitor ) return ((DuroVisitor<? extends T>)visitor).visitForInStatementBody(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ForInStatementBodyContext forInStatementBody() throws RecognitionException {
		ForInStatementBodyContext _localctx = new ForInStatementBodyContext(_ctx, getState());
		enterRule(_localctx, 192, RULE_forInStatementBody);
		try {
			setState(721);
			switch ( getInterpreter().adaptivePredict(_input,58,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(716); match(OPEN_BRA);
				setState(717); programElements();
				setState(718); match(CLOSE_BRA);
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(720); programElement();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class InterfaceIdContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(DuroParser.ID, 0); }
		public TerminalNode DOLLAR() { return getToken(DuroParser.DOLLAR, 0); }
		public InterfaceIdBodyContext interfaceIdBody() {
			return getRuleContext(InterfaceIdBodyContext.class,0);
		}
		public InterfaceIdContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_interfaceId; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DuroListener ) ((DuroListener)listener).enterInterfaceId(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DuroListener ) ((DuroListener)listener).exitInterfaceId(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DuroVisitor ) return ((DuroVisitor<? extends T>)visitor).visitInterfaceId(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InterfaceIdContext interfaceId() throws RecognitionException {
		InterfaceIdContext _localctx = new InterfaceIdContext(_ctx, getState());
		enterRule(_localctx, 194, RULE_interfaceId);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(723); match(DOLLAR);
			setState(724); match(ID);
			setState(725); interfaceIdBody();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class InterfaceIdBodyContext extends ParserRuleContext {
		public ProgramElementContext programElement() {
			return getRuleContext(ProgramElementContext.class,0);
		}
		public ProgramElementsContext programElements() {
			return getRuleContext(ProgramElementsContext.class,0);
		}
		public TerminalNode CLOSE_BRA() { return getToken(DuroParser.CLOSE_BRA, 0); }
		public TerminalNode OPEN_BRA() { return getToken(DuroParser.OPEN_BRA, 0); }
		public InterfaceIdBodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_interfaceIdBody; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DuroListener ) ((DuroListener)listener).enterInterfaceIdBody(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DuroListener ) ((DuroListener)listener).exitInterfaceIdBody(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DuroVisitor ) return ((DuroVisitor<? extends T>)visitor).visitInterfaceIdBody(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InterfaceIdBodyContext interfaceIdBody() throws RecognitionException {
		InterfaceIdBodyContext _localctx = new InterfaceIdBodyContext(_ctx, getState());
		enterRule(_localctx, 196, RULE_interfaceIdBody);
		try {
			setState(732);
			switch ( getInterpreter().adaptivePredict(_input,59,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(727); match(OPEN_BRA);
				setState(728); programElements();
				setState(729); match(CLOSE_BRA);
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(731); programElement();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static final String _serializedATN =
		"\3\uacf5\uee8c\u4f5d\u8b0d\u4a45\u78bd\u1b2f\u3378\3<\u02e1\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\4<\t<\4=\t="+
		"\4>\t>\4?\t?\4@\t@\4A\tA\4B\tB\4C\tC\4D\tD\4E\tE\4F\tF\4G\tG\4H\tH\4I"+
		"\tI\4J\tJ\4K\tK\4L\tL\4M\tM\4N\tN\4O\tO\4P\tP\4Q\tQ\4R\tR\4S\tS\4T\tT"+
		"\4U\tU\4V\tV\4W\tW\4X\tX\4Y\tY\4Z\tZ\4[\t[\4\\\t\\\4]\t]\4^\t^\4_\t_\4"+
		"`\t`\4a\ta\4b\tb\4c\tc\4d\td\3\2\3\2\3\3\7\3\u00cc\n\3\f\3\16\3\u00cf"+
		"\13\3\3\4\3\4\5\4\u00d3\n\4\6\4\u00d5\n\4\r\4\16\4\u00d6\3\4\5\4\u00da"+
		"\n\4\3\5\3\5\5\5\u00de\n\5\3\5\5\5\u00e1\n\5\3\6\3\6\5\6\u00e5\n\6\3\7"+
		"\3\7\3\b\3\b\3\b\5\b\u00ec\n\b\3\t\3\t\3\t\3\t\3\t\3\t\3\t\5\t\u00f5\n"+
		"\t\3\n\3\n\3\13\3\13\3\f\3\f\3\r\3\r\7\r\u00ff\n\r\f\r\16\r\u0102\13\r"+
		"\3\16\3\16\3\16\3\17\3\17\7\17\u0109\n\17\f\17\16\17\u010c\13\17\3\20"+
		"\3\20\3\20\3\21\3\21\7\21\u0113\n\21\f\21\16\21\u0116\13\21\3\22\3\22"+
		"\3\22\3\23\3\23\7\23\u011d\n\23\f\23\16\23\u0120\13\23\3\24\3\24\3\24"+
		"\3\25\3\25\7\25\u0127\n\25\f\25\16\25\u012a\13\25\3\26\3\26\3\26\3\27"+
		"\3\27\7\27\u0131\n\27\f\27\16\27\u0134\13\27\3\30\3\30\3\30\3\31\3\31"+
		"\5\31\u013b\n\31\3\32\3\32\3\32\3\33\3\33\5\33\u0142\n\33\3\34\3\34\3"+
		"\34\5\34\u0147\n\34\3\34\3\34\3\35\3\35\3\36\3\36\3\36\3\36\3\37\3\37"+
		"\3\37\3\37\3\37\3 \3 \3!\3!\3!\3!\3!\3!\3!\3!\3!\5!\u0161\n!\3!\7!\u0164"+
		"\n!\f!\16!\u0167\13!\3!\5!\u016a\n!\3\"\3\"\3\"\3\"\3#\3#\3#\7#\u0173"+
		"\n#\f#\16#\u0176\13#\3#\3#\3#\3$\3$\3%\3%\3%\3&\3&\3\'\3\'\3\'\3\'\3\'"+
		"\7\'\u0187\n\'\f\'\16\'\u018a\13\'\5\'\u018c\n\'\3\'\3\'\3(\3(\5(\u0192"+
		"\n(\3)\3)\3*\3*\3*\3*\3*\3*\3*\5*\u019d\n*\3+\3+\3,\3,\3-\3-\3.\3.\3."+
		"\3.\7.\u01a9\n.\f.\16.\u01ac\13.\5.\u01ae\n.\3.\3.\3/\3/\3/\3/\3\60\3"+
		"\60\3\60\3\60\3\60\3\60\3\60\3\60\3\61\3\61\3\61\3\61\3\61\3\62\3\62\3"+
		"\62\3\62\7\62\u01c7\n\62\f\62\16\62\u01ca\13\62\5\62\u01cc\n\62\3\62\5"+
		"\62\u01cf\n\62\3\63\3\63\3\64\3\64\3\64\3\64\7\64\u01d7\n\64\f\64\16\64"+
		"\u01da\13\64\5\64\u01dc\n\64\3\64\3\64\3\65\3\65\3\66\3\66\3\67\3\67\3"+
		"8\38\39\39\39\79\u01eb\n9\f9\169\u01ee\139\39\39\39\39\79\u01f4\n9\f9"+
		"\169\u01f7\139\59\u01f9\n9\39\39\3:\3:\3;\3;\5;\u0201\n;\3<\3<\3<\5<\u0206"+
		"\n<\3=\3=\3=\3>\3>\3>\3?\3?\3?\3?\3@\3@\5@\u0214\n@\3A\3A\3A\3A\3A\3B"+
		"\3B\3C\3C\3C\3C\3C\3C\3D\3D\3E\3E\3F\3F\3F\3F\3F\5F\u022c\nF\3G\3G\3H"+
		"\3H\5H\u0232\nH\3I\3I\3I\3I\7I\u0238\nI\fI\16I\u023b\13I\3I\3I\3I\3J\3"+
		"J\3J\3K\3K\3K\3K\7K\u0247\nK\fK\16K\u024a\13K\5K\u024c\nK\3L\3L\3M\3M"+
		"\3M\3M\7M\u0254\nM\fM\16M\u0257\13M\3N\3N\3O\3O\3O\3O\3O\5O\u0260\nO\3"+
		"P\3P\3P\3P\3P\3P\3P\3P\3P\3Q\3Q\3Q\7Q\u026e\nQ\fQ\16Q\u0271\13Q\5Q\u0273"+
		"\nQ\3R\3R\3S\3S\3S\3S\3S\3S\3S\3T\3T\3U\3U\3U\3U\3U\5U\u0285\nU\3V\3V"+
		"\5V\u0289\nV\3W\3W\3W\3W\3W\5W\u0290\nW\3X\3X\3X\3X\3X\3X\3Y\3Y\3Z\3Z"+
		"\3Z\3Z\3Z\5Z\u029f\nZ\3[\3[\3[\3[\3[\3[\3[\3[\3[\3[\3\\\5\\\u02ac\n\\"+
		"\3]\5]\u02af\n]\3^\5^\u02b2\n^\3_\3_\3_\3_\3_\5_\u02b9\n_\3`\3`\3`\3`"+
		"\3`\7`\u02c0\n`\f`\16`\u02c3\13`\3`\3`\3`\3`\3`\3a\5a\u02cb\na\3a\3a\3"+
		"b\3b\3b\3b\3b\5b\u02d4\nb\3c\3c\3c\3c\3d\3d\3d\3d\3d\5d\u02df\nd\3d\2"+
		"e\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(*,.\60\62\64\668:<>@BDF"+
		"HJLNPRTVXZ\\^`bdfhjlnprtvxz|~\u0080\u0082\u0084\u0086\u0088\u008a\u008c"+
		"\u008e\u0090\u0092\u0094\u0096\u0098\u009a\u009c\u009e\u00a0\u00a2\u00a4"+
		"\u00a6\u00a8\u00aa\u00ac\u00ae\u00b0\u00b2\u00b4\u00b6\u00b8\u00ba\u00bc"+
		"\u00be\u00c0\u00c2\u00c4\u00c6\2\t\3\2\33\34\3\2\35 \3\2\t\n\4\2\24\24"+
		"\26\32\3\2\33\"\3\2/\60\3\2\24\32\u02ce\2\u00c8\3\2\2\2\4\u00cd\3\2\2"+
		"\2\6\u00d9\3\2\2\2\b\u00e0\3\2\2\2\n\u00e4\3\2\2\2\f\u00e6\3\2\2\2\16"+
		"\u00eb\3\2\2\2\20\u00f4\3\2\2\2\22\u00f6\3\2\2\2\24\u00f8\3\2\2\2\26\u00fa"+
		"\3\2\2\2\30\u00fc\3\2\2\2\32\u0103\3\2\2\2\34\u0106\3\2\2\2\36\u010d\3"+
		"\2\2\2 \u0110\3\2\2\2\"\u0117\3\2\2\2$\u011a\3\2\2\2&\u0121\3\2\2\2(\u0124"+
		"\3\2\2\2*\u012b\3\2\2\2,\u012e\3\2\2\2.\u0135\3\2\2\2\60\u013a\3\2\2\2"+
		"\62\u013c\3\2\2\2\64\u0141\3\2\2\2\66\u0146\3\2\2\28\u014a\3\2\2\2:\u014c"+
		"\3\2\2\2<\u0150\3\2\2\2>\u0155\3\2\2\2@\u0160\3\2\2\2B\u016b\3\2\2\2D"+
		"\u016f\3\2\2\2F\u017a\3\2\2\2H\u017c\3\2\2\2J\u017f\3\2\2\2L\u0181\3\2"+
		"\2\2N\u0191\3\2\2\2P\u0193\3\2\2\2R\u019c\3\2\2\2T\u019e\3\2\2\2V\u01a0"+
		"\3\2\2\2X\u01a2\3\2\2\2Z\u01a4\3\2\2\2\\\u01b1\3\2\2\2^\u01b5\3\2\2\2"+
		"`\u01bd\3\2\2\2b\u01ce\3\2\2\2d\u01d0\3\2\2\2f\u01d2\3\2\2\2h\u01df\3"+
		"\2\2\2j\u01e1\3\2\2\2l\u01e3\3\2\2\2n\u01e5\3\2\2\2p\u01e7\3\2\2\2r\u01fc"+
		"\3\2\2\2t\u0200\3\2\2\2v\u0205\3\2\2\2x\u0207\3\2\2\2z\u020a\3\2\2\2|"+
		"\u020d\3\2\2\2~\u0213\3\2\2\2\u0080\u0215\3\2\2\2\u0082\u021a\3\2\2\2"+
		"\u0084\u021c\3\2\2\2\u0086\u0222\3\2\2\2\u0088\u0224\3\2\2\2\u008a\u022b"+
		"\3\2\2\2\u008c\u022d\3\2\2\2\u008e\u0231\3\2\2\2\u0090\u0233\3\2\2\2\u0092"+
		"\u023f\3\2\2\2\u0094\u0242\3\2\2\2\u0096\u024d\3\2\2\2\u0098\u024f\3\2"+
		"\2\2\u009a\u0258\3\2\2\2\u009c\u025f\3\2\2\2\u009e\u0261\3\2\2\2\u00a0"+
		"\u0272\3\2\2\2\u00a2\u0274\3\2\2\2\u00a4\u0276\3\2\2\2\u00a6\u027d\3\2"+
		"\2\2\u00a8\u0284\3\2\2\2\u00aa\u0288\3\2\2\2\u00ac\u028f\3\2\2\2\u00ae"+
		"\u0291\3\2\2\2\u00b0\u0297\3\2\2\2\u00b2\u029e\3\2\2\2\u00b4\u02a0\3\2"+
		"\2\2\u00b6\u02ab\3\2\2\2\u00b8\u02ae\3\2\2\2\u00ba\u02b1\3\2\2\2\u00bc"+
		"\u02b8\3\2\2\2\u00be\u02ba\3\2\2\2\u00c0\u02ca\3\2\2\2\u00c2\u02d3\3\2"+
		"\2\2\u00c4\u02d5\3\2\2\2\u00c6\u02de\3\2\2\2\u00c8\u00c9\5\4\3\2\u00c9"+
		"\3\3\2\2\2\u00ca\u00cc\5\6\4\2\u00cb\u00ca\3\2\2\2\u00cc\u00cf\3\2\2\2"+
		"\u00cd\u00cb\3\2\2\2\u00cd\u00ce\3\2\2\2\u00ce\5\3\2\2\2\u00cf\u00cd\3"+
		"\2\2\2\u00d0\u00d2\5\n\6\2\u00d1\u00d3\7$\2\2\u00d2\u00d1\3\2\2\2\u00d2"+
		"\u00d3\3\2\2\2\u00d3\u00d5\3\2\2\2\u00d4\u00d0\3\2\2\2\u00d5\u00d6\3\2"+
		"\2\2\u00d6\u00d4\3\2\2\2\u00d6\u00d7\3\2\2\2\u00d7\u00da\3\2\2\2\u00d8"+
		"\u00da\5\u009cO\2\u00d9\u00d4\3\2\2\2\u00d9\u00d8\3\2\2\2\u00da\7\3\2"+
		"\2\2\u00db\u00dd\5\n\6\2\u00dc\u00de\7$\2\2\u00dd\u00dc\3\2\2\2\u00dd"+
		"\u00de\3\2\2\2\u00de\u00e1\3\2\2\2\u00df\u00e1\5\u009cO\2\u00e0\u00db"+
		"\3\2\2\2\u00e0\u00df\3\2\2\2\u00e1\t\3\2\2\2\u00e2\u00e5\5\f\7\2\u00e3"+
		"\u00e5\5\u008aF\2\u00e4\u00e2\3\2\2\2\u00e4\u00e3\3\2\2\2\u00e5\13\3\2"+
		"\2\2\u00e6\u00e7\5\16\b\2\u00e7\r\3\2\2\2\u00e8\u00ec\5D#\2\u00e9\u00ec"+
		"\5\u009eP\2\u00ea\u00ec\5\20\t\2\u00eb\u00e8\3\2\2\2\u00eb\u00e9\3\2\2"+
		"\2\u00eb\u00ea\3\2\2\2\u00ec\17\3\2\2\2\u00ed\u00ee\5\22\n\2\u00ee\u00ef"+
		"\7\'\2\2\u00ef\u00f0\5\24\13\2\u00f0\u00f1\7&\2\2\u00f1\u00f2\5\26\f\2"+
		"\u00f2\u00f5\3\2\2\2\u00f3\u00f5\5\30\r\2\u00f4\u00ed\3\2\2\2\u00f4\u00f3"+
		"\3\2\2\2\u00f5\21\3\2\2\2\u00f6\u00f7\5\30\r\2\u00f7\23\3\2\2\2\u00f8"+
		"\u00f9\5\30\r\2\u00f9\25\3\2\2\2\u00fa\u00fb\5\30\r\2\u00fb\27\3\2\2\2"+
		"\u00fc\u0100\5\34\17\2\u00fd\u00ff\5\32\16\2\u00fe\u00fd\3\2\2\2\u00ff"+
		"\u0102\3\2\2\2\u0100\u00fe\3\2\2\2\u0100\u0101\3\2\2\2\u0101\31\3\2\2"+
		"\2\u0102\u0100\3\2\2\2\u0103\u0104\7\7\2\2\u0104\u0105\5\34\17\2\u0105"+
		"\33\3\2\2\2\u0106\u010a\5 \21\2\u0107\u0109\5\36\20\2\u0108\u0107\3\2"+
		"\2\2\u0109\u010c\3\2\2\2\u010a\u0108\3\2\2\2\u010a\u010b\3\2\2\2\u010b"+
		"\35\3\2\2\2\u010c\u010a\3\2\2\2\u010d\u010e\7\6\2\2\u010e\u010f\5 \21"+
		"\2\u010f\37\3\2\2\2\u0110\u0114\5$\23\2\u0111\u0113\5\"\22\2\u0112\u0111"+
		"\3\2\2\2\u0113\u0116\3\2\2\2\u0114\u0112\3\2\2\2\u0114\u0115\3\2\2\2\u0115"+
		"!\3\2\2\2\u0116\u0114\3\2\2\2\u0117\u0118\t\2\2\2\u0118\u0119\5$\23\2"+
		"\u0119#\3\2\2\2\u011a\u011e\5(\25\2\u011b\u011d\5&\24\2\u011c\u011b\3"+
		"\2\2\2\u011d\u0120\3\2\2\2\u011e\u011c\3\2\2\2\u011e\u011f\3\2\2\2\u011f"+
		"%\3\2\2\2\u0120\u011e\3\2\2\2\u0121\u0122\t\3\2\2\u0122\u0123\5(\25\2"+
		"\u0123\'\3\2\2\2\u0124\u0128\5,\27\2\u0125\u0127\5*\26\2\u0126\u0125\3"+
		"\2\2\2\u0127\u012a\3\2\2\2\u0128\u0126\3\2\2\2\u0128\u0129\3\2\2\2\u0129"+
		")\3\2\2\2\u012a\u0128\3\2\2\2\u012b\u012c\7!\2\2\u012c\u012d\5,\27\2\u012d"+
		"+\3\2\2\2\u012e\u0132\5\60\31\2\u012f\u0131\5.\30\2\u0130\u012f\3\2\2"+
		"\2\u0131\u0134\3\2\2\2\u0132\u0130\3\2\2\2\u0132\u0133\3\2\2\2\u0133-"+
		"\3\2\2\2\u0134\u0132\3\2\2\2\u0135\u0136\7\"\2\2\u0136\u0137\5\60\31\2"+
		"\u0137/\3\2\2\2\u0138\u013b\5\62\32\2\u0139\u013b\5\64\33\2\u013a\u0138"+
		"\3\2\2\2\u013a\u0139\3\2\2\2\u013b\61\3\2\2\2\u013c\u013d\7\b\2\2\u013d"+
		"\u013e\5\64\33\2\u013e\63\3\2\2\2\u013f\u0142\5\66\34\2\u0140\u0142\5"+
		"@!\2\u0141\u013f\3\2\2\2\u0141\u0140\3\2\2\2\u0142\65\3\2\2\2\u0143\u0147"+
		"\58\35\2\u0144\u0147\5:\36\2\u0145\u0147\5<\37\2\u0146\u0143\3\2\2\2\u0146"+
		"\u0144\3\2\2\2\u0146\u0145\3\2\2\2\u0147\u0148\3\2\2\2\u0148\u0149\t\4"+
		"\2\2\u0149\67\3\2\2\2\u014a\u014b\79\2\2\u014b9\3\2\2\2\u014c\u014d\5"+
		"@!\2\u014d\u014e\7(\2\2\u014e\u014f\79\2\2\u014f;\3\2\2\2\u0150\u0151"+
		"\5> \2\u0151\u0152\7\16\2\2\u0152\u0153\5\16\b\2\u0153\u0154\7\17\2\2"+
		"\u0154=\3\2\2\2\u0155\u0156\5@!\2\u0156?\3\2\2\2\u0157\u0161\5B\"\2\u0158"+
		"\u0161\5J&\2\u0159\u0161\5F$\2\u015a\u0161\5H%\2\u015b\u0161\5R*\2\u015c"+
		"\u0161\5j\66\2\u015d\u0161\5l\67\2\u015e\u0161\5n8\2\u015f\u0161\5p9\2"+
		"\u0160\u0157\3\2\2\2\u0160\u0158\3\2\2\2\u0160\u0159\3\2\2\2\u0160\u015a"+
		"\3\2\2\2\u0160\u015b\3\2\2\2\u0160\u015c\3\2\2\2\u0160\u015d\3\2\2\2\u0160"+
		"\u015e\3\2\2\2\u0160\u015f\3\2\2\2\u0161\u0165\3\2\2\2\u0162\u0164\5v"+
		"<\2\u0163\u0162\3\2\2\2\u0164\u0167\3\2\2\2\u0165\u0163\3\2\2\2\u0165"+
		"\u0166\3\2\2\2\u0166\u0169\3\2\2\2\u0167\u0165\3\2\2\2\u0168\u016a\5~"+
		"@\2\u0169\u0168\3\2\2\2\u0169\u016a\3\2\2\2\u016aA\3\2\2\2\u016b\u016c"+
		"\7\22\2\2\u016c\u016d\5\16\b\2\u016d\u016e\7\23\2\2\u016eC\3\2\2\2\u016f"+
		"\u0174\79\2\2\u0170\u0171\7%\2\2\u0171\u0173\79\2\2\u0172\u0170\3\2\2"+
		"\2\u0173\u0176\3\2\2\2\u0174\u0172\3\2\2\2\u0174\u0175\3\2\2\2\u0175\u0177"+
		"\3\2\2\2\u0176\u0174\3\2\2\2\u0177\u0178\t\5\2\2\u0178\u0179\5\16\b\2"+
		"\u0179E\3\2\2\2\u017a\u017b\79\2\2\u017bG\3\2\2\2\u017c\u017d\7&\2\2\u017d"+
		"\u017e\79\2\2\u017eI\3\2\2\2\u017f\u0180\5L\'\2\u0180K\3\2\2\2\u0181\u0182"+
		"\5N(\2\u0182\u018b\7\22\2\2\u0183\u0188\5\16\b\2\u0184\u0185\7%\2\2\u0185"+
		"\u0187\5\16\b\2\u0186\u0184\3\2\2\2\u0187\u018a\3\2\2\2\u0188\u0186\3"+
		"\2\2\2\u0188\u0189\3\2\2\2\u0189\u018c\3\2\2\2\u018a\u0188\3\2\2\2\u018b"+
		"\u0183\3\2\2\2\u018b\u018c\3\2\2\2\u018c\u018d\3\2\2\2\u018d\u018e\7\23"+
		"\2\2\u018eM\3\2\2\2\u018f\u0192\79\2\2\u0190\u0192\5P)\2\u0191\u018f\3"+
		"\2\2\2\u0191\u0190\3\2\2\2\u0192O\3\2\2\2\u0193\u0194\t\6\2\2\u0194Q\3"+
		"\2\2\2\u0195\u019d\5T+\2\u0196\u019d\5V,\2\u0197\u019d\5X-\2\u0198\u019d"+
		"\5Z.\2\u0199\u019d\5^\60\2\u019a\u019d\5`\61\2\u019b\u019d\5f\64\2\u019c"+
		"\u0195\3\2\2\2\u019c\u0196\3\2\2\2\u019c\u0197\3\2\2\2\u019c\u0198\3\2"+
		"\2\2\u019c\u0199\3\2\2\2\u019c\u019a\3\2\2\2\u019c\u019b\3\2\2\2\u019d"+
		"S\3\2\2\2\u019e\u019f\7#\2\2\u019fU\3\2\2\2\u01a0\u01a1\t\7\2\2\u01a1"+
		"W\3\2\2\2\u01a2\u01a3\7\3\2\2\u01a3Y\3\2\2\2\u01a4\u01ad\7\20\2\2\u01a5"+
		"\u01aa\5\\/\2\u01a6\u01a7\7%\2\2\u01a7\u01a9\5\\/\2\u01a8\u01a6\3\2\2"+
		"\2\u01a9\u01ac\3\2\2\2\u01aa\u01a8\3\2\2\2\u01aa\u01ab\3\2\2\2\u01ab\u01ae"+
		"\3\2\2\2\u01ac\u01aa\3\2\2\2\u01ad\u01a5\3\2\2\2\u01ad\u01ae\3\2\2\2\u01ae"+
		"\u01af\3\2\2\2\u01af\u01b0\7\21\2\2\u01b0[\3\2\2\2\u01b1\u01b2\5N(\2\u01b2"+
		"\u01b3\7&\2\2\u01b3\u01b4\5\16\b\2\u01b4]\3\2\2\2\u01b5\u01b6\7+\2\2\u01b6"+
		"\u01b7\7\22\2\2\u01b7\u01b8\5\u00a0Q\2\u01b8\u01b9\7\23\2\2\u01b9\u01ba"+
		"\7\20\2\2\u01ba\u01bb\5\u00a2R\2\u01bb\u01bc\7\21\2\2\u01bc_\3\2\2\2\u01bd"+
		"\u01be\7\20\2\2\u01be\u01bf\5b\62\2\u01bf\u01c0\5d\63\2\u01c0\u01c1\7"+
		"\21\2\2\u01c1a\3\2\2\2\u01c2\u01cb\7\13\2\2\u01c3\u01c8\79\2\2\u01c4\u01c5"+
		"\7%\2\2\u01c5\u01c7\79\2\2\u01c6\u01c4\3\2\2\2\u01c7\u01ca\3\2\2\2\u01c8"+
		"\u01c6\3\2\2\2\u01c8\u01c9\3\2\2\2\u01c9\u01cc\3\2\2\2\u01ca\u01c8\3\2"+
		"\2\2\u01cb\u01c3\3\2\2\2\u01cb\u01cc\3\2\2\2\u01cc\u01cd\3\2\2\2\u01cd"+
		"\u01cf\7\13\2\2\u01ce\u01c2\3\2\2\2\u01ce\u01cf\3\2\2\2\u01cfc\3\2\2\2"+
		"\u01d0\u01d1\5\4\3\2\u01d1e\3\2\2\2\u01d2\u01db\7\16\2\2\u01d3\u01d8\5"+
		"h\65\2\u01d4\u01d5\7%\2\2\u01d5\u01d7\5h\65\2\u01d6\u01d4\3\2\2\2\u01d7"+
		"\u01da\3\2\2\2\u01d8\u01d6\3\2\2\2\u01d8\u01d9\3\2\2\2\u01d9\u01dc\3\2"+
		"\2\2\u01da\u01d8\3\2\2\2\u01db\u01d3\3\2\2\2\u01db\u01dc\3\2\2\2\u01dc"+
		"\u01dd\3\2\2\2\u01dd\u01de\7\17\2\2\u01deg\3\2\2\2\u01df\u01e0\5\16\b"+
		"\2\u01e0i\3\2\2\2\u01e1\u01e2\7\63\2\2\u01e2k\3\2\2\2\u01e3\u01e4\7\64"+
		"\2\2\u01e4m\3\2\2\2\u01e5\u01e6\7\65\2\2\u01e6o\3\2\2\2\u01e7\u01e8\7"+
		"\5\2\2\u01e8\u01ec\79\2\2\u01e9\u01eb\5t;\2\u01ea\u01e9\3\2\2\2\u01eb"+
		"\u01ee\3\2\2\2\u01ec\u01ea\3\2\2\2\u01ec\u01ed\3\2\2\2\u01ed\u01ef\3\2"+
		"\2\2\u01ee\u01ec\3\2\2\2\u01ef\u01f8\7\22\2\2\u01f0\u01f5\5r:\2\u01f1"+
		"\u01f2\7%\2\2\u01f2\u01f4\5r:\2\u01f3\u01f1\3\2\2\2\u01f4\u01f7\3\2\2"+
		"\2\u01f5\u01f3\3\2\2\2\u01f5\u01f6\3\2\2\2\u01f6\u01f9\3\2\2\2\u01f7\u01f5"+
		"\3\2\2\2\u01f8\u01f0\3\2\2\2\u01f8\u01f9\3\2\2\2\u01f9\u01fa\3\2\2\2\u01fa"+
		"\u01fb\7\23\2\2\u01fbq\3\2\2\2\u01fc\u01fd\5\16\b\2\u01fds\3\2\2\2\u01fe"+
		"\u0201\5R*\2\u01ff\u0201\79\2\2\u0200\u01fe\3\2\2\2\u0200\u01ff\3\2\2"+
		"\2\u0201u\3\2\2\2\u0202\u0206\5x=\2\u0203\u0206\5z>\2\u0204\u0206\5|?"+
		"\2\u0205\u0202\3\2\2\2\u0205\u0203\3\2\2\2\u0205\u0204\3\2\2\2\u0206w"+
		"\3\2\2\2\u0207\u0208\7(\2\2\u0208\u0209\5L\'\2\u0209y\3\2\2\2\u020a\u020b"+
		"\7(\2\2\u020b\u020c\5N(\2\u020c{\3\2\2\2\u020d\u020e\7\16\2\2\u020e\u020f"+
		"\5\16\b\2\u020f\u0210\7\17\2\2\u0210}\3\2\2\2\u0211\u0214\5\u0080A\2\u0212"+
		"\u0214\5\u0084C\2\u0213\u0211\3\2\2\2\u0213\u0212\3\2\2\2\u0214\177\3"+
		"\2\2\2\u0215\u0216\7(\2\2\u0216\u0217\5N(\2\u0217\u0218\t\b\2\2\u0218"+
		"\u0219\5\u0082B\2\u0219\u0081\3\2\2\2\u021a\u021b\5\16\b\2\u021b\u0083"+
		"\3\2\2\2\u021c\u021d\7\16\2\2\u021d\u021e\5\u0086D\2\u021e\u021f\7\17"+
		"\2\2\u021f\u0220\t\b\2\2\u0220\u0221\5\u0088E\2\u0221\u0085\3\2\2\2\u0222"+
		"\u0223\5\16\b\2\u0223\u0087\3\2\2\2\u0224\u0225\5\16\b\2\u0225\u0089\3"+
		"\2\2\2\u0226\u022c\5\u008cG\2\u0227\u022c\5\u008eH\2\u0228\u022c\5\u0094"+
		"K\2\u0229\u022c\5\u0096L\2\u022a\u022c\5\u0098M\2\u022b\u0226\3\2\2\2"+
		"\u022b\u0227\3\2\2\2\u022b\u0228\3\2\2\2\u022b\u0229\3\2\2\2\u022b\u022a"+
		"\3\2\2\2\u022c\u008b\3\2\2\2\u022d\u022e\7*\2\2\u022e\u008d\3\2\2\2\u022f"+
		"\u0232\5\u0090I\2\u0230\u0232\5\u0092J\2\u0231\u022f\3\2\2\2\u0231\u0230"+
		"\3\2\2\2\u0232\u008f\3\2\2\2\u0233\u0234\7)\2\2\u0234\u0239\79\2\2\u0235"+
		"\u0236\7%\2\2\u0236\u0238\79\2\2\u0237\u0235\3\2\2\2\u0238\u023b\3\2\2"+
		"\2\u0239\u0237\3\2\2\2\u0239\u023a\3\2\2\2\u023a\u023c\3\2\2\2\u023b\u0239"+
		"\3\2\2\2\u023c\u023d\7\24\2\2\u023d\u023e\5\16\b\2\u023e\u0091\3\2\2\2"+
		"\u023f\u0240\7)\2\2\u0240\u0241\79\2\2\u0241\u0093\3\2\2\2\u0242\u024b"+
		"\7,\2\2\u0243\u0248\5\16\b\2\u0244\u0245\7%\2\2\u0245\u0247\5\16\b\2\u0246"+
		"\u0244\3\2\2\2\u0247\u024a\3\2\2\2\u0248\u0246\3\2\2\2\u0248\u0249\3\2"+
		"\2\2\u0249\u024c\3\2\2\2\u024a\u0248\3\2\2\2\u024b\u0243\3\2\2\2\u024b"+
		"\u024c\3\2\2\2\u024c\u0095\3\2\2\2\u024d\u024e\7-\2\2\u024e\u0097\3\2"+
		"\2\2\u024f\u0250\7.\2\2\u0250\u0255\5\u009aN\2\u0251\u0252\7%\2\2\u0252"+
		"\u0254\5\u009aN\2\u0253\u0251\3\2\2\2\u0254\u0257\3\2\2\2\u0255\u0253"+
		"\3\2\2\2\u0255\u0256\3\2\2\2\u0256\u0099\3\2\2\2\u0257\u0255\3\2\2\2\u0258"+
		"\u0259\5\16\b\2\u0259\u009b\3\2\2\2\u025a\u0260\5\u00a4S\2\u025b\u0260"+
		"\5\u00aeX\2\u025c\u0260\5\u00b4[\2\u025d\u0260\5\u00be`\2\u025e\u0260"+
		"\5\u00c4c\2\u025f\u025a\3\2\2\2\u025f\u025b\3\2\2\2\u025f\u025c\3\2\2"+
		"\2\u025f\u025d\3\2\2\2\u025f\u025e\3\2\2\2\u0260\u009d\3\2\2\2\u0261\u0262"+
		"\7+\2\2\u0262\u0263\5N(\2\u0263\u0264\7\22\2\2\u0264\u0265\5\u00a0Q\2"+
		"\u0265\u0266\7\23\2\2\u0266\u0267\7\20\2\2\u0267\u0268\5\u00a2R\2\u0268"+
		"\u0269\7\21\2\2\u0269\u009f\3\2\2\2\u026a\u026f\79\2\2\u026b\u026c\7%"+
		"\2\2\u026c\u026e\79\2\2\u026d\u026b\3\2\2\2\u026e\u0271\3\2\2\2\u026f"+
		"\u026d\3\2\2\2\u026f\u0270\3\2\2\2\u0270\u0273\3\2\2\2\u0271\u026f\3\2"+
		"\2\2\u0272\u026a\3\2\2\2\u0272\u0273\3\2\2\2\u0273\u00a1\3\2\2\2\u0274"+
		"\u0275\5\4\3\2\u0275\u00a3\3\2\2\2\u0276\u0277\7\61\2\2\u0277\u0278\7"+
		"\22\2\2\u0278\u0279\5\u00a6T\2\u0279\u027a\7\23\2\2\u027a\u027b\5\u00a8"+
		"U\2\u027b\u027c\5\u00aaV\2\u027c\u00a5\3\2\2\2\u027d\u027e\5\16\b\2\u027e"+
		"\u00a7\3\2\2\2\u027f\u0280\7\20\2\2\u0280\u0281\5\4\3\2\u0281\u0282\7"+
		"\21\2\2\u0282\u0285\3\2\2\2\u0283\u0285\5\b\5\2\u0284\u027f\3\2\2\2\u0284"+
		"\u0283\3\2\2\2\u0285\u00a9\3\2\2\2\u0286\u0287\7\62\2\2\u0287\u0289\5"+
		"\u00acW\2\u0288\u0286\3\2\2\2\u0288\u0289\3\2\2\2\u0289\u00ab\3\2\2\2"+
		"\u028a\u028b\7\20\2\2\u028b\u028c\5\4\3\2\u028c\u028d\7\21\2\2\u028d\u0290"+
		"\3\2\2\2\u028e\u0290\5\b\5\2\u028f\u028a\3\2\2\2\u028f\u028e\3\2\2\2\u0290"+
		"\u00ad\3\2\2\2\u0291\u0292\7\66\2\2\u0292\u0293\7\22\2\2\u0293\u0294\5"+
		"\u00b0Y\2\u0294\u0295\7\23\2\2\u0295\u0296\5\u00b2Z\2\u0296\u00af\3\2"+
		"\2\2\u0297\u0298\5\16\b\2\u0298\u00b1\3\2\2\2\u0299\u029a\7\20\2\2\u029a"+
		"\u029b\5\4\3\2\u029b\u029c\7\21\2\2\u029c\u029f\3\2\2\2\u029d\u029f\5"+
		"\b\5\2\u029e\u0299\3\2\2\2\u029e\u029d\3\2\2\2\u029f\u00b3\3\2\2\2\u02a0"+
		"\u02a1\7\67\2\2\u02a1\u02a2\7\22\2\2\u02a2\u02a3\5\u00b6\\\2\u02a3\u02a4"+
		"\7$\2\2\u02a4\u02a5\5\u00b8]\2\u02a5\u02a6\7$\2\2\u02a6\u02a7\5\u00ba"+
		"^\2\u02a7\u02a8\7\23\2\2\u02a8\u02a9\5\u00bc_\2\u02a9\u00b5\3\2\2\2\u02aa"+
		"\u02ac\5\n\6\2\u02ab\u02aa\3\2\2\2\u02ab\u02ac\3\2\2\2\u02ac\u00b7\3\2"+
		"\2\2\u02ad\u02af\5\16\b\2\u02ae\u02ad\3\2\2\2\u02ae\u02af\3\2\2\2\u02af"+
		"\u00b9\3\2\2\2\u02b0\u02b2\5\n\6\2\u02b1\u02b0\3\2\2\2\u02b1\u02b2\3\2"+
		"\2\2\u02b2\u00bb\3\2\2\2\u02b3\u02b4\7\20\2\2\u02b4\u02b5\5\4\3\2\u02b5"+
		"\u02b6\7\21\2\2\u02b6\u02b9\3\2\2\2\u02b7\u02b9\5\b\5\2\u02b8\u02b3\3"+
		"\2\2\2\u02b8\u02b7\3\2\2\2\u02b9\u00bd\3\2\2\2\u02ba\u02bb\7\67\2\2\u02bb"+
		"\u02bc\7\22\2\2\u02bc\u02c1\5\u00c0a\2\u02bd\u02be\7%\2\2\u02be\u02c0"+
		"\5\u00c0a\2\u02bf\u02bd\3\2\2\2\u02c0\u02c3\3\2\2\2\u02c1\u02bf\3\2\2"+
		"\2\u02c1\u02c2\3\2\2\2\u02c2\u02c4\3\2\2\2\u02c3\u02c1\3\2\2\2\u02c4\u02c5"+
		"\78\2\2\u02c5\u02c6\5\16\b\2\u02c6\u02c7\7\23\2\2\u02c7\u02c8\5\u00c2"+
		"b\2\u02c8\u00bf\3\2\2\2\u02c9\u02cb\7)\2\2\u02ca\u02c9\3\2\2\2\u02ca\u02cb"+
		"\3\2\2\2\u02cb\u02cc\3\2\2\2\u02cc\u02cd\79\2\2\u02cd\u00c1\3\2\2\2\u02ce"+
		"\u02cf\7\20\2\2\u02cf\u02d0\5\4\3\2\u02d0\u02d1\7\21\2\2\u02d1\u02d4\3"+
		"\2\2\2\u02d2\u02d4\5\b\5\2\u02d3\u02ce\3\2\2\2\u02d3\u02d2\3\2\2\2\u02d4"+
		"\u00c3\3\2\2\2\u02d5\u02d6\7\r\2\2\u02d6\u02d7\79\2\2\u02d7\u02d8\5\u00c6"+
		"d\2\u02d8\u00c5\3\2\2\2\u02d9\u02da\7\20\2\2\u02da\u02db\5\4\3\2\u02db"+
		"\u02dc\7\21\2\2\u02dc\u02df\3\2\2\2\u02dd\u02df\5\b\5\2\u02de\u02d9\3"+
		"\2\2\2\u02de\u02dd\3\2\2\2\u02df\u00c7\3\2\2\2>\u00cd\u00d2\u00d6\u00d9"+
		"\u00dd\u00e0\u00e4\u00eb\u00f4\u0100\u010a\u0114\u011e\u0128\u0132\u013a"+
		"\u0141\u0146\u0160\u0165\u0169\u0174\u0188\u018b\u0191\u019c\u01aa\u01ad"+
		"\u01c8\u01cb\u01ce\u01d8\u01db\u01ec\u01f5\u01f8\u0200\u0205\u0213\u022b"+
		"\u0231\u0239\u0248\u024b\u0255\u025f\u026f\u0272\u0284\u0288\u028f\u029e"+
		"\u02ab\u02ae\u02b1\u02b8\u02c1\u02ca\u02d3\u02de";
	public static final ATN _ATN =
		ATNSimulator.deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}