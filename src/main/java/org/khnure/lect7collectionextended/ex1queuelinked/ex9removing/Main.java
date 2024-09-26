package org.khnure.lect7collectionextended.ex1queuelinked.ex9removing;

import java.util.LinkedList;
import java.util.Queue;

//Пояснення: Показує, як видалити конкретний елемент з черги.
public class Main {
    public static void main(String[] args) {
        Queue<String> queue = new LinkedList<>();
        queue.add("Element 1");
        queue.add("Element 2");

        queue.remove("Element 1");
        System.out.println("Queue after removing 'Element 1': " + queue);
    }
}
