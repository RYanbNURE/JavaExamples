package org.khnure.lect10threads.ex4reflection;

import java.lang.reflect.Field;

public class Ex8ModifyFinalFields {
    public final String message = "Initial Value";

    public static void main(String[] args) throws Exception {
        Class<?> clazz = Class.forName("ModifyFinalFields");
        Object instance = clazz.getDeclaredConstructor().newInstance();
        Field field = clazz.getDeclaredField("message");
        field.setAccessible(true);
        field.set(instance, "Modified Value");
        System.out.println("Final поле: " + field.get(instance));
    }
}
