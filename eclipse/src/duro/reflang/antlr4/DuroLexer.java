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
		KW_RETURN=15, ID=16, WS=17, SINGLELINE_COMMENT=18, MULTI_LINE_COMMENT=19;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] tokenNames = {
		"<INVALID>",
		"BIN_OP", "'#'", "'{'", "'}'", "'('", "')'", "'='", "INT", "';'", "','", 
		"':'", "'var'", "'pause'", "'function'", "'return'", "ID", "WS", "SINGLELINE_COMMENT", 
		"MULTI_LINE_COMMENT"
	};
	public static final String[] ruleNames = {
		"BIN_OP", "HASH", "OPEN_BRA", "CLOSE_BRA", "OPEN_PAR", "CLOSE_PAR", "EQUALS", 
		"INT", "SEMICOLON", "COMMA", "COLON", "KW_VAR", "KW_PAUSE", "KW_FUNCTION", 
		"KW_RETURN", "DIGIT", "LETTER", "ID", "WS", "SINGLELINE_COMMENT", "MULTI_LINE_COMMENT"
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
		case 18: WS_action((RuleContext)_localctx, actionIndex); break;

		case 19: SINGLELINE_COMMENT_action((RuleContext)_localctx, actionIndex); break;

		case 20: MULTI_LINE_COMMENT_action((RuleContext)_localctx, actionIndex); break;
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
		"\3\uacf5\uee8c\u4f5d\u8b0d\u4a45\u78bd\u1b2f\u3378\2\25\u008e\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\3\2\3\2\3\3\3\3\3\4\3\4"+
		"\3\5\3\5\3\6\3\6\3\7\3\7\3\b\3\b\3\t\6\t=\n\t\r\t\16\t>\3\n\3\n\3\13\3"+
		"\13\3\f\3\f\3\r\3\r\3\r\3\r\3\16\3\16\3\16\3\16\3\16\3\16\3\17\3\17\3"+
		"\17\3\17\3\17\3\17\3\17\3\17\3\17\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3"+
		"\21\3\21\3\22\5\22d\n\22\3\23\3\23\3\23\3\23\7\23j\n\23\f\23\16\23m\13"+
		"\23\3\24\6\24p\n\24\r\24\16\24q\3\24\3\24\3\25\3\25\3\25\3\25\7\25z\n"+
		"\25\f\25\16\25}\13\25\3\25\3\25\3\26\3\26\3\26\3\26\7\26\u0085\n\26\f"+
		"\26\16\26\u0088\13\26\3\26\3\26\3\26\3\26\3\26\3\u0086\27\3\3\1\5\4\1"+
		"\7\5\1\t\6\1\13\7\1\r\b\1\17\t\1\21\n\1\23\13\1\25\f\1\27\r\1\31\16\1"+
		"\33\17\1\35\20\1\37\21\1!\2\1#\2\1%\22\1\'\23\2)\24\3+\25\4\3\2\6\5\2"+
		",-//\61\61\4\2C\\c|\5\2\13\f\16\17\"\"\4\2\f\f\17\17\u0092\2\3\3\2\2\2"+
		"\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2"+
		"\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2"+
		"\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2"+
		"\2\2\2+\3\2\2\2\3-\3\2\2\2\5/\3\2\2\2\7\61\3\2\2\2\t\63\3\2\2\2\13\65"+
		"\3\2\2\2\r\67\3\2\2\2\179\3\2\2\2\21<\3\2\2\2\23@\3\2\2\2\25B\3\2\2\2"+
		"\27D\3\2\2\2\31F\3\2\2\2\33J\3\2\2\2\35P\3\2\2\2\37Y\3\2\2\2!`\3\2\2\2"+
		"#c\3\2\2\2%e\3\2\2\2\'o\3\2\2\2)u\3\2\2\2+\u0080\3\2\2\2-.\t\2\2\2.\4"+
		"\3\2\2\2/\60\7%\2\2\60\6\3\2\2\2\61\62\7}\2\2\62\b\3\2\2\2\63\64\7\177"+
		"\2\2\64\n\3\2\2\2\65\66\7*\2\2\66\f\3\2\2\2\678\7+\2\28\16\3\2\2\29:\7"+
		"?\2\2:\20\3\2\2\2;=\5!\21\2<;\3\2\2\2=>\3\2\2\2><\3\2\2\2>?\3\2\2\2?\22"+
		"\3\2\2\2@A\7=\2\2A\24\3\2\2\2BC\7.\2\2C\26\3\2\2\2DE\7<\2\2E\30\3\2\2"+
		"\2FG\7x\2\2GH\7c\2\2HI\7t\2\2I\32\3\2\2\2JK\7r\2\2KL\7c\2\2LM\7w\2\2M"+
		"N\7u\2\2NO\7g\2\2O\34\3\2\2\2PQ\7h\2\2QR\7w\2\2RS\7p\2\2ST\7e\2\2TU\7"+
		"v\2\2UV\7k\2\2VW\7q\2\2WX\7p\2\2X\36\3\2\2\2YZ\7t\2\2Z[\7g\2\2[\\\7v\2"+
		"\2\\]\7w\2\2]^\7t\2\2^_\7p\2\2_ \3\2\2\2`a\4\62;\2a\"\3\2\2\2bd\t\3\2"+
		"\2cb\3\2\2\2d$\3\2\2\2ek\5#\22\2fj\5#\22\2gj\5!\21\2hj\7a\2\2if\3\2\2"+
		"\2ig\3\2\2\2ih\3\2\2\2jm\3\2\2\2ki\3\2\2\2kl\3\2\2\2l&\3\2\2\2mk\3\2\2"+
		"\2np\t\4\2\2on\3\2\2\2pq\3\2\2\2qo\3\2\2\2qr\3\2\2\2rs\3\2\2\2st\b\24"+
		"\2\2t(\3\2\2\2uv\7\61\2\2vw\7\61\2\2w{\3\2\2\2xz\n\5\2\2yx\3\2\2\2z}\3"+
		"\2\2\2{y\3\2\2\2{|\3\2\2\2|~\3\2\2\2}{\3\2\2\2~\177\b\25\3\2\177*\3\2"+
		"\2\2\u0080\u0081\7\61\2\2\u0081\u0082\7,\2\2\u0082\u0086\3\2\2\2\u0083"+
		"\u0085\13\2\2\2\u0084\u0083\3\2\2\2\u0085\u0088\3\2\2\2\u0086\u0087\3"+
		"\2\2\2\u0086\u0084\3\2\2\2\u0087\u0089\3\2\2\2\u0088\u0086\3\2\2\2\u0089"+
		"\u008a\7,\2\2\u008a\u008b\7\61\2\2\u008b\u008c\3\2\2\2\u008c\u008d\b\26"+
		"\4\2\u008d,\3\2\2\2\n\2>cikq{\u0086";
	public static final ATN _ATN =
		ATNSimulator.deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}