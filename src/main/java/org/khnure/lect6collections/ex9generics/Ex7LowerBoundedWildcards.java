package org.khnure.lect6collections.ex9generics;

import java.util.Arrays;
import java.util.List;

public class Ex7LowerBoundedWildcards {
    public static void addNumbers(List<? super Integer> list) {
        for (int i = 1; i <= 10; i++) {
            list.add(i); // Додаємо числа до списку
        }
    }

    public static void main(String[] args) {
        List<Number> numList = Arrays.asList(new Number[10]);
        addNumbers(numList);

        for (Number num : numList) {
            System.out.print(num + " "); // Друкуємо елементи списку
        }
    }
}
