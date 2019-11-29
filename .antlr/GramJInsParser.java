// Generated from c:\Users\Manuel\Desktop\ \Programación\Java\PL3Compiladores\GramJIns.g4 by ANTLR 4.7.1
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
	static { RuntimeMetaData.checkVersion("4.7.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		CI=1, CD=2, WS=3, COMENTARIO_BLOQUE=4, INT=5, NEWLINE=6, COMA=7;
	public static final int
		RULE_prog = 0, RULE_linea = 1;
	public static final String[] ruleNames = {
		"prog", "linea"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'['", "']'", null, null, null, null, "','"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, "CI", "CD", "WS", "COMENTARIO_BLOQUE", "INT", "NEWLINE", "COMA"
	};
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
	}

	public final ProgContext prog() throws RecognitionException {
		ProgContext _localctx = new ProgContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_prog);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(9);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==CI) {
				{
				{
				setState(4);
				linea();
				setState(5);
				match(NEWLINE);
				}
				}
				setState(11);
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
		public LineaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_linea; }
	}

	public final LineaContext linea() throws RecognitionException {
		LineaContext _localctx = new LineaContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_linea);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(12);
			match(CI);
			setState(13);
			match(INT);
			setState(16);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				{
				setState(14);
				match(COMA);
				setState(15);
				match(INT);
				}
				break;
			}
			setState(20);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COMA) {
				{
				setState(18);
				match(COMA);
				setState(19);
				match(INT);
				}
			}

			setState(22);
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\t\33\4\2\t\2\4\3"+
		"\t\3\3\2\3\2\3\2\7\2\n\n\2\f\2\16\2\r\13\2\3\3\3\3\3\3\3\3\5\3\23\n\3"+
		"\3\3\3\3\5\3\27\n\3\3\3\3\3\3\3\2\2\4\2\4\2\2\2\33\2\13\3\2\2\2\4\16\3"+
		"\2\2\2\6\7\5\4\3\2\7\b\7\b\2\2\b\n\3\2\2\2\t\6\3\2\2\2\n\r\3\2\2\2\13"+
		"\t\3\2\2\2\13\f\3\2\2\2\f\3\3\2\2\2\r\13\3\2\2\2\16\17\7\3\2\2\17\22\7"+
		"\7\2\2\20\21\7\t\2\2\21\23\7\7\2\2\22\20\3\2\2\2\22\23\3\2\2\2\23\26\3"+
		"\2\2\2\24\25\7\t\2\2\25\27\7\7\2\2\26\24\3\2\2\2\26\27\3\2\2\2\27\30\3"+
		"\2\2\2\30\31\7\4\2\2\31\5\3\2\2\2\5\13\22\26";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}