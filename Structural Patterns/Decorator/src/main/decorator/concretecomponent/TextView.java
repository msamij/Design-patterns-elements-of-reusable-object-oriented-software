package main.decorator.concretecomponent;

import main.decorator.component.VisualComponent;

/** Defines an object to which additional responsibilities can be attached. */
public class TextView implements VisualComponent {
	@Override
	public void draw() {
		System.out.println("Simple text view drawn.");
	}

	@Override
	public void resize() {
		System.out.println("Resizing simple text view.");
	}
}
