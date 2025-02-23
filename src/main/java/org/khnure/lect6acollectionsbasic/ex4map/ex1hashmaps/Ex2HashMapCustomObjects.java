package org.khnure.lect6acollectionsbasic.ex4map.ex1hashmaps;
import java.util.HashMap;

public class Ex2HashMapCustomObjects {

    /**
     * Демонстрація використання HashMap з користувацькими об'єктами
     */

        static class Student {
            String name;
            int age;

            Student(String name, int age) {
                this.name = name;
                this.age = age;
            }

            @Override
            public String toString() {
                return "Student{name='" + name + "', age=" + age + "}";
            }
        }

        public static void main(String[] args) {
            HashMap<Integer, Student> students = new HashMap<>();

            // Додавання об'єктів
            students.put(1, new Student("Ivan", 20));
            students.put(2, new Student("Maria", 21));

            System.out.println("Студенти: " + students);

            // Отримання і модифікація об'єкта
            Student student = students.get(1);
            student.age = 22;

            System.out.println("Після модифікації: " + students);
        }
    }
