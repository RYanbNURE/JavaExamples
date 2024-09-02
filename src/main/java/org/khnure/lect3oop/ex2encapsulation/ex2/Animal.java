package org.khnure.lect3oop.ex2encapsulation.ex2;

// Клас, який являє собою тварину
public class Animal {
    // Приватна змінна для віку тварини
    private int age;

    // Захищений метод для отримання віку тварини
    protected int getAge() {
        return age;
    }

    // Захищений метод для встановлення віку тварини
    protected void setAge(int age) {
        this.age = age;
    }

    // Публічний метод для виведення віку тварини
    public void displayAge() {
        System.out.println("Вік тварини: " + age);
    }
}
