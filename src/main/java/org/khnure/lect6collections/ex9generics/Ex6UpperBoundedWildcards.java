package org.khnure.lect6collections.ex9generics;

import java.util.Arrays;
import java.util.List;

public class Ex6UpperBoundedWildcards {

    public static double sum(List<? extends Number> list) {
        double sum = 0.0;
        Number first = list.getFirst();
//        list.add("test");
//        list.add(1);
//        Number testNumber = new Integer(1);
//        list.add(testNumber);
        for (Number number : list) {
//            Number a = (Number) number;
            sum += number.doubleValue(); // Додаємо значення до суми
        }
        return sum;
    }

//    public static double sumInt(List<Integer> list) {
//        double sum = 0.0;
//        for (Integer number : list) {
//            sum += number.doubleValue(); // Додаємо значення до суми
//        }
//        return sum;
//    }
//
//    public static double sumDouble(List<Double> list) {
//        double sum = 0.0;
//        for (Double number : list) {
//            sum += number.doubleValue(); // Додаємо значення до суми
//        }
//        return sum;
//    }

    public static void main(String[] args) {
        List<Integer> intList = Arrays.asList(10, 20, 30);
        List<Double> doubleList = Arrays.asList(10.5, 20.5, 30.5);

        System.out.println("Sum of intList: " + sum(intList)); // Друкуємо суму списку Integer
        System.out.println("Sum of doubleList: " + sum(doubleList)); // Друкуємо суму списку Double
    }
}
