package creational.singleton.lazy;

public class ThreadedLazySingletonApp extends Thread {

    public static void main(String[] args) {

        ThreadedLazySingleton singleton;

        for (int i = 0; i < 10000; i++) {
            new ThreadedLazySingletonApp().start();
        }

        System.out.println("Total Number of Objects: " + ThreadedLazySingleton.counter);

    }

    @Override
    public void run() {
        ThreadedLazySingleton singleton = ThreadedLazySingleton.getInstance();
    }

}
