package builderpattern.main.builder.maze;

import abstractfactorypattern.main.client.maze.Maze;

public interface MazeBuilder {
	public Maze getMaze();

	public void buildMaze();

	public void buildRoom(int room);

	public void buildDoor(int roomFrom, int roomTo);
}
