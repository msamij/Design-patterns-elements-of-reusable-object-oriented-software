package component;

/**
 * Declares the interface for objects in the composition.
 * 
 * Implements default behavior for the interface common to all classes, as
 * appropriate.
 * 
 * Declares an interface for accessing and managing its child components.
 * 
 * (Optional) defines an interface for accessing a component's parent in the
 * recursive structure, and implements it if that's appropriate.
 */
public interface Graphic {
	public void draw();

	public default void addGraphic(Graphic graphic) throws UnsupportedOperationException {
		throw new UnsupportedOperationException("Method not implemented in a class.");
	}

	public default void removeGraphic(Graphic graphic) throws UnsupportedOperationException {
		throw new UnsupportedOperationException("Method not implemented in a class.");
	}

	public default Graphic getChild(int childNo) throws UnsupportedOperationException {
		throw new UnsupportedOperationException("Method not implemented in a class.");
	}
}
