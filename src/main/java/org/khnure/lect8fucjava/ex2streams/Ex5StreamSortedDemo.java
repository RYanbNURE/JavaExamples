package org.khnure.lect8fucjava.ex2streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Ex5StreamSortedDemo {
    // Метод для демонстрації операції sorted, яка сортує елементи списку
    public List<Integer> sortNumbers(List<Integer> numbers) {
        return numbers.stream()
                .sorted()
                .collect(Collectors.toList());
    }
}
