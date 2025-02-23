package org.khnure.lect6collections.ex3queue.ex1queuelinked.ex10iter;

import java.util.*;

//Пояснення: Демонструє, як ітерувати через елементи черги.
public class Main {
    public static void main(String[] args) {
        Queue<String> queue = new LinkedList<>();
        queue.add("Element 2");
        queue.add("Element 1");
        queue.add("Element 3");

        for (String element : queue) {
            System.out.println("Queue element: " + element);
        }

        Map<String, String> map = new HashMap<>();

        map.keySet();
        map.entrySet();
    }
}