package factorymethod.main.creator.pizza;

import factorymethod.main.product.pizza.Pizza;

public abstract class PizzaStore {
	public Pizza orderPizza(String type) {
		Pizza pizza;

		pizza = createPizza(type);

		pizza.prepare();
		pizza.bake();
		pizza.cut();
		pizza.box();
		return pizza;
	}

	public abstract Pizza createPizza(String type);
}
