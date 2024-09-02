package org.khnure.lect8fucjava.ex2streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Ex6StreamLimitDemo {
    // Метод для демонстрації операції limit, яка обмежує кількість елементів у списку
    public List<Integer> firstNumbers(List<Integer> numbers) {
        return numbers.stream()
                .limit(3) // Обмежує до перших трьох чисел
                .collect(Collectors.toList());
    }

}
