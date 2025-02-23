package org.khnure.lect6collections.ex9generics;

import java.util.ArrayList;
import java.util.List;

public class Ex23 {

    public static void main(String[] args) {


        System.out.println("Starting execution");
        String stringTest = "test";
        Object objTest = stringTest;

        String[] strings = new String[]{"a", "b"};
        Object[] objects = strings;

        objects[0] = 1;
        System.out.println(objects[0]);

        List<String> listStrings = new ArrayList<>();

        listStrings.add("a");
        listStrings.add("b");

        List<Object> listObjects;
//        listObjects = listStrings;
    }
}
