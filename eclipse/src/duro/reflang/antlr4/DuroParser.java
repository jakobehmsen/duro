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
		BIN_OP=1, HASH=2, OPEN_BRA=3, CLOSE_BRA=4, OPEN_PAR=5, CLOSE_PAR=6, EQUALS=7, 
		INT=8, SEMICOLON=9, COMMA=10, COLON=11, KW_VAR=12, KW_PAUSE=13, KW_FUNCTION=14, 
		KW_RETURN=15, ID=16, WS=17, SINGLELINE_COMMENT=18, MULTI_LINE_COMMENT=19;
	public static final String[] tokenNames = {
		"<INVALID>", "BIN_OP", "'#'", "'{'", "'}'", "'('", "')'", "'='", "INT", 
		"';'", "','", "':'", "'var'", "'pause'", "'function'", "'return'", "ID", 
		"WS", "SINGLELINE_COMMENT", "MULTI_LINE_COMMENT"
	};
	public static final int
		RULE_program = 0, RULE_programElements = 1, RULE_topExpression = 2, RULE_expression = 3, 
		RULE_binaryExpressionCandidate = 4, RULE_binaryExpression = 5, RULE_binaryExpressionOperand = 6, 
		RULE_variableAssignment = 7, RULE_lookup = 8, RULE_thisMessageExchange = 9, 
		RULE_messageExchange = 10, RULE_literal = 11, RULE_integer = 12, RULE_statement = 13, 
		RULE_pause = 14, RULE_variableStatement = 15, RULE_variableDeclarationAndAssignment = 16, 
		RULE_variableDeclaration = 17, RULE_functionDefinition = 18, RULE_functionParameters = 19, 
		RULE_functionBody = 20, RULE_primitiveBody = 21, RULE_primitiveCall = 22, 
		RULE_primitiveOperands = 23, RULE_returnStatement = 24;
	public static final String[] ruleNames = {
		"program", "programElements", "topExpression", "expression", "binaryExpressionCandidate", 
		"binaryExpression", "binaryExpressionOperand", "variableAssignment", "lookup", 
		"thisMessageExchange", "messageExchange", "literal", "integer", "statement", 
		"pause", "variableStatement", "variableDeclarationAndAssignment", "variableDeclaration", 
		"functionDefinition", "functionParameters", "functionBody", "primitiveBody", 
		"primitiveCall", "primitiveOperands", "returnStatement"
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
			setState(50); programElements();
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
		public List<TerminalNode> SEMICOLON() { return getTokens(DuroParser.SEMICOLON); }
		public List<TopExpressionContext> topExpression() {
			return getRuleContexts(TopExpressionContext.class);
		}
		public TerminalNode SEMICOLON(int i) {
			return getToken(DuroParser.SEMICOLON, i);
		}
		public TopExpressionContext topExpression(int i) {
			return getRuleContext(TopExpressionContext.class,i);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
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
			setState(60);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << HASH) | (1L << INT) | (1L << KW_VAR) | (1L << KW_PAUSE) | (1L << KW_FUNCTION) | (1L << KW_RETURN) | (1L << ID))) != 0)) {
				{
				{
				setState(54);
				switch (_input.LA(1)) {
				case INT:
				case ID:
					{
					setState(52); topExpression();
					}
					break;
				case HASH:
				case KW_VAR:
				case KW_PAUSE:
				case KW_FUNCTION:
				case KW_RETURN:
					{
					setState(53); statement();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(56); match(SEMICOLON);
				}
				}
				setState(62);
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
		enterRule(_localctx, 4, RULE_topExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(63); expression();
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
		public BinaryExpressionCandidateContext binaryExpressionCandidate() {
			return getRuleContext(BinaryExpressionCandidateContext.class,0);
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
		enterRule(_localctx, 6, RULE_expression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(65); binaryExpressionCandidate();
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

	public static class BinaryExpressionCandidateContext extends ParserRuleContext {
		public BinaryExpressionContext binaryExpression() {
			return getRuleContext(BinaryExpressionContext.class,0);
		}
		public BinaryExpressionOperandContext binaryExpressionOperand() {
			return getRuleContext(BinaryExpressionOperandContext.class,0);
		}
		public BinaryExpressionCandidateContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_binaryExpressionCandidate; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DuroListener ) ((DuroListener)listener).enterBinaryExpressionCandidate(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DuroListener ) ((DuroListener)listener).exitBinaryExpressionCandidate(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DuroVisitor ) return ((DuroVisitor<? extends T>)visitor).visitBinaryExpressionCandidate(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BinaryExpressionCandidateContext binaryExpressionCandidate() throws RecognitionException {
		BinaryExpressionCandidateContext _localctx = new BinaryExpressionCandidateContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_binaryExpressionCandidate);
		try {
			setState(69);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(67); binaryExpression();
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(68); binaryExpressionOperand();
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

	public static class BinaryExpressionContext extends ParserRuleContext {
		public BinaryExpressionOperandContext lhs;
		public ExpressionContext rhs;
		public TerminalNode BIN_OP() { return getToken(DuroParser.BIN_OP, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public BinaryExpressionOperandContext binaryExpressionOperand() {
			return getRuleContext(BinaryExpressionOperandContext.class,0);
		}
		public BinaryExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_binaryExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DuroListener ) ((DuroListener)listener).enterBinaryExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DuroListener ) ((DuroListener)listener).exitBinaryExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DuroVisitor ) return ((DuroVisitor<? extends T>)visitor).visitBinaryExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BinaryExpressionContext binaryExpression() throws RecognitionException {
		BinaryExpressionContext _localctx = new BinaryExpressionContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_binaryExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(71); ((BinaryExpressionContext)_localctx).lhs = binaryExpressionOperand();
			setState(72); match(BIN_OP);
			setState(73); ((BinaryExpressionContext)_localctx).rhs = expression();
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

	public static class BinaryExpressionOperandContext extends ParserRuleContext {
		public VariableAssignmentContext variableAssignment() {
			return getRuleContext(VariableAssignmentContext.class,0);
		}
		public ThisMessageExchangeContext thisMessageExchange() {
			return getRuleContext(ThisMessageExchangeContext.class,0);
		}
		public LookupContext lookup() {
			return getRuleContext(LookupContext.class,0);
		}
		public LiteralContext literal() {
			return getRuleContext(LiteralContext.class,0);
		}
		public BinaryExpressionOperandContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_binaryExpressionOperand; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DuroListener ) ((DuroListener)listener).enterBinaryExpressionOperand(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DuroListener ) ((DuroListener)listener).exitBinaryExpressionOperand(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DuroVisitor ) return ((DuroVisitor<? extends T>)visitor).visitBinaryExpressionOperand(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BinaryExpressionOperandContext binaryExpressionOperand() throws RecognitionException {
		BinaryExpressionOperandContext _localctx = new BinaryExpressionOperandContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_binaryExpressionOperand);
		try {
			setState(79);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(75); variableAssignment();
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(76); lookup();
				}
				break;

			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(77); thisMessageExchange();
				}
				break;

			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(78); literal();
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

	public static class VariableAssignmentContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(DuroParser.ID, 0); }
		public TerminalNode EQUALS() { return getToken(DuroParser.EQUALS, 0); }
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
		enterRule(_localctx, 14, RULE_variableAssignment);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(81); match(ID);
			setState(82); match(EQUALS);
			setState(83); expression();
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
		enterRule(_localctx, 16, RULE_lookup);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(85); match(ID);
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
		enterRule(_localctx, 18, RULE_thisMessageExchange);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(87); messageExchange();
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
		enterRule(_localctx, 20, RULE_messageExchange);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(89); match(ID);
			setState(90); match(OPEN_PAR);
			setState(91); expression();
			setState(96);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(92); match(COMMA);
				setState(93); expression();
				}
				}
				setState(98);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(99); match(CLOSE_PAR);
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
		enterRule(_localctx, 22, RULE_literal);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(101); integer();
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
		enterRule(_localctx, 24, RULE_integer);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(103); match(INT);
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

	public static class StatementContext extends ParserRuleContext {
		public VariableStatementContext variableStatement() {
			return getRuleContext(VariableStatementContext.class,0);
		}
		public PrimitiveBodyContext primitiveBody() {
			return getRuleContext(PrimitiveBodyContext.class,0);
		}
		public PauseContext pause() {
			return getRuleContext(PauseContext.class,0);
		}
		public FunctionDefinitionContext functionDefinition() {
			return getRuleContext(FunctionDefinitionContext.class,0);
		}
		public ReturnStatementContext returnStatement() {
			return getRuleContext(ReturnStatementContext.class,0);
		}
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DuroListener ) ((DuroListener)listener).enterStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DuroListener ) ((DuroListener)listener).exitStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DuroVisitor ) return ((DuroVisitor<? extends T>)visitor).visitStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_statement);
		try {
			setState(110);
			switch (_input.LA(1)) {
			case KW_PAUSE:
				enterOuterAlt(_localctx, 1);
				{
				setState(105); pause();
				}
				break;
			case KW_VAR:
				enterOuterAlt(_localctx, 2);
				{
				setState(106); variableStatement();
				}
				break;
			case KW_FUNCTION:
				enterOuterAlt(_localctx, 3);
				{
				setState(107); functionDefinition();
				}
				break;
			case HASH:
				enterOuterAlt(_localctx, 4);
				{
				setState(108); primitiveBody();
				}
				break;
			case KW_RETURN:
				enterOuterAlt(_localctx, 5);
				{
				setState(109); returnStatement();
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
		enterRule(_localctx, 28, RULE_pause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(112); match(KW_PAUSE);
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
		enterRule(_localctx, 30, RULE_variableStatement);
		try {
			setState(116);
			switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(114); variableDeclarationAndAssignment();
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(115); variableDeclaration();
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
		public TerminalNode EQUALS() { return getToken(DuroParser.EQUALS, 0); }
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
		enterRule(_localctx, 32, RULE_variableDeclarationAndAssignment);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(118); match(KW_VAR);
			setState(119); match(ID);
			setState(120); match(EQUALS);
			setState(121); expression();
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
		enterRule(_localctx, 34, RULE_variableDeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(123); match(KW_VAR);
			setState(124); match(ID);
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
		enterRule(_localctx, 36, RULE_functionDefinition);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(126); match(KW_FUNCTION);
			setState(127); match(ID);
			setState(128); match(OPEN_PAR);
			setState(129); functionParameters();
			setState(130); match(CLOSE_PAR);
			setState(131); match(OPEN_BRA);
			setState(132); functionBody();
			setState(133); match(CLOSE_BRA);
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
		enterRule(_localctx, 38, RULE_functionParameters);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(143);
			_la = _input.LA(1);
			if (_la==ID) {
				{
				setState(135); match(ID);
				setState(140);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(136); match(COMMA);
					setState(137); match(ID);
					}
					}
					setState(142);
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
		enterRule(_localctx, 40, RULE_functionBody);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(145); programElements();
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
		public PrimitiveCallContext primitiveCall() {
			return getRuleContext(PrimitiveCallContext.class,0);
		}
		public TerminalNode CLOSE_BRA() { return getToken(DuroParser.CLOSE_BRA, 0); }
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
		enterRule(_localctx, 42, RULE_primitiveBody);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(147); match(HASH);
			setState(148); match(OPEN_BRA);
			setState(149); primitiveCall();
			setState(150); match(CLOSE_BRA);
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
		public PrimitiveOperandsContext primitiveOperands() {
			return getRuleContext(PrimitiveOperandsContext.class,0);
		}
		public TerminalNode ID() { return getToken(DuroParser.ID, 0); }
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
		enterRule(_localctx, 44, RULE_primitiveCall);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(152); match(ID);
			setState(153); primitiveOperands();
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

	public static class PrimitiveOperandsContext extends ParserRuleContext {
		public LiteralContext literal(int i) {
			return getRuleContext(LiteralContext.class,i);
		}
		public TerminalNode COLON(int i) {
			return getToken(DuroParser.COLON, i);
		}
		public List<TerminalNode> COLON() { return getTokens(DuroParser.COLON); }
		public List<LiteralContext> literal() {
			return getRuleContexts(LiteralContext.class);
		}
		public PrimitiveOperandsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_primitiveOperands; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DuroListener ) ((DuroListener)listener).enterPrimitiveOperands(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DuroListener ) ((DuroListener)listener).exitPrimitiveOperands(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DuroVisitor ) return ((DuroVisitor<? extends T>)visitor).visitPrimitiveOperands(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PrimitiveOperandsContext primitiveOperands() throws RecognitionException {
		PrimitiveOperandsContext _localctx = new PrimitiveOperandsContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_primitiveOperands);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(159);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COLON) {
				{
				{
				setState(155); match(COLON);
				setState(156); literal();
				}
				}
				setState(161);
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
		enterRule(_localctx, 48, RULE_returnStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(162); match(KW_RETURN);
			setState(164);
			_la = _input.LA(1);
			if (_la==INT || _la==ID) {
				{
				setState(163); expression();
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

	public static final String _serializedATN =
		"\3\uacf5\uee8c\u4f5d\u8b0d\u4a45\u78bd\u1b2f\u3378\3\25\u00a9\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\3\2\3\2\3\3\3\3\5\39\n\3\3\3\3\3\7\3=\n\3\f\3\16\3@\13\3\3"+
		"\4\3\4\3\5\3\5\3\6\3\6\5\6H\n\6\3\7\3\7\3\7\3\7\3\b\3\b\3\b\3\b\5\bR\n"+
		"\b\3\t\3\t\3\t\3\t\3\n\3\n\3\13\3\13\3\f\3\f\3\f\3\f\3\f\7\fa\n\f\f\f"+
		"\16\fd\13\f\3\f\3\f\3\r\3\r\3\16\3\16\3\17\3\17\3\17\3\17\3\17\5\17q\n"+
		"\17\3\20\3\20\3\21\3\21\5\21w\n\21\3\22\3\22\3\22\3\22\3\22\3\23\3\23"+
		"\3\23\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\25\3\25\3\25\7\25"+
		"\u008d\n\25\f\25\16\25\u0090\13\25\5\25\u0092\n\25\3\26\3\26\3\27\3\27"+
		"\3\27\3\27\3\27\3\30\3\30\3\30\3\31\3\31\7\31\u00a0\n\31\f\31\16\31\u00a3"+
		"\13\31\3\32\3\32\5\32\u00a7\n\32\3\32\2\33\2\4\6\b\n\f\16\20\22\24\26"+
		"\30\32\34\36 \"$&(*,.\60\62\2\2\u009f\2\64\3\2\2\2\4>\3\2\2\2\6A\3\2\2"+
		"\2\bC\3\2\2\2\nG\3\2\2\2\fI\3\2\2\2\16Q\3\2\2\2\20S\3\2\2\2\22W\3\2\2"+
		"\2\24Y\3\2\2\2\26[\3\2\2\2\30g\3\2\2\2\32i\3\2\2\2\34p\3\2\2\2\36r\3\2"+
		"\2\2 v\3\2\2\2\"x\3\2\2\2$}\3\2\2\2&\u0080\3\2\2\2(\u0091\3\2\2\2*\u0093"+
		"\3\2\2\2,\u0095\3\2\2\2.\u009a\3\2\2\2\60\u00a1\3\2\2\2\62\u00a4\3\2\2"+
		"\2\64\65\5\4\3\2\65\3\3\2\2\2\669\5\6\4\2\679\5\34\17\28\66\3\2\2\28\67"+
		"\3\2\2\29:\3\2\2\2:;\7\13\2\2;=\3\2\2\2<8\3\2\2\2=@\3\2\2\2><\3\2\2\2"+
		">?\3\2\2\2?\5\3\2\2\2@>\3\2\2\2AB\5\b\5\2B\7\3\2\2\2CD\5\n\6\2D\t\3\2"+
		"\2\2EH\5\f\7\2FH\5\16\b\2GE\3\2\2\2GF\3\2\2\2H\13\3\2\2\2IJ\5\16\b\2J"+
		"K\7\3\2\2KL\5\b\5\2L\r\3\2\2\2MR\5\20\t\2NR\5\22\n\2OR\5\24\13\2PR\5\30"+
		"\r\2QM\3\2\2\2QN\3\2\2\2QO\3\2\2\2QP\3\2\2\2R\17\3\2\2\2ST\7\22\2\2TU"+
		"\7\t\2\2UV\5\b\5\2V\21\3\2\2\2WX\7\22\2\2X\23\3\2\2\2YZ\5\26\f\2Z\25\3"+
		"\2\2\2[\\\7\22\2\2\\]\7\7\2\2]b\5\b\5\2^_\7\f\2\2_a\5\b\5\2`^\3\2\2\2"+
		"ad\3\2\2\2b`\3\2\2\2bc\3\2\2\2ce\3\2\2\2db\3\2\2\2ef\7\b\2\2f\27\3\2\2"+
		"\2gh\5\32\16\2h\31\3\2\2\2ij\7\n\2\2j\33\3\2\2\2kq\5\36\20\2lq\5 \21\2"+
		"mq\5&\24\2nq\5,\27\2oq\5\62\32\2pk\3\2\2\2pl\3\2\2\2pm\3\2\2\2pn\3\2\2"+
		"\2po\3\2\2\2q\35\3\2\2\2rs\7\17\2\2s\37\3\2\2\2tw\5\"\22\2uw\5$\23\2v"+
		"t\3\2\2\2vu\3\2\2\2w!\3\2\2\2xy\7\16\2\2yz\7\22\2\2z{\7\t\2\2{|\5\b\5"+
		"\2|#\3\2\2\2}~\7\16\2\2~\177\7\22\2\2\177%\3\2\2\2\u0080\u0081\7\20\2"+
		"\2\u0081\u0082\7\22\2\2\u0082\u0083\7\7\2\2\u0083\u0084\5(\25\2\u0084"+
		"\u0085\7\b\2\2\u0085\u0086\7\5\2\2\u0086\u0087\5*\26\2\u0087\u0088\7\6"+
		"\2\2\u0088\'\3\2\2\2\u0089\u008e\7\22\2\2\u008a\u008b\7\f\2\2\u008b\u008d"+
		"\7\22\2\2\u008c\u008a\3\2\2\2\u008d\u0090\3\2\2\2\u008e\u008c\3\2\2\2"+
		"\u008e\u008f\3\2\2\2\u008f\u0092\3\2\2\2\u0090\u008e\3\2\2\2\u0091\u0089"+
		"\3\2\2\2\u0091\u0092\3\2\2\2\u0092)\3\2\2\2\u0093\u0094\5\4\3\2\u0094"+
		"+\3\2\2\2\u0095\u0096\7\4\2\2\u0096\u0097\7\5\2\2\u0097\u0098\5.\30\2"+
		"\u0098\u0099\7\6\2\2\u0099-\3\2\2\2\u009a\u009b\7\22\2\2\u009b\u009c\5"+
		"\60\31\2\u009c/\3\2\2\2\u009d\u009e\7\r\2\2\u009e\u00a0\5\30\r\2\u009f"+
		"\u009d\3\2\2\2\u00a0\u00a3\3\2\2\2\u00a1\u009f\3\2\2\2\u00a1\u00a2\3\2"+
		"\2\2\u00a2\61\3\2\2\2\u00a3\u00a1\3\2\2\2\u00a4\u00a6\7\21\2\2\u00a5\u00a7"+
		"\5\b\5\2\u00a6\u00a5\3\2\2\2\u00a6\u00a7\3\2\2\2\u00a7\63\3\2\2\2\r8>"+
		"GQbpv\u008e\u0091\u00a1\u00a6";
	public static final ATN _ATN =
		ATNSimulator.deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}