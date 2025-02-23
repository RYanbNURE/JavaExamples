package org.khnure.lect6collections.ex9generics;

import java.util.ArrayList;
import java.util.List;

public class Ex22PECSExample {
    // Method to add elements to a list (consumer)
    public static void addNumbers(List<? super Integer> list) {
        list.add(1);
        list.add(2);
//        Number a = new Integer(1);
//        list.add(a);
        System.out.println("Added numbers to the list");
    }

    // Method to read elements from a list (producer)
    public static void printNumbers(List<? extends Number> list) {
        for (Number n : list) {
            System.out.println(n);
        }
    }

    public static void main(String[] args) {
        // List that consumes integers
        List<Object> objectList = new ArrayList<>();
        addNumbers(objectList);

        // List that produces numbers
        List<Integer> integerList = new ArrayList<>();
        integerList.add(3);
        integerList.add(4);

        printNumbers(integerList);
    }
}
