package org.khnure.lect6collections.ex9generics;

public class Ex4BoundedTypes<T> {
    private T num;

    public Ex4BoundedTypes(T num) {
        this.num = num; // Встановлюємо значення T
    }

    public void print() {
        System.out.println("Number: " + num); // Друкуємо значення T
    }

    public static void main(String[] args) {
        Ex4BoundedTypes<Integer> bounded = new Ex4BoundedTypes<>(10);
        bounded.print();

        // BoundedTypes<String> invalidBounded = new BoundedTypes<>("Hello"); // This will raise a compilation error
    }
}
