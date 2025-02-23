package org.khnure.lect06acollectionsbasic.ex1list.ex2linkedlist;

import java.util.LinkedList;
import java.util.concurrent.TimeUnit;

/**
 * Демонстрація базових операцій LinkedList з вимірюванням часу
 */
public class Ex1LinkedListBasicOperationsPerformance {
    private static void measureTime(String operationName, Runnable operation) {
        long startTime = System.nanoTime();
        operation.run();
        long endTime = System.nanoTime();
        long duration = TimeUnit.NANOSECONDS.toMicros(endTime - startTime);
        System.out.printf("%s: %d мікросекунд%n", operationName, duration);
    }

    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<>();

        // Вимірювання часу додавання на початок
        measureTime("Додавання 10000 елементів на початок", () -> {
            for (int i = 0; i < 10000; i++) {
                list.addFirst(i);
            }
        });
        System.out.println("Розмір після додавання: " + list.size());

        // Вимірювання часу додавання в кінець
        measureTime("Додавання 10000 елементів в кінець", () -> {
            for (int i = 0; i < 10000; i++) {
                list.addLast(i);
            }
        });
        System.out.println("Розмір після додавання: " + list.size());

        // Вимірювання часу доступу до середнього елемента
        measureTime("Доступ до середнього елемента", () -> {
            list.get(list.size() / 2);
        });

        // Вимірювання часу видалення з початку
        measureTime("Видалення 1000 елементів з початку", () -> {
            for (int i = 0; i < 1000; i++) {
                list.removeFirst();
            }
        });
        System.out.println("Розмір після видалення: " + list.size());
    }
}
