package prototype.main.client;

import prototype.main.prototype.Graphic;

/** Creates a new object by asking a prototype to clone itself. */
public class GraphicTool extends Tool {
	private final Graphic prototype;

	public GraphicTool(Graphic prototype) {
		this.prototype = prototype;
	}

	public Graphic createGraphic() {
		return prototype.clone();
	}

	@Override
	public void manipulate() {
		System.out.println("Manipulating graphic tool");
	}
}