package org.khnure.lect6acollectionsbasic.ex4map.ex2treemaps;

import java.util.TreeMap;

/**
 * Демонстрація використання TreeMap з об'єктами
 */
public class Ex4TreeMapWithObjects {
    static class Student implements Comparable<Student> {
        String name;
        int age;

        Student(String name, int age) {
            this.name = name;
            this.age = age;
        }

        @Override
        public int compareTo(Student other) {
            return Integer.compare(this.age, other.age);
        }

        @Override
        public String toString() {
            return name + "(" + age + ")";
        }
    }

    public static void main(String[] args) {
        TreeMap<Student, String> studentGrades = new TreeMap<>();

        studentGrades.put(new Student("John", 20), "A");
        studentGrades.put(new Student("Alice", 19), "B");
        studentGrades.put(new Student("Bob", 21), "A+");

        System.out.println("Студенти відсортовані за віком: " + studentGrades);

        // Пошук студента за віком
        Student searchKey = new Student("", 20);
        System.out.println("Оцінка студента віком 20: " + studentGrades.get(searchKey));
    }
}
