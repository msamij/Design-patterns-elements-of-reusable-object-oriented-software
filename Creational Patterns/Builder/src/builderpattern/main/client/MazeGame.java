package builderpattern.main.client;

import abstractfactorypattern.main.client.Maze;
import builderpattern.main.builder.MazeBuilder;
import builderpattern.main.concretebuilder.CountingMazeBuilder;
import builderpattern.main.concretebuilder.StandardMazeBuilder;

public class MazeGame {
	public Maze createMaze(MazeBuilder builder) {
		builder.buildMaze();
		builder.buildRoom(1);
		builder.buildRoom(2);
		builder.buildDoor(1, 2);
		return builder.getMaze();
	}

	public void createStandardMaze(MazeBuilder builder) {
		Maze maze;
		MazeGame game = new MazeGame();
		game.createMaze(new StandardMazeBuilder());
		maze = builder.getMaze();
	}

	public void countingMazeBuilder(MazeBuilder builder) {
		int rooms = 0, doors = 0;
		MazeGame game = new MazeGame();
		game.createMaze(builder);
		CountingMazeBuilder countingMazeBuilder = new CountingMazeBuilder();
		countingMazeBuilder.getCounts(rooms, doors);
	}
}
