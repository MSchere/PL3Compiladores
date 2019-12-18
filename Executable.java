
//javac Executable.java && java Executable
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;
import java.util.*;
import java.io.*;

public class Executable {
    public static void main(String[] args) throws Exception {
        // Fuerzo la carga del fichero
        String inputFile = "EjemploCodigo2.prog";
        if (args.length > 0) {
            inputFile = args[0];
        }
        InputStream is = System.in;
        if (inputFile != null) {
            is = new FileInputStream(inputFile);
        }
        try {
            CharStream input = CharStreams.fromStream(is);
            GramProgLexer lexer = new GramProgLexer(input);
            CommonTokenStream tokens = new CommonTokenStream(lexer);
            GramProgParser parser = new GramProgParser(tokens);
            parser.setBuildParseTree(true);
            ParseTree tree = parser.prog();

            // Configuramos el listener
            GramProgMiListener tb = new GramProgMiListener();
            ParseTreeWalker walker = new ParseTreeWalker();

            // Abrimos la tabla de símbolos
            TablaSimbolos ts = new TablaSimbolos();

            // Recorremos el arbol
            walker.walk(tb, tree);

            ArrayList<String> variables = new ArrayList<>();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}