package main.factories;

import main.Room;
import main.Wall;
import main.bombed.BombedWall;
import main.bombed.RoomWithBomb;

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
