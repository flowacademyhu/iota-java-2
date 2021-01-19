package hu.flowacademy.lecture5.singleton;

public class Singleton {
    private static Singleton singleInstance; // == null

    private Singleton() {

    }

    public static Singleton getInstance() {
        if(singleInstance == null) {
            singleInstance = new Singleton();
        }
        return singleInstance;
    }

    public int add(int a, int b) {
        return a + b;
    }
}
