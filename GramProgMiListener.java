import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;
import java.util.*;
import java.io.*;

public class GramProgMiListener extends GramProgBaseListener {

    ArrayList<String> arbol = new ArrayList<>();

    @Override
    public void enterEveryRule(ParserRuleContext ctx) {
        arbol.add(GramProgParser.ruleNames[ctx.getRuleIndex()]);
    }

    @Override
    public void visitTerminal(TerminalNode node) {
        arbol.add(node.getText());
    }
}