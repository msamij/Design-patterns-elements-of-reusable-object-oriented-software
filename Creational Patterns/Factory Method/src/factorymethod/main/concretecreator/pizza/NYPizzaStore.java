package factorymethod.main.concretecreator.pizza;

import factorymethod.main.concreteproduct.pizza.NYStyleCheesePizza;
import factorymethod.main.concreteproduct.pizza.NYStyleVeggiePizza;
import factorymethod.main.creator.pizza.PizzaStore;
import factorymethod.main.product.pizza.Pizza;

/** Overrides the factory method to return an instance of a ConcreteProduct. */
public class NYPizzaStore extends PizzaStore {
	@Override
	public Pizza createPizza(String item) {
		if (item.equals("cheese")) {
			return new NYStyleCheesePizza();
		} else if (item.equals("veggie")) {
			return new NYStyleVeggiePizza();
		} else
			return null;
	}
}
