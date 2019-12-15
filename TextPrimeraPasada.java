import java.util.*;
import java.io.InputStream;
import java.io.FileInputStream;
import org.antlr.v4.runtime.tree.*;
import org.antlr.v4.runtime.*;    

public class TextPrimeraPasada{
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
    PrimeraPasada nv=new PrimeraPasada();
    nv.visit(tree);
}
}
