package org.khnure.lect08fucjava.ex2streams;

import java.util.List;
import java.util.stream.Collectors;

public class Ex7StreamSkipDemo {
    // Метод для демонстрації операції skip, яка пропускає певну кількість елементів у списку
    public List<Integer> skipNumbers(List<Integer> numbers) {
        return numbers.stream()
                .skip(2) // Пропускає перші два числа
                .collect(Collectors.toList());
    }
}
