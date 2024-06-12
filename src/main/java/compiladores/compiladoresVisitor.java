// Generated from /home/coti/Downloads/TecCompilacion2024-master(2)/TecCompilacion2024-master/src/main/java/compiladores/compiladores.g4 by ANTLR 4.13.1
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link compiladoresParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface compiladoresVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link compiladoresParser#programa}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrograma(compiladoresParser.ProgramaContext ctx);
	/**
	 * Visit a parse tree produced by {@link compiladoresParser#instruccion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInstruccion(compiladoresParser.InstruccionContext ctx);
	/**
	 * Visit a parse tree produced by {@link compiladoresParser#declaracion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclaracion(compiladoresParser.DeclaracionContext ctx);
	/**
	 * Visit a parse tree produced by {@link compiladoresParser#tipo}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTipo(compiladoresParser.TipoContext ctx);
	/**
	 * Visit a parse tree produced by {@link compiladoresParser#listaDeclaradores}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitListaDeclaradores(compiladoresParser.ListaDeclaradoresContext ctx);
	/**
	 * Visit a parse tree produced by {@link compiladoresParser#declarador}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclarador(compiladoresParser.DeclaradorContext ctx);
	/**
	 * Visit a parse tree produced by {@link compiladoresParser#asignacion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAsignacion(compiladoresParser.AsignacionContext ctx);
	/**
	 * Visit a parse tree produced by {@link compiladoresParser#expresion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpresion(compiladoresParser.ExpresionContext ctx);
	/**
	 * Visit a parse tree produced by {@link compiladoresParser#expresionUnaria}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpresionUnaria(compiladoresParser.ExpresionUnariaContext ctx);
	/**
	 * Visit a parse tree produced by {@link compiladoresParser#operadorBinario}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOperadorBinario(compiladoresParser.OperadorBinarioContext ctx);
	/**
	 * Visit a parse tree produced by {@link compiladoresParser#operadorUnario}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOperadorUnario(compiladoresParser.OperadorUnarioContext ctx);
	/**
	 * Visit a parse tree produced by {@link compiladoresParser#termino}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTermino(compiladoresParser.TerminoContext ctx);
	/**
	 * Visit a parse tree produced by {@link compiladoresParser#bucleWhile}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBucleWhile(compiladoresParser.BucleWhileContext ctx);
	/**
	 * Visit a parse tree produced by {@link compiladoresParser#estructuraIf}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEstructuraIf(compiladoresParser.EstructuraIfContext ctx);
	/**
	 * Visit a parse tree produced by {@link compiladoresParser#bucleFor}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBucleFor(compiladoresParser.BucleForContext ctx);
	/**
	 * Visit a parse tree produced by {@link compiladoresParser#forInit}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitForInit(compiladoresParser.ForInitContext ctx);
	/**
	 * Visit a parse tree produced by {@link compiladoresParser#forUpdate}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitForUpdate(compiladoresParser.ForUpdateContext ctx);
	/**
	 * Visit a parse tree produced by {@link compiladoresParser#asignacionSinPuntoComa}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAsignacionSinPuntoComa(compiladoresParser.AsignacionSinPuntoComaContext ctx);
	/**
	 * Visit a parse tree produced by {@link compiladoresParser#declaracionSinPuntoComa}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclaracionSinPuntoComa(compiladoresParser.DeclaracionSinPuntoComaContext ctx);
	/**
	 * Visit a parse tree produced by {@link compiladoresParser#retorno}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRetorno(compiladoresParser.RetornoContext ctx);
	/**
	 * Visit a parse tree produced by {@link compiladoresParser#llamadaFuncion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLlamadaFuncion(compiladoresParser.LlamadaFuncionContext ctx);
	/**
	 * Visit a parse tree produced by {@link compiladoresParser#listaArgumentos}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitListaArgumentos(compiladoresParser.ListaArgumentosContext ctx);
	/**
	 * Visit a parse tree produced by {@link compiladoresParser#declaracionFuncion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclaracionFuncion(compiladoresParser.DeclaracionFuncionContext ctx);
	/**
	 * Visit a parse tree produced by {@link compiladoresParser#listaParametros}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitListaParametros(compiladoresParser.ListaParametrosContext ctx);
	/**
	 * Visit a parse tree produced by {@link compiladoresParser#parametro}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParametro(compiladoresParser.ParametroContext ctx);
}