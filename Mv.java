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
    private ArrayList<
    private Instrucciones inst = new Instrucciones(this,registros,pila);

    public int getCpila(){return cpila;}
    public void setCpila(int cpila){this.cpila = cpila;}
    public int getCprog(){return cprog;}
    public void setCprog(int cprog){this.cprog = cprog;}
    
    public void TraducirYEjecutar(int[] Triple) {
        int First = Triple[0];
        switch (First) {
            case 0:
                System.out.println("Init con parametro 1 " + Triple[1] + " parametro 2 " + Triple[2]);
                inst.init(Triple[1], Triple[2]);
                break;
            case 1:
                System.out.println("Push con parametro 1 " + Triple[1]);
                inst.push(Triple[1]);
                break;
            case 2:
                System.out.println("Pop ");
                inst.pop();
                break;
            case 3:
                System.out.println("MovRR con parametro 1 " + Triple[1] + " parametro 2 " + Triple[2]);
                inst.movRR(Triple[1], Triple[2]);
                break;
            case 4:
                System.out.println("MovRM con parametro 1 " + Triple[1] + " parametro 2 " + Triple[2]);
                inst.movRM(Triple[1], Triple[2]);
                break;
            case 5:
                System.out.println("MovMR con parametro 1 " + Triple[1] + " parametro 2 " + Triple[2]);
                inst.movMR(Triple[1], Triple[2]);
                break;
            case 6:
                System.out.println("END");
                inst.end();
                break;
            case 7:
                System.out.println("Add con parametro 1 " + Triple[1] + " parametro 2 " + Triple[2]);
                inst.add(Triple[1], Triple[2]);
                break;
            case 8:
                System.out.println("SUB con parametro 1 " + Triple[1] + " parametro 2 " + Triple[2]);
                inst.sub(Triple[1], Triple[2]);
                break;
            case 9:
                System.out.println("MUL con parametro 1 " + Triple[1] + " parametro 2 " + Triple[2]);
                inst.mul(Triple[1], Triple[2]);
                break;
            case 10:
                System.out.println("DIV con parametro 1 " + Triple[1] + " parametro 2 " + Triple[2]);
                inst.div(Triple[1], Triple[2]);
                break;
            case 11:
                System.out.println("EXP con parametro 1 " + Triple[1] + " parametro 2 " + Triple[2]);
                inst.exp(Triple[1], Triple[2]);
                break;
            case 12:
                System.out.println("SQRT con parametro 1 " + Triple[1] + " parametro 2 " + Triple[2]);
                inst.sqrt(Triple[1]);
                break;
            case 13:
                System.out.println("Menor que con parametro 1 " + Triple[1] + " parametro 2 " + Triple[2]);
                inst.menq(Triple[1], Triple[2]);
                break;
            case 14:
                System.out.println("Mayor que con parametro 1 " + Triple[1] + " parametro 2 " + Triple[2]);
                inst.mayq(Triple[1], Triple[2]);
                break;
            case 15:
                System.out.println("Igual que con parametro 1 " + Triple[1] + " parametro 2 " + Triple[2]);
                inst.igual(Triple[1], Triple[2]);
                break;
            case 16:
                System.out.println("No Igual que con parametro 1 " + Triple[1] + " parametro 2 " + Triple[2]);
                inst.noIgual(Triple[1], Triple[2]);
                break;
            case 17:
                System.out.println("Dif Bit con parametro 1 " + Triple[1] + " parametro 2 " + Triple[2]);
                inst.difBit(Triple[1], Triple[2]);
                break;
            case 18:
                System.out.println("And Bit con parametro 1 " + Triple[1] + " parametro 2 " + Triple[2]);
                inst.andBit(Triple[1], Triple[2]);
                break;
            case 19:
                System.out.println("Or Bit con parametro 1 " + Triple[1] + " parametro 2 " + Triple[2]);
                inst.orBit(Triple[1], Triple[2]);
                break;
            case 20:
                System.out.println("lShift con parametro 1 " + Triple[1] + " parametro 2 " + Triple[2]);
                inst.lShift(Triple[1], Triple[2]);
                break;
            case 21:
                System.out.println("rShift con parametro 1 " + Triple[1] + " parametro 2 " + Triple[2]);
                inst.rShift(Triple[1], Triple[2]);
                break;
            case 22:
                System.out.println("And con parametro 1 " + Triple[1] + " parametro 2 " + Triple[2]);
                inst.and(Triple[1], Triple[2]);
                break;
            case 23:
                System.out.println("Or con parametro 1 " + Triple[1] + " parametro 2 " + Triple[2]);
                inst.or(Triple[1], Triple[2]);
                break;
            case 24:
                System.out.println("Copiar cadena con parametro 1 " + Triple[1] + " parametro 2 " + Triple[2]);
                inst.jump(Triple[1]);
                break; 
            case 25:
                System.out.println("Copiar cadena con parametro 1 " + Triple[1] + " parametro 2 " + Triple[2]);
                inst.copiaCadena(Triple[1], Triple[2]);
                break;
            case 26:
                System.out.println("Concatenar con parametro 1 " + Triple[1] + " parametro 2 " + Triple[2]);
                inst.concat(Triple[1], Triple[2]);
                break;
            case 27:
                System.out.println("Extraer cadena con parametro 1 " + Triple[1] + " parametro 2 " + Triple[2]);
                inst.extraerCad(Triple[1], Triple[2]);
                break;
            case 28:
                System.out.println("Obtener el carácter en una posición con parametro 1 " + Triple[1] + " parametro 2 " + Triple[2]);
                inst.getCharAtPos(Triple[1], Triple[2]);
                break;
            case 29:
                System.out.println("Cambia caracter en una posición con parametro 1 " + Triple[1] + " parametro 2 " + Triple[2]);
                inst.cambiaChar(Triple[1], Triple[2]);
                break;
        }
    }
}
