import java.util.ArrayList;

public class BibliotecaFunciones{

    private ArrayList<String[]> tripleta = new ArrayList<String[]>();
    private ArrayList<String> funciones = new ArrayList<String>();;
    private int cpila;
    
    public BibliotecaFunciones(){
        funciones.add("imprimir");
        funciones.add("fopen");
        funciones.add("fwrite");
        funciones.add("freadAll");
        funciones.add("fclose");
        funciones.add("cadenaDonde");
        funciones.add("cadenaSinEspacios");
        funciones.add("cadenaSustituida");
        funciones.add("cadenaIzquierda");
        funciones.add("cadenaDerecha");
        funciones.add("cadenaDentro");
        funciones.add("cadenaLongitud");
    }
    public boolean existe(String nombre){
        return funciones.contains(nombre);
    }
    public ArrayList<String[]> imprimir(int[] cpila){
        tripleta.clear();
        String[] tri = {"","",""};
        tri[0] = "5";
        tri[1] = Integer.toString(cpila[0]-1);
        tri[2] = "1";
        tripleta.add(tri);
        String[] tri2 = {"",""};
        tri2[0] = "41";
        tri2[1] = "1";
        tripleta.add(tri2);
        return tripleta;
    }
    public ArrayList<String[]> fopen(){
        tripleta.clear();
        String[] tri = {"","",""};
        tri[0] = "5";
        tri[1] = Integer.toString(cpila-1);
        tri[2] = "1";
        tripleta.add(tri);
        /*String[] tri2 = {"",""};
        tri2[0] = "40";
        tri2[1] = "1";
        tripleta.add(tri2);*/
        return tripleta;
    }
    /*public ArrayList<String[]> fwrite(){
        
    }
    public ArrayList<String[]> fclose(){
        
    }
    public ArrayList<String[]> freadAll(){
        
    }
    public ArrayList<String[]> cadenaDonde(){
        
    }
    public ArrayList<String[]> cadenaSinEspacios(){
        
    }
    public ArrayList<String[]> cadenaSustituida(){
        
    }
    public ArrayList<String[]> cadenaIzquierda(){
        
    }
    public ArrayList<String[]> cadenaDerecha(){
        
    }
    public ArrayList<String[]>cadenaDentro(){

    }
    public ArrayList<String[]> cadenaLongitud(){

    }*/
}