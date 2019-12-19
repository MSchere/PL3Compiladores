import java.util.HashMap;
import java.util.ArrayList;

public class TablaSimbolos extends ContenidoFuncion{
	
	HashMap<String, ContenidoFuncion> funcion = new HashMap<String, ContenidoFuncion>();
	
	//Metodo al que hay que llamar cuando se detecta una funcion
	public void rellenaFuncion(String nombreFunc, int numArgumentos, String tipoRetorno) {
		//Creamos un objeto que tiene el contenido de funcion y sus caracter�sticas
		ContenidoFuncion cnt = new ContenidoFuncion();
		
		//Introduce el numero de argumentos
		cnt.setNumArgumentos(numArgumentos);
		
		//Introduce el tipo de dato de salida
		if (tipoRetorno.equals("numero")) {
			cnt.tipoRetorno = 1;
		}
		if (tipoRetorno.equals("cadena")) {
			cnt.tipoRetorno = 2;
		}
		if (tipoRetorno.equals("booleano")) {
			cnt.tipoRetorno = 3;
		}
		if (tipoRetorno.equals("void")) {
			cnt.tipoRetorno = 4;
		}
		funcion.put(nombreFunc, cnt);
	}
	
	//Metodo al que hay que llamar cuando se detecta una variable
	public void rellenaFilaPilaVar(String nombreFunc, String nombreVar, String tipoDato, String esConstante){
			funcion.get(nombreFunc).rellenaPilaVar(nombreVar, tipoDato, esConstante);
	}

	public void rellenaFilaPilaArg(String nombreFunc, String nombreVar, String tipoDato){
			funcion.get(nombreFunc).rellenaPilaArg(nombreVar, tipoDato);
	}
	
	public String extraeTipoVarianble(String nombreFunc, String nombreVar) {
		String tipoVar = "null";
		for(int i = 0; i < (funcion.get(nombreFunc).pilaVar).size(); i++) {
			if((funcion.get(nombreFunc).pilaVar.get(i)[0]).equals(nombreVar)) {
				tipoVar = funcion.get(nombreFunc).pilaVar.get(i)[1];
			}
		}
		return tipoVar;
	}
	
	public int extraeDesplazamientoVariable(String nombreFunc, String nombreVar) {
		int desplazamiento = 0;
		for(int i = 0; i < (funcion.get(nombreFunc).pilaVar).size(); i++) {
			if((funcion.get(nombreFunc).pilaVar.get(i)[0]).equals(nombreVar)) {
				desplazamiento = Integer.parseInt(funcion.get(nombreFunc).pilaVar.get(i)[2]);
			}
		}
		return desplazamiento;
	}
	
	public String[] extraeFilaPilaVariable(String nombreFunc, String nombreVar) {
		String[] filaPilaVar = new String[4];
		for(int i = 0; i < (funcion.get(nombreFunc).pilaVar).size(); i++) {
			if((funcion.get(nombreFunc).pilaVar.get(i)[0]).equals(nombreVar)) {
				filaPilaVar[0] = funcion.get(nombreFunc).pilaVar.get(i)[0];
				filaPilaVar[1] = funcion.get(nombreFunc).pilaVar.get(i)[1];
				filaPilaVar[2] = funcion.get(nombreFunc).pilaVar.get(i)[2];
				filaPilaVar[3] = funcion.get(nombreFunc).pilaVar.get(i)[3];
			}
		}
		return filaPilaVar;
	}
	
	public String[] extraeContenidoFuncion(String nombreFunc) {
		String[] contenidoFunc = new String[3];
		contenidoFunc[0] = nombreFunc;
		contenidoFunc[1] = String.valueOf(funcion.get(nombreFunc).numArgumentos);
		if (funcion.get(nombreFunc).tipoRetorno == 1) {
			contenidoFunc[2] = "numero";
		}
		if (funcion.get(nombreFunc).tipoRetorno == 2) {
			contenidoFunc[2] = "string";
		}
		if (funcion.get(nombreFunc).tipoRetorno == 3) {
			contenidoFunc[2] = "booleano";
		}
		if (funcion.get(nombreFunc).tipoRetorno == 4) {
			contenidoFunc[2] = "void";
		}
		return contenidoFunc;
	}
	/*
	public ArrayList<String> extraeTiposArgumentos(String nombreFunc) {
		ArrayList<String> tiposArgumentos = new ArrayList<String>();
		for (int i = 0; i < (funcion.get(nombreFunc).pilaVarArgs).size(); i++) {
			tiposArgumentos.add(funcion.get(nombreFunc).pilaVarArgs.get(i)[2]);
		}
		return tiposArgumentos;
	}*/
	
	public void setPunteroPila(String nombreFunc, int punteroPila){
		funcion.get(nombreFunc).punteroPila = punteroPila;
	}
}