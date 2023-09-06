package abstractfactorypattern.main.concretefactory.maze;

import abstractfactorypattern.main.abstractfactory.maze.MazeFactory;
import abstractfactorypattern.main.abstractproduct.maze.Door;
import abstractfactorypattern.main.abstractproduct.maze.Room;
import abstractfactorypattern.main.concreteproduct.maze.enchanted.DoorNeedingSpell;
import abstractfactorypattern.main.concreteproduct.maze.enchanted.EnchantedRoom;
import abstractfactorypattern.main.concreteproduct.maze.enchanted.Spell;

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
