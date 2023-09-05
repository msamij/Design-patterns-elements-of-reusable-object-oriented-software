package builderpattern.main.client;

import abstractfactorypattern.main.client.Maze;
import builderpattern.main.mazebuilder.MazeBuilder;

public class MazeGame {
	public Maze createMaze(MazeBuilder builder) {
		builder.buildMaze();
		builder.buildRoom(1);
		builder.buildRoom(2);
		builder.buildDoor(1, 2);
		return builder.getMaze();
	}
}
