package org.khnure.lect01general.ex2datatypes;

public class Main19 {
    public static void main(String[] args) {
        short shortNum = 32767;
        long longNum = shortNum;  // Implicit conversion
        System.out.println("Converted short to long: " + longNum);
    }
}
// Цей код демонструє неявне перетворення з short в long.