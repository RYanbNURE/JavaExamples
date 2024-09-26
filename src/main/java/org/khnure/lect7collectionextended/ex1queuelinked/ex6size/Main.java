package org.khnure.lect7collectionextended.ex1queuelinked.ex6size;

import java.util.LinkedList;
import java.util.Queue;

//Пояснення: Демонструє, як отримати розмір черги, використовуючи метод size.
public class Main {
    public static void main(String[] args) {
        Queue<String> queue = new LinkedList<>();
        queue.add("Element 1");
        queue.add("Element 2");

        System.out.println("Size of the queue: " + queue.size());
    }
}
