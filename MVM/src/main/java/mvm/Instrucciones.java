package mvm;

import java.util.ArrayList;

public class Instrucciones{

    private Entrada[] registros;
    private ArrayList<Entrada> pila;
    private Inter prueba;

    public Instrucciones(Inter prueba, Entrada[] registros, ArrayList<Entrada> pila){
        this.prueba = prueba;
        this.registros = registros;
        this.pila = pila;
    }

    public void init(int nParams, int nSalidas){
        Control ini = new Control(nParams,nSalidas,prueba.getCprog(),pila.size());
        pila.add(ini);
        prueba.setCpila(pila.size()-1);
    }
    public void jmp(int desp){
        prueba.setCprog(prueba.getCprog()+desp);
    }
    public void movRR(int pos1, int pos2){ //mov origen destino
        registros[pos2] = registros[pos1];
        }
    public void movRM(int pos1, int pos2){ //mov origen destino
        pila.set(prueba.getCpila()+pos2, registros[pos1]);
    }
    public void movMR(int pos1, int pos2){ //mov origen destino
        registros[pos2] = pila.get(prueba.getCpila()+pos1);
    }
    public void push(int num){
        pila.add(new Int(num));
    }
    public void push(double num){
        pila.add(new Float(num));
    }
    public void push(boolean bol){
        pila.add(new Bool(bol));
    }
    public void push(String cadena){
        pila.add(new Cadena(cadena));
    }
    public void pop(){
        pila.remove(pila.size()-1);
    }
    public void end(){
        while(!pila.get(pila.size()-1).esControl()){
            pop();
        }
        int nParams = ((Control)pila.get(prueba.getCpila())).getNParams();
        prueba.setCpila(((Control)pila.get(prueba.getCpila())).getCpila());
        prueba.setCprog(((Control)pila.get(prueba.getCpila())).getCprog());
        pop();
        for(int i=0;i<nParams;i++){
            pop();
        }
    }
    public void add(int r1, int r2){
        int tipo1 = ((Dato)registros[r1]).getTipo();
        int tipo2 = ((Dato)registros[r2]).getTipo();
        if((tipo1 == 0) && (tipo2 == 0)){
            registros[0] = new Int(((Int)registros[r1]).getValor()+((Int)registros[r2]).getValor());
        }
        else if((tipo1 == 0) && (tipo2 == 1)){
            registros[0] = new Float(((Int)registros[r1]).getValor()+((Float)registros[r2]).getValor());
        }
        else if((tipo1 == 1) && (tipo2 == 0)){
            registros[0] = new Float(((Float)registros[r1]).getValor()+((Int)registros[r2]).getValor());
        }
        else{
            registros[0] = new Float(((Float)registros[r1]).getValor()+((Float)registros[r2]).getValor());
        }
    }
    public void sub(int r1, int r2){
        int tipo1 = ((Dato)registros[r1]).getTipo();
        int tipo2 = ((Dato)registros[r2]).getTipo();
        if((tipo1 == 0) && (tipo2 == 0)){
            registros[0] = new Int(((Int)registros[r1]).getValor()-((Int)registros[r2]).getValor());
        }
        else if((tipo1 == 0) && (tipo2 == 1)){
            registros[0] = new Float(((Int)registros[r1]).getValor()-((Float)registros[r2]).getValor());
        }
        else if((tipo1 == 1) && (tipo2 == 0)){
            registros[0] = new Float(((Float)registros[r1]).getValor()-((Int)registros[r2]).getValor());
        }
        else{
            registros[0] = new Float(((Float)registros[r1]).getValor()-((Float)registros[r2]).getValor());
        }
    }
    public void mul(int r1, int r2){
        int tipo1 = ((Dato)registros[r1]).getTipo();
        int tipo2 = ((Dato)registros[r2]).getTipo();
        if((tipo1 == 0) && (tipo2 == 0)){
            registros[0] = new Int(((Int)registros[r1]).getValor()*((Int)registros[r2]).getValor());
        }
        else if((tipo1 == 0) && (tipo2 == 1)){
            registros[0] = new Float(((Int)registros[r1]).getValor()*((Float)registros[r2]).getValor());
        }
        else if((tipo1 == 1) && (tipo2 == 0)){
            registros[0] = new Float(((Float)registros[r1]).getValor()*((Int)registros[r2]).getValor());
        }
        else{
            registros[0] = new Float(((Float)registros[r1]).getValor()*((Float)registros[r2]).getValor());
        }
    }
    public void div(int r1, int r2){
        int tipo1 = ((Dato)registros[r1]).getTipo();
        int tipo2 = ((Dato)registros[r2]).getTipo();
        if((tipo1 == 0) && (tipo2 == 0)){
            registros[0] = new Int(((Int)registros[r1]).getValor()/((Int)registros[r2]).getValor());
        }
        else if((tipo1 == 0) && (tipo2 == 1)){
            registros[0] = new Float(((Int)registros[r1]).getValor()/((Float)registros[r2]).getValor());
        }
        else if((tipo1 == 1) && (tipo2 == 0)){
            registros[0] = new Float(((Float)registros[r1]).getValor()/((Int)registros[r2]).getValor());
        }
        else{
            registros[0] = new Float(((Float)registros[r1]).getValor()/((Float)registros[r2]).getValor());
        }
    }
    public void exp(int r1, int r2){
        int tipo1 = ((Dato)registros[r1]).getTipo();
        int tipo2 = ((Dato)registros[r2]).getTipo();
        if((tipo1 == 0) && (tipo2 == 0)){
            registros[0] = new Int((int)Math.pow(((Int)registros[r1]).getValor(),((Int)registros[r2]).getValor()));
        }
        else if((tipo1 == 0) && (tipo2 == 1)){
            registros[0] = new Float((float)Math.pow(((Int)registros[r1]).getValor(),((Float)registros[r2]).getValor()));
        }
        else if((tipo1 == 1) && (tipo2 == 0)){
            registros[0] = new Float((float)Math.pow(((Float)registros[r1]).getValor(),((Int)registros[r2]).getValor()));
        }
        else{
            registros[0] = new Float((float)Math.pow(((Float)registros[r1]).getValor(),((Float)registros[r2]).getValor()));
        }
    }
    public void sqrt(int r1){
        int tipo1 = ((Dato)registros[r1]).getTipo();
        if(tipo1 == 0){
            registros[0] = new Int((int)Math.sqrt(Double.parseDouble(Integer.toString(((Int)registros[r1]).getValor()))));
        }
        else{
            registros[0] = new Float((float)Math.sqrt(((Float)registros[r1]).getValor()));
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
    //La cadena afectada se debe encontrar en el registro 1
    public void cambiaChar(int pos, char letra){
        String cadena = ((Cadena)registros[1]).getValor();
        char[] chars = cadena.toCharArray();
        chars[pos]=letra;
        cadena = String.valueOf(chars);
        registros[0] = new Cadena(cadena);
    }
}