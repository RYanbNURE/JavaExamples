package org.khnure.lect5otherentities.ex4sealed;

public sealed class Monkey extends Animal permits Gorilla  {

    @Override
    void makeSound() {

    }
}
