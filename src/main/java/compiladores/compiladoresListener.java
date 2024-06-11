// Generated from /home/coti/Downloads/TecCompilacion2024-master(2)/TecCompilacion2024-master/src/main/java/compiladores/compiladores.g4 by ANTLR 4.13.1
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link compiladoresParser}.
 */
public interface compiladoresListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link compiladoresParser#programa}.
	 * @param ctx the parse tree
	 */
	void enterPrograma(compiladoresParser.ProgramaContext ctx);
	/**
	 * Exit a parse tree produced by {@link compiladoresParser#programa}.
	 * @param ctx the parse tree
	 */
	void exitPrograma(compiladoresParser.ProgramaContext ctx);
	/**
	 * Enter a parse tree produced by {@link compiladoresParser#instruccion}.
	 * @param ctx the parse tree
	 */
	void enterInstruccion(compiladoresParser.InstruccionContext ctx);
	/**
	 * Exit a parse tree produced by {@link compiladoresParser#instruccion}.
	 * @param ctx the parse tree
	 */
	void exitInstruccion(compiladoresParser.InstruccionContext ctx);
	/**
	 * Enter a parse tree produced by {@link compiladoresParser#declaracion}.
	 * @param ctx the parse tree
	 */
	void enterDeclaracion(compiladoresParser.DeclaracionContext ctx);
	/**
	 * Exit a parse tree produced by {@link compiladoresParser#declaracion}.
	 * @param ctx the parse tree
	 */
	void exitDeclaracion(compiladoresParser.DeclaracionContext ctx);
	/**
	 * Enter a parse tree produced by {@link compiladoresParser#tipo}.
	 * @param ctx the parse tree
	 */
	void enterTipo(compiladoresParser.TipoContext ctx);
	/**
	 * Exit a parse tree produced by {@link compiladoresParser#tipo}.
	 * @param ctx the parse tree
	 */
	void exitTipo(compiladoresParser.TipoContext ctx);
	/**
	 * Enter a parse tree produced by {@link compiladoresParser#listaDeclaradores}.
	 * @param ctx the parse tree
	 */
	void enterListaDeclaradores(compiladoresParser.ListaDeclaradoresContext ctx);
	/**
	 * Exit a parse tree produced by {@link compiladoresParser#listaDeclaradores}.
	 * @param ctx the parse tree
	 */
	void exitListaDeclaradores(compiladoresParser.ListaDeclaradoresContext ctx);
	/**
	 * Enter a parse tree produced by {@link compiladoresParser#declarador}.
	 * @param ctx the parse tree
	 */
	void enterDeclarador(compiladoresParser.DeclaradorContext ctx);
	/**
	 * Exit a parse tree produced by {@link compiladoresParser#declarador}.
	 * @param ctx the parse tree
	 */
	void exitDeclarador(compiladoresParser.DeclaradorContext ctx);
	/**
	 * Enter a parse tree produced by {@link compiladoresParser#asignacion}.
	 * @param ctx the parse tree
	 */
	void enterAsignacion(compiladoresParser.AsignacionContext ctx);
	/**
	 * Exit a parse tree produced by {@link compiladoresParser#asignacion}.
	 * @param ctx the parse tree
	 */
	void exitAsignacion(compiladoresParser.AsignacionContext ctx);
	/**
	 * Enter a parse tree produced by {@link compiladoresParser#expresion}.
	 * @param ctx the parse tree
	 */
	void enterExpresion(compiladoresParser.ExpresionContext ctx);
	/**
	 * Exit a parse tree produced by {@link compiladoresParser#expresion}.
	 * @param ctx the parse tree
	 */
	void exitExpresion(compiladoresParser.ExpresionContext ctx);
	/**
	 * Enter a parse tree produced by {@link compiladoresParser#expresionUnaria}.
	 * @param ctx the parse tree
	 */
	void enterExpresionUnaria(compiladoresParser.ExpresionUnariaContext ctx);
	/**
	 * Exit a parse tree produced by {@link compiladoresParser#expresionUnaria}.
	 * @param ctx the parse tree
	 */
	void exitExpresionUnaria(compiladoresParser.ExpresionUnariaContext ctx);
	/**
	 * Enter a parse tree produced by {@link compiladoresParser#operadorBinario}.
	 * @param ctx the parse tree
	 */
	void enterOperadorBinario(compiladoresParser.OperadorBinarioContext ctx);
	/**
	 * Exit a parse tree produced by {@link compiladoresParser#operadorBinario}.
	 * @param ctx the parse tree
	 */
	void exitOperadorBinario(compiladoresParser.OperadorBinarioContext ctx);
	/**
	 * Enter a parse tree produced by {@link compiladoresParser#operadorUnario}.
	 * @param ctx the parse tree
	 */
	void enterOperadorUnario(compiladoresParser.OperadorUnarioContext ctx);
	/**
	 * Exit a parse tree produced by {@link compiladoresParser#operadorUnario}.
	 * @param ctx the parse tree
	 */
	void exitOperadorUnario(compiladoresParser.OperadorUnarioContext ctx);
	/**
	 * Enter a parse tree produced by {@link compiladoresParser#termino}.
	 * @param ctx the parse tree
	 */
	void enterTermino(compiladoresParser.TerminoContext ctx);
	/**
	 * Exit a parse tree produced by {@link compiladoresParser#termino}.
	 * @param ctx the parse tree
	 */
	void exitTermino(compiladoresParser.TerminoContext ctx);
	/**
	 * Enter a parse tree produced by {@link compiladoresParser#bucleWhile}.
	 * @param ctx the parse tree
	 */
	void enterBucleWhile(compiladoresParser.BucleWhileContext ctx);
	/**
	 * Exit a parse tree produced by {@link compiladoresParser#bucleWhile}.
	 * @param ctx the parse tree
	 */
	void exitBucleWhile(compiladoresParser.BucleWhileContext ctx);
	/**
	 * Enter a parse tree produced by {@link compiladoresParser#estructuraIf}.
	 * @param ctx the parse tree
	 */
	void enterEstructuraIf(compiladoresParser.EstructuraIfContext ctx);
	/**
	 * Exit a parse tree produced by {@link compiladoresParser#estructuraIf}.
	 * @param ctx the parse tree
	 */
	void exitEstructuraIf(compiladoresParser.EstructuraIfContext ctx);
	/**
	 * Enter a parse tree produced by {@link compiladoresParser#bucleFor}.
	 * @param ctx the parse tree
	 */
	void enterBucleFor(compiladoresParser.BucleForContext ctx);
	/**
	 * Exit a parse tree produced by {@link compiladoresParser#bucleFor}.
	 * @param ctx the parse tree
	 */
	void exitBucleFor(compiladoresParser.BucleForContext ctx);
	/**
	 * Enter a parse tree produced by {@link compiladoresParser#forInit}.
	 * @param ctx the parse tree
	 */
	void enterForInit(compiladoresParser.ForInitContext ctx);
	/**
	 * Exit a parse tree produced by {@link compiladoresParser#forInit}.
	 * @param ctx the parse tree
	 */
	void exitForInit(compiladoresParser.ForInitContext ctx);
	/**
	 * Enter a parse tree produced by {@link compiladoresParser#forUpdate}.
	 * @param ctx the parse tree
	 */
	void enterForUpdate(compiladoresParser.ForUpdateContext ctx);
	/**
	 * Exit a parse tree produced by {@link compiladoresParser#forUpdate}.
	 * @param ctx the parse tree
	 */
	void exitForUpdate(compiladoresParser.ForUpdateContext ctx);
	/**
	 * Enter a parse tree produced by {@link compiladoresParser#asignacionSinPuntoComa}.
	 * @param ctx the parse tree
	 */
	void enterAsignacionSinPuntoComa(compiladoresParser.AsignacionSinPuntoComaContext ctx);
	/**
	 * Exit a parse tree produced by {@link compiladoresParser#asignacionSinPuntoComa}.
	 * @param ctx the parse tree
	 */
	void exitAsignacionSinPuntoComa(compiladoresParser.AsignacionSinPuntoComaContext ctx);
	/**
	 * Enter a parse tree produced by {@link compiladoresParser#declaracionSinPuntoComa}.
	 * @param ctx the parse tree
	 */
	void enterDeclaracionSinPuntoComa(compiladoresParser.DeclaracionSinPuntoComaContext ctx);
	/**
	 * Exit a parse tree produced by {@link compiladoresParser#declaracionSinPuntoComa}.
	 * @param ctx the parse tree
	 */
	void exitDeclaracionSinPuntoComa(compiladoresParser.DeclaracionSinPuntoComaContext ctx);
	/**
	 * Enter a parse tree produced by {@link compiladoresParser#retorno}.
	 * @param ctx the parse tree
	 */
	void enterRetorno(compiladoresParser.RetornoContext ctx);
	/**
	 * Exit a parse tree produced by {@link compiladoresParser#retorno}.
	 * @param ctx the parse tree
	 */
	void exitRetorno(compiladoresParser.RetornoContext ctx);
	/**
	 * Enter a parse tree produced by {@link compiladoresParser#llamadaFuncion}.
	 * @param ctx the parse tree
	 */
	void enterLlamadaFuncion(compiladoresParser.LlamadaFuncionContext ctx);
	/**
	 * Exit a parse tree produced by {@link compiladoresParser#llamadaFuncion}.
	 * @param ctx the parse tree
	 */
	void exitLlamadaFuncion(compiladoresParser.LlamadaFuncionContext ctx);
	/**
	 * Enter a parse tree produced by {@link compiladoresParser#listaArgumentos}.
	 * @param ctx the parse tree
	 */
	void enterListaArgumentos(compiladoresParser.ListaArgumentosContext ctx);
	/**
	 * Exit a parse tree produced by {@link compiladoresParser#listaArgumentos}.
	 * @param ctx the parse tree
	 */
	void exitListaArgumentos(compiladoresParser.ListaArgumentosContext ctx);
	/**
	 * Enter a parse tree produced by {@link compiladoresParser#declaracionFuncion}.
	 * @param ctx the parse tree
	 */
	void enterDeclaracionFuncion(compiladoresParser.DeclaracionFuncionContext ctx);
	/**
	 * Exit a parse tree produced by {@link compiladoresParser#declaracionFuncion}.
	 * @param ctx the parse tree
	 */
	void exitDeclaracionFuncion(compiladoresParser.DeclaracionFuncionContext ctx);
	/**
	 * Enter a parse tree produced by {@link compiladoresParser#listaParametros}.
	 * @param ctx the parse tree
	 */
	void enterListaParametros(compiladoresParser.ListaParametrosContext ctx);
	/**
	 * Exit a parse tree produced by {@link compiladoresParser#listaParametros}.
	 * @param ctx the parse tree
	 */
	void exitListaParametros(compiladoresParser.ListaParametrosContext ctx);
	/**
	 * Enter a parse tree produced by {@link compiladoresParser#parametro}.
	 * @param ctx the parse tree
	 */
	void enterParametro(compiladoresParser.ParametroContext ctx);
	/**
	 * Exit a parse tree produced by {@link compiladoresParser#parametro}.
	 * @param ctx the parse tree
	 */
	void exitParametro(compiladoresParser.ParametroContext ctx);
}