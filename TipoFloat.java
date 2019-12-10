public class TipoFloat extends Dato{
    
    private float valor;
    public TipoFloat(){
        super(0);
    }
    public TipoFloat(double valor){
        super(1);
        this.valor = (float)valor;
    }

    public float getValor(){return valor;}
    public void setValor(float n){valor = n;}
}