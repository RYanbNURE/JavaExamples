package org.khnure.lect01general.ex2datatypes;

public class Main14 {
    public static void main(String[] args) {
        long longNum = 9223372036854775807L;
        double doubleNum = longNum;  // Implicit conversion
        System.out.println("Converted long to double: " + doubleNum);
    }
}
// Цей код демонструє неявне перетворення з long в double.