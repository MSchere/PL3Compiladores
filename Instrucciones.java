import java.util.ArrayList;
import java.io.File;
import java.io.FileDescriptor;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Instrucciones{

    private Entrada[] registros;
    private ArrayList<Entrada> pila;
    private Mv maquina;

    public Instrucciones(Mv maquina, Entrada[] registros, ArrayList<Entrada> pila){
        this.maquina = maquina;
        this.registros = registros;
        this.pila = pila;
    }

    //Manejo de registros y pila

    public void init(int nParams, int nSalidas){
        Control ini = new Control(nParams,nSalidas,maquina.getCprog(),pila.size());
        pila.add(ini);
        maquina.setCpila(pila.size()-1);
    }
    public void movRR(int pos1, int pos2){ //mov origen destino
        registros[pos2] = registros[pos1];
        }
    public void movRM(int pos1, int pos2){ //mov origen destino
        pila.set(maquina.getCpila()+pos2, registros[pos1]);
    }
    public void movMR(int pos1, int pos2){ //mov origen destino
        registros[pos2] = pila.get(maquina.getCpila()+pos1);
    }
    public void push(int nRegistro){
        pila.add(registros[nRegistro]);
    }
    public void store(int tipo, String valor){ //Almacena el valor en el registro 1
        switch(tipo){
            case 0:
                registros[1] = new Int(Integer.parseInt(valor));
                break;
            case 1:
                registros[1] = new TipoFloat(new Float(valor));
                break;
            case 2:
                registros[1] = new Cadena(valor);
                break;
            case 3:
                if(valor.equals("true")) registros[1] = new Bool(true);
                else registros[1] = new Bool(false);
        }
    }
    public void pop(){
        pila.remove(pila.size()-1);
    }
    public void jump(int desp){
        maquina.setCprog(desp);
    }
    public void end(){
        while(!pila.get(pila.size()-1).esControl()){
            System.out.println("He borrado");
            pop();
        }
        int nParams = ((Control)pila.get(maquina.getCpila())).getNParams();
        maquina.setCpila(((Control)pila.get(maquina.getCpila())).getCpila());
        maquina.setCprog(((Control)pila.get(maquina.getCpila())).getCprog());
        pop();
        for(int i=0;i<nParams;i++){
            pop();
        }
    }

    //Instrucciones básicas

    public void add(int r1, int r2){
        int tipo1 = ((Dato)registros[r1]).getTipo();
        int tipo2 = ((Dato)registros[r2]).getTipo();
        if((tipo1 == 0) && (tipo2 == 0)){
            registros[0] = new Int(((Int)registros[r1]).getValor()+((Int)registros[r2]).getValor());
        }
        else if((tipo1 == 0) && (tipo2 == 1)){
            registros[0] = new TipoFloat(((Int)registros[r1]).getValor()+((Float)registros[r2]).getValor());
        }
        else if((tipo1 == 1) && (tipo2 == 0)){
            registros[0] = new TipoFloat(((Float)registros[r1]).getValor()+((Int)registros[r2]).getValor());
        }
        else{
            registros[0] = new TipoFloat(((Float)registros[r1]).getValor()+((Float)registros[r2]).getValor());
        }
    }
    public void sub(int r1, int r2){
        int tipo1 = ((Dato)registros[r1]).getTipo();
        int tipo2 = ((Dato)registros[r2]).getTipo();
        if((tipo1 == 0) && (tipo2 == 0)){
            registros[0] = new Int(((Int)registros[r1]).getValor()-((Int)registros[r2]).getValor());
        }
        else if((tipo1 == 0) && (tipo2 == 1)){
            registros[0] = new TipoFloat(((Int)registros[r1]).getValor()-((Float)registros[r2]).getValor());
        }
        else if((tipo1 == 1) && (tipo2 == 0)){
            registros[0] = new TipoFloat(((Float)registros[r1]).getValor()-((Int)registros[r2]).getValor());
        }
        else{
            registros[0] = new TipoFloat(((Float)registros[r1]).getValor()-((Float)registros[r2]).getValor());
        }
    }
    public void mul(int r1, int r2){
        int tipo1 = ((Dato)registros[r1]).getTipo();
        int tipo2 = ((Dato)registros[r2]).getTipo();
        if((tipo1 == 0) && (tipo2 == 0)){
            registros[0] = new Int(((Int)registros[r1]).getValor()*((Int)registros[r2]).getValor());
        }
        else if((tipo1 == 0) && (tipo2 == 1)){
            registros[0] = new TipoFloat(((Int)registros[r1]).getValor()*((Float)registros[r2]).getValor());
        }
        else if((tipo1 == 1) && (tipo2 == 0)){
            registros[0] = new TipoFloat(((Float)registros[r1]).getValor()*((Int)registros[r2]).getValor());
        }
        else{
            registros[0] = new TipoFloat(((Float)registros[r1]).getValor()*((Float)registros[r2]).getValor());
        }
    }
    public void div(int r1, int r2){
        int tipo1 = ((Dato)registros[r1]).getTipo();
        int tipo2 = ((Dato)registros[r2]).getTipo();
        if((tipo1 == 0) && (tipo2 == 0)){
            registros[0] = new Int(((Int)registros[r1]).getValor()/((Int)registros[r2]).getValor());
        }
        else if((tipo1 == 0) && (tipo2 == 1)){
            registros[0] = new TipoFloat(((Int)registros[r1]).getValor()/((Float)registros[r2]).getValor());
        }
        else if((tipo1 == 1) && (tipo2 == 0)){
            registros[0] = new TipoFloat(((Float)registros[r1]).getValor()/((Int)registros[r2]).getValor());
        }
        else{
            registros[0] = new TipoFloat(((Float)registros[r1]).getValor()/((Float)registros[r2]).getValor());
        }
    }
    public void exp(int r1, int r2){
        int tipo1 = ((Dato)registros[r1]).getTipo();
        int tipo2 = ((Dato)registros[r2]).getTipo();
        if((tipo1 == 0) && (tipo2 == 0)){
            registros[0] = new Int((int)Math.pow(((Int)registros[r1]).getValor(),((Int)registros[r2]).getValor()));
        }
        else if((tipo1 == 0) && (tipo2 == 1)){
            registros[0] = new TipoFloat((float)Math.pow(((Int)registros[r1]).getValor(),((Float)registros[r2]).getValor()));
        }
        else if((tipo1 == 1) && (tipo2 == 0)){
            registros[0] = new TipoFloat((float)Math.pow(((Float)registros[r1]).getValor(),((Int)registros[r2]).getValor()));
        }
        else{
            registros[0] = new TipoFloat((float)Math.pow(((Float)registros[r1]).getValor(),((Float)registros[r2]).getValor()));
        }
    }
    public void sqrt(int r1){
        int tipo1 = ((Dato)registros[r1]).getTipo();
        if(tipo1 == 0){
            registros[0] = new Int((int)Math.sqrt(Double.parseDouble(Integer.toString(((Int)registros[r1]).getValor()))));
        }
        else{
            registros[0] = new TipoFloat((float)Math.sqrt(((Float)registros[r1]).getValor()));
        }
    }
    public void menq(int r1, int r2){
        int tipo1 = ((Dato)registros[r1]).getTipo();
        int tipo2 = ((Dato)registros[r2]).getTipo();
        if((tipo1 == 0) && (tipo2 == 0)){
            registros[0] = new Bool(((Int)registros[r1]).getValor()<((Int)registros[r2]).getValor());
        }
        else if((tipo1 == 0) && (tipo2 == 1)){
            registros[0] = new Bool(((Int)registros[r1]).getValor()<((Float)registros[r2]).getValor());
        }
        else if((tipo1 == 1) && (tipo2 == 0)){
            registros[0] = new Bool(((Float)registros[r1]).getValor()<((Int)registros[r2]).getValor());
        }
        else{
            registros[0] = new Bool(((Float)registros[r1]).getValor()<((Float)registros[r2]).getValor());
        }
    }
    public void mayq(int r1, int r2){
        int tipo1 = ((Dato)registros[r1]).getTipo();
        int tipo2 = ((Dato)registros[r2]).getTipo();
        if((tipo1 == 0) && (tipo2 == 0)){
            registros[0] = new Bool(((Int)registros[r1]).getValor()>((Int)registros[r2]).getValor());
        }
        else if((tipo1 == 0) && (tipo2 == 1)){
            registros[0] = new Bool(((Int)registros[r1]).getValor()>((Float)registros[r2]).getValor());
        }
        else if((tipo1 == 1) && (tipo2 == 0)){
            registros[0] = new Bool(((Float)registros[r1]).getValor()>((Int)registros[r2]).getValor());
        }
        else{
            registros[0] = new Bool(((Float)registros[r1]).getValor()>((Float)registros[r2]).getValor());
        }
    }
    public void igual(int r1, int r2){
        int tipo1 = ((Dato)registros[r1]).getTipo();
        int tipo2 = ((Dato)registros[r2]).getTipo();
        if((tipo1 == 0) && (tipo2 == 0)){
            registros[0] = new Bool(((Int)registros[r1]).getValor()==((Int)registros[r2]).getValor());
        }
        else if((tipo1 == 0) && (tipo2 == 1)){
            registros[0] = new Bool(((Int)registros[r1]).getValor()==((Float)registros[r2]).getValor());
        }
        else if((tipo1 == 1) && (tipo2 == 0)){
            registros[0] = new Bool(((Float)registros[r1]).getValor()==((Int)registros[r2]).getValor());
        }
        else{
            registros[0] = new Bool(((Float)registros[r1]).getValor()==((Float)registros[r2]).getValor());
        }
    }
    public void noIgual(int r1, int r2){
        int tipo1 = ((Dato)registros[r1]).getTipo();
        int tipo2 = ((Dato)registros[r2]).getTipo();
        if((tipo1 == 0) && (tipo2 == 0)){
            registros[0] = new Bool(((Int)registros[r1]).getValor()!=((Int)registros[r2]).getValor());
        }
        else if((tipo1 == 0) && (tipo2 == 1)){
            registros[0] = new Bool(((Int)registros[r1]).getValor()!=((Float)registros[r2]).getValor());
        }
        else if((tipo1 == 1) && (tipo2 == 0)){
            registros[0] = new Bool(((Float)registros[r1]).getValor()!=((Int)registros[r2]).getValor());
        }
        else{
            registros[0] = new Bool(((Float)registros[r1]).getValor()!=((Float)registros[r2]).getValor());
        }
    }
    public void difBit(int r1, int r2){ //<>
        int tipo1 = ((Dato)registros[r1]).getTipo();
        int tipo2 = ((Dato)registros[r2]).getTipo();
        if((tipo1 == 0) && (tipo2 == 0)){
            registros[0] = new Bool(((Int)registros[r1]).getValor()!=((Int)registros[r2]).getValor());
        }
        else if((tipo1 == 0) && (tipo2 == 1)){
            registros[0] = new Bool(((Int)registros[r1]).getValor()!=((Float)registros[r2]).getValor());
        }
        else if((tipo1 == 1) && (tipo2 == 0)){
            registros[0] = new Bool(((Float)registros[r1]).getValor()!=((Int)registros[r2]).getValor());
        }
        else{
            registros[0] = new Bool(((Float)registros[r1]).getValor()!=((Float)registros[r2]).getValor());
        }
    }
    public void andBit(int r1, int r2){
        registros[0] = new Int(((Int)registros[r1]).getValor()&((Int)registros[r2]).getValor());
    }
    public void orBit(int r1, int r2){
        registros[0] = new Int((((Int)registros[r1]).getValor()|((Int)registros[r2]).getValor()));
    }
    public void lShift(int r1, int r2){
        registros[0] = new Int(((Int)registros[r1]).getValor()<<((Int)registros[r2]).getValor());
    }
    public void rShift(int r1, int r2){
        registros[0] = new Int(((Int)registros[r1]).getValor()>>((Int)registros[r2]).getValor());
    }
    public void and(int r1, int r2){
        registros[0] = new Bool(((Bool)registros[r1]).getValor()&&((Bool)registros[r2]).getValor());
    }
    public void or(int r1, int r2){
        registros[0] = new Bool(((Bool)registros[r1]).getValor()||((Bool)registros[r2]).getValor());
    }
    //Imprime lo que haya en el registro r
    public void imprimir(int r){
        int tipo = ((Dato)registros[r]).getTipo();
        switch(tipo){
            case 0:
                System.out.println(((Int)registros[r]).getValor());
                break;
            case 1:
                System.out.println(((TipoFloat)registros[r]).getValor());
                break;
            case 2:
                System.out.println(((Cadena)registros[r]).getValor());
                break;
            case 3:
                System.out.println(((Bool)registros[r]).getValor());
                break;
        }
    }

    //Instrucciones de manejo de cadenas

    public void copiaCadena(int origen,int destino){
        ((Cadena)pila.get(destino)).setValor(((Cadena)pila.get(origen)).getValor());
    }
    public void concat(int r1, int r2){
        registros[0] = new Cadena(((Cadena)registros[r1]).getValor()+((Cadena)registros[r2]).getValor());
    }
    //La cadena afectada se debe encontrar en el registro 1
    public void extraerCad(int posIni,int posFin){
        String cadena = ((Cadena)registros[1]).getValor();
        registros[0] = new Cadena(cadena.substring(posIni, posFin));
    }
    public void getCharAtPos(int r, int pos){
        String cadena = ((Cadena)registros[r]).getValor();
        cadena = Character.toString(cadena.charAt(pos));
        registros[0] = new Cadena(cadena);
    }
    //La cadena afectada se debe encontrar en el registro 1 y la letra en el registro 2
    public void cambiaChar(int pos, int letra){
        String cadena = ((Cadena)registros[1]).getValor();
        char[] chars = cadena.toCharArray();
        chars[pos]= ((Cadena)registros[2]).getValor().charAt(0);
        cadena = String.valueOf(chars);
        registros[0] = new Cadena(cadena);
    }

    //Instrucciones de manejo de ficheros

    //En el registro r debe estar la ruta del fichero y deja en r0 el descriptor
    public void abrirFichero(int r){
        File fichero = new File(((Cadena)registros[r]).getValor());
        if (!fichero.exists()) fichero.createNewFile();
        int fd = fichero.hashCode();
        registros[0] = new Int(fd);
    }
    //En el registro r1 estará el descriptorFichero y en r2 estará lo que se quiera escribir
    public void escribirFichero(int r1, int r2){
        FileOutputStream salida = new FileOutputStream(((Int)registros[r1]).getValor());
        byte[] texto = (((Cadena)registros[r2]).getValor()).getBytes();
		salida.write(texto);
        salida.flush();
		salida.close();
    }
    //En el registro r estará el descriptor del archivo a cerrar
    public void cerrarFichero(int r){

    }
}