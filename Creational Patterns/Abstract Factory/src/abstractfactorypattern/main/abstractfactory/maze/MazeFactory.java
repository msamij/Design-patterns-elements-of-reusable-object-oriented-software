package abstractfactorypattern.main.abstractfactory.maze;

import abstractfactorypattern.main.abstractproduct.maze.Door;
import abstractfactorypattern.main.abstractproduct.maze.Room;
import abstractfactorypattern.main.abstractproduct.maze.Wall;
import abstractfactorypattern.main.client.maze.Maze;

public abstract class MazeFactory {
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
