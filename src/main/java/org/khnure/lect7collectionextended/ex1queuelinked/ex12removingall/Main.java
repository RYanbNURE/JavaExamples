package org.khnure.lect7collectionextended.ex1queuelinked.ex12removingall;

import java.util.LinkedList;
import java.util.Queue;

//Пояснення: Демонструє метод clear для видалення всіх елементів з черги.
public class Main {
    public static void main(String[] args) {
        Queue<String> queue = new LinkedList<>();
        queue.add("Element 1");
        queue.add("Element 2");

        queue.clear();
        System.out.println("Queue after clear: " + queue);
    }
}