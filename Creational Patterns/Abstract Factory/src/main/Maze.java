package main;

import java.util.HashMap;
import java.util.Map;

public class Maze {
	private Map<Integer, Room> rooms;

	public Maze() {
		rooms = new HashMap<>();
	}

	public void addRoom(Room room) {
		rooms.put(room.getRoomNo(), room);
	}

	public Room roomNo(int roomNumber) {
		return rooms.get(roomNumber);
	}
}
