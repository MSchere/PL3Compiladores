package mvm;

public class Dato extends Entrada{
    
    private final int tipo; //0-> int 1->float 2->String 3->bool 4->array
    
    public Dato(int tipo){
        super(0);
        this.tipo = tipo;
    }

    public int getTipo(){return tipo;}

}