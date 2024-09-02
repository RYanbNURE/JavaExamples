package org.khnure.lect6collections.ex9generics;

public class Ex2GenericMethods {
    public static <T> void printArray(T[] inputArray) {
        for (T element : inputArray) {
            System.out.print(element + " "); // Друкуємо елемент масиву
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Integer[] intArray = {1, 2, 3, 4, 5};
        String[] strArray = {"Hello", "World"};

        printArray(intArray); // Викликаємо generic метод з Integer масивом
        printArray(strArray); // Викликаємо generic метод з String масивом
    }
}
