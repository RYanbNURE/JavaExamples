package org.khnure.lect6collections.ex1arraylists;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // Створення списку студентів
        List<Student> students = new ArrayList<>();

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
        System.out.println("\nСписок студентів після видалення:");
        for (Student student : students) {
            System.out.println(student);
        }
    }
}
/*
### Опис коду:
1. **Створення рекорду `Student`**: Рекорд `Student` містить поля `name` та `age`. Перевірка віку здійснюється у конструкторі, щоб запобігти неправильним
значенням.
2. **Створення списку студентів**: Використовується `ArrayList` для зберігання об'єктів `Student`.
3. **Додавання студентів до списку**: За допомогою методу `add` об'єкти `Student` додаються до списку.
4. **Виведення списку студентів**: Використовується цикл `for-each` для виведення інформації про кожного студента.
5. **Сортування списку студентів**: Список сортується за віком за допомогою методу `Collections.sort`, де порівняння відбувається за допомогою лямбда-виразу.
6. **Пошук студента**: За допомогою Stream API здійснюється пошук студента за іменем, якщо такий не знайдено, кидається виняток.
7. **Видалення студента**: Використовується метод `removeIf` для видалення студента зі списку на основі певної умови.
8. **Виведення оновленого списку**: Знову використовується цикл `for-each` для виведення інформації про кожного студента в оновленому списку.
 */