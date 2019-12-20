import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;

import java.io.FileInputStream;
import java.io.InputStream;
import java.util.*;

public class TerceraPasada extends GramProgBaseVisitor<String> {

	TablaSimbolos ts;

	public TerceraPasada(TablaSimbolos tabla){
		this.ts = tabla;
	}
	
    // CONTENEDORES

	public static ArrayList<ArrayList<String>> almacen = new ArrayList<ArrayList<String>>();

	public ArrayList<String> variable = new ArrayList<String>();

	String tipoaux;

	boolean esNull = false;

	boolean esParam = false;

	String contextoaux = "";

	// FUNCIONES DE APOYO

	public void buscarCambioTipo(String nombre, String valor){

		String contx = "";
		String nombreaux = "";
		String valoraux = "";
		int loc = 0;
		for(int i=0; i<almacen.size(); i++){

			ArrayList<String> aux = almacen.get(i);
			contx = aux.get(0);
			nombreaux = aux.get(2);
			valoraux = aux.get(3);
			loc = i;
			if(!contx.equals(contextoaux) && nombreaux.equals(nombre) && aux.get(1).equals("numero")) break;

		}
		if(!valoraux.equals("null")) almacen.get(loc).set(1,"int");
		if(!valoraux.equals("null") && valor.contains(".")) almacen.get(loc).set(1,"float");
		
		
	 }

    @Override
    public String visitProgPrincipal(GramProgParser.ProgPrincipalContext ctx) {

		visitChildren(ctx);
		for(int i=0; i<almacen.size(); i++){
			ArrayList<String> aux = almacen.get(i);
			if(aux.get(4).equals("noesParam")) ts.rellenaFilaPilaVar(aux.get(0), aux.get(2), aux.get(1), aux.get(3));
			else ts.rellenaFilaPilaArg(aux.get(0), aux.get(2), aux.get(1));
		}
		return "";
    }
    @Override
    public String visitDefinirFunc(GramProgParser.DefinirFuncContext ctx) {
        variable.add(ctx.ID().getText());

		 contextoaux = ctx.ID().getText();
		return visitChildren(ctx);
    }

    @Override
    public String visitParam(GramProgParser.ParamContext ctx) {
		esParam = true;
		visitChildren(ctx);
		esParam = false;
		return "";
    }

    @Override
    public String visitBloqueFunc(GramProgParser.BloqueFuncContext ctx) {
		visitChildren(ctx);
		variable.remove(0);
		return "";
    }

    @Override
    public String visitDeclararYasign(GramProgParser.DeclararYasignContext ctx) {
        esNull = false;

		variable.add(ctx.tipo().getText());

		variable.add(ctx.ID().getText());

		if(ctx.expr().getText() == null){
			variable.add("null");

		}else{
			variable.add(ctx.expr().getText());
		}
		if(ctx.CONST() != null){
			variable.add("TRUE");
		}
		else{
			variable.add("FALSE");
		}
		visitChildren(ctx);
		ArrayList<String> aux = new ArrayList<String>(variable);
		if(esNull == true){
			esNull = false;
			aux.set(3,"null");
		}
		aux.add("noesParam");

		if(aux.get(1).equals("numero") && aux.get(3).contains(".")) aux.set(1,"float");
	    if(aux.get(1).equals("numero") && !aux.get(3).contains(".") && !aux.get(3).equals("null")) aux.set(1,"int");
		aux.remove(3);
		almacen.add(aux);
		variable.remove(4);
		variable.remove(3);
		variable.remove(2);
		variable.remove(1);
		return "";
    }

    @Override
    public String visitDeclarar(GramProgParser.DeclararContext ctx) {
        variable.add(ctx.tipo().getText());

		variable.add(ctx.ID().getText());

		variable.add("null");

		if(ctx.CONST() != null){
			variable.add("TRUE");
		}
		else{
			variable.add("FALSE");
		}

		visitChildren(ctx);
		ArrayList<String> aux = new ArrayList<String>(variable);
		if(esParam == true){
			aux.add("esParam");
		}
		else aux.add("noesParam");
		aux.remove(3);
		almacen.add(aux);
		variable.remove(4);
		variable.remove(3);
		variable.remove(2);
		variable.remove(1);
		return "";
    }

    @Override
    public String visitAsignar(GramProgParser.AsignarContext ctx) {
        if(!ctx.expr().getText().equals("null"))  buscarCambioTipo(ctx.ID().getText(),ctx.expr().getText());
		return visitChildren(ctx);
    }

    @Override
    public String visitLlamadaFunc(GramProgParser.LlamadaFuncContext ctx) {
		esNull=true;
		return visitChildren(ctx);
    }
	
	public String enterId(GramProgParser.IdContext ctx) {

		  esNull=true;
		  return "";
	}
}