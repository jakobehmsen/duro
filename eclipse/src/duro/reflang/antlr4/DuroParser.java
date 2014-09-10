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
		STRING_LITERAL=1, LINE_TERMINATOR=2, DOUBLE_AMP=3, DOUBLE_PIPE=4, BIN_OP1=5, 
		BIN_OP2=6, HASH=7, OPEN_SQ=8, CLOSE_SQ=9, OPEN_BRA=10, CLOSE_BRA=11, OPEN_PAR=12, 
		CLOSE_PAR=13, ASSIGN=14, EQUALS=15, NOT_EQUALS=16, LESS_THAN=17, LESS_THAN_OR_EQUALS=18, 
		GREATER_THAN=19, GREATER_THAN_OR_EQUALS=20, INT=21, SEMICOLON=22, COMMA=23, 
		COLON=24, DOT=25, KW_VAR=26, KW_PAUSE=27, KW_FUNCTION=28, KW_RETURN=29, 
		KW_TRUE=30, KW_FALSE=31, KW_IF=32, KW_ELSE=33, KW_THIS=34, KW_WHILE=35, 
		KW_FOR=36, KW_IN=37, ID=38, WS=39, SINGLELINE_COMMENT=40, MULTI_LINE_COMMENT=41;
	public static final String[] tokenNames = {
		"<INVALID>", "STRING_LITERAL", "LINE_TERMINATOR", "'&&'", "'||'", "BIN_OP1", 
		"BIN_OP2", "'#'", "'['", "']'", "'{'", "'}'", "'('", "')'", "'='", "'=='", 
		"'!='", "'<'", "'<='", "'>'", "'>='", "INT", "';'", "','", "':'", "'.'", 
		"'var'", "'pause'", "'function'", "'return'", "'true'", "'false'", "'if'", 
		"'else'", "'this'", "'while'", "'for'", "'in'", "ID", "WS", "SINGLELINE_COMMENT", 
		"MULTI_LINE_COMMENT"
	};
	public static final int
		RULE_program = 0, RULE_programElements = 1, RULE_programElement = 2, RULE_topExpression = 3, 
		RULE_expression = 4, RULE_binaryExpressionLogicalOr = 5, RULE_binaryExpressionLogicalOrApplication = 6, 
		RULE_binaryExpressionLogicalAnd = 7, RULE_binaryExpressionLogicalAndApplication = 8, 
		RULE_binaryExpressionEquality = 9, RULE_binaryExpressionEqualityApplication = 10, 
		RULE_binaryExpressionGreaterLess = 11, RULE_binaryExpressionGreaterLessApplication = 12, 
		RULE_binaryExpressionArithmetic1 = 13, RULE_binaryExpressionArithmetic1Application = 14, 
		RULE_binaryExpressionArithmetic2 = 15, RULE_binaryExpressionArithmetic2Application = 16, 
		RULE_binaryExpressionArithmetic2Operand = 17, RULE_variableAssignment = 18, 
		RULE_lookup = 19, RULE_thisMessageExchange = 20, RULE_messageExchange = 21, 
		RULE_literal = 22, RULE_integer = 23, RULE_bool = 24, RULE_string = 25, 
		RULE_dictProcess = 26, RULE_dictProcessEntry = 27, RULE_functionLiteral = 28, 
		RULE_array = 29, RULE_arrayOperand = 30, RULE_self = 31, RULE_operationChain = 32, 
		RULE_explicitMessageExchange = 33, RULE_memberAccess = 34, RULE_computedMemberAccess = 35, 
		RULE_operationEnd = 36, RULE_memberAssignment = 37, RULE_computedMemberAssignment = 38, 
		RULE_delimitedStatement = 39, RULE_pause = 40, RULE_variableStatement = 41, 
		RULE_variableDeclarationAndAssignment = 42, RULE_variableDeclaration = 43, 
		RULE_returnStatement = 44, RULE_undelimitedStatement = 45, RULE_functionDefinition = 46, 
		RULE_functionParameters = 47, RULE_functionBody = 48, RULE_primitiveBody = 49, 
		RULE_primitiveCall = 50, RULE_primitiveOperand = 51, RULE_ifStatement = 52, 
		RULE_ifStatementCondition = 53, RULE_ifStatementOnTrue = 54, RULE_elseStatement = 55, 
		RULE_ifStatementOnFalse = 56, RULE_whileStatement = 57, RULE_whileStatementCondition = 58, 
		RULE_whileStatementBody = 59, RULE_forStatement = 60, RULE_forStatementBody = 61;
	public static final String[] ruleNames = {
		"program", "programElements", "programElement", "topExpression", "expression", 
		"binaryExpressionLogicalOr", "binaryExpressionLogicalOrApplication", "binaryExpressionLogicalAnd", 
		"binaryExpressionLogicalAndApplication", "binaryExpressionEquality", "binaryExpressionEqualityApplication", 
		"binaryExpressionGreaterLess", "binaryExpressionGreaterLessApplication", 
		"binaryExpressionArithmetic1", "binaryExpressionArithmetic1Application", 
		"binaryExpressionArithmetic2", "binaryExpressionArithmetic2Application", 
		"binaryExpressionArithmetic2Operand", "variableAssignment", "lookup", 
		"thisMessageExchange", "messageExchange", "literal", "integer", "bool", 
		"string", "dictProcess", "dictProcessEntry", "functionLiteral", "array", 
		"arrayOperand", "self", "operationChain", "explicitMessageExchange", "memberAccess", 
		"computedMemberAccess", "operationEnd", "memberAssignment", "computedMemberAssignment", 
		"delimitedStatement", "pause", "variableStatement", "variableDeclarationAndAssignment", 
		"variableDeclaration", "returnStatement", "undelimitedStatement", "functionDefinition", 
		"functionParameters", "functionBody", "primitiveBody", "primitiveCall", 
		"primitiveOperand", "ifStatement", "ifStatementCondition", "ifStatementOnTrue", 
		"elseStatement", "ifStatementOnFalse", "whileStatement", "whileStatementCondition", 
		"whileStatementBody", "forStatement", "forStatementBody"
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
			setState(124); programElements();
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
		public List<ProgramElementContext> programElement() {
			return getRuleContexts(ProgramElementContext.class);
		}
		public ProgramElementContext programElement(int i) {
			return getRuleContext(ProgramElementContext.class,i);
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
			setState(129);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << STRING_LITERAL) | (1L << HASH) | (1L << OPEN_SQ) | (1L << OPEN_BRA) | (1L << INT) | (1L << KW_VAR) | (1L << KW_PAUSE) | (1L << KW_FUNCTION) | (1L << KW_RETURN) | (1L << KW_TRUE) | (1L << KW_FALSE) | (1L << KW_IF) | (1L << KW_THIS) | (1L << KW_WHILE) | (1L << KW_FOR) | (1L << ID))) != 0)) {
				{
				{
				setState(126); programElement();
				}
				}
				setState(131);
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

	public static class ProgramElementContext extends ParserRuleContext {
		public TerminalNode SEMICOLON() { return getToken(DuroParser.SEMICOLON, 0); }
		public TopExpressionContext topExpression() {
			return getRuleContext(TopExpressionContext.class,0);
		}
		public UndelimitedStatementContext undelimitedStatement() {
			return getRuleContext(UndelimitedStatementContext.class,0);
		}
		public DelimitedStatementContext delimitedStatement() {
			return getRuleContext(DelimitedStatementContext.class,0);
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
		enterRule(_localctx, 4, RULE_programElement);
		try {
			setState(139);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(134);
				switch (_input.LA(1)) {
				case STRING_LITERAL:
				case OPEN_SQ:
				case OPEN_BRA:
				case INT:
				case KW_FUNCTION:
				case KW_TRUE:
				case KW_FALSE:
				case KW_THIS:
				case ID:
					{
					setState(132); topExpression();
					}
					break;
				case KW_VAR:
				case KW_PAUSE:
				case KW_RETURN:
					{
					setState(133); delimitedStatement();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(136); match(SEMICOLON);
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(138); undelimitedStatement();
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
		enterRule(_localctx, 6, RULE_topExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(141); expression();
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
		public BinaryExpressionLogicalOrContext binaryExpressionLogicalOr() {
			return getRuleContext(BinaryExpressionLogicalOrContext.class,0);
		}
		public VariableAssignmentContext variableAssignment() {
			return getRuleContext(VariableAssignmentContext.class,0);
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
		enterRule(_localctx, 8, RULE_expression);
		try {
			setState(145);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(143); variableAssignment();
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(144); binaryExpressionLogicalOr();
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
		enterRule(_localctx, 10, RULE_binaryExpressionLogicalOr);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(147); binaryExpressionLogicalAnd();
			setState(151);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,4,_ctx);
			while ( _alt!=2 && _alt!=-1 ) {
				if ( _alt==1 ) {
					{
					{
					setState(148); binaryExpressionLogicalOrApplication();
					}
					} 
				}
				setState(153);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,4,_ctx);
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
		enterRule(_localctx, 12, RULE_binaryExpressionLogicalOrApplication);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(154); match(DOUBLE_PIPE);
			setState(155); binaryExpressionLogicalAnd();
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
		enterRule(_localctx, 14, RULE_binaryExpressionLogicalAnd);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(157); binaryExpressionEquality();
			setState(161);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,5,_ctx);
			while ( _alt!=2 && _alt!=-1 ) {
				if ( _alt==1 ) {
					{
					{
					setState(158); binaryExpressionLogicalAndApplication();
					}
					} 
				}
				setState(163);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,5,_ctx);
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
		enterRule(_localctx, 16, RULE_binaryExpressionLogicalAndApplication);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(164); match(DOUBLE_AMP);
			setState(165); binaryExpressionEquality();
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
		enterRule(_localctx, 18, RULE_binaryExpressionEquality);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(167); binaryExpressionGreaterLess();
			setState(171);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,6,_ctx);
			while ( _alt!=2 && _alt!=-1 ) {
				if ( _alt==1 ) {
					{
					{
					setState(168); binaryExpressionEqualityApplication();
					}
					} 
				}
				setState(173);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,6,_ctx);
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
		enterRule(_localctx, 20, RULE_binaryExpressionEqualityApplication);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(174);
			((BinaryExpressionEqualityApplicationContext)_localctx).op = _input.LT(1);
			_la = _input.LA(1);
			if ( !(_la==EQUALS || _la==NOT_EQUALS) ) {
				((BinaryExpressionEqualityApplicationContext)_localctx).op = (Token)_errHandler.recoverInline(this);
			}
			consume();
			setState(175); binaryExpressionGreaterLess();
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
		enterRule(_localctx, 22, RULE_binaryExpressionGreaterLess);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(177); binaryExpressionArithmetic1();
			setState(181);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,7,_ctx);
			while ( _alt!=2 && _alt!=-1 ) {
				if ( _alt==1 ) {
					{
					{
					setState(178); binaryExpressionGreaterLessApplication();
					}
					} 
				}
				setState(183);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,7,_ctx);
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
		enterRule(_localctx, 24, RULE_binaryExpressionGreaterLessApplication);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(184);
			((BinaryExpressionGreaterLessApplicationContext)_localctx).op = _input.LT(1);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << LESS_THAN) | (1L << LESS_THAN_OR_EQUALS) | (1L << GREATER_THAN) | (1L << GREATER_THAN_OR_EQUALS))) != 0)) ) {
				((BinaryExpressionGreaterLessApplicationContext)_localctx).op = (Token)_errHandler.recoverInline(this);
			}
			consume();
			setState(185); binaryExpressionArithmetic1();
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
		enterRule(_localctx, 26, RULE_binaryExpressionArithmetic1);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(187); binaryExpressionArithmetic2();
			setState(191);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,8,_ctx);
			while ( _alt!=2 && _alt!=-1 ) {
				if ( _alt==1 ) {
					{
					{
					setState(188); binaryExpressionArithmetic1Application();
					}
					} 
				}
				setState(193);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,8,_ctx);
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
		enterRule(_localctx, 28, RULE_binaryExpressionArithmetic1Application);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(194); match(BIN_OP1);
			setState(195); binaryExpressionArithmetic2();
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
		public List<BinaryExpressionArithmetic2ApplicationContext> binaryExpressionArithmetic2Application() {
			return getRuleContexts(BinaryExpressionArithmetic2ApplicationContext.class);
		}
		public BinaryExpressionArithmetic2OperandContext binaryExpressionArithmetic2Operand() {
			return getRuleContext(BinaryExpressionArithmetic2OperandContext.class,0);
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
		enterRule(_localctx, 30, RULE_binaryExpressionArithmetic2);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(197); binaryExpressionArithmetic2Operand();
			setState(201);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,9,_ctx);
			while ( _alt!=2 && _alt!=-1 ) {
				if ( _alt==1 ) {
					{
					{
					setState(198); binaryExpressionArithmetic2Application();
					}
					} 
				}
				setState(203);
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

	public static class BinaryExpressionArithmetic2ApplicationContext extends ParserRuleContext {
		public TerminalNode BIN_OP2() { return getToken(DuroParser.BIN_OP2, 0); }
		public BinaryExpressionArithmetic2OperandContext binaryExpressionArithmetic2Operand() {
			return getRuleContext(BinaryExpressionArithmetic2OperandContext.class,0);
		}
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
		enterRule(_localctx, 32, RULE_binaryExpressionArithmetic2Application);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(204); match(BIN_OP2);
			setState(205); binaryExpressionArithmetic2Operand();
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

	public static class BinaryExpressionArithmetic2OperandContext extends ParserRuleContext {
		public OperationEndContext operationEnd() {
			return getRuleContext(OperationEndContext.class,0);
		}
		public ThisMessageExchangeContext thisMessageExchange() {
			return getRuleContext(ThisMessageExchangeContext.class,0);
		}
		public LookupContext lookup() {
			return getRuleContext(LookupContext.class,0);
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
		public SelfContext self() {
			return getRuleContext(SelfContext.class,0);
		}
		public BinaryExpressionArithmetic2OperandContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_binaryExpressionArithmetic2Operand; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DuroListener ) ((DuroListener)listener).enterBinaryExpressionArithmetic2Operand(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DuroListener ) ((DuroListener)listener).exitBinaryExpressionArithmetic2Operand(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DuroVisitor ) return ((DuroVisitor<? extends T>)visitor).visitBinaryExpressionArithmetic2Operand(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BinaryExpressionArithmetic2OperandContext binaryExpressionArithmetic2Operand() throws RecognitionException {
		BinaryExpressionArithmetic2OperandContext _localctx = new BinaryExpressionArithmetic2OperandContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_binaryExpressionArithmetic2Operand);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(211);
			switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
			case 1:
				{
				setState(207); lookup();
				}
				break;

			case 2:
				{
				setState(208); thisMessageExchange();
				}
				break;

			case 3:
				{
				setState(209); literal();
				}
				break;

			case 4:
				{
				setState(210); self();
				}
				break;
			}
			setState(216);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,11,_ctx);
			while ( _alt!=2 && _alt!=-1 ) {
				if ( _alt==1 ) {
					{
					{
					setState(213); operationChain();
					}
					} 
				}
				setState(218);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,11,_ctx);
			}
			setState(220);
			_la = _input.LA(1);
			if (_la==OPEN_SQ || _la==DOT) {
				{
				setState(219); operationEnd();
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

	public static class VariableAssignmentContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(DuroParser.ID, 0); }
		public TerminalNode ASSIGN() { return getToken(DuroParser.ASSIGN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
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
		enterRule(_localctx, 36, RULE_variableAssignment);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(222); match(ID);
			setState(223); match(ASSIGN);
			setState(224); expression();
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
		enterRule(_localctx, 38, RULE_lookup);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(226); match(ID);
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
		enterRule(_localctx, 40, RULE_thisMessageExchange);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(228); messageExchange();
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
		public TerminalNode ID() { return getToken(DuroParser.ID, 0); }
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
		enterRule(_localctx, 42, RULE_messageExchange);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(230); match(ID);
			setState(231); match(OPEN_PAR);
			setState(240);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << STRING_LITERAL) | (1L << OPEN_SQ) | (1L << OPEN_BRA) | (1L << INT) | (1L << KW_FUNCTION) | (1L << KW_TRUE) | (1L << KW_FALSE) | (1L << KW_THIS) | (1L << ID))) != 0)) {
				{
				setState(232); expression();
				setState(237);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(233); match(COMMA);
					setState(234); expression();
					}
					}
					setState(239);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(242); match(CLOSE_PAR);
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
		enterRule(_localctx, 44, RULE_literal);
		try {
			setState(250);
			switch (_input.LA(1)) {
			case INT:
				enterOuterAlt(_localctx, 1);
				{
				setState(244); integer();
				}
				break;
			case KW_TRUE:
			case KW_FALSE:
				enterOuterAlt(_localctx, 2);
				{
				setState(245); bool();
				}
				break;
			case STRING_LITERAL:
				enterOuterAlt(_localctx, 3);
				{
				setState(246); string();
				}
				break;
			case OPEN_BRA:
				enterOuterAlt(_localctx, 4);
				{
				setState(247); dictProcess();
				}
				break;
			case KW_FUNCTION:
				enterOuterAlt(_localctx, 5);
				{
				setState(248); functionLiteral();
				}
				break;
			case OPEN_SQ:
				enterOuterAlt(_localctx, 6);
				{
				setState(249); array();
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
		enterRule(_localctx, 46, RULE_integer);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(252); match(INT);
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
		enterRule(_localctx, 48, RULE_bool);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(254);
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
		enterRule(_localctx, 50, RULE_string);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(256); match(STRING_LITERAL);
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
		enterRule(_localctx, 52, RULE_dictProcess);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(258); match(OPEN_BRA);
			setState(267);
			_la = _input.LA(1);
			if (_la==ID) {
				{
				setState(259); dictProcessEntry();
				setState(264);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(260); match(COMMA);
					setState(261); dictProcessEntry();
					}
					}
					setState(266);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(269); match(CLOSE_BRA);
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
		public TerminalNode ID() { return getToken(DuroParser.ID, 0); }
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
		enterRule(_localctx, 54, RULE_dictProcessEntry);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(271); match(ID);
			setState(272); match(COLON);
			setState(273); expression();
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
		enterRule(_localctx, 56, RULE_functionLiteral);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(275); match(KW_FUNCTION);
			setState(276); match(OPEN_PAR);
			setState(277); functionParameters();
			setState(278); match(CLOSE_PAR);
			setState(279); match(OPEN_BRA);
			setState(280); functionBody();
			setState(281); match(CLOSE_BRA);
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
		enterRule(_localctx, 58, RULE_array);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(283); match(OPEN_SQ);
			setState(292);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << STRING_LITERAL) | (1L << OPEN_SQ) | (1L << OPEN_BRA) | (1L << INT) | (1L << KW_FUNCTION) | (1L << KW_TRUE) | (1L << KW_FALSE) | (1L << KW_THIS) | (1L << ID))) != 0)) {
				{
				setState(284); arrayOperand();
				setState(289);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(285); match(COMMA);
					setState(286); arrayOperand();
					}
					}
					setState(291);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(294); match(CLOSE_SQ);
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
		enterRule(_localctx, 60, RULE_arrayOperand);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(296); expression();
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
		enterRule(_localctx, 62, RULE_self);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(298); match(KW_THIS);
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
		public ComputedMemberAccessContext computedMemberAccess() {
			return getRuleContext(ComputedMemberAccessContext.class,0);
		}
		public ExplicitMessageExchangeContext explicitMessageExchange() {
			return getRuleContext(ExplicitMessageExchangeContext.class,0);
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
		enterRule(_localctx, 64, RULE_operationChain);
		try {
			setState(303);
			switch ( getInterpreter().adaptivePredict(_input,20,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(300); explicitMessageExchange();
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(301); memberAccess();
				}
				break;

			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(302); computedMemberAccess();
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
		enterRule(_localctx, 66, RULE_explicitMessageExchange);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(305); match(DOT);
			setState(306); messageExchange();
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
		public TerminalNode ID() { return getToken(DuroParser.ID, 0); }
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
		enterRule(_localctx, 68, RULE_memberAccess);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(308); match(DOT);
			setState(309); match(ID);
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

	public static class ComputedMemberAccessContext extends ParserRuleContext {
		public TerminalNode OPEN_SQ() { return getToken(DuroParser.OPEN_SQ, 0); }
		public TerminalNode CLOSE_SQ() { return getToken(DuroParser.CLOSE_SQ, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ComputedMemberAccessContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_computedMemberAccess; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DuroListener ) ((DuroListener)listener).enterComputedMemberAccess(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DuroListener ) ((DuroListener)listener).exitComputedMemberAccess(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DuroVisitor ) return ((DuroVisitor<? extends T>)visitor).visitComputedMemberAccess(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ComputedMemberAccessContext computedMemberAccess() throws RecognitionException {
		ComputedMemberAccessContext _localctx = new ComputedMemberAccessContext(_ctx, getState());
		enterRule(_localctx, 70, RULE_computedMemberAccess);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(311); match(OPEN_SQ);
			setState(312); expression();
			setState(313); match(CLOSE_SQ);
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
		public ComputedMemberAssignmentContext computedMemberAssignment() {
			return getRuleContext(ComputedMemberAssignmentContext.class,0);
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
		enterRule(_localctx, 72, RULE_operationEnd);
		try {
			setState(317);
			switch (_input.LA(1)) {
			case DOT:
				enterOuterAlt(_localctx, 1);
				{
				setState(315); memberAssignment();
				}
				break;
			case OPEN_SQ:
				enterOuterAlt(_localctx, 2);
				{
				setState(316); computedMemberAssignment();
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
		public TerminalNode DOT() { return getToken(DuroParser.DOT, 0); }
		public TerminalNode ID() { return getToken(DuroParser.ID, 0); }
		public TerminalNode ASSIGN() { return getToken(DuroParser.ASSIGN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
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
		enterRule(_localctx, 74, RULE_memberAssignment);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(319); match(DOT);
			setState(320); match(ID);
			setState(321); match(ASSIGN);
			setState(322); expression();
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

	public static class ComputedMemberAssignmentContext extends ParserRuleContext {
		public TerminalNode ASSIGN() { return getToken(DuroParser.ASSIGN, 0); }
		public TerminalNode OPEN_SQ() { return getToken(DuroParser.OPEN_SQ, 0); }
		public TerminalNode CLOSE_SQ() { return getToken(DuroParser.CLOSE_SQ, 0); }
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ComputedMemberAssignmentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_computedMemberAssignment; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DuroListener ) ((DuroListener)listener).enterComputedMemberAssignment(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DuroListener ) ((DuroListener)listener).exitComputedMemberAssignment(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DuroVisitor ) return ((DuroVisitor<? extends T>)visitor).visitComputedMemberAssignment(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ComputedMemberAssignmentContext computedMemberAssignment() throws RecognitionException {
		ComputedMemberAssignmentContext _localctx = new ComputedMemberAssignmentContext(_ctx, getState());
		enterRule(_localctx, 76, RULE_computedMemberAssignment);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(324); match(OPEN_SQ);
			setState(325); expression();
			setState(326); match(CLOSE_SQ);
			setState(327); match(ASSIGN);
			setState(328); expression();
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
		public VariableStatementContext variableStatement() {
			return getRuleContext(VariableStatementContext.class,0);
		}
		public PauseContext pause() {
			return getRuleContext(PauseContext.class,0);
		}
		public ReturnStatementContext returnStatement() {
			return getRuleContext(ReturnStatementContext.class,0);
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
		enterRule(_localctx, 78, RULE_delimitedStatement);
		try {
			setState(333);
			switch (_input.LA(1)) {
			case KW_PAUSE:
				enterOuterAlt(_localctx, 1);
				{
				setState(330); pause();
				}
				break;
			case KW_VAR:
				enterOuterAlt(_localctx, 2);
				{
				setState(331); variableStatement();
				}
				break;
			case KW_RETURN:
				enterOuterAlt(_localctx, 3);
				{
				setState(332); returnStatement();
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
		enterRule(_localctx, 80, RULE_pause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(335); match(KW_PAUSE);
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
		enterRule(_localctx, 82, RULE_variableStatement);
		try {
			setState(339);
			switch ( getInterpreter().adaptivePredict(_input,23,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(337); variableDeclarationAndAssignment();
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(338); variableDeclaration();
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
		public TerminalNode ID() { return getToken(DuroParser.ID, 0); }
		public TerminalNode ASSIGN() { return getToken(DuroParser.ASSIGN, 0); }
		public TerminalNode KW_VAR() { return getToken(DuroParser.KW_VAR, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
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
		enterRule(_localctx, 84, RULE_variableDeclarationAndAssignment);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(341); match(KW_VAR);
			setState(342); match(ID);
			setState(343); match(ASSIGN);
			setState(344); expression();
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
		enterRule(_localctx, 86, RULE_variableDeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(346); match(KW_VAR);
			setState(347); match(ID);
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
		public TerminalNode KW_RETURN() { return getToken(DuroParser.KW_RETURN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
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
		enterRule(_localctx, 88, RULE_returnStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(349); match(KW_RETURN);
			setState(351);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << STRING_LITERAL) | (1L << OPEN_SQ) | (1L << OPEN_BRA) | (1L << INT) | (1L << KW_FUNCTION) | (1L << KW_TRUE) | (1L << KW_FALSE) | (1L << KW_THIS) | (1L << ID))) != 0)) {
				{
				setState(350); expression();
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

	public static class UndelimitedStatementContext extends ParserRuleContext {
		public IfStatementContext ifStatement() {
			return getRuleContext(IfStatementContext.class,0);
		}
		public PrimitiveBodyContext primitiveBody() {
			return getRuleContext(PrimitiveBodyContext.class,0);
		}
		public WhileStatementContext whileStatement() {
			return getRuleContext(WhileStatementContext.class,0);
		}
		public ForStatementContext forStatement() {
			return getRuleContext(ForStatementContext.class,0);
		}
		public FunctionDefinitionContext functionDefinition() {
			return getRuleContext(FunctionDefinitionContext.class,0);
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
		enterRule(_localctx, 90, RULE_undelimitedStatement);
		try {
			setState(358);
			switch (_input.LA(1)) {
			case KW_FUNCTION:
				enterOuterAlt(_localctx, 1);
				{
				setState(353); functionDefinition();
				}
				break;
			case HASH:
				enterOuterAlt(_localctx, 2);
				{
				setState(354); primitiveBody();
				}
				break;
			case KW_IF:
				enterOuterAlt(_localctx, 3);
				{
				setState(355); ifStatement();
				}
				break;
			case KW_WHILE:
				enterOuterAlt(_localctx, 4);
				{
				setState(356); whileStatement();
				}
				break;
			case KW_FOR:
				enterOuterAlt(_localctx, 5);
				{
				setState(357); forStatement();
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

	public static class FunctionDefinitionContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(DuroParser.ID, 0); }
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
		enterRule(_localctx, 92, RULE_functionDefinition);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(360); match(KW_FUNCTION);
			setState(361); match(ID);
			setState(362); match(OPEN_PAR);
			setState(363); functionParameters();
			setState(364); match(CLOSE_PAR);
			setState(365); match(OPEN_BRA);
			setState(366); functionBody();
			setState(367); match(CLOSE_BRA);
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
		enterRule(_localctx, 94, RULE_functionParameters);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(377);
			_la = _input.LA(1);
			if (_la==ID) {
				{
				setState(369); match(ID);
				setState(374);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(370); match(COMMA);
					setState(371); match(ID);
					}
					}
					setState(376);
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
		enterRule(_localctx, 96, RULE_functionBody);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(379); programElements();
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

	public static class PrimitiveBodyContext extends ParserRuleContext {
		public PrimitiveCallContext primitiveCall(int i) {
			return getRuleContext(PrimitiveCallContext.class,i);
		}
		public TerminalNode CLOSE_BRA() { return getToken(DuroParser.CLOSE_BRA, 0); }
		public List<PrimitiveCallContext> primitiveCall() {
			return getRuleContexts(PrimitiveCallContext.class);
		}
		public TerminalNode HASH() { return getToken(DuroParser.HASH, 0); }
		public TerminalNode OPEN_BRA() { return getToken(DuroParser.OPEN_BRA, 0); }
		public PrimitiveBodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_primitiveBody; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DuroListener ) ((DuroListener)listener).enterPrimitiveBody(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DuroListener ) ((DuroListener)listener).exitPrimitiveBody(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DuroVisitor ) return ((DuroVisitor<? extends T>)visitor).visitPrimitiveBody(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PrimitiveBodyContext primitiveBody() throws RecognitionException {
		PrimitiveBodyContext _localctx = new PrimitiveBodyContext(_ctx, getState());
		enterRule(_localctx, 98, RULE_primitiveBody);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(381); match(HASH);
			setState(382); match(OPEN_BRA);
			setState(386);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==ID) {
				{
				{
				setState(383); primitiveCall();
				}
				}
				setState(388);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(389); match(CLOSE_BRA);
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

	public static class PrimitiveCallContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(DuroParser.ID, 0); }
		public List<PrimitiveOperandContext> primitiveOperand() {
			return getRuleContexts(PrimitiveOperandContext.class);
		}
		public PrimitiveOperandContext primitiveOperand(int i) {
			return getRuleContext(PrimitiveOperandContext.class,i);
		}
		public PrimitiveCallContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_primitiveCall; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DuroListener ) ((DuroListener)listener).enterPrimitiveCall(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DuroListener ) ((DuroListener)listener).exitPrimitiveCall(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DuroVisitor ) return ((DuroVisitor<? extends T>)visitor).visitPrimitiveCall(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PrimitiveCallContext primitiveCall() throws RecognitionException {
		PrimitiveCallContext _localctx = new PrimitiveCallContext(_ctx, getState());
		enterRule(_localctx, 100, RULE_primitiveCall);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(391); match(ID);
			setState(395);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COLON) {
				{
				{
				setState(392); primitiveOperand();
				}
				}
				setState(397);
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

	public static class PrimitiveOperandContext extends ParserRuleContext {
		public TerminalNode COLON() { return getToken(DuroParser.COLON, 0); }
		public LiteralContext literal() {
			return getRuleContext(LiteralContext.class,0);
		}
		public PrimitiveOperandContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_primitiveOperand; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DuroListener ) ((DuroListener)listener).enterPrimitiveOperand(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DuroListener ) ((DuroListener)listener).exitPrimitiveOperand(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DuroVisitor ) return ((DuroVisitor<? extends T>)visitor).visitPrimitiveOperand(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PrimitiveOperandContext primitiveOperand() throws RecognitionException {
		PrimitiveOperandContext _localctx = new PrimitiveOperandContext(_ctx, getState());
		enterRule(_localctx, 102, RULE_primitiveOperand);
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(398); match(COLON);
			setState(399); literal();
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
		enterRule(_localctx, 104, RULE_ifStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(401); match(KW_IF);
			setState(402); match(OPEN_PAR);
			setState(403); ifStatementCondition();
			setState(404); match(CLOSE_PAR);
			setState(405); ifStatementOnTrue();
			setState(406); elseStatement();
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
		enterRule(_localctx, 106, RULE_ifStatementCondition);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(408); expression();
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
		enterRule(_localctx, 108, RULE_ifStatementOnTrue);
		try {
			setState(415);
			switch ( getInterpreter().adaptivePredict(_input,30,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(410); match(OPEN_BRA);
				setState(411); programElements();
				setState(412); match(CLOSE_BRA);
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(414); programElement();
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
		enterRule(_localctx, 110, RULE_elseStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(419);
			switch ( getInterpreter().adaptivePredict(_input,31,_ctx) ) {
			case 1:
				{
				setState(417); match(KW_ELSE);
				setState(418); ifStatementOnFalse();
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
		enterRule(_localctx, 112, RULE_ifStatementOnFalse);
		try {
			setState(426);
			switch ( getInterpreter().adaptivePredict(_input,32,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				{
				setState(421); match(OPEN_BRA);
				setState(422); programElements();
				setState(423); match(CLOSE_BRA);
				}
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(425); programElement();
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
		enterRule(_localctx, 114, RULE_whileStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(428); match(KW_WHILE);
			setState(429); match(OPEN_PAR);
			setState(430); whileStatementCondition();
			setState(431); match(CLOSE_PAR);
			setState(432); whileStatementBody();
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
		enterRule(_localctx, 116, RULE_whileStatementCondition);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(434); expression();
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
		enterRule(_localctx, 118, RULE_whileStatementBody);
		try {
			setState(441);
			switch ( getInterpreter().adaptivePredict(_input,33,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(436); match(OPEN_BRA);
				setState(437); programElements();
				setState(438); match(CLOSE_BRA);
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(440); programElement();
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
		public ForStatementBodyContext forStatementBody() {
			return getRuleContext(ForStatementBodyContext.class,0);
		}
		public TerminalNode ID() { return getToken(DuroParser.ID, 0); }
		public TerminalNode KW_FOR() { return getToken(DuroParser.KW_FOR, 0); }
		public TerminalNode KW_IN() { return getToken(DuroParser.KW_IN, 0); }
		public TerminalNode OPEN_PAR() { return getToken(DuroParser.OPEN_PAR, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode KW_VAR() { return getToken(DuroParser.KW_VAR, 0); }
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
		enterRule(_localctx, 120, RULE_forStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(443); match(KW_FOR);
			setState(444); match(OPEN_PAR);
			setState(446);
			_la = _input.LA(1);
			if (_la==KW_VAR) {
				{
				setState(445); match(KW_VAR);
				}
			}

			setState(448); match(ID);
			setState(449); match(KW_IN);
			setState(450); expression();
			setState(451); match(CLOSE_PAR);
			setState(452); forStatementBody();
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
		enterRule(_localctx, 122, RULE_forStatementBody);
		try {
			setState(459);
			switch ( getInterpreter().adaptivePredict(_input,35,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(454); match(OPEN_BRA);
				setState(455); programElements();
				setState(456); match(CLOSE_BRA);
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(458); programElement();
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
		"\3\uacf5\uee8c\u4f5d\u8b0d\u4a45\u78bd\u1b2f\u3378\3+\u01d0\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\4<\t<\4=\t="+
		"\4>\t>\4?\t?\3\2\3\2\3\3\7\3\u0082\n\3\f\3\16\3\u0085\13\3\3\4\3\4\5\4"+
		"\u0089\n\4\3\4\3\4\3\4\5\4\u008e\n\4\3\5\3\5\3\6\3\6\5\6\u0094\n\6\3\7"+
		"\3\7\7\7\u0098\n\7\f\7\16\7\u009b\13\7\3\b\3\b\3\b\3\t\3\t\7\t\u00a2\n"+
		"\t\f\t\16\t\u00a5\13\t\3\n\3\n\3\n\3\13\3\13\7\13\u00ac\n\13\f\13\16\13"+
		"\u00af\13\13\3\f\3\f\3\f\3\r\3\r\7\r\u00b6\n\r\f\r\16\r\u00b9\13\r\3\16"+
		"\3\16\3\16\3\17\3\17\7\17\u00c0\n\17\f\17\16\17\u00c3\13\17\3\20\3\20"+
		"\3\20\3\21\3\21\7\21\u00ca\n\21\f\21\16\21\u00cd\13\21\3\22\3\22\3\22"+
		"\3\23\3\23\3\23\3\23\5\23\u00d6\n\23\3\23\7\23\u00d9\n\23\f\23\16\23\u00dc"+
		"\13\23\3\23\5\23\u00df\n\23\3\24\3\24\3\24\3\24\3\25\3\25\3\26\3\26\3"+
		"\27\3\27\3\27\3\27\3\27\7\27\u00ee\n\27\f\27\16\27\u00f1\13\27\5\27\u00f3"+
		"\n\27\3\27\3\27\3\30\3\30\3\30\3\30\3\30\3\30\5\30\u00fd\n\30\3\31\3\31"+
		"\3\32\3\32\3\33\3\33\3\34\3\34\3\34\3\34\7\34\u0109\n\34\f\34\16\34\u010c"+
		"\13\34\5\34\u010e\n\34\3\34\3\34\3\35\3\35\3\35\3\35\3\36\3\36\3\36\3"+
		"\36\3\36\3\36\3\36\3\36\3\37\3\37\3\37\3\37\7\37\u0122\n\37\f\37\16\37"+
		"\u0125\13\37\5\37\u0127\n\37\3\37\3\37\3 \3 \3!\3!\3\"\3\"\3\"\5\"\u0132"+
		"\n\"\3#\3#\3#\3$\3$\3$\3%\3%\3%\3%\3&\3&\5&\u0140\n&\3\'\3\'\3\'\3\'\3"+
		"\'\3(\3(\3(\3(\3(\3(\3)\3)\3)\5)\u0150\n)\3*\3*\3+\3+\5+\u0156\n+\3,\3"+
		",\3,\3,\3,\3-\3-\3-\3.\3.\5.\u0162\n.\3/\3/\3/\3/\3/\5/\u0169\n/\3\60"+
		"\3\60\3\60\3\60\3\60\3\60\3\60\3\60\3\60\3\61\3\61\3\61\7\61\u0177\n\61"+
		"\f\61\16\61\u017a\13\61\5\61\u017c\n\61\3\62\3\62\3\63\3\63\3\63\7\63"+
		"\u0183\n\63\f\63\16\63\u0186\13\63\3\63\3\63\3\64\3\64\7\64\u018c\n\64"+
		"\f\64\16\64\u018f\13\64\3\65\3\65\3\65\3\66\3\66\3\66\3\66\3\66\3\66\3"+
		"\66\3\67\3\67\38\38\38\38\38\58\u01a2\n8\39\39\59\u01a6\n9\3:\3:\3:\3"+
		":\3:\5:\u01ad\n:\3;\3;\3;\3;\3;\3;\3<\3<\3=\3=\3=\3=\3=\5=\u01bc\n=\3"+
		">\3>\3>\5>\u01c1\n>\3>\3>\3>\3>\3>\3>\3?\3?\3?\3?\3?\5?\u01ce\n?\3?\2"+
		"@\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(*,.\60\62\64\668:<>@BDF"+
		"HJLNPRTVXZ\\^`bdfhjlnprtvxz|\2\5\3\2\21\22\3\2\23\26\3\2 !\u01c0\2~\3"+
		"\2\2\2\4\u0083\3\2\2\2\6\u008d\3\2\2\2\b\u008f\3\2\2\2\n\u0093\3\2\2\2"+
		"\f\u0095\3\2\2\2\16\u009c\3\2\2\2\20\u009f\3\2\2\2\22\u00a6\3\2\2\2\24"+
		"\u00a9\3\2\2\2\26\u00b0\3\2\2\2\30\u00b3\3\2\2\2\32\u00ba\3\2\2\2\34\u00bd"+
		"\3\2\2\2\36\u00c4\3\2\2\2 \u00c7\3\2\2\2\"\u00ce\3\2\2\2$\u00d5\3\2\2"+
		"\2&\u00e0\3\2\2\2(\u00e4\3\2\2\2*\u00e6\3\2\2\2,\u00e8\3\2\2\2.\u00fc"+
		"\3\2\2\2\60\u00fe\3\2\2\2\62\u0100\3\2\2\2\64\u0102\3\2\2\2\66\u0104\3"+
		"\2\2\28\u0111\3\2\2\2:\u0115\3\2\2\2<\u011d\3\2\2\2>\u012a\3\2\2\2@\u012c"+
		"\3\2\2\2B\u0131\3\2\2\2D\u0133\3\2\2\2F\u0136\3\2\2\2H\u0139\3\2\2\2J"+
		"\u013f\3\2\2\2L\u0141\3\2\2\2N\u0146\3\2\2\2P\u014f\3\2\2\2R\u0151\3\2"+
		"\2\2T\u0155\3\2\2\2V\u0157\3\2\2\2X\u015c\3\2\2\2Z\u015f\3\2\2\2\\\u0168"+
		"\3\2\2\2^\u016a\3\2\2\2`\u017b\3\2\2\2b\u017d\3\2\2\2d\u017f\3\2\2\2f"+
		"\u0189\3\2\2\2h\u0190\3\2\2\2j\u0193\3\2\2\2l\u019a\3\2\2\2n\u01a1\3\2"+
		"\2\2p\u01a5\3\2\2\2r\u01ac\3\2\2\2t\u01ae\3\2\2\2v\u01b4\3\2\2\2x\u01bb"+
		"\3\2\2\2z\u01bd\3\2\2\2|\u01cd\3\2\2\2~\177\5\4\3\2\177\3\3\2\2\2\u0080"+
		"\u0082\5\6\4\2\u0081\u0080\3\2\2\2\u0082\u0085\3\2\2\2\u0083\u0081\3\2"+
		"\2\2\u0083\u0084\3\2\2\2\u0084\5\3\2\2\2\u0085\u0083\3\2\2\2\u0086\u0089"+
		"\5\b\5\2\u0087\u0089\5P)\2\u0088\u0086\3\2\2\2\u0088\u0087\3\2\2\2\u0089"+
		"\u008a\3\2\2\2\u008a\u008b\7\30\2\2\u008b\u008e\3\2\2\2\u008c\u008e\5"+
		"\\/\2\u008d\u0088\3\2\2\2\u008d\u008c\3\2\2\2\u008e\7\3\2\2\2\u008f\u0090"+
		"\5\n\6\2\u0090\t\3\2\2\2\u0091\u0094\5&\24\2\u0092\u0094\5\f\7\2\u0093"+
		"\u0091\3\2\2\2\u0093\u0092\3\2\2\2\u0094\13\3\2\2\2\u0095\u0099\5\20\t"+
		"\2\u0096\u0098\5\16\b\2\u0097\u0096\3\2\2\2\u0098\u009b\3\2\2\2\u0099"+
		"\u0097\3\2\2\2\u0099\u009a\3\2\2\2\u009a\r\3\2\2\2\u009b\u0099\3\2\2\2"+
		"\u009c\u009d\7\6\2\2\u009d\u009e\5\20\t\2\u009e\17\3\2\2\2\u009f\u00a3"+
		"\5\24\13\2\u00a0\u00a2\5\22\n\2\u00a1\u00a0\3\2\2\2\u00a2\u00a5\3\2\2"+
		"\2\u00a3\u00a1\3\2\2\2\u00a3\u00a4\3\2\2\2\u00a4\21\3\2\2\2\u00a5\u00a3"+
		"\3\2\2\2\u00a6\u00a7\7\5\2\2\u00a7\u00a8\5\24\13\2\u00a8\23\3\2\2\2\u00a9"+
		"\u00ad\5\30\r\2\u00aa\u00ac\5\26\f\2\u00ab\u00aa\3\2\2\2\u00ac\u00af\3"+
		"\2\2\2\u00ad\u00ab\3\2\2\2\u00ad\u00ae\3\2\2\2\u00ae\25\3\2\2\2\u00af"+
		"\u00ad\3\2\2\2\u00b0\u00b1\t\2\2\2\u00b1\u00b2\5\30\r\2\u00b2\27\3\2\2"+
		"\2\u00b3\u00b7\5\34\17\2\u00b4\u00b6\5\32\16\2\u00b5\u00b4\3\2\2\2\u00b6"+
		"\u00b9\3\2\2\2\u00b7\u00b5\3\2\2\2\u00b7\u00b8\3\2\2\2\u00b8\31\3\2\2"+
		"\2\u00b9\u00b7\3\2\2\2\u00ba\u00bb\t\3\2\2\u00bb\u00bc\5\34\17\2\u00bc"+
		"\33\3\2\2\2\u00bd\u00c1\5 \21\2\u00be\u00c0\5\36\20\2\u00bf\u00be\3\2"+
		"\2\2\u00c0\u00c3\3\2\2\2\u00c1\u00bf\3\2\2\2\u00c1\u00c2\3\2\2\2\u00c2"+
		"\35\3\2\2\2\u00c3\u00c1\3\2\2\2\u00c4\u00c5\7\7\2\2\u00c5\u00c6\5 \21"+
		"\2\u00c6\37\3\2\2\2\u00c7\u00cb\5$\23\2\u00c8\u00ca\5\"\22\2\u00c9\u00c8"+
		"\3\2\2\2\u00ca\u00cd\3\2\2\2\u00cb\u00c9\3\2\2\2\u00cb\u00cc\3\2\2\2\u00cc"+
		"!\3\2\2\2\u00cd\u00cb\3\2\2\2\u00ce\u00cf\7\b\2\2\u00cf\u00d0\5$\23\2"+
		"\u00d0#\3\2\2\2\u00d1\u00d6\5(\25\2\u00d2\u00d6\5*\26\2\u00d3\u00d6\5"+
		".\30\2\u00d4\u00d6\5@!\2\u00d5\u00d1\3\2\2\2\u00d5\u00d2\3\2\2\2\u00d5"+
		"\u00d3\3\2\2\2\u00d5\u00d4\3\2\2\2\u00d6\u00da\3\2\2\2\u00d7\u00d9\5B"+
		"\"\2\u00d8\u00d7\3\2\2\2\u00d9\u00dc\3\2\2\2\u00da\u00d8\3\2\2\2\u00da"+
		"\u00db\3\2\2\2\u00db\u00de\3\2\2\2\u00dc\u00da\3\2\2\2\u00dd\u00df\5J"+
		"&\2\u00de\u00dd\3\2\2\2\u00de\u00df\3\2\2\2\u00df%\3\2\2\2\u00e0\u00e1"+
		"\7(\2\2\u00e1\u00e2\7\20\2\2\u00e2\u00e3\5\n\6\2\u00e3\'\3\2\2\2\u00e4"+
		"\u00e5\7(\2\2\u00e5)\3\2\2\2\u00e6\u00e7\5,\27\2\u00e7+\3\2\2\2\u00e8"+
		"\u00e9\7(\2\2\u00e9\u00f2\7\16\2\2\u00ea\u00ef\5\n\6\2\u00eb\u00ec\7\31"+
		"\2\2\u00ec\u00ee\5\n\6\2\u00ed\u00eb\3\2\2\2\u00ee\u00f1\3\2\2\2\u00ef"+
		"\u00ed\3\2\2\2\u00ef\u00f0\3\2\2\2\u00f0\u00f3\3\2\2\2\u00f1\u00ef\3\2"+
		"\2\2\u00f2\u00ea\3\2\2\2\u00f2\u00f3\3\2\2\2\u00f3\u00f4\3\2\2\2\u00f4"+
		"\u00f5\7\17\2\2\u00f5-\3\2\2\2\u00f6\u00fd\5\60\31\2\u00f7\u00fd\5\62"+
		"\32\2\u00f8\u00fd\5\64\33\2\u00f9\u00fd\5\66\34\2\u00fa\u00fd\5:\36\2"+
		"\u00fb\u00fd\5<\37\2\u00fc\u00f6\3\2\2\2\u00fc\u00f7\3\2\2\2\u00fc\u00f8"+
		"\3\2\2\2\u00fc\u00f9\3\2\2\2\u00fc\u00fa\3\2\2\2\u00fc\u00fb\3\2\2\2\u00fd"+
		"/\3\2\2\2\u00fe\u00ff\7\27\2\2\u00ff\61\3\2\2\2\u0100\u0101\t\4\2\2\u0101"+
		"\63\3\2\2\2\u0102\u0103\7\3\2\2\u0103\65\3\2\2\2\u0104\u010d\7\f\2\2\u0105"+
		"\u010a\58\35\2\u0106\u0107\7\31\2\2\u0107\u0109\58\35\2\u0108\u0106\3"+
		"\2\2\2\u0109\u010c\3\2\2\2\u010a\u0108\3\2\2\2\u010a\u010b\3\2\2\2\u010b"+
		"\u010e\3\2\2\2\u010c\u010a\3\2\2\2\u010d\u0105\3\2\2\2\u010d\u010e\3\2"+
		"\2\2\u010e\u010f\3\2\2\2\u010f\u0110\7\r\2\2\u0110\67\3\2\2\2\u0111\u0112"+
		"\7(\2\2\u0112\u0113\7\32\2\2\u0113\u0114\5\n\6\2\u01149\3\2\2\2\u0115"+
		"\u0116\7\36\2\2\u0116\u0117\7\16\2\2\u0117\u0118\5`\61\2\u0118\u0119\7"+
		"\17\2\2\u0119\u011a\7\f\2\2\u011a\u011b\5b\62\2\u011b\u011c\7\r\2\2\u011c"+
		";\3\2\2\2\u011d\u0126\7\n\2\2\u011e\u0123\5> \2\u011f\u0120\7\31\2\2\u0120"+
		"\u0122\5> \2\u0121\u011f\3\2\2\2\u0122\u0125\3\2\2\2\u0123\u0121\3\2\2"+
		"\2\u0123\u0124\3\2\2\2\u0124\u0127\3\2\2\2\u0125\u0123\3\2\2\2\u0126\u011e"+
		"\3\2\2\2\u0126\u0127\3\2\2\2\u0127\u0128\3\2\2\2\u0128\u0129\7\13\2\2"+
		"\u0129=\3\2\2\2\u012a\u012b\5\n\6\2\u012b?\3\2\2\2\u012c\u012d\7$\2\2"+
		"\u012dA\3\2\2\2\u012e\u0132\5D#\2\u012f\u0132\5F$\2\u0130\u0132\5H%\2"+
		"\u0131\u012e\3\2\2\2\u0131\u012f\3\2\2\2\u0131\u0130\3\2\2\2\u0132C\3"+
		"\2\2\2\u0133\u0134\7\33\2\2\u0134\u0135\5,\27\2\u0135E\3\2\2\2\u0136\u0137"+
		"\7\33\2\2\u0137\u0138\7(\2\2\u0138G\3\2\2\2\u0139\u013a\7\n\2\2\u013a"+
		"\u013b\5\n\6\2\u013b\u013c\7\13\2\2\u013cI\3\2\2\2\u013d\u0140\5L\'\2"+
		"\u013e\u0140\5N(\2\u013f\u013d\3\2\2\2\u013f\u013e\3\2\2\2\u0140K\3\2"+
		"\2\2\u0141\u0142\7\33\2\2\u0142\u0143\7(\2\2\u0143\u0144\7\20\2\2\u0144"+
		"\u0145\5\n\6\2\u0145M\3\2\2\2\u0146\u0147\7\n\2\2\u0147\u0148\5\n\6\2"+
		"\u0148\u0149\7\13\2\2\u0149\u014a\7\20\2\2\u014a\u014b\5\n\6\2\u014bO"+
		"\3\2\2\2\u014c\u0150\5R*\2\u014d\u0150\5T+\2\u014e\u0150\5Z.\2\u014f\u014c"+
		"\3\2\2\2\u014f\u014d\3\2\2\2\u014f\u014e\3\2\2\2\u0150Q\3\2\2\2\u0151"+
		"\u0152\7\35\2\2\u0152S\3\2\2\2\u0153\u0156\5V,\2\u0154\u0156\5X-\2\u0155"+
		"\u0153\3\2\2\2\u0155\u0154\3\2\2\2\u0156U\3\2\2\2\u0157\u0158\7\34\2\2"+
		"\u0158\u0159\7(\2\2\u0159\u015a\7\20\2\2\u015a\u015b\5\n\6\2\u015bW\3"+
		"\2\2\2\u015c\u015d\7\34\2\2\u015d\u015e\7(\2\2\u015eY\3\2\2\2\u015f\u0161"+
		"\7\37\2\2\u0160\u0162\5\n\6\2\u0161\u0160\3\2\2\2\u0161\u0162\3\2\2\2"+
		"\u0162[\3\2\2\2\u0163\u0169\5^\60\2\u0164\u0169\5d\63\2\u0165\u0169\5"+
		"j\66\2\u0166\u0169\5t;\2\u0167\u0169\5z>\2\u0168\u0163\3\2\2\2\u0168\u0164"+
		"\3\2\2\2\u0168\u0165\3\2\2\2\u0168\u0166\3\2\2\2\u0168\u0167\3\2\2\2\u0169"+
		"]\3\2\2\2\u016a\u016b\7\36\2\2\u016b\u016c\7(\2\2\u016c\u016d\7\16\2\2"+
		"\u016d\u016e\5`\61\2\u016e\u016f\7\17\2\2\u016f\u0170\7\f\2\2\u0170\u0171"+
		"\5b\62\2\u0171\u0172\7\r\2\2\u0172_\3\2\2\2\u0173\u0178\7(\2\2\u0174\u0175"+
		"\7\31\2\2\u0175\u0177\7(\2\2\u0176\u0174\3\2\2\2\u0177\u017a\3\2\2\2\u0178"+
		"\u0176\3\2\2\2\u0178\u0179\3\2\2\2\u0179\u017c\3\2\2\2\u017a\u0178\3\2"+
		"\2\2\u017b\u0173\3\2\2\2\u017b\u017c\3\2\2\2\u017ca\3\2\2\2\u017d\u017e"+
		"\5\4\3\2\u017ec\3\2\2\2\u017f\u0180\7\t\2\2\u0180\u0184\7\f\2\2\u0181"+
		"\u0183\5f\64\2\u0182\u0181\3\2\2\2\u0183\u0186\3\2\2\2\u0184\u0182\3\2"+
		"\2\2\u0184\u0185\3\2\2\2\u0185\u0187\3\2\2\2\u0186\u0184\3\2\2\2\u0187"+
		"\u0188\7\r\2\2\u0188e\3\2\2\2\u0189\u018d\7(\2\2\u018a\u018c\5h\65\2\u018b"+
		"\u018a\3\2\2\2\u018c\u018f\3\2\2\2\u018d\u018b\3\2\2\2\u018d\u018e\3\2"+
		"\2\2\u018eg\3\2\2\2\u018f\u018d\3\2\2\2\u0190\u0191\7\32\2\2\u0191\u0192"+
		"\5.\30\2\u0192i\3\2\2\2\u0193\u0194\7\"\2\2\u0194\u0195\7\16\2\2\u0195"+
		"\u0196\5l\67\2\u0196\u0197\7\17\2\2\u0197\u0198\5n8\2\u0198\u0199\5p9"+
		"\2\u0199k\3\2\2\2\u019a\u019b\5\n\6\2\u019bm\3\2\2\2\u019c\u019d\7\f\2"+
		"\2\u019d\u019e\5\4\3\2\u019e\u019f\7\r\2\2\u019f\u01a2\3\2\2\2\u01a0\u01a2"+
		"\5\6\4\2\u01a1\u019c\3\2\2\2\u01a1\u01a0\3\2\2\2\u01a2o\3\2\2\2\u01a3"+
		"\u01a4\7#\2\2\u01a4\u01a6\5r:\2\u01a5\u01a3\3\2\2\2\u01a5\u01a6\3\2\2"+
		"\2\u01a6q\3\2\2\2\u01a7\u01a8\7\f\2\2\u01a8\u01a9\5\4\3\2\u01a9\u01aa"+
		"\7\r\2\2\u01aa\u01ad\3\2\2\2\u01ab\u01ad\5\6\4\2\u01ac\u01a7\3\2\2\2\u01ac"+
		"\u01ab\3\2\2\2\u01ads\3\2\2\2\u01ae\u01af\7%\2\2\u01af\u01b0\7\16\2\2"+
		"\u01b0\u01b1\5v<\2\u01b1\u01b2\7\17\2\2\u01b2\u01b3\5x=\2\u01b3u\3\2\2"+
		"\2\u01b4\u01b5\5\n\6\2\u01b5w\3\2\2\2\u01b6\u01b7\7\f\2\2\u01b7\u01b8"+
		"\5\4\3\2\u01b8\u01b9\7\r\2\2\u01b9\u01bc\3\2\2\2\u01ba\u01bc\5\6\4\2\u01bb"+
		"\u01b6\3\2\2\2\u01bb\u01ba\3\2\2\2\u01bcy\3\2\2\2\u01bd\u01be\7&\2\2\u01be"+
		"\u01c0\7\16\2\2\u01bf\u01c1\7\34\2\2\u01c0\u01bf\3\2\2\2\u01c0\u01c1\3"+
		"\2\2\2\u01c1\u01c2\3\2\2\2\u01c2\u01c3\7(\2\2\u01c3\u01c4\7\'\2\2\u01c4"+
		"\u01c5\5\n\6\2\u01c5\u01c6\7\17\2\2\u01c6\u01c7\5|?\2\u01c7{\3\2\2\2\u01c8"+
		"\u01c9\7\f\2\2\u01c9\u01ca\5\4\3\2\u01ca\u01cb\7\r\2\2\u01cb\u01ce\3\2"+
		"\2\2\u01cc\u01ce\5\6\4\2\u01cd\u01c8\3\2\2\2\u01cd\u01cc\3\2\2\2\u01ce"+
		"}\3\2\2\2&\u0083\u0088\u008d\u0093\u0099\u00a3\u00ad\u00b7\u00c1\u00cb"+
		"\u00d5\u00da\u00de\u00ef\u00f2\u00fc\u010a\u010d\u0123\u0126\u0131\u013f"+
		"\u014f\u0155\u0161\u0168\u0178\u017b\u0184\u018d\u01a1\u01a5\u01ac\u01bb"+
		"\u01c0\u01cd";
	public static final ATN _ATN =
		ATNSimulator.deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}