package factorymethod.main.concreteproduct.pizza;

import factorymethod.main.product.pizza.Pizza;

/** Implements the Product interface. */
public class NYStyleCheesePizza extends Pizza {
	public NYStyleCheesePizza() {
		name = "NY Style Sauce and Cheese Pizza";
		dough = "Thin Crust Dough";
		sauce = "Marinara Sauce";
		toppings.add("Grated Reggiano Cheese");
	}
}
