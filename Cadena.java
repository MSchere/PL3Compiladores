public class Cadena extends Dato{
    
    private String valor;    
    public Cadena(String valor){
        super(3);
        this.valor = valor;
    }

    public String getValor(){return valor;}
    public void setValor(String n){valor = n;}
}