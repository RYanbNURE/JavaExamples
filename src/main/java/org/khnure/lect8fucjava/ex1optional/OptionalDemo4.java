package org.khnure.lect8fucjava.ex1optional;

import java.util.Optional;
//**Description**: Demonstrates chaining `Optional` objects for complex operations.
public class OptionalDemo4 {
    public static void main(String[] args) {
        // Створення вкладених Optional
        Optional<String> optional1 = Optional.of("Hello");
        Optional<String> optional2 = Optional.of("World");

        // Ланцюжок операцій з Optional
        String result = optional1.flatMap(s -> optional2.map(s::concat))
                .orElse("Default Concatenation");
        System.out.println("Результат: " + result);
    }

}
