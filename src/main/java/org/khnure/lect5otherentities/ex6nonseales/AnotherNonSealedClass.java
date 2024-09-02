package org.khnure.lect5otherentities.ex6nonseales;

// Клас, який наслідується від несеалайзованого класу
public final class AnotherNonSealedClass extends NonSealedBase {
    // Змінна для зберігання значення іншого підкласу
    private int anotherSubclassValue;

    // Конструктор класу
    public AnotherNonSealedClass(int baseValue, int anotherSubclassValue) {
        super(baseValue);
        this.anotherSubclassValue = anotherSubclassValue;
    }

    // Метод для отримання значення іншого підкласу
    public int getAnotherSubclassValue() {
        return anotherSubclassValue;
    }
}
