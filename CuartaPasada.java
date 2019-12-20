import java.util.ArrayList;
import java.io.IOException;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;

public class CuartaPasada extends GramProgBaseVisitor<String> {
    private String[] TripletaInit = { " ", " ", " " };
    ArrayList<String[]> tripletas = new ArrayList<String[]>(); // Create an ArrayList object
    private String tipoFunc = " ";
    private int[] cpila = { 0 };
    private String funcActual = " ";
    private BibliotecaFunciones biblio = new BibliotecaFunciones();
    private TablaSimbolos tb;
    private String nombreruta;

    public CuartaPasada(TablaSimbolos tb, String nombreruta) {
        this.nombreruta=nombreruta;
        this.tb = tb;
    }

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
            File file = new File(nombreruta);
            if (file.exists()) {
                file.delete();
            }
            System.out.println("he creado "+nombreruta);
            file.createNewFile();
            FileWriter fw = new FileWriter(file, true);
            BufferedWriter bw = new BufferedWriter(fw);

            for (int j = 0; j < tripletas.size(); j++) {
                String[] PrintPOS;
                PrintPOS = tripletas.get(j);

                bw.write("[");
                bw.write(PrintPOS[0]);
                if (PrintPOS.length > 1) {
                    bw.write(",");
                    bw.write(PrintPOS[1]);
                }
                if (PrintPOS.length > 2) {
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
        funcActual = ctx.ID().getText();
        
        TripletaInit[0] = "0";
        visitChildren(ctx);
        if (ctx.parametros() != null) {

            String param = ctx.parametros().getText();
            int count = 0;
            int idx = 0;
            while ((idx = param.indexOf("numero", idx)) != -1) {
                count++;
                idx += "numero".length();
            }

            TripletaInit[1] = String.valueOf(count);

        } else {
            TripletaInit[1] = "0";

        }

        if (tipoFunc.equals("void")) {
            TripletaInit[2] = "0";
        } else {
            TripletaInit[2] = "1";
        }

        String[] PrintPOS = { " ", " ", " " };
        for (int i = 0; i < TripletaInit.length; i++) {

            PrintPOS[i] = TripletaInit[i];

        }
        cpila[0] = cpila[0] + 1;
        tb.setPunteroPila(funcActual,cpila[0]);
        tripletas.add(PrintPOS);
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
        String[] trip = { "6" };
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
        visit(ctx.expr());
        String[] trip0 = {"","",""};
        trip0[0] = "5";
        trip0[1] = Integer.toString(cpila[0]-1);
        trip0[2] = "1";
        tripletas.add(trip0);
        String[] trip1 = {"2"};
        tripletas.add(trip1);
        cpila[0] = cpila[0] - 1;
        String[] trip2 = {"", "",""};
        trip2[0] = "42";
        trip2[1] = "1";
        trip2[2] = "0";
        tripletas.add(trip2);
        visit(ctx.bloqueCodigoIf());
        return "";
    }

    @Override
    public String visitBloqueBucleIf(GramProgParser.BloqueBucleIfContext ctx) {
        int desp1 = tripletas.size();
        visit(ctx.bloqueCodigo(0));
        int desp2 = tripletas.size();
        int salto = desp2-desp1;
        String[] tri = tripletas.get(tripletas.size()-1-salto);
        tri[2] = Integer.toString(desp2);
        tripletas.set(tripletas.size()-1-salto,tri);
        if(ctx.ELSE() != null){
            String[] trip2 = { "", ""};
            trip2[0] = "24";
            trip2[1] = "-1";
            tripletas.add(trip2);
            visit(ctx.bloqueCodigo(1));
            int desp3 = tripletas.size();
            String[] tri2 = tripletas.get(tripletas.size()-(desp3-desp2));
            System.out.println(tri2[0]);
            tri2[1] = Integer.toString(desp3);
            tripletas.set(tripletas.size()-1-(desp3-desp2),tri2);
        }
        return "";
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
        String[] trip101 = { "1",""};
        trip101[1]=tb.extraeTipoVariable(funcActual,ctx.ID().getText());
        tripletas.add(trip101);
        cpila[0]=cpila[0]+1;
        visitChildren(ctx);
        String[] trip = { "", "", "" };
        trip[0] = "5";
        trip[1] = Integer.toString(cpila[0]-1);
        trip[2] =  "1";
        tripletas.add(trip);
        String[] trip412 = { "", "", "" };
        trip412[0] = "4";
        trip412[1] = "1";
        trip412[2] =  String.valueOf(tb.extraeDesplazamientoVariable(funcActual,ctx.ID().getText()));
        tripletas.add(trip412);
        String[] trip22={"2"};
        tripletas.add(trip22);
        cpila[0]=cpila[0]-1;
        return "";
    }

    @Override
    public String visitDeclarar(GramProgParser.DeclararContext ctx) {
        String[] trip101 = { "1",""};
        trip101[1]=tb.extraeTipoVariable(funcActual,ctx.ID().getText());
        tripletas.add(trip101);
        cpila[0]=cpila[0]+1;
    
        return "";
    }

    @Override
    public String visitAsignar(GramProgParser.AsignarContext ctx) {
        visitChildren(ctx);
        String[] trip = { "", "", "" };
        trip[0] = "5";
        trip[1] = Integer.toString(cpila[0]-1);
        trip[2] =  "1";
        tripletas.add(trip);
        String[] trip412 = { "", "", "" };
        trip412[0] = "4";
        trip412[1] = "1";
        trip412[2] =  String.valueOf(tb.extraeDesplazamientoVariable(funcActual,ctx.ID().getText()));
        tripletas.add(trip412);
        String[] trip22={"2"};
        tripletas.add(trip22);
        cpila[0]=cpila[0]-1;
        return "";
    }

    @Override
    public String visitDevolv(GramProgParser.DevolvContext ctx) {
        return visitChildren(ctx);
    }

    @Override
    public String visitLlamadaFunc(GramProgParser.LlamadaFuncContext ctx) {
        String nombre = ctx.ID().getText();
        visitChildren(ctx);
        if (biblio.existe(nombre)) {
            System.out.println(nombre);
            switch (nombre) {
            case ("imprimir"):
                ArrayList<String[]> trip = biblio.imprimir(cpila);
                tripletas.add(trip.get(0));
                tripletas.add(trip.get(1));
                String[] t = { "2" };
                cpila[0] = cpila[0] - 1;
                tripletas.add(t);
                break;
            case("print"):
                ArrayList<String[]> trip111 = biblio.imprimir(cpila);
                tripletas.add(trip111.get(0));
                tripletas.add(trip111.get(1));
                String[] t1111 = { "2" };
                cpila[0] = cpila[0] - 1;
                tripletas.add(t1111);
                break;
            case ("sqrt"):
                ArrayList<String[]> trip1 = biblio.sqrt(cpila);
                tripletas.add(trip1.get(0));
                tripletas.add(trip1.get(1));
                tripletas.add(trip1.get(2));
                tripletas.add(trip1.get(3));
                tripletas.add(trip1.get(4));
                break;
            case ("cadenaDonde"):
                ArrayList<String[]> trip2 = biblio.cadenaDonde(cpila);
                tripletas.add(trip2.get(0));
                tripletas.add(trip2.get(1));
                tripletas.add(trip2.get(2));
                tripletas.add(trip2.get(3));
                tripletas.add(trip2.get(4));
                tripletas.add(trip2.get(5));
                tripletas.add(trip2.get(6));
                break;
            case ("cadenaSinEspacios"):
                ArrayList<String[]> trip3 = biblio.cadenaSinEspacios(cpila);
                tripletas.add(trip3.get(0));
                tripletas.add(trip3.get(1));
                tripletas.add(trip3.get(2));
                tripletas.add(trip3.get(3));
                tripletas.add(trip3.get(4));

                break;
            case ("cadenaSustituida"):
                ArrayList<String[]> trip4 = biblio.cadenaSustituida(cpila);
                tripletas.add(trip4.get(0));
                tripletas.add(trip4.get(1));
                tripletas.add(trip4.get(2));
                tripletas.add(trip4.get(3));
                tripletas.add(trip4.get(4));
                tripletas.add(trip4.get(5));
                tripletas.add(trip4.get(6));
                tripletas.add(trip4.get(7));
                tripletas.add(trip4.get(8));
                break;

            case ("cadenaIzquierda"):
                ArrayList<String[]> trip5 = biblio.cadenaIzquierda(cpila);
                tripletas.add(trip5.get(0));
                tripletas.add(trip5.get(1));
                tripletas.add(trip5.get(2));
                tripletas.add(trip5.get(3));
                tripletas.add(trip5.get(4));
                tripletas.add(trip5.get(5));
                break;
            case ("cadenaDerecha"):
                ArrayList<String[]> trip6 = biblio.cadenaDerecha(cpila);
                tripletas.add(trip6.get(0));
                tripletas.add(trip6.get(1));
                tripletas.add(trip6.get(2));
                tripletas.add(trip6.get(3));
                tripletas.add(trip6.get(4));
                tripletas.add(trip6.get(5));
                break;
            case ("cadenaDentro"):
                ArrayList<String[]> trip7 = biblio.cadenaDentro(cpila);
                tripletas.add(trip7.get(0));
                tripletas.add(trip7.get(1));
                tripletas.add(trip7.get(2));
                tripletas.add(trip7.get(3));
                tripletas.add(trip7.get(4));
                tripletas.add(trip7.get(5));
                tripletas.add(trip7.get(6));
                tripletas.add(trip7.get(7));
                tripletas.add(trip7.get(8));
                tripletas.add(trip7.get(9));
                break;
            case ("cadenaLongitud"):
            
                ArrayList<String[]> trip8 = biblio.cadenaLongitud(cpila);
                tripletas.add(trip8.get(0));
                tripletas.add(trip8.get(1));
                tripletas.add(trip8.get(2));
                tripletas.add(trip8.get(3));
                tripletas.add(trip8.get(4));
 
                break;
            case ("fopen"):
                ArrayList<String[]> trip9 = biblio.fopen(cpila);
                tripletas.add(trip9.get(0));
                tripletas.add(trip9.get(1));
                tripletas.add(trip9.get(2));
                tripletas.add(trip9.get(3));

                break;
            case ("fwrite"):
                ArrayList<String[]> trip10 = biblio.fwrite(cpila);
                tripletas.add(trip10.get(0));
                tripletas.add(trip10.get(1));
                tripletas.add(trip10.get(2));
                tripletas.add(trip10.get(3));
                tripletas.add(trip10.get(4));
                tripletas.add(trip10.get(5));
                break;
            case ("freadAll"):
                ArrayList<String[]> trip11 = biblio.freadAll(cpila);
                tripletas.add(trip11.get(0));
                tripletas.add(trip11.get(1));
                tripletas.add(trip11.get(2));
                tripletas.add(trip11.get(3));
                tripletas.add(trip11.get(4));
                break;
            case ("fclose"):
                ArrayList<String[]> trip12 = biblio.fclose(cpila);
                tripletas.add(trip12.get(0));
                tripletas.add(trip12.get(1));
                tripletas.add(trip12.get(2));
                break;
            }
        }

        // }

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

    public String visitExpr(GramProgParser.ExprContext ctx) {

         visitChildren(ctx);

        return "";
    }

    @Override
    public String visitParentesis(GramProgParser.ParentesisContext ctx) {
        return visit(ctx.expr());
    }

    public String visitMul(GramProgParser.MulContext ctx) {
        int tipo = Integer.parseInt(visit(ctx.expr(0)));
        int tipo1 = Integer.parseInt(visit(ctx.expr(1)));
        if (tipo != tipo1)
            tipo = 1;
        String[] trip0 = { "", "", "" };
        trip0[0] = "5";
        trip0[1] = Integer.toString(cpila[0] - 2);
        trip0[2] = "1";
        tripletas.add(trip0);
        String[] trip1 = { "", "", "" };
        trip1[0] = "5";
        trip1[1] = Integer.toString(cpila[0] - 1);
        trip1[2] = "2";
        tripletas.add(trip1);
        String[] trip2 = { "", "", "" };
        if (ctx.MUL() != null) {
            trip2[0] = "9";
        } else {
            trip2[0] = "10";
        }
        trip2[1] = "1";
        trip2[2] = "2";
        tripletas.add(trip2);
        String[] trip3 = { "" };
        trip3[0] = "2";
        tripletas.add(trip3);
        tripletas.add(trip3);
        cpila[0] = cpila[0] - 1;
        cpila[0] = cpila[0] - 1;
        String[] trip4 = { "", "" };
        trip4[0] = "1";
        trip4[1] = Integer.toString(tipo);
        cpila[0] = cpila[0] + 1;
        tripletas.add(trip4);
        String[] trip5 = { "", "", "" };
        trip5[0] = "4";
        trip5[1] = "0";
        trip5[2] = Integer.toString(cpila[0] - 1);
        tripletas.add(trip5);
        return Integer.toString(tipo);
    }

    public String visitSuma(GramProgParser.SumaContext ctx) {
        int tipo = Integer.parseInt(visit(ctx.expr(0)));
        int tipo1 = Integer.parseInt(visit(ctx.expr(1)));
        
        if ( tipo1==1)
            tipo = 1;
        String[] trip0 = { "", "", "" };
        trip0[0] = "5";
        trip0[1] = Integer.toString(cpila[0] - 2);
        trip0[2] = "1";
        tripletas.add(trip0);
        String[] trip1 = { "", "", "" };
        trip1[0] = "5";
        trip1[1] = Integer.toString(cpila[0] - 1);
        trip1[2] = "2";
        tripletas.add(trip1);
        String[] trip2 = { "", "", "" };
        if (ctx.SUM() != null) {
            trip2[0] = "7";
        } else {
            trip2[0] = "8";
        }
        if((tipo1==2) && (tipo==2)){
       
            trip2[0] = "26";
        }
        trip2[1] = "1";
        trip2[2] = "2";
        tripletas.add(trip2);
        String[] trip3 = { "" };
        trip3[0] = "2";
        tripletas.add(trip3);
        tripletas.add(trip3);
        cpila[0] = cpila[0] - 1;
        cpila[0] = cpila[0] - 1;
        String[] trip4 = { "", "" };
        trip4[0] = "1";
        trip4[1] = Integer.toString(tipo);
        cpila[0] = cpila[0] + 1;
        tripletas.add(trip4);
        String[] trip5 = { "", "", "" };
        trip5[0] = "4";
        trip5[1] = "0";
        trip5[2] = Integer.toString(cpila[0] - 1);
        tripletas.add(trip5);
        return Integer.toString(tipo);
    }

    @Override
    public String visitNumero(GramProgParser.NumeroContext ctx) {
        String[] trip = { "", "", "" };
        trip[0] = "1";
        if (ctx.getText().contains(".")) {
            trip[1] = "1";
        } else
            trip[1] = "0";
        trip[2] = ctx.getText();
        tripletas.add(trip);
        cpila[0] = cpila[0] + 1;
        return trip[1];
    }

    public String visitCadena(GramProgParser.CadenaContext ctx) {
        String texto=ctx.getText();
        String[] trip = { "", "", "" };
        trip[0] = "1";
        trip[1] = "2";
        trip[2] = ctx.getText();
        tripletas.add(trip);
        cpila[0] = cpila[0] + 1;
        return trip[1];
    }
    public String visitBool(GramProgParser.BoolContext ctx) {
        String[] trip = { "", "", "" };
        trip[0] = "1";
        trip[1] = "3";
        trip[2] = ctx.getText();
        tripletas.add(trip);
        cpila[0] = cpila[0] + 1;
        return trip[1];
    }
    public String visitId(GramProgParser.IdContext ctx){
        String[] trip0 = { "", "", "" };
        trip0[0] = "5";
        trip0[1] = String.valueOf(tb.extraeDesplazamientoVariable(funcActual,ctx.getText()));
        trip0[2] =  "1";
        tripletas.add(trip0);
        String[] trip = { "", ""};
        trip[0] = "1";
        trip[1] = tb.extraeTipoVariable(funcActual,ctx.getText());
        tripletas.add(trip);
        cpila[0] = cpila[0] + 1;
        String[] trip011 = { "", "", "" };
        trip011[0] = "44";
        trip011[1] = "1";
        trip011[2] =  Integer.toString(cpila[0]-1);
        tripletas.add(trip011);
        return trip[1];
    }
}