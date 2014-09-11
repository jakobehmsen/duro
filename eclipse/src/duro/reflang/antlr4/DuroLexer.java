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
		STRING_LITERAL=1, LINE_TERMINATOR=2, DOUBLE_AMP=3, DOUBLE_PIPE=4, DOUBLE_PLUS=5, 
		DOUBLE_MINUS=6, BIN_OP1=7, BIN_OP2=8, HASH=9, OPEN_SQ=10, CLOSE_SQ=11, 
		OPEN_BRA=12, CLOSE_BRA=13, OPEN_PAR=14, CLOSE_PAR=15, ASSIGN=16, EQUALS=17, 
		NOT_EQUALS=18, NOT=19, LESS_THAN=20, LESS_THAN_OR_EQUALS=21, GREATER_THAN=22, 
		GREATER_THAN_OR_EQUALS=23, INT=24, SEMICOLON=25, COMMA=26, COLON=27, DOT=28, 
		KW_VAR=29, KW_PAUSE=30, KW_FUNCTION=31, KW_RETURN=32, KW_TRUE=33, KW_FALSE=34, 
		KW_IF=35, KW_ELSE=36, KW_THIS=37, KW_NULL=38, KW_WHILE=39, KW_FOR=40, 
		KW_IN=41, ID=42, WS=43, SINGLELINE_COMMENT=44, MULTI_LINE_COMMENT=45;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] tokenNames = {
		"<INVALID>",
		"STRING_LITERAL", "LINE_TERMINATOR", "'&&'", "'||'", "'++'", "'--'", "BIN_OP1", 
		"BIN_OP2", "'#'", "'['", "']'", "'{'", "'}'", "'('", "')'", "'='", "'=='", 
		"'!='", "'!'", "'<'", "'<='", "'>'", "'>='", "INT", "';'", "','", "':'", 
		"'.'", "'var'", "'pause'", "'function'", "'return'", "'true'", "'false'", 
		"'if'", "'else'", "'this'", "'null'", "'while'", "'for'", "'in'", "ID", 
		"WS", "SINGLELINE_COMMENT", "MULTI_LINE_COMMENT"
	};
	public static final String[] ruleNames = {
		"STRING_LITERAL", "DOUBLE_STRING_CHARACTER", "SINGLE_STRING_CHARACTER", 
		"ESCAPE_SEQUENCE", "CHARACTER_ESCAPE_SEQUENCE", "HEX_ESCAPE_SEQUENCE", 
		"UNICODE_ESCAPE_SEQUENCE", "SINGLE_ESCAPE_CHARACTER", "NON_ESCAPE_CHARACTER", 
		"ESCAPE_CHARACTER", "LINE_CONTINUATION", "LINE_TERMINATOR_SEQUENCE", "HEX_DIGIT", 
		"LINE_TERMINATOR", "DOUBLE_AMP", "DOUBLE_PIPE", "DOUBLE_PLUS", "DOUBLE_MINUS", 
		"BIN_OP1", "BIN_OP2", "HASH", "OPEN_SQ", "CLOSE_SQ", "OPEN_BRA", "CLOSE_BRA", 
		"OPEN_PAR", "CLOSE_PAR", "ASSIGN", "EQUALS", "NOT_EQUALS", "NOT", "LESS_THAN", 
		"LESS_THAN_OR_EQUALS", "GREATER_THAN", "GREATER_THAN_OR_EQUALS", "INT", 
		"SEMICOLON", "COMMA", "COLON", "DOT", "KW_VAR", "KW_PAUSE", "KW_FUNCTION", 
		"KW_RETURN", "KW_TRUE", "KW_FALSE", "KW_IF", "KW_ELSE", "KW_THIS", "KW_NULL", 
		"KW_WHILE", "KW_FOR", "KW_IN", "DIGIT", "LETTER", "ID", "WS", "SINGLELINE_COMMENT", 
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

		case 56: WS_action((RuleContext)_localctx, actionIndex); break;

		case 57: SINGLELINE_COMMENT_action((RuleContext)_localctx, actionIndex); break;

		case 58: MULTI_LINE_COMMENT_action((RuleContext)_localctx, actionIndex); break;
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
		"\3\uacf5\uee8c\u4f5d\u8b0d\u4a45\u78bd\u1b2f\u3378\2/\u0173\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\4<\t<\3\2\3"+
		"\2\7\2|\n\2\f\2\16\2\177\13\2\3\2\3\2\3\2\7\2\u0084\n\2\f\2\16\2\u0087"+
		"\13\2\3\2\5\2\u008a\n\2\3\3\3\3\3\3\3\3\5\3\u0090\n\3\3\4\3\4\3\4\3\4"+
		"\5\4\u0096\n\4\3\5\3\5\3\5\3\5\5\5\u009c\n\5\3\6\3\6\5\6\u00a0\n\6\3\7"+
		"\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3\b\3\t\3\t\3\n\3\n\3\13\3\13\3\13\5"+
		"\13\u00b3\n\13\3\f\3\f\3\f\3\r\3\r\3\r\5\r\u00bb\n\r\3\16\3\16\3\17\3"+
		"\17\3\17\3\17\3\20\3\20\3\20\3\21\3\21\3\21\3\22\3\22\3\22\3\23\3\23\3"+
		"\23\3\24\3\24\3\25\3\25\3\26\3\26\3\27\3\27\3\30\3\30\3\31\3\31\3\32\3"+
		"\32\3\33\3\33\3\34\3\34\3\35\3\35\3\36\3\36\3\36\3\37\3\37\3\37\3 \3 "+
		"\3!\3!\3\"\3\"\3\"\3#\3#\3$\3$\3$\3%\6%\u00f6\n%\r%\16%\u00f7\3&\3&\3"+
		"\'\3\'\3(\3(\3)\3)\3*\3*\3*\3*\3+\3+\3+\3+\3+\3+\3,\3,\3,\3,\3,\3,\3,"+
		"\3,\3,\3-\3-\3-\3-\3-\3-\3-\3.\3.\3.\3.\3.\3/\3/\3/\3/\3/\3/\3\60\3\60"+
		"\3\60\3\61\3\61\3\61\3\61\3\61\3\62\3\62\3\62\3\62\3\62\3\63\3\63\3\63"+
		"\3\63\3\63\3\64\3\64\3\64\3\64\3\64\3\64\3\65\3\65\3\65\3\65\3\66\3\66"+
		"\3\66\3\67\3\67\38\58\u0149\n8\39\39\39\39\79\u014f\n9\f9\169\u0152\13"+
		"9\3:\6:\u0155\n:\r:\16:\u0156\3:\3:\3;\3;\3;\3;\7;\u015f\n;\f;\16;\u0162"+
		"\13;\3;\3;\3<\3<\3<\3<\7<\u016a\n<\f<\16<\u016d\13<\3<\3<\3<\3<\3<\3\u016b"+
		"=\3\3\1\5\2\1\7\2\1\t\2\1\13\2\1\r\2\1\17\2\1\21\2\1\23\2\1\25\2\1\27"+
		"\2\1\31\2\1\33\2\1\35\4\2\37\5\1!\6\1#\7\1%\b\1\'\t\1)\n\1+\13\1-\f\1"+
		"/\r\1\61\16\1\63\17\1\65\20\1\67\21\19\22\1;\23\1=\24\1?\25\1A\26\1C\27"+
		"\1E\30\1G\31\1I\32\1K\33\1M\34\1O\35\1Q\36\1S\37\1U \1W!\1Y\"\1[#\1]$"+
		"\1_%\1a&\1c\'\1e(\1g)\1i*\1k+\1m\2\1o\2\1q,\1s-\3u.\4w/\5\3\2\16\6\2\f"+
		"\f\17\17$$^^\6\2\f\f\17\17))^^\13\2$$))^^ddhhppttvvxx\16\2\f\f\17\17$"+
		"$))\62;^^ddhhppttvxzz\4\2wwzz\5\2\62;CHch\5\2\f\f\17\17\u202a\u202b\4"+
		"\2--//\4\2,,\61\61\4\2C\\c|\5\2\13\f\16\17\"\"\4\2\f\f\17\17\u0179\2\3"+
		"\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2"+
		"\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2"+
		"\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2"+
		"\2?\3\2\2\2\2A\3\2\2\2\2C\3\2\2\2\2E\3\2\2\2\2G\3\2\2\2\2I\3\2\2\2\2K"+
		"\3\2\2\2\2M\3\2\2\2\2O\3\2\2\2\2Q\3\2\2\2\2S\3\2\2\2\2U\3\2\2\2\2W\3\2"+
		"\2\2\2Y\3\2\2\2\2[\3\2\2\2\2]\3\2\2\2\2_\3\2\2\2\2a\3\2\2\2\2c\3\2\2\2"+
		"\2e\3\2\2\2\2g\3\2\2\2\2i\3\2\2\2\2k\3\2\2\2\2q\3\2\2\2\2s\3\2\2\2\2u"+
		"\3\2\2\2\2w\3\2\2\2\3\u0089\3\2\2\2\5\u008f\3\2\2\2\7\u0095\3\2\2\2\t"+
		"\u009b\3\2\2\2\13\u009f\3\2\2\2\r\u00a1\3\2\2\2\17\u00a5\3\2\2\2\21\u00ab"+
		"\3\2\2\2\23\u00ad\3\2\2\2\25\u00b2\3\2\2\2\27\u00b4\3\2\2\2\31\u00ba\3"+
		"\2\2\2\33\u00bc\3\2\2\2\35\u00be\3\2\2\2\37\u00c2\3\2\2\2!\u00c5\3\2\2"+
		"\2#\u00c8\3\2\2\2%\u00cb\3\2\2\2\'\u00ce\3\2\2\2)\u00d0\3\2\2\2+\u00d2"+
		"\3\2\2\2-\u00d4\3\2\2\2/\u00d6\3\2\2\2\61\u00d8\3\2\2\2\63\u00da\3\2\2"+
		"\2\65\u00dc\3\2\2\2\67\u00de\3\2\2\29\u00e0\3\2\2\2;\u00e2\3\2\2\2=\u00e5"+
		"\3\2\2\2?\u00e8\3\2\2\2A\u00ea\3\2\2\2C\u00ec\3\2\2\2E\u00ef\3\2\2\2G"+
		"\u00f1\3\2\2\2I\u00f5\3\2\2\2K\u00f9\3\2\2\2M\u00fb\3\2\2\2O\u00fd\3\2"+
		"\2\2Q\u00ff\3\2\2\2S\u0101\3\2\2\2U\u0105\3\2\2\2W\u010b\3\2\2\2Y\u0114"+
		"\3\2\2\2[\u011b\3\2\2\2]\u0120\3\2\2\2_\u0126\3\2\2\2a\u0129\3\2\2\2c"+
		"\u012e\3\2\2\2e\u0133\3\2\2\2g\u0138\3\2\2\2i\u013e\3\2\2\2k\u0142\3\2"+
		"\2\2m\u0145\3\2\2\2o\u0148\3\2\2\2q\u014a\3\2\2\2s\u0154\3\2\2\2u\u015a"+
		"\3\2\2\2w\u0165\3\2\2\2y}\7$\2\2z|\5\5\3\2{z\3\2\2\2|\177\3\2\2\2}{\3"+
		"\2\2\2}~\3\2\2\2~\u0080\3\2\2\2\177}\3\2\2\2\u0080\u008a\7$\2\2\u0081"+
		"\u0085\7)\2\2\u0082\u0084\5\7\4\2\u0083\u0082\3\2\2\2\u0084\u0087\3\2"+
		"\2\2\u0085\u0083\3\2\2\2\u0085\u0086\3\2\2\2\u0086\u0088\3\2\2\2\u0087"+
		"\u0085\3\2\2\2\u0088\u008a\7)\2\2\u0089y\3\2\2\2\u0089\u0081\3\2\2\2\u008a"+
		"\4\3\2\2\2\u008b\u0090\n\2\2\2\u008c\u008d\7^\2\2\u008d\u0090\5\t\5\2"+
		"\u008e\u0090\5\27\f\2\u008f\u008b\3\2\2\2\u008f\u008c\3\2\2\2\u008f\u008e"+
		"\3\2\2\2\u0090\6\3\2\2\2\u0091\u0096\n\3\2\2\u0092\u0093\7^\2\2\u0093"+
		"\u0096\5\t\5\2\u0094\u0096\5\27\f\2\u0095\u0091\3\2\2\2\u0095\u0092\3"+
		"\2\2\2\u0095\u0094\3\2\2\2\u0096\b\3\2\2\2\u0097\u009c\5\13\6\2\u0098"+
		"\u009c\7\62\2\2\u0099\u009c\5\r\7\2\u009a\u009c\5\17\b\2\u009b\u0097\3"+
		"\2\2\2\u009b\u0098\3\2\2\2\u009b\u0099\3\2\2\2\u009b\u009a\3\2\2\2\u009c"+
		"\n\3\2\2\2\u009d\u00a0\5\21\t\2\u009e\u00a0\5\23\n\2\u009f\u009d\3\2\2"+
		"\2\u009f\u009e\3\2\2\2\u00a0\f\3\2\2\2\u00a1\u00a2\7z\2\2\u00a2\u00a3"+
		"\5\33\16\2\u00a3\u00a4\5\33\16\2\u00a4\16\3\2\2\2\u00a5\u00a6\7w\2\2\u00a6"+
		"\u00a7\5\33\16\2\u00a7\u00a8\5\33\16\2\u00a8\u00a9\5\33\16\2\u00a9\u00aa"+
		"\5\33\16\2\u00aa\20\3\2\2\2\u00ab\u00ac\t\4\2\2\u00ac\22\3\2\2\2\u00ad"+
		"\u00ae\n\5\2\2\u00ae\24\3\2\2\2\u00af\u00b3\5\21\t\2\u00b0\u00b3\5m\67"+
		"\2\u00b1\u00b3\t\6\2\2\u00b2\u00af\3\2\2\2\u00b2\u00b0\3\2\2\2\u00b2\u00b1"+
		"\3\2\2\2\u00b3\26\3\2\2\2\u00b4\u00b5\7^\2\2\u00b5\u00b6\5\31\r\2\u00b6"+
		"\30\3\2\2\2\u00b7\u00b8\7\17\2\2\u00b8\u00bb\7\f\2\2\u00b9\u00bb\5\35"+
		"\17\2\u00ba\u00b7\3\2\2\2\u00ba\u00b9\3\2\2\2\u00bb\32\3\2\2\2\u00bc\u00bd"+
		"\t\7\2\2\u00bd\34\3\2\2\2\u00be\u00bf\t\b\2\2\u00bf\u00c0\3\2\2\2\u00c0"+
		"\u00c1\b\17\2\2\u00c1\36\3\2\2\2\u00c2\u00c3\7(\2\2\u00c3\u00c4\7(\2\2"+
		"\u00c4 \3\2\2\2\u00c5\u00c6\7~\2\2\u00c6\u00c7\7~\2\2\u00c7\"\3\2\2\2"+
		"\u00c8\u00c9\7-\2\2\u00c9\u00ca\7-\2\2\u00ca$\3\2\2\2\u00cb\u00cc\7/\2"+
		"\2\u00cc\u00cd\7/\2\2\u00cd&\3\2\2\2\u00ce\u00cf\t\t\2\2\u00cf(\3\2\2"+
		"\2\u00d0\u00d1\t\n\2\2\u00d1*\3\2\2\2\u00d2\u00d3\7%\2\2\u00d3,\3\2\2"+
		"\2\u00d4\u00d5\7]\2\2\u00d5.\3\2\2\2\u00d6\u00d7\7_\2\2\u00d7\60\3\2\2"+
		"\2\u00d8\u00d9\7}\2\2\u00d9\62\3\2\2\2\u00da\u00db\7\177\2\2\u00db\64"+
		"\3\2\2\2\u00dc\u00dd\7*\2\2\u00dd\66\3\2\2\2\u00de\u00df\7+\2\2\u00df"+
		"8\3\2\2\2\u00e0\u00e1\7?\2\2\u00e1:\3\2\2\2\u00e2\u00e3\7?\2\2\u00e3\u00e4"+
		"\7?\2\2\u00e4<\3\2\2\2\u00e5\u00e6\7#\2\2\u00e6\u00e7\7?\2\2\u00e7>\3"+
		"\2\2\2\u00e8\u00e9\7#\2\2\u00e9@\3\2\2\2\u00ea\u00eb\7>\2\2\u00ebB\3\2"+
		"\2\2\u00ec\u00ed\7>\2\2\u00ed\u00ee\7?\2\2\u00eeD\3\2\2\2\u00ef\u00f0"+
		"\7@\2\2\u00f0F\3\2\2\2\u00f1\u00f2\7@\2\2\u00f2\u00f3\7?\2\2\u00f3H\3"+
		"\2\2\2\u00f4\u00f6\5m\67\2\u00f5\u00f4\3\2\2\2\u00f6\u00f7\3\2\2\2\u00f7"+
		"\u00f5\3\2\2\2\u00f7\u00f8\3\2\2\2\u00f8J\3\2\2\2\u00f9\u00fa\7=\2\2\u00fa"+
		"L\3\2\2\2\u00fb\u00fc\7.\2\2\u00fcN\3\2\2\2\u00fd\u00fe\7<\2\2\u00feP"+
		"\3\2\2\2\u00ff\u0100\7\60\2\2\u0100R\3\2\2\2\u0101\u0102\7x\2\2\u0102"+
		"\u0103\7c\2\2\u0103\u0104\7t\2\2\u0104T\3\2\2\2\u0105\u0106\7r\2\2\u0106"+
		"\u0107\7c\2\2\u0107\u0108\7w\2\2\u0108\u0109\7u\2\2\u0109\u010a\7g\2\2"+
		"\u010aV\3\2\2\2\u010b\u010c\7h\2\2\u010c\u010d\7w\2\2\u010d\u010e\7p\2"+
		"\2\u010e\u010f\7e\2\2\u010f\u0110\7v\2\2\u0110\u0111\7k\2\2\u0111\u0112"+
		"\7q\2\2\u0112\u0113\7p\2\2\u0113X\3\2\2\2\u0114\u0115\7t\2\2\u0115\u0116"+
		"\7g\2\2\u0116\u0117\7v\2\2\u0117\u0118\7w\2\2\u0118\u0119\7t\2\2\u0119"+
		"\u011a\7p\2\2\u011aZ\3\2\2\2\u011b\u011c\7v\2\2\u011c\u011d\7t\2\2\u011d"+
		"\u011e\7w\2\2\u011e\u011f\7g\2\2\u011f\\\3\2\2\2\u0120\u0121\7h\2\2\u0121"+
		"\u0122\7c\2\2\u0122\u0123\7n\2\2\u0123\u0124\7u\2\2\u0124\u0125\7g\2\2"+
		"\u0125^\3\2\2\2\u0126\u0127\7k\2\2\u0127\u0128\7h\2\2\u0128`\3\2\2\2\u0129"+
		"\u012a\7g\2\2\u012a\u012b\7n\2\2\u012b\u012c\7u\2\2\u012c\u012d\7g\2\2"+
		"\u012db\3\2\2\2\u012e\u012f\7v\2\2\u012f\u0130\7j\2\2\u0130\u0131\7k\2"+
		"\2\u0131\u0132\7u\2\2\u0132d\3\2\2\2\u0133\u0134\7p\2\2\u0134\u0135\7"+
		"w\2\2\u0135\u0136\7n\2\2\u0136\u0137\7n\2\2\u0137f\3\2\2\2\u0138\u0139"+
		"\7y\2\2\u0139\u013a\7j\2\2\u013a\u013b\7k\2\2\u013b\u013c\7n\2\2\u013c"+
		"\u013d\7g\2\2\u013dh\3\2\2\2\u013e\u013f\7h\2\2\u013f\u0140\7q\2\2\u0140"+
		"\u0141\7t\2\2\u0141j\3\2\2\2\u0142\u0143\7k\2\2\u0143\u0144\7p\2\2\u0144"+
		"l\3\2\2\2\u0145\u0146\4\62;\2\u0146n\3\2\2\2\u0147\u0149\t\13\2\2\u0148"+
		"\u0147\3\2\2\2\u0149p\3\2\2\2\u014a\u0150\5o8\2\u014b\u014f\5o8\2\u014c"+
		"\u014f\5m\67\2\u014d\u014f\7a\2\2\u014e\u014b\3\2\2\2\u014e\u014c\3\2"+
		"\2\2\u014e\u014d\3\2\2\2\u014f\u0152\3\2\2\2\u0150\u014e\3\2\2\2\u0150"+
		"\u0151\3\2\2\2\u0151r\3\2\2\2\u0152\u0150\3\2\2\2\u0153\u0155\t\f\2\2"+
		"\u0154\u0153\3\2\2\2\u0155\u0156\3\2\2\2\u0156\u0154\3\2\2\2\u0156\u0157"+
		"\3\2\2\2\u0157\u0158\3\2\2\2\u0158\u0159\b:\3\2\u0159t\3\2\2\2\u015a\u015b"+
		"\7\61\2\2\u015b\u015c\7\61\2\2\u015c\u0160\3\2\2\2\u015d\u015f\n\r\2\2"+
		"\u015e\u015d\3\2\2\2\u015f\u0162\3\2\2\2\u0160\u015e\3\2\2\2\u0160\u0161"+
		"\3\2\2\2\u0161\u0163\3\2\2\2\u0162\u0160\3\2\2\2\u0163\u0164\b;\4\2\u0164"+
		"v\3\2\2\2\u0165\u0166\7\61\2\2\u0166\u0167\7,\2\2\u0167\u016b\3\2\2\2"+
		"\u0168\u016a\13\2\2\2\u0169\u0168\3\2\2\2\u016a\u016d\3\2\2\2\u016b\u016c"+
		"\3\2\2\2\u016b\u0169\3\2\2\2\u016c\u016e\3\2\2\2\u016d\u016b\3\2\2\2\u016e"+
		"\u016f\7,\2\2\u016f\u0170\7\61\2\2\u0170\u0171\3\2\2\2\u0171\u0172\b<"+
		"\5\2\u0172x\3\2\2\2\23\2}\u0085\u0089\u008f\u0095\u009b\u009f\u00b2\u00ba"+
		"\u00f7\u0148\u014e\u0150\u0156\u0160\u016b";
	public static final ATN _ATN =
		ATNSimulator.deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}