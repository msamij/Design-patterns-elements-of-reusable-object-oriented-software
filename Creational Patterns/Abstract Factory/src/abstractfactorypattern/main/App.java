package abstractfactorypattern.main;

import abstractfactorypattern.main.client.Widget;
import abstractfactorypattern.main.client.maze.MazeGame;
import abstractfactorypattern.main.concretefactory.MotifWidgetFactory;
import abstractfactorypattern.main.concretefactory.PmWidgetFactory;
import abstractfactorypattern.main.concretefactory.maze.BombedMazeFactory;
import abstractfactorypattern.main.concretefactory.maze.EnchantedMazeFactory;

public class App {
    public static void main(String[] args) throws Exception {
        MazeGame mazeGame = new MazeGame();
        mazeGame.createMaze(new EnchantedMazeFactory());
        mazeGame.createMaze(new BombedMazeFactory());

        Widget widget = new Widget();
        widget.createUserInterface(new MotifWidgetFactory());
        widget.createUserInterface(new PmWidgetFactory());
    }
}
