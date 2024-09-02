package org.khnure.lect6collections.ex9generics;

import java.util.Arrays;
import java.util.List;

public class Ex6UpperBoundedWildcards {
    public static double sum(List<? extends Number> list) {
        double sum = 0.0;
        for (Number number : list) {
            sum += number.doubleValue(); // Додаємо значення до суми
        }
        return sum;
    }

    public static void main(String[] args) {
        List<Integer> intList = Arrays.asList(10, 20, 30);
        List<Double> doubleList = Arrays.asList(10.5, 20.5, 30.5);

        System.out.println("Sum of intList: " + sum(intList)); // Друкуємо суму списку Integer
        System.out.println("Sum of doubleList: " + sum(doubleList)); // Друкуємо суму списку Double
    }
}
