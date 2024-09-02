package org.khnure.lect6collections.ex9generics;

public class Ex3Box<T> {
    private T t;

    public void set(T t) {
        this.t = t; // Встановлюємо значення T
    }

    public T get() {
        return t; // Отримуємо значення T
    }

    public static void main(String[] args) {
        Ex3Box<Integer> integerBox = new Ex3Box<>();
        integerBox.set(10);
        System.out.println("Integer Value: " + integerBox.get()); // Друкуємо Integer значення

        Ex3Box<String> stringBox = new Ex3Box<>();
        stringBox.set("Generics");
        System.out.println("String Value: " + stringBox.get()); // Друкуємо String значення
    }
}
