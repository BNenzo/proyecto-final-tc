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
		IGUAL=25, DISTINTO=26, AND=27, OR=28, IF=29, ELSE=30, FOR=31, WHILE=32, 
		BREAK=33, CONTINUE=34, IDENTIFICADOR=35, NUMERO=36, OTRO=37;
	public static final int
		RULE_s = 0, RULE_instruccion = 1, RULE_tipo_variable = 2, RULE_declaracion_variables = 3, 
		RULE_declaracion_variable_variantes = 4, RULE_declaracion_variable_asignacion = 5, 
		RULE_declaracion_variable_simple = 6, RULE_operacion_logica = 7, RULE_expresion_logica = 8, 
		RULE_termino_logico = 9, RULE_operador_logico = 10, RULE_conector_logico = 11;
	private static String[] makeRuleNames() {
		return new String[] {
			"s", "instruccion", "tipo_variable", "declaracion_variables", "declaracion_variable_variantes", 
			"declaracion_variable_asignacion", "declaracion_variable_simple", "operacion_logica", 
			"expresion_logica", "termino_logico", "operador_logico", "conector_logico"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, null, "'int'", "'char'", "'double'", "'void'", "'{'", "'}'", "'('", 
			"')'", "';'", "'+'", "'-'", "'*'", "'%'", "'='", "'++'", "'--'", "'\"'", 
			"','", null, "'>'", "'<'", "'>='", "'<='", "'=='", "'!='", "'&&'", "'||'", 
			"'if'", "'else'", "'for'", "'while'", "'break'", "'continue'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "WS", "INT", "CHAR", "DOUBLE", "VOID", "LLAVE_APERTURA", "LLAVE_CLAUSURA", 
			"PARENTESIS_APERTURA", "PARENTESIS_CLAUSURA", "PUNTO_COMA", "SUMA", "RESTA", 
			"MULTIPLICAR", "MODULO", "EQUAL", "INCREMENTADOR", "DECREMENTADOR", "COMILLA", 
			"COMA", "CADENA", "MAYOR", "MENOR", "MAYOR_IGUAL", "MENOR_IGUAL", "IGUAL", 
			"DISTINTO", "AND", "OR", "IF", "ELSE", "FOR", "WHILE", "BREAK", "CONTINUE", 
			"IDENTIFICADOR", "NUMERO", "OTRO"
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
			setState(28);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,0,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(24);
				instruccion();
				setState(25);
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
		public Operacion_logicaContext operacion_logica() {
			return getRuleContext(Operacion_logicaContext.class,0);
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
			setState(32);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INT:
			case CHAR:
			case DOUBLE:
				enterOuterAlt(_localctx, 1);
				{
				setState(30);
				declaracion_variables();
				}
				break;
			case PARENTESIS_APERTURA:
			case CADENA:
			case IDENTIFICADOR:
			case NUMERO:
				enterOuterAlt(_localctx, 2);
				{
				setState(31);
				operacion_logica();
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
			setState(34);
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
			setState(36);
			tipo_variable();
			setState(37);
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
			setState(53);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(39);
				declaracion_variable_asignacion();
				setState(40);
				match(COMA);
				setState(41);
				declaracion_variable_variantes();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(43);
				declaracion_variable_simple();
				setState(44);
				match(COMA);
				setState(45);
				declaracion_variable_variantes();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(47);
				declaracion_variable_asignacion();
				setState(48);
				match(PUNTO_COMA);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(50);
				declaracion_variable_simple();
				setState(51);
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
			setState(64);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(55);
				match(IDENTIFICADOR);
				setState(56);
				match(EQUAL);
				setState(57);
				match(CADENA);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(58);
				match(IDENTIFICADOR);
				setState(59);
				match(EQUAL);
				setState(60);
				match(IDENTIFICADOR);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(61);
				match(IDENTIFICADOR);
				setState(62);
				match(EQUAL);
				setState(63);
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
			setState(66);
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

	@SuppressWarnings("CheckReturnValue")
	public static class Operacion_logicaContext extends ParserRuleContext {
		public Expresion_logicaContext expresion_logica() {
			return getRuleContext(Expresion_logicaContext.class,0);
		}
		public TerminalNode PUNTO_COMA() { return getToken(idParser.PUNTO_COMA, 0); }
		public Operacion_logicaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_operacion_logica; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof idListener ) ((idListener)listener).enterOperacion_logica(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof idListener ) ((idListener)listener).exitOperacion_logica(this);
		}
	}

	public final Operacion_logicaContext operacion_logica() throws RecognitionException {
		Operacion_logicaContext _localctx = new Operacion_logicaContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_operacion_logica);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(68);
			expresion_logica(0);
			setState(69);
			match(PUNTO_COMA);
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
	public static class Expresion_logicaContext extends ParserRuleContext {
		public List<Termino_logicoContext> termino_logico() {
			return getRuleContexts(Termino_logicoContext.class);
		}
		public Termino_logicoContext termino_logico(int i) {
			return getRuleContext(Termino_logicoContext.class,i);
		}
		public Operador_logicoContext operador_logico() {
			return getRuleContext(Operador_logicoContext.class,0);
		}
		public TerminalNode PARENTESIS_APERTURA() { return getToken(idParser.PARENTESIS_APERTURA, 0); }
		public List<Expresion_logicaContext> expresion_logica() {
			return getRuleContexts(Expresion_logicaContext.class);
		}
		public Expresion_logicaContext expresion_logica(int i) {
			return getRuleContext(Expresion_logicaContext.class,i);
		}
		public TerminalNode PARENTESIS_CLAUSURA() { return getToken(idParser.PARENTESIS_CLAUSURA, 0); }
		public Conector_logicoContext conector_logico() {
			return getRuleContext(Conector_logicoContext.class,0);
		}
		public Expresion_logicaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expresion_logica; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof idListener ) ((idListener)listener).enterExpresion_logica(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof idListener ) ((idListener)listener).exitExpresion_logica(this);
		}
	}

	public final Expresion_logicaContext expresion_logica() throws RecognitionException {
		return expresion_logica(0);
	}

	private Expresion_logicaContext expresion_logica(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		Expresion_logicaContext _localctx = new Expresion_logicaContext(_ctx, _parentState);
		Expresion_logicaContext _prevctx = _localctx;
		int _startState = 16;
		enterRecursionRule(_localctx, 16, RULE_expresion_logica, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(80);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case CADENA:
			case IDENTIFICADOR:
			case NUMERO:
				{
				setState(72);
				termino_logico();
				setState(73);
				operador_logico();
				setState(74);
				termino_logico();
				}
				break;
			case PARENTESIS_APERTURA:
				{
				setState(76);
				match(PARENTESIS_APERTURA);
				setState(77);
				expresion_logica(0);
				setState(78);
				match(PARENTESIS_CLAUSURA);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(88);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,5,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new Expresion_logicaContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_expresion_logica);
					setState(82);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(83);
					conector_logico();
					setState(84);
					expresion_logica(2);
					}
					} 
				}
				setState(90);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,5,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Termino_logicoContext extends ParserRuleContext {
		public TerminalNode CADENA() { return getToken(idParser.CADENA, 0); }
		public TerminalNode IDENTIFICADOR() { return getToken(idParser.IDENTIFICADOR, 0); }
		public TerminalNode NUMERO() { return getToken(idParser.NUMERO, 0); }
		public Termino_logicoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_termino_logico; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof idListener ) ((idListener)listener).enterTermino_logico(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof idListener ) ((idListener)listener).exitTermino_logico(this);
		}
	}

	public final Termino_logicoContext termino_logico() throws RecognitionException {
		Termino_logicoContext _localctx = new Termino_logicoContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_termino_logico);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(91);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 103080263680L) != 0)) ) {
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
	public static class Operador_logicoContext extends ParserRuleContext {
		public TerminalNode IGUAL() { return getToken(idParser.IGUAL, 0); }
		public TerminalNode DISTINTO() { return getToken(idParser.DISTINTO, 0); }
		public TerminalNode MAYOR() { return getToken(idParser.MAYOR, 0); }
		public TerminalNode MENOR() { return getToken(idParser.MENOR, 0); }
		public TerminalNode MAYOR_IGUAL() { return getToken(idParser.MAYOR_IGUAL, 0); }
		public TerminalNode MENOR_IGUAL() { return getToken(idParser.MENOR_IGUAL, 0); }
		public Operador_logicoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_operador_logico; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof idListener ) ((idListener)listener).enterOperador_logico(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof idListener ) ((idListener)listener).exitOperador_logico(this);
		}
	}

	public final Operador_logicoContext operador_logico() throws RecognitionException {
		Operador_logicoContext _localctx = new Operador_logicoContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_operador_logico);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(93);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 132120576L) != 0)) ) {
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
	public static class Conector_logicoContext extends ParserRuleContext {
		public TerminalNode AND() { return getToken(idParser.AND, 0); }
		public TerminalNode OR() { return getToken(idParser.OR, 0); }
		public Conector_logicoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_conector_logico; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof idListener ) ((idListener)listener).enterConector_logico(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof idListener ) ((idListener)listener).exitConector_logico(this);
		}
	}

	public final Conector_logicoContext conector_logico() throws RecognitionException {
		Conector_logicoContext _localctx = new Conector_logicoContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_conector_logico);
		try {
			setState(98);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case AND:
				enterOuterAlt(_localctx, 1);
				{
				setState(95);
				match(AND);
				}
				break;
			case PARENTESIS_APERTURA:
			case CADENA:
			case IDENTIFICADOR:
			case NUMERO:
				enterOuterAlt(_localctx, 2);
				{
				}
				break;
			case OR:
				enterOuterAlt(_localctx, 3);
				{
				setState(97);
				match(OR);
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

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 8:
			return expresion_logica_sempred((Expresion_logicaContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expresion_logica_sempred(Expresion_logicaContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 1);
		}
		return true;
	}

	public static final String _serializedATN =
		"\u0004\u0001%e\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002\u0002"+
		"\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002\u0005"+
		"\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002\b\u0007"+
		"\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b\u0001\u0000"+
		"\u0001\u0000\u0001\u0000\u0001\u0000\u0003\u0000\u001d\b\u0000\u0001\u0001"+
		"\u0001\u0001\u0003\u0001!\b\u0001\u0001\u0002\u0001\u0002\u0001\u0003"+
		"\u0001\u0003\u0001\u0003\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004"+
		"\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004"+
		"\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0003\u00046\b\u0004"+
		"\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005"+
		"\u0001\u0005\u0001\u0005\u0001\u0005\u0003\u0005A\b\u0005\u0001\u0006"+
		"\u0001\u0006\u0001\u0007\u0001\u0007\u0001\u0007\u0001\b\u0001\b\u0001"+
		"\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0003\bQ\b\b\u0001"+
		"\b\u0001\b\u0001\b\u0001\b\u0005\bW\b\b\n\b\f\bZ\t\b\u0001\t\u0001\t\u0001"+
		"\n\u0001\n\u0001\u000b\u0001\u000b\u0001\u000b\u0003\u000bc\b\u000b\u0001"+
		"\u000b\u0000\u0001\u0010\f\u0000\u0002\u0004\u0006\b\n\f\u000e\u0010\u0012"+
		"\u0014\u0016\u0000\u0003\u0001\u0000\u0002\u0004\u0002\u0000\u0014\u0014"+
		"#$\u0001\u0000\u0015\u001ac\u0000\u001c\u0001\u0000\u0000\u0000\u0002"+
		" \u0001\u0000\u0000\u0000\u0004\"\u0001\u0000\u0000\u0000\u0006$\u0001"+
		"\u0000\u0000\u0000\b5\u0001\u0000\u0000\u0000\n@\u0001\u0000\u0000\u0000"+
		"\fB\u0001\u0000\u0000\u0000\u000eD\u0001\u0000\u0000\u0000\u0010P\u0001"+
		"\u0000\u0000\u0000\u0012[\u0001\u0000\u0000\u0000\u0014]\u0001\u0000\u0000"+
		"\u0000\u0016b\u0001\u0000\u0000\u0000\u0018\u0019\u0003\u0002\u0001\u0000"+
		"\u0019\u001a\u0003\u0000\u0000\u0000\u001a\u001d\u0001\u0000\u0000\u0000"+
		"\u001b\u001d\u0001\u0000\u0000\u0000\u001c\u0018\u0001\u0000\u0000\u0000"+
		"\u001c\u001b\u0001\u0000\u0000\u0000\u001d\u0001\u0001\u0000\u0000\u0000"+
		"\u001e!\u0003\u0006\u0003\u0000\u001f!\u0003\u000e\u0007\u0000 \u001e"+
		"\u0001\u0000\u0000\u0000 \u001f\u0001\u0000\u0000\u0000!\u0003\u0001\u0000"+
		"\u0000\u0000\"#\u0007\u0000\u0000\u0000#\u0005\u0001\u0000\u0000\u0000"+
		"$%\u0003\u0004\u0002\u0000%&\u0003\b\u0004\u0000&\u0007\u0001\u0000\u0000"+
		"\u0000\'(\u0003\n\u0005\u0000()\u0005\u0013\u0000\u0000)*\u0003\b\u0004"+
		"\u0000*6\u0001\u0000\u0000\u0000+,\u0003\f\u0006\u0000,-\u0005\u0013\u0000"+
		"\u0000-.\u0003\b\u0004\u0000.6\u0001\u0000\u0000\u0000/0\u0003\n\u0005"+
		"\u000001\u0005\n\u0000\u000016\u0001\u0000\u0000\u000023\u0003\f\u0006"+
		"\u000034\u0005\n\u0000\u000046\u0001\u0000\u0000\u00005\'\u0001\u0000"+
		"\u0000\u00005+\u0001\u0000\u0000\u00005/\u0001\u0000\u0000\u000052\u0001"+
		"\u0000\u0000\u00006\t\u0001\u0000\u0000\u000078\u0005#\u0000\u000089\u0005"+
		"\u000f\u0000\u00009A\u0005\u0014\u0000\u0000:;\u0005#\u0000\u0000;<\u0005"+
		"\u000f\u0000\u0000<A\u0005#\u0000\u0000=>\u0005#\u0000\u0000>?\u0005\u000f"+
		"\u0000\u0000?A\u0005$\u0000\u0000@7\u0001\u0000\u0000\u0000@:\u0001\u0000"+
		"\u0000\u0000@=\u0001\u0000\u0000\u0000A\u000b\u0001\u0000\u0000\u0000"+
		"BC\u0005#\u0000\u0000C\r\u0001\u0000\u0000\u0000DE\u0003\u0010\b\u0000"+
		"EF\u0005\n\u0000\u0000F\u000f\u0001\u0000\u0000\u0000GH\u0006\b\uffff"+
		"\uffff\u0000HI\u0003\u0012\t\u0000IJ\u0003\u0014\n\u0000JK\u0003\u0012"+
		"\t\u0000KQ\u0001\u0000\u0000\u0000LM\u0005\b\u0000\u0000MN\u0003\u0010"+
		"\b\u0000NO\u0005\t\u0000\u0000OQ\u0001\u0000\u0000\u0000PG\u0001\u0000"+
		"\u0000\u0000PL\u0001\u0000\u0000\u0000QX\u0001\u0000\u0000\u0000RS\n\u0001"+
		"\u0000\u0000ST\u0003\u0016\u000b\u0000TU\u0003\u0010\b\u0002UW\u0001\u0000"+
		"\u0000\u0000VR\u0001\u0000\u0000\u0000WZ\u0001\u0000\u0000\u0000XV\u0001"+
		"\u0000\u0000\u0000XY\u0001\u0000\u0000\u0000Y\u0011\u0001\u0000\u0000"+
		"\u0000ZX\u0001\u0000\u0000\u0000[\\\u0007\u0001\u0000\u0000\\\u0013\u0001"+
		"\u0000\u0000\u0000]^\u0007\u0002\u0000\u0000^\u0015\u0001\u0000\u0000"+
		"\u0000_c\u0005\u001b\u0000\u0000`c\u0001\u0000\u0000\u0000ac\u0005\u001c"+
		"\u0000\u0000b_\u0001\u0000\u0000\u0000b`\u0001\u0000\u0000\u0000ba\u0001"+
		"\u0000\u0000\u0000c\u0017\u0001\u0000\u0000\u0000\u0007\u001c 5@PXb";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}