package org.khnure.lect6acollectionsbasic.ex1list.ex1arraylists;

import java.util.Objects;

public record Student(String name, int age) implements Comparable{
    // Конструктор рекорду
    public Student {
        if (age < 0 || age > 120) {
            throw new IllegalArgumentException("Invalid age value");
        }
    }

    @Override
    public boolean equals(Object object) {
        if (this == object) return true;
        if (object == null || getClass() != object.getClass()) return false;

        Student student = (Student) object;

        if (age != student.age) return false;
        return Objects.equals(name, student.name);
    }

    @Override
    public int hashCode() {
        int result = name != null ? name.hashCode() : 0;
        result = 31 * result + age;
        return result;
    }



        @Override
    public int compareTo(Object o) {
        return 1;
//        return Integer.compare(, (this.name) ;
    }
}
