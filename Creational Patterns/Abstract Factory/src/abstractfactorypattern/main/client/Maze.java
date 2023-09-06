package abstractfactorypattern.main.client;

import java.util.HashMap;
import java.util.Map;

import abstractfactorypattern.main.abstractproduct.Room;

public class Maze {
	private Map<Integer, Room> rooms;

	public Maze() {
		rooms = new HashMap<>();
	}

	public void addRoom(Room room) {
		rooms.put(room.getRoomNo(), room);
	}

	public Room getRoom(int roomNumber) {
		return rooms.get(roomNumber);
	}
}
