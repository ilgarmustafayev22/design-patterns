package creational.singleton.early;

public class EarlySingletonApp {

    public static void main(String[] args) {

        EarlySingleton singleton1 = EarlySingleton.getInstance();
        EarlySingleton singleton2 = EarlySingleton.getInstance();

        if (singleton1 == singleton2) {
            System.out.println("These objects are the same as each other");
        } else {
            System.out.println("These objects are different from each other");
        }

    }

}
