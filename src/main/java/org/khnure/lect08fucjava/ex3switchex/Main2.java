package org.khnure.lect08fucjava.ex3switchex;

import java.util.function.Supplier;

public class Main2 {
    public static void main(String[] args) {
        String value = "High";
        int result = switch (value) {
            case "High" -> {
                yield calculate(() -> 100);
            }
            case "Medium" -> {
                yield calculate(() -> 50);
            }
            case "Low" -> {
                yield calculate(() -> 10);
            }
            default -> {
                yield 0;
            }
        };
        System.out.println("Calculated value is: " + result);
    }

    private static int calculate(Supplier<Integer> supplier) {
        return supplier.get();
    }
}
// Використання лямбда-виразів усередині switch виразу для динамічних обчислень.
