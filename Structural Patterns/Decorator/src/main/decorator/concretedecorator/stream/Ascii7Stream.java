package main.decorator.concretedecorator.stream;

import main.decorator.component.stream.Stream;
import main.decorator.decorator.stream.StreamDecorator;

public class Ascii7Stream extends StreamDecorator {

	public Ascii7Stream(Stream stream) {
		super(stream);
	}

	@Override
	public void handleBufferFull() {
		toAscii7();
		super.handleBufferFull();
	}

	private void toAscii7() {
		System.out.println("Stream converted to Ascii7");
	}
}
