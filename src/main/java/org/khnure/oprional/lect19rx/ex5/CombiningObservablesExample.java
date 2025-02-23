package org.khnure.oprional.lect19rx.ex5;

//Об'єднання потоків даних

//Використання операторів merge та zip

//Роботу з часовими інтервалами

//Асинхронну обробку даних
import io.reactivex.rxjava3.core.Observable;

import java.util.concurrent.TimeUnit;

public class CombiningObservablesExample {
    public static void main(String[] args) throws InterruptedException {
        Observable<String> obs1 = Observable
                .interval(1, TimeUnit.SECONDS)
                .map(i -> "Перший: " + i)
                .take(3);

        Observable<String> obs2 = Observable
                .interval(1, TimeUnit.SECONDS)
                .map(i -> "Другий: " + i)
                .take(3);

        System.out.println("Починаємо merge спостережень:");

        Observable.merge(obs1, obs2)
                .subscribe(
                        data -> System.out.println("Отримано: " + data),
                        error -> System.out.println("Помилка: " + error.getMessage()),
                        () -> System.out.println("Завершено!")
                );

        // Чекаємо завершення всіх операцій
        Thread.sleep(5000);

        System.out.println("\nПочинаємо zip спостережень:");

        Observable.zip(
                obs1,
                obs2,
                (s1, s2) -> s1 + " + " + s2
        ).subscribe(
                data -> System.out.println("Zip результат: " + data),
                error -> System.out.println("Помилка: " + error.getMessage()),
                () -> System.out.println("Zip завершено!")
        );

        Thread.sleep(5000);
    }
}