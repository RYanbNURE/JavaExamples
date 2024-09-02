package org.khnure.lect4classes.ex1static;

// Головний клас, що містить метод main для запуску програми
public class Main {
    public static void main(String[] args) {
        // Створення екземпляру внутрішнього статичного класу
        OuterClass.StaticNestedClass nestedObject = new OuterClass.StaticNestedClass();

        // Виклик методу у внутрішньому статичному класі
        nestedObject.display();
    }
}
