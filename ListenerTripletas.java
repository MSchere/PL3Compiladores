import java.util.*;
import org.antlr.v4.runtime.tree.*;
import org.antlr.v4.runtime.atn.*;

public class ListenerTripletas extends GramJInsBaseListener {

    private ArrayList<String> sentencia = new ArrayList<String>();

    private ArrayList<ArrayList<String>> arrays = new ArrayList<ArrayList<String>>();

    public ArrayList<ArrayList<String>> getArray() {
        return arrays;
    }

    private void meteValor(String valor) {
        sentencia.add(valor);
    }

    private void meteArray(ArrayList<String> arr) {
        arrays.add(arr);
    }

    @Override
    public void visitTerminal(TerminalNode node) {
        switch (node.getSymbol().getType()) {
        case 10:
            meteValor(node.getText());
            break;
        
        case 12:
            String cadena = node.getText();
            cadena = cadena.substring(1, cadena.length()-1);
            meteValor(cadena);
            break;

        case 13:
            meteValor(node.getText());
            break;    
    }
}

    @Override
    public void exitTripleta(GramJInsParser.TripletaContext ctx) {
        ArrayList<String> aux = new ArrayList<String>(sentencia);
        meteArray(aux);
        sentencia.clear();
    }
}
