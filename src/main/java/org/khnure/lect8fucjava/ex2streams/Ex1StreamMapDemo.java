package org.khnure.lect8fucjava.ex2streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Ex1StreamMapDemo {
    // Метод для демонстрації операції map, яка перетворює кожен елемент списку в інший об'єкт
    public List<Integer> squareNumbers(List<Integer> numbers) {
        return numbers.stream()
                .map(n -> n * n) // Кожне число підноситься до квадрату
                .collect(Collectors.toList());
    }
}
