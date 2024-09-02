package org.khnure.lect10threads.ex4reflection;

import java.lang.reflect.Method;
import java.util.List;

public class Ex5HandleGenerics {
    public void printList(List<String> list) {
        System.out.println("List of Strings: " + list);
    }

    public static void main(String[] args) throws Exception {
        Class<?> clazz = Class.forName("HandleGenerics");
        Method method = clazz.getMethod("printList", List.class);
        System.out.println("Тип параметра: " + method.getParameterTypes()[0].getTypeName());
    }

}
