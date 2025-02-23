package org.khnure.lect09ionio.ex1io.ex6objectinputstream;

import java.io.*;

//Серіалізацію та десеріалізацію об'єктів

//Роботу з ObjectInputStream/ObjectOutputStream

//Використання інтерфейсу Serializable

//Збереження стану об'єктів у файл

class Person implements Serializable {
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Person{name='" + name + "', age=" + age + "}";
    }
}

public class ObjectStreamExample {
    public static void main(String[] args) {
        try {
            // Створюємо об'єкт для серіалізації
            Person person = new Person("Марія", 30);

            // Записуємо об'єкт у файл
            ObjectOutputStream oos = new ObjectOutputStream(
                    new FileOutputStream("person.dat"));

            System.out.println("Записуємо об'єкт: " + person);
            oos.writeObject(person);
            oos.close();

            // Читаємо об'єкт з файлу
            ObjectInputStream ois = new ObjectInputStream(
                    new FileInputStream("person.dat"));

            Person readPerson = (Person) ois.readObject();
            System.out.println("Прочитано об'єкт: " + readPerson);
            ois.close();

        } catch (Exception e) {
            System.out.println("Помилка: " + e.getMessage());
        }
    }
}