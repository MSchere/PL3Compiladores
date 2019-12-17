import java.util.ArrayList;

/**
 *
 * @author ajpaz
 */
public class Mv {
    private Entrada[] registros = { null, null, null, null, null };
    private int cpila = 0;
    private int cprog = 0;
    private ArrayList<Entrada> pila = new ArrayList<Entrada>();
    private ArrayList<Tripletas> memoria;
    private Instrucciones inst = new Instrucciones(this, registros, pila);

    public Mv(ArrayList<Tripletas> memoria) {
        this.memoria = memoria;
    }

    public void ejecutar() {
        while (cprog < memoria.size()) {
            Tripletas triple = memoria.get(cprog);
            TraducirYEjecutar(triple);
            cprog++;
        }
    }

    public int getCpila() {
        return cpila;
    }

    public void setCpila(int cpila) {
        this.cpila = cpila;
    }

    public int getCprog() {
        return cprog;
    }

    public void setCprog(int cprog) {
        this.cprog = cprog;
    }

    private void TraducirYEjecutar(Tripletas triple) {
        int primera = triple.primeraPosicion;
        int segunda = triple.segundaPosicion;
        if(triple.hayTercero && primera == 1){
            
        }
        switch (primera) {
        case 0:
            System.out.println("Init con parametro 1 " + triple.segundaPosicion + " parametro 2 " + triple.terceraPosicion);
            inst.init(triple.segundaPosicion, triple.terceraPosicion);
            break;
        case 1:
            System.out.println("Push con parametro 1 " + triple.segundaPosicion + "Push con parametro 1 " + triple.terceraPosicion);
            if(!triple.hayTercero) inst.push(triple.segundaPosicion);
            else inst.push(triple.segundaPosicion, Integer.toString(triple.terceraPosicion));
            break;
        case 2:
            System.out.println("Pop");
            inst.pop();
            break;
        case 3:
            System.out.println("MovRR con parametro 1 " + triple.segundaPosicion + " parametro 2 " + triple.terceraPosicion);
            inst.movRR(triple.segundaPosicion, triple.terceraPosicion);
            break;
        case 4:
            System.out.println("MovRM con parametro 1 " + triple.segundaPosicion + " parametro 2 " + triple.terceraPosicion);
            inst.movRM(triple.segundaPosicion, triple.terceraPosicion);
            break;
        case 5:
            System.out.println("MovMR con parametro 1 " + triple.segundaPosicion + " parametro 2 " + triple.terceraPosicion);
            inst.movMR(triple.segundaPosicion, triple.terceraPosicion);
            break;
        case 6:
            System.out.println("END");
            inst.end();
            if (cpila == 0)
                cprog = memoria.size();
            break;
        case 7:
            System.out.println("Add con parametro 1 " + triple.segundaPosicion + " parametro 2 " + triple.terceraPosicion);
            inst.add(triple.segundaPosicion, triple.terceraPosicion);
            break;
        case 8:
            System.out.println("SUB con parametro 1 " + triple.segundaPosicion + " parametro 2 " + triple.terceraPosicion);
            inst.sub(triple.segundaPosicion, triple.terceraPosicion);
            break;
        case 9:
            System.out.println("MUL con parametro 1 " + triple.segundaPosicion + " parametro 2 " + triple.terceraPosicion);
            inst.mul(triple.segundaPosicion, triple.terceraPosicion);
            break;
        case 10:
            System.out.println("DIV con parametro 1 " + triple.segundaPosicion + " parametro 2 " + triple.terceraPosicion);
            inst.div(triple.segundaPosicion, triple.terceraPosicion);
            break;
        case 11:
            System.out.println("EXP con parametro 1 " + triple.segundaPosicion + " parametro 2 " + triple.terceraPosicion);
            inst.exp(triple.segundaPosicion, triple.terceraPosicion);
            break;
        case 12:
            System.out.println("SQRT con parametro 1 " + triple.segundaPosicion + " parametro 2 " + triple.terceraPosicion);
            inst.sqrt(triple.segundaPosicion);
            break;
        case 13:
            System.out.println("Menor que con parametro 1 " + triple.segundaPosicion + " parametro 2 " + triple.terceraPosicion);
            inst.menq(triple.segundaPosicion, triple.terceraPosicion);
            break;
        case 14:
            System.out.println("Mayor que con parametro 1 " + triple.segundaPosicion + " parametro 2 " + triple.terceraPosicion);
            inst.mayq(triple.segundaPosicion, triple.terceraPosicion);
            break;
        case 15:
            System.out.println("Igual que con parametro 1 " + triple.segundaPosicion + " parametro 2 " + triple.terceraPosicion);
            inst.igual(triple.segundaPosicion, triple.terceraPosicion);
            break;
        case 16:
            System.out.println("No Igual que con parametro 1 " + triple.segundaPosicion + " parametro 2 " + triple.terceraPosicion);
            inst.noIgual(triple.segundaPosicion, triple.terceraPosicion);
            break;
        case 17:
            System.out.println("Dif Bit con parametro 1 " + triple.segundaPosicion + " parametro 2 " + triple.terceraPosicion);
            inst.difBit(triple.segundaPosicion, triple.terceraPosicion);
            break;
        case 18:
            System.out.println("And Bit con parametro 1 " + triple.segundaPosicion + " parametro 2 " + triple.terceraPosicion);
            inst.andBit(triple.segundaPosicion, triple.terceraPosicion);
            break;
        case 19:
            System.out.println("Or Bit con parametro 1 " + triple.segundaPosicion + " parametro 2 " + triple.terceraPosicion);
            inst.orBit(triple.segundaPosicion, triple.terceraPosicion);
            break;
        case 20:
            System.out.println("lShift con parametro 1 " + triple.segundaPosicion + " parametro 2 " + triple.terceraPosicion);
            inst.lShift(triple.segundaPosicion, triple.terceraPosicion);
            break;
        case 21:
            System.out.println("rShift con parametro 1 " + triple.segundaPosicion + " parametro 2 " + triple.terceraPosicion);
            inst.rShift(triple.segundaPosicion, triple.terceraPosicion);
            break;
        case 22:
            System.out.println("And con parametro 1 " + triple.segundaPosicion + " parametro 2 " + triple.terceraPosicion);
            inst.and(triple.segundaPosicion, triple.terceraPosicion);
            break;
        case 23:
            System.out.println("Or con parametro 1 " + triple.segundaPosicion + " parametro 2 " + triple.terceraPosicion);
            inst.or(triple.segundaPosicion, triple.terceraPosicion);
            break;
        case 24:
            System.out.println("Jump con parametro 1 " + triple.segundaPosicion + " parametro 2 " + triple.terceraPosicion);
            inst.jump(triple.segundaPosicion);
            break;
        //case 25:
        //    System.out.println("Copiar cadena con parametro 1 " + triple.segundaPosicion + " parametro 2 " + triple.terceraPosicion);
        //    inst.copiaCadena(triple.segundaPosicion, triple.terceraPosicion);
        //    break;
        case 26:
            System.out.println("Concatenar con parametro 1 " + triple.segundaPosicion + " parametro 2 " + triple.terceraPosicion);
            inst.concat(triple.segundaPosicion, triple.terceraPosicion);
            break;
        case 27:
            System.out.println("Extraer cadena con parametro 1 " + triple.segundaPosicion + " parametro 2 " + triple.terceraPosicion);
            inst.extraerCad(triple.segundaPosicion, triple.terceraPosicion);
            break;
        //case 28:
        //    System.out.println("Obtener el carácter en una posición con parametro 1 " + triple.segundaPosicion + " parametro 2 "
        //            + triple.terceraPosicion);
        //    inst.getCharAtPos(triple.segundaPosicion, triple.terceraPosicion);
        //    break;
        //case 29:
        //    System.out.println(
        //            "Cambia caracter en una posición con parametro 1 " + triple.segundaPosicion + " parametro 2 " + triple.terceraPosicion);
        //    inst.cambiaChar(triple.segundaPosicion, triple.terceraPosicion);
        //    break;
        case 30:
            System.out.println("Quita los espacios en blanco");
            inst.sinEspacios(triple.segundaPosicion);
            break;
        case 31:
            System.out.println("Longitud de la cadena");
            inst.cadenaLongitud(triple.segundaPosicion);
            break;
        case 32:
            System.out.println("Busca una cadena");
            inst.cadenaDonde(triple.segundaPosicion, triple.terceraPosicion);
            break;
        case 33:
            System.out.println("Sustituye una cadena por otra");
            inst.sustituir(triple.segundaPosicion, triple.terceraPosicion);
            break;
        case 34:
            System.out.println("Cortar cadena desde la izquierda");
            inst.cadenaI(triple.segundaPosicion, triple.terceraPosicion);
            break;
        case 35:
            System.out.println("Cortar cadena desde la derecha");
            inst.cadenaD(triple.segundaPosicion, triple.terceraPosicion);
            break;
        case 36:
            System.out.println("Cortar cadena desde una posición intermedia");
            inst.cadenaDentro(triple.segundaPosicion, triple.terceraPosicion);
            break;
        case 37:
            System.out.println("Abrir fichero");
            inst.abrirFichero(triple.segundaPosicion);
            break;
        case 38:
            System.out.println("Escribir en fichero");
            inst.escribirFichero(triple.segundaPosicion, triple.terceraPosicion);
            break;
        case 39:
            System.out.println("Leer fichero");
            inst.leerFichero(triple.segundaPosicion);
            break;
        case 40:
            System.out.println("Cerrar fichero");
            inst.cerrarFichero(triple.segundaPosicion);
            break;
        case 41:
            inst.imprimir(triple.segundaPosicion);
            break;
        case 42: // Debug
            System.out.println(pila);
            break;
        }
    }
}
