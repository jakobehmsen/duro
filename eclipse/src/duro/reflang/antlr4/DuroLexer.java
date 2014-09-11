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
		KW_IF=35, KW_ELSE=36, KW_THIS=37, KW_WHILE=38, KW_FOR=39, KW_IN=40, ID=41, 
		WS=42, SINGLELINE_COMMENT=43, MULTI_LINE_COMMENT=44;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] tokenNames = {
		"<INVALID>",
		"STRING_LITERAL", "LINE_TERMINATOR", "'&&'", "'||'", "'++'", "'--'", "BIN_OP1", 
		"BIN_OP2", "'#'", "'['", "']'", "'{'", "'}'", "'('", "')'", "'='", "'=='", 
		"'!='", "'!'", "'<'", "'<='", "'>'", "'>='", "INT", "';'", "','", "':'", 
		"'.'", "'var'", "'pause'", "'function'", "'return'", "'true'", "'false'", 
		"'if'", "'else'", "'this'", "'while'", "'for'", "'in'", "ID", "WS", "SINGLELINE_COMMENT", 
		"MULTI_LINE_COMMENT"
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
		"KW_RETURN", "KW_TRUE", "KW_FALSE", "KW_IF", "KW_ELSE", "KW_THIS", "KW_WHILE", 
		"KW_FOR", "KW_IN", "DIGIT", "LETTER", "ID", "WS", "SINGLELINE_COMMENT", 
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

		case 55: WS_action((RuleContext)_localctx, actionIndex); break;

		case 56: SINGLELINE_COMMENT_action((RuleContext)_localctx, actionIndex); break;

		case 57: MULTI_LINE_COMMENT_action((RuleContext)_localctx, actionIndex); break;
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
		"\3\uacf5\uee8c\u4f5d\u8b0d\u4a45\u78bd\u1b2f\u3378\2.\u016c\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\3\2\3\2\7\2"+
		"z\n\2\f\2\16\2}\13\2\3\2\3\2\3\2\7\2\u0082\n\2\f\2\16\2\u0085\13\2\3\2"+
		"\5\2\u0088\n\2\3\3\3\3\3\3\3\3\5\3\u008e\n\3\3\4\3\4\3\4\3\4\5\4\u0094"+
		"\n\4\3\5\3\5\3\5\3\5\5\5\u009a\n\5\3\6\3\6\5\6\u009e\n\6\3\7\3\7\3\7\3"+
		"\7\3\b\3\b\3\b\3\b\3\b\3\b\3\t\3\t\3\n\3\n\3\13\3\13\3\13\5\13\u00b1\n"+
		"\13\3\f\3\f\3\f\3\r\3\r\3\r\5\r\u00b9\n\r\3\16\3\16\3\17\3\17\3\17\3\17"+
		"\3\20\3\20\3\20\3\21\3\21\3\21\3\22\3\22\3\22\3\23\3\23\3\23\3\24\3\24"+
		"\3\25\3\25\3\26\3\26\3\27\3\27\3\30\3\30\3\31\3\31\3\32\3\32\3\33\3\33"+
		"\3\34\3\34\3\35\3\35\3\36\3\36\3\36\3\37\3\37\3\37\3 \3 \3!\3!\3\"\3\""+
		"\3\"\3#\3#\3$\3$\3$\3%\6%\u00f4\n%\r%\16%\u00f5\3&\3&\3\'\3\'\3(\3(\3"+
		")\3)\3*\3*\3*\3*\3+\3+\3+\3+\3+\3+\3,\3,\3,\3,\3,\3,\3,\3,\3,\3-\3-\3"+
		"-\3-\3-\3-\3-\3.\3.\3.\3.\3.\3/\3/\3/\3/\3/\3/\3\60\3\60\3\60\3\61\3\61"+
		"\3\61\3\61\3\61\3\62\3\62\3\62\3\62\3\62\3\63\3\63\3\63\3\63\3\63\3\63"+
		"\3\64\3\64\3\64\3\64\3\65\3\65\3\65\3\66\3\66\3\67\5\67\u0142\n\67\38"+
		"\38\38\38\78\u0148\n8\f8\168\u014b\138\39\69\u014e\n9\r9\169\u014f\39"+
		"\39\3:\3:\3:\3:\7:\u0158\n:\f:\16:\u015b\13:\3:\3:\3;\3;\3;\3;\7;\u0163"+
		"\n;\f;\16;\u0166\13;\3;\3;\3;\3;\3;\3\u0164<\3\3\1\5\2\1\7\2\1\t\2\1\13"+
		"\2\1\r\2\1\17\2\1\21\2\1\23\2\1\25\2\1\27\2\1\31\2\1\33\2\1\35\4\2\37"+
		"\5\1!\6\1#\7\1%\b\1\'\t\1)\n\1+\13\1-\f\1/\r\1\61\16\1\63\17\1\65\20\1"+
		"\67\21\19\22\1;\23\1=\24\1?\25\1A\26\1C\27\1E\30\1G\31\1I\32\1K\33\1M"+
		"\34\1O\35\1Q\36\1S\37\1U \1W!\1Y\"\1[#\1]$\1_%\1a&\1c\'\1e(\1g)\1i*\1"+
		"k\2\1m\2\1o+\1q,\3s-\4u.\5\3\2\16\6\2\f\f\17\17$$^^\6\2\f\f\17\17))^^"+
		"\13\2$$))^^ddhhppttvvxx\16\2\f\f\17\17$$))\62;^^ddhhppttvxzz\4\2wwzz\5"+
		"\2\62;CHch\5\2\f\f\17\17\u202a\u202b\4\2--//\4\2,,\61\61\4\2C\\c|\5\2"+
		"\13\f\16\17\"\"\4\2\f\f\17\17\u0172\2\3\3\2\2\2\2\35\3\2\2\2\2\37\3\2"+
		"\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2"+
		"\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3"+
		"\2\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3\2\2\2\2A\3\2\2\2\2C\3\2\2"+
		"\2\2E\3\2\2\2\2G\3\2\2\2\2I\3\2\2\2\2K\3\2\2\2\2M\3\2\2\2\2O\3\2\2\2\2"+
		"Q\3\2\2\2\2S\3\2\2\2\2U\3\2\2\2\2W\3\2\2\2\2Y\3\2\2\2\2[\3\2\2\2\2]\3"+
		"\2\2\2\2_\3\2\2\2\2a\3\2\2\2\2c\3\2\2\2\2e\3\2\2\2\2g\3\2\2\2\2i\3\2\2"+
		"\2\2o\3\2\2\2\2q\3\2\2\2\2s\3\2\2\2\2u\3\2\2\2\3\u0087\3\2\2\2\5\u008d"+
		"\3\2\2\2\7\u0093\3\2\2\2\t\u0099\3\2\2\2\13\u009d\3\2\2\2\r\u009f\3\2"+
		"\2\2\17\u00a3\3\2\2\2\21\u00a9\3\2\2\2\23\u00ab\3\2\2\2\25\u00b0\3\2\2"+
		"\2\27\u00b2\3\2\2\2\31\u00b8\3\2\2\2\33\u00ba\3\2\2\2\35\u00bc\3\2\2\2"+
		"\37\u00c0\3\2\2\2!\u00c3\3\2\2\2#\u00c6\3\2\2\2%\u00c9\3\2\2\2\'\u00cc"+
		"\3\2\2\2)\u00ce\3\2\2\2+\u00d0\3\2\2\2-\u00d2\3\2\2\2/\u00d4\3\2\2\2\61"+
		"\u00d6\3\2\2\2\63\u00d8\3\2\2\2\65\u00da\3\2\2\2\67\u00dc\3\2\2\29\u00de"+
		"\3\2\2\2;\u00e0\3\2\2\2=\u00e3\3\2\2\2?\u00e6\3\2\2\2A\u00e8\3\2\2\2C"+
		"\u00ea\3\2\2\2E\u00ed\3\2\2\2G\u00ef\3\2\2\2I\u00f3\3\2\2\2K\u00f7\3\2"+
		"\2\2M\u00f9\3\2\2\2O\u00fb\3\2\2\2Q\u00fd\3\2\2\2S\u00ff\3\2\2\2U\u0103"+
		"\3\2\2\2W\u0109\3\2\2\2Y\u0112\3\2\2\2[\u0119\3\2\2\2]\u011e\3\2\2\2_"+
		"\u0124\3\2\2\2a\u0127\3\2\2\2c\u012c\3\2\2\2e\u0131\3\2\2\2g\u0137\3\2"+
		"\2\2i\u013b\3\2\2\2k\u013e\3\2\2\2m\u0141\3\2\2\2o\u0143\3\2\2\2q\u014d"+
		"\3\2\2\2s\u0153\3\2\2\2u\u015e\3\2\2\2w{\7$\2\2xz\5\5\3\2yx\3\2\2\2z}"+
		"\3\2\2\2{y\3\2\2\2{|\3\2\2\2|~\3\2\2\2}{\3\2\2\2~\u0088\7$\2\2\177\u0083"+
		"\7)\2\2\u0080\u0082\5\7\4\2\u0081\u0080\3\2\2\2\u0082\u0085\3\2\2\2\u0083"+
		"\u0081\3\2\2\2\u0083\u0084\3\2\2\2\u0084\u0086\3\2\2\2\u0085\u0083\3\2"+
		"\2\2\u0086\u0088\7)\2\2\u0087w\3\2\2\2\u0087\177\3\2\2\2\u0088\4\3\2\2"+
		"\2\u0089\u008e\n\2\2\2\u008a\u008b\7^\2\2\u008b\u008e\5\t\5\2\u008c\u008e"+
		"\5\27\f\2\u008d\u0089\3\2\2\2\u008d\u008a\3\2\2\2\u008d\u008c\3\2\2\2"+
		"\u008e\6\3\2\2\2\u008f\u0094\n\3\2\2\u0090\u0091\7^\2\2\u0091\u0094\5"+
		"\t\5\2\u0092\u0094\5\27\f\2\u0093\u008f\3\2\2\2\u0093\u0090\3\2\2\2\u0093"+
		"\u0092\3\2\2\2\u0094\b\3\2\2\2\u0095\u009a\5\13\6\2\u0096\u009a\7\62\2"+
		"\2\u0097\u009a\5\r\7\2\u0098\u009a\5\17\b\2\u0099\u0095\3\2\2\2\u0099"+
		"\u0096\3\2\2\2\u0099\u0097\3\2\2\2\u0099\u0098\3\2\2\2\u009a\n\3\2\2\2"+
		"\u009b\u009e\5\21\t\2\u009c\u009e\5\23\n\2\u009d\u009b\3\2\2\2\u009d\u009c"+
		"\3\2\2\2\u009e\f\3\2\2\2\u009f\u00a0\7z\2\2\u00a0\u00a1\5\33\16\2\u00a1"+
		"\u00a2\5\33\16\2\u00a2\16\3\2\2\2\u00a3\u00a4\7w\2\2\u00a4\u00a5\5\33"+
		"\16\2\u00a5\u00a6\5\33\16\2\u00a6\u00a7\5\33\16\2\u00a7\u00a8\5\33\16"+
		"\2\u00a8\20\3\2\2\2\u00a9\u00aa\t\4\2\2\u00aa\22\3\2\2\2\u00ab\u00ac\n"+
		"\5\2\2\u00ac\24\3\2\2\2\u00ad\u00b1\5\21\t\2\u00ae\u00b1\5k\66\2\u00af"+
		"\u00b1\t\6\2\2\u00b0\u00ad\3\2\2\2\u00b0\u00ae\3\2\2\2\u00b0\u00af\3\2"+
		"\2\2\u00b1\26\3\2\2\2\u00b2\u00b3\7^\2\2\u00b3\u00b4\5\31\r\2\u00b4\30"+
		"\3\2\2\2\u00b5\u00b6\7\17\2\2\u00b6\u00b9\7\f\2\2\u00b7\u00b9\5\35\17"+
		"\2\u00b8\u00b5\3\2\2\2\u00b8\u00b7\3\2\2\2\u00b9\32\3\2\2\2\u00ba\u00bb"+
		"\t\7\2\2\u00bb\34\3\2\2\2\u00bc\u00bd\t\b\2\2\u00bd\u00be\3\2\2\2\u00be"+
		"\u00bf\b\17\2\2\u00bf\36\3\2\2\2\u00c0\u00c1\7(\2\2\u00c1\u00c2\7(\2\2"+
		"\u00c2 \3\2\2\2\u00c3\u00c4\7~\2\2\u00c4\u00c5\7~\2\2\u00c5\"\3\2\2\2"+
		"\u00c6\u00c7\7-\2\2\u00c7\u00c8\7-\2\2\u00c8$\3\2\2\2\u00c9\u00ca\7/\2"+
		"\2\u00ca\u00cb\7/\2\2\u00cb&\3\2\2\2\u00cc\u00cd\t\t\2\2\u00cd(\3\2\2"+
		"\2\u00ce\u00cf\t\n\2\2\u00cf*\3\2\2\2\u00d0\u00d1\7%\2\2\u00d1,\3\2\2"+
		"\2\u00d2\u00d3\7]\2\2\u00d3.\3\2\2\2\u00d4\u00d5\7_\2\2\u00d5\60\3\2\2"+
		"\2\u00d6\u00d7\7}\2\2\u00d7\62\3\2\2\2\u00d8\u00d9\7\177\2\2\u00d9\64"+
		"\3\2\2\2\u00da\u00db\7*\2\2\u00db\66\3\2\2\2\u00dc\u00dd\7+\2\2\u00dd"+
		"8\3\2\2\2\u00de\u00df\7?\2\2\u00df:\3\2\2\2\u00e0\u00e1\7?\2\2\u00e1\u00e2"+
		"\7?\2\2\u00e2<\3\2\2\2\u00e3\u00e4\7#\2\2\u00e4\u00e5\7?\2\2\u00e5>\3"+
		"\2\2\2\u00e6\u00e7\7#\2\2\u00e7@\3\2\2\2\u00e8\u00e9\7>\2\2\u00e9B\3\2"+
		"\2\2\u00ea\u00eb\7>\2\2\u00eb\u00ec\7?\2\2\u00ecD\3\2\2\2\u00ed\u00ee"+
		"\7@\2\2\u00eeF\3\2\2\2\u00ef\u00f0\7@\2\2\u00f0\u00f1\7?\2\2\u00f1H\3"+
		"\2\2\2\u00f2\u00f4\5k\66\2\u00f3\u00f2\3\2\2\2\u00f4\u00f5\3\2\2\2\u00f5"+
		"\u00f3\3\2\2\2\u00f5\u00f6\3\2\2\2\u00f6J\3\2\2\2\u00f7\u00f8\7=\2\2\u00f8"+
		"L\3\2\2\2\u00f9\u00fa\7.\2\2\u00faN\3\2\2\2\u00fb\u00fc\7<\2\2\u00fcP"+
		"\3\2\2\2\u00fd\u00fe\7\60\2\2\u00feR\3\2\2\2\u00ff\u0100\7x\2\2\u0100"+
		"\u0101\7c\2\2\u0101\u0102\7t\2\2\u0102T\3\2\2\2\u0103\u0104\7r\2\2\u0104"+
		"\u0105\7c\2\2\u0105\u0106\7w\2\2\u0106\u0107\7u\2\2\u0107\u0108\7g\2\2"+
		"\u0108V\3\2\2\2\u0109\u010a\7h\2\2\u010a\u010b\7w\2\2\u010b\u010c\7p\2"+
		"\2\u010c\u010d\7e\2\2\u010d\u010e\7v\2\2\u010e\u010f\7k\2\2\u010f\u0110"+
		"\7q\2\2\u0110\u0111\7p\2\2\u0111X\3\2\2\2\u0112\u0113\7t\2\2\u0113\u0114"+
		"\7g\2\2\u0114\u0115\7v\2\2\u0115\u0116\7w\2\2\u0116\u0117\7t\2\2\u0117"+
		"\u0118\7p\2\2\u0118Z\3\2\2\2\u0119\u011a\7v\2\2\u011a\u011b\7t\2\2\u011b"+
		"\u011c\7w\2\2\u011c\u011d\7g\2\2\u011d\\\3\2\2\2\u011e\u011f\7h\2\2\u011f"+
		"\u0120\7c\2\2\u0120\u0121\7n\2\2\u0121\u0122\7u\2\2\u0122\u0123\7g\2\2"+
		"\u0123^\3\2\2\2\u0124\u0125\7k\2\2\u0125\u0126\7h\2\2\u0126`\3\2\2\2\u0127"+
		"\u0128\7g\2\2\u0128\u0129\7n\2\2\u0129\u012a\7u\2\2\u012a\u012b\7g\2\2"+
		"\u012bb\3\2\2\2\u012c\u012d\7v\2\2\u012d\u012e\7j\2\2\u012e\u012f\7k\2"+
		"\2\u012f\u0130\7u\2\2\u0130d\3\2\2\2\u0131\u0132\7y\2\2\u0132\u0133\7"+
		"j\2\2\u0133\u0134\7k\2\2\u0134\u0135\7n\2\2\u0135\u0136\7g\2\2\u0136f"+
		"\3\2\2\2\u0137\u0138\7h\2\2\u0138\u0139\7q\2\2\u0139\u013a\7t\2\2\u013a"+
		"h\3\2\2\2\u013b\u013c\7k\2\2\u013c\u013d\7p\2\2\u013dj\3\2\2\2\u013e\u013f"+
		"\4\62;\2\u013fl\3\2\2\2\u0140\u0142\t\13\2\2\u0141\u0140\3\2\2\2\u0142"+
		"n\3\2\2\2\u0143\u0149\5m\67\2\u0144\u0148\5m\67\2\u0145\u0148\5k\66\2"+
		"\u0146\u0148\7a\2\2\u0147\u0144\3\2\2\2\u0147\u0145\3\2\2\2\u0147\u0146"+
		"\3\2\2\2\u0148\u014b\3\2\2\2\u0149\u0147\3\2\2\2\u0149\u014a\3\2\2\2\u014a"+
		"p\3\2\2\2\u014b\u0149\3\2\2\2\u014c\u014e\t\f\2\2\u014d\u014c\3\2\2\2"+
		"\u014e\u014f\3\2\2\2\u014f\u014d\3\2\2\2\u014f\u0150\3\2\2\2\u0150\u0151"+
		"\3\2\2\2\u0151\u0152\b9\3\2\u0152r\3\2\2\2\u0153\u0154\7\61\2\2\u0154"+
		"\u0155\7\61\2\2\u0155\u0159\3\2\2\2\u0156\u0158\n\r\2\2\u0157\u0156\3"+
		"\2\2\2\u0158\u015b\3\2\2\2\u0159\u0157\3\2\2\2\u0159\u015a\3\2\2\2\u015a"+
		"\u015c\3\2\2\2\u015b\u0159\3\2\2\2\u015c\u015d\b:\4\2\u015dt\3\2\2\2\u015e"+
		"\u015f\7\61\2\2\u015f\u0160\7,\2\2\u0160\u0164\3\2\2\2\u0161\u0163\13"+
		"\2\2\2\u0162\u0161\3\2\2\2\u0163\u0166\3\2\2\2\u0164\u0165\3\2\2\2\u0164"+
		"\u0162\3\2\2\2\u0165\u0167\3\2\2\2\u0166\u0164\3\2\2\2\u0167\u0168\7,"+
		"\2\2\u0168\u0169\7\61\2\2\u0169\u016a\3\2\2\2\u016a\u016b\b;\5\2\u016b"+
		"v\3\2\2\2\23\2{\u0083\u0087\u008d\u0093\u0099\u009d\u00b0\u00b8\u00f5"+
		"\u0141\u0147\u0149\u014f\u0159\u0164";
	public static final ATN _ATN =
		ATNSimulator.deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}