package main.flyweight.concreteflyweight;

import main.flyweight.Glyph;

/**
 * Implements the Flyweight interface and adds storage for intrinsic state, if
 * any. A ConcreteFlyweight object must be sharable. Any state it stores must be
 * intrinsic that is, it must be independent of the ConcreteFlyweight object's
 * context.
 */
public class Character implements Glyph {
	private final String color;
	private final char characterCode;

	public Character(String color, char characterCode) {
		this.color = color;
		this.characterCode = characterCode;
	}

	@Override
	public void draw(int xCoord, int yCoord) {
		System.out.println("Drawing character " + characterCode + " with a color of " + color +
				" and on x:" + xCoord + " and y:" + yCoord);
	}
}
