package abstractfactorypattern.main.concreteproduct;

import abstractfactorypattern.main.abstractproduct.ScrollBar;

/**
 * Defines a product object to be created by the corresponding concrete factory.
 * implements the AbstractProduct interface.
 */
public class PmScrollBar extends ScrollBar {
	@Override
	public ScrollBar createScrollBar() {
		return new PmScrollBar();
	}
}
