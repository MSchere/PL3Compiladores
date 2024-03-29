
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

            CharStream input = CharStreams.fromStream(is);
            GramProgLexer lexer = new GramProgLexer(input);
            CommonTokenStream tokens = new CommonTokenStream(lexer);
            GramProgParser parser = new GramProgParser(tokens);
            parser.setBuildParseTree(true);
            ParseTree tree = parser.prog();

            // Configuramos el listener
            ParseTreeWalker walker = new ParseTreeWalker();

            // Abrimos la tabla de símbolos
            TablaSimbolos ts = new TablaSimbolos();
            
            //Creamos pasadas y las recorremos
            PrimeraPasada p1 = new PrimeraPasada(ts);
            p1.visit(tree);

    }
}