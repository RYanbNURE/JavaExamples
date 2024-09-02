package org.khnure.lect6collections.ex9generics;

import java.io.Closeable;

public class Ex12MultipleBounds <T extends Number & Closeable> {
    private T t;

    public Ex12MultipleBounds(T t) {
        this.t = t; // Встановлюємо значення T
    }

    public void print() {
        System.out.println(t); // Друкуємо значення T
    }

    public static void main(String[] args) {
        // Резервуємо для прикладу, оскільки потребує спеціальної реалізації Closeable
    }
}
