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
                this.setPrimeraPosicion(Integer.parseInt(tri.get(0)));
                break;
            case 2:
                this.setPrimeraPosicion(Integer.parseInt(tri.get(0)));
                this.setSegundaPosicion(Integer.parseInt(tri.get(1)));
                break; 
            case 3:  
            this.hayTercero = true;
                this.setPrimeraPosicion(Integer.parseInt(tri.get(0)));
                this.setSegundaPosicion(Integer.parseInt(tri.get(1)));
                if(Integer.parseInt(tri.get(0)) == 1 && tri.get(2).charAt(0) == '{'){ // 00 enteros 11 float 22 string 33 bool
                    String cad =tri.get(2).substring(1,tri.get(2).length()-1);
                    terceraPosicionArray = cad.split(",");
                    }

                } else {
                    this.setTerceraPosicion(tri.get(2));
                }
                break;

        }
        return this;
    }

    public int getPrimeraPosicion() {
        return primeraPosicion;
    }

    public void setPrimeraPosicion(int primeraPosicion) {
        this.primeraPosicion = primeraPosicion;
    }

    public int getSegundaPosicion() {
        return segundaPosicion;
    }

    public void setSegundaPosicion(int segundaPosicion) {
        this.segundaPosicion = segundaPosicion;
    }

    public int getTerceraPosicion() {
        return terceraPosicion;
    }

    public void setTerceraPosicion(int terceraPosicion) {
        this.terceraPosicion = terceraPosicion;
    }

    public String getTerceraPosicion2() {
        return terceraPosicion2;
    }

    public void setTerceraPosicion2(String terceraPosicion2) {
        this.terceraPosicion2 = terceraPosicion2;
    }
}