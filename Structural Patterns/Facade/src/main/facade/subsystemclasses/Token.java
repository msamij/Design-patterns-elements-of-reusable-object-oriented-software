package main.facade.subsystemclasses;

/**
 * Implement subsystem functionality.
 * Handle work assigned by the Facade object.
 * Have no knowledge of the facade; that is, they keep no references to it.
 */
public class Token {
	private final long tokenId;

	public Token(long tokenId) {
		this.tokenId = tokenId;
	}
}
