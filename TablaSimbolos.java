import java.util.HashMap;
import java.util.Map;
import java.util.Iterator;
import java.util.Set;
import java.util.ArrayList;

public class TablaSimbolos extends ContenidoFuncion{
	
	HashMap<String, ContenidoFuncion> funcion = new HashMap<String, ContenidoFuncion>();
	
	//Metodo al que hay que llamar cuando se detecta una funci�n
	public void rellenaFuncion(String nombreFunc, int numArgumentos, String tipoRetorno, int cpila) {
		//Creamos un objeto que tiene el contenido de funci�n y sus caracter�sticas
		ContenidoFuncion cnt = new ContenidoFuncion();
		
		//Introduce el numero de argumentos
		cnt.setNumArgumentos(numArgumentos);
		cnt.punteroPila = cpila;
		
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
		//Se comrpueba si es un argumento de la funci�n y se mete en su pila de argumentos y en la de variables
		/*if (funcion.get(nombreFunc).pilaVar.size() < funcion.get(nombreFunc).numArgumentos) {
			funcion.get(nombreFunc).rellenaPilaVar(nombreVar, tipoDato, esConstante);
			funcion.get(nombreFunc).rellenaPilaArgs(pilaVar);
		}
		//Si no es un argumentos va a la pila de variables de la funcion
		else {*/
			funcion.get(nombreFunc).rellenaPilaVar(nombreVar, tipoDato, esConstante);
		//}
	}

	public void rellenaFilaPilaArg(String nombreFunc, String nombreVar, String tipoDato){
		//Se comrpueba si es un argumento de la funci�n y se mete en su pila de argumentos y en la de variables
		/*if (funcion.get(nombreFunc).pilaVar.size() < funcion.get(nombreFunc).numArgumentos) {
			funcion.get(nombreFunc).rellenaPilaArg(nombreVar, tipoDato);
			funcion.get(nombreFunc).rellenaPilaArgs(pilaVar);
		}
		//Si no es un argumentos va a la pila de variables de la funcion
		else {*/
			funcion.get(nombreFunc).rellenaPilaArg(nombreVar, tipoDato);
		//}
	}
	
	public String extraeTipoVariable(String nombreFunc, String nombreVar) {
		String tipoVar = "null";
		for(int i = 0; i < (funcion.get(nombreFunc).pilaVar).size(); i++) {
			if((funcion.get(nombreFunc).pilaVar.get(i)[0]).equals(nombreVar)) {
				tipoVar = funcion.get(nombreFunc).pilaVar.get(i)[1];
				switch(tipoVar){
					case "int":
					tipoVar="0";
					break;
					case "float":
					tipoVar="1";
					break;
					case "cadena":
					tipoVar="2";
					break;
					case "booleano":
					tipoVar="3";
					break;

				}
			}
		}
		return tipoVar;
	}
	
	public int extraeDesplazamientoVariable(String nombreFunc, String nombreVar) {
		int desplazamiento = 0;


		int fin = (funcion.get(nombreFunc).pilaVar).size();
	
		for(int i = 0; i < fin ; i++) {
			String nombre = funcion.get(nombreFunc).pilaVar.get(i)[0];

			if(nombre.equals(nombreVar)) {

				desplazamiento = Integer.parseInt(funcion.get(nombreFunc).pilaVar.get(i)[2]) + funcion.get(nombreFunc).punteroPila;
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

	public ArrayList<String[]> extraeContenidoFuncionAll() {
		ArrayList<String[]> almacenFunc = new ArrayList<String[]>();
		String[] contenidoFunc = new String[2];

		Set set = funcion.entrySet();
        Iterator iterator = set.iterator();
        while(iterator.hasNext()) {
         Map.Entry mentry = (Map.Entry)iterator.next();
		 ContenidoFuncion aux = new ContenidoFuncion();
		 aux = (ContenidoFuncion) mentry.getValue();
			contenidoFunc[0] = (String) mentry.getKey(); //nombreFuncion
			if (funcion.get((String) mentry.getKey()).tipoRetorno == 1) {
				contenidoFunc[1] = "numero";
			}
			if (funcion.get((String) mentry.getKey()).tipoRetorno == 2) {
				contenidoFunc[1] = "string";
			}
			if (funcion.get((String) mentry.getKey()).tipoRetorno == 3) {
				contenidoFunc[1] = "booleano";
			}
			if (funcion.get((String) mentry.getKey()).tipoRetorno == 4) {
				contenidoFunc[1] = "void";
			}
            
			almacenFunc.add(contenidoFunc);

      }

		return almacenFunc;
	}

	public boolean existeFuncion(String nombre){
		return funcion.containsKey(nombre);
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