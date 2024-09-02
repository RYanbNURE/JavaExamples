package org.khnure.lect6collections.ex2linkedlist;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // Створення зв'язаного списку студентів
        List<Student> students = new LinkedList<>();

        // Додавання студентів до списку
        students.add(new Student("Іван Петров", 20));
        students.add(new Student("Марія Сидорова", 21));
        students.add(new Student("Андрій Іванов", 19));

        // Виведення списку студентів до консолі
        System.out.println("Список студентів:");
        for (Student student : students) {
            System.out.println(student); // автоматично викликає toString() метод рекорду
        }

        // Сортування списку студентів за віком
        Collections.sort(students, (s1, s2) -> Integer.compare(s1.age(), s2.age()));

        // Виведення відсортованого списку студентів до консолі
        System.out.println("\nВідсортований список студентів за віком:");
        for (Student student : students) {
            System.out.println(student);
        }

        // Пошук студента за іменем
        String searchName = "Марія Сидорова";
        Student foundStudent = students.stream()
                .filter(s -> s.name().equals(searchName))
                .findFirst()
                .orElseThrow(() -> new IllegalArgumentException("Студент не знайдений"));

        // Виведення знайденого студента до консолі
        System.out.println("\nЗнайдений студент: " + foundStudent);

        // Видалення студента з списку
        students.removeIf(s -> s.name().equals("Андрій Іванов"));

        // Виведення оновленого списку студентів до консолі
        System.out.println("\nОновлений список студентів після видалення:");
        for (Student student : students) {
            System.out.println(student);
        }
    }

}
