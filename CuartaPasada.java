import java.util.ArrayList;
import java.io.IOException;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;

public class CuartaPasada extends GramProgBaseVisitor<String> {
    private String[] TripletaInit = { " ", " ", " " };
    ArrayList<String[]> Tripleeeee = new ArrayList<String[]>(); // Create an ArrayList object
    private int tamParInit = 0;
    private String luls = " ";

    public String visitProgPrincipal(GramProgParser.ProgPrincipalContext ctx) {

        return visitChildren(ctx);
    }

    public String visitIncluir(GramProgParser.IncluirContext ctx) {
        return visitChildren(ctx);
    }

    public void ImprimirTriple() {
        try {
            File file = new File("TripletaGenerada.txt");
            if (file.exists()) {
                file.delete();
            }
            file.createNewFile();
            FileWriter fw = new FileWriter(file, true);
            BufferedWriter bw = new BufferedWriter(fw);
        
        for (int j = 0; j < Tripleeeee.size(); j++) {
            String[] PrintPOS;
            PrintPOS = Tripleeeee.get(j);
            System.out.println(" ");

            for (int i = 0; i < PrintPOS.length; i++) {

                System.out.print(PrintPOS[i] + ",");
            }bw.write("[");
                for (int i = 0; i < PrintPOS.length; i++) {
                    if(i!=PrintPOS.length-1){
                        
                        bw.write(PrintPOS[i]+",");}
                    else{
                        bw.write(PrintPOS[i]);
                    }
                }bw.write("]");
                bw.write("\n");
                    
        }bw.close();
    } catch (IOException e) {
        System.err.println("Problem writing to the file statsTest.txt");
    }}

    public String visitFunc(GramProgParser.FuncContext ctx) {
        return visitChildren(ctx);
    }

    public String visitDefinirFunc(GramProgParser.DefinirFuncContext ctx) {

        System.out.println("Tripleta func " + ctx.ID());
        TripletaInit[0] = "0";
        visitChildren(ctx);
        if (ctx.parametros() != null) {
            System.out.println("Tiene parametros");

            TripletaInit[1] = String.valueOf(tamParInit);

        } else {
            TripletaInit[1] = "0";

        }

        if (luls.equals("void")) {
            TripletaInit[2] = "0";
        } else {
            TripletaInit[2] = "1";
        }

        String[] PrintPOS = { " ", " ", " " };
        for (int i = 0; i < TripletaInit.length; i++) {

            PrintPOS[i] = TripletaInit[i];

        }

        Tripleeeee.add(PrintPOS);
        tamParInit = 0;

        return null;
    }

    public String visitParam(GramProgParser.ParamContext ctx) {

        return visitChildren(ctx);
    }

    public String visitBloqueFunc(GramProgParser.BloqueFuncContext ctx) {
        return visitChildren(ctx);
    }

    public String visitBucleWhile(GramProgParser.BucleWhileContext ctx) {
        return visitChildren(ctx);
    }

    public String visitBloqueBucleWhile(GramProgParser.BloqueBucleWhileContext ctx) {
        return visitChildren(ctx);
    }

    public String visitIfEex(GramProgParser.IfEexContext ctx) {
        return visitChildren(ctx);
    }

    public String visitBloqueBucleIf(GramProgParser.BloqueBucleIfContext ctx) {
        return visitChildren(ctx);
    }

    public String visitForEex(GramProgParser.ForEexContext ctx) {
        return visitChildren(ctx);
    }

    public String visitDefinirFor(GramProgParser.DefinirForContext ctx) {
        return visitChildren(ctx);
    }

    public String visitBloqueCod(GramProgParser.BloqueCodContext ctx) {
        return visitChildren(ctx);
    }

    public String visitSentencia(GramProgParser.SentenciaContext ctx) {
        return visitChildren(ctx);
    }

    public String visitDeclararYasign(GramProgParser.DeclararYasignContext ctx) {
        String[] PrintPOS = { " ", " ", " " };
        PrintPOS[0] = "1";
        switch (ctx.tipo().getText()) {
        case ("numero"):
            PrintPOS[1] = "1";
            break;
        case ("cadena"):
            PrintPOS[1] = "2";
            break;
        case ("boolean"):
            PrintPOS[1] = "3";
            break;
        }
        PrintPOS[2] = (ctx.expr().getText());
        Tripleeeee.add(PrintPOS);
        return visitChildren(ctx);
    }

    public String visitDeclarar(GramProgParser.DeclararContext ctx) {
        String[] PrintPOS = { " ", " ", " " };
        PrintPOS[0] = "1";
        switch (ctx.tipo().getText()) {
        case ("numero"):
            PrintPOS[1] = "1";
            break;
        case ("cadena"):
            PrintPOS[1] = "2";
            break;
        case ("boolean"):
            PrintPOS[1] = "3";
            break;
        }
        PrintPOS[2] = "";
        tamParInit++;
        Tripleeeee.add(PrintPOS);

        return visitChildren(ctx);
    }

    public String visitAsignar(GramProgParser.AsignarContext ctx) {
       // ctx.ID().getText(); me pillo el nombre, se busca en la tabla de simbolos y se pilla el desplazamiento
       // hay que ir a la posicion de la pila y cambiar el valor de la variable
        return visitChildren(ctx);
    }

    public String visitDevolv(GramProgParser.DevolvContext ctx) {
        return visitChildren(ctx);
    }

    public String visitLlamadaFunc(GramProgParser.LlamadaFuncContext ctx) {
        //comprobar que este la funcion en la tabla del simbolos y empezamos
        // tabla de simbolos y pillar  de la funcion .getNumerosDeInputs y .getNumerosDeOutputs
        String[] PrintPOS = { " ", " ", " " };

        //PrintPOS[0]="1";//PUSH
        //PrintPOS[1]=; tipo de retorno de la funcion
        //PrintPOS[2]= " "; valor de la variable temporal de retorno que se modificara cuando se devuelva de la funcion
        //Tripleeeee.add(PrintPOS);
        //for de .getNumerosDeinpu
        //PrintPOS[0]="1"
        //PrintPOS[1]=; tipo de cada variable
        //PrintPOS[2]=; valor de las variables
        //Tripleeeee.add(PrintPOS);
        System.out.println("He acabado de hacer la preparacion de las variables");
        System.out.println("Aqui tendria que meterse el init");
        //go to a la linea de la funcion

        return visitChildren(ctx);
    }

    public String visitTip(GramProgParser.TipContext ctx) {

        if (ctx.TIPO_BOOL() != null) {
            // System.out.println(ctx.TIPO_BOOL().toString());
            luls = (ctx.TIPO_BOOL().toString());
        } else if (ctx.TIPO_CADENA() != null) {
            // System.out.println(ctx.TIPO_CADENA().toString());
            luls = (ctx.TIPO_CADENA().toString());
        } else if (ctx.TIPO_NUMERO() != null) {
            // System.out.println(ctx.TIPO_NUMERO().toString());
            luls = (ctx.TIPO_NUMERO().toString());
        } else {
            // System.out.println(ctx.TIPO_VOID().toString());
            luls = (ctx.TIPO_VOID().toString());
        }

        return visitChildren(ctx);
    }

    public String visitExpr(GramProgParser.ExprContext ctx) {
        return visitChildren(ctx);
    }

    public String visitNumero(GramProgParser.NumeroContext ctx) {
        return visitChildren(ctx);
    }
}