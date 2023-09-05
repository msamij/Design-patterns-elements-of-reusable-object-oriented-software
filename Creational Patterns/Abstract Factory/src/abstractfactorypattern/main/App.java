package abstractfactorypattern.main;

import abstractfactorypattern.main.client.MazeGame;
import abstractfactorypattern.main.concretefactory.BombedMazeFactory;
import abstractfactorypattern.main.concretefactory.EnchantedMazeFactory;

public class App {
    public static void main(String[] args) throws Exception {
        MazeGame mazeGame = new MazeGame();
        mazeGame.createMaze(new EnchantedMazeFactory());
        mazeGame.createMaze(new BombedMazeFactory());
    }
}
