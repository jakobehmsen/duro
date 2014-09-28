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
		STRING_LITERAL=1, LINE_TERMINATOR=2, PARAGRAPH=3, DOUBLE_AMP=4, DOUBLE_PIPE=5, 
		NOT=6, DOUBLE_PLUS=7, DOUBLE_MINUS=8, SINGLE_PIPE=9, HASH=10, DOLLAR=11, 
		OPEN_SQ=12, CLOSE_SQ=13, OPEN_BRA=14, CLOSE_BRA=15, OPEN_PAR=16, CLOSE_PAR=17, 
		ASSIGN=18, PROTO_ASSIGN=19, QUOTED_ASSIGN=20, ASSIGN_ADD=21, ASSIGN_SUB=22, 
		ASSIGN_MULT=23, ASSIGN_DIV=24, ASSIGN_REM=25, EQUALS=26, NOT_EQUALS=27, 
		LESS_THAN=28, LESS_THAN_OR_EQUALS=29, GREATER_THAN=30, GREATER_THAN_OR_EQUALS=31, 
		BIN_OP1=32, BIN_OP2=33, INT=34, SEMICOLON=35, COMMA=36, COLON=37, QUESTION_MARK=38, 
		DOT=39, KW_VAR=40, KW_PAUSE=41, KW_FUNCTION=42, KW_RETURN=43, KW_BREAK=44, 
		KW_YIELD=45, KW_TRUE=46, KW_FALSE=47, KW_IF=48, KW_ELSE=49, KW_THIS=50, 
		KW_NULL=51, KW_FRAME=52, KW_WHILE=53, KW_FOR=54, KW_IN=55, ID=56, WS=57, 
		SINGLELINE_COMMENT=58, MULTI_LINE_COMMENT=59;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] tokenNames = {
		"<INVALID>",
		"STRING_LITERAL", "LINE_TERMINATOR", "'§'", "'&&'", "'||'", "'!'", "'++'", 
		"'--'", "'|'", "'#'", "'$'", "'['", "']'", "'{'", "'}'", "'('", "')'", 
		"'='", "'^='", "'=>'", "'+='", "'-='", "'*='", "'/='", "'%='", "'=='", 
		"'!='", "'<'", "'<='", "'>'", "'>='", "BIN_OP1", "BIN_OP2", "INT", "';'", 
		"','", "':'", "'?'", "'.'", "'var'", "'pause'", "'function'", "'return'", 
		"'break'", "'yield'", "'true'", "'false'", "'if'", "'else'", "'this'", 
		"'null'", "'frame'", "'while'", "'for'", "'in'", "ID", "WS", "SINGLELINE_COMMENT", 
		"MULTI_LINE_COMMENT"
	};
	public static final String[] ruleNames = {
		"STRING_LITERAL", "DOUBLE_STRING_CHARACTER", "SINGLE_STRING_CHARACTER", 
		"ESCAPE_SEQUENCE", "CHARACTER_ESCAPE_SEQUENCE", "HEX_ESCAPE_SEQUENCE", 
		"UNICODE_ESCAPE_SEQUENCE", "SINGLE_ESCAPE_CHARACTER", "NON_ESCAPE_CHARACTER", 
		"ESCAPE_CHARACTER", "LINE_CONTINUATION", "LINE_TERMINATOR_SEQUENCE", "HEX_DIGIT", 
		"LINE_TERMINATOR", "PARAGRAPH", "DOUBLE_AMP", "DOUBLE_PIPE", "NOT", "DOUBLE_PLUS", 
		"DOUBLE_MINUS", "SINGLE_PIPE", "HASH", "DOLLAR", "OPEN_SQ", "CLOSE_SQ", 
		"OPEN_BRA", "CLOSE_BRA", "OPEN_PAR", "CLOSE_PAR", "ASSIGN", "PROTO_ASSIGN", 
		"QUOTED_ASSIGN", "ASSIGN_ADD", "ASSIGN_SUB", "ASSIGN_MULT", "ASSIGN_DIV", 
		"ASSIGN_REM", "EQUALS", "NOT_EQUALS", "LESS_THAN", "LESS_THAN_OR_EQUALS", 
		"GREATER_THAN", "GREATER_THAN_OR_EQUALS", "BIN_OP1", "BIN_OP2", "INT", 
		"SEMICOLON", "COMMA", "COLON", "QUESTION_MARK", "DOT", "KW_VAR", "KW_PAUSE", 
		"KW_FUNCTION", "KW_RETURN", "KW_BREAK", "KW_YIELD", "KW_TRUE", "KW_FALSE", 
		"KW_IF", "KW_ELSE", "KW_THIS", "KW_NULL", "KW_FRAME", "KW_WHILE", "KW_FOR", 
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

		case 70: WS_action((RuleContext)_localctx, actionIndex); break;

		case 71: SINGLELINE_COMMENT_action((RuleContext)_localctx, actionIndex); break;

		case 72: MULTI_LINE_COMMENT_action((RuleContext)_localctx, actionIndex); break;
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
		"\3\uacf5\uee8c\u4f5d\u8b0d\u4a45\u78bd\u1b2f\u3378\2=\u01be\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\4<\t<\4=\t="+
		"\4>\t>\4?\t?\4@\t@\4A\tA\4B\tB\4C\tC\4D\tD\4E\tE\4F\tF\4G\tG\4H\tH\4I"+
		"\tI\4J\tJ\3\2\3\2\7\2\u0098\n\2\f\2\16\2\u009b\13\2\3\2\3\2\3\2\7\2\u00a0"+
		"\n\2\f\2\16\2\u00a3\13\2\3\2\5\2\u00a6\n\2\3\3\3\3\3\3\3\3\5\3\u00ac\n"+
		"\3\3\4\3\4\3\4\3\4\5\4\u00b2\n\4\3\5\3\5\3\5\3\5\5\5\u00b8\n\5\3\6\3\6"+
		"\5\6\u00bc\n\6\3\7\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3\b\3\t\3\t\3\n\3\n"+
		"\3\13\3\13\3\13\5\13\u00cf\n\13\3\f\3\f\3\f\3\r\3\r\3\r\5\r\u00d7\n\r"+
		"\3\16\3\16\3\17\3\17\3\17\3\17\3\20\3\20\3\21\3\21\3\21\3\22\3\22\3\22"+
		"\3\23\3\23\3\24\3\24\3\24\3\25\3\25\3\25\3\26\3\26\3\27\3\27\3\30\3\30"+
		"\3\31\3\31\3\32\3\32\3\33\3\33\3\34\3\34\3\35\3\35\3\36\3\36\3\37\3\37"+
		"\3 \3 \3 \3!\3!\3!\3\"\3\"\3\"\3#\3#\3#\3$\3$\3$\3%\3%\3%\3&\3&\3&\3\'"+
		"\3\'\3\'\3(\3(\3(\3)\3)\3*\3*\3*\3+\3+\3,\3,\3,\3-\3-\3.\3.\3/\6/\u012d"+
		"\n/\r/\16/\u012e\3\60\3\60\3\61\3\61\3\62\3\62\3\63\3\63\3\64\3\64\3\65"+
		"\3\65\3\65\3\65\3\66\3\66\3\66\3\66\3\66\3\66\3\67\3\67\3\67\3\67\3\67"+
		"\3\67\3\67\3\67\3\67\38\38\38\38\38\38\38\39\39\39\39\39\39\3:\3:\3:\3"+
		":\3:\3:\3;\3;\3;\3;\3;\3<\3<\3<\3<\3<\3<\3=\3=\3=\3>\3>\3>\3>\3>\3?\3"+
		"?\3?\3?\3?\3@\3@\3@\3@\3@\3A\3A\3A\3A\3A\3A\3B\3B\3B\3B\3B\3B\3C\3C\3"+
		"C\3C\3D\3D\3D\3E\3E\3F\5F\u0194\nF\3G\3G\3G\3G\7G\u019a\nG\fG\16G\u019d"+
		"\13G\3H\6H\u01a0\nH\rH\16H\u01a1\3H\3H\3I\3I\3I\3I\7I\u01aa\nI\fI\16I"+
		"\u01ad\13I\3I\3I\3J\3J\3J\3J\7J\u01b5\nJ\fJ\16J\u01b8\13J\3J\3J\3J\3J"+
		"\3J\3\u01b6K\3\3\1\5\2\1\7\2\1\t\2\1\13\2\1\r\2\1\17\2\1\21\2\1\23\2\1"+
		"\25\2\1\27\2\1\31\2\1\33\2\1\35\4\2\37\5\1!\6\1#\7\1%\b\1\'\t\1)\n\1+"+
		"\13\1-\f\1/\r\1\61\16\1\63\17\1\65\20\1\67\21\19\22\1;\23\1=\24\1?\25"+
		"\1A\26\1C\27\1E\30\1G\31\1I\32\1K\33\1M\34\1O\35\1Q\36\1S\37\1U \1W!\1"+
		"Y\"\1[#\1]$\1_%\1a&\1c\'\1e(\1g)\1i*\1k+\1m,\1o-\1q.\1s/\1u\60\1w\61\1"+
		"y\62\1{\63\1}\64\1\177\65\1\u0081\66\1\u0083\67\1\u00858\1\u00879\1\u0089"+
		"\2\1\u008b\2\1\u008d:\1\u008f;\3\u0091<\4\u0093=\5\3\2\16\6\2\f\f\17\17"+
		"$$^^\6\2\f\f\17\17))^^\13\2$$))^^ddhhppttvvxx\16\2\f\f\17\17$$))\62;^"+
		"^ddhhppttvxzz\4\2wwzz\5\2\62;CHch\5\2\f\f\17\17\u202a\u202b\4\2--//\5"+
		"\2\'\',,\61\61\4\2C\\c|\5\2\13\f\16\17\"\"\4\2\f\f\17\17\u01c4\2\3\3\2"+
		"\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3"+
		"\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3"+
		"\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3"+
		"\2\2\2\2A\3\2\2\2\2C\3\2\2\2\2E\3\2\2\2\2G\3\2\2\2\2I\3\2\2\2\2K\3\2\2"+
		"\2\2M\3\2\2\2\2O\3\2\2\2\2Q\3\2\2\2\2S\3\2\2\2\2U\3\2\2\2\2W\3\2\2\2\2"+
		"Y\3\2\2\2\2[\3\2\2\2\2]\3\2\2\2\2_\3\2\2\2\2a\3\2\2\2\2c\3\2\2\2\2e\3"+
		"\2\2\2\2g\3\2\2\2\2i\3\2\2\2\2k\3\2\2\2\2m\3\2\2\2\2o\3\2\2\2\2q\3\2\2"+
		"\2\2s\3\2\2\2\2u\3\2\2\2\2w\3\2\2\2\2y\3\2\2\2\2{\3\2\2\2\2}\3\2\2\2\2"+
		"\177\3\2\2\2\2\u0081\3\2\2\2\2\u0083\3\2\2\2\2\u0085\3\2\2\2\2\u0087\3"+
		"\2\2\2\2\u008d\3\2\2\2\2\u008f\3\2\2\2\2\u0091\3\2\2\2\2\u0093\3\2\2\2"+
		"\3\u00a5\3\2\2\2\5\u00ab\3\2\2\2\7\u00b1\3\2\2\2\t\u00b7\3\2\2\2\13\u00bb"+
		"\3\2\2\2\r\u00bd\3\2\2\2\17\u00c1\3\2\2\2\21\u00c7\3\2\2\2\23\u00c9\3"+
		"\2\2\2\25\u00ce\3\2\2\2\27\u00d0\3\2\2\2\31\u00d6\3\2\2\2\33\u00d8\3\2"+
		"\2\2\35\u00da\3\2\2\2\37\u00de\3\2\2\2!\u00e0\3\2\2\2#\u00e3\3\2\2\2%"+
		"\u00e6\3\2\2\2\'\u00e8\3\2\2\2)\u00eb\3\2\2\2+\u00ee\3\2\2\2-\u00f0\3"+
		"\2\2\2/\u00f2\3\2\2\2\61\u00f4\3\2\2\2\63\u00f6\3\2\2\2\65\u00f8\3\2\2"+
		"\2\67\u00fa\3\2\2\29\u00fc\3\2\2\2;\u00fe\3\2\2\2=\u0100\3\2\2\2?\u0102"+
		"\3\2\2\2A\u0105\3\2\2\2C\u0108\3\2\2\2E\u010b\3\2\2\2G\u010e\3\2\2\2I"+
		"\u0111\3\2\2\2K\u0114\3\2\2\2M\u0117\3\2\2\2O\u011a\3\2\2\2Q\u011d\3\2"+
		"\2\2S\u011f\3\2\2\2U\u0122\3\2\2\2W\u0124\3\2\2\2Y\u0127\3\2\2\2[\u0129"+
		"\3\2\2\2]\u012c\3\2\2\2_\u0130\3\2\2\2a\u0132\3\2\2\2c\u0134\3\2\2\2e"+
		"\u0136\3\2\2\2g\u0138\3\2\2\2i\u013a\3\2\2\2k\u013e\3\2\2\2m\u0144\3\2"+
		"\2\2o\u014d\3\2\2\2q\u0154\3\2\2\2s\u015a\3\2\2\2u\u0160\3\2\2\2w\u0165"+
		"\3\2\2\2y\u016b\3\2\2\2{\u016e\3\2\2\2}\u0173\3\2\2\2\177\u0178\3\2\2"+
		"\2\u0081\u017d\3\2\2\2\u0083\u0183\3\2\2\2\u0085\u0189\3\2\2\2\u0087\u018d"+
		"\3\2\2\2\u0089\u0190\3\2\2\2\u008b\u0193\3\2\2\2\u008d\u0195\3\2\2\2\u008f"+
		"\u019f\3\2\2\2\u0091\u01a5\3\2\2\2\u0093\u01b0\3\2\2\2\u0095\u0099\7$"+
		"\2\2\u0096\u0098\5\5\3\2\u0097\u0096\3\2\2\2\u0098\u009b\3\2\2\2\u0099"+
		"\u0097\3\2\2\2\u0099\u009a\3\2\2\2\u009a\u009c\3\2\2\2\u009b\u0099\3\2"+
		"\2\2\u009c\u00a6\7$\2\2\u009d\u00a1\7)\2\2\u009e\u00a0\5\7\4\2\u009f\u009e"+
		"\3\2\2\2\u00a0\u00a3\3\2\2\2\u00a1\u009f\3\2\2\2\u00a1\u00a2\3\2\2\2\u00a2"+
		"\u00a4\3\2\2\2\u00a3\u00a1\3\2\2\2\u00a4\u00a6\7)\2\2\u00a5\u0095\3\2"+
		"\2\2\u00a5\u009d\3\2\2\2\u00a6\4\3\2\2\2\u00a7\u00ac\n\2\2\2\u00a8\u00a9"+
		"\7^\2\2\u00a9\u00ac\5\t\5\2\u00aa\u00ac\5\27\f\2\u00ab\u00a7\3\2\2\2\u00ab"+
		"\u00a8\3\2\2\2\u00ab\u00aa\3\2\2\2\u00ac\6\3\2\2\2\u00ad\u00b2\n\3\2\2"+
		"\u00ae\u00af\7^\2\2\u00af\u00b2\5\t\5\2\u00b0\u00b2\5\27\f\2\u00b1\u00ad"+
		"\3\2\2\2\u00b1\u00ae\3\2\2\2\u00b1\u00b0\3\2\2\2\u00b2\b\3\2\2\2\u00b3"+
		"\u00b8\5\13\6\2\u00b4\u00b8\7\62\2\2\u00b5\u00b8\5\r\7\2\u00b6\u00b8\5"+
		"\17\b\2\u00b7\u00b3\3\2\2\2\u00b7\u00b4\3\2\2\2\u00b7\u00b5\3\2\2\2\u00b7"+
		"\u00b6\3\2\2\2\u00b8\n\3\2\2\2\u00b9\u00bc\5\21\t\2\u00ba\u00bc\5\23\n"+
		"\2\u00bb\u00b9\3\2\2\2\u00bb\u00ba\3\2\2\2\u00bc\f\3\2\2\2\u00bd\u00be"+
		"\7z\2\2\u00be\u00bf\5\33\16\2\u00bf\u00c0\5\33\16\2\u00c0\16\3\2\2\2\u00c1"+
		"\u00c2\7w\2\2\u00c2\u00c3\5\33\16\2\u00c3\u00c4\5\33\16\2\u00c4\u00c5"+
		"\5\33\16\2\u00c5\u00c6\5\33\16\2\u00c6\20\3\2\2\2\u00c7\u00c8\t\4\2\2"+
		"\u00c8\22\3\2\2\2\u00c9\u00ca\n\5\2\2\u00ca\24\3\2\2\2\u00cb\u00cf\5\21"+
		"\t\2\u00cc\u00cf\5\u0089E\2\u00cd\u00cf\t\6\2\2\u00ce\u00cb\3\2\2\2\u00ce"+
		"\u00cc\3\2\2\2\u00ce\u00cd\3\2\2\2\u00cf\26\3\2\2\2\u00d0\u00d1\7^\2\2"+
		"\u00d1\u00d2\5\31\r\2\u00d2\30\3\2\2\2\u00d3\u00d4\7\17\2\2\u00d4\u00d7"+
		"\7\f\2\2\u00d5\u00d7\5\35\17\2\u00d6\u00d3\3\2\2\2\u00d6\u00d5\3\2\2\2"+
		"\u00d7\32\3\2\2\2\u00d8\u00d9\t\7\2\2\u00d9\34\3\2\2\2\u00da\u00db\t\b"+
		"\2\2\u00db\u00dc\3\2\2\2\u00dc\u00dd\b\17\2\2\u00dd\36\3\2\2\2\u00de\u00df"+
		"\7\u00a9\2\2\u00df \3\2\2\2\u00e0\u00e1\7(\2\2\u00e1\u00e2\7(\2\2\u00e2"+
		"\"\3\2\2\2\u00e3\u00e4\7~\2\2\u00e4\u00e5\7~\2\2\u00e5$\3\2\2\2\u00e6"+
		"\u00e7\7#\2\2\u00e7&\3\2\2\2\u00e8\u00e9\7-\2\2\u00e9\u00ea\7-\2\2\u00ea"+
		"(\3\2\2\2\u00eb\u00ec\7/\2\2\u00ec\u00ed\7/\2\2\u00ed*\3\2\2\2\u00ee\u00ef"+
		"\7~\2\2\u00ef,\3\2\2\2\u00f0\u00f1\7%\2\2\u00f1.\3\2\2\2\u00f2\u00f3\7"+
		"&\2\2\u00f3\60\3\2\2\2\u00f4\u00f5\7]\2\2\u00f5\62\3\2\2\2\u00f6\u00f7"+
		"\7_\2\2\u00f7\64\3\2\2\2\u00f8\u00f9\7}\2\2\u00f9\66\3\2\2\2\u00fa\u00fb"+
		"\7\177\2\2\u00fb8\3\2\2\2\u00fc\u00fd\7*\2\2\u00fd:\3\2\2\2\u00fe\u00ff"+
		"\7+\2\2\u00ff<\3\2\2\2\u0100\u0101\7?\2\2\u0101>\3\2\2\2\u0102\u0103\7"+
		"`\2\2\u0103\u0104\7?\2\2\u0104@\3\2\2\2\u0105\u0106\7?\2\2\u0106\u0107"+
		"\7@\2\2\u0107B\3\2\2\2\u0108\u0109\7-\2\2\u0109\u010a\7?\2\2\u010aD\3"+
		"\2\2\2\u010b\u010c\7/\2\2\u010c\u010d\7?\2\2\u010dF\3\2\2\2\u010e\u010f"+
		"\7,\2\2\u010f\u0110\7?\2\2\u0110H\3\2\2\2\u0111\u0112\7\61\2\2\u0112\u0113"+
		"\7?\2\2\u0113J\3\2\2\2\u0114\u0115\7\'\2\2\u0115\u0116\7?\2\2\u0116L\3"+
		"\2\2\2\u0117\u0118\7?\2\2\u0118\u0119\7?\2\2\u0119N\3\2\2\2\u011a\u011b"+
		"\7#\2\2\u011b\u011c\7?\2\2\u011cP\3\2\2\2\u011d\u011e\7>\2\2\u011eR\3"+
		"\2\2\2\u011f\u0120\7>\2\2\u0120\u0121\7?\2\2\u0121T\3\2\2\2\u0122\u0123"+
		"\7@\2\2\u0123V\3\2\2\2\u0124\u0125\7@\2\2\u0125\u0126\7?\2\2\u0126X\3"+
		"\2\2\2\u0127\u0128\t\t\2\2\u0128Z\3\2\2\2\u0129\u012a\t\n\2\2\u012a\\"+
		"\3\2\2\2\u012b\u012d\5\u0089E\2\u012c\u012b\3\2\2\2\u012d\u012e\3\2\2"+
		"\2\u012e\u012c\3\2\2\2\u012e\u012f\3\2\2\2\u012f^\3\2\2\2\u0130\u0131"+
		"\7=\2\2\u0131`\3\2\2\2\u0132\u0133\7.\2\2\u0133b\3\2\2\2\u0134\u0135\7"+
		"<\2\2\u0135d\3\2\2\2\u0136\u0137\7A\2\2\u0137f\3\2\2\2\u0138\u0139\7\60"+
		"\2\2\u0139h\3\2\2\2\u013a\u013b\7x\2\2\u013b\u013c\7c\2\2\u013c\u013d"+
		"\7t\2\2\u013dj\3\2\2\2\u013e\u013f\7r\2\2\u013f\u0140\7c\2\2\u0140\u0141"+
		"\7w\2\2\u0141\u0142\7u\2\2\u0142\u0143\7g\2\2\u0143l\3\2\2\2\u0144\u0145"+
		"\7h\2\2\u0145\u0146\7w\2\2\u0146\u0147\7p\2\2\u0147\u0148\7e\2\2\u0148"+
		"\u0149\7v\2\2\u0149\u014a\7k\2\2\u014a\u014b\7q\2\2\u014b\u014c\7p\2\2"+
		"\u014cn\3\2\2\2\u014d\u014e\7t\2\2\u014e\u014f\7g\2\2\u014f\u0150\7v\2"+
		"\2\u0150\u0151\7w\2\2\u0151\u0152\7t\2\2\u0152\u0153\7p\2\2\u0153p\3\2"+
		"\2\2\u0154\u0155\7d\2\2\u0155\u0156\7t\2\2\u0156\u0157\7g\2\2\u0157\u0158"+
		"\7c\2\2\u0158\u0159\7m\2\2\u0159r\3\2\2\2\u015a\u015b\7{\2\2\u015b\u015c"+
		"\7k\2\2\u015c\u015d\7g\2\2\u015d\u015e\7n\2\2\u015e\u015f\7f\2\2\u015f"+
		"t\3\2\2\2\u0160\u0161\7v\2\2\u0161\u0162\7t\2\2\u0162\u0163\7w\2\2\u0163"+
		"\u0164\7g\2\2\u0164v\3\2\2\2\u0165\u0166\7h\2\2\u0166\u0167\7c\2\2\u0167"+
		"\u0168\7n\2\2\u0168\u0169\7u\2\2\u0169\u016a\7g\2\2\u016ax\3\2\2\2\u016b"+
		"\u016c\7k\2\2\u016c\u016d\7h\2\2\u016dz\3\2\2\2\u016e\u016f\7g\2\2\u016f"+
		"\u0170\7n\2\2\u0170\u0171\7u\2\2\u0171\u0172\7g\2\2\u0172|\3\2\2\2\u0173"+
		"\u0174\7v\2\2\u0174\u0175\7j\2\2\u0175\u0176\7k\2\2\u0176\u0177\7u\2\2"+
		"\u0177~\3\2\2\2\u0178\u0179\7p\2\2\u0179\u017a\7w\2\2\u017a\u017b\7n\2"+
		"\2\u017b\u017c\7n\2\2\u017c\u0080\3\2\2\2\u017d\u017e\7h\2\2\u017e\u017f"+
		"\7t\2\2\u017f\u0180\7c\2\2\u0180\u0181\7o\2\2\u0181\u0182\7g\2\2\u0182"+
		"\u0082\3\2\2\2\u0183\u0184\7y\2\2\u0184\u0185\7j\2\2\u0185\u0186\7k\2"+
		"\2\u0186\u0187\7n\2\2\u0187\u0188\7g\2\2\u0188\u0084\3\2\2\2\u0189\u018a"+
		"\7h\2\2\u018a\u018b\7q\2\2\u018b\u018c\7t\2\2\u018c\u0086\3\2\2\2\u018d"+
		"\u018e\7k\2\2\u018e\u018f\7p\2\2\u018f\u0088\3\2\2\2\u0190\u0191\4\62"+
		";\2\u0191\u008a\3\2\2\2\u0192\u0194\t\13\2\2\u0193\u0192\3\2\2\2\u0194"+
		"\u008c\3\2\2\2\u0195\u019b\5\u008bF\2\u0196\u019a\5\u008bF\2\u0197\u019a"+
		"\5\u0089E\2\u0198\u019a\7a\2\2\u0199\u0196\3\2\2\2\u0199\u0197\3\2\2\2"+
		"\u0199\u0198\3\2\2\2\u019a\u019d\3\2\2\2\u019b\u0199\3\2\2\2\u019b\u019c"+
		"\3\2\2\2\u019c\u008e\3\2\2\2\u019d\u019b\3\2\2\2\u019e\u01a0\t\f\2\2\u019f"+
		"\u019e\3\2\2\2\u01a0\u01a1\3\2\2\2\u01a1\u019f\3\2\2\2\u01a1\u01a2\3\2"+
		"\2\2\u01a2\u01a3\3\2\2\2\u01a3\u01a4\bH\3\2\u01a4\u0090\3\2\2\2\u01a5"+
		"\u01a6\7\61\2\2\u01a6\u01a7\7\61\2\2\u01a7\u01ab\3\2\2\2\u01a8\u01aa\n"+
		"\r\2\2\u01a9\u01a8\3\2\2\2\u01aa\u01ad\3\2\2\2\u01ab\u01a9\3\2\2\2\u01ab"+
		"\u01ac\3\2\2\2\u01ac\u01ae\3\2\2\2\u01ad\u01ab\3\2\2\2\u01ae\u01af\bI"+
		"\4\2\u01af\u0092\3\2\2\2\u01b0\u01b1\7\61\2\2\u01b1\u01b2\7,\2\2\u01b2"+
		"\u01b6\3\2\2\2\u01b3\u01b5\13\2\2\2\u01b4\u01b3\3\2\2\2\u01b5\u01b8\3"+
		"\2\2\2\u01b6\u01b7\3\2\2\2\u01b6\u01b4\3\2\2\2\u01b7\u01b9\3\2\2\2\u01b8"+
		"\u01b6\3\2\2\2\u01b9\u01ba\7,\2\2\u01ba\u01bb\7\61\2\2\u01bb\u01bc\3\2"+
		"\2\2\u01bc\u01bd\bJ\5\2\u01bd\u0094\3\2\2\2\23\2\u0099\u00a1\u00a5\u00ab"+
		"\u00b1\u00b7\u00bb\u00ce\u00d6\u012e\u0193\u0199\u019b\u01a1\u01ab\u01b6";
	public static final ATN _ATN =
		ATNSimulator.deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}