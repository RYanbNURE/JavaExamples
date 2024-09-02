package org.khnure.lect02branchingloops.ex1branching;

public class Main09 {
    public static void main(String[] args) {
        int[] elements = {2, 5, 3, 7, 8};
        int toFind = 5;
        boolean found = false;
        for (int num : elements) {
            if (num == toFind) {
                found = true;
                break;
            }
        }
        if (found) {
            System.out.println(toFind + " is found in the array.");
        } else {
            System.out.println(toFind + " is not found in the array.");
        }
    }
}
// This snippet uses if-else to check for an element's existence in an array.
// Цей фрагмент використовує if-else для перевірки наявності елемента в масиві.