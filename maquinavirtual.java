// fichero ejecutable.
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;
import java.io.*;
import java.io.InputStream;
import java.util.*;
import java.text.SimpleDateFormat;  


public class maquinavirtual {
    public static void main(String[] args) throws Exception{
        String ruta="";

        SimpleDateFormat formatter = new SimpleDateFormat("(dd-MM-yyyy_HH-mm-ss)");  
        Date date = new Date();  

        String fileName = formatter.format(date) + ".log";
        File file = new File("logs/"+fileName);

        FileOutputStream f = new FileOutputStream(file);
        System.setErr(new PrintStream(f));
    
        if (args.length > 0) {
            ruta = args[0];
        }
        boolean debug = false;
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
            if(args.length>1 && args[1].equals("-debug")) debug = true;
            Mv maquina = new Mv(tripletas,debug);
            System.out.println("Voy a ejecutar");
            maquina.ejecutar();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}