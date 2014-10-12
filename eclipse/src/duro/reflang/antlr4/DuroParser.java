// Generated from C:\github\duro\eclipse\src\duro\reflang\antlr4_2\Duro.g4 by ANTLR 4.1
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
		VAR=1, PSEUDO_VAR=2, INT=3, ID_CAP=4, ID_UNCAP=5, PARAGRAPH=6, PIPE=7, 
		HASH=8, AT=9, DOT=10, SINGLE_QUOTE=11, COMMA=12, COLON=13, SEMI_COLON=14, 
		BACK_SLASH=15, DOLLAR=16, PAR_OP=17, PAR_CL=18, SQ_OP=19, SQ_CL=20, BRA_OP=21, 
		BAR_CL=22, BIN_OP=23, ASSIGN=24, ASSIGN_PROTO=25, ASSIGN_QUOTED=26, WS=27, 
		SINGLELINE_COMMENT=28, MULTI_LINE_COMMENT=29, STRING=30;
	public static final String[] tokenNames = {
		"<INVALID>", "'var'", "PSEUDO_VAR", "INT", "ID_CAP", "ID_UNCAP", "'§'", 
		"'|'", "'#'", "'@'", "'.'", "'''", "','", "':'", "';'", "'\\'", "'$'", 
		"'('", "')'", "'['", "']'", "'{'", "'}'", "BIN_OP", "'='", "'^='", "'=>'", 
		"WS", "SINGLELINE_COMMENT", "MULTI_LINE_COMMENT", "STRING"
	};
	public static final int
		RULE_program = 0, RULE_expression = 1, RULE_assignment = 2, RULE_interfaceId = 3, 
		RULE_messageExchange = 4, RULE_messageChain = 5, RULE_expressionChain = 6, 
		RULE_receiver = 7, RULE_selfMultiArgMessageNoPar = 8, RULE_selfMultiArgMessageWithPar = 9, 
		RULE_variableDeclaration = 10, RULE_access = 11, RULE_grouping = 12, RULE_multiArgMessageNoPar = 13, 
		RULE_multiArgMessageNoParHead = 14, RULE_multiArgMessageNoParTail = 15, 
		RULE_multiArgMessageArgsNoPar = 16, RULE_multiArgMessageArgNoPar = 17, 
		RULE_multiArgMessageArgNoParReceiver = 18, RULE_multiArgMessageArgNoParChain = 19, 
		RULE_atom = 20, RULE_selfSingleArgMessageNoPar = 21, RULE_singleArgMessageNoPar = 22, 
		RULE_unaryMessage = 23, RULE_multiArgMessageWithPar = 24, RULE_multiArgMessageArgsWithPar = 25, 
		RULE_multiArgMessageArgsWithParArg = 26, RULE_slotAccess = 27, RULE_indexAccess = 28, 
		RULE_binaryMessage = 29, RULE_binaryMessageOperand = 30, RULE_binaryMessageOperandChain = 31, 
		RULE_indexAssignment = 32, RULE_slotAssignment = 33, RULE_literal = 34, 
		RULE_integer = 35, RULE_string = 36, RULE_dict = 37, RULE_dictEntry = 38, 
		RULE_closure = 39, RULE_behaviorParams = 40, RULE_array = 41, RULE_pseudoVar = 42, 
		RULE_parArg = 43, RULE_id = 44, RULE_selector = 45, RULE_binaryOperator = 46, 
		RULE_indexOperator = 47;
	public static final String[] ruleNames = {
		"program", "expression", "assignment", "interfaceId", "messageExchange", 
		"messageChain", "expressionChain", "receiver", "selfMultiArgMessageNoPar", 
		"selfMultiArgMessageWithPar", "variableDeclaration", "access", "grouping", 
		"multiArgMessageNoPar", "multiArgMessageNoParHead", "multiArgMessageNoParTail", 
		"multiArgMessageArgsNoPar", "multiArgMessageArgNoPar", "multiArgMessageArgNoParReceiver", 
		"multiArgMessageArgNoParChain", "atom", "selfSingleArgMessageNoPar", "singleArgMessageNoPar", 
		"unaryMessage", "multiArgMessageWithPar", "multiArgMessageArgsWithPar", 
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
			setState(99);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << VAR) | (1L << PSEUDO_VAR) | (1L << INT) | (1L << ID_CAP) | (1L << ID_UNCAP) | (1L << HASH) | (1L << BACK_SLASH) | (1L << DOLLAR) | (1L << PAR_OP) | (1L << BRA_OP) | (1L << STRING))) != 0)) {
				{
				{
				setState(96); expression();
				}
				}
				setState(101);
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
			setState(107);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				{
				setState(102); assignment();
				}
				break;

			case 2:
				{
				setState(103); variableDeclaration();
				}
				break;

			case 3:
				{
				setState(104); selfMultiArgMessageNoPar();
				}
				break;

			case 4:
				{
				setState(105); interfaceId();
				}
				break;

			case 5:
				{
				setState(106); messageExchange();
				}
				break;
			}
			setState(112);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,2,_ctx);
			while ( _alt!=2 && _alt!=-1 ) {
				if ( _alt==1 ) {
					{
					{
					setState(109); expressionChain();
					}
					} 
				}
				setState(114);
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
			setState(115); id();
			setState(122);
			switch (_input.LA(1)) {
			case ASSIGN:
			case ASSIGN_PROTO:
				{
				{
				setState(116);
				((AssignmentContext)_localctx).op = _input.LT(1);
				_la = _input.LA(1);
				if ( !(_la==ASSIGN || _la==ASSIGN_PROTO) ) {
					((AssignmentContext)_localctx).op = (Token)_errHandler.recoverInline(this);
				}
				consume();
				setState(117); expression();
				}
				}
				break;
			case ASSIGN_QUOTED:
				{
				setState(118); ((AssignmentContext)_localctx).op = match(ASSIGN_QUOTED);
				setState(119); behaviorParams();
				setState(120); expression();
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
			setState(124); match(DOLLAR);
			setState(125); id();
			{
			}
			setState(127); expression();
			}
		}
		catch (RecognitionException re) {
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
			setState(129); receiver();
			setState(131);
			switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
			case 1:
				{
				setState(130); messageChain();
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
			setState(159);
			switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(139);
				switch (_input.LA(1)) {
				case DOT:
					{
					setState(133); match(DOT);
					setState(136);
					switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
					case 1:
						{
						setState(134); multiArgMessageWithPar();
						}
						break;

					case 2:
						{
						setState(135); unaryMessage();
						}
						break;
					}
					}
					break;
				case SQ_OP:
					{
					setState(138); indexAccess();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(142);
				switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
				case 1:
					{
					setState(141); messageChain();
					}
					break;
				}
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(144); match(DOT);
				setState(145); multiArgMessageNoPar();
				}
				break;

			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(146); slotAccess();
				setState(148);
				switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
				case 1:
					{
					setState(147); messageChain();
					}
					break;
				}
				}
				break;

			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(150); slotAssignment();
				}
				break;

			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(151); indexAssignment();
				}
				break;

			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(152); binaryMessage();
				setState(156);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,9,_ctx);
				while ( _alt!=2 && _alt!=-1 ) {
					if ( _alt==1 ) {
						{
						{
						setState(153); binaryMessage();
						}
						} 
					}
					setState(158);
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
			setState(161); match(SEMI_COLON);
			setState(186);
			switch ( getInterpreter().adaptivePredict(_input,16,_ctx) ) {
			case 1:
				{
				setState(167);
				switch (_input.LA(1)) {
				case ID_UNCAP:
					{
					setState(164);
					switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
					case 1:
						{
						setState(162); multiArgMessageWithPar();
						}
						break;

					case 2:
						{
						setState(163); unaryMessage();
						}
						break;
					}
					}
					break;
				case SQ_OP:
					{
					setState(166); indexAccess();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(170);
				switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
				case 1:
					{
					setState(169); messageChain();
					}
					break;
				}
				}
				break;

			case 2:
				{
				setState(172); multiArgMessageNoPar();
				}
				break;

			case 3:
				{
				setState(173); slotAccess();
				setState(175);
				switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
				case 1:
					{
					setState(174); messageChain();
					}
					break;
				}
				}
				break;

			case 4:
				{
				setState(177); slotAssignment();
				}
				break;

			case 5:
				{
				setState(178); indexAssignment();
				}
				break;

			case 6:
				{
				setState(179); binaryMessage();
				setState(183);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,15,_ctx);
				while ( _alt!=2 && _alt!=-1 ) {
					if ( _alt==1 ) {
						{
						{
						setState(180); binaryMessage();
						}
						} 
					}
					setState(185);
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
		public SelfMultiArgMessageWithParContext selfMultiArgMessageWithPar() {
			return getRuleContext(SelfMultiArgMessageWithParContext.class,0);
		}
		public AtomContext atom() {
			return getRuleContext(AtomContext.class,0);
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
			setState(190);
			switch ( getInterpreter().adaptivePredict(_input,17,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(188); selfMultiArgMessageWithPar();
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(189); atom();
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
			setState(192); multiArgMessageNoPar();
			}
		}
		catch (RecognitionException re) {
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
			setState(194); multiArgMessageWithPar();
			}
		}
		catch (RecognitionException re) {
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
			setState(196); match(VAR);
			setState(197); id();
			setState(200);
			_la = _input.LA(1);
			if (_la==ASSIGN) {
				{
				setState(198); match(ASSIGN);
				setState(199); expression();
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
			setState(202); id();
			}
		}
		catch (RecognitionException re) {
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
			setState(204); match(PAR_OP);
			setState(206); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(205); expression();
				}
				}
				setState(208); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << VAR) | (1L << PSEUDO_VAR) | (1L << INT) | (1L << ID_CAP) | (1L << ID_UNCAP) | (1L << HASH) | (1L << BACK_SLASH) | (1L << DOLLAR) | (1L << PAR_OP) | (1L << BRA_OP) | (1L << STRING))) != 0) );
			setState(210); match(PAR_CL);
			}
		}
		catch (RecognitionException re) {
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
		public List<MultiArgMessageNoParTailContext> multiArgMessageNoParTail() {
			return getRuleContexts(MultiArgMessageNoParTailContext.class);
		}
		public MultiArgMessageNoParTailContext multiArgMessageNoParTail(int i) {
			return getRuleContext(MultiArgMessageNoParTailContext.class,i);
		}
		public MultiArgMessageNoParHeadContext multiArgMessageNoParHead() {
			return getRuleContext(MultiArgMessageNoParHeadContext.class,0);
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
			setState(212); multiArgMessageNoParHead();
			setState(216);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,20,_ctx);
			while ( _alt!=2 && _alt!=-1 ) {
				if ( _alt==1 ) {
					{
					{
					setState(213); multiArgMessageNoParTail();
					}
					} 
				}
				setState(218);
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

	public static class MultiArgMessageNoParHeadContext extends ParserRuleContext {
		public Token modifier;
		public TerminalNode ID_UNCAP() { return getToken(DuroParser.ID_UNCAP, 0); }
		public TerminalNode COLON() { return getToken(DuroParser.COLON, 0); }
		public MultiArgMessageArgsNoParContext multiArgMessageArgsNoPar() {
			return getRuleContext(MultiArgMessageArgsNoParContext.class,0);
		}
		public TerminalNode SINGLE_QUOTE() { return getToken(DuroParser.SINGLE_QUOTE, 0); }
		public MultiArgMessageNoParHeadContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_multiArgMessageNoParHead; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DuroListener ) ((DuroListener)listener).enterMultiArgMessageNoParHead(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DuroListener ) ((DuroListener)listener).exitMultiArgMessageNoParHead(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DuroVisitor ) return ((DuroVisitor<? extends T>)visitor).visitMultiArgMessageNoParHead(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MultiArgMessageNoParHeadContext multiArgMessageNoParHead() throws RecognitionException {
		MultiArgMessageNoParHeadContext _localctx = new MultiArgMessageNoParHeadContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_multiArgMessageNoParHead);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(219); match(ID_UNCAP);
			setState(220);
			((MultiArgMessageNoParHeadContext)_localctx).modifier = _input.LT(1);
			_la = _input.LA(1);
			if ( !(_la==SINGLE_QUOTE || _la==COLON) ) {
				((MultiArgMessageNoParHeadContext)_localctx).modifier = (Token)_errHandler.recoverInline(this);
			}
			consume();
			setState(221); multiArgMessageArgsNoPar();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class MultiArgMessageNoParTailContext extends ParserRuleContext {
		public Token modifier;
		public TerminalNode ID_CAP() { return getToken(DuroParser.ID_CAP, 0); }
		public TerminalNode COLON() { return getToken(DuroParser.COLON, 0); }
		public MultiArgMessageArgsNoParContext multiArgMessageArgsNoPar() {
			return getRuleContext(MultiArgMessageArgsNoParContext.class,0);
		}
		public TerminalNode SINGLE_QUOTE() { return getToken(DuroParser.SINGLE_QUOTE, 0); }
		public MultiArgMessageNoParTailContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_multiArgMessageNoParTail; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DuroListener ) ((DuroListener)listener).enterMultiArgMessageNoParTail(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DuroListener ) ((DuroListener)listener).exitMultiArgMessageNoParTail(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DuroVisitor ) return ((DuroVisitor<? extends T>)visitor).visitMultiArgMessageNoParTail(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MultiArgMessageNoParTailContext multiArgMessageNoParTail() throws RecognitionException {
		MultiArgMessageNoParTailContext _localctx = new MultiArgMessageNoParTailContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_multiArgMessageNoParTail);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(223); match(ID_CAP);
			setState(224);
			((MultiArgMessageNoParTailContext)_localctx).modifier = _input.LT(1);
			_la = _input.LA(1);
			if ( !(_la==SINGLE_QUOTE || _la==COLON) ) {
				((MultiArgMessageNoParTailContext)_localctx).modifier = (Token)_errHandler.recoverInline(this);
			}
			consume();
			setState(225); multiArgMessageArgsNoPar();
			}
		}
		catch (RecognitionException re) {
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
		enterRule(_localctx, 32, RULE_multiArgMessageArgsNoPar);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(235);
			switch ( getInterpreter().adaptivePredict(_input,22,_ctx) ) {
			case 1:
				{
				setState(227); multiArgMessageArgNoPar();
				setState(232);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,21,_ctx);
				while ( _alt!=2 && _alt!=-1 ) {
					if ( _alt==1 ) {
						{
						{
						setState(228); match(COMMA);
						setState(229); multiArgMessageArgNoPar();
						}
						} 
					}
					setState(234);
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
		enterRule(_localctx, 34, RULE_multiArgMessageArgNoPar);
		try {
			setState(243);
			switch ( getInterpreter().adaptivePredict(_input,24,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(237); selfSingleArgMessageNoPar();
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(238); selfMultiArgMessageWithPar();
				}
				break;

			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(239); multiArgMessageArgNoParReceiver();
				setState(241);
				switch ( getInterpreter().adaptivePredict(_input,23,_ctx) ) {
				case 1:
					{
					setState(240); multiArgMessageArgNoParChain();
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
		public AtomContext atom() {
			return getRuleContext(AtomContext.class,0);
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
		enterRule(_localctx, 36, RULE_multiArgMessageArgNoParReceiver);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(245); atom();
			}
		}
		catch (RecognitionException re) {
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
		enterRule(_localctx, 38, RULE_multiArgMessageArgNoParChain);
		try {
			int _alt;
			setState(268);
			switch ( getInterpreter().adaptivePredict(_input,29,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(254);
				switch (_input.LA(1)) {
				case DOT:
					{
					setState(247); match(DOT);
					setState(250);
					switch ( getInterpreter().adaptivePredict(_input,25,_ctx) ) {
					case 1:
						{
						setState(248); multiArgMessageWithPar();
						}
						break;

					case 2:
						{
						setState(249); unaryMessage();
						}
						break;
					}
					}
					break;
				case AT:
					{
					setState(252); slotAccess();
					}
					break;
				case SQ_OP:
					{
					setState(253); indexAccess();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(257);
				switch ( getInterpreter().adaptivePredict(_input,27,_ctx) ) {
				case 1:
					{
					setState(256); multiArgMessageArgNoParChain();
					}
					break;
				}
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(259); match(DOT);
				setState(260); singleArgMessageNoPar();
				}
				break;

			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(261); slotAssignment();
				}
				break;

			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(262); indexAssignment();
				}
				break;

			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(264); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,28,_ctx);
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(263); binaryMessage();
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(266); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,28,_ctx);
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
		public PseudoVarContext pseudoVar() {
			return getRuleContext(PseudoVarContext.class,0);
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
		enterRule(_localctx, 40, RULE_atom);
		try {
			setState(275);
			switch (_input.LA(1)) {
			case ID_CAP:
			case ID_UNCAP:
				enterOuterAlt(_localctx, 1);
				{
				setState(270); access();
				}
				break;
			case PAR_OP:
				enterOuterAlt(_localctx, 2);
				{
				setState(271); grouping();
				}
				break;
			case INT:
			case HASH:
			case BRA_OP:
			case STRING:
				enterOuterAlt(_localctx, 3);
				{
				setState(272); literal();
				}
				break;
			case PSEUDO_VAR:
				enterOuterAlt(_localctx, 4);
				{
				setState(273); pseudoVar();
				}
				break;
			case BACK_SLASH:
				enterOuterAlt(_localctx, 5);
				{
				setState(274); parArg();
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
		enterRule(_localctx, 42, RULE_selfSingleArgMessageNoPar);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(277); singleArgMessageNoPar();
			}
		}
		catch (RecognitionException re) {
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
		public Token modifier;
		public MultiArgMessageArgNoParContext multiArgMessageArgNoPar() {
			return getRuleContext(MultiArgMessageArgNoParContext.class,0);
		}
		public TerminalNode ID_UNCAP() { return getToken(DuroParser.ID_UNCAP, 0); }
		public TerminalNode COLON() { return getToken(DuroParser.COLON, 0); }
		public TerminalNode SINGLE_QUOTE() { return getToken(DuroParser.SINGLE_QUOTE, 0); }
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
		enterRule(_localctx, 44, RULE_singleArgMessageNoPar);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(279); match(ID_UNCAP);
			setState(280);
			((SingleArgMessageNoParContext)_localctx).modifier = _input.LT(1);
			_la = _input.LA(1);
			if ( !(_la==SINGLE_QUOTE || _la==COLON) ) {
				((SingleArgMessageNoParContext)_localctx).modifier = (Token)_errHandler.recoverInline(this);
			}
			consume();
			setState(281); multiArgMessageArgNoPar();
			}
		}
		catch (RecognitionException re) {
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
		enterRule(_localctx, 46, RULE_unaryMessage);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(283); match(ID_UNCAP);
			}
		}
		catch (RecognitionException re) {
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
		enterRule(_localctx, 48, RULE_multiArgMessageWithPar);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(285); match(ID_UNCAP);
			setState(286); multiArgMessageArgsWithPar();
			setState(291);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,31,_ctx);
			while ( _alt!=2 && _alt!=-1 ) {
				if ( _alt==1 ) {
					{
					{
					setState(287); match(ID_CAP);
					setState(288); multiArgMessageArgsWithPar();
					}
					} 
				}
				setState(293);
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
		enterRule(_localctx, 50, RULE_multiArgMessageArgsWithPar);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(294); match(PAR_OP);
			setState(303);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << VAR) | (1L << PSEUDO_VAR) | (1L << INT) | (1L << ID_CAP) | (1L << ID_UNCAP) | (1L << HASH) | (1L << BACK_SLASH) | (1L << DOLLAR) | (1L << PAR_OP) | (1L << BRA_OP) | (1L << STRING))) != 0)) {
				{
				setState(295); multiArgMessageArgsWithParArg();
				setState(300);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(296); match(COMMA);
					setState(297); multiArgMessageArgsWithParArg();
					}
					}
					setState(302);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(305); match(PAR_CL);
			}
		}
		catch (RecognitionException re) {
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
		enterRule(_localctx, 52, RULE_multiArgMessageArgsWithParArg);
		try {
			setState(311);
			switch ( getInterpreter().adaptivePredict(_input,34,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(307); assignment();
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(308); variableDeclaration();
				}
				break;

			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(309); interfaceId();
				}
				break;

			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(310); messageExchange();
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
		enterRule(_localctx, 54, RULE_slotAccess);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(313); match(AT);
			setState(314); selector();
			}
		}
		catch (RecognitionException re) {
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
		enterRule(_localctx, 56, RULE_indexAccess);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(316); match(SQ_OP);
			setState(317); expression();
			setState(318); match(SQ_CL);
			}
		}
		catch (RecognitionException re) {
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
		enterRule(_localctx, 58, RULE_binaryMessage);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(320); match(BIN_OP);
			setState(321); binaryMessageOperand();
			}
		}
		catch (RecognitionException re) {
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
		enterRule(_localctx, 60, RULE_binaryMessageOperand);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(323); receiver();
			setState(325);
			switch ( getInterpreter().adaptivePredict(_input,35,_ctx) ) {
			case 1:
				{
				setState(324); binaryMessageOperandChain();
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
		enterRule(_localctx, 62, RULE_binaryMessageOperandChain);
		try {
			setState(338);
			switch ( getInterpreter().adaptivePredict(_input,38,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(331);
				switch (_input.LA(1)) {
				case DOT:
					{
					setState(327); match(DOT);
					setState(328); multiArgMessageWithPar();
					}
					break;
				case AT:
					{
					setState(329); slotAccess();
					}
					break;
				case SQ_OP:
					{
					setState(330); indexAccess();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(334);
				switch ( getInterpreter().adaptivePredict(_input,37,_ctx) ) {
				case 1:
					{
					setState(333); binaryMessageOperandChain();
					}
					break;
				}
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(336); slotAssignment();
				}
				break;

			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(337); indexAssignment();
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
		enterRule(_localctx, 64, RULE_indexAssignment);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(340); match(SQ_OP);
			setState(341); expression();
			setState(342); match(SQ_CL);
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
		enterRule(_localctx, 66, RULE_slotAssignment);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(346); match(AT);
			setState(347); selector();
			setState(354);
			switch (_input.LA(1)) {
			case ASSIGN:
			case ASSIGN_PROTO:
				{
				{
				setState(348);
				((SlotAssignmentContext)_localctx).op = _input.LT(1);
				_la = _input.LA(1);
				if ( !(_la==ASSIGN || _la==ASSIGN_PROTO) ) {
					((SlotAssignmentContext)_localctx).op = (Token)_errHandler.recoverInline(this);
				}
				consume();
				setState(349); expression();
				}
				}
				break;
			case ASSIGN_QUOTED:
				{
				setState(350); ((SlotAssignmentContext)_localctx).op = match(ASSIGN_QUOTED);
				setState(351); behaviorParams();
				setState(352); expression();
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
		enterRule(_localctx, 68, RULE_literal);
		try {
			setState(361);
			switch ( getInterpreter().adaptivePredict(_input,40,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(356); integer();
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(357); string();
				}
				break;

			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(358); dict();
				}
				break;

			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(359); closure();
				}
				break;

			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(360); array();
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
		enterRule(_localctx, 70, RULE_integer);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(363); match(INT);
			}
		}
		catch (RecognitionException re) {
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
		enterRule(_localctx, 72, RULE_string);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(365); match(STRING);
			}
		}
		catch (RecognitionException re) {
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
		enterRule(_localctx, 74, RULE_dict);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(367); match(HASH);
			setState(368); match(SQ_OP);
			setState(372);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ID_CAP) | (1L << ID_UNCAP) | (1L << SQ_OP) | (1L << BIN_OP))) != 0)) {
				{
				{
				setState(369); dictEntry();
				}
				}
				setState(374);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(375); match(SQ_CL);
			}
		}
		catch (RecognitionException re) {
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
		enterRule(_localctx, 76, RULE_dictEntry);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(377); selector();
			setState(384);
			switch (_input.LA(1)) {
			case ASSIGN:
			case ASSIGN_PROTO:
				{
				{
				setState(378);
				((DictEntryContext)_localctx).op = _input.LT(1);
				_la = _input.LA(1);
				if ( !(_la==ASSIGN || _la==ASSIGN_PROTO) ) {
					((DictEntryContext)_localctx).op = (Token)_errHandler.recoverInline(this);
				}
				consume();
				setState(379); expression();
				}
				}
				break;
			case ASSIGN_QUOTED:
				{
				setState(380); ((DictEntryContext)_localctx).op = match(ASSIGN_QUOTED);
				setState(381); behaviorParams();
				setState(382); expression();
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
		enterRule(_localctx, 78, RULE_closure);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(386); match(BRA_OP);
			setState(387); behaviorParams();
			{
			setState(391);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << VAR) | (1L << PSEUDO_VAR) | (1L << INT) | (1L << ID_CAP) | (1L << ID_UNCAP) | (1L << HASH) | (1L << BACK_SLASH) | (1L << DOLLAR) | (1L << PAR_OP) | (1L << BRA_OP) | (1L << STRING))) != 0)) {
				{
				{
				setState(388); expression();
				}
				}
				setState(393);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
			setState(394); match(BAR_CL);
			}
		}
		catch (RecognitionException re) {
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
		enterRule(_localctx, 80, RULE_behaviorParams);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(404);
			_la = _input.LA(1);
			if (_la==PIPE) {
				{
				setState(396); match(PIPE);
				setState(398); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(397); id();
					}
					}
					setState(400); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==ID_CAP || _la==ID_UNCAP );
				setState(402); match(PIPE);
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
		enterRule(_localctx, 82, RULE_array);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(406); match(HASH);
			setState(407); match(PAR_OP);
			setState(411);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << VAR) | (1L << PSEUDO_VAR) | (1L << INT) | (1L << ID_CAP) | (1L << ID_UNCAP) | (1L << HASH) | (1L << BACK_SLASH) | (1L << DOLLAR) | (1L << PAR_OP) | (1L << BRA_OP) | (1L << STRING))) != 0)) {
				{
				{
				setState(408); expression();
				}
				}
				setState(413);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(414); match(PAR_CL);
			}
		}
		catch (RecognitionException re) {
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
		enterRule(_localctx, 84, RULE_pseudoVar);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(416); match(PSEUDO_VAR);
			}
		}
		catch (RecognitionException re) {
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
		enterRule(_localctx, 86, RULE_parArg);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(418); match(BACK_SLASH);
			setState(419); id();
			}
		}
		catch (RecognitionException re) {
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
		enterRule(_localctx, 88, RULE_id);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(421);
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
		enterRule(_localctx, 90, RULE_selector);
		try {
			setState(426);
			switch (_input.LA(1)) {
			case ID_CAP:
			case ID_UNCAP:
				enterOuterAlt(_localctx, 1);
				{
				setState(423); id();
				}
				break;
			case BIN_OP:
				enterOuterAlt(_localctx, 2);
				{
				setState(424); binaryOperator();
				}
				break;
			case SQ_OP:
				enterOuterAlt(_localctx, 3);
				{
				setState(425); indexOperator();
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
		enterRule(_localctx, 92, RULE_binaryOperator);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(428); match(BIN_OP);
			}
		}
		catch (RecognitionException re) {
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
		enterRule(_localctx, 94, RULE_indexOperator);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(430); match(SQ_OP);
			setState(431); match(SQ_CL);
			}
		}
		catch (RecognitionException re) {
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
		"\3\uacf5\uee8c\u4f5d\u8b0d\u4a45\u78bd\u1b2f\u3378\3 \u01b4\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\3\2\7\2d\n\2\f\2\16\2g\13\2"+
		"\3\3\3\3\3\3\3\3\3\3\5\3n\n\3\3\3\7\3q\n\3\f\3\16\3t\13\3\3\4\3\4\3\4"+
		"\3\4\3\4\3\4\3\4\5\4}\n\4\3\5\3\5\3\5\3\5\3\5\3\6\3\6\5\6\u0086\n\6\3"+
		"\7\3\7\3\7\5\7\u008b\n\7\3\7\5\7\u008e\n\7\3\7\5\7\u0091\n\7\3\7\3\7\3"+
		"\7\3\7\5\7\u0097\n\7\3\7\3\7\3\7\3\7\7\7\u009d\n\7\f\7\16\7\u00a0\13\7"+
		"\5\7\u00a2\n\7\3\b\3\b\3\b\5\b\u00a7\n\b\3\b\5\b\u00aa\n\b\3\b\5\b\u00ad"+
		"\n\b\3\b\3\b\3\b\5\b\u00b2\n\b\3\b\3\b\3\b\3\b\7\b\u00b8\n\b\f\b\16\b"+
		"\u00bb\13\b\5\b\u00bd\n\b\3\t\3\t\5\t\u00c1\n\t\3\n\3\n\3\13\3\13\3\f"+
		"\3\f\3\f\3\f\5\f\u00cb\n\f\3\r\3\r\3\16\3\16\6\16\u00d1\n\16\r\16\16\16"+
		"\u00d2\3\16\3\16\3\17\3\17\7\17\u00d9\n\17\f\17\16\17\u00dc\13\17\3\20"+
		"\3\20\3\20\3\20\3\21\3\21\3\21\3\21\3\22\3\22\3\22\7\22\u00e9\n\22\f\22"+
		"\16\22\u00ec\13\22\5\22\u00ee\n\22\3\23\3\23\3\23\3\23\5\23\u00f4\n\23"+
		"\5\23\u00f6\n\23\3\24\3\24\3\25\3\25\3\25\5\25\u00fd\n\25\3\25\3\25\5"+
		"\25\u0101\n\25\3\25\5\25\u0104\n\25\3\25\3\25\3\25\3\25\3\25\6\25\u010b"+
		"\n\25\r\25\16\25\u010c\5\25\u010f\n\25\3\26\3\26\3\26\3\26\3\26\5\26\u0116"+
		"\n\26\3\27\3\27\3\30\3\30\3\30\3\30\3\31\3\31\3\32\3\32\3\32\3\32\7\32"+
		"\u0124\n\32\f\32\16\32\u0127\13\32\3\33\3\33\3\33\3\33\7\33\u012d\n\33"+
		"\f\33\16\33\u0130\13\33\5\33\u0132\n\33\3\33\3\33\3\34\3\34\3\34\3\34"+
		"\5\34\u013a\n\34\3\35\3\35\3\35\3\36\3\36\3\36\3\36\3\37\3\37\3\37\3 "+
		"\3 \5 \u0148\n \3!\3!\3!\3!\5!\u014e\n!\3!\5!\u0151\n!\3!\3!\5!\u0155"+
		"\n!\3\"\3\"\3\"\3\"\3\"\3\"\3#\3#\3#\3#\3#\3#\3#\3#\5#\u0165\n#\3$\3$"+
		"\3$\3$\3$\5$\u016c\n$\3%\3%\3&\3&\3\'\3\'\3\'\7\'\u0175\n\'\f\'\16\'\u0178"+
		"\13\'\3\'\3\'\3(\3(\3(\3(\3(\3(\3(\5(\u0183\n(\3)\3)\3)\7)\u0188\n)\f"+
		")\16)\u018b\13)\3)\3)\3*\3*\6*\u0191\n*\r*\16*\u0192\3*\3*\5*\u0197\n"+
		"*\3+\3+\3+\7+\u019c\n+\f+\16+\u019f\13+\3+\3+\3,\3,\3-\3-\3-\3.\3.\3/"+
		"\3/\3/\5/\u01ad\n/\3\60\3\60\3\61\3\61\3\61\3\61\2\62\2\4\6\b\n\f\16\20"+
		"\22\24\26\30\32\34\36 \"$&(*,.\60\62\64\668:<>@BDFHJLNPRTVXZ\\^`\2\5\3"+
		"\2\32\33\4\2\r\r\17\17\3\2\6\7\u01ce\2e\3\2\2\2\4m\3\2\2\2\6u\3\2\2\2"+
		"\b~\3\2\2\2\n\u0083\3\2\2\2\f\u00a1\3\2\2\2\16\u00a3\3\2\2\2\20\u00c0"+
		"\3\2\2\2\22\u00c2\3\2\2\2\24\u00c4\3\2\2\2\26\u00c6\3\2\2\2\30\u00cc\3"+
		"\2\2\2\32\u00ce\3\2\2\2\34\u00d6\3\2\2\2\36\u00dd\3\2\2\2 \u00e1\3\2\2"+
		"\2\"\u00ed\3\2\2\2$\u00f5\3\2\2\2&\u00f7\3\2\2\2(\u010e\3\2\2\2*\u0115"+
		"\3\2\2\2,\u0117\3\2\2\2.\u0119\3\2\2\2\60\u011d\3\2\2\2\62\u011f\3\2\2"+
		"\2\64\u0128\3\2\2\2\66\u0139\3\2\2\28\u013b\3\2\2\2:\u013e\3\2\2\2<\u0142"+
		"\3\2\2\2>\u0145\3\2\2\2@\u0154\3\2\2\2B\u0156\3\2\2\2D\u015c\3\2\2\2F"+
		"\u016b\3\2\2\2H\u016d\3\2\2\2J\u016f\3\2\2\2L\u0171\3\2\2\2N\u017b\3\2"+
		"\2\2P\u0184\3\2\2\2R\u0196\3\2\2\2T\u0198\3\2\2\2V\u01a2\3\2\2\2X\u01a4"+
		"\3\2\2\2Z\u01a7\3\2\2\2\\\u01ac\3\2\2\2^\u01ae\3\2\2\2`\u01b0\3\2\2\2"+
		"bd\5\4\3\2cb\3\2\2\2dg\3\2\2\2ec\3\2\2\2ef\3\2\2\2f\3\3\2\2\2ge\3\2\2"+
		"\2hn\5\6\4\2in\5\26\f\2jn\5\22\n\2kn\5\b\5\2ln\5\n\6\2mh\3\2\2\2mi\3\2"+
		"\2\2mj\3\2\2\2mk\3\2\2\2ml\3\2\2\2nr\3\2\2\2oq\5\16\b\2po\3\2\2\2qt\3"+
		"\2\2\2rp\3\2\2\2rs\3\2\2\2s\5\3\2\2\2tr\3\2\2\2u|\5Z.\2vw\t\2\2\2w}\5"+
		"\4\3\2xy\7\34\2\2yz\5R*\2z{\5\4\3\2{}\3\2\2\2|v\3\2\2\2|x\3\2\2\2}\7\3"+
		"\2\2\2~\177\7\22\2\2\177\u0080\5Z.\2\u0080\u0081\3\2\2\2\u0081\u0082\5"+
		"\4\3\2\u0082\t\3\2\2\2\u0083\u0085\5\20\t\2\u0084\u0086\5\f\7\2\u0085"+
		"\u0084\3\2\2\2\u0085\u0086\3\2\2\2\u0086\13\3\2\2\2\u0087\u008a\7\f\2"+
		"\2\u0088\u008b\5\62\32\2\u0089\u008b\5\60\31\2\u008a\u0088\3\2\2\2\u008a"+
		"\u0089\3\2\2\2\u008b\u008e\3\2\2\2\u008c\u008e\5:\36\2\u008d\u0087\3\2"+
		"\2\2\u008d\u008c\3\2\2\2\u008e\u0090\3\2\2\2\u008f\u0091\5\f\7\2\u0090"+
		"\u008f\3\2\2\2\u0090\u0091\3\2\2\2\u0091\u00a2\3\2\2\2\u0092\u0093\7\f"+
		"\2\2\u0093\u00a2\5\34\17\2\u0094\u0096\58\35\2\u0095\u0097\5\f\7\2\u0096"+
		"\u0095\3\2\2\2\u0096\u0097\3\2\2\2\u0097\u00a2\3\2\2\2\u0098\u00a2\5D"+
		"#\2\u0099\u00a2\5B\"\2\u009a\u009e\5<\37\2\u009b\u009d\5<\37\2\u009c\u009b"+
		"\3\2\2\2\u009d\u00a0\3\2\2\2\u009e\u009c\3\2\2\2\u009e\u009f\3\2\2\2\u009f"+
		"\u00a2\3\2\2\2\u00a0\u009e\3\2\2\2\u00a1\u008d\3\2\2\2\u00a1\u0092\3\2"+
		"\2\2\u00a1\u0094\3\2\2\2\u00a1\u0098\3\2\2\2\u00a1\u0099\3\2\2\2\u00a1"+
		"\u009a\3\2\2\2\u00a2\r\3\2\2\2\u00a3\u00bc\7\20\2\2\u00a4\u00a7\5\62\32"+
		"\2\u00a5\u00a7\5\60\31\2\u00a6\u00a4\3\2\2\2\u00a6\u00a5\3\2\2\2\u00a7"+
		"\u00aa\3\2\2\2\u00a8\u00aa\5:\36\2\u00a9\u00a6\3\2\2\2\u00a9\u00a8\3\2"+
		"\2\2\u00aa\u00ac\3\2\2\2\u00ab\u00ad\5\f\7\2\u00ac\u00ab\3\2\2\2\u00ac"+
		"\u00ad\3\2\2\2\u00ad\u00bd\3\2\2\2\u00ae\u00bd\5\34\17\2\u00af\u00b1\5"+
		"8\35\2\u00b0\u00b2\5\f\7\2\u00b1\u00b0\3\2\2\2\u00b1\u00b2\3\2\2\2\u00b2"+
		"\u00bd\3\2\2\2\u00b3\u00bd\5D#\2\u00b4\u00bd\5B\"\2\u00b5\u00b9\5<\37"+
		"\2\u00b6\u00b8\5<\37\2\u00b7\u00b6\3\2\2\2\u00b8\u00bb\3\2\2\2\u00b9\u00b7"+
		"\3\2\2\2\u00b9\u00ba\3\2\2\2\u00ba\u00bd\3\2\2\2\u00bb\u00b9\3\2\2\2\u00bc"+
		"\u00a9\3\2\2\2\u00bc\u00ae\3\2\2\2\u00bc\u00af\3\2\2\2\u00bc\u00b3\3\2"+
		"\2\2\u00bc\u00b4\3\2\2\2\u00bc\u00b5\3\2\2\2\u00bd\17\3\2\2\2\u00be\u00c1"+
		"\5\24\13\2\u00bf\u00c1\5*\26\2\u00c0\u00be\3\2\2\2\u00c0\u00bf\3\2\2\2"+
		"\u00c1\21\3\2\2\2\u00c2\u00c3\5\34\17\2\u00c3\23\3\2\2\2\u00c4\u00c5\5"+
		"\62\32\2\u00c5\25\3\2\2\2\u00c6\u00c7\7\3\2\2\u00c7\u00ca\5Z.\2\u00c8"+
		"\u00c9\7\32\2\2\u00c9\u00cb\5\4\3\2\u00ca\u00c8\3\2\2\2\u00ca\u00cb\3"+
		"\2\2\2\u00cb\27\3\2\2\2\u00cc\u00cd\5Z.\2\u00cd\31\3\2\2\2\u00ce\u00d0"+
		"\7\23\2\2\u00cf\u00d1\5\4\3\2\u00d0\u00cf\3\2\2\2\u00d1\u00d2\3\2\2\2"+
		"\u00d2\u00d0\3\2\2\2\u00d2\u00d3\3\2\2\2\u00d3\u00d4\3\2\2\2\u00d4\u00d5"+
		"\7\24\2\2\u00d5\33\3\2\2\2\u00d6\u00da\5\36\20\2\u00d7\u00d9\5 \21\2\u00d8"+
		"\u00d7\3\2\2\2\u00d9\u00dc\3\2\2\2\u00da\u00d8\3\2\2\2\u00da\u00db\3\2"+
		"\2\2\u00db\35\3\2\2\2\u00dc\u00da\3\2\2\2\u00dd\u00de\7\7\2\2\u00de\u00df"+
		"\t\3\2\2\u00df\u00e0\5\"\22\2\u00e0\37\3\2\2\2\u00e1\u00e2\7\6\2\2\u00e2"+
		"\u00e3\t\3\2\2\u00e3\u00e4\5\"\22\2\u00e4!\3\2\2\2\u00e5\u00ea\5$\23\2"+
		"\u00e6\u00e7\7\16\2\2\u00e7\u00e9\5$\23\2\u00e8\u00e6\3\2\2\2\u00e9\u00ec"+
		"\3\2\2\2\u00ea\u00e8\3\2\2\2\u00ea\u00eb\3\2\2\2\u00eb\u00ee\3\2\2\2\u00ec"+
		"\u00ea\3\2\2\2\u00ed\u00e5\3\2\2\2\u00ed\u00ee\3\2\2\2\u00ee#\3\2\2\2"+
		"\u00ef\u00f6\5,\27\2\u00f0\u00f6\5\24\13\2\u00f1\u00f3\5&\24\2\u00f2\u00f4"+
		"\5(\25\2\u00f3\u00f2\3\2\2\2\u00f3\u00f4\3\2\2\2\u00f4\u00f6\3\2\2\2\u00f5"+
		"\u00ef\3\2\2\2\u00f5\u00f0\3\2\2\2\u00f5\u00f1\3\2\2\2\u00f6%\3\2\2\2"+
		"\u00f7\u00f8\5*\26\2\u00f8\'\3\2\2\2\u00f9\u00fc\7\f\2\2\u00fa\u00fd\5"+
		"\62\32\2\u00fb\u00fd\5\60\31\2\u00fc\u00fa\3\2\2\2\u00fc\u00fb\3\2\2\2"+
		"\u00fd\u0101\3\2\2\2\u00fe\u0101\58\35\2\u00ff\u0101\5:\36\2\u0100\u00f9"+
		"\3\2\2\2\u0100\u00fe\3\2\2\2\u0100\u00ff\3\2\2\2\u0101\u0103\3\2\2\2\u0102"+
		"\u0104\5(\25\2\u0103\u0102\3\2\2\2\u0103\u0104\3\2\2\2\u0104\u010f\3\2"+
		"\2\2\u0105\u0106\7\f\2\2\u0106\u010f\5.\30\2\u0107\u010f\5D#\2\u0108\u010f"+
		"\5B\"\2\u0109\u010b\5<\37\2\u010a\u0109\3\2\2\2\u010b\u010c\3\2\2\2\u010c"+
		"\u010a\3\2\2\2\u010c\u010d\3\2\2\2\u010d\u010f\3\2\2\2\u010e\u0100\3\2"+
		"\2\2\u010e\u0105\3\2\2\2\u010e\u0107\3\2\2\2\u010e\u0108\3\2\2\2\u010e"+
		"\u010a\3\2\2\2\u010f)\3\2\2\2\u0110\u0116\5\30\r\2\u0111\u0116\5\32\16"+
		"\2\u0112\u0116\5F$\2\u0113\u0116\5V,\2\u0114\u0116\5X-\2\u0115\u0110\3"+
		"\2\2\2\u0115\u0111\3\2\2\2\u0115\u0112\3\2\2\2\u0115\u0113\3\2\2\2\u0115"+
		"\u0114\3\2\2\2\u0116+\3\2\2\2\u0117\u0118\5.\30\2\u0118-\3\2\2\2\u0119"+
		"\u011a\7\7\2\2\u011a\u011b\t\3\2\2\u011b\u011c\5$\23\2\u011c/\3\2\2\2"+
		"\u011d\u011e\7\7\2\2\u011e\61\3\2\2\2\u011f\u0120\7\7\2\2\u0120\u0125"+
		"\5\64\33\2\u0121\u0122\7\6\2\2\u0122\u0124\5\64\33\2\u0123\u0121\3\2\2"+
		"\2\u0124\u0127\3\2\2\2\u0125\u0123\3\2\2\2\u0125\u0126\3\2\2\2\u0126\63"+
		"\3\2\2\2\u0127\u0125\3\2\2\2\u0128\u0131\7\23\2\2\u0129\u012e\5\66\34"+
		"\2\u012a\u012b\7\16\2\2\u012b\u012d\5\66\34\2\u012c\u012a\3\2\2\2\u012d"+
		"\u0130\3\2\2\2\u012e\u012c\3\2\2\2\u012e\u012f\3\2\2\2\u012f\u0132\3\2"+
		"\2\2\u0130\u012e\3\2\2\2\u0131\u0129\3\2\2\2\u0131\u0132\3\2\2\2\u0132"+
		"\u0133\3\2\2\2\u0133\u0134\7\24\2\2\u0134\65\3\2\2\2\u0135\u013a\5\6\4"+
		"\2\u0136\u013a\5\26\f\2\u0137\u013a\5\b\5\2\u0138\u013a\5\n\6\2\u0139"+
		"\u0135\3\2\2\2\u0139\u0136\3\2\2\2\u0139\u0137\3\2\2\2\u0139\u0138\3\2"+
		"\2\2\u013a\67\3\2\2\2\u013b\u013c\7\13\2\2\u013c\u013d\5\\/\2\u013d9\3"+
		"\2\2\2\u013e\u013f\7\25\2\2\u013f\u0140\5\4\3\2\u0140\u0141\7\26\2\2\u0141"+
		";\3\2\2\2\u0142\u0143\7\31\2\2\u0143\u0144\5> \2\u0144=\3\2\2\2\u0145"+
		"\u0147\5\20\t\2\u0146\u0148\5@!\2\u0147\u0146\3\2\2\2\u0147\u0148\3\2"+
		"\2\2\u0148?\3\2\2\2\u0149\u014a\7\f\2\2\u014a\u014e\5\62\32\2\u014b\u014e"+
		"\58\35\2\u014c\u014e\5:\36\2\u014d\u0149\3\2\2\2\u014d\u014b\3\2\2\2\u014d"+
		"\u014c\3\2\2\2\u014e\u0150\3\2\2\2\u014f\u0151\5@!\2\u0150\u014f\3\2\2"+
		"\2\u0150\u0151\3\2\2\2\u0151\u0155\3\2\2\2\u0152\u0155\5D#\2\u0153\u0155"+
		"\5B\"\2\u0154\u014d\3\2\2\2\u0154\u0152\3\2\2\2\u0154\u0153\3\2\2\2\u0155"+
		"A\3\2\2\2\u0156\u0157\7\25\2\2\u0157\u0158\5\4\3\2\u0158\u0159\7\26\2"+
		"\2\u0159\u015a\7\32\2\2\u015a\u015b\5\4\3\2\u015bC\3\2\2\2\u015c\u015d"+
		"\7\13\2\2\u015d\u0164\5\\/\2\u015e\u015f\t\2\2\2\u015f\u0165\5\4\3\2\u0160"+
		"\u0161\7\34\2\2\u0161\u0162\5R*\2\u0162\u0163\5\4\3\2\u0163\u0165\3\2"+
		"\2\2\u0164\u015e\3\2\2\2\u0164\u0160\3\2\2\2\u0165E\3\2\2\2\u0166\u016c"+
		"\5H%\2\u0167\u016c\5J&\2\u0168\u016c\5L\'\2\u0169\u016c\5P)\2\u016a\u016c"+
		"\5T+\2\u016b\u0166\3\2\2\2\u016b\u0167\3\2\2\2\u016b\u0168\3\2\2\2\u016b"+
		"\u0169\3\2\2\2\u016b\u016a\3\2\2\2\u016cG\3\2\2\2\u016d\u016e\7\5\2\2"+
		"\u016eI\3\2\2\2\u016f\u0170\7 \2\2\u0170K\3\2\2\2\u0171\u0172\7\n\2\2"+
		"\u0172\u0176\7\25\2\2\u0173\u0175\5N(\2\u0174\u0173\3\2\2\2\u0175\u0178"+
		"\3\2\2\2\u0176\u0174\3\2\2\2\u0176\u0177\3\2\2\2\u0177\u0179\3\2\2\2\u0178"+
		"\u0176\3\2\2\2\u0179\u017a\7\26\2\2\u017aM\3\2\2\2\u017b\u0182\5\\/\2"+
		"\u017c\u017d\t\2\2\2\u017d\u0183\5\4\3\2\u017e\u017f\7\34\2\2\u017f\u0180"+
		"\5R*\2\u0180\u0181\5\4\3\2\u0181\u0183\3\2\2\2\u0182\u017c\3\2\2\2\u0182"+
		"\u017e\3\2\2\2\u0183O\3\2\2\2\u0184\u0185\7\27\2\2\u0185\u0189\5R*\2\u0186"+
		"\u0188\5\4\3\2\u0187\u0186\3\2\2\2\u0188\u018b\3\2\2\2\u0189\u0187\3\2"+
		"\2\2\u0189\u018a\3\2\2\2\u018a\u018c\3\2\2\2\u018b\u0189\3\2\2\2\u018c"+
		"\u018d\7\30\2\2\u018dQ\3\2\2\2\u018e\u0190\7\t\2\2\u018f\u0191\5Z.\2\u0190"+
		"\u018f\3\2\2\2\u0191\u0192\3\2\2\2\u0192\u0190\3\2\2\2\u0192\u0193\3\2"+
		"\2\2\u0193\u0194\3\2\2\2\u0194\u0195\7\t\2\2\u0195\u0197\3\2\2\2\u0196"+
		"\u018e\3\2\2\2\u0196\u0197\3\2\2\2\u0197S\3\2\2\2\u0198\u0199\7\n\2\2"+
		"\u0199\u019d\7\23\2\2\u019a\u019c\5\4\3\2\u019b\u019a\3\2\2\2\u019c\u019f"+
		"\3\2\2\2\u019d\u019b\3\2\2\2\u019d\u019e\3\2\2\2\u019e\u01a0\3\2\2\2\u019f"+
		"\u019d\3\2\2\2\u01a0\u01a1\7\24\2\2\u01a1U\3\2\2\2\u01a2\u01a3\7\4\2\2"+
		"\u01a3W\3\2\2\2\u01a4\u01a5\7\21\2\2\u01a5\u01a6\5Z.\2\u01a6Y\3\2\2\2"+
		"\u01a7\u01a8\t\4\2\2\u01a8[\3\2\2\2\u01a9\u01ad\5Z.\2\u01aa\u01ad\5^\60"+
		"\2\u01ab\u01ad\5`\61\2\u01ac\u01a9\3\2\2\2\u01ac\u01aa\3\2\2\2\u01ac\u01ab"+
		"\3\2\2\2\u01ad]\3\2\2\2\u01ae\u01af\7\31\2\2\u01af_\3\2\2\2\u01b0\u01b1"+
		"\7\25\2\2\u01b1\u01b2\7\26\2\2\u01b2a\3\2\2\2\62emr|\u0085\u008a\u008d"+
		"\u0090\u0096\u009e\u00a1\u00a6\u00a9\u00ac\u00b1\u00b9\u00bc\u00c0\u00ca"+
		"\u00d2\u00da\u00ea\u00ed\u00f3\u00f5\u00fc\u0100\u0103\u010c\u010e\u0115"+
		"\u0125\u012e\u0131\u0139\u0147\u014d\u0150\u0154\u0164\u016b\u0176\u0182"+
		"\u0189\u0192\u0196\u019d\u01ac";
	public static final ATN _ATN =
		ATNSimulator.deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}