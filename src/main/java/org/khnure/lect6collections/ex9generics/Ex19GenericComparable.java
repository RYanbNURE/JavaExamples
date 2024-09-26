package org.khnure.lect6collections.ex9generics;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.TreeSet;

public class Ex19GenericComparable<T extends Comparable<T>> {

    private T[] array;

    public Ex19GenericComparable(T[] array) {
        this.array = array; // Встановлюємо масив
    }

    public void sort() {
        Arrays.sort(array); // Сортуємо масив
    }
//    public void sort() {
//        new TreeSet<>(List.of(array)); // Сортуємо масив
//    }

    public void print() {
        for (T item : array) {
            System.out.print(item + " "); // Друкуємо елемент масиву
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Integer[] intArray = {3, 1, 2};
        Person[] stringBuilders = {new Person(), new Person(), new Person()};
//        Ex19GenericComparable<Integer> gc = new Ex19GenericComparable<>(intArray);
//        Ex19GenericComparable<Person> personEx19GenericComparable = new Ex19GenericComparable<>(stringBuilders);
//        personEx19GenericComparable.sort();
//        personEx19GenericComparable.print();
    }
}

class Person {
    public String name;
}