package factorymethod.main.concretecreator;

import factorymethod.main.concreteproduct.LineManipulator;
import factorymethod.main.creator.Figure;
import factorymethod.main.product.Manipulator;

/** Overrides the factory method to return an instance of a ConcreteProduct. */
public class LineFigure extends Figure {
	@Override
	public Manipulator createManipulator() {
		return new LineManipulator();
	}
}
