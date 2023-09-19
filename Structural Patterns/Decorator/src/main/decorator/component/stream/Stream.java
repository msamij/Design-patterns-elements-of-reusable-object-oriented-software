package main.decorator.component.stream;

import java.util.ArrayList;

public abstract class Stream {
	private final int INT_BUFFER_CAPACITY = 5;
	private final int STRING_BUFFER_CAPACITY = 5;

	private final ArrayList<Integer> intBuffer = new ArrayList<>(5);
	private final ArrayList<String> stringBuffer = new ArrayList<>(5);

	public void putInt(int integer) {
		if (intBuffer.size() == INT_BUFFER_CAPACITY) {
			this.handleBufferFull();
		} else {
			intBuffer.add(integer);
		}
	}

	public void putString(String string) {
		if (stringBuffer.size() == STRING_BUFFER_CAPACITY) {
			this.handleBufferFull();
		} else {
			stringBuffer.add(string);
		}
	}

	public abstract void handleBufferFull();
}
