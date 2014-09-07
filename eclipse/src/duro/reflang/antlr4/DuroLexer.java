// Generated from C:\github\duro\eclipse\src\duro\reflang\antlr4\Duro.g4 by ANTLR 4.1
package duro.reflang.antlr4;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class DuroLexer extends Lexer {
	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		BIN_OP=1, HASH=2, OPEN_BRA=3, CLOSE_BRA=4, OPEN_PAR=5, CLOSE_PAR=6, EQUALS=7, 
		INT=8, SEMICOLON=9, COMMA=10, COLON=11, KW_VAR=12, KW_PAUSE=13, KW_FUNCTION=14, 
		KW_RETURN=15, KW_TRUE=16, KW_FALSE=17, KW_IF=18, KW_ELSE=19, ID=20, WS=21, 
		SINGLELINE_COMMENT=22, MULTI_LINE_COMMENT=23;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] tokenNames = {
		"<INVALID>",
		"BIN_OP", "'#'", "'{'", "'}'", "'('", "')'", "'='", "INT", "';'", "','", 
		"':'", "'var'", "'pause'", "'function'", "'return'", "'true'", "'false'", 
		"'if'", "'else'", "ID", "WS", "SINGLELINE_COMMENT", "MULTI_LINE_COMMENT"
	};
	public static final String[] ruleNames = {
		"BIN_OP", "HASH", "OPEN_BRA", "CLOSE_BRA", "OPEN_PAR", "CLOSE_PAR", "EQUALS", 
		"INT", "SEMICOLON", "COMMA", "COLON", "KW_VAR", "KW_PAUSE", "KW_FUNCTION", 
		"KW_RETURN", "KW_TRUE", "KW_FALSE", "KW_IF", "KW_ELSE", "DIGIT", "LETTER", 
		"ID", "WS", "SINGLELINE_COMMENT", "MULTI_LINE_COMMENT"
	};


	public DuroLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "Duro.g4"; }

	@Override
	public String[] getTokenNames() { return tokenNames; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	@Override
	public void action(RuleContext _localctx, int ruleIndex, int actionIndex) {
		switch (ruleIndex) {
		case 22: WS_action((RuleContext)_localctx, actionIndex); break;

		case 23: SINGLELINE_COMMENT_action((RuleContext)_localctx, actionIndex); break;

		case 24: MULTI_LINE_COMMENT_action((RuleContext)_localctx, actionIndex); break;
		}
	}
	private void MULTI_LINE_COMMENT_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 2: skip();  break;
		}
	}
	private void SINGLELINE_COMMENT_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 1: skip();  break;
		}
	}
	private void WS_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 0: skip();  break;
		}
	}

	public static final String _serializedATN =
		"\3\uacf5\uee8c\u4f5d\u8b0d\u4a45\u78bd\u1b2f\u3378\2\31\u00a9\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31"+
		"\t\31\4\32\t\32\3\2\3\2\3\3\3\3\3\4\3\4\3\5\3\5\3\6\3\6\3\7\3\7\3\b\3"+
		"\b\3\t\6\tE\n\t\r\t\16\tF\3\n\3\n\3\13\3\13\3\f\3\f\3\r\3\r\3\r\3\r\3"+
		"\16\3\16\3\16\3\16\3\16\3\16\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3"+
		"\17\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\21\3\21\3\21\3\21\3\21\3\22\3"+
		"\22\3\22\3\22\3\22\3\22\3\23\3\23\3\23\3\24\3\24\3\24\3\24\3\24\3\25\3"+
		"\25\3\26\5\26\177\n\26\3\27\3\27\3\27\3\27\7\27\u0085\n\27\f\27\16\27"+
		"\u0088\13\27\3\30\6\30\u008b\n\30\r\30\16\30\u008c\3\30\3\30\3\31\3\31"+
		"\3\31\3\31\7\31\u0095\n\31\f\31\16\31\u0098\13\31\3\31\3\31\3\32\3\32"+
		"\3\32\3\32\7\32\u00a0\n\32\f\32\16\32\u00a3\13\32\3\32\3\32\3\32\3\32"+
		"\3\32\3\u00a1\33\3\3\1\5\4\1\7\5\1\t\6\1\13\7\1\r\b\1\17\t\1\21\n\1\23"+
		"\13\1\25\f\1\27\r\1\31\16\1\33\17\1\35\20\1\37\21\1!\22\1#\23\1%\24\1"+
		"\'\25\1)\2\1+\2\1-\26\1/\27\2\61\30\3\63\31\4\3\2\6\5\2,-//\61\61\4\2"+
		"C\\c|\5\2\13\f\16\17\"\"\4\2\f\f\17\17\u00ad\2\3\3\2\2\2\2\5\3\2\2\2\2"+
		"\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2"+
		"\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2"+
		"\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2"+
		"\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\3\65\3\2\2\2\5\67\3"+
		"\2\2\2\79\3\2\2\2\t;\3\2\2\2\13=\3\2\2\2\r?\3\2\2\2\17A\3\2\2\2\21D\3"+
		"\2\2\2\23H\3\2\2\2\25J\3\2\2\2\27L\3\2\2\2\31N\3\2\2\2\33R\3\2\2\2\35"+
		"X\3\2\2\2\37a\3\2\2\2!h\3\2\2\2#m\3\2\2\2%s\3\2\2\2\'v\3\2\2\2){\3\2\2"+
		"\2+~\3\2\2\2-\u0080\3\2\2\2/\u008a\3\2\2\2\61\u0090\3\2\2\2\63\u009b\3"+
		"\2\2\2\65\66\t\2\2\2\66\4\3\2\2\2\678\7%\2\28\6\3\2\2\29:\7}\2\2:\b\3"+
		"\2\2\2;<\7\177\2\2<\n\3\2\2\2=>\7*\2\2>\f\3\2\2\2?@\7+\2\2@\16\3\2\2\2"+
		"AB\7?\2\2B\20\3\2\2\2CE\5)\25\2DC\3\2\2\2EF\3\2\2\2FD\3\2\2\2FG\3\2\2"+
		"\2G\22\3\2\2\2HI\7=\2\2I\24\3\2\2\2JK\7.\2\2K\26\3\2\2\2LM\7<\2\2M\30"+
		"\3\2\2\2NO\7x\2\2OP\7c\2\2PQ\7t\2\2Q\32\3\2\2\2RS\7r\2\2ST\7c\2\2TU\7"+
		"w\2\2UV\7u\2\2VW\7g\2\2W\34\3\2\2\2XY\7h\2\2YZ\7w\2\2Z[\7p\2\2[\\\7e\2"+
		"\2\\]\7v\2\2]^\7k\2\2^_\7q\2\2_`\7p\2\2`\36\3\2\2\2ab\7t\2\2bc\7g\2\2"+
		"cd\7v\2\2de\7w\2\2ef\7t\2\2fg\7p\2\2g \3\2\2\2hi\7v\2\2ij\7t\2\2jk\7w"+
		"\2\2kl\7g\2\2l\"\3\2\2\2mn\7h\2\2no\7c\2\2op\7n\2\2pq\7u\2\2qr\7g\2\2"+
		"r$\3\2\2\2st\7k\2\2tu\7h\2\2u&\3\2\2\2vw\7g\2\2wx\7n\2\2xy\7u\2\2yz\7"+
		"g\2\2z(\3\2\2\2{|\4\62;\2|*\3\2\2\2}\177\t\3\2\2~}\3\2\2\2\177,\3\2\2"+
		"\2\u0080\u0086\5+\26\2\u0081\u0085\5+\26\2\u0082\u0085\5)\25\2\u0083\u0085"+
		"\7a\2\2\u0084\u0081\3\2\2\2\u0084\u0082\3\2\2\2\u0084\u0083\3\2\2\2\u0085"+
		"\u0088\3\2\2\2\u0086\u0084\3\2\2\2\u0086\u0087\3\2\2\2\u0087.\3\2\2\2"+
		"\u0088\u0086\3\2\2\2\u0089\u008b\t\4\2\2\u008a\u0089\3\2\2\2\u008b\u008c"+
		"\3\2\2\2\u008c\u008a\3\2\2\2\u008c\u008d\3\2\2\2\u008d\u008e\3\2\2\2\u008e"+
		"\u008f\b\30\2\2\u008f\60\3\2\2\2\u0090\u0091\7\61\2\2\u0091\u0092\7\61"+
		"\2\2\u0092\u0096\3\2\2\2\u0093\u0095\n\5\2\2\u0094\u0093\3\2\2\2\u0095"+
		"\u0098\3\2\2\2\u0096\u0094\3\2\2\2\u0096\u0097\3\2\2\2\u0097\u0099\3\2"+
		"\2\2\u0098\u0096\3\2\2\2\u0099\u009a\b\31\3\2\u009a\62\3\2\2\2\u009b\u009c"+
		"\7\61\2\2\u009c\u009d\7,\2\2\u009d\u00a1\3\2\2\2\u009e\u00a0\13\2\2\2"+
		"\u009f\u009e\3\2\2\2\u00a0\u00a3\3\2\2\2\u00a1\u00a2\3\2\2\2\u00a1\u009f"+
		"\3\2\2\2\u00a2\u00a4\3\2\2\2\u00a3\u00a1\3\2\2\2\u00a4\u00a5\7,\2\2\u00a5"+
		"\u00a6\7\61\2\2\u00a6\u00a7\3\2\2\2\u00a7\u00a8\b\32\4\2\u00a8\64\3\2"+
		"\2\2\n\2F~\u0084\u0086\u008c\u0096\u00a1";
	public static final ATN _ATN =
		ATNSimulator.deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}