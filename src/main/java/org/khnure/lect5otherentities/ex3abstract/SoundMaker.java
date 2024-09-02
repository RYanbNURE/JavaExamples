package org.khnure.lect5otherentities.ex3abstract;

// Інтерфейс SoundMaker визначає метод makeSound()
public interface SoundMaker {
    void makeSound(); // Метод для виробництва звуку

    // Default метод, який може реалізувати будь-яка клас, що їм наслідується
    default void describeSound() {
        System.out.println("Produces a unique sound.");
    }
}
