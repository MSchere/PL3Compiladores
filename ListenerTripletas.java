import java.util.*;
import org.antlr.v4.runtime.tree.*;
import org.antlr.v4.runtime.atn.*;

public class ListenerTripletas extends GramJInsBaseListener {

    private ArrayList<Integer> sentencia = new ArrayList<Integer>();

    private ArrayList<ArrayList<Integer>> arrays = new ArrayList<ArrayList<Integer>>();

    public ArrayList<ArrayList<Integer>> getArray() {
        return arrays;
    }

    private void meteValor(int valor) {
        sentencia.add(valor);
    }

    private void meteArray(ArrayList<Integer> arr) {
        arrays.add(arr);
    }

    @Override
    public void visitTerminal(TerminalNode node) {
        switch (node.getSymbol().getType()) {
        case 9:
            meteValor(Integer.parseInt(node.getText()));
            System.out.println("mete número: " + node.getText());

            break;
        }

    }

    @Override
    public void exitLinea(GramJInsParser.LineaContext ctx) {
        System.out.println("exitLinea");
        ArrayList<Integer> aux = new ArrayList<Integer>(sentencia);
        meteArray(aux);
        sentencia.clear();
    }
}
