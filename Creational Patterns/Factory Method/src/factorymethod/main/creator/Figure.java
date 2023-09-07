package factorymethod.main.creator;

import factorymethod.main.product.Manipulator;

/**
 * Declares the factory method, which returns an object of type Product. Creator
 * may also define a default implementation of the factory method that returns a
 * default ConcreteProduct object. may call the factory method to create a
 * product object.
 */
public abstract class Figure {
	public abstract Manipulator createManipulator();
}
