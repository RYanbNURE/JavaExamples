package org.khnure.optional.lect19rx.ex1;


import io.reactivex.rxjava3.core.Observable;

//Створення базового Observable

//Базову підписку з трьома колбеками

//Емісію даних

//Обробку завершення потоку

public class BasicObservableExample {
    public static void main(String[] args) {
        // Створюємо простий Observable
        Observable<String> observable = Observable.create(emitter -> {
            System.out.println("Починаємо емісію даних...");
            emitter.onNext("Перше повідомлення");
            emitter.onNext("Друге повідомлення");
            emitter.onNext("Третє повідомлення");
            emitter.onComplete();
        });

        // Підписуємось на Observable
        observable.subscribe(
                // onNext handler
                data -> System.out.println("Отримано: " + data),
                // onError handler
                error -> System.out.println("Помилка: " + error.getMessage()),
                // onComplete handler
                () -> System.out.println("Завершено!")
        );
    }
}