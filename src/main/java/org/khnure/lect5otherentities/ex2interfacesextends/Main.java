package org.khnure.lect5otherentities.ex2interfacesextends;

public class Main {
    public static void main(String[] args) {
        // Створення об'єктів, які реалізують кілька інтерфейсів
        Car car = new Car();
        Bird bird = new Bird();

        // Використання методів для руху та польоту
        moveVehicle(car);
        flyFlyable(bird);



        moveVehicle(bird);
//        flyFlyable(car);
    }

    // Метод для пересування транспортного засобу, що може рухатися
    public static void moveVehicle(Movable movable) {
        movable.move();
    }

    // Метод для польоту тварини, що може літати
    public static void flyFlyable(Flyable flyable) {
        flyable.fly();
    }
}
