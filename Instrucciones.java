import java.util.ArrayList;
import java.util.HashMap;

public class Instrucciones{

    private Entrada[] registros;
    private ArrayList<Entrada> pila;
    private Mv maquina;
    private int rcmp;

    private HashMap<Integer,ManejoArchivos> archivos = new HashMap<Integer,ManejoArchivos>();

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
    public void push(int tipo, String valor){
        switch(tipo){
            case 0:
            pila.add(new Int(Integer.parseInt(valor)));
                break;
            case 1:
            pila.add(new TipoFloat(new Float(valor)));
                break;
            case 2:
            pila.add(new Cadena(valor));
                break;
            case 3:
            if(valor.equals("true")) pila.add(new Bool(true));
                else pila.add(new Bool(false));
        }
    }
    public void put(int tipo, String valor){ //Almacena el valor en el registro 1
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
    public void store(int r, int desp){
        pila.set(desp,registros[r]);
    }
    public void pop(){
        pila.remove(pila.size()-1);
    }
    public void cmp(int r1, int r2){
        int a = (int)((TipoFloat) registros[r1]).getValor();
        int b = (int)((TipoFloat) registros[r2]).getValor();
        if(a>b){ rcmp = 1;}
        else if(a<b){ rcmp = -1;}
        else{ rcmp = 0;}
    }
    public void jump(int desp){
        maquina.setCprog(desp);
    }
    public void jmpgt(int desp){
        if(rcmp == 1) maquina.setCprog(desp);
    }
    public void jmplt(int desp){
        if(rcmp == -1) maquina.setCprog(desp);
    }
    public void jmpeq(int desp){
        if(rcmp == 0) maquina.setCprog(desp);
    }
    public void end(){
        while(!pila.get(pila.size()-1).esControl()){
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
            registros[0] = new TipoFloat(((Int)registros[r1]).getValor()+((TipoFloat)registros[r2]).getValor());
        }
        else if((tipo1 == 1) && (tipo2 == 0)){
            registros[0] = new TipoFloat(((TipoFloat)registros[r1]).getValor()+((Int)registros[r2]).getValor());
        }
        else{
            registros[0] = new TipoFloat(((TipoFloat)registros[r1]).getValor()+((TipoFloat)registros[r2]).getValor());
        }
    }
    public void sub(int r1, int r2){
        int tipo1 = ((Dato)registros[r1]).getTipo();
        int tipo2 = ((Dato)registros[r2]).getTipo();
        if((tipo1 == 0) && (tipo2 == 0)){
            registros[0] = new Int(((Int)registros[r1]).getValor()-((Int)registros[r2]).getValor());
        }
        else if((tipo1 == 0) && (tipo2 == 1)){
            registros[0] = new TipoFloat(((Int)registros[r1]).getValor()-((TipoFloat)registros[r2]).getValor());
        }
        else if((tipo1 == 1) && (tipo2 == 0)){
            registros[0] = new TipoFloat(((TipoFloat)registros[r1]).getValor()-((Int)registros[r2]).getValor());
        }
        else{
            registros[0] = new TipoFloat(((TipoFloat)registros[r1]).getValor()-((TipoFloat)registros[r2]).getValor());
        }
    }
    public void mul(int r1, int r2){
        int tipo1 = ((Dato)registros[r1]).getTipo();
        int tipo2 = ((Dato)registros[r2]).getTipo();
        if((tipo1 == 0) && (tipo2 == 0)){
            registros[0] = new Int(((Int)registros[r1]).getValor()*((Int)registros[r2]).getValor());
        }
        else if((tipo1 == 0) && (tipo2 == 1)){
            registros[0] = new TipoFloat(((Int)registros[r1]).getValor()*((TipoFloat)registros[r2]).getValor());
        }
        else if((tipo1 == 1) && (tipo2 == 0)){
            registros[0] = new TipoFloat(((TipoFloat)registros[r1]).getValor()*((Int)registros[r2]).getValor());
        }
        else{
            registros[0] = new TipoFloat(((TipoFloat)registros[r1]).getValor()*((TipoFloat)registros[r2]).getValor());
        }
    }
    public void div(int r1, int r2){
        int tipo1 = ((Dato)registros[r1]).getTipo();
        int tipo2 = ((Dato)registros[r2]).getTipo();
        if((tipo1 == 0) && (tipo2 == 0)){
            registros[0] = new Int(((Int)registros[r1]).getValor()/((Int)registros[r2]).getValor());
        }
        else if((tipo1 == 0) && (tipo2 == 1)){
            registros[0] = new TipoFloat(((Int)registros[r1]).getValor()/((TipoFloat)registros[r2]).getValor());
        }
        else if((tipo1 == 1) && (tipo2 == 0)){
            registros[0] = new TipoFloat(((TipoFloat)registros[r1]).getValor()/((Int)registros[r2]).getValor());
        }
        else{
            registros[0] = new TipoFloat(((TipoFloat)registros[r1]).getValor()/((TipoFloat)registros[r2]).getValor());
        }
    }
    public void exp(int r1, int r2){
        int tipo1 = ((Dato)registros[r1]).getTipo();
        int tipo2 = ((Dato)registros[r2]).getTipo();
        if((tipo1 == 0) && (tipo2 == 0)){
            registros[0] = new Int((int)Math.pow(((Int)registros[r1]).getValor(),((Int)registros[r2]).getValor()));
        }
        else if((tipo1 == 0) && (tipo2 == 1)){
            registros[0] = new TipoFloat((float)Math.pow(((Int)registros[r1]).getValor(),((TipoFloat)registros[r2]).getValor()));
        }
        else if((tipo1 == 1) && (tipo2 == 0)){
            registros[0] = new TipoFloat((float)Math.pow(((TipoFloat)registros[r1]).getValor(),((Int)registros[r2]).getValor()));
        }
        else{
            registros[0] = new TipoFloat((float)Math.pow(((TipoFloat)registros[r1]).getValor(),((TipoFloat)registros[r2]).getValor()));
        }
    }
    public void sqrt(int r1){
        int tipo1 = ((Dato)registros[r1]).getTipo();
        if(tipo1 == 0){
            registros[0] = new Int((int)Math.sqrt(Double.parseDouble(Integer.toString(((Int)registros[r1]).getValor()))));
        }
        else{
            registros[0] = new TipoFloat((float)Math.sqrt(((TipoFloat)registros[r1]).getValor()));
        }
    }
    public void menq(int r1, int r2){
        int tipo1 = ((Dato)registros[r1]).getTipo();
        int tipo2 = ((Dato)registros[r2]).getTipo();
        if((tipo1 == 0) && (tipo2 == 0)){
            registros[0] = new Bool(((Int)registros[r1]).getValor()<((Int)registros[r2]).getValor());
        }
        else if((tipo1 == 0) && (tipo2 == 1)){
            registros[0] = new Bool(((Int)registros[r1]).getValor()<((TipoFloat)registros[r2]).getValor());
        }
        else if((tipo1 == 1) && (tipo2 == 0)){
            registros[0] = new Bool(((TipoFloat)registros[r1]).getValor()<((Int)registros[r2]).getValor());
        }
        else{
            registros[0] = new Bool(((TipoFloat)registros[r1]).getValor()<((TipoFloat)registros[r2]).getValor());
        }
    }
    public void mayq(int r1, int r2){
        int tipo1 = ((Dato)registros[r1]).getTipo();
        int tipo2 = ((Dato)registros[r2]).getTipo();
        if((tipo1 == 0) && (tipo2 == 0)){
            registros[0] = new Bool(((Int)registros[r1]).getValor()>((Int)registros[r2]).getValor());
        }
        else if((tipo1 == 0) && (tipo2 == 1)){
            registros[0] = new Bool(((Int)registros[r1]).getValor()>((TipoFloat)registros[r2]).getValor());
        }
        else if((tipo1 == 1) && (tipo2 == 0)){
            registros[0] = new Bool(((TipoFloat)registros[r1]).getValor()>((Int)registros[r2]).getValor());
        }
        else{
            registros[0] = new Bool(((TipoFloat)registros[r1]).getValor()>((TipoFloat)registros[r2]).getValor());
        }
    }
    public void igual(int r1, int r2){
        int tipo1 = ((Dato)registros[r1]).getTipo();
        int tipo2 = ((Dato)registros[r2]).getTipo();
        if((tipo1 == 0) && (tipo2 == 0)){
            registros[0] = new Bool(((Int)registros[r1]).getValor()==((Int)registros[r2]).getValor());
        }
        else if((tipo1 == 0) && (tipo2 == 1)){
            registros[0] = new Bool(((Int)registros[r1]).getValor()==((TipoFloat)registros[r2]).getValor());
        }
        else if((tipo1 == 1) && (tipo2 == 0)){
            registros[0] = new Bool(((TipoFloat)registros[r1]).getValor()==((Int)registros[r2]).getValor());
        }
        else{
            registros[0] = new Bool(((TipoFloat)registros[r1]).getValor()==((TipoFloat)registros[r2]).getValor());
        }
    }
    public void noIgual(int r1, int r2){
        int tipo1 = ((Dato)registros[r1]).getTipo();
        int tipo2 = ((Dato)registros[r2]).getTipo();
        if((tipo1 == 0) && (tipo2 == 0)){
            registros[0] = new Bool(((Int)registros[r1]).getValor()!=((Int)registros[r2]).getValor());
        }
        else if((tipo1 == 0) && (tipo2 == 1)){
            registros[0] = new Bool(((Int)registros[r1]).getValor()!=((TipoFloat)registros[r2]).getValor());
        }
        else if((tipo1 == 1) && (tipo2 == 0)){
            registros[0] = new Bool(((TipoFloat)registros[r1]).getValor()!=((Int)registros[r2]).getValor());
        }
        else{
            registros[0] = new Bool(((TipoFloat)registros[r1]).getValor()!=((TipoFloat)registros[r2]).getValor());
        }
    }
    public void difBit(int r1, int r2){ //<>
        int tipo1 = ((Dato)registros[r1]).getTipo();
        int tipo2 = ((Dato)registros[r2]).getTipo();
        if((tipo1 == 0) && (tipo2 == 0)){
            registros[0] = new Bool(((Int)registros[r1]).getValor()!=((Int)registros[r2]).getValor());
        }
        else if((tipo1 == 0) && (tipo2 == 1)){
            registros[0] = new Bool(((Int)registros[r1]).getValor()!=((TipoFloat)registros[r2]).getValor());
        }
        else if((tipo1 == 1) && (tipo2 == 0)){
            registros[0] = new Bool(((TipoFloat)registros[r1]).getValor()!=((Int)registros[r2]).getValor());
        }
        else{
            registros[0] = new Bool(((TipoFloat)registros[r1]).getValor()!=((TipoFloat)registros[r2]).getValor());
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

    //La cadena a medir está en el registro r
    public void cadenaLongitud(int r){
        String cadena = ((Cadena)registros[r]).getValor();
        registros[0] = new Int(cadena.length());
    }
    //r1 contiene la cadena original y r2 la cadena a buscar, guarda la posición en r0
    public void cadenaDonde(int r1,int r2){
        String cadena = ((Cadena)registros[r1]).getValor();
        String subcadena = ((Cadena)registros[r2]).getValor();
        int pos = cadena.indexOf(subcadena);
        registros[0] = new Int(pos);
    }
    //Las cadenas se encontrarán en r1 y r2
    public void concat(int r1, int r2){
        registros[0] = new Cadena(((Cadena)registros[r1]).getValor()+((Cadena)registros[r2]).getValor());
    }
    //La cadena afectada se debe encontrar en el registro 1
    public void extraerCad(int posIni,int posFin){
        String cadena = ((Cadena)registros[1]).getValor();
        registros[0] = new Cadena(cadena.substring(posIni, posFin));
    }
    //En r se encuentra la cadena a la que hay que quitarle los espacios
    public void sinEspacios(int r){
        String cadena = ((Cadena)registros[r]).getValor();
        cadena.trim();
        registros[0] = new Cadena(cadena);
    }
    //La cadena afectada se encuentra en registros[1], la subcadena afectada en r1 y la subcadena nueva en r2
    public void sustituir(int r1, int r2){
        String cadena = ((Cadena)registros[1]).getValor();
        String vieja = ((Cadena)registros[r1]).getValor();
        String nueva = ((Cadena)registros[r2]).getValor();
        cadena.replaceAll(vieja, nueva);
        registros[0] = new Cadena(cadena);
    }
    //La cadena a cortar se encuentra en el registro r
    public void cadenaI(int r, int pos){
        String cadena = ((Cadena)registros[r]).getValor();
        cadena = cadena.substring(0,pos);
        registros[0] = new Cadena(cadena);
    }
    //La cadena a cortar se encuentra en el registro r
    public void cadenaD(int r, int pos){
        String cadena = ((Cadena)registros[r]).getValor();
        cadena = cadena.substring(pos,cadena.length());
        registros[0] = new Cadena(cadena);
    }
    //La cadena a cortar se encuentra en el registro 1
    public void cadenaDentro(int pos, int tam){
        String cadena = ((Cadena)registros[1]).getValor();
        cadena = cadena.substring(pos+1,cadena.length());
        cadena = cadena.substring(0, tam);
        registros[0] = new Cadena(cadena);
    }

    //Instrucciones de manejo de ficheros

    //En el registro r debe estar la ruta del fichero y deja en r0 el descriptor
    public void abrirFichero(int r){
        ManejoArchivos m = new ManejoArchivos();
        int fd = m.abrir(((Cadena)registros[r]).getValor());
        archivos.put(fd,m);
        registros[0] = new Int(fd);
    }
    //En el registro r1 estará el descriptorFichero y en r2 estará lo que se quiera escribir
    public void escribirFichero(int r1, int r2){
        archivos.get(((Int)registros[r1]).getValor()).escribir(((Cadena)registros[r2]).getValor());
    }
    //En el registro r estará el descriptorFichero
    public void leerFichero(int r){
        String texto = archivos.get(((Int)registros[r]).getValor()).leer();
        registros[0] = new Cadena(texto);
    }
    //En el registro r estará el descriptor del archivo a cerrar
    public void cerrarFichero(int r){
        archivos.get(((Int)registros[r]).getValor()).cerrar();
        archivos.remove(((Int)registros[r]).getValor());
    }

    
}