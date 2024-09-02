package org.khnure.lect5otherentities.ex4sealed;

// Підклас Dog, що наслідується від класу Animal
public final class Dog extends Animal {
    // Реалізація абстрактного методу makeSound() для собаки
    @Override
    public void makeSound() {
        System.out.println("Woof!");
    }
}
