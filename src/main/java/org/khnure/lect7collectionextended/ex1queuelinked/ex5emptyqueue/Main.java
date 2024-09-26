package org.khnure.lect7collectionextended.ex1queuelinked.ex5emptyqueue;

import java.util.LinkedList;
import java.util.Queue;

//Пояснення: Демонструє використання методу isEmpty для перевірки, чи порожня черга.
public class Main {
    public static void main(String[] args) {
        Queue<String> queue = new LinkedList<>();

        System.out.println("Is queue empty? " + queue.isEmpty());
        queue.add("Element 1");
        System.out.println("Is queue empty after adding an element? " + queue.isEmpty());
    }
}