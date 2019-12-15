
import java.util.*;
import java.io.InputStream;
import java.io.FileInputStream;
import org.antlr.v4.runtime.tree.*;
import org.antlr.v4.runtime.*;    

public class TextCuartaPasada{

    private TablaSimbolos ts;

    public TextCuartaPasada(TablaSimbolos ts){
        this.ts = ts;
    }
public static void main(String[] args)throws Exception{

    String inputFile=null;
    if(args.length>0) inputFile=args[0];
    InputStream is =System.in;
    if(inputFile!=null){
    is=new FileInputStream(inputFile);
    }

    ANTLRInputStream input = new ANTLRInputStream(is);
    GramProgLexer lexer=new GramProgLexer(input);
    CommonTokenStream tokens= new CommonTokenStream(lexer);
    GramProgParser parser= new GramProgParser (tokens);
    parser.setBuildParseTree(true);
    ParseTree tree=parser.prog();
    //System.out.println(tree.toStringTree(parser)+"no se que imprimo");
    CuartaPasada nv=new CuartaPasada(ts);
     nv.visit(tree);
     nv.ImprimirTriple();

}
};
