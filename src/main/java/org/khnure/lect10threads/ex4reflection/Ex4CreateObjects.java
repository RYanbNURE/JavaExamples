package org.khnure.lect10threads.ex4reflection;

//This class demonstrates how to create instances of a class using reflection.
public class Ex4CreateObjects {
    public static void main(String[] args) throws Exception {
        Class<?> clazz = Class.forName("java.lang.String");
        Object obj = clazz.getDeclaredConstructor().newInstance();
        System.out.println("Об'єкт: " + obj);
    }
}
