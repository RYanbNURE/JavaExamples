package org.khnure.lect6collections.ex9generics;

import java.util.ArrayList;
import java.util.List;

public class Ex17WildcardsWithCollections {
    public static void printList(List<?> list) {
        for (Object obj : list) {
            System.out.print(obj + " "); // Друкуємо елементи списку
        }
        System.out.println();
    }

    public static void main(String[] args) {
        List<Integer> intList = new ArrayList<>();
        intList.add(1);
        intList.add(2);

        List<String> strList = new ArrayList<>();
        strList.add("One");
        strList.add("Two");

        printList(intList);
        printList(strList);
    }
}
