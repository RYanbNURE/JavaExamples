package org.khnure.lect3oop.ex3polymorphism.ex4generics;

// Клас Box, що реалізує інтерфейс Container для типу Cat
public class Box<T> implements Container<T> {
    private T value;

    // Конструктор класу Box
    public Box(T value) {
        this.value = value;
    }

    // Реалізація методу getValue для типу Cat
    @Override
    public T getValue() {
        return value;
    }
}
