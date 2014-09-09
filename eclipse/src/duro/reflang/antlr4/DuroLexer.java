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
		STRING_LITERAL=1, LINE_TERMINATOR=2, DOUBLE_AMP=3, DOUBLE_PIPE=4, BIN_OP1=5, 
		BIN_OP2=6, HASH=7, OPEN_SQ=8, CLOSE_SQ=9, OPEN_BRA=10, CLOSE_BRA=11, OPEN_PAR=12, 
		CLOSE_PAR=13, EQUALS=14, DOUBLE_EQUALS=15, INT=16, SEMICOLON=17, COMMA=18, 
		COLON=19, KW_VAR=20, KW_PAUSE=21, KW_FUNCTION=22, KW_RETURN=23, KW_TRUE=24, 
		KW_FALSE=25, KW_IF=26, KW_ELSE=27, KW_THIS=28, KW_WHILE=29, KW_FOR=30, 
		KW_IN=31, ID=32, WS=33, SINGLELINE_COMMENT=34, MULTI_LINE_COMMENT=35;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] tokenNames = {
		"<INVALID>",
		"STRING_LITERAL", "LINE_TERMINATOR", "'&&'", "'||'", "BIN_OP1", "BIN_OP2", 
		"'#'", "'['", "']'", "'{'", "'}'", "'('", "')'", "'='", "'=='", "INT", 
		"';'", "','", "':'", "'var'", "'pause'", "'function'", "'return'", "'true'", 
		"'false'", "'if'", "'else'", "'this'", "'while'", "'for'", "'in'", "ID", 
		"WS", "SINGLELINE_COMMENT", "MULTI_LINE_COMMENT"
	};
	public static final String[] ruleNames = {
		"STRING_LITERAL", "DOUBLE_STRING_CHARACTER", "SINGLE_STRING_CHARACTER", 
		"ESCAPE_SEQUENCE", "CHARACTER_ESCAPE_SEQUENCE", "HEX_ESCAPE_SEQUENCE", 
		"UNICODE_ESCAPE_SEQUENCE", "SINGLE_ESCAPE_CHARACTER", "NON_ESCAPE_CHARACTER", 
		"ESCAPE_CHARACTER", "LINE_CONTINUATION", "LINE_TERMINATOR_SEQUENCE", "HEX_DIGIT", 
		"LINE_TERMINATOR", "DOUBLE_AMP", "DOUBLE_PIPE", "BIN_OP1", "BIN_OP2", 
		"HASH", "OPEN_SQ", "CLOSE_SQ", "OPEN_BRA", "CLOSE_BRA", "OPEN_PAR", "CLOSE_PAR", 
		"EQUALS", "DOUBLE_EQUALS", "INT", "SEMICOLON", "COMMA", "COLON", "KW_VAR", 
		"KW_PAUSE", "KW_FUNCTION", "KW_RETURN", "KW_TRUE", "KW_FALSE", "KW_IF", 
		"KW_ELSE", "KW_THIS", "KW_WHILE", "KW_FOR", "KW_IN", "DIGIT", "LETTER", 
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
		case 13: LINE_TERMINATOR_action((RuleContext)_localctx, actionIndex); break;

		case 46: WS_action((RuleContext)_localctx, actionIndex); break;

		case 47: SINGLELINE_COMMENT_action((RuleContext)_localctx, actionIndex); break;

		case 48: MULTI_LINE_COMMENT_action((RuleContext)_localctx, actionIndex); break;
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
		"\3\uacf5\uee8c\u4f5d\u8b0d\u4a45\u78bd\u1b2f\u3378\2%\u0143\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\3\2\3\2\7\2h\n\2"+
		"\f\2\16\2k\13\2\3\2\3\2\3\2\7\2p\n\2\f\2\16\2s\13\2\3\2\5\2v\n\2\3\3\3"+
		"\3\3\3\3\3\5\3|\n\3\3\4\3\4\3\4\3\4\5\4\u0082\n\4\3\5\3\5\3\5\3\5\5\5"+
		"\u0088\n\5\3\6\3\6\5\6\u008c\n\6\3\7\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3"+
		"\b\3\t\3\t\3\n\3\n\3\13\3\13\3\13\5\13\u009f\n\13\3\f\3\f\3\f\3\r\3\r"+
		"\3\r\5\r\u00a7\n\r\3\16\3\16\3\17\3\17\3\17\3\17\3\20\3\20\3\20\3\21\3"+
		"\21\3\21\3\22\3\22\3\23\3\23\3\24\3\24\3\25\3\25\3\26\3\26\3\27\3\27\3"+
		"\30\3\30\3\31\3\31\3\32\3\32\3\33\3\33\3\34\3\34\3\34\3\35\6\35\u00cd"+
		"\n\35\r\35\16\35\u00ce\3\36\3\36\3\37\3\37\3 \3 \3!\3!\3!\3!\3\"\3\"\3"+
		"\"\3\"\3\"\3\"\3#\3#\3#\3#\3#\3#\3#\3#\3#\3$\3$\3$\3$\3$\3$\3$\3%\3%\3"+
		"%\3%\3%\3&\3&\3&\3&\3&\3&\3\'\3\'\3\'\3(\3(\3(\3(\3(\3)\3)\3)\3)\3)\3"+
		"*\3*\3*\3*\3*\3*\3+\3+\3+\3+\3,\3,\3,\3-\3-\3.\5.\u0119\n.\3/\3/\3/\3"+
		"/\7/\u011f\n/\f/\16/\u0122\13/\3\60\6\60\u0125\n\60\r\60\16\60\u0126\3"+
		"\60\3\60\3\61\3\61\3\61\3\61\7\61\u012f\n\61\f\61\16\61\u0132\13\61\3"+
		"\61\3\61\3\62\3\62\3\62\3\62\7\62\u013a\n\62\f\62\16\62\u013d\13\62\3"+
		"\62\3\62\3\62\3\62\3\62\3\u013b\63\3\3\1\5\2\1\7\2\1\t\2\1\13\2\1\r\2"+
		"\1\17\2\1\21\2\1\23\2\1\25\2\1\27\2\1\31\2\1\33\2\1\35\4\2\37\5\1!\6\1"+
		"#\7\1%\b\1\'\t\1)\n\1+\13\1-\f\1/\r\1\61\16\1\63\17\1\65\20\1\67\21\1"+
		"9\22\1;\23\1=\24\1?\25\1A\26\1C\27\1E\30\1G\31\1I\32\1K\33\1M\34\1O\35"+
		"\1Q\36\1S\37\1U \1W!\1Y\2\1[\2\1]\"\1_#\3a$\4c%\5\3\2\16\6\2\f\f\17\17"+
		"$$^^\6\2\f\f\17\17))^^\13\2$$))^^ddhhppttvvxx\16\2\f\f\17\17$$))\62;^"+
		"^ddhhppttvxzz\4\2wwzz\5\2\62;CHch\5\2\f\f\17\17\u202a\u202b\4\2--//\4"+
		"\2,,\61\61\4\2C\\c|\5\2\13\f\16\17\"\"\4\2\f\f\17\17\u0149\2\3\3\2\2\2"+
		"\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2"+
		"\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2"+
		"\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3\2\2"+
		"\2\2A\3\2\2\2\2C\3\2\2\2\2E\3\2\2\2\2G\3\2\2\2\2I\3\2\2\2\2K\3\2\2\2\2"+
		"M\3\2\2\2\2O\3\2\2\2\2Q\3\2\2\2\2S\3\2\2\2\2U\3\2\2\2\2W\3\2\2\2\2]\3"+
		"\2\2\2\2_\3\2\2\2\2a\3\2\2\2\2c\3\2\2\2\3u\3\2\2\2\5{\3\2\2\2\7\u0081"+
		"\3\2\2\2\t\u0087\3\2\2\2\13\u008b\3\2\2\2\r\u008d\3\2\2\2\17\u0091\3\2"+
		"\2\2\21\u0097\3\2\2\2\23\u0099\3\2\2\2\25\u009e\3\2\2\2\27\u00a0\3\2\2"+
		"\2\31\u00a6\3\2\2\2\33\u00a8\3\2\2\2\35\u00aa\3\2\2\2\37\u00ae\3\2\2\2"+
		"!\u00b1\3\2\2\2#\u00b4\3\2\2\2%\u00b6\3\2\2\2\'\u00b8\3\2\2\2)\u00ba\3"+
		"\2\2\2+\u00bc\3\2\2\2-\u00be\3\2\2\2/\u00c0\3\2\2\2\61\u00c2\3\2\2\2\63"+
		"\u00c4\3\2\2\2\65\u00c6\3\2\2\2\67\u00c8\3\2\2\29\u00cc\3\2\2\2;\u00d0"+
		"\3\2\2\2=\u00d2\3\2\2\2?\u00d4\3\2\2\2A\u00d6\3\2\2\2C\u00da\3\2\2\2E"+
		"\u00e0\3\2\2\2G\u00e9\3\2\2\2I\u00f0\3\2\2\2K\u00f5\3\2\2\2M\u00fb\3\2"+
		"\2\2O\u00fe\3\2\2\2Q\u0103\3\2\2\2S\u0108\3\2\2\2U\u010e\3\2\2\2W\u0112"+
		"\3\2\2\2Y\u0115\3\2\2\2[\u0118\3\2\2\2]\u011a\3\2\2\2_\u0124\3\2\2\2a"+
		"\u012a\3\2\2\2c\u0135\3\2\2\2ei\7$\2\2fh\5\5\3\2gf\3\2\2\2hk\3\2\2\2i"+
		"g\3\2\2\2ij\3\2\2\2jl\3\2\2\2ki\3\2\2\2lv\7$\2\2mq\7)\2\2np\5\7\4\2on"+
		"\3\2\2\2ps\3\2\2\2qo\3\2\2\2qr\3\2\2\2rt\3\2\2\2sq\3\2\2\2tv\7)\2\2ue"+
		"\3\2\2\2um\3\2\2\2v\4\3\2\2\2w|\n\2\2\2xy\7^\2\2y|\5\t\5\2z|\5\27\f\2"+
		"{w\3\2\2\2{x\3\2\2\2{z\3\2\2\2|\6\3\2\2\2}\u0082\n\3\2\2~\177\7^\2\2\177"+
		"\u0082\5\t\5\2\u0080\u0082\5\27\f\2\u0081}\3\2\2\2\u0081~\3\2\2\2\u0081"+
		"\u0080\3\2\2\2\u0082\b\3\2\2\2\u0083\u0088\5\13\6\2\u0084\u0088\7\62\2"+
		"\2\u0085\u0088\5\r\7\2\u0086\u0088\5\17\b\2\u0087\u0083\3\2\2\2\u0087"+
		"\u0084\3\2\2\2\u0087\u0085\3\2\2\2\u0087\u0086\3\2\2\2\u0088\n\3\2\2\2"+
		"\u0089\u008c\5\21\t\2\u008a\u008c\5\23\n\2\u008b\u0089\3\2\2\2\u008b\u008a"+
		"\3\2\2\2\u008c\f\3\2\2\2\u008d\u008e\7z\2\2\u008e\u008f\5\33\16\2\u008f"+
		"\u0090\5\33\16\2\u0090\16\3\2\2\2\u0091\u0092\7w\2\2\u0092\u0093\5\33"+
		"\16\2\u0093\u0094\5\33\16\2\u0094\u0095\5\33\16\2\u0095\u0096\5\33\16"+
		"\2\u0096\20\3\2\2\2\u0097\u0098\t\4\2\2\u0098\22\3\2\2\2\u0099\u009a\n"+
		"\5\2\2\u009a\24\3\2\2\2\u009b\u009f\5\21\t\2\u009c\u009f\5Y-\2\u009d\u009f"+
		"\t\6\2\2\u009e\u009b\3\2\2\2\u009e\u009c\3\2\2\2\u009e\u009d\3\2\2\2\u009f"+
		"\26\3\2\2\2\u00a0\u00a1\7^\2\2\u00a1\u00a2\5\31\r\2\u00a2\30\3\2\2\2\u00a3"+
		"\u00a4\7\17\2\2\u00a4\u00a7\7\f\2\2\u00a5\u00a7\5\35\17\2\u00a6\u00a3"+
		"\3\2\2\2\u00a6\u00a5\3\2\2\2\u00a7\32\3\2\2\2\u00a8\u00a9\t\7\2\2\u00a9"+
		"\34\3\2\2\2\u00aa\u00ab\t\b\2\2\u00ab\u00ac\3\2\2\2\u00ac\u00ad\b\17\2"+
		"\2\u00ad\36\3\2\2\2\u00ae\u00af\7(\2\2\u00af\u00b0\7(\2\2\u00b0 \3\2\2"+
		"\2\u00b1\u00b2\7~\2\2\u00b2\u00b3\7~\2\2\u00b3\"\3\2\2\2\u00b4\u00b5\t"+
		"\t\2\2\u00b5$\3\2\2\2\u00b6\u00b7\t\n\2\2\u00b7&\3\2\2\2\u00b8\u00b9\7"+
		"%\2\2\u00b9(\3\2\2\2\u00ba\u00bb\7]\2\2\u00bb*\3\2\2\2\u00bc\u00bd\7_"+
		"\2\2\u00bd,\3\2\2\2\u00be\u00bf\7}\2\2\u00bf.\3\2\2\2\u00c0\u00c1\7\177"+
		"\2\2\u00c1\60\3\2\2\2\u00c2\u00c3\7*\2\2\u00c3\62\3\2\2\2\u00c4\u00c5"+
		"\7+\2\2\u00c5\64\3\2\2\2\u00c6\u00c7\7?\2\2\u00c7\66\3\2\2\2\u00c8\u00c9"+
		"\7?\2\2\u00c9\u00ca\7?\2\2\u00ca8\3\2\2\2\u00cb\u00cd\5Y-\2\u00cc\u00cb"+
		"\3\2\2\2\u00cd\u00ce\3\2\2\2\u00ce\u00cc\3\2\2\2\u00ce\u00cf\3\2\2\2\u00cf"+
		":\3\2\2\2\u00d0\u00d1\7=\2\2\u00d1<\3\2\2\2\u00d2\u00d3\7.\2\2\u00d3>"+
		"\3\2\2\2\u00d4\u00d5\7<\2\2\u00d5@\3\2\2\2\u00d6\u00d7\7x\2\2\u00d7\u00d8"+
		"\7c\2\2\u00d8\u00d9\7t\2\2\u00d9B\3\2\2\2\u00da\u00db\7r\2\2\u00db\u00dc"+
		"\7c\2\2\u00dc\u00dd\7w\2\2\u00dd\u00de\7u\2\2\u00de\u00df\7g\2\2\u00df"+
		"D\3\2\2\2\u00e0\u00e1\7h\2\2\u00e1\u00e2\7w\2\2\u00e2\u00e3\7p\2\2\u00e3"+
		"\u00e4\7e\2\2\u00e4\u00e5\7v\2\2\u00e5\u00e6\7k\2\2\u00e6\u00e7\7q\2\2"+
		"\u00e7\u00e8\7p\2\2\u00e8F\3\2\2\2\u00e9\u00ea\7t\2\2\u00ea\u00eb\7g\2"+
		"\2\u00eb\u00ec\7v\2\2\u00ec\u00ed\7w\2\2\u00ed\u00ee\7t\2\2\u00ee\u00ef"+
		"\7p\2\2\u00efH\3\2\2\2\u00f0\u00f1\7v\2\2\u00f1\u00f2\7t\2\2\u00f2\u00f3"+
		"\7w\2\2\u00f3\u00f4\7g\2\2\u00f4J\3\2\2\2\u00f5\u00f6\7h\2\2\u00f6\u00f7"+
		"\7c\2\2\u00f7\u00f8\7n\2\2\u00f8\u00f9\7u\2\2\u00f9\u00fa\7g\2\2\u00fa"+
		"L\3\2\2\2\u00fb\u00fc\7k\2\2\u00fc\u00fd\7h\2\2\u00fdN\3\2\2\2\u00fe\u00ff"+
		"\7g\2\2\u00ff\u0100\7n\2\2\u0100\u0101\7u\2\2\u0101\u0102\7g\2\2\u0102"+
		"P\3\2\2\2\u0103\u0104\7v\2\2\u0104\u0105\7j\2\2\u0105\u0106\7k\2\2\u0106"+
		"\u0107\7u\2\2\u0107R\3\2\2\2\u0108\u0109\7y\2\2\u0109\u010a\7j\2\2\u010a"+
		"\u010b\7k\2\2\u010b\u010c\7n\2\2\u010c\u010d\7g\2\2\u010dT\3\2\2\2\u010e"+
		"\u010f\7h\2\2\u010f\u0110\7q\2\2\u0110\u0111\7t\2\2\u0111V\3\2\2\2\u0112"+
		"\u0113\7k\2\2\u0113\u0114\7p\2\2\u0114X\3\2\2\2\u0115\u0116\4\62;\2\u0116"+
		"Z\3\2\2\2\u0117\u0119\t\13\2\2\u0118\u0117\3\2\2\2\u0119\\\3\2\2\2\u011a"+
		"\u0120\5[.\2\u011b\u011f\5[.\2\u011c\u011f\5Y-\2\u011d\u011f\7a\2\2\u011e"+
		"\u011b\3\2\2\2\u011e\u011c\3\2\2\2\u011e\u011d\3\2\2\2\u011f\u0122\3\2"+
		"\2\2\u0120\u011e\3\2\2\2\u0120\u0121\3\2\2\2\u0121^\3\2\2\2\u0122\u0120"+
		"\3\2\2\2\u0123\u0125\t\f\2\2\u0124\u0123\3\2\2\2\u0125\u0126\3\2\2\2\u0126"+
		"\u0124\3\2\2\2\u0126\u0127\3\2\2\2\u0127\u0128\3\2\2\2\u0128\u0129\b\60"+
		"\3\2\u0129`\3\2\2\2\u012a\u012b\7\61\2\2\u012b\u012c\7\61\2\2\u012c\u0130"+
		"\3\2\2\2\u012d\u012f\n\r\2\2\u012e\u012d\3\2\2\2\u012f\u0132\3\2\2\2\u0130"+
		"\u012e\3\2\2\2\u0130\u0131\3\2\2\2\u0131\u0133\3\2\2\2\u0132\u0130\3\2"+
		"\2\2\u0133\u0134\b\61\4\2\u0134b\3\2\2\2\u0135\u0136\7\61\2\2\u0136\u0137"+
		"\7,\2\2\u0137\u013b\3\2\2\2\u0138\u013a\13\2\2\2\u0139\u0138\3\2\2\2\u013a"+
		"\u013d\3\2\2\2\u013b\u013c\3\2\2\2\u013b\u0139\3\2\2\2\u013c\u013e\3\2"+
		"\2\2\u013d\u013b\3\2\2\2\u013e\u013f\7,\2\2\u013f\u0140\7\61\2\2\u0140"+
		"\u0141\3\2\2\2\u0141\u0142\b\62\5\2\u0142d\3\2\2\2\23\2iqu{\u0081\u0087"+
		"\u008b\u009e\u00a6\u00ce\u0118\u011e\u0120\u0126\u0130\u013b";
	public static final ATN _ATN =
		ATNSimulator.deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}