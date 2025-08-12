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
CADENA: '"' (~["\r\n])* '"';
CARACTER: '\'' ( ESC_SEQ | ~['\\\r\n]) '\'';
OPERADORES_NUMERICOS: '+' | '-' | '*' | '/' | '%';
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

// OPER

IDENTIFICADOR: (LETRA | '_') (LETRA | DIGITO | '_')*;
NUMERO: (DIGITO)+;

OTRO: .;

s: instrucciones;

instrucciones: instruccion instrucciones |;

instruccion:
	declaracion_variable
	| operacion_logica
	| operacion_aritmetica
	| declaracion_funcion
	| definicion_funcion
	| llamada_funcion
	| if
	| while
	| for
	| bloque;

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
	| IDENTIFICADOR EQUAL NUMERO;

declarador_simple: IDENTIFICADOR;

/* ---------------------  OPERACIONES LOGICAS ---------------------  */

operacion_logica: expresion_booleana PUNTO_COMA;

expresion_booleana:
	termino_comparacion operador_comparacion termino_comparacion
	| PARENTESIS_APERTURA expresion_booleana PARENTESIS_CLAUSURA
	| expresion_booleana operador_logico expresion_booleana;

termino_comparacion: CADENA | identificador_logico | NUMERO;

identificador_logico: IDENTIFICADOR;

operador_comparacion:
	IGUAL
	| DISTINTO
	| MAYOR
	| MENOR
	| MAYOR_IGUAL
	| MENOR_IGUAL;

operador_logico: AND | | OR;

/* --------------------- OPERACIONES ARITMETICAS ---------------------	*/

operacion_aritmetica: expresion_aritmetica PUNTO_COMA;

expresion_aritmetica:
	terminos_aritmeticos (
		operador_aritmetico expresion_aritmetica
	)*;

terminos_aritmeticos:
	termino_aritmetico
	| PARENTESIS_APERTURA expresion_aritmetica PARENTESIS_CLAUSURA;

termino_aritmetico: identificador_aritmetico | NUMERO;

identificador_aritmetico: IDENTIFICADOR;

operador_aritmetico: SUMA | RESTA | MULTIPLICAR | DIVISION;

/* ---------------------  DECLARACION DE FUNCIONES ---------------------  */

declaracion_funcion:
	tipo_funciones declaracion_funcion_identificador PARENTESIS_APERTURA
		declaracion_funciones_parametros? PARENTESIS_CLAUSURA PUNTO_COMA;

declaracion_funcion_identificador: IDENTIFICADOR;

declaracion_funciones_parametros:
	declaracion_funcion_parametro (
		COMA declaracion_funciones_parametros
	)*;

declaracion_funcion_parametro:
	tipo_variable (
		IDENTIFICADOR declaracion_funcion_parametro_inicializado?
	)?;

declaracion_funcion_parametro_inicializado:
	(EQUAL (CADENA | NUMERO));

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

llamada_funcion:
	llamada_nombre_funcion PARENTESIS_APERTURA llamada_funcion_parametros? PARENTESIS_CLAUSURA
		PUNTO_COMA;

llamada_nombre_funcion: IDENTIFICADOR;

llamada_funcion_parametros:
	llamada_funcion_argumentos COMA llamada_funcion_parametros
	| llamada_funcion_argumentos;

llamada_funcion_argumentos: (
		llamada_funcion_argumento_identificador
		| NUMERO
		| CARACTER
	);

llamada_funcion_argumento_identificador: IDENTIFICADOR;

/* ---------------------  IF ELSE ---------------------  */

if:
	IF PARENTESIS_APERTURA expresion_booleana PARENTESIS_CLAUSURA bloque
	| IF PARENTESIS_APERTURA expresion_booleana PARENTESIS_CLAUSURA instruccion
	| IF PARENTESIS_APERTURA expresion_booleana PARENTESIS_CLAUSURA bloque ELSE bloque
	| IF PARENTESIS_APERTURA expresion_booleana PARENTESIS_CLAUSURA bloque ELSE instruccion;

/* ---------------------  WHILE ---------------------  */
while:
	WHILE PARENTESIS_APERTURA expresion_booleana PARENTESIS_CLAUSURA bloque;

/* ---------------------  FOR ---------------------  */
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

// s: ID { System.out.println("ID -> " + $ID.getText()); } s | INT { System.out.println("INT -> " +
// $INT.getText()); } s | CHAR { System.out.println("CHAR -> " + $CHAR.getText()); } s | DOUBLE {
// System.out.println("DOUBLE -> " + $DOUBLE.getText()); } s | VOID { System.out.println("VOID -> "
// + $VOID.getText()); } s

// // Símbolos | LLAVE_APERTURA { System.out.println("LLAVE_APERTURA -> " +
// $LLAVE_APERTURA.getText()); } s | LLAVE_CLAUSURA { System.out.println("LLAVE_CLAUSURA -> " +
// $LLAVE_CLAUSURA.getText()); } s | PARENTESIS_APERTURA { System.out.println("PARENTESIS_APERTURA
// -> " + $PARENTESIS_APERTURA.getText()); } s | PARENTESIS_CLAUSURA {
// System.out.println("PARENTESIS_CLAUSURA -> " + $PARENTESIS_CLAUSURA.getText()); } s | PUNTO_COMA
// { System.out.println("PUNTO_COMA -> " + $PUNTO_COMA.getText()); } s | SUMA {
// System.out.println("SUMA -> " + $SUMA.getText()); } s | RESTA { System.out.println("RESTA -> " +
// $RESTA.getText()); } s | MULTIPLICAR { System.out.println("MULTIPLICAR -> " +
// $MULTIPLICAR.getText()); } s | MODULO { System.out.println("MODULO -> " + $MODULO.getText()); } s
// | EQUAL { System.out.println("EQUAL -> " + $EQUAL.getText()); } s | INCREMENTADOR {
// System.out.println("INCREMENTADOR -> " + $INCREMENTADOR.getText()); } s | DECREMENTADOR {
// System.out.println("DECREMENTADOR -> " + $DECREMENTADOR.getText()); } s

// // Operadores lógicos | MAYOR { System.out.println("MAYOR -> " + $MAYOR.getText()); } s | MENOR {
// System.out.println("MENOR -> " + $MENOR.getText()); } s | MAYOR_IGUAL {
// System.out.println("MAYOR_IGUAL -> " + $MAYOR_IGUAL.getText()); } s | MENOR_IGUAL {
// System.out.println("MENOR_IGUAL -> " + $MENOR_IGUAL.getText()); } s | AND {
// System.out.println("AND -> " + $AND.getText()); } s | OR { System.out.println("OR -> " +
// $OR.getText()); } s

// // Estructuras de control | IF { System.out.println("IF -> " + $IF.getText()); } s | ELSE {
// System.out.println("ELSE -> " + $ELSE.getText()); } s | FOR { System.out.println("FOR -> " +
// $FOR.getText()); } s | WHILE { System.out.println("WHILE -> " + $WHILE.getText()); } s | BREAK {
// System.out.println("BREAK -> " + $BREAK.getText()); } s | CONTINUE { System.out.println("CONTINUE
// -> " + $CONTINUE.getText()); } s

// // Otros | OTRO { System.out.println("OTRO -> " + $OTRO.getText()); } s |;|;