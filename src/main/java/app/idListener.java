// Generated from /Users/enzoletona/Desktop/TC/renzo/proyecto-final-tc/src/main/java/app/id.g4 by ANTLR 4.13.1

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
	 * Enter a parse tree produced by {@link idParser#declaracion_variables}.
	 * @param ctx the parse tree
	 */
	void enterDeclaracion_variables(idParser.Declaracion_variablesContext ctx);
	/**
	 * Exit a parse tree produced by {@link idParser#declaracion_variables}.
	 * @param ctx the parse tree
	 */
	void exitDeclaracion_variables(idParser.Declaracion_variablesContext ctx);
	/**
	 * Enter a parse tree produced by {@link idParser#declaracion_variable_variantes}.
	 * @param ctx the parse tree
	 */
	void enterDeclaracion_variable_variantes(idParser.Declaracion_variable_variantesContext ctx);
	/**
	 * Exit a parse tree produced by {@link idParser#declaracion_variable_variantes}.
	 * @param ctx the parse tree
	 */
	void exitDeclaracion_variable_variantes(idParser.Declaracion_variable_variantesContext ctx);
	/**
	 * Enter a parse tree produced by {@link idParser#declaracion_variable_asignacion}.
	 * @param ctx the parse tree
	 */
	void enterDeclaracion_variable_asignacion(idParser.Declaracion_variable_asignacionContext ctx);
	/**
	 * Exit a parse tree produced by {@link idParser#declaracion_variable_asignacion}.
	 * @param ctx the parse tree
	 */
	void exitDeclaracion_variable_asignacion(idParser.Declaracion_variable_asignacionContext ctx);
	/**
	 * Enter a parse tree produced by {@link idParser#declaracion_variable_simple}.
	 * @param ctx the parse tree
	 */
	void enterDeclaracion_variable_simple(idParser.Declaracion_variable_simpleContext ctx);
	/**
	 * Exit a parse tree produced by {@link idParser#declaracion_variable_simple}.
	 * @param ctx the parse tree
	 */
	void exitDeclaracion_variable_simple(idParser.Declaracion_variable_simpleContext ctx);
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
	 * Enter a parse tree produced by {@link idParser#expresion_logica}.
	 * @param ctx the parse tree
	 */
	void enterExpresion_logica(idParser.Expresion_logicaContext ctx);
	/**
	 * Exit a parse tree produced by {@link idParser#expresion_logica}.
	 * @param ctx the parse tree
	 */
	void exitExpresion_logica(idParser.Expresion_logicaContext ctx);
	/**
	 * Enter a parse tree produced by {@link idParser#termino_logico}.
	 * @param ctx the parse tree
	 */
	void enterTermino_logico(idParser.Termino_logicoContext ctx);
	/**
	 * Exit a parse tree produced by {@link idParser#termino_logico}.
	 * @param ctx the parse tree
	 */
	void exitTermino_logico(idParser.Termino_logicoContext ctx);
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
	 * Enter a parse tree produced by {@link idParser#conector_logico}.
	 * @param ctx the parse tree
	 */
	void enterConector_logico(idParser.Conector_logicoContext ctx);
	/**
	 * Exit a parse tree produced by {@link idParser#conector_logico}.
	 * @param ctx the parse tree
	 */
	void exitConector_logico(idParser.Conector_logicoContext ctx);
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
	 * Enter a parse tree produced by {@link idParser#terminos_aritmeticos}.
	 * @param ctx the parse tree
	 */
	void enterTerminos_aritmeticos(idParser.Terminos_aritmeticosContext ctx);
	/**
	 * Exit a parse tree produced by {@link idParser#terminos_aritmeticos}.
	 * @param ctx the parse tree
	 */
	void exitTerminos_aritmeticos(idParser.Terminos_aritmeticosContext ctx);
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
	 * Enter a parse tree produced by {@link idParser#operador_aritmetico}.
	 * @param ctx the parse tree
	 */
	void enterOperador_aritmetico(idParser.Operador_aritmeticoContext ctx);
	/**
	 * Exit a parse tree produced by {@link idParser#operador_aritmetico}.
	 * @param ctx the parse tree
	 */
	void exitOperador_aritmetico(idParser.Operador_aritmeticoContext ctx);
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
	 * Enter a parse tree produced by {@link idParser#declaracion_variables_funciones}.
	 * @param ctx the parse tree
	 */
	void enterDeclaracion_variables_funciones(idParser.Declaracion_variables_funcionesContext ctx);
	/**
	 * Exit a parse tree produced by {@link idParser#declaracion_variables_funciones}.
	 * @param ctx the parse tree
	 */
	void exitDeclaracion_variables_funciones(idParser.Declaracion_variables_funcionesContext ctx);
	/**
	 * Enter a parse tree produced by {@link idParser#variables_funciones}.
	 * @param ctx the parse tree
	 */
	void enterVariables_funciones(idParser.Variables_funcionesContext ctx);
	/**
	 * Exit a parse tree produced by {@link idParser#variables_funciones}.
	 * @param ctx the parse tree
	 */
	void exitVariables_funciones(idParser.Variables_funcionesContext ctx);
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
	 * Enter a parse tree produced by {@link idParser#parametros_llamada_funcion}.
	 * @param ctx the parse tree
	 */
	void enterParametros_llamada_funcion(idParser.Parametros_llamada_funcionContext ctx);
	/**
	 * Exit a parse tree produced by {@link idParser#parametros_llamada_funcion}.
	 * @param ctx the parse tree
	 */
	void exitParametros_llamada_funcion(idParser.Parametros_llamada_funcionContext ctx);
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
}