import java.util.ArrayList;

/**
 *
 * @author ajpaz
 */
public class Mv {
    private Entrada[] registros = { null, null, null, null, null };
    private int cpila = 0;
    private int cprog = 0;
    private boolean debug;
    private ArrayList<Entrada> pila = new ArrayList<Entrada>();
    private ArrayList<Tripletas> memoria;
    private Instrucciones inst = new Instrucciones(this, registros, pila);

    public Mv(ArrayList<Tripletas> memoria, boolean debug) {
        this.memoria = memoria;
        this.debug = debug;
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
        int tercera = 0;
        if(triple.hayTercero && primera != 1){
            tercera = Integer.parseInt(triple.terceraPosicion);
        }
        switch (primera) {
        case 0:
            if(debug)System.out.println("Init con parametro 1 " + segunda + " parametro 2 " + tercera);
            inst.init(segunda, tercera);
            break;
        case 1:
            if(!triple.hayTercero){
                if(debug)System.out.println("Push con parametro 1 " + segunda);
                inst.push(segunda);
            }
            else{
                switch(segunda){
                    case 0:
                        if(debug)System.out.println("Push con parametro 1 " + segunda + " parametro 2 " + Integer.parseInt(triple.terceraPosicion));
                        inst.push(segunda, Integer.parseInt(triple.terceraPosicion));
                        break;
                    case 1:
                        if(debug)System.out.println("Push con parametro 1 " + segunda + " parametro 2 " + new Float(triple.terceraPosicion));
                        inst.push(segunda, new Float(triple.terceraPosicion));
                        break;
                    case 2:
                        if(debug)System.out.println("Push con parametro 1 " + segunda + " parametro 2 " + triple.terceraPosicion);
                        inst.push(segunda, triple.terceraPosicion);
                        break;
                    case 3:
                        if(debug)System.out.println("Push con parametro 1 " + segunda + " parametro 2 " + tercera);
                        if(triple.terceraPosicion.equals("true")) inst.push(segunda, true);
                        else inst.push(segunda, false);
                        break;
                }
            }
            break;
        case 2:
        if(debug)System.out.println("Pop");
            inst.pop();
            break;
        case 3:
            if(debug)System.out.println("MovRR con parametro 1 " + segunda + " parametro 2 " + tercera);
            inst.movRR(segunda, tercera);
            break;
        case 4:
            if(debug)System.out.println("MovRM con parametro 1 " + segunda + " parametro 2 " + tercera);
            inst.movRM(segunda, tercera);
            break;
        case 5:
            if(debug)System.out.println("MovMR con parametro 1 " + segunda + " parametro 2 " + tercera);
            inst.movMR(segunda, tercera);
            break;
        case 6:
            if(debug)System.out.println("END");
            inst.end();
            if (cpila == 0)
                cprog = memoria.size();
            break;
        case 7:
            if(debug)System.out.println("Add con parametro 1 " + segunda + " parametro 2 " + tercera);
            inst.add(segunda, tercera);
            break;
        case 8:
            if(debug)System.out.println("SUB con parametro 1 " + segunda + " parametro 2 " + tercera);
            inst.sub(segunda, tercera);
            break;
        case 9:
            if(debug)System.out.println("MUL con parametro 1 " + segunda + " parametro 2 " + tercera);
            inst.mul(segunda, tercera);
            break;
        case 10:
            if(debug)System.out.println("DIV con parametro 1 " + segunda + " parametro 2 " + tercera);
            inst.div(segunda, tercera);
            break;
        case 11:
            if(debug)System.out.println("EXP con parametro 1 " + segunda + " parametro 2 " + tercera);
            inst.exp(segunda, tercera);
            break;
        case 12:
            if(debug)System.out.println("SQRT con parametro 1 " + segunda + " parametro 2 " + tercera);
            inst.sqrt(segunda);
            break;
        case 13:
            if(debug)System.out.println("Menor que con parametro 1 " + segunda + " parametro 2 " + tercera);
            inst.menq(segunda, tercera);
            break;
        case 14:
            if(debug)System.out.println("Mayor que con parametro 1 " + segunda + " parametro 2 " + tercera);
            inst.mayq(segunda, tercera);
            break;
        case 15:
            if(debug)System.out.println("Igual que con parametro 1 " + segunda + " parametro 2 " + tercera);
            inst.igual(segunda, tercera);
            break;
        case 16:
            if(debug)System.out.println("No Igual que con parametro 1 " + segunda + " parametro 2 " + tercera);
            inst.noIgual(segunda, tercera);
            break;
        case 17:
            if(debug)System.out.println("Dif Bit con parametro 1 " + segunda + " parametro 2 " + tercera);
            inst.difBit(segunda, tercera);
            break;
        case 18:
            if(debug)System.out.println("And Bit con parametro 1 " + segunda + " parametro 2 " + tercera);
            inst.andBit(segunda, tercera);
            break;
        case 19:
            if(debug)System.out.println("Or Bit con parametro 1 " + segunda + " parametro 2 " + tercera);
            inst.orBit(segunda, tercera);
            break;
        case 20:
            if(debug)System.out.println("lShift con parametro 1 " + segunda + " parametro 2 " + tercera);
            inst.lShift(segunda, tercera);
            break;
        case 21:
            if(debug)System.out.println("rShift con parametro 1 " + segunda + " parametro 2 " + tercera);
            inst.rShift(segunda, tercera);
            break;
        case 22:
            if(debug)System.out.println("And con parametro 1 " + segunda + " parametro 2 " + tercera);
            inst.and(segunda, tercera);
            break;
        case 23:
            if(debug)System.out.println("Or con parametro 1 " + segunda + " parametro 2 " + tercera);
            inst.or(segunda, tercera);
            break;
        case 24:
            if(debug)System.out.println("Jump con parametro 1 " + segunda + " parametro 2 " + tercera);
            inst.jump(segunda);
            break;
        //case 25:
        //    System.out.println("Copiar cadena con parametro 1 " + segunda + " parametro 2 " + tercera);
        //    inst.copiaCadena(segunda, tercera);
        //    break;
        case 26:
            if(debug)System.out.println("Concatenar con parametro 1 " + segunda + " parametro 2 " + tercera);
            inst.concat(segunda, tercera);
            break;
        case 27:
            if(debug)System.out.println("Extraer cadena con parametro 1 " + segunda + " parametro 2 " + tercera);
            inst.extraerCad(segunda, tercera);
            break;
        //case 28:
        //    System.out.println("Obtener el carácter en una posición con parametro 1 " + segunda + " parametro 2 "
        //            + tercera);
        //    inst.getCharAtPos(segunda, tercera);
        //    break;
        //case 29:
        //    System.out.println(
        //            "Cambia caracter en una posición con parametro 1 " + segunda + " parametro 2 " + tercera);
        //    inst.cambiaChar(segunda, tercera);
        //    break;
        case 30:
            if(debug)System.out.println("Quita los espacios en blanco");
            inst.sinEspacios(segunda);
            break;
        case 31:
            if(debug)System.out.println("Longitud de la cadena");
            inst.cadenaLongitud(segunda);
            break;
        case 32:
            if(debug)System.out.println("Busca una cadena");
            inst.cadenaDonde(segunda, tercera);
            break;
        case 33:
            if(debug)System.out.println("Sustituye una cadena por otra");
            inst.sustituir(segunda, tercera);
            break;
        case 34:
            if(debug)System.out.println("Cortar cadena desde la izquierda");
            inst.cadenaI(segunda, tercera);
            break;
        case 35:
            if(debug)System.out.println("Cortar cadena desde la derecha");
            inst.cadenaD(segunda, tercera);
            break;
        case 36:
            if(debug)System.out.println("Cortar cadena desde una posición intermedia");
            inst.cadenaDentro(segunda, tercera);
            break;
        case 37:
            if(debug)System.out.println("Abrir fichero");
            inst.abrirFichero(segunda);
            break;
        case 38:
            if(debug)System.out.println("Escribir en fichero");
            inst.escribirFichero(segunda, tercera);
            break;
        case 39:
            if(debug)System.out.println("Leer fichero");
            inst.leerFichero(segunda);
            break;
        case 40:
            if(debug)System.out.println("Cerrar fichero");
            inst.cerrarFichero(segunda);
            break;
        case 41:
            if(debug)System.out.println("Jump si es mayor");
            inst.jmpt(segunda, tercera);
            break;
        case 42:
            if(debug)System.out.println("Jump si es menor");
            inst.jmpf(segunda, tercera);
            break;
        case 43:
            if(debug)System.out.println("Imprime por pantalla");
            inst.imprimir(segunda);
            break;
        case 44:
            if(debug)System.out.println("Store con parámetro 1 "+segunda+" parametro 2 "+tercera);
            inst.store(segunda,tercera);
            break;
        case 45: // Debug
            System.out.println(pila);
            break;
        }
    }
}
