package prototype.main;

import prototype.main.client.GraphicTool;
import prototype.main.concreteprototype.Note;
import prototype.main.prototype.Graphic;

public class App {
    public static void main(String[] args) throws Exception {
        Graphic quarterNotePrototype = new Note("Quarter", 50, 25);
        Graphic halfNotePrototype = new Note("Full", 100, 50);

        GraphicTool quarterNoteTool = new GraphicTool(quarterNotePrototype);
        GraphicTool halfNoteTool = new GraphicTool(halfNotePrototype);

        Graphic note1 = quarterNoteTool.createGraphic();
        Graphic note2 = halfNoteTool.createGraphic();

        note1.draw();
        note2.draw();
    }
}
