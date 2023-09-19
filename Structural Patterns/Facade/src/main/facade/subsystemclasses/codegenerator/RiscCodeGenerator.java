package main.facade.subsystemclasses.codegenerator;

import main.facade.subsystemclasses.Parser;

/**
 * Implement subsystem functionality.
 * Handle work assigned by the Facade object.
 * Have no knowledge of the facade; that is, they keep no references to it.
 */
public class RiscCodeGenerator extends CodeGenerator {
	public RiscCodeGenerator(Parser parser) {
		super(parser);
	}

	@Override
	public void generateCode() {
		System.out.println("Generating for risc architecture.");
	}
}
