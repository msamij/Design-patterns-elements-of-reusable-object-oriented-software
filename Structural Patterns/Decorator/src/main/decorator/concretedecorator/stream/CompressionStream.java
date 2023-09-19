package main.decorator.concretedecorator.stream;

import main.decorator.component.stream.Stream;
import main.decorator.decorator.stream.StreamDecorator;

public class CompressionStream extends StreamDecorator {

	public CompressionStream(Stream stream) {
		super(stream);
	}

	@Override
	public void handleBufferFull() {
		compressStream();
		super.handleBufferFull();
	}

	private void compressStream() {
		System.out.println("stream compressesd");
	}
}
