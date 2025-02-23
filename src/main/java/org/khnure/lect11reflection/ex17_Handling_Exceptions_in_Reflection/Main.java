package org.khnure.lect11reflection.ex17_Handling_Exceptions_in_Reflection;

import java.lang.reflect.Method;

class Sample {
    public void test() throws Exception {
        throw new Exception("Testing exceptions");
    }
}

public class Main {
    public static void main(String[] args) {
        try {
            Sample sample = new Sample();
            Method method = Sample.class.getMethod("test");

            // Invoke method that throws an exception
            method.invoke(sample);
        } catch (Exception e) {
            System.out.println("Exception caught: " + e.getCause().getMessage());
        }
    }
}

// Українська: Цей приклад демонструє обробку виключень при використанні рефлексії.
