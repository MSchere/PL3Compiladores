public class Entrada{
    
    private int tipo; //0-> dato 1->control
    
    public Entrada(int tipo){
        this.tipo = tipo;
    }

    public boolean esControl(){
        if(tipo == 0)return false;
        else return true;
    }
}