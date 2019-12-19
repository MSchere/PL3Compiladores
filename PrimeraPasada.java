public class PrimeraPasada extends GramProgBaseVisitor<String> {

    private int tamParInit = 0;
    TablaSimbolos ts;
    String[] defFunc = new String[3];

    public PrimeraPasada(TablaSimbolos tabla){
        this.ts = tabla;
    }

    public String visitProgPrincipal(GramProgParser.ProgPrincipalContext ctx) {

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
        //NombreFunc
        //System.out.println("Defino func " + ctx.ID());
        String nombreFunc = ("" + ctx.ID());
        defFunc[0] = nombreFunc;
        if (ctx.parametros() != null) {
            //System.out.println(" tiene parametros");
            String param=ctx.parametros().getText();
            int count = 0;
            int idx = 0;
            while ((idx = param.indexOf("numero", idx)) != -1) {
                count++;
                idx += "numero".length();
            }
            //Numero de parámetros
            //System.out.println(count);
            defFunc[1] = String.valueOf(count);
        } else {
            //System.out.println("No tiene parametros");
            defFunc[1] = String.valueOf(0);
        }
        //System.out.println("Tipo");
        
        tamParInit = 0;
        visitChildren(ctx);
        //Aqui acaba la funcion
        ts.rellenaFuncion(defFunc[0], Integer.parseInt(defFunc[1]), defFunc[2],0);
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
        tamParInit++;
        return visitChildren(ctx);
    }

    public String visitDeclarar(GramProgParser.DeclararContext ctx) {
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
        //Tipo de retorno
        String tipo;
        if (ctx.TIPO_BOOL() != null) {
            tipo = ctx.TIPO_BOOL().toString();
          

        } else if (ctx.TIPO_CADENA() != null) {
            tipo = ctx.TIPO_CADENA().toString();
           

        } else if (ctx.TIPO_NUMERO() != null) {
            tipo = ctx.TIPO_NUMERO().toString();
            

        } else {
            tipo = ctx.TIPO_VOID().toString();
           
        }
        defFunc[2] = tipo;

        return visitChildren(ctx);
    }

    public String visitExpr(GramProgParser.ExprContext ctx) {
        return visitChildren(ctx);
    }

    public String visitNumero(GramProgParser.NumeroContext ctx) {
        return visitChildren(ctx);
    }
}