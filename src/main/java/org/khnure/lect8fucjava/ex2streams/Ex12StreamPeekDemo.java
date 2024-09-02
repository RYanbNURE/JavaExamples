package org.khnure.lect8fucjava.ex2streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Ex12StreamPeekDemo {
    // Метод для демонстрації операції peek, яка дозволяє виконувати дію над елементами потоку без зміни даних
    public List<Integer> printNumbers(List<Integer> numbers) {
        return numbers.stream()
                .peek(n -> System.out.println("Processing number: " + n)) // Друкує кожне число під час обробки
                .collect(Collectors.toList());
    }
}
