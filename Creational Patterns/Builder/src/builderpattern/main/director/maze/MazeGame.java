package builderpattern.main.director.maze;

import abstractfactorypattern.main.client.maze.Maze;
import builderpattern.main.builder.maze.MazeBuilder;
import builderpattern.main.concretebuilder.maze.CountingMazeBuilder;

public class MazeGame {
	public Maze createMaze(MazeBuilder builder) {
		builder.buildMaze();
		builder.buildRoom(1);
		builder.buildRoom(2);
		builder.buildDoor(1, 2);
		return builder.getMaze();
	}

	public Maze createStandardMaze(MazeBuilder builder) {
		builder.buildMaze();
		return builder.getMaze();
	}

	public Maze countingMazeBuilder(MazeBuilder builder, int rooms, int doors) {
		builder.buildMaze();
		CountingMazeBuilder countingMazeBuilder = new CountingMazeBuilder();
		countingMazeBuilder.getCounts(rooms, doors);
		return null;
	}
}
