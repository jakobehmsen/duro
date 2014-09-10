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
		CLOSE_PAR=13, ASSIGN=14, EQUALS=15, NOT_EQUALS=16, LESS_THAN=17, LESS_THAN_OR_EQUALS=18, 
		GREATER_THAN=19, GREATER_THAN_OR_EQUALS=20, INT=21, SEMICOLON=22, COMMA=23, 
		COLON=24, DOT=25, KW_VAR=26, KW_PAUSE=27, KW_FUNCTION=28, KW_RETURN=29, 
		KW_TRUE=30, KW_FALSE=31, KW_IF=32, KW_ELSE=33, KW_THIS=34, KW_WHILE=35, 
		KW_FOR=36, KW_IN=37, ID=38, WS=39, SINGLELINE_COMMENT=40, MULTI_LINE_COMMENT=41;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] tokenNames = {
		"<INVALID>",
		"STRING_LITERAL", "LINE_TERMINATOR", "'&&'", "'||'", "BIN_OP1", "BIN_OP2", 
		"'#'", "'['", "']'", "'{'", "'}'", "'('", "')'", "'='", "'=='", "'!='", 
		"'<'", "'<='", "'>'", "'>='", "INT", "';'", "','", "':'", "'.'", "'var'", 
		"'pause'", "'function'", "'return'", "'true'", "'false'", "'if'", "'else'", 
		"'this'", "'while'", "'for'", "'in'", "ID", "WS", "SINGLELINE_COMMENT", 
		"MULTI_LINE_COMMENT"
	};
	public static final String[] ruleNames = {
		"STRING_LITERAL", "DOUBLE_STRING_CHARACTER", "SINGLE_STRING_CHARACTER", 
		"ESCAPE_SEQUENCE", "CHARACTER_ESCAPE_SEQUENCE", "HEX_ESCAPE_SEQUENCE", 
		"UNICODE_ESCAPE_SEQUENCE", "SINGLE_ESCAPE_CHARACTER", "NON_ESCAPE_CHARACTER", 
		"ESCAPE_CHARACTER", "LINE_CONTINUATION", "LINE_TERMINATOR_SEQUENCE", "HEX_DIGIT", 
		"LINE_TERMINATOR", "DOUBLE_AMP", "DOUBLE_PIPE", "BIN_OP1", "BIN_OP2", 
		"HASH", "OPEN_SQ", "CLOSE_SQ", "OPEN_BRA", "CLOSE_BRA", "OPEN_PAR", "CLOSE_PAR", 
		"ASSIGN", "EQUALS", "NOT_EQUALS", "LESS_THAN", "LESS_THAN_OR_EQUALS", 
		"GREATER_THAN", "GREATER_THAN_OR_EQUALS", "INT", "SEMICOLON", "COMMA", 
		"COLON", "DOT", "KW_VAR", "KW_PAUSE", "KW_FUNCTION", "KW_RETURN", "KW_TRUE", 
		"KW_FALSE", "KW_IF", "KW_ELSE", "KW_THIS", "KW_WHILE", "KW_FOR", "KW_IN", 
		"DIGIT", "LETTER", "ID", "WS", "SINGLELINE_COMMENT", "MULTI_LINE_COMMENT"
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

		case 52: WS_action((RuleContext)_localctx, actionIndex); break;

		case 53: SINGLELINE_COMMENT_action((RuleContext)_localctx, actionIndex); break;

		case 54: MULTI_LINE_COMMENT_action((RuleContext)_localctx, actionIndex); break;
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
		"\3\uacf5\uee8c\u4f5d\u8b0d\u4a45\u78bd\u1b2f\u3378\2+\u015e\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\3\2\3\2\7\2t\n\2\f\2\16\2w\13"+
		"\2\3\2\3\2\3\2\7\2|\n\2\f\2\16\2\177\13\2\3\2\5\2\u0082\n\2\3\3\3\3\3"+
		"\3\3\3\5\3\u0088\n\3\3\4\3\4\3\4\3\4\5\4\u008e\n\4\3\5\3\5\3\5\3\5\5\5"+
		"\u0094\n\5\3\6\3\6\5\6\u0098\n\6\3\7\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3"+
		"\b\3\t\3\t\3\n\3\n\3\13\3\13\3\13\5\13\u00ab\n\13\3\f\3\f\3\f\3\r\3\r"+
		"\3\r\5\r\u00b3\n\r\3\16\3\16\3\17\3\17\3\17\3\17\3\20\3\20\3\20\3\21\3"+
		"\21\3\21\3\22\3\22\3\23\3\23\3\24\3\24\3\25\3\25\3\26\3\26\3\27\3\27\3"+
		"\30\3\30\3\31\3\31\3\32\3\32\3\33\3\33\3\34\3\34\3\34\3\35\3\35\3\35\3"+
		"\36\3\36\3\37\3\37\3\37\3 \3 \3!\3!\3!\3\"\6\"\u00e6\n\"\r\"\16\"\u00e7"+
		"\3#\3#\3$\3$\3%\3%\3&\3&\3\'\3\'\3\'\3\'\3(\3(\3(\3(\3(\3(\3)\3)\3)\3"+
		")\3)\3)\3)\3)\3)\3*\3*\3*\3*\3*\3*\3*\3+\3+\3+\3+\3+\3,\3,\3,\3,\3,\3"+
		",\3-\3-\3-\3.\3.\3.\3.\3.\3/\3/\3/\3/\3/\3\60\3\60\3\60\3\60\3\60\3\60"+
		"\3\61\3\61\3\61\3\61\3\62\3\62\3\62\3\63\3\63\3\64\5\64\u0134\n\64\3\65"+
		"\3\65\3\65\3\65\7\65\u013a\n\65\f\65\16\65\u013d\13\65\3\66\6\66\u0140"+
		"\n\66\r\66\16\66\u0141\3\66\3\66\3\67\3\67\3\67\3\67\7\67\u014a\n\67\f"+
		"\67\16\67\u014d\13\67\3\67\3\67\38\38\38\38\78\u0155\n8\f8\168\u0158\13"+
		"8\38\38\38\38\38\3\u01569\3\3\1\5\2\1\7\2\1\t\2\1\13\2\1\r\2\1\17\2\1"+
		"\21\2\1\23\2\1\25\2\1\27\2\1\31\2\1\33\2\1\35\4\2\37\5\1!\6\1#\7\1%\b"+
		"\1\'\t\1)\n\1+\13\1-\f\1/\r\1\61\16\1\63\17\1\65\20\1\67\21\19\22\1;\23"+
		"\1=\24\1?\25\1A\26\1C\27\1E\30\1G\31\1I\32\1K\33\1M\34\1O\35\1Q\36\1S"+
		"\37\1U \1W!\1Y\"\1[#\1]$\1_%\1a&\1c\'\1e\2\1g\2\1i(\1k)\3m*\4o+\5\3\2"+
		"\16\6\2\f\f\17\17$$^^\6\2\f\f\17\17))^^\13\2$$))^^ddhhppttvvxx\16\2\f"+
		"\f\17\17$$))\62;^^ddhhppttvxzz\4\2wwzz\5\2\62;CHch\5\2\f\f\17\17\u202a"+
		"\u202b\4\2--//\4\2,,\61\61\4\2C\\c|\5\2\13\f\16\17\"\"\4\2\f\f\17\17\u0164"+
		"\2\3\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2"+
		"\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2"+
		"\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3\2"+
		"\2\2\2?\3\2\2\2\2A\3\2\2\2\2C\3\2\2\2\2E\3\2\2\2\2G\3\2\2\2\2I\3\2\2\2"+
		"\2K\3\2\2\2\2M\3\2\2\2\2O\3\2\2\2\2Q\3\2\2\2\2S\3\2\2\2\2U\3\2\2\2\2W"+
		"\3\2\2\2\2Y\3\2\2\2\2[\3\2\2\2\2]\3\2\2\2\2_\3\2\2\2\2a\3\2\2\2\2c\3\2"+
		"\2\2\2i\3\2\2\2\2k\3\2\2\2\2m\3\2\2\2\2o\3\2\2\2\3\u0081\3\2\2\2\5\u0087"+
		"\3\2\2\2\7\u008d\3\2\2\2\t\u0093\3\2\2\2\13\u0097\3\2\2\2\r\u0099\3\2"+
		"\2\2\17\u009d\3\2\2\2\21\u00a3\3\2\2\2\23\u00a5\3\2\2\2\25\u00aa\3\2\2"+
		"\2\27\u00ac\3\2\2\2\31\u00b2\3\2\2\2\33\u00b4\3\2\2\2\35\u00b6\3\2\2\2"+
		"\37\u00ba\3\2\2\2!\u00bd\3\2\2\2#\u00c0\3\2\2\2%\u00c2\3\2\2\2\'\u00c4"+
		"\3\2\2\2)\u00c6\3\2\2\2+\u00c8\3\2\2\2-\u00ca\3\2\2\2/\u00cc\3\2\2\2\61"+
		"\u00ce\3\2\2\2\63\u00d0\3\2\2\2\65\u00d2\3\2\2\2\67\u00d4\3\2\2\29\u00d7"+
		"\3\2\2\2;\u00da\3\2\2\2=\u00dc\3\2\2\2?\u00df\3\2\2\2A\u00e1\3\2\2\2C"+
		"\u00e5\3\2\2\2E\u00e9\3\2\2\2G\u00eb\3\2\2\2I\u00ed\3\2\2\2K\u00ef\3\2"+
		"\2\2M\u00f1\3\2\2\2O\u00f5\3\2\2\2Q\u00fb\3\2\2\2S\u0104\3\2\2\2U\u010b"+
		"\3\2\2\2W\u0110\3\2\2\2Y\u0116\3\2\2\2[\u0119\3\2\2\2]\u011e\3\2\2\2_"+
		"\u0123\3\2\2\2a\u0129\3\2\2\2c\u012d\3\2\2\2e\u0130\3\2\2\2g\u0133\3\2"+
		"\2\2i\u0135\3\2\2\2k\u013f\3\2\2\2m\u0145\3\2\2\2o\u0150\3\2\2\2qu\7$"+
		"\2\2rt\5\5\3\2sr\3\2\2\2tw\3\2\2\2us\3\2\2\2uv\3\2\2\2vx\3\2\2\2wu\3\2"+
		"\2\2x\u0082\7$\2\2y}\7)\2\2z|\5\7\4\2{z\3\2\2\2|\177\3\2\2\2}{\3\2\2\2"+
		"}~\3\2\2\2~\u0080\3\2\2\2\177}\3\2\2\2\u0080\u0082\7)\2\2\u0081q\3\2\2"+
		"\2\u0081y\3\2\2\2\u0082\4\3\2\2\2\u0083\u0088\n\2\2\2\u0084\u0085\7^\2"+
		"\2\u0085\u0088\5\t\5\2\u0086\u0088\5\27\f\2\u0087\u0083\3\2\2\2\u0087"+
		"\u0084\3\2\2\2\u0087\u0086\3\2\2\2\u0088\6\3\2\2\2\u0089\u008e\n\3\2\2"+
		"\u008a\u008b\7^\2\2\u008b\u008e\5\t\5\2\u008c\u008e\5\27\f\2\u008d\u0089"+
		"\3\2\2\2\u008d\u008a\3\2\2\2\u008d\u008c\3\2\2\2\u008e\b\3\2\2\2\u008f"+
		"\u0094\5\13\6\2\u0090\u0094\7\62\2\2\u0091\u0094\5\r\7\2\u0092\u0094\5"+
		"\17\b\2\u0093\u008f\3\2\2\2\u0093\u0090\3\2\2\2\u0093\u0091\3\2\2\2\u0093"+
		"\u0092\3\2\2\2\u0094\n\3\2\2\2\u0095\u0098\5\21\t\2\u0096\u0098\5\23\n"+
		"\2\u0097\u0095\3\2\2\2\u0097\u0096\3\2\2\2\u0098\f\3\2\2\2\u0099\u009a"+
		"\7z\2\2\u009a\u009b\5\33\16\2\u009b\u009c\5\33\16\2\u009c\16\3\2\2\2\u009d"+
		"\u009e\7w\2\2\u009e\u009f\5\33\16\2\u009f\u00a0\5\33\16\2\u00a0\u00a1"+
		"\5\33\16\2\u00a1\u00a2\5\33\16\2\u00a2\20\3\2\2\2\u00a3\u00a4\t\4\2\2"+
		"\u00a4\22\3\2\2\2\u00a5\u00a6\n\5\2\2\u00a6\24\3\2\2\2\u00a7\u00ab\5\21"+
		"\t\2\u00a8\u00ab\5e\63\2\u00a9\u00ab\t\6\2\2\u00aa\u00a7\3\2\2\2\u00aa"+
		"\u00a8\3\2\2\2\u00aa\u00a9\3\2\2\2\u00ab\26\3\2\2\2\u00ac\u00ad\7^\2\2"+
		"\u00ad\u00ae\5\31\r\2\u00ae\30\3\2\2\2\u00af\u00b0\7\17\2\2\u00b0\u00b3"+
		"\7\f\2\2\u00b1\u00b3\5\35\17\2\u00b2\u00af\3\2\2\2\u00b2\u00b1\3\2\2\2"+
		"\u00b3\32\3\2\2\2\u00b4\u00b5\t\7\2\2\u00b5\34\3\2\2\2\u00b6\u00b7\t\b"+
		"\2\2\u00b7\u00b8\3\2\2\2\u00b8\u00b9\b\17\2\2\u00b9\36\3\2\2\2\u00ba\u00bb"+
		"\7(\2\2\u00bb\u00bc\7(\2\2\u00bc \3\2\2\2\u00bd\u00be\7~\2\2\u00be\u00bf"+
		"\7~\2\2\u00bf\"\3\2\2\2\u00c0\u00c1\t\t\2\2\u00c1$\3\2\2\2\u00c2\u00c3"+
		"\t\n\2\2\u00c3&\3\2\2\2\u00c4\u00c5\7%\2\2\u00c5(\3\2\2\2\u00c6\u00c7"+
		"\7]\2\2\u00c7*\3\2\2\2\u00c8\u00c9\7_\2\2\u00c9,\3\2\2\2\u00ca\u00cb\7"+
		"}\2\2\u00cb.\3\2\2\2\u00cc\u00cd\7\177\2\2\u00cd\60\3\2\2\2\u00ce\u00cf"+
		"\7*\2\2\u00cf\62\3\2\2\2\u00d0\u00d1\7+\2\2\u00d1\64\3\2\2\2\u00d2\u00d3"+
		"\7?\2\2\u00d3\66\3\2\2\2\u00d4\u00d5\7?\2\2\u00d5\u00d6\7?\2\2\u00d68"+
		"\3\2\2\2\u00d7\u00d8\7#\2\2\u00d8\u00d9\7?\2\2\u00d9:\3\2\2\2\u00da\u00db"+
		"\7>\2\2\u00db<\3\2\2\2\u00dc\u00dd\7>\2\2\u00dd\u00de\7?\2\2\u00de>\3"+
		"\2\2\2\u00df\u00e0\7@\2\2\u00e0@\3\2\2\2\u00e1\u00e2\7@\2\2\u00e2\u00e3"+
		"\7?\2\2\u00e3B\3\2\2\2\u00e4\u00e6\5e\63\2\u00e5\u00e4\3\2\2\2\u00e6\u00e7"+
		"\3\2\2\2\u00e7\u00e5\3\2\2\2\u00e7\u00e8\3\2\2\2\u00e8D\3\2\2\2\u00e9"+
		"\u00ea\7=\2\2\u00eaF\3\2\2\2\u00eb\u00ec\7.\2\2\u00ecH\3\2\2\2\u00ed\u00ee"+
		"\7<\2\2\u00eeJ\3\2\2\2\u00ef\u00f0\7\60\2\2\u00f0L\3\2\2\2\u00f1\u00f2"+
		"\7x\2\2\u00f2\u00f3\7c\2\2\u00f3\u00f4\7t\2\2\u00f4N\3\2\2\2\u00f5\u00f6"+
		"\7r\2\2\u00f6\u00f7\7c\2\2\u00f7\u00f8\7w\2\2\u00f8\u00f9\7u\2\2\u00f9"+
		"\u00fa\7g\2\2\u00faP\3\2\2\2\u00fb\u00fc\7h\2\2\u00fc\u00fd\7w\2\2\u00fd"+
		"\u00fe\7p\2\2\u00fe\u00ff\7e\2\2\u00ff\u0100\7v\2\2\u0100\u0101\7k\2\2"+
		"\u0101\u0102\7q\2\2\u0102\u0103\7p\2\2\u0103R\3\2\2\2\u0104\u0105\7t\2"+
		"\2\u0105\u0106\7g\2\2\u0106\u0107\7v\2\2\u0107\u0108\7w\2\2\u0108\u0109"+
		"\7t\2\2\u0109\u010a\7p\2\2\u010aT\3\2\2\2\u010b\u010c\7v\2\2\u010c\u010d"+
		"\7t\2\2\u010d\u010e\7w\2\2\u010e\u010f\7g\2\2\u010fV\3\2\2\2\u0110\u0111"+
		"\7h\2\2\u0111\u0112\7c\2\2\u0112\u0113\7n\2\2\u0113\u0114\7u\2\2\u0114"+
		"\u0115\7g\2\2\u0115X\3\2\2\2\u0116\u0117\7k\2\2\u0117\u0118\7h\2\2\u0118"+
		"Z\3\2\2\2\u0119\u011a\7g\2\2\u011a\u011b\7n\2\2\u011b\u011c\7u\2\2\u011c"+
		"\u011d\7g\2\2\u011d\\\3\2\2\2\u011e\u011f\7v\2\2\u011f\u0120\7j\2\2\u0120"+
		"\u0121\7k\2\2\u0121\u0122\7u\2\2\u0122^\3\2\2\2\u0123\u0124\7y\2\2\u0124"+
		"\u0125\7j\2\2\u0125\u0126\7k\2\2\u0126\u0127\7n\2\2\u0127\u0128\7g\2\2"+
		"\u0128`\3\2\2\2\u0129\u012a\7h\2\2\u012a\u012b\7q\2\2\u012b\u012c\7t\2"+
		"\2\u012cb\3\2\2\2\u012d\u012e\7k\2\2\u012e\u012f\7p\2\2\u012fd\3\2\2\2"+
		"\u0130\u0131\4\62;\2\u0131f\3\2\2\2\u0132\u0134\t\13\2\2\u0133\u0132\3"+
		"\2\2\2\u0134h\3\2\2\2\u0135\u013b\5g\64\2\u0136\u013a\5g\64\2\u0137\u013a"+
		"\5e\63\2\u0138\u013a\7a\2\2\u0139\u0136\3\2\2\2\u0139\u0137\3\2\2\2\u0139"+
		"\u0138\3\2\2\2\u013a\u013d\3\2\2\2\u013b\u0139\3\2\2\2\u013b\u013c\3\2"+
		"\2\2\u013cj\3\2\2\2\u013d\u013b\3\2\2\2\u013e\u0140\t\f\2\2\u013f\u013e"+
		"\3\2\2\2\u0140\u0141\3\2\2\2\u0141\u013f\3\2\2\2\u0141\u0142\3\2\2\2\u0142"+
		"\u0143\3\2\2\2\u0143\u0144\b\66\3\2\u0144l\3\2\2\2\u0145\u0146\7\61\2"+
		"\2\u0146\u0147\7\61\2\2\u0147\u014b\3\2\2\2\u0148\u014a\n\r\2\2\u0149"+
		"\u0148\3\2\2\2\u014a\u014d\3\2\2\2\u014b\u0149\3\2\2\2\u014b\u014c\3\2"+
		"\2\2\u014c\u014e\3\2\2\2\u014d\u014b\3\2\2\2\u014e\u014f\b\67\4\2\u014f"+
		"n\3\2\2\2\u0150\u0151\7\61\2\2\u0151\u0152\7,\2\2\u0152\u0156\3\2\2\2"+
		"\u0153\u0155\13\2\2\2\u0154\u0153\3\2\2\2\u0155\u0158\3\2\2\2\u0156\u0157"+
		"\3\2\2\2\u0156\u0154\3\2\2\2\u0157\u0159\3\2\2\2\u0158\u0156\3\2\2\2\u0159"+
		"\u015a\7,\2\2\u015a\u015b\7\61\2\2\u015b\u015c\3\2\2\2\u015c\u015d\b8"+
		"\5\2\u015dp\3\2\2\2\23\2u}\u0081\u0087\u008d\u0093\u0097\u00aa\u00b2\u00e7"+
		"\u0133\u0139\u013b\u0141\u014b\u0156";
	public static final ATN _ATN =
		ATNSimulator.deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}