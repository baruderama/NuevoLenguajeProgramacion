// Generated from Logo.g4 by ANTLR 4.4
import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link LogoParser}.
 */
public interface LogoListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link LogoParser#start}.
	 * @param ctx the parse tree
	 */
	void enterStart(@NotNull LogoParser.StartContext ctx);
	/**
	 * Exit a parse tree produced by {@link LogoParser#start}.
	 * @param ctx the parse tree
	 */
	void exitStart(@NotNull LogoParser.StartContext ctx);
}