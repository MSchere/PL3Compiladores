import java.util.ArrayList;

public class BibliotecaFunciones{

    private ArrayList<String[]> tripleta = new ArrayList<String[]>();
    private ArrayList<String> funciones = new ArrayList<String>();;
    
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
        tri2[0] = "44";
        tri2[1] = "1";
        tripleta.add(tri2);
        return tripleta;
    }
    public ArrayList<String[]> sqrt(int[] cpila){
        tripleta.clear();
        String[] tri = {"","",""};
        tri[0] = "5";
        tri[1] = Integer.toString(cpila[0]-1);
        tri[2] = "1";
        tripleta.add(tri);
        String[] tri2 = {"",""};
        tri2[0] = "12";
        tri2[1] = "1";
        tripleta.add(tri2);
        return tripleta;
    }
    public ArrayList<String[]> fopen(int[] cpila){
        tripleta.clear();
        String[] tri = {"","",""};
        tri[0] = "5";
        tri[1] = Integer.toString(cpila[0]-1);
        tri[2] = "1";
        tripleta.add(tri);
        String[] tri2 = {"",""};
        tri2[0] = "37";
        tri2[1] = "1";
        tripleta.add(tri2);
        return tripleta;
    }
     public ArrayList<String[]> fwrite(int[] cpila){
        tripleta.clear();
        String[] tri = {"","",""};
        tri[0] = "5";
        tri[1] = Integer.toString(cpila[0]-2);
        tri[2] = "1";
        tripleta.add(tri);
        String[] tri2 = {"","",""};
        tri2[0] = "5";
        tri2[1] = Integer.toString(cpila[0]-1);
        tri2[2] = "2";
        tripleta.add(tri2);
        String[] tri3 = {"",""};
        tri3[0] = "38";
        tri3[1] = "1";
        tri3[2] = "2";
        tripleta.add(tri3);
        return tripleta;
    }
  
    public ArrayList<String[]> fclose(int[] cpila){
        tripleta.clear();
        String[] tri = {"","",""};
        tri[0] = "5";
        tri[1] = Integer.toString(cpila[0]-1);
        tri[2] = "1";
        tripleta.add(tri);
        String[] tri2 = {"",""};
        tri2[0] = "40";
        tri2[1] = "1";
        tripleta.add(tri2);
        return tripleta;
    } 
    public ArrayList<String[]> freadAll(int[] cpila){
        tripleta.clear();
        String[] tri = {"","",""};
        tri[0] = "5";
        tri[1] = Integer.toString(cpila[0]-1);
        tri[2] = "1";
        tripleta.add(tri);
        String[] tri2 = {"",""};
        tri2[0] = "39";
        tri2[1] = "1";
        tripleta.add(tri2);
        return tripleta;
    }
    public ArrayList<String[]> cadenaDonde(int[] cpila){
    tripleta.clear();
    String[] tri = {"","",""};
    tri[0] = "5";
    tri[1] = Integer.toString(cpila[0]-2);
    tri[2] = "1";
    tripleta.add(tri);
    String[] tri2 = {"","",""};
    tri2[0] = "5";
    tri2[1] = Integer.toString(cpila[0]-1);
    tri2[2] = "2";
    tripleta.add(tri2);
    String[] tri3 = {"","",""};
    tri3[0] = "32";
    tri3[1] = "1";
    tri3[2] = "2";
    tripleta.add(tri3);
    return tripleta;
    }
    public ArrayList<String[]> cadenaSinEspacios(int[] cpila){
        tripleta.clear();
        String[] tri = {"","",""};
        tri[0] = "5";
        tri[1] = Integer.toString(cpila[0]-1);
        tri[2] = "1";
        tripleta.add(tri);
        String[] tri3 = {"",""};
        tri3[0] = "30";
        tri3[1] = "1";
        tripleta.add(tri3);
        return tripleta;
    }
   
    public ArrayList<String[]> cadenaSustituida(int[] cpila){
        tripleta.clear();
        String[] tri = {"","",""};
        tri[0] = "5";
        tri[1] = Integer.toString(cpila[0]-3);
        tri[2] = "1";
        tripleta.add(tri);
        String[] tri2 = {"","",""};
        tri2[0] = "5";
        tri2[1] = Integer.toString(cpila[0]-2);
        tri2[2] = "2";
        tripleta.add(tri2);
        String[] tri4 = {"","",""};
        tri4[0] = "5";
        tri4[1] = Integer.toString(cpila[0]-1);
        tri4[2] = "3";
        tripleta.add(tri4);
        String[] tri3 = {"","",""};
        tri3[0] = "33";
        tri3[1] = "2";
        tri3[2] = "3";
        tripleta.add(tri3);
        return tripleta;
    } 
    public ArrayList<String[]> cadenaIzquierda(int[] cpila){
        tripleta.clear();
        String[] tri = {"","",""};
        tri[0] = "5";
        tri[1] = Integer.toString(cpila[0]-2);
        tri[2] = "1";
        tripleta.add(tri);
        String[] tri3 = {"","",""};
        tri3[0] = "34";
        tri3[1] = "1";
        tri3[2] = Integer.toString(cpila[0]-1);
        tripleta.add(tri3);
        return tripleta;
    }

    public ArrayList<String[]> cadenaDerecha(int[] cpila){
        tripleta.clear();
        String[] tri = {"","",""};
        tri[0] = "5";
        tri[1] = Integer.toString(cpila[0]-2);
        tri[2] = "1";
        tripleta.add(tri);
        String[] tri3 = {"","",""};
        tri3[0] = "35";
        tri3[1] = "1";
        tri3[2] = Integer.toString(cpila[0]-1);
        tripleta.add(tri3);
        return tripleta;
    }
    
    public ArrayList<String[]>cadenaDentro(int[] cpila){
        tripleta.clear();
        String[] tri3 = {"","",""};
        tri3[0] = "36";
        tri3[1] = Integer.toString(cpila[0]-2);
        tri3[2] = Integer.toString(cpila[0]-1);
        tripleta.add(tri3);
        return tripleta;
    }
    public ArrayList<String[]> cadenaLongitud(int[] cpila){
        tripleta.clear();
        String[] tri = {"","",""};
        tri[0] = "5";
        tri[1] = Integer.toString(cpila[0]-1);
        tri[2] = "1";
        tripleta.add(tri);
        String[] tri2 = {"",""};
        tri2[0] = "31";
        tri2[1] = "1";
        tripleta.add(tri2);
        return tripleta;
    }
}