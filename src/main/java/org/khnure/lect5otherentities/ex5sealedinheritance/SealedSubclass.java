package org.khnure.lect5otherentities.ex5sealedinheritance;

// Клас, який наслідується від базового несеалайзованого класу
public sealed class SealedSubclass extends NonSealedBase permits SealedChild {
    // Змінна для зберігання значення підкласу
    private int subclassValue;

    // Конструктор класу
    public SealedSubclass(int baseValue, int subclassValue) {
        super(baseValue);
        this.subclassValue = subclassValue;
    }

    // Метод для отримання значення підкласу
    public int getSubclassValue() {
        return subclassValue;
    }
}
