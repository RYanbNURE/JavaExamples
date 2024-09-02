package org.khnure.lect01general.ex1string;

public class Main04 {
    public static void main(String[] args) {
        String formatStr = String.format("The price is %.2f dollars", 24.99);
        System.out.println(formatStr);  // Виводить: The price is 24.99 dollars
    }
}
// Цей код демонструє форматування рядка з використанням методу format.