package factorymethod.main.concreteproduct.pizza;

import factorymethod.main.product.pizza.Pizza;

/** Implements the Product interface. */
public class NYStyleVeggiePizza extends Pizza {
	public NYStyleVeggiePizza() {
		name = "NY Style Sauce and Veggie Pizza";
		dough = "Thin Crust Dough";
		sauce = "Best Sauce";
		toppings.add("Onions");
	}
}
