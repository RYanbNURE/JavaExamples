package org.khnure.lect6collections.ex9generics;

import java.util.Arrays;
import java.util.List;

public class Ex8PECSPrinciple {
    // Producer: List<? extends T>
    public static void copy(List<? extends Number> src, List<? super Number> dest) {
        for (Number num : src) {
            dest.add(num); // Копіюємо елементи з джерела до призначення
        }
    }

    public static void main(String[] args) {
        List<Integer> intList = Arrays.asList(10, 20, 30);
        List<Number> numList = Arrays.asList(new Number[3]);

        copy(intList, numList);

        for (Number num : numList) {
            System.out.print(num + " "); // Друкуємо елементи списку
        }
    }
}
