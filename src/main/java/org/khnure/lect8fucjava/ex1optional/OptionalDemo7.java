package org.khnure.lect8fucjava.ex1optional;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

//**Description**: Demonstrates the use of `Optional` for handling potential null values in collections.
public class OptionalDemo7 {
    public static void main(String[] args) {
        // Створення списку зі значеннями та null
        List<String> strings = Stream.of("Hello", null, "World").collect(Collectors.toList());

        // Використання Optional для обробки потенційних null значень
        strings.stream().map(s -> Optional.ofNullable(s)).forEach(o -> o.ifPresentOrElse(System.out::println, () -> System.out.println("Null value")));
    }
}
