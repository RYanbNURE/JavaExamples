package org.khnure.lect8fucjava.ex2streams;

import java.util.Arrays;
import java.util.List;

public class Ex9StreamAnyMatchDemo {
    // Метод для демонстрації операції anyMatch, яка перевіряє наявність хоча б одного елемента, що задовольняє умові
    public boolean hasEvenNumber(List<Integer> numbers) {
        return numbers.stream()
                .anyMatch(n -> n % 2 == 0); // Перевіряє наявність хоча б одного парного числа
    }
}
