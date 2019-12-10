public class ManejoArchivos{

public void abrir(String ruta){
    File fichero = new File(((Cadena)registros[r]).getValor());
        if (!fichero.exists()) fichero.createNewFile();
        int fd = fichero.hashCode();
        registros[0] = new Int(fd);
        cambiar para tener un int como fd
}


    }
    //En el registro r1 estará el descriptorFichero y en r2 estará lo que se quiera escribir
    public void escribirFichero(int r1, int r2){
        FileOutputStream salida = new FileOutputStream(((Int)registros[r1]).getValor());
        byte[] texto = (((Cadena)registros[r2]).getValor()).getBytes();
		salida.write(texto);
        salida.flush();
        salida.close();
    }