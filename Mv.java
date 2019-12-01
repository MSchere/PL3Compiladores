import java.util.ArrayList;

/**
 *
 * @author ajpaz
 */
public class Mv {
    private Entrada[] registros = {null,null,null,null,null};
    private int cpila = -1;
    private int cprog = 0;
    private ArrayList<Entrada> pila = new ArrayList<Entrada>();
    private ArrayList<ArrayList<Integer>> memoria;
    private Instrucciones inst = new Instrucciones(this,registros,pila);

    public Mv(ArrayList<ArrayList<Integer>> memoria){
        this.memoria = memoria;
    }

    private int[] convertirArray(ArrayList<Integer> tripletas){
        int[] trip = new int[3];
        for(int i=0;i<tripletas.size();i++){
            trip[i] = tripletas.get(i);
        }
        return trip;
    }

    public void ejecutar(){
        while(cprog<memoria.size()){
            ArrayList<Integer> triple = memoria.get(cprog);
            TraducirYEjecutar(convertirArray(triple));
            cprog++;
        }
    }

    public int getCpila(){return cpila;}
    public void setCpila(int cpila){this.cpila = cpila;}
    public int getCprog(){return cprog;}
    public void setCprog(int cprog){this.cprog = cprog;}
    
    private void TraducirYEjecutar(ArrayList<Tripleta> triple) {
        int First = triple.op;
        switch (First) {
            case 0:
                System.out.println("Init con parametro 1 " + triple.var1 + " parametro 2 " + triple.var2);
                inst.init(triple.var1, triple.var2);
                break;
            case 1:
                System.out.println("Push con parametro 1 " + triple.var1);
                inst.push(triple.var1);
                break;
            case 2:
                System.out.println("Pop");
                inst.pop();
                break;
            case 3:
                System.out.println("MovRR con parametro 1 " + triple.var1 + " parametro 2 " + triple.var2);
                inst.movRR(triple.var1, triple.var2);
                break;
            case 4:
                System.out.println("MovRM con parametro 1 " + triple.var1 + " parametro 2 " + triple.var2);
                inst.movRM(triple.var1, triple.var2);
                break;
            case 5:
                System.out.println("MovMR con parametro 1 " + triple.var1 + " parametro 2 " + triple.var2);
                inst.movMR(triple.var1, triple.var2);
                break;
            case 6:
                System.out.println("END");
                inst.end();
                if(cpila == 0) cprog = memoria.size();
                break;
            case 7:
                System.out.println("Add con parametro 1 " + triple.var1 + " parametro 2 " + triple.var2);
                inst.add(triple.var1, triple.var2);
                break;
            case 8:
                System.out.println("SUB con parametro 1 " + triple.var1 + " parametro 2 " + triple.var2);
                inst.sub(triple.var1, triple.var2);
                break;
            case 9:
                System.out.println("MUL con parametro 1 " + triple.var1 + " parametro 2 " + triple.var2);
                inst.mul(triple.var1, triple.var2);
                break;
            case 10:
                System.out.println("DIV con parametro 1 " + triple.var1 + " parametro 2 " + triple.var2);
                inst.div(triple.var1, triple.var2);
                break;
            case 11:
                System.out.println("EXP con parametro 1 " + triple.var1 + " parametro 2 " + triple.var2);
                inst.exp(triple.var1, triple.var2);
                break;
            case 12:
                System.out.println("SQRT con parametro 1 " + triple.var1 + " parametro 2 " + triple.var2);
                inst.sqrt(triple.var1);
                break;
            case 13:
                System.out.println("Menor que con parametro 1 " + triple.var1 + " parametro 2 " + triple.var2);
                inst.menq(triple.var1, triple.var2);
                break;
            case 14:
                System.out.println("Mayor que con parametro 1 " + triple.var1 + " parametro 2 " + triple.var2);
                inst.mayq(triple.var1, triple.var2);
                break;
            case 15:
                System.out.println("Igual que con parametro 1 " + triple.var1 + " parametro 2 " + triple.var2);
                inst.igual(triple.var1, triple.var2);
                break;
            case 16:
                System.out.println("No Igual que con parametro 1 " + triple.var1 + " parametro 2 " + triple.var2);
                inst.noIgual(triple.var1, triple.var2);
                break;
            case 17:
                System.out.println("Dif Bit con parametro 1 " + triple.var1 + " parametro 2 " + triple.var2);
                inst.difBit(triple.var1, triple.var2);
                break;
            case 18:
                System.out.println("And Bit con parametro 1 " + triple.var1 + " parametro 2 " + triple.var2);
                inst.andBit(triple.var1, triple.var2);
                break;
            case 19:
                System.out.println("Or Bit con parametro 1 " + triple.var1 + " parametro 2 " + triple.var2);
                inst.orBit(triple.var1, triple.var2);
                break;
            case 20:
                System.out.println("lShift con parametro 1 " + triple.var1 + " parametro 2 " + triple.var2);
                inst.lShift(triple.var1, triple.var2);
                break;
            case 21:
                System.out.println("rShift con parametro 1 " + triple.var1 + " parametro 2 " + triple.var2);
                inst.rShift(triple.var1, triple.var2);
                break;
            case 22:
                System.out.println("And con parametro 1 " + triple.var1 + " parametro 2 " + triple.var2);
                inst.and(triple.var1, triple.var2);
                break;
            case 23:
                System.out.println("Or con parametro 1 " + triple.var1 + " parametro 2 " + triple.var2);
                inst.or(triple.var1, triple.var2);
                break;
            case 24:
                System.out.println("Jump con parametro 1 " + triple.var1 + " parametro 2 " + triple.var2);
                inst.jump(triple.var1);
                break; 
            case 25:
                System.out.println("Copiar cadena con parametro 1 " + triple.var1 + " parametro 2 " + triple.var2);
                inst.copiaCadena(triple.var1, triple.var2);
                break;
            case 26:
                System.out.println("Concatenar con parametro 1 " + triple.var1 + " parametro 2 " + triple.var2);
                inst.concat(triple.var1, triple.var2);
                break;
            case 27:
                System.out.println("Extraer cadena con parametro 1 " + triple.var1 + " parametro 2 " + triple.var2);
                inst.extraerCad(triple.var1, triple.var2);
                break;
            case 28:
                System.out.println("Obtener el carácter en una posición con parametro 1 " + triple.var1 + " parametro 2 " + triple.var2);
                inst.getCharAtPos(triple.var1, triple.var2);
                break;
            case 29:
                System.out.println("Cambia caracter en una posición con parametro 1 " + triple.var1 + " parametro 2 " + triple.var2);
                inst.cambiaChar(triple.var1, triple.var2);
                break;
            case 30:
                System.out.println("Resultado = "+((Bool)registros[0]).getValor());
                break;
            case 31: //Debug
                System.out.println(pila);
                break;
        }
    }
}
