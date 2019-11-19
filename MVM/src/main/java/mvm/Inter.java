package mvm;

import java.util.ArrayList;

/**
 *
 * @author ajpaz
 */
public class Inter {
    private Entrada[] registros = {null,null,null,null,null};
    private int cpila = -1;
    private int cprog = 0;
    private ArrayList<Entrada> pila = new ArrayList<Entrada>();
    private Instrucciones inst = new Instrucciones(this,registros,pila);

    public int getCpila(){return cpila;}
    public void setCpila(int cpila){this.cpila = cpila;}
    public int getCprog(){return cprog;}
    public void setCprog(int cprog){this.cprog = cprog;}
    
    public void funciona(){
        inst.push(1.3);
        inst.push("caca");
        inst.init(1,0);
        inst.push(1);
        inst.push(2);
        System.out.println(pila);
        inst.movMR(1, 3);
        inst.movMR(2, 4);
        System.out.println(((Int)registros[3]).getValor());
        System.out.println(((Int)registros[4]).getValor());
        inst.add(3, 4);
        System.out.println(((Int)registros[0]).getValor());
        inst.end();
        System.out.println(pila);
    }
}
