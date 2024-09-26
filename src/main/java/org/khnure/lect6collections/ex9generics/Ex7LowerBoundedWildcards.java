package org.khnure.lect6collections.ex9generics;

import java.util.Arrays;
import java.util.List;

public class Ex7LowerBoundedWildcards {
    public static void addNumbers(List<? super Integer> list) {
//        Object first = list.getFirst();
//        list.add(1);
//        Number test = new Double(1.1);
//        list.add(test);
        for (int i = 1; i <= 10; i++) {
            list.add(1); // Додаємо числа до списку
        }
    }

    public static void main(String[] args) {
        List<Number> numList = Arrays.asList(new Number[10]);
        List<Object> objList = Arrays.asList(new Number[10]);
        List<Object> objList1 = Arrays.asList("test");
        List<String> stringList = Arrays.asList("test");
        List<Double> doubleList;
//        List<Number> numListDouble = doubleList;


        addNumbers(numList);
        addNumbers(objList);
        addNumbers(objList1);
//        addNumbers(stringList);

        for (Number num : numList) {
            System.out.print(num + " "); // Друкуємо елементи списку
        }
    }
}
