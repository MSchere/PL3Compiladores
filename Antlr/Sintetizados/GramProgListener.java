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
	 * Enter a parse tree produced by {@link GramProgParser#var}.
	 * @param ctx the parse tree
	 */
	void enterVar(GramProgParser.VarContext ctx);
	/**
	 * Exit a parse tree produced by {@link GramProgParser#var}.
	 * @param ctx the parse tree
	 */
	void exitVar(GramProgParser.VarContext ctx);
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
	 * Enter a parse tree produced by {@link GramProgParser#valor}.
	 * @param ctx the parse tree
	 */
	void enterValor(GramProgParser.ValorContext ctx);
	/**
	 * Exit a parse tree produced by {@link GramProgParser#valor}.
	 * @param ctx the parse tree
	 */
	void exitValor(GramProgParser.ValorContext ctx);
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
	 * Enter a parse tree produced by {@link GramProgParser#tipoRetorno}.
	 * @param ctx the parse tree
	 */
	void enterTipoRetorno(GramProgParser.TipoRetornoContext ctx);
	/**
	 * Exit a parse tree produced by {@link GramProgParser#tipoRetorno}.
	 * @param ctx the parse tree
	 */
	void exitTipoRetorno(GramProgParser.TipoRetornoContext ctx);
	/**
	 * Enter a parse tree produced by {@link GramProgParser#parametros}.
	 * @param ctx the parse tree
	 */
	void enterParametros(GramProgParser.ParametrosContext ctx);
	/**
	 * Exit a parse tree produced by {@link GramProgParser#parametros}.
	 * @param ctx the parse tree
	 */
	void exitParametros(GramProgParser.ParametrosContext ctx);
	/**
	 * Enter a parse tree produced by {@link GramProgParser#nombreFuncion}.
	 * @param ctx the parse tree
	 */
	void enterNombreFuncion(GramProgParser.NombreFuncionContext ctx);
	/**
	 * Exit a parse tree produced by {@link GramProgParser#nombreFuncion}.
	 * @param ctx the parse tree
	 */
	void exitNombreFuncion(GramProgParser.NombreFuncionContext ctx);
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
	 * Enter a parse tree produced by {@link GramProgParser#ifBloque}.
	 * @param ctx the parse tree
	 */
	void enterIfBloque(GramProgParser.IfBloqueContext ctx);
	/**
	 * Exit a parse tree produced by {@link GramProgParser#ifBloque}.
	 * @param ctx the parse tree
	 */
	void exitIfBloque(GramProgParser.IfBloqueContext ctx);
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
	 * Enter a parse tree produced by {@link GramProgParser#elseEx}.
	 * @param ctx the parse tree
	 */
	void enterElseEx(GramProgParser.ElseExContext ctx);
	/**
	 * Exit a parse tree produced by {@link GramProgParser#elseEx}.
	 * @param ctx the parse tree
	 */
	void exitElseEx(GramProgParser.ElseExContext ctx);
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
	 * Enter a parse tree produced by {@link GramProgParser#condicion}.
	 * @param ctx the parse tree
	 */
	void enterCondicion(GramProgParser.CondicionContext ctx);
	/**
	 * Exit a parse tree produced by {@link GramProgParser#condicion}.
	 * @param ctx the parse tree
	 */
	void exitCondicion(GramProgParser.CondicionContext ctx);
	/**
	 * Enter a parse tree produced by {@link GramProgParser#contenido}.
	 * @param ctx the parse tree
	 */
	void enterContenido(GramProgParser.ContenidoContext ctx);
	/**
	 * Exit a parse tree produced by {@link GramProgParser#contenido}.
	 * @param ctx the parse tree
	 */
	void exitContenido(GramProgParser.ContenidoContext ctx);
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
	 * Enter a parse tree produced by {@link GramProgParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExpr(GramProgParser.ExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link GramProgParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExpr(GramProgParser.ExprContext ctx);
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
	 * Enter a parse tree produced by {@link GramProgParser#cadena}.
	 * @param ctx the parse tree
	 */
	void enterCadena(GramProgParser.CadenaContext ctx);
	/**
	 * Exit a parse tree produced by {@link GramProgParser#cadena}.
	 * @param ctx the parse tree
	 */
	void exitCadena(GramProgParser.CadenaContext ctx);
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
	 * Enter a parse tree produced by {@link GramProgParser#opLogico}.
	 * @param ctx the parse tree
	 */
	void enterOpLogico(GramProgParser.OpLogicoContext ctx);
	/**
	 * Exit a parse tree produced by {@link GramProgParser#opLogico}.
	 * @param ctx the parse tree
	 */
	void exitOpLogico(GramProgParser.OpLogicoContext ctx);
	/**
	 * Enter a parse tree produced by {@link GramProgParser#opBinario}.
	 * @param ctx the parse tree
	 */
	void enterOpBinario(GramProgParser.OpBinarioContext ctx);
	/**
	 * Exit a parse tree produced by {@link GramProgParser#opBinario}.
	 * @param ctx the parse tree
	 */
	void exitOpBinario(GramProgParser.OpBinarioContext ctx);
	/**
	 * Enter a parse tree produced by {@link GramProgParser#opMat}.
	 * @param ctx the parse tree
	 */
	void enterOpMat(GramProgParser.OpMatContext ctx);
	/**
	 * Exit a parse tree produced by {@link GramProgParser#opMat}.
	 * @param ctx the parse tree
	 */
	void exitOpMat(GramProgParser.OpMatContext ctx);
}