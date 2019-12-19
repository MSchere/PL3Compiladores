public class Cadena extends Dato{
    
    private String valor;
    public Cadena(){
        super(2);
    }
    public Cadena(String valor){
        super(2);
        this.valor = valor;
    }

    public String getValor(){return valor;}
    public void setValor(String n){valor = n;}
}