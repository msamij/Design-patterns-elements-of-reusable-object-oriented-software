package bridge.main;

import bridge.main.abstraction.Window;
import bridge.main.concreteimplementor.PmWindowImp;
import bridge.main.concreteimplementor.XWindowImp;
import bridge.main.implementor.WindowImp;
import bridge.main.redefinedabstraction.IconWindow;

public class App {
    public static void main(String[] args) throws Exception {
        WindowImp xWindowImp = new XWindowImp();
        WindowImp pmWindowImp = new PmWindowImp();

        Window xIconWindow = new IconWindow(xWindowImp);
        Window pmIconWindow = new IconWindow(pmWindowImp);
        xIconWindow.drawText();
        pmIconWindow.drawRect();
    }
}
