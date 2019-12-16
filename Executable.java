
//javac Executable.java && java Executable
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;
import java.util.*;
import java.io.*;

public class Executable{
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

            //Abrimos la tabla de símbolos
            TablaSimbolos ts = new TablaSimbolos();

            // Recorremos el arbol
            walker.walk(tb, tree);

            ArrayList<String> variables = new ArrayList<>();
            for (int i = 0; i < tb.arbol.size(); i++) {
                // System.out.println(tb.arbol.get(i));
                if (tb.arbol.get(i).equals("numero")) {
                    if (tb.arbol.get(i + 1).equals("begin")) {
                        i++;
                    } else {
                        System.out.println(tb.arbol.get(i));
                        if (tb.arbol.get(i + 2).equals(":=")) {
                            System.out.println(tb.arbol.get(i + 1));
                            System.out.println(tb.arbol.get(i + 5));
                            variables.add(tb.arbol.get(i + 1));
                            i = i + 5;
                        } else {
                            System.out.println(tb.arbol.get(i + 1));
                            variables.add(tb.arbol.get(i + 1));
                            i = i + 2;
                        }
                    }
                }
                for (int j = 0; j < variables.size(); j++) {
                    if (tb.arbol.get(i).equals(variables.get(j))&&(tb.arbol.get(i+1).equals(":="))) {
                        System.out.println(variables.get(j) + " reasignado");
                        System.out.println(tb.arbol.get(i + 2));
                    }
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}