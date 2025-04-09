package creational.singleton.early;

public class EarlySingleton {

    private static EarlySingleton earlySingleton = new EarlySingleton();

    private EarlySingleton() {
        System.out.println("An object of EarlySingleton class is created.");
    }

    public static EarlySingleton getInstance() {
        return earlySingleton;
    }

}
