package bridge.main.implementor;

/**
 * Defines the interface for implementation classes. This interface doesn't have
 * to correspond exactly to Abstraction's interface; in fact the two interfaces
 * can be quite different. Typically the Implementor interface provides only
 * primitive operations, and Abstraction defines higher-level operations based
 * on these primitives.
 */
public interface WindowImp {
	public void devDrawText();

	public void devDrawLine();
}
