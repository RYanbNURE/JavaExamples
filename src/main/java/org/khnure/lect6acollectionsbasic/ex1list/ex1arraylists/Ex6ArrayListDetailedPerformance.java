package org.khnure.lect6acollectionsbasic.ex1list.ex1arraylists;

import java.util.ArrayList;

/**
 * Розширений аналіз продуктивності ArrayList
 */
public class Ex6ArrayListDetailedPerformance {
    private static void analyzeOperation(String operationName, Runnable operation) {
        // Прогрів JVM
        for (int i = 0; i < 1000; i++) {
            operation.run();
        }

        // Збір статистики
        long[] times = new long[100];
        for (int i = 0; i < 100; i++) {
            long start = System.nanoTime();
            operation.run();
            times[i] = System.nanoTime() - start;
        }

        // Розрахунок статистики
        double average = java.util.Arrays.stream(times).average().orElse(0);
        long min = java.util.Arrays.stream(times).min().orElse(0);
        long max = java.util.Arrays.stream(times).max().orElse(0);

        System.out.printf("%s:%n", operationName);
        System.out.printf("  Середній час: %.2f нс%n", average);
        System.out.printf("  Мінімальний час: %d нс%n", min);
        System.out.printf("  Максимальний час: %d нс%n", max);
        System.out.println();
    }

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();

        analyzeOperation("Додавання елемента", () -> {
            list.add(1);
        });

        // Інші операції можна додати аналогічно
    }
}