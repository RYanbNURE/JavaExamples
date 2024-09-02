package org.khnure.lect6collections.ex9generics;

public interface Ex9GenericInterface<T> {
    T doSomething(T t); // Генеричний метод
}

class GenericClass implements Ex9GenericInterface<String> {
    @Override
    public String doSomething(String t) {
        return "Hello, " + t; // Операція над String
    }

    public static void main(String[] args) {
        GenericClass gc = new GenericClass();
        System.out.println(gc.doSomething("World")); // Викликаємо метод інтерфейсу
    }
}