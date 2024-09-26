package org.khnure.lect7collectionextended.ex1queuelinked.ex11removingiter;

import java.util.LinkedList;
import java.util.Queue;

//Пояснення: Демонструє видалення елементів з черги під час ітерації.
public class Main {
    public static void main(String[] args) {
        Queue<String> queue = new LinkedList<>();
        queue.add("Element 1");
        queue.add("Element 2");
        queue.add("Element 3");

        while (!queue.isEmpty()) {
            System.out.println("Removed Element: " + queue.poll());
        }
    }
}