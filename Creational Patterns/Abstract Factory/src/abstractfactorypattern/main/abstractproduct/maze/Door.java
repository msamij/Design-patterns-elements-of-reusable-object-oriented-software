package abstractfactorypattern.main.abstractproduct.maze;

public class Door extends MapSite {
	private Room room1;
	private Room room2;
	private boolean isOpen;

	public Door(Room room1, Room room2) {
		this.room1 = room1;
		this.room2 = room2;
		this.isOpen = false;
	}

	public Room OtherSideFrom(Room currentRoom) {
		if (currentRoom == room1) {
			return room2;
		} else if (currentRoom == room2) {
			return room1;
		} else
			return null;
	}

	@Override
	public void Enter() {
	}

	public boolean isOpen() {
		return isOpen;
	}

	public void setOpen(boolean open) {
		isOpen = open;
	}
}
