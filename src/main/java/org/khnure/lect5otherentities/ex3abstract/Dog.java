package org.khnure.lect5otherentities.ex3abstract;

// Підклас Dog, що наслідується від класу Animal та інтерфейсу SoundMaker
public class Dog extends Animal {
    @Override
    public void makeSound() { // Реалізація методу makeSound() з інтерфейсу SoundMaker
        System.out.println("Woof!");
    }

    @Override
    void action() { // Реалізація абстрактного методу action() з класу Animal
        System.out.println("Dog runs.");
    }
}
