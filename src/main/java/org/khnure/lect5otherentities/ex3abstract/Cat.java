package org.khnure.lect5otherentities.ex3abstract;

// Підклас Cat, що наслідується від класу Animal та інтерфейсу SoundMaker
public class Cat extends Animal {
    @Override
    public void makeSound() { // Реалізація методу makeSound() з інтерфейсу SoundMaker
        System.out.println("Meow!");
    }

    @Override
    void action() { // Реалізація абстрактного методу action() з класу Animal
        System.out.println("Cat jumps.");
    }
}
