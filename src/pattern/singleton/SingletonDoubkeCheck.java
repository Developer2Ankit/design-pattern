package pattern.singleton;

public class SingletonDoubkeCheck {

    //Eagerly creating singleton class
   // private static Singleton uniqueInstance = new Singleton();

    private volatile static SingletonDoubkeCheck uniqueInstance;
    String name;

    private SingletonDoubkeCheck() {
    }

    //Double-Check locking.
    public static SingletonDoubkeCheck getInstance() {
        if (uniqueInstance == null) {
            synchronized (SingletonDoubkeCheck.class) {
                if (uniqueInstance == null) {
                    uniqueInstance = new SingletonDoubkeCheck();
                }
            }
        }

        return uniqueInstance;
    }
}
