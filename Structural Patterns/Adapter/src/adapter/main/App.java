import adapter.TextShape;
import factorymethod.main.product.Manipulator;
import target.Shape;

public class App {
    public static void main(String[] args) throws Exception {
        Shape textShape = new TextShape();
        textShape.boundingBox(10, 500);
        Manipulator textManipulator = textShape.createManipulator();
        textManipulator.drag();
    }
}
