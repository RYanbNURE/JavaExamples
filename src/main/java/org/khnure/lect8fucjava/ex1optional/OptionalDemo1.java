package org.khnure.lect8fucjava.ex1optional;

import java.util.Optional;
//**Description**: Demonstrates basic usage of `Optional` for checking and retrieving values safely.
public class OptionalDemo1 {
    public static void main(String[] args) {
        // Створення Optional зі значенням
        Optional<String> optional = Optional.of("Hello, World!");

        // Перевірка, чи присутнє значення
        if (optional.isPresent()) {
            // Отримання та виведення значення
            String value = optional.get();
            System.out.println("Значення: " + value);
        }
    }

}
