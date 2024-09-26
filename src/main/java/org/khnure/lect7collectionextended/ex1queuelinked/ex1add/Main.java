package org.khnure.lect7collectionextended.ex1queuelinked.ex1add;

import java.util.LinkedList;
import java.util.Queue;

//Пояснення: Демонструє базові операції, використовуючи інтерфейс Queue з реалізацією LinkedList.
public class Main {
    public static void main(String[] args) {
        Queue<String> queue = new LinkedList<>();
        queue.add("Element 1");
        queue.add("Element 2");
        queue.add("Element 3");

        System.out.println("Queue: " + queue);
    }
}