package org.khnure.lect4classes.ex6aggregation;

// Клас, що представляє двигун автомобіля
public class Engine {
    // Змінна для зберігання потужності двигуна
    private int horsepower;

    // Конструктор класу Engine, ініціалізує потужність двигуна
    public Engine(int horsepower) {
        this.horsepower = horsepower;
    }

    // Метод для отримання потужності двигуна
    public int getHorsepower() {
        return horsepower;
    }

}
