package org.khnure.lect01general.ex2datatypes;

public class Main20 {
    public static void main(String[] args) {
        long longNum = 32768;
        short shortNum = (short) longNum;  // Explicit casting
        System.out.println("Converted long to short: " + shortNum);
    }
}
// Цей код демонструє явне перетворення з long в short з можливістю переповнення.