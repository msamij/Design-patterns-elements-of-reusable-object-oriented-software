package main.facade.subsystemclasses.programnode;

import main.facade.subsystemclasses.Symbol;
import main.facade.subsystemclasses.Token;

/**
 * Implement subsystem functionality.
 * Handle work assigned by the Facade object.
 * Have no knowledge of the facade; that is, they keep no references to it.
 */
public class ExpressionNode extends ProgramNode {

	public ExpressionNode(Symbol symbol, Token token) {
		super(symbol, token);
	}
}
