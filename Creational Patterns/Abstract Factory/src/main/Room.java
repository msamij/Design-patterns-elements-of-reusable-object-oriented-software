package main;

public class Room extends MapSite {
	private int roomNo;
	private MapSite[] sides = new MapSite[4];

	public Room(int roomNo) {
		this.roomNo = roomNo;
	}

	public MapSite getSide(Direction direction) {
		// Implement logic to return the corresponding side
		return sides[direction.ordinal()];
	}

	public void setSide(Direction direction, MapSite side) {
		// Implement logic to set the side at the specified direction
		sides[direction.ordinal()] = side;
	}

	@Override
	public void Enter() {
		// Implement Enter method for Room
	}

	public int getRoomNo() {
		return roomNo;
	}

	public MapSite[] getSides() {
		return sides;
	}
}
