
import java.util.*;
import java.io.InputStream;
import java.io.FileInputStream;
import org.antlr.v4.runtime.tree.*;
import org.antlr.v4.runtime.*;    

public class TextCuartaPasada{
public static void main(String[] args)throws Exception{

    String inputFile=null;
    if(args.length>0) inputFile=args[0];
    InputStream is =System.in;
    if(inputFile!=null){
    is=new FileInputStream(inputFile);
    }

    boolean debug = false;
    if(args.length>1){
        String sdebug = args[1];
        if(sdebug.equals("-debug")) debug = true;
    }

    ANTLRInputStream input = new ANTLRInputStream(is);
    GramProgLexer lexer=new GramProgLexer(input);
    CommonTokenStream tokens= new CommonTokenStream(lexer);
    GramProgParser parser= new GramProgParser (tokens);
    parser.setBuildParseTree(true);
    ParseTree tree=parser.prog();
    //System.out.println(tree.toStringTree(parser)+"no se que imprimo");
    CuartaPasada nv=new CuartaPasada();
    nv.visit(tree);
    nv.ImprimirTriple();
    PruebaTrip prtrip = new PruebaTrip();
    prtrip.main(debug);
}
};
