// Generated from /Users/enzoletona/Desktop/TC/proyecto-final-tc/src/main/java/app/id.g4 by ANTLR 4.13.1

package app;

import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link idParser}.
 */
public interface idListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link idParser#s}.
	 * @param ctx the parse tree
	 */
	void enterS(idParser.SContext ctx);
	/**
	 * Exit a parse tree produced by {@link idParser#s}.
	 * @param ctx the parse tree
	 */
	void exitS(idParser.SContext ctx);
	/**
	 * Enter a parse tree produced by {@link idParser#instrucciones}.
	 * @param ctx the parse tree
	 */
	void enterInstrucciones(idParser.InstruccionesContext ctx);
	/**
	 * Exit a parse tree produced by {@link idParser#instrucciones}.
	 * @param ctx the parse tree
	 */
	void exitInstrucciones(idParser.InstruccionesContext ctx);
	/**
	 * Enter a parse tree produced by {@link idParser#instruccion}.
	 * @param ctx the parse tree
	 */
	void enterInstruccion(idParser.InstruccionContext ctx);
	/**
	 * Exit a parse tree produced by {@link idParser#instruccion}.
	 * @param ctx the parse tree
	 */
	void exitInstruccion(idParser.InstruccionContext ctx);
	/**
	 * Enter a parse tree produced by {@link idParser#tipo_variable}.
	 * @param ctx the parse tree
	 */
	void enterTipo_variable(idParser.Tipo_variableContext ctx);
	/**
	 * Exit a parse tree produced by {@link idParser#tipo_variable}.
	 * @param ctx the parse tree
	 */
	void exitTipo_variable(idParser.Tipo_variableContext ctx);
	/**
	 * Enter a parse tree produced by {@link idParser#tipo_funciones}.
	 * @param ctx the parse tree
	 */
	void enterTipo_funciones(idParser.Tipo_funcionesContext ctx);
	/**
	 * Exit a parse tree produced by {@link idParser#tipo_funciones}.
	 * @param ctx the parse tree
	 */
	void exitTipo_funciones(idParser.Tipo_funcionesContext ctx);
	/**
	 * Enter a parse tree produced by {@link idParser#bloque}.
	 * @param ctx the parse tree
	 */
	void enterBloque(idParser.BloqueContext ctx);
	/**
	 * Exit a parse tree produced by {@link idParser#bloque}.
	 * @param ctx the parse tree
	 */
	void exitBloque(idParser.BloqueContext ctx);
	/**
	 * Enter a parse tree produced by {@link idParser#declaracion_variable}.
	 * @param ctx the parse tree
	 */
	void enterDeclaracion_variable(idParser.Declaracion_variableContext ctx);
	/**
	 * Exit a parse tree produced by {@link idParser#declaracion_variable}.
	 * @param ctx the parse tree
	 */
	void exitDeclaracion_variable(idParser.Declaracion_variableContext ctx);
	/**
	 * Enter a parse tree produced by {@link idParser#declaracion_variable_declaradores}.
	 * @param ctx the parse tree
	 */
	void enterDeclaracion_variable_declaradores(idParser.Declaracion_variable_declaradoresContext ctx);
	/**
	 * Exit a parse tree produced by {@link idParser#declaracion_variable_declaradores}.
	 * @param ctx the parse tree
	 */
	void exitDeclaracion_variable_declaradores(idParser.Declaracion_variable_declaradoresContext ctx);
	/**
	 * Enter a parse tree produced by {@link idParser#declarador_inicializado}.
	 * @param ctx the parse tree
	 */
	void enterDeclarador_inicializado(idParser.Declarador_inicializadoContext ctx);
	/**
	 * Exit a parse tree produced by {@link idParser#declarador_inicializado}.
	 * @param ctx the parse tree
	 */
	void exitDeclarador_inicializado(idParser.Declarador_inicializadoContext ctx);
	/**
	 * Enter a parse tree produced by {@link idParser#declarador_simple}.
	 * @param ctx the parse tree
	 */
	void enterDeclarador_simple(idParser.Declarador_simpleContext ctx);
	/**
	 * Exit a parse tree produced by {@link idParser#declarador_simple}.
	 * @param ctx the parse tree
	 */
	void exitDeclarador_simple(idParser.Declarador_simpleContext ctx);
	/**
	 * Enter a parse tree produced by {@link idParser#asignacion_variable}.
	 * @param ctx the parse tree
	 */
	void enterAsignacion_variable(idParser.Asignacion_variableContext ctx);
	/**
	 * Exit a parse tree produced by {@link idParser#asignacion_variable}.
	 * @param ctx the parse tree
	 */
	void exitAsignacion_variable(idParser.Asignacion_variableContext ctx);
	/**
	 * Enter a parse tree produced by {@link idParser#asignacion_variable_identificador}.
	 * @param ctx the parse tree
	 */
	void enterAsignacion_variable_identificador(idParser.Asignacion_variable_identificadorContext ctx);
	/**
	 * Exit a parse tree produced by {@link idParser#asignacion_variable_identificador}.
	 * @param ctx the parse tree
	 */
	void exitAsignacion_variable_identificador(idParser.Asignacion_variable_identificadorContext ctx);
	/**
	 * Enter a parse tree produced by {@link idParser#operacion_logica}.
	 * @param ctx the parse tree
	 */
	void enterOperacion_logica(idParser.Operacion_logicaContext ctx);
	/**
	 * Exit a parse tree produced by {@link idParser#operacion_logica}.
	 * @param ctx the parse tree
	 */
	void exitOperacion_logica(idParser.Operacion_logicaContext ctx);
	/**
	 * Enter a parse tree produced by {@link idParser#expresion_booleana}.
	 * @param ctx the parse tree
	 */
	void enterExpresion_booleana(idParser.Expresion_booleanaContext ctx);
	/**
	 * Exit a parse tree produced by {@link idParser#expresion_booleana}.
	 * @param ctx the parse tree
	 */
	void exitExpresion_booleana(idParser.Expresion_booleanaContext ctx);
	/**
	 * Enter a parse tree produced by {@link idParser#termino_comparacion}.
	 * @param ctx the parse tree
	 */
	void enterTermino_comparacion(idParser.Termino_comparacionContext ctx);
	/**
	 * Exit a parse tree produced by {@link idParser#termino_comparacion}.
	 * @param ctx the parse tree
	 */
	void exitTermino_comparacion(idParser.Termino_comparacionContext ctx);
	/**
	 * Enter a parse tree produced by {@link idParser#identificador_logico}.
	 * @param ctx the parse tree
	 */
	void enterIdentificador_logico(idParser.Identificador_logicoContext ctx);
	/**
	 * Exit a parse tree produced by {@link idParser#identificador_logico}.
	 * @param ctx the parse tree
	 */
	void exitIdentificador_logico(idParser.Identificador_logicoContext ctx);
	/**
	 * Enter a parse tree produced by {@link idParser#operador_comparacion}.
	 * @param ctx the parse tree
	 */
	void enterOperador_comparacion(idParser.Operador_comparacionContext ctx);
	/**
	 * Exit a parse tree produced by {@link idParser#operador_comparacion}.
	 * @param ctx the parse tree
	 */
	void exitOperador_comparacion(idParser.Operador_comparacionContext ctx);
	/**
	 * Enter a parse tree produced by {@link idParser#operador_logico}.
	 * @param ctx the parse tree
	 */
	void enterOperador_logico(idParser.Operador_logicoContext ctx);
	/**
	 * Exit a parse tree produced by {@link idParser#operador_logico}.
	 * @param ctx the parse tree
	 */
	void exitOperador_logico(idParser.Operador_logicoContext ctx);
	/**
	 * Enter a parse tree produced by {@link idParser#operacion_aritmetica}.
	 * @param ctx the parse tree
	 */
	void enterOperacion_aritmetica(idParser.Operacion_aritmeticaContext ctx);
	/**
	 * Exit a parse tree produced by {@link idParser#operacion_aritmetica}.
	 * @param ctx the parse tree
	 */
	void exitOperacion_aritmetica(idParser.Operacion_aritmeticaContext ctx);
	/**
	 * Enter a parse tree produced by {@link idParser#expresion_aritmetica}.
	 * @param ctx the parse tree
	 */
	void enterExpresion_aritmetica(idParser.Expresion_aritmeticaContext ctx);
	/**
	 * Exit a parse tree produced by {@link idParser#expresion_aritmetica}.
	 * @param ctx the parse tree
	 */
	void exitExpresion_aritmetica(idParser.Expresion_aritmeticaContext ctx);
	/**
	 * Enter a parse tree produced by {@link idParser#termino_aritmetico}.
	 * @param ctx the parse tree
	 */
	void enterTermino_aritmetico(idParser.Termino_aritmeticoContext ctx);
	/**
	 * Exit a parse tree produced by {@link idParser#termino_aritmetico}.
	 * @param ctx the parse tree
	 */
	void exitTermino_aritmetico(idParser.Termino_aritmeticoContext ctx);
	/**
	 * Enter a parse tree produced by {@link idParser#factor}.
	 * @param ctx the parse tree
	 */
	void enterFactor(idParser.FactorContext ctx);
	/**
	 * Exit a parse tree produced by {@link idParser#factor}.
	 * @param ctx the parse tree
	 */
	void exitFactor(idParser.FactorContext ctx);
	/**
	 * Enter a parse tree produced by {@link idParser#identificador_aritmetico}.
	 * @param ctx the parse tree
	 */
	void enterIdentificador_aritmetico(idParser.Identificador_aritmeticoContext ctx);
	/**
	 * Exit a parse tree produced by {@link idParser#identificador_aritmetico}.
	 * @param ctx the parse tree
	 */
	void exitIdentificador_aritmetico(idParser.Identificador_aritmeticoContext ctx);
	/**
	 * Enter a parse tree produced by {@link idParser#declaracion_funcion}.
	 * @param ctx the parse tree
	 */
	void enterDeclaracion_funcion(idParser.Declaracion_funcionContext ctx);
	/**
	 * Exit a parse tree produced by {@link idParser#declaracion_funcion}.
	 * @param ctx the parse tree
	 */
	void exitDeclaracion_funcion(idParser.Declaracion_funcionContext ctx);
	/**
	 * Enter a parse tree produced by {@link idParser#declaracion_funcion_identificador}.
	 * @param ctx the parse tree
	 */
	void enterDeclaracion_funcion_identificador(idParser.Declaracion_funcion_identificadorContext ctx);
	/**
	 * Exit a parse tree produced by {@link idParser#declaracion_funcion_identificador}.
	 * @param ctx the parse tree
	 */
	void exitDeclaracion_funcion_identificador(idParser.Declaracion_funcion_identificadorContext ctx);
	/**
	 * Enter a parse tree produced by {@link idParser#declaracion_funciones_parametros}.
	 * @param ctx the parse tree
	 */
	void enterDeclaracion_funciones_parametros(idParser.Declaracion_funciones_parametrosContext ctx);
	/**
	 * Exit a parse tree produced by {@link idParser#declaracion_funciones_parametros}.
	 * @param ctx the parse tree
	 */
	void exitDeclaracion_funciones_parametros(idParser.Declaracion_funciones_parametrosContext ctx);
	/**
	 * Enter a parse tree produced by {@link idParser#declaracion_funcion_parametro}.
	 * @param ctx the parse tree
	 */
	void enterDeclaracion_funcion_parametro(idParser.Declaracion_funcion_parametroContext ctx);
	/**
	 * Exit a parse tree produced by {@link idParser#declaracion_funcion_parametro}.
	 * @param ctx the parse tree
	 */
	void exitDeclaracion_funcion_parametro(idParser.Declaracion_funcion_parametroContext ctx);
	/**
	 * Enter a parse tree produced by {@link idParser#declaracion_funcion_parametro_inicializado}.
	 * @param ctx the parse tree
	 */
	void enterDeclaracion_funcion_parametro_inicializado(idParser.Declaracion_funcion_parametro_inicializadoContext ctx);
	/**
	 * Exit a parse tree produced by {@link idParser#declaracion_funcion_parametro_inicializado}.
	 * @param ctx the parse tree
	 */
	void exitDeclaracion_funcion_parametro_inicializado(idParser.Declaracion_funcion_parametro_inicializadoContext ctx);
	/**
	 * Enter a parse tree produced by {@link idParser#definicion_funcion}.
	 * @param ctx the parse tree
	 */
	void enterDefinicion_funcion(idParser.Definicion_funcionContext ctx);
	/**
	 * Exit a parse tree produced by {@link idParser#definicion_funcion}.
	 * @param ctx the parse tree
	 */
	void exitDefinicion_funcion(idParser.Definicion_funcionContext ctx);
	/**
	 * Enter a parse tree produced by {@link idParser#definicion_funcion_nombre}.
	 * @param ctx the parse tree
	 */
	void enterDefinicion_funcion_nombre(idParser.Definicion_funcion_nombreContext ctx);
	/**
	 * Exit a parse tree produced by {@link idParser#definicion_funcion_nombre}.
	 * @param ctx the parse tree
	 */
	void exitDefinicion_funcion_nombre(idParser.Definicion_funcion_nombreContext ctx);
	/**
	 * Enter a parse tree produced by {@link idParser#definicion_funcion_parametros}.
	 * @param ctx the parse tree
	 */
	void enterDefinicion_funcion_parametros(idParser.Definicion_funcion_parametrosContext ctx);
	/**
	 * Exit a parse tree produced by {@link idParser#definicion_funcion_parametros}.
	 * @param ctx the parse tree
	 */
	void exitDefinicion_funcion_parametros(idParser.Definicion_funcion_parametrosContext ctx);
	/**
	 * Enter a parse tree produced by {@link idParser#definicion_funcion_parametro}.
	 * @param ctx the parse tree
	 */
	void enterDefinicion_funcion_parametro(idParser.Definicion_funcion_parametroContext ctx);
	/**
	 * Exit a parse tree produced by {@link idParser#definicion_funcion_parametro}.
	 * @param ctx the parse tree
	 */
	void exitDefinicion_funcion_parametro(idParser.Definicion_funcion_parametroContext ctx);
	/**
	 * Enter a parse tree produced by {@link idParser#definicion_funcion_parametro_nombre}.
	 * @param ctx the parse tree
	 */
	void enterDefinicion_funcion_parametro_nombre(idParser.Definicion_funcion_parametro_nombreContext ctx);
	/**
	 * Exit a parse tree produced by {@link idParser#definicion_funcion_parametro_nombre}.
	 * @param ctx the parse tree
	 */
	void exitDefinicion_funcion_parametro_nombre(idParser.Definicion_funcion_parametro_nombreContext ctx);
	/**
	 * Enter a parse tree produced by {@link idParser#llamada_funcion}.
	 * @param ctx the parse tree
	 */
	void enterLlamada_funcion(idParser.Llamada_funcionContext ctx);
	/**
	 * Exit a parse tree produced by {@link idParser#llamada_funcion}.
	 * @param ctx the parse tree
	 */
	void exitLlamada_funcion(idParser.Llamada_funcionContext ctx);
	/**
	 * Enter a parse tree produced by {@link idParser#llamada_nombre_funcion}.
	 * @param ctx the parse tree
	 */
	void enterLlamada_nombre_funcion(idParser.Llamada_nombre_funcionContext ctx);
	/**
	 * Exit a parse tree produced by {@link idParser#llamada_nombre_funcion}.
	 * @param ctx the parse tree
	 */
	void exitLlamada_nombre_funcion(idParser.Llamada_nombre_funcionContext ctx);
	/**
	 * Enter a parse tree produced by {@link idParser#llamada_funcion_parametros}.
	 * @param ctx the parse tree
	 */
	void enterLlamada_funcion_parametros(idParser.Llamada_funcion_parametrosContext ctx);
	/**
	 * Exit a parse tree produced by {@link idParser#llamada_funcion_parametros}.
	 * @param ctx the parse tree
	 */
	void exitLlamada_funcion_parametros(idParser.Llamada_funcion_parametrosContext ctx);
	/**
	 * Enter a parse tree produced by {@link idParser#llamada_funcion_argumentos}.
	 * @param ctx the parse tree
	 */
	void enterLlamada_funcion_argumentos(idParser.Llamada_funcion_argumentosContext ctx);
	/**
	 * Exit a parse tree produced by {@link idParser#llamada_funcion_argumentos}.
	 * @param ctx the parse tree
	 */
	void exitLlamada_funcion_argumentos(idParser.Llamada_funcion_argumentosContext ctx);
	/**
	 * Enter a parse tree produced by {@link idParser#llamada_funcion_argumento_identificador}.
	 * @param ctx the parse tree
	 */
	void enterLlamada_funcion_argumento_identificador(idParser.Llamada_funcion_argumento_identificadorContext ctx);
	/**
	 * Exit a parse tree produced by {@link idParser#llamada_funcion_argumento_identificador}.
	 * @param ctx the parse tree
	 */
	void exitLlamada_funcion_argumento_identificador(idParser.Llamada_funcion_argumento_identificadorContext ctx);
	/**
	 * Enter a parse tree produced by {@link idParser#if}.
	 * @param ctx the parse tree
	 */
	void enterIf(idParser.IfContext ctx);
	/**
	 * Exit a parse tree produced by {@link idParser#if}.
	 * @param ctx the parse tree
	 */
	void exitIf(idParser.IfContext ctx);
	/**
	 * Enter a parse tree produced by {@link idParser#while}.
	 * @param ctx the parse tree
	 */
	void enterWhile(idParser.WhileContext ctx);
	/**
	 * Exit a parse tree produced by {@link idParser#while}.
	 * @param ctx the parse tree
	 */
	void exitWhile(idParser.WhileContext ctx);
	/**
	 * Enter a parse tree produced by {@link idParser#for}.
	 * @param ctx the parse tree
	 */
	void enterFor(idParser.ForContext ctx);
	/**
	 * Exit a parse tree produced by {@link idParser#for}.
	 * @param ctx the parse tree
	 */
	void exitFor(idParser.ForContext ctx);
	/**
	 * Enter a parse tree produced by {@link idParser#for_declaracion}.
	 * @param ctx the parse tree
	 */
	void enterFor_declaracion(idParser.For_declaracionContext ctx);
	/**
	 * Exit a parse tree produced by {@link idParser#for_declaracion}.
	 * @param ctx the parse tree
	 */
	void exitFor_declaracion(idParser.For_declaracionContext ctx);
	/**
	 * Enter a parse tree produced by {@link idParser#for_autoincremental}.
	 * @param ctx the parse tree
	 */
	void enterFor_autoincremental(idParser.For_autoincrementalContext ctx);
	/**
	 * Exit a parse tree produced by {@link idParser#for_autoincremental}.
	 * @param ctx the parse tree
	 */
	void exitFor_autoincremental(idParser.For_autoincrementalContext ctx);
	/**
	 * Enter a parse tree produced by {@link idParser#return}.
	 * @param ctx the parse tree
	 */
	void enterReturn(idParser.ReturnContext ctx);
	/**
	 * Exit a parse tree produced by {@link idParser#return}.
	 * @param ctx the parse tree
	 */
	void exitReturn(idParser.ReturnContext ctx);
	/**
	 * Enter a parse tree produced by {@link idParser#return_variables}.
	 * @param ctx the parse tree
	 */
	void enterReturn_variables(idParser.Return_variablesContext ctx);
	/**
	 * Exit a parse tree produced by {@link idParser#return_variables}.
	 * @param ctx the parse tree
	 */
	void exitReturn_variables(idParser.Return_variablesContext ctx);
	/**
	 * Enter a parse tree produced by {@link idParser#return_variable_identificador}.
	 * @param ctx the parse tree
	 */
	void enterReturn_variable_identificador(idParser.Return_variable_identificadorContext ctx);
	/**
	 * Exit a parse tree produced by {@link idParser#return_variable_identificador}.
	 * @param ctx the parse tree
	 */
	void exitReturn_variable_identificador(idParser.Return_variable_identificadorContext ctx);
}