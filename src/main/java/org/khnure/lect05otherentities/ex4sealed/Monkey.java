package org.khnure.lect05otherentities.ex4sealed;

public sealed class Monkey extends Animal permits Gorilla  {

    @Override
    void makeSound() {

    }
}
