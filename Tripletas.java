import java.util.ArrayList;

public class Tripletas {

    public int primeraPosicion;
    public int segundaPosicion;
    public Object terceraPosicion;
    public Object[] terceraPosicionArray;
    public boolean hayTercero = false;

    public Tripletas() {

    }

    public Tripletas crearTripleta(ArrayList<String> tri) {

        int tamanoTripleta = tri.size();
        switch (tamanoTripleta) {

            case 0:
                System.out.println("ERROR, Tripleta no válida");
                break;
            case 1:
                primeraPosicion = Integer.parseInt(tri.get(0));
                break;
            case 2:
                primeraPosicion = Integer.parseInt(tri.get(0));
                segundaPosicion = Integer.parseInt(tri.get(1));
                break; 
            case 3:  
                hayTercero = true;
                primeraPosicion = Integer.parseInt(tri.get(0));
                segundaPosicion = Integer.parseInt(tri.get(1));
                if(Integer.parseInt(tri.get(0)) == 1 && tri.get(2).charAt(0) == '{'){ // 00 enteros 11 float 22 string 33 bool
                    String cad =tri.get(2).substring(1,tri.get(2).length()-1);
                    terceraPosicionArray = cad.split(",");

                } else {
                    terceraPosicion = tri.get(2);
                }
                break;

        }
        return this;
    }
}