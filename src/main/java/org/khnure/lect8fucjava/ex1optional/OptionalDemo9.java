package org.khnure.lect8fucjava.ex1optional;

import java.util.Optional;

//**Description**: Demonstrates the use of `Optional` in a multi-threaded environment.
public class OptionalDemo9 {
    public static void main(String[] args) {
        // Створення та заповнення Optional в різних потоках
        Runnable task = () -> {
            Optional<String> optional = Optional.of("Thread Value");
            optional.ifPresent(System.out::println);
        };

        Thread thread1 = new Thread(task);
        Thread thread2 = new Thread(task);

        thread1.start();
        thread2.start();
    }

}
