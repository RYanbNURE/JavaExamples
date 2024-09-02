package org.khnure.lect8fucjava.ex1optional;

import java.util.Optional;

//**Description**: Demonstrates the use of `Optional` in a custom class and method signatures.
public class OptionalDemo6 {
    public static void main(String[] args) {
        // Створення екземпляру класу з Optional полем
        ExampleClass example = new ExampleClass("Hello, World!");

        // Отримання значення та виведення
        example.getOptionalValue().ifPresent(System.out::println);
    }
}

class ExampleClass {
    private String value;
    private Optional<String> optionalValue;

    public ExampleClass(String value) {
        this.value = value;
        this.optionalValue = Optional.ofNullable(value);
    }

    public Optional<String> getOptionalValue() {
        return optionalValue;
    }

}
