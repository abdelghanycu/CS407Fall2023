// Generated from D:/Projects/0Test/SCI/CS407Fall2023/src/main/java/week03\Week03.g4 by ANTLR 4.10.1
package week03;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link Week03Parser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface Week03Visitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link Week03Parser#stat}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStat(Week03Parser.StatContext ctx);
	/**
	 * Visit a parse tree produced by {@link Week03Parser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpr(Week03Parser.ExprContext ctx);
}