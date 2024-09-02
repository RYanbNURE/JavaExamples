package org.khnure.lect8fucjava.ex2streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Ex4StreamDistinctDemo {
    // Метод для демонстрації операції distinct, яка видаляє дублікати зі списку
    public List<Integer> uniqueNumbers(List<Integer> numbers) {
        return numbers.stream()
                .distinct()
                .collect(Collectors.toList());
    }
}
