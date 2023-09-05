package builderpattern.main.mazebuilder;

import abstractfactorypattern.main.client.Maze;

public interface MazeBuilder {
	public Maze getMaze();

	public void buildMaze();

	public void buildRoom(int room);

	public void buildDoor(int roomFrom, int roomTo);
}
