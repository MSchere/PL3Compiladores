// fichero ejecutable.
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;

import java.io.FileInputStream;
import java.io.InputStream;
import java.util.*;

public class Prueba {
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
        System.out.println(tree.toStringTree(parser));

        ListenerTripletas nv = new ListenerTripletas();
        ParseTreeWalker walker = new ParseTreeWalker();
        walker.walk(nv,tree);

        System.out.println(nv.getArray().toString());
       // System.out.println(nv.getPrograma());
       // Log log = new Log();
       // log.crear_txt(nv.getPrograma());
    
    }
}