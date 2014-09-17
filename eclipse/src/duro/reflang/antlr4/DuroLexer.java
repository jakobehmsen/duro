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
		ASSIGN_MULT=18, ASSIGN_DIV=19, ASSIGN_REM=20, EQUALS=21, NOT_EQUALS=22, 
		ASSIGN=23, NOT=24, LESS_THAN=25, LESS_THAN_OR_EQUALS=26, GREATER_THAN=27, 
		GREATER_THAN_OR_EQUALS=28, INT=29, SEMICOLON=30, COMMA=31, COLON=32, DOT=33, 
		KW_VAR=34, KW_PAUSE=35, KW_FUNCTION=36, KW_CLOSURE=37, KW_RETURN=38, KW_BREAK=39, 
		KW_YIELD=40, KW_TRUE=41, KW_FALSE=42, KW_IF=43, KW_ELSE=44, KW_THIS=45, 
		KW_NULL=46, KW_WHILE=47, KW_FOR=48, KW_IN=49, ID=50, WS=51, SINGLELINE_COMMENT=52, 
		MULTI_LINE_COMMENT=53;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] tokenNames = {
		"<INVALID>",
		"STRING_LITERAL", "LINE_TERMINATOR", "'&&'", "'||'", "'++'", "'--'", "BIN_OP1", 
		"BIN_OP2", "'#'", "'['", "']'", "'{'", "'}'", "'('", "')'", "'+='", "'-='", 
		"'*='", "'/='", "'%='", "'=='", "'!='", "'='", "'!'", "'<'", "'<='", "'>'", 
		"'>='", "INT", "';'", "','", "':'", "'.'", "'var'", "'pause'", "'function'", 
		"'closure'", "'return'", "'break'", "'yield'", "'true'", "'false'", "'if'", 
		"'else'", "'this'", "'null'", "'while'", "'for'", "'in'", "ID", "WS", 
		"SINGLELINE_COMMENT", "MULTI_LINE_COMMENT"
	};
	public static final String[] ruleNames = {
		"STRING_LITERAL", "DOUBLE_STRING_CHARACTER", "SINGLE_STRING_CHARACTER", 
		"ESCAPE_SEQUENCE", "CHARACTER_ESCAPE_SEQUENCE", "HEX_ESCAPE_SEQUENCE", 
		"UNICODE_ESCAPE_SEQUENCE", "SINGLE_ESCAPE_CHARACTER", "NON_ESCAPE_CHARACTER", 
		"ESCAPE_CHARACTER", "LINE_CONTINUATION", "LINE_TERMINATOR_SEQUENCE", "HEX_DIGIT", 
		"LINE_TERMINATOR", "DOUBLE_AMP", "DOUBLE_PIPE", "DOUBLE_PLUS", "DOUBLE_MINUS", 
		"BIN_OP1", "BIN_OP2", "HASH", "OPEN_SQ", "CLOSE_SQ", "OPEN_BRA", "CLOSE_BRA", 
		"OPEN_PAR", "CLOSE_PAR", "ASSIGN_ADD", "ASSIGN_SUB", "ASSIGN_MULT", "ASSIGN_DIV", 
		"ASSIGN_REM", "EQUALS", "NOT_EQUALS", "ASSIGN", "NOT", "LESS_THAN", "LESS_THAN_OR_EQUALS", 
		"GREATER_THAN", "GREATER_THAN_OR_EQUALS", "INT", "SEMICOLON", "COMMA", 
		"COLON", "DOT", "KW_VAR", "KW_PAUSE", "KW_FUNCTION", "KW_CLOSURE", "KW_RETURN", 
		"KW_BREAK", "KW_YIELD", "KW_TRUE", "KW_FALSE", "KW_IF", "KW_ELSE", "KW_THIS", 
		"KW_NULL", "KW_WHILE", "KW_FOR", "KW_IN", "DIGIT", "LETTER", "ID", "WS", 
		"SINGLELINE_COMMENT", "MULTI_LINE_COMMENT"
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

		case 64: WS_action((RuleContext)_localctx, actionIndex); break;

		case 65: SINGLELINE_COMMENT_action((RuleContext)_localctx, actionIndex); break;

		case 66: MULTI_LINE_COMMENT_action((RuleContext)_localctx, actionIndex); break;
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
		"\3\uacf5\uee8c\u4f5d\u8b0d\u4a45\u78bd\u1b2f\u3378\2\67\u01a6\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31"+
		"\t\31\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t"+
		" \4!\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t"+
		"+\4,\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64"+
		"\t\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\4<\t<\4=\t"+
		"=\4>\t>\4?\t?\4@\t@\4A\tA\4B\tB\4C\tC\4D\tD\3\2\3\2\7\2\u008c\n\2\f\2"+
		"\16\2\u008f\13\2\3\2\3\2\3\2\7\2\u0094\n\2\f\2\16\2\u0097\13\2\3\2\5\2"+
		"\u009a\n\2\3\3\3\3\3\3\3\3\5\3\u00a0\n\3\3\4\3\4\3\4\3\4\5\4\u00a6\n\4"+
		"\3\5\3\5\3\5\3\5\5\5\u00ac\n\5\3\6\3\6\5\6\u00b0\n\6\3\7\3\7\3\7\3\7\3"+
		"\b\3\b\3\b\3\b\3\b\3\b\3\t\3\t\3\n\3\n\3\13\3\13\3\13\5\13\u00c3\n\13"+
		"\3\f\3\f\3\f\3\r\3\r\3\r\5\r\u00cb\n\r\3\16\3\16\3\17\3\17\3\17\3\17\3"+
		"\20\3\20\3\20\3\21\3\21\3\21\3\22\3\22\3\22\3\23\3\23\3\23\3\24\3\24\3"+
		"\25\3\25\3\26\3\26\3\27\3\27\3\30\3\30\3\31\3\31\3\32\3\32\3\33\3\33\3"+
		"\34\3\34\3\35\3\35\3\35\3\36\3\36\3\36\3\37\3\37\3\37\3 \3 \3 \3!\3!\3"+
		"!\3\"\3\"\3\"\3#\3#\3#\3$\3$\3%\3%\3&\3&\3\'\3\'\3\'\3(\3(\3)\3)\3)\3"+
		"*\6*\u0115\n*\r*\16*\u0116\3+\3+\3,\3,\3-\3-\3.\3.\3/\3/\3/\3/\3\60\3"+
		"\60\3\60\3\60\3\60\3\60\3\61\3\61\3\61\3\61\3\61\3\61\3\61\3\61\3\61\3"+
		"\62\3\62\3\62\3\62\3\62\3\62\3\62\3\62\3\63\3\63\3\63\3\63\3\63\3\63\3"+
		"\63\3\64\3\64\3\64\3\64\3\64\3\64\3\65\3\65\3\65\3\65\3\65\3\65\3\66\3"+
		"\66\3\66\3\66\3\66\3\67\3\67\3\67\3\67\3\67\3\67\38\38\38\39\39\39\39"+
		"\39\3:\3:\3:\3:\3:\3;\3;\3;\3;\3;\3<\3<\3<\3<\3<\3<\3=\3=\3=\3=\3>\3>"+
		"\3>\3?\3?\3@\5@\u017c\n@\3A\3A\3A\3A\7A\u0182\nA\fA\16A\u0185\13A\3B\6"+
		"B\u0188\nB\rB\16B\u0189\3B\3B\3C\3C\3C\3C\7C\u0192\nC\fC\16C\u0195\13"+
		"C\3C\3C\3D\3D\3D\3D\7D\u019d\nD\fD\16D\u01a0\13D\3D\3D\3D\3D\3D\3\u019e"+
		"E\3\3\1\5\2\1\7\2\1\t\2\1\13\2\1\r\2\1\17\2\1\21\2\1\23\2\1\25\2\1\27"+
		"\2\1\31\2\1\33\2\1\35\4\2\37\5\1!\6\1#\7\1%\b\1\'\t\1)\n\1+\13\1-\f\1"+
		"/\r\1\61\16\1\63\17\1\65\20\1\67\21\19\22\1;\23\1=\24\1?\25\1A\26\1C\27"+
		"\1E\30\1G\31\1I\32\1K\33\1M\34\1O\35\1Q\36\1S\37\1U \1W!\1Y\"\1[#\1]$"+
		"\1_%\1a&\1c\'\1e(\1g)\1i*\1k+\1m,\1o-\1q.\1s/\1u\60\1w\61\1y\62\1{\63"+
		"\1}\2\1\177\2\1\u0081\64\1\u0083\65\3\u0085\66\4\u0087\67\5\3\2\16\6\2"+
		"\f\f\17\17$$^^\6\2\f\f\17\17))^^\13\2$$))^^ddhhppttvvxx\16\2\f\f\17\17"+
		"$$))\62;^^ddhhppttvxzz\4\2wwzz\5\2\62;CHch\5\2\f\f\17\17\u202a\u202b\4"+
		"\2--//\5\2\'\',,\61\61\4\2C\\c|\5\2\13\f\16\17\"\"\4\2\f\f\17\17\u01ac"+
		"\2\3\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2"+
		"\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2"+
		"\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3\2"+
		"\2\2\2?\3\2\2\2\2A\3\2\2\2\2C\3\2\2\2\2E\3\2\2\2\2G\3\2\2\2\2I\3\2\2\2"+
		"\2K\3\2\2\2\2M\3\2\2\2\2O\3\2\2\2\2Q\3\2\2\2\2S\3\2\2\2\2U\3\2\2\2\2W"+
		"\3\2\2\2\2Y\3\2\2\2\2[\3\2\2\2\2]\3\2\2\2\2_\3\2\2\2\2a\3\2\2\2\2c\3\2"+
		"\2\2\2e\3\2\2\2\2g\3\2\2\2\2i\3\2\2\2\2k\3\2\2\2\2m\3\2\2\2\2o\3\2\2\2"+
		"\2q\3\2\2\2\2s\3\2\2\2\2u\3\2\2\2\2w\3\2\2\2\2y\3\2\2\2\2{\3\2\2\2\2\u0081"+
		"\3\2\2\2\2\u0083\3\2\2\2\2\u0085\3\2\2\2\2\u0087\3\2\2\2\3\u0099\3\2\2"+
		"\2\5\u009f\3\2\2\2\7\u00a5\3\2\2\2\t\u00ab\3\2\2\2\13\u00af\3\2\2\2\r"+
		"\u00b1\3\2\2\2\17\u00b5\3\2\2\2\21\u00bb\3\2\2\2\23\u00bd\3\2\2\2\25\u00c2"+
		"\3\2\2\2\27\u00c4\3\2\2\2\31\u00ca\3\2\2\2\33\u00cc\3\2\2\2\35\u00ce\3"+
		"\2\2\2\37\u00d2\3\2\2\2!\u00d5\3\2\2\2#\u00d8\3\2\2\2%\u00db\3\2\2\2\'"+
		"\u00de\3\2\2\2)\u00e0\3\2\2\2+\u00e2\3\2\2\2-\u00e4\3\2\2\2/\u00e6\3\2"+
		"\2\2\61\u00e8\3\2\2\2\63\u00ea\3\2\2\2\65\u00ec\3\2\2\2\67\u00ee\3\2\2"+
		"\29\u00f0\3\2\2\2;\u00f3\3\2\2\2=\u00f6\3\2\2\2?\u00f9\3\2\2\2A\u00fc"+
		"\3\2\2\2C\u00ff\3\2\2\2E\u0102\3\2\2\2G\u0105\3\2\2\2I\u0107\3\2\2\2K"+
		"\u0109\3\2\2\2M\u010b\3\2\2\2O\u010e\3\2\2\2Q\u0110\3\2\2\2S\u0114\3\2"+
		"\2\2U\u0118\3\2\2\2W\u011a\3\2\2\2Y\u011c\3\2\2\2[\u011e\3\2\2\2]\u0120"+
		"\3\2\2\2_\u0124\3\2\2\2a\u012a\3\2\2\2c\u0133\3\2\2\2e\u013b\3\2\2\2g"+
		"\u0142\3\2\2\2i\u0148\3\2\2\2k\u014e\3\2\2\2m\u0153\3\2\2\2o\u0159\3\2"+
		"\2\2q\u015c\3\2\2\2s\u0161\3\2\2\2u\u0166\3\2\2\2w\u016b\3\2\2\2y\u0171"+
		"\3\2\2\2{\u0175\3\2\2\2}\u0178\3\2\2\2\177\u017b\3\2\2\2\u0081\u017d\3"+
		"\2\2\2\u0083\u0187\3\2\2\2\u0085\u018d\3\2\2\2\u0087\u0198\3\2\2\2\u0089"+
		"\u008d\7$\2\2\u008a\u008c\5\5\3\2\u008b\u008a\3\2\2\2\u008c\u008f\3\2"+
		"\2\2\u008d\u008b\3\2\2\2\u008d\u008e\3\2\2\2\u008e\u0090\3\2\2\2\u008f"+
		"\u008d\3\2\2\2\u0090\u009a\7$\2\2\u0091\u0095\7)\2\2\u0092\u0094\5\7\4"+
		"\2\u0093\u0092\3\2\2\2\u0094\u0097\3\2\2\2\u0095\u0093\3\2\2\2\u0095\u0096"+
		"\3\2\2\2\u0096\u0098\3\2\2\2\u0097\u0095\3\2\2\2\u0098\u009a\7)\2\2\u0099"+
		"\u0089\3\2\2\2\u0099\u0091\3\2\2\2\u009a\4\3\2\2\2\u009b\u00a0\n\2\2\2"+
		"\u009c\u009d\7^\2\2\u009d\u00a0\5\t\5\2\u009e\u00a0\5\27\f\2\u009f\u009b"+
		"\3\2\2\2\u009f\u009c\3\2\2\2\u009f\u009e\3\2\2\2\u00a0\6\3\2\2\2\u00a1"+
		"\u00a6\n\3\2\2\u00a2\u00a3\7^\2\2\u00a3\u00a6\5\t\5\2\u00a4\u00a6\5\27"+
		"\f\2\u00a5\u00a1\3\2\2\2\u00a5\u00a2\3\2\2\2\u00a5\u00a4\3\2\2\2\u00a6"+
		"\b\3\2\2\2\u00a7\u00ac\5\13\6\2\u00a8\u00ac\7\62\2\2\u00a9\u00ac\5\r\7"+
		"\2\u00aa\u00ac\5\17\b\2\u00ab\u00a7\3\2\2\2\u00ab\u00a8\3\2\2\2\u00ab"+
		"\u00a9\3\2\2\2\u00ab\u00aa\3\2\2\2\u00ac\n\3\2\2\2\u00ad\u00b0\5\21\t"+
		"\2\u00ae\u00b0\5\23\n\2\u00af\u00ad\3\2\2\2\u00af\u00ae\3\2\2\2\u00b0"+
		"\f\3\2\2\2\u00b1\u00b2\7z\2\2\u00b2\u00b3\5\33\16\2\u00b3\u00b4\5\33\16"+
		"\2\u00b4\16\3\2\2\2\u00b5\u00b6\7w\2\2\u00b6\u00b7\5\33\16\2\u00b7\u00b8"+
		"\5\33\16\2\u00b8\u00b9\5\33\16\2\u00b9\u00ba\5\33\16\2\u00ba\20\3\2\2"+
		"\2\u00bb\u00bc\t\4\2\2\u00bc\22\3\2\2\2\u00bd\u00be\n\5\2\2\u00be\24\3"+
		"\2\2\2\u00bf\u00c3\5\21\t\2\u00c0\u00c3\5}?\2\u00c1\u00c3\t\6\2\2\u00c2"+
		"\u00bf\3\2\2\2\u00c2\u00c0\3\2\2\2\u00c2\u00c1\3\2\2\2\u00c3\26\3\2\2"+
		"\2\u00c4\u00c5\7^\2\2\u00c5\u00c6\5\31\r\2\u00c6\30\3\2\2\2\u00c7\u00c8"+
		"\7\17\2\2\u00c8\u00cb\7\f\2\2\u00c9\u00cb\5\35\17\2\u00ca\u00c7\3\2\2"+
		"\2\u00ca\u00c9\3\2\2\2\u00cb\32\3\2\2\2\u00cc\u00cd\t\7\2\2\u00cd\34\3"+
		"\2\2\2\u00ce\u00cf\t\b\2\2\u00cf\u00d0\3\2\2\2\u00d0\u00d1\b\17\2\2\u00d1"+
		"\36\3\2\2\2\u00d2\u00d3\7(\2\2\u00d3\u00d4\7(\2\2\u00d4 \3\2\2\2\u00d5"+
		"\u00d6\7~\2\2\u00d6\u00d7\7~\2\2\u00d7\"\3\2\2\2\u00d8\u00d9\7-\2\2\u00d9"+
		"\u00da\7-\2\2\u00da$\3\2\2\2\u00db\u00dc\7/\2\2\u00dc\u00dd\7/\2\2\u00dd"+
		"&\3\2\2\2\u00de\u00df\t\t\2\2\u00df(\3\2\2\2\u00e0\u00e1\t\n\2\2\u00e1"+
		"*\3\2\2\2\u00e2\u00e3\7%\2\2\u00e3,\3\2\2\2\u00e4\u00e5\7]\2\2\u00e5."+
		"\3\2\2\2\u00e6\u00e7\7_\2\2\u00e7\60\3\2\2\2\u00e8\u00e9\7}\2\2\u00e9"+
		"\62\3\2\2\2\u00ea\u00eb\7\177\2\2\u00eb\64\3\2\2\2\u00ec\u00ed\7*\2\2"+
		"\u00ed\66\3\2\2\2\u00ee\u00ef\7+\2\2\u00ef8\3\2\2\2\u00f0\u00f1\7-\2\2"+
		"\u00f1\u00f2\7?\2\2\u00f2:\3\2\2\2\u00f3\u00f4\7/\2\2\u00f4\u00f5\7?\2"+
		"\2\u00f5<\3\2\2\2\u00f6\u00f7\7,\2\2\u00f7\u00f8\7?\2\2\u00f8>\3\2\2\2"+
		"\u00f9\u00fa\7\61\2\2\u00fa\u00fb\7?\2\2\u00fb@\3\2\2\2\u00fc\u00fd\7"+
		"\'\2\2\u00fd\u00fe\7?\2\2\u00feB\3\2\2\2\u00ff\u0100\7?\2\2\u0100\u0101"+
		"\7?\2\2\u0101D\3\2\2\2\u0102\u0103\7#\2\2\u0103\u0104\7?\2\2\u0104F\3"+
		"\2\2\2\u0105\u0106\7?\2\2\u0106H\3\2\2\2\u0107\u0108\7#\2\2\u0108J\3\2"+
		"\2\2\u0109\u010a\7>\2\2\u010aL\3\2\2\2\u010b\u010c\7>\2\2\u010c\u010d"+
		"\7?\2\2\u010dN\3\2\2\2\u010e\u010f\7@\2\2\u010fP\3\2\2\2\u0110\u0111\7"+
		"@\2\2\u0111\u0112\7?\2\2\u0112R\3\2\2\2\u0113\u0115\5}?\2\u0114\u0113"+
		"\3\2\2\2\u0115\u0116\3\2\2\2\u0116\u0114\3\2\2\2\u0116\u0117\3\2\2\2\u0117"+
		"T\3\2\2\2\u0118\u0119\7=\2\2\u0119V\3\2\2\2\u011a\u011b\7.\2\2\u011bX"+
		"\3\2\2\2\u011c\u011d\7<\2\2\u011dZ\3\2\2\2\u011e\u011f\7\60\2\2\u011f"+
		"\\\3\2\2\2\u0120\u0121\7x\2\2\u0121\u0122\7c\2\2\u0122\u0123\7t\2\2\u0123"+
		"^\3\2\2\2\u0124\u0125\7r\2\2\u0125\u0126\7c\2\2\u0126\u0127\7w\2\2\u0127"+
		"\u0128\7u\2\2\u0128\u0129\7g\2\2\u0129`\3\2\2\2\u012a\u012b\7h\2\2\u012b"+
		"\u012c\7w\2\2\u012c\u012d\7p\2\2\u012d\u012e\7e\2\2\u012e\u012f\7v\2\2"+
		"\u012f\u0130\7k\2\2\u0130\u0131\7q\2\2\u0131\u0132\7p\2\2\u0132b\3\2\2"+
		"\2\u0133\u0134\7e\2\2\u0134\u0135\7n\2\2\u0135\u0136\7q\2\2\u0136\u0137"+
		"\7u\2\2\u0137\u0138\7w\2\2\u0138\u0139\7t\2\2\u0139\u013a\7g\2\2\u013a"+
		"d\3\2\2\2\u013b\u013c\7t\2\2\u013c\u013d\7g\2\2\u013d\u013e\7v\2\2\u013e"+
		"\u013f\7w\2\2\u013f\u0140\7t\2\2\u0140\u0141\7p\2\2\u0141f\3\2\2\2\u0142"+
		"\u0143\7d\2\2\u0143\u0144\7t\2\2\u0144\u0145\7g\2\2\u0145\u0146\7c\2\2"+
		"\u0146\u0147\7m\2\2\u0147h\3\2\2\2\u0148\u0149\7{\2\2\u0149\u014a\7k\2"+
		"\2\u014a\u014b\7g\2\2\u014b\u014c\7n\2\2\u014c\u014d\7f\2\2\u014dj\3\2"+
		"\2\2\u014e\u014f\7v\2\2\u014f\u0150\7t\2\2\u0150\u0151\7w\2\2\u0151\u0152"+
		"\7g\2\2\u0152l\3\2\2\2\u0153\u0154\7h\2\2\u0154\u0155\7c\2\2\u0155\u0156"+
		"\7n\2\2\u0156\u0157\7u\2\2\u0157\u0158\7g\2\2\u0158n\3\2\2\2\u0159\u015a"+
		"\7k\2\2\u015a\u015b\7h\2\2\u015bp\3\2\2\2\u015c\u015d\7g\2\2\u015d\u015e"+
		"\7n\2\2\u015e\u015f\7u\2\2\u015f\u0160\7g\2\2\u0160r\3\2\2\2\u0161\u0162"+
		"\7v\2\2\u0162\u0163\7j\2\2\u0163\u0164\7k\2\2\u0164\u0165\7u\2\2\u0165"+
		"t\3\2\2\2\u0166\u0167\7p\2\2\u0167\u0168\7w\2\2\u0168\u0169\7n\2\2\u0169"+
		"\u016a\7n\2\2\u016av\3\2\2\2\u016b\u016c\7y\2\2\u016c\u016d\7j\2\2\u016d"+
		"\u016e\7k\2\2\u016e\u016f\7n\2\2\u016f\u0170\7g\2\2\u0170x\3\2\2\2\u0171"+
		"\u0172\7h\2\2\u0172\u0173\7q\2\2\u0173\u0174\7t\2\2\u0174z\3\2\2\2\u0175"+
		"\u0176\7k\2\2\u0176\u0177\7p\2\2\u0177|\3\2\2\2\u0178\u0179\4\62;\2\u0179"+
		"~\3\2\2\2\u017a\u017c\t\13\2\2\u017b\u017a\3\2\2\2\u017c\u0080\3\2\2\2"+
		"\u017d\u0183\5\177@\2\u017e\u0182\5\177@\2\u017f\u0182\5}?\2\u0180\u0182"+
		"\7a\2\2\u0181\u017e\3\2\2\2\u0181\u017f\3\2\2\2\u0181\u0180\3\2\2\2\u0182"+
		"\u0185\3\2\2\2\u0183\u0181\3\2\2\2\u0183\u0184\3\2\2\2\u0184\u0082\3\2"+
		"\2\2\u0185\u0183\3\2\2\2\u0186\u0188\t\f\2\2\u0187\u0186\3\2\2\2\u0188"+
		"\u0189\3\2\2\2\u0189\u0187\3\2\2\2\u0189\u018a\3\2\2\2\u018a\u018b\3\2"+
		"\2\2\u018b\u018c\bB\3\2\u018c\u0084\3\2\2\2\u018d\u018e\7\61\2\2\u018e"+
		"\u018f\7\61\2\2\u018f\u0193\3\2\2\2\u0190\u0192\n\r\2\2\u0191\u0190\3"+
		"\2\2\2\u0192\u0195\3\2\2\2\u0193\u0191\3\2\2\2\u0193\u0194\3\2\2\2\u0194"+
		"\u0196\3\2\2\2\u0195\u0193\3\2\2\2\u0196\u0197\bC\4\2\u0197\u0086\3\2"+
		"\2\2\u0198\u0199\7\61\2\2\u0199\u019a\7,\2\2\u019a\u019e\3\2\2\2\u019b"+
		"\u019d\13\2\2\2\u019c\u019b\3\2\2\2\u019d\u01a0\3\2\2\2\u019e\u019f\3"+
		"\2\2\2\u019e\u019c\3\2\2\2\u019f\u01a1\3\2\2\2\u01a0\u019e\3\2\2\2\u01a1"+
		"\u01a2\7,\2\2\u01a2\u01a3\7\61\2\2\u01a3\u01a4\3\2\2\2\u01a4\u01a5\bD"+
		"\5\2\u01a5\u0088\3\2\2\2\23\2\u008d\u0095\u0099\u009f\u00a5\u00ab\u00af"+
		"\u00c2\u00ca\u0116\u017b\u0181\u0183\u0189\u0193\u019e";
	public static final ATN _ATN =
		ATNSimulator.deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}