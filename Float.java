public class Float extends Dato{
    
    private float valor;    
    public Float(double valor){
        super(1);
        this.valor = (float)valor;
    }

    public float getValor(){return valor;}
    public void setValor(float n){valor = n;}
}