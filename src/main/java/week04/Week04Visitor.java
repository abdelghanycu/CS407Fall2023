// Generated from D:/Projects/0Test/SCI/CS407Fall2023/src/main/java/week04\Week04.g4 by ANTLR 4.10.1
package week04;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link Week04Parser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface Week04Visitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link Week04Parser#start}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStart(Week04Parser.StartContext ctx);
	/**
	 * Visit a parse tree produced by {@link Week04Parser#tags}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTags(Week04Parser.TagsContext ctx);
}