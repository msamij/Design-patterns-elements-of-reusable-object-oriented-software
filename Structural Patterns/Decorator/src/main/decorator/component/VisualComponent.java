package main.decorator.component;

/**
 * Defines the interface for objects that can have responsibilities added to
 * them dynamically.
 */
public interface VisualComponent {
	void draw();

	void resize();
}
