package abstractfactorypattern.main.concreteproduct.enchanted;

import abstractfactorypattern.main.abstractproduct.Door;
import abstractfactorypattern.main.abstractproduct.Room;

public class DoorNeedingSpell extends Door {
	public DoorNeedingSpell(Room room1, Room room2) {
		super(room1, room2);
	}
}
