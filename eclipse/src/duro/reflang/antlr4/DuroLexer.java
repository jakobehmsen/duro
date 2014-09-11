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
		OPEN_BRA=12, CLOSE_BRA=13, OPEN_PAR=14, CLOSE_PAR=15, ASSIGN_ADD=16, ASSIGN_SUB=17, 
		ASSIGN_MULT=18, ASSIGN_DIV=19, EQUALS=20, NOT_EQUALS=21, ASSIGN=22, NOT=23, 
		LESS_THAN=24, LESS_THAN_OR_EQUALS=25, GREATER_THAN=26, GREATER_THAN_OR_EQUALS=27, 
		INT=28, SEMICOLON=29, COMMA=30, COLON=31, DOT=32, KW_VAR=33, KW_PAUSE=34, 
		KW_FUNCTION=35, KW_RETURN=36, KW_TRUE=37, KW_FALSE=38, KW_IF=39, KW_ELSE=40, 
		KW_THIS=41, KW_NULL=42, KW_WHILE=43, KW_FOR=44, KW_IN=45, ID=46, WS=47, 
		SINGLELINE_COMMENT=48, MULTI_LINE_COMMENT=49;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] tokenNames = {
		"<INVALID>",
		"STRING_LITERAL", "LINE_TERMINATOR", "'&&'", "'||'", "'++'", "'--'", "BIN_OP1", 
		"BIN_OP2", "'#'", "'['", "']'", "'{'", "'}'", "'('", "')'", "'+='", "'-='", 
		"'*='", "'/='", "'=='", "'!='", "'='", "'!'", "'<'", "'<='", "'>'", "'>='", 
		"INT", "';'", "','", "':'", "'.'", "'var'", "'pause'", "'function'", "'return'", 
		"'true'", "'false'", "'if'", "'else'", "'this'", "'null'", "'while'", 
		"'for'", "'in'", "ID", "WS", "SINGLELINE_COMMENT", "MULTI_LINE_COMMENT"
	};
	public static final String[] ruleNames = {
		"STRING_LITERAL", "DOUBLE_STRING_CHARACTER", "SINGLE_STRING_CHARACTER", 
		"ESCAPE_SEQUENCE", "CHARACTER_ESCAPE_SEQUENCE", "HEX_ESCAPE_SEQUENCE", 
		"UNICODE_ESCAPE_SEQUENCE", "SINGLE_ESCAPE_CHARACTER", "NON_ESCAPE_CHARACTER", 
		"ESCAPE_CHARACTER", "LINE_CONTINUATION", "LINE_TERMINATOR_SEQUENCE", "HEX_DIGIT", 
		"LINE_TERMINATOR", "DOUBLE_AMP", "DOUBLE_PIPE", "DOUBLE_PLUS", "DOUBLE_MINUS", 
		"BIN_OP1", "BIN_OP2", "HASH", "OPEN_SQ", "CLOSE_SQ", "OPEN_BRA", "CLOSE_BRA", 
		"OPEN_PAR", "CLOSE_PAR", "ASSIGN_ADD", "ASSIGN_SUB", "ASSIGN_MULT", "ASSIGN_DIV", 
		"EQUALS", "NOT_EQUALS", "ASSIGN", "NOT", "LESS_THAN", "LESS_THAN_OR_EQUALS", 
		"GREATER_THAN", "GREATER_THAN_OR_EQUALS", "INT", "SEMICOLON", "COMMA", 
		"COLON", "DOT", "KW_VAR", "KW_PAUSE", "KW_FUNCTION", "KW_RETURN", "KW_TRUE", 
		"KW_FALSE", "KW_IF", "KW_ELSE", "KW_THIS", "KW_NULL", "KW_WHILE", "KW_FOR", 
		"KW_IN", "DIGIT", "LETTER", "ID", "WS", "SINGLELINE_COMMENT", "MULTI_LINE_COMMENT"
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

		case 60: WS_action((RuleContext)_localctx, actionIndex); break;

		case 61: SINGLELINE_COMMENT_action((RuleContext)_localctx, actionIndex); break;

		case 62: MULTI_LINE_COMMENT_action((RuleContext)_localctx, actionIndex); break;
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
		"\3\uacf5\uee8c\u4f5d\u8b0d\u4a45\u78bd\u1b2f\u3378\2\63\u0187\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31"+
		"\t\31\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t"+
		" \4!\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t"+
		"+\4,\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64"+
		"\t\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\4<\t<\4=\t"+
		"=\4>\t>\4?\t?\4@\t@\3\2\3\2\7\2\u0084\n\2\f\2\16\2\u0087\13\2\3\2\3\2"+
		"\3\2\7\2\u008c\n\2\f\2\16\2\u008f\13\2\3\2\5\2\u0092\n\2\3\3\3\3\3\3\3"+
		"\3\5\3\u0098\n\3\3\4\3\4\3\4\3\4\5\4\u009e\n\4\3\5\3\5\3\5\3\5\5\5\u00a4"+
		"\n\5\3\6\3\6\5\6\u00a8\n\6\3\7\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3\b\3\t"+
		"\3\t\3\n\3\n\3\13\3\13\3\13\5\13\u00bb\n\13\3\f\3\f\3\f\3\r\3\r\3\r\5"+
		"\r\u00c3\n\r\3\16\3\16\3\17\3\17\3\17\3\17\3\20\3\20\3\20\3\21\3\21\3"+
		"\21\3\22\3\22\3\22\3\23\3\23\3\23\3\24\3\24\3\25\3\25\3\26\3\26\3\27\3"+
		"\27\3\30\3\30\3\31\3\31\3\32\3\32\3\33\3\33\3\34\3\34\3\35\3\35\3\35\3"+
		"\36\3\36\3\36\3\37\3\37\3\37\3 \3 \3 \3!\3!\3!\3\"\3\"\3\"\3#\3#\3$\3"+
		"$\3%\3%\3&\3&\3&\3\'\3\'\3(\3(\3(\3)\6)\u010a\n)\r)\16)\u010b\3*\3*\3"+
		"+\3+\3,\3,\3-\3-\3.\3.\3.\3.\3/\3/\3/\3/\3/\3/\3\60\3\60\3\60\3\60\3\60"+
		"\3\60\3\60\3\60\3\60\3\61\3\61\3\61\3\61\3\61\3\61\3\61\3\62\3\62\3\62"+
		"\3\62\3\62\3\63\3\63\3\63\3\63\3\63\3\63\3\64\3\64\3\64\3\65\3\65\3\65"+
		"\3\65\3\65\3\66\3\66\3\66\3\66\3\66\3\67\3\67\3\67\3\67\3\67\38\38\38"+
		"\38\38\38\39\39\39\39\3:\3:\3:\3;\3;\3<\5<\u015d\n<\3=\3=\3=\3=\7=\u0163"+
		"\n=\f=\16=\u0166\13=\3>\6>\u0169\n>\r>\16>\u016a\3>\3>\3?\3?\3?\3?\7?"+
		"\u0173\n?\f?\16?\u0176\13?\3?\3?\3@\3@\3@\3@\7@\u017e\n@\f@\16@\u0181"+
		"\13@\3@\3@\3@\3@\3@\3\u017fA\3\3\1\5\2\1\7\2\1\t\2\1\13\2\1\r\2\1\17\2"+
		"\1\21\2\1\23\2\1\25\2\1\27\2\1\31\2\1\33\2\1\35\4\2\37\5\1!\6\1#\7\1%"+
		"\b\1\'\t\1)\n\1+\13\1-\f\1/\r\1\61\16\1\63\17\1\65\20\1\67\21\19\22\1"+
		";\23\1=\24\1?\25\1A\26\1C\27\1E\30\1G\31\1I\32\1K\33\1M\34\1O\35\1Q\36"+
		"\1S\37\1U \1W!\1Y\"\1[#\1]$\1_%\1a&\1c\'\1e(\1g)\1i*\1k+\1m,\1o-\1q.\1"+
		"s/\1u\2\1w\2\1y\60\1{\61\3}\62\4\177\63\5\3\2\16\6\2\f\f\17\17$$^^\6\2"+
		"\f\f\17\17))^^\13\2$$))^^ddhhppttvvxx\16\2\f\f\17\17$$))\62;^^ddhhppt"+
		"tvxzz\4\2wwzz\5\2\62;CHch\5\2\f\f\17\17\u202a\u202b\4\2--//\4\2,,\61\61"+
		"\4\2C\\c|\5\2\13\f\16\17\"\"\4\2\f\f\17\17\u018d\2\3\3\2\2\2\2\35\3\2"+
		"\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2"+
		"\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3"+
		"\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3\2\2\2\2A\3\2"+
		"\2\2\2C\3\2\2\2\2E\3\2\2\2\2G\3\2\2\2\2I\3\2\2\2\2K\3\2\2\2\2M\3\2\2\2"+
		"\2O\3\2\2\2\2Q\3\2\2\2\2S\3\2\2\2\2U\3\2\2\2\2W\3\2\2\2\2Y\3\2\2\2\2["+
		"\3\2\2\2\2]\3\2\2\2\2_\3\2\2\2\2a\3\2\2\2\2c\3\2\2\2\2e\3\2\2\2\2g\3\2"+
		"\2\2\2i\3\2\2\2\2k\3\2\2\2\2m\3\2\2\2\2o\3\2\2\2\2q\3\2\2\2\2s\3\2\2\2"+
		"\2y\3\2\2\2\2{\3\2\2\2\2}\3\2\2\2\2\177\3\2\2\2\3\u0091\3\2\2\2\5\u0097"+
		"\3\2\2\2\7\u009d\3\2\2\2\t\u00a3\3\2\2\2\13\u00a7\3\2\2\2\r\u00a9\3\2"+
		"\2\2\17\u00ad\3\2\2\2\21\u00b3\3\2\2\2\23\u00b5\3\2\2\2\25\u00ba\3\2\2"+
		"\2\27\u00bc\3\2\2\2\31\u00c2\3\2\2\2\33\u00c4\3\2\2\2\35\u00c6\3\2\2\2"+
		"\37\u00ca\3\2\2\2!\u00cd\3\2\2\2#\u00d0\3\2\2\2%\u00d3\3\2\2\2\'\u00d6"+
		"\3\2\2\2)\u00d8\3\2\2\2+\u00da\3\2\2\2-\u00dc\3\2\2\2/\u00de\3\2\2\2\61"+
		"\u00e0\3\2\2\2\63\u00e2\3\2\2\2\65\u00e4\3\2\2\2\67\u00e6\3\2\2\29\u00e8"+
		"\3\2\2\2;\u00eb\3\2\2\2=\u00ee\3\2\2\2?\u00f1\3\2\2\2A\u00f4\3\2\2\2C"+
		"\u00f7\3\2\2\2E\u00fa\3\2\2\2G\u00fc\3\2\2\2I\u00fe\3\2\2\2K\u0100\3\2"+
		"\2\2M\u0103\3\2\2\2O\u0105\3\2\2\2Q\u0109\3\2\2\2S\u010d\3\2\2\2U\u010f"+
		"\3\2\2\2W\u0111\3\2\2\2Y\u0113\3\2\2\2[\u0115\3\2\2\2]\u0119\3\2\2\2_"+
		"\u011f\3\2\2\2a\u0128\3\2\2\2c\u012f\3\2\2\2e\u0134\3\2\2\2g\u013a\3\2"+
		"\2\2i\u013d\3\2\2\2k\u0142\3\2\2\2m\u0147\3\2\2\2o\u014c\3\2\2\2q\u0152"+
		"\3\2\2\2s\u0156\3\2\2\2u\u0159\3\2\2\2w\u015c\3\2\2\2y\u015e\3\2\2\2{"+
		"\u0168\3\2\2\2}\u016e\3\2\2\2\177\u0179\3\2\2\2\u0081\u0085\7$\2\2\u0082"+
		"\u0084\5\5\3\2\u0083\u0082\3\2\2\2\u0084\u0087\3\2\2\2\u0085\u0083\3\2"+
		"\2\2\u0085\u0086\3\2\2\2\u0086\u0088\3\2\2\2\u0087\u0085\3\2\2\2\u0088"+
		"\u0092\7$\2\2\u0089\u008d\7)\2\2\u008a\u008c\5\7\4\2\u008b\u008a\3\2\2"+
		"\2\u008c\u008f\3\2\2\2\u008d\u008b\3\2\2\2\u008d\u008e\3\2\2\2\u008e\u0090"+
		"\3\2\2\2\u008f\u008d\3\2\2\2\u0090\u0092\7)\2\2\u0091\u0081\3\2\2\2\u0091"+
		"\u0089\3\2\2\2\u0092\4\3\2\2\2\u0093\u0098\n\2\2\2\u0094\u0095\7^\2\2"+
		"\u0095\u0098\5\t\5\2\u0096\u0098\5\27\f\2\u0097\u0093\3\2\2\2\u0097\u0094"+
		"\3\2\2\2\u0097\u0096\3\2\2\2\u0098\6\3\2\2\2\u0099\u009e\n\3\2\2\u009a"+
		"\u009b\7^\2\2\u009b\u009e\5\t\5\2\u009c\u009e\5\27\f\2\u009d\u0099\3\2"+
		"\2\2\u009d\u009a\3\2\2\2\u009d\u009c\3\2\2\2\u009e\b\3\2\2\2\u009f\u00a4"+
		"\5\13\6\2\u00a0\u00a4\7\62\2\2\u00a1\u00a4\5\r\7\2\u00a2\u00a4\5\17\b"+
		"\2\u00a3\u009f\3\2\2\2\u00a3\u00a0\3\2\2\2\u00a3\u00a1\3\2\2\2\u00a3\u00a2"+
		"\3\2\2\2\u00a4\n\3\2\2\2\u00a5\u00a8\5\21\t\2\u00a6\u00a8\5\23\n\2\u00a7"+
		"\u00a5\3\2\2\2\u00a7\u00a6\3\2\2\2\u00a8\f\3\2\2\2\u00a9\u00aa\7z\2\2"+
		"\u00aa\u00ab\5\33\16\2\u00ab\u00ac\5\33\16\2\u00ac\16\3\2\2\2\u00ad\u00ae"+
		"\7w\2\2\u00ae\u00af\5\33\16\2\u00af\u00b0\5\33\16\2\u00b0\u00b1\5\33\16"+
		"\2\u00b1\u00b2\5\33\16\2\u00b2\20\3\2\2\2\u00b3\u00b4\t\4\2\2\u00b4\22"+
		"\3\2\2\2\u00b5\u00b6\n\5\2\2\u00b6\24\3\2\2\2\u00b7\u00bb\5\21\t\2\u00b8"+
		"\u00bb\5u;\2\u00b9\u00bb\t\6\2\2\u00ba\u00b7\3\2\2\2\u00ba\u00b8\3\2\2"+
		"\2\u00ba\u00b9\3\2\2\2\u00bb\26\3\2\2\2\u00bc\u00bd\7^\2\2\u00bd\u00be"+
		"\5\31\r\2\u00be\30\3\2\2\2\u00bf\u00c0\7\17\2\2\u00c0\u00c3\7\f\2\2\u00c1"+
		"\u00c3\5\35\17\2\u00c2\u00bf\3\2\2\2\u00c2\u00c1\3\2\2\2\u00c3\32\3\2"+
		"\2\2\u00c4\u00c5\t\7\2\2\u00c5\34\3\2\2\2\u00c6\u00c7\t\b\2\2\u00c7\u00c8"+
		"\3\2\2\2\u00c8\u00c9\b\17\2\2\u00c9\36\3\2\2\2\u00ca\u00cb\7(\2\2\u00cb"+
		"\u00cc\7(\2\2\u00cc \3\2\2\2\u00cd\u00ce\7~\2\2\u00ce\u00cf\7~\2\2\u00cf"+
		"\"\3\2\2\2\u00d0\u00d1\7-\2\2\u00d1\u00d2\7-\2\2\u00d2$\3\2\2\2\u00d3"+
		"\u00d4\7/\2\2\u00d4\u00d5\7/\2\2\u00d5&\3\2\2\2\u00d6\u00d7\t\t\2\2\u00d7"+
		"(\3\2\2\2\u00d8\u00d9\t\n\2\2\u00d9*\3\2\2\2\u00da\u00db\7%\2\2\u00db"+
		",\3\2\2\2\u00dc\u00dd\7]\2\2\u00dd.\3\2\2\2\u00de\u00df\7_\2\2\u00df\60"+
		"\3\2\2\2\u00e0\u00e1\7}\2\2\u00e1\62\3\2\2\2\u00e2\u00e3\7\177\2\2\u00e3"+
		"\64\3\2\2\2\u00e4\u00e5\7*\2\2\u00e5\66\3\2\2\2\u00e6\u00e7\7+\2\2\u00e7"+
		"8\3\2\2\2\u00e8\u00e9\7-\2\2\u00e9\u00ea\7?\2\2\u00ea:\3\2\2\2\u00eb\u00ec"+
		"\7/\2\2\u00ec\u00ed\7?\2\2\u00ed<\3\2\2\2\u00ee\u00ef\7,\2\2\u00ef\u00f0"+
		"\7?\2\2\u00f0>\3\2\2\2\u00f1\u00f2\7\61\2\2\u00f2\u00f3\7?\2\2\u00f3@"+
		"\3\2\2\2\u00f4\u00f5\7?\2\2\u00f5\u00f6\7?\2\2\u00f6B\3\2\2\2\u00f7\u00f8"+
		"\7#\2\2\u00f8\u00f9\7?\2\2\u00f9D\3\2\2\2\u00fa\u00fb\7?\2\2\u00fbF\3"+
		"\2\2\2\u00fc\u00fd\7#\2\2\u00fdH\3\2\2\2\u00fe\u00ff\7>\2\2\u00ffJ\3\2"+
		"\2\2\u0100\u0101\7>\2\2\u0101\u0102\7?\2\2\u0102L\3\2\2\2\u0103\u0104"+
		"\7@\2\2\u0104N\3\2\2\2\u0105\u0106\7@\2\2\u0106\u0107\7?\2\2\u0107P\3"+
		"\2\2\2\u0108\u010a\5u;\2\u0109\u0108\3\2\2\2\u010a\u010b\3\2\2\2\u010b"+
		"\u0109\3\2\2\2\u010b\u010c\3\2\2\2\u010cR\3\2\2\2\u010d\u010e\7=\2\2\u010e"+
		"T\3\2\2\2\u010f\u0110\7.\2\2\u0110V\3\2\2\2\u0111\u0112\7<\2\2\u0112X"+
		"\3\2\2\2\u0113\u0114\7\60\2\2\u0114Z\3\2\2\2\u0115\u0116\7x\2\2\u0116"+
		"\u0117\7c\2\2\u0117\u0118\7t\2\2\u0118\\\3\2\2\2\u0119\u011a\7r\2\2\u011a"+
		"\u011b\7c\2\2\u011b\u011c\7w\2\2\u011c\u011d\7u\2\2\u011d\u011e\7g\2\2"+
		"\u011e^\3\2\2\2\u011f\u0120\7h\2\2\u0120\u0121\7w\2\2\u0121\u0122\7p\2"+
		"\2\u0122\u0123\7e\2\2\u0123\u0124\7v\2\2\u0124\u0125\7k\2\2\u0125\u0126"+
		"\7q\2\2\u0126\u0127\7p\2\2\u0127`\3\2\2\2\u0128\u0129\7t\2\2\u0129\u012a"+
		"\7g\2\2\u012a\u012b\7v\2\2\u012b\u012c\7w\2\2\u012c\u012d\7t\2\2\u012d"+
		"\u012e\7p\2\2\u012eb\3\2\2\2\u012f\u0130\7v\2\2\u0130\u0131\7t\2\2\u0131"+
		"\u0132\7w\2\2\u0132\u0133\7g\2\2\u0133d\3\2\2\2\u0134\u0135\7h\2\2\u0135"+
		"\u0136\7c\2\2\u0136\u0137\7n\2\2\u0137\u0138\7u\2\2\u0138\u0139\7g\2\2"+
		"\u0139f\3\2\2\2\u013a\u013b\7k\2\2\u013b\u013c\7h\2\2\u013ch\3\2\2\2\u013d"+
		"\u013e\7g\2\2\u013e\u013f\7n\2\2\u013f\u0140\7u\2\2\u0140\u0141\7g\2\2"+
		"\u0141j\3\2\2\2\u0142\u0143\7v\2\2\u0143\u0144\7j\2\2\u0144\u0145\7k\2"+
		"\2\u0145\u0146\7u\2\2\u0146l\3\2\2\2\u0147\u0148\7p\2\2\u0148\u0149\7"+
		"w\2\2\u0149\u014a\7n\2\2\u014a\u014b\7n\2\2\u014bn\3\2\2\2\u014c\u014d"+
		"\7y\2\2\u014d\u014e\7j\2\2\u014e\u014f\7k\2\2\u014f\u0150\7n\2\2\u0150"+
		"\u0151\7g\2\2\u0151p\3\2\2\2\u0152\u0153\7h\2\2\u0153\u0154\7q\2\2\u0154"+
		"\u0155\7t\2\2\u0155r\3\2\2\2\u0156\u0157\7k\2\2\u0157\u0158\7p\2\2\u0158"+
		"t\3\2\2\2\u0159\u015a\4\62;\2\u015av\3\2\2\2\u015b\u015d\t\13\2\2\u015c"+
		"\u015b\3\2\2\2\u015dx\3\2\2\2\u015e\u0164\5w<\2\u015f\u0163\5w<\2\u0160"+
		"\u0163\5u;\2\u0161\u0163\7a\2\2\u0162\u015f\3\2\2\2\u0162\u0160\3\2\2"+
		"\2\u0162\u0161\3\2\2\2\u0163\u0166\3\2\2\2\u0164\u0162\3\2\2\2\u0164\u0165"+
		"\3\2\2\2\u0165z\3\2\2\2\u0166\u0164\3\2\2\2\u0167\u0169\t\f\2\2\u0168"+
		"\u0167\3\2\2\2\u0169\u016a\3\2\2\2\u016a\u0168\3\2\2\2\u016a\u016b\3\2"+
		"\2\2\u016b\u016c\3\2\2\2\u016c\u016d\b>\3\2\u016d|\3\2\2\2\u016e\u016f"+
		"\7\61\2\2\u016f\u0170\7\61\2\2\u0170\u0174\3\2\2\2\u0171\u0173\n\r\2\2"+
		"\u0172\u0171\3\2\2\2\u0173\u0176\3\2\2\2\u0174\u0172\3\2\2\2\u0174\u0175"+
		"\3\2\2\2\u0175\u0177\3\2\2\2\u0176\u0174\3\2\2\2\u0177\u0178\b?\4\2\u0178"+
		"~\3\2\2\2\u0179\u017a\7\61\2\2\u017a\u017b\7,\2\2\u017b\u017f\3\2\2\2"+
		"\u017c\u017e\13\2\2\2\u017d\u017c\3\2\2\2\u017e\u0181\3\2\2\2\u017f\u0180"+
		"\3\2\2\2\u017f\u017d\3\2\2\2\u0180\u0182\3\2\2\2\u0181\u017f\3\2\2\2\u0182"+
		"\u0183\7,\2\2\u0183\u0184\7\61\2\2\u0184\u0185\3\2\2\2\u0185\u0186\b@"+
		"\5\2\u0186\u0080\3\2\2\2\23\2\u0085\u008d\u0091\u0097\u009d\u00a3\u00a7"+
		"\u00ba\u00c2\u010b\u015c\u0162\u0164\u016a\u0174\u017f";
	public static final ATN _ATN =
		ATNSimulator.deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}