package org.khnure.lect10threads.ex4reflection;

interface MyInterface {
    void doSomething();
}

//This class shows how to inspect interfaces implemented by a class using reflection.
public class Ex11ImplementsInterfaces implements MyInterface{
    @Override
    public void doSomething() {
        System.out.println("Doing something!");
    }

    public static void main(String[] args) throws Exception {
        Class<?> clazz = Class.forName("ImplementsInterfaces");
        if (MyInterface.class.isAssignableFrom(clazz)) {
            System.out.println("Клас реалізує інтерфейc");
        }
    }
}
