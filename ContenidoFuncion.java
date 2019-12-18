import java.util.Stack;

public class ContenidoFuncion {
	Stack<String[]> pilaVar = new Stack<String[]>();
	Stack<String[]> pilaVarArgs = new Stack<String[]>();
	int tipoRetorno = 0;
	int numArgumentos = 0;
	int desplazamiento = 0;
	int punteroPila = 0;
	
	public void rellenaPilaArgs(Stack<String[]> pilaVar){
			pilaVarArgs.add(pilaVar.elementAt(0));
	}

	public void rellenaPilaVar(String nombreVar, String tipoDato){
		String[] entradaFilaPila = new String[3];
		entradaFilaPila[0] = nombreVar;
		entradaFilaPila[1] = tipoDato;
		entradaFilaPila[2] = Integer.toString(desplazamiento++);
		pilaVar.add(entradaFilaPila);
	}
	
	
}
