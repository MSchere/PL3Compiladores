public class Array extends Dato{
    
    private Dato[] valores;   
    private int tam;
    private int tipo;
    
    public Array(int tam, int tipo){
        super(0);
        this.tam = tam;
        this.tipo = tipo;
    }

    public void meter(int pos,Dato valor){
        try{
            if(valor.getTipo() == tipo) valores[pos]=valor;
            else throw new Exception();
        }
        catch(Exception e){e.printStackTrace();}
    }
    public Dato getValor(int pos){return valores[pos];}
    public int getLong(){return tam;}
    public void cambiarTam(int nuevoTam){
        Dato[] nueva = new Dato[nuevoTam];
        System.arraycopy(valores, 0, nueva, 0, tam);
        valores = nueva;
        tam = nuevoTam;
    }
}