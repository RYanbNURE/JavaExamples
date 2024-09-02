package org.khnure.lect4classes.ex7composition;

// Основной класс, що використовує композицію
public class CompositionExample {
    // Клас, який представляє частину об'єкта
    static class Engine {
        public void start() {
            System.out.println("Двигун запущений.");
        }
    }

    // Клас, який представляє іншу частину об'єкта
    static class Wheels {
        public void roll() {
            System.out.println("Колеса обертаються.");
        }
    }

    // Головний клас, що складається з інших класів
    static class Car {
        private Engine engine;
        private Wheels wheels;

        // Конструктор для ініціалізації об'єктів двигуна та коліс
        public Car() {
            this.engine = new Engine();
            this.wheels = new Wheels();
        }

        // Метод, що запускає двигун і прокручує колеса
        public void drive() {
            engine.start();
            wheels.roll();
        }
    }

    public static void main(String[] args) {
        Car myCar = new Car();
        myCar.drive(); // Виведе: Двигун запущений. Колеса обертаються.
    }

}
