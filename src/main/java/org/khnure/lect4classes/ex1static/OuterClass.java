package org.khnure.lect4classes.ex1static;

// Зовнішній клас OuterClass
public class OuterClass {
    // Статичний вкладений (nested) клас StaticNestedClass
    public static class StaticNestedClass {
        // Метод у внутрішньому статичному класі
        public void display() {
            System.out.println("Метод у внутрішньому статичному класі");
        }
    }
}
