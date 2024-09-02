package org.khnure.lect8fucjava.ex2streams;

import java.util.Arrays;
import java.util.List;

public class Ex10StreamAllMatchDemo {
    // Метод для демонстрації операції allMatch, яка перевіряє чи всі елементи задовольняють умові
    public boolean allEvenNumbers(List<Integer> numbers) {
        return numbers.stream()
                .allMatch(n -> n % 2 == 0); // Перевіряє, чи всі числа парні
    }
}
