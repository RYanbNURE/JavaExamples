package org.khnure.lect3oop.ex2encapsulation.ex1;

public class EncapsulationDemo {
    public static void main(String[] args) {
        // Створення об'єкта Car з моделлю "Toyota" та швидкістю 200
        Car myCar = new Car("Toyota", 200);

        // Виведення моделі автомобіля на консоль
        System.out.println("Модель автомобіля: " + myCar.getModel());

        // Зміна швидкості автомобіля на 220
        myCar.setSpeed(220);

        // Виведення нової швидкості автомобіля на консоль
        System.out.println("Нова швидкість автомобіля: " + myCar.getSpeed());
    }
}
