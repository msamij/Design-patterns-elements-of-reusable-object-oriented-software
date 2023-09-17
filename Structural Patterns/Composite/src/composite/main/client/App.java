package client;

import component.Graphic;
import composite.Picture;
import leaf.Line;
import leaf.Rectangle;

public class App {
    public static void main(String[] args) throws Exception {
        Graphic rectangle = new Rectangle();
        Graphic line = new Line();

        rectangle.draw();
        line.draw();

        Graphic picture = new Picture();
        picture.addGraphic(rectangle);
        picture.addGraphic(line);

        picture.draw();
    }
}
