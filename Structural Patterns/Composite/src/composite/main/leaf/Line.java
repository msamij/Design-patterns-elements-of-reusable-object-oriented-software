package leaf;

import component.Graphic;

/**
 * Represents leaf objects in the composition. A leaf has no children.
 * Defines behavior for primitive objects in the composition.
 */
public class Line implements Graphic {
	@Override
	public void draw() {
		System.out.println("Drawing a line.");
	}
}
