package org.khnure.lect6collections.ex01generics;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class Demo {
    public static void main(String[] args) {
        System.out.println("Program execution started");
        String[] stringsArray = new String[] {"a", "b", "c"};

        Object object = new String("test");
        List<String> stringList = new ArrayList<>();
//        String string = stringList.get(1);

        List<Object> objectList = new ArrayList<>();
//        String first = (String) objectList.getFirst();

        Collection<String> collection = stringList;

        Object[] objectsArray = stringsArray;

        Object objectIndex1 = objectsArray[1];
        String stringIndex1 = (String) objectsArray[1];
        objectsArray[0] = 1;

        if (objectIndex1 instanceof Integer) {
            Integer integerIndex1 = (Integer) objectIndex1;
        }

        objectsArray[0] = 1;
//        if (objectIndex1.getClass().equals(Integer.class))




        System.out.println(stringIndex1);
    }
}
