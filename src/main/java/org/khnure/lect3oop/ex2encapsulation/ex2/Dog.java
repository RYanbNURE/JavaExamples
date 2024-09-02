package org.khnure.lect3oop.ex2encapsulation.ex2;

// Клас, який наслідує Animal і демонструє захищені та публічні члени
public class Dog extends Animal {
    // Публічний конструктор для створення об'єкту Dog
    public Dog(int age) {
        setAge(age); // Встановлюємо вік тварини через захищений метод
    }

    // Метод, який використовує публічний метод displayAge() для виведення віку собаки
    public void displayDogAge() {
        displayAge();
    }
}
