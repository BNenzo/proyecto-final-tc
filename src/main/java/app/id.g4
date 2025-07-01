grammar id;

@header {
package app;
}

fragment LETRA: [A-Za-z];
fragment DIGITO: [0-9];

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
	declaracion_variables
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
declaracion_variables:
	tipo_variable declaracion_variable_variantes PUNTO_COMA;

declaracion_variable_variantes:
	declaracion_variable_asignacion COMA declaracion_variable_variantes
	| declaracion_variable_simple COMA declaracion_variable_variantes
	| declaracion_variable_asignacion
	| declaracion_variable_simple;

declaracion_variable_asignacion:
	IDENTIFICADOR EQUAL CADENA
	| IDENTIFICADOR EQUAL IDENTIFICADOR
	| IDENTIFICADOR EQUAL NUMERO;

declaracion_variable_simple: IDENTIFICADOR;

/* OPERACIONES LOGICAS */

operacion_logica: expresion_logica PUNTO_COMA;

expresion_logica:
	termino_logico operador_logico termino_logico
	| PARENTESIS_APERTURA expresion_logica PARENTESIS_CLAUSURA
	| expresion_logica conector_logico expresion_logica;

termino_logico: CADENA | IDENTIFICADOR | NUMERO;

operador_logico:
	IGUAL
	| DISTINTO
	| MAYOR
	| MENOR
	| MAYOR_IGUAL
	| MENOR_IGUAL;

conector_logico: AND | | OR;

/* OPERACIONES ARITMETICAS */

operacion_aritmetica: expresion_aritmetica PUNTO_COMA;

expresion_aritmetica:
	terminos_aritmeticos (
		operador_aritmetico expresion_aritmetica
	)*;

terminos_aritmeticos:
	termino_aritmetico
	| PARENTESIS_APERTURA expresion_aritmetica PARENTESIS_CLAUSURA;

termino_aritmetico: IDENTIFICADOR | NUMERO;

operador_aritmetico: SUMA | RESTA | MULTIPLICAR | DIVISION;

/* DECLARACION DE FUNCIONES */

declaracion_funcion:
	tipo_funciones IDENTIFICADOR PARENTESIS_APERTURA declaracion_variables_funciones?
		PARENTESIS_CLAUSURA PUNTO_COMA;

declaracion_variables_funciones:
	variables_funciones (COMA declaracion_variables_funciones)*;

variables_funciones:
	tipo_funciones IDENTIFICADOR (EQUAL (CADENA | NUMERO))?;

/* DEFINICION DE FUNCIONES */
definicion_funcion:
	tipo_funciones IDENTIFICADOR PARENTESIS_APERTURA declaracion_variables_funciones
		PARENTESIS_CLAUSURA bloque;

/* LLAMADAS DE FUNCIONES */

llamada_funcion:
	IDENTIFICADOR PARENTESIS_APERTURA parametros_llamada_funcion? PARENTESIS_CLAUSURA PUNTO_COMA;

parametros_llamada_funcion: (IDENTIFICADOR | NUMERO | CADENA) COMA parametros_llamada_funcion
	| (IDENTIFICADOR | NUMERO | CADENA);

/* IF ELSE */

if:
	IF PARENTESIS_APERTURA expresion_logica PARENTESIS_CLAUSURA bloque
	| IF PARENTESIS_APERTURA expresion_logica PARENTESIS_CLAUSURA instruccion
	| IF PARENTESIS_APERTURA expresion_logica PARENTESIS_CLAUSURA bloque ELSE bloque
	| IF PARENTESIS_APERTURA expresion_logica PARENTESIS_CLAUSURA bloque ELSE instruccion;

while:
	WHILE PARENTESIS_APERTURA expresion_logica PARENTESIS_CLAUSURA bloque;

for:
	FOR PARENTESIS_APERTURA for_declaracion? PUNTO_COMA expresion_logica PUNTO_COMA
		for_autoincremental PARENTESIS_CLAUSURA bloque;

for_declaracion:
	tipo_variable declaracion_variable_asignacion (
		COMA declaracion_variable_asignacion
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