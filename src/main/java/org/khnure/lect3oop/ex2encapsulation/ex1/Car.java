package org.khnure.lect3oop.ex2encapsulation.ex1;

public class Car {
    // Приватна змінна для зберігання моделі автомобіля
    private String model;

    // Приватна змінна для зберігання швидкості автомобіля
    private int speed;

    // Конструктор класу, ініціалізує модель та швидкість
    public Car(String model, int speed) {
        this.model = model;
        this.speed = speed;
    }

    // Метод для отримання моделі автомобіля
    public String getModel() {
        return model;
    }

    // Метод для встановлення моделі автомобіля
    public void setModel(String model) {
        this.model = model;
    }

    // Метод для отримання швидкості автомобіля
    public int getSpeed() {
        return speed;
    }

    // Метод для встановлення швидкості автомобіля
    public void setSpeed(int speed) {
        this.speed = speed;
    }

}
