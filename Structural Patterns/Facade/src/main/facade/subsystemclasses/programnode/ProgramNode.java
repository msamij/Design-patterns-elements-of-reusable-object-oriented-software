package main.facade.subsystemclasses.programnode;

import main.facade.subsystemclasses.Symbol;
import main.facade.subsystemclasses.Token;

/**
 * Implement subsystem functionality.
 * Handle work assigned by the Facade object.
 * Have no knowledge of the facade; that is, they keep no references to it.
 */
public abstract class ProgramNode {
	protected final Symbol symbol;
	protected final Token token;

	public ProgramNode(Symbol symbol, Token token) {
		this.symbol = symbol;
		this.token = token;
	}

}
