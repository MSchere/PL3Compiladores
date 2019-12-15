import java.util.ArrayList;

public class Tripletas {

    private int primeraPosicion;
    private int segundaPosicion;
    private int terceraPosicion;
    private String terceraPosicion2;

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
                this.setPrimeraPosicion(Integer.parseInt(tri.get(0)));
                this.setSegundaPosicion(Integer.parseInt(tri.get(1)));
                if (tri.get(2).charAt(0) == '"') {
                    this.setTerceraPosicion2(tri.get(2));
                } else {
                    this.setTerceraPosicion(Integer.parseInt(tri.get(2)));
                }

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