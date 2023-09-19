package main.decorator.concretecomponent.stream;

import main.decorator.component.stream.Stream;

public class FileStream extends Stream {
	public FileStream(String fileName) {
	}

	@Override
	public void handleBufferFull() {
		System.out.println("Transfering data to file.");
	}
}
