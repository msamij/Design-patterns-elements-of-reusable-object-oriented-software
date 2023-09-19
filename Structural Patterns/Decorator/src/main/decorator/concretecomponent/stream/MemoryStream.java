package main.decorator.concretecomponent.stream;

import main.decorator.component.stream.Stream;

public class MemoryStream extends Stream {
	@Override
	public void handleBufferFull() {
		System.out.println("Transfering data to memory.");
	}
}
