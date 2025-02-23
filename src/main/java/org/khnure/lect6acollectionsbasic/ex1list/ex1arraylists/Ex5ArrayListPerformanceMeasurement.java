package org.khnure.lect6acollectionsbasic.ex1list.ex1arraylists;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

/**
 * Демонстрація вимірювання часу різних операцій з ArrayList
 */
public class Ex5ArrayListPerformanceMeasurement {
    private static void measureTime(String operationName, Runnable operation) {
        long startTime = System.nanoTime();
        operation.run();
        long endTime = System.nanoTime();
        long durationNanos = endTime - startTime;

        System.out.printf("%s зайняла: %d мс (%d нс)%n",
                operationName,
                TimeUnit.NANOSECONDS.toMillis(durationNanos),
                durationNanos);
    }

    public static void main(String[] args) {
        // Створення ArrayList
        ArrayList<Integer> list = new ArrayList<>();

        // Вимірювання часу додавання елементів
        measureTime("Додавання 100,000 елементів", () -> {
            for (int i = 0; i < 100_000; i++) {
                list.add(i);
            }
        });

        // Вимірювання часу додавання на початок
        measureTime("Додавання елемента на початок", () -> {
            list.add(0, 999);
        });

        // Вимірювання часу пошуку елемента
        measureTime("Пошук елемента", () -> {
            list.indexOf(50_000);
        });

        // Вимірювання часу видалення з початку
        measureTime("Видалення з початку", () -> {
            list.remove(0);
        });

        // Вимірювання часу видалення з кінця
        measureTime("Видалення з кінця", () -> {
            list.remove(list.size() - 1);
        });

        // Вимірювання часу ітерації
        measureTime("Ітерація по всіх елементах", () -> {
            for (Integer i : list) {
                // просто ітерація
            }
        });

        // Вимірювання часу очищення
        measureTime("Очищення списку", () -> {
            list.clear();
        });

        // Вимірювання часу масового додавання
        List<Integer> tempList = new ArrayList<>();
        for (int i = 0; i < 10_000; i++) {
            tempList.add(i);
        }
        measureTime("Масове додавання 10,000 елементів", () -> {
            list.addAll(tempList);
        });

        // Вимірювання часу сортування
        measureTime("Сортування", () -> {
            list.sort(Integer::compareTo);
        });

        // Вимірювання часу копіювання
        measureTime("Створення копії списку", () -> {
            ArrayList<Integer> newList = new ArrayList<>(list);
        });
    }
}
