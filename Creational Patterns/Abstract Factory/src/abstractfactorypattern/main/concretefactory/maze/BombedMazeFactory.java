package abstractfactorypattern.main.concretefactory.maze;

import abstractfactorypattern.main.abstractfactory.maze.MazeFactory;
import abstractfactorypattern.main.abstractproduct.maze.Room;
import abstractfactorypattern.main.abstractproduct.maze.Wall;
import abstractfactorypattern.main.concreteproduct.maze.bombed.BombedWall;
import abstractfactorypattern.main.concreteproduct.maze.bombed.RoomWithBomb;

public class BombedMazeFactory extends MazeFactory {
	@Override
	public Wall makeWall() {
		return new BombedWall();
	}

	@Override
	public Room makeRoom(int n) {
		return new RoomWithBomb(n);
	}
}
