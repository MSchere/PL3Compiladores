import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;

import java.io.FileInputStream;
import java.io.InputStream;
import java.util.*;
import java.util.ArrayList;

public class TerceraPasada extends GramProgBaseListener {

	TablaSimbolos ts;

	public TerceraPasada(TablaSimbolos tabla){
		this.ts = tabla;
	}
    // CONTENEDORES

	public ArrayList<String> filas = new ArrayList<String>();

	ArrayList<String> trozosSentencia = new ArrayList<String>();

	public static ArrayList<ArrayList<String>> almacen = new ArrayList<ArrayList<String>>();

	public ArrayList<String> variable = new ArrayList<String>();

	String tipoaux;

	boolean esNull = false;

	//public TerceraPasada()

	// FUNCIONES DE APOYO

	@Override
    public void enterDefinirFunc(GramProgParser.DefinirFuncContext ctx) {

		 variable.add(ctx.ID().getText());

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

		if(aux.get(1).equals("numero") && aux.get(3).contains(".")) aux.set(1,"float");
	    if(aux.get(1).equals("numero") && !aux.get(3).contains(".") && !aux.get(3).equals("null")) aux.set(1,"int");
		aux.remove(3);
		ts.rellenaFilaPilaVar(aux.get(0), aux.get(1), aux.get(2));
		ts.
		//System.out.println(aux.get(0) + aux.get(1)+ aux.get(2));
		almacen.add(aux);
		//System.out.println(aux);
		variable.remove(3);
		variable.remove(2);
		variable.remove(1);

	}

    @Override
    public void enterDeclarar(GramProgParser.DeclararContext ctx) { 

		variable.add(ctx.tipo().getText());

		variable.add(ctx.ID().getText());

		variable.add("null");

    }
    @Override
    public void exitDeclarar(GramProgParser.DeclararContext ctx) { 

		ArrayList<String> aux = new ArrayList<String>(variable);
		aux.remove(3);
		ts.rellenaFilaPilaVar(aux.get(0), aux.get(1), aux.get(2));
		almacen.add(aux);
		//System.out.println(aux);
		variable.remove(3);
		variable.remove(2);
		variable.remove(1);

	}

}