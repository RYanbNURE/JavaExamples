package org.khnure.lect4classes.ex6aggregation;

// Клас, що представляє автомобіль
public class Car {
    // Змінна для зберігання об'єкту Engine
    private Engine engine;

    // Конструктор класу Car, ініціалізує об'єкт Engine
    public Car(Engine engine) {
        this.engine = engine;
    }

    // Метод для отримання потужності двигуна автомобіля
    public int getCarHorsepower() {
        return engine.getHorsepower();
    }
}
