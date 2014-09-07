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
		STRING_LITERAL=1, LINE_TERMINATOR=2, BIN_OP1=3, BIN_OP2=4, HASH=5, OPEN_BRA=6, 
		CLOSE_BRA=7, OPEN_PAR=8, CLOSE_PAR=9, EQUALS=10, INT=11, SEMICOLON=12, 
		COMMA=13, COLON=14, KW_VAR=15, KW_PAUSE=16, KW_FUNCTION=17, KW_RETURN=18, 
		KW_TRUE=19, KW_FALSE=20, KW_IF=21, KW_ELSE=22, ID=23, WS=24, SINGLELINE_COMMENT=25, 
		MULTI_LINE_COMMENT=26;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] tokenNames = {
		"<INVALID>",
		"STRING_LITERAL", "LINE_TERMINATOR", "BIN_OP1", "BIN_OP2", "'#'", "'{'", 
		"'}'", "'('", "')'", "'='", "INT", "';'", "','", "':'", "'var'", "'pause'", 
		"'function'", "'return'", "'true'", "'false'", "'if'", "'else'", "ID", 
		"WS", "SINGLELINE_COMMENT", "MULTI_LINE_COMMENT"
	};
	public static final String[] ruleNames = {
		"STRING_LITERAL", "DOUBLE_STRING_CHARACTER", "SINGLE_STRING_CHARACTER", 
		"ESCAPE_SEQUENCE", "CHARACTER_ESCAPE_SEQUENCE", "HEX_ESCAPE_SEQUENCE", 
		"UNICODE_ESCAPE_SEQUENCE", "SINGLE_ESCAPE_CHARACTER", "NON_ESCAPE_CHARACTER", 
		"ESCAPE_CHARACTER", "LINE_CONTINUATION", "LINE_TERMINATOR_SEQUENCE", "HEX_DIGIT", 
		"LINE_TERMINATOR", "BIN_OP1", "BIN_OP2", "HASH", "OPEN_BRA", "CLOSE_BRA", 
		"OPEN_PAR", "CLOSE_PAR", "EQUALS", "INT", "SEMICOLON", "COMMA", "COLON", 
		"KW_VAR", "KW_PAUSE", "KW_FUNCTION", "KW_RETURN", "KW_TRUE", "KW_FALSE", 
		"KW_IF", "KW_ELSE", "DIGIT", "LETTER", "ID", "WS", "SINGLELINE_COMMENT", 
		"MULTI_LINE_COMMENT"
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
		case 13: LINE_TERMINATOR_action((RuleContext)_localctx, actionIndex); break;

		case 37: WS_action((RuleContext)_localctx, actionIndex); break;

		case 38: SINGLELINE_COMMENT_action((RuleContext)_localctx, actionIndex); break;

		case 39: MULTI_LINE_COMMENT_action((RuleContext)_localctx, actionIndex); break;
		}
	}
	private void MULTI_LINE_COMMENT_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 3: skip();  break;
		}
	}
	private void SINGLELINE_COMMENT_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 2: skip();  break;
		}
	}
	private void LINE_TERMINATOR_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 0: _channel = HIDDEN;  break;
		}
	}
	private void WS_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 1: skip();  break;
		}
	}

	public static final String _serializedATN =
		"\3\uacf5\uee8c\u4f5d\u8b0d\u4a45\u78bd\u1b2f\u3378\2\34\u0112\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31"+
		"\t\31\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t"+
		" \4!\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\3\2\3\2\7"+
		"\2V\n\2\f\2\16\2Y\13\2\3\2\3\2\3\2\7\2^\n\2\f\2\16\2a\13\2\3\2\5\2d\n"+
		"\2\3\3\3\3\3\3\3\3\5\3j\n\3\3\4\3\4\3\4\3\4\5\4p\n\4\3\5\3\5\3\5\3\5\5"+
		"\5v\n\5\3\6\3\6\5\6z\n\6\3\7\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3\b\3\t\3"+
		"\t\3\n\3\n\3\13\3\13\3\13\5\13\u008d\n\13\3\f\3\f\3\f\3\r\3\r\3\r\5\r"+
		"\u0095\n\r\3\16\3\16\3\17\3\17\3\17\3\17\3\20\3\20\3\21\3\21\3\22\3\22"+
		"\3\23\3\23\3\24\3\24\3\25\3\25\3\26\3\26\3\27\3\27\3\30\6\30\u00ae\n\30"+
		"\r\30\16\30\u00af\3\31\3\31\3\32\3\32\3\33\3\33\3\34\3\34\3\34\3\34\3"+
		"\35\3\35\3\35\3\35\3\35\3\35\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3"+
		"\36\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3 \3 \3 \3 \3 \3!\3!\3!\3!\3!\3"+
		"!\3\"\3\"\3\"\3#\3#\3#\3#\3#\3$\3$\3%\5%\u00e8\n%\3&\3&\3&\3&\7&\u00ee"+
		"\n&\f&\16&\u00f1\13&\3\'\6\'\u00f4\n\'\r\'\16\'\u00f5\3\'\3\'\3(\3(\3"+
		"(\3(\7(\u00fe\n(\f(\16(\u0101\13(\3(\3(\3)\3)\3)\3)\7)\u0109\n)\f)\16"+
		")\u010c\13)\3)\3)\3)\3)\3)\3\u010a*\3\3\1\5\2\1\7\2\1\t\2\1\13\2\1\r\2"+
		"\1\17\2\1\21\2\1\23\2\1\25\2\1\27\2\1\31\2\1\33\2\1\35\4\2\37\5\1!\6\1"+
		"#\7\1%\b\1\'\t\1)\n\1+\13\1-\f\1/\r\1\61\16\1\63\17\1\65\20\1\67\21\1"+
		"9\22\1;\23\1=\24\1?\25\1A\26\1C\27\1E\30\1G\2\1I\2\1K\31\1M\32\3O\33\4"+
		"Q\34\5\3\2\16\6\2\f\f\17\17$$^^\6\2\f\f\17\17))^^\13\2$$))^^ddhhppttv"+
		"vxx\16\2\f\f\17\17$$))\62;^^ddhhppttvxzz\4\2wwzz\5\2\62;CHch\5\2\f\f\17"+
		"\17\u202a\u202b\4\2--//\4\2,,\61\61\4\2C\\c|\5\2\13\f\16\17\"\"\4\2\f"+
		"\f\17\17\u0118\2\3\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2"+
		"\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2"+
		"\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3"+
		"\2\2\2\2=\3\2\2\2\2?\3\2\2\2\2A\3\2\2\2\2C\3\2\2\2\2E\3\2\2\2\2K\3\2\2"+
		"\2\2M\3\2\2\2\2O\3\2\2\2\2Q\3\2\2\2\3c\3\2\2\2\5i\3\2\2\2\7o\3\2\2\2\t"+
		"u\3\2\2\2\13y\3\2\2\2\r{\3\2\2\2\17\177\3\2\2\2\21\u0085\3\2\2\2\23\u0087"+
		"\3\2\2\2\25\u008c\3\2\2\2\27\u008e\3\2\2\2\31\u0094\3\2\2\2\33\u0096\3"+
		"\2\2\2\35\u0098\3\2\2\2\37\u009c\3\2\2\2!\u009e\3\2\2\2#\u00a0\3\2\2\2"+
		"%\u00a2\3\2\2\2\'\u00a4\3\2\2\2)\u00a6\3\2\2\2+\u00a8\3\2\2\2-\u00aa\3"+
		"\2\2\2/\u00ad\3\2\2\2\61\u00b1\3\2\2\2\63\u00b3\3\2\2\2\65\u00b5\3\2\2"+
		"\2\67\u00b7\3\2\2\29\u00bb\3\2\2\2;\u00c1\3\2\2\2=\u00ca\3\2\2\2?\u00d1"+
		"\3\2\2\2A\u00d6\3\2\2\2C\u00dc\3\2\2\2E\u00df\3\2\2\2G\u00e4\3\2\2\2I"+
		"\u00e7\3\2\2\2K\u00e9\3\2\2\2M\u00f3\3\2\2\2O\u00f9\3\2\2\2Q\u0104\3\2"+
		"\2\2SW\7$\2\2TV\5\5\3\2UT\3\2\2\2VY\3\2\2\2WU\3\2\2\2WX\3\2\2\2XZ\3\2"+
		"\2\2YW\3\2\2\2Zd\7$\2\2[_\7)\2\2\\^\5\7\4\2]\\\3\2\2\2^a\3\2\2\2_]\3\2"+
		"\2\2_`\3\2\2\2`b\3\2\2\2a_\3\2\2\2bd\7)\2\2cS\3\2\2\2c[\3\2\2\2d\4\3\2"+
		"\2\2ej\n\2\2\2fg\7^\2\2gj\5\t\5\2hj\5\27\f\2ie\3\2\2\2if\3\2\2\2ih\3\2"+
		"\2\2j\6\3\2\2\2kp\n\3\2\2lm\7^\2\2mp\5\t\5\2np\5\27\f\2ok\3\2\2\2ol\3"+
		"\2\2\2on\3\2\2\2p\b\3\2\2\2qv\5\13\6\2rv\7\62\2\2sv\5\r\7\2tv\5\17\b\2"+
		"uq\3\2\2\2ur\3\2\2\2us\3\2\2\2ut\3\2\2\2v\n\3\2\2\2wz\5\21\t\2xz\5\23"+
		"\n\2yw\3\2\2\2yx\3\2\2\2z\f\3\2\2\2{|\7z\2\2|}\5\33\16\2}~\5\33\16\2~"+
		"\16\3\2\2\2\177\u0080\7w\2\2\u0080\u0081\5\33\16\2\u0081\u0082\5\33\16"+
		"\2\u0082\u0083\5\33\16\2\u0083\u0084\5\33\16\2\u0084\20\3\2\2\2\u0085"+
		"\u0086\t\4\2\2\u0086\22\3\2\2\2\u0087\u0088\n\5\2\2\u0088\24\3\2\2\2\u0089"+
		"\u008d\5\21\t\2\u008a\u008d\5G$\2\u008b\u008d\t\6\2\2\u008c\u0089\3\2"+
		"\2\2\u008c\u008a\3\2\2\2\u008c\u008b\3\2\2\2\u008d\26\3\2\2\2\u008e\u008f"+
		"\7^\2\2\u008f\u0090\5\31\r\2\u0090\30\3\2\2\2\u0091\u0092\7\17\2\2\u0092"+
		"\u0095\7\f\2\2\u0093\u0095\5\35\17\2\u0094\u0091\3\2\2\2\u0094\u0093\3"+
		"\2\2\2\u0095\32\3\2\2\2\u0096\u0097\t\7\2\2\u0097\34\3\2\2\2\u0098\u0099"+
		"\t\b\2\2\u0099\u009a\3\2\2\2\u009a\u009b\b\17\2\2\u009b\36\3\2\2\2\u009c"+
		"\u009d\t\t\2\2\u009d \3\2\2\2\u009e\u009f\t\n\2\2\u009f\"\3\2\2\2\u00a0"+
		"\u00a1\7%\2\2\u00a1$\3\2\2\2\u00a2\u00a3\7}\2\2\u00a3&\3\2\2\2\u00a4\u00a5"+
		"\7\177\2\2\u00a5(\3\2\2\2\u00a6\u00a7\7*\2\2\u00a7*\3\2\2\2\u00a8\u00a9"+
		"\7+\2\2\u00a9,\3\2\2\2\u00aa\u00ab\7?\2\2\u00ab.\3\2\2\2\u00ac\u00ae\5"+
		"G$\2\u00ad\u00ac\3\2\2\2\u00ae\u00af\3\2\2\2\u00af\u00ad\3\2\2\2\u00af"+
		"\u00b0\3\2\2\2\u00b0\60\3\2\2\2\u00b1\u00b2\7=\2\2\u00b2\62\3\2\2\2\u00b3"+
		"\u00b4\7.\2\2\u00b4\64\3\2\2\2\u00b5\u00b6\7<\2\2\u00b6\66\3\2\2\2\u00b7"+
		"\u00b8\7x\2\2\u00b8\u00b9\7c\2\2\u00b9\u00ba\7t\2\2\u00ba8\3\2\2\2\u00bb"+
		"\u00bc\7r\2\2\u00bc\u00bd\7c\2\2\u00bd\u00be\7w\2\2\u00be\u00bf\7u\2\2"+
		"\u00bf\u00c0\7g\2\2\u00c0:\3\2\2\2\u00c1\u00c2\7h\2\2\u00c2\u00c3\7w\2"+
		"\2\u00c3\u00c4\7p\2\2\u00c4\u00c5\7e\2\2\u00c5\u00c6\7v\2\2\u00c6\u00c7"+
		"\7k\2\2\u00c7\u00c8\7q\2\2\u00c8\u00c9\7p\2\2\u00c9<\3\2\2\2\u00ca\u00cb"+
		"\7t\2\2\u00cb\u00cc\7g\2\2\u00cc\u00cd\7v\2\2\u00cd\u00ce\7w\2\2\u00ce"+
		"\u00cf\7t\2\2\u00cf\u00d0\7p\2\2\u00d0>\3\2\2\2\u00d1\u00d2\7v\2\2\u00d2"+
		"\u00d3\7t\2\2\u00d3\u00d4\7w\2\2\u00d4\u00d5\7g\2\2\u00d5@\3\2\2\2\u00d6"+
		"\u00d7\7h\2\2\u00d7\u00d8\7c\2\2\u00d8\u00d9\7n\2\2\u00d9\u00da\7u\2\2"+
		"\u00da\u00db\7g\2\2\u00dbB\3\2\2\2\u00dc\u00dd\7k\2\2\u00dd\u00de\7h\2"+
		"\2\u00deD\3\2\2\2\u00df\u00e0\7g\2\2\u00e0\u00e1\7n\2\2\u00e1\u00e2\7"+
		"u\2\2\u00e2\u00e3\7g\2\2\u00e3F\3\2\2\2\u00e4\u00e5\4\62;\2\u00e5H\3\2"+
		"\2\2\u00e6\u00e8\t\13\2\2\u00e7\u00e6\3\2\2\2\u00e8J\3\2\2\2\u00e9\u00ef"+
		"\5I%\2\u00ea\u00ee\5I%\2\u00eb\u00ee\5G$\2\u00ec\u00ee\7a\2\2\u00ed\u00ea"+
		"\3\2\2\2\u00ed\u00eb\3\2\2\2\u00ed\u00ec\3\2\2\2\u00ee\u00f1\3\2\2\2\u00ef"+
		"\u00ed\3\2\2\2\u00ef\u00f0\3\2\2\2\u00f0L\3\2\2\2\u00f1\u00ef\3\2\2\2"+
		"\u00f2\u00f4\t\f\2\2\u00f3\u00f2\3\2\2\2\u00f4\u00f5\3\2\2\2\u00f5\u00f3"+
		"\3\2\2\2\u00f5\u00f6\3\2\2\2\u00f6\u00f7\3\2\2\2\u00f7\u00f8\b\'\3\2\u00f8"+
		"N\3\2\2\2\u00f9\u00fa\7\61\2\2\u00fa\u00fb\7\61\2\2\u00fb\u00ff\3\2\2"+
		"\2\u00fc\u00fe\n\r\2\2\u00fd\u00fc\3\2\2\2\u00fe\u0101\3\2\2\2\u00ff\u00fd"+
		"\3\2\2\2\u00ff\u0100\3\2\2\2\u0100\u0102\3\2\2\2\u0101\u00ff\3\2\2\2\u0102"+
		"\u0103\b(\4\2\u0103P\3\2\2\2\u0104\u0105\7\61\2\2\u0105\u0106\7,\2\2\u0106"+
		"\u010a\3\2\2\2\u0107\u0109\13\2\2\2\u0108\u0107\3\2\2\2\u0109\u010c\3"+
		"\2\2\2\u010a\u010b\3\2\2\2\u010a\u0108\3\2\2\2\u010b\u010d\3\2\2\2\u010c"+
		"\u010a\3\2\2\2\u010d\u010e\7,\2\2\u010e\u010f\7\61\2\2\u010f\u0110\3\2"+
		"\2\2\u0110\u0111\b)\5\2\u0111R\3\2\2\2\23\2W_ciouy\u008c\u0094\u00af\u00e7"+
		"\u00ed\u00ef\u00f5\u00ff\u010a";
	public static final ATN _ATN =
		ATNSimulator.deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}