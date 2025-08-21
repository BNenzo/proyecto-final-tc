// Generated from /Users/enzoletona/Desktop/TC/renzo/proyecto-final-tc/src/main/java/app/id.g4 by ANTLR 4.13.1

package app;

import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link idParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface idVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link idParser#s}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitS(idParser.SContext ctx);
	/**
	 * Visit a parse tree produced by {@link idParser#instrucciones}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInstrucciones(idParser.InstruccionesContext ctx);
	/**
	 * Visit a parse tree produced by {@link idParser#instruccion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInstruccion(idParser.InstruccionContext ctx);
	/**
	 * Visit a parse tree produced by {@link idParser#tipo_variable}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTipo_variable(idParser.Tipo_variableContext ctx);
	/**
	 * Visit a parse tree produced by {@link idParser#tipo_funciones}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTipo_funciones(idParser.Tipo_funcionesContext ctx);
	/**
	 * Visit a parse tree produced by {@link idParser#bloque}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBloque(idParser.BloqueContext ctx);
	/**
	 * Visit a parse tree produced by {@link idParser#declaracion_variable}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclaracion_variable(idParser.Declaracion_variableContext ctx);
	/**
	 * Visit a parse tree produced by {@link idParser#declaracion_variable_declaradores}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclaracion_variable_declaradores(idParser.Declaracion_variable_declaradoresContext ctx);
	/**
	 * Visit a parse tree produced by {@link idParser#declarador_inicializado}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclarador_inicializado(idParser.Declarador_inicializadoContext ctx);
	/**
	 * Visit a parse tree produced by {@link idParser#declarador_simple}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclarador_simple(idParser.Declarador_simpleContext ctx);
	/**
	 * Visit a parse tree produced by {@link idParser#asignacion_variable}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAsignacion_variable(idParser.Asignacion_variableContext ctx);
	/**
	 * Visit a parse tree produced by {@link idParser#asignacion_variable_identificador}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAsignacion_variable_identificador(idParser.Asignacion_variable_identificadorContext ctx);
	/**
	 * Visit a parse tree produced by {@link idParser#operacion_logica}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOperacion_logica(idParser.Operacion_logicaContext ctx);
	/**
	 * Visit a parse tree produced by {@link idParser#expresion_booleana}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpresion_booleana(idParser.Expresion_booleanaContext ctx);
	/**
	 * Visit a parse tree produced by {@link idParser#termino_comparacion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTermino_comparacion(idParser.Termino_comparacionContext ctx);
	/**
	 * Visit a parse tree produced by {@link idParser#identificador_logico}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIdentificador_logico(idParser.Identificador_logicoContext ctx);
	/**
	 * Visit a parse tree produced by {@link idParser#operador_comparacion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOperador_comparacion(idParser.Operador_comparacionContext ctx);
	/**
	 * Visit a parse tree produced by {@link idParser#operador_logico}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOperador_logico(idParser.Operador_logicoContext ctx);
	/**
	 * Visit a parse tree produced by {@link idParser#operacion_aritmetica}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOperacion_aritmetica(idParser.Operacion_aritmeticaContext ctx);
	/**
	 * Visit a parse tree produced by {@link idParser#expresion_aritmetica}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpresion_aritmetica(idParser.Expresion_aritmeticaContext ctx);
	/**
	 * Visit a parse tree produced by {@link idParser#termino_aritmetico}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTermino_aritmetico(idParser.Termino_aritmeticoContext ctx);
	/**
	 * Visit a parse tree produced by {@link idParser#factor}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFactor(idParser.FactorContext ctx);
	/**
	 * Visit a parse tree produced by {@link idParser#identificador_aritmetico}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIdentificador_aritmetico(idParser.Identificador_aritmeticoContext ctx);
	/**
	 * Visit a parse tree produced by {@link idParser#declaracion_funcion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclaracion_funcion(idParser.Declaracion_funcionContext ctx);
	/**
	 * Visit a parse tree produced by {@link idParser#declaracion_funcion_identificador}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclaracion_funcion_identificador(idParser.Declaracion_funcion_identificadorContext ctx);
	/**
	 * Visit a parse tree produced by {@link idParser#declaracion_funciones_parametros}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclaracion_funciones_parametros(idParser.Declaracion_funciones_parametrosContext ctx);
	/**
	 * Visit a parse tree produced by {@link idParser#declaracion_funcion_parametro}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclaracion_funcion_parametro(idParser.Declaracion_funcion_parametroContext ctx);
	/**
	 * Visit a parse tree produced by {@link idParser#declaracion_funcion_parametro_inicializado}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclaracion_funcion_parametro_inicializado(idParser.Declaracion_funcion_parametro_inicializadoContext ctx);
	/**
	 * Visit a parse tree produced by {@link idParser#definicion_funcion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDefinicion_funcion(idParser.Definicion_funcionContext ctx);
	/**
	 * Visit a parse tree produced by {@link idParser#definicion_funcion_nombre}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDefinicion_funcion_nombre(idParser.Definicion_funcion_nombreContext ctx);
	/**
	 * Visit a parse tree produced by {@link idParser#definicion_funcion_parametros}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDefinicion_funcion_parametros(idParser.Definicion_funcion_parametrosContext ctx);
	/**
	 * Visit a parse tree produced by {@link idParser#definicion_funcion_parametro}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDefinicion_funcion_parametro(idParser.Definicion_funcion_parametroContext ctx);
	/**
	 * Visit a parse tree produced by {@link idParser#definicion_funcion_parametro_nombre}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDefinicion_funcion_parametro_nombre(idParser.Definicion_funcion_parametro_nombreContext ctx);
	/**
	 * Visit a parse tree produced by {@link idParser#llamada_funcion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLlamada_funcion(idParser.Llamada_funcionContext ctx);
	/**
	 * Visit a parse tree produced by {@link idParser#llamada_nombre_funcion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLlamada_nombre_funcion(idParser.Llamada_nombre_funcionContext ctx);
	/**
	 * Visit a parse tree produced by {@link idParser#llamada_funcion_parametros}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLlamada_funcion_parametros(idParser.Llamada_funcion_parametrosContext ctx);
	/**
	 * Visit a parse tree produced by {@link idParser#llamada_funcion_argumentos}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLlamada_funcion_argumentos(idParser.Llamada_funcion_argumentosContext ctx);
	/**
	 * Visit a parse tree produced by {@link idParser#llamada_funcion_argumento_identificador}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLlamada_funcion_argumento_identificador(idParser.Llamada_funcion_argumento_identificadorContext ctx);
	/**
	 * Visit a parse tree produced by {@link idParser#if}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIf(idParser.IfContext ctx);
	/**
	 * Visit a parse tree produced by {@link idParser#while}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhile(idParser.WhileContext ctx);
	/**
	 * Visit a parse tree produced by {@link idParser#for}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFor(idParser.ForContext ctx);
	/**
	 * Visit a parse tree produced by {@link idParser#for_declaracion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFor_declaracion(idParser.For_declaracionContext ctx);
	/**
	 * Visit a parse tree produced by {@link idParser#for_autoincremental}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFor_autoincremental(idParser.For_autoincrementalContext ctx);
	/**
	 * Visit a parse tree produced by {@link idParser#return}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReturn(idParser.ReturnContext ctx);
	/**
	 * Visit a parse tree produced by {@link idParser#return_variables}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReturn_variables(idParser.Return_variablesContext ctx);
	/**
	 * Visit a parse tree produced by {@link idParser#return_variable_identificador}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReturn_variable_identificador(idParser.Return_variable_identificadorContext ctx);
}