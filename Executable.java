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
            File file = new File("Arbol.txt");
            FileWriter fw = new FileWriter(file.getAbsoluteFile());
            BufferedWriter bw = new BufferedWriter(fw);

            CharStream input = CharStreams.fromStream(is);
            GramProgLexer lexer = new GramProgLexer(input);
            CommonTokenStream tokens = new CommonTokenStream(lexer);
            GramProgParser parser = new GramProgParser(tokens);
            parser.setBuildParseTree(true);
            ParseTree tree = parser.prog();

            // Configuramos el listener
            GramProgMiListener tb = new GramProgMiListener();
            ParseTreeWalker walker = new ParseTreeWalker();

            // Recorremos el arbol
            walker.walk(tb, tree);
            for (int i = 0; i < tb.arbol.size(); i++) {
                System.out.println(tb.arbol.get(i));
                bw.write(tb.arbol.get(i));
                bw.newLine();
            }
            bw.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}