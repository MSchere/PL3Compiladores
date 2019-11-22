import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;
import java.util.*;
import java.io.*;

public class GramProgMiListener extends GramProgBaseListener {

    ArrayList<String> arbol = new ArrayList<>();
    ArrayList<String> ruta = new ArrayList<>();

    @Override
    public void enterEveryRule(ParserRuleContext ctx) {
        if (!GramProgParser.ruleNames[ctx.getRuleIndex()].equals("prog")) {
            ruta.add(GramProgParser.ruleNames[ctx.getRuleIndex()]);
            String s = "";
            for (int i = 0; i < ruta.size(); i++) {
                s += "/" + ruta.get(i);
            }
            arbol.add(s);
        } else {
            ruta.add("");
        }

    }

    @Override
    public void exitEveryRule(ParserRuleContext ctx) {
        ruta.remove(ruta.size() - 1);
    }

    @Override
    public void visitTerminal(TerminalNode node) {
        ruta.add(node.getText());

        String s = "";
        for (int i = 0; i < ruta.size(); i++) {
            s += "/" + ruta.get(i);
        }
        arbol.add(s);
        ruta.remove(ruta.size() - 1);
    }

    @Override
    public void visitErrorNode(ErrorNode node) {
        ruta.add(node.getText());
        String s = "";
        for (int i = 0; i < ruta.size(); i++) {
            s += "/" + ruta.get(i);
        }
        arbol.add(s+" <--ERROR");
        ruta.remove(ruta.size() - 1);
    }
}