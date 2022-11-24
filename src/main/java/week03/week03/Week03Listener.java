// Generated from D:/Projects/0Test/SCI/CS407Fall2023/src/main/java/week03\Week03.g4 by ANTLR 4.10.1
package week03;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link Week03Parser}.
 */
public interface Week03Listener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link Week03Parser#stat}.
	 * @param ctx the parse tree
	 */
	void enterStat(Week03Parser.StatContext ctx);
	/**
	 * Exit a parse tree produced by {@link Week03Parser#stat}.
	 * @param ctx the parse tree
	 */
	void exitStat(Week03Parser.StatContext ctx);
	/**
	 * Enter a parse tree produced by {@link Week03Parser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExpr(Week03Parser.ExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link Week03Parser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExpr(Week03Parser.ExprContext ctx);
}