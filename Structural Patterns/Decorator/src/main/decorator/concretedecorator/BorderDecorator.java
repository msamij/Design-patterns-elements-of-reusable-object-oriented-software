package main.decorator.concretedecorator;

import main.decorator.component.VisualComponent;
import main.decorator.decorator.Decorator;

/** Adds responsibilities to the component. */
public class BorderDecorator extends Decorator {
	private int borderWidth;

	public BorderDecorator(VisualComponent visualComponent, int borderWidth) {
		super(visualComponent);
		this.borderWidth = borderWidth;
	}

	@Override
	public void draw() {
		super.draw();
		this.drawBorder(borderWidth);
	}

	private void drawBorder(int borderWidth) {
		System.out.println("Border drawn of width: " + borderWidth);
	}
}
