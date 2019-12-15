
public class PrimeraPasada extends GramProgBaseVisitor<String> {
    private Meter array = new Meter();
    private String lul = "";

    public String visitProgPrincipal(GramProgParser.ProgPrincipalContext ctx) {

        array.putString("ProgPrinc");
        array.Imprimir();
        String nani = visitChildren(ctx);
        return null;
    }

    public String visitIncluir(GramProgParser.IncluirContext ctx) {
        return visitChildren(ctx);
    }

    public String visitFunc(GramProgParser.FuncContext ctx) {
        return visitChildren(ctx);
    }

    public String visitDefinirFunc(GramProgParser.DefinirFuncContext ctx) {
        System.out.println("Defino func " + ctx.ID());
        if (ctx.parametros() != null) {
            System.out.println(" tiene parametros");
            ctx.parametros();
        } else {
            System.out.println("No tiene parametros");
        }
        System.out.println("Tipo");
        
        return visitChildren(ctx);
    }

    public String visitParam(GramProgParser.ParamContext ctx) {
        System.out.println("Param");
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
        return null;
    }

    public String visitDeclarar(GramProgParser.DeclararContext ctx) {
        return null;
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
            System.out.println(ctx.TIPO_BOOL().toString());

        } else if (ctx.TIPO_CADENA() != null) {
            System.out.println(ctx.TIPO_CADENA().toString());

        } else if (ctx.TIPO_NUMERO() != null) {
            System.out.println(ctx.TIPO_NUMERO().toString());

        } else {
            System.out.println(ctx.TIPO_VOID().toString());

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