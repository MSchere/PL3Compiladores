import java.util.ArrayList;

public class CuartaPasada extends GramProgBaseVisitor<String> {
    private String[] TripletaInit = { 0, 0, 0 };
    private String[] Tripleta = { 0, 0, 0 };
    ArrayList<String[]> Tripleeeee = new ArrayList<String[]>(); // Create an ArrayList object
    private int tamParInit = 0;
    private String luls = " ";
    private TablaSimbolos ts;

    public CuartaPasada(TablaSimbolos ts){
        this.ts = ts;
    }

    public String visitProgPrincipal(GramProgParser.ProgPrincipalContext ctx) {

        return visitChildren(ctx);
    }

    public String visitIncluir(GramProgParser.IncluirContext ctx) {
        return visitChildren(ctx);
    }

    public void ImprimirTriple() {
        for (int j = 0; j < Tripleeeee.size(); j++) {
            int[] PrintPOS;
            PrintPOS = Tripleeeee.get(j);
            System.out.println(" ");
            for (int i = 0; i < PrintPOS.length; i++) {

                System.out.print(PrintPOS[i] + ",");
            }

        }
    }

    public String visitFunc(GramProgParser.FuncContext ctx) {
        return visitChildren(ctx);
    }

    public String visitDefinirFunc(GramProgParser.DefinirFuncContext ctx) {

        System.out.println("Tripleta func " + ctx.ID());
        TripletaInit[0] = 0;
        visitChildren(ctx);
        if (ctx.parametros() != null) {
            System.out.println("Tiene parametros");

            TripletaInit[1] = tamParInit;

        }

        if (luls.equals("void")) {
            TripletaInit[2] = 0;
        } else {
            TripletaInit[2] = 1;
        }

        int[] PrintPOS = { 0, 0, 0 };
        for (int i = 0; i < TresPos.length; i++) {

            PrintPOS[i] = TripletaInit[i];

        }

        //Tripleeeee.add(PrintPOS);
        tam = 0;

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
        
        int tipo = Integer.parseInt(ctx.tipo());
        String valor = ctx.expr();
        if(tipo == 1 && valor.contains(".")){
            tipo = 1;
        }
        else{
            tipo = 0;
        }
        Tripleta[0] = Integer.toString(41);
        Tripleta[1] = Integer.toString(tipo);
        Tripleta[2] = valor;
        Tripleeeee.add(Tripleta);
        Tripleta[0] = "4";
        Tripleta[1] = "1";
        Tripleta[2] = ts.getPos(ctx.ID());
        Tripleeeee.add(Tripleta);
        return visitChildren(ctx);
    }

    public String visitDeclarar(GramProgParser.DeclararContext ctx) {

        // System.out.println(ctx.ID().toString());
        tamParInit++;

        // System.out.println("el id es "+ctx.ID().toString());

        return visitChildren(ctx);
    }

    public String visitAsignar(GramProgParser.AsignarContext ctx) {
        return visitChildren(ctx);
    }

    public String visitDevolv(GramProgParser.DevolvContext ctx) {
        return visitChildren(ctx);
    }

    public String visitLlamadaFunc(GramProgParser.LlamadaFuncContext ctx) {
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