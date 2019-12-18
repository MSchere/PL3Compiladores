// fichero ejecutable.
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;

import java.io.FileInputStream;
import java.io.InputStream;
import java.util.*;

public class PruebaTrip {
    public void main(boolean debug){
        String ruta = "./Tripletas.txt";
        try {
            InputStream is = System.in;
            is=new FileInputStream(ruta);

            CharStream input = CharStreams.fromStream(is);
            GramJInsLexer lexer = new GramJInsLexer(input);
            CommonTokenStream tokens = new CommonTokenStream(lexer);
            GramJInsParser parser = new GramJInsParser(tokens);
            parser.setBuildParseTree(true);
            ParseTree tree=parser.prog();

            //Enseñamos el árbol.
            //System.out.println(tree.toStringTree(parser));

            ListenerTripletas nv = new ListenerTripletas();
            ParseTreeWalker walker = new ParseTreeWalker();
            walker.walk(nv,tree);

            //System.out.println(nv.getArray());

            ArrayList<ArrayList<String>> triStrng = new ArrayList<ArrayList<String>>(nv.getArray());
            ArrayList<Tripletas> tripletas = new ArrayList<Tripletas>();
            for(int i=0; i< triStrng.size() ; i++){

                Tripletas tri = new Tripletas();
                tripletas.add(tri.crearTripleta(triStrng.get(i)));

            }
            Mv maquina = new Mv(tripletas,debug);
            maquina.ejecutar();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}