package abstractfactorypattern.main.concretefactory;

import abstractfactorypattern.main.abstractfactory.WidgetFactory;
import abstractfactorypattern.main.concreteproduct.MotifScrollBar;
import abstractfactorypattern.main.concreteproduct.MotifWindow;

/** Implements the operations to create concrete product objects. */
public class MotifWidgetFactory implements WidgetFactory {
	@Override
	public MotifScrollBar createScrollBar() {
		return new MotifScrollBar();
	}

	@Override
	public MotifWindow createWindow() {
		return new MotifWindow();
	}
}
