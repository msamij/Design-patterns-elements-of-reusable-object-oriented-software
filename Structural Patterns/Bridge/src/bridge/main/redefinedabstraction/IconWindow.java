package bridge.main.redefinedabstraction;

import bridge.main.abstraction.Window;
import bridge.main.implementor.WindowImp;

/** Extends the interface defined by Abstraction. */
public class IconWindow extends Window {
	public IconWindow(WindowImp windowImp) {
		super(windowImp);
	}

	@Override
	public void drawText() {
		windowImplementor.devDrawText();
	}

	@Override
	public void drawRect() {
		windowImplementor.devDrawLine();
	}
}
