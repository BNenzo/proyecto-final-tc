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
}