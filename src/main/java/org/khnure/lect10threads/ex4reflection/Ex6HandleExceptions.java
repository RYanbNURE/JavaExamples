package org.khnure.lect10threads.ex4reflection;

import java.lang.reflect.Method;


//This class shows how to handle exceptions that might occur during reflection operations.
public class Ex6HandleExceptions {
    public void potentiallyFailingMethod() throws IllegalArgumentException, IllegalAccessException {
        throw new IllegalArgumentException("This method can fail.");
    }

    public static void main(String[] args) {
        try {
            Class<?> clazz = Class.forName("HandleExceptions");
            Method method = clazz.getMethod("potentiallyFailingMethod");
            method.invoke(clazz.getDeclaredConstructor().newInstance());
        } catch (Exception e) {
            System.out.println("Помилка: " + e.getMessage());
        }
    }

}
