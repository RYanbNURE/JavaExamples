package org.khnure.lect01general.ex2datatypes;

public class Main09 {
    public static void main(String[] args) {
        short shortNum = 128;
        byte byteNum = (byte) shortNum;
        System.out.println("Converted short to byte: " + byteNum);
    }
}
// Цей код демонструє явне перетворення з short в byte з можливістю переповнення.