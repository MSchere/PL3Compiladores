// Generated from GramJIns.g4 by ANTLR 4.7.2
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class GramJInsParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.7.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		CI=1, CD=2, COM=3, WS=4, COMENTARIO_BLOQUE=5, INT=6, NEWLINE=7, COMA=8, 
		CADENA=9;
	public static final int
		RULE_prog = 0, RULE_linea = 1, RULE_tripleta = 2;
	private static String[] makeRuleNames() {
		return new String[] {
			"prog", "linea", "tripleta"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'['", "']'", "'\"'", null, null, null, null, "','"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "CI", "CD", "COM", "WS", "COMENTARIO_BLOQUE", "INT", "NEWLINE", 
			"COMA", "CADENA"
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}

	@Override
	public String getGrammarFileName() { return "GramJIns.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public GramJInsParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class ProgContext extends ParserRuleContext {
		public List<LineaContext> linea() {
			return getRuleContexts(LineaContext.class);
		}
		public LineaContext linea(int i) {
			return getRuleContext(LineaContext.class,i);
		}
		public List<TerminalNode> NEWLINE() { return getTokens(GramJInsParser.NEWLINE); }
		public TerminalNode NEWLINE(int i) {
			return getToken(GramJInsParser.NEWLINE, i);
		}
		public ProgContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_prog; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramJInsListener ) ((GramJInsListener)listener).enterProg(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramJInsListener ) ((GramJInsListener)listener).exitProg(this);
		}
	}

	public final ProgContext prog() throws RecognitionException {
		ProgContext _localctx = new ProgContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_prog);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(11);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COM) {
				{
				{
				setState(6);
				linea();
				setState(7);
				match(NEWLINE);
				}
				}
				setState(13);
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

	public static class LineaContext extends ParserRuleContext {
		public List<TerminalNode> COM() { return getTokens(GramJInsParser.COM); }
		public TerminalNode COM(int i) {
			return getToken(GramJInsParser.COM, i);
		}
		public TripletaContext tripleta() {
			return getRuleContext(TripletaContext.class,0);
		}
		public LineaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_linea; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramJInsListener ) ((GramJInsListener)listener).enterLinea(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramJInsListener ) ((GramJInsListener)listener).exitLinea(this);
		}
	}

	public final LineaContext linea() throws RecognitionException {
		LineaContext _localctx = new LineaContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_linea);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(14);
			match(COM);
			setState(15);
			tripleta();
			setState(16);
			match(COM);
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

	public static class TripletaContext extends ParserRuleContext {
		public TerminalNode CI() { return getToken(GramJInsParser.CI, 0); }
		public List<TerminalNode> INT() { return getTokens(GramJInsParser.INT); }
		public TerminalNode INT(int i) {
			return getToken(GramJInsParser.INT, i);
		}
		public TerminalNode CD() { return getToken(GramJInsParser.CD, 0); }
		public List<TerminalNode> COMA() { return getTokens(GramJInsParser.COMA); }
		public TerminalNode COMA(int i) {
			return getToken(GramJInsParser.COMA, i);
		}
		public TerminalNode CADENA() { return getToken(GramJInsParser.CADENA, 0); }
		public TripletaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tripleta; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramJInsListener ) ((GramJInsListener)listener).enterTripleta(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramJInsListener ) ((GramJInsListener)listener).exitTripleta(this);
		}
	}

	public final TripletaContext tripleta() throws RecognitionException {
		TripletaContext _localctx = new TripletaContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_tripleta);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(18);
			match(CI);
			setState(19);
			match(INT);
			setState(22);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				{
				setState(20);
				match(COMA);
				setState(21);
				match(INT);
				}
				break;
			}
			setState(26);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COMA) {
				{
				setState(24);
				match(COMA);
				setState(25);
				_la = _input.LA(1);
				if ( !(_la==INT || _la==CADENA) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
			}

			setState(28);
			match(CD);
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\13!\4\2\t\2\4\3\t"+
		"\3\4\4\t\4\3\2\3\2\3\2\7\2\f\n\2\f\2\16\2\17\13\2\3\3\3\3\3\3\3\3\3\4"+
		"\3\4\3\4\3\4\5\4\31\n\4\3\4\3\4\5\4\35\n\4\3\4\3\4\3\4\2\2\5\2\4\6\2\3"+
		"\4\2\b\b\13\13\2 \2\r\3\2\2\2\4\20\3\2\2\2\6\24\3\2\2\2\b\t\5\4\3\2\t"+
		"\n\7\t\2\2\n\f\3\2\2\2\13\b\3\2\2\2\f\17\3\2\2\2\r\13\3\2\2\2\r\16\3\2"+
		"\2\2\16\3\3\2\2\2\17\r\3\2\2\2\20\21\7\5\2\2\21\22\5\6\4\2\22\23\7\5\2"+
		"\2\23\5\3\2\2\2\24\25\7\3\2\2\25\30\7\b\2\2\26\27\7\n\2\2\27\31\7\b\2"+
		"\2\30\26\3\2\2\2\30\31\3\2\2\2\31\34\3\2\2\2\32\33\7\n\2\2\33\35\t\2\2"+
		"\2\34\32\3\2\2\2\34\35\3\2\2\2\35\36\3\2\2\2\36\37\7\4\2\2\37\7\3\2\2"+
		"\2\5\r\30\34";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}