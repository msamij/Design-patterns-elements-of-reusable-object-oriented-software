package builderpattern.main.concretebuilder.maze;

import abstractfactorypattern.main.abstractproduct.maze.Direction;
import abstractfactorypattern.main.client.maze.Maze;
import builderpattern.main.builder.maze.MazeBuilder;

public class CountingMazeBuilder implements MazeBuilder {
	private int doors = 0;
	private int rooms = 0;

	@Override
	public void buildMaze() {
	}

	@Override
	public void buildRoom(int roomNumber) {
		rooms++;
	}

	@Override
	public void buildDoor(int roomFrom, int roomTo) {
		doors++;
	}

	public void addWall(int roomNumber, Direction direction) {
	}

	public void getCounts(int doorsCount, int roomsCount) {
		doorsCount = doors;
		roomsCount = rooms;
	}

	@Override
	public Maze getMaze() {
		return null;
	}
}
