package org.khnure.lect8fucjava.ex1optional;
import java.util.Optional;


//**Description**: Demonstrates the use of `Optional` in method returns to indicate absence of a value.

public class OptionalDemo5 {
    public static Optional<String> findValue(int number) {
        if (number % 2 == 0) {
            return Optional.of("Even Number: " + number);
        } else {
            return Optional.empty();
        }
    }

    public static void main(String[] args) {
        // Виклик методу, який повертає Optional<String>
        Optional<String> result = findValue(4);
        result.ifPresent(System.out::println);
    }

}
