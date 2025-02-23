package org.khnure.optional.lect19rx.ex2;

import io.reactivex.rxjava3.core.Observable;

//Використання операторів filter, map, take

//Ланцюжок операторів

//Трансформацію даних

//Обмеження кількості елементів

public class OperatorsExample {
    public static void main(String[] args) {
        Observable.just(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
                .filter(n -> {
                    System.out.println("Фільтруємо: " + n);
                    return n % 2 == 0;
                })
                .map(n -> {
                    System.out.println("Мапимо: " + n);
                    return "Число: " + n;
                })
                .take(2)
                .subscribe(
                        result -> System.out.println("Результат: " + result),
                        error -> System.out.println("Помилка: " + error.getMessage()),
                        () -> System.out.println("Завершено!")
                );
    }
}
