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
	 * Enter a parse tree produced by {@link GramProgParser#funcion}.
	 * @param ctx the parse tree
	 */
	void enterFuncion(GramProgParser.FuncionContext ctx);
	/**
	 * Exit a parse tree produced by {@link GramProgParser#funcion}.
	 * @param ctx the parse tree
	 */
	void exitFuncion(GramProgParser.FuncionContext ctx);
	/**
	 * Enter a parse tree produced by {@link GramProgParser#defineFuncion}.
	 * @param ctx the parse tree
	 */
	void enterDefineFuncion(GramProgParser.DefineFuncionContext ctx);
	/**
	 * Exit a parse tree produced by {@link GramProgParser#defineFuncion}.
	 * @param ctx the parse tree
	 */
	void exitDefineFuncion(GramProgParser.DefineFuncionContext ctx);
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
	 * Enter a parse tree produced by {@link GramProgParser#bloqueFuncion}.
	 * @param ctx the parse tree
	 */
	void enterBloqueFuncion(GramProgParser.BloqueFuncionContext ctx);
	/**
	 * Exit a parse tree produced by {@link GramProgParser#bloqueFuncion}.
	 * @param ctx the parse tree
	 */
	void exitBloqueFuncion(GramProgParser.BloqueFuncionContext ctx);
	/**
	 * Enter a parse tree produced by {@link GramProgParser#bucle}.
	 * @param ctx the parse tree
	 */
	void enterBucle(GramProgParser.BucleContext ctx);
	/**
	 * Exit a parse tree produced by {@link GramProgParser#bucle}.
	 * @param ctx the parse tree
	 */
	void exitBucle(GramProgParser.BucleContext ctx);
	/**
	 * Enter a parse tree produced by {@link GramProgParser#bloqueCodigoBucle}.
	 * @param ctx the parse tree
	 */
	void enterBloqueCodigoBucle(GramProgParser.BloqueCodigoBucleContext ctx);
	/**
	 * Exit a parse tree produced by {@link GramProgParser#bloqueCodigoBucle}.
	 * @param ctx the parse tree
	 */
	void exitBloqueCodigoBucle(GramProgParser.BloqueCodigoBucleContext ctx);
	/**
	 * Enter a parse tree produced by {@link GramProgParser#ifex}.
	 * @param ctx the parse tree
	 */
	void enterIfex(GramProgParser.IfexContext ctx);
	/**
	 * Exit a parse tree produced by {@link GramProgParser#ifex}.
	 * @param ctx the parse tree
	 */
	void exitIfex(GramProgParser.IfexContext ctx);
	/**
	 * Enter a parse tree produced by {@link GramProgParser#bloqueCodigoIf}.
	 * @param ctx the parse tree
	 */
	void enterBloqueCodigoIf(GramProgParser.BloqueCodigoIfContext ctx);
	/**
	 * Exit a parse tree produced by {@link GramProgParser#bloqueCodigoIf}.
	 * @param ctx the parse tree
	 */
	void exitBloqueCodigoIf(GramProgParser.BloqueCodigoIfContext ctx);
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
	 * Enter a parse tree produced by {@link GramProgParser#defineFor}.
	 * @param ctx the parse tree
	 */
	void enterDefineFor(GramProgParser.DefineForContext ctx);
	/**
	 * Exit a parse tree produced by {@link GramProgParser#defineFor}.
	 * @param ctx the parse tree
	 */
	void exitDefineFor(GramProgParser.DefineForContext ctx);
	/**
	 * Enter a parse tree produced by {@link GramProgParser#bloqueCodigo}.
	 * @param ctx the parse tree
	 */
	void enterBloqueCodigo(GramProgParser.BloqueCodigoContext ctx);
	/**
	 * Exit a parse tree produced by {@link GramProgParser#bloqueCodigo}.
	 * @param ctx the parse tree
	 */
	void exitBloqueCodigo(GramProgParser.BloqueCodigoContext ctx);
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
	 * Enter a parse tree produced by {@link GramProgParser#declararYasignar}.
	 * @param ctx the parse tree
	 */
	void enterDeclararYasignar(GramProgParser.DeclararYasignarContext ctx);
	/**
	 * Exit a parse tree produced by {@link GramProgParser#declararYasignar}.
	 * @param ctx the parse tree
	 */
	void exitDeclararYasignar(GramProgParser.DeclararYasignarContext ctx);
	/**
	 * Enter a parse tree produced by {@link GramProgParser#declaracion}.
	 * @param ctx the parse tree
	 */
	void enterDeclaracion(GramProgParser.DeclaracionContext ctx);
	/**
	 * Exit a parse tree produced by {@link GramProgParser#declaracion}.
	 * @param ctx the parse tree
	 */
	void exitDeclaracion(GramProgParser.DeclaracionContext ctx);
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
	 * Enter a parse tree produced by {@link GramProgParser#devolver}.
	 * @param ctx the parse tree
	 */
	void enterDevolver(GramProgParser.DevolverContext ctx);
	/**
	 * Exit a parse tree produced by {@link GramProgParser#devolver}.
	 * @param ctx the parse tree
	 */
	void exitDevolver(GramProgParser.DevolverContext ctx);
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
	 * Enter a parse tree produced by {@link GramProgParser#tipo}.
	 * @param ctx the parse tree
	 */
	void enterTipo(GramProgParser.TipoContext ctx);
	/**
	 * Exit a parse tree produced by {@link GramProgParser#tipo}.
	 * @param ctx the parse tree
	 */
	void exitTipo(GramProgParser.TipoContext ctx);
	/**
	 * Enter a parse tree produced by the {@code andor}
	 * labeled alternative in {@link GramProgParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterAndor(GramProgParser.AndorContext ctx);
	/**
	 * Exit a parse tree produced by the {@code andor}
	 * labeled alternative in {@link GramProgParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitAndor(GramProgParser.AndorContext ctx);
	/**
	 * Enter a parse tree produced by the {@code comparar}
	 * labeled alternative in {@link GramProgParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterComparar(GramProgParser.CompararContext ctx);
	/**
	 * Exit a parse tree produced by the {@code comparar}
	 * labeled alternative in {@link GramProgParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitComparar(GramProgParser.CompararContext ctx);
	/**
	 * Enter a parse tree produced by the {@code incrementar}
	 * labeled alternative in {@link GramProgParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterIncrementar(GramProgParser.IncrementarContext ctx);
	/**
	 * Exit a parse tree produced by the {@code incrementar}
	 * labeled alternative in {@link GramProgParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitIncrementar(GramProgParser.IncrementarContext ctx);
	/**
	 * Enter a parse tree produced by the {@code mult}
	 * labeled alternative in {@link GramProgParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterMult(GramProgParser.MultContext ctx);
	/**
	 * Exit a parse tree produced by the {@code mult}
	 * labeled alternative in {@link GramProgParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitMult(GramProgParser.MultContext ctx);
	/**
	 * Enter a parse tree produced by the {@code sumar}
	 * labeled alternative in {@link GramProgParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterSumar(GramProgParser.SumarContext ctx);
	/**
	 * Exit a parse tree produced by the {@code sumar}
	 * labeled alternative in {@link GramProgParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitSumar(GramProgParser.SumarContext ctx);
	/**
	 * Enter a parse tree produced by the {@code negativo}
	 * labeled alternative in {@link GramProgParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterNegativo(GramProgParser.NegativoContext ctx);
	/**
	 * Exit a parse tree produced by the {@code negativo}
	 * labeled alternative in {@link GramProgParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitNegativo(GramProgParser.NegativoContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ids}
	 * labeled alternative in {@link GramProgParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterIds(GramProgParser.IdsContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ids}
	 * labeled alternative in {@link GramProgParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitIds(GramProgParser.IdsContext ctx);
	/**
	 * Enter a parse tree produced by the {@code llamadafunc}
	 * labeled alternative in {@link GramProgParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterLlamadafunc(GramProgParser.LlamadafuncContext ctx);
	/**
	 * Exit a parse tree produced by the {@code llamadafunc}
	 * labeled alternative in {@link GramProgParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitLlamadafunc(GramProgParser.LlamadafuncContext ctx);
	/**
	 * Enter a parse tree produced by the {@code numerito}
	 * labeled alternative in {@link GramProgParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterNumerito(GramProgParser.NumeritoContext ctx);
	/**
	 * Exit a parse tree produced by the {@code numerito}
	 * labeled alternative in {@link GramProgParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitNumerito(GramProgParser.NumeritoContext ctx);
	/**
	 * Enter a parse tree produced by the {@code entrepar}
	 * labeled alternative in {@link GramProgParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterEntrepar(GramProgParser.EntreparContext ctx);
	/**
	 * Exit a parse tree produced by the {@code entrepar}
	 * labeled alternative in {@link GramProgParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitEntrepar(GramProgParser.EntreparContext ctx);
	/**
	 * Enter a parse tree produced by the {@code cadenita}
	 * labeled alternative in {@link GramProgParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterCadenita(GramProgParser.CadenitaContext ctx);
	/**
	 * Exit a parse tree produced by the {@code cadenita}
	 * labeled alternative in {@link GramProgParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitCadenita(GramProgParser.CadenitaContext ctx);
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