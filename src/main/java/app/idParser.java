// Generated from /Users/enzoletona/Desktop/TC/renzo/proyecto-final-tc/src/main/java/app/id.g4 by ANTLR 4.13.1

package app;

import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue"})
public class idParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.13.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		WS=1, INT=2, CHAR=3, DOUBLE=4, VOID=5, LLAVE_APERTURA=6, LLAVE_CLAUSURA=7, 
		PARENTESIS_APERTURA=8, PARENTESIS_CLAUSURA=9, PUNTO_COMA=10, SUMA=11, 
		RESTA=12, MULTIPLICAR=13, MODULO=14, EQUAL=15, INCREMENTADOR=16, DECREMENTADOR=17, 
		COMILLA=18, COMA=19, CADENA=20, MAYOR=21, MENOR=22, MAYOR_IGUAL=23, MENOR_IGUAL=24, 
		AND=25, OR=26, IF=27, ELSE=28, FOR=29, WHILE=30, BREAK=31, CONTINUE=32, 
		IDENTIFICADOR=33, NUMERO=34, OTRO=35;
	public static final int
		RULE_s = 0, RULE_instruccion = 1, RULE_tipo_variable = 2, RULE_declaracion_variables = 3, 
		RULE_declaracion_variable_variantes = 4, RULE_declaracion_variable_asignacion = 5, 
		RULE_declaracion_variable_simple = 6;
	private static String[] makeRuleNames() {
		return new String[] {
			"s", "instruccion", "tipo_variable", "declaracion_variables", "declaracion_variable_variantes", 
			"declaracion_variable_asignacion", "declaracion_variable_simple"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, null, "'int'", "'char'", "'double'", "'void'", "'{'", "'}'", "'('", 
			"')'", "';'", "'+'", "'-'", "'*'", "'%'", "'='", "'++'", "'--'", "'\"'", 
			"','", null, "'>'", "'<'", "'>='", "'<='", "'&&'", "'||'", "'if'", "'else'", 
			"'for'", "'while'", "'break'", "'continue'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "WS", "INT", "CHAR", "DOUBLE", "VOID", "LLAVE_APERTURA", "LLAVE_CLAUSURA", 
			"PARENTESIS_APERTURA", "PARENTESIS_CLAUSURA", "PUNTO_COMA", "SUMA", "RESTA", 
			"MULTIPLICAR", "MODULO", "EQUAL", "INCREMENTADOR", "DECREMENTADOR", "COMILLA", 
			"COMA", "CADENA", "MAYOR", "MENOR", "MAYOR_IGUAL", "MENOR_IGUAL", "AND", 
			"OR", "IF", "ELSE", "FOR", "WHILE", "BREAK", "CONTINUE", "IDENTIFICADOR", 
			"NUMERO", "OTRO"
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
	public String getGrammarFileName() { return "id.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public idParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class SContext extends ParserRuleContext {
		public InstruccionContext instruccion() {
			return getRuleContext(InstruccionContext.class,0);
		}
		public SContext s() {
			return getRuleContext(SContext.class,0);
		}
		public SContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_s; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof idListener ) ((idListener)listener).enterS(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof idListener ) ((idListener)listener).exitS(this);
		}
	}

	public final SContext s() throws RecognitionException {
		SContext _localctx = new SContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_s);
		try {
			setState(18);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,0,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(14);
				instruccion();
				setState(15);
				s();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				}
				break;
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

	@SuppressWarnings("CheckReturnValue")
	public static class InstruccionContext extends ParserRuleContext {
		public Declaracion_variablesContext declaracion_variables() {
			return getRuleContext(Declaracion_variablesContext.class,0);
		}
		public InstruccionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_instruccion; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof idListener ) ((idListener)listener).enterInstruccion(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof idListener ) ((idListener)listener).exitInstruccion(this);
		}
	}

	public final InstruccionContext instruccion() throws RecognitionException {
		InstruccionContext _localctx = new InstruccionContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_instruccion);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(20);
			declaracion_variables();
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

	@SuppressWarnings("CheckReturnValue")
	public static class Tipo_variableContext extends ParserRuleContext {
		public TerminalNode INT() { return getToken(idParser.INT, 0); }
		public TerminalNode DOUBLE() { return getToken(idParser.DOUBLE, 0); }
		public TerminalNode CHAR() { return getToken(idParser.CHAR, 0); }
		public Tipo_variableContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tipo_variable; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof idListener ) ((idListener)listener).enterTipo_variable(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof idListener ) ((idListener)listener).exitTipo_variable(this);
		}
	}

	public final Tipo_variableContext tipo_variable() throws RecognitionException {
		Tipo_variableContext _localctx = new Tipo_variableContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_tipo_variable);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(22);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 28L) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
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

	@SuppressWarnings("CheckReturnValue")
	public static class Declaracion_variablesContext extends ParserRuleContext {
		public Tipo_variableContext tipo_variable() {
			return getRuleContext(Tipo_variableContext.class,0);
		}
		public Declaracion_variable_variantesContext declaracion_variable_variantes() {
			return getRuleContext(Declaracion_variable_variantesContext.class,0);
		}
		public Declaracion_variablesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declaracion_variables; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof idListener ) ((idListener)listener).enterDeclaracion_variables(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof idListener ) ((idListener)listener).exitDeclaracion_variables(this);
		}
	}

	public final Declaracion_variablesContext declaracion_variables() throws RecognitionException {
		Declaracion_variablesContext _localctx = new Declaracion_variablesContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_declaracion_variables);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(24);
			tipo_variable();
			setState(25);
			declaracion_variable_variantes();
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

	@SuppressWarnings("CheckReturnValue")
	public static class Declaracion_variable_variantesContext extends ParserRuleContext {
		public Declaracion_variable_asignacionContext declaracion_variable_asignacion() {
			return getRuleContext(Declaracion_variable_asignacionContext.class,0);
		}
		public TerminalNode COMA() { return getToken(idParser.COMA, 0); }
		public Declaracion_variable_variantesContext declaracion_variable_variantes() {
			return getRuleContext(Declaracion_variable_variantesContext.class,0);
		}
		public Declaracion_variable_simpleContext declaracion_variable_simple() {
			return getRuleContext(Declaracion_variable_simpleContext.class,0);
		}
		public TerminalNode PUNTO_COMA() { return getToken(idParser.PUNTO_COMA, 0); }
		public Declaracion_variable_variantesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declaracion_variable_variantes; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof idListener ) ((idListener)listener).enterDeclaracion_variable_variantes(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof idListener ) ((idListener)listener).exitDeclaracion_variable_variantes(this);
		}
	}

	public final Declaracion_variable_variantesContext declaracion_variable_variantes() throws RecognitionException {
		Declaracion_variable_variantesContext _localctx = new Declaracion_variable_variantesContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_declaracion_variable_variantes);
		try {
			setState(41);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(27);
				declaracion_variable_asignacion();
				setState(28);
				match(COMA);
				setState(29);
				declaracion_variable_variantes();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(31);
				declaracion_variable_simple();
				setState(32);
				match(COMA);
				setState(33);
				declaracion_variable_variantes();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(35);
				declaracion_variable_asignacion();
				setState(36);
				match(PUNTO_COMA);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(38);
				declaracion_variable_simple();
				setState(39);
				match(PUNTO_COMA);
				}
				break;
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

	@SuppressWarnings("CheckReturnValue")
	public static class Declaracion_variable_asignacionContext extends ParserRuleContext {
		public List<TerminalNode> IDENTIFICADOR() { return getTokens(idParser.IDENTIFICADOR); }
		public TerminalNode IDENTIFICADOR(int i) {
			return getToken(idParser.IDENTIFICADOR, i);
		}
		public TerminalNode EQUAL() { return getToken(idParser.EQUAL, 0); }
		public TerminalNode CADENA() { return getToken(idParser.CADENA, 0); }
		public TerminalNode NUMERO() { return getToken(idParser.NUMERO, 0); }
		public Declaracion_variable_asignacionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declaracion_variable_asignacion; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof idListener ) ((idListener)listener).enterDeclaracion_variable_asignacion(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof idListener ) ((idListener)listener).exitDeclaracion_variable_asignacion(this);
		}
	}

	public final Declaracion_variable_asignacionContext declaracion_variable_asignacion() throws RecognitionException {
		Declaracion_variable_asignacionContext _localctx = new Declaracion_variable_asignacionContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_declaracion_variable_asignacion);
		try {
			setState(52);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(43);
				match(IDENTIFICADOR);
				setState(44);
				match(EQUAL);
				setState(45);
				match(CADENA);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(46);
				match(IDENTIFICADOR);
				setState(47);
				match(EQUAL);
				setState(48);
				match(IDENTIFICADOR);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(49);
				match(IDENTIFICADOR);
				setState(50);
				match(EQUAL);
				setState(51);
				match(NUMERO);
				}
				break;
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

	@SuppressWarnings("CheckReturnValue")
	public static class Declaracion_variable_simpleContext extends ParserRuleContext {
		public TerminalNode IDENTIFICADOR() { return getToken(idParser.IDENTIFICADOR, 0); }
		public Declaracion_variable_simpleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declaracion_variable_simple; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof idListener ) ((idListener)listener).enterDeclaracion_variable_simple(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof idListener ) ((idListener)listener).exitDeclaracion_variable_simple(this);
		}
	}

	public final Declaracion_variable_simpleContext declaracion_variable_simple() throws RecognitionException {
		Declaracion_variable_simpleContext _localctx = new Declaracion_variable_simpleContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_declaracion_variable_simple);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(54);
			match(IDENTIFICADOR);
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
		"\u0004\u0001#9\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002\u0002"+
		"\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002\u0005"+
		"\u0007\u0005\u0002\u0006\u0007\u0006\u0001\u0000\u0001\u0000\u0001\u0000"+
		"\u0001\u0000\u0003\u0000\u0013\b\u0000\u0001\u0001\u0001\u0001\u0001\u0002"+
		"\u0001\u0002\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0004\u0001\u0004"+
		"\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004"+
		"\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004"+
		"\u0003\u0004*\b\u0004\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005"+
		"\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0003\u0005"+
		"5\b\u0005\u0001\u0006\u0001\u0006\u0001\u0006\u0000\u0000\u0007\u0000"+
		"\u0002\u0004\u0006\b\n\f\u0000\u0001\u0001\u0000\u0002\u00047\u0000\u0012"+
		"\u0001\u0000\u0000\u0000\u0002\u0014\u0001\u0000\u0000\u0000\u0004\u0016"+
		"\u0001\u0000\u0000\u0000\u0006\u0018\u0001\u0000\u0000\u0000\b)\u0001"+
		"\u0000\u0000\u0000\n4\u0001\u0000\u0000\u0000\f6\u0001\u0000\u0000\u0000"+
		"\u000e\u000f\u0003\u0002\u0001\u0000\u000f\u0010\u0003\u0000\u0000\u0000"+
		"\u0010\u0013\u0001\u0000\u0000\u0000\u0011\u0013\u0001\u0000\u0000\u0000"+
		"\u0012\u000e\u0001\u0000\u0000\u0000\u0012\u0011\u0001\u0000\u0000\u0000"+
		"\u0013\u0001\u0001\u0000\u0000\u0000\u0014\u0015\u0003\u0006\u0003\u0000"+
		"\u0015\u0003\u0001\u0000\u0000\u0000\u0016\u0017\u0007\u0000\u0000\u0000"+
		"\u0017\u0005\u0001\u0000\u0000\u0000\u0018\u0019\u0003\u0004\u0002\u0000"+
		"\u0019\u001a\u0003\b\u0004\u0000\u001a\u0007\u0001\u0000\u0000\u0000\u001b"+
		"\u001c\u0003\n\u0005\u0000\u001c\u001d\u0005\u0013\u0000\u0000\u001d\u001e"+
		"\u0003\b\u0004\u0000\u001e*\u0001\u0000\u0000\u0000\u001f \u0003\f\u0006"+
		"\u0000 !\u0005\u0013\u0000\u0000!\"\u0003\b\u0004\u0000\"*\u0001\u0000"+
		"\u0000\u0000#$\u0003\n\u0005\u0000$%\u0005\n\u0000\u0000%*\u0001\u0000"+
		"\u0000\u0000&\'\u0003\f\u0006\u0000\'(\u0005\n\u0000\u0000(*\u0001\u0000"+
		"\u0000\u0000)\u001b\u0001\u0000\u0000\u0000)\u001f\u0001\u0000\u0000\u0000"+
		")#\u0001\u0000\u0000\u0000)&\u0001\u0000\u0000\u0000*\t\u0001\u0000\u0000"+
		"\u0000+,\u0005!\u0000\u0000,-\u0005\u000f\u0000\u0000-5\u0005\u0014\u0000"+
		"\u0000./\u0005!\u0000\u0000/0\u0005\u000f\u0000\u000005\u0005!\u0000\u0000"+
		"12\u0005!\u0000\u000023\u0005\u000f\u0000\u000035\u0005\"\u0000\u0000"+
		"4+\u0001\u0000\u0000\u00004.\u0001\u0000\u0000\u000041\u0001\u0000\u0000"+
		"\u00005\u000b\u0001\u0000\u0000\u000067\u0005!\u0000\u00007\r\u0001\u0000"+
		"\u0000\u0000\u0003\u0012)4";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}