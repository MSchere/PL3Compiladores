import java.util.ArrayList;
import java.util.HashMap;
import java.util.Stack;

public class FilaTablaSimbolos {
	HashMap<String, Integer> tablaFuncion = new HashMap<String, Integer>();
	
	String[] entradaFilaPila = new String[3];
	Stack<String[]> pilaVar = new Stack<String[]>();
	
	ArrayList<String> codigo = new ArrayList<String>();
	
	public Stack<String[]> rellenaFilaPilaVar(String nombreVar, String tipoDato, String desplazamiento){
		String[] entradaFilaPila = new String[3];
		entradaFilaPila[1] = nombreVar;
		entradaFilaPila[2] = tipoDato;
		entradaFilaPila[3] = desplazamiento;
		pilaVar.add(entradaFilaPila);
		return pilaVar;
	}
	
	public ArrayList<String> rellenaLineaCodigo(String s){
		codigo.add(s);
		return codigo;
	}
	
	public HashMap<String, Integer> rellenaFilaTablaFuncion(String nombreVar, Integer desplazamiento) {
		tablaFuncion.put(nombreVar, desplazamiento);
		return tablaFuncion;
	}

	public int getPos(String nombre){
		return pilaVar.get(index);
	}
	
}
