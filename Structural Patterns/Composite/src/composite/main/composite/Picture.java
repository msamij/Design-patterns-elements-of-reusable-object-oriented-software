package composite;

import java.util.ArrayList;
import java.util.List;

import component.Graphic;

/**
 * Defines behavior for components having children.
 * Stores child components.
 * Implements child-related operations in the Component interface.
 */
public class Picture implements Graphic {
	private final List<Graphic> graphics = new ArrayList<>();

	@Override
	public void addGraphic(Graphic graphic) throws UnsupportedOperationException {
		this.graphics.add(graphic);
	}

	@Override
	public void draw() {
		for (Graphic graphic : graphics) {
			graphic.draw();
		}
	}

	@Override
	public Graphic getChild(int childNo) {
		return graphics.get(childNo);
	}

	@Override
	public void removeGraphic(Graphic graphic) throws UnsupportedOperationException {
		graphics.remove(graphic);
	}
}
