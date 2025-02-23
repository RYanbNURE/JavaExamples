package org.khnure.lect10reflection.ex18_Getting_Generic_Types;

import java.lang.reflect.Field;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        try {
            Field field = Main.class.getDeclaredField("stringList");
            Type type = field.getGenericType();

            if (type instanceof ParameterizedType) {
                ParameterizedType pType = (ParameterizedType) type;
                Type[] typeArguments = pType.getActualTypeArguments();

                System.out.println("Generic Type:");
                for (Type t : typeArguments) {
                    System.out.println(t.getTypeName());
                }
            }
        } catch (NoSuchFieldException e) {
            e.printStackTrace();
        }
    }

    private List<String> stringList;
}

// Українська: Цей приклад демонструє, як отримати генеричні типи за допомогою рефлексії.