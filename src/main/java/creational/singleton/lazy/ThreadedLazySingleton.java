package creational.singleton.lazy;

public class ThreadedLazySingleton {

    private static ThreadedLazySingleton threadedLazySingleton;
    public static int counter;

    private ThreadedLazySingleton() {
        counter++;
    }

    public static ThreadedLazySingleton getInstance() {

        synchronized (ThreadedLazySingleton.class) {
            if (threadedLazySingleton == null) {
                threadedLazySingleton = new ThreadedLazySingleton();
            }
        }
        return threadedLazySingleton;
    }

}
