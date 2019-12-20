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
        if (!fichero.exists())fichero.createNewFile();
        salida = new FileOutputStream(fichero,true);
        entrada = new FileInputStream(fichero);
        fd = fichero.hashCode();
        }
        catch(Exception e){}
        return fd;
    }

    public void escribir(String cadena){
        try{
            cadena=cadena+"\n";
            byte[] texto = cadena.getBytes();
		    salida.write(texto);
            salida.flush();
        }
        catch(Exception e){}
    }

    public String leer(){
        String cadena = "";
        try{
            
            int i=0;    
            while((i=entrada.read())!=-1)
            
                cadena = cadena + (char)i;
                
        }catch(Exception e){}
        return cadena;
    }

    public void cerrar(){
        try {
            entrada.close();
            salida.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        
    }
}