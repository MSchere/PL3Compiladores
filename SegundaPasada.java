import java.util.HashMap;
public class SegundaPasada extends GramProgBaseVisitor<String> {
	//Primer Valor:Nombre;SegundoValor:Tipo;
	HashMap<String, String> funcion = new HashMap<String, String>();

	public String visitProgPrincipal(GramProgParser.ProgPrincipalContext ctx){
		System.out.println("He entrado a prog");
		System.out.flush();
		return visitChildren(ctx);
	}

	public String visitFunc(GramProgParser.FuncContext ctx){
		String tipoReturn=visit(ctx.getChild(0));
			if(tipoReturn!=visit(ctx.getChild(1))){
				ErrorTipos();
			}
		return null;

	}

	public String visitDefinirFunc(GramProgParser.DefinirFuncContext ctx){
		String nombreFunc=visit(ctx.getChild(1));
		String tipoReturn=visit(ctx.getChild(6));
		return null;

	}
	public String visitParam(GramProgParser.ParamContext ctx){


		return null;
	}

	public String visitBloqueFunc(GramProgParser.BloqueFuncContext ctx){
		return visit(ctx.getChild(1));
	}
	//public String visitBucle(GramProgParser.BucleContext ctx);

	//public String visitBucleWhile(GramProgParser.BucleWhileContext ctx);

	//public String visitBloqueBucleWhile(GramProgParser.BloqueBucleWhileContext ctx);

	/*public String visitIfEex(GramProgParser.IfEexContext ctx){
		visit(ctx.getChild(3));
		visit(ctx.getChild(5));
	}*/

	/*public String visitBloqueBucleIf(GramProgParser.BloqueBucleIfContext ctx){
		visit(ctx.getChild(2));
		if(ctx.getChild(3).getText()){return visit(ctx.getChild(4));}
	}*/

	public String visitForEex(GramProgParser.ForEexContext ctx){
		return visit(ctx.getChild(1));
	}

	/*public String visitDefinirFor(GramProgParser.DefinirForContext ctx){
		visit(ctx.getChild(3));
		visit(ctx.getChild(5));
		visit(ctx.getChild(7));
	}*/
	public String visitBloqueCod(GramProgParser.BloqueCodContext ctx){
		return visitChildren(ctx);
	}

	public String visitSentencia(GramProgParser.SentenciaContext ctx){
		return visit(ctx.getChild(0));
	}
	/*public String visitDeclararYasign(GramProgParser.DeclararYasignContext ctx){
		String tipoVar = visit(ctx.getChild(0));
		String tipoDato = visit(ctx.getChild(3));
		if(tipoVar==tipoDato){return tipoVar;}
	}*/
	public String visitDeclarar(GramProgParser.DeclararContext ctx){
		String tipoVar= visit(ctx.getChild(0));
		String nombreVar=ctx.getChild(1).getText();
		System.out.println(nombreVar);
		return null;
	}
	public String visitAsignar(GramProgParser.AsignarContext ctx){
		return visit(ctx.getChild(2));
	}
	/*public String visitDevolv(GramProgParser.DevolvContext ctx){
		return visit(ctx.getChild(1));
	}*/
	//public String visitLlamadaFunc(GramProgParser.LlamadaFuncContext ctx);
	public String visitTip(GramProgParser.TipContext ctx){
		return ctx.getText();
	}

	public String visitInc(GramProgParser.ExprContext ctx){
		return visitChildren(ctx);
	}

	public String visitNeg(GramProgParser.ExprContext ctx){
		return visitChildren(ctx);
	}

	public String visitCadena(GramProgParser.ExprContext ctx){
		return "cadena";
	}

	public String visitNum(GramProgParser.ExprContext ctx){
		return "numero";
	}

	public String visitMul(GramProgParser.ExprContext ctx){
		String tipoL=visit(ctx.getChild(0));
		String tipoR=visit(ctx.getChild(2));
		if(tipoL==tipoR && tipoL=="numero"){return "numero";}
		else{ErrorTipos();}
		return null;
	}

	public String visitComp(GramProgParser.ExprContext ctx){
		String tipoL=visit(ctx.getChild(0));
		String tipoR=visit(ctx.getChild(2));
		if(tipoL==tipoR){return tipoL;}
		else{ErrorTipos();}
		return null;
	}

	//public String visitID(GramProgParser.IDContext ctx);

	public String visitAnd(GramProgParser.ExprContext ctx){
		String tipoL=visit(ctx.getChild(0));
		String tipoR=visit(ctx.getChild(2));
		if(tipoL==tipoR && tipoL=="booleano"){return "booleano";}
		else{ErrorTipos();}
		return null;
	}

	//public String visitExprParenthesis(GramProgParser.ExprContext ctx);

	//public String visitFunCall(GramProgParser.ExprContext ctx);

	public String visitSuma(GramProgParser.ExprContext ctx){
		String tipoL=visit(ctx.getChild(0));
		String tipoR=visit(ctx.getChild(2));
			if((tipoL=="cadena")||(tipoR=="cadena")){
				return "cadena";
			}
			if((tipoL=="numero")&&(tipoR=="numero")){
				return "numero";
			}else{
				ErrorTipos();
			}
			return null;
	}
	public void ErrorTipos(){
		System.out.println("Error:tipos de datos no concuerdan");
		System.exit(-1);
	}
}
	
