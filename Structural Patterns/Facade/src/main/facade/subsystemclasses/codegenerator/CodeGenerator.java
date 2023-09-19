package main.facade.subsystemclasses.codegenerator;

import main.facade.subsystemclasses.Parser;

/**
 * Implement subsystem functionality.
 * Handle work assigned by the Facade object.
 * Have no knowledge of the facade; that is, they keep no references to it.
 */
public abstract class CodeGenerator {
	private final Parser parser;

	public CodeGenerator(Parser parser) {
		this.parser = parser;
	}

	public abstract void generateCode();
}
