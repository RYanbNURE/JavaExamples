package org.khnure.lect10threads.ex4reflection;

import java.lang.reflect.Method;

public class Ex9InspectMethodParameters {
    public void printParams(String arg1, int arg2) {
        System.out.println("String: " + arg1 + ", Int: " + arg2);
    }

    public static void main(String[] args) throws Exception {
        Class<?> clazz = Class.forName("InspectMethodParameters");
        Method method = clazz.getMethod("printParams", String.class, int.class);
        System.out.println("Кількість параметрів: " + method.getParameterCount());
    }
}
