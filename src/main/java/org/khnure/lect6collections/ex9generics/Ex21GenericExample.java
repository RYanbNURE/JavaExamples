package org.khnure.lect6collections.ex9generics;

public class Ex21GenericExample {
    // A generic method that accepts only objects of classes that extend Number
    public static <T extends Number> void printNumber(T number) {
        System.out.println(number);
    }

    public static void main(String[] args) {
        printNumber(10);  // Integer is a subclass of Number
        printNumber(3.14);  // Double is a subclass of Number

        // You can also use wrappers for other numeric types
        printNumber(Byte.valueOf("1"));
        printNumber(Long.valueOf("123456789012345"));
        printNumber(Float.valueOf("23.56"));

        // Uncommenting the following line will cause a compilation error
        // because String does not extend Number
        // printNumber("Hello World");
    }
}
