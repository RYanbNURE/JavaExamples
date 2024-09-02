package org.khnure.lect8fucjava.ex1optional;

import java.util.Optional;

//**Description**: Demonstrates the use of `Optional` for filtering and transforming values.
public class OptionalDemo8 {
    public static void main(String[] args) {
        // Створення Optional зі значенням
        Optional<String> optional = Optional.of("Hello, World!");

        // Фільтрація та трансформація значень в Optional
        optional.filter(s -> s.contains("Hello"))
                .map(String::toUpperCase)
                .ifPresent(System.out::println);
    }
}
