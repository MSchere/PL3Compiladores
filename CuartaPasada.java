import java.util.ArrayList;
import java.io.IOException;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;

public class CuartaPasada extends GramProgBaseVisitor<String> {
    private String[] TripletaInit = { " ", " ", " " };
    ArrayList<String[]> tripletas = new ArrayList<String[]>(); // Create an ArrayList object
    private int tamParInit = 0;
    private String tipoFunc = " ";
    private int[] cpila = {0};
    private BibliotecaFunciones biblio = new BibliotecaFunciones();
    @Override
    public String visitProgPrincipal(GramProgParser.ProgPrincipalContext ctx) {

        return visitChildren(ctx);
    }
    @Override
    public String visitIncluir(GramProgParser.IncluirContext ctx) {
        return visitChildren(ctx);
    }

    public void ImprimirTriple() {
        try {
            File file = new File("Tripletas.txt");
            if (file.exists()) {
                file.delete();
            }
            file.createNewFile();
            FileWriter fw = new FileWriter(file, true);
            BufferedWriter bw = new BufferedWriter(fw);

            for (int j = 0; j < tripletas.size(); j++) {
                String[] PrintPOS;
                PrintPOS = tripletas.get(j);
                
                bw.write("[");
                bw.write(PrintPOS[0]);
                if(PrintPOS.length > 1){
                    bw.write(",");
                    bw.write(PrintPOS[1]);
                }
                if(PrintPOS.length > 2){
                    bw.write(",");
                    bw.write(PrintPOS[2]);
                }
                bw.write("]");
                bw.write("\n");

            }
            bw.close();
        } catch (IOException e) {
            System.err.println("Problem writing to the file statsTest.txt");
        }
    }
    @Override
    public String visitFunc(GramProgParser.FuncContext ctx) {
        return visitChildren(ctx);
    }
    @Override
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

        if (tipoFunc.equals("Void")) {
            TripletaInit[2] = "0";
        } else {
            TripletaInit[2] = "1";
        }

        String[] PrintPOS = { " ", " ", " " };
        for (int i = 0; i < TripletaInit.length; i++) {

            PrintPOS[i] = TripletaInit[i];

        }

        tripletas.add(PrintPOS);
        cpila[0] = cpila[0] + 1;
        tamParInit = 0;

