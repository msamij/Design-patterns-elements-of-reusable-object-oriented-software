package abstractfactorypattern.main.concreteproduct;

import abstractfactorypattern.main.abstractproduct.Window;

/**
 * Defines a product object to be created by the corresponding concrete factory.
 * implements the AbstractProduct interface.
 */
public class MotifWindow extends Window {
	@Override
	public Window createWindow() {
		return new MotifWindow();
	}
}
