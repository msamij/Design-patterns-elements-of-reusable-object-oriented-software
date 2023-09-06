package builderpattern.main.concretebuilder;

import java.util.HashMap;

import abstractfactorypattern.main.abstractproduct.Direction;
import abstractfactorypattern.main.abstractproduct.Door;
import abstractfactorypattern.main.abstractproduct.Room;
import abstractfactorypattern.main.abstractproduct.Wall;
import abstractfactorypattern.main.client.Maze;
import builderpattern.main.builder.MazeBuilder;

public class StandardMazeBuilder implements MazeBuilder {
	private Maze currentMaze;
	private HashMap<Integer, Room> rooms;

	public StandardMazeBuilder() {
		currentMaze = null;
		rooms = new HashMap<>();
	}

	@Override
	public void buildMaze() {
		currentMaze = new Maze();
	}

	@Override
	public void buildRoom(int roomNumber) {
		if (currentMaze.getRoom(roomNumber) != null) {
			Room room = new Room(roomNumber);
			currentMaze.addRoom(room);
			room.setSide(Direction.North, new Wall());
			room.setSide(Direction.South, new Wall());
			room.setSide(Direction.East, new Wall());
			room.setSide(Direction.West, new Wall());
		}
	}

	@Override
	public void buildDoor(int roomFrom, int roomTo) {
		Room r1 = currentMaze.getRoom(roomFrom);
		Room r2 = currentMaze.getRoom(roomTo);
		Door d = new Door(r1, r2);
		r1.setSide(commonWall(r1, r2), d);
		r2.setSide(commonWall(r2, r1), d);
	}

	@Override
	public Maze getMaze() {
		return currentMaze;
	}

	private Direction commonWall(Room room1, Room room2) {
		return Direction.North;
	}
}
