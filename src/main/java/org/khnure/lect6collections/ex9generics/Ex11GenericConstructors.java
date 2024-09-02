package org.khnure.lect6collections.ex9generics;

//Generic Constructors
public class Ex11GenericConstructors {
    private <T> Ex11GenericConstructors(T t) {
        System.out.println(t); // Друкуємо значення T
    }

    public static void main(String[] args) {
        new Ex11GenericConstructors("Hello World");
        new Ex11GenericConstructors(100);
    }
}
