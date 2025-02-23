package org.khnure.lect08fucjava.ex2streams;

import java.util.List;

public class Ex3StreamReduceDemo {
    // Метод для демонстрації операції reduce, яка зменшує список до одного значення
    public int sumOfNumbers(List<Integer> numbers) {
        return numbers.stream()
                .reduce(0, (subtotal, number) -> subtotal + number); // Сумує всі числа
    }
}
