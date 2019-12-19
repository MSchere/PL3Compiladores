import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;

import java.io.FileInputStream;
import java.io.InputStream;
import java.util.*;

public class TerceraPasada extends GramProgBaseListener {

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

	@Override
    public void enterDefinirFunc(GramProgParser.DefinirFuncContext ctx) {

		 variable.add(ctx.ID().getText());

		 contextoaux = ctx.ID().getText();

	}

	@Override
    public void exitBloqueFunc(GramProgParser.BloqueFuncContext ctx) {

		variable.remove(0);

	}

    @Override
    public void enterDeclararYasign(GramProgParser.DeclararYasignContext ctx) {

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

	}

	@Override 
	public void enterParam(GramProgParser.ParamContext ctx) { 

		esParam = true;
	}
	@Override 
	public void exitParam(GramProgParser.ParamContext ctx){

		esParam = false;
	}

	@Override
	public void enterLlamafuncion(GramProgParser.LlamafuncionContext ctx) {
		   
		  esNull=true;

	 }
	
	@Override
	public void enterId(GramProgParser.IdContext ctx) {

		  esNull=true;
	 }

    @Override
    public void exitDeclararYasign(GramProgParser.DeclararYasignContext ctx) { 

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

	}

    @Override
    public void enterDeclarar(GramProgParser.DeclararContext ctx) { 

		variable.add(ctx.tipo().getText());

		variable.add(ctx.ID().getText());

		variable.add("null");

		if(ctx.CONST() != null){
			variable.add("TRUE");
		}
		else{
			variable.add("FALSE");
		}

    }
    @Override
    public void exitDeclarar(GramProgParser.DeclararContext ctx) { 

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

	}

	@Override 
	public void enterAsignar(GramProgParser.AsignarContext ctx) {

		if(!ctx.expr().getText().equals("null"))  buscarCambioTipo(ctx.ID().getText(),ctx.expr().getText());
	 }

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
	 public void exitProgPrincipal(GramProgParser.ProgPrincipalContext ctx) {
			for(int i=0; i<almacen.size(); i++){
				ArrayList<String> aux = almacen.get(i);
				if(aux.get(5).equals("noesParam")) ts.rellenaFilaPilaVar(aux.get(0), aux.get(2), aux.get(1), aux.get(4));
				
				else ts.rellenaFilaPilaArg(aux.get(0), aux.get(2), aux.get(1));
			}

	  }
}