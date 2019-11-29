// Generated from GramProg.g4 by ANTLR 4.7.2
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link GramProgParser}.
 */
public interface GramProgListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by the {@code progPrincipal}
	 * labeled alternative in {@link GramProgParser#prog}.
	 * @param ctx the parse tree
	 */
	void enterProgPrincipal(GramProgParser.ProgPrincipalContext ctx);
	/**
	 * Exit a parse tree produced by the {@code progPrincipal}
	 * labeled alternative in {@link GramProgParser#prog}.
	 * @param ctx the parse tree
	 */
	void exitProgPrincipal(GramProgParser.ProgPrincipalContext ctx);
	/**
	 * Enter a parse tree produced by the {@code incluir}
	 * labeled alternative in {@link GramProgParser#include}.
	 * @param ctx the parse tree
	 */
	void enterIncluir(GramProgParser.IncluirContext ctx);
	/**
	 * Exit a parse tree produced by the {@code incluir}
	 * labeled alternative in {@link GramProgParser#include}.
	 * @param ctx the parse tree
	 */
	void exitIncluir(GramProgParser.IncluirContext ctx);
	/**
	 * Enter a parse tree produced by the {@code func}
	 * labeled alternative in {@link GramProgParser#funcion}.
	 * @param ctx the parse tree
	 */
	void enterFunc(GramProgParser.FuncContext ctx);
	/**
	 * Exit a parse tree produced by the {@code func}
	 * labeled alternative in {@link GramProgParser#funcion}.
	 * @param ctx the parse tree
	 */
	void exitFunc(GramProgParser.FuncContext ctx);
	/**
	 * Enter a parse tree produced by the {@code definirFunc}
	 * labeled alternative in {@link GramProgParser#defineFuncion}.
	 * @param ctx the parse tree
	 */
	void enterDefinirFunc(GramProgParser.DefinirFuncContext ctx);
	/**
	 * Exit a parse tree produced by the {@code definirFunc}
	 * labeled alternative in {@link GramProgParser#defineFuncion}.
	 * @param ctx the parse tree
	 */
	void exitDefinirFunc(GramProgParser.DefinirFuncContext ctx);
	/**
	 * Enter a parse tree produced by the {@code param}
	 * labeled alternative in {@link GramProgParser#parametros}.
	 * @param ctx the parse tree
	 */
	void enterParam(GramProgParser.ParamContext ctx);
	/**
	 * Exit a parse tree produced by the {@code param}
	 * labeled alternative in {@link GramProgParser#parametros}.
	 * @param ctx the parse tree
	 */
	void exitParam(GramProgParser.ParamContext ctx);
	/**
	 * Enter a parse tree produced by the {@code bloqueFunc}
	 * labeled alternative in {@link GramProgParser#bloqueFuncion}.
	 * @param ctx the parse tree
	 */
	void enterBloqueFunc(GramProgParser.BloqueFuncContext ctx);
	/**
	 * Exit a parse tree produced by the {@code bloqueFunc}
	 * labeled alternative in {@link GramProgParser#bloqueFuncion}.
	 * @param ctx the parse tree
	 */
	void exitBloqueFunc(GramProgParser.BloqueFuncContext ctx);
	/**
	 * Enter a parse tree produced by the {@code bucleWhile}
	 * labeled alternative in {@link GramProgParser#bucle}.
	 * @param ctx the parse tree
	 */
	void enterBucleWhile(GramProgParser.BucleWhileContext ctx);
	/**
	 * Exit a parse tree produced by the {@code bucleWhile}
	 * labeled alternative in {@link GramProgParser#bucle}.
	 * @param ctx the parse tree
	 */
	void exitBucleWhile(GramProgParser.BucleWhileContext ctx);
	/**
	 * Enter a parse tree produced by the {@code bloqueBucleWhile}
	 * labeled alternative in {@link GramProgParser#bloqueCodigoBucle}.
	 * @param ctx the parse tree
	 */
	void enterBloqueBucleWhile(GramProgParser.BloqueBucleWhileContext ctx);
	/**
	 * Exit a parse tree produced by the {@code bloqueBucleWhile}
	 * labeled alternative in {@link GramProgParser#bloqueCodigoBucle}.
	 * @param ctx the parse tree
	 */
	void exitBloqueBucleWhile(GramProgParser.BloqueBucleWhileContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ifEex}
	 * labeled alternative in {@link GramProgParser#ifex}.
	 * @param ctx the parse tree
	 */
	void enterIfEex(GramProgParser.IfEexContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ifEex}
	 * labeled alternative in {@link GramProgParser#ifex}.
	 * @param ctx the parse tree
	 */
	void exitIfEex(GramProgParser.IfEexContext ctx);
	/**
	 * Enter a parse tree produced by the {@code bloqueBucleIf}
	 * labeled alternative in {@link GramProgParser#bloqueCodigoIf}.
	 * @param ctx the parse tree
	 */
	void enterBloqueBucleIf(GramProgParser.BloqueBucleIfContext ctx);
	/**
	 * Exit a parse tree produced by the {@code bloqueBucleIf}
	 * labeled alternative in {@link GramProgParser#bloqueCodigoIf}.
	 * @param ctx the parse tree
	 */
	void exitBloqueBucleIf(GramProgParser.BloqueBucleIfContext ctx);
	/**
	 * Enter a parse tree produced by the {@code forEex}
	 * labeled alternative in {@link GramProgParser#forEx}.
	 * @param ctx the parse tree
	 */
	void enterForEex(GramProgParser.ForEexContext ctx);
	/**
	 * Exit a parse tree produced by the {@code forEex}
	 * labeled alternative in {@link GramProgParser#forEx}.
	 * @param ctx the parse tree
	 */
	void exitForEex(GramProgParser.ForEexContext ctx);
	/**
	 * Enter a parse tree produced by the {@code definirFor}
	 * labeled alternative in {@link GramProgParser#defineFor}.
	 * @param ctx the parse tree
	 */
	void enterDefinirFor(GramProgParser.DefinirForContext ctx);
	/**
	 * Exit a parse tree produced by the {@code definirFor}
	 * labeled alternative in {@link GramProgParser#defineFor}.
	 * @param ctx the parse tree
	 */
	void exitDefinirFor(GramProgParser.DefinirForContext ctx);
	/**
	 * Enter a parse tree produced by the {@code bloqueCod}
	 * labeled alternative in {@link GramProgParser#bloqueCodigo}.
	 * @param ctx the parse tree
	 */
	void enterBloqueCod(GramProgParser.BloqueCodContext ctx);
	/**
	 * Exit a parse tree produced by the {@code bloqueCod}
	 * labeled alternative in {@link GramProgParser#bloqueCodigo}.
	 * @param ctx the parse tree
	 */
	void exitBloqueCod(GramProgParser.BloqueCodContext ctx);
	/**
	 * Enter a parse tree produced by {@link GramProgParser#sentencia}.
	 * @param ctx the parse tree
	 */
	void enterSentencia(GramProgParser.SentenciaContext ctx);
	/**
	 * Exit a parse tree produced by {@link GramProgParser#sentencia}.
	 * @param ctx the parse tree
	 */
	void exitSentencia(GramProgParser.SentenciaContext ctx);
	/**
	 * Enter a parse tree produced by the {@code declararYasign}
	 * labeled alternative in {@link GramProgParser#declararYasignar}.
	 * @param ctx the parse tree
	 */
	void enterDeclararYasign(GramProgParser.DeclararYasignContext ctx);
	/**
	 * Exit a parse tree produced by the {@code declararYasign}
	 * labeled alternative in {@link GramProgParser#declararYasignar}.
	 * @param ctx the parse tree
	 */
	void exitDeclararYasign(GramProgParser.DeclararYasignContext ctx);
	/**
	 * Enter a parse tree produced by the {@code declarar}
	 * labeled alternative in {@link GramProgParser#declaracion}.
	 * @param ctx the parse tree
	 */
	void enterDeclarar(GramProgParser.DeclararContext ctx);
	/**
	 * Exit a parse tree produced by the {@code declarar}
	 * labeled alternative in {@link GramProgParser#declaracion}.
	 * @param ctx the parse tree
	 */
	void exitDeclarar(GramProgParser.DeclararContext ctx);
	/**
	 * Enter a parse tree produced by the {@code asignar}
	 * labeled alternative in {@link GramProgParser#asignacion}.
	 * @param ctx the parse tree
	 */
	void enterAsignar(GramProgParser.AsignarContext ctx);
	/**
	 * Exit a parse tree produced by the {@code asignar}
	 * labeled alternative in {@link GramProgParser#asignacion}.
	 * @param ctx the parse tree
	 */
	void exitAsignar(GramProgParser.AsignarContext ctx);
	/**
	 * Enter a parse tree produced by the {@code devolv}
	 * labeled alternative in {@link GramProgParser#devolver}.
	 * @param ctx the parse tree
	 */
	void enterDevolv(GramProgParser.DevolvContext ctx);
	/**
	 * Exit a parse tree produced by the {@code devolv}
	 * labeled alternative in {@link GramProgParser#devolver}.
	 * @param ctx the parse tree
	 */
	void exitDevolv(GramProgParser.DevolvContext ctx);
	/**
	 * Enter a parse tree produced by the {@code llamadaFunc}
	 * labeled alternative in {@link GramProgParser#llamadaFuncion}.
	 * @param ctx the parse tree
	 */
	void enterLlamadaFunc(GramProgParser.LlamadaFuncContext ctx);
	/**
	 * Exit a parse tree produced by the {@code llamadaFunc}
	 * labeled alternative in {@link GramProgParser#llamadaFuncion}.
	 * @param ctx the parse tree
	 */
	void exitLlamadaFunc(GramProgParser.LlamadaFuncContext ctx);
	/**
	 * Enter a parse tree produced by the {@code tip}
	 * labeled alternative in {@link GramProgParser#tipo}.
	 * @param ctx the parse tree
	 */
	void enterTip(GramProgParser.TipContext ctx);
	/**
	 * Exit a parse tree produced by the {@code tip}
	 * labeled alternative in {@link GramProgParser#tipo}.
	 * @param ctx the parse tree
	 */
	void exitTip(GramProgParser.TipContext ctx);
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