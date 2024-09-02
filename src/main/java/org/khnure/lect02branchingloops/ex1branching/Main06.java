package org.khnure.lect02branchingloops.ex1branching;

public class Main06 {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5};
        int index = 5;  // Note: index starts from 0, so index 5 is out of bounds for this array
        if (index < numbers.length) {
            System.out.println("Accessing array element: " + numbers[index]);
        } else {
            System.out.println("Index out of bounds error.");
        }
    }
}
// This snippet uses if-else to prevent out-of-bounds error when accessing an array.
// Цей фрагмент використовує if-else для запобігання помилки виходу за межі при доступі до масиву.
