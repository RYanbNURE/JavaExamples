package org.khnure.oprional.lect19rx.ex6;


import io.reactivex.rxjava3.core.Flowable;
import io.reactivex.rxjava3.schedulers.Schedulers;
import org.reactivestreams.Subscriber;
import org.reactivestreams.Subscription;

//Управління зворотним тиском (backpressure)

//Використання Flowable замість Observable

//Ручне управління підпискою

//Буферизацію даних

//Асинхронну обробку з контролем швидкості

public class BackpressureExample {
    public static void main(String[] args) throws InterruptedException {
        Flowable.range(1, 1000000)
                .onBackpressureBuffer(10)
                .observeOn(Schedulers.computation())
                .subscribe(new Subscriber<Integer>() {
                    private Subscription subscription;

                    @Override
                    public void onSubscribe(Subscription s) {
                        this.subscription = s;
                        System.out.println("Запитуємо 5 елементів");
                        subscription.request(5);
                    }

                    @Override
                    public void onNext(Integer value) {
                        System.out.println("Отримано: " + value);
                        try {
                            // Імітуємо довгу обробку
                            Thread.sleep(100);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                        // Запитуємо наступний елемент
                        subscription.request(1);
                    }

                    @Override
                    public void onError(Throwable t) {
                        System.out.println("Помилка: " + t.getMessage());
                    }

                    @Override
                    public void onComplete() {
                        System.out.println("Завершено!");
                    }
                });

        Thread.sleep(2000);
    }
}