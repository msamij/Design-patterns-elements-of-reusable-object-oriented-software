package main.factories;

import main.Door;
import main.Maze;
import main.Room;
import main.Wall;

public abstract class MazeFactory {
	public MazeFactory() {
	}

	public Maze makeMaze() {
		return new Maze();
	}

	public Wall makeWall() {
		return new Wall();
	}

	public Room makeRoom(int n) {
		return new Room(n);
	}

	public Door makeDoor(Room room1, Room room2) {
		return new Door(room1, room2);
	}
}
