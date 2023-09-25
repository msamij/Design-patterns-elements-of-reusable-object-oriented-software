package main.flyweight;

import main.flyweight.client.TextEditor;
import main.flyweight.flyweightfactory.FlyweightFactory;

public class App {
    public static void main(String[] args) throws Exception {
        TextEditor textEditor = new TextEditor(new FlyweightFactory());
        textEditor.draw('A', "Red", 20, 10);
        textEditor.draw('A', "Red", 500, 200);
    }
}
