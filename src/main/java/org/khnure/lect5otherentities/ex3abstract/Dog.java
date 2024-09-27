package org.khnure.lect5otherentities.ex3abstract;

// Підклас Dog, що наслідується від класу Animal та інтерфейсу SoundMaker
public class Dog extends Animal {

    @Override
    void action() { // Реалізація абстрактного методу action() з класу Animal
        System.out.println("Dog runs.");
    }
}
