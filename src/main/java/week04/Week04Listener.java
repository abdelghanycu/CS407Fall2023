// Generated from D:/Projects/0Test/SCI/CS407Fall2023/src/main/java/week04\Week04.g4 by ANTLR 4.10.1
package week04;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link Week04Parser}.
 */
public interface Week04Listener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link Week04Parser#start}.
	 * @param ctx the parse tree
	 */
	void enterStart(Week04Parser.StartContext ctx);
	/**
	 * Exit a parse tree produced by {@link Week04Parser#start}.
	 * @param ctx the parse tree
	 */
	void exitStart(Week04Parser.StartContext ctx);
	/**
	 * Enter a parse tree produced by {@link Week04Parser#tags}.
	 * @param ctx the parse tree
	 */
	void enterTags(Week04Parser.TagsContext ctx);
	/**
	 * Exit a parse tree produced by {@link Week04Parser#tags}.
	 * @param ctx the parse tree
	 */
	void exitTags(Week04Parser.TagsContext ctx);
}