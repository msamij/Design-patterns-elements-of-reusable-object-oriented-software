package main.facade;

import main.facade.subsystemclasses.Parser;
import main.facade.subsystemclasses.ProgramNodeBuilder;
import main.facade.subsystemclasses.Scanner;
import main.facade.subsystemclasses.codegenerator.CodeGenerator;
import main.facade.subsystemclasses.codegenerator.RiscCodeGenerator;

/**
 * Knows which subsystem classes are responsible for a request.
 * Delegates client requests to appropriate subsystem objects.
 */
public class Compiler {
	public void compile() {
		Scanner scanner = new Scanner("input");
		ProgramNodeBuilder builder = new ProgramNodeBuilder();
		Parser parser = new Parser();
		parser.parse(scanner, builder);
		CodeGenerator riscCodeGenerator = new RiscCodeGenerator(parser);
		riscCodeGenerator.generateCode();
	}
}
