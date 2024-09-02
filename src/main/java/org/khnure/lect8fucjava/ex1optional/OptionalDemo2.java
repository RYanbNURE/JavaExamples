package org.khnure.lect8fucjava.ex1optional;

//**Description**: Demonstrates handling the absence of a value using `Optional`.

import java.util.Optional;

public class OptionalDemo2 {
    public static void main(String[] args) {
        // Створення Optional без значення
        Optional<String> optional = Optional.empty();

        // Перевірка, чи присутнє значення, та обробка відсутності
        if (optional.isPresent()) {
            String value = optional.get();
            System.out.println("Значення: " + value);
        } else {
            System.out.println("Значення відсутнє.");
        }
    }
}
