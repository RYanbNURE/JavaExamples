package org.khnure.lect3oop.ex3polymorphism.ex3overload;

public class OverloadPolymorphismDemo {
    // Метод, який приймає два цілих числа та повертає їх суму
    public int add(int a, int b) {
        return a + b;
    }

    // Метод, який приймає три цілих числа та повертає їх суму
    public int add(int a, int b, int c) {
        return a + b + c;
    }

    // Метод, який приймає два числа з плаваючою комою та повертає їх суму
    public double add(double a, double b) {
        return a + b;
    }

    // Головний метод для тестування перевантажених методів
    public static void main(String[] args) {
        OverloadPolymorphismDemo demo = new OverloadPolymorphismDemo();

        // Виклик методу add з двома цілими числами
        int sum1 = demo.add(2, 3);
        System.out.println("Сума двох цілих чисел: " + sum1);

        // Виклик методу add з трьома цілими числами
        int sum2 = demo.add(2, 3, 4);
        System.out.println("Сума трьох цілих чисел: " + sum2);

        // Виклик методу add з двома числами з плаваючою комою
        double sum3 = demo.add(2.5, 3.7);
        System.out.println("Сума двох чисел з плаваючою комою: " + sum3);
    }
}
