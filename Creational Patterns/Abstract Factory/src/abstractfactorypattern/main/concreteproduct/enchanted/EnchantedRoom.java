package abstractfactorypattern.main.concreteproduct.enchanted;

import abstractfactorypattern.main.abstractproduct.Room;

public class EnchantedRoom extends Room {
	public EnchantedRoom(int roomNo, Spell spell) {
		super(roomNo);
	}
}
