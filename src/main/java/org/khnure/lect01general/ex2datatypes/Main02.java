package org.khnure.lect01general.ex2datatypes;

public class Main02 {
        public static void main(String[] args) {
            double num = 10.99;
            int intNum = (int) num;  // Explicit casting needed
            System.out.println("Converted double to int: " + intNum);
        }
    }

// Цей код демонструє явне перетворення з double в int з втратою частини даних.