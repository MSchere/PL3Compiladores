public class Int extends Dato{
    
    private int valor;
    public Int(){
        super(0);ponerselo a todas las clases
    }
    public Int(int valor){
        super(0);
        this.valor = valor;
    }

    public int getValor(){return valor;}
    public void setValor(int n){valor = n;}
}