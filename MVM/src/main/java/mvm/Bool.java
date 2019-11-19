package mvm;

public class Bool extends Dato{
    
    private boolean valor;    
    public Bool(boolean valor){
        super(3);
        this.valor = valor;
    }

    public boolean getValor(){return valor;}
    public void setValor(boolean n){valor = n;}
}