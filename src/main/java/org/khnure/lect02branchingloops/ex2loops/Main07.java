package org.khnure.lect02branchingloops.ex2loops;

public class Main07 {
        public static void main(String[] args) {
            for (int i = 0; i < 10; i++) {
                if (i % 2 == 0) continue;
                System.out.println("i = " + i);
            }
        }
    }
// Demonstrates using continue to skip current iteration in a for loop.
// Демонструє використання continue для пропуску поточної ітерації в for циклі.