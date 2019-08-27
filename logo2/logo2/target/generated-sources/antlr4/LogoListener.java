// Generated from Logo.g4 by ANTLR 4.4
import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link LogoParser}.
 */
public interface LogoListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link LogoParser#sentence}.
	 * @param ctx the parse tree
	 */
	void enterSentence(@NotNull LogoParser.SentenceContext ctx);
	/**
	 * Exit a parse tree produced by {@link LogoParser#sentence}.
	 * @param ctx the parse tree
	 */
	void exitSentence(@NotNull LogoParser.SentenceContext ctx);
	/**
	 * Enter a parse tree produced by {@link LogoParser#move_fw}.
	 * @param ctx the parse tree
	 */
	void enterMove_fw(@NotNull LogoParser.Move_fwContext ctx);
	/**
	 * Exit a parse tree produced by {@link LogoParser#move_fw}.
	 * @param ctx the parse tree
	 */
	void exitMove_fw(@NotNull LogoParser.Move_fwContext ctx);
	/**
	 * Enter a parse tree produced by {@link LogoParser#rotl}.
	 * @param ctx the parse tree
	 */
	void enterRotl(@NotNull LogoParser.RotlContext ctx);
	/**
	 * Exit a parse tree produced by {@link LogoParser#rotl}.
	 * @param ctx the parse tree
	 */
	void exitRotl(@NotNull LogoParser.RotlContext ctx);
	/**
	 * Enter a parse tree produced by {@link LogoParser#function}.
	 * @param ctx the parse tree
	 */
	void enterFunction(@NotNull LogoParser.FunctionContext ctx);
	/**
	 * Exit a parse tree produced by {@link LogoParser#function}.
	 * @param ctx the parse tree
	 */
	void exitFunction(@NotNull LogoParser.FunctionContext ctx);
	/**
	 * Enter a parse tree produced by {@link LogoParser#move_bk}.
	 * @param ctx the parse tree
	 */
	void enterMove_bk(@NotNull LogoParser.Move_bkContext ctx);
	/**
	 * Exit a parse tree produced by {@link LogoParser#move_bk}.
	 * @param ctx the parse tree
	 */
	void exitMove_bk(@NotNull LogoParser.Move_bkContext ctx);
	/**
	 * Enter a parse tree produced by {@link LogoParser#scol}.
	 * @param ctx the parse tree
	 */
	void enterScol(@NotNull LogoParser.ScolContext ctx);
	/**
	 * Exit a parse tree produced by {@link LogoParser#scol}.
	 * @param ctx the parse tree
	 */
	void exitScol(@NotNull LogoParser.ScolContext ctx);
	/**
	 * Enter a parse tree produced by {@link LogoParser#program}.
	 * @param ctx the parse tree
	 */
	void enterProgram(@NotNull LogoParser.ProgramContext ctx);
	/**
	 * Exit a parse tree produced by {@link LogoParser#program}.
	 * @param ctx the parse tree
	 */
	void exitProgram(@NotNull LogoParser.ProgramContext ctx);
	/**
	 * Enter a parse tree produced by {@link LogoParser#rotr}.
	 * @param ctx the parse tree
	 */
	void enterRotr(@NotNull LogoParser.RotrContext ctx);
	/**
	 * Exit a parse tree produced by {@link LogoParser#rotr}.
	 * @param ctx the parse tree
	 */
	void exitRotr(@NotNull LogoParser.RotrContext ctx);
}