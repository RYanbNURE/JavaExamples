package org.khnure.lect08fucjava.ex3switchex;

import java.util.function.Supplier;

public class Main4 {
    public static void main(String[] args) {
        int number = 2;
        String result = switch (number) {
            case 1 -> "One";
            case 2 -> {
                yield calculateValue(() -> "Two");
            }
            default -> "Unknown";
        };
        System.out.println("Result is: " + result);
    }

    private static String calculateValue(Supplier<String> supplier) {
        return supplier.get();
    }
}
// Використання виразу yield у switch для замикання лямбда-виразу.зу з лямбда для виконання різних дій в залежності від команди.