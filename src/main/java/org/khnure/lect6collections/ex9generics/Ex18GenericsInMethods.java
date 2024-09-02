package org.khnure.lect6collections.ex9generics;

public class Ex18GenericsInMethods {
    public static <T> T printItem(T item) {
        System.out.println(item); // Друкуємо item
        return item;
    }

    public static void main(String[] args) {
        printItem("Hello Generics");
        printItem(100);
    }
}
