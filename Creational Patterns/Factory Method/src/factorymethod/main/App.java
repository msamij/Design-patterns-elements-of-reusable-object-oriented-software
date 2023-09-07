package factorymethod.main;

import factorymethod.main.concretecreator.LineFigure;
import factorymethod.main.concretecreator.TextFigure;
import factorymethod.main.concretecreator.pizza.NYPizzaStore;
import factorymethod.main.creator.Figure;
import factorymethod.main.creator.pizza.PizzaStore;
import factorymethod.main.product.Manipulator;
import factorymethod.main.product.pizza.Pizza;

public class App {
    public static void main(String[] args) throws Exception {
        Figure textFigure = new TextFigure();
        Figure lineFigure = new LineFigure();

        Manipulator textManipulator = textFigure.createManipulator();
        Manipulator lineManipulator = lineFigure.createManipulator();

        PizzaStore nyStore = new NYPizzaStore();
        Pizza pizza = nyStore.orderPizza("cheese");
    }
}
