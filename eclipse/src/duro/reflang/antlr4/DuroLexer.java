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
		ASSIGN=18, PROTO_ASSIGN=19, ASSIGN_ADD=20, ASSIGN_SUB=21, ASSIGN_MULT=22, 
		ASSIGN_DIV=23, ASSIGN_REM=24, EQUALS=25, NOT_EQUALS=26, LESS_THAN=27, 
		LESS_THAN_OR_EQUALS=28, GREATER_THAN=29, GREATER_THAN_OR_EQUALS=30, BIN_OP1=31, 
		BIN_OP2=32, INT=33, SEMICOLON=34, COMMA=35, COLON=36, QUESTION_MARK=37, 
		DOT=38, KW_VAR=39, KW_PAUSE=40, KW_FUNCTION=41, KW_RETURN=42, KW_BREAK=43, 
		KW_YIELD=44, KW_TRUE=45, KW_FALSE=46, KW_IF=47, KW_ELSE=48, KW_THIS=49, 
		KW_NULL=50, KW_FRAME=51, KW_WHILE=52, KW_FOR=53, KW_IN=54, ID=55, WS=56, 
		SINGLELINE_COMMENT=57, MULTI_LINE_COMMENT=58;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] tokenNames = {
		"<INVALID>",
		"STRING_LITERAL", "LINE_TERMINATOR", "'§'", "'&&'", "'||'", "'!'", "'++'", 
		"'--'", "'|'", "'#'", "'$'", "'['", "']'", "'{'", "'}'", "'('", "')'", 
		"'='", "'^='", "'+='", "'-='", "'*='", "'/='", "'%='", "'=='", "'!='", 
		"'<'", "'<='", "'>'", "'>='", "BIN_OP1", "BIN_OP2", "INT", "';'", "','", 
		"':'", "'?'", "'.'", "'var'", "'pause'", "'function'", "'return'", "'break'", 
		"'yield'", "'true'", "'false'", "'if'", "'else'", "'this'", "'null'", 
		"'frame'", "'while'", "'for'", "'in'", "ID", "WS", "SINGLELINE_COMMENT", 
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
		"ASSIGN_ADD", "ASSIGN_SUB", "ASSIGN_MULT", "ASSIGN_DIV", "ASSIGN_REM", 
		"EQUALS", "NOT_EQUALS", "LESS_THAN", "LESS_THAN_OR_EQUALS", "GREATER_THAN", 
		"GREATER_THAN_OR_EQUALS", "BIN_OP1", "BIN_OP2", "INT", "SEMICOLON", "COMMA", 
		"COLON", "QUESTION_MARK", "DOT", "KW_VAR", "KW_PAUSE", "KW_FUNCTION", 
		"KW_RETURN", "KW_BREAK", "KW_YIELD", "KW_TRUE", "KW_FALSE", "KW_IF", "KW_ELSE", 
		"KW_THIS", "KW_NULL", "KW_FRAME", "KW_WHILE", "KW_FOR", "KW_IN", "DIGIT", 
		"LETTER", "ID", "WS", "SINGLELINE_COMMENT", "MULTI_LINE_COMMENT"
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

		case 69: WS_action((RuleContext)_localctx, actionIndex); break;

		case 70: SINGLELINE_COMMENT_action((RuleContext)_localctx, actionIndex); break;

		case 71: MULTI_LINE_COMMENT_action((RuleContext)_localctx, actionIndex); break;
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
		"\3\uacf5\uee8c\u4f5d\u8b0d\u4a45\u78bd\u1b2f\u3378\2<\u01b9\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\4<\t<\4=\t="+
		"\4>\t>\4?\t?\4@\t@\4A\tA\4B\tB\4C\tC\4D\tD\4E\tE\4F\tF\4G\tG\4H\tH\4I"+
		"\tI\3\2\3\2\7\2\u0096\n\2\f\2\16\2\u0099\13\2\3\2\3\2\3\2\7\2\u009e\n"+
		"\2\f\2\16\2\u00a1\13\2\3\2\5\2\u00a4\n\2\3\3\3\3\3\3\3\3\5\3\u00aa\n\3"+
		"\3\4\3\4\3\4\3\4\5\4\u00b0\n\4\3\5\3\5\3\5\3\5\5\5\u00b6\n\5\3\6\3\6\5"+
		"\6\u00ba\n\6\3\7\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3\b\3\t\3\t\3\n\3\n\3"+
		"\13\3\13\3\13\5\13\u00cd\n\13\3\f\3\f\3\f\3\r\3\r\3\r\5\r\u00d5\n\r\3"+
		"\16\3\16\3\17\3\17\3\17\3\17\3\20\3\20\3\21\3\21\3\21\3\22\3\22\3\22\3"+
		"\23\3\23\3\24\3\24\3\24\3\25\3\25\3\25\3\26\3\26\3\27\3\27\3\30\3\30\3"+
		"\31\3\31\3\32\3\32\3\33\3\33\3\34\3\34\3\35\3\35\3\36\3\36\3\37\3\37\3"+
		" \3 \3 \3!\3!\3!\3\"\3\"\3\"\3#\3#\3#\3$\3$\3$\3%\3%\3%\3&\3&\3&\3\'\3"+
		"\'\3\'\3(\3(\3)\3)\3)\3*\3*\3+\3+\3+\3,\3,\3-\3-\3.\6.\u0128\n.\r.\16"+
		".\u0129\3/\3/\3\60\3\60\3\61\3\61\3\62\3\62\3\63\3\63\3\64\3\64\3\64\3"+
		"\64\3\65\3\65\3\65\3\65\3\65\3\65\3\66\3\66\3\66\3\66\3\66\3\66\3\66\3"+
		"\66\3\66\3\67\3\67\3\67\3\67\3\67\3\67\3\67\38\38\38\38\38\38\39\39\3"+
		"9\39\39\39\3:\3:\3:\3:\3:\3;\3;\3;\3;\3;\3;\3<\3<\3<\3=\3=\3=\3=\3=\3"+
		">\3>\3>\3>\3>\3?\3?\3?\3?\3?\3@\3@\3@\3@\3@\3@\3A\3A\3A\3A\3A\3A\3B\3"+
		"B\3B\3B\3C\3C\3C\3D\3D\3E\5E\u018f\nE\3F\3F\3F\3F\7F\u0195\nF\fF\16F\u0198"+
		"\13F\3G\6G\u019b\nG\rG\16G\u019c\3G\3G\3H\3H\3H\3H\7H\u01a5\nH\fH\16H"+
		"\u01a8\13H\3H\3H\3I\3I\3I\3I\7I\u01b0\nI\fI\16I\u01b3\13I\3I\3I\3I\3I"+
		"\3I\3\u01b1J\3\3\1\5\2\1\7\2\1\t\2\1\13\2\1\r\2\1\17\2\1\21\2\1\23\2\1"+
		"\25\2\1\27\2\1\31\2\1\33\2\1\35\4\2\37\5\1!\6\1#\7\1%\b\1\'\t\1)\n\1+"+
		"\13\1-\f\1/\r\1\61\16\1\63\17\1\65\20\1\67\21\19\22\1;\23\1=\24\1?\25"+
		"\1A\26\1C\27\1E\30\1G\31\1I\32\1K\33\1M\34\1O\35\1Q\36\1S\37\1U \1W!\1"+
		"Y\"\1[#\1]$\1_%\1a&\1c\'\1e(\1g)\1i*\1k+\1m,\1o-\1q.\1s/\1u\60\1w\61\1"+
		"y\62\1{\63\1}\64\1\177\65\1\u0081\66\1\u0083\67\1\u00858\1\u0087\2\1\u0089"+
		"\2\1\u008b9\1\u008d:\3\u008f;\4\u0091<\5\3\2\16\6\2\f\f\17\17$$^^\6\2"+
		"\f\f\17\17))^^\13\2$$))^^ddhhppttvvxx\16\2\f\f\17\17$$))\62;^^ddhhppt"+
		"tvxzz\4\2wwzz\5\2\62;CHch\5\2\f\f\17\17\u202a\u202b\4\2--//\5\2\'\',,"+
		"\61\61\4\2C\\c|\5\2\13\f\16\17\"\"\4\2\f\f\17\17\u01bf\2\3\3\2\2\2\2\35"+
		"\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)"+
		"\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2"+
		"\65\3\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3\2\2\2\2"+
		"A\3\2\2\2\2C\3\2\2\2\2E\3\2\2\2\2G\3\2\2\2\2I\3\2\2\2\2K\3\2\2\2\2M\3"+
		"\2\2\2\2O\3\2\2\2\2Q\3\2\2\2\2S\3\2\2\2\2U\3\2\2\2\2W\3\2\2\2\2Y\3\2\2"+
		"\2\2[\3\2\2\2\2]\3\2\2\2\2_\3\2\2\2\2a\3\2\2\2\2c\3\2\2\2\2e\3\2\2\2\2"+
		"g\3\2\2\2\2i\3\2\2\2\2k\3\2\2\2\2m\3\2\2\2\2o\3\2\2\2\2q\3\2\2\2\2s\3"+
		"\2\2\2\2u\3\2\2\2\2w\3\2\2\2\2y\3\2\2\2\2{\3\2\2\2\2}\3\2\2\2\2\177\3"+
		"\2\2\2\2\u0081\3\2\2\2\2\u0083\3\2\2\2\2\u0085\3\2\2\2\2\u008b\3\2\2\2"+
		"\2\u008d\3\2\2\2\2\u008f\3\2\2\2\2\u0091\3\2\2\2\3\u00a3\3\2\2\2\5\u00a9"+
		"\3\2\2\2\7\u00af\3\2\2\2\t\u00b5\3\2\2\2\13\u00b9\3\2\2\2\r\u00bb\3\2"+
		"\2\2\17\u00bf\3\2\2\2\21\u00c5\3\2\2\2\23\u00c7\3\2\2\2\25\u00cc\3\2\2"+
		"\2\27\u00ce\3\2\2\2\31\u00d4\3\2\2\2\33\u00d6\3\2\2\2\35\u00d8\3\2\2\2"+
		"\37\u00dc\3\2\2\2!\u00de\3\2\2\2#\u00e1\3\2\2\2%\u00e4\3\2\2\2\'\u00e6"+
		"\3\2\2\2)\u00e9\3\2\2\2+\u00ec\3\2\2\2-\u00ee\3\2\2\2/\u00f0\3\2\2\2\61"+
		"\u00f2\3\2\2\2\63\u00f4\3\2\2\2\65\u00f6\3\2\2\2\67\u00f8\3\2\2\29\u00fa"+
		"\3\2\2\2;\u00fc\3\2\2\2=\u00fe\3\2\2\2?\u0100\3\2\2\2A\u0103\3\2\2\2C"+
		"\u0106\3\2\2\2E\u0109\3\2\2\2G\u010c\3\2\2\2I\u010f\3\2\2\2K\u0112\3\2"+
		"\2\2M\u0115\3\2\2\2O\u0118\3\2\2\2Q\u011a\3\2\2\2S\u011d\3\2\2\2U\u011f"+
		"\3\2\2\2W\u0122\3\2\2\2Y\u0124\3\2\2\2[\u0127\3\2\2\2]\u012b\3\2\2\2_"+
		"\u012d\3\2\2\2a\u012f\3\2\2\2c\u0131\3\2\2\2e\u0133\3\2\2\2g\u0135\3\2"+
		"\2\2i\u0139\3\2\2\2k\u013f\3\2\2\2m\u0148\3\2\2\2o\u014f\3\2\2\2q\u0155"+
		"\3\2\2\2s\u015b\3\2\2\2u\u0160\3\2\2\2w\u0166\3\2\2\2y\u0169\3\2\2\2{"+
		"\u016e\3\2\2\2}\u0173\3\2\2\2\177\u0178\3\2\2\2\u0081\u017e\3\2\2\2\u0083"+
		"\u0184\3\2\2\2\u0085\u0188\3\2\2\2\u0087\u018b\3\2\2\2\u0089\u018e\3\2"+
		"\2\2\u008b\u0190\3\2\2\2\u008d\u019a\3\2\2\2\u008f\u01a0\3\2\2\2\u0091"+
		"\u01ab\3\2\2\2\u0093\u0097\7$\2\2\u0094\u0096\5\5\3\2\u0095\u0094\3\2"+
		"\2\2\u0096\u0099\3\2\2\2\u0097\u0095\3\2\2\2\u0097\u0098\3\2\2\2\u0098"+
		"\u009a\3\2\2\2\u0099\u0097\3\2\2\2\u009a\u00a4\7$\2\2\u009b\u009f\7)\2"+
		"\2\u009c\u009e\5\7\4\2\u009d\u009c\3\2\2\2\u009e\u00a1\3\2\2\2\u009f\u009d"+
		"\3\2\2\2\u009f\u00a0\3\2\2\2\u00a0\u00a2\3\2\2\2\u00a1\u009f\3\2\2\2\u00a2"+
		"\u00a4\7)\2\2\u00a3\u0093\3\2\2\2\u00a3\u009b\3\2\2\2\u00a4\4\3\2\2\2"+
		"\u00a5\u00aa\n\2\2\2\u00a6\u00a7\7^\2\2\u00a7\u00aa\5\t\5\2\u00a8\u00aa"+
		"\5\27\f\2\u00a9\u00a5\3\2\2\2\u00a9\u00a6\3\2\2\2\u00a9\u00a8\3\2\2\2"+
		"\u00aa\6\3\2\2\2\u00ab\u00b0\n\3\2\2\u00ac\u00ad\7^\2\2\u00ad\u00b0\5"+
		"\t\5\2\u00ae\u00b0\5\27\f\2\u00af\u00ab\3\2\2\2\u00af\u00ac\3\2\2\2\u00af"+
		"\u00ae\3\2\2\2\u00b0\b\3\2\2\2\u00b1\u00b6\5\13\6\2\u00b2\u00b6\7\62\2"+
		"\2\u00b3\u00b6\5\r\7\2\u00b4\u00b6\5\17\b\2\u00b5\u00b1\3\2\2\2\u00b5"+
		"\u00b2\3\2\2\2\u00b5\u00b3\3\2\2\2\u00b5\u00b4\3\2\2\2\u00b6\n\3\2\2\2"+
		"\u00b7\u00ba\5\21\t\2\u00b8\u00ba\5\23\n\2\u00b9\u00b7\3\2\2\2\u00b9\u00b8"+
		"\3\2\2\2\u00ba\f\3\2\2\2\u00bb\u00bc\7z\2\2\u00bc\u00bd\5\33\16\2\u00bd"+
		"\u00be\5\33\16\2\u00be\16\3\2\2\2\u00bf\u00c0\7w\2\2\u00c0\u00c1\5\33"+
		"\16\2\u00c1\u00c2\5\33\16\2\u00c2\u00c3\5\33\16\2\u00c3\u00c4\5\33\16"+
		"\2\u00c4\20\3\2\2\2\u00c5\u00c6\t\4\2\2\u00c6\22\3\2\2\2\u00c7\u00c8\n"+
		"\5\2\2\u00c8\24\3\2\2\2\u00c9\u00cd\5\21\t\2\u00ca\u00cd\5\u0087D\2\u00cb"+
		"\u00cd\t\6\2\2\u00cc\u00c9\3\2\2\2\u00cc\u00ca\3\2\2\2\u00cc\u00cb\3\2"+
		"\2\2\u00cd\26\3\2\2\2\u00ce\u00cf\7^\2\2\u00cf\u00d0\5\31\r\2\u00d0\30"+
		"\3\2\2\2\u00d1\u00d2\7\17\2\2\u00d2\u00d5\7\f\2\2\u00d3\u00d5\5\35\17"+
		"\2\u00d4\u00d1\3\2\2\2\u00d4\u00d3\3\2\2\2\u00d5\32\3\2\2\2\u00d6\u00d7"+
		"\t\7\2\2\u00d7\34\3\2\2\2\u00d8\u00d9\t\b\2\2\u00d9\u00da\3\2\2\2\u00da"+
		"\u00db\b\17\2\2\u00db\36\3\2\2\2\u00dc\u00dd\7\u00a9\2\2\u00dd \3\2\2"+
		"\2\u00de\u00df\7(\2\2\u00df\u00e0\7(\2\2\u00e0\"\3\2\2\2\u00e1\u00e2\7"+
		"~\2\2\u00e2\u00e3\7~\2\2\u00e3$\3\2\2\2\u00e4\u00e5\7#\2\2\u00e5&\3\2"+
		"\2\2\u00e6\u00e7\7-\2\2\u00e7\u00e8\7-\2\2\u00e8(\3\2\2\2\u00e9\u00ea"+
		"\7/\2\2\u00ea\u00eb\7/\2\2\u00eb*\3\2\2\2\u00ec\u00ed\7~\2\2\u00ed,\3"+
		"\2\2\2\u00ee\u00ef\7%\2\2\u00ef.\3\2\2\2\u00f0\u00f1\7&\2\2\u00f1\60\3"+
		"\2\2\2\u00f2\u00f3\7]\2\2\u00f3\62\3\2\2\2\u00f4\u00f5\7_\2\2\u00f5\64"+
		"\3\2\2\2\u00f6\u00f7\7}\2\2\u00f7\66\3\2\2\2\u00f8\u00f9\7\177\2\2\u00f9"+
		"8\3\2\2\2\u00fa\u00fb\7*\2\2\u00fb:\3\2\2\2\u00fc\u00fd\7+\2\2\u00fd<"+
		"\3\2\2\2\u00fe\u00ff\7?\2\2\u00ff>\3\2\2\2\u0100\u0101\7`\2\2\u0101\u0102"+
		"\7?\2\2\u0102@\3\2\2\2\u0103\u0104\7-\2\2\u0104\u0105\7?\2\2\u0105B\3"+
		"\2\2\2\u0106\u0107\7/\2\2\u0107\u0108\7?\2\2\u0108D\3\2\2\2\u0109\u010a"+
		"\7,\2\2\u010a\u010b\7?\2\2\u010bF\3\2\2\2\u010c\u010d\7\61\2\2\u010d\u010e"+
		"\7?\2\2\u010eH\3\2\2\2\u010f\u0110\7\'\2\2\u0110\u0111\7?\2\2\u0111J\3"+
		"\2\2\2\u0112\u0113\7?\2\2\u0113\u0114\7?\2\2\u0114L\3\2\2\2\u0115\u0116"+
		"\7#\2\2\u0116\u0117\7?\2\2\u0117N\3\2\2\2\u0118\u0119\7>\2\2\u0119P\3"+
		"\2\2\2\u011a\u011b\7>\2\2\u011b\u011c\7?\2\2\u011cR\3\2\2\2\u011d\u011e"+
		"\7@\2\2\u011eT\3\2\2\2\u011f\u0120\7@\2\2\u0120\u0121\7?\2\2\u0121V\3"+
		"\2\2\2\u0122\u0123\t\t\2\2\u0123X\3\2\2\2\u0124\u0125\t\n\2\2\u0125Z\3"+
		"\2\2\2\u0126\u0128\5\u0087D\2\u0127\u0126\3\2\2\2\u0128\u0129\3\2\2\2"+
		"\u0129\u0127\3\2\2\2\u0129\u012a\3\2\2\2\u012a\\\3\2\2\2\u012b\u012c\7"+
		"=\2\2\u012c^\3\2\2\2\u012d\u012e\7.\2\2\u012e`\3\2\2\2\u012f\u0130\7<"+
		"\2\2\u0130b\3\2\2\2\u0131\u0132\7A\2\2\u0132d\3\2\2\2\u0133\u0134\7\60"+
		"\2\2\u0134f\3\2\2\2\u0135\u0136\7x\2\2\u0136\u0137\7c\2\2\u0137\u0138"+
		"\7t\2\2\u0138h\3\2\2\2\u0139\u013a\7r\2\2\u013a\u013b\7c\2\2\u013b\u013c"+
		"\7w\2\2\u013c\u013d\7u\2\2\u013d\u013e\7g\2\2\u013ej\3\2\2\2\u013f\u0140"+
		"\7h\2\2\u0140\u0141\7w\2\2\u0141\u0142\7p\2\2\u0142\u0143\7e\2\2\u0143"+
		"\u0144\7v\2\2\u0144\u0145\7k\2\2\u0145\u0146\7q\2\2\u0146\u0147\7p\2\2"+
		"\u0147l\3\2\2\2\u0148\u0149\7t\2\2\u0149\u014a\7g\2\2\u014a\u014b\7v\2"+
		"\2\u014b\u014c\7w\2\2\u014c\u014d\7t\2\2\u014d\u014e\7p\2\2\u014en\3\2"+
		"\2\2\u014f\u0150\7d\2\2\u0150\u0151\7t\2\2\u0151\u0152\7g\2\2\u0152\u0153"+
		"\7c\2\2\u0153\u0154\7m\2\2\u0154p\3\2\2\2\u0155\u0156\7{\2\2\u0156\u0157"+
		"\7k\2\2\u0157\u0158\7g\2\2\u0158\u0159\7n\2\2\u0159\u015a\7f\2\2\u015a"+
		"r\3\2\2\2\u015b\u015c\7v\2\2\u015c\u015d\7t\2\2\u015d\u015e\7w\2\2\u015e"+
		"\u015f\7g\2\2\u015ft\3\2\2\2\u0160\u0161\7h\2\2\u0161\u0162\7c\2\2\u0162"+
		"\u0163\7n\2\2\u0163\u0164\7u\2\2\u0164\u0165\7g\2\2\u0165v\3\2\2\2\u0166"+
		"\u0167\7k\2\2\u0167\u0168\7h\2\2\u0168x\3\2\2\2\u0169\u016a\7g\2\2\u016a"+
		"\u016b\7n\2\2\u016b\u016c\7u\2\2\u016c\u016d\7g\2\2\u016dz\3\2\2\2\u016e"+
		"\u016f\7v\2\2\u016f\u0170\7j\2\2\u0170\u0171\7k\2\2\u0171\u0172\7u\2\2"+
		"\u0172|\3\2\2\2\u0173\u0174\7p\2\2\u0174\u0175\7w\2\2\u0175\u0176\7n\2"+
		"\2\u0176\u0177\7n\2\2\u0177~\3\2\2\2\u0178\u0179\7h\2\2\u0179\u017a\7"+
		"t\2\2\u017a\u017b\7c\2\2\u017b\u017c\7o\2\2\u017c\u017d\7g\2\2\u017d\u0080"+
		"\3\2\2\2\u017e\u017f\7y\2\2\u017f\u0180\7j\2\2\u0180\u0181\7k\2\2\u0181"+
		"\u0182\7n\2\2\u0182\u0183\7g\2\2\u0183\u0082\3\2\2\2\u0184\u0185\7h\2"+
		"\2\u0185\u0186\7q\2\2\u0186\u0187\7t\2\2\u0187\u0084\3\2\2\2\u0188\u0189"+
		"\7k\2\2\u0189\u018a\7p\2\2\u018a\u0086\3\2\2\2\u018b\u018c\4\62;\2\u018c"+
		"\u0088\3\2\2\2\u018d\u018f\t\13\2\2\u018e\u018d\3\2\2\2\u018f\u008a\3"+
		"\2\2\2\u0190\u0196\5\u0089E\2\u0191\u0195\5\u0089E\2\u0192\u0195\5\u0087"+
		"D\2\u0193\u0195\7a\2\2\u0194\u0191\3\2\2\2\u0194\u0192\3\2\2\2\u0194\u0193"+
		"\3\2\2\2\u0195\u0198\3\2\2\2\u0196\u0194\3\2\2\2\u0196\u0197\3\2\2\2\u0197"+
		"\u008c\3\2\2\2\u0198\u0196\3\2\2\2\u0199\u019b\t\f\2\2\u019a\u0199\3\2"+
		"\2\2\u019b\u019c\3\2\2\2\u019c\u019a\3\2\2\2\u019c\u019d\3\2\2\2\u019d"+
		"\u019e\3\2\2\2\u019e\u019f\bG\3\2\u019f\u008e\3\2\2\2\u01a0\u01a1\7\61"+
		"\2\2\u01a1\u01a2\7\61\2\2\u01a2\u01a6\3\2\2\2\u01a3\u01a5\n\r\2\2\u01a4"+
		"\u01a3\3\2\2\2\u01a5\u01a8\3\2\2\2\u01a6\u01a4\3\2\2\2\u01a6\u01a7\3\2"+
		"\2\2\u01a7\u01a9\3\2\2\2\u01a8\u01a6\3\2\2\2\u01a9\u01aa\bH\4\2\u01aa"+
		"\u0090\3\2\2\2\u01ab\u01ac\7\61\2\2\u01ac\u01ad\7,\2\2\u01ad\u01b1\3\2"+
		"\2\2\u01ae\u01b0\13\2\2\2\u01af\u01ae\3\2\2\2\u01b0\u01b3\3\2\2\2\u01b1"+
		"\u01b2\3\2\2\2\u01b1\u01af\3\2\2\2\u01b2\u01b4\3\2\2\2\u01b3\u01b1\3\2"+
		"\2\2\u01b4\u01b5\7,\2\2\u01b5\u01b6\7\61\2\2\u01b6\u01b7\3\2\2\2\u01b7"+
		"\u01b8\bI\5\2\u01b8\u0092\3\2\2\2\23\2\u0097\u009f\u00a3\u00a9\u00af\u00b5"+
		"\u00b9\u00cc\u00d4\u0129\u018e\u0194\u0196\u019c\u01a6\u01b1";
	public static final ATN _ATN =
		ATNSimulator.deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}