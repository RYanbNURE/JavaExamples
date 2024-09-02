package org.khnure.lect01general.ex2datatypes;

public class Main04 {
    public static void main(String[] args) {
        byte byteNum = 100;
        long longNum = byteNum;  // Implicit conversion
        System.out.println("Converted byte to long: " + longNum);
    }
}
// Цей код демонструє неявне перетворення з byte в long.