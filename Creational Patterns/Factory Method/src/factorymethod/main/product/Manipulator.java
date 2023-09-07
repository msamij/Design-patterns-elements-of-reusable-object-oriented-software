package factorymethod.main.product;

/** Defines the interface of objects the factory method creates. */
public abstract class Manipulator {
	public abstract void drag();

	public abstract void upClick();

	public abstract void downClick();
}
