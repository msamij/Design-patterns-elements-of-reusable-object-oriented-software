package main.flyweight.client;

import main.flyweight.Glyph;
import main.flyweight.flyweightfactory.FlyweightFactory;
import main.flyweight.unsharedconcreteflyweight.Row;

/**
 * Maintains a reference to flyweight. Computes or stores the extrinsic state of
 * flyweights.
 */
public class TextEditor {
	private final FlyweightFactory flyweightFactory;

	public TextEditor(FlyweightFactory flyweightFactory) {
		this.flyweightFactory = flyweightFactory;
	}

	public void draw(char characterCode, String characterColor, int xCoord, int yCoord) {
		Glyph character = flyweightFactory.getFlyweight(characterCode, characterColor);
		Glyph row = new Row(character);
		row.draw(xCoord, yCoord);
	}
}
