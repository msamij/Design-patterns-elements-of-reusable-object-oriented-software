package main.decorator;

import main.decorator.component.VisualComponent;
import main.decorator.concretecomponent.TextView;
import main.decorator.concretedecorator.BorderDecorator;

public class App {
    public static void main(String[] args) throws Exception {
        VisualComponent textView = new TextView();

        VisualComponent borderedTextView = new BorderDecorator(textView, 10);
        borderedTextView.draw();
    }
}
