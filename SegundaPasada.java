import java.util.HashMap;
public class SegundaPasada extends GramProgBaseVisitor<String> {
	//Primer Valor:Nombre;SegundoValor:Tipo;
	HashMap<String, String> tabla = new HashMap<String, String>();

	public String visitProgPrincipal(GramProgParser.ProgPrincipalContext ctx){
		return visitChildren(ctx);
	}

	public String visitFunc(GramProgParser.FuncContext ctx){
		visitChildren(ctx);
		return null;

	}

	public String visitDefinirFunc(GramProgParser.DefinirFuncContext ctx){
		String nombreFunc=ctx.getChild(1).getText();
		String tipoReturn=visit(ctx.getChild(6));
		tabla.put(nombreFunc,tipoReturn);
		return null;

	}
	public String visitParam(GramProgParser.ParamContext ctx){
		visitChildren(ctx);
		return null;
	}

	public String visitBloqueFunc(GramProgParser.BloqueFuncContext ctx){
		return visit(ctx.getChild(1));
	}
	public String visitBucle(GramProgParser.BucleContext ctx){
		return visitChildren(ctx);}

	public String visitBucleWhile(GramProgParser.BucleWhileContext ctx){
		return visitChildren(ctx);
	}

	public String visitBloqueBucleWhile(GramProgParser.BloqueBucleWhileContext ctx){
		return visitChildren(ctx);
	}

	public String visitIfEex(GramProgParser.IfEexContext ctx){
		return visitChildren(ctx);
	}

	public String visitBloqueBucleIf(GramProgParser.BloqueBucleIfContext ctx){
		return visitChildren(ctx);
	}

	public String visitForEex(GramProgParser.ForEexContext ctx){
		return visitChildren(ctx);
	}

	public String visitDefinirFor(GramProgParser.DefinirForContext ctx){
		return visitChildren(ctx);
	}
	public String visitBloqueCod(GramProgParser.BloqueCodContext ctx){
		return visitChildren(ctx);
	}

	public String visitSentencia(GramProgParser.SentenciaContext ctx){
		return visit(ctx.getChild(0));
	}
	public String visitDeclararYasign(GramProgParser.DeclararYasignContext ctx){
		String tipoVar = visit(ctx.getChild(0));
		String nombreVar = visit(ctx.getChild(1));
		String tipoDato = visit(ctx.getChild(3));
		if(tipoVar==tipoDato){
			tabla.put(nombreVar,tipoVar);
		}else{ErrorTipos();}
		return null;
	}
	public String visitDeclarar(GramProgParser.DeclararContext ctx){
		String tipoVar= visit(ctx.getChild(0));
		String nombreVar=ctx.getChild(1).getText();
		tabla.put(nombreVar,tipoVar);
		return null;
	}
	public String visitAsignar(GramProgParser.AsignarContext ctx){
		String nombreVar= visit(ctx.getChild(0));
		String tipoVar=visit(ctx.getChild(2));
		if((tabla.containsKey(nombreVar))==false){
			System.out.println("Error,se intenta dar valor a una variable no declarada");
			System.exit(-1);
		}
		if(tabla.get(nombreVar)!=tipoVar){ErrorTipos();}
		return null;
		
	}

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

	public String visitID(GramProgParser.ExprContext ctx){
		String var=ctx.getText();
		if(tabla.containsKey(var)){return tabla.get(var);}
		else{ErrorTipos();}
		return null;
	}

	public String visitAnd(GramProgParser.ExprContext ctx){
		String tipoL=visit(ctx.getChild(0));
		String tipoR=visit(ctx.getChild(2));
		if(tipoL==tipoR && tipoL=="booleano"){return "booleano";}
		else{ErrorTipos();}
		return null;
	}

	public String visitFunCall(GramProgParser.ExprContext ctx){
		String id=ctx.getChild(0).getText();
		if(tabla.containsKey(id)){return tabla.get(id);}
		else{ErrorTipos();}
		return null;
	}

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
	
