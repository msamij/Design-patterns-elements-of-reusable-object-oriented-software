package target;

import factorymethod.main.product.Manipulator;

/** Defines the domain-specific interface that Client uses. */
public interface Shape {
	public void boundingBox(int width, int height);

	public Manipulator createManipulator();
}
