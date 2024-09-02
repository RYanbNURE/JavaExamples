package org.khnure.lect8fucjava.ex2streams;

import java.util.Arrays;
import java.util.List;

public class Ex11StreamNoneMatchDemo {
    // Метод для демонстрації операції noneMatch, яка перевіряє чи немає жодного елемента, що задовольняє умові
    public boolean noEvenNumbers(List<Integer> numbers) {
        return numbers.stream()
                .noneMatch(n -> n % 2 == 0); // Перевіряє відсутність парних чисел
    }
}
