package prototype.main.concreteprototype;

import prototype.main.prototype.Graphic;

/** Implements an operation for cloning itself. */
public class Note extends Graphic {
	private final String noteType;
	private final int pitch;
	private final int duration;

	public Note(String noteType, int pitch, int duration) {
		this.noteType = noteType;
		this.pitch = pitch;
		this.duration = duration;
	}

	@Override
	public Graphic clone() {
		return new Note(this.noteType, this.pitch, this.duration);
	}

	@Override
	public void draw() {
		System.out.println("Drawing note: " + noteType + " with pitch: " + this.pitch + " and duration: "
				+ this.duration);
	}
}