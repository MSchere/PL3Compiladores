import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;

import java.io.FileInputStream;
import java.io.InputStream;
import java.util.*;
import java.util.ArrayList;

public class TerceraPasada extends GramProgBaseListener {

    // CONTENEDORES

	public ArrayList<String> filas = new ArrayList<String>();

	ArrayList<String> trozosSentencia = new ArrayList<String>();

	public static ArrayList<ArrayList<String>> almacen = new ArrayList<ArrayList<String>>();

	public ArrayList<String> variable = new ArrayList<String>();

	// FUNCIONES DE APOYO

	@Override
    public void enterDefinirFunc(GramProgParser.DefinirFuncContext ctx) {

		 //System.out.println("Nombre_funcion:"+ ctx.ID().getText());

		 variable.add(ctx.ID().getText());
		 System.out.println(variable.toString());

	}

	@Override
    public void exitBloqueFunc(GramProgParser.BloqueFuncContext ctx) {

        //System.out.println("hola");
		variable.remove(0);

	}

    @Override
    public void enterDeclararYasign(GramProgParser.DeclararYasignContext ctx) {

		variable.add(ctx.tipo().getText());
		//System.out.println(variable.toString());

		//System.out.println("/Tipo:"+ ctx.tipo().getText());

		variable.add(ctx.ID().getText());
		//System.out.println(variable.toString());

		//System.out.println("/Identificador:" + ctx.ID().getText());

		if(ctx.expr().getText()==null){
			//System.out.println("/Valor: null");
			variable.add("null");

		}else{
			//System.out.println("/Valor: "+ ctx.expr().getText());
			variable.add(ctx.expr().getText());
		}

    }

    @Override
    public void exitDeclararYasign(GramProgParser.DeclararYasignContext ctx) { 

		ArrayList<String> aux = new ArrayList<String>(variable);
		//System.out.println(variable.toString());
		almacen.add(aux);
		System.out.println(aux);
		variable.remove(3);
		variable.remove(2);
		//System.out.println(variable.toString());
		variable.remove(1);
		//System.out.println(variable.toString());

	}

    @Override
    public void enterDeclarar(GramProgParser.DeclararContext ctx) { 

        //System.out.println("/define_declarar");

		//System.out.println("/BEGIN");

		//System.out.println("/Tipo:"+ ctx.tipo().getText());

		variable.add(ctx.tipo().getText());

		//System.out.println("/Identificador:" + ctx.ID().getText());

		variable.add(ctx.ID().getText());

		variable.add("null");

    }
    @Override
    public void exitDeclarar(GramProgParser.DeclararContext ctx) { 

		ArrayList<String> aux = new ArrayList<String>(variable);

		//System.out.println("/END");
		almacen.add(aux);
		System.out.println(aux);
		variable.remove(3);
		variable.remove(2);
		//System.out.println(variable.toString());
		variable.remove(1);
		//System.out.println(variable.toString());

	}

	/*
	@Override 
	public void enterExpr(GramProgParser.ExprContext ctx) {
		if (ctx.CADENA() != null) {
			pasarArrayatxt2("/Contenido - cadena:" + ctx.CADENA().getText());
	
		}
		if (ctx.llamadafuncionexred() != null) {
			pasarArrayatxt2("/Contenido - llamada a función:" + ctx.llamadafuncionexred().getText());
	
		}
		if (ctx.ID() != null) {
			pasarArrayatxt2("/Contenido - variable:" + ctx.ID().getText());
	
		}
		if (ctx.INT() != null) {
			pasarArrayatxt2("/Contenido - contenido numérico:" + ctx.INT().getText());
	
		}
	 }
	 */


}