import java.util.HashMap;
public class SegundaPasada extends GramProgBaseVisitor<String> {
	TablaSimbolos ts;

	HashMap<String, String> tabla;//para los tipos de las vars(1:nombre/2:tipo)
	public SegundaPasada(TablaSimbolos tab){
		this.ts=tab;
		tabla=new HashMap<String, String>();
	}

	public String visitProgPrincipal(GramProgParser.ProgPrincipalContext ctx){
		return visitChildren(ctx);
	}

	public String visitFunc(GramProgParser.FuncContext ctx){
		visitChildren(ctx);
		/*Para los contextos, una vez salimos de la funcion eliminamos 
		sus variables antes de pasar a la siguiente*/
		tabla=new HashMap<String, String>();
		return null;

	}

	public String visitDefinirFunc(GramProgParser.DefinirFuncContext ctx){
		String nombreFunc=ctx.getChild(1).getText();
		String tipoReturn=visit(ctx.getChild(6));
		if(!(ts.extraeContenidoFuncion(nombreFunc)[2].equals(tipoReturn))){
			System.out.println("Error con tipos en definición de la función:"+nombreFunc);
			System.exit(-1);
		}
		return null;

	}
	public String visitParam(GramProgParser.ParamContext ctx){
		visitChildren(ctx);
		return null;
	}
	public String visitBloqueFunc(GramProgParser.BloqueFuncContext ctx){
		return visit(ctx.getChild(1));
	}
	public String visitSentencia(GramProgParser.SentenciaContext ctx){
		return visit(ctx.getChild(0));
	}
	public String visitDeclararYasign(GramProgParser.DeclararYasignContext ctx){
		String tipoVar = visit(ctx.getChild(0));
		String tipoDato;
		String nombreVar;
		if(tipoVar.equals("const")){
			tipoVar = visit(ctx.getChild(1));
			nombreVar =ctx.getChild(2).getText();
			tipoDato = visit(ctx.getChild(4));
		}else{
			nombreVar =ctx.getChild(1).getText();
		 	tipoDato = visit(ctx.getChild(3));
		}
		if((tipoVar.equals(tipoDato))){
			tabla.put(nombreVar,tipoVar);
		}else{
			System.out.println("Error:Tipos no concuerdan al declarar y asignar:"+nombreVar);
			System.exit(-1);
		}
		return null;
	}
	public String visitDeclarar(GramProgParser.DeclararContext ctx){
		String tipoVar= visit(ctx.getChild(0));
		String nombreVar;
		if(tipoVar.equals("const")){
			tipoVar= visit(ctx.getChild(1));
			nombreVar=ctx.getChild(2).getText();
		}else{
			nombreVar=ctx.getChild(1).getText();
		}
		tabla.put(nombreVar,tipoVar);
		return null;
	}
	public String visitAsignar(GramProgParser.AsignarContext ctx){
		String nombreVar= ctx.getChild(0).getText();
		String tipoVar=visit(ctx.getChild(2));
		if((tabla.containsKey(nombreVar))==false){
			System.out.println("Error,se intenta dar valor a una variable no declarada:"+ nombreVar);
			System.exit(-1);
		}
		if(!(tabla.get(nombreVar).equals(tipoVar))){
			System.out.println("Error, se intenta asignar un tipo de datos distinto al declarado a:"+ nombreVar);
			System.exit(-1);
		}
		return null;
		
	}

	public String visitTip(GramProgParser.TipContext ctx){
		return ctx.getText();
	}
	public String visitCadena(GramProgParser.CadenaContext ctx){
		return "cadena";
	}

	public String visitNum(GramProgParser.NumContext ctx){
		return "numero";
	}

	public String visitMul(GramProgParser.MulContext ctx){
		String tipoL=visit(ctx.getChild(0));
		String tipoR=visit(ctx.getChild(2));
		if(tipoL==tipoR && tipoL=="numero"){return "numero";}
		else{System.out.println("Tipos erróneos en Mul");
			System.exit(-1);
		}
		return null;
	}

	public String visitComp(GramProgParser.CompContext ctx){
		String tipoL=visit(ctx.getChild(0));
		String tipoR=visit(ctx.getChild(2));
		if(tipoL==tipoR){return "booleano";}
		else{System.out.println("Tipos distintos en Comp");
			System.exit(0);}
		return null;
	}

	public String visitId(GramProgParser.IdContext ctx){
		String var=ctx.getText();
		return var;
	}

	public String visitAnd(GramProgParser.AndContext ctx){
		String tipoL=visit(ctx.getChild(0));
		String tipoR=visit(ctx.getChild(2));
		if(tipoL==tipoR && tipoL=="booleano"){return "booleano";}
		else{System.out.println("Error de tipos en operacion AND");
			System.exit(-1);
		}
		return null;
	}

	public String visitLlamadaFunc(GramProgParser.LlamadaFuncContext ctx){
		String nombreFunc=ctx.getChild(0).getText();
		return ts.extraeContenidoFuncion(nombreFunc)[2];
	}

	public String visitSuma(GramProgParser.SumaContext ctx){
		String tipoL=visit(ctx.getChild(0));
		String tipoR=visit(ctx.getChild(2));
			if((tipoL=="cadena")||(tipoR=="cadena")){
				return "cadena";
			}
			if((tipoL=="numero")&&(tipoR=="numero")){
				return "numero";
			}else{System.out.println("Error de tipos al sumar");
				System.exit(-1);
			}
			return null;
	}
}
	
