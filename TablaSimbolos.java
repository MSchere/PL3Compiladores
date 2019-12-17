import java.util.HashMap;

public class TablaSimbolos extends ContenidoFuncion{
	
	HashMap<String, ContenidoFuncion> funcion = new HashMap<String, ContenidoFuncion>();
	
	//M�todo al que hay que llamar cuando se detecta una funci�n
	public void rellenaFuncion(String nombreFunc, int numArgumentos, String tipoRetorno) {
		//Creamos un objeto que tiene el contenido de funci�n y sus caracter�sticas
		ContenidoFuncion cnt = new ContenidoFuncion();
		
		//Introduce el numero de argumentos
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
	
	//M�todo al que hay que llamar cuando se detecta una variable
	public void rellenaFilaPilaVar(String nombreFunc, String nombreVar, String tipoDato){
		//Se comrpueba si es un argumento de la funci�n y se mete en su pila de argumentos y en la de variables
		if (funcion.get(nombreFunc).pilaVar.size() < funcion.get(nombreFunc).numArgumentos) {
			funcion.get(nombreFunc).rellenaPilaVar(nombreVar, tipoDato);
			funcion.get(nombreFunc).rellenaPilaArgs(pilaVar);
		}
		//Si no es un argumentos va a la pila de variables de la funcion
		else {
			funcion.get(nombreFunc).rellenaPilaVar(nombreVar, tipoDato);
		}
	}
	
	public String[] extraeContenidoFuncion(String nombreFunc) {
		String[] contenidoFunc;
		contenidoFunc[0] = nombreFunc;
		contenidoFunc[1] = String.valueOf(funcion.get(nombreFunc).numArgumentos);
		if (funcion.get(nombreFunc).tipoRetorno == 1) {
			contenidoFunc[2] = "numero";
		}
		if (funcion.get(nombreFunc).tipoRetorno == 2) {
			contenidoFunc[2] = "string";
		}
		if (funcion.get(nombreFunc).tipoRetorno == 3) {
			contenidoFunc[2] = "bool";
		}
		return contenidoFunc;
	}
	
	public String[] extraeTiposArgumentos(String nombreFunc) {
		String[] tiposArgumentos;
		for (int i = 0; i < (funcion.get(nombreFunc).pilaVarArgs).size(); i++) {
			tiposArgumentos[i] = funcion.get(nombreFunc).pilaVarArgs.get(i)[2];
		}
		return tiposArgumentos;
	}
	
}
