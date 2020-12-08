package single;

public class Singleton {

    private static volatile Singleton singletonClass;

    private Singleton() {

    }

    public static Singleton getInstance() {
        if (singletonClass == null) {
            synchronized (Singleton.class) {
                if (singletonClass == null) {
                    singletonClass = new Singleton();
                }
            }
        }
        return singletonClass;
    }
}

