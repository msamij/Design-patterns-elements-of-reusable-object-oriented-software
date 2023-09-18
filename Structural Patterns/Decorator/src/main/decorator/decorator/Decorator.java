package main.decorator.decorator;

import main.decorator.component.VisualComponent;

/**
 * Maintains a reference to a Component object and defines an interface that
 * conforms to Component's interface.
 */
public abstract class Decorator implements VisualComponent {
	protected VisualComponent visualComponent;

	public Decorator(VisualComponent visualComponent) {
		this.visualComponent = visualComponent;
	}

	@Override
	public void draw() {
		this.visualComponent.draw();
	}

	@Override
	public void resize() {
		this.visualComponent.resize();
	}
}
