package creational.singleton.lazy;

public class LazySingletonApp {

    public static void main(String[] args) {

        LazySingleton singleton1 = LazySingleton.getInstance().getInstance();
        LazySingleton singleton2 = LazySingleton.getInstance();

        if (singleton1 == singleton2) {
            System.out.println("These objects are the same as each other");
        } else {
            System.out.println("These objects are different from each other");
        }
    }

}
