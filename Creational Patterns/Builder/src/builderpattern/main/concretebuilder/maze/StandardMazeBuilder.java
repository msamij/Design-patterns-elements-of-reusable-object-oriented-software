package builderpattern.main.concretebuilder.maze;

import abstractfactorypattern.main.abstractproduct.maze.Direction;
import abstractfactorypattern.main.abstractproduct.maze.Door;
import abstractfactorypattern.main.abstractproduct.maze.Room;
import abstractfactorypattern.main.abstractproduct.maze.Wall;
import abstractfactorypattern.main.client.maze.Maze;
import builderpattern.main.builder.maze.MazeBuilder;

public class StandardMazeBuilder implements MazeBuilder {
	private Maze currentMaze = null;

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
