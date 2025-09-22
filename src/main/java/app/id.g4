grammar id;

@header {
package app;
}

fragment LETRA: [A-Za-z];
fragment DIGITO: [0-9];
fragment ESC_SEQ: '\\' [btnr0'"\\];
WS: [ \t\r\n]+ -> skip;

// TIPOS DE DATOS
INT: 'int';
CHAR: 'char';
DOUBLE: 'double';
VOID: 'void';

// SIMBOLOS 
LLAVE_APERTURA: '{';
LLAVE_CLAUSURA: '}';
PARENTESIS_APERTURA: '(';
PARENTESIS_CLAUSURA: ')';
PUNTO_COMA: ';';
SUMA: '+';
RESTA: '-';
MULTIPLICAR: '*';
MODULO: '%';
DIVISION: '/';
EQUAL: '=';
INCREMENTADOR: '++';
DECREMENTADOR: '--';
COMILLA: '"';
COMA: ',';

// SIMBOLOS LOGICOS
MAYOR: '>';
MENOR: '<';
MAYOR_IGUAL: '>=';
MENOR_IGUAL: '<=';
IGUAL: '==';
DISTINTO: '!=';
AND: '&&';
OR: '||';

// ESTRUCTURAS CONTROL
IF: 'if';
ELSE: 'else';
FOR: 'for';
WHILE: 'while';
BREAK: 'break';
CONTINUE: 'continue';
RETURN: 'return';

CARACTER: '\'' ( ESC_SEQ | ~['\\\r\n]) '\'';
IDENTIFICADOR: (LETRA | ('_' LETRA)) (LETRA | DIGITO | '_')*;
NUMERO_DOUBLE: DIGITO+ '.' DIGITO+;
NUMERO: (DIGITO)+;

OTRO: .;

s: instrucciones;

instrucciones: instruccion instrucciones |;

instruccion:
	declaracion_variable
	| asignacion_variable
	| operacion_logica
	| operacion_aritmetica
	| declaracion_funcion
	| definicion_funcion
	| llamada_funcion
	| if
	| while
	| for
	| bloque
	| return;

tipo_variable: INT | DOUBLE | CHAR;
tipo_funciones: INT | DOUBLE | CHAR | VOID;
bloque: LLAVE_APERTURA instrucciones LLAVE_CLAUSURA;

/* --------------------- DECLARACION VARIABLES --------------------- */
declaracion_variable:
	tipo_variable declaracion_variable_declaradores PUNTO_COMA;

declaracion_variable_declaradores:
	declarador_inicializado COMA declaracion_variable_declaradores
	| declarador_simple COMA declaracion_variable_declaradores
	| declarador_inicializado
	| declarador_simple;

declarador_inicializado:
	IDENTIFICADOR EQUAL CARACTER
	| IDENTIFICADOR EQUAL IDENTIFICADOR
	| IDENTIFICADOR EQUAL NUMERO_DOUBLE
	| IDENTIFICADOR EQUAL NUMERO
	| IDENTIFICADOR EQUAL llamada_funcion_expresion
	| IDENTIFICADOR EQUAL expresion_booleana
	| IDENTIFICADOR EQUAL expresion_aritmetica;

declarador_simple: IDENTIFICADOR;

/* --------------------- ASIGNACION VARIABLES --------------------- */

asignacion_variable:
	asignacion_variable_identificador EQUAL (
		NUMERO
		| NUMERO_DOUBLE
		| CARACTER
		| expresion_aritmetica
		| expresion_booleana
		| llamada_funcion_expresion
	) PUNTO_COMA;

asignacion_variable_identificador: IDENTIFICADOR;

/* ---------------------  OPERACIONES LOGICAS ---------------------  */

operacion_logica: expresion_booleana PUNTO_COMA;

expresion_booleana:
	termino_comparacion operador_comparacion termino_comparacion
	| PARENTESIS_APERTURA expresion_booleana PARENTESIS_CLAUSURA
	| expresion_booleana operador_logico expresion_booleana;

termino_comparacion:
	CARACTER
	| identificador_logico
	| NUMERO
	| NUMERO_DOUBLE;

identificador_logico: IDENTIFICADOR;

operador_comparacion:
	IGUAL
	| DISTINTO
	| MAYOR
	| MENOR
	| MAYOR_IGUAL
	| MENOR_IGUAL;

operador_logico: AND | OR;

/* --------------------- OPERACIONES ARITMETICAS ---------------------	*/

operacion_aritmetica: expresion_aritmetica PUNTO_COMA;

expresion_aritmetica:
	termino_aritmetico ((SUMA | RESTA) termino_aritmetico)*;

termino_aritmetico:
	factor ((MULTIPLICAR | DIVISION | MODULO) factor)*;

factor:
	NUMERO
	| NUMERO_DOUBLE
	| identificador_aritmetico
	| PARENTESIS_APERTURA expresion_aritmetica PARENTESIS_CLAUSURA;

identificador_aritmetico: IDENTIFICADOR;

/* ---------------------  DECLARACION DE FUNCIONES ---------------------  */

declaracion_funcion:
	tipo_funciones declaracion_funcion_identificador PARENTESIS_APERTURA
		declaracion_funciones_parametros? PARENTESIS_CLAUSURA PUNTO_COMA;

declaracion_funcion_identificador: IDENTIFICADOR;

declaracion_funciones_parametros:
	declaracion_funcion_parametro (
		COMA declaracion_funcion_parametro
	)*;

declaracion_funcion_parametro:
	tipo_variable (
		IDENTIFICADOR declaracion_funcion_parametro_inicializado?
	)?;

declaracion_funcion_parametro_inicializado: (
		EQUAL (CARACTER | NUMERO | NUMERO_DOUBLE)
	);

/* ---------------------  DEFINICION DE FUNCIONES ---------------------  */

definicion_funcion:
	tipo_funciones definicion_funcion_nombre PARENTESIS_APERTURA definicion_funcion_parametros?
		PARENTESIS_CLAUSURA bloque;

definicion_funcion_nombre: IDENTIFICADOR;

definicion_funcion_parametros:
	definicion_funcion_parametro (
		COMA definicion_funcion_parametro
	)*;

definicion_funcion_parametro:
	tipo_variable definicion_funcion_parametro_nombre declaracion_funcion_parametro_inicializado?;

definicion_funcion_parametro_nombre: IDENTIFICADOR;

/* ---------------------  LLAMADAS DE FUNCIONES ---------------------  */

llamada_funcion: llamada_funcion_expresion PUNTO_COMA;

llamada_funcion_expresion:
	llamada_nombre_funcion PARENTESIS_APERTURA llamada_funcion_parametros? PARENTESIS_CLAUSURA;

llamada_nombre_funcion: IDENTIFICADOR;

llamada_funcion_parametros:
	llamada_funcion_argumentos (COMA llamada_funcion_argumentos)*;

llamada_funcion_argumentos: (
		llamada_funcion_argumento_identificador
		| NUMERO
		| NUMERO_DOUBLE
		| CARACTER
	);

llamada_funcion_argumento_identificador: IDENTIFICADOR;

/* ---------------------  IF ELSE ---------------------  */

if:
	IF PARENTESIS_APERTURA expresion_booleana PARENTESIS_CLAUSURA bloque
	| IF PARENTESIS_APERTURA expresion_booleana PARENTESIS_CLAUSURA instruccion
	| IF PARENTESIS_APERTURA expresion_booleana PARENTESIS_CLAUSURA bloque ELSE bloque
	| IF PARENTESIS_APERTURA expresion_booleana PARENTESIS_CLAUSURA bloque ELSE instruccion;

/* --------------------- WHILE --------------------- */
while:
	WHILE PARENTESIS_APERTURA expresion_booleana PARENTESIS_CLAUSURA bloque;

/* --------------------- FOR --------------------- */
for:
	FOR PARENTESIS_APERTURA for_declaracion? PUNTO_COMA expresion_booleana PUNTO_COMA
		for_autoincremental PARENTESIS_CLAUSURA bloque;

for_declaracion:
	tipo_variable declarador_inicializado (
		COMA declarador_inicializado
	)*;

for_autoincremental:
	IDENTIFICADOR INCREMENTADOR (COMA for_autoincremental)*
	| IDENTIFICADOR DECREMENTADOR (COMA for_autoincremental)*;

/* ---------------------  RETURN --------------------- */

return: RETURN return_variables PUNTO_COMA;

return_variables:
	NUMERO
	| NUMERO_DOUBLE
	| CARACTER
	| return_variable_identificador;

return_variable_identificador: IDENTIFICADOR;