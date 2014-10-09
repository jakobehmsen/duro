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
		VAR=1, PSEUDO_VAR=2, INT=3, ID_CAP=4, ID_UNCAP=5, PARAGRAPH=6, PIPE=7, 
		HASH=8, AT=9, DOT=10, COMMA=11, COLON=12, SEMI_COLON=13, BACK_SLASH=14, 
		DOLLAR=15, PAR_OP=16, PAR_CL=17, SQ_OP=18, SQ_CL=19, BRA_OP=20, BAR_CL=21, 
		BIN_OP=22, ASSIGN=23, ASSIGN_PROTO=24, ASSIGN_QUOTED=25, WS=26, SINGLELINE_COMMENT=27, 
		MULTI_LINE_COMMENT=28, STRING=29;
	public static final String[] tokenNames = {
		"<INVALID>", "'var'", "PSEUDO_VAR", "INT", "ID_CAP", "ID_UNCAP", "'§'", 
		"'|'", "'#'", "'@'", "'.'", "','", "':'", "';'", "'\\'", "'$'", "'('", 
		"')'", "'['", "']'", "'{'", "'}'", "BIN_OP", "'='", "'^='", "'=>'", "WS", 
		"SINGLELINE_COMMENT", "MULTI_LINE_COMMENT", "STRING"
	};
	public static final int
		RULE_program = 0, RULE_expression = 1, RULE_assignment = 2, RULE_interfaceId = 3, 
		RULE_messageExchange = 4, RULE_messageChain = 5, RULE_expressionChain = 6, 
		RULE_receiver = 7, RULE_selfMultiArgMessageNoPar = 8, RULE_selfMultiArgMessageWithPar = 9, 
		RULE_variableDeclaration = 10, RULE_access = 11, RULE_grouping = 12, RULE_multiArgMessageNoPar = 13, 
		RULE_multiArgMessageArgsNoPar = 14, RULE_multiArgMessageArgNoPar = 15, 
		RULE_multiArgMessageArgNoParReceiver = 16, RULE_multiArgMessageArgNoParChain = 17, 
		RULE_selfSingleArgMessageNoPar = 18, RULE_singleArgMessageNoPar = 19, 
		RULE_unaryMessage = 20, RULE_multiArgMessageWithPar = 21, RULE_multiArgMessageArgsWithPar = 22, 
		RULE_multiArgMessageArgsWithParArg = 23, RULE_slotAccess = 24, RULE_indexAccess = 25, 
		RULE_binaryMessage = 26, RULE_binaryMessageOperand = 27, RULE_binaryMessageOperandChain = 28, 
		RULE_indexAssignment = 29, RULE_slotAssignment = 30, RULE_literal = 31, 
		RULE_integer = 32, RULE_string = 33, RULE_dict = 34, RULE_dictEntry = 35, 
		RULE_closure = 36, RULE_behaviorParams = 37, RULE_array = 38, RULE_pseudoVar = 39, 
		RULE_parArg = 40, RULE_id = 41, RULE_selector = 42, RULE_binaryOperator = 43, 
		RULE_indexOperator = 44;
	public static final String[] ruleNames = {
		"program", "expression", "assignment", "interfaceId", "messageExchange", 
		"messageChain", "expressionChain", "receiver", "selfMultiArgMessageNoPar", 
		"selfMultiArgMessageWithPar", "variableDeclaration", "access", "grouping", 
		"multiArgMessageNoPar", "multiArgMessageArgsNoPar", "multiArgMessageArgNoPar", 
		"multiArgMessageArgNoParReceiver", "multiArgMessageArgNoParChain", "selfSingleArgMessageNoPar", 
		"singleArgMessageNoPar", "unaryMessage", "multiArgMessageWithPar", "multiArgMessageArgsWithPar", 
		"multiArgMessageArgsWithParArg", "slotAccess", "indexAccess", "binaryMessage", 
		"binaryMessageOperand", "binaryMessageOperandChain", "indexAssignment", 
		"slotAssignment", "literal", "integer", "string", "dict", "dictEntry", 
		"closure", "behaviorParams", "array", "pseudoVar", "parArg", "id", "selector", 
		"binaryOperator", "indexOperator"
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
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
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
			setState(93);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << VAR) | (1L << PSEUDO_VAR) | (1L << INT) | (1L << ID_CAP) | (1L << ID_UNCAP) | (1L << HASH) | (1L << BACK_SLASH) | (1L << DOLLAR) | (1L << PAR_OP) | (1L << BRA_OP) | (1L << STRING))) != 0)) {
				{
				{
				setState(90); expression();
				}
				}
				setState(95);
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

	public static class ExpressionContext extends ParserRuleContext {
		public VariableDeclarationContext variableDeclaration() {
			return getRuleContext(VariableDeclarationContext.class,0);
		}
		public SelfMultiArgMessageNoParContext selfMultiArgMessageNoPar() {
			return getRuleContext(SelfMultiArgMessageNoParContext.class,0);
		}
		public AssignmentContext assignment() {
			return getRuleContext(AssignmentContext.class,0);
		}
		public List<ExpressionChainContext> expressionChain() {
			return getRuleContexts(ExpressionChainContext.class);
		}
		public ExpressionChainContext expressionChain(int i) {
			return getRuleContext(ExpressionChainContext.class,i);
		}
		public InterfaceIdContext interfaceId() {
			return getRuleContext(InterfaceIdContext.class,0);
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
		enterRule(_localctx, 2, RULE_expression);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(101);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				{
				setState(96); assignment();
				}
				break;

			case 2:
				{
				setState(97); variableDeclaration();
				}
				break;

			case 3:
				{
				setState(98); selfMultiArgMessageNoPar();
				}
				break;

			case 4:
				{
				setState(99); interfaceId();
				}
				break;

			case 5:
				{
				setState(100); messageExchange();
				}
				break;
			}
			setState(106);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,2,_ctx);
			while ( _alt!=2 && _alt!=-1 ) {
				if ( _alt==1 ) {
					{
					{
					setState(103); expressionChain();
					}
					} 
				}
				setState(108);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,2,_ctx);
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

	public static class AssignmentContext extends ParserRuleContext {
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
		public AssignmentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignment; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DuroListener ) ((DuroListener)listener).enterAssignment(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DuroListener ) ((DuroListener)listener).exitAssignment(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DuroVisitor ) return ((DuroVisitor<? extends T>)visitor).visitAssignment(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AssignmentContext assignment() throws RecognitionException {
		AssignmentContext _localctx = new AssignmentContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_assignment);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(109); id();
			setState(116);
			switch (_input.LA(1)) {
			case ASSIGN:
			case ASSIGN_PROTO:
				{
				{
				setState(110);
				((AssignmentContext)_localctx).op = _input.LT(1);
				_la = _input.LA(1);
				if ( !(_la==ASSIGN || _la==ASSIGN_PROTO) ) {
					((AssignmentContext)_localctx).op = (Token)_errHandler.recoverInline(this);
				}
				consume();
				setState(111); expression();
				}
				}
				break;
			case ASSIGN_QUOTED:
				{
				setState(112); ((AssignmentContext)_localctx).op = match(ASSIGN_QUOTED);
				setState(113); behaviorParams();
				setState(114); expression();
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

	public static class InterfaceIdContext extends ParserRuleContext {
		public TerminalNode DOLLAR() { return getToken(DuroParser.DOLLAR, 0); }
		public IdContext id() {
			return getRuleContext(IdContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
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
		enterRule(_localctx, 6, RULE_interfaceId);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(118); match(DOLLAR);
			setState(119); id();
			{
			}
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

	public static class MessageExchangeContext extends ParserRuleContext {
		public ReceiverContext receiver() {
			return getRuleContext(ReceiverContext.class,0);
		}
		public MessageChainContext messageChain() {
			return getRuleContext(MessageChainContext.class,0);
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
		enterRule(_localctx, 8, RULE_messageExchange);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(123); receiver();
			setState(125);
			switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
			case 1:
				{
				setState(124); messageChain();
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

	public static class MessageChainContext extends ParserRuleContext {
		public SlotAccessContext slotAccess() {
			return getRuleContext(SlotAccessContext.class,0);
		}
		public TerminalNode DOT() { return getToken(DuroParser.DOT, 0); }
		public MessageChainContext messageChain() {
			return getRuleContext(MessageChainContext.class,0);
		}
		public UnaryMessageContext unaryMessage() {
			return getRuleContext(UnaryMessageContext.class,0);
		}
		public BinaryMessageContext binaryMessage(int i) {
			return getRuleContext(BinaryMessageContext.class,i);
		}
		public MultiArgMessageNoParContext multiArgMessageNoPar() {
			return getRuleContext(MultiArgMessageNoParContext.class,0);
		}
		public IndexAssignmentContext indexAssignment() {
			return getRuleContext(IndexAssignmentContext.class,0);
		}
		public SlotAssignmentContext slotAssignment() {
			return getRuleContext(SlotAssignmentContext.class,0);
		}
		public IndexAccessContext indexAccess() {
			return getRuleContext(IndexAccessContext.class,0);
		}
		public MultiArgMessageWithParContext multiArgMessageWithPar() {
			return getRuleContext(MultiArgMessageWithParContext.class,0);
		}
		public List<BinaryMessageContext> binaryMessage() {
			return getRuleContexts(BinaryMessageContext.class);
		}
		public MessageChainContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_messageChain; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DuroListener ) ((DuroListener)listener).enterMessageChain(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DuroListener ) ((DuroListener)listener).exitMessageChain(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DuroVisitor ) return ((DuroVisitor<? extends T>)visitor).visitMessageChain(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MessageChainContext messageChain() throws RecognitionException {
		MessageChainContext _localctx = new MessageChainContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_messageChain);
		try {
			int _alt;
			setState(153);
			switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(133);
				switch (_input.LA(1)) {
				case DOT:
					{
					setState(127); match(DOT);
					setState(130);
					switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
					case 1:
						{
						setState(128); multiArgMessageWithPar();
						}
						break;

					case 2:
						{
						setState(129); unaryMessage();
						}
						break;
					}
					}
					break;
				case SQ_OP:
					{
					setState(132); indexAccess();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(136);
				switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
				case 1:
					{
					setState(135); messageChain();
					}
					break;
				}
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(138); match(DOT);
				setState(139); multiArgMessageNoPar();
				}
				break;

			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(140); slotAccess();
				setState(142);
				switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
				case 1:
					{
					setState(141); messageChain();
					}
					break;
				}
				}
				break;

			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(144); slotAssignment();
				}
				break;

			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(145); indexAssignment();
				}
				break;

			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(146); binaryMessage();
				setState(150);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,9,_ctx);
				while ( _alt!=2 && _alt!=-1 ) {
					if ( _alt==1 ) {
						{
						{
						setState(147); binaryMessage();
						}
						} 
					}
					setState(152);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,9,_ctx);
				}
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

	public static class ExpressionChainContext extends ParserRuleContext {
		public SlotAccessContext slotAccess() {
			return getRuleContext(SlotAccessContext.class,0);
		}
		public MessageChainContext messageChain() {
			return getRuleContext(MessageChainContext.class,0);
		}
		public TerminalNode SEMI_COLON() { return getToken(DuroParser.SEMI_COLON, 0); }
		public BinaryMessageContext binaryMessage(int i) {
			return getRuleContext(BinaryMessageContext.class,i);
		}
		public UnaryMessageContext unaryMessage() {
			return getRuleContext(UnaryMessageContext.class,0);
		}
		public MultiArgMessageNoParContext multiArgMessageNoPar() {
			return getRuleContext(MultiArgMessageNoParContext.class,0);
		}
		public IndexAssignmentContext indexAssignment() {
			return getRuleContext(IndexAssignmentContext.class,0);
		}
		public SlotAssignmentContext slotAssignment() {
			return getRuleContext(SlotAssignmentContext.class,0);
		}
		public List<BinaryMessageContext> binaryMessage() {
			return getRuleContexts(BinaryMessageContext.class);
		}
		public IndexAccessContext indexAccess() {
			return getRuleContext(IndexAccessContext.class,0);
		}
		public MultiArgMessageWithParContext multiArgMessageWithPar() {
			return getRuleContext(MultiArgMessageWithParContext.class,0);
		}
		public ExpressionChainContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expressionChain; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DuroListener ) ((DuroListener)listener).enterExpressionChain(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DuroListener ) ((DuroListener)listener).exitExpressionChain(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DuroVisitor ) return ((DuroVisitor<? extends T>)visitor).visitExpressionChain(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressionChainContext expressionChain() throws RecognitionException {
		ExpressionChainContext _localctx = new ExpressionChainContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_expressionChain);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(155); match(SEMI_COLON);
			setState(180);
			switch ( getInterpreter().adaptivePredict(_input,16,_ctx) ) {
			case 1:
				{
				setState(161);
				switch (_input.LA(1)) {
				case ID_UNCAP:
					{
					setState(158);
					switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
					case 1:
						{
						setState(156); multiArgMessageWithPar();
						}
						break;

					case 2:
						{
						setState(157); unaryMessage();
						}
						break;
					}
					}
					break;
				case SQ_OP:
					{
					setState(160); indexAccess();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(164);
				switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
				case 1:
					{
					setState(163); messageChain();
					}
					break;
				}
				}
				break;

			case 2:
				{
				setState(166); multiArgMessageNoPar();
				}
				break;

			case 3:
				{
				setState(167); slotAccess();
				setState(169);
				switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
				case 1:
					{
					setState(168); messageChain();
					}
					break;
				}
				}
				break;

			case 4:
				{
				setState(171); slotAssignment();
				}
				break;

			case 5:
				{
				setState(172); indexAssignment();
				}
				break;

			case 6:
				{
				setState(173); binaryMessage();
				setState(177);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,15,_ctx);
				while ( _alt!=2 && _alt!=-1 ) {
					if ( _alt==1 ) {
						{
						{
						setState(174); binaryMessage();
						}
						} 
					}
					setState(179);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,15,_ctx);
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

	public static class ReceiverContext extends ParserRuleContext {
		public GroupingContext grouping() {
			return getRuleContext(GroupingContext.class,0);
		}
		public ParArgContext parArg() {
			return getRuleContext(ParArgContext.class,0);
		}
		public LiteralContext literal() {
			return getRuleContext(LiteralContext.class,0);
		}
		public SelfMultiArgMessageWithParContext selfMultiArgMessageWithPar() {
			return getRuleContext(SelfMultiArgMessageWithParContext.class,0);
		}
		public AccessContext access() {
			return getRuleContext(AccessContext.class,0);
		}
		public ReceiverContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_receiver; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DuroListener ) ((DuroListener)listener).enterReceiver(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DuroListener ) ((DuroListener)listener).exitReceiver(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DuroVisitor ) return ((DuroVisitor<? extends T>)visitor).visitReceiver(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ReceiverContext receiver() throws RecognitionException {
		ReceiverContext _localctx = new ReceiverContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_receiver);
		try {
			setState(187);
			switch ( getInterpreter().adaptivePredict(_input,17,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(182); selfMultiArgMessageWithPar();
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(183); access();
				}
				break;

			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(184); grouping();
				}
				break;

			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(185); literal();
				}
				break;

			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(186); parArg();
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

	public static class SelfMultiArgMessageNoParContext extends ParserRuleContext {
		public MultiArgMessageNoParContext multiArgMessageNoPar() {
			return getRuleContext(MultiArgMessageNoParContext.class,0);
		}
		public SelfMultiArgMessageNoParContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_selfMultiArgMessageNoPar; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DuroListener ) ((DuroListener)listener).enterSelfMultiArgMessageNoPar(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DuroListener ) ((DuroListener)listener).exitSelfMultiArgMessageNoPar(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DuroVisitor ) return ((DuroVisitor<? extends T>)visitor).visitSelfMultiArgMessageNoPar(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SelfMultiArgMessageNoParContext selfMultiArgMessageNoPar() throws RecognitionException {
		SelfMultiArgMessageNoParContext _localctx = new SelfMultiArgMessageNoParContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_selfMultiArgMessageNoPar);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(189); multiArgMessageNoPar();
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

	public static class SelfMultiArgMessageWithParContext extends ParserRuleContext {
		public MultiArgMessageWithParContext multiArgMessageWithPar() {
			return getRuleContext(MultiArgMessageWithParContext.class,0);
		}
		public SelfMultiArgMessageWithParContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_selfMultiArgMessageWithPar; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DuroListener ) ((DuroListener)listener).enterSelfMultiArgMessageWithPar(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DuroListener ) ((DuroListener)listener).exitSelfMultiArgMessageWithPar(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DuroVisitor ) return ((DuroVisitor<? extends T>)visitor).visitSelfMultiArgMessageWithPar(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SelfMultiArgMessageWithParContext selfMultiArgMessageWithPar() throws RecognitionException {
		SelfMultiArgMessageWithParContext _localctx = new SelfMultiArgMessageWithParContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_selfMultiArgMessageWithPar);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(191); multiArgMessageWithPar();
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
		enterRule(_localctx, 20, RULE_variableDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(193); match(VAR);
			setState(194); id();
			setState(197);
			_la = _input.LA(1);
			if (_la==ASSIGN) {
				{
				setState(195); match(ASSIGN);
				setState(196); expression();
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
			setState(199); id();
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
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public TerminalNode PAR_CL() { return getToken(DuroParser.PAR_CL, 0); }
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
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(201); match(PAR_OP);
			setState(203); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(202); expression();
				}
				}
				setState(205); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << VAR) | (1L << PSEUDO_VAR) | (1L << INT) | (1L << ID_CAP) | (1L << ID_UNCAP) | (1L << HASH) | (1L << BACK_SLASH) | (1L << DOLLAR) | (1L << PAR_OP) | (1L << BRA_OP) | (1L << STRING))) != 0) );
			setState(207); match(PAR_CL);
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

	public static class MultiArgMessageNoParContext extends ParserRuleContext {
		public List<TerminalNode> ID_CAP() { return getTokens(DuroParser.ID_CAP); }
		public TerminalNode ID_UNCAP() { return getToken(DuroParser.ID_UNCAP, 0); }
		public TerminalNode COLON(int i) {
			return getToken(DuroParser.COLON, i);
		}
		public List<TerminalNode> COLON() { return getTokens(DuroParser.COLON); }
		public MultiArgMessageArgsNoParContext multiArgMessageArgsNoPar(int i) {
			return getRuleContext(MultiArgMessageArgsNoParContext.class,i);
		}
		public TerminalNode ID_CAP(int i) {
			return getToken(DuroParser.ID_CAP, i);
		}
		public List<MultiArgMessageArgsNoParContext> multiArgMessageArgsNoPar() {
			return getRuleContexts(MultiArgMessageArgsNoParContext.class);
		}
		public MultiArgMessageNoParContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_multiArgMessageNoPar; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DuroListener ) ((DuroListener)listener).enterMultiArgMessageNoPar(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DuroListener ) ((DuroListener)listener).exitMultiArgMessageNoPar(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DuroVisitor ) return ((DuroVisitor<? extends T>)visitor).visitMultiArgMessageNoPar(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MultiArgMessageNoParContext multiArgMessageNoPar() throws RecognitionException {
		MultiArgMessageNoParContext _localctx = new MultiArgMessageNoParContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_multiArgMessageNoPar);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(209); match(ID_UNCAP);
			setState(210); match(COLON);
			setState(211); multiArgMessageArgsNoPar();
			setState(217);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,20,_ctx);
			while ( _alt!=2 && _alt!=-1 ) {
				if ( _alt==1 ) {
					{
					{
					setState(212); match(ID_CAP);
					setState(213); match(COLON);
					setState(214); multiArgMessageArgsNoPar();
					}
					} 
				}
				setState(219);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,20,_ctx);
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

	public static class MultiArgMessageArgsNoParContext extends ParserRuleContext {
		public List<MultiArgMessageArgNoParContext> multiArgMessageArgNoPar() {
			return getRuleContexts(MultiArgMessageArgNoParContext.class);
		}
		public MultiArgMessageArgNoParContext multiArgMessageArgNoPar(int i) {
			return getRuleContext(MultiArgMessageArgNoParContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(DuroParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(DuroParser.COMMA, i);
		}
		public MultiArgMessageArgsNoParContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_multiArgMessageArgsNoPar; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DuroListener ) ((DuroListener)listener).enterMultiArgMessageArgsNoPar(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DuroListener ) ((DuroListener)listener).exitMultiArgMessageArgsNoPar(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DuroVisitor ) return ((DuroVisitor<? extends T>)visitor).visitMultiArgMessageArgsNoPar(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MultiArgMessageArgsNoParContext multiArgMessageArgsNoPar() throws RecognitionException {
		MultiArgMessageArgsNoParContext _localctx = new MultiArgMessageArgsNoParContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_multiArgMessageArgsNoPar);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(228);
			switch ( getInterpreter().adaptivePredict(_input,22,_ctx) ) {
			case 1:
				{
				setState(220); multiArgMessageArgNoPar();
				setState(225);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,21,_ctx);
				while ( _alt!=2 && _alt!=-1 ) {
					if ( _alt==1 ) {
						{
						{
						setState(221); match(COMMA);
						setState(222); multiArgMessageArgNoPar();
						}
						} 
					}
					setState(227);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,21,_ctx);
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

	public static class MultiArgMessageArgNoParContext extends ParserRuleContext {
		public MultiArgMessageArgNoParReceiverContext multiArgMessageArgNoParReceiver() {
			return getRuleContext(MultiArgMessageArgNoParReceiverContext.class,0);
		}
		public SelfMultiArgMessageWithParContext selfMultiArgMessageWithPar() {
			return getRuleContext(SelfMultiArgMessageWithParContext.class,0);
		}
		public MultiArgMessageArgNoParChainContext multiArgMessageArgNoParChain() {
			return getRuleContext(MultiArgMessageArgNoParChainContext.class,0);
		}
		public SelfSingleArgMessageNoParContext selfSingleArgMessageNoPar() {
			return getRuleContext(SelfSingleArgMessageNoParContext.class,0);
		}
		public MultiArgMessageArgNoParContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_multiArgMessageArgNoPar; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DuroListener ) ((DuroListener)listener).enterMultiArgMessageArgNoPar(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DuroListener ) ((DuroListener)listener).exitMultiArgMessageArgNoPar(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DuroVisitor ) return ((DuroVisitor<? extends T>)visitor).visitMultiArgMessageArgNoPar(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MultiArgMessageArgNoParContext multiArgMessageArgNoPar() throws RecognitionException {
		MultiArgMessageArgNoParContext _localctx = new MultiArgMessageArgNoParContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_multiArgMessageArgNoPar);
		try {
			setState(236);
			switch ( getInterpreter().adaptivePredict(_input,24,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(230); selfSingleArgMessageNoPar();
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(231); selfMultiArgMessageWithPar();
				}
				break;

			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(232); multiArgMessageArgNoParReceiver();
				setState(234);
				switch ( getInterpreter().adaptivePredict(_input,23,_ctx) ) {
				case 1:
					{
					setState(233); multiArgMessageArgNoParChain();
					}
					break;
				}
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

	public static class MultiArgMessageArgNoParReceiverContext extends ParserRuleContext {
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
		public MultiArgMessageArgNoParReceiverContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_multiArgMessageArgNoParReceiver; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DuroListener ) ((DuroListener)listener).enterMultiArgMessageArgNoParReceiver(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DuroListener ) ((DuroListener)listener).exitMultiArgMessageArgNoParReceiver(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DuroVisitor ) return ((DuroVisitor<? extends T>)visitor).visitMultiArgMessageArgNoParReceiver(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MultiArgMessageArgNoParReceiverContext multiArgMessageArgNoParReceiver() throws RecognitionException {
		MultiArgMessageArgNoParReceiverContext _localctx = new MultiArgMessageArgNoParReceiverContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_multiArgMessageArgNoParReceiver);
		try {
			setState(242);
			switch (_input.LA(1)) {
			case ID_CAP:
			case ID_UNCAP:
				enterOuterAlt(_localctx, 1);
				{
				setState(238); access();
				}
				break;
			case PAR_OP:
				enterOuterAlt(_localctx, 2);
				{
				setState(239); grouping();
				}
				break;
			case PSEUDO_VAR:
			case INT:
			case HASH:
			case BRA_OP:
			case STRING:
				enterOuterAlt(_localctx, 3);
				{
				setState(240); literal();
				}
				break;
			case BACK_SLASH:
				enterOuterAlt(_localctx, 4);
				{
				setState(241); parArg();
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

	public static class MultiArgMessageArgNoParChainContext extends ParserRuleContext {
		public SlotAccessContext slotAccess() {
			return getRuleContext(SlotAccessContext.class,0);
		}
		public TerminalNode DOT() { return getToken(DuroParser.DOT, 0); }
		public UnaryMessageContext unaryMessage() {
			return getRuleContext(UnaryMessageContext.class,0);
		}
		public BinaryMessageContext binaryMessage(int i) {
			return getRuleContext(BinaryMessageContext.class,i);
		}
		public MultiArgMessageArgNoParChainContext multiArgMessageArgNoParChain() {
			return getRuleContext(MultiArgMessageArgNoParChainContext.class,0);
		}
		public IndexAssignmentContext indexAssignment() {
			return getRuleContext(IndexAssignmentContext.class,0);
		}
		public SlotAssignmentContext slotAssignment() {
			return getRuleContext(SlotAssignmentContext.class,0);
		}
		public IndexAccessContext indexAccess() {
			return getRuleContext(IndexAccessContext.class,0);
		}
		public MultiArgMessageWithParContext multiArgMessageWithPar() {
			return getRuleContext(MultiArgMessageWithParContext.class,0);
		}
		public SingleArgMessageNoParContext singleArgMessageNoPar() {
			return getRuleContext(SingleArgMessageNoParContext.class,0);
		}
		public List<BinaryMessageContext> binaryMessage() {
			return getRuleContexts(BinaryMessageContext.class);
		}
		public MultiArgMessageArgNoParChainContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_multiArgMessageArgNoParChain; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DuroListener ) ((DuroListener)listener).enterMultiArgMessageArgNoParChain(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DuroListener ) ((DuroListener)listener).exitMultiArgMessageArgNoParChain(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DuroVisitor ) return ((DuroVisitor<? extends T>)visitor).visitMultiArgMessageArgNoParChain(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MultiArgMessageArgNoParChainContext multiArgMessageArgNoParChain() throws RecognitionException {
		MultiArgMessageArgNoParChainContext _localctx = new MultiArgMessageArgNoParChainContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_multiArgMessageArgNoParChain);
		try {
			int _alt;
			setState(265);
			switch ( getInterpreter().adaptivePredict(_input,30,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(251);
				switch (_input.LA(1)) {
				case DOT:
					{
					setState(244); match(DOT);
					setState(247);
					switch ( getInterpreter().adaptivePredict(_input,26,_ctx) ) {
					case 1:
						{
						setState(245); multiArgMessageWithPar();
						}
						break;

					case 2:
						{
						setState(246); unaryMessage();
						}
						break;
					}
					}
					break;
				case AT:
					{
					setState(249); slotAccess();
					}
					break;
				case SQ_OP:
					{
					setState(250); indexAccess();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(254);
				switch ( getInterpreter().adaptivePredict(_input,28,_ctx) ) {
				case 1:
					{
					setState(253); multiArgMessageArgNoParChain();
					}
					break;
				}
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(256); match(DOT);
				setState(257); singleArgMessageNoPar();
				}
				break;

			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(258); slotAssignment();
				}
				break;

			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(259); indexAssignment();
				}
				break;

			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(261); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,29,_ctx);
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(260); binaryMessage();
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(263); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,29,_ctx);
				} while ( _alt!=2 && _alt!=-1 );
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

	public static class SelfSingleArgMessageNoParContext extends ParserRuleContext {
		public SingleArgMessageNoParContext singleArgMessageNoPar() {
			return getRuleContext(SingleArgMessageNoParContext.class,0);
		}
		public SelfSingleArgMessageNoParContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_selfSingleArgMessageNoPar; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DuroListener ) ((DuroListener)listener).enterSelfSingleArgMessageNoPar(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DuroListener ) ((DuroListener)listener).exitSelfSingleArgMessageNoPar(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DuroVisitor ) return ((DuroVisitor<? extends T>)visitor).visitSelfSingleArgMessageNoPar(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SelfSingleArgMessageNoParContext selfSingleArgMessageNoPar() throws RecognitionException {
		SelfSingleArgMessageNoParContext _localctx = new SelfSingleArgMessageNoParContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_selfSingleArgMessageNoPar);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(267); singleArgMessageNoPar();
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

	public static class SingleArgMessageNoParContext extends ParserRuleContext {
		public MultiArgMessageArgNoParContext multiArgMessageArgNoPar() {
			return getRuleContext(MultiArgMessageArgNoParContext.class,0);
		}
		public TerminalNode ID_UNCAP() { return getToken(DuroParser.ID_UNCAP, 0); }
		public TerminalNode COLON() { return getToken(DuroParser.COLON, 0); }
		public SingleArgMessageNoParContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_singleArgMessageNoPar; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DuroListener ) ((DuroListener)listener).enterSingleArgMessageNoPar(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DuroListener ) ((DuroListener)listener).exitSingleArgMessageNoPar(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DuroVisitor ) return ((DuroVisitor<? extends T>)visitor).visitSingleArgMessageNoPar(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SingleArgMessageNoParContext singleArgMessageNoPar() throws RecognitionException {
		SingleArgMessageNoParContext _localctx = new SingleArgMessageNoParContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_singleArgMessageNoPar);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(269); match(ID_UNCAP);
			setState(270); match(COLON);
			setState(271); multiArgMessageArgNoPar();
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

	public static class UnaryMessageContext extends ParserRuleContext {
		public TerminalNode ID_UNCAP() { return getToken(DuroParser.ID_UNCAP, 0); }
		public UnaryMessageContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unaryMessage; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DuroListener ) ((DuroListener)listener).enterUnaryMessage(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DuroListener ) ((DuroListener)listener).exitUnaryMessage(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DuroVisitor ) return ((DuroVisitor<? extends T>)visitor).visitUnaryMessage(this);
			else return visitor.visitChildren(this);
		}
	}

	public final UnaryMessageContext unaryMessage() throws RecognitionException {
		UnaryMessageContext _localctx = new UnaryMessageContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_unaryMessage);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(273); match(ID_UNCAP);
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

	public static class MultiArgMessageWithParContext extends ParserRuleContext {
		public MultiArgMessageArgsWithParContext multiArgMessageArgsWithPar(int i) {
			return getRuleContext(MultiArgMessageArgsWithParContext.class,i);
		}
		public List<MultiArgMessageArgsWithParContext> multiArgMessageArgsWithPar() {
			return getRuleContexts(MultiArgMessageArgsWithParContext.class);
		}
		public List<TerminalNode> ID_CAP() { return getTokens(DuroParser.ID_CAP); }
		public TerminalNode ID_UNCAP() { return getToken(DuroParser.ID_UNCAP, 0); }
		public TerminalNode ID_CAP(int i) {
			return getToken(DuroParser.ID_CAP, i);
		}
		public MultiArgMessageWithParContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_multiArgMessageWithPar; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DuroListener ) ((DuroListener)listener).enterMultiArgMessageWithPar(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DuroListener ) ((DuroListener)listener).exitMultiArgMessageWithPar(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DuroVisitor ) return ((DuroVisitor<? extends T>)visitor).visitMultiArgMessageWithPar(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MultiArgMessageWithParContext multiArgMessageWithPar() throws RecognitionException {
		MultiArgMessageWithParContext _localctx = new MultiArgMessageWithParContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_multiArgMessageWithPar);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(275); match(ID_UNCAP);
			setState(276); multiArgMessageArgsWithPar();
			setState(281);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,31,_ctx);
			while ( _alt!=2 && _alt!=-1 ) {
				if ( _alt==1 ) {
					{
					{
					setState(277); match(ID_CAP);
					setState(278); multiArgMessageArgsWithPar();
					}
					} 
				}
				setState(283);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,31,_ctx);
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

	public static class MultiArgMessageArgsWithParContext extends ParserRuleContext {
		public List<TerminalNode> COMMA() { return getTokens(DuroParser.COMMA); }
		public TerminalNode PAR_OP() { return getToken(DuroParser.PAR_OP, 0); }
		public MultiArgMessageArgsWithParArgContext multiArgMessageArgsWithParArg(int i) {
			return getRuleContext(MultiArgMessageArgsWithParArgContext.class,i);
		}
		public List<MultiArgMessageArgsWithParArgContext> multiArgMessageArgsWithParArg() {
			return getRuleContexts(MultiArgMessageArgsWithParArgContext.class);
		}
		public TerminalNode PAR_CL() { return getToken(DuroParser.PAR_CL, 0); }
		public TerminalNode COMMA(int i) {
			return getToken(DuroParser.COMMA, i);
		}
		public MultiArgMessageArgsWithParContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_multiArgMessageArgsWithPar; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DuroListener ) ((DuroListener)listener).enterMultiArgMessageArgsWithPar(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DuroListener ) ((DuroListener)listener).exitMultiArgMessageArgsWithPar(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DuroVisitor ) return ((DuroVisitor<? extends T>)visitor).visitMultiArgMessageArgsWithPar(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MultiArgMessageArgsWithParContext multiArgMessageArgsWithPar() throws RecognitionException {
		MultiArgMessageArgsWithParContext _localctx = new MultiArgMessageArgsWithParContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_multiArgMessageArgsWithPar);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(284); match(PAR_OP);
			setState(293);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << VAR) | (1L << PSEUDO_VAR) | (1L << INT) | (1L << ID_CAP) | (1L << ID_UNCAP) | (1L << HASH) | (1L << BACK_SLASH) | (1L << DOLLAR) | (1L << PAR_OP) | (1L << BRA_OP) | (1L << STRING))) != 0)) {
				{
				setState(285); multiArgMessageArgsWithParArg();
				setState(290);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(286); match(COMMA);
					setState(287); multiArgMessageArgsWithParArg();
					}
					}
					setState(292);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(295); match(PAR_CL);
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

	public static class MultiArgMessageArgsWithParArgContext extends ParserRuleContext {
		public VariableDeclarationContext variableDeclaration() {
			return getRuleContext(VariableDeclarationContext.class,0);
		}
		public AssignmentContext assignment() {
			return getRuleContext(AssignmentContext.class,0);
		}
		public InterfaceIdContext interfaceId() {
			return getRuleContext(InterfaceIdContext.class,0);
		}
		public MessageExchangeContext messageExchange() {
			return getRuleContext(MessageExchangeContext.class,0);
		}
		public MultiArgMessageArgsWithParArgContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_multiArgMessageArgsWithParArg; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DuroListener ) ((DuroListener)listener).enterMultiArgMessageArgsWithParArg(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DuroListener ) ((DuroListener)listener).exitMultiArgMessageArgsWithParArg(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DuroVisitor ) return ((DuroVisitor<? extends T>)visitor).visitMultiArgMessageArgsWithParArg(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MultiArgMessageArgsWithParArgContext multiArgMessageArgsWithParArg() throws RecognitionException {
		MultiArgMessageArgsWithParArgContext _localctx = new MultiArgMessageArgsWithParArgContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_multiArgMessageArgsWithParArg);
		try {
			setState(301);
			switch ( getInterpreter().adaptivePredict(_input,34,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(297); assignment();
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(298); variableDeclaration();
				}
				break;

			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(299); interfaceId();
				}
				break;

			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(300); messageExchange();
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

	public static class SlotAccessContext extends ParserRuleContext {
		public TerminalNode AT() { return getToken(DuroParser.AT, 0); }
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
		enterRule(_localctx, 48, RULE_slotAccess);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(303); match(AT);
			setState(304); selector();
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
		enterRule(_localctx, 50, RULE_indexAccess);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(306); match(SQ_OP);
			setState(307); expression();
			setState(308); match(SQ_CL);
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
		enterRule(_localctx, 52, RULE_binaryMessage);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(310); match(BIN_OP);
			setState(311); binaryMessageOperand();
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
		public ReceiverContext receiver() {
			return getRuleContext(ReceiverContext.class,0);
		}
		public BinaryMessageOperandChainContext binaryMessageOperandChain() {
			return getRuleContext(BinaryMessageOperandChainContext.class,0);
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
		enterRule(_localctx, 54, RULE_binaryMessageOperand);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(313); receiver();
			setState(315);
			switch ( getInterpreter().adaptivePredict(_input,35,_ctx) ) {
			case 1:
				{
				setState(314); binaryMessageOperandChain();
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

	public static class BinaryMessageOperandChainContext extends ParserRuleContext {
		public SlotAccessContext slotAccess() {
			return getRuleContext(SlotAccessContext.class,0);
		}
		public TerminalNode DOT() { return getToken(DuroParser.DOT, 0); }
		public IndexAssignmentContext indexAssignment() {
			return getRuleContext(IndexAssignmentContext.class,0);
		}
		public SlotAssignmentContext slotAssignment() {
			return getRuleContext(SlotAssignmentContext.class,0);
		}
		public MultiArgMessageWithParContext multiArgMessageWithPar() {
			return getRuleContext(MultiArgMessageWithParContext.class,0);
		}
		public IndexAccessContext indexAccess() {
			return getRuleContext(IndexAccessContext.class,0);
		}
		public BinaryMessageOperandChainContext binaryMessageOperandChain() {
			return getRuleContext(BinaryMessageOperandChainContext.class,0);
		}
		public BinaryMessageOperandChainContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_binaryMessageOperandChain; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DuroListener ) ((DuroListener)listener).enterBinaryMessageOperandChain(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DuroListener ) ((DuroListener)listener).exitBinaryMessageOperandChain(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DuroVisitor ) return ((DuroVisitor<? extends T>)visitor).visitBinaryMessageOperandChain(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BinaryMessageOperandChainContext binaryMessageOperandChain() throws RecognitionException {
		BinaryMessageOperandChainContext _localctx = new BinaryMessageOperandChainContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_binaryMessageOperandChain);
		try {
			setState(328);
			switch ( getInterpreter().adaptivePredict(_input,38,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(321);
				switch (_input.LA(1)) {
				case DOT:
					{
					setState(317); match(DOT);
					setState(318); multiArgMessageWithPar();
					}
					break;
				case AT:
					{
					setState(319); slotAccess();
					}
					break;
				case SQ_OP:
					{
					setState(320); indexAccess();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(324);
				switch ( getInterpreter().adaptivePredict(_input,37,_ctx) ) {
				case 1:
					{
					setState(323); binaryMessageOperandChain();
					}
					break;
				}
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(326); slotAssignment();
				}
				break;

			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(327); indexAssignment();
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

	public static class IndexAssignmentContext extends ParserRuleContext {
		public TerminalNode ASSIGN() { return getToken(DuroParser.ASSIGN, 0); }
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode SQ_OP() { return getToken(DuroParser.SQ_OP, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public TerminalNode SQ_CL() { return getToken(DuroParser.SQ_CL, 0); }
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
		enterRule(_localctx, 58, RULE_indexAssignment);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(330); match(SQ_OP);
			setState(331); expression();
			setState(332); match(SQ_CL);
			setState(333); match(ASSIGN);
			setState(334); expression();
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
		public TerminalNode AT() { return getToken(DuroParser.AT, 0); }
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
		enterRule(_localctx, 60, RULE_slotAssignment);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(336); match(AT);
			setState(337); selector();
			setState(344);
			switch (_input.LA(1)) {
			case ASSIGN:
			case ASSIGN_PROTO:
				{
				{
				setState(338);
				((SlotAssignmentContext)_localctx).op = _input.LT(1);
				_la = _input.LA(1);
				if ( !(_la==ASSIGN || _la==ASSIGN_PROTO) ) {
					((SlotAssignmentContext)_localctx).op = (Token)_errHandler.recoverInline(this);
				}
				consume();
				setState(339); expression();
				}
				}
				break;
			case ASSIGN_QUOTED:
				{
				setState(340); ((SlotAssignmentContext)_localctx).op = match(ASSIGN_QUOTED);
				setState(341); behaviorParams();
				setState(342); expression();
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
		public StringContext string() {
			return getRuleContext(StringContext.class,0);
		}
		public PseudoVarContext pseudoVar() {
			return getRuleContext(PseudoVarContext.class,0);
		}
		public DictContext dict() {
			return getRuleContext(DictContext.class,0);
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
		enterRule(_localctx, 62, RULE_literal);
		try {
			setState(352);
			switch ( getInterpreter().adaptivePredict(_input,40,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(346); integer();
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(347); string();
				}
				break;

			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(348); dict();
				}
				break;

			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(349); closure();
				}
				break;

			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(350); array();
				}
				break;

			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(351); pseudoVar();
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
		enterRule(_localctx, 64, RULE_integer);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(354); match(INT);
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
		public TerminalNode STRING() { return getToken(DuroParser.STRING, 0); }
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
		enterRule(_localctx, 66, RULE_string);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(356); match(STRING);
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
		enterRule(_localctx, 68, RULE_dict);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(358); match(HASH);
			setState(359); match(SQ_OP);
			setState(363);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ID_CAP) | (1L << ID_UNCAP) | (1L << SQ_OP) | (1L << BIN_OP))) != 0)) {
				{
				{
				setState(360); dictEntry();
				}
				}
				setState(365);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(366); match(SQ_CL);
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
		enterRule(_localctx, 70, RULE_dictEntry);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(368); selector();
			setState(375);
			switch (_input.LA(1)) {
			case ASSIGN:
			case ASSIGN_PROTO:
				{
				{
				setState(369);
				((DictEntryContext)_localctx).op = _input.LT(1);
				_la = _input.LA(1);
				if ( !(_la==ASSIGN || _la==ASSIGN_PROTO) ) {
					((DictEntryContext)_localctx).op = (Token)_errHandler.recoverInline(this);
				}
				consume();
				setState(370); expression();
				}
				}
				break;
			case ASSIGN_QUOTED:
				{
				setState(371); ((DictEntryContext)_localctx).op = match(ASSIGN_QUOTED);
				setState(372); behaviorParams();
				setState(373); expression();
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
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode BRA_OP() { return getToken(DuroParser.BRA_OP, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
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
		enterRule(_localctx, 72, RULE_closure);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(377); match(BRA_OP);
			setState(378); behaviorParams();
			{
			setState(382);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << VAR) | (1L << PSEUDO_VAR) | (1L << INT) | (1L << ID_CAP) | (1L << ID_UNCAP) | (1L << HASH) | (1L << BACK_SLASH) | (1L << DOLLAR) | (1L << PAR_OP) | (1L << BRA_OP) | (1L << STRING))) != 0)) {
				{
				{
				setState(379); expression();
				}
				}
				setState(384);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
			setState(385); match(BAR_CL);
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
		enterRule(_localctx, 74, RULE_behaviorParams);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(395);
			_la = _input.LA(1);
			if (_la==PIPE) {
				{
				setState(387); match(PIPE);
				setState(389); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(388); id();
					}
					}
					setState(391); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==ID_CAP || _la==ID_UNCAP );
				setState(393); match(PIPE);
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

	public static class ArrayContext extends ParserRuleContext {
		public TerminalNode PAR_OP() { return getToken(DuroParser.PAR_OP, 0); }
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public TerminalNode PAR_CL() { return getToken(DuroParser.PAR_CL, 0); }
		public TerminalNode HASH() { return getToken(DuroParser.HASH, 0); }
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
		enterRule(_localctx, 76, RULE_array);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(397); match(HASH);
			setState(398); match(PAR_OP);
			setState(402);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << VAR) | (1L << PSEUDO_VAR) | (1L << INT) | (1L << ID_CAP) | (1L << ID_UNCAP) | (1L << HASH) | (1L << BACK_SLASH) | (1L << DOLLAR) | (1L << PAR_OP) | (1L << BRA_OP) | (1L << STRING))) != 0)) {
				{
				{
				setState(399); expression();
				}
				}
				setState(404);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(405); match(PAR_CL);
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
		enterRule(_localctx, 78, RULE_pseudoVar);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(407); match(PSEUDO_VAR);
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
		public IdContext id() {
			return getRuleContext(IdContext.class,0);
		}
		public TerminalNode BACK_SLASH() { return getToken(DuroParser.BACK_SLASH, 0); }
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
		enterRule(_localctx, 80, RULE_parArg);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(409); match(BACK_SLASH);
			setState(410); id();
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
		enterRule(_localctx, 82, RULE_id);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(412);
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
		enterRule(_localctx, 84, RULE_selector);
		try {
			setState(417);
			switch (_input.LA(1)) {
			case ID_CAP:
			case ID_UNCAP:
				enterOuterAlt(_localctx, 1);
				{
				setState(414); id();
				}
				break;
			case BIN_OP:
				enterOuterAlt(_localctx, 2);
				{
				setState(415); binaryOperator();
				}
				break;
			case SQ_OP:
				enterOuterAlt(_localctx, 3);
				{
				setState(416); indexOperator();
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
		enterRule(_localctx, 86, RULE_binaryOperator);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(419); match(BIN_OP);
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
		enterRule(_localctx, 88, RULE_indexOperator);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(421); match(SQ_OP);
			setState(422); match(SQ_CL);
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
		"\3\uacf5\uee8c\u4f5d\u8b0d\u4a45\u78bd\u1b2f\u3378\3\37\u01ab\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\3\2\7\2^\n\2\f\2\16\2a\13\2\3\3\3\3\3\3\3\3\3\3\5\3h"+
		"\n\3\3\3\7\3k\n\3\f\3\16\3n\13\3\3\4\3\4\3\4\3\4\3\4\3\4\3\4\5\4w\n\4"+
		"\3\5\3\5\3\5\3\5\3\5\3\6\3\6\5\6\u0080\n\6\3\7\3\7\3\7\5\7\u0085\n\7\3"+
		"\7\5\7\u0088\n\7\3\7\5\7\u008b\n\7\3\7\3\7\3\7\3\7\5\7\u0091\n\7\3\7\3"+
		"\7\3\7\3\7\7\7\u0097\n\7\f\7\16\7\u009a\13\7\5\7\u009c\n\7\3\b\3\b\3\b"+
		"\5\b\u00a1\n\b\3\b\5\b\u00a4\n\b\3\b\5\b\u00a7\n\b\3\b\3\b\3\b\5\b\u00ac"+
		"\n\b\3\b\3\b\3\b\3\b\7\b\u00b2\n\b\f\b\16\b\u00b5\13\b\5\b\u00b7\n\b\3"+
		"\t\3\t\3\t\3\t\3\t\5\t\u00be\n\t\3\n\3\n\3\13\3\13\3\f\3\f\3\f\3\f\5\f"+
		"\u00c8\n\f\3\r\3\r\3\16\3\16\6\16\u00ce\n\16\r\16\16\16\u00cf\3\16\3\16"+
		"\3\17\3\17\3\17\3\17\3\17\3\17\7\17\u00da\n\17\f\17\16\17\u00dd\13\17"+
		"\3\20\3\20\3\20\7\20\u00e2\n\20\f\20\16\20\u00e5\13\20\5\20\u00e7\n\20"+
		"\3\21\3\21\3\21\3\21\5\21\u00ed\n\21\5\21\u00ef\n\21\3\22\3\22\3\22\3"+
		"\22\5\22\u00f5\n\22\3\23\3\23\3\23\5\23\u00fa\n\23\3\23\3\23\5\23\u00fe"+
		"\n\23\3\23\5\23\u0101\n\23\3\23\3\23\3\23\3\23\3\23\6\23\u0108\n\23\r"+
		"\23\16\23\u0109\5\23\u010c\n\23\3\24\3\24\3\25\3\25\3\25\3\25\3\26\3\26"+
		"\3\27\3\27\3\27\3\27\7\27\u011a\n\27\f\27\16\27\u011d\13\27\3\30\3\30"+
		"\3\30\3\30\7\30\u0123\n\30\f\30\16\30\u0126\13\30\5\30\u0128\n\30\3\30"+
		"\3\30\3\31\3\31\3\31\3\31\5\31\u0130\n\31\3\32\3\32\3\32\3\33\3\33\3\33"+
		"\3\33\3\34\3\34\3\34\3\35\3\35\5\35\u013e\n\35\3\36\3\36\3\36\3\36\5\36"+
		"\u0144\n\36\3\36\5\36\u0147\n\36\3\36\3\36\5\36\u014b\n\36\3\37\3\37\3"+
		"\37\3\37\3\37\3\37\3 \3 \3 \3 \3 \3 \3 \3 \5 \u015b\n \3!\3!\3!\3!\3!"+
		"\3!\5!\u0163\n!\3\"\3\"\3#\3#\3$\3$\3$\7$\u016c\n$\f$\16$\u016f\13$\3"+
		"$\3$\3%\3%\3%\3%\3%\3%\3%\5%\u017a\n%\3&\3&\3&\7&\u017f\n&\f&\16&\u0182"+
		"\13&\3&\3&\3\'\3\'\6\'\u0188\n\'\r\'\16\'\u0189\3\'\3\'\5\'\u018e\n\'"+
		"\3(\3(\3(\7(\u0193\n(\f(\16(\u0196\13(\3(\3(\3)\3)\3*\3*\3*\3+\3+\3,\3"+
		",\3,\5,\u01a4\n,\3-\3-\3.\3.\3.\3.\2/\2\4\6\b\n\f\16\20\22\24\26\30\32"+
		"\34\36 \"$&(*,.\60\62\64\668:<>@BDFHJLNPRTVXZ\2\4\3\2\31\32\3\2\6\7\u01cb"+
		"\2_\3\2\2\2\4g\3\2\2\2\6o\3\2\2\2\bx\3\2\2\2\n}\3\2\2\2\f\u009b\3\2\2"+
		"\2\16\u009d\3\2\2\2\20\u00bd\3\2\2\2\22\u00bf\3\2\2\2\24\u00c1\3\2\2\2"+
		"\26\u00c3\3\2\2\2\30\u00c9\3\2\2\2\32\u00cb\3\2\2\2\34\u00d3\3\2\2\2\36"+
		"\u00e6\3\2\2\2 \u00ee\3\2\2\2\"\u00f4\3\2\2\2$\u010b\3\2\2\2&\u010d\3"+
		"\2\2\2(\u010f\3\2\2\2*\u0113\3\2\2\2,\u0115\3\2\2\2.\u011e\3\2\2\2\60"+
		"\u012f\3\2\2\2\62\u0131\3\2\2\2\64\u0134\3\2\2\2\66\u0138\3\2\2\28\u013b"+
		"\3\2\2\2:\u014a\3\2\2\2<\u014c\3\2\2\2>\u0152\3\2\2\2@\u0162\3\2\2\2B"+
		"\u0164\3\2\2\2D\u0166\3\2\2\2F\u0168\3\2\2\2H\u0172\3\2\2\2J\u017b\3\2"+
		"\2\2L\u018d\3\2\2\2N\u018f\3\2\2\2P\u0199\3\2\2\2R\u019b\3\2\2\2T\u019e"+
		"\3\2\2\2V\u01a3\3\2\2\2X\u01a5\3\2\2\2Z\u01a7\3\2\2\2\\^\5\4\3\2]\\\3"+
		"\2\2\2^a\3\2\2\2_]\3\2\2\2_`\3\2\2\2`\3\3\2\2\2a_\3\2\2\2bh\5\6\4\2ch"+
		"\5\26\f\2dh\5\22\n\2eh\5\b\5\2fh\5\n\6\2gb\3\2\2\2gc\3\2\2\2gd\3\2\2\2"+
		"ge\3\2\2\2gf\3\2\2\2hl\3\2\2\2ik\5\16\b\2ji\3\2\2\2kn\3\2\2\2lj\3\2\2"+
		"\2lm\3\2\2\2m\5\3\2\2\2nl\3\2\2\2ov\5T+\2pq\t\2\2\2qw\5\4\3\2rs\7\33\2"+
		"\2st\5L\'\2tu\5\4\3\2uw\3\2\2\2vp\3\2\2\2vr\3\2\2\2w\7\3\2\2\2xy\7\21"+
		"\2\2yz\5T+\2z{\3\2\2\2{|\5\4\3\2|\t\3\2\2\2}\177\5\20\t\2~\u0080\5\f\7"+
		"\2\177~\3\2\2\2\177\u0080\3\2\2\2\u0080\13\3\2\2\2\u0081\u0084\7\f\2\2"+
		"\u0082\u0085\5,\27\2\u0083\u0085\5*\26\2\u0084\u0082\3\2\2\2\u0084\u0083"+
		"\3\2\2\2\u0085\u0088\3\2\2\2\u0086\u0088\5\64\33\2\u0087\u0081\3\2\2\2"+
		"\u0087\u0086\3\2\2\2\u0088\u008a\3\2\2\2\u0089\u008b\5\f\7\2\u008a\u0089"+
		"\3\2\2\2\u008a\u008b\3\2\2\2\u008b\u009c\3\2\2\2\u008c\u008d\7\f\2\2\u008d"+
		"\u009c\5\34\17\2\u008e\u0090\5\62\32\2\u008f\u0091\5\f\7\2\u0090\u008f"+
		"\3\2\2\2\u0090\u0091\3\2\2\2\u0091\u009c\3\2\2\2\u0092\u009c\5> \2\u0093"+
		"\u009c\5<\37\2\u0094\u0098\5\66\34\2\u0095\u0097\5\66\34\2\u0096\u0095"+
		"\3\2\2\2\u0097\u009a\3\2\2\2\u0098\u0096\3\2\2\2\u0098\u0099\3\2\2\2\u0099"+
		"\u009c\3\2\2\2\u009a\u0098\3\2\2\2\u009b\u0087\3\2\2\2\u009b\u008c\3\2"+
		"\2\2\u009b\u008e\3\2\2\2\u009b\u0092\3\2\2\2\u009b\u0093\3\2\2\2\u009b"+
		"\u0094\3\2\2\2\u009c\r\3\2\2\2\u009d\u00b6\7\17\2\2\u009e\u00a1\5,\27"+
		"\2\u009f\u00a1\5*\26\2\u00a0\u009e\3\2\2\2\u00a0\u009f\3\2\2\2\u00a1\u00a4"+
		"\3\2\2\2\u00a2\u00a4\5\64\33\2\u00a3\u00a0\3\2\2\2\u00a3\u00a2\3\2\2\2"+
		"\u00a4\u00a6\3\2\2\2\u00a5\u00a7\5\f\7\2\u00a6\u00a5\3\2\2\2\u00a6\u00a7"+
		"\3\2\2\2\u00a7\u00b7\3\2\2\2\u00a8\u00b7\5\34\17\2\u00a9\u00ab\5\62\32"+
		"\2\u00aa\u00ac\5\f\7\2\u00ab\u00aa\3\2\2\2\u00ab\u00ac\3\2\2\2\u00ac\u00b7"+
		"\3\2\2\2\u00ad\u00b7\5> \2\u00ae\u00b7\5<\37\2\u00af\u00b3\5\66\34\2\u00b0"+
		"\u00b2\5\66\34\2\u00b1\u00b0\3\2\2\2\u00b2\u00b5\3\2\2\2\u00b3\u00b1\3"+
		"\2\2\2\u00b3\u00b4\3\2\2\2\u00b4\u00b7\3\2\2\2\u00b5\u00b3\3\2\2\2\u00b6"+
		"\u00a3\3\2\2\2\u00b6\u00a8\3\2\2\2\u00b6\u00a9\3\2\2\2\u00b6\u00ad\3\2"+
		"\2\2\u00b6\u00ae\3\2\2\2\u00b6\u00af\3\2\2\2\u00b7\17\3\2\2\2\u00b8\u00be"+
		"\5\24\13\2\u00b9\u00be\5\30\r\2\u00ba\u00be\5\32\16\2\u00bb\u00be\5@!"+
		"\2\u00bc\u00be\5R*\2\u00bd\u00b8\3\2\2\2\u00bd\u00b9\3\2\2\2\u00bd\u00ba"+
		"\3\2\2\2\u00bd\u00bb\3\2\2\2\u00bd\u00bc\3\2\2\2\u00be\21\3\2\2\2\u00bf"+
		"\u00c0\5\34\17\2\u00c0\23\3\2\2\2\u00c1\u00c2\5,\27\2\u00c2\25\3\2\2\2"+
		"\u00c3\u00c4\7\3\2\2\u00c4\u00c7\5T+\2\u00c5\u00c6\7\31\2\2\u00c6\u00c8"+
		"\5\4\3\2\u00c7\u00c5\3\2\2\2\u00c7\u00c8\3\2\2\2\u00c8\27\3\2\2\2\u00c9"+
		"\u00ca\5T+\2\u00ca\31\3\2\2\2\u00cb\u00cd\7\22\2\2\u00cc\u00ce\5\4\3\2"+
		"\u00cd\u00cc\3\2\2\2\u00ce\u00cf\3\2\2\2\u00cf\u00cd\3\2\2\2\u00cf\u00d0"+
		"\3\2\2\2\u00d0\u00d1\3\2\2\2\u00d1\u00d2\7\23\2\2\u00d2\33\3\2\2\2\u00d3"+
		"\u00d4\7\7\2\2\u00d4\u00d5\7\16\2\2\u00d5\u00db\5\36\20\2\u00d6\u00d7"+
		"\7\6\2\2\u00d7\u00d8\7\16\2\2\u00d8\u00da\5\36\20\2\u00d9\u00d6\3\2\2"+
		"\2\u00da\u00dd\3\2\2\2\u00db\u00d9\3\2\2\2\u00db\u00dc\3\2\2\2\u00dc\35"+
		"\3\2\2\2\u00dd\u00db\3\2\2\2\u00de\u00e3\5 \21\2\u00df\u00e0\7\r\2\2\u00e0"+
		"\u00e2\5 \21\2\u00e1\u00df\3\2\2\2\u00e2\u00e5\3\2\2\2\u00e3\u00e1\3\2"+
		"\2\2\u00e3\u00e4\3\2\2\2\u00e4\u00e7\3\2\2\2\u00e5\u00e3\3\2\2\2\u00e6"+
		"\u00de\3\2\2\2\u00e6\u00e7\3\2\2\2\u00e7\37\3\2\2\2\u00e8\u00ef\5&\24"+
		"\2\u00e9\u00ef\5\24\13\2\u00ea\u00ec\5\"\22\2\u00eb\u00ed\5$\23\2\u00ec"+
		"\u00eb\3\2\2\2\u00ec\u00ed\3\2\2\2\u00ed\u00ef\3\2\2\2\u00ee\u00e8\3\2"+
		"\2\2\u00ee\u00e9\3\2\2\2\u00ee\u00ea\3\2\2\2\u00ef!\3\2\2\2\u00f0\u00f5"+
		"\5\30\r\2\u00f1\u00f5\5\32\16\2\u00f2\u00f5\5@!\2\u00f3\u00f5\5R*\2\u00f4"+
		"\u00f0\3\2\2\2\u00f4\u00f1\3\2\2\2\u00f4\u00f2\3\2\2\2\u00f4\u00f3\3\2"+
		"\2\2\u00f5#\3\2\2\2\u00f6\u00f9\7\f\2\2\u00f7\u00fa\5,\27\2\u00f8\u00fa"+
		"\5*\26\2\u00f9\u00f7\3\2\2\2\u00f9\u00f8\3\2\2\2\u00fa\u00fe\3\2\2\2\u00fb"+
		"\u00fe\5\62\32\2\u00fc\u00fe\5\64\33\2\u00fd\u00f6\3\2\2\2\u00fd\u00fb"+
		"\3\2\2\2\u00fd\u00fc\3\2\2\2\u00fe\u0100\3\2\2\2\u00ff\u0101\5$\23\2\u0100"+
		"\u00ff\3\2\2\2\u0100\u0101\3\2\2\2\u0101\u010c\3\2\2\2\u0102\u0103\7\f"+
		"\2\2\u0103\u010c\5(\25\2\u0104\u010c\5> \2\u0105\u010c\5<\37\2\u0106\u0108"+
		"\5\66\34\2\u0107\u0106\3\2\2\2\u0108\u0109\3\2\2\2\u0109\u0107\3\2\2\2"+
		"\u0109\u010a\3\2\2\2\u010a\u010c\3\2\2\2\u010b\u00fd\3\2\2\2\u010b\u0102"+
		"\3\2\2\2\u010b\u0104\3\2\2\2\u010b\u0105\3\2\2\2\u010b\u0107\3\2\2\2\u010c"+
		"%\3\2\2\2\u010d\u010e\5(\25\2\u010e\'\3\2\2\2\u010f\u0110\7\7\2\2\u0110"+
		"\u0111\7\16\2\2\u0111\u0112\5 \21\2\u0112)\3\2\2\2\u0113\u0114\7\7\2\2"+
		"\u0114+\3\2\2\2\u0115\u0116\7\7\2\2\u0116\u011b\5.\30\2\u0117\u0118\7"+
		"\6\2\2\u0118\u011a\5.\30\2\u0119\u0117\3\2\2\2\u011a\u011d\3\2\2\2\u011b"+
		"\u0119\3\2\2\2\u011b\u011c\3\2\2\2\u011c-\3\2\2\2\u011d\u011b\3\2\2\2"+
		"\u011e\u0127\7\22\2\2\u011f\u0124\5\60\31\2\u0120\u0121\7\r\2\2\u0121"+
		"\u0123\5\60\31\2\u0122\u0120\3\2\2\2\u0123\u0126\3\2\2\2\u0124\u0122\3"+
		"\2\2\2\u0124\u0125\3\2\2\2\u0125\u0128\3\2\2\2\u0126\u0124\3\2\2\2\u0127"+
		"\u011f\3\2\2\2\u0127\u0128\3\2\2\2\u0128\u0129\3\2\2\2\u0129\u012a\7\23"+
		"\2\2\u012a/\3\2\2\2\u012b\u0130\5\6\4\2\u012c\u0130\5\26\f\2\u012d\u0130"+
		"\5\b\5\2\u012e\u0130\5\n\6\2\u012f\u012b\3\2\2\2\u012f\u012c\3\2\2\2\u012f"+
		"\u012d\3\2\2\2\u012f\u012e\3\2\2\2\u0130\61\3\2\2\2\u0131\u0132\7\13\2"+
		"\2\u0132\u0133\5V,\2\u0133\63\3\2\2\2\u0134\u0135\7\24\2\2\u0135\u0136"+
		"\5\4\3\2\u0136\u0137\7\25\2\2\u0137\65\3\2\2\2\u0138\u0139\7\30\2\2\u0139"+
		"\u013a\58\35\2\u013a\67\3\2\2\2\u013b\u013d\5\20\t\2\u013c\u013e\5:\36"+
		"\2\u013d\u013c\3\2\2\2\u013d\u013e\3\2\2\2\u013e9\3\2\2\2\u013f\u0140"+
		"\7\f\2\2\u0140\u0144\5,\27\2\u0141\u0144\5\62\32\2\u0142\u0144\5\64\33"+
		"\2\u0143\u013f\3\2\2\2\u0143\u0141\3\2\2\2\u0143\u0142\3\2\2\2\u0144\u0146"+
		"\3\2\2\2\u0145\u0147\5:\36\2\u0146\u0145\3\2\2\2\u0146\u0147\3\2\2\2\u0147"+
		"\u014b\3\2\2\2\u0148\u014b\5> \2\u0149\u014b\5<\37\2\u014a\u0143\3\2\2"+
		"\2\u014a\u0148\3\2\2\2\u014a\u0149\3\2\2\2\u014b;\3\2\2\2\u014c\u014d"+
		"\7\24\2\2\u014d\u014e\5\4\3\2\u014e\u014f\7\25\2\2\u014f\u0150\7\31\2"+
		"\2\u0150\u0151\5\4\3\2\u0151=\3\2\2\2\u0152\u0153\7\13\2\2\u0153\u015a"+
		"\5V,\2\u0154\u0155\t\2\2\2\u0155\u015b\5\4\3\2\u0156\u0157\7\33\2\2\u0157"+
		"\u0158\5L\'\2\u0158\u0159\5\4\3\2\u0159\u015b\3\2\2\2\u015a\u0154\3\2"+
		"\2\2\u015a\u0156\3\2\2\2\u015b?\3\2\2\2\u015c\u0163\5B\"\2\u015d\u0163"+
		"\5D#\2\u015e\u0163\5F$\2\u015f\u0163\5J&\2\u0160\u0163\5N(\2\u0161\u0163"+
		"\5P)\2\u0162\u015c\3\2\2\2\u0162\u015d\3\2\2\2\u0162\u015e\3\2\2\2\u0162"+
		"\u015f\3\2\2\2\u0162\u0160\3\2\2\2\u0162\u0161\3\2\2\2\u0163A\3\2\2\2"+
		"\u0164\u0165\7\5\2\2\u0165C\3\2\2\2\u0166\u0167\7\37\2\2\u0167E\3\2\2"+
		"\2\u0168\u0169\7\n\2\2\u0169\u016d\7\24\2\2\u016a\u016c\5H%\2\u016b\u016a"+
		"\3\2\2\2\u016c\u016f\3\2\2\2\u016d\u016b\3\2\2\2\u016d\u016e\3\2\2\2\u016e"+
		"\u0170\3\2\2\2\u016f\u016d\3\2\2\2\u0170\u0171\7\25\2\2\u0171G\3\2\2\2"+
		"\u0172\u0179\5V,\2\u0173\u0174\t\2\2\2\u0174\u017a\5\4\3\2\u0175\u0176"+
		"\7\33\2\2\u0176\u0177\5L\'\2\u0177\u0178\5\4\3\2\u0178\u017a\3\2\2\2\u0179"+
		"\u0173\3\2\2\2\u0179\u0175\3\2\2\2\u017aI\3\2\2\2\u017b\u017c\7\26\2\2"+
		"\u017c\u0180\5L\'\2\u017d\u017f\5\4\3\2\u017e\u017d\3\2\2\2\u017f\u0182"+
		"\3\2\2\2\u0180\u017e\3\2\2\2\u0180\u0181\3\2\2\2\u0181\u0183\3\2\2\2\u0182"+
		"\u0180\3\2\2\2\u0183\u0184\7\27\2\2\u0184K\3\2\2\2\u0185\u0187\7\t\2\2"+
		"\u0186\u0188\5T+\2\u0187\u0186\3\2\2\2\u0188\u0189\3\2\2\2\u0189\u0187"+
		"\3\2\2\2\u0189\u018a\3\2\2\2\u018a\u018b\3\2\2\2\u018b\u018c\7\t\2\2\u018c"+
		"\u018e\3\2\2\2\u018d\u0185\3\2\2\2\u018d\u018e\3\2\2\2\u018eM\3\2\2\2"+
		"\u018f\u0190\7\n\2\2\u0190\u0194\7\22\2\2\u0191\u0193\5\4\3\2\u0192\u0191"+
		"\3\2\2\2\u0193\u0196\3\2\2\2\u0194\u0192\3\2\2\2\u0194\u0195\3\2\2\2\u0195"+
		"\u0197\3\2\2\2\u0196\u0194\3\2\2\2\u0197\u0198\7\23\2\2\u0198O\3\2\2\2"+
		"\u0199\u019a\7\4\2\2\u019aQ\3\2\2\2\u019b\u019c\7\20\2\2\u019c\u019d\5"+
		"T+\2\u019dS\3\2\2\2\u019e\u019f\t\3\2\2\u019fU\3\2\2\2\u01a0\u01a4\5T"+
		"+\2\u01a1\u01a4\5X-\2\u01a2\u01a4\5Z.\2\u01a3\u01a0\3\2\2\2\u01a3\u01a1"+
		"\3\2\2\2\u01a3\u01a2\3\2\2\2\u01a4W\3\2\2\2\u01a5\u01a6\7\30\2\2\u01a6"+
		"Y\3\2\2\2\u01a7\u01a8\7\24\2\2\u01a8\u01a9\7\25\2\2\u01a9[\3\2\2\2\62"+
		"_glv\177\u0084\u0087\u008a\u0090\u0098\u009b\u00a0\u00a3\u00a6\u00ab\u00b3"+
		"\u00b6\u00bd\u00c7\u00cf\u00db\u00e3\u00e6\u00ec\u00ee\u00f4\u00f9\u00fd"+
		"\u0100\u0109\u010b\u011b\u0124\u0127\u012f\u013d\u0143\u0146\u014a\u015a"+
		"\u0162\u016d\u0179\u0180\u0189\u018d\u0194\u01a3";
	public static final ATN _ATN =
		ATNSimulator.deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}