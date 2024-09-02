package org.khnure.lect8fucjava.ex2streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Ex2StreamFilterDemo {
    // Метод для демонстрації операції filter, яка фільтрує елементи списку за певним умовою
    public List<Integer> filterEvenNumbers(List<Integer> numbers) {
        return numbers.stream()
                .filter(n -> n % 2 == 0) // Фільтрує парні числа
                .collect(Collectors.toList());
    }
}
