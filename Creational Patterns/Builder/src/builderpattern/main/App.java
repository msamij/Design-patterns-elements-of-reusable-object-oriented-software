package builderpattern.main;

import builderpattern.main.concretebuilder.AsciiConverter;
import builderpattern.main.concretebuilder.maze.CountingMazeBuilder;
import builderpattern.main.concretebuilder.maze.StandardMazeBuilder;
import builderpattern.main.director.RtfReader;
import builderpattern.main.director.maze.MazeGame;

public class App {
    public static void main(String[] args) throws Exception {
        MazeGame mazeGame = new MazeGame();
        mazeGame.createMaze(new StandardMazeBuilder());
        mazeGame.createMaze(new CountingMazeBuilder());

        RtfReader rtfReader = new RtfReader(new AsciiConverter());
        rtfReader.parseRtf();
    }
}
