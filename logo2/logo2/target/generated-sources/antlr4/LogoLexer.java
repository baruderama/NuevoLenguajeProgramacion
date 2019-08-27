// Generated from Logo.g4 by ANTLR 4.4
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class LogoLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.4", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		VAR=1, READ=2, PRINTLN=3, AND=4, OR=5, NEG=6, MINUS=7, PLUS=8, MULT=9, 
		DIV=10, COMMA=11, DPOINT=12, GT=13, LT=14, GEQT=15, LEQT=16, EQ=17, DIF=18, 
		ASSIGN=19, OPEN_PARENT=20, CLOSE_PARENT=21, WHILE=22, DO=23, IF=24, THEN=25, 
		END_IF=26, ELSE=27, END_ELSE=28, DEF=29, END_DEF=30, MOVE_FORW=31, MOVE_BACK=32, 
		ROT_L=33, ROT_R=34, SET_COLOR=35, NUM=36, ID=37, BOOL=38, STRING=39, WS=40;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] tokenNames = {
		"'\\u0000'", "'\\u0001'", "'\\u0002'", "'\\u0003'", "'\\u0004'", "'\\u0005'", 
		"'\\u0006'", "'\\u0007'", "'\b'", "'\t'", "'\n'", "'\\u000B'", "'\f'", 
		"'\r'", "'\\u000E'", "'\\u000F'", "'\\u0010'", "'\\u0011'", "'\\u0012'", 
		"'\\u0013'", "'\\u0014'", "'\\u0015'", "'\\u0016'", "'\\u0017'", "'\\u0018'", 
		"'\\u0019'", "'\\u001A'", "'\\u001B'", "'\\u001C'", "'\\u001D'", "'\\u001E'", 
		"'\\u001F'", "' '", "'!'", "'\"'", "'#'", "'$'", "'%'", "'&'", "'''", 
		"'('"
	};
	public static final String[] ruleNames = {
		"VAR", "READ", "PRINTLN", "AND", "OR", "NEG", "MINUS", "PLUS", "MULT", 
		"DIV", "COMMA", "DPOINT", "GT", "LT", "GEQT", "LEQT", "EQ", "DIF", "ASSIGN", 
		"OPEN_PARENT", "CLOSE_PARENT", "WHILE", "DO", "IF", "THEN", "END_IF", 
		"ELSE", "END_ELSE", "DEF", "END_DEF", "MOVE_FORW", "MOVE_BACK", "ROT_L", 
		"ROT_R", "SET_COLOR", "NUM", "ID", "BOOL", "STRING", "WS"
	};


	public LogoLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "Logo.g4"; }

	@Override
	public String[] getTokenNames() { return tokenNames; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\2*\u0115\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\3\2\3\2\3\2\3"+
		"\2\3\3\3\3\3\3\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3\6"+
		"\3\6\3\6\3\7\3\7\3\b\3\b\3\t\3\t\3\n\3\n\3\13\3\13\3\f\3\f\3\r\3\r\3\16"+
		"\3\16\3\17\3\17\3\20\3\20\3\20\3\21\3\21\3\21\3\22\3\22\3\22\3\23\3\23"+
		"\3\23\3\24\3\24\3\25\3\25\3\26\3\26\3\27\3\27\3\27\3\27\3\27\3\27\3\30"+
		"\3\30\3\30\3\31\3\31\3\31\3\32\3\32\3\32\3\32\3\32\3\33\3\33\3\33\3\33"+
		"\3\33\3\33\3\33\3\34\3\34\3\34\3\34\3\34\3\35\3\35\3\35\3\35\3\35\3\35"+
		"\3\35\3\35\3\35\3\36\3\36\3\36\3\36\3\37\3\37\3\37\3\37\3\37\3\37\3\37"+
		"\3\37\3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3!\3!\3!\3!\3!\3!\3!\3!\3!\3!\3\""+
		"\3\"\3\"\3\"\3\"\3\"\3#\3#\3#\3#\3#\3#\3$\3$\3$\3$\3$\3$\3$\3$\3$\3$\3"+
		"%\6%\u00ec\n%\r%\16%\u00ed\3%\3%\7%\u00f2\n%\f%\16%\u00f5\13%\5%\u00f7"+
		"\n%\3&\3&\7&\u00fb\n&\f&\16&\u00fe\13&\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'"+
		"\3\'\5\'\u0109\n\'\3(\3(\3(\3(\3)\6)\u0110\n)\r)\16)\u0111\3)\3)\2\2*"+
		"\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20"+
		"\37\21!\22#\23%\24\'\25)\26+\27-\30/\31\61\32\63\33\65\34\67\359\36;\37"+
		"= ?!A\"C#E$G%I&K\'M(O)Q*\3\2\6\3\2\62;\5\2C\\aac|\6\2\62;C\\aac|\5\2\13"+
		"\f\17\17\"\"\u011a\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13"+
		"\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2"+
		"\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2"+
		"!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3"+
		"\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2"+
		"\29\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3\2\2\2\2A\3\2\2\2\2C\3\2\2\2\2E"+
		"\3\2\2\2\2G\3\2\2\2\2I\3\2\2\2\2K\3\2\2\2\2M\3\2\2\2\2O\3\2\2\2\2Q\3\2"+
		"\2\2\3S\3\2\2\2\5W\3\2\2\2\7\\\3\2\2\2\td\3\2\2\2\13g\3\2\2\2\rj\3\2\2"+
		"\2\17l\3\2\2\2\21n\3\2\2\2\23p\3\2\2\2\25r\3\2\2\2\27t\3\2\2\2\31v\3\2"+
		"\2\2\33x\3\2\2\2\35z\3\2\2\2\37|\3\2\2\2!\177\3\2\2\2#\u0082\3\2\2\2%"+
		"\u0085\3\2\2\2\'\u0088\3\2\2\2)\u008a\3\2\2\2+\u008c\3\2\2\2-\u008e\3"+
		"\2\2\2/\u0094\3\2\2\2\61\u0097\3\2\2\2\63\u009a\3\2\2\2\65\u009f\3\2\2"+
		"\2\67\u00a6\3\2\2\29\u00ab\3\2\2\2;\u00b4\3\2\2\2=\u00b8\3\2\2\2?\u00c0"+
		"\3\2\2\2A\u00ca\3\2\2\2C\u00d4\3\2\2\2E\u00da\3\2\2\2G\u00e0\3\2\2\2I"+
		"\u00eb\3\2\2\2K\u00f8\3\2\2\2M\u0108\3\2\2\2O\u010a\3\2\2\2Q\u010f\3\2"+
		"\2\2ST\7n\2\2TU\7g\2\2UV\7v\2\2V\4\3\2\2\2WX\7t\2\2XY\7g\2\2YZ\7c\2\2"+
		"Z[\7f\2\2[\6\3\2\2\2\\]\7r\2\2]^\7t\2\2^_\7k\2\2_`\7p\2\2`a\7v\2\2ab\7"+
		"n\2\2bc\7p\2\2c\b\3\2\2\2de\7(\2\2ef\7(\2\2f\n\3\2\2\2gh\7~\2\2hi\7~\2"+
		"\2i\f\3\2\2\2jk\7#\2\2k\16\3\2\2\2lm\7/\2\2m\20\3\2\2\2no\7-\2\2o\22\3"+
		"\2\2\2pq\7,\2\2q\24\3\2\2\2rs\7\61\2\2s\26\3\2\2\2tu\7.\2\2u\30\3\2\2"+
		"\2vw\7<\2\2w\32\3\2\2\2xy\7@\2\2y\34\3\2\2\2z{\7>\2\2{\36\3\2\2\2|}\7"+
		"@\2\2}~\7?\2\2~ \3\2\2\2\177\u0080\7>\2\2\u0080\u0081\7?\2\2\u0081\"\3"+
		"\2\2\2\u0082\u0083\7?\2\2\u0083\u0084\7?\2\2\u0084$\3\2\2\2\u0085\u0086"+
		"\7>\2\2\u0086\u0087\7@\2\2\u0087&\3\2\2\2\u0088\u0089\7?\2\2\u0089(\3"+
		"\2\2\2\u008a\u008b\7*\2\2\u008b*\3\2\2\2\u008c\u008d\7+\2\2\u008d,\3\2"+
		"\2\2\u008e\u008f\7y\2\2\u008f\u0090\7j\2\2\u0090\u0091\7k\2\2\u0091\u0092"+
		"\7n\2\2\u0092\u0093\7g\2\2\u0093.\3\2\2\2\u0094\u0095\7f\2\2\u0095\u0096"+
		"\7q\2\2\u0096\60\3\2\2\2\u0097\u0098\7k\2\2\u0098\u0099\7h\2\2\u0099\62"+
		"\3\2\2\2\u009a\u009b\7v\2\2\u009b\u009c\7j\2\2\u009c\u009d\7g\2\2\u009d"+
		"\u009e\7p\2\2\u009e\64\3\2\2\2\u009f\u00a0\7g\2\2\u00a0\u00a1\7p\2\2\u00a1"+
		"\u00a2\7f\2\2\u00a2\u00a3\7a\2\2\u00a3\u00a4\7k\2\2\u00a4\u00a5\7h\2\2"+
		"\u00a5\66\3\2\2\2\u00a6\u00a7\7g\2\2\u00a7\u00a8\7n\2\2\u00a8\u00a9\7"+
		"u\2\2\u00a9\u00aa\7g\2\2\u00aa8\3\2\2\2\u00ab\u00ac\7g\2\2\u00ac\u00ad"+
		"\7p\2\2\u00ad\u00ae\7f\2\2\u00ae\u00af\7a\2\2\u00af\u00b0\7g\2\2\u00b0"+
		"\u00b1\7n\2\2\u00b1\u00b2\7u\2\2\u00b2\u00b3\7g\2\2\u00b3:\3\2\2\2\u00b4"+
		"\u00b5\7f\2\2\u00b5\u00b6\7g\2\2\u00b6\u00b7\7h\2\2\u00b7<\3\2\2\2\u00b8"+
		"\u00b9\7g\2\2\u00b9\u00ba\7p\2\2\u00ba\u00bb\7f\2\2\u00bb\u00bc\7a\2\2"+
		"\u00bc\u00bd\7f\2\2\u00bd\u00be\7g\2\2\u00be\u00bf\7h\2\2\u00bf>\3\2\2"+
		"\2\u00c0\u00c1\7o\2\2\u00c1\u00c2\7q\2\2\u00c2\u00c3\7x\2\2\u00c3\u00c4"+
		"\7g\2\2\u00c4\u00c5\7a\2\2\u00c5\u00c6\7h\2\2\u00c6\u00c7\7q\2\2\u00c7"+
		"\u00c8\7t\2\2\u00c8\u00c9\7y\2\2\u00c9@\3\2\2\2\u00ca\u00cb\7o\2\2\u00cb"+
		"\u00cc\7q\2\2\u00cc\u00cd\7x\2\2\u00cd\u00ce\7g\2\2\u00ce\u00cf\7a\2\2"+
		"\u00cf\u00d0\7d\2\2\u00d0\u00d1\7c\2\2\u00d1\u00d2\7e\2\2\u00d2\u00d3"+
		"\7m\2\2\u00d3B\3\2\2\2\u00d4\u00d5\7t\2\2\u00d5\u00d6\7q\2\2\u00d6\u00d7"+
		"\7v\2\2\u00d7\u00d8\7a\2\2\u00d8\u00d9\7n\2\2\u00d9D\3\2\2\2\u00da\u00db"+
		"\7t\2\2\u00db\u00dc\7q\2\2\u00dc\u00dd\7v\2\2\u00dd\u00de\7a\2\2\u00de"+
		"\u00df\7t\2\2\u00dfF\3\2\2\2\u00e0\u00e1\7u\2\2\u00e1\u00e2\7g\2\2\u00e2"+
		"\u00e3\7v\2\2\u00e3\u00e4\7a\2\2\u00e4\u00e5\7e\2\2\u00e5\u00e6\7q\2\2"+
		"\u00e6\u00e7\7n\2\2\u00e7\u00e8\7q\2\2\u00e8\u00e9\7t\2\2\u00e9H\3\2\2"+
		"\2\u00ea\u00ec\t\2\2\2\u00eb\u00ea\3\2\2\2\u00ec\u00ed\3\2\2\2\u00ed\u00eb"+
		"\3\2\2\2\u00ed\u00ee\3\2\2\2\u00ee\u00f6\3\2\2\2\u00ef\u00f3\7\60\2\2"+
		"\u00f0\u00f2\t\2\2\2\u00f1\u00f0\3\2\2\2\u00f2\u00f5\3\2\2\2\u00f3\u00f1"+
		"\3\2\2\2\u00f3\u00f4\3\2\2\2\u00f4\u00f7\3\2\2\2\u00f5\u00f3\3\2\2\2\u00f6"+
		"\u00ef\3\2\2\2\u00f6\u00f7\3\2\2\2\u00f7J\3\2\2\2\u00f8\u00fc\t\3\2\2"+
		"\u00f9\u00fb\t\4\2\2\u00fa\u00f9\3\2\2\2\u00fb\u00fe\3\2\2\2\u00fc\u00fa"+
		"\3\2\2\2\u00fc\u00fd\3\2\2\2\u00fdL\3\2\2\2\u00fe\u00fc\3\2\2\2\u00ff"+
		"\u0100\7v\2\2\u0100\u0101\7t\2\2\u0101\u0102\7w\2\2\u0102\u0109\7g\2\2"+
		"\u0103\u0104\7h\2\2\u0104\u0105\7c\2\2\u0105\u0106\7n\2\2\u0106\u0107"+
		"\7u\2\2\u0107\u0109\7g\2\2\u0108\u00ff\3\2\2\2\u0108\u0103\3\2\2\2\u0109"+
		"N\3\2\2\2\u010a\u010b\7$\2\2\u010b\u010c\3\2\2\2\u010c\u010d\b(\2\2\u010d"+
		"P\3\2\2\2\u010e\u0110\t\5\2\2\u010f\u010e\3\2\2\2\u0110\u0111\3\2\2\2"+
		"\u0111\u010f\3\2\2\2\u0111\u0112\3\2\2\2\u0112\u0113\3\2\2\2\u0113\u0114"+
		"\b)\3\2\u0114R\3\2\2\2\t\2\u00ed\u00f3\u00f6\u00fc\u0108\u0111\4\4\2\2"+
		"\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}