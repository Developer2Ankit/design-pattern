package pattern.singleton;

public class EagerlySingleton {

    //Eagerly creating singleton class
    private static EagerlySingleton uniqueInstance = new EagerlySingleton();

    String name;

    private EagerlySingleton() {
    }

    public static EagerlySingleton  getInstance() {
        //Adding the synchronized keyword makes our singleton thread safe. Beware, though!
//        if (uniqueInstance == null) {
//            uniqueInstance = new MyClass();
//        }
        return uniqueInstance;
    }


}
