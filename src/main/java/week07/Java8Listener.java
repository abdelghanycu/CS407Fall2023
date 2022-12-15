// Generated from java-escape by ANTLR 4.11.1
package week07;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link Java8Parser}.
 */
public interface Java8Listener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link Java8Parser#compilationUnit}.
	 * @param ctx the parse tree
	 */
	void enterCompilationUnit(Java8Parser.CompilationUnitContext ctx);
	/**
	 * Exit a parse tree produced by {@link Java8Parser#compilationUnit}.
	 * @param ctx the parse tree
	 */
	void exitCompilationUnit(Java8Parser.CompilationUnitContext ctx);
	/**
	 * Enter a parse tree produced by {@link Java8Parser#classDef}.
	 * @param ctx the parse tree
	 */
	void enterClassDef(Java8Parser.ClassDefContext ctx);
	/**
	 * Exit a parse tree produced by {@link Java8Parser#classDef}.
	 * @param ctx the parse tree
	 */
	void exitClassDef(Java8Parser.ClassDefContext ctx);
	/**
	 * Enter a parse tree produced by {@link Java8Parser#method}.
	 * @param ctx the parse tree
	 */
	void enterMethod(Java8Parser.MethodContext ctx);
	/**
	 * Exit a parse tree produced by {@link Java8Parser#method}.
	 * @param ctx the parse tree
	 */
	void exitMethod(Java8Parser.MethodContext ctx);
	/**
	 * Enter a parse tree produced by {@link Java8Parser#returnStat}.
	 * @param ctx the parse tree
	 */
	void enterReturnStat(Java8Parser.ReturnStatContext ctx);
	/**
	 * Exit a parse tree produced by {@link Java8Parser#returnStat}.
	 * @param ctx the parse tree
	 */
	void exitReturnStat(Java8Parser.ReturnStatContext ctx);
	/**
	 * Enter a parse tree produced by {@link Java8Parser#params}.
	 * @param ctx the parse tree
	 */
	void enterParams(Java8Parser.ParamsContext ctx);
	/**
	 * Exit a parse tree produced by {@link Java8Parser#params}.
	 * @param ctx the parse tree
	 */
	void exitParams(Java8Parser.ParamsContext ctx);
	/**
	 * Enter a parse tree produced by {@link Java8Parser#param}.
	 * @param ctx the parse tree
	 */
	void enterParam(Java8Parser.ParamContext ctx);
	/**
	 * Exit a parse tree produced by {@link Java8Parser#param}.
	 * @param ctx the parse tree
	 */
	void exitParam(Java8Parser.ParamContext ctx);
	/**
	 * Enter a parse tree produced by {@link Java8Parser#returnType}.
	 * @param ctx the parse tree
	 */
	void enterReturnType(Java8Parser.ReturnTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link Java8Parser#returnType}.
	 * @param ctx the parse tree
	 */
	void exitReturnType(Java8Parser.ReturnTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link Java8Parser#value}.
	 * @param ctx the parse tree
	 */
	void enterValue(Java8Parser.ValueContext ctx);
	/**
	 * Exit a parse tree produced by {@link Java8Parser#value}.
	 * @param ctx the parse tree
	 */
	void exitValue(Java8Parser.ValueContext ctx);
	/**
	 * Enter a parse tree produced by {@link Java8Parser#number}.
	 * @param ctx the parse tree
	 */
	void enterNumber(Java8Parser.NumberContext ctx);
	/**
	 * Exit a parse tree produced by {@link Java8Parser#number}.
	 * @param ctx the parse tree
	 */
	void exitNumber(Java8Parser.NumberContext ctx);
	/**
	 * Enter a parse tree produced by {@link Java8Parser#doubleType}.
	 * @param ctx the parse tree
	 */
	void enterDoubleType(Java8Parser.DoubleTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link Java8Parser#doubleType}.
	 * @param ctx the parse tree
	 */
	void exitDoubleType(Java8Parser.DoubleTypeContext ctx);
}