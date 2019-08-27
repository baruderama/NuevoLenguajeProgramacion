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
		T__1=1, T__0=2, VAR=3, READ=4, PRINTLN=5, AND=6, OR=7, NEG=8, MINUS=9, 
		PLUS=10, MULT=11, DIV=12, COMMA=13, DPOINT=14, GT=15, LT=16, GEQT=17, 
		LEQT=18, EQ=19, DIF=20, ASSIGN=21, OPEN_PARENT=22, CLOSE_PARENT=23, WHILE=24, 
		DO=25, IF=26, THEN=27, END_IF=28, ELSE=29, END_ELSE=30, DEF=31, END_DEF=32, 
		NUM=33, ID=34, BOOL=35, STRING=36, WS=37;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] tokenNames = {
		"'\\u0000'", "'\\u0001'", "'\\u0002'", "'\\u0003'", "'\\u0004'", "'\\u0005'", 
		"'\\u0006'", "'\\u0007'", "'\b'", "'\t'", "'\n'", "'\\u000B'", "'\f'", 
		"'\r'", "'\\u000E'", "'\\u000F'", "'\\u0010'", "'\\u0011'", "'\\u0012'", 
		"'\\u0013'", "'\\u0014'", "'\\u0015'", "'\\u0016'", "'\\u0017'", "'\\u0018'", 
		"'\\u0019'", "'\\u001A'", "'\\u001B'", "'\\u001C'", "'\\u001D'", "'\\u001E'", 
		"'\\u001F'", "' '", "'!'", "'\"'", "'#'", "'$'", "'%'"
	};
	public static final String[] ruleNames = {
		"T__1", "T__0", "VAR", "READ", "PRINTLN", "AND", "OR", "NEG", "MINUS", 
		"PLUS", "MULT", "DIV", "COMMA", "DPOINT", "GT", "LT", "GEQT", "LEQT", 
		"EQ", "DIF", "ASSIGN", "OPEN_PARENT", "CLOSE_PARENT", "WHILE", "DO", "IF", 
		"THEN", "END_IF", "ELSE", "END_ELSE", "DEF", "END_DEF", "NUM", "ID", "BOOL", 
		"STRING", "WS"
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
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\2\'\u00f1\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\3\2\3\2\3\2\3\2\3\2\3\2\3\3\3\3\3"+
		"\3\3\3\3\3\3\3\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3\6"+
		"\3\6\3\6\3\6\3\7\3\7\3\7\3\b\3\b\3\b\3\t\3\t\3\n\3\n\3\13\3\13\3\f\3\f"+
		"\3\r\3\r\3\16\3\16\3\17\3\17\3\20\3\20\3\21\3\21\3\22\3\22\3\22\3\23\3"+
		"\23\3\23\3\24\3\24\3\24\3\25\3\25\3\25\3\26\3\26\3\27\3\27\3\30\3\30\3"+
		"\31\3\31\3\31\3\31\3\31\3\31\3\32\3\32\3\32\3\33\3\33\3\33\3\34\3\34\3"+
		"\34\3\34\3\34\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\36\3\36\3\36\3\36\3"+
		"\36\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3 \3 \3 \3 \3!\3!\3!"+
		"\3!\3!\3!\3!\3!\3\"\6\"\u00c8\n\"\r\"\16\"\u00c9\3\"\3\"\7\"\u00ce\n\""+
		"\f\"\16\"\u00d1\13\"\5\"\u00d3\n\"\3#\3#\7#\u00d7\n#\f#\16#\u00da\13#"+
		"\3$\3$\3$\3$\3$\3$\3$\3$\3$\5$\u00e5\n$\3%\3%\3%\3%\3&\6&\u00ec\n&\r&"+
		"\16&\u00ed\3&\3&\2\2\'\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27"+
		"\r\31\16\33\17\35\20\37\21!\22#\23%\24\'\25)\26+\27-\30/\31\61\32\63\33"+
		"\65\34\67\359\36;\37= ?!A\"C#E$G%I&K\'\3\2\6\3\2\62;\5\2C\\aac|\6\2\62"+
		";C\\aac|\5\2\13\f\17\17\"\"\u00f6\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2"+
		"\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3"+
		"\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2"+
		"\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2"+
		"\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2"+
		"\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3\2\2\2\2A\3\2\2"+
		"\2\2C\3\2\2\2\2E\3\2\2\2\2G\3\2\2\2\2I\3\2\2\2\2K\3\2\2\2\3M\3\2\2\2\5"+
		"S\3\2\2\2\7Y\3\2\2\2\t]\3\2\2\2\13b\3\2\2\2\rj\3\2\2\2\17m\3\2\2\2\21"+
		"p\3\2\2\2\23r\3\2\2\2\25t\3\2\2\2\27v\3\2\2\2\31x\3\2\2\2\33z\3\2\2\2"+
		"\35|\3\2\2\2\37~\3\2\2\2!\u0080\3\2\2\2#\u0082\3\2\2\2%\u0085\3\2\2\2"+
		"\'\u0088\3\2\2\2)\u008b\3\2\2\2+\u008e\3\2\2\2-\u0090\3\2\2\2/\u0092\3"+
		"\2\2\2\61\u0094\3\2\2\2\63\u009a\3\2\2\2\65\u009d\3\2\2\2\67\u00a0\3\2"+
		"\2\29\u00a5\3\2\2\2;\u00ac\3\2\2\2=\u00b1\3\2\2\2?\u00ba\3\2\2\2A\u00be"+
		"\3\2\2\2C\u00c7\3\2\2\2E\u00d4\3\2\2\2G\u00e4\3\2\2\2I\u00e6\3\2\2\2K"+
		"\u00eb\3\2\2\2MN\7y\2\2NO\7q\2\2OP\7t\2\2PQ\7n\2\2QR\7f\2\2R\4\3\2\2\2"+
		"ST\7j\2\2TU\7g\2\2UV\7n\2\2VW\7n\2\2WX\7q\2\2X\6\3\2\2\2YZ\7n\2\2Z[\7"+
		"g\2\2[\\\7v\2\2\\\b\3\2\2\2]^\7t\2\2^_\7g\2\2_`\7c\2\2`a\7f\2\2a\n\3\2"+
		"\2\2bc\7r\2\2cd\7t\2\2de\7k\2\2ef\7p\2\2fg\7v\2\2gh\7n\2\2hi\7p\2\2i\f"+
		"\3\2\2\2jk\7(\2\2kl\7(\2\2l\16\3\2\2\2mn\7~\2\2no\7~\2\2o\20\3\2\2\2p"+
		"q\7#\2\2q\22\3\2\2\2rs\7/\2\2s\24\3\2\2\2tu\7-\2\2u\26\3\2\2\2vw\7,\2"+
		"\2w\30\3\2\2\2xy\7\61\2\2y\32\3\2\2\2z{\7.\2\2{\34\3\2\2\2|}\7<\2\2}\36"+
		"\3\2\2\2~\177\7@\2\2\177 \3\2\2\2\u0080\u0081\7>\2\2\u0081\"\3\2\2\2\u0082"+
		"\u0083\7@\2\2\u0083\u0084\7?\2\2\u0084$\3\2\2\2\u0085\u0086\7>\2\2\u0086"+
		"\u0087\7?\2\2\u0087&\3\2\2\2\u0088\u0089\7?\2\2\u0089\u008a\7?\2\2\u008a"+
		"(\3\2\2\2\u008b\u008c\7>\2\2\u008c\u008d\7@\2\2\u008d*\3\2\2\2\u008e\u008f"+
		"\7?\2\2\u008f,\3\2\2\2\u0090\u0091\7*\2\2\u0091.\3\2\2\2\u0092\u0093\7"+
		"+\2\2\u0093\60\3\2\2\2\u0094\u0095\7y\2\2\u0095\u0096\7j\2\2\u0096\u0097"+
		"\7k\2\2\u0097\u0098\7n\2\2\u0098\u0099\7g\2\2\u0099\62\3\2\2\2\u009a\u009b"+
		"\7f\2\2\u009b\u009c\7q\2\2\u009c\64\3\2\2\2\u009d\u009e\7k\2\2\u009e\u009f"+
		"\7h\2\2\u009f\66\3\2\2\2\u00a0\u00a1\7v\2\2\u00a1\u00a2\7j\2\2\u00a2\u00a3"+
		"\7g\2\2\u00a3\u00a4\7p\2\2\u00a48\3\2\2\2\u00a5\u00a6\7g\2\2\u00a6\u00a7"+
		"\7p\2\2\u00a7\u00a8\7f\2\2\u00a8\u00a9\7a\2\2\u00a9\u00aa\7k\2\2\u00aa"+
		"\u00ab\7h\2\2\u00ab:\3\2\2\2\u00ac\u00ad\7g\2\2\u00ad\u00ae\7n\2\2\u00ae"+
		"\u00af\7u\2\2\u00af\u00b0\7g\2\2\u00b0<\3\2\2\2\u00b1\u00b2\7g\2\2\u00b2"+
		"\u00b3\7p\2\2\u00b3\u00b4\7f\2\2\u00b4\u00b5\7a\2\2\u00b5\u00b6\7g\2\2"+
		"\u00b6\u00b7\7n\2\2\u00b7\u00b8\7u\2\2\u00b8\u00b9\7g\2\2\u00b9>\3\2\2"+
		"\2\u00ba\u00bb\7f\2\2\u00bb\u00bc\7g\2\2\u00bc\u00bd\7h\2\2\u00bd@\3\2"+
		"\2\2\u00be\u00bf\7g\2\2\u00bf\u00c0\7p\2\2\u00c0\u00c1\7f\2\2\u00c1\u00c2"+
		"\7a\2\2\u00c2\u00c3\7f\2\2\u00c3\u00c4\7g\2\2\u00c4\u00c5\7h\2\2\u00c5"+
		"B\3\2\2\2\u00c6\u00c8\t\2\2\2\u00c7\u00c6\3\2\2\2\u00c8\u00c9\3\2\2\2"+
		"\u00c9\u00c7\3\2\2\2\u00c9\u00ca\3\2\2\2\u00ca\u00d2\3\2\2\2\u00cb\u00cf"+
		"\7\60\2\2\u00cc\u00ce\t\2\2\2\u00cd\u00cc\3\2\2\2\u00ce\u00d1\3\2\2\2"+
		"\u00cf\u00cd\3\2\2\2\u00cf\u00d0\3\2\2\2\u00d0\u00d3\3\2\2\2\u00d1\u00cf"+
		"\3\2\2\2\u00d2\u00cb\3\2\2\2\u00d2\u00d3\3\2\2\2\u00d3D\3\2\2\2\u00d4"+
		"\u00d8\t\3\2\2\u00d5\u00d7\t\4\2\2\u00d6\u00d5\3\2\2\2\u00d7\u00da\3\2"+
		"\2\2\u00d8\u00d6\3\2\2\2\u00d8\u00d9\3\2\2\2\u00d9F\3\2\2\2\u00da\u00d8"+
		"\3\2\2\2\u00db\u00dc\7v\2\2\u00dc\u00dd\7t\2\2\u00dd\u00de\7w\2\2\u00de"+
		"\u00e5\7g\2\2\u00df\u00e0\7h\2\2\u00e0\u00e1\7c\2\2\u00e1\u00e2\7n\2\2"+
		"\u00e2\u00e3\7u\2\2\u00e3\u00e5\7g\2\2\u00e4\u00db\3\2\2\2\u00e4\u00df"+
		"\3\2\2\2\u00e5H\3\2\2\2\u00e6\u00e7\7$\2\2\u00e7\u00e8\3\2\2\2\u00e8\u00e9"+
		"\b%\2\2\u00e9J\3\2\2\2\u00ea\u00ec\t\5\2\2\u00eb\u00ea\3\2\2\2\u00ec\u00ed"+
		"\3\2\2\2\u00ed\u00eb\3\2\2\2\u00ed\u00ee\3\2\2\2\u00ee\u00ef\3\2\2\2\u00ef"+
		"\u00f0\b&\3\2\u00f0L\3\2\2\2\t\2\u00c9\u00cf\u00d2\u00d8\u00e4\u00ed\4"+
		"\4\2\2\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}