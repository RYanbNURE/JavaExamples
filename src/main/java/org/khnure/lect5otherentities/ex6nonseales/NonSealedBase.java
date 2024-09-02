package org.khnure.lect5otherentities.ex6nonseales;

// Базовий клас, який є несеалайзованим (незапечатаним)
public sealed class NonSealedBase permits AnotherNonSealedClass, NonSealedSubclass {
    // Змінна для зберігання значення
    protected int baseValue;

    // Конструктор класу
    public NonSealedBase(int value) {
        this.baseValue = value;
    }

    // Метод для отримання значення
    public int getBaseValue() {
        return baseValue;
    }
}
