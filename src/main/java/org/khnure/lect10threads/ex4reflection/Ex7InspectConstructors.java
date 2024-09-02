package org.khnure.lect10threads.ex4reflection;

import java.lang.reflect.Constructor;

//This class demonstrates how to inspect and invoke constructors using reflection.
public class Ex7InspectConstructors {
    public Ex7InspectConstructors() {}
    private Ex7InspectConstructors(String arg) {}

    public static void main(String[] args) throws Exception {
        Class<?> clazz = Class.forName("InspectConstructors");
        Constructor<?> constructor = clazz.getDeclaredConstructor();
        System.out.println("Конструктор без параметрів: " + constructor);
        Constructor<?> privateConstructor = clazz.getDeclaredConstructor(String.class);
        privateConstructor.setAccessible(true);
        Object instance = privateConstructor.newInstance("arg");
    }

}
