package main.flyweight;

/**
 * Declares an interface through which flyweights can receive and act on
 * extrinsic state.
 */
public interface Glyph {
	public void draw(int xCoord, int yCoord);
}
