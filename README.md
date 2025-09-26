# ⚙️ Instalación y Configuración

1. **Instalar Java JDK 11**

   - Puedes usar **Oracle JDK** o **OpenJDK**.

2. **Instalar Visual Studio Code**

   - Descarga desde la [página oficial](https://code.visualstudio.com/) o usa el gestor de paquetes de tu sistema operativo.

3. **Instalar extensiones en VS Code**

   - [x] **Java Extension Pack**
   - [x] **Maven for Java**
   - [x] **ANTLR4 grammar syntax support (Mike Lischke)**

4. **Control de versiones**
   - Usar Git integrado en VS Code (no es necesario instalarlo aparte).

# 🛠️ Guía de Uso del Compilador

Este compilador permite analizar archivos fuente, mostrando las diferentes fases del proceso de compilación y generando código intermedio optimizado.

## ▶️ Ejecución

1. Asegúrate de tener instalados los **requisitos previos** (Java, VS Code, extensiones, etc.).
2. Coloca los archivos de entrada dentro de la carpeta:
   ```bash
   src/inputs/
   ```
3. Ejecutar la clase principal **App.java** (desde la consola o desde Visual Studio Code).
4. El programa abrirá una **ventana modal** para seleccionar el archivo a analizar, por defecto en la ruta:
5. Una vez finalizado el análisis del archivo seleccionado, el programa preguntará si deseas **analizar otro archivo**.

- Si respondes **Sí**, el proceso se reinicia.
- Si respondes **No**, el compilador finaliza su ejecución.

## 📌 Ejemplos de compilación de programas

### Ejemplo 1: `declaraciones_y_operaciones.cpp`

```cpp
int suma(int, int);

int main () {
  int num1;
  int num2, num3 = 3, num4;
  double double_num1;
  double double_num2, double_num3 = 3.14, double_num4;

  char ch_1, ch_2 = 'c';

  int resultadoSuma = suma(num2, num4) + 32;
  int opArit = num3 + 5;
  int opLogica = num3 < num4;

  return 0;
}

int suma (int x, int y) {
  int resultado = x + y;
  return resultado;
}
```

### Output:

```text
🚀 Iniciando compilación de: declaraciones_y_operaciones.cpp
============================================================

=== 1. ANÁLISIS LÉXICO ===
✅ Análisis léxico completado sin errores.
📊 Tokens procesados: 96

=== 2. ANÁLISIS SINTÁCTICO ===
✅ Análisis sintáctico completado sin errores.
📊 Árbol sintáctico generado correctamente

=== 3. VISUALIZACIÓN DEL AST ===
📊 Ventana del árbol sintáctico abierta

=== 4. ANÁLISIS SEMÁNTICO ===
📋 Tabla de símbolos construida:
NOMBRE TIPO CATEGORÍA LÍNEA COLUMNA ÁMBITO USADA INICIALIZADA

---

main INT function 3 4 global true true
num1 INT variable 4 6 main false false
num2 INT variable 5 6 main true false
...
⚠️ Warnings de variables no usadas o no inicializadas

=== 5. GENERACIÓN DE CÓDIGO INTERMEDIO ===
📝 Código de tres direcciones generado:

FUNC DECLARE suma : int (int , int );
DEF_FUNC main() : int
DECLARE num1 int
DECLARE num2 int
DECLARE num3 int
num3 = 3
DECLARE num4 int
DECLARE double_num1 double
DECLARE double_num2 double
DECLARE double_num3 double
double_num3 = 3.14
DECLARE double_num4 double
DECLARE ch_1 char
DECLARE ch_2 char
ch_2 = 'c'
DECLARE resultadoSuma int
t0 = CALL suma, num2,num4 + 32
resultadoSuma = t0
DECLARE opArit int
t1 = num3 + 5
opArit = t1
DECLARE opLogica int
t2 = num3 < num4
opLogica = t2
RETURN 0
END_FUNC
DEF_FUNC suma(int x, int y) : int
DECLARE resultado int
t3 = x + y
resultado = t3
RETURN resultado
END_FUNC

✅ Instrucciones guardadas en: src/outputs/declaraciones_y_operaciones_codigo_intermedio.txt

=== 6. OPTIMIZACIÓN DE CÓDIGO ===
📊 Instrucciones originales: 32
📊 Instrucciones optimizadas: 26
📊 Instrucciones eliminadas: 6
📊 Reducción de código: 18.75%

✅ Codigo optimizado generado:

FUNC DECLARE suma : int (int , int );
DEF_FUNC main() : int
DECLARE num1 int
DECLARE num2 int
DECLARE num3 int
DECLARE num4 int
DECLARE double_num1 double
DECLARE double_num2 double
DECLARE double_num3 double
DECLARE double_num4 double
DECLARE ch_1 char
DECLARE ch_2 char
DECLARE resultadoSuma int
t0 = CALL suma, num2,num4 + 32
DECLARE opArit int
t1 = 8
DECLARE opLogica int
t2 = 3 < num4
RETURN 0
END_FUNC
DEF_FUNC suma(int x, int y) : int
DECLARE resultado int
t3 = x + y
resultado = t3
RETURN resultado
END_FUNC
✅ Instrucciones guardadas en: src/outputs/declaraciones_y_operaciones_codigo_intermedio_optimizado.txt
```

### Ejemplo 2: `errores.cpp`

```cpp
char suma();

int main () {
  int x;
  int p;
  int p;

  if (z < 6) {
    x = 3;
  }
}

int suma () {
  return 5;
}
```

### Output:

```text
🚀 Iniciando compilación de: errores.cpp
============================================================

=== 1. ANÁLISIS LÉXICO ===
✅ Análisis léxico completado sin errores.
   📊 Tokens procesados: 42

=== 2. ANÁLISIS SINTÁCTICO ===
✅ Análisis sintáctico completado sin errores.
   📊 Árbol sintáctico generado correctamente

=== 3. VISUALIZACIÓN DEL AST ===
 📊 Ventana del árbol sintáctico abierta

=== 4. ANÁLISIS SEMÁNTICO ===
📋 Tabla de símbolos construida:
NOMBRE          TIPO     CATEGORÍA    LÍNEA   COLUMNA  ÁMBITO     USADA      INICIALIZADA
-------------------------------------------------------------------------------------------
main            INT      function     3       4        global     true       true
x               INT      variable     4       6        main       false      true
p               INT      variable     5       6        main       false      false
suma            CHAR     function     1       5        global     false      false
❌ Error: La variable 'p' ya está declarada en el ámbito 'main()' (línea 6, columna 6)
❌ Error: Variable 'z' no declarada en el ámbito 'main()' (línea 8, columna 6)
❌ Error: Ambigua nueva declaracion para la funcion: suma, Se espera que la definicion retorne: CHAR
⚠️  Warning: la variable 'x', no es usada en ningun contexto (linea 4, columna 6)
⚠️  Warning: la variable 'p', no es usada en ningun contexto (linea 5, columna 6)
⚠️  Warning: la variable 'p' no es fue inicializada en ningun contexto (linea:5, columna: 6)
⚠️  Warning: la variable 'suma()', no es usada en ningun contexto (linea 1, columna 5)
⚠️  Warning: la variable 'suma()' no es fue inicializada en ningun contexto (linea:1, columna: 5)
```

## Interpretación de los mensajes de error y warning

❌ Error: La variable 'p' ya está declarada en el ámbito 'main()' (línea 6, columna 6)

- Este mensaje indica que se intentó **re-declarar** una variable que ya existe en el mismo ámbito.

❌ Error: Variable 'z' no declarada en el ámbito 'main()' (línea 8, columna 6)

- Este error ocurre cuando se intenta utilizar una variable que **no ha sido declarada** previamente.

❌ Error: Ambigua nueva declaración para la función 'suma'. Se esperaba que la definición retornara: CHAR

- Este error se produce cuando se declara una función y luego se define la misma función **con una firma que tiene un tipo de retorno diferente**.

⚠️ Warning: la variable 'suma()', no es usada en ningun contexto (linea 1, columna 5)

- Este warning ocurre cuando una funcion no es usada en ningun lugar.

⚠️ Warning: la variable 'x', no es usada en ningun contexto (linea 4, columna 6)

- Este warning ocurre cuando una variable no es usada en ningun ambito

⚠️ Warning: la variable 'p' no es fue inicializada en ningun contexto (linea:5, columna: 6)

- Este warning ocurre cuando una variable fue declarada pero no inicializada.
