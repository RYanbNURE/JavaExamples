package org.khnure.lect06acollectionsbasic.ex1list.ex1arraylists;

import java.util.ArrayList;

/**
 * Демонстрація операцій видалення з ArrayList
 */
public class Ex2ArrayListRemovalOperations {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.addAll(java.util.Arrays.asList(1, 2, 3, 2, 4, 2, 5));
        System.out.println("Початковий список: " + numbers);

        // Видалення за значенням (перше входження)
        boolean removed = numbers.remove(Integer.valueOf(2));
        System.out.println("Видалено перше входження 2: " + removed);
        System.out.println("Після видалення: " + numbers);

        // Видалення за індексом
        int removedNumber = numbers.remove(1);
        System.out.println("Видалено елемент за індексом 1: " + removedNumber);
        System.out.println("Після видалення: " + numbers);

        // Видалення всіх входжень елемента
        numbers.removeAll(java.util.Collections.singleton(2));
        System.out.println("Після видалення всіх 2: " + numbers);

        // Очищення списку
        numbers.clear();
        System.out.println("Після очищення: " + numbers);
    }
}