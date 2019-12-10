import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class ManejoArchivos{

    private File fichero;
    private FileOutputStream salida;
    private FileInputStream entrada;

    public int abrir(String ruta){
        int fd = 0;
        try{
        fichero = new File(ruta);
        if (!fichero.exists()) fichero.createNewFile();
        salida = new FileOutputStream(fichero);
        entrada = new FileInputStream(fichero);
        fd = fichero.hashCode();
        }
        catch(Exception e){}
        return fd;
    }

    public void escribir(String cadena){
        try{
            byte[] texto = cadena.getBytes();
		    salida.write(texto);
            salida.flush();
        }
        catch(Exception e){}
    }

    public String leer(){
        String cadena = "";
        try{
            int ch = entrada.read();
            while(ch != -1) {
                cadena = cadena + (char)ch;
                ch = entrada.read();
            }
        }catch(Exception e){}
        return cadena;
    }

    public void cerrar(){
        entrada.close();
        salida.close();
    }
}