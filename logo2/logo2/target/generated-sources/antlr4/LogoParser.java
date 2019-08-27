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
		VAR=1, READ=2, PRINTLN=3, AND=4, OR=5, NEG=6, MINUS=7, PLUS=8, MULT=9, 
		DIV=10, COMMA=11, DPOINT=12, GT=13, LT=14, GEQT=15, LEQT=16, EQ=17, DIF=18, 
		ASSIGN=19, OPEN_PARENT=20, CLOSE_PARENT=21, WHILE=22, DO=23, IF=24, THEN=25, 
		END_IF=26, ELSE=27, END_ELSE=28, DEF=29, END_DEF=30, MOVE_FORW=31, MOVE_BACK=32, 
		ROT_L=33, ROT_R=34, SET_COLOR=35, NUM=36, ID=37, BOOL=38, STRING=39, WS=40;
	public static final String[] tokenNames = {
		"<INVALID>", "'let'", "'read'", "'println'", "'&&'", "'||'", "'!'", "'-'", 
		"'+'", "'*'", "'/'", "','", "':'", "'>'", "'<'", "'>='", "'<='", "'=='", 
		"'<>'", "'='", "'('", "')'", "'while'", "'do'", "'if'", "'then'", "'end_if'", 
		"'else'", "'end_else'", "'def'", "'end_def'", "'move_forw'", "'move_back'", 
		"'rot_l'", "'rot_r'", "'set_color'", "NUM", "ID", "BOOL", "'\"'", "WS"
	};
	public static final int
		RULE_program = 0, RULE_sentence = 1, RULE_function = 2, RULE_move_fw = 3, 
		RULE_move_bk = 4, RULE_rotl = 5, RULE_rotr = 6, RULE_scol = 7;
	public static final String[] ruleNames = {
		"program", "sentence", "function", "move_fw", "move_bk", "rotl", "rotr", 
		"scol"
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
	public static class ProgramContext extends ParserRuleContext {
		public SentenceContext sentence(int i) {
			return getRuleContext(SentenceContext.class,i);
		}
		public List<SentenceContext> sentence() {
			return getRuleContexts(SentenceContext.class);
		}
		public ProgramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_program; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LogoListener ) ((LogoListener)listener).enterProgram(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LogoListener ) ((LogoListener)listener).exitProgram(this);
		}
	}

	public final ProgramContext program() throws RecognitionException {
		ProgramContext _localctx = new ProgramContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_program);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(19);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << MOVE_FORW) | (1L << MOVE_BACK) | (1L << ROT_L) | (1L << ROT_R) | (1L << SET_COLOR))) != 0)) {
				{
				{
				setState(16); sentence();
				}
				}
				setState(21);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
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

	public static class SentenceContext extends ParserRuleContext {
		public FunctionContext function() {
			return getRuleContext(FunctionContext.class,0);
		}
		public SentenceContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sentence; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LogoListener ) ((LogoListener)listener).enterSentence(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LogoListener ) ((LogoListener)listener).exitSentence(this);
		}
	}

	public final SentenceContext sentence() throws RecognitionException {
		SentenceContext _localctx = new SentenceContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_sentence);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(22); function();
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

	public static class FunctionContext extends ParserRuleContext {
		public RotrContext rotr() {
			return getRuleContext(RotrContext.class,0);
		}
		public RotlContext rotl() {
			return getRuleContext(RotlContext.class,0);
		}
		public Move_fwContext move_fw() {
			return getRuleContext(Move_fwContext.class,0);
		}
		public Move_bkContext move_bk() {
			return getRuleContext(Move_bkContext.class,0);
		}
		public ScolContext scol() {
			return getRuleContext(ScolContext.class,0);
		}
		public FunctionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_function; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LogoListener ) ((LogoListener)listener).enterFunction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LogoListener ) ((LogoListener)listener).exitFunction(this);
		}
	}

	public final FunctionContext function() throws RecognitionException {
		FunctionContext _localctx = new FunctionContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_function);
		try {
			setState(29);
			switch (_input.LA(1)) {
			case MOVE_FORW:
				enterOuterAlt(_localctx, 1);
				{
				setState(24); move_fw();
				}
				break;
			case MOVE_BACK:
				enterOuterAlt(_localctx, 2);
				{
				setState(25); move_bk();
				}
				break;
			case ROT_L:
				enterOuterAlt(_localctx, 3);
				{
				setState(26); rotl();
				}
				break;
			case ROT_R:
				enterOuterAlt(_localctx, 4);
				{
				setState(27); rotr();
				}
				break;
			case SET_COLOR:
				enterOuterAlt(_localctx, 5);
				{
				setState(28); scol();
				}
				break;
			default:
				throw new NoViableAltException(this);
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

	public static class Move_fwContext extends ParserRuleContext {
		public TerminalNode MOVE_FORW() { return getToken(LogoParser.MOVE_FORW, 0); }
		public TerminalNode NUM() { return getToken(LogoParser.NUM, 0); }
		public Move_fwContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_move_fw; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LogoListener ) ((LogoListener)listener).enterMove_fw(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LogoListener ) ((LogoListener)listener).exitMove_fw(this);
		}
	}

	public final Move_fwContext move_fw() throws RecognitionException {
		Move_fwContext _localctx = new Move_fwContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_move_fw);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(31); match(MOVE_FORW);
			setState(32); match(NUM);
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

	public static class Move_bkContext extends ParserRuleContext {
		public TerminalNode NUM() { return getToken(LogoParser.NUM, 0); }
		public TerminalNode MOVE_BACK() { return getToken(LogoParser.MOVE_BACK, 0); }
		public Move_bkContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_move_bk; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LogoListener ) ((LogoListener)listener).enterMove_bk(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LogoListener ) ((LogoListener)listener).exitMove_bk(this);
		}
	}

	public final Move_bkContext move_bk() throws RecognitionException {
		Move_bkContext _localctx = new Move_bkContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_move_bk);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(34); match(MOVE_BACK);
			setState(35); match(NUM);
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

	public static class RotlContext extends ParserRuleContext {
		public TerminalNode ROT_L() { return getToken(LogoParser.ROT_L, 0); }
		public TerminalNode NUM() { return getToken(LogoParser.NUM, 0); }
		public RotlContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_rotl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LogoListener ) ((LogoListener)listener).enterRotl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LogoListener ) ((LogoListener)listener).exitRotl(this);
		}
	}

	public final RotlContext rotl() throws RecognitionException {
		RotlContext _localctx = new RotlContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_rotl);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(37); match(ROT_L);
			setState(38); match(NUM);
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

	public static class RotrContext extends ParserRuleContext {
		public TerminalNode ROT_R() { return getToken(LogoParser.ROT_R, 0); }
		public RotrContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_rotr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LogoListener ) ((LogoListener)listener).enterRotr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LogoListener ) ((LogoListener)listener).exitRotr(this);
		}
	}

	public final RotrContext rotr() throws RecognitionException {
		RotrContext _localctx = new RotrContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_rotr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(40); match(ROT_R);
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

	public static class ScolContext extends ParserRuleContext {
		public TerminalNode SET_COLOR() { return getToken(LogoParser.SET_COLOR, 0); }
		public List<TerminalNode> NUM() { return getTokens(LogoParser.NUM); }
		public List<TerminalNode> COMMA() { return getTokens(LogoParser.COMMA); }
		public TerminalNode NUM(int i) {
			return getToken(LogoParser.NUM, i);
		}
		public TerminalNode COMMA(int i) {
			return getToken(LogoParser.COMMA, i);
		}
		public ScolContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_scol; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LogoListener ) ((LogoListener)listener).enterScol(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LogoListener ) ((LogoListener)listener).exitScol(this);
		}
	}

	public final ScolContext scol() throws RecognitionException {
		ScolContext _localctx = new ScolContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_scol);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(42); match(SET_COLOR);
			setState(43); match(NUM);
			setState(44); match(COMMA);
			setState(45); match(NUM);
			setState(46); match(COMMA);
			setState(47); match(NUM);
			setState(48); match(COMMA);
			setState(49); match(NUM);
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
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3*\66\4\2\t\2\4\3\t"+
		"\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\3\2\7\2\24\n\2\f\2"+
		"\16\2\27\13\2\3\3\3\3\3\4\3\4\3\4\3\4\3\4\5\4 \n\4\3\5\3\5\3\5\3\6\3\6"+
		"\3\6\3\7\3\7\3\7\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\2\2\n"+
		"\2\4\6\b\n\f\16\20\2\2\62\2\25\3\2\2\2\4\30\3\2\2\2\6\37\3\2\2\2\b!\3"+
		"\2\2\2\n$\3\2\2\2\f\'\3\2\2\2\16*\3\2\2\2\20,\3\2\2\2\22\24\5\4\3\2\23"+
		"\22\3\2\2\2\24\27\3\2\2\2\25\23\3\2\2\2\25\26\3\2\2\2\26\3\3\2\2\2\27"+
		"\25\3\2\2\2\30\31\5\6\4\2\31\5\3\2\2\2\32 \5\b\5\2\33 \5\n\6\2\34 \5\f"+
		"\7\2\35 \5\16\b\2\36 \5\20\t\2\37\32\3\2\2\2\37\33\3\2\2\2\37\34\3\2\2"+
		"\2\37\35\3\2\2\2\37\36\3\2\2\2 \7\3\2\2\2!\"\7!\2\2\"#\7&\2\2#\t\3\2\2"+
		"\2$%\7\"\2\2%&\7&\2\2&\13\3\2\2\2\'(\7#\2\2()\7&\2\2)\r\3\2\2\2*+\7$\2"+
		"\2+\17\3\2\2\2,-\7%\2\2-.\7&\2\2./\7\r\2\2/\60\7&\2\2\60\61\7\r\2\2\61"+
		"\62\7&\2\2\62\63\7\r\2\2\63\64\7&\2\2\64\21\3\2\2\2\4\25\37";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}