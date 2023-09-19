package main.decorator.decorator.stream;

import main.decorator.component.stream.Stream;

public class StreamDecorator extends Stream {
	protected Stream stream;

	public StreamDecorator(Stream stream) {
		this.stream = stream;
	}

	@Override
	public void handleBufferFull() {
		stream.handleBufferFull();
	}
}
