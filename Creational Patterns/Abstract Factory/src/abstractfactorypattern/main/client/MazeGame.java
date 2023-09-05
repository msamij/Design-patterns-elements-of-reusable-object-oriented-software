package abstractfactorypattern.main.client;

import abstractfactorypattern.main.abstractfactory.MazeFactory;
import abstractfactorypattern.main.abstractproduct.Direction;
import abstractfactorypattern.main.abstractproduct.Door;
import abstractfactorypattern.main.abstractproduct.Room;
import abstractfactorypattern.main.abstractproduct.Wall;

public class MazeGame {
	public Maze createMaze() {
		Maze aMaze = new Maze();
		Room rl = new Room(1);
		Room r2 = new Room(2);
		Door theDoor = new Door(rl, r2);

		aMaze.addRoom(rl);
		aMaze.addRoom(r2);

		rl.setSide(Direction.North, new Wall());
		rl.setSide(Direction.East, theDoor);
		rl.setSide(Direction.South, new Wall());
		rl.setSide(Direction.West, new Wall());

		r2.setSide(Direction.North, new Wall());
		r2.setSide(Direction.East, new Wall());
		r2.setSide(Direction.South, new Wall());
		r2.setSide(Direction.West, theDoor);
		return aMaze;
	}

	public Maze createMaze(MazeFactory factory) {
		Maze aMaze = factory.makeMaze();
		Room r1 = factory.makeRoom(1);
		Room r2 = factory.makeRoom(2);
		Door aDoor = factory.makeDoor(r1, r2);

		aMaze.addRoom(r1);
		aMaze.addRoom(r2);

		r1.setSide(Direction.North, factory.makeWall());
		r1.setSide(Direction.East, aDoor);
		r1.setSide(Direction.South, factory.makeWall());
		r1.setSide(Direction.West, factory.makeWall());

		r2.setSide(Direction.North, factory.makeWall());
		r2.setSide(Direction.East, factory.makeWall());
		r2.setSide(Direction.South, factory.makeWall());
		r2.setSide(Direction.West, aDoor);
		return aMaze;
	}

	public Maze createEnchantedMaze(MazeFactory factory) {
		Maze aMaze = factory.makeMaze();
		Room r1 = factory.makeRoom(1);
		Room r2 = factory.makeRoom(2);
		Door aDoor = factory.makeDoor(r1, r2);

		aMaze.addRoom(r1);
		aMaze.addRoom(r2);

		r1.setSide(Direction.North, factory.makeWall());
		r1.setSide(Direction.East, aDoor);
		r1.setSide(Direction.South, factory.makeWall());
		r1.setSide(Direction.West, factory.makeWall());

		r2.setSide(Direction.North, factory.makeWall());
		r2.setSide(Direction.East, factory.makeWall());
		r2.setSide(Direction.South, factory.makeWall());
		r2.setSide(Direction.West, aDoor);
		return aMaze;
	}
}
