package abstractfactorypattern.main.client;

import abstractfactorypattern.main.abstractfactory.WidgetFactory;

/**
 * Uses only interfaces declared by AbstractFactory and AbstractProduct
 * classes.
 */
public class Widget {
	public void createUserInterface(WidgetFactory widgetFactory) {
		widgetFactory.createScrollBar();
		widgetFactory.createWindow();
	}
}
