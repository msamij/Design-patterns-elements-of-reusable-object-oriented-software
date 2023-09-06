package abstractfactorypattern.main.concretefactory;

import abstractfactorypattern.main.abstractfactory.WidgetFactory;
import abstractfactorypattern.main.concreteproduct.PmScrollBar;
import abstractfactorypattern.main.concreteproduct.PmWindow;

/** Implements the operations to create concrete product objects. */
public class PmWidgetFactory implements WidgetFactory {
	@Override
	public PmScrollBar createScrollBar() {
		return new PmScrollBar();
	}

	@Override
	public PmWindow createWindow() {
		return new PmWindow();
	}
}
