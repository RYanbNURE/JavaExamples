package org.khnure.lect07generics.ex01basic;

public class Ex1Box<T> {
    private T t;

    public void set(T t) {
        this.t = t; // Встановлюємо значення T
    }

    public T get() {
        return t; // Отримуємо значення T
    }

    public static void main(String[] args) {
        Ex1Box<Integer> integerBox = new Ex1Box<>();
        integerBox.set(10);
        System.out.println("Integer Value: " + integerBox.get()); // Друкуємо Integer значення

        Ex1Box<String> stringBox = new Ex1Box<>();
        stringBox.set("Generics");
        System.out.println("String Value: " + stringBox.get()); // Друкуємо String значення
    }
}
