// Generated from GramJIns.g4 by ANTLR 4.7.2
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link GramJInsParser}.
 */
public interface GramJInsListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link GramJInsParser#prog}.
	 * @param ctx the parse tree
	 */
	void enterProg(GramJInsParser.ProgContext ctx);
	/**
	 * Exit a parse tree produced by {@link GramJInsParser#prog}.
	 * @param ctx the parse tree
	 */
	void exitProg(GramJInsParser.ProgContext ctx);
	/**
	 * Enter a parse tree produced by {@link GramJInsParser#linea}.
	 * @param ctx the parse tree
	 */
	void enterLinea(GramJInsParser.LineaContext ctx);
	/**
	 * Exit a parse tree produced by {@link GramJInsParser#linea}.
	 * @param ctx the parse tree
	 */
	void exitLinea(GramJInsParser.LineaContext ctx);
	/**
	 * Enter a parse tree produced by {@link GramJInsParser#tripleta}.
	 * @param ctx the parse tree
	 */
	void enterTripleta(GramJInsParser.TripletaContext ctx);
	/**
	 * Exit a parse tree produced by {@link GramJInsParser#tripleta}.
	 * @param ctx the parse tree
	 */
	void exitTripleta(GramJInsParser.TripletaContext ctx);
}