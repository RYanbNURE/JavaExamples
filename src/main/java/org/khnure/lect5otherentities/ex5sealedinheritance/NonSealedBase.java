package org.khnure.lect5otherentities.ex5sealedinheritance;

public class NonSealedBase {
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
