package org.khnure.lect3oop.ex4static;

// Головний клас, що містить метод main для запуску програми
public class Main {
    public static void main(String[] args) {
        // Виклик статичного методу calculateCircleArea для обчислення площі кола
        double circleArea = MathUtils.calculateCircleArea(5);
        System.out.println("Площа кола з радіусом 5: " + circleArea);

        // Виклик статичного методу power для піднесення числа до степеня
        int result = MathUtils.power(2, 3);
        System.out.println("2 у степені 3: " + result);

        // Виклик статичної змінної PI
        System.out.println("Число пі: " + MathUtils.PI);
    }

}
