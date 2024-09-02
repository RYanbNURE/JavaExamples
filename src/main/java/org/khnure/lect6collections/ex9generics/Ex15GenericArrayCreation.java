package org.khnure.lect6collections.ex9generics;

import java.lang.reflect.Array;

public class Ex15GenericArrayCreation<T> {
    private T[] array;

    public Ex15GenericArrayCreation(Class<T> clazz, int length) {
        @SuppressWarnings("unchecked")
        final T[] array = (T[]) Array.newInstance(clazz, length);
        this.array = array; // Створення масиву
    }

    public void set(int index, T value) {
        array[index] = value; // Встановлюємо значення
    }

    public T get(int index) {
        return array[index]; // Отримуємо значення
    }

    public static void main(String[] args) {
        Ex15GenericArrayCreation<String> gac = new Ex15GenericArrayCreation<>(String.class, 10);
        gac.set(0, "Hello");
        System.out.println(gac.get(0)); // Друкуємо значення масиву
    }
}
