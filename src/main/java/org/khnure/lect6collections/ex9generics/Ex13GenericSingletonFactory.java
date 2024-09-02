package org.khnure.lect6collections.ex9generics;

public class Ex13GenericSingletonFactory {
    private static final Ex13GenericSingletonFactory INSTANCE = new Ex13GenericSingletonFactory();

    private Ex13GenericSingletonFactory() {
        // Private constructor
    }

    public static <T> Ex13GenericSingletonFactory getInstance(Class<T> type) {
        return INSTANCE;
    }

    public static void main(String[] args) {
        Ex13GenericSingletonFactory instance = Ex13GenericSingletonFactory.getInstance(Ex13GenericSingletonFactory.class);
        System.out.println(instance); // Друкуємо інстанс singleton
    }
}
