package app;

import org.antlr.v4.runtime.tree.ParseTree;

import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CommonTokenStream;

/**
 * Hello world!
 *
 */
public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Inicio del programa");

        // create a CharStream that reads from file
        CharStream input = CharStreams.fromFileName("src/programa.txt");

        // create a lexer that feeds off of input CharStream
        idLexer lexer = new idLexer(input);

        // create a buffer of tokens pulled from the lexer
        CommonTokenStream tokens = new CommonTokenStream(lexer);

        // create a parser that feeds off the tokens buffer
        idParser parser = new idParser(tokens);

        // create Listener
        idBaseListener escucha = new MiListener(parser);
        parser.addParseListener(escucha);

        // Solicito al parser que comience indicando una regla gramatical
        // En este caso la regla es el simbolo inicial
        // parser.s();
        System.out.println("");
        ParseTree tree = parser.s();
        System.out.println("");

        MiVisitor visitor = new MiVisitor();
        String resultado = visitor.visit(tree);

        System.out.println(tree.toStringTree(parser));
        System.out.println("");
        System.out.println("Resultado TAC: " + resultado);

        System.out.println("fin del programa");
    }
}
