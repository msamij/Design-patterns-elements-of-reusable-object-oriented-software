package singleton.main;

public class Singleton {
	private static Singleton instance;

	private Singleton() {
	};

	public static Singleton createInstance() {
		if (instance == null)
			instance = new Singleton();
		return instance;
	}
}
