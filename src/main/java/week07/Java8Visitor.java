// Generated from java-escape by ANTLR 4.11.1
package week07;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link Java8Parser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface Java8Visitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link Java8Parser#compilationUnit}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCompilationUnit(Java8Parser.CompilationUnitContext ctx);
	/**
	 * Visit a parse tree produced by {@link Java8Parser#classDef}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClassDef(Java8Parser.ClassDefContext ctx);
	/**
	 * Visit a parse tree produced by {@link Java8Parser#method}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMethod(Java8Parser.MethodContext ctx);
	/**
	 * Visit a parse tree produced by {@link Java8Parser#returnStat}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReturnStat(Java8Parser.ReturnStatContext ctx);
	/**
	 * Visit a parse tree produced by {@link Java8Parser#params}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParams(Java8Parser.ParamsContext ctx);
	/**
	 * Visit a parse tree produced by {@link Java8Parser#param}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParam(Java8Parser.ParamContext ctx);
	/**
	 * Visit a parse tree produced by {@link Java8Parser#returnType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReturnType(Java8Parser.ReturnTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link Java8Parser#value}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitValue(Java8Parser.ValueContext ctx);
	/**
	 * Visit a parse tree produced by {@link Java8Parser#number}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNumber(Java8Parser.NumberContext ctx);
	/**
	 * Visit a parse tree produced by {@link Java8Parser#doubleType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDoubleType(Java8Parser.DoubleTypeContext ctx);
}