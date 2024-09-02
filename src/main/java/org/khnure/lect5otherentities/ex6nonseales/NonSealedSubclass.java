package org.khnure.lect5otherentities.ex6nonseales;

// Клас, який наслідується від базового несеалайзованого класу
public non-sealed class NonSealedSubclass extends NonSealedBase { // non-sealed ключове слово дозволяє іншим класам наслідуватися від цього класу
    // Змінна для зберігання значення підкласу
    private int subclassValue;

    // Конструктор класу
    public NonSealedSubclass(int baseValue, int subclassValue) {
        super(baseValue);
        this.subclassValue = subclassValue;
    }

    // Метод для отримання значення підкласу
    public int getSubclassValue() {
        return subclassValue;
    }

}
