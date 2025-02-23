package org.khnure.lect6bcollectionextended.ex7customthreadsafe;

class Singleton {
    private static volatile Singleton instance;
    private static final Object LOCK = new Object();

    private Singleton() {}

    public static Singleton getInstance() {
        if (instance == null) {
            synchronized (LOCK) {
                if (instance == null) {
                    instance = new Singleton();
                }
            }
        }
        return instance;
    }
}

public class Main2 {
public static void main(String[] args) {
    Singleton singleton = Singleton.getInstance();
    System.out.println("Singleton instance: " + singleton);
}
}
// Реалізація потокобезпечного Singleton за допомогою подвійної перевірки блокування.
