package org.khnure.lect11reflection.ex10;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.reflect.Field;

@Retention(RetentionPolicy.RUNTIME)
@interface MyAnnotation {
}

class Person {
    @MyAnnotation
    public String name;
}

public class Main {
    public static void main(String[] args) {
        try {
            Field field = Person.class.getField("name");

            // Check if field is annotated with MyAnnotation
            if (field.isAnnotationPresent(MyAnnotation.class)) {
                System.out.println("Field 'name' is annotated with @MyAnnotation");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

// Українська: Цей приклад демонструє, як перевірити, чи поле анотовано, за допомогою методу isAnnotationPresent().