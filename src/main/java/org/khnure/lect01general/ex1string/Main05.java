package org.khnure.lect01general.ex1string;

public class Main05 {
    public static void main(String[] args) {
        String a = "hello";
        String b = "hello";
        String c = new String("hello");
        System.out.println("Strings are equal: " + a.equals(c));  // Виводить: Strings are equal: true
        System.out.println("Strings are equal: " + (a == c));  // Виводить: Strings are equal: true
    }
}
// Цей код демонструє порівняння рядків за допомогою методу equals.
