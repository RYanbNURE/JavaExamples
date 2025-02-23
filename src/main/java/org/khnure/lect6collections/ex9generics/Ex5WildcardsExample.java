package org.khnure.lect6collections.ex9generics;

import java.util.ArrayList;
import java.util.List;

public class Ex5WildcardsExample {
    public static void printList(List<?> list) {
        String listFirst =  list.getFirst().toString();
        for (Object elem : list) {
            System.out.print(elem + " "); // Друкуємо елемент списку
        }
        System.out.println();
    }

    public static void main(String[] args) {
        List<Integer> intList = new ArrayList<>();
        intList.add(10);
        intList.add(20);

        List<String> strList = new ArrayList<>();
        strList.add("Hello");
        strList.add("World");

        printList(intList); // Використовуємо wildcard для друку списку Integer
        printList(strList); // Використовуємо wildcard для друку списку String
    }
}
