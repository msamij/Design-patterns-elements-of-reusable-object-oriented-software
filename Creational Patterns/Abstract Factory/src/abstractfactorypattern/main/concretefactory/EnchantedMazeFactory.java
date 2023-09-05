package abstractfactorypattern.main.concretefactory;

import abstractfactorypattern.main.abstractfactory.MazeFactory;
import abstractfactorypattern.main.abstractproduct.Door;
import abstractfactorypattern.main.abstractproduct.Room;
import abstractfactorypattern.main.concreteproduct.enchanted.DoorNeedingSpell;
import abstractfactorypattern.main.concreteproduct.enchanted.EnchantedRoom;
import abstractfactorypattern.main.concreteproduct.enchanted.Spell;

public class EnchantedMazeFactory extends MazeFactory {
	@Override
	public Room makeRoom(int n) {
		return new EnchantedRoom(n, castSpell());
	}

	@Override
	public Door makeDoor(Room room1, Room room2) {
		return new DoorNeedingSpell(room1, room2);
	}

	protected Spell castSpell() {
		return new Spell();
	}
}
