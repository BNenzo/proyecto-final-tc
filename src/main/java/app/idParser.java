// Generated from /Users/enzoletona/Desktop/TC/proyecto-final-tc/src/main/java/app/id.g4 by ANTLR 4.13.1

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
		RULE_s = 0, RULE_instruccion = 1, RULE_tipo_variable = 2, RULE_tipo_funciones = 3, 
		RULE_bloque = 4, RULE_declaracion_variables = 5, RULE_declaracion_variable_variantes = 6, 
		RULE_declaracion_variable_asignacion = 7, RULE_declaracion_variable_simple = 8, 
		RULE_operacion_logica = 9, RULE_expresion_logica = 10, RULE_termino_logico = 11, 
		RULE_operador_logico = 12, RULE_conector_logico = 13, RULE_declaracion_funcion = 14, 
		RULE_declaracion_variables_funciones = 15, RULE_variables_funciones = 16, 
		RULE_definicion_funcion = 17;
	private static String[] makeRuleNames() {
		return new String[] {
			"s", "instruccion", "tipo_variable", "tipo_funciones", "bloque", "declaracion_variables", 
			"declaracion_variable_variantes", "declaracion_variable_asignacion", 
			"declaracion_variable_simple", "operacion_logica", "expresion_logica", 
			"termino_logico", "operador_logico", "conector_logico", "declaracion_funcion", 
			"declaracion_variables_funciones", "variables_funciones", "definicion_funcion"
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
			setState(40);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INT:
			case CHAR:
			case DOUBLE:
			case VOID:
			case PARENTESIS_APERTURA:
			case CADENA:
			case IDENTIFICADOR:
			case NUMERO:
				enterOuterAlt(_localctx, 1);
				{
				setState(36);
				instruccion();
				setState(37);
				s();
				}
				break;
			case LLAVE_CLAUSURA:
				enterOuterAlt(_localctx, 2);
				{
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
	public static class InstruccionContext extends ParserRuleContext {
		public Declaracion_variablesContext declaracion_variables() {
			return getRuleContext(Declaracion_variablesContext.class,0);
		}
		public Operacion_logicaContext operacion_logica() {
			return getRuleContext(Operacion_logicaContext.class,0);
		}
		public Declaracion_funcionContext declaracion_funcion() {
			return getRuleContext(Declaracion_funcionContext.class,0);
		}
		public Definicion_funcionContext definicion_funcion() {
			return getRuleContext(Definicion_funcionContext.class,0);
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
			setState(46);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(42);
				declaracion_variables();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(43);
				operacion_logica();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(44);
				declaracion_funcion();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(45);
				definicion_funcion();
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
			setState(48);
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
	public static class Tipo_funcionesContext extends ParserRuleContext {
		public TerminalNode INT() { return getToken(idParser.INT, 0); }
		public TerminalNode DOUBLE() { return getToken(idParser.DOUBLE, 0); }
		public TerminalNode CHAR() { return getToken(idParser.CHAR, 0); }
		public TerminalNode VOID() { return getToken(idParser.VOID, 0); }
		public Tipo_funcionesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tipo_funciones; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof idListener ) ((idListener)listener).enterTipo_funciones(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof idListener ) ((idListener)listener).exitTipo_funciones(this);
		}
	}

	public final Tipo_funcionesContext tipo_funciones() throws RecognitionException {
		Tipo_funcionesContext _localctx = new Tipo_funcionesContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_tipo_funciones);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(50);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 60L) != 0)) ) {
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
	public static class BloqueContext extends ParserRuleContext {
		public TerminalNode LLAVE_APERTURA() { return getToken(idParser.LLAVE_APERTURA, 0); }
		public SContext s() {
			return getRuleContext(SContext.class,0);
		}
		public TerminalNode LLAVE_CLAUSURA() { return getToken(idParser.LLAVE_CLAUSURA, 0); }
		public BloqueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bloque; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof idListener ) ((idListener)listener).enterBloque(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof idListener ) ((idListener)listener).exitBloque(this);
		}
	}

	public final BloqueContext bloque() throws RecognitionException {
		BloqueContext _localctx = new BloqueContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_bloque);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(52);
			match(LLAVE_APERTURA);
			setState(53);
			s();
			setState(54);
			match(LLAVE_CLAUSURA);
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
		enterRule(_localctx, 10, RULE_declaracion_variables);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(56);
			tipo_variable();
			setState(57);
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
		enterRule(_localctx, 12, RULE_declaracion_variable_variantes);
		try {
			setState(73);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(59);
				declaracion_variable_asignacion();
				setState(60);
				match(COMA);
				setState(61);
				declaracion_variable_variantes();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(63);
				declaracion_variable_simple();
				setState(64);
				match(COMA);
				setState(65);
				declaracion_variable_variantes();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(67);
				declaracion_variable_asignacion();
				setState(68);
				match(PUNTO_COMA);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(70);
				declaracion_variable_simple();
				setState(71);
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
		enterRule(_localctx, 14, RULE_declaracion_variable_asignacion);
		try {
			setState(84);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(75);
				match(IDENTIFICADOR);
				setState(76);
				match(EQUAL);
				setState(77);
				match(CADENA);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(78);
				match(IDENTIFICADOR);
				setState(79);
				match(EQUAL);
				setState(80);
				match(IDENTIFICADOR);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(81);
				match(IDENTIFICADOR);
				setState(82);
				match(EQUAL);
				setState(83);
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
		enterRule(_localctx, 16, RULE_declaracion_variable_simple);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(86);
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
		enterRule(_localctx, 18, RULE_operacion_logica);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(88);
			expresion_logica(0);
			setState(89);
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
		int _startState = 20;
		enterRecursionRule(_localctx, 20, RULE_expresion_logica, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(100);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case CADENA:
			case IDENTIFICADOR:
			case NUMERO:
				{
				setState(92);
				termino_logico();
				setState(93);
				operador_logico();
				setState(94);
				termino_logico();
				}
				break;
			case PARENTESIS_APERTURA:
				{
				setState(96);
				match(PARENTESIS_APERTURA);
				setState(97);
				expresion_logica(0);
				setState(98);
				match(PARENTESIS_CLAUSURA);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(108);
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
					setState(102);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(103);
					conector_logico();
					setState(104);
					expresion_logica(2);
					}
					} 
				}
				setState(110);
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
		enterRule(_localctx, 22, RULE_termino_logico);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(111);
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
		enterRule(_localctx, 24, RULE_operador_logico);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(113);
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
		enterRule(_localctx, 26, RULE_conector_logico);
		try {
			setState(118);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case AND:
				enterOuterAlt(_localctx, 1);
				{
				setState(115);
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
				setState(117);
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

	@SuppressWarnings("CheckReturnValue")
	public static class Declaracion_funcionContext extends ParserRuleContext {
		public Tipo_funcionesContext tipo_funciones() {
			return getRuleContext(Tipo_funcionesContext.class,0);
		}
		public TerminalNode IDENTIFICADOR() { return getToken(idParser.IDENTIFICADOR, 0); }
		public TerminalNode PARENTESIS_APERTURA() { return getToken(idParser.PARENTESIS_APERTURA, 0); }
		public TerminalNode PARENTESIS_CLAUSURA() { return getToken(idParser.PARENTESIS_CLAUSURA, 0); }
		public TerminalNode PUNTO_COMA() { return getToken(idParser.PUNTO_COMA, 0); }
		public Declaracion_variables_funcionesContext declaracion_variables_funciones() {
			return getRuleContext(Declaracion_variables_funcionesContext.class,0);
		}
		public Declaracion_funcionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declaracion_funcion; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof idListener ) ((idListener)listener).enterDeclaracion_funcion(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof idListener ) ((idListener)listener).exitDeclaracion_funcion(this);
		}
	}

	public final Declaracion_funcionContext declaracion_funcion() throws RecognitionException {
		Declaracion_funcionContext _localctx = new Declaracion_funcionContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_declaracion_funcion);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(120);
			tipo_funciones();
			setState(121);
			match(IDENTIFICADOR);
			setState(122);
			match(PARENTESIS_APERTURA);
			setState(124);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 60L) != 0)) {
				{
				setState(123);
				declaracion_variables_funciones();
				}
			}

			setState(126);
			match(PARENTESIS_CLAUSURA);
			setState(127);
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
	public static class Declaracion_variables_funcionesContext extends ParserRuleContext {
		public Variables_funcionesContext variables_funciones() {
			return getRuleContext(Variables_funcionesContext.class,0);
		}
		public List<TerminalNode> COMA() { return getTokens(idParser.COMA); }
		public TerminalNode COMA(int i) {
			return getToken(idParser.COMA, i);
		}
		public List<Declaracion_variables_funcionesContext> declaracion_variables_funciones() {
			return getRuleContexts(Declaracion_variables_funcionesContext.class);
		}
		public Declaracion_variables_funcionesContext declaracion_variables_funciones(int i) {
			return getRuleContext(Declaracion_variables_funcionesContext.class,i);
		}
		public Declaracion_variables_funcionesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declaracion_variables_funciones; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof idListener ) ((idListener)listener).enterDeclaracion_variables_funciones(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof idListener ) ((idListener)listener).exitDeclaracion_variables_funciones(this);
		}
	}

	public final Declaracion_variables_funcionesContext declaracion_variables_funciones() throws RecognitionException {
		Declaracion_variables_funcionesContext _localctx = new Declaracion_variables_funcionesContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_declaracion_variables_funciones);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(129);
			variables_funciones();
			setState(134);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,8,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(130);
					match(COMA);
					setState(131);
					declaracion_variables_funciones();
					}
					} 
				}
				setState(136);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,8,_ctx);
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
	public static class Variables_funcionesContext extends ParserRuleContext {
		public Tipo_funcionesContext tipo_funciones() {
			return getRuleContext(Tipo_funcionesContext.class,0);
		}
		public TerminalNode IDENTIFICADOR() { return getToken(idParser.IDENTIFICADOR, 0); }
		public TerminalNode EQUAL() { return getToken(idParser.EQUAL, 0); }
		public TerminalNode CADENA() { return getToken(idParser.CADENA, 0); }
		public TerminalNode NUMERO() { return getToken(idParser.NUMERO, 0); }
		public Variables_funcionesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variables_funciones; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof idListener ) ((idListener)listener).enterVariables_funciones(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof idListener ) ((idListener)listener).exitVariables_funciones(this);
		}
	}

	public final Variables_funcionesContext variables_funciones() throws RecognitionException {
		Variables_funcionesContext _localctx = new Variables_funcionesContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_variables_funciones);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(137);
			tipo_funciones();
			setState(138);
			match(IDENTIFICADOR);
			setState(141);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==EQUAL) {
				{
				setState(139);
				match(EQUAL);
				setState(140);
				_la = _input.LA(1);
				if ( !(_la==CADENA || _la==NUMERO) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
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
	public static class Definicion_funcionContext extends ParserRuleContext {
		public Tipo_funcionesContext tipo_funciones() {
			return getRuleContext(Tipo_funcionesContext.class,0);
		}
		public TerminalNode IDENTIFICADOR() { return getToken(idParser.IDENTIFICADOR, 0); }
		public TerminalNode PARENTESIS_APERTURA() { return getToken(idParser.PARENTESIS_APERTURA, 0); }
		public Declaracion_variables_funcionesContext declaracion_variables_funciones() {
			return getRuleContext(Declaracion_variables_funcionesContext.class,0);
		}
		public TerminalNode PARENTESIS_CLAUSURA() { return getToken(idParser.PARENTESIS_CLAUSURA, 0); }
		public BloqueContext bloque() {
			return getRuleContext(BloqueContext.class,0);
		}
		public Definicion_funcionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_definicion_funcion; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof idListener ) ((idListener)listener).enterDefinicion_funcion(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof idListener ) ((idListener)listener).exitDefinicion_funcion(this);
		}
	}

	public final Definicion_funcionContext definicion_funcion() throws RecognitionException {
		Definicion_funcionContext _localctx = new Definicion_funcionContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_definicion_funcion);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(143);
			tipo_funciones();
			setState(144);
			match(IDENTIFICADOR);
			setState(145);
			match(PARENTESIS_APERTURA);
			setState(146);
			declaracion_variables_funciones();
			setState(147);
			match(PARENTESIS_CLAUSURA);
			setState(148);
			bloque();
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
		case 10:
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
		"\u0004\u0001%\u0097\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002"+
		"\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b\u0002"+
		"\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002\u000f\u0007\u000f"+
		"\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011\u0001\u0000\u0001\u0000"+
		"\u0001\u0000\u0001\u0000\u0003\u0000)\b\u0000\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0003\u0001/\b\u0001\u0001\u0002\u0001\u0002"+
		"\u0001\u0003\u0001\u0003\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004"+
		"\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0006\u0001\u0006\u0001\u0006"+
		"\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006"+
		"\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0003\u0006"+
		"J\b\u0006\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007"+
		"\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0003\u0007U\b\u0007"+
		"\u0001\b\u0001\b\u0001\t\u0001\t\u0001\t\u0001\n\u0001\n\u0001\n\u0001"+
		"\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0003\ne\b\n\u0001\n\u0001"+
		"\n\u0001\n\u0001\n\u0005\nk\b\n\n\n\f\nn\t\n\u0001\u000b\u0001\u000b\u0001"+
		"\f\u0001\f\u0001\r\u0001\r\u0001\r\u0003\rw\b\r\u0001\u000e\u0001\u000e"+
		"\u0001\u000e\u0001\u000e\u0003\u000e}\b\u000e\u0001\u000e\u0001\u000e"+
		"\u0001\u000e\u0001\u000f\u0001\u000f\u0001\u000f\u0005\u000f\u0085\b\u000f"+
		"\n\u000f\f\u000f\u0088\t\u000f\u0001\u0010\u0001\u0010\u0001\u0010\u0001"+
		"\u0010\u0003\u0010\u008e\b\u0010\u0001\u0011\u0001\u0011\u0001\u0011\u0001"+
		"\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0000\u0001\u0014"+
		"\u0012\u0000\u0002\u0004\u0006\b\n\f\u000e\u0010\u0012\u0014\u0016\u0018"+
		"\u001a\u001c\u001e \"\u0000\u0005\u0001\u0000\u0002\u0004\u0001\u0000"+
		"\u0002\u0005\u0002\u0000\u0014\u0014#$\u0001\u0000\u0015\u001a\u0002\u0000"+
		"\u0014\u0014$$\u0094\u0000(\u0001\u0000\u0000\u0000\u0002.\u0001\u0000"+
		"\u0000\u0000\u00040\u0001\u0000\u0000\u0000\u00062\u0001\u0000\u0000\u0000"+
		"\b4\u0001\u0000\u0000\u0000\n8\u0001\u0000\u0000\u0000\fI\u0001\u0000"+
		"\u0000\u0000\u000eT\u0001\u0000\u0000\u0000\u0010V\u0001\u0000\u0000\u0000"+
		"\u0012X\u0001\u0000\u0000\u0000\u0014d\u0001\u0000\u0000\u0000\u0016o"+
		"\u0001\u0000\u0000\u0000\u0018q\u0001\u0000\u0000\u0000\u001av\u0001\u0000"+
		"\u0000\u0000\u001cx\u0001\u0000\u0000\u0000\u001e\u0081\u0001\u0000\u0000"+
		"\u0000 \u0089\u0001\u0000\u0000\u0000\"\u008f\u0001\u0000\u0000\u0000"+
		"$%\u0003\u0002\u0001\u0000%&\u0003\u0000\u0000\u0000&)\u0001\u0000\u0000"+
		"\u0000\')\u0001\u0000\u0000\u0000($\u0001\u0000\u0000\u0000(\'\u0001\u0000"+
		"\u0000\u0000)\u0001\u0001\u0000\u0000\u0000*/\u0003\n\u0005\u0000+/\u0003"+
		"\u0012\t\u0000,/\u0003\u001c\u000e\u0000-/\u0003\"\u0011\u0000.*\u0001"+
		"\u0000\u0000\u0000.+\u0001\u0000\u0000\u0000.,\u0001\u0000\u0000\u0000"+
		".-\u0001\u0000\u0000\u0000/\u0003\u0001\u0000\u0000\u000001\u0007\u0000"+
		"\u0000\u00001\u0005\u0001\u0000\u0000\u000023\u0007\u0001\u0000\u0000"+
		"3\u0007\u0001\u0000\u0000\u000045\u0005\u0006\u0000\u000056\u0003\u0000"+
		"\u0000\u000067\u0005\u0007\u0000\u00007\t\u0001\u0000\u0000\u000089\u0003"+
		"\u0004\u0002\u00009:\u0003\f\u0006\u0000:\u000b\u0001\u0000\u0000\u0000"+
		";<\u0003\u000e\u0007\u0000<=\u0005\u0013\u0000\u0000=>\u0003\f\u0006\u0000"+
		">J\u0001\u0000\u0000\u0000?@\u0003\u0010\b\u0000@A\u0005\u0013\u0000\u0000"+
		"AB\u0003\f\u0006\u0000BJ\u0001\u0000\u0000\u0000CD\u0003\u000e\u0007\u0000"+
		"DE\u0005\n\u0000\u0000EJ\u0001\u0000\u0000\u0000FG\u0003\u0010\b\u0000"+
		"GH\u0005\n\u0000\u0000HJ\u0001\u0000\u0000\u0000I;\u0001\u0000\u0000\u0000"+
		"I?\u0001\u0000\u0000\u0000IC\u0001\u0000\u0000\u0000IF\u0001\u0000\u0000"+
		"\u0000J\r\u0001\u0000\u0000\u0000KL\u0005#\u0000\u0000LM\u0005\u000f\u0000"+
		"\u0000MU\u0005\u0014\u0000\u0000NO\u0005#\u0000\u0000OP\u0005\u000f\u0000"+
		"\u0000PU\u0005#\u0000\u0000QR\u0005#\u0000\u0000RS\u0005\u000f\u0000\u0000"+
		"SU\u0005$\u0000\u0000TK\u0001\u0000\u0000\u0000TN\u0001\u0000\u0000\u0000"+
		"TQ\u0001\u0000\u0000\u0000U\u000f\u0001\u0000\u0000\u0000VW\u0005#\u0000"+
		"\u0000W\u0011\u0001\u0000\u0000\u0000XY\u0003\u0014\n\u0000YZ\u0005\n"+
		"\u0000\u0000Z\u0013\u0001\u0000\u0000\u0000[\\\u0006\n\uffff\uffff\u0000"+
		"\\]\u0003\u0016\u000b\u0000]^\u0003\u0018\f\u0000^_\u0003\u0016\u000b"+
		"\u0000_e\u0001\u0000\u0000\u0000`a\u0005\b\u0000\u0000ab\u0003\u0014\n"+
		"\u0000bc\u0005\t\u0000\u0000ce\u0001\u0000\u0000\u0000d[\u0001\u0000\u0000"+
		"\u0000d`\u0001\u0000\u0000\u0000el\u0001\u0000\u0000\u0000fg\n\u0001\u0000"+
		"\u0000gh\u0003\u001a\r\u0000hi\u0003\u0014\n\u0002ik\u0001\u0000\u0000"+
		"\u0000jf\u0001\u0000\u0000\u0000kn\u0001\u0000\u0000\u0000lj\u0001\u0000"+
		"\u0000\u0000lm\u0001\u0000\u0000\u0000m\u0015\u0001\u0000\u0000\u0000"+
		"nl\u0001\u0000\u0000\u0000op\u0007\u0002\u0000\u0000p\u0017\u0001\u0000"+
		"\u0000\u0000qr\u0007\u0003\u0000\u0000r\u0019\u0001\u0000\u0000\u0000"+
		"sw\u0005\u001b\u0000\u0000tw\u0001\u0000\u0000\u0000uw\u0005\u001c\u0000"+
		"\u0000vs\u0001\u0000\u0000\u0000vt\u0001\u0000\u0000\u0000vu\u0001\u0000"+
		"\u0000\u0000w\u001b\u0001\u0000\u0000\u0000xy\u0003\u0006\u0003\u0000"+
		"yz\u0005#\u0000\u0000z|\u0005\b\u0000\u0000{}\u0003\u001e\u000f\u0000"+
		"|{\u0001\u0000\u0000\u0000|}\u0001\u0000\u0000\u0000}~\u0001\u0000\u0000"+
		"\u0000~\u007f\u0005\t\u0000\u0000\u007f\u0080\u0005\n\u0000\u0000\u0080"+
		"\u001d\u0001\u0000\u0000\u0000\u0081\u0086\u0003 \u0010\u0000\u0082\u0083"+
		"\u0005\u0013\u0000\u0000\u0083\u0085\u0003\u001e\u000f\u0000\u0084\u0082"+
		"\u0001\u0000\u0000\u0000\u0085\u0088\u0001\u0000\u0000\u0000\u0086\u0084"+
		"\u0001\u0000\u0000\u0000\u0086\u0087\u0001\u0000\u0000\u0000\u0087\u001f"+
		"\u0001\u0000\u0000\u0000\u0088\u0086\u0001\u0000\u0000\u0000\u0089\u008a"+
		"\u0003\u0006\u0003\u0000\u008a\u008d\u0005#\u0000\u0000\u008b\u008c\u0005"+
		"\u000f\u0000\u0000\u008c\u008e\u0007\u0004\u0000\u0000\u008d\u008b\u0001"+
		"\u0000\u0000\u0000\u008d\u008e\u0001\u0000\u0000\u0000\u008e!\u0001\u0000"+
		"\u0000\u0000\u008f\u0090\u0003\u0006\u0003\u0000\u0090\u0091\u0005#\u0000"+
		"\u0000\u0091\u0092\u0005\b\u0000\u0000\u0092\u0093\u0003\u001e\u000f\u0000"+
		"\u0093\u0094\u0005\t\u0000\u0000\u0094\u0095\u0003\b\u0004\u0000\u0095"+
		"#\u0001\u0000\u0000\u0000\n(.ITdlv|\u0086\u008d";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}