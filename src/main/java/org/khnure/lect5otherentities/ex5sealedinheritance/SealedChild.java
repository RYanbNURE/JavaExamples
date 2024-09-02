package org.khnure.lect5otherentities.ex5sealedinheritance;

// Дозволений несеалайзований клас, який наслідується від запечатаного класу
public final class SealedChild extends SealedSubclass {
    // Змінна для зберігання значення дочірнього класу
    private int childValue;

    // Конструктор класу
    public SealedChild(int baseValue, int subclassValue, int childValue) {
        super(baseValue, subclassValue);
        this.childValue = childValue;
    }

    // Метод для отримання значення дочірнього класу
    public int getChildValue() {
        return childValue;
    }
}
