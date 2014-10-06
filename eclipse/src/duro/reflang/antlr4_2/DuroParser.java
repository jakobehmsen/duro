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
		HASH=8, DOT=9, COMMA=10, COLON=11, DOLLAR=12, PAR_OP=13, PAR_CL=14, SQ_OP=15, 
		SQ_CL=16, BRA_OP=17, BAR_CL=18, BIN_OP=19, ASSIGN=20, ASSIGN_PROTO=21, 
		ASSIGN_QUOTED=22, WS_NL=23, WS_NOT_NL=24, SINGLELINE_COMMENT=25, MULTI_LINE_COMMENT=26, 
		STRING=27;
	public static final String[] tokenNames = {
		"<INVALID>", "'var'", "PSEUDO_VAR", "INT", "ID_CAP", "ID_UNCAP", "'§'", 
		"'|'", "'#'", "'.'", "','", "':'", "'$'", "'('", "')'", "'['", "']'", 
		"'{'", "'}'", "BIN_OP", "'='", "'^='", "'=>'", "'\r\n'", "WS_NOT_NL", 
		"SINGLELINE_COMMENT", "MULTI_LINE_COMMENT", "STRING"
	};
	public static final int
		RULE_program = 0, RULE_expression = 1, RULE_assignment = 2, RULE_interfaceId = 3, 
		RULE_messageExchange = 4, RULE_messageChain = 5, RULE_receiver = 6, RULE_selfMultiArgMessageNoPar = 7, 
		RULE_selfMultiArgMessageWithPar = 8, RULE_variableDeclaration = 9, RULE_access = 10, 
		RULE_grouping = 11, RULE_multiArgMessageNoPar = 12, RULE_multiArgMessageArgsNoPar = 13, 
		RULE_multiArgMessageArgNoPar = 14, RULE_multiArgMessageArgNoParChain = 15, 
		RULE_multiArgMessageWithPar = 16, RULE_multiArgMessageArgsWithPar = 17, 
		RULE_multiArgMessageArgsWithParArg = 18, RULE_slotAccess = 19, RULE_indexAccess = 20, 
		RULE_binaryMessage = 21, RULE_binaryMessageOperand = 22, RULE_binaryMessageOperandChain = 23, 
		RULE_indexAssignment = 24, RULE_slotAssignment = 25, RULE_literal = 26, 
		RULE_integer = 27, RULE_string = 28, RULE_dict = 29, RULE_dictEntry = 30, 
		RULE_closure = 31, RULE_behaviorParams = 32, RULE_pseudoVar = 33, RULE_parArg = 34, 
		RULE_id = 35, RULE_selector = 36, RULE_binaryOperator = 37, RULE_indexOperator = 38, 
		RULE_ws = 39;
	public static final String[] ruleNames = {
		"program", "expression", "assignment", "interfaceId", "messageExchange", 
		"messageChain", "receiver", "selfMultiArgMessageNoPar", "selfMultiArgMessageWithPar", 
		"variableDeclaration", "access", "grouping", "multiArgMessageNoPar", "multiArgMessageArgsNoPar", 
		"multiArgMessageArgNoPar", "multiArgMessageArgNoParChain", "multiArgMessageWithPar", 
		"multiArgMessageArgsWithPar", "multiArgMessageArgsWithParArg", "slotAccess", 
		"indexAccess", "binaryMessage", "binaryMessageOperand", "binaryMessageOperandChain", 
		"indexAssignment", "slotAssignment", "literal", "integer", "string", "dict", 
		"dictEntry", "closure", "behaviorParams", "pseudoVar", "parArg", "id", 
		"selector", "binaryOperator", "indexOperator", "ws"
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
		public WsContext ws(int i) {
			return getRuleContext(WsContext.class,i);
		}
		public List<WsContext> ws() {
			return getRuleContexts(WsContext.class);
		}
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
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(85);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,0,_ctx);
			while ( _alt!=2 && _alt!=-1 ) {
				if ( _alt==1 ) {
					{
					{
					setState(80); ws();
					setState(81); expression();
					}
					} 
				}
				setState(87);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,0,_ctx);
			}
			setState(88); ws();
			}
		}
		catch (RecognitionException re) {
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
			setState(95);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(90); assignment();
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(91); variableDeclaration();
				}
				break;

			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(92); selfMultiArgMessageNoPar();
				}
				break;

			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(93); interfaceId();
				}
				break;

			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(94); messageExchange();
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

	public static class AssignmentContext extends ParserRuleContext {
		public Token op;
		public BehaviorParamsContext behaviorParams() {
			return getRuleContext(BehaviorParamsContext.class,0);
		}
		public TerminalNode ASSIGN() { return getToken(DuroParser.ASSIGN, 0); }
		public WsContext ws(int i) {
			return getRuleContext(WsContext.class,i);
		}
		public TerminalNode ASSIGN_QUOTED() { return getToken(DuroParser.ASSIGN_QUOTED, 0); }
		public IdContext id() {
			return getRuleContext(IdContext.class,0);
		}
		public List<WsContext> ws() {
			return getRuleContexts(WsContext.class);
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
			setState(97); id();
			setState(98); ws();
			setState(109);
			switch (_input.LA(1)) {
			case ASSIGN:
			case ASSIGN_PROTO:
				{
				{
				setState(99);
				((AssignmentContext)_localctx).op = _input.LT(1);
				_la = _input.LA(1);
				if ( !(_la==ASSIGN || _la==ASSIGN_PROTO) ) {
					((AssignmentContext)_localctx).op = (Token)_errHandler.recoverInline(this);
				}
				consume();
				setState(100); ws();
				setState(101); expression();
				}
				}
				break;
			case ASSIGN_QUOTED:
				{
				setState(103); ((AssignmentContext)_localctx).op = match(ASSIGN_QUOTED);
				setState(104); ws();
				setState(105); behaviorParams();
				setState(106); ws();
				setState(107); expression();
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
		public WsContext ws(int i) {
			return getRuleContext(WsContext.class,i);
		}
		public TerminalNode DOLLAR() { return getToken(DuroParser.DOLLAR, 0); }
		public List<WsContext> ws() {
			return getRuleContexts(WsContext.class);
		}
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
			setState(111); match(DOLLAR);
			setState(112); ws();
			setState(113); id();
			{
			}
			setState(115); ws();
			setState(116); expression();
			}
		}
		catch (RecognitionException re) {
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
		public WsContext ws() {
			return getRuleContext(WsContext.class,0);
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
			setState(118); receiver();
			setState(119); ws();
			setState(121);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				{
				setState(120); messageChain();
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
		public WsContext ws(int i) {
			return getRuleContext(WsContext.class,i);
		}
		public MessageChainContext messageChain() {
			return getRuleContext(MessageChainContext.class,0);
		}
		public BinaryMessageContext binaryMessage(int i) {
			return getRuleContext(BinaryMessageContext.class,i);
		}
		public List<WsContext> ws() {
			return getRuleContexts(WsContext.class);
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
		public MultiArgMessageWithParContext multiArgMessageWithPar() {
			return getRuleContext(MultiArgMessageWithParContext.class,0);
		}
		public IndexAccessContext indexAccess() {
			return getRuleContext(IndexAccessContext.class,0);
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
			setState(154);
			switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(128);
				switch (_input.LA(1)) {
				case DOT:
					{
					setState(123); match(DOT);
					setState(124); ws();
					setState(125); multiArgMessageWithPar();
					}
					break;
				case SQ_OP:
					{
					setState(127); indexAccess();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(133);
				switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
				case 1:
					{
					setState(130); ws();
					setState(131); messageChain();
					}
					break;
				}
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(135); match(DOT);
				setState(136); ws();
				setState(137); multiArgMessageNoPar();
				}
				break;

			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(139); slotAccess();
				setState(141);
				switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
				case 1:
					{
					setState(140); messageChain();
					}
					break;
				}
				}
				break;

			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(143); slotAssignment();
				}
				break;

			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(144); indexAssignment();
				}
				break;

			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(145); binaryMessage();
				setState(151);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,7,_ctx);
				while ( _alt!=2 && _alt!=-1 ) {
					if ( _alt==1 ) {
						{
						{
						setState(146); ws();
						setState(147); binaryMessage();
						}
						} 
					}
					setState(153);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,7,_ctx);
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
		enterRule(_localctx, 12, RULE_receiver);
		try {
			setState(161);
			switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(156); selfMultiArgMessageWithPar();
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(157); access();
				}
				break;

			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(158); grouping();
				}
				break;

			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(159); literal();
				}
				break;

			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(160); parArg();
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
		enterRule(_localctx, 14, RULE_selfMultiArgMessageNoPar);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(163); multiArgMessageNoPar();
			}
		}
		catch (RecognitionException re) {
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
		enterRule(_localctx, 16, RULE_selfMultiArgMessageWithPar);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(165); multiArgMessageWithPar();
			}
		}
		catch (RecognitionException re) {
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
		public WsContext ws(int i) {
			return getRuleContext(WsContext.class,i);
		}
		public TerminalNode VAR() { return getToken(DuroParser.VAR, 0); }
		public List<WsContext> ws() {
			return getRuleContexts(WsContext.class);
		}
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
		enterRule(_localctx, 18, RULE_variableDeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(167); match(VAR);
			setState(168); ws();
			setState(169); id();
			setState(175);
			switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
			case 1:
				{
				setState(170); ws();
				setState(171); match(ASSIGN);
				setState(172); ws();
				setState(173); expression();
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
		enterRule(_localctx, 20, RULE_access);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(177); id();
			}
		}
		catch (RecognitionException re) {
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
		public WsContext ws(int i) {
			return getRuleContext(WsContext.class,i);
		}
		public TerminalNode PAR_OP() { return getToken(DuroParser.PAR_OP, 0); }
		public List<WsContext> ws() {
			return getRuleContexts(WsContext.class);
		}
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
		enterRule(_localctx, 22, RULE_grouping);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(179); match(PAR_OP);
			setState(180); ws();
			setState(184); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(181); expression();
				setState(182); ws();
				}
				}
				setState(186); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << VAR) | (1L << PSEUDO_VAR) | (1L << INT) | (1L << ID_CAP) | (1L << ID_UNCAP) | (1L << HASH) | (1L << COLON) | (1L << DOLLAR) | (1L << PAR_OP) | (1L << BRA_OP) | (1L << STRING))) != 0) );
			setState(188); match(PAR_CL);
			}
		}
		catch (RecognitionException re) {
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
		public WsContext ws() {
			return getRuleContext(WsContext.class,0);
		}
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
		enterRule(_localctx, 24, RULE_multiArgMessageNoPar);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(190); match(ID_UNCAP);
			setState(191); multiArgMessageArgsNoPar();
			setState(192); ws();
			setState(197);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,12,_ctx);
			while ( _alt!=2 && _alt!=-1 ) {
				if ( _alt==1 ) {
					{
					{
					setState(193); match(ID_CAP);
					setState(194); multiArgMessageArgsNoPar();
					}
					} 
				}
				setState(199);
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

	public static class MultiArgMessageArgsNoParContext extends ParserRuleContext {
		public WsContext ws(int i) {
			return getRuleContext(WsContext.class,i);
		}
		public List<MultiArgMessageArgNoParContext> multiArgMessageArgNoPar() {
			return getRuleContexts(MultiArgMessageArgNoParContext.class);
		}
		public MultiArgMessageArgNoParContext multiArgMessageArgNoPar(int i) {
			return getRuleContext(MultiArgMessageArgNoParContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(DuroParser.COMMA); }
		public List<WsContext> ws() {
			return getRuleContexts(WsContext.class);
		}
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
		enterRule(_localctx, 26, RULE_multiArgMessageArgsNoPar);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(200); multiArgMessageArgNoPar();
			setState(208);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,13,_ctx);
			while ( _alt!=2 && _alt!=-1 ) {
				if ( _alt==1 ) {
					{
					{
					setState(201); ws();
					setState(202); match(COMMA);
					setState(203); ws();
					setState(204); multiArgMessageArgNoPar();
					}
					} 
				}
				setState(210);
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

	public static class MultiArgMessageArgNoParContext extends ParserRuleContext {
		public ReceiverContext receiver() {
			return getRuleContext(ReceiverContext.class,0);
		}
		public WsContext ws() {
			return getRuleContext(WsContext.class,0);
		}
		public MultiArgMessageArgNoParChainContext multiArgMessageArgNoParChain() {
			return getRuleContext(MultiArgMessageArgNoParChainContext.class,0);
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
		enterRule(_localctx, 28, RULE_multiArgMessageArgNoPar);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(211); receiver();
			setState(212); ws();
			setState(214);
			switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
			case 1:
				{
				setState(213); multiArgMessageArgNoParChain();
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

	public static class MultiArgMessageArgNoParChainContext extends ParserRuleContext {
		public SlotAccessContext slotAccess() {
			return getRuleContext(SlotAccessContext.class,0);
		}
		public TerminalNode DOT() { return getToken(DuroParser.DOT, 0); }
		public WsContext ws(int i) {
			return getRuleContext(WsContext.class,i);
		}
		public BinaryMessageContext binaryMessage(int i) {
			return getRuleContext(BinaryMessageContext.class,i);
		}
		public List<WsContext> ws() {
			return getRuleContexts(WsContext.class);
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
		public MultiArgMessageWithParContext multiArgMessageWithPar() {
			return getRuleContext(MultiArgMessageWithParContext.class,0);
		}
		public IndexAccessContext indexAccess() {
			return getRuleContext(IndexAccessContext.class,0);
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
		enterRule(_localctx, 30, RULE_multiArgMessageArgNoParChain);
		try {
			int _alt;
			setState(236);
			switch ( getInterpreter().adaptivePredict(_input,18,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(222);
				switch ( getInterpreter().adaptivePredict(_input,15,_ctx) ) {
				case 1:
					{
					setState(216); match(DOT);
					setState(217); ws();
					setState(218); multiArgMessageWithPar();
					}
					break;

				case 2:
					{
					setState(220); slotAccess();
					}
					break;

				case 3:
					{
					setState(221); indexAccess();
					}
					break;
				}
				setState(227);
				switch ( getInterpreter().adaptivePredict(_input,16,_ctx) ) {
				case 1:
					{
					setState(224); ws();
					setState(225); multiArgMessageArgNoParChain();
					}
					break;
				}
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(229); slotAssignment();
				}
				break;

			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(230); indexAssignment();
				}
				break;

			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(232); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,17,_ctx);
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(231); binaryMessage();
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(234); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,17,_ctx);
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

	public static class MultiArgMessageWithParContext extends ParserRuleContext {
		public MultiArgMessageArgsWithParContext multiArgMessageArgsWithPar(int i) {
			return getRuleContext(MultiArgMessageArgsWithParContext.class,i);
		}
		public List<MultiArgMessageArgsWithParContext> multiArgMessageArgsWithPar() {
			return getRuleContexts(MultiArgMessageArgsWithParContext.class);
		}
		public List<TerminalNode> ID_CAP() { return getTokens(DuroParser.ID_CAP); }
		public WsContext ws(int i) {
			return getRuleContext(WsContext.class,i);
		}
		public TerminalNode ID_UNCAP() { return getToken(DuroParser.ID_UNCAP, 0); }
		public List<WsContext> ws() {
			return getRuleContexts(WsContext.class);
		}
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
		enterRule(_localctx, 32, RULE_multiArgMessageWithPar);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(238); match(ID_UNCAP);
			setState(239); ws();
			setState(240); multiArgMessageArgsWithPar();
			setState(247);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,19,_ctx);
			while ( _alt!=2 && _alt!=-1 ) {
				if ( _alt==1 ) {
					{
					{
					setState(241); match(ID_CAP);
					setState(242); ws();
					setState(243); multiArgMessageArgsWithPar();
					}
					} 
				}
				setState(249);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,19,_ctx);
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
		public WsContext ws(int i) {
			return getRuleContext(WsContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(DuroParser.COMMA); }
		public TerminalNode PAR_OP() { return getToken(DuroParser.PAR_OP, 0); }
		public List<WsContext> ws() {
			return getRuleContexts(WsContext.class);
		}
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
		enterRule(_localctx, 34, RULE_multiArgMessageArgsWithPar);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(250); match(PAR_OP);
			setState(251); ws();
			setState(263);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << VAR) | (1L << PSEUDO_VAR) | (1L << INT) | (1L << ID_CAP) | (1L << ID_UNCAP) | (1L << HASH) | (1L << COLON) | (1L << DOLLAR) | (1L << PAR_OP) | (1L << BRA_OP) | (1L << STRING))) != 0)) {
				{
				setState(252); multiArgMessageArgsWithParArg();
				setState(260);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,20,_ctx);
				while ( _alt!=2 && _alt!=-1 ) {
					if ( _alt==1 ) {
						{
						{
						setState(253); ws();
						setState(254); match(COMMA);
						setState(255); ws();
						setState(256); multiArgMessageArgsWithParArg();
						}
						} 
					}
					setState(262);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,20,_ctx);
				}
				}
			}

			setState(265); ws();
			setState(266); match(PAR_CL);
			}
		}
		catch (RecognitionException re) {
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
		enterRule(_localctx, 36, RULE_multiArgMessageArgsWithParArg);
		try {
			setState(272);
			switch ( getInterpreter().adaptivePredict(_input,22,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(268); assignment();
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(269); variableDeclaration();
				}
				break;

			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(270); interfaceId();
				}
				break;

			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(271); messageExchange();
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
		public TerminalNode DOT() { return getToken(DuroParser.DOT, 0); }
		public SelectorContext selector() {
			return getRuleContext(SelectorContext.class,0);
		}
		public WsContext ws() {
			return getRuleContext(WsContext.class,0);
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
		enterRule(_localctx, 38, RULE_slotAccess);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(274); match(DOT);
			setState(275); ws();
			setState(276); selector();
			}
		}
		catch (RecognitionException re) {
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
		public WsContext ws(int i) {
			return getRuleContext(WsContext.class,i);
		}
		public List<WsContext> ws() {
			return getRuleContexts(WsContext.class);
		}
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
		enterRule(_localctx, 40, RULE_indexAccess);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(278); match(SQ_OP);
			setState(279); ws();
			setState(280); expression();
			setState(281); ws();
			setState(282); match(SQ_CL);
			}
		}
		catch (RecognitionException re) {
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
		public WsContext ws() {
			return getRuleContext(WsContext.class,0);
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
		enterRule(_localctx, 42, RULE_binaryMessage);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(284); match(BIN_OP);
			setState(285); ws();
			setState(286); binaryMessageOperand();
			}
		}
		catch (RecognitionException re) {
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
		public WsContext ws() {
			return getRuleContext(WsContext.class,0);
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
		enterRule(_localctx, 44, RULE_binaryMessageOperand);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(288); receiver();
			setState(292);
			switch ( getInterpreter().adaptivePredict(_input,23,_ctx) ) {
			case 1:
				{
				setState(289); ws();
				setState(290); binaryMessageOperandChain();
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
		public WsContext ws(int i) {
			return getRuleContext(WsContext.class,i);
		}
		public List<WsContext> ws() {
			return getRuleContexts(WsContext.class);
		}
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
		enterRule(_localctx, 46, RULE_binaryMessageOperandChain);
		try {
			setState(309);
			switch ( getInterpreter().adaptivePredict(_input,26,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(300);
				switch ( getInterpreter().adaptivePredict(_input,24,_ctx) ) {
				case 1:
					{
					setState(294); match(DOT);
					setState(295); ws();
					setState(296); multiArgMessageWithPar();
					}
					break;

				case 2:
					{
					setState(298); slotAccess();
					}
					break;

				case 3:
					{
					setState(299); indexAccess();
					}
					break;
				}
				setState(305);
				switch ( getInterpreter().adaptivePredict(_input,25,_ctx) ) {
				case 1:
					{
					setState(302); ws();
					setState(303); binaryMessageOperandChain();
					}
					break;
				}
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(307); slotAssignment();
				}
				break;

			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(308); indexAssignment();
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
		public WsContext ws(int i) {
			return getRuleContext(WsContext.class,i);
		}
		public List<WsContext> ws() {
			return getRuleContexts(WsContext.class);
		}
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
		enterRule(_localctx, 48, RULE_indexAssignment);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(311); match(SQ_OP);
			setState(312); ws();
			setState(313); expression();
			setState(314); ws();
			setState(315); match(SQ_CL);
			setState(316); ws();
			setState(317); match(ASSIGN);
			setState(318); ws();
			setState(319); expression();
			}
		}
		catch (RecognitionException re) {
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
		public WsContext ws(int i) {
			return getRuleContext(WsContext.class,i);
		}
		public SelectorContext selector() {
			return getRuleContext(SelectorContext.class,0);
		}
		public TerminalNode ASSIGN_QUOTED() { return getToken(DuroParser.ASSIGN_QUOTED, 0); }
		public List<WsContext> ws() {
			return getRuleContexts(WsContext.class);
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
		enterRule(_localctx, 50, RULE_slotAssignment);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(321); match(DOT);
			setState(322); ws();
			setState(323); selector();
			setState(324); ws();
			setState(335);
			switch (_input.LA(1)) {
			case ASSIGN:
			case ASSIGN_PROTO:
				{
				{
				setState(325);
				((SlotAssignmentContext)_localctx).op = _input.LT(1);
				_la = _input.LA(1);
				if ( !(_la==ASSIGN || _la==ASSIGN_PROTO) ) {
					((SlotAssignmentContext)_localctx).op = (Token)_errHandler.recoverInline(this);
				}
				consume();
				setState(326); ws();
				setState(327); expression();
				}
				}
				break;
			case ASSIGN_QUOTED:
				{
				setState(329); ((SlotAssignmentContext)_localctx).op = match(ASSIGN_QUOTED);
				setState(330); ws();
				setState(331); behaviorParams();
				setState(332); ws();
				setState(333); expression();
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
		enterRule(_localctx, 52, RULE_literal);
		try {
			setState(342);
			switch (_input.LA(1)) {
			case INT:
				enterOuterAlt(_localctx, 1);
				{
				setState(337); integer();
				}
				break;
			case STRING:
				enterOuterAlt(_localctx, 2);
				{
				setState(338); string();
				}
				break;
			case HASH:
				enterOuterAlt(_localctx, 3);
				{
				setState(339); dict();
				}
				break;
			case BRA_OP:
				enterOuterAlt(_localctx, 4);
				{
				setState(340); closure();
				}
				break;
			case PSEUDO_VAR:
				enterOuterAlt(_localctx, 5);
				{
				setState(341); pseudoVar();
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
		enterRule(_localctx, 54, RULE_integer);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(344); match(INT);
			}
		}
		catch (RecognitionException re) {
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
		enterRule(_localctx, 56, RULE_string);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(346); match(STRING);
			}
		}
		catch (RecognitionException re) {
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
		public WsContext ws(int i) {
			return getRuleContext(WsContext.class,i);
		}
		public List<WsContext> ws() {
			return getRuleContexts(WsContext.class);
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
		enterRule(_localctx, 58, RULE_dict);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(348); match(HASH);
			setState(349); ws();
			setState(350); match(SQ_OP);
			setState(356);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,29,_ctx);
			while ( _alt!=2 && _alt!=-1 ) {
				if ( _alt==1 ) {
					{
					{
					setState(351); ws();
					setState(352); dictEntry();
					}
					} 
				}
				setState(358);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,29,_ctx);
			}
			setState(359); ws();
			setState(360); match(SQ_CL);
			}
		}
		catch (RecognitionException re) {
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
		public WsContext ws(int i) {
			return getRuleContext(WsContext.class,i);
		}
		public SelectorContext selector() {
			return getRuleContext(SelectorContext.class,0);
		}
		public TerminalNode ASSIGN_QUOTED() { return getToken(DuroParser.ASSIGN_QUOTED, 0); }
		public List<WsContext> ws() {
			return getRuleContexts(WsContext.class);
		}
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
		enterRule(_localctx, 60, RULE_dictEntry);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(362); selector();
			setState(363); ws();
			setState(374);
			switch (_input.LA(1)) {
			case ASSIGN:
			case ASSIGN_PROTO:
				{
				{
				setState(364);
				((DictEntryContext)_localctx).op = _input.LT(1);
				_la = _input.LA(1);
				if ( !(_la==ASSIGN || _la==ASSIGN_PROTO) ) {
					((DictEntryContext)_localctx).op = (Token)_errHandler.recoverInline(this);
				}
				consume();
				setState(365); ws();
				setState(366); expression();
				}
				}
				break;
			case ASSIGN_QUOTED:
				{
				setState(368); ((DictEntryContext)_localctx).op = match(ASSIGN_QUOTED);
				setState(369); ws();
				setState(370); behaviorParams();
				setState(371); ws();
				setState(372); expression();
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
		public WsContext ws(int i) {
			return getRuleContext(WsContext.class,i);
		}
		public TerminalNode BAR_CL() { return getToken(DuroParser.BAR_CL, 0); }
		public List<WsContext> ws() {
			return getRuleContexts(WsContext.class);
		}
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
		enterRule(_localctx, 62, RULE_closure);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(376); match(BRA_OP);
			setState(377); ws();
			setState(378); behaviorParams();
			{
			setState(379); ws();
			setState(383);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << VAR) | (1L << PSEUDO_VAR) | (1L << INT) | (1L << ID_CAP) | (1L << ID_UNCAP) | (1L << HASH) | (1L << COLON) | (1L << DOLLAR) | (1L << PAR_OP) | (1L << BRA_OP) | (1L << STRING))) != 0)) {
				{
				{
				setState(380); expression();
				}
				}
				setState(385);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
			setState(386); ws();
			setState(387); match(BAR_CL);
			}
		}
		catch (RecognitionException re) {
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
		public WsContext ws(int i) {
			return getRuleContext(WsContext.class,i);
		}
		public IdContext id(int i) {
			return getRuleContext(IdContext.class,i);
		}
		public List<TerminalNode> PIPE() { return getTokens(DuroParser.PIPE); }
		public TerminalNode PIPE(int i) {
			return getToken(DuroParser.PIPE, i);
		}
		public List<WsContext> ws() {
			return getRuleContexts(WsContext.class);
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
		enterRule(_localctx, 64, RULE_behaviorParams);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(400);
			_la = _input.LA(1);
			if (_la==PIPE) {
				{
				setState(389); match(PIPE);
				setState(393); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,32,_ctx);
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(390); ws();
						setState(391); id();
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(395); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,32,_ctx);
				} while ( _alt!=2 && _alt!=-1 );
				setState(397); ws();
				setState(398); match(PIPE);
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
		enterRule(_localctx, 66, RULE_pseudoVar);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(402); match(PSEUDO_VAR);
			}
		}
		catch (RecognitionException re) {
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
		public WsContext ws() {
			return getRuleContext(WsContext.class,0);
		}
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
		enterRule(_localctx, 68, RULE_parArg);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(404); match(COLON);
			setState(405); ws();
			setState(406); id();
			}
		}
		catch (RecognitionException re) {
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
		enterRule(_localctx, 70, RULE_id);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(408);
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
		enterRule(_localctx, 72, RULE_selector);
		try {
			setState(413);
			switch (_input.LA(1)) {
			case ID_CAP:
			case ID_UNCAP:
				enterOuterAlt(_localctx, 1);
				{
				setState(410); id();
				}
				break;
			case BIN_OP:
				enterOuterAlt(_localctx, 2);
				{
				setState(411); binaryOperator();
				}
				break;
			case SQ_OP:
				enterOuterAlt(_localctx, 3);
				{
				setState(412); indexOperator();
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
		enterRule(_localctx, 74, RULE_binaryOperator);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(415); match(BIN_OP);
			}
		}
		catch (RecognitionException re) {
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
		public WsContext ws() {
			return getRuleContext(WsContext.class,0);
		}
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
		enterRule(_localctx, 76, RULE_indexOperator);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(417); match(SQ_OP);
			setState(418); ws();
			setState(419); match(SQ_CL);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class WsContext extends ParserRuleContext {
		public List<TerminalNode> WS_NL() { return getTokens(DuroParser.WS_NL); }
		public TerminalNode WS_NL(int i) {
			return getToken(DuroParser.WS_NL, i);
		}
		public WsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ws; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DuroListener ) ((DuroListener)listener).enterWs(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DuroListener ) ((DuroListener)listener).exitWs(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DuroVisitor ) return ((DuroVisitor<? extends T>)visitor).visitWs(this);
			else return visitor.visitChildren(this);
		}
	}

	public final WsContext ws() throws RecognitionException {
		WsContext _localctx = new WsContext(_ctx, getState());
		enterRule(_localctx, 78, RULE_ws);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(424);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,35,_ctx);
			while ( _alt!=2 && _alt!=-1 ) {
				if ( _alt==1 ) {
					{
					{
					setState(421); match(WS_NL);
					}
					} 
				}
				setState(426);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,35,_ctx);
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
		"\3\uacf5\uee8c\u4f5d\u8b0d\u4a45\u78bd\u1b2f\u3378\3\35\u01ae\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\3\2\3\2\3\2\7"+
		"\2V\n\2\f\2\16\2Y\13\2\3\2\3\2\3\3\3\3\3\3\3\3\3\3\5\3b\n\3\3\4\3\4\3"+
		"\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\5\4p\n\4\3\5\3\5\3\5\3\5\3\5\3"+
		"\5\3\5\3\6\3\6\3\6\5\6|\n\6\3\7\3\7\3\7\3\7\3\7\5\7\u0083\n\7\3\7\3\7"+
		"\3\7\5\7\u0088\n\7\3\7\3\7\3\7\3\7\3\7\3\7\5\7\u0090\n\7\3\7\3\7\3\7\3"+
		"\7\3\7\3\7\7\7\u0098\n\7\f\7\16\7\u009b\13\7\5\7\u009d\n\7\3\b\3\b\3\b"+
		"\3\b\3\b\5\b\u00a4\n\b\3\t\3\t\3\n\3\n\3\13\3\13\3\13\3\13\3\13\3\13\3"+
		"\13\3\13\5\13\u00b2\n\13\3\f\3\f\3\r\3\r\3\r\3\r\3\r\6\r\u00bb\n\r\r\r"+
		"\16\r\u00bc\3\r\3\r\3\16\3\16\3\16\3\16\3\16\7\16\u00c6\n\16\f\16\16\16"+
		"\u00c9\13\16\3\17\3\17\3\17\3\17\3\17\3\17\7\17\u00d1\n\17\f\17\16\17"+
		"\u00d4\13\17\3\20\3\20\3\20\5\20\u00d9\n\20\3\21\3\21\3\21\3\21\3\21\3"+
		"\21\5\21\u00e1\n\21\3\21\3\21\3\21\5\21\u00e6\n\21\3\21\3\21\3\21\6\21"+
		"\u00eb\n\21\r\21\16\21\u00ec\5\21\u00ef\n\21\3\22\3\22\3\22\3\22\3\22"+
		"\3\22\3\22\7\22\u00f8\n\22\f\22\16\22\u00fb\13\22\3\23\3\23\3\23\3\23"+
		"\3\23\3\23\3\23\3\23\7\23\u0105\n\23\f\23\16\23\u0108\13\23\5\23\u010a"+
		"\n\23\3\23\3\23\3\23\3\24\3\24\3\24\3\24\5\24\u0113\n\24\3\25\3\25\3\25"+
		"\3\25\3\26\3\26\3\26\3\26\3\26\3\26\3\27\3\27\3\27\3\27\3\30\3\30\3\30"+
		"\3\30\5\30\u0127\n\30\3\31\3\31\3\31\3\31\3\31\3\31\5\31\u012f\n\31\3"+
		"\31\3\31\3\31\5\31\u0134\n\31\3\31\3\31\5\31\u0138\n\31\3\32\3\32\3\32"+
		"\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\33\3\33\3\33\3\33\3\33\3\33\3\33"+
		"\3\33\3\33\3\33\3\33\3\33\3\33\3\33\5\33\u0152\n\33\3\34\3\34\3\34\3\34"+
		"\3\34\5\34\u0159\n\34\3\35\3\35\3\36\3\36\3\37\3\37\3\37\3\37\3\37\3\37"+
		"\7\37\u0165\n\37\f\37\16\37\u0168\13\37\3\37\3\37\3\37\3 \3 \3 \3 \3 "+
		"\3 \3 \3 \3 \3 \3 \3 \5 \u0179\n \3!\3!\3!\3!\3!\7!\u0180\n!\f!\16!\u0183"+
		"\13!\3!\3!\3!\3\"\3\"\3\"\3\"\6\"\u018c\n\"\r\"\16\"\u018d\3\"\3\"\3\""+
		"\5\"\u0193\n\"\3#\3#\3$\3$\3$\3$\3%\3%\3&\3&\3&\5&\u01a0\n&\3\'\3\'\3"+
		"(\3(\3(\3(\3)\7)\u01a9\n)\f)\16)\u01ac\13)\3)\2*\2\4\6\b\n\f\16\20\22"+
		"\24\26\30\32\34\36 \"$&(*,.\60\62\64\668:<>@BDFHJLNP\2\4\3\2\26\27\3\2"+
		"\6\7\u01be\2W\3\2\2\2\4a\3\2\2\2\6c\3\2\2\2\bq\3\2\2\2\nx\3\2\2\2\f\u009c"+
		"\3\2\2\2\16\u00a3\3\2\2\2\20\u00a5\3\2\2\2\22\u00a7\3\2\2\2\24\u00a9\3"+
		"\2\2\2\26\u00b3\3\2\2\2\30\u00b5\3\2\2\2\32\u00c0\3\2\2\2\34\u00ca\3\2"+
		"\2\2\36\u00d5\3\2\2\2 \u00ee\3\2\2\2\"\u00f0\3\2\2\2$\u00fc\3\2\2\2&\u0112"+
		"\3\2\2\2(\u0114\3\2\2\2*\u0118\3\2\2\2,\u011e\3\2\2\2.\u0122\3\2\2\2\60"+
		"\u0137\3\2\2\2\62\u0139\3\2\2\2\64\u0143\3\2\2\2\66\u0158\3\2\2\28\u015a"+
		"\3\2\2\2:\u015c\3\2\2\2<\u015e\3\2\2\2>\u016c\3\2\2\2@\u017a\3\2\2\2B"+
		"\u0192\3\2\2\2D\u0194\3\2\2\2F\u0196\3\2\2\2H\u019a\3\2\2\2J\u019f\3\2"+
		"\2\2L\u01a1\3\2\2\2N\u01a3\3\2\2\2P\u01aa\3\2\2\2RS\5P)\2ST\5\4\3\2TV"+
		"\3\2\2\2UR\3\2\2\2VY\3\2\2\2WU\3\2\2\2WX\3\2\2\2XZ\3\2\2\2YW\3\2\2\2Z"+
		"[\5P)\2[\3\3\2\2\2\\b\5\6\4\2]b\5\24\13\2^b\5\20\t\2_b\5\b\5\2`b\5\n\6"+
		"\2a\\\3\2\2\2a]\3\2\2\2a^\3\2\2\2a_\3\2\2\2a`\3\2\2\2b\5\3\2\2\2cd\5H"+
		"%\2do\5P)\2ef\t\2\2\2fg\5P)\2gh\5\4\3\2hp\3\2\2\2ij\7\30\2\2jk\5P)\2k"+
		"l\5B\"\2lm\5P)\2mn\5\4\3\2np\3\2\2\2oe\3\2\2\2oi\3\2\2\2p\7\3\2\2\2qr"+
		"\7\16\2\2rs\5P)\2st\5H%\2tu\3\2\2\2uv\5P)\2vw\5\4\3\2w\t\3\2\2\2xy\5\16"+
		"\b\2y{\5P)\2z|\5\f\7\2{z\3\2\2\2{|\3\2\2\2|\13\3\2\2\2}~\7\13\2\2~\177"+
		"\5P)\2\177\u0080\5\"\22\2\u0080\u0083\3\2\2\2\u0081\u0083\5*\26\2\u0082"+
		"}\3\2\2\2\u0082\u0081\3\2\2\2\u0083\u0087\3\2\2\2\u0084\u0085\5P)\2\u0085"+
		"\u0086\5\f\7\2\u0086\u0088\3\2\2\2\u0087\u0084\3\2\2\2\u0087\u0088\3\2"+
		"\2\2\u0088\u009d\3\2\2\2\u0089\u008a\7\13\2\2\u008a\u008b\5P)\2\u008b"+
		"\u008c\5\32\16\2\u008c\u009d\3\2\2\2\u008d\u008f\5(\25\2\u008e\u0090\5"+
		"\f\7\2\u008f\u008e\3\2\2\2\u008f\u0090\3\2\2\2\u0090\u009d\3\2\2\2\u0091"+
		"\u009d\5\64\33\2\u0092\u009d\5\62\32\2\u0093\u0099\5,\27\2\u0094\u0095"+
		"\5P)\2\u0095\u0096\5,\27\2\u0096\u0098\3\2\2\2\u0097\u0094\3\2\2\2\u0098"+
		"\u009b\3\2\2\2\u0099\u0097\3\2\2\2\u0099\u009a\3\2\2\2\u009a\u009d\3\2"+
		"\2\2\u009b\u0099\3\2\2\2\u009c\u0082\3\2\2\2\u009c\u0089\3\2\2\2\u009c"+
		"\u008d\3\2\2\2\u009c\u0091\3\2\2\2\u009c\u0092\3\2\2\2\u009c\u0093\3\2"+
		"\2\2\u009d\r\3\2\2\2\u009e\u00a4\5\22\n\2\u009f\u00a4\5\26\f\2\u00a0\u00a4"+
		"\5\30\r\2\u00a1\u00a4\5\66\34\2\u00a2\u00a4\5F$\2\u00a3\u009e\3\2\2\2"+
		"\u00a3\u009f\3\2\2\2\u00a3\u00a0\3\2\2\2\u00a3\u00a1\3\2\2\2\u00a3\u00a2"+
		"\3\2\2\2\u00a4\17\3\2\2\2\u00a5\u00a6\5\32\16\2\u00a6\21\3\2\2\2\u00a7"+
		"\u00a8\5\"\22\2\u00a8\23\3\2\2\2\u00a9\u00aa\7\3\2\2\u00aa\u00ab\5P)\2"+
		"\u00ab\u00b1\5H%\2\u00ac\u00ad\5P)\2\u00ad\u00ae\7\26\2\2\u00ae\u00af"+
		"\5P)\2\u00af\u00b0\5\4\3\2\u00b0\u00b2\3\2\2\2\u00b1\u00ac\3\2\2\2\u00b1"+
		"\u00b2\3\2\2\2\u00b2\25\3\2\2\2\u00b3\u00b4\5H%\2\u00b4\27\3\2\2\2\u00b5"+
		"\u00b6\7\17\2\2\u00b6\u00ba\5P)\2\u00b7\u00b8\5\4\3\2\u00b8\u00b9\5P)"+
		"\2\u00b9\u00bb\3\2\2\2\u00ba\u00b7\3\2\2\2\u00bb\u00bc\3\2\2\2\u00bc\u00ba"+
		"\3\2\2\2\u00bc\u00bd\3\2\2\2\u00bd\u00be\3\2\2\2\u00be\u00bf\7\20\2\2"+
		"\u00bf\31\3\2\2\2\u00c0\u00c1\7\7\2\2\u00c1\u00c2\5\34\17\2\u00c2\u00c7"+
		"\5P)\2\u00c3\u00c4\7\6\2\2\u00c4\u00c6\5\34\17\2\u00c5\u00c3\3\2\2\2\u00c6"+
		"\u00c9\3\2\2\2\u00c7\u00c5\3\2\2\2\u00c7\u00c8\3\2\2\2\u00c8\33\3\2\2"+
		"\2\u00c9\u00c7\3\2\2\2\u00ca\u00d2\5\36\20\2\u00cb\u00cc\5P)\2\u00cc\u00cd"+
		"\7\f\2\2\u00cd\u00ce\5P)\2\u00ce\u00cf\5\36\20\2\u00cf\u00d1\3\2\2\2\u00d0"+
		"\u00cb\3\2\2\2\u00d1\u00d4\3\2\2\2\u00d2\u00d0\3\2\2\2\u00d2\u00d3\3\2"+
		"\2\2\u00d3\35\3\2\2\2\u00d4\u00d2\3\2\2\2\u00d5\u00d6\5\16\b\2\u00d6\u00d8"+
		"\5P)\2\u00d7\u00d9\5 \21\2\u00d8\u00d7\3\2\2\2\u00d8\u00d9\3\2\2\2\u00d9"+
		"\37\3\2\2\2\u00da\u00db\7\13\2\2\u00db\u00dc\5P)\2\u00dc\u00dd\5\"\22"+
		"\2\u00dd\u00e1\3\2\2\2\u00de\u00e1\5(\25\2\u00df\u00e1\5*\26\2\u00e0\u00da"+
		"\3\2\2\2\u00e0\u00de\3\2\2\2\u00e0\u00df\3\2\2\2\u00e1\u00e5\3\2\2\2\u00e2"+
		"\u00e3\5P)\2\u00e3\u00e4\5 \21\2\u00e4\u00e6\3\2\2\2\u00e5\u00e2\3\2\2"+
		"\2\u00e5\u00e6\3\2\2\2\u00e6\u00ef\3\2\2\2\u00e7\u00ef\5\64\33\2\u00e8"+
		"\u00ef\5\62\32\2\u00e9\u00eb\5,\27\2\u00ea\u00e9\3\2\2\2\u00eb\u00ec\3"+
		"\2\2\2\u00ec\u00ea\3\2\2\2\u00ec\u00ed\3\2\2\2\u00ed\u00ef\3\2\2\2\u00ee"+
		"\u00e0\3\2\2\2\u00ee\u00e7\3\2\2\2\u00ee\u00e8\3\2\2\2\u00ee\u00ea\3\2"+
		"\2\2\u00ef!\3\2\2\2\u00f0\u00f1\7\7\2\2\u00f1\u00f2\5P)\2\u00f2\u00f9"+
		"\5$\23\2\u00f3\u00f4\7\6\2\2\u00f4\u00f5\5P)\2\u00f5\u00f6\5$\23\2\u00f6"+
		"\u00f8\3\2\2\2\u00f7\u00f3\3\2\2\2\u00f8\u00fb\3\2\2\2\u00f9\u00f7\3\2"+
		"\2\2\u00f9\u00fa\3\2\2\2\u00fa#\3\2\2\2\u00fb\u00f9\3\2\2\2\u00fc\u00fd"+
		"\7\17\2\2\u00fd\u0109\5P)\2\u00fe\u0106\5&\24\2\u00ff\u0100\5P)\2\u0100"+
		"\u0101\7\f\2\2\u0101\u0102\5P)\2\u0102\u0103\5&\24\2\u0103\u0105\3\2\2"+
		"\2\u0104\u00ff\3\2\2\2\u0105\u0108\3\2\2\2\u0106\u0104\3\2\2\2\u0106\u0107"+
		"\3\2\2\2\u0107\u010a\3\2\2\2\u0108\u0106\3\2\2\2\u0109\u00fe\3\2\2\2\u0109"+
		"\u010a\3\2\2\2\u010a\u010b\3\2\2\2\u010b\u010c\5P)\2\u010c\u010d\7\20"+
		"\2\2\u010d%\3\2\2\2\u010e\u0113\5\6\4\2\u010f\u0113\5\24\13\2\u0110\u0113"+
		"\5\b\5\2\u0111\u0113\5\n\6\2\u0112\u010e\3\2\2\2\u0112\u010f\3\2\2\2\u0112"+
		"\u0110\3\2\2\2\u0112\u0111\3\2\2\2\u0113\'\3\2\2\2\u0114\u0115\7\13\2"+
		"\2\u0115\u0116\5P)\2\u0116\u0117\5J&\2\u0117)\3\2\2\2\u0118\u0119\7\21"+
		"\2\2\u0119\u011a\5P)\2\u011a\u011b\5\4\3\2\u011b\u011c\5P)\2\u011c\u011d"+
		"\7\22\2\2\u011d+\3\2\2\2\u011e\u011f\7\25\2\2\u011f\u0120\5P)\2\u0120"+
		"\u0121\5.\30\2\u0121-\3\2\2\2\u0122\u0126\5\16\b\2\u0123\u0124\5P)\2\u0124"+
		"\u0125\5\60\31\2\u0125\u0127\3\2\2\2\u0126\u0123\3\2\2\2\u0126\u0127\3"+
		"\2\2\2\u0127/\3\2\2\2\u0128\u0129\7\13\2\2\u0129\u012a\5P)\2\u012a\u012b"+
		"\5\"\22\2\u012b\u012f\3\2\2\2\u012c\u012f\5(\25\2\u012d\u012f\5*\26\2"+
		"\u012e\u0128\3\2\2\2\u012e\u012c\3\2\2\2\u012e\u012d\3\2\2\2\u012f\u0133"+
		"\3\2\2\2\u0130\u0131\5P)\2\u0131\u0132\5\60\31\2\u0132\u0134\3\2\2\2\u0133"+
		"\u0130\3\2\2\2\u0133\u0134\3\2\2\2\u0134\u0138\3\2\2\2\u0135\u0138\5\64"+
		"\33\2\u0136\u0138\5\62\32\2\u0137\u012e\3\2\2\2\u0137\u0135\3\2\2\2\u0137"+
		"\u0136\3\2\2\2\u0138\61\3\2\2\2\u0139\u013a\7\21\2\2\u013a\u013b\5P)\2"+
		"\u013b\u013c\5\4\3\2\u013c\u013d\5P)\2\u013d\u013e\7\22\2\2\u013e\u013f"+
		"\5P)\2\u013f\u0140\7\26\2\2\u0140\u0141\5P)\2\u0141\u0142\5\4\3\2\u0142"+
		"\63\3\2\2\2\u0143\u0144\7\13\2\2\u0144\u0145\5P)\2\u0145\u0146\5J&\2\u0146"+
		"\u0151\5P)\2\u0147\u0148\t\2\2\2\u0148\u0149\5P)\2\u0149\u014a\5\4\3\2"+
		"\u014a\u0152\3\2\2\2\u014b\u014c\7\30\2\2\u014c\u014d\5P)\2\u014d\u014e"+
		"\5B\"\2\u014e\u014f\5P)\2\u014f\u0150\5\4\3\2\u0150\u0152\3\2\2\2\u0151"+
		"\u0147\3\2\2\2\u0151\u014b\3\2\2\2\u0152\65\3\2\2\2\u0153\u0159\58\35"+
		"\2\u0154\u0159\5:\36\2\u0155\u0159\5<\37\2\u0156\u0159\5@!\2\u0157\u0159"+
		"\5D#\2\u0158\u0153\3\2\2\2\u0158\u0154\3\2\2\2\u0158\u0155\3\2\2\2\u0158"+
		"\u0156\3\2\2\2\u0158\u0157\3\2\2\2\u0159\67\3\2\2\2\u015a\u015b\7\5\2"+
		"\2\u015b9\3\2\2\2\u015c\u015d\7\35\2\2\u015d;\3\2\2\2\u015e\u015f\7\n"+
		"\2\2\u015f\u0160\5P)\2\u0160\u0166\7\21\2\2\u0161\u0162\5P)\2\u0162\u0163"+
		"\5> \2\u0163\u0165\3\2\2\2\u0164\u0161\3\2\2\2\u0165\u0168\3\2\2\2\u0166"+
		"\u0164\3\2\2\2\u0166\u0167\3\2\2\2\u0167\u0169\3\2\2\2\u0168\u0166\3\2"+
		"\2\2\u0169\u016a\5P)\2\u016a\u016b\7\22\2\2\u016b=\3\2\2\2\u016c\u016d"+
		"\5J&\2\u016d\u0178\5P)\2\u016e\u016f\t\2\2\2\u016f\u0170\5P)\2\u0170\u0171"+
		"\5\4\3\2\u0171\u0179\3\2\2\2\u0172\u0173\7\30\2\2\u0173\u0174\5P)\2\u0174"+
		"\u0175\5B\"\2\u0175\u0176\5P)\2\u0176\u0177\5\4\3\2\u0177\u0179\3\2\2"+
		"\2\u0178\u016e\3\2\2\2\u0178\u0172\3\2\2\2\u0179?\3\2\2\2\u017a\u017b"+
		"\7\23\2\2\u017b\u017c\5P)\2\u017c\u017d\5B\"\2\u017d\u0181\5P)\2\u017e"+
		"\u0180\5\4\3\2\u017f\u017e\3\2\2\2\u0180\u0183\3\2\2\2\u0181\u017f\3\2"+
		"\2\2\u0181\u0182\3\2\2\2\u0182\u0184\3\2\2\2\u0183\u0181\3\2\2\2\u0184"+
		"\u0185\5P)\2\u0185\u0186\7\24\2\2\u0186A\3\2\2\2\u0187\u018b\7\t\2\2\u0188"+
		"\u0189\5P)\2\u0189\u018a\5H%\2\u018a\u018c\3\2\2\2\u018b\u0188\3\2\2\2"+
		"\u018c\u018d\3\2\2\2\u018d\u018b\3\2\2\2\u018d\u018e\3\2\2\2\u018e\u018f"+
		"\3\2\2\2\u018f\u0190\5P)\2\u0190\u0191\7\t\2\2\u0191\u0193\3\2\2\2\u0192"+
		"\u0187\3\2\2\2\u0192\u0193\3\2\2\2\u0193C\3\2\2\2\u0194\u0195\7\4\2\2"+
		"\u0195E\3\2\2\2\u0196\u0197\7\r\2\2\u0197\u0198\5P)\2\u0198\u0199\5H%"+
		"\2\u0199G\3\2\2\2\u019a\u019b\t\3\2\2\u019bI\3\2\2\2\u019c\u01a0\5H%\2"+
		"\u019d\u01a0\5L\'\2\u019e\u01a0\5N(\2\u019f\u019c\3\2\2\2\u019f\u019d"+
		"\3\2\2\2\u019f\u019e\3\2\2\2\u01a0K\3\2\2\2\u01a1\u01a2\7\25\2\2\u01a2"+
		"M\3\2\2\2\u01a3\u01a4\7\21\2\2\u01a4\u01a5\5P)\2\u01a5\u01a6\7\22\2\2"+
		"\u01a6O\3\2\2\2\u01a7\u01a9\7\31\2\2\u01a8\u01a7\3\2\2\2\u01a9\u01ac\3"+
		"\2\2\2\u01aa\u01a8\3\2\2\2\u01aa\u01ab\3\2\2\2\u01abQ\3\2\2\2\u01ac\u01aa"+
		"\3\2\2\2&Wao{\u0082\u0087\u008f\u0099\u009c\u00a3\u00b1\u00bc\u00c7\u00d2"+
		"\u00d8\u00e0\u00e5\u00ec\u00ee\u00f9\u0106\u0109\u0112\u0126\u012e\u0133"+
		"\u0137\u0151\u0158\u0166\u0178\u0181\u018d\u0192\u019f\u01aa";
	public static final ATN _ATN =
		ATNSimulator.deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}