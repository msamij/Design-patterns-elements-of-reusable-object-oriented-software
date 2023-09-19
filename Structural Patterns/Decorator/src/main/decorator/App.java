package main.decorator;

import main.decorator.component.VisualComponent;
import main.decorator.component.stream.Stream;
import main.decorator.concretecomponent.TextView;
import main.decorator.concretecomponent.stream.FileStream;
import main.decorator.concretedecorator.BorderDecorator;
import main.decorator.concretedecorator.stream.Ascii7Stream;
import main.decorator.concretedecorator.stream.CompressionStream;

public class App {
    public static void main(String[] args) throws Exception {
        VisualComponent textView = new TextView();

        VisualComponent borderedTextView = new BorderDecorator(textView, 10);
        borderedTextView.draw();

        Stream aStream = new CompressionStream(new Ascii7Stream(new FileStream("text.txt")));
        aStream.putInt(1);
        aStream.putInt(2);
        aStream.putInt(3);
        aStream.putInt(4);
        aStream.putInt(5);
        aStream.putInt(6);
    }
}
