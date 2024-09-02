package org.khnure.lect5otherentities.ex4sealed;

// Несеaled підклас Cat, що наслідується від класу Animal
public non-sealed class Cat extends Animal {
    // Реалізація абстрактного методу makeSound() для кота
    @Override
    public void makeSound() {
        System.out.println("Meow!");
    }
}
