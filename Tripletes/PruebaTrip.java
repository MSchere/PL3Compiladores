// fichero ejecutable.
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;

import java.io.FileInputStream;
import java.io.InputStream;
import java.util.*;

public class PruebaTrip {
    public static void main(String[] args) throws Exception{
        String inputFile=null;
        if(args.length>0) inputFile=args[0];
        InputStream is = System.in;
        if(inputFile!=null){
            is=new FileInputStream(inputFile);
        }

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

        for(int i=0; i< triStrng.size() ; i++){

            System.out.println("Tripleta :"+i);
            System.out.println("Pos 1: " + tripletas.get(i).getPrimeraPosicion());
            System.out.println("Pos 2: " + tripletas.get(i).getSegundaPosicion());
            System.out.println("Pos 3int: " + tripletas.get(i).getTerceraPosicion());
            System.out.println("Pos 3str: " + tripletas.get(i).getTerceraPosicion2());
        }


        /*
        Mv maquina = new Mv(nv.getArray());
        maquina.ejecutar();
        */
    }
}