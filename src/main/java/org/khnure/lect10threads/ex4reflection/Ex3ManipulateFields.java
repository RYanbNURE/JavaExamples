package org.khnure.lect10threads.ex4reflection;

import java.lang.reflect.Field;

//This class shows how to manipulate private fields using reflection.
public class Ex3ManipulateFields {
    private String message = "Hello, World!";

    public static void main(String[] args) throws Exception {
        Class<?> clazz = Class.forName("ManipulateFields");
        Object instance = clazz.getDeclaredConstructor().newInstance();
        Field field = clazz.getDeclaredField("message");
        field.setAccessible(true);
        String value = (String) field.get(instance);
        System.out.println("Поле: " + value);
    }
}
