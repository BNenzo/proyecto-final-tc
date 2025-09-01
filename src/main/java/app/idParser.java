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
		DECREMENTADOR=18, COMILLA=19, COMA=20, CADENA=21, CARACTER=22, OPERADORES_NUMERICOS=23, 
		MAYOR=24, MENOR=25, MAYOR_IGUAL=26, MENOR_IGUAL=27, IGUAL=28, DISTINTO=29, 
		AND=30, OR=31, IF=32, ELSE=33, FOR=34, WHILE=35, BREAK=36, CONTINUE=37, 
		RETURN=38, IDENTIFICADOR=39, NUMERO=40, OTRO=41;
	public static final int
		RULE_s = 0, RULE_instrucciones = 1, RULE_instruccion = 2, RULE_tipo_variable = 3, 
		RULE_tipo_funciones = 4, RULE_bloque = 5, RULE_declaracion_variable = 6, 
		RULE_declaracion_variable_declaradores = 7, RULE_declarador_inicializado = 8, 
		RULE_declarador_simple = 9, RULE_asignacion_variable = 10, RULE_asignacion_variable_identificador = 11, 
		RULE_operacion_logica = 12, RULE_expresion_booleana = 13, RULE_termino_comparacion = 14, 
		RULE_identificador_logico = 15, RULE_operador_comparacion = 16, RULE_operador_logico = 17, 
		RULE_operacion_aritmetica = 18, RULE_expresion_aritmetica = 19, RULE_termino_aritmetico = 20, 
		RULE_factor = 21, RULE_identificador_aritmetico = 22, RULE_declaracion_funcion = 23, 
		RULE_declaracion_funcion_identificador = 24, RULE_declaracion_funciones_parametros = 25, 
		RULE_declaracion_funcion_parametro = 26, RULE_declaracion_funcion_parametro_inicializado = 27, 
		RULE_definicion_funcion = 28, RULE_definicion_funcion_nombre = 29, RULE_definicion_funcion_parametros = 30, 
		RULE_definicion_funcion_parametro = 31, RULE_definicion_funcion_parametro_nombre = 32, 
		RULE_llamada_funcion = 33, RULE_llamada_funcion_expresion = 34, RULE_llamada_nombre_funcion = 35, 
		RULE_llamada_funcion_parametros = 36, RULE_llamada_funcion_argumentos = 37, 
		RULE_llamada_funcion_argumento_identificador = 38, RULE_if = 39, RULE_while = 40, 
		RULE_for = 41, RULE_for_declaracion = 42, RULE_for_autoincremental = 43, 
		RULE_return = 44, RULE_return_variables = 45, RULE_return_variable_identificador = 46;
	private static String[] makeRuleNames() {
		return new String[] {
			"s", "instrucciones", "instruccion", "tipo_variable", "tipo_funciones", 
			"bloque", "declaracion_variable", "declaracion_variable_declaradores", 
			"declarador_inicializado", "declarador_simple", "asignacion_variable", 
			"asignacion_variable_identificador", "operacion_logica", "expresion_booleana", 
			"termino_comparacion", "identificador_logico", "operador_comparacion", 
			"operador_logico", "operacion_aritmetica", "expresion_aritmetica", "termino_aritmetico", 
			"factor", "identificador_aritmetico", "declaracion_funcion", "declaracion_funcion_identificador", 
			"declaracion_funciones_parametros", "declaracion_funcion_parametro", 
			"declaracion_funcion_parametro_inicializado", "definicion_funcion", "definicion_funcion_nombre", 
			"definicion_funcion_parametros", "definicion_funcion_parametro", "definicion_funcion_parametro_nombre", 
			"llamada_funcion", "llamada_funcion_expresion", "llamada_nombre_funcion", 
			"llamada_funcion_parametros", "llamada_funcion_argumentos", "llamada_funcion_argumento_identificador", 
			"if", "while", "for", "for_declaracion", "for_autoincremental", "return", 
			"return_variables", "return_variable_identificador"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, null, "'int'", "'char'", "'double'", "'void'", "'{'", "'}'", "'('", 
			"')'", "';'", "'+'", "'-'", "'*'", "'%'", "'/'", "'='", "'++'", "'--'", 
			"'\"'", "','", null, null, null, "'>'", "'<'", "'>='", "'<='", "'=='", 
			"'!='", "'&&'", "'||'", "'if'", "'else'", "'for'", "'while'", "'break'", 
			"'continue'", "'return'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "WS", "INT", "CHAR", "DOUBLE", "VOID", "LLAVE_APERTURA", "LLAVE_CLAUSURA", 
			"PARENTESIS_APERTURA", "PARENTESIS_CLAUSURA", "PUNTO_COMA", "SUMA", "RESTA", 
			"MULTIPLICAR", "MODULO", "DIVISION", "EQUAL", "INCREMENTADOR", "DECREMENTADOR", 
			"COMILLA", "COMA", "CADENA", "CARACTER", "OPERADORES_NUMERICOS", "MAYOR", 
			"MENOR", "MAYOR_IGUAL", "MENOR_IGUAL", "IGUAL", "DISTINTO", "AND", "OR", 
			"IF", "ELSE", "FOR", "WHILE", "BREAK", "CONTINUE", "RETURN", "IDENTIFICADOR", 
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
		public InstruccionesContext instrucciones() {
			return getRuleContext(InstruccionesContext.class,0);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof idVisitor ) return ((idVisitor<? extends T>)visitor).visitS(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SContext s() throws RecognitionException {
		SContext _localctx = new SContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_s);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(94);
			instrucciones();
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
	public static class InstruccionesContext extends ParserRuleContext {
		public InstruccionContext instruccion() {
			return getRuleContext(InstruccionContext.class,0);
		}
		public InstruccionesContext instrucciones() {
			return getRuleContext(InstruccionesContext.class,0);
		}
		public InstruccionesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_instrucciones; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof idListener ) ((idListener)listener).enterInstrucciones(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof idListener ) ((idListener)listener).exitInstrucciones(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof idVisitor ) return ((idVisitor<? extends T>)visitor).visitInstrucciones(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InstruccionesContext instrucciones() throws RecognitionException {
		InstruccionesContext _localctx = new InstruccionesContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_instrucciones);
		try {
			setState(100);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INT:
			case CHAR:
			case DOUBLE:
			case VOID:
			case LLAVE_APERTURA:
			case PARENTESIS_APERTURA:
			case CADENA:
			case IF:
			case FOR:
			case WHILE:
			case RETURN:
			case IDENTIFICADOR:
			case NUMERO:
				enterOuterAlt(_localctx, 1);
				{
				setState(96);
				instruccion();
				setState(97);
				instrucciones();
				}
				break;
			case EOF:
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
		public Declaracion_variableContext declaracion_variable() {
			return getRuleContext(Declaracion_variableContext.class,0);
		}
		public Asignacion_variableContext asignacion_variable() {
			return getRuleContext(Asignacion_variableContext.class,0);
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
		public BloqueContext bloque() {
			return getRuleContext(BloqueContext.class,0);
		}
		public ReturnContext return_() {
			return getRuleContext(ReturnContext.class,0);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof idVisitor ) return ((idVisitor<? extends T>)visitor).visitInstruccion(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InstruccionContext instruccion() throws RecognitionException {
		InstruccionContext _localctx = new InstruccionContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_instruccion);
		try {
			setState(114);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(102);
				declaracion_variable();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(103);
				asignacion_variable();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(104);
				operacion_logica();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(105);
				operacion_aritmetica();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(106);
				declaracion_funcion();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(107);
				definicion_funcion();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(108);
				llamada_funcion();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(109);
				if_();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(110);
				while_();
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(111);
				for_();
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(112);
				bloque();
				}
				break;
			case 12:
				enterOuterAlt(_localctx, 12);
				{
				setState(113);
				return_();
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof idVisitor ) return ((idVisitor<? extends T>)visitor).visitTipo_variable(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Tipo_variableContext tipo_variable() throws RecognitionException {
		Tipo_variableContext _localctx = new Tipo_variableContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_tipo_variable);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(116);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof idVisitor ) return ((idVisitor<? extends T>)visitor).visitTipo_funciones(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Tipo_funcionesContext tipo_funciones() throws RecognitionException {
		Tipo_funcionesContext _localctx = new Tipo_funcionesContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_tipo_funciones);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(118);
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
		public InstruccionesContext instrucciones() {
			return getRuleContext(InstruccionesContext.class,0);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof idVisitor ) return ((idVisitor<? extends T>)visitor).visitBloque(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BloqueContext bloque() throws RecognitionException {
		BloqueContext _localctx = new BloqueContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_bloque);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(120);
			match(LLAVE_APERTURA);
			setState(121);
			instrucciones();
			setState(122);
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
	public static class Declaracion_variableContext extends ParserRuleContext {
		public Tipo_variableContext tipo_variable() {
			return getRuleContext(Tipo_variableContext.class,0);
		}
		public Declaracion_variable_declaradoresContext declaracion_variable_declaradores() {
			return getRuleContext(Declaracion_variable_declaradoresContext.class,0);
		}
		public TerminalNode PUNTO_COMA() { return getToken(idParser.PUNTO_COMA, 0); }
		public Declaracion_variableContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declaracion_variable; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof idListener ) ((idListener)listener).enterDeclaracion_variable(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof idListener ) ((idListener)listener).exitDeclaracion_variable(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof idVisitor ) return ((idVisitor<? extends T>)visitor).visitDeclaracion_variable(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Declaracion_variableContext declaracion_variable() throws RecognitionException {
		Declaracion_variableContext _localctx = new Declaracion_variableContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_declaracion_variable);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(124);
			tipo_variable();
			setState(125);
			declaracion_variable_declaradores();
			setState(126);
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
	public static class Declaracion_variable_declaradoresContext extends ParserRuleContext {
		public Declarador_inicializadoContext declarador_inicializado() {
			return getRuleContext(Declarador_inicializadoContext.class,0);
		}
		public TerminalNode COMA() { return getToken(idParser.COMA, 0); }
		public Declaracion_variable_declaradoresContext declaracion_variable_declaradores() {
			return getRuleContext(Declaracion_variable_declaradoresContext.class,0);
		}
		public Declarador_simpleContext declarador_simple() {
			return getRuleContext(Declarador_simpleContext.class,0);
		}
		public Declaracion_variable_declaradoresContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declaracion_variable_declaradores; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof idListener ) ((idListener)listener).enterDeclaracion_variable_declaradores(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof idListener ) ((idListener)listener).exitDeclaracion_variable_declaradores(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof idVisitor ) return ((idVisitor<? extends T>)visitor).visitDeclaracion_variable_declaradores(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Declaracion_variable_declaradoresContext declaracion_variable_declaradores() throws RecognitionException {
		Declaracion_variable_declaradoresContext _localctx = new Declaracion_variable_declaradoresContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_declaracion_variable_declaradores);
		try {
			setState(138);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(128);
				declarador_inicializado();
				setState(129);
				match(COMA);
				setState(130);
				declaracion_variable_declaradores();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(132);
				declarador_simple();
				setState(133);
				match(COMA);
				setState(134);
				declaracion_variable_declaradores();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(136);
				declarador_inicializado();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(137);
				declarador_simple();
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
	public static class Declarador_inicializadoContext extends ParserRuleContext {
		public List<TerminalNode> IDENTIFICADOR() { return getTokens(idParser.IDENTIFICADOR); }
		public TerminalNode IDENTIFICADOR(int i) {
			return getToken(idParser.IDENTIFICADOR, i);
		}
		public TerminalNode EQUAL() { return getToken(idParser.EQUAL, 0); }
		public TerminalNode CARACTER() { return getToken(idParser.CARACTER, 0); }
		public TerminalNode NUMERO() { return getToken(idParser.NUMERO, 0); }
		public Expresion_booleanaContext expresion_booleana() {
			return getRuleContext(Expresion_booleanaContext.class,0);
		}
		public Expresion_aritmeticaContext expresion_aritmetica() {
			return getRuleContext(Expresion_aritmeticaContext.class,0);
		}
		public Declarador_inicializadoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declarador_inicializado; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof idListener ) ((idListener)listener).enterDeclarador_inicializado(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof idListener ) ((idListener)listener).exitDeclarador_inicializado(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof idVisitor ) return ((idVisitor<? extends T>)visitor).visitDeclarador_inicializado(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Declarador_inicializadoContext declarador_inicializado() throws RecognitionException {
		Declarador_inicializadoContext _localctx = new Declarador_inicializadoContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_declarador_inicializado);
		try {
			setState(155);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(140);
				match(IDENTIFICADOR);
				setState(141);
				match(EQUAL);
				setState(142);
				match(CARACTER);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(143);
				match(IDENTIFICADOR);
				setState(144);
				match(EQUAL);
				setState(145);
				match(IDENTIFICADOR);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(146);
				match(IDENTIFICADOR);
				setState(147);
				match(EQUAL);
				setState(148);
				match(NUMERO);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(149);
				match(IDENTIFICADOR);
				setState(150);
				match(EQUAL);
				setState(151);
				expresion_booleana(0);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(152);
				match(IDENTIFICADOR);
				setState(153);
				match(EQUAL);
				setState(154);
				expresion_aritmetica();
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
	public static class Declarador_simpleContext extends ParserRuleContext {
		public TerminalNode IDENTIFICADOR() { return getToken(idParser.IDENTIFICADOR, 0); }
		public Declarador_simpleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declarador_simple; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof idListener ) ((idListener)listener).enterDeclarador_simple(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof idListener ) ((idListener)listener).exitDeclarador_simple(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof idVisitor ) return ((idVisitor<? extends T>)visitor).visitDeclarador_simple(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Declarador_simpleContext declarador_simple() throws RecognitionException {
		Declarador_simpleContext _localctx = new Declarador_simpleContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_declarador_simple);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(157);
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
	public static class Asignacion_variableContext extends ParserRuleContext {
		public Asignacion_variable_identificadorContext asignacion_variable_identificador() {
			return getRuleContext(Asignacion_variable_identificadorContext.class,0);
		}
		public TerminalNode EQUAL() { return getToken(idParser.EQUAL, 0); }
		public TerminalNode PUNTO_COMA() { return getToken(idParser.PUNTO_COMA, 0); }
		public TerminalNode NUMERO() { return getToken(idParser.NUMERO, 0); }
		public TerminalNode CARACTER() { return getToken(idParser.CARACTER, 0); }
		public Expresion_aritmeticaContext expresion_aritmetica() {
			return getRuleContext(Expresion_aritmeticaContext.class,0);
		}
		public Expresion_booleanaContext expresion_booleana() {
			return getRuleContext(Expresion_booleanaContext.class,0);
		}
		public Llamada_funcion_expresionContext llamada_funcion_expresion() {
			return getRuleContext(Llamada_funcion_expresionContext.class,0);
		}
		public Asignacion_variableContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_asignacion_variable; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof idListener ) ((idListener)listener).enterAsignacion_variable(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof idListener ) ((idListener)listener).exitAsignacion_variable(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof idVisitor ) return ((idVisitor<? extends T>)visitor).visitAsignacion_variable(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Asignacion_variableContext asignacion_variable() throws RecognitionException {
		Asignacion_variableContext _localctx = new Asignacion_variableContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_asignacion_variable);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(159);
			asignacion_variable_identificador();
			setState(160);
			match(EQUAL);
			setState(166);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
			case 1:
				{
				setState(161);
				match(NUMERO);
				}
				break;
			case 2:
				{
				setState(162);
				match(CARACTER);
				}
				break;
			case 3:
				{
				setState(163);
				expresion_aritmetica();
				}
				break;
			case 4:
				{
				setState(164);
				expresion_booleana(0);
				}
				break;
			case 5:
				{
				setState(165);
				llamada_funcion_expresion();
				}
				break;
			}
			setState(168);
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
	public static class Asignacion_variable_identificadorContext extends ParserRuleContext {
		public TerminalNode IDENTIFICADOR() { return getToken(idParser.IDENTIFICADOR, 0); }
		public Asignacion_variable_identificadorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_asignacion_variable_identificador; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof idListener ) ((idListener)listener).enterAsignacion_variable_identificador(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof idListener ) ((idListener)listener).exitAsignacion_variable_identificador(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof idVisitor ) return ((idVisitor<? extends T>)visitor).visitAsignacion_variable_identificador(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Asignacion_variable_identificadorContext asignacion_variable_identificador() throws RecognitionException {
		Asignacion_variable_identificadorContext _localctx = new Asignacion_variable_identificadorContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_asignacion_variable_identificador);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(170);
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
		public Expresion_booleanaContext expresion_booleana() {
			return getRuleContext(Expresion_booleanaContext.class,0);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof idVisitor ) return ((idVisitor<? extends T>)visitor).visitOperacion_logica(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Operacion_logicaContext operacion_logica() throws RecognitionException {
		Operacion_logicaContext _localctx = new Operacion_logicaContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_operacion_logica);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(172);
			expresion_booleana(0);
			setState(173);
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
	public static class Expresion_booleanaContext extends ParserRuleContext {
		public List<Termino_comparacionContext> termino_comparacion() {
			return getRuleContexts(Termino_comparacionContext.class);
		}
		public Termino_comparacionContext termino_comparacion(int i) {
			return getRuleContext(Termino_comparacionContext.class,i);
		}
		public Operador_comparacionContext operador_comparacion() {
			return getRuleContext(Operador_comparacionContext.class,0);
		}
		public TerminalNode PARENTESIS_APERTURA() { return getToken(idParser.PARENTESIS_APERTURA, 0); }
		public List<Expresion_booleanaContext> expresion_booleana() {
			return getRuleContexts(Expresion_booleanaContext.class);
		}
		public Expresion_booleanaContext expresion_booleana(int i) {
			return getRuleContext(Expresion_booleanaContext.class,i);
		}
		public TerminalNode PARENTESIS_CLAUSURA() { return getToken(idParser.PARENTESIS_CLAUSURA, 0); }
		public Operador_logicoContext operador_logico() {
			return getRuleContext(Operador_logicoContext.class,0);
		}
		public Expresion_booleanaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expresion_booleana; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof idListener ) ((idListener)listener).enterExpresion_booleana(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof idListener ) ((idListener)listener).exitExpresion_booleana(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof idVisitor ) return ((idVisitor<? extends T>)visitor).visitExpresion_booleana(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Expresion_booleanaContext expresion_booleana() throws RecognitionException {
		return expresion_booleana(0);
	}

	private Expresion_booleanaContext expresion_booleana(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		Expresion_booleanaContext _localctx = new Expresion_booleanaContext(_ctx, _parentState);
		Expresion_booleanaContext _prevctx = _localctx;
		int _startState = 26;
		enterRecursionRule(_localctx, 26, RULE_expresion_booleana, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(184);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case CADENA:
			case IDENTIFICADOR:
			case NUMERO:
				{
				setState(176);
				termino_comparacion();
				setState(177);
				operador_comparacion();
				setState(178);
				termino_comparacion();
				}
				break;
			case PARENTESIS_APERTURA:
				{
				setState(180);
				match(PARENTESIS_APERTURA);
				setState(181);
				expresion_booleana(0);
				setState(182);
				match(PARENTESIS_CLAUSURA);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(192);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,6,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new Expresion_booleanaContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_expresion_booleana);
					setState(186);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(187);
					operador_logico();
					setState(188);
					expresion_booleana(2);
					}
					} 
				}
				setState(194);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,6,_ctx);
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
	public static class Termino_comparacionContext extends ParserRuleContext {
		public TerminalNode CADENA() { return getToken(idParser.CADENA, 0); }
		public Identificador_logicoContext identificador_logico() {
			return getRuleContext(Identificador_logicoContext.class,0);
		}
		public TerminalNode NUMERO() { return getToken(idParser.NUMERO, 0); }
		public Termino_comparacionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_termino_comparacion; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof idListener ) ((idListener)listener).enterTermino_comparacion(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof idListener ) ((idListener)listener).exitTermino_comparacion(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof idVisitor ) return ((idVisitor<? extends T>)visitor).visitTermino_comparacion(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Termino_comparacionContext termino_comparacion() throws RecognitionException {
		Termino_comparacionContext _localctx = new Termino_comparacionContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_termino_comparacion);
		try {
			setState(198);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case CADENA:
				enterOuterAlt(_localctx, 1);
				{
				setState(195);
				match(CADENA);
				}
				break;
			case IDENTIFICADOR:
				enterOuterAlt(_localctx, 2);
				{
				setState(196);
				identificador_logico();
				}
				break;
			case NUMERO:
				enterOuterAlt(_localctx, 3);
				{
				setState(197);
				match(NUMERO);
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
	public static class Identificador_logicoContext extends ParserRuleContext {
		public TerminalNode IDENTIFICADOR() { return getToken(idParser.IDENTIFICADOR, 0); }
		public Identificador_logicoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_identificador_logico; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof idListener ) ((idListener)listener).enterIdentificador_logico(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof idListener ) ((idListener)listener).exitIdentificador_logico(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof idVisitor ) return ((idVisitor<? extends T>)visitor).visitIdentificador_logico(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Identificador_logicoContext identificador_logico() throws RecognitionException {
		Identificador_logicoContext _localctx = new Identificador_logicoContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_identificador_logico);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(200);
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
	public static class Operador_comparacionContext extends ParserRuleContext {
		public TerminalNode IGUAL() { return getToken(idParser.IGUAL, 0); }
		public TerminalNode DISTINTO() { return getToken(idParser.DISTINTO, 0); }
		public TerminalNode MAYOR() { return getToken(idParser.MAYOR, 0); }
		public TerminalNode MENOR() { return getToken(idParser.MENOR, 0); }
		public TerminalNode MAYOR_IGUAL() { return getToken(idParser.MAYOR_IGUAL, 0); }
		public TerminalNode MENOR_IGUAL() { return getToken(idParser.MENOR_IGUAL, 0); }
		public Operador_comparacionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_operador_comparacion; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof idListener ) ((idListener)listener).enterOperador_comparacion(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof idListener ) ((idListener)listener).exitOperador_comparacion(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof idVisitor ) return ((idVisitor<? extends T>)visitor).visitOperador_comparacion(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Operador_comparacionContext operador_comparacion() throws RecognitionException {
		Operador_comparacionContext _localctx = new Operador_comparacionContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_operador_comparacion);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(202);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 1056964608L) != 0)) ) {
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
		public TerminalNode AND() { return getToken(idParser.AND, 0); }
		public TerminalNode OR() { return getToken(idParser.OR, 0); }
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof idVisitor ) return ((idVisitor<? extends T>)visitor).visitOperador_logico(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Operador_logicoContext operador_logico() throws RecognitionException {
		Operador_logicoContext _localctx = new Operador_logicoContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_operador_logico);
		try {
			setState(207);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case AND:
				enterOuterAlt(_localctx, 1);
				{
				setState(204);
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
				setState(206);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof idVisitor ) return ((idVisitor<? extends T>)visitor).visitOperacion_aritmetica(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Operacion_aritmeticaContext operacion_aritmetica() throws RecognitionException {
		Operacion_aritmeticaContext _localctx = new Operacion_aritmeticaContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_operacion_aritmetica);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(209);
			expresion_aritmetica();
			setState(210);
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
		public List<Termino_aritmeticoContext> termino_aritmetico() {
			return getRuleContexts(Termino_aritmeticoContext.class);
		}
		public Termino_aritmeticoContext termino_aritmetico(int i) {
			return getRuleContext(Termino_aritmeticoContext.class,i);
		}
		public List<TerminalNode> SUMA() { return getTokens(idParser.SUMA); }
		public TerminalNode SUMA(int i) {
			return getToken(idParser.SUMA, i);
		}
		public List<TerminalNode> RESTA() { return getTokens(idParser.RESTA); }
		public TerminalNode RESTA(int i) {
			return getToken(idParser.RESTA, i);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof idVisitor ) return ((idVisitor<? extends T>)visitor).visitExpresion_aritmetica(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Expresion_aritmeticaContext expresion_aritmetica() throws RecognitionException {
		Expresion_aritmeticaContext _localctx = new Expresion_aritmeticaContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_expresion_aritmetica);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(212);
			termino_aritmetico();
			setState(217);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==SUMA || _la==RESTA) {
				{
				{
				setState(213);
				_la = _input.LA(1);
				if ( !(_la==SUMA || _la==RESTA) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(214);
				termino_aritmetico();
				}
				}
				setState(219);
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
	public static class Termino_aritmeticoContext extends ParserRuleContext {
		public List<FactorContext> factor() {
			return getRuleContexts(FactorContext.class);
		}
		public FactorContext factor(int i) {
			return getRuleContext(FactorContext.class,i);
		}
		public List<TerminalNode> MULTIPLICAR() { return getTokens(idParser.MULTIPLICAR); }
		public TerminalNode MULTIPLICAR(int i) {
			return getToken(idParser.MULTIPLICAR, i);
		}
		public List<TerminalNode> DIVISION() { return getTokens(idParser.DIVISION); }
		public TerminalNode DIVISION(int i) {
			return getToken(idParser.DIVISION, i);
		}
		public List<TerminalNode> MODULO() { return getTokens(idParser.MODULO); }
		public TerminalNode MODULO(int i) {
			return getToken(idParser.MODULO, i);
		}
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof idVisitor ) return ((idVisitor<? extends T>)visitor).visitTermino_aritmetico(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Termino_aritmeticoContext termino_aritmetico() throws RecognitionException {
		Termino_aritmeticoContext _localctx = new Termino_aritmeticoContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_termino_aritmetico);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(220);
			factor();
			setState(225);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 57344L) != 0)) {
				{
				{
				setState(221);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 57344L) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(222);
				factor();
				}
				}
				setState(227);
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
	public static class FactorContext extends ParserRuleContext {
		public TerminalNode NUMERO() { return getToken(idParser.NUMERO, 0); }
		public Identificador_aritmeticoContext identificador_aritmetico() {
			return getRuleContext(Identificador_aritmeticoContext.class,0);
		}
		public TerminalNode PARENTESIS_APERTURA() { return getToken(idParser.PARENTESIS_APERTURA, 0); }
		public Expresion_aritmeticaContext expresion_aritmetica() {
			return getRuleContext(Expresion_aritmeticaContext.class,0);
		}
		public TerminalNode PARENTESIS_CLAUSURA() { return getToken(idParser.PARENTESIS_CLAUSURA, 0); }
		public FactorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_factor; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof idListener ) ((idListener)listener).enterFactor(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof idListener ) ((idListener)listener).exitFactor(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof idVisitor ) return ((idVisitor<? extends T>)visitor).visitFactor(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FactorContext factor() throws RecognitionException {
		FactorContext _localctx = new FactorContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_factor);
		try {
			setState(234);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NUMERO:
				enterOuterAlt(_localctx, 1);
				{
				setState(228);
				match(NUMERO);
				}
				break;
			case IDENTIFICADOR:
				enterOuterAlt(_localctx, 2);
				{
				setState(229);
				identificador_aritmetico();
				}
				break;
			case PARENTESIS_APERTURA:
				enterOuterAlt(_localctx, 3);
				{
				setState(230);
				match(PARENTESIS_APERTURA);
				setState(231);
				expresion_aritmetica();
				setState(232);
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
	public static class Identificador_aritmeticoContext extends ParserRuleContext {
		public TerminalNode IDENTIFICADOR() { return getToken(idParser.IDENTIFICADOR, 0); }
		public Identificador_aritmeticoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_identificador_aritmetico; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof idListener ) ((idListener)listener).enterIdentificador_aritmetico(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof idListener ) ((idListener)listener).exitIdentificador_aritmetico(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof idVisitor ) return ((idVisitor<? extends T>)visitor).visitIdentificador_aritmetico(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Identificador_aritmeticoContext identificador_aritmetico() throws RecognitionException {
		Identificador_aritmeticoContext _localctx = new Identificador_aritmeticoContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_identificador_aritmetico);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(236);
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
	public static class Declaracion_funcionContext extends ParserRuleContext {
		public Tipo_funcionesContext tipo_funciones() {
			return getRuleContext(Tipo_funcionesContext.class,0);
		}
		public Declaracion_funcion_identificadorContext declaracion_funcion_identificador() {
			return getRuleContext(Declaracion_funcion_identificadorContext.class,0);
		}
		public TerminalNode PARENTESIS_APERTURA() { return getToken(idParser.PARENTESIS_APERTURA, 0); }
		public TerminalNode PARENTESIS_CLAUSURA() { return getToken(idParser.PARENTESIS_CLAUSURA, 0); }
		public TerminalNode PUNTO_COMA() { return getToken(idParser.PUNTO_COMA, 0); }
		public Declaracion_funciones_parametrosContext declaracion_funciones_parametros() {
			return getRuleContext(Declaracion_funciones_parametrosContext.class,0);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof idVisitor ) return ((idVisitor<? extends T>)visitor).visitDeclaracion_funcion(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Declaracion_funcionContext declaracion_funcion() throws RecognitionException {
		Declaracion_funcionContext _localctx = new Declaracion_funcionContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_declaracion_funcion);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(238);
			tipo_funciones();
			setState(239);
			declaracion_funcion_identificador();
			setState(240);
			match(PARENTESIS_APERTURA);
			setState(242);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 28L) != 0)) {
				{
				setState(241);
				declaracion_funciones_parametros();
				}
			}

			setState(244);
			match(PARENTESIS_CLAUSURA);
			setState(245);
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
	public static class Declaracion_funcion_identificadorContext extends ParserRuleContext {
		public TerminalNode IDENTIFICADOR() { return getToken(idParser.IDENTIFICADOR, 0); }
		public Declaracion_funcion_identificadorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declaracion_funcion_identificador; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof idListener ) ((idListener)listener).enterDeclaracion_funcion_identificador(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof idListener ) ((idListener)listener).exitDeclaracion_funcion_identificador(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof idVisitor ) return ((idVisitor<? extends T>)visitor).visitDeclaracion_funcion_identificador(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Declaracion_funcion_identificadorContext declaracion_funcion_identificador() throws RecognitionException {
		Declaracion_funcion_identificadorContext _localctx = new Declaracion_funcion_identificadorContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_declaracion_funcion_identificador);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(247);
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
	public static class Declaracion_funciones_parametrosContext extends ParserRuleContext {
		public List<Declaracion_funcion_parametroContext> declaracion_funcion_parametro() {
			return getRuleContexts(Declaracion_funcion_parametroContext.class);
		}
		public Declaracion_funcion_parametroContext declaracion_funcion_parametro(int i) {
			return getRuleContext(Declaracion_funcion_parametroContext.class,i);
		}
		public List<TerminalNode> COMA() { return getTokens(idParser.COMA); }
		public TerminalNode COMA(int i) {
			return getToken(idParser.COMA, i);
		}
		public Declaracion_funciones_parametrosContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declaracion_funciones_parametros; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof idListener ) ((idListener)listener).enterDeclaracion_funciones_parametros(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof idListener ) ((idListener)listener).exitDeclaracion_funciones_parametros(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof idVisitor ) return ((idVisitor<? extends T>)visitor).visitDeclaracion_funciones_parametros(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Declaracion_funciones_parametrosContext declaracion_funciones_parametros() throws RecognitionException {
		Declaracion_funciones_parametrosContext _localctx = new Declaracion_funciones_parametrosContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_declaracion_funciones_parametros);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(249);
			declaracion_funcion_parametro();
			setState(254);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMA) {
				{
				{
				setState(250);
				match(COMA);
				setState(251);
				declaracion_funcion_parametro();
				}
				}
				setState(256);
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
	public static class Declaracion_funcion_parametroContext extends ParserRuleContext {
		public Tipo_variableContext tipo_variable() {
			return getRuleContext(Tipo_variableContext.class,0);
		}
		public TerminalNode IDENTIFICADOR() { return getToken(idParser.IDENTIFICADOR, 0); }
		public Declaracion_funcion_parametro_inicializadoContext declaracion_funcion_parametro_inicializado() {
			return getRuleContext(Declaracion_funcion_parametro_inicializadoContext.class,0);
		}
		public Declaracion_funcion_parametroContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declaracion_funcion_parametro; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof idListener ) ((idListener)listener).enterDeclaracion_funcion_parametro(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof idListener ) ((idListener)listener).exitDeclaracion_funcion_parametro(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof idVisitor ) return ((idVisitor<? extends T>)visitor).visitDeclaracion_funcion_parametro(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Declaracion_funcion_parametroContext declaracion_funcion_parametro() throws RecognitionException {
		Declaracion_funcion_parametroContext _localctx = new Declaracion_funcion_parametroContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_declaracion_funcion_parametro);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(257);
			tipo_variable();
			setState(262);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==IDENTIFICADOR) {
				{
				setState(258);
				match(IDENTIFICADOR);
				setState(260);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==EQUAL) {
					{
					setState(259);
					declaracion_funcion_parametro_inicializado();
					}
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
	public static class Declaracion_funcion_parametro_inicializadoContext extends ParserRuleContext {
		public TerminalNode EQUAL() { return getToken(idParser.EQUAL, 0); }
		public TerminalNode CADENA() { return getToken(idParser.CADENA, 0); }
		public TerminalNode NUMERO() { return getToken(idParser.NUMERO, 0); }
		public Declaracion_funcion_parametro_inicializadoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declaracion_funcion_parametro_inicializado; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof idListener ) ((idListener)listener).enterDeclaracion_funcion_parametro_inicializado(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof idListener ) ((idListener)listener).exitDeclaracion_funcion_parametro_inicializado(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof idVisitor ) return ((idVisitor<? extends T>)visitor).visitDeclaracion_funcion_parametro_inicializado(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Declaracion_funcion_parametro_inicializadoContext declaracion_funcion_parametro_inicializado() throws RecognitionException {
		Declaracion_funcion_parametro_inicializadoContext _localctx = new Declaracion_funcion_parametro_inicializadoContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_declaracion_funcion_parametro_inicializado);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(264);
			match(EQUAL);
			setState(265);
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
		public Definicion_funcion_nombreContext definicion_funcion_nombre() {
			return getRuleContext(Definicion_funcion_nombreContext.class,0);
		}
		public TerminalNode PARENTESIS_APERTURA() { return getToken(idParser.PARENTESIS_APERTURA, 0); }
		public TerminalNode PARENTESIS_CLAUSURA() { return getToken(idParser.PARENTESIS_CLAUSURA, 0); }
		public BloqueContext bloque() {
			return getRuleContext(BloqueContext.class,0);
		}
		public Definicion_funcion_parametrosContext definicion_funcion_parametros() {
			return getRuleContext(Definicion_funcion_parametrosContext.class,0);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof idVisitor ) return ((idVisitor<? extends T>)visitor).visitDefinicion_funcion(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Definicion_funcionContext definicion_funcion() throws RecognitionException {
		Definicion_funcionContext _localctx = new Definicion_funcionContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_definicion_funcion);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(267);
			tipo_funciones();
			setState(268);
			definicion_funcion_nombre();
			setState(269);
			match(PARENTESIS_APERTURA);
			setState(271);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 28L) != 0)) {
				{
				setState(270);
				definicion_funcion_parametros();
				}
			}

			setState(273);
			match(PARENTESIS_CLAUSURA);
			setState(274);
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
	public static class Definicion_funcion_nombreContext extends ParserRuleContext {
		public TerminalNode IDENTIFICADOR() { return getToken(idParser.IDENTIFICADOR, 0); }
		public Definicion_funcion_nombreContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_definicion_funcion_nombre; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof idListener ) ((idListener)listener).enterDefinicion_funcion_nombre(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof idListener ) ((idListener)listener).exitDefinicion_funcion_nombre(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof idVisitor ) return ((idVisitor<? extends T>)visitor).visitDefinicion_funcion_nombre(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Definicion_funcion_nombreContext definicion_funcion_nombre() throws RecognitionException {
		Definicion_funcion_nombreContext _localctx = new Definicion_funcion_nombreContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_definicion_funcion_nombre);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(276);
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
	public static class Definicion_funcion_parametrosContext extends ParserRuleContext {
		public List<Definicion_funcion_parametroContext> definicion_funcion_parametro() {
			return getRuleContexts(Definicion_funcion_parametroContext.class);
		}
		public Definicion_funcion_parametroContext definicion_funcion_parametro(int i) {
			return getRuleContext(Definicion_funcion_parametroContext.class,i);
		}
		public List<TerminalNode> COMA() { return getTokens(idParser.COMA); }
		public TerminalNode COMA(int i) {
			return getToken(idParser.COMA, i);
		}
		public Definicion_funcion_parametrosContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_definicion_funcion_parametros; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof idListener ) ((idListener)listener).enterDefinicion_funcion_parametros(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof idListener ) ((idListener)listener).exitDefinicion_funcion_parametros(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof idVisitor ) return ((idVisitor<? extends T>)visitor).visitDefinicion_funcion_parametros(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Definicion_funcion_parametrosContext definicion_funcion_parametros() throws RecognitionException {
		Definicion_funcion_parametrosContext _localctx = new Definicion_funcion_parametrosContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_definicion_funcion_parametros);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(278);
			definicion_funcion_parametro();
			setState(283);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMA) {
				{
				{
				setState(279);
				match(COMA);
				setState(280);
				definicion_funcion_parametro();
				}
				}
				setState(285);
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
	public static class Definicion_funcion_parametroContext extends ParserRuleContext {
		public Tipo_variableContext tipo_variable() {
			return getRuleContext(Tipo_variableContext.class,0);
		}
		public Definicion_funcion_parametro_nombreContext definicion_funcion_parametro_nombre() {
			return getRuleContext(Definicion_funcion_parametro_nombreContext.class,0);
		}
		public Declaracion_funcion_parametro_inicializadoContext declaracion_funcion_parametro_inicializado() {
			return getRuleContext(Declaracion_funcion_parametro_inicializadoContext.class,0);
		}
		public Definicion_funcion_parametroContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_definicion_funcion_parametro; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof idListener ) ((idListener)listener).enterDefinicion_funcion_parametro(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof idListener ) ((idListener)listener).exitDefinicion_funcion_parametro(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof idVisitor ) return ((idVisitor<? extends T>)visitor).visitDefinicion_funcion_parametro(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Definicion_funcion_parametroContext definicion_funcion_parametro() throws RecognitionException {
		Definicion_funcion_parametroContext _localctx = new Definicion_funcion_parametroContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_definicion_funcion_parametro);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(286);
			tipo_variable();
			setState(287);
			definicion_funcion_parametro_nombre();
			setState(289);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==EQUAL) {
				{
				setState(288);
				declaracion_funcion_parametro_inicializado();
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
	public static class Definicion_funcion_parametro_nombreContext extends ParserRuleContext {
		public TerminalNode IDENTIFICADOR() { return getToken(idParser.IDENTIFICADOR, 0); }
		public Definicion_funcion_parametro_nombreContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_definicion_funcion_parametro_nombre; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof idListener ) ((idListener)listener).enterDefinicion_funcion_parametro_nombre(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof idListener ) ((idListener)listener).exitDefinicion_funcion_parametro_nombre(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof idVisitor ) return ((idVisitor<? extends T>)visitor).visitDefinicion_funcion_parametro_nombre(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Definicion_funcion_parametro_nombreContext definicion_funcion_parametro_nombre() throws RecognitionException {
		Definicion_funcion_parametro_nombreContext _localctx = new Definicion_funcion_parametro_nombreContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_definicion_funcion_parametro_nombre);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(291);
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
	public static class Llamada_funcionContext extends ParserRuleContext {
		public Llamada_funcion_expresionContext llamada_funcion_expresion() {
			return getRuleContext(Llamada_funcion_expresionContext.class,0);
		}
		public TerminalNode PUNTO_COMA() { return getToken(idParser.PUNTO_COMA, 0); }
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof idVisitor ) return ((idVisitor<? extends T>)visitor).visitLlamada_funcion(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Llamada_funcionContext llamada_funcion() throws RecognitionException {
		Llamada_funcionContext _localctx = new Llamada_funcionContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_llamada_funcion);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(293);
			llamada_funcion_expresion();
			setState(294);
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
	public static class Llamada_funcion_expresionContext extends ParserRuleContext {
		public Llamada_nombre_funcionContext llamada_nombre_funcion() {
			return getRuleContext(Llamada_nombre_funcionContext.class,0);
		}
		public TerminalNode PARENTESIS_APERTURA() { return getToken(idParser.PARENTESIS_APERTURA, 0); }
		public TerminalNode PARENTESIS_CLAUSURA() { return getToken(idParser.PARENTESIS_CLAUSURA, 0); }
		public Llamada_funcion_parametrosContext llamada_funcion_parametros() {
			return getRuleContext(Llamada_funcion_parametrosContext.class,0);
		}
		public Llamada_funcion_expresionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_llamada_funcion_expresion; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof idListener ) ((idListener)listener).enterLlamada_funcion_expresion(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof idListener ) ((idListener)listener).exitLlamada_funcion_expresion(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof idVisitor ) return ((idVisitor<? extends T>)visitor).visitLlamada_funcion_expresion(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Llamada_funcion_expresionContext llamada_funcion_expresion() throws RecognitionException {
		Llamada_funcion_expresionContext _localctx = new Llamada_funcion_expresionContext(_ctx, getState());
		enterRule(_localctx, 68, RULE_llamada_funcion_expresion);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(296);
			llamada_nombre_funcion();
			setState(297);
			match(PARENTESIS_APERTURA);
			setState(299);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 1649271635968L) != 0)) {
				{
				setState(298);
				llamada_funcion_parametros();
				}
			}

			setState(301);
			match(PARENTESIS_CLAUSURA);
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
	public static class Llamada_nombre_funcionContext extends ParserRuleContext {
		public TerminalNode IDENTIFICADOR() { return getToken(idParser.IDENTIFICADOR, 0); }
		public Llamada_nombre_funcionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_llamada_nombre_funcion; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof idListener ) ((idListener)listener).enterLlamada_nombre_funcion(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof idListener ) ((idListener)listener).exitLlamada_nombre_funcion(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof idVisitor ) return ((idVisitor<? extends T>)visitor).visitLlamada_nombre_funcion(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Llamada_nombre_funcionContext llamada_nombre_funcion() throws RecognitionException {
		Llamada_nombre_funcionContext _localctx = new Llamada_nombre_funcionContext(_ctx, getState());
		enterRule(_localctx, 70, RULE_llamada_nombre_funcion);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(303);
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
	public static class Llamada_funcion_parametrosContext extends ParserRuleContext {
		public Llamada_funcion_argumentosContext llamada_funcion_argumentos() {
			return getRuleContext(Llamada_funcion_argumentosContext.class,0);
		}
		public TerminalNode COMA() { return getToken(idParser.COMA, 0); }
		public Llamada_funcion_parametrosContext llamada_funcion_parametros() {
			return getRuleContext(Llamada_funcion_parametrosContext.class,0);
		}
		public Llamada_funcion_parametrosContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_llamada_funcion_parametros; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof idListener ) ((idListener)listener).enterLlamada_funcion_parametros(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof idListener ) ((idListener)listener).exitLlamada_funcion_parametros(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof idVisitor ) return ((idVisitor<? extends T>)visitor).visitLlamada_funcion_parametros(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Llamada_funcion_parametrosContext llamada_funcion_parametros() throws RecognitionException {
		Llamada_funcion_parametrosContext _localctx = new Llamada_funcion_parametrosContext(_ctx, getState());
		enterRule(_localctx, 72, RULE_llamada_funcion_parametros);
		try {
			setState(310);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,20,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(305);
				llamada_funcion_argumentos();
				setState(306);
				match(COMA);
				setState(307);
				llamada_funcion_parametros();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(309);
				llamada_funcion_argumentos();
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
	public static class Llamada_funcion_argumentosContext extends ParserRuleContext {
		public Llamada_funcion_argumento_identificadorContext llamada_funcion_argumento_identificador() {
			return getRuleContext(Llamada_funcion_argumento_identificadorContext.class,0);
		}
		public TerminalNode NUMERO() { return getToken(idParser.NUMERO, 0); }
		public TerminalNode CARACTER() { return getToken(idParser.CARACTER, 0); }
		public Llamada_funcion_argumentosContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_llamada_funcion_argumentos; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof idListener ) ((idListener)listener).enterLlamada_funcion_argumentos(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof idListener ) ((idListener)listener).exitLlamada_funcion_argumentos(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof idVisitor ) return ((idVisitor<? extends T>)visitor).visitLlamada_funcion_argumentos(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Llamada_funcion_argumentosContext llamada_funcion_argumentos() throws RecognitionException {
		Llamada_funcion_argumentosContext _localctx = new Llamada_funcion_argumentosContext(_ctx, getState());
		enterRule(_localctx, 74, RULE_llamada_funcion_argumentos);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(315);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IDENTIFICADOR:
				{
				setState(312);
				llamada_funcion_argumento_identificador();
				}
				break;
			case NUMERO:
				{
				setState(313);
				match(NUMERO);
				}
				break;
			case CARACTER:
				{
				setState(314);
				match(CARACTER);
				}
				break;
			default:
				throw new NoViableAltException(this);
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
	public static class Llamada_funcion_argumento_identificadorContext extends ParserRuleContext {
		public TerminalNode IDENTIFICADOR() { return getToken(idParser.IDENTIFICADOR, 0); }
		public Llamada_funcion_argumento_identificadorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_llamada_funcion_argumento_identificador; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof idListener ) ((idListener)listener).enterLlamada_funcion_argumento_identificador(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof idListener ) ((idListener)listener).exitLlamada_funcion_argumento_identificador(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof idVisitor ) return ((idVisitor<? extends T>)visitor).visitLlamada_funcion_argumento_identificador(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Llamada_funcion_argumento_identificadorContext llamada_funcion_argumento_identificador() throws RecognitionException {
		Llamada_funcion_argumento_identificadorContext _localctx = new Llamada_funcion_argumento_identificadorContext(_ctx, getState());
		enterRule(_localctx, 76, RULE_llamada_funcion_argumento_identificador);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(317);
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
	public static class IfContext extends ParserRuleContext {
		public TerminalNode IF() { return getToken(idParser.IF, 0); }
		public TerminalNode PARENTESIS_APERTURA() { return getToken(idParser.PARENTESIS_APERTURA, 0); }
		public Expresion_booleanaContext expresion_booleana() {
			return getRuleContext(Expresion_booleanaContext.class,0);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof idVisitor ) return ((idVisitor<? extends T>)visitor).visitIf(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IfContext if_() throws RecognitionException {
		IfContext _localctx = new IfContext(_ctx, getState());
		enterRule(_localctx, 78, RULE_if);
		try {
			setState(347);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,22,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(319);
				match(IF);
				setState(320);
				match(PARENTESIS_APERTURA);
				setState(321);
				expresion_booleana(0);
				setState(322);
				match(PARENTESIS_CLAUSURA);
				setState(323);
				bloque();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(325);
				match(IF);
				setState(326);
				match(PARENTESIS_APERTURA);
				setState(327);
				expresion_booleana(0);
				setState(328);
				match(PARENTESIS_CLAUSURA);
				setState(329);
				instruccion();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(331);
				match(IF);
				setState(332);
				match(PARENTESIS_APERTURA);
				setState(333);
				expresion_booleana(0);
				setState(334);
				match(PARENTESIS_CLAUSURA);
				setState(335);
				bloque();
				setState(336);
				match(ELSE);
				setState(337);
				bloque();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(339);
				match(IF);
				setState(340);
				match(PARENTESIS_APERTURA);
				setState(341);
				expresion_booleana(0);
				setState(342);
				match(PARENTESIS_CLAUSURA);
				setState(343);
				bloque();
				setState(344);
				match(ELSE);
				setState(345);
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
		public Expresion_booleanaContext expresion_booleana() {
			return getRuleContext(Expresion_booleanaContext.class,0);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof idVisitor ) return ((idVisitor<? extends T>)visitor).visitWhile(this);
			else return visitor.visitChildren(this);
		}
	}

	public final WhileContext while_() throws RecognitionException {
		WhileContext _localctx = new WhileContext(_ctx, getState());
		enterRule(_localctx, 80, RULE_while);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(349);
			match(WHILE);
			setState(350);
			match(PARENTESIS_APERTURA);
			setState(351);
			expresion_booleana(0);
			setState(352);
			match(PARENTESIS_CLAUSURA);
			setState(353);
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
		public Expresion_booleanaContext expresion_booleana() {
			return getRuleContext(Expresion_booleanaContext.class,0);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof idVisitor ) return ((idVisitor<? extends T>)visitor).visitFor(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ForContext for_() throws RecognitionException {
		ForContext _localctx = new ForContext(_ctx, getState());
		enterRule(_localctx, 82, RULE_for);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(355);
			match(FOR);
			setState(356);
			match(PARENTESIS_APERTURA);
			setState(358);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 28L) != 0)) {
				{
				setState(357);
				for_declaracion();
				}
			}

			setState(360);
			match(PUNTO_COMA);
			setState(361);
			expresion_booleana(0);
			setState(362);
			match(PUNTO_COMA);
			setState(363);
			for_autoincremental();
			setState(364);
			match(PARENTESIS_CLAUSURA);
			setState(365);
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
		public List<Declarador_inicializadoContext> declarador_inicializado() {
			return getRuleContexts(Declarador_inicializadoContext.class);
		}
		public Declarador_inicializadoContext declarador_inicializado(int i) {
			return getRuleContext(Declarador_inicializadoContext.class,i);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof idVisitor ) return ((idVisitor<? extends T>)visitor).visitFor_declaracion(this);
			else return visitor.visitChildren(this);
		}
	}

	public final For_declaracionContext for_declaracion() throws RecognitionException {
		For_declaracionContext _localctx = new For_declaracionContext(_ctx, getState());
		enterRule(_localctx, 84, RULE_for_declaracion);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(367);
			tipo_variable();
			setState(368);
			declarador_inicializado();
			setState(373);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMA) {
				{
				{
				setState(369);
				match(COMA);
				setState(370);
				declarador_inicializado();
				}
				}
				setState(375);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof idVisitor ) return ((idVisitor<? extends T>)visitor).visitFor_autoincremental(this);
			else return visitor.visitChildren(this);
		}
	}

	public final For_autoincrementalContext for_autoincremental() throws RecognitionException {
		For_autoincrementalContext _localctx = new For_autoincrementalContext(_ctx, getState());
		enterRule(_localctx, 86, RULE_for_autoincremental);
		try {
			int _alt;
			setState(394);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,27,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(376);
				match(IDENTIFICADOR);
				setState(377);
				match(INCREMENTADOR);
				setState(382);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,25,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(378);
						match(COMA);
						setState(379);
						for_autoincremental();
						}
						} 
					}
					setState(384);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,25,_ctx);
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(385);
				match(IDENTIFICADOR);
				setState(386);
				match(DECREMENTADOR);
				setState(391);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,26,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(387);
						match(COMA);
						setState(388);
						for_autoincremental();
						}
						} 
					}
					setState(393);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,26,_ctx);
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
	public static class ReturnContext extends ParserRuleContext {
		public TerminalNode RETURN() { return getToken(idParser.RETURN, 0); }
		public Return_variablesContext return_variables() {
			return getRuleContext(Return_variablesContext.class,0);
		}
		public TerminalNode PUNTO_COMA() { return getToken(idParser.PUNTO_COMA, 0); }
		public ReturnContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_return; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof idListener ) ((idListener)listener).enterReturn(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof idListener ) ((idListener)listener).exitReturn(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof idVisitor ) return ((idVisitor<? extends T>)visitor).visitReturn(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ReturnContext return_() throws RecognitionException {
		ReturnContext _localctx = new ReturnContext(_ctx, getState());
		enterRule(_localctx, 88, RULE_return);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(396);
			match(RETURN);
			setState(397);
			return_variables();
			setState(398);
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
	public static class Return_variablesContext extends ParserRuleContext {
		public TerminalNode NUMERO() { return getToken(idParser.NUMERO, 0); }
		public TerminalNode CARACTER() { return getToken(idParser.CARACTER, 0); }
		public Return_variable_identificadorContext return_variable_identificador() {
			return getRuleContext(Return_variable_identificadorContext.class,0);
		}
		public Return_variablesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_return_variables; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof idListener ) ((idListener)listener).enterReturn_variables(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof idListener ) ((idListener)listener).exitReturn_variables(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof idVisitor ) return ((idVisitor<? extends T>)visitor).visitReturn_variables(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Return_variablesContext return_variables() throws RecognitionException {
		Return_variablesContext _localctx = new Return_variablesContext(_ctx, getState());
		enterRule(_localctx, 90, RULE_return_variables);
		try {
			setState(403);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NUMERO:
				enterOuterAlt(_localctx, 1);
				{
				setState(400);
				match(NUMERO);
				}
				break;
			case CARACTER:
				enterOuterAlt(_localctx, 2);
				{
				setState(401);
				match(CARACTER);
				}
				break;
			case IDENTIFICADOR:
				enterOuterAlt(_localctx, 3);
				{
				setState(402);
				return_variable_identificador();
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
	public static class Return_variable_identificadorContext extends ParserRuleContext {
		public TerminalNode IDENTIFICADOR() { return getToken(idParser.IDENTIFICADOR, 0); }
		public Return_variable_identificadorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_return_variable_identificador; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof idListener ) ((idListener)listener).enterReturn_variable_identificador(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof idListener ) ((idListener)listener).exitReturn_variable_identificador(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof idVisitor ) return ((idVisitor<? extends T>)visitor).visitReturn_variable_identificador(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Return_variable_identificadorContext return_variable_identificador() throws RecognitionException {
		Return_variable_identificadorContext _localctx = new Return_variable_identificadorContext(_ctx, getState());
		enterRule(_localctx, 92, RULE_return_variable_identificador);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(405);
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

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 13:
			return expresion_booleana_sempred((Expresion_booleanaContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expresion_booleana_sempred(Expresion_booleanaContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 1);
		}
		return true;
	}

	public static final String _serializedATN =
		"\u0004\u0001)\u0198\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002"+
		"\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b\u0002"+
		"\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002\u000f\u0007\u000f"+
		"\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011\u0002\u0012\u0007\u0012"+
		"\u0002\u0013\u0007\u0013\u0002\u0014\u0007\u0014\u0002\u0015\u0007\u0015"+
		"\u0002\u0016\u0007\u0016\u0002\u0017\u0007\u0017\u0002\u0018\u0007\u0018"+
		"\u0002\u0019\u0007\u0019\u0002\u001a\u0007\u001a\u0002\u001b\u0007\u001b"+
		"\u0002\u001c\u0007\u001c\u0002\u001d\u0007\u001d\u0002\u001e\u0007\u001e"+
		"\u0002\u001f\u0007\u001f\u0002 \u0007 \u0002!\u0007!\u0002\"\u0007\"\u0002"+
		"#\u0007#\u0002$\u0007$\u0002%\u0007%\u0002&\u0007&\u0002\'\u0007\'\u0002"+
		"(\u0007(\u0002)\u0007)\u0002*\u0007*\u0002+\u0007+\u0002,\u0007,\u0002"+
		"-\u0007-\u0002.\u0007.\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0003\u0001e\b\u0001\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0003\u0002s\b\u0002"+
		"\u0001\u0003\u0001\u0003\u0001\u0004\u0001\u0004\u0001\u0005\u0001\u0005"+
		"\u0001\u0005\u0001\u0005\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006"+
		"\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007"+
		"\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0003\u0007\u008b\b\u0007"+
		"\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001"+
		"\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0003\b\u009c\b\b\u0001"+
		"\t\u0001\t\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0003"+
		"\n\u00a7\b\n\u0001\n\u0001\n\u0001\u000b\u0001\u000b\u0001\f\u0001\f\u0001"+
		"\f\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001"+
		"\r\u0003\r\u00b9\b\r\u0001\r\u0001\r\u0001\r\u0001\r\u0005\r\u00bf\b\r"+
		"\n\r\f\r\u00c2\t\r\u0001\u000e\u0001\u000e\u0001\u000e\u0003\u000e\u00c7"+
		"\b\u000e\u0001\u000f\u0001\u000f\u0001\u0010\u0001\u0010\u0001\u0011\u0001"+
		"\u0011\u0001\u0011\u0003\u0011\u00d0\b\u0011\u0001\u0012\u0001\u0012\u0001"+
		"\u0012\u0001\u0013\u0001\u0013\u0001\u0013\u0005\u0013\u00d8\b\u0013\n"+
		"\u0013\f\u0013\u00db\t\u0013\u0001\u0014\u0001\u0014\u0001\u0014\u0005"+
		"\u0014\u00e0\b\u0014\n\u0014\f\u0014\u00e3\t\u0014\u0001\u0015\u0001\u0015"+
		"\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0003\u0015\u00eb\b\u0015"+
		"\u0001\u0016\u0001\u0016\u0001\u0017\u0001\u0017\u0001\u0017\u0001\u0017"+
		"\u0003\u0017\u00f3\b\u0017\u0001\u0017\u0001\u0017\u0001\u0017\u0001\u0018"+
		"\u0001\u0018\u0001\u0019\u0001\u0019\u0001\u0019\u0005\u0019\u00fd\b\u0019"+
		"\n\u0019\f\u0019\u0100\t\u0019\u0001\u001a\u0001\u001a\u0001\u001a\u0003"+
		"\u001a\u0105\b\u001a\u0003\u001a\u0107\b\u001a\u0001\u001b\u0001\u001b"+
		"\u0001\u001b\u0001\u001c\u0001\u001c\u0001\u001c\u0001\u001c\u0003\u001c"+
		"\u0110\b\u001c\u0001\u001c\u0001\u001c\u0001\u001c\u0001\u001d\u0001\u001d"+
		"\u0001\u001e\u0001\u001e\u0001\u001e\u0005\u001e\u011a\b\u001e\n\u001e"+
		"\f\u001e\u011d\t\u001e\u0001\u001f\u0001\u001f\u0001\u001f\u0003\u001f"+
		"\u0122\b\u001f\u0001 \u0001 \u0001!\u0001!\u0001!\u0001\"\u0001\"\u0001"+
		"\"\u0003\"\u012c\b\"\u0001\"\u0001\"\u0001#\u0001#\u0001$\u0001$\u0001"+
		"$\u0001$\u0001$\u0003$\u0137\b$\u0001%\u0001%\u0001%\u0003%\u013c\b%\u0001"+
		"&\u0001&\u0001\'\u0001\'\u0001\'\u0001\'\u0001\'\u0001\'\u0001\'\u0001"+
		"\'\u0001\'\u0001\'\u0001\'\u0001\'\u0001\'\u0001\'\u0001\'\u0001\'\u0001"+
		"\'\u0001\'\u0001\'\u0001\'\u0001\'\u0001\'\u0001\'\u0001\'\u0001\'\u0001"+
		"\'\u0001\'\u0001\'\u0003\'\u015c\b\'\u0001(\u0001(\u0001(\u0001(\u0001"+
		"(\u0001(\u0001)\u0001)\u0001)\u0003)\u0167\b)\u0001)\u0001)\u0001)\u0001"+
		")\u0001)\u0001)\u0001)\u0001*\u0001*\u0001*\u0001*\u0005*\u0174\b*\n*"+
		"\f*\u0177\t*\u0001+\u0001+\u0001+\u0001+\u0005+\u017d\b+\n+\f+\u0180\t"+
		"+\u0001+\u0001+\u0001+\u0001+\u0005+\u0186\b+\n+\f+\u0189\t+\u0003+\u018b"+
		"\b+\u0001,\u0001,\u0001,\u0001,\u0001-\u0001-\u0001-\u0003-\u0194\b-\u0001"+
		".\u0001.\u0001.\u0000\u0001\u001a/\u0000\u0002\u0004\u0006\b\n\f\u000e"+
		"\u0010\u0012\u0014\u0016\u0018\u001a\u001c\u001e \"$&(*,.02468:<>@BDF"+
		"HJLNPRTVXZ\\\u0000\u0006\u0001\u0000\u0002\u0004\u0001\u0000\u0002\u0005"+
		"\u0001\u0000\u0018\u001d\u0001\u0000\u000b\f\u0001\u0000\r\u000f\u0002"+
		"\u0000\u0015\u0015((\u019e\u0000^\u0001\u0000\u0000\u0000\u0002d\u0001"+
		"\u0000\u0000\u0000\u0004r\u0001\u0000\u0000\u0000\u0006t\u0001\u0000\u0000"+
		"\u0000\bv\u0001\u0000\u0000\u0000\nx\u0001\u0000\u0000\u0000\f|\u0001"+
		"\u0000\u0000\u0000\u000e\u008a\u0001\u0000\u0000\u0000\u0010\u009b\u0001"+
		"\u0000\u0000\u0000\u0012\u009d\u0001\u0000\u0000\u0000\u0014\u009f\u0001"+
		"\u0000\u0000\u0000\u0016\u00aa\u0001\u0000\u0000\u0000\u0018\u00ac\u0001"+
		"\u0000\u0000\u0000\u001a\u00b8\u0001\u0000\u0000\u0000\u001c\u00c6\u0001"+
		"\u0000\u0000\u0000\u001e\u00c8\u0001\u0000\u0000\u0000 \u00ca\u0001\u0000"+
		"\u0000\u0000\"\u00cf\u0001\u0000\u0000\u0000$\u00d1\u0001\u0000\u0000"+
		"\u0000&\u00d4\u0001\u0000\u0000\u0000(\u00dc\u0001\u0000\u0000\u0000*"+
		"\u00ea\u0001\u0000\u0000\u0000,\u00ec\u0001\u0000\u0000\u0000.\u00ee\u0001"+
		"\u0000\u0000\u00000\u00f7\u0001\u0000\u0000\u00002\u00f9\u0001\u0000\u0000"+
		"\u00004\u0101\u0001\u0000\u0000\u00006\u0108\u0001\u0000\u0000\u00008"+
		"\u010b\u0001\u0000\u0000\u0000:\u0114\u0001\u0000\u0000\u0000<\u0116\u0001"+
		"\u0000\u0000\u0000>\u011e\u0001\u0000\u0000\u0000@\u0123\u0001\u0000\u0000"+
		"\u0000B\u0125\u0001\u0000\u0000\u0000D\u0128\u0001\u0000\u0000\u0000F"+
		"\u012f\u0001\u0000\u0000\u0000H\u0136\u0001\u0000\u0000\u0000J\u013b\u0001"+
		"\u0000\u0000\u0000L\u013d\u0001\u0000\u0000\u0000N\u015b\u0001\u0000\u0000"+
		"\u0000P\u015d\u0001\u0000\u0000\u0000R\u0163\u0001\u0000\u0000\u0000T"+
		"\u016f\u0001\u0000\u0000\u0000V\u018a\u0001\u0000\u0000\u0000X\u018c\u0001"+
		"\u0000\u0000\u0000Z\u0193\u0001\u0000\u0000\u0000\\\u0195\u0001\u0000"+
		"\u0000\u0000^_\u0003\u0002\u0001\u0000_\u0001\u0001\u0000\u0000\u0000"+
		"`a\u0003\u0004\u0002\u0000ab\u0003\u0002\u0001\u0000be\u0001\u0000\u0000"+
		"\u0000ce\u0001\u0000\u0000\u0000d`\u0001\u0000\u0000\u0000dc\u0001\u0000"+
		"\u0000\u0000e\u0003\u0001\u0000\u0000\u0000fs\u0003\f\u0006\u0000gs\u0003"+
		"\u0014\n\u0000hs\u0003\u0018\f\u0000is\u0003$\u0012\u0000js\u0003.\u0017"+
		"\u0000ks\u00038\u001c\u0000ls\u0003B!\u0000ms\u0003N\'\u0000ns\u0003P"+
		"(\u0000os\u0003R)\u0000ps\u0003\n\u0005\u0000qs\u0003X,\u0000rf\u0001"+
		"\u0000\u0000\u0000rg\u0001\u0000\u0000\u0000rh\u0001\u0000\u0000\u0000"+
		"ri\u0001\u0000\u0000\u0000rj\u0001\u0000\u0000\u0000rk\u0001\u0000\u0000"+
		"\u0000rl\u0001\u0000\u0000\u0000rm\u0001\u0000\u0000\u0000rn\u0001\u0000"+
		"\u0000\u0000ro\u0001\u0000\u0000\u0000rp\u0001\u0000\u0000\u0000rq\u0001"+
		"\u0000\u0000\u0000s\u0005\u0001\u0000\u0000\u0000tu\u0007\u0000\u0000"+
		"\u0000u\u0007\u0001\u0000\u0000\u0000vw\u0007\u0001\u0000\u0000w\t\u0001"+
		"\u0000\u0000\u0000xy\u0005\u0006\u0000\u0000yz\u0003\u0002\u0001\u0000"+
		"z{\u0005\u0007\u0000\u0000{\u000b\u0001\u0000\u0000\u0000|}\u0003\u0006"+
		"\u0003\u0000}~\u0003\u000e\u0007\u0000~\u007f\u0005\n\u0000\u0000\u007f"+
		"\r\u0001\u0000\u0000\u0000\u0080\u0081\u0003\u0010\b\u0000\u0081\u0082"+
		"\u0005\u0014\u0000\u0000\u0082\u0083\u0003\u000e\u0007\u0000\u0083\u008b"+
		"\u0001\u0000\u0000\u0000\u0084\u0085\u0003\u0012\t\u0000\u0085\u0086\u0005"+
		"\u0014\u0000\u0000\u0086\u0087\u0003\u000e\u0007\u0000\u0087\u008b\u0001"+
		"\u0000\u0000\u0000\u0088\u008b\u0003\u0010\b\u0000\u0089\u008b\u0003\u0012"+
		"\t\u0000\u008a\u0080\u0001\u0000\u0000\u0000\u008a\u0084\u0001\u0000\u0000"+
		"\u0000\u008a\u0088\u0001\u0000\u0000\u0000\u008a\u0089\u0001\u0000\u0000"+
		"\u0000\u008b\u000f\u0001\u0000\u0000\u0000\u008c\u008d\u0005\'\u0000\u0000"+
		"\u008d\u008e\u0005\u0010\u0000\u0000\u008e\u009c\u0005\u0016\u0000\u0000"+
		"\u008f\u0090\u0005\'\u0000\u0000\u0090\u0091\u0005\u0010\u0000\u0000\u0091"+
		"\u009c\u0005\'\u0000\u0000\u0092\u0093\u0005\'\u0000\u0000\u0093\u0094"+
		"\u0005\u0010\u0000\u0000\u0094\u009c\u0005(\u0000\u0000\u0095\u0096\u0005"+
		"\'\u0000\u0000\u0096\u0097\u0005\u0010\u0000\u0000\u0097\u009c\u0003\u001a"+
		"\r\u0000\u0098\u0099\u0005\'\u0000\u0000\u0099\u009a\u0005\u0010\u0000"+
		"\u0000\u009a\u009c\u0003&\u0013\u0000\u009b\u008c\u0001\u0000\u0000\u0000"+
		"\u009b\u008f\u0001\u0000\u0000\u0000\u009b\u0092\u0001\u0000\u0000\u0000"+
		"\u009b\u0095\u0001\u0000\u0000\u0000\u009b\u0098\u0001\u0000\u0000\u0000"+
		"\u009c\u0011\u0001\u0000\u0000\u0000\u009d\u009e\u0005\'\u0000\u0000\u009e"+
		"\u0013\u0001\u0000\u0000\u0000\u009f\u00a0\u0003\u0016\u000b\u0000\u00a0"+
		"\u00a6\u0005\u0010\u0000\u0000\u00a1\u00a7\u0005(\u0000\u0000\u00a2\u00a7"+
		"\u0005\u0016\u0000\u0000\u00a3\u00a7\u0003&\u0013\u0000\u00a4\u00a7\u0003"+
		"\u001a\r\u0000\u00a5\u00a7\u0003D\"\u0000\u00a6\u00a1\u0001\u0000\u0000"+
		"\u0000\u00a6\u00a2\u0001\u0000\u0000\u0000\u00a6\u00a3\u0001\u0000\u0000"+
		"\u0000\u00a6\u00a4\u0001\u0000\u0000\u0000\u00a6\u00a5\u0001\u0000\u0000"+
		"\u0000\u00a7\u00a8\u0001\u0000\u0000\u0000\u00a8\u00a9\u0005\n\u0000\u0000"+
		"\u00a9\u0015\u0001\u0000\u0000\u0000\u00aa\u00ab\u0005\'\u0000\u0000\u00ab"+
		"\u0017\u0001\u0000\u0000\u0000\u00ac\u00ad\u0003\u001a\r\u0000\u00ad\u00ae"+
		"\u0005\n\u0000\u0000\u00ae\u0019\u0001\u0000\u0000\u0000\u00af\u00b0\u0006"+
		"\r\uffff\uffff\u0000\u00b0\u00b1\u0003\u001c\u000e\u0000\u00b1\u00b2\u0003"+
		" \u0010\u0000\u00b2\u00b3\u0003\u001c\u000e\u0000\u00b3\u00b9\u0001\u0000"+
		"\u0000\u0000\u00b4\u00b5\u0005\b\u0000\u0000\u00b5\u00b6\u0003\u001a\r"+
		"\u0000\u00b6\u00b7\u0005\t\u0000\u0000\u00b7\u00b9\u0001\u0000\u0000\u0000"+
		"\u00b8\u00af\u0001\u0000\u0000\u0000\u00b8\u00b4\u0001\u0000\u0000\u0000"+
		"\u00b9\u00c0\u0001\u0000\u0000\u0000\u00ba\u00bb\n\u0001\u0000\u0000\u00bb"+
		"\u00bc\u0003\"\u0011\u0000\u00bc\u00bd\u0003\u001a\r\u0002\u00bd\u00bf"+
		"\u0001\u0000\u0000\u0000\u00be\u00ba\u0001\u0000\u0000\u0000\u00bf\u00c2"+
		"\u0001\u0000\u0000\u0000\u00c0\u00be\u0001\u0000\u0000\u0000\u00c0\u00c1"+
		"\u0001\u0000\u0000\u0000\u00c1\u001b\u0001\u0000\u0000\u0000\u00c2\u00c0"+
		"\u0001\u0000\u0000\u0000\u00c3\u00c7\u0005\u0015\u0000\u0000\u00c4\u00c7"+
		"\u0003\u001e\u000f\u0000\u00c5\u00c7\u0005(\u0000\u0000\u00c6\u00c3\u0001"+
		"\u0000\u0000\u0000\u00c6\u00c4\u0001\u0000\u0000\u0000\u00c6\u00c5\u0001"+
		"\u0000\u0000\u0000\u00c7\u001d\u0001\u0000\u0000\u0000\u00c8\u00c9\u0005"+
		"\'\u0000\u0000\u00c9\u001f\u0001\u0000\u0000\u0000\u00ca\u00cb\u0007\u0002"+
		"\u0000\u0000\u00cb!\u0001\u0000\u0000\u0000\u00cc\u00d0\u0005\u001e\u0000"+
		"\u0000\u00cd\u00d0\u0001\u0000\u0000\u0000\u00ce\u00d0\u0005\u001f\u0000"+
		"\u0000\u00cf\u00cc\u0001\u0000\u0000\u0000\u00cf\u00cd\u0001\u0000\u0000"+
		"\u0000\u00cf\u00ce\u0001\u0000\u0000\u0000\u00d0#\u0001\u0000\u0000\u0000"+
		"\u00d1\u00d2\u0003&\u0013\u0000\u00d2\u00d3\u0005\n\u0000\u0000\u00d3"+
		"%\u0001\u0000\u0000\u0000\u00d4\u00d9\u0003(\u0014\u0000\u00d5\u00d6\u0007"+
		"\u0003\u0000\u0000\u00d6\u00d8\u0003(\u0014\u0000\u00d7\u00d5\u0001\u0000"+
		"\u0000\u0000\u00d8\u00db\u0001\u0000\u0000\u0000\u00d9\u00d7\u0001\u0000"+
		"\u0000\u0000\u00d9\u00da\u0001\u0000\u0000\u0000\u00da\'\u0001\u0000\u0000"+
		"\u0000\u00db\u00d9\u0001\u0000\u0000\u0000\u00dc\u00e1\u0003*\u0015\u0000"+
		"\u00dd\u00de\u0007\u0004\u0000\u0000\u00de\u00e0\u0003*\u0015\u0000\u00df"+
		"\u00dd\u0001\u0000\u0000\u0000\u00e0\u00e3\u0001\u0000\u0000\u0000\u00e1"+
		"\u00df\u0001\u0000\u0000\u0000\u00e1\u00e2\u0001\u0000\u0000\u0000\u00e2"+
		")\u0001\u0000\u0000\u0000\u00e3\u00e1\u0001\u0000\u0000\u0000\u00e4\u00eb"+
		"\u0005(\u0000\u0000\u00e5\u00eb\u0003,\u0016\u0000\u00e6\u00e7\u0005\b"+
		"\u0000\u0000\u00e7\u00e8\u0003&\u0013\u0000\u00e8\u00e9\u0005\t\u0000"+
		"\u0000\u00e9\u00eb\u0001\u0000\u0000\u0000\u00ea\u00e4\u0001\u0000\u0000"+
		"\u0000\u00ea\u00e5\u0001\u0000\u0000\u0000\u00ea\u00e6\u0001\u0000\u0000"+
		"\u0000\u00eb+\u0001\u0000\u0000\u0000\u00ec\u00ed\u0005\'\u0000\u0000"+
		"\u00ed-\u0001\u0000\u0000\u0000\u00ee\u00ef\u0003\b\u0004\u0000\u00ef"+
		"\u00f0\u00030\u0018\u0000\u00f0\u00f2\u0005\b\u0000\u0000\u00f1\u00f3"+
		"\u00032\u0019\u0000\u00f2\u00f1\u0001\u0000\u0000\u0000\u00f2\u00f3\u0001"+
		"\u0000\u0000\u0000\u00f3\u00f4\u0001\u0000\u0000\u0000\u00f4\u00f5\u0005"+
		"\t\u0000\u0000\u00f5\u00f6\u0005\n\u0000\u0000\u00f6/\u0001\u0000\u0000"+
		"\u0000\u00f7\u00f8\u0005\'\u0000\u0000\u00f81\u0001\u0000\u0000\u0000"+
		"\u00f9\u00fe\u00034\u001a\u0000\u00fa\u00fb\u0005\u0014\u0000\u0000\u00fb"+
		"\u00fd\u00034\u001a\u0000\u00fc\u00fa\u0001\u0000\u0000\u0000\u00fd\u0100"+
		"\u0001\u0000\u0000\u0000\u00fe\u00fc\u0001\u0000\u0000\u0000\u00fe\u00ff"+
		"\u0001\u0000\u0000\u0000\u00ff3\u0001\u0000\u0000\u0000\u0100\u00fe\u0001"+
		"\u0000\u0000\u0000\u0101\u0106\u0003\u0006\u0003\u0000\u0102\u0104\u0005"+
		"\'\u0000\u0000\u0103\u0105\u00036\u001b\u0000\u0104\u0103\u0001\u0000"+
		"\u0000\u0000\u0104\u0105\u0001\u0000\u0000\u0000\u0105\u0107\u0001\u0000"+
		"\u0000\u0000\u0106\u0102\u0001\u0000\u0000\u0000\u0106\u0107\u0001\u0000"+
		"\u0000\u0000\u01075\u0001\u0000\u0000\u0000\u0108\u0109\u0005\u0010\u0000"+
		"\u0000\u0109\u010a\u0007\u0005\u0000\u0000\u010a7\u0001\u0000\u0000\u0000"+
		"\u010b\u010c\u0003\b\u0004\u0000\u010c\u010d\u0003:\u001d\u0000\u010d"+
		"\u010f\u0005\b\u0000\u0000\u010e\u0110\u0003<\u001e\u0000\u010f\u010e"+
		"\u0001\u0000\u0000\u0000\u010f\u0110\u0001\u0000\u0000\u0000\u0110\u0111"+
		"\u0001\u0000\u0000\u0000\u0111\u0112\u0005\t\u0000\u0000\u0112\u0113\u0003"+
		"\n\u0005\u0000\u01139\u0001\u0000\u0000\u0000\u0114\u0115\u0005\'\u0000"+
		"\u0000\u0115;\u0001\u0000\u0000\u0000\u0116\u011b\u0003>\u001f\u0000\u0117"+
		"\u0118\u0005\u0014\u0000\u0000\u0118\u011a\u0003>\u001f\u0000\u0119\u0117"+
		"\u0001\u0000\u0000\u0000\u011a\u011d\u0001\u0000\u0000\u0000\u011b\u0119"+
		"\u0001\u0000\u0000\u0000\u011b\u011c\u0001\u0000\u0000\u0000\u011c=\u0001"+
		"\u0000\u0000\u0000\u011d\u011b\u0001\u0000\u0000\u0000\u011e\u011f\u0003"+
		"\u0006\u0003\u0000\u011f\u0121\u0003@ \u0000\u0120\u0122\u00036\u001b"+
		"\u0000\u0121\u0120\u0001\u0000\u0000\u0000\u0121\u0122\u0001\u0000\u0000"+
		"\u0000\u0122?\u0001\u0000\u0000\u0000\u0123\u0124\u0005\'\u0000\u0000"+
		"\u0124A\u0001\u0000\u0000\u0000\u0125\u0126\u0003D\"\u0000\u0126\u0127"+
		"\u0005\n\u0000\u0000\u0127C\u0001\u0000\u0000\u0000\u0128\u0129\u0003"+
		"F#\u0000\u0129\u012b\u0005\b\u0000\u0000\u012a\u012c\u0003H$\u0000\u012b"+
		"\u012a\u0001\u0000\u0000\u0000\u012b\u012c\u0001\u0000\u0000\u0000\u012c"+
		"\u012d\u0001\u0000\u0000\u0000\u012d\u012e\u0005\t\u0000\u0000\u012eE"+
		"\u0001\u0000\u0000\u0000\u012f\u0130\u0005\'\u0000\u0000\u0130G\u0001"+
		"\u0000\u0000\u0000\u0131\u0132\u0003J%\u0000\u0132\u0133\u0005\u0014\u0000"+
		"\u0000\u0133\u0134\u0003H$\u0000\u0134\u0137\u0001\u0000\u0000\u0000\u0135"+
		"\u0137\u0003J%\u0000\u0136\u0131\u0001\u0000\u0000\u0000\u0136\u0135\u0001"+
		"\u0000\u0000\u0000\u0137I\u0001\u0000\u0000\u0000\u0138\u013c\u0003L&"+
		"\u0000\u0139\u013c\u0005(\u0000\u0000\u013a\u013c\u0005\u0016\u0000\u0000"+
		"\u013b\u0138\u0001\u0000\u0000\u0000\u013b\u0139\u0001\u0000\u0000\u0000"+
		"\u013b\u013a\u0001\u0000\u0000\u0000\u013cK\u0001\u0000\u0000\u0000\u013d"+
		"\u013e\u0005\'\u0000\u0000\u013eM\u0001\u0000\u0000\u0000\u013f\u0140"+
		"\u0005 \u0000\u0000\u0140\u0141\u0005\b\u0000\u0000\u0141\u0142\u0003"+
		"\u001a\r\u0000\u0142\u0143\u0005\t\u0000\u0000\u0143\u0144\u0003\n\u0005"+
		"\u0000\u0144\u015c\u0001\u0000\u0000\u0000\u0145\u0146\u0005 \u0000\u0000"+
		"\u0146\u0147\u0005\b\u0000\u0000\u0147\u0148\u0003\u001a\r\u0000\u0148"+
		"\u0149\u0005\t\u0000\u0000\u0149\u014a\u0003\u0004\u0002\u0000\u014a\u015c"+
		"\u0001\u0000\u0000\u0000\u014b\u014c\u0005 \u0000\u0000\u014c\u014d\u0005"+
		"\b\u0000\u0000\u014d\u014e\u0003\u001a\r\u0000\u014e\u014f\u0005\t\u0000"+
		"\u0000\u014f\u0150\u0003\n\u0005\u0000\u0150\u0151\u0005!\u0000\u0000"+
		"\u0151\u0152\u0003\n\u0005\u0000\u0152\u015c\u0001\u0000\u0000\u0000\u0153"+
		"\u0154\u0005 \u0000\u0000\u0154\u0155\u0005\b\u0000\u0000\u0155\u0156"+
		"\u0003\u001a\r\u0000\u0156\u0157\u0005\t\u0000\u0000\u0157\u0158\u0003"+
		"\n\u0005\u0000\u0158\u0159\u0005!\u0000\u0000\u0159\u015a\u0003\u0004"+
		"\u0002\u0000\u015a\u015c\u0001\u0000\u0000\u0000\u015b\u013f\u0001\u0000"+
		"\u0000\u0000\u015b\u0145\u0001\u0000\u0000\u0000\u015b\u014b\u0001\u0000"+
		"\u0000\u0000\u015b\u0153\u0001\u0000\u0000\u0000\u015cO\u0001\u0000\u0000"+
		"\u0000\u015d\u015e\u0005#\u0000\u0000\u015e\u015f\u0005\b\u0000\u0000"+
		"\u015f\u0160\u0003\u001a\r\u0000\u0160\u0161\u0005\t\u0000\u0000\u0161"+
		"\u0162\u0003\n\u0005\u0000\u0162Q\u0001\u0000\u0000\u0000\u0163\u0164"+
		"\u0005\"\u0000\u0000\u0164\u0166\u0005\b\u0000\u0000\u0165\u0167\u0003"+
		"T*\u0000\u0166\u0165\u0001\u0000\u0000\u0000\u0166\u0167\u0001\u0000\u0000"+
		"\u0000\u0167\u0168\u0001\u0000\u0000\u0000\u0168\u0169\u0005\n\u0000\u0000"+
		"\u0169\u016a\u0003\u001a\r\u0000\u016a\u016b\u0005\n\u0000\u0000\u016b"+
		"\u016c\u0003V+\u0000\u016c\u016d\u0005\t\u0000\u0000\u016d\u016e\u0003"+
		"\n\u0005\u0000\u016eS\u0001\u0000\u0000\u0000\u016f\u0170\u0003\u0006"+
		"\u0003\u0000\u0170\u0175\u0003\u0010\b\u0000\u0171\u0172\u0005\u0014\u0000"+
		"\u0000\u0172\u0174\u0003\u0010\b\u0000\u0173\u0171\u0001\u0000\u0000\u0000"+
		"\u0174\u0177\u0001\u0000\u0000\u0000\u0175\u0173\u0001\u0000\u0000\u0000"+
		"\u0175\u0176\u0001\u0000\u0000\u0000\u0176U\u0001\u0000\u0000\u0000\u0177"+
		"\u0175\u0001\u0000\u0000\u0000\u0178\u0179\u0005\'\u0000\u0000\u0179\u017e"+
		"\u0005\u0011\u0000\u0000\u017a\u017b\u0005\u0014\u0000\u0000\u017b\u017d"+
		"\u0003V+\u0000\u017c\u017a\u0001\u0000\u0000\u0000\u017d\u0180\u0001\u0000"+
		"\u0000\u0000\u017e\u017c\u0001\u0000\u0000\u0000\u017e\u017f\u0001\u0000"+
		"\u0000\u0000\u017f\u018b\u0001\u0000\u0000\u0000\u0180\u017e\u0001\u0000"+
		"\u0000\u0000\u0181\u0182\u0005\'\u0000\u0000\u0182\u0187\u0005\u0012\u0000"+
		"\u0000\u0183\u0184\u0005\u0014\u0000\u0000\u0184\u0186\u0003V+\u0000\u0185"+
		"\u0183\u0001\u0000\u0000\u0000\u0186\u0189\u0001\u0000\u0000\u0000\u0187"+
		"\u0185\u0001\u0000\u0000\u0000\u0187\u0188\u0001\u0000\u0000\u0000\u0188"+
		"\u018b\u0001\u0000\u0000\u0000\u0189\u0187\u0001\u0000\u0000\u0000\u018a"+
		"\u0178\u0001\u0000\u0000\u0000\u018a\u0181\u0001\u0000\u0000\u0000\u018b"+
		"W\u0001\u0000\u0000\u0000\u018c\u018d\u0005&\u0000\u0000\u018d\u018e\u0003"+
		"Z-\u0000\u018e\u018f\u0005\n\u0000\u0000\u018fY\u0001\u0000\u0000\u0000"+
		"\u0190\u0194\u0005(\u0000\u0000\u0191\u0194\u0005\u0016\u0000\u0000\u0192"+
		"\u0194\u0003\\.\u0000\u0193\u0190\u0001\u0000\u0000\u0000\u0193\u0191"+
		"\u0001\u0000\u0000\u0000\u0193\u0192\u0001\u0000\u0000\u0000\u0194[\u0001"+
		"\u0000\u0000\u0000\u0195\u0196\u0005\'\u0000\u0000\u0196]\u0001\u0000"+
		"\u0000\u0000\u001ddr\u008a\u009b\u00a6\u00b8\u00c0\u00c6\u00cf\u00d9\u00e1"+
		"\u00ea\u00f2\u00fe\u0104\u0106\u010f\u011b\u0121\u012b\u0136\u013b\u015b"+
		"\u0166\u0175\u017e\u0187\u018a\u0193";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}