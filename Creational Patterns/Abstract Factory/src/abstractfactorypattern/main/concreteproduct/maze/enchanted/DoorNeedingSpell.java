package abstractfactorypattern.main.concreteproduct.maze.enchanted;

import abstractfactorypattern.main.abstractproduct.maze.Door;
import abstractfactorypattern.main.abstractproduct.maze.Room;

public class DoorNeedingSpell extends Door {
	public DoorNeedingSpell(Room room1, Room room2) {
		super(room1, room2);
	}
}
