package abstractfactorypattern.main.concretefactory;

import abstractfactorypattern.main.abstractfactory.MazeFactory;
import abstractfactorypattern.main.abstractproduct.Room;
import abstractfactorypattern.main.abstractproduct.Wall;
import abstractfactorypattern.main.concreteproduct.bombed.BombedWall;
import abstractfactorypattern.main.concreteproduct.bombed.RoomWithBomb;

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
