package builderpattern.main.concretebuilder;

import abstractfactorypattern.main.abstractproduct.Direction;
import abstractfactorypattern.main.client.Maze;
import builderpattern.main.builder.MazeBuilder;

public class CountingMazeBuilder implements MazeBuilder {
	private int doors;
	private int rooms;

	public CountingMazeBuilder() {
		doors = 0;
		rooms = 0;
	}

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
		return new Maze();
	}
}
