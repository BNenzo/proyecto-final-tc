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
}