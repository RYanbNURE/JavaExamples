package org.khnure.lect08fucjava.ex2streams;

import java.util.List;
import java.util.stream.Collectors;

public class Ex8StreamFlatMapDemo {

    public static void main(String[] args) {
        List<List<Integer>> testList= List.of(List.of(1,2), List.of(3,4));

        List<Integer> integerList = flattenLists(testList);
        System.out.println(integerList);
    }

    // Метод для демонстрації операції flatMap, яка згладжує складні структури даних
    public static List<Integer> flattenLists(List<List<Integer>> lists) {
        return lists.stream()
                .flatMap(List::stream) // Згладжує списки в один потік чисел
                .collect(Collectors.toList());
    }
}
