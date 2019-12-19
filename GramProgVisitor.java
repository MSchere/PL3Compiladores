// Generated from GramProg.g4 by ANTLR 4.7.2
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link GramProgParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface GramProgVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by the {@code progPrincipal}
	 * labeled alternative in {@link GramProgParser#prog}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProgPrincipal(GramProgParser.ProgPrincipalContext ctx);
	/**
	 * Visit a parse tree produced by the {@code incluir}
	 * labeled alternative in {@link GramProgParser#include}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIncluir(GramProgParser.IncluirContext ctx);
	/**
	 * Visit a parse tree produced by the {@code func}
	 * labeled alternative in {@link GramProgParser#funcion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunc(GramProgParser.FuncContext ctx);
	/**
	 * Visit a parse tree produced by the {@code definirFunc}
	 * labeled alternative in {@link GramProgParser#defineFuncion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDefinirFunc(GramProgParser.DefinirFuncContext ctx);
	/**
	 * Visit a parse tree produced by the {@code param}
	 * labeled alternative in {@link GramProgParser#parametros}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParam(GramProgParser.ParamContext ctx);
	/**
	 * Visit a parse tree produced by the {@code bloqueFunc}
	 * labeled alternative in {@link GramProgParser#bloqueFuncion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBloqueFunc(GramProgParser.BloqueFuncContext ctx);
	/**
	 * Visit a parse tree produced by the {@code bucleWhile}
	 * labeled alternative in {@link GramProgParser#bucle}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBucleWhile(GramProgParser.BucleWhileContext ctx);
	/**
	 * Visit a parse tree produced by the {@code bloqueBucleWhile}
	 * labeled alternative in {@link GramProgParser#bloqueCodigoBucle}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBloqueBucleWhile(GramProgParser.BloqueBucleWhileContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ifEex}
	 * labeled alternative in {@link GramProgParser#ifex}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIfEex(GramProgParser.IfEexContext ctx);
	/**
	 * Visit a parse tree produced by the {@code bloqueBucleIf}
	 * labeled alternative in {@link GramProgParser#bloqueCodigoIf}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBloqueBucleIf(GramProgParser.BloqueBucleIfContext ctx);
	/**
	 * Visit a parse tree produced by the {@code forEex}
	 * labeled alternative in {@link GramProgParser#forEx}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitForEex(GramProgParser.ForEexContext ctx);
	/**
	 * Visit a parse tree produced by the {@code definirFor}
	 * labeled alternative in {@link GramProgParser#defineFor}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDefinirFor(GramProgParser.DefinirForContext ctx);
	/**
	 * Visit a parse tree produced by the {@code bloqueCod}
	 * labeled alternative in {@link GramProgParser#bloqueCodigo}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBloqueCod(GramProgParser.BloqueCodContext ctx);
	/**
	 * Visit a parse tree produced by {@link GramProgParser#sentencia}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSentencia(GramProgParser.SentenciaContext ctx);
	/**
	 * Visit a parse tree produced by the {@code declararYasign}
	 * labeled alternative in {@link GramProgParser#declararYasignar}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclararYasign(GramProgParser.DeclararYasignContext ctx);
	/**
	 * Visit a parse tree produced by the {@code declarar}
	 * labeled alternative in {@link GramProgParser#declaracion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclarar(GramProgParser.DeclararContext ctx);
	/**
	 * Visit a parse tree produced by the {@code asignar}
	 * labeled alternative in {@link GramProgParser#asignacion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAsignar(GramProgParser.AsignarContext ctx);
	/**
	 * Visit a parse tree produced by the {@code devolv}
	 * labeled alternative in {@link GramProgParser#devolver}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDevolv(GramProgParser.DevolvContext ctx);
	/**
	 * Visit a parse tree produced by the {@code llamadaFunc}
	 * labeled alternative in {@link GramProgParser#llamadaFuncion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLlamadaFunc(GramProgParser.LlamadaFuncContext ctx);
	/**
	 * Visit a parse tree produced by the {@code tip}
	 * labeled alternative in {@link GramProgParser#tipo}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTip(GramProgParser.TipContext ctx);
	/**
	 * Visit a parse tree produced by the {@code parentesis}
	 * labeled alternative in {@link GramProgParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParentesis(GramProgParser.ParentesisContext ctx);
	/**
	 * Visit a parse tree produced by the {@code suma}
	 * labeled alternative in {@link GramProgParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSuma(GramProgParser.SumaContext ctx);
	/**
	 * Visit a parse tree produced by the {@code neg}
	 * labeled alternative in {@link GramProgParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNeg(GramProgParser.NegContext ctx);
	/**
	 * Visit a parse tree produced by the {@code comp}
	 * labeled alternative in {@link GramProgParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComp(GramProgParser.CompContext ctx);
	/**
	 * Visit a parse tree produced by the {@code bool}
	 * labeled alternative in {@link GramProgParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBool(GramProgParser.BoolContext ctx);
	/**
	 * Visit a parse tree produced by the {@code mul}
	 * labeled alternative in {@link GramProgParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMul(GramProgParser.MulContext ctx);
	/**
	 * Visit a parse tree produced by the {@code and}
	 * labeled alternative in {@link GramProgParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAnd(GramProgParser.AndContext ctx);
	/**
	 * Visit a parse tree produced by the {@code cadena}
	 * labeled alternative in {@link GramProgParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCadena(GramProgParser.CadenaContext ctx);
	/**
	 * Visit a parse tree produced by the {@code num}
	 * labeled alternative in {@link GramProgParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNum(GramProgParser.NumContext ctx);
	/**
	 * Visit a parse tree produced by the {@code llamafuncion}
	 * labeled alternative in {@link GramProgParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLlamafuncion(GramProgParser.LlamafuncionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code id}
	 * labeled alternative in {@link GramProgParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitId(GramProgParser.IdContext ctx);
	/**
	 * Visit a parse tree produced by the {@code inc}
	 * labeled alternative in {@link GramProgParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInc(GramProgParser.IncContext ctx);
	/**
	 * Visit a parse tree produced by {@link GramProgParser#numero}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNumero(GramProgParser.NumeroContext ctx);
}