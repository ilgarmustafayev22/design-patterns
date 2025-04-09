package creational.singleton.lazy;

public class LazySingleton {

    private static LazySingleton singleton;

    private LazySingleton() {
        System.out.println("An object of LazySingleton class is created.");
    }

    public static LazySingleton getInstance() {
        if (singleton == null) {
            singleton = new LazySingleton();
        }
        return singleton;
    }

}
