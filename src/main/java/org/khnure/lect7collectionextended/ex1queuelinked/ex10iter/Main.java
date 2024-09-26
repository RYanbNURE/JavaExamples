package org.khnure.lect7collectionextended.ex1queuelinked.ex10iter;

import java.util.LinkedList;
import java.util.Queue;

//Пояснення: Демонструє, як ітерувати через елементи черги.
public class Main {
    public static void main(String[] args) {
        Queue<String> queue = new LinkedList<>();
        queue.add("Element 1");
        queue.add("Element 2");
        queue.add("Element 3");

        for (String element : queue) {
            System.out.println("Queue element: " + element);
        }
    }
}