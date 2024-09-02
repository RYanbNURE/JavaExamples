package org.khnure.lect8fucjava.ex1optional;

//**Description**: Demonstrates the use of `Optional` for handling exceptions and errors gracefully.

import java.util.Optional;
import java.util.function.Supplier;

public class OptionalDemo10 {
    public static void main(String[] args) {
        // Використання Supplier для створення Optional з можливою помилкою
        String result = getSafeValue(() -> "Hello, World!")
                .orElse("Default Value");
        System.out.println("Результат: " + result);
    }

    public static Optional<String> getSafeValue(Supplier<String> supplier) {
        try {
            String value = supplier.get();
            return Optional.of(value);
        } catch (Exception e) {
            return Optional.empty();
        }
    }
}

