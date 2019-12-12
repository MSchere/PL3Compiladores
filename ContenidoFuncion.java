import java.util.Stack;

public class ContenidoFuncion {
	Stack<String[]> pilaVar = new Stack<String[]>();
	Stack<String[]> pilaVarArgs = new Stack<String[]>();
	int tipoRetorno = 0;
	int numArgumentos = 0;
	int desplazamiento = 0;
	
	public void rellenaPilaArgs(Stack<String[]> pilaVar){
			pilaVarArgs.add(pilaVar.elementAt(0));
	}

	public void rellenaPilaVar(String nombreVar, String tipoDato){
		String[] entradaFilaPila = new String[3];
		entradaFilaPila[1] = nombreVar;
		entradaFilaPila[2] = tipoDato;
		entradaFilaPila[3] = Integer.toString(desplazamiento++);
		pilaVar.add(entradaFilaPila);
	}
	
	
}
