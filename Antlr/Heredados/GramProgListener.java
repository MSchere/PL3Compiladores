// Generated from GramProg.g4 by ANTLR 4.7.2
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link GramProgParser}.
 */
public interface GramProgListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link GramProgParser#prog}.
	 * @param ctx the parse tree
	 */
	void enterProg(GramProgParser.ProgContext ctx);
	/**
	 * Exit a parse tree produced by {@link GramProgParser#prog}.
	 * @param ctx the parse tree
	 */
	void exitProg(GramProgParser.ProgContext ctx);
	/**
	 * Enter a parse tree produced by {@link GramProgParser#llamadaFuncion}.
	 * @param ctx the parse tree
	 */
	void enterLlamadaFuncion(GramProgParser.LlamadaFuncionContext ctx);
	/**
	 * Exit a parse tree produced by {@link GramProgParser#llamadaFuncion}.
	 * @param ctx the parse tree
	 */
	void exitLlamadaFuncion(GramProgParser.LlamadaFuncionContext ctx);
	/**
	 * Enter a parse tree produced by {@link GramProgParser#definicionFuncion}.
	 * @param ctx the parse tree
	 */
	void enterDefinicionFuncion(GramProgParser.DefinicionFuncionContext ctx);
	/**
	 * Exit a parse tree produced by {@link GramProgParser#definicionFuncion}.
	 * @param ctx the parse tree
	 */
	void exitDefinicionFuncion(GramProgParser.DefinicionFuncionContext ctx);
	/**
	 * Enter a parse tree produced by {@link GramProgParser#whileEx}.
	 * @param ctx the parse tree
	 */
	void enterWhileEx(GramProgParser.WhileExContext ctx);
	/**
	 * Exit a parse tree produced by {@link GramProgParser#whileEx}.
	 * @param ctx the parse tree
	 */
	void exitWhileEx(GramProgParser.WhileExContext ctx);
	/**
	 * Enter a parse tree produced by {@link GramProgParser#ifEx}.
	 * @param ctx the parse tree
	 */
	void enterIfEx(GramProgParser.IfExContext ctx);
	/**
	 * Exit a parse tree produced by {@link GramProgParser#ifEx}.
	 * @param ctx the parse tree
	 */
	void exitIfEx(GramProgParser.IfExContext ctx);
	/**
	 * Enter a parse tree produced by {@link GramProgParser#forEx}.
	 * @param ctx the parse tree
	 */
	void enterForEx(GramProgParser.ForExContext ctx);
	/**
	 * Exit a parse tree produced by {@link GramProgParser#forEx}.
	 * @param ctx the parse tree
	 */
	void exitForEx(GramProgParser.ForExContext ctx);
	/**
	 * Enter a parse tree produced by {@link GramProgParser#asignacion}.
	 * @param ctx the parse tree
	 */
	void enterAsignacion(GramProgParser.AsignacionContext ctx);
	/**
	 * Exit a parse tree produced by {@link GramProgParser#asignacion}.
	 * @param ctx the parse tree
	 */
	void exitAsignacion(GramProgParser.AsignacionContext ctx);
	/**
	 * Enter a parse tree produced by {@link GramProgParser#asignacionEnFuncion}.
	 * @param ctx the parse tree
	 */
	void enterAsignacionEnFuncion(GramProgParser.AsignacionEnFuncionContext ctx);
	/**
	 * Exit a parse tree produced by {@link GramProgParser#asignacionEnFuncion}.
	 * @param ctx the parse tree
	 */
	void exitAsignacionEnFuncion(GramProgParser.AsignacionEnFuncionContext ctx);
	/**
	 * Enter a parse tree produced by {@link GramProgParser#include}.
	 * @param ctx the parse tree
	 */
	void enterInclude(GramProgParser.IncludeContext ctx);
	/**
	 * Exit a parse tree produced by {@link GramProgParser#include}.
	 * @param ctx the parse tree
	 */
	void exitInclude(GramProgParser.IncludeContext ctx);
	/**
	 * Enter a parse tree produced by {@link GramProgParser#bool}.
	 * @param ctx the parse tree
	 */
	void enterBool(GramProgParser.BoolContext ctx);
	/**
	 * Exit a parse tree produced by {@link GramProgParser#bool}.
	 * @param ctx the parse tree
	 */
	void exitBool(GramProgParser.BoolContext ctx);
	/**
	 * Enter a parse tree produced by the {@code eexpr}
	 * labeled alternative in {@link GramProgParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterEexpr(GramProgParser.EexprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code eexpr}
	 * labeled alternative in {@link GramProgParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitEexpr(GramProgParser.EexprContext ctx);
	/**
	 * Enter a parse tree produced by {@link GramProgParser#expr2}.
	 * @param ctx the parse tree
	 */
	void enterExpr2(GramProgParser.Expr2Context ctx);
	/**
	 * Exit a parse tree produced by {@link GramProgParser#expr2}.
	 * @param ctx the parse tree
	 */
	void exitExpr2(GramProgParser.Expr2Context ctx);
	/**
	 * Enter a parse tree produced by the {@code caadena}
	 * labeled alternative in {@link GramProgParser#cadena}.
	 * @param ctx the parse tree
	 */
	void enterCaadena(GramProgParser.CaadenaContext ctx);
	/**
	 * Exit a parse tree produced by the {@code caadena}
	 * labeled alternative in {@link GramProgParser#cadena}.
	 * @param ctx the parse tree
	 */
	void exitCaadena(GramProgParser.CaadenaContext ctx);
	/**
	 * Enter a parse tree produced by {@link GramProgParser#cadena2}.
	 * @param ctx the parse tree
	 */
	void enterCadena2(GramProgParser.Cadena2Context ctx);
	/**
	 * Exit a parse tree produced by {@link GramProgParser#cadena2}.
	 * @param ctx the parse tree
	 */
	void exitCadena2(GramProgParser.Cadena2Context ctx);
	/**
	 * Enter a parse tree produced by {@link GramProgParser#returnEx}.
	 * @param ctx the parse tree
	 */
	void enterReturnEx(GramProgParser.ReturnExContext ctx);
	/**
	 * Exit a parse tree produced by {@link GramProgParser#returnEx}.
	 * @param ctx the parse tree
	 */
	void exitReturnEx(GramProgParser.ReturnExContext ctx);
	/**
	 * Enter a parse tree produced by {@link GramProgParser#tipodatoid}.
	 * @param ctx the parse tree
	 */
	void enterTipodatoid(GramProgParser.TipodatoidContext ctx);
	/**
	 * Exit a parse tree produced by {@link GramProgParser#tipodatoid}.
	 * @param ctx the parse tree
	 */
	void exitTipodatoid(GramProgParser.TipodatoidContext ctx);
	/**
	 * Enter a parse tree produced by {@link GramProgParser#comparador}.
	 * @param ctx the parse tree
	 */
	void enterComparador(GramProgParser.ComparadorContext ctx);
	/**
	 * Exit a parse tree produced by {@link GramProgParser#comparador}.
	 * @param ctx the parse tree
	 */
	void exitComparador(GramProgParser.ComparadorContext ctx);
	/**
	 * Enter a parse tree produced by {@link GramProgParser#numero}.
	 * @param ctx the parse tree
	 */
	void enterNumero(GramProgParser.NumeroContext ctx);
	/**
	 * Exit a parse tree produced by {@link GramProgParser#numero}.
	 * @param ctx the parse tree
	 */
	void exitNumero(GramProgParser.NumeroContext ctx);
}