package adapter;

import adaptee.TextView;
import factorymethod.main.concreteproduct.TextManipulator;
import factorymethod.main.product.Manipulator;
import target.Shape;

/** Adapts the interface of Adaptee to the Target interface. */
public class TextShape extends TextView implements Shape {
	@Override
	public void boundingBox(int width, int height) {
		super.getExtent(0, 0);
	}

	@Override
	public Manipulator createManipulator() {
		return new TextManipulator();
	}
}
