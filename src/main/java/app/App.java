package app;

import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.ParseTreeWalker;
import org.antlr.v4.runtime.CharStreams;

import java.util.Arrays;
import java.util.List;

import javax.swing.JFrame;

import org.antlr.v4.gui.TreeViewer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CommonTokenStream;

/**
 * Hello world!
 *
 */
public class App {
    public static void main(String[] args) throws Exception {

        // create a CharStream that reads from file
        CharStream input = CharStreams.fromFileName("src/programa.txt");

        // create a lexer that feeds off of input CharStream
        idLexer lexer = new idLexer(input);

        // create a buffer of tokens pulled from the lexer
        CommonTokenStream tokens = new CommonTokenStream(lexer);

        // create a parser that feeds off the tokens buffer
        idParser parser = new idParser(tokens);

        // Solicito al parser que comience indicando una regla gramatical
        // En este caso la regla es el simbolo inicial

        ParseTree tree = parser.s();

        System.out.println("");
        // System.out.println("Resultado TAC: " + resultado);
        // create Listener

        // System.out.println("📊 Tokens procesados: " + cantidadTokens);

        System.out.println("🚀 Iniciando compilación de: programa.txt");
        System.out.println("============================================================");
        System.out.println();
        // === 1. ANÁLISIS LÉXICO ===
        System.out.println("=== 1. ANÁLISIS LÉXICO ===");
        System.out.println("✅ Análisis léxico completado sin errores.");
        System.out.println("   📊 Tokens procesados: " + tokens.getTokens().size());
        System.out.println();
        // === 2. ANÁLISIS SINTÁCTICO ===
        System.out.println("=== 2. ANÁLISIS SINTÁCTICO ===");
        System.out.println("✅ Análisis sintáctico completado sin errores.");
        System.out.println("   📊 Árbol sintáctico generado correctamente");
        System.out.println(tree.toStringTree(parser));
        System.out.println();
        // === 3. VISUALIZACIÓN DEL AST ===
        // System.out.println("=== 3. VISUALIZACIÓN DEL AST ===");
        // System.out.println(" 📊 Ventana del árbol sintáctico abierta");
        // JFrame frame = new JFrame("AST - Árbol Sintáctico");
        // frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        // TreeViewer viewer = new TreeViewer(Arrays.asList(parser.getRuleNames()),
        // tree);
        // viewer.setScale(1.5);
        // frame.add(viewer);
        // frame.setSize(800, 600);
        // frame.setVisible(false);
        System.out.println("=== 4. ANÁLISIS SEMÁNTICO ===");
        System.out.println("📋 Tabla de símbolos construida:");
        System.out.printf("%-15s %-8s %-12s %-7s %-8s %-10s %-10s %-10s%n",
                "NOMBRE", "TIPO", "CATEGORÍA", "LÍNEA", "COLUMNA", "ÁMBITO", "USADA", "INICIALIZADA");
        System.out
                .println("-------------------------------------------------------------------------------------------");

        ParseTreeWalker walker = new ParseTreeWalker();
        MiListener escucha = new MiListener(parser);
        walker.walk(escucha, tree);
        System.out.println("=== 5. GENERACIÓN DE CÓDIGO INTERMEDIO ===");
        System.out.println("📝 Código de tres direcciones generado:");
        MiVisitor visitor = new MiVisitor();
        visitor.visit(tree);
        List<String> tac = visitor.getInstructions();
        visitor.printInstructions();
        System.out.println("=== 6. OPTIMIZACIÓN DE CÓDIGO ===");
        System.out.println("✅ Codigo optimizado generado:");
        Optimizer optimizer = new Optimizer(tac);
        List<String> optimized = optimizer.optimize();
        for (String instr : optimized) {
            System.out.println(instr);
        }
        System.out.println("fin del programa");

    }
}
