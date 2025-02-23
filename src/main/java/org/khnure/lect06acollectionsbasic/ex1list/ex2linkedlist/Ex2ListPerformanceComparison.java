package org.khnure.lect06acollectionsbasic.ex1list.ex2linkedlist;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.concurrent.TimeUnit;

/**
 * Порівняння продуктивності LinkedList та ArrayList
 */
public class Ex2ListPerformanceComparison {
    private static void measureOperation(String name, List<Integer> list, Runnable operation) {
        long start = System.nanoTime();
        operation.run();
        long end = System.nanoTime();
        System.out.printf("%s для %s: %d мікросекунд%n",
                name,
                list.getClass().getSimpleName(),
                TimeUnit.NANOSECONDS.toMicros(end - start));
    }

    public static void main(String[] args) {
        LinkedList<Integer> linkedList = new LinkedList<>();
        ArrayList<Integer> arrayList = new ArrayList<>();

        // Додавання на початок
        measureOperation("Додавання 10000 елементів на початок", linkedList, () -> {
            for (int i = 0; i < 10000; i++) {
                linkedList.add(0, i);
            }
        });

        measureOperation("Додавання 10000 елементів на початок", arrayList, () -> {
            for (int i = 0; i < 10000; i++) {
                arrayList.add(0, i);
            }
        });

        // Додавання в кінець
        linkedList.clear();
        arrayList.clear();

        measureOperation("Додавання 100000 елементів в кінець", linkedList, () -> {
            for (int i = 0; i < 100000; i++) {
                linkedList.add(i);
            }
        });

        measureOperation("Додавання 100000 елементів в кінець", arrayList, () -> {
            for (int i = 0; i < 100000; i++) {
                arrayList.add(i);
            }
        });

        // Доступ до випадкових елементів
        measureOperation("Доступ до 1000 випадкових елементів", linkedList, () -> {
            for (int i = 0; i < 1000; i++) {
                linkedList.get((int)(Math.random() * linkedList.size()));
            }
        });

        measureOperation("Доступ до 1000 випадкових елементів", arrayList, () -> {
            for (int i = 0; i < 1000; i++) {
                arrayList.get((int)(Math.random() * arrayList.size()));
            }
        });
    }
}
