package singleton.main;

public class App {
    public static void main(String[] args) throws Exception {
        Singleton instance1 = Singleton.createInstance();
        Singleton instance2 = Singleton.createInstance();
    }
}
