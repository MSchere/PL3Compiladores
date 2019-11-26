public class Control extends Entrada{
    private final int nParams;
    private final int nSalidas;
    private final int cprog;
    private final int cpila;

    public Control(int nParams, int nSalidas, int cprog, int cpila){
        super(1);
        this.nParams = nParams;
        this.nSalidas = nSalidas;
        this.cprog = cprog;
        this.cpila = cpila;
    }

    public int getNParams(){return nParams;}
    public int getNSalidas(){return nSalidas;}
    public int getCprog(){return cprog;}
    public int getCpila(){return cpila;}
}