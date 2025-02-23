package org.khnure.lect19rx.ex4;


import io.reactivex.rxjava3.core.Observable;

//Обробку помилок в RxJava

//Використання onErrorReturn

//Механізм retry

//Логування помилок

public class ErrorHandlingExample {
    public static void main(String[] args) {
        Observable.just(1, 2, 0, 4)
                .map(i -> {
                    System.out.println("Спроба ділення 10 на " + i);
                    return 10 / i;
                })
                .onErrorReturn(error -> {
                    System.out.println("Перехоплено помилку: " + error.getMessage());
                    return -1;
                })
                .doOnError(error -> System.out.println("Сталася помилка!"))
                .retry(2)
                .subscribe(
                        result -> System.out.println("Результат: " + result),
                        error -> System.out.println("Фінальна помилка: " + error.getMessage()),
                        () -> System.out.println("Завершено!")
                );
    }
}
