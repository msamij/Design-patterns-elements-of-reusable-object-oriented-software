package abstractfactorypattern.main.abstractfactory;

import abstractfactorypattern.main.abstractproduct.ScrollBar;
import abstractfactorypattern.main.abstractproduct.Window;

/**
 * Declares an interface for operations that create abstract product objects.
 */
public interface WidgetFactory {
	public abstract Window createWindow();

	public abstract ScrollBar createScrollBar();
}
