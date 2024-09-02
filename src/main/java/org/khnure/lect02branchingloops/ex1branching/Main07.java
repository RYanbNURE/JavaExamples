package org.khnure.lect02branchingloops.ex1branching;

public class Main07 {
    public static void main(String[] args) {
        System.out.println("Is adult: " + isAdult(18));
    }

    public static boolean isAdult(int age) {
        if (age >= 18) {
            return true;
        } else {
            return false;
        }
    }
}
// This snippet shows if-else in a method with return statements.
// Цей уривок показує if-else в методі з операторами повернення.