public class Array extends Dato{
    
    private Dato[] valores;   
    private int tam;
    
    public Array(int tam){
        super(0);
        this.tam = tam;
    }

    public void meter(int pos,Dato valor){valores[pos]=valor;}
    public Dato getValor(int pos){return valores[pos];}
    public int getLong(){return tam;}
    public void cambiarTam(int nuevoTam){
        Dato[] nueva = new Dato[nuevoTam];
        System.arraycopy(valores, 0, nueva, 0, tam);
        valores = nueva;
        tam = nuevoTam;
    }
}