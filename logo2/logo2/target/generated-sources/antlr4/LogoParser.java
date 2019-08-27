// Generated from Logo.g4 by ANTLR 4.4
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class LogoParser extends Parser {
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
	public static final String[] tokenNames = {
		"<INVALID>", "'world'", "'hello'", "'let'", "'read'", "'println'", "'&&'", 
		"'||'", "'!'", "'-'", "'+'", "'*'", "'/'", "','", "':'", "'>'", "'<'", 
		"'>='", "'<='", "'=='", "'<>'", "'='", "'('", "')'", "'while'", "'do'", 
		"'if'", "'then'", "'end_if'", "'else'", "'end_else'", "'def'", "'end_def'", 
		"NUM", "ID", "BOOL", "'\"'", "WS"
	};
	public static final int
		RULE_start = 0;
	public static final String[] ruleNames = {
		"start"
	};

	@Override
	public String getGrammarFileName() { return "Logo.g4"; }

	@Override
	public String[] getTokenNames() { return tokenNames; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }



	private Turtle turtle;

	public LogoParser(TokenStream input, Turtle turtle) {
	    this(input);
	    this.turtle = turtle;
	}


	public LogoParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class StartContext extends ParserRuleContext {
		public StartContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_start; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LogoListener ) ((LogoListener)listener).enterStart(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LogoListener ) ((LogoListener)listener).exitStart(this);
		}
	}

	public final StartContext start() throws RecognitionException {
		StartContext _localctx = new StartContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_start);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2); match(T__0);
			setState(3); match(T__1);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3\'\b\4\2\t\2\3\2\3"+
		"\2\3\2\3\2\2\2\3\2\2\2\6\2\4\3\2\2\2\4\5\7\4\2\2\5\6\7\3\2\2\6\3\3\2\2"+
		"\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}