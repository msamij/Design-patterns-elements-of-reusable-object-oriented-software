package main.facade.subsystemclasses;

/**
 * Implement subsystem functionality.
 * Handle work assigned by the Facade object.
 * Have no knowledge of the facade; that is, they keep no references to it.
 */
public class Scanner {
	private final Token token = new Token(1000);
	private final String input;

	public Scanner(String input) {
		this.input = input;
	}

	public void produceToken() {
		System.out.println("Token created and returned");
	}

}