        return null;
    }
    @Override
    public String visitParam(GramProgParser.ParamContext ctx) {

        return visitChildren(ctx);
    }
    @Override
    public String visitBloqueFunc(GramProgParser.BloqueFuncContext ctx) {
        System.out.println("bloquef");
        visitChildren(ctx);
        String[] trip = {"6"};
        tripletas.add(trip);
        return "";
    }
    @Override
    public String visitBucleWhile(GramProgParser.BucleWhileContext ctx) {
        return visitChildren(ctx);
    }
    @Override
    public String visitBloqueBucleWhile(GramProgParser.BloqueBucleWhileContext ctx) {
        return visitChildren(ctx);
    }
    @Override
    public String visitIfEex(GramProgParser.IfEexContext ctx) {
        return visitChildren(ctx);
    }
    @Override
    public String visitBloqueBucleIf(GramProgParser.BloqueBucleIfContext ctx) {
        return visitChildren(ctx);
    }
    @Override
    public String visitForEex(GramProgParser.ForEexContext ctx) {
        return visitChildren(ctx);
    }
    @Override
    public String visitDefinirFor(GramProgParser.DefinirForContext ctx) {
        return visitChildren(ctx);
    }
    @Override
    public String visitBloqueCod(GramProgParser.BloqueCodContext ctx) {
        return visitChildren(ctx);
    }
    @Override
    public String visitSentencia(GramProgParser.SentenciaContext ctx) {
        return visitChildren(ctx);
    }
    @Override
    public String visitDeclararYasign(GramProgParser.DeclararYasignContext ctx) {
        String[] PrintPOS = { " ", " ", " " };
        PrintPOS[0] = "1";
        PrintPOS[1] = ctx.tipo().getText();
        switch (ctx.tipo().getText()) {
        case ("numero"):
            if (ctx.expr().getText().contains(".")) {
                PrintPOS[1] = "1";
            } else {
                PrintPOS[1] = "0";
                ;
            }
            break;
        case ("cadena"):
            PrintPOS[1] = "2";
            break;
        case ("boolean"):
            PrintPOS[1] = "3";
            break;
        }
        PrintPOS[2] = (ctx.expr().getText());
        tripletas.add(PrintPOS);
        return visitChildren(ctx);
    }
    @Override
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
        tripletas.add(PrintPOS);

        return visitChildren(ctx);
    }
    @Override
    public String visitAsignar(GramProgParser.AsignarContext ctx) {
        // ctx.ID().getText(); me pillo el nombre, se busca en la tabla de simbolos y se
        // pilla el desplazamiento
        // hay que ir a la posicion de la pila y cambiar el valor de la variable
        System.out.println("Estoy en asignacion " + ctx.ID());
        return visitChildren(ctx);
    }
    @Override
    public String visitDevolv(GramProgParser.DevolvContext ctx) {
        return visitChildren(ctx);
    }
    @Override
    public String visitLlamadaFunc(GramProgParser.LlamadaFuncContext ctx) {
        System.out.println("llamafun");
        //String nombre = ctx.ID();
        visitChildren(ctx);
        //if(biblio.existe(nombre)){
        ArrayList<String[]> trip = biblio.imprimir(cpila);
        tripletas.add(trip.get(0));
        tripletas.add(trip.get(1));
        String[] t = {"2"};
        cpila[0] = cpila[0]-1;
        tripletas.add(t);

        //}
        
        // comprobar que este la funcion en la tabla del simbolos y empezamos
        // tabla de simbolos y pillar de la funcion .getNumerosDeInputs y
        // .getNumerosDeOutputs
        // String[] PrintPOS = { " ", " ", " " };

        // PrintPOS[0]="1";//PUSH
        // PrintPOS[1]=; tipo de retorno de la funcion
        // PrintPOS[2]= " "; valor de la variable temporal de retorno que se modificara
        // cuando se devuelva de la funcion
        // Tripleeeee.add(PrintPOS);
        // for de .getNumerosDeinpu
        // PrintPOS[0]="1"
        // PrintPOS[1]=; tipo de cada variable
        // PrintPOS[2]=; valor de las variables
        // Tripleeeee.add(PrintPOS);
        // System.out.println("He acabado de hacer la preparacion de las variables");
        // System.out.println("Aqui tendria que meterse el init");
        // go to a la linea de la funcion
        return "";
    }
    @Override
    public String visitTip(GramProgParser.TipContext ctx) {

        if (ctx.TIPO_BOOL() != null) {
            tipoFunc = "3";
        } else if (ctx.TIPO_CADENA() != null) {
            tipoFunc = "2";
        } else if (ctx.TIPO_NUMERO() != null) {
            tipoFunc = (ctx.TIPO_NUMERO().toString());
            if (tipoFunc.contains(".")) {
                tipoFunc = "1";
            } else {
                tipoFunc = "0";
            }
        } else {
            tipoFunc = (ctx.TIPO_VOID().toString());
        }

        return visitChildren(ctx);
    }

    /*public String visitExpr(GramProgParser.ExprContext ctx) {

  
        // tripleta temporal
        /*if (ctx.SUM() != null) {
            System.out.println(ctx.expr(0));*/
        /*    
        String[] PrintPOS = { " ", " ", " " };
        PrintPOS[0] = "1";
        PrintPOS[1] = "0";
        PrintPOS[2] = " ";
        Tripleeeee.add(PrintPOS);
        String[] PrintPOS1 = { " ", " ", " " };
        PrintPOS1[0] = "1";
        PrintPOS1[1] = "0";
        PrintPOS1[2] = ctx.expr(0).getText();
        Tripleeeee.add(PrintPOS1);
        String[] PrintPOS2 = { " ", " ", " " };
        PrintPOS2[0] = "5";
        PrintPOS2[1] = "0";
        PrintPOS2[2] =(ctx.expr(1).getText());
        Tripleeeee.add(PrintPOS1);
        
        //}
        return visitChildren(ctx);
    }*/
    @Override
    public String visitSuma(GramProgParser.SumaContext ctx) {
        System.out.println("suma");
        int tipo = Integer.parseInt(visit(ctx.expr(0)));
        int tipo1 = Integer.parseInt(visit(ctx.expr(1)));
        if(tipo != tipo1) tipo = 1;
        String[] trip0 = {"","",""};
        trip0[0] = "5";
        trip0[1] = Integer.toString(cpila[0]-2);
        trip0[2] = "1";
        tripletas.add(trip0);
        String[] trip1 = {"","",""};
        trip1[0] = "5";
        trip1[1] = Integer.toString(cpila[0]-1);
        trip1[2] = "2";
        tripletas.add(trip1);
        String[] trip2 = {"","",""};
        trip2[0] = "7";
        trip2[1] = "1";
        trip2[2] = "2";
        tripletas.add(trip2);
        String[] trip3 = {""};
        trip3[0] = "2";
        tripletas.add(trip3);
        tripletas.add(trip3);
        cpila[0] = cpila[0] - 1;
        cpila[0] = cpila[0] - 1;
        String[] trip4 = {"",""};
        trip4[0] = "1";
        trip4[1] = Integer.toString(tipo);
        cpila[0] = cpila[0] + 1;
        tripletas.add(trip4);
        String[] trip5 = {"","",""};
        trip5[0] = "4";
        trip5[1] = "0";
        trip5[2] = Integer.toString(cpila[0]-1);
        tripletas.add(trip5);
        System.out.println("sumafin");
        return Integer.toString(tipo);
    }
    @Override
    public String visitNumero(GramProgParser.NumeroContext ctx) {
        System.out.println("numero");
        String[] trip = {"","",""};
        trip[0] = "1";
        if(ctx.getText().contains(".")){
            trip[1] = "1";
        }
        else trip[1]= "0";
        trip[2] = ctx.getText();
        tripletas.add(trip);
        cpila[0] = cpila[0]+1;
        return trip[1];
    }
}