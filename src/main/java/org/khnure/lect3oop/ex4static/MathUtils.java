package org.khnure.lect3oop.ex4static;

// Клас MathUtils, що містить статичні методи для математичних обчислень
public class MathUtils {
    // Статична змінна для зберігання постійної пі
    public static final double PI = 3.14159;

    // Статичний метод для обчислення площі кола
    public static double calculateCircleArea(double radius) {
        return PI * radius * radius;
    }

    // Статичний метод для піднесення числа до степеня
    public static int power(int base, int exponent) {
        return (int) Math.pow(base, exponent);
    }
}
