import java.util.Stack;

public class ContenidoFuncion {
	Stack<String[]> pilaVar = new Stack<String[]>();
	//Stack<String[]> pilaVarArgs = new Stack<String[]>();
	int tipoRetorno = 0;
	int numArgumentos = 0;
	int desplazamiento = 0;
	int desplazamientoArgumentos = 0;
	int punteroPila = 0;
	
	/*public void rellenaPilaArgs(Stack<String[]> pilaVar){
			pilaVarArgs.add(pilaVar.elementAt(0));
	}*/

	public void setNumArgumentos(int args){
		numArgumentos = args;
		desplazamientoArgumentos = -(numArgumentos+1);
	}

	public void rellenaPilaVar(String nombreVar, String tipoDato, String esConstante){
		String[] entradaFilaPila = new String[4];
		entradaFilaPila[0] = nombreVar;
		entradaFilaPila[1] = tipoDato;
		entradaFilaPila[2] = Integer.toString(desplazamiento++);
		entradaFilaPila[3] = esConstante;
		pilaVar.add(entradaFilaPila);
	}
	
	public void rellenaPilaArg(String nombreVar, String tipoDato){
		String[] entradaFilaPila = new String[4];
		entradaFilaPila[0] = nombreVar;
		entradaFilaPila[1] = tipoDato;
		entradaFilaPila[2] = Integer.toString(desplazamientoArgumentos++);
		entradaFilaPila[3] = "FALSE";
		pilaVar.add(entradaFilaPila);
	}
}
