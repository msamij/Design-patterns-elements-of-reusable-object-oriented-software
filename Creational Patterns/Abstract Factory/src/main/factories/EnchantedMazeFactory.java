package main.factories;

import main.Door;
import main.Room;
import main.enchanted.DoorNeedingSpell;
import main.enchanted.EnchantedRoom;
import main.enchanted.Spell;

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
