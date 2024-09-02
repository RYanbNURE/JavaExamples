package org.khnure.lect10threads.ex4reflection;

import java.lang.reflect.Method;
import java.util.List;

public class Ex10HandleGenericMethods {
    public <T> void printList(List<T> list) {
        System.out.println("List of " + list.getClass().getName() + ": " + list);
    }

    public static void main(String[] args) throws Exception {
        Class<?> clazz = Class.forName("HandleGenericMethods");
        Method method = clazz.getMethod("printList", List.class);
        System.out.println("Тип параметра: " + method.getParameterTypes()[0].getTypeName());
    }

}
