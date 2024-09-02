package org.khnure.lect01general.ex2datatypes;

public class Main13 {
    public static void main(String[] args) {
        double doubleNum = 9223372036854775807d;
        long longNum = (long) doubleNum;  // Explicit casting
        System.out.println("Converted double to long: " + longNum);
    }
}
// Цей код демонструє явне перетворення з double в long.