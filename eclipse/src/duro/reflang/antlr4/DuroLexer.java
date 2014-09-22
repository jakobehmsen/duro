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
		STRING_LITERAL=1, LINE_TERMINATOR=2, DOUBLE_AMP=3, DOUBLE_PIPE=4, NOT=5, 
		DOUBLE_PLUS=6, DOUBLE_MINUS=7, SINGLE_PIPE=8, HASH=9, OPEN_SQ=10, CLOSE_SQ=11, 
		OPEN_BRA=12, CLOSE_BRA=13, OPEN_PAR=14, CLOSE_PAR=15, ASSIGN=16, PROTO_ASSIGN=17, 
		ASSIGN_ADD=18, ASSIGN_SUB=19, ASSIGN_MULT=20, ASSIGN_DIV=21, ASSIGN_REM=22, 
		EQUALS=23, NOT_EQUALS=24, LESS_THAN=25, LESS_THAN_OR_EQUALS=26, GREATER_THAN=27, 
		GREATER_THAN_OR_EQUALS=28, BIN_OP1=29, BIN_OP2=30, INT=31, SEMICOLON=32, 
		COMMA=33, COLON=34, QUESTION_MARK=35, DOT=36, KW_VAR=37, KW_PAUSE=38, 
		KW_FUNCTION=39, KW_RETURN=40, KW_BREAK=41, KW_YIELD=42, KW_TRUE=43, KW_FALSE=44, 
		KW_IF=45, KW_ELSE=46, KW_THIS=47, KW_NULL=48, KW_FRAME=49, KW_WHILE=50, 
		KW_FOR=51, KW_IN=52, ID=53, WS=54, SINGLELINE_COMMENT=55, MULTI_LINE_COMMENT=56;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] tokenNames = {
		"<INVALID>",
		"STRING_LITERAL", "LINE_TERMINATOR", "'&&'", "'||'", "'!'", "'++'", "'--'", 
		"'|'", "'#'", "'['", "']'", "'{'", "'}'", "'('", "')'", "'='", "'^='", 
		"'+='", "'-='", "'*='", "'/='", "'%='", "'=='", "'!='", "'<'", "'<='", 
		"'>'", "'>='", "BIN_OP1", "BIN_OP2", "INT", "';'", "','", "':'", "'?'", 
		"'.'", "'var'", "'pause'", "'function'", "'return'", "'break'", "'yield'", 
		"'true'", "'false'", "'if'", "'else'", "'this'", "'null'", "'frame'", 
		"'while'", "'for'", "'in'", "ID", "WS", "SINGLELINE_COMMENT", "MULTI_LINE_COMMENT"
	};
	public static final String[] ruleNames = {
		"STRING_LITERAL", "DOUBLE_STRING_CHARACTER", "SINGLE_STRING_CHARACTER", 
		"ESCAPE_SEQUENCE", "CHARACTER_ESCAPE_SEQUENCE", "HEX_ESCAPE_SEQUENCE", 
		"UNICODE_ESCAPE_SEQUENCE", "SINGLE_ESCAPE_CHARACTER", "NON_ESCAPE_CHARACTER", 
		"ESCAPE_CHARACTER", "LINE_CONTINUATION", "LINE_TERMINATOR_SEQUENCE", "HEX_DIGIT", 
		"LINE_TERMINATOR", "DOUBLE_AMP", "DOUBLE_PIPE", "NOT", "DOUBLE_PLUS", 
		"DOUBLE_MINUS", "SINGLE_PIPE", "HASH", "OPEN_SQ", "CLOSE_SQ", "OPEN_BRA", 
		"CLOSE_BRA", "OPEN_PAR", "CLOSE_PAR", "ASSIGN", "PROTO_ASSIGN", "ASSIGN_ADD", 
		"ASSIGN_SUB", "ASSIGN_MULT", "ASSIGN_DIV", "ASSIGN_REM", "EQUALS", "NOT_EQUALS", 
		"LESS_THAN", "LESS_THAN_OR_EQUALS", "GREATER_THAN", "GREATER_THAN_OR_EQUALS", 
		"BIN_OP1", "BIN_OP2", "INT", "SEMICOLON", "COMMA", "COLON", "QUESTION_MARK", 
		"DOT", "KW_VAR", "KW_PAUSE", "KW_FUNCTION", "KW_RETURN", "KW_BREAK", "KW_YIELD", 
		"KW_TRUE", "KW_FALSE", "KW_IF", "KW_ELSE", "KW_THIS", "KW_NULL", "KW_FRAME", 
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

		case 67: WS_action((RuleContext)_localctx, actionIndex); break;

		case 68: SINGLELINE_COMMENT_action((RuleContext)_localctx, actionIndex); break;

		case 69: MULTI_LINE_COMMENT_action((RuleContext)_localctx, actionIndex); break;
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
		"\3\uacf5\uee8c\u4f5d\u8b0d\u4a45\u78bd\u1b2f\u3378\2:\u01b1\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\4<\t<\4=\t="+
		"\4>\t>\4?\t?\4@\t@\4A\tA\4B\tB\4C\tC\4D\tD\4E\tE\4F\tF\4G\tG\3\2\3\2\7"+
		"\2\u0092\n\2\f\2\16\2\u0095\13\2\3\2\3\2\3\2\7\2\u009a\n\2\f\2\16\2\u009d"+
		"\13\2\3\2\5\2\u00a0\n\2\3\3\3\3\3\3\3\3\5\3\u00a6\n\3\3\4\3\4\3\4\3\4"+
		"\5\4\u00ac\n\4\3\5\3\5\3\5\3\5\5\5\u00b2\n\5\3\6\3\6\5\6\u00b6\n\6\3\7"+
		"\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3\b\3\t\3\t\3\n\3\n\3\13\3\13\3\13\5"+
		"\13\u00c9\n\13\3\f\3\f\3\f\3\r\3\r\3\r\5\r\u00d1\n\r\3\16\3\16\3\17\3"+
		"\17\3\17\3\17\3\20\3\20\3\20\3\21\3\21\3\21\3\22\3\22\3\23\3\23\3\23\3"+
		"\24\3\24\3\24\3\25\3\25\3\26\3\26\3\27\3\27\3\30\3\30\3\31\3\31\3\32\3"+
		"\32\3\33\3\33\3\34\3\34\3\35\3\35\3\36\3\36\3\36\3\37\3\37\3\37\3 \3 "+
		"\3 \3!\3!\3!\3\"\3\"\3\"\3#\3#\3#\3$\3$\3$\3%\3%\3%\3&\3&\3\'\3\'\3\'"+
		"\3(\3(\3)\3)\3)\3*\3*\3+\3+\3,\6,\u0120\n,\r,\16,\u0121\3-\3-\3.\3.\3"+
		"/\3/\3\60\3\60\3\61\3\61\3\62\3\62\3\62\3\62\3\63\3\63\3\63\3\63\3\63"+
		"\3\63\3\64\3\64\3\64\3\64\3\64\3\64\3\64\3\64\3\64\3\65\3\65\3\65\3\65"+
		"\3\65\3\65\3\65\3\66\3\66\3\66\3\66\3\66\3\66\3\67\3\67\3\67\3\67\3\67"+
		"\3\67\38\38\38\38\38\39\39\39\39\39\39\3:\3:\3:\3;\3;\3;\3;\3;\3<\3<\3"+
		"<\3<\3<\3=\3=\3=\3=\3=\3>\3>\3>\3>\3>\3>\3?\3?\3?\3?\3?\3?\3@\3@\3@\3"+
		"@\3A\3A\3A\3B\3B\3C\5C\u0187\nC\3D\3D\3D\3D\7D\u018d\nD\fD\16D\u0190\13"+
		"D\3E\6E\u0193\nE\rE\16E\u0194\3E\3E\3F\3F\3F\3F\7F\u019d\nF\fF\16F\u01a0"+
		"\13F\3F\3F\3G\3G\3G\3G\7G\u01a8\nG\fG\16G\u01ab\13G\3G\3G\3G\3G\3G\3\u01a9"+
		"H\3\3\1\5\2\1\7\2\1\t\2\1\13\2\1\r\2\1\17\2\1\21\2\1\23\2\1\25\2\1\27"+
		"\2\1\31\2\1\33\2\1\35\4\2\37\5\1!\6\1#\7\1%\b\1\'\t\1)\n\1+\13\1-\f\1"+
		"/\r\1\61\16\1\63\17\1\65\20\1\67\21\19\22\1;\23\1=\24\1?\25\1A\26\1C\27"+
		"\1E\30\1G\31\1I\32\1K\33\1M\34\1O\35\1Q\36\1S\37\1U \1W!\1Y\"\1[#\1]$"+
		"\1_%\1a&\1c\'\1e(\1g)\1i*\1k+\1m,\1o-\1q.\1s/\1u\60\1w\61\1y\62\1{\63"+
		"\1}\64\1\177\65\1\u0081\66\1\u0083\2\1\u0085\2\1\u0087\67\1\u00898\3\u008b"+
		"9\4\u008d:\5\3\2\16\6\2\f\f\17\17$$^^\6\2\f\f\17\17))^^\13\2$$))^^ddh"+
		"hppttvvxx\16\2\f\f\17\17$$))\62;^^ddhhppttvxzz\4\2wwzz\5\2\62;CHch\5\2"+
		"\f\f\17\17\u202a\u202b\4\2--//\5\2\'\',,\61\61\4\2C\\c|\5\2\13\f\16\17"+
		"\"\"\4\2\f\f\17\17\u01b7\2\3\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2"+
		"\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2"+
		"\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3"+
		"\2\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3\2\2\2\2A\3\2\2\2\2C\3\2\2\2\2E\3\2\2"+
		"\2\2G\3\2\2\2\2I\3\2\2\2\2K\3\2\2\2\2M\3\2\2\2\2O\3\2\2\2\2Q\3\2\2\2\2"+
		"S\3\2\2\2\2U\3\2\2\2\2W\3\2\2\2\2Y\3\2\2\2\2[\3\2\2\2\2]\3\2\2\2\2_\3"+
		"\2\2\2\2a\3\2\2\2\2c\3\2\2\2\2e\3\2\2\2\2g\3\2\2\2\2i\3\2\2\2\2k\3\2\2"+
		"\2\2m\3\2\2\2\2o\3\2\2\2\2q\3\2\2\2\2s\3\2\2\2\2u\3\2\2\2\2w\3\2\2\2\2"+
		"y\3\2\2\2\2{\3\2\2\2\2}\3\2\2\2\2\177\3\2\2\2\2\u0081\3\2\2\2\2\u0087"+
		"\3\2\2\2\2\u0089\3\2\2\2\2\u008b\3\2\2\2\2\u008d\3\2\2\2\3\u009f\3\2\2"+
		"\2\5\u00a5\3\2\2\2\7\u00ab\3\2\2\2\t\u00b1\3\2\2\2\13\u00b5\3\2\2\2\r"+
		"\u00b7\3\2\2\2\17\u00bb\3\2\2\2\21\u00c1\3\2\2\2\23\u00c3\3\2\2\2\25\u00c8"+
		"\3\2\2\2\27\u00ca\3\2\2\2\31\u00d0\3\2\2\2\33\u00d2\3\2\2\2\35\u00d4\3"+
		"\2\2\2\37\u00d8\3\2\2\2!\u00db\3\2\2\2#\u00de\3\2\2\2%\u00e0\3\2\2\2\'"+
		"\u00e3\3\2\2\2)\u00e6\3\2\2\2+\u00e8\3\2\2\2-\u00ea\3\2\2\2/\u00ec\3\2"+
		"\2\2\61\u00ee\3\2\2\2\63\u00f0\3\2\2\2\65\u00f2\3\2\2\2\67\u00f4\3\2\2"+
		"\29\u00f6\3\2\2\2;\u00f8\3\2\2\2=\u00fb\3\2\2\2?\u00fe\3\2\2\2A\u0101"+
		"\3\2\2\2C\u0104\3\2\2\2E\u0107\3\2\2\2G\u010a\3\2\2\2I\u010d\3\2\2\2K"+
		"\u0110\3\2\2\2M\u0112\3\2\2\2O\u0115\3\2\2\2Q\u0117\3\2\2\2S\u011a\3\2"+
		"\2\2U\u011c\3\2\2\2W\u011f\3\2\2\2Y\u0123\3\2\2\2[\u0125\3\2\2\2]\u0127"+
		"\3\2\2\2_\u0129\3\2\2\2a\u012b\3\2\2\2c\u012d\3\2\2\2e\u0131\3\2\2\2g"+
		"\u0137\3\2\2\2i\u0140\3\2\2\2k\u0147\3\2\2\2m\u014d\3\2\2\2o\u0153\3\2"+
		"\2\2q\u0158\3\2\2\2s\u015e\3\2\2\2u\u0161\3\2\2\2w\u0166\3\2\2\2y\u016b"+
		"\3\2\2\2{\u0170\3\2\2\2}\u0176\3\2\2\2\177\u017c\3\2\2\2\u0081\u0180\3"+
		"\2\2\2\u0083\u0183\3\2\2\2\u0085\u0186\3\2\2\2\u0087\u0188\3\2\2\2\u0089"+
		"\u0192\3\2\2\2\u008b\u0198\3\2\2\2\u008d\u01a3\3\2\2\2\u008f\u0093\7$"+
		"\2\2\u0090\u0092\5\5\3\2\u0091\u0090\3\2\2\2\u0092\u0095\3\2\2\2\u0093"+
		"\u0091\3\2\2\2\u0093\u0094\3\2\2\2\u0094\u0096\3\2\2\2\u0095\u0093\3\2"+
		"\2\2\u0096\u00a0\7$\2\2\u0097\u009b\7)\2\2\u0098\u009a\5\7\4\2\u0099\u0098"+
		"\3\2\2\2\u009a\u009d\3\2\2\2\u009b\u0099\3\2\2\2\u009b\u009c\3\2\2\2\u009c"+
		"\u009e\3\2\2\2\u009d\u009b\3\2\2\2\u009e\u00a0\7)\2\2\u009f\u008f\3\2"+
		"\2\2\u009f\u0097\3\2\2\2\u00a0\4\3\2\2\2\u00a1\u00a6\n\2\2\2\u00a2\u00a3"+
		"\7^\2\2\u00a3\u00a6\5\t\5\2\u00a4\u00a6\5\27\f\2\u00a5\u00a1\3\2\2\2\u00a5"+
		"\u00a2\3\2\2\2\u00a5\u00a4\3\2\2\2\u00a6\6\3\2\2\2\u00a7\u00ac\n\3\2\2"+
		"\u00a8\u00a9\7^\2\2\u00a9\u00ac\5\t\5\2\u00aa\u00ac\5\27\f\2\u00ab\u00a7"+
		"\3\2\2\2\u00ab\u00a8\3\2\2\2\u00ab\u00aa\3\2\2\2\u00ac\b\3\2\2\2\u00ad"+
		"\u00b2\5\13\6\2\u00ae\u00b2\7\62\2\2\u00af\u00b2\5\r\7\2\u00b0\u00b2\5"+
		"\17\b\2\u00b1\u00ad\3\2\2\2\u00b1\u00ae\3\2\2\2\u00b1\u00af\3\2\2\2\u00b1"+
		"\u00b0\3\2\2\2\u00b2\n\3\2\2\2\u00b3\u00b6\5\21\t\2\u00b4\u00b6\5\23\n"+
		"\2\u00b5\u00b3\3\2\2\2\u00b5\u00b4\3\2\2\2\u00b6\f\3\2\2\2\u00b7\u00b8"+
		"\7z\2\2\u00b8\u00b9\5\33\16\2\u00b9\u00ba\5\33\16\2\u00ba\16\3\2\2\2\u00bb"+
		"\u00bc\7w\2\2\u00bc\u00bd\5\33\16\2\u00bd\u00be\5\33\16\2\u00be\u00bf"+
		"\5\33\16\2\u00bf\u00c0\5\33\16\2\u00c0\20\3\2\2\2\u00c1\u00c2\t\4\2\2"+
		"\u00c2\22\3\2\2\2\u00c3\u00c4\n\5\2\2\u00c4\24\3\2\2\2\u00c5\u00c9\5\21"+
		"\t\2\u00c6\u00c9\5\u0083B\2\u00c7\u00c9\t\6\2\2\u00c8\u00c5\3\2\2\2\u00c8"+
		"\u00c6\3\2\2\2\u00c8\u00c7\3\2\2\2\u00c9\26\3\2\2\2\u00ca\u00cb\7^\2\2"+
		"\u00cb\u00cc\5\31\r\2\u00cc\30\3\2\2\2\u00cd\u00ce\7\17\2\2\u00ce\u00d1"+
		"\7\f\2\2\u00cf\u00d1\5\35\17\2\u00d0\u00cd\3\2\2\2\u00d0\u00cf\3\2\2\2"+
		"\u00d1\32\3\2\2\2\u00d2\u00d3\t\7\2\2\u00d3\34\3\2\2\2\u00d4\u00d5\t\b"+
		"\2\2\u00d5\u00d6\3\2\2\2\u00d6\u00d7\b\17\2\2\u00d7\36\3\2\2\2\u00d8\u00d9"+
		"\7(\2\2\u00d9\u00da\7(\2\2\u00da \3\2\2\2\u00db\u00dc\7~\2\2\u00dc\u00dd"+
		"\7~\2\2\u00dd\"\3\2\2\2\u00de\u00df\7#\2\2\u00df$\3\2\2\2\u00e0\u00e1"+
		"\7-\2\2\u00e1\u00e2\7-\2\2\u00e2&\3\2\2\2\u00e3\u00e4\7/\2\2\u00e4\u00e5"+
		"\7/\2\2\u00e5(\3\2\2\2\u00e6\u00e7\7~\2\2\u00e7*\3\2\2\2\u00e8\u00e9\7"+
		"%\2\2\u00e9,\3\2\2\2\u00ea\u00eb\7]\2\2\u00eb.\3\2\2\2\u00ec\u00ed\7_"+
		"\2\2\u00ed\60\3\2\2\2\u00ee\u00ef\7}\2\2\u00ef\62\3\2\2\2\u00f0\u00f1"+
		"\7\177\2\2\u00f1\64\3\2\2\2\u00f2\u00f3\7*\2\2\u00f3\66\3\2\2\2\u00f4"+
		"\u00f5\7+\2\2\u00f58\3\2\2\2\u00f6\u00f7\7?\2\2\u00f7:\3\2\2\2\u00f8\u00f9"+
		"\7`\2\2\u00f9\u00fa\7?\2\2\u00fa<\3\2\2\2\u00fb\u00fc\7-\2\2\u00fc\u00fd"+
		"\7?\2\2\u00fd>\3\2\2\2\u00fe\u00ff\7/\2\2\u00ff\u0100\7?\2\2\u0100@\3"+
		"\2\2\2\u0101\u0102\7,\2\2\u0102\u0103\7?\2\2\u0103B\3\2\2\2\u0104\u0105"+
		"\7\61\2\2\u0105\u0106\7?\2\2\u0106D\3\2\2\2\u0107\u0108\7\'\2\2\u0108"+
		"\u0109\7?\2\2\u0109F\3\2\2\2\u010a\u010b\7?\2\2\u010b\u010c\7?\2\2\u010c"+
		"H\3\2\2\2\u010d\u010e\7#\2\2\u010e\u010f\7?\2\2\u010fJ\3\2\2\2\u0110\u0111"+
		"\7>\2\2\u0111L\3\2\2\2\u0112\u0113\7>\2\2\u0113\u0114\7?\2\2\u0114N\3"+
		"\2\2\2\u0115\u0116\7@\2\2\u0116P\3\2\2\2\u0117\u0118\7@\2\2\u0118\u0119"+
		"\7?\2\2\u0119R\3\2\2\2\u011a\u011b\t\t\2\2\u011bT\3\2\2\2\u011c\u011d"+
		"\t\n\2\2\u011dV\3\2\2\2\u011e\u0120\5\u0083B\2\u011f\u011e\3\2\2\2\u0120"+
		"\u0121\3\2\2\2\u0121\u011f\3\2\2\2\u0121\u0122\3\2\2\2\u0122X\3\2\2\2"+
		"\u0123\u0124\7=\2\2\u0124Z\3\2\2\2\u0125\u0126\7.\2\2\u0126\\\3\2\2\2"+
		"\u0127\u0128\7<\2\2\u0128^\3\2\2\2\u0129\u012a\7A\2\2\u012a`\3\2\2\2\u012b"+
		"\u012c\7\60\2\2\u012cb\3\2\2\2\u012d\u012e\7x\2\2\u012e\u012f\7c\2\2\u012f"+
		"\u0130\7t\2\2\u0130d\3\2\2\2\u0131\u0132\7r\2\2\u0132\u0133\7c\2\2\u0133"+
		"\u0134\7w\2\2\u0134\u0135\7u\2\2\u0135\u0136\7g\2\2\u0136f\3\2\2\2\u0137"+
		"\u0138\7h\2\2\u0138\u0139\7w\2\2\u0139\u013a\7p\2\2\u013a\u013b\7e\2\2"+
		"\u013b\u013c\7v\2\2\u013c\u013d\7k\2\2\u013d\u013e\7q\2\2\u013e\u013f"+
		"\7p\2\2\u013fh\3\2\2\2\u0140\u0141\7t\2\2\u0141\u0142\7g\2\2\u0142\u0143"+
		"\7v\2\2\u0143\u0144\7w\2\2\u0144\u0145\7t\2\2\u0145\u0146\7p\2\2\u0146"+
		"j\3\2\2\2\u0147\u0148\7d\2\2\u0148\u0149\7t\2\2\u0149\u014a\7g\2\2\u014a"+
		"\u014b\7c\2\2\u014b\u014c\7m\2\2\u014cl\3\2\2\2\u014d\u014e\7{\2\2\u014e"+
		"\u014f\7k\2\2\u014f\u0150\7g\2\2\u0150\u0151\7n\2\2\u0151\u0152\7f\2\2"+
		"\u0152n\3\2\2\2\u0153\u0154\7v\2\2\u0154\u0155\7t\2\2\u0155\u0156\7w\2"+
		"\2\u0156\u0157\7g\2\2\u0157p\3\2\2\2\u0158\u0159\7h\2\2\u0159\u015a\7"+
		"c\2\2\u015a\u015b\7n\2\2\u015b\u015c\7u\2\2\u015c\u015d\7g\2\2\u015dr"+
		"\3\2\2\2\u015e\u015f\7k\2\2\u015f\u0160\7h\2\2\u0160t\3\2\2\2\u0161\u0162"+
		"\7g\2\2\u0162\u0163\7n\2\2\u0163\u0164\7u\2\2\u0164\u0165\7g\2\2\u0165"+
		"v\3\2\2\2\u0166\u0167\7v\2\2\u0167\u0168\7j\2\2\u0168\u0169\7k\2\2\u0169"+
		"\u016a\7u\2\2\u016ax\3\2\2\2\u016b\u016c\7p\2\2\u016c\u016d\7w\2\2\u016d"+
		"\u016e\7n\2\2\u016e\u016f\7n\2\2\u016fz\3\2\2\2\u0170\u0171\7h\2\2\u0171"+
		"\u0172\7t\2\2\u0172\u0173\7c\2\2\u0173\u0174\7o\2\2\u0174\u0175\7g\2\2"+
		"\u0175|\3\2\2\2\u0176\u0177\7y\2\2\u0177\u0178\7j\2\2\u0178\u0179\7k\2"+
		"\2\u0179\u017a\7n\2\2\u017a\u017b\7g\2\2\u017b~\3\2\2\2\u017c\u017d\7"+
		"h\2\2\u017d\u017e\7q\2\2\u017e\u017f\7t\2\2\u017f\u0080\3\2\2\2\u0180"+
		"\u0181\7k\2\2\u0181\u0182\7p\2\2\u0182\u0082\3\2\2\2\u0183\u0184\4\62"+
		";\2\u0184\u0084\3\2\2\2\u0185\u0187\t\13\2\2\u0186\u0185\3\2\2\2\u0187"+
		"\u0086\3\2\2\2\u0188\u018e\5\u0085C\2\u0189\u018d\5\u0085C\2\u018a\u018d"+
		"\5\u0083B\2\u018b\u018d\7a\2\2\u018c\u0189\3\2\2\2\u018c\u018a\3\2\2\2"+
		"\u018c\u018b\3\2\2\2\u018d\u0190\3\2\2\2\u018e\u018c\3\2\2\2\u018e\u018f"+
		"\3\2\2\2\u018f\u0088\3\2\2\2\u0190\u018e\3\2\2\2\u0191\u0193\t\f\2\2\u0192"+
		"\u0191\3\2\2\2\u0193\u0194\3\2\2\2\u0194\u0192\3\2\2\2\u0194\u0195\3\2"+
		"\2\2\u0195\u0196\3\2\2\2\u0196\u0197\bE\3\2\u0197\u008a\3\2\2\2\u0198"+
		"\u0199\7\61\2\2\u0199\u019a\7\61\2\2\u019a\u019e\3\2\2\2\u019b\u019d\n"+
		"\r\2\2\u019c\u019b\3\2\2\2\u019d\u01a0\3\2\2\2\u019e\u019c\3\2\2\2\u019e"+
		"\u019f\3\2\2\2\u019f\u01a1\3\2\2\2\u01a0\u019e\3\2\2\2\u01a1\u01a2\bF"+
		"\4\2\u01a2\u008c\3\2\2\2\u01a3\u01a4\7\61\2\2\u01a4\u01a5\7,\2\2\u01a5"+
		"\u01a9\3\2\2\2\u01a6\u01a8\13\2\2\2\u01a7\u01a6\3\2\2\2\u01a8\u01ab\3"+
		"\2\2\2\u01a9\u01aa\3\2\2\2\u01a9\u01a7\3\2\2\2\u01aa\u01ac\3\2\2\2\u01ab"+
		"\u01a9\3\2\2\2\u01ac\u01ad\7,\2\2\u01ad\u01ae\7\61\2\2\u01ae\u01af\3\2"+
		"\2\2\u01af\u01b0\bG\5\2\u01b0\u008e\3\2\2\2\23\2\u0093\u009b\u009f\u00a5"+
		"\u00ab\u00b1\u00b5\u00c8\u00d0\u0121\u0186\u018c\u018e\u0194\u019e\u01a9";
	public static final ATN _ATN =
		ATNSimulator.deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}