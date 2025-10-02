package app;

import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.ParseTreeWalker;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.gui.TreeViewer;

import javax.swing.*;
import java.io.File;
import java.util.Arrays;
import java.util.List;

public class App {
    private static JFrame viewerFrame = null;

    public static void main(String[] args) throws Exception {
        boolean stillSelecting = true;

        while (stillSelecting) {
            File defaultFolder = new File("src/inputs");

            JFileChooser fileChooser = new JFileChooser(defaultFolder);

            fileChooser.setDialogTitle("Selecciona un archivo para compilar");
            int result = fileChooser.showOpenDialog(null);

            if (result == JFileChooser.APPROVE_OPTION) {
                File selectedFile = fileChooser.getSelectedFile();
                TablaSimbolos.getInstance().reset();
                String filePath = selectedFile.getAbsolutePath();
                String fileNameWithOutExtension = selectedFile.getName().substring(0,
                        selectedFile.getName().lastIndexOf('.'));
                System.out.println("🚀 Iniciando compilación de: " + selectedFile.getName());
                System.out.println("============================================================");
                System.out.println();

                try {
                    // === 1. ANÁLISIS LÉXICO ===
                    CharStream input = CharStreams.fromFileName(filePath);
                    idLexer lexer = new idLexer(input);

                    // Listener para errores del lexer
                    VerboseListener lexerErrors = new VerboseListener();
                    lexer.removeErrorListeners(); // quitamos listeners por defecto
                    lexer.addErrorListener(lexerErrors);

                    CommonTokenStream tokens = new CommonTokenStream(lexer);
                    idParser parser = new idParser(tokens);

                    // Listener para errores del parser
                    VerboseListener parserErrors = new VerboseListener();
                    parser.removeErrorListeners();
                    parser.addErrorListener(parserErrors);
                    ParseTree tree = parser.s();

                    if (lexerErrors.hasErrors() || parserErrors.hasErrors()) {
                        Utils.printError("Se encontraron errores léxicos o sintácticos. Abortando compilación.");
                        continue;
                    }

                    System.out.println("=== 1. ANÁLISIS LÉXICO ===");
                    Utils.printSuccess("✅ Análisis léxico completado sin errores.");
                    Utils.printSuccess("   📊 Tokens procesados: " + tokens.getTokens().size());
                    System.out.println();

                    // === 2. ANÁLISIS SINTÁCTICO ===
                    System.out.println("=== 2. ANÁLISIS SINTÁCTICO ===");
                    Utils.printSuccess("✅ Análisis sintáctico completado sin errores.");
                    Utils.printSuccess("   📊 Árbol sintáctico generado correctamente");
                    System.out.println(tree.toStringTree(parser));
                    System.out.println();

                    // === 3. VISUALIZACIÓN DEL AST ===
                    System.out.println("=== 3. VISUALIZACIÓN DEL AST ===");
                    System.out.println(" 📊 Ventana del árbol sintáctico abierta");

                    if (viewerFrame == null) {
                        viewerFrame = new JFrame("AST - Árbol Sintáctico");
                        viewerFrame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
                        viewerFrame.setSize(800, 600);
                        viewerFrame.setVisible(true);
                    }

                    viewerFrame.getContentPane().removeAll(); // limpia contenido anterior
                    TreeViewer viewer = new TreeViewer(Arrays.asList(parser.getRuleNames()), tree);
                    viewer.setScale(1.5);
                    viewerFrame.add(viewer);
                    viewerFrame.revalidate();
                    viewerFrame.repaint();

                    // === 4. ANÁLISIS SEMÁNTICO ===
                    System.out.println("=== 4. ANÁLISIS SEMÁNTICO ===");
                    System.out.println("📋 Tabla de símbolos construida:");
                    System.out.printf("%-15s %-8s %-12s %-7s %-8s %-10s %-10s %-10s%n",
                            "NOMBRE", "TIPO", "CATEGORÍA", "LÍNEA", "COLUMNA", "ÁMBITO", "USADA", "INICIALIZADA");
                    System.out.println(
                            "-------------------------------------------------------------------------------------------");

                    ParseTreeWalker walker = new ParseTreeWalker();
                    MiListener escucha = new MiListener(parser);
                    walker.walk(escucha, tree);
                    if (TablaSimbolos.getInstance().getErrors().size() > 0) {
                        Utils.printError("Se encontraron errores semanticos. Abortando compilación.");

                        continue; // Si hay errores, salta al siguiente archivo
                    }
                    System.out.println();

                    // === 5. GENERACIÓN DE CÓDIGO INTERMEDIO ===
                    System.out.println("=== 5. GENERACIÓN DE CÓDIGO INTERMEDIO ===");
                    System.out.println("📝 Código de tres direcciones generado:");
                    MiVisitor visitor = new MiVisitor();
                    visitor.visit(tree);
                    List<String> tac = visitor.getInstructions();
                    visitor.printInstructions(fileNameWithOutExtension);
                    System.out.println();

                    // === 6. OPTIMIZACIÓN DE CÓDIGO ===
                    System.out.println("=== 6. OPTIMIZACIÓN DE CÓDIGO ===");
                    Optimizer optimizer = new Optimizer(tac);
                    optimizer.optimize();
                    optimizer.printInstructions(fileNameWithOutExtension);

                } catch (Exception e) {
                    System.out.println("❌ Error al procesar el archivo: " + e.getMessage());
                    e.printStackTrace();
                }

                // Preguntar si desea continuar
                int option = JOptionPane.showConfirmDialog(null,
                        "¿Desea compilar otro archivo?", "Continuar",
                        JOptionPane.YES_NO_OPTION);
                if (option != JOptionPane.YES_OPTION) {
                    stillSelecting = false;
                    System.out.println("🚀 Saliendo del compilador...");
                }

            } else {
                System.out.println("🚀 No se seleccionó ningún archivo. Saliendo...");
                break;
            }
        }
    }
}
