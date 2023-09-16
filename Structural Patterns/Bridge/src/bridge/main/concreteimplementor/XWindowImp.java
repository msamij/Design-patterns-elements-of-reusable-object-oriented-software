package bridge.main.concreteimplementor;

import bridge.main.implementor.WindowImp;

/**
 * Implements the Implementor interface and defines its concrete implementation.
 */
public class XWindowImp implements WindowImp {
	@Override
	public void devDrawLine() {
		System.out.println("Line drawn on XWindow system.");
	}

	@Override
	public void devDrawText() {
		System.out.println("Text drawn on XWindow system.");
	}
}
