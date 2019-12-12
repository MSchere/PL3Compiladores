import java.util.HashMap;

public class TablaSimbolos extends ContenidoFuncion{
	
	HashMap<String, ContenidoFuncion> funcion = new HashMap<String, ContenidoFuncion>();
	
	//Método al que hay que llamar cuando se detecta una función
	public void rellenaFuncion(String nombreFunc, int numArgumentos, String tipoRetorno) {
		//Creamos un objeto que tiene el contenido de función y sus características
		ContenidoFuncion cnt = new ContenidoFuncion();
		
		//Introduce el número de argumentos
		cnt.numArgumentos = numArgumentos;
		
		//Introduce el tipo de dato de salida
		if (tipoRetorno.equals("numero")) {
			cnt.tipoRetorno = 1;
		}
		if (tipoRetorno.equals("cadena")) {
			cnt.tipoRetorno = 2;
		}
		if (tipoRetorno.equals("bool")) {
			cnt.tipoRetorno = 3;
		}
		funcion.put(nombreFunc, cnt);
	}
	
	//Método al que hay que llamar cuando se detecta una variable
	public void rellenaFilaPilaVar(String nombreFunc, String nombreVar, String tipoDato){
		//Se comrpueba si es un argumento de la función y se mete en su pila de argumentos y en la de variables
		if (funcion.get(nombreFunc).pilaVar.size() < funcion.get(nombreFunc).numArgumentos) {
			funcion.get(nombreFunc).rellenaPilaVar(nombreVar, tipoDato);
			funcion.get(nombreFunc).rellenaPilaArgs(pilaVar);
		}
		//Si no es un argumentos va a la pila de variables de la función
		else {
			funcion.get(nombreFunc).rellenaPilaVar(nombreVar, tipoDato);
		}
	}
	
}
