package bridge.main.abstraction;

import bridge.main.implementor.WindowImp;

/**
 * Defines the abstraction's interface.
 * Maintains a reference to an object of type Implementor.
 */
public abstract class Window {
	protected WindowImp windowImplementor;

	public Window(WindowImp windowImplementor) {
		this.windowImplementor = windowImplementor;
	}

	public abstract void drawText();

	public abstract void drawRect();
}
