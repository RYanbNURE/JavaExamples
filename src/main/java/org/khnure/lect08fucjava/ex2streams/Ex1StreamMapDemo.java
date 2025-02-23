package org.khnure.lect08fucjava.ex2streams;

import java.util.List;
import java.util.stream.Collectors;

public class Ex1StreamMapDemo {

//    public void test(){
//
//    }

    // Метод для демонстрації операції map, яка перетворює кожен елемент списку в інший об'єкт
    public List<Integer> squareNumbers(List<Integer> numbers) {
        return numbers.
                stream()
                .peek(System.out::println)
                .map(n -> n * n) // Кожне число підноситься до квадрату
                .peek(System.out::println)
                .collect(Collectors.toList());
    }
}
