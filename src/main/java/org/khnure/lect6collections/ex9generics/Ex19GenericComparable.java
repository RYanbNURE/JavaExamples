package org.khnure.lect6collections.ex9generics;

import java.util.Arrays;

public class Ex19GenericComparable<T extends Comparable<T>> {

    private T[] array;

    public Ex19GenericComparable(T[] array) {
        this.array = array; // Встановлюємо масив
    }

    public void sort() {
        Arrays.sort(array); // Сортуємо масив
    }

    public void print() {
        for (T item : array) {
            System.out.print(item + " "); // Друкуємо елемент масиву
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Integer[] intArray = {3, 1, 2};
        Ex19GenericComparable<Integer> gc = new Ex19GenericComparable<>(intArray);
        gc.sort();
        gc.print();
    }
}
