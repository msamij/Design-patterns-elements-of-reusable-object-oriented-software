package bridge.main.concreteimplementor;

import bridge.main.implementor.WindowImp;

/**
 * Implements the Implementor interface and defines its concrete implementation.
 */
public class PmWindowImp implements WindowImp {
	@Override
	public void devDrawLine() {
		System.out.println("Line drawn on PmWindow system.");
	}

	@Override
	public void devDrawText() {
		System.out.println("Text drawn on PmWindow system.");
	}
}
