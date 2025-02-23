package org.khnure.optional.lect19rx.ex3;

import io.reactivex.rxjava3.subjects.PublishSubject;

//Використання PublishSubject

//Гарячу підписку

//Множинних підписників

//Різницю між холодними та гарячими Observable

public class SubjectExample {
    public static void main(String[] args) {
        // Створюємо PublishSubject
        PublishSubject<String> subject = PublishSubject.create();

        // Перший підписник
        subject.subscribe(
                data -> System.out.println("Підписник 1 отримав: " + data),
                error -> System.out.println("Підписник 1 помилка: " + error.getMessage()),
                () -> System.out.println("Підписник 1 завершив")
        );

        System.out.println("Емітуємо перше повідомлення");
        subject.onNext("Перше повідомлення");

        // Другий підписник (отримає тільки наступні повідомлення)
        subject.subscribe(
                data -> System.out.println("Підписник 2 отримав: " + data),
                error -> System.out.println("Підписник 2 помилка: " + error.getMessage()),
                () -> System.out.println("Підписник 2 завершив")
        );

        System.out.println("Емітуємо друге повідомлення");
        subject.onNext("Друге повідомлення");
        subject.onComplete();
    }
}