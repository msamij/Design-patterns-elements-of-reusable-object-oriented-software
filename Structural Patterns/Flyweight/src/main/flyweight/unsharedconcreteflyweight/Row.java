package main.flyweight.unsharedconcreteflyweight;

import main.flyweight.Glyph;

/**
 * Not all Flyweight subclasses need to be shared. The Flyweight interface
 * enables sharing it doesn't enforce it. It's common for UnsharedConcrete
 * flyweight objects to have ConcreteFlyweight objects as children at some level
 * in the flyweight object structure (as the Row and Column classes have).
 */
public class Row implements Glyph {
	private final Glyph glyph;

	public Row(Glyph glyph) {
		this.glyph = glyph;
	}

	@Override
	public void draw(int xCoord, int yCoord) {
		System.out.println("Drawing row on x:" + xCoord + " and y:" + yCoord);
		glyph.draw(xCoord, yCoord);
	}
}
