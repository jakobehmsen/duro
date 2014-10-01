// Generated from C:\github\duro\eclipse\src\duro\reflang\antlr4_2\Duro.g4 by ANTLR 4.1
package duro.reflang.antlr4_2;
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
		RETURN=1, VAR=2, PSEUDO_VAR=3, INT=4, ID_CAP=5, ID_UNCAP=6, PARAGRAPH=7, 
		PIPE=8, HASH=9, DOT=10, COMMA=11, COLON=12, PAR_OP=13, PAR_CL=14, SQ_OP=15, 
		SQ_CL=16, BRA_OP=17, BAR_CL=18, BIN_OP=19, ASSIGN=20, ASSIGN_PROTO=21, 
		ASSIGN_QUOTED=22, WS=23, SINGLELINE_COMMENT=24, MULTI_LINE_COMMENT=25;
	public static final String[] tokenNames = {
		"<INVALID>", "'return'", "'var'", "PSEUDO_VAR", "INT", "ID_CAP", "ID_UNCAP", 
		"'§'", "'|'", "'#'", "'.'", "','", "':'", "'('", "')'", "'['", "']'", 
		"'{'", "'}'", "BIN_OP", "'='", "'^='", "'=>'", "WS", "SINGLELINE_COMMENT", 
		"MULTI_LINE_COMMENT"
	};
	public static final int
		RULE_program = 0, RULE_rootExpression = 1, RULE_topExpressions = 2, RULE_topExpression = 3, 
		RULE_expression = 4, RULE_variableAssignment = 5, RULE_messageExchange = 6, 
		RULE_variableDeclaration = 7, RULE_returnExpr = 8, RULE_atom = 9, RULE_selfMessageExchange = 10, 
		RULE_access = 11, RULE_grouping = 12, RULE_message = 13, RULE_nonBinaryMessage = 14, 
		RULE_multiArgMessage = 15, RULE_multiArgMessageArgs = 16, RULE_multiArgMessageArg = 17, 
		RULE_slotAccess = 18, RULE_indexAccess = 19, RULE_binaryMessage = 20, 
		RULE_binaryMessageOperand = 21, RULE_indexAssign = 22, RULE_slotAssignment = 23, 
		RULE_literal = 24, RULE_integer = 25, RULE_dict = 26, RULE_dictEntry = 27, 
		RULE_closure = 28, RULE_behaviorParams = 29, RULE_pseudoVar = 30, RULE_parArg = 31, 
		RULE_id = 32, RULE_selector = 33, RULE_binaryOperator = 34, RULE_indexOperator = 35;
	public static final String[] ruleNames = {
		"program", "rootExpression", "topExpressions", "topExpression", "expression", 
		"variableAssignment", "messageExchange", "variableDeclaration", "returnExpr", 
		"atom", "selfMessageExchange", "access", "grouping", "message", "nonBinaryMessage", 
		"multiArgMessage", "multiArgMessageArgs", "multiArgMessageArg", "slotAccess", 
		"indexAccess", "binaryMessage", "binaryMessageOperand", "indexAssign", 
		"slotAssignment", "literal", "integer", "dict", "dictEntry", "closure", 
		"behaviorParams", "pseudoVar", "parArg", "id", "selector", "binaryOperator", 
		"indexOperator"
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
		public RootExpressionContext rootExpression(int i) {
			return getRuleContext(RootExpressionContext.class,i);
		}
		public List<RootExpressionContext> rootExpression() {
			return getRuleContexts(RootExpressionContext.class);
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
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(75);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << RETURN) | (1L << VAR) | (1L << PSEUDO_VAR) | (1L << INT) | (1L << ID_CAP) | (1L << ID_UNCAP) | (1L << HASH) | (1L << COLON) | (1L << PAR_OP) | (1L << BRA_OP))) != 0)) {
				{
				{
				setState(72); rootExpression();
				}
				}
				setState(77);
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

	public static class RootExpressionContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public RootExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_rootExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DuroListener ) ((DuroListener)listener).enterRootExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DuroListener ) ((DuroListener)listener).exitRootExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DuroVisitor ) return ((DuroVisitor<? extends T>)visitor).visitRootExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RootExpressionContext rootExpression() throws RecognitionException {
		RootExpressionContext _localctx = new RootExpressionContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_rootExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(78); expression();
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

	public static class TopExpressionsContext extends ParserRuleContext {
		public List<TopExpressionContext> topExpression() {
			return getRuleContexts(TopExpressionContext.class);
		}
		public TopExpressionContext topExpression(int i) {
			return getRuleContext(TopExpressionContext.class,i);
		}
		public TopExpressionsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_topExpressions; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DuroListener ) ((DuroListener)listener).enterTopExpressions(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DuroListener ) ((DuroListener)listener).exitTopExpressions(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DuroVisitor ) return ((DuroVisitor<? extends T>)visitor).visitTopExpressions(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TopExpressionsContext topExpressions() throws RecognitionException {
		TopExpressionsContext _localctx = new TopExpressionsContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_topExpressions);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(83);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << RETURN) | (1L << VAR) | (1L << PSEUDO_VAR) | (1L << INT) | (1L << ID_CAP) | (1L << ID_UNCAP) | (1L << HASH) | (1L << COLON) | (1L << PAR_OP) | (1L << BRA_OP))) != 0)) {
				{
				{
				setState(80); topExpression();
				}
				}
				setState(85);
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
		enterRule(_localctx, 6, RULE_topExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(86); expression();
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
		public VariableDeclarationContext variableDeclaration() {
			return getRuleContext(VariableDeclarationContext.class,0);
		}
		public VariableAssignmentContext variableAssignment() {
			return getRuleContext(VariableAssignmentContext.class,0);
		}
		public ReturnExprContext returnExpr() {
			return getRuleContext(ReturnExprContext.class,0);
		}
		public MessageExchangeContext messageExchange() {
			return getRuleContext(MessageExchangeContext.class,0);
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
			setState(92);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(88); variableAssignment();
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(89); variableDeclaration();
				}
				break;

			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(90); returnExpr();
				}
				break;

			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(91); messageExchange();
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
		public Token op;
		public BehaviorParamsContext behaviorParams() {
			return getRuleContext(BehaviorParamsContext.class,0);
		}
		public TerminalNode ASSIGN() { return getToken(DuroParser.ASSIGN, 0); }
		public TerminalNode ASSIGN_QUOTED() { return getToken(DuroParser.ASSIGN_QUOTED, 0); }
		public IdContext id() {
			return getRuleContext(IdContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode ASSIGN_PROTO() { return getToken(DuroParser.ASSIGN_PROTO, 0); }
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
		enterRule(_localctx, 10, RULE_variableAssignment);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(94); id();
			setState(101);
			switch (_input.LA(1)) {
			case ASSIGN:
			case ASSIGN_PROTO:
				{
				{
				setState(95);
				((VariableAssignmentContext)_localctx).op = _input.LT(1);
				_la = _input.LA(1);
				if ( !(_la==ASSIGN || _la==ASSIGN_PROTO) ) {
					((VariableAssignmentContext)_localctx).op = (Token)_errHandler.recoverInline(this);
				}
				consume();
				setState(96); expression();
				}
				}
				break;
			case ASSIGN_QUOTED:
				{
				setState(97); ((VariableAssignmentContext)_localctx).op = match(ASSIGN_QUOTED);
				setState(98); behaviorParams();
				setState(99); expression();
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

	public static class MessageExchangeContext extends ParserRuleContext {
		public List<MessageContext> message() {
			return getRuleContexts(MessageContext.class);
		}
		public MessageContext message(int i) {
			return getRuleContext(MessageContext.class,i);
		}
		public AtomContext atom() {
			return getRuleContext(AtomContext.class,0);
		}
		public SlotAssignmentContext slotAssignment() {
			return getRuleContext(SlotAssignmentContext.class,0);
		}
		public IndexAssignContext indexAssign() {
			return getRuleContext(IndexAssignContext.class,0);
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
		enterRule(_localctx, 12, RULE_messageExchange);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(103); atom();
			setState(107);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,4,_ctx);
			while ( _alt!=2 && _alt!=-1 ) {
				if ( _alt==1 ) {
					{
					{
					setState(104); message();
					}
					} 
				}
				setState(109);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,4,_ctx);
			}
			setState(112);
			switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
			case 1:
				{
				setState(110); indexAssign();
				}
				break;

			case 2:
				{
				setState(111); slotAssignment();
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

	public static class VariableDeclarationContext extends ParserRuleContext {
		public TerminalNode ASSIGN() { return getToken(DuroParser.ASSIGN, 0); }
		public TerminalNode VAR() { return getToken(DuroParser.VAR, 0); }
		public IdContext id() {
			return getRuleContext(IdContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
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
		enterRule(_localctx, 14, RULE_variableDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(114); match(VAR);
			setState(115); id();
			setState(118);
			_la = _input.LA(1);
			if (_la==ASSIGN) {
				{
				setState(116); match(ASSIGN);
				setState(117); expression();
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

	public static class ReturnExprContext extends ParserRuleContext {
		public TerminalNode RETURN() { return getToken(DuroParser.RETURN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ReturnExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_returnExpr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DuroListener ) ((DuroListener)listener).enterReturnExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DuroListener ) ((DuroListener)listener).exitReturnExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DuroVisitor ) return ((DuroVisitor<? extends T>)visitor).visitReturnExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ReturnExprContext returnExpr() throws RecognitionException {
		ReturnExprContext _localctx = new ReturnExprContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_returnExpr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(120); match(RETURN);
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

	public static class AtomContext extends ParserRuleContext {
		public GroupingContext grouping() {
			return getRuleContext(GroupingContext.class,0);
		}
		public ParArgContext parArg() {
			return getRuleContext(ParArgContext.class,0);
		}
		public LiteralContext literal() {
			return getRuleContext(LiteralContext.class,0);
		}
		public AccessContext access() {
			return getRuleContext(AccessContext.class,0);
		}
		public SelfMessageExchangeContext selfMessageExchange() {
			return getRuleContext(SelfMessageExchangeContext.class,0);
		}
		public AtomContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_atom; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DuroListener ) ((DuroListener)listener).enterAtom(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DuroListener ) ((DuroListener)listener).exitAtom(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DuroVisitor ) return ((DuroVisitor<? extends T>)visitor).visitAtom(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AtomContext atom() throws RecognitionException {
		AtomContext _localctx = new AtomContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_atom);
		try {
			setState(128);
			switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(123); selfMessageExchange();
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(124); access();
				}
				break;

			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(125); grouping();
				}
				break;

			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(126); literal();
				}
				break;

			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(127); parArg();
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

	public static class SelfMessageExchangeContext extends ParserRuleContext {
		public MultiArgMessageContext multiArgMessage() {
			return getRuleContext(MultiArgMessageContext.class,0);
		}
		public SelfMessageExchangeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_selfMessageExchange; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DuroListener ) ((DuroListener)listener).enterSelfMessageExchange(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DuroListener ) ((DuroListener)listener).exitSelfMessageExchange(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DuroVisitor ) return ((DuroVisitor<? extends T>)visitor).visitSelfMessageExchange(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SelfMessageExchangeContext selfMessageExchange() throws RecognitionException {
		SelfMessageExchangeContext _localctx = new SelfMessageExchangeContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_selfMessageExchange);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(130); multiArgMessage();
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

	public static class AccessContext extends ParserRuleContext {
		public IdContext id() {
			return getRuleContext(IdContext.class,0);
		}
		public AccessContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_access; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DuroListener ) ((DuroListener)listener).enterAccess(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DuroListener ) ((DuroListener)listener).exitAccess(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DuroVisitor ) return ((DuroVisitor<? extends T>)visitor).visitAccess(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AccessContext access() throws RecognitionException {
		AccessContext _localctx = new AccessContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_access);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(132); id();
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
		public TerminalNode PAR_OP() { return getToken(DuroParser.PAR_OP, 0); }
		public TerminalNode PAR_CL() { return getToken(DuroParser.PAR_CL, 0); }
		public TopExpressionsContext topExpressions() {
			return getRuleContext(TopExpressionsContext.class,0);
		}
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
		enterRule(_localctx, 24, RULE_grouping);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(134); match(PAR_OP);
			setState(135); topExpressions();
			setState(136); match(PAR_CL);
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

	public static class MessageContext extends ParserRuleContext {
		public NonBinaryMessageContext nonBinaryMessage() {
			return getRuleContext(NonBinaryMessageContext.class,0);
		}
		public BinaryMessageContext binaryMessage() {
			return getRuleContext(BinaryMessageContext.class,0);
		}
		public MessageContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_message; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DuroListener ) ((DuroListener)listener).enterMessage(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DuroListener ) ((DuroListener)listener).exitMessage(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DuroVisitor ) return ((DuroVisitor<? extends T>)visitor).visitMessage(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MessageContext message() throws RecognitionException {
		MessageContext _localctx = new MessageContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_message);
		try {
			setState(140);
			switch (_input.LA(1)) {
			case DOT:
			case SQ_OP:
				enterOuterAlt(_localctx, 1);
				{
				setState(138); nonBinaryMessage();
				}
				break;
			case BIN_OP:
				enterOuterAlt(_localctx, 2);
				{
				setState(139); binaryMessage();
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

	public static class NonBinaryMessageContext extends ParserRuleContext {
		public SlotAccessContext slotAccess() {
			return getRuleContext(SlotAccessContext.class,0);
		}
		public TerminalNode DOT() { return getToken(DuroParser.DOT, 0); }
		public MultiArgMessageContext multiArgMessage() {
			return getRuleContext(MultiArgMessageContext.class,0);
		}
		public IndexAccessContext indexAccess() {
			return getRuleContext(IndexAccessContext.class,0);
		}
		public NonBinaryMessageContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_nonBinaryMessage; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DuroListener ) ((DuroListener)listener).enterNonBinaryMessage(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DuroListener ) ((DuroListener)listener).exitNonBinaryMessage(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DuroVisitor ) return ((DuroVisitor<? extends T>)visitor).visitNonBinaryMessage(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NonBinaryMessageContext nonBinaryMessage() throws RecognitionException {
		NonBinaryMessageContext _localctx = new NonBinaryMessageContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_nonBinaryMessage);
		try {
			setState(146);
			switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(142); match(DOT);
				setState(143); multiArgMessage();
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(144); slotAccess();
				}
				break;

			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(145); indexAccess();
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

	public static class MultiArgMessageContext extends ParserRuleContext {
		public List<TerminalNode> ID_CAP() { return getTokens(DuroParser.ID_CAP); }
		public List<MultiArgMessageArgsContext> multiArgMessageArgs() {
			return getRuleContexts(MultiArgMessageArgsContext.class);
		}
		public MultiArgMessageArgsContext multiArgMessageArgs(int i) {
			return getRuleContext(MultiArgMessageArgsContext.class,i);
		}
		public TerminalNode ID_UNCAP() { return getToken(DuroParser.ID_UNCAP, 0); }
		public TerminalNode ID_CAP(int i) {
			return getToken(DuroParser.ID_CAP, i);
		}
		public MultiArgMessageContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_multiArgMessage; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DuroListener ) ((DuroListener)listener).enterMultiArgMessage(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DuroListener ) ((DuroListener)listener).exitMultiArgMessage(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DuroVisitor ) return ((DuroVisitor<? extends T>)visitor).visitMultiArgMessage(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MultiArgMessageContext multiArgMessage() throws RecognitionException {
		MultiArgMessageContext _localctx = new MultiArgMessageContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_multiArgMessage);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(148); match(ID_UNCAP);
			setState(149); multiArgMessageArgs();
			setState(154);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,10,_ctx);
			while ( _alt!=2 && _alt!=-1 ) {
				if ( _alt==1 ) {
					{
					{
					setState(150); match(ID_CAP);
					setState(151); multiArgMessageArgs();
					}
					} 
				}
				setState(156);
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

	public static class MultiArgMessageArgsContext extends ParserRuleContext {
		public MultiArgMessageArgContext multiArgMessageArg(int i) {
			return getRuleContext(MultiArgMessageArgContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(DuroParser.COMMA); }
		public List<MultiArgMessageArgContext> multiArgMessageArg() {
			return getRuleContexts(MultiArgMessageArgContext.class);
		}
		public TerminalNode COMMA(int i) {
			return getToken(DuroParser.COMMA, i);
		}
		public MultiArgMessageArgsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_multiArgMessageArgs; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DuroListener ) ((DuroListener)listener).enterMultiArgMessageArgs(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DuroListener ) ((DuroListener)listener).exitMultiArgMessageArgs(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DuroVisitor ) return ((DuroVisitor<? extends T>)visitor).visitMultiArgMessageArgs(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MultiArgMessageArgsContext multiArgMessageArgs() throws RecognitionException {
		MultiArgMessageArgsContext _localctx = new MultiArgMessageArgsContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_multiArgMessageArgs);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(157); multiArgMessageArg();
			setState(162);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,11,_ctx);
			while ( _alt!=2 && _alt!=-1 ) {
				if ( _alt==1 ) {
					{
					{
					setState(158); match(COMMA);
					setState(159); multiArgMessageArg();
					}
					} 
				}
				setState(164);
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

	public static class MultiArgMessageArgContext extends ParserRuleContext {
		public List<TerminalNode> COMMA() { return getTokens(DuroParser.COMMA); }
		public LiteralContext literal() {
			return getRuleContext(LiteralContext.class,0);
		}
		public TerminalNode PAR_OP() { return getToken(DuroParser.PAR_OP, 0); }
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public TerminalNode PAR_CL() { return getToken(DuroParser.PAR_CL, 0); }
		public TerminalNode COMMA(int i) {
			return getToken(DuroParser.COMMA, i);
		}
		public MultiArgMessageArgContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_multiArgMessageArg; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DuroListener ) ((DuroListener)listener).enterMultiArgMessageArg(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DuroListener ) ((DuroListener)listener).exitMultiArgMessageArg(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DuroVisitor ) return ((DuroVisitor<? extends T>)visitor).visitMultiArgMessageArg(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MultiArgMessageArgContext multiArgMessageArg() throws RecognitionException {
		MultiArgMessageArgContext _localctx = new MultiArgMessageArgContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_multiArgMessageArg);
		int _la;
		try {
			setState(178);
			switch (_input.LA(1)) {
			case PAR_OP:
				enterOuterAlt(_localctx, 1);
				{
				setState(165); match(PAR_OP);
				setState(174);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << RETURN) | (1L << VAR) | (1L << PSEUDO_VAR) | (1L << INT) | (1L << ID_CAP) | (1L << ID_UNCAP) | (1L << HASH) | (1L << COLON) | (1L << PAR_OP) | (1L << BRA_OP))) != 0)) {
					{
					setState(166); expression();
					setState(171);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==COMMA) {
						{
						{
						setState(167); match(COMMA);
						setState(168); expression();
						}
						}
						setState(173);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
				}

				setState(176); match(PAR_CL);
				}
				break;
			case PSEUDO_VAR:
			case INT:
			case HASH:
			case BRA_OP:
				enterOuterAlt(_localctx, 2);
				{
				setState(177); literal();
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

	public static class SlotAccessContext extends ParserRuleContext {
		public TerminalNode DOT() { return getToken(DuroParser.DOT, 0); }
		public SelectorContext selector() {
			return getRuleContext(SelectorContext.class,0);
		}
		public SlotAccessContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_slotAccess; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DuroListener ) ((DuroListener)listener).enterSlotAccess(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DuroListener ) ((DuroListener)listener).exitSlotAccess(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DuroVisitor ) return ((DuroVisitor<? extends T>)visitor).visitSlotAccess(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SlotAccessContext slotAccess() throws RecognitionException {
		SlotAccessContext _localctx = new SlotAccessContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_slotAccess);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(180); match(DOT);
			setState(181); selector();
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
		public TerminalNode SQ_OP() { return getToken(DuroParser.SQ_OP, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode SQ_CL() { return getToken(DuroParser.SQ_CL, 0); }
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
		enterRule(_localctx, 38, RULE_indexAccess);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(183); match(SQ_OP);
			setState(184); expression();
			setState(185); match(SQ_CL);
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

	public static class BinaryMessageContext extends ParserRuleContext {
		public BinaryMessageOperandContext binaryMessageOperand() {
			return getRuleContext(BinaryMessageOperandContext.class,0);
		}
		public TerminalNode BIN_OP() { return getToken(DuroParser.BIN_OP, 0); }
		public BinaryMessageContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_binaryMessage; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DuroListener ) ((DuroListener)listener).enterBinaryMessage(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DuroListener ) ((DuroListener)listener).exitBinaryMessage(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DuroVisitor ) return ((DuroVisitor<? extends T>)visitor).visitBinaryMessage(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BinaryMessageContext binaryMessage() throws RecognitionException {
		BinaryMessageContext _localctx = new BinaryMessageContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_binaryMessage);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(187); match(BIN_OP);
			setState(188); binaryMessageOperand();
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

	public static class BinaryMessageOperandContext extends ParserRuleContext {
		public NonBinaryMessageContext nonBinaryMessage(int i) {
			return getRuleContext(NonBinaryMessageContext.class,i);
		}
		public List<NonBinaryMessageContext> nonBinaryMessage() {
			return getRuleContexts(NonBinaryMessageContext.class);
		}
		public AtomContext atom() {
			return getRuleContext(AtomContext.class,0);
		}
		public IndexAssignContext indexAssign() {
			return getRuleContext(IndexAssignContext.class,0);
		}
		public BinaryMessageOperandContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_binaryMessageOperand; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DuroListener ) ((DuroListener)listener).enterBinaryMessageOperand(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DuroListener ) ((DuroListener)listener).exitBinaryMessageOperand(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DuroVisitor ) return ((DuroVisitor<? extends T>)visitor).visitBinaryMessageOperand(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BinaryMessageOperandContext binaryMessageOperand() throws RecognitionException {
		BinaryMessageOperandContext _localctx = new BinaryMessageOperandContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_binaryMessageOperand);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(190); atom();
			setState(194);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,15,_ctx);
			while ( _alt!=2 && _alt!=-1 ) {
				if ( _alt==1 ) {
					{
					{
					setState(191); nonBinaryMessage();
					}
					} 
				}
				setState(196);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,15,_ctx);
			}
			setState(198);
			switch ( getInterpreter().adaptivePredict(_input,16,_ctx) ) {
			case 1:
				{
				setState(197); indexAssign();
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

	public static class IndexAssignContext extends ParserRuleContext {
		public TerminalNode ASSIGN() { return getToken(DuroParser.ASSIGN, 0); }
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode SQ_OP() { return getToken(DuroParser.SQ_OP, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public TerminalNode SQ_CL() { return getToken(DuroParser.SQ_CL, 0); }
		public IndexAssignContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_indexAssign; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DuroListener ) ((DuroListener)listener).enterIndexAssign(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DuroListener ) ((DuroListener)listener).exitIndexAssign(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DuroVisitor ) return ((DuroVisitor<? extends T>)visitor).visitIndexAssign(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IndexAssignContext indexAssign() throws RecognitionException {
		IndexAssignContext _localctx = new IndexAssignContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_indexAssign);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(200); match(SQ_OP);
			setState(201); expression();
			setState(202); match(SQ_CL);
			setState(203); match(ASSIGN);
			setState(204); expression();
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

	public static class SlotAssignmentContext extends ParserRuleContext {
		public Token op;
		public TerminalNode DOT() { return getToken(DuroParser.DOT, 0); }
		public BehaviorParamsContext behaviorParams() {
			return getRuleContext(BehaviorParamsContext.class,0);
		}
		public TerminalNode ASSIGN() { return getToken(DuroParser.ASSIGN, 0); }
		public TerminalNode ASSIGN_QUOTED() { return getToken(DuroParser.ASSIGN_QUOTED, 0); }
		public IdContext id() {
			return getRuleContext(IdContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode ASSIGN_PROTO() { return getToken(DuroParser.ASSIGN_PROTO, 0); }
		public SlotAssignmentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_slotAssignment; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DuroListener ) ((DuroListener)listener).enterSlotAssignment(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DuroListener ) ((DuroListener)listener).exitSlotAssignment(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DuroVisitor ) return ((DuroVisitor<? extends T>)visitor).visitSlotAssignment(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SlotAssignmentContext slotAssignment() throws RecognitionException {
		SlotAssignmentContext _localctx = new SlotAssignmentContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_slotAssignment);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(206); match(DOT);
			setState(207); id();
			setState(214);
			switch (_input.LA(1)) {
			case ASSIGN:
			case ASSIGN_PROTO:
				{
				{
				setState(208);
				((SlotAssignmentContext)_localctx).op = _input.LT(1);
				_la = _input.LA(1);
				if ( !(_la==ASSIGN || _la==ASSIGN_PROTO) ) {
					((SlotAssignmentContext)_localctx).op = (Token)_errHandler.recoverInline(this);
				}
				consume();
				setState(209); expression();
				}
				}
				break;
			case ASSIGN_QUOTED:
				{
				setState(210); ((SlotAssignmentContext)_localctx).op = match(ASSIGN_QUOTED);
				setState(211); behaviorParams();
				setState(212); expression();
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

	public static class LiteralContext extends ParserRuleContext {
		public ClosureContext closure() {
			return getRuleContext(ClosureContext.class,0);
		}
		public IntegerContext integer() {
			return getRuleContext(IntegerContext.class,0);
		}
		public PseudoVarContext pseudoVar() {
			return getRuleContext(PseudoVarContext.class,0);
		}
		public DictContext dict() {
			return getRuleContext(DictContext.class,0);
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
		enterRule(_localctx, 48, RULE_literal);
		try {
			setState(220);
			switch (_input.LA(1)) {
			case INT:
				enterOuterAlt(_localctx, 1);
				{
				setState(216); integer();
				}
				break;
			case HASH:
				enterOuterAlt(_localctx, 2);
				{
				setState(217); dict();
				}
				break;
			case BRA_OP:
				enterOuterAlt(_localctx, 3);
				{
				setState(218); closure();
				}
				break;
			case PSEUDO_VAR:
				enterOuterAlt(_localctx, 4);
				{
				setState(219); pseudoVar();
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
		enterRule(_localctx, 50, RULE_integer);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(222); match(INT);
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

	public static class DictContext extends ParserRuleContext {
		public DictEntryContext dictEntry(int i) {
			return getRuleContext(DictEntryContext.class,i);
		}
		public TerminalNode SQ_OP() { return getToken(DuroParser.SQ_OP, 0); }
		public TerminalNode SQ_CL() { return getToken(DuroParser.SQ_CL, 0); }
		public TerminalNode HASH() { return getToken(DuroParser.HASH, 0); }
		public List<DictEntryContext> dictEntry() {
			return getRuleContexts(DictEntryContext.class);
		}
		public DictContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dict; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DuroListener ) ((DuroListener)listener).enterDict(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DuroListener ) ((DuroListener)listener).exitDict(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DuroVisitor ) return ((DuroVisitor<? extends T>)visitor).visitDict(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DictContext dict() throws RecognitionException {
		DictContext _localctx = new DictContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_dict);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(224); match(HASH);
			setState(225); match(SQ_OP);
			setState(229);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ID_CAP) | (1L << ID_UNCAP) | (1L << SQ_OP) | (1L << BIN_OP))) != 0)) {
				{
				{
				setState(226); dictEntry();
				}
				}
				setState(231);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(232); match(SQ_CL);
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

	public static class DictEntryContext extends ParserRuleContext {
		public Token op;
		public BehaviorParamsContext behaviorParams() {
			return getRuleContext(BehaviorParamsContext.class,0);
		}
		public TerminalNode ASSIGN() { return getToken(DuroParser.ASSIGN, 0); }
		public SelectorContext selector() {
			return getRuleContext(SelectorContext.class,0);
		}
		public TerminalNode ASSIGN_QUOTED() { return getToken(DuroParser.ASSIGN_QUOTED, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode ASSIGN_PROTO() { return getToken(DuroParser.ASSIGN_PROTO, 0); }
		public DictEntryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dictEntry; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DuroListener ) ((DuroListener)listener).enterDictEntry(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DuroListener ) ((DuroListener)listener).exitDictEntry(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DuroVisitor ) return ((DuroVisitor<? extends T>)visitor).visitDictEntry(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DictEntryContext dictEntry() throws RecognitionException {
		DictEntryContext _localctx = new DictEntryContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_dictEntry);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(234); selector();
			setState(241);
			switch (_input.LA(1)) {
			case ASSIGN:
			case ASSIGN_PROTO:
				{
				{
				setState(235);
				((DictEntryContext)_localctx).op = _input.LT(1);
				_la = _input.LA(1);
				if ( !(_la==ASSIGN || _la==ASSIGN_PROTO) ) {
					((DictEntryContext)_localctx).op = (Token)_errHandler.recoverInline(this);
				}
				consume();
				setState(236); expression();
				}
				}
				break;
			case ASSIGN_QUOTED:
				{
				setState(237); ((DictEntryContext)_localctx).op = match(ASSIGN_QUOTED);
				setState(238); behaviorParams();
				setState(239); expression();
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

	public static class ClosureContext extends ParserRuleContext {
		public BehaviorParamsContext behaviorParams() {
			return getRuleContext(BehaviorParamsContext.class,0);
		}
		public TerminalNode BAR_CL() { return getToken(DuroParser.BAR_CL, 0); }
		public TerminalNode BRA_OP() { return getToken(DuroParser.BRA_OP, 0); }
		public TopExpressionsContext topExpressions() {
			return getRuleContext(TopExpressionsContext.class,0);
		}
		public ClosureContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_closure; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DuroListener ) ((DuroListener)listener).enterClosure(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DuroListener ) ((DuroListener)listener).exitClosure(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DuroVisitor ) return ((DuroVisitor<? extends T>)visitor).visitClosure(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ClosureContext closure() throws RecognitionException {
		ClosureContext _localctx = new ClosureContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_closure);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(243); match(BRA_OP);
			setState(244); behaviorParams();
			setState(245); topExpressions();
			setState(246); match(BAR_CL);
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

	public static class BehaviorParamsContext extends ParserRuleContext {
		public IdContext id(int i) {
			return getRuleContext(IdContext.class,i);
		}
		public List<TerminalNode> PIPE() { return getTokens(DuroParser.PIPE); }
		public TerminalNode PIPE(int i) {
			return getToken(DuroParser.PIPE, i);
		}
		public List<IdContext> id() {
			return getRuleContexts(IdContext.class);
		}
		public BehaviorParamsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_behaviorParams; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DuroListener ) ((DuroListener)listener).enterBehaviorParams(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DuroListener ) ((DuroListener)listener).exitBehaviorParams(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DuroVisitor ) return ((DuroVisitor<? extends T>)visitor).visitBehaviorParams(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BehaviorParamsContext behaviorParams() throws RecognitionException {
		BehaviorParamsContext _localctx = new BehaviorParamsContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_behaviorParams);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(256);
			_la = _input.LA(1);
			if (_la==PIPE) {
				{
				setState(248); match(PIPE);
				setState(250); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(249); id();
					}
					}
					setState(252); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==ID_CAP || _la==ID_UNCAP );
				setState(254); match(PIPE);
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

	public static class PseudoVarContext extends ParserRuleContext {
		public TerminalNode PSEUDO_VAR() { return getToken(DuroParser.PSEUDO_VAR, 0); }
		public PseudoVarContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_pseudoVar; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DuroListener ) ((DuroListener)listener).enterPseudoVar(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DuroListener ) ((DuroListener)listener).exitPseudoVar(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DuroVisitor ) return ((DuroVisitor<? extends T>)visitor).visitPseudoVar(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PseudoVarContext pseudoVar() throws RecognitionException {
		PseudoVarContext _localctx = new PseudoVarContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_pseudoVar);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(258); match(PSEUDO_VAR);
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

	public static class ParArgContext extends ParserRuleContext {
		public TerminalNode COLON() { return getToken(DuroParser.COLON, 0); }
		public IdContext id() {
			return getRuleContext(IdContext.class,0);
		}
		public ParArgContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parArg; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DuroListener ) ((DuroListener)listener).enterParArg(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DuroListener ) ((DuroListener)listener).exitParArg(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DuroVisitor ) return ((DuroVisitor<? extends T>)visitor).visitParArg(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ParArgContext parArg() throws RecognitionException {
		ParArgContext _localctx = new ParArgContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_parArg);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(260); match(COLON);
			setState(261); id();
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

	public static class IdContext extends ParserRuleContext {
		public TerminalNode ID_CAP() { return getToken(DuroParser.ID_CAP, 0); }
		public TerminalNode ID_UNCAP() { return getToken(DuroParser.ID_UNCAP, 0); }
		public IdContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_id; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DuroListener ) ((DuroListener)listener).enterId(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DuroListener ) ((DuroListener)listener).exitId(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DuroVisitor ) return ((DuroVisitor<? extends T>)visitor).visitId(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IdContext id() throws RecognitionException {
		IdContext _localctx = new IdContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_id);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(263);
			_la = _input.LA(1);
			if ( !(_la==ID_CAP || _la==ID_UNCAP) ) {
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

	public static class SelectorContext extends ParserRuleContext {
		public IndexOperatorContext indexOperator() {
			return getRuleContext(IndexOperatorContext.class,0);
		}
		public IdContext id() {
			return getRuleContext(IdContext.class,0);
		}
		public BinaryOperatorContext binaryOperator() {
			return getRuleContext(BinaryOperatorContext.class,0);
		}
		public SelectorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_selector; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DuroListener ) ((DuroListener)listener).enterSelector(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DuroListener ) ((DuroListener)listener).exitSelector(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DuroVisitor ) return ((DuroVisitor<? extends T>)visitor).visitSelector(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SelectorContext selector() throws RecognitionException {
		SelectorContext _localctx = new SelectorContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_selector);
		try {
			setState(268);
			switch (_input.LA(1)) {
			case ID_CAP:
			case ID_UNCAP:
				enterOuterAlt(_localctx, 1);
				{
				setState(265); id();
				}
				break;
			case BIN_OP:
				enterOuterAlt(_localctx, 2);
				{
				setState(266); binaryOperator();
				}
				break;
			case SQ_OP:
				enterOuterAlt(_localctx, 3);
				{
				setState(267); indexOperator();
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

	public static class BinaryOperatorContext extends ParserRuleContext {
		public TerminalNode BIN_OP() { return getToken(DuroParser.BIN_OP, 0); }
		public BinaryOperatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_binaryOperator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DuroListener ) ((DuroListener)listener).enterBinaryOperator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DuroListener ) ((DuroListener)listener).exitBinaryOperator(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DuroVisitor ) return ((DuroVisitor<? extends T>)visitor).visitBinaryOperator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BinaryOperatorContext binaryOperator() throws RecognitionException {
		BinaryOperatorContext _localctx = new BinaryOperatorContext(_ctx, getState());
		enterRule(_localctx, 68, RULE_binaryOperator);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(270); match(BIN_OP);
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

	public static class IndexOperatorContext extends ParserRuleContext {
		public TerminalNode SQ_OP() { return getToken(DuroParser.SQ_OP, 0); }
		public TerminalNode SQ_CL() { return getToken(DuroParser.SQ_CL, 0); }
		public IndexOperatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_indexOperator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DuroListener ) ((DuroListener)listener).enterIndexOperator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DuroListener ) ((DuroListener)listener).exitIndexOperator(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DuroVisitor ) return ((DuroVisitor<? extends T>)visitor).visitIndexOperator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IndexOperatorContext indexOperator() throws RecognitionException {
		IndexOperatorContext _localctx = new IndexOperatorContext(_ctx, getState());
		enterRule(_localctx, 70, RULE_indexOperator);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(272); match(SQ_OP);
			setState(273); match(SQ_CL);
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
		"\3\uacf5\uee8c\u4f5d\u8b0d\u4a45\u78bd\u1b2f\u3378\3\33\u0116\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\3\2\7\2L\n\2\f\2\16\2O\13\2\3\3\3\3\3\4"+
		"\7\4T\n\4\f\4\16\4W\13\4\3\5\3\5\3\6\3\6\3\6\3\6\5\6_\n\6\3\7\3\7\3\7"+
		"\3\7\3\7\3\7\3\7\5\7h\n\7\3\b\3\b\7\bl\n\b\f\b\16\bo\13\b\3\b\3\b\5\b"+
		"s\n\b\3\t\3\t\3\t\3\t\5\ty\n\t\3\n\3\n\3\n\3\13\3\13\3\13\3\13\3\13\5"+
		"\13\u0083\n\13\3\f\3\f\3\r\3\r\3\16\3\16\3\16\3\16\3\17\3\17\5\17\u008f"+
		"\n\17\3\20\3\20\3\20\3\20\5\20\u0095\n\20\3\21\3\21\3\21\3\21\7\21\u009b"+
		"\n\21\f\21\16\21\u009e\13\21\3\22\3\22\3\22\7\22\u00a3\n\22\f\22\16\22"+
		"\u00a6\13\22\3\23\3\23\3\23\3\23\7\23\u00ac\n\23\f\23\16\23\u00af\13\23"+
		"\5\23\u00b1\n\23\3\23\3\23\5\23\u00b5\n\23\3\24\3\24\3\24\3\25\3\25\3"+
		"\25\3\25\3\26\3\26\3\26\3\27\3\27\7\27\u00c3\n\27\f\27\16\27\u00c6\13"+
		"\27\3\27\5\27\u00c9\n\27\3\30\3\30\3\30\3\30\3\30\3\30\3\31\3\31\3\31"+
		"\3\31\3\31\3\31\3\31\3\31\5\31\u00d9\n\31\3\32\3\32\3\32\3\32\5\32\u00df"+
		"\n\32\3\33\3\33\3\34\3\34\3\34\7\34\u00e6\n\34\f\34\16\34\u00e9\13\34"+
		"\3\34\3\34\3\35\3\35\3\35\3\35\3\35\3\35\3\35\5\35\u00f4\n\35\3\36\3\36"+
		"\3\36\3\36\3\36\3\37\3\37\6\37\u00fd\n\37\r\37\16\37\u00fe\3\37\3\37\5"+
		"\37\u0103\n\37\3 \3 \3!\3!\3!\3\"\3\"\3#\3#\3#\5#\u010f\n#\3$\3$\3%\3"+
		"%\3%\3%\2&\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(*,.\60\62\64\66"+
		"8:<>@BDFH\2\4\3\2\26\27\3\2\7\b\u0113\2M\3\2\2\2\4P\3\2\2\2\6U\3\2\2\2"+
		"\bX\3\2\2\2\n^\3\2\2\2\f`\3\2\2\2\16i\3\2\2\2\20t\3\2\2\2\22z\3\2\2\2"+
		"\24\u0082\3\2\2\2\26\u0084\3\2\2\2\30\u0086\3\2\2\2\32\u0088\3\2\2\2\34"+
		"\u008e\3\2\2\2\36\u0094\3\2\2\2 \u0096\3\2\2\2\"\u009f\3\2\2\2$\u00b4"+
		"\3\2\2\2&\u00b6\3\2\2\2(\u00b9\3\2\2\2*\u00bd\3\2\2\2,\u00c0\3\2\2\2."+
		"\u00ca\3\2\2\2\60\u00d0\3\2\2\2\62\u00de\3\2\2\2\64\u00e0\3\2\2\2\66\u00e2"+
		"\3\2\2\28\u00ec\3\2\2\2:\u00f5\3\2\2\2<\u0102\3\2\2\2>\u0104\3\2\2\2@"+
		"\u0106\3\2\2\2B\u0109\3\2\2\2D\u010e\3\2\2\2F\u0110\3\2\2\2H\u0112\3\2"+
		"\2\2JL\5\4\3\2KJ\3\2\2\2LO\3\2\2\2MK\3\2\2\2MN\3\2\2\2N\3\3\2\2\2OM\3"+
		"\2\2\2PQ\5\n\6\2Q\5\3\2\2\2RT\5\b\5\2SR\3\2\2\2TW\3\2\2\2US\3\2\2\2UV"+
		"\3\2\2\2V\7\3\2\2\2WU\3\2\2\2XY\5\n\6\2Y\t\3\2\2\2Z_\5\f\7\2[_\5\20\t"+
		"\2\\_\5\22\n\2]_\5\16\b\2^Z\3\2\2\2^[\3\2\2\2^\\\3\2\2\2^]\3\2\2\2_\13"+
		"\3\2\2\2`g\5B\"\2ab\t\2\2\2bh\5\n\6\2cd\7\30\2\2de\5<\37\2ef\5\n\6\2f"+
		"h\3\2\2\2ga\3\2\2\2gc\3\2\2\2h\r\3\2\2\2im\5\24\13\2jl\5\34\17\2kj\3\2"+
		"\2\2lo\3\2\2\2mk\3\2\2\2mn\3\2\2\2nr\3\2\2\2om\3\2\2\2ps\5.\30\2qs\5\60"+
		"\31\2rp\3\2\2\2rq\3\2\2\2rs\3\2\2\2s\17\3\2\2\2tu\7\4\2\2ux\5B\"\2vw\7"+
		"\26\2\2wy\5\n\6\2xv\3\2\2\2xy\3\2\2\2y\21\3\2\2\2z{\7\3\2\2{|\5\n\6\2"+
		"|\23\3\2\2\2}\u0083\5\26\f\2~\u0083\5\30\r\2\177\u0083\5\32\16\2\u0080"+
		"\u0083\5\62\32\2\u0081\u0083\5@!\2\u0082}\3\2\2\2\u0082~\3\2\2\2\u0082"+
		"\177\3\2\2\2\u0082\u0080\3\2\2\2\u0082\u0081\3\2\2\2\u0083\25\3\2\2\2"+
		"\u0084\u0085\5 \21\2\u0085\27\3\2\2\2\u0086\u0087\5B\"\2\u0087\31\3\2"+
		"\2\2\u0088\u0089\7\17\2\2\u0089\u008a\5\6\4\2\u008a\u008b\7\20\2\2\u008b"+
		"\33\3\2\2\2\u008c\u008f\5\36\20\2\u008d\u008f\5*\26\2\u008e\u008c\3\2"+
		"\2\2\u008e\u008d\3\2\2\2\u008f\35\3\2\2\2\u0090\u0091\7\f\2\2\u0091\u0095"+
		"\5 \21\2\u0092\u0095\5&\24\2\u0093\u0095\5(\25\2\u0094\u0090\3\2\2\2\u0094"+
		"\u0092\3\2\2\2\u0094\u0093\3\2\2\2\u0095\37\3\2\2\2\u0096\u0097\7\b\2"+
		"\2\u0097\u009c\5\"\22\2\u0098\u0099\7\7\2\2\u0099\u009b\5\"\22\2\u009a"+
		"\u0098\3\2\2\2\u009b\u009e\3\2\2\2\u009c\u009a\3\2\2\2\u009c\u009d\3\2"+
		"\2\2\u009d!\3\2\2\2\u009e\u009c\3\2\2\2\u009f\u00a4\5$\23\2\u00a0\u00a1"+
		"\7\r\2\2\u00a1\u00a3\5$\23\2\u00a2\u00a0\3\2\2\2\u00a3\u00a6\3\2\2\2\u00a4"+
		"\u00a2\3\2\2\2\u00a4\u00a5\3\2\2\2\u00a5#\3\2\2\2\u00a6\u00a4\3\2\2\2"+
		"\u00a7\u00b0\7\17\2\2\u00a8\u00ad\5\n\6\2\u00a9\u00aa\7\r\2\2\u00aa\u00ac"+
		"\5\n\6\2\u00ab\u00a9\3\2\2\2\u00ac\u00af\3\2\2\2\u00ad\u00ab\3\2\2\2\u00ad"+
		"\u00ae\3\2\2\2\u00ae\u00b1\3\2\2\2\u00af\u00ad\3\2\2\2\u00b0\u00a8\3\2"+
		"\2\2\u00b0\u00b1\3\2\2\2\u00b1\u00b2\3\2\2\2\u00b2\u00b5\7\20\2\2\u00b3"+
		"\u00b5\5\62\32\2\u00b4\u00a7\3\2\2\2\u00b4\u00b3\3\2\2\2\u00b5%\3\2\2"+
		"\2\u00b6\u00b7\7\f\2\2\u00b7\u00b8\5D#\2\u00b8\'\3\2\2\2\u00b9\u00ba\7"+
		"\21\2\2\u00ba\u00bb\5\n\6\2\u00bb\u00bc\7\22\2\2\u00bc)\3\2\2\2\u00bd"+
		"\u00be\7\25\2\2\u00be\u00bf\5,\27\2\u00bf+\3\2\2\2\u00c0\u00c4\5\24\13"+
		"\2\u00c1\u00c3\5\36\20\2\u00c2\u00c1\3\2\2\2\u00c3\u00c6\3\2\2\2\u00c4"+
		"\u00c2\3\2\2\2\u00c4\u00c5\3\2\2\2\u00c5\u00c8\3\2\2\2\u00c6\u00c4\3\2"+
		"\2\2\u00c7\u00c9\5.\30\2\u00c8\u00c7\3\2\2\2\u00c8\u00c9\3\2\2\2\u00c9"+
		"-\3\2\2\2\u00ca\u00cb\7\21\2\2\u00cb\u00cc\5\n\6\2\u00cc\u00cd\7\22\2"+
		"\2\u00cd\u00ce\7\26\2\2\u00ce\u00cf\5\n\6\2\u00cf/\3\2\2\2\u00d0\u00d1"+
		"\7\f\2\2\u00d1\u00d8\5B\"\2\u00d2\u00d3\t\2\2\2\u00d3\u00d9\5\n\6\2\u00d4"+
		"\u00d5\7\30\2\2\u00d5\u00d6\5<\37\2\u00d6\u00d7\5\n\6\2\u00d7\u00d9\3"+
		"\2\2\2\u00d8\u00d2\3\2\2\2\u00d8\u00d4\3\2\2\2\u00d9\61\3\2\2\2\u00da"+
		"\u00df\5\64\33\2\u00db\u00df\5\66\34\2\u00dc\u00df\5:\36\2\u00dd\u00df"+
		"\5> \2\u00de\u00da\3\2\2\2\u00de\u00db\3\2\2\2\u00de\u00dc\3\2\2\2\u00de"+
		"\u00dd\3\2\2\2\u00df\63\3\2\2\2\u00e0\u00e1\7\6\2\2\u00e1\65\3\2\2\2\u00e2"+
		"\u00e3\7\13\2\2\u00e3\u00e7\7\21\2\2\u00e4\u00e6\58\35\2\u00e5\u00e4\3"+
		"\2\2\2\u00e6\u00e9\3\2\2\2\u00e7\u00e5\3\2\2\2\u00e7\u00e8\3\2\2\2\u00e8"+
		"\u00ea\3\2\2\2\u00e9\u00e7\3\2\2\2\u00ea\u00eb\7\22\2\2\u00eb\67\3\2\2"+
		"\2\u00ec\u00f3\5D#\2\u00ed\u00ee\t\2\2\2\u00ee\u00f4\5\n\6\2\u00ef\u00f0"+
		"\7\30\2\2\u00f0\u00f1\5<\37\2\u00f1\u00f2\5\n\6\2\u00f2\u00f4\3\2\2\2"+
		"\u00f3\u00ed\3\2\2\2\u00f3\u00ef\3\2\2\2\u00f49\3\2\2\2\u00f5\u00f6\7"+
		"\23\2\2\u00f6\u00f7\5<\37\2\u00f7\u00f8\5\6\4\2\u00f8\u00f9\7\24\2\2\u00f9"+
		";\3\2\2\2\u00fa\u00fc\7\n\2\2\u00fb\u00fd\5B\"\2\u00fc\u00fb\3\2\2\2\u00fd"+
		"\u00fe\3\2\2\2\u00fe\u00fc\3\2\2\2\u00fe\u00ff\3\2\2\2\u00ff\u0100\3\2"+
		"\2\2\u0100\u0101\7\n\2\2\u0101\u0103\3\2\2\2\u0102\u00fa\3\2\2\2\u0102"+
		"\u0103\3\2\2\2\u0103=\3\2\2\2\u0104\u0105\7\5\2\2\u0105?\3\2\2\2\u0106"+
		"\u0107\7\16\2\2\u0107\u0108\5B\"\2\u0108A\3\2\2\2\u0109\u010a\t\3\2\2"+
		"\u010aC\3\2\2\2\u010b\u010f\5B\"\2\u010c\u010f\5F$\2\u010d\u010f\5H%\2"+
		"\u010e\u010b\3\2\2\2\u010e\u010c\3\2\2\2\u010e\u010d\3\2\2\2\u010fE\3"+
		"\2\2\2\u0110\u0111\7\25\2\2\u0111G\3\2\2\2\u0112\u0113\7\21\2\2\u0113"+
		"\u0114\7\22\2\2\u0114I\3\2\2\2\32MU^gmrx\u0082\u008e\u0094\u009c\u00a4"+
		"\u00ad\u00b0\u00b4\u00c4\u00c8\u00d8\u00de\u00e7\u00f3\u00fe\u0102\u010e";
	public static final ATN _ATN =
		ATNSimulator.deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}