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
		RESTA=12, MULTIPLICAR=13, MODULO=14, DIVISION=15, EQUAL=16, INCREMENTADOR=17, 
		DECREMENTADOR=18, COMILLA=19, COMA=20, CADENA=21, OPERADORES_NUMERICOS=22, 
		MAYOR=23, MENOR=24, MAYOR_IGUAL=25, MENOR_IGUAL=26, IGUAL=27, DISTINTO=28, 
		AND=29, OR=30, IF=31, ELSE=32, FOR=33, WHILE=34, BREAK=35, CONTINUE=36, 
		IDENTIFICADOR=37, NUMERO=38, OTRO=39;
	public static final int
		RULE_s = 0, RULE_instruccion = 1, RULE_tipo_variable = 2, RULE_tipo_funciones = 3, 
		RULE_bloque = 4, RULE_declaracion_variables = 5, RULE_declaracion_variable_variantes = 6, 
		RULE_declaracion_variable_asignacion = 7, RULE_declaracion_variable_simple = 8, 
		RULE_operacion_logica = 9, RULE_expresion_logica = 10, RULE_termino_logico = 11, 
		RULE_operador_logico = 12, RULE_conector_logico = 13, RULE_operacion_aritmetica = 14, 
		RULE_expresion_aritmetica = 15, RULE_terminos_aritmeticos = 16, RULE_termino_aritmetico = 17, 
		RULE_operador_aritmetico = 18, RULE_declaracion_funcion = 19, RULE_declaracion_variables_funciones = 20, 
		RULE_variables_funciones = 21, RULE_definicion_funcion = 22, RULE_llamada_funcion = 23, 
		RULE_parametros_llamada_funcion = 24, RULE_if = 25, RULE_while = 26, RULE_for = 27, 
		RULE_for_declaracion = 28, RULE_for_autoincremental = 29;
	private static String[] makeRuleNames() {
		return new String[] {
			"s", "instruccion", "tipo_variable", "tipo_funciones", "bloque", "declaracion_variables", 
			"declaracion_variable_variantes", "declaracion_variable_asignacion", 
			"declaracion_variable_simple", "operacion_logica", "expresion_logica", 
			"termino_logico", "operador_logico", "conector_logico", "operacion_aritmetica", 
			"expresion_aritmetica", "terminos_aritmeticos", "termino_aritmetico", 
			"operador_aritmetico", "declaracion_funcion", "declaracion_variables_funciones", 
			"variables_funciones", "definicion_funcion", "llamada_funcion", "parametros_llamada_funcion", 
			"if", "while", "for", "for_declaracion", "for_autoincremental"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, null, "'int'", "'char'", "'double'", "'void'", "'{'", "'}'", "'('", 
			"')'", "';'", "'+'", "'-'", "'*'", "'%'", "'/'", "'='", "'++'", "'--'", 
			"'\"'", "','", null, null, "'>'", "'<'", "'>='", "'<='", "'=='", "'!='", 
			"'&&'", "'||'", "'if'", "'else'", "'for'", "'while'", "'break'", "'continue'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "WS", "INT", "CHAR", "DOUBLE", "VOID", "LLAVE_APERTURA", "LLAVE_CLAUSURA", 
			"PARENTESIS_APERTURA", "PARENTESIS_CLAUSURA", "PUNTO_COMA", "SUMA", "RESTA", 
			"MULTIPLICAR", "MODULO", "DIVISION", "EQUAL", "INCREMENTADOR", "DECREMENTADOR", 
			"COMILLA", "COMA", "CADENA", "OPERADORES_NUMERICOS", "MAYOR", "MENOR", 
			"MAYOR_IGUAL", "MENOR_IGUAL", "IGUAL", "DISTINTO", "AND", "OR", "IF", 
			"ELSE", "FOR", "WHILE", "BREAK", "CONTINUE", "IDENTIFICADOR", "NUMERO", 
			"OTRO"
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
			setState(64);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INT:
			case CHAR:
			case DOUBLE:
			case VOID:
			case PARENTESIS_APERTURA:
			case CADENA:
			case IF:
			case FOR:
			case WHILE:
			case IDENTIFICADOR:
			case NUMERO:
				enterOuterAlt(_localctx, 1);
				{
				setState(60);
				instruccion();
				setState(61);
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
		public Operacion_aritmeticaContext operacion_aritmetica() {
			return getRuleContext(Operacion_aritmeticaContext.class,0);
		}
		public Declaracion_funcionContext declaracion_funcion() {
			return getRuleContext(Declaracion_funcionContext.class,0);
		}
		public Definicion_funcionContext definicion_funcion() {
			return getRuleContext(Definicion_funcionContext.class,0);
		}
		public Llamada_funcionContext llamada_funcion() {
			return getRuleContext(Llamada_funcionContext.class,0);
		}
		public IfContext if_() {
			return getRuleContext(IfContext.class,0);
		}
		public WhileContext while_() {
			return getRuleContext(WhileContext.class,0);
		}
		public ForContext for_() {
			return getRuleContext(ForContext.class,0);
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
			setState(75);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(66);
				declaracion_variables();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(67);
				operacion_logica();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(68);
				operacion_aritmetica();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(69);
				declaracion_funcion();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(70);
				definicion_funcion();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(71);
				llamada_funcion();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(72);
				if_();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(73);
				while_();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(74);
				for_();
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
			setState(77);
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
			setState(79);
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
			setState(81);
			match(LLAVE_APERTURA);
			setState(82);
			s();
			setState(83);
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
		public TerminalNode PUNTO_COMA() { return getToken(idParser.PUNTO_COMA, 0); }
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
			setState(85);
			tipo_variable();
			setState(86);
			declaracion_variable_variantes();
			setState(87);
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
			setState(99);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(89);
				declaracion_variable_asignacion();
				setState(90);
				match(COMA);
				setState(91);
				declaracion_variable_variantes();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(93);
				declaracion_variable_simple();
				setState(94);
				match(COMA);
				setState(95);
				declaracion_variable_variantes();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(97);
				declaracion_variable_asignacion();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(98);
				declaracion_variable_simple();
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
			setState(110);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(101);
				match(IDENTIFICADOR);
				setState(102);
				match(EQUAL);
				setState(103);
				match(CADENA);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(104);
				match(IDENTIFICADOR);
				setState(105);
				match(EQUAL);
				setState(106);
				match(IDENTIFICADOR);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(107);
				match(IDENTIFICADOR);
				setState(108);
				match(EQUAL);
				setState(109);
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
			setState(112);
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
			setState(114);
			expresion_logica(0);
			setState(115);
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
			setState(126);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case CADENA:
			case IDENTIFICADOR:
			case NUMERO:
				{
				setState(118);
				termino_logico();
				setState(119);
				operador_logico();
				setState(120);
				termino_logico();
				}
				break;
			case PARENTESIS_APERTURA:
				{
				setState(122);
				match(PARENTESIS_APERTURA);
				setState(123);
				expresion_logica(0);
				setState(124);
				match(PARENTESIS_CLAUSURA);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(134);
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
					setState(128);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(129);
					conector_logico();
					setState(130);
					expresion_logica(2);
					}
					} 
				}
				setState(136);
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
			setState(137);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 412318957568L) != 0)) ) {
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
			setState(139);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 528482304L) != 0)) ) {
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
			setState(144);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case AND:
				enterOuterAlt(_localctx, 1);
				{
				setState(141);
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
				setState(143);
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
	public static class Operacion_aritmeticaContext extends ParserRuleContext {
		public Expresion_aritmeticaContext expresion_aritmetica() {
			return getRuleContext(Expresion_aritmeticaContext.class,0);
		}
		public TerminalNode PUNTO_COMA() { return getToken(idParser.PUNTO_COMA, 0); }
		public Operacion_aritmeticaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_operacion_aritmetica; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof idListener ) ((idListener)listener).enterOperacion_aritmetica(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof idListener ) ((idListener)listener).exitOperacion_aritmetica(this);
		}
	}

	public final Operacion_aritmeticaContext operacion_aritmetica() throws RecognitionException {
		Operacion_aritmeticaContext _localctx = new Operacion_aritmeticaContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_operacion_aritmetica);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(146);
			expresion_aritmetica();
			setState(147);
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
	public static class Expresion_aritmeticaContext extends ParserRuleContext {
		public Terminos_aritmeticosContext terminos_aritmeticos() {
			return getRuleContext(Terminos_aritmeticosContext.class,0);
		}
		public List<Operador_aritmeticoContext> operador_aritmetico() {
			return getRuleContexts(Operador_aritmeticoContext.class);
		}
		public Operador_aritmeticoContext operador_aritmetico(int i) {
			return getRuleContext(Operador_aritmeticoContext.class,i);
		}
		public List<Expresion_aritmeticaContext> expresion_aritmetica() {
			return getRuleContexts(Expresion_aritmeticaContext.class);
		}
		public Expresion_aritmeticaContext expresion_aritmetica(int i) {
			return getRuleContext(Expresion_aritmeticaContext.class,i);
		}
		public Expresion_aritmeticaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expresion_aritmetica; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof idListener ) ((idListener)listener).enterExpresion_aritmetica(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof idListener ) ((idListener)listener).exitExpresion_aritmetica(this);
		}
	}

	public final Expresion_aritmeticaContext expresion_aritmetica() throws RecognitionException {
		Expresion_aritmeticaContext _localctx = new Expresion_aritmeticaContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_expresion_aritmetica);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(149);
			terminos_aritmeticos();
			setState(155);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,7,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(150);
					operador_aritmetico();
					setState(151);
					expresion_aritmetica();
					}
					} 
				}
				setState(157);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,7,_ctx);
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
	public static class Terminos_aritmeticosContext extends ParserRuleContext {
		public Termino_aritmeticoContext termino_aritmetico() {
			return getRuleContext(Termino_aritmeticoContext.class,0);
		}
		public TerminalNode PARENTESIS_APERTURA() { return getToken(idParser.PARENTESIS_APERTURA, 0); }
		public Expresion_aritmeticaContext expresion_aritmetica() {
			return getRuleContext(Expresion_aritmeticaContext.class,0);
		}
		public TerminalNode PARENTESIS_CLAUSURA() { return getToken(idParser.PARENTESIS_CLAUSURA, 0); }
		public Terminos_aritmeticosContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_terminos_aritmeticos; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof idListener ) ((idListener)listener).enterTerminos_aritmeticos(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof idListener ) ((idListener)listener).exitTerminos_aritmeticos(this);
		}
	}

	public final Terminos_aritmeticosContext terminos_aritmeticos() throws RecognitionException {
		Terminos_aritmeticosContext _localctx = new Terminos_aritmeticosContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_terminos_aritmeticos);
		try {
			setState(163);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IDENTIFICADOR:
			case NUMERO:
				enterOuterAlt(_localctx, 1);
				{
				setState(158);
				termino_aritmetico();
				}
				break;
			case PARENTESIS_APERTURA:
				enterOuterAlt(_localctx, 2);
				{
				setState(159);
				match(PARENTESIS_APERTURA);
				setState(160);
				expresion_aritmetica();
				setState(161);
				match(PARENTESIS_CLAUSURA);
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
	public static class Termino_aritmeticoContext extends ParserRuleContext {
		public TerminalNode IDENTIFICADOR() { return getToken(idParser.IDENTIFICADOR, 0); }
		public TerminalNode NUMERO() { return getToken(idParser.NUMERO, 0); }
		public Termino_aritmeticoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_termino_aritmetico; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof idListener ) ((idListener)listener).enterTermino_aritmetico(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof idListener ) ((idListener)listener).exitTermino_aritmetico(this);
		}
	}

	public final Termino_aritmeticoContext termino_aritmetico() throws RecognitionException {
		Termino_aritmeticoContext _localctx = new Termino_aritmeticoContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_termino_aritmetico);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(165);
			_la = _input.LA(1);
			if ( !(_la==IDENTIFICADOR || _la==NUMERO) ) {
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
	public static class Operador_aritmeticoContext extends ParserRuleContext {
		public TerminalNode SUMA() { return getToken(idParser.SUMA, 0); }
		public TerminalNode RESTA() { return getToken(idParser.RESTA, 0); }
		public TerminalNode MULTIPLICAR() { return getToken(idParser.MULTIPLICAR, 0); }
		public TerminalNode DIVISION() { return getToken(idParser.DIVISION, 0); }
		public Operador_aritmeticoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_operador_aritmetico; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof idListener ) ((idListener)listener).enterOperador_aritmetico(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof idListener ) ((idListener)listener).exitOperador_aritmetico(this);
		}
	}

	public final Operador_aritmeticoContext operador_aritmetico() throws RecognitionException {
		Operador_aritmeticoContext _localctx = new Operador_aritmeticoContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_operador_aritmetico);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(167);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 47104L) != 0)) ) {
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
		enterRule(_localctx, 38, RULE_declaracion_funcion);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(169);
			tipo_funciones();
			setState(170);
			match(IDENTIFICADOR);
			setState(171);
			match(PARENTESIS_APERTURA);
			setState(173);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 60L) != 0)) {
				{
				setState(172);
				declaracion_variables_funciones();
				}
			}

			setState(175);
			match(PARENTESIS_CLAUSURA);
			setState(176);
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
		enterRule(_localctx, 40, RULE_declaracion_variables_funciones);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(178);
			variables_funciones();
			setState(183);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,10,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(179);
					match(COMA);
					setState(180);
					declaracion_variables_funciones();
					}
					} 
				}
				setState(185);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,10,_ctx);
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
		enterRule(_localctx, 42, RULE_variables_funciones);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(186);
			tipo_funciones();
			setState(187);
			match(IDENTIFICADOR);
			setState(190);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==EQUAL) {
				{
				setState(188);
				match(EQUAL);
				setState(189);
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
		enterRule(_localctx, 44, RULE_definicion_funcion);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(192);
			tipo_funciones();
			setState(193);
			match(IDENTIFICADOR);
			setState(194);
			match(PARENTESIS_APERTURA);
			setState(195);
			declaracion_variables_funciones();
			setState(196);
			match(PARENTESIS_CLAUSURA);
			setState(197);
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

	@SuppressWarnings("CheckReturnValue")
	public static class Llamada_funcionContext extends ParserRuleContext {
		public TerminalNode IDENTIFICADOR() { return getToken(idParser.IDENTIFICADOR, 0); }
		public TerminalNode PARENTESIS_APERTURA() { return getToken(idParser.PARENTESIS_APERTURA, 0); }
		public TerminalNode PARENTESIS_CLAUSURA() { return getToken(idParser.PARENTESIS_CLAUSURA, 0); }
		public TerminalNode PUNTO_COMA() { return getToken(idParser.PUNTO_COMA, 0); }
		public Parametros_llamada_funcionContext parametros_llamada_funcion() {
			return getRuleContext(Parametros_llamada_funcionContext.class,0);
		}
		public Llamada_funcionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_llamada_funcion; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof idListener ) ((idListener)listener).enterLlamada_funcion(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof idListener ) ((idListener)listener).exitLlamada_funcion(this);
		}
	}

	public final Llamada_funcionContext llamada_funcion() throws RecognitionException {
		Llamada_funcionContext _localctx = new Llamada_funcionContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_llamada_funcion);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(199);
			match(IDENTIFICADOR);
			setState(200);
			match(PARENTESIS_APERTURA);
			setState(202);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 412318957568L) != 0)) {
				{
				setState(201);
				parametros_llamada_funcion();
				}
			}

			setState(204);
			match(PARENTESIS_CLAUSURA);
			setState(205);
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
	public static class Parametros_llamada_funcionContext extends ParserRuleContext {
		public TerminalNode COMA() { return getToken(idParser.COMA, 0); }
		public Parametros_llamada_funcionContext parametros_llamada_funcion() {
			return getRuleContext(Parametros_llamada_funcionContext.class,0);
		}
		public TerminalNode IDENTIFICADOR() { return getToken(idParser.IDENTIFICADOR, 0); }
		public TerminalNode NUMERO() { return getToken(idParser.NUMERO, 0); }
		public TerminalNode CADENA() { return getToken(idParser.CADENA, 0); }
		public Parametros_llamada_funcionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parametros_llamada_funcion; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof idListener ) ((idListener)listener).enterParametros_llamada_funcion(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof idListener ) ((idListener)listener).exitParametros_llamada_funcion(this);
		}
	}

	public final Parametros_llamada_funcionContext parametros_llamada_funcion() throws RecognitionException {
		Parametros_llamada_funcionContext _localctx = new Parametros_llamada_funcionContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_parametros_llamada_funcion);
		int _la;
		try {
			setState(211);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(207);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 412318957568L) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(208);
				match(COMA);
				setState(209);
				parametros_llamada_funcion();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(210);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 412318957568L) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
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
	public static class IfContext extends ParserRuleContext {
		public TerminalNode IF() { return getToken(idParser.IF, 0); }
		public TerminalNode PARENTESIS_APERTURA() { return getToken(idParser.PARENTESIS_APERTURA, 0); }
		public Expresion_logicaContext expresion_logica() {
			return getRuleContext(Expresion_logicaContext.class,0);
		}
		public TerminalNode PARENTESIS_CLAUSURA() { return getToken(idParser.PARENTESIS_CLAUSURA, 0); }
		public List<BloqueContext> bloque() {
			return getRuleContexts(BloqueContext.class);
		}
		public BloqueContext bloque(int i) {
			return getRuleContext(BloqueContext.class,i);
		}
		public InstruccionContext instruccion() {
			return getRuleContext(InstruccionContext.class,0);
		}
		public TerminalNode ELSE() { return getToken(idParser.ELSE, 0); }
		public IfContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_if; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof idListener ) ((idListener)listener).enterIf(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof idListener ) ((idListener)listener).exitIf(this);
		}
	}

	public final IfContext if_() throws RecognitionException {
		IfContext _localctx = new IfContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_if);
		try {
			setState(241);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(213);
				match(IF);
				setState(214);
				match(PARENTESIS_APERTURA);
				setState(215);
				expresion_logica(0);
				setState(216);
				match(PARENTESIS_CLAUSURA);
				setState(217);
				bloque();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(219);
				match(IF);
				setState(220);
				match(PARENTESIS_APERTURA);
				setState(221);
				expresion_logica(0);
				setState(222);
				match(PARENTESIS_CLAUSURA);
				setState(223);
				instruccion();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(225);
				match(IF);
				setState(226);
				match(PARENTESIS_APERTURA);
				setState(227);
				expresion_logica(0);
				setState(228);
				match(PARENTESIS_CLAUSURA);
				setState(229);
				bloque();
				setState(230);
				match(ELSE);
				setState(231);
				bloque();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(233);
				match(IF);
				setState(234);
				match(PARENTESIS_APERTURA);
				setState(235);
				expresion_logica(0);
				setState(236);
				match(PARENTESIS_CLAUSURA);
				setState(237);
				bloque();
				setState(238);
				match(ELSE);
				setState(239);
				instruccion();
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
	public static class WhileContext extends ParserRuleContext {
		public TerminalNode WHILE() { return getToken(idParser.WHILE, 0); }
		public TerminalNode PARENTESIS_APERTURA() { return getToken(idParser.PARENTESIS_APERTURA, 0); }
		public Expresion_logicaContext expresion_logica() {
			return getRuleContext(Expresion_logicaContext.class,0);
		}
		public TerminalNode PARENTESIS_CLAUSURA() { return getToken(idParser.PARENTESIS_CLAUSURA, 0); }
		public BloqueContext bloque() {
			return getRuleContext(BloqueContext.class,0);
		}
		public WhileContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_while; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof idListener ) ((idListener)listener).enterWhile(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof idListener ) ((idListener)listener).exitWhile(this);
		}
	}

	public final WhileContext while_() throws RecognitionException {
		WhileContext _localctx = new WhileContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_while);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(243);
			match(WHILE);
			setState(244);
			match(PARENTESIS_APERTURA);
			setState(245);
			expresion_logica(0);
			setState(246);
			match(PARENTESIS_CLAUSURA);
			setState(247);
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

	@SuppressWarnings("CheckReturnValue")
	public static class ForContext extends ParserRuleContext {
		public TerminalNode FOR() { return getToken(idParser.FOR, 0); }
		public TerminalNode PARENTESIS_APERTURA() { return getToken(idParser.PARENTESIS_APERTURA, 0); }
		public List<TerminalNode> PUNTO_COMA() { return getTokens(idParser.PUNTO_COMA); }
		public TerminalNode PUNTO_COMA(int i) {
			return getToken(idParser.PUNTO_COMA, i);
		}
		public Expresion_logicaContext expresion_logica() {
			return getRuleContext(Expresion_logicaContext.class,0);
		}
		public For_autoincrementalContext for_autoincremental() {
			return getRuleContext(For_autoincrementalContext.class,0);
		}
		public TerminalNode PARENTESIS_CLAUSURA() { return getToken(idParser.PARENTESIS_CLAUSURA, 0); }
		public BloqueContext bloque() {
			return getRuleContext(BloqueContext.class,0);
		}
		public For_declaracionContext for_declaracion() {
			return getRuleContext(For_declaracionContext.class,0);
		}
		public ForContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_for; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof idListener ) ((idListener)listener).enterFor(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof idListener ) ((idListener)listener).exitFor(this);
		}
	}

	public final ForContext for_() throws RecognitionException {
		ForContext _localctx = new ForContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_for);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(249);
			match(FOR);
			setState(250);
			match(PARENTESIS_APERTURA);
			setState(252);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 28L) != 0)) {
				{
				setState(251);
				for_declaracion();
				}
			}

			setState(254);
			match(PUNTO_COMA);
			setState(255);
			expresion_logica(0);
			setState(256);
			match(PUNTO_COMA);
			setState(257);
			for_autoincremental();
			setState(258);
			match(PARENTESIS_CLAUSURA);
			setState(259);
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

	@SuppressWarnings("CheckReturnValue")
	public static class For_declaracionContext extends ParserRuleContext {
		public Tipo_variableContext tipo_variable() {
			return getRuleContext(Tipo_variableContext.class,0);
		}
		public List<Declaracion_variable_asignacionContext> declaracion_variable_asignacion() {
			return getRuleContexts(Declaracion_variable_asignacionContext.class);
		}
		public Declaracion_variable_asignacionContext declaracion_variable_asignacion(int i) {
			return getRuleContext(Declaracion_variable_asignacionContext.class,i);
		}
		public List<TerminalNode> COMA() { return getTokens(idParser.COMA); }
		public TerminalNode COMA(int i) {
			return getToken(idParser.COMA, i);
		}
		public For_declaracionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_for_declaracion; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof idListener ) ((idListener)listener).enterFor_declaracion(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof idListener ) ((idListener)listener).exitFor_declaracion(this);
		}
	}

	public final For_declaracionContext for_declaracion() throws RecognitionException {
		For_declaracionContext _localctx = new For_declaracionContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_for_declaracion);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(261);
			tipo_variable();
			setState(262);
			declaracion_variable_asignacion();
			setState(267);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMA) {
				{
				{
				setState(263);
				match(COMA);
				setState(264);
				declaracion_variable_asignacion();
				}
				}
				setState(269);
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

	@SuppressWarnings("CheckReturnValue")
	public static class For_autoincrementalContext extends ParserRuleContext {
		public TerminalNode IDENTIFICADOR() { return getToken(idParser.IDENTIFICADOR, 0); }
		public TerminalNode INCREMENTADOR() { return getToken(idParser.INCREMENTADOR, 0); }
		public List<TerminalNode> COMA() { return getTokens(idParser.COMA); }
		public TerminalNode COMA(int i) {
			return getToken(idParser.COMA, i);
		}
		public List<For_autoincrementalContext> for_autoincremental() {
			return getRuleContexts(For_autoincrementalContext.class);
		}
		public For_autoincrementalContext for_autoincremental(int i) {
			return getRuleContext(For_autoincrementalContext.class,i);
		}
		public TerminalNode DECREMENTADOR() { return getToken(idParser.DECREMENTADOR, 0); }
		public For_autoincrementalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_for_autoincremental; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof idListener ) ((idListener)listener).enterFor_autoincremental(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof idListener ) ((idListener)listener).exitFor_autoincremental(this);
		}
	}

	public final For_autoincrementalContext for_autoincremental() throws RecognitionException {
		For_autoincrementalContext _localctx = new For_autoincrementalContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_for_autoincremental);
		try {
			int _alt;
			setState(288);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,19,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(270);
				match(IDENTIFICADOR);
				setState(271);
				match(INCREMENTADOR);
				setState(276);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,17,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(272);
						match(COMA);
						setState(273);
						for_autoincremental();
						}
						} 
					}
					setState(278);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,17,_ctx);
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(279);
				match(IDENTIFICADOR);
				setState(280);
				match(DECREMENTADOR);
				setState(285);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,18,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(281);
						match(COMA);
						setState(282);
						for_autoincremental();
						}
						} 
					}
					setState(287);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,18,_ctx);
				}
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
		"\u0004\u0001\'\u0123\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002"+
		"\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b\u0002"+
		"\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002\u000f\u0007\u000f"+
		"\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011\u0002\u0012\u0007\u0012"+
		"\u0002\u0013\u0007\u0013\u0002\u0014\u0007\u0014\u0002\u0015\u0007\u0015"+
		"\u0002\u0016\u0007\u0016\u0002\u0017\u0007\u0017\u0002\u0018\u0007\u0018"+
		"\u0002\u0019\u0007\u0019\u0002\u001a\u0007\u001a\u0002\u001b\u0007\u001b"+
		"\u0002\u001c\u0007\u001c\u0002\u001d\u0007\u001d\u0001\u0000\u0001\u0000"+
		"\u0001\u0000\u0001\u0000\u0003\u0000A\b\u0000\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0003\u0001L\b\u0001\u0001\u0002\u0001\u0002\u0001\u0003"+
		"\u0001\u0003\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0005"+
		"\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0006\u0001\u0006\u0001\u0006"+
		"\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006"+
		"\u0001\u0006\u0003\u0006d\b\u0006\u0001\u0007\u0001\u0007\u0001\u0007"+
		"\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007"+
		"\u0003\u0007o\b\u0007\u0001\b\u0001\b\u0001\t\u0001\t\u0001\t\u0001\n"+
		"\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0003"+
		"\n\u007f\b\n\u0001\n\u0001\n\u0001\n\u0001\n\u0005\n\u0085\b\n\n\n\f\n"+
		"\u0088\t\n\u0001\u000b\u0001\u000b\u0001\f\u0001\f\u0001\r\u0001\r\u0001"+
		"\r\u0003\r\u0091\b\r\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000f\u0001"+
		"\u000f\u0001\u000f\u0001\u000f\u0005\u000f\u009a\b\u000f\n\u000f\f\u000f"+
		"\u009d\t\u000f\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010"+
		"\u0003\u0010\u00a4\b\u0010\u0001\u0011\u0001\u0011\u0001\u0012\u0001\u0012"+
		"\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0003\u0013\u00ae\b\u0013"+
		"\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0014\u0001\u0014\u0001\u0014"+
		"\u0005\u0014\u00b6\b\u0014\n\u0014\f\u0014\u00b9\t\u0014\u0001\u0015\u0001"+
		"\u0015\u0001\u0015\u0001\u0015\u0003\u0015\u00bf\b\u0015\u0001\u0016\u0001"+
		"\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0001"+
		"\u0017\u0001\u0017\u0001\u0017\u0003\u0017\u00cb\b\u0017\u0001\u0017\u0001"+
		"\u0017\u0001\u0017\u0001\u0018\u0001\u0018\u0001\u0018\u0001\u0018\u0003"+
		"\u0018\u00d4\b\u0018\u0001\u0019\u0001\u0019\u0001\u0019\u0001\u0019\u0001"+
		"\u0019\u0001\u0019\u0001\u0019\u0001\u0019\u0001\u0019\u0001\u0019\u0001"+
		"\u0019\u0001\u0019\u0001\u0019\u0001\u0019\u0001\u0019\u0001\u0019\u0001"+
		"\u0019\u0001\u0019\u0001\u0019\u0001\u0019\u0001\u0019\u0001\u0019\u0001"+
		"\u0019\u0001\u0019\u0001\u0019\u0001\u0019\u0001\u0019\u0001\u0019\u0003"+
		"\u0019\u00f2\b\u0019\u0001\u001a\u0001\u001a\u0001\u001a\u0001\u001a\u0001"+
		"\u001a\u0001\u001a\u0001\u001b\u0001\u001b\u0001\u001b\u0003\u001b\u00fd"+
		"\b\u001b\u0001\u001b\u0001\u001b\u0001\u001b\u0001\u001b\u0001\u001b\u0001"+
		"\u001b\u0001\u001b\u0001\u001c\u0001\u001c\u0001\u001c\u0001\u001c\u0005"+
		"\u001c\u010a\b\u001c\n\u001c\f\u001c\u010d\t\u001c\u0001\u001d\u0001\u001d"+
		"\u0001\u001d\u0001\u001d\u0005\u001d\u0113\b\u001d\n\u001d\f\u001d\u0116"+
		"\t\u001d\u0001\u001d\u0001\u001d\u0001\u001d\u0001\u001d\u0005\u001d\u011c"+
		"\b\u001d\n\u001d\f\u001d\u011f\t\u001d\u0003\u001d\u0121\b\u001d\u0001"+
		"\u001d\u0000\u0001\u0014\u001e\u0000\u0002\u0004\u0006\b\n\f\u000e\u0010"+
		"\u0012\u0014\u0016\u0018\u001a\u001c\u001e \"$&(*,.02468:\u0000\u0007"+
		"\u0001\u0000\u0002\u0004\u0001\u0000\u0002\u0005\u0002\u0000\u0015\u0015"+
		"%&\u0001\u0000\u0017\u001c\u0001\u0000%&\u0002\u0000\u000b\r\u000f\u000f"+
		"\u0002\u0000\u0015\u0015&&\u0125\u0000@\u0001\u0000\u0000\u0000\u0002"+
		"K\u0001\u0000\u0000\u0000\u0004M\u0001\u0000\u0000\u0000\u0006O\u0001"+
		"\u0000\u0000\u0000\bQ\u0001\u0000\u0000\u0000\nU\u0001\u0000\u0000\u0000"+
		"\fc\u0001\u0000\u0000\u0000\u000en\u0001\u0000\u0000\u0000\u0010p\u0001"+
		"\u0000\u0000\u0000\u0012r\u0001\u0000\u0000\u0000\u0014~\u0001\u0000\u0000"+
		"\u0000\u0016\u0089\u0001\u0000\u0000\u0000\u0018\u008b\u0001\u0000\u0000"+
		"\u0000\u001a\u0090\u0001\u0000\u0000\u0000\u001c\u0092\u0001\u0000\u0000"+
		"\u0000\u001e\u0095\u0001\u0000\u0000\u0000 \u00a3\u0001\u0000\u0000\u0000"+
		"\"\u00a5\u0001\u0000\u0000\u0000$\u00a7\u0001\u0000\u0000\u0000&\u00a9"+
		"\u0001\u0000\u0000\u0000(\u00b2\u0001\u0000\u0000\u0000*\u00ba\u0001\u0000"+
		"\u0000\u0000,\u00c0\u0001\u0000\u0000\u0000.\u00c7\u0001\u0000\u0000\u0000"+
		"0\u00d3\u0001\u0000\u0000\u00002\u00f1\u0001\u0000\u0000\u00004\u00f3"+
		"\u0001\u0000\u0000\u00006\u00f9\u0001\u0000\u0000\u00008\u0105\u0001\u0000"+
		"\u0000\u0000:\u0120\u0001\u0000\u0000\u0000<=\u0003\u0002\u0001\u0000"+
		"=>\u0003\u0000\u0000\u0000>A\u0001\u0000\u0000\u0000?A\u0001\u0000\u0000"+
		"\u0000@<\u0001\u0000\u0000\u0000@?\u0001\u0000\u0000\u0000A\u0001\u0001"+
		"\u0000\u0000\u0000BL\u0003\n\u0005\u0000CL\u0003\u0012\t\u0000DL\u0003"+
		"\u001c\u000e\u0000EL\u0003&\u0013\u0000FL\u0003,\u0016\u0000GL\u0003."+
		"\u0017\u0000HL\u00032\u0019\u0000IL\u00034\u001a\u0000JL\u00036\u001b"+
		"\u0000KB\u0001\u0000\u0000\u0000KC\u0001\u0000\u0000\u0000KD\u0001\u0000"+
		"\u0000\u0000KE\u0001\u0000\u0000\u0000KF\u0001\u0000\u0000\u0000KG\u0001"+
		"\u0000\u0000\u0000KH\u0001\u0000\u0000\u0000KI\u0001\u0000\u0000\u0000"+
		"KJ\u0001\u0000\u0000\u0000L\u0003\u0001\u0000\u0000\u0000MN\u0007\u0000"+
		"\u0000\u0000N\u0005\u0001\u0000\u0000\u0000OP\u0007\u0001\u0000\u0000"+
		"P\u0007\u0001\u0000\u0000\u0000QR\u0005\u0006\u0000\u0000RS\u0003\u0000"+
		"\u0000\u0000ST\u0005\u0007\u0000\u0000T\t\u0001\u0000\u0000\u0000UV\u0003"+
		"\u0004\u0002\u0000VW\u0003\f\u0006\u0000WX\u0005\n\u0000\u0000X\u000b"+
		"\u0001\u0000\u0000\u0000YZ\u0003\u000e\u0007\u0000Z[\u0005\u0014\u0000"+
		"\u0000[\\\u0003\f\u0006\u0000\\d\u0001\u0000\u0000\u0000]^\u0003\u0010"+
		"\b\u0000^_\u0005\u0014\u0000\u0000_`\u0003\f\u0006\u0000`d\u0001\u0000"+
		"\u0000\u0000ad\u0003\u000e\u0007\u0000bd\u0003\u0010\b\u0000cY\u0001\u0000"+
		"\u0000\u0000c]\u0001\u0000\u0000\u0000ca\u0001\u0000\u0000\u0000cb\u0001"+
		"\u0000\u0000\u0000d\r\u0001\u0000\u0000\u0000ef\u0005%\u0000\u0000fg\u0005"+
		"\u0010\u0000\u0000go\u0005\u0015\u0000\u0000hi\u0005%\u0000\u0000ij\u0005"+
		"\u0010\u0000\u0000jo\u0005%\u0000\u0000kl\u0005%\u0000\u0000lm\u0005\u0010"+
		"\u0000\u0000mo\u0005&\u0000\u0000ne\u0001\u0000\u0000\u0000nh\u0001\u0000"+
		"\u0000\u0000nk\u0001\u0000\u0000\u0000o\u000f\u0001\u0000\u0000\u0000"+
		"pq\u0005%\u0000\u0000q\u0011\u0001\u0000\u0000\u0000rs\u0003\u0014\n\u0000"+
		"st\u0005\n\u0000\u0000t\u0013\u0001\u0000\u0000\u0000uv\u0006\n\uffff"+
		"\uffff\u0000vw\u0003\u0016\u000b\u0000wx\u0003\u0018\f\u0000xy\u0003\u0016"+
		"\u000b\u0000y\u007f\u0001\u0000\u0000\u0000z{\u0005\b\u0000\u0000{|\u0003"+
		"\u0014\n\u0000|}\u0005\t\u0000\u0000}\u007f\u0001\u0000\u0000\u0000~u"+
		"\u0001\u0000\u0000\u0000~z\u0001\u0000\u0000\u0000\u007f\u0086\u0001\u0000"+
		"\u0000\u0000\u0080\u0081\n\u0001\u0000\u0000\u0081\u0082\u0003\u001a\r"+
		"\u0000\u0082\u0083\u0003\u0014\n\u0002\u0083\u0085\u0001\u0000\u0000\u0000"+
		"\u0084\u0080\u0001\u0000\u0000\u0000\u0085\u0088\u0001\u0000\u0000\u0000"+
		"\u0086\u0084\u0001\u0000\u0000\u0000\u0086\u0087\u0001\u0000\u0000\u0000"+
		"\u0087\u0015\u0001\u0000\u0000\u0000\u0088\u0086\u0001\u0000\u0000\u0000"+
		"\u0089\u008a\u0007\u0002\u0000\u0000\u008a\u0017\u0001\u0000\u0000\u0000"+
		"\u008b\u008c\u0007\u0003\u0000\u0000\u008c\u0019\u0001\u0000\u0000\u0000"+
		"\u008d\u0091\u0005\u001d\u0000\u0000\u008e\u0091\u0001\u0000\u0000\u0000"+
		"\u008f\u0091\u0005\u001e\u0000\u0000\u0090\u008d\u0001\u0000\u0000\u0000"+
		"\u0090\u008e\u0001\u0000\u0000\u0000\u0090\u008f\u0001\u0000\u0000\u0000"+
		"\u0091\u001b\u0001\u0000\u0000\u0000\u0092\u0093\u0003\u001e\u000f\u0000"+
		"\u0093\u0094\u0005\n\u0000\u0000\u0094\u001d\u0001\u0000\u0000\u0000\u0095"+
		"\u009b\u0003 \u0010\u0000\u0096\u0097\u0003$\u0012\u0000\u0097\u0098\u0003"+
		"\u001e\u000f\u0000\u0098\u009a\u0001\u0000\u0000\u0000\u0099\u0096\u0001"+
		"\u0000\u0000\u0000\u009a\u009d\u0001\u0000\u0000\u0000\u009b\u0099\u0001"+
		"\u0000\u0000\u0000\u009b\u009c\u0001\u0000\u0000\u0000\u009c\u001f\u0001"+
		"\u0000\u0000\u0000\u009d\u009b\u0001\u0000\u0000\u0000\u009e\u00a4\u0003"+
		"\"\u0011\u0000\u009f\u00a0\u0005\b\u0000\u0000\u00a0\u00a1\u0003\u001e"+
		"\u000f\u0000\u00a1\u00a2\u0005\t\u0000\u0000\u00a2\u00a4\u0001\u0000\u0000"+
		"\u0000\u00a3\u009e\u0001\u0000\u0000\u0000\u00a3\u009f\u0001\u0000\u0000"+
		"\u0000\u00a4!\u0001\u0000\u0000\u0000\u00a5\u00a6\u0007\u0004\u0000\u0000"+
		"\u00a6#\u0001\u0000\u0000\u0000\u00a7\u00a8\u0007\u0005\u0000\u0000\u00a8"+
		"%\u0001\u0000\u0000\u0000\u00a9\u00aa\u0003\u0006\u0003\u0000\u00aa\u00ab"+
		"\u0005%\u0000\u0000\u00ab\u00ad\u0005\b\u0000\u0000\u00ac\u00ae\u0003"+
		"(\u0014\u0000\u00ad\u00ac\u0001\u0000\u0000\u0000\u00ad\u00ae\u0001\u0000"+
		"\u0000\u0000\u00ae\u00af\u0001\u0000\u0000\u0000\u00af\u00b0\u0005\t\u0000"+
		"\u0000\u00b0\u00b1\u0005\n\u0000\u0000\u00b1\'\u0001\u0000\u0000\u0000"+
		"\u00b2\u00b7\u0003*\u0015\u0000\u00b3\u00b4\u0005\u0014\u0000\u0000\u00b4"+
		"\u00b6\u0003(\u0014\u0000\u00b5\u00b3\u0001\u0000\u0000\u0000\u00b6\u00b9"+
		"\u0001\u0000\u0000\u0000\u00b7\u00b5\u0001\u0000\u0000\u0000\u00b7\u00b8"+
		"\u0001\u0000\u0000\u0000\u00b8)\u0001\u0000\u0000\u0000\u00b9\u00b7\u0001"+
		"\u0000\u0000\u0000\u00ba\u00bb\u0003\u0006\u0003\u0000\u00bb\u00be\u0005"+
		"%\u0000\u0000\u00bc\u00bd\u0005\u0010\u0000\u0000\u00bd\u00bf\u0007\u0006"+
		"\u0000\u0000\u00be\u00bc\u0001\u0000\u0000\u0000\u00be\u00bf\u0001\u0000"+
		"\u0000\u0000\u00bf+\u0001\u0000\u0000\u0000\u00c0\u00c1\u0003\u0006\u0003"+
		"\u0000\u00c1\u00c2\u0005%\u0000\u0000\u00c2\u00c3\u0005\b\u0000\u0000"+
		"\u00c3\u00c4\u0003(\u0014\u0000\u00c4\u00c5\u0005\t\u0000\u0000\u00c5"+
		"\u00c6\u0003\b\u0004\u0000\u00c6-\u0001\u0000\u0000\u0000\u00c7\u00c8"+
		"\u0005%\u0000\u0000\u00c8\u00ca\u0005\b\u0000\u0000\u00c9\u00cb\u0003"+
		"0\u0018\u0000\u00ca\u00c9\u0001\u0000\u0000\u0000\u00ca\u00cb\u0001\u0000"+
		"\u0000\u0000\u00cb\u00cc\u0001\u0000\u0000\u0000\u00cc\u00cd\u0005\t\u0000"+
		"\u0000\u00cd\u00ce\u0005\n\u0000\u0000\u00ce/\u0001\u0000\u0000\u0000"+
		"\u00cf\u00d0\u0007\u0002\u0000\u0000\u00d0\u00d1\u0005\u0014\u0000\u0000"+
		"\u00d1\u00d4\u00030\u0018\u0000\u00d2\u00d4\u0007\u0002\u0000\u0000\u00d3"+
		"\u00cf\u0001\u0000\u0000\u0000\u00d3\u00d2\u0001\u0000\u0000\u0000\u00d4"+
		"1\u0001\u0000\u0000\u0000\u00d5\u00d6\u0005\u001f\u0000\u0000\u00d6\u00d7"+
		"\u0005\b\u0000\u0000\u00d7\u00d8\u0003\u0014\n\u0000\u00d8\u00d9\u0005"+
		"\t\u0000\u0000\u00d9\u00da\u0003\b\u0004\u0000\u00da\u00f2\u0001\u0000"+
		"\u0000\u0000\u00db\u00dc\u0005\u001f\u0000\u0000\u00dc\u00dd\u0005\b\u0000"+
		"\u0000\u00dd\u00de\u0003\u0014\n\u0000\u00de\u00df\u0005\t\u0000\u0000"+
		"\u00df\u00e0\u0003\u0002\u0001\u0000\u00e0\u00f2\u0001\u0000\u0000\u0000"+
		"\u00e1\u00e2\u0005\u001f\u0000\u0000\u00e2\u00e3\u0005\b\u0000\u0000\u00e3"+
		"\u00e4\u0003\u0014\n\u0000\u00e4\u00e5\u0005\t\u0000\u0000\u00e5\u00e6"+
		"\u0003\b\u0004\u0000\u00e6\u00e7\u0005 \u0000\u0000\u00e7\u00e8\u0003"+
		"\b\u0004\u0000\u00e8\u00f2\u0001\u0000\u0000\u0000\u00e9\u00ea\u0005\u001f"+
		"\u0000\u0000\u00ea\u00eb\u0005\b\u0000\u0000\u00eb\u00ec\u0003\u0014\n"+
		"\u0000\u00ec\u00ed\u0005\t\u0000\u0000\u00ed\u00ee\u0003\b\u0004\u0000"+
		"\u00ee\u00ef\u0005 \u0000\u0000\u00ef\u00f0\u0003\u0002\u0001\u0000\u00f0"+
		"\u00f2\u0001\u0000\u0000\u0000\u00f1\u00d5\u0001\u0000\u0000\u0000\u00f1"+
		"\u00db\u0001\u0000\u0000\u0000\u00f1\u00e1\u0001\u0000\u0000\u0000\u00f1"+
		"\u00e9\u0001\u0000\u0000\u0000\u00f23\u0001\u0000\u0000\u0000\u00f3\u00f4"+
		"\u0005\"\u0000\u0000\u00f4\u00f5\u0005\b\u0000\u0000\u00f5\u00f6\u0003"+
		"\u0014\n\u0000\u00f6\u00f7\u0005\t\u0000\u0000\u00f7\u00f8\u0003\b\u0004"+
		"\u0000\u00f85\u0001\u0000\u0000\u0000\u00f9\u00fa\u0005!\u0000\u0000\u00fa"+
		"\u00fc\u0005\b\u0000\u0000\u00fb\u00fd\u00038\u001c\u0000\u00fc\u00fb"+
		"\u0001\u0000\u0000\u0000\u00fc\u00fd\u0001\u0000\u0000\u0000\u00fd\u00fe"+
		"\u0001\u0000\u0000\u0000\u00fe\u00ff\u0005\n\u0000\u0000\u00ff\u0100\u0003"+
		"\u0014\n\u0000\u0100\u0101\u0005\n\u0000\u0000\u0101\u0102\u0003:\u001d"+
		"\u0000\u0102\u0103\u0005\t\u0000\u0000\u0103\u0104\u0003\b\u0004\u0000"+
		"\u01047\u0001\u0000\u0000\u0000\u0105\u0106\u0003\u0004\u0002\u0000\u0106"+
		"\u010b\u0003\u000e\u0007\u0000\u0107\u0108\u0005\u0014\u0000\u0000\u0108"+
		"\u010a\u0003\u000e\u0007\u0000\u0109\u0107\u0001\u0000\u0000\u0000\u010a"+
		"\u010d\u0001\u0000\u0000\u0000\u010b\u0109\u0001\u0000\u0000\u0000\u010b"+
		"\u010c\u0001\u0000\u0000\u0000\u010c9\u0001\u0000\u0000\u0000\u010d\u010b"+
		"\u0001\u0000\u0000\u0000\u010e\u010f\u0005%\u0000\u0000\u010f\u0114\u0005"+
		"\u0011\u0000\u0000\u0110\u0111\u0005\u0014\u0000\u0000\u0111\u0113\u0003"+
		":\u001d\u0000\u0112\u0110\u0001\u0000\u0000\u0000\u0113\u0116\u0001\u0000"+
		"\u0000\u0000\u0114\u0112\u0001\u0000\u0000\u0000\u0114\u0115\u0001\u0000"+
		"\u0000\u0000\u0115\u0121\u0001\u0000\u0000\u0000\u0116\u0114\u0001\u0000"+
		"\u0000\u0000\u0117\u0118\u0005%\u0000\u0000\u0118\u011d\u0005\u0012\u0000"+
		"\u0000\u0119\u011a\u0005\u0014\u0000\u0000\u011a\u011c\u0003:\u001d\u0000"+
		"\u011b\u0119\u0001\u0000\u0000\u0000\u011c\u011f\u0001\u0000\u0000\u0000"+
		"\u011d\u011b\u0001\u0000\u0000\u0000\u011d\u011e\u0001\u0000\u0000\u0000"+
		"\u011e\u0121\u0001\u0000\u0000\u0000\u011f\u011d\u0001\u0000\u0000\u0000"+
		"\u0120\u010e\u0001\u0000\u0000\u0000\u0120\u0117\u0001\u0000\u0000\u0000"+
		"\u0121;\u0001\u0000\u0000\u0000\u0014@Kcn~\u0086\u0090\u009b\u00a3\u00ad"+
		"\u00b7\u00be\u00ca\u00d3\u00f1\u00fc\u010b\u0114\u011d\u0120";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}