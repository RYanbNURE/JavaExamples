package org.khnure.lect8fucjava.ex1optional;

import java.util.Optional;

//**Description**: Demonstrates using `Optional` with lambda expressions for concise code.
public class OptionalDemo3 {
    public static void main(String[] args) {
        // Створення Optional зі значенням
        Optional<String> optional = Optional.of("Hello, World!");

        // Використання методу orElse для надання альтернативного значення
        String value = optional.orElse("Default Value");
        System.out.println("Значення: " + value);
    }
}
