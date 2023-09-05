package main;

import main.factories.BombedMazeFactory;
import main.factories.EnchantedMazeFactory;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
        MazeGame mazeGame = new MazeGame();
        mazeGame.createMaze(new EnchantedMazeFactory());
        mazeGame.createMaze(new BombedMazeFactory());
    }
}
