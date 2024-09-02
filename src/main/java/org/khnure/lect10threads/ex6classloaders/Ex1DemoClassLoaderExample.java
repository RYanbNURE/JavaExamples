package org.khnure.lect10threads.ex6classloaders;

import java.lang.reflect.Method;
//// Базовий приклад використання завантажувача класів
public class Ex1DemoClassLoaderExample {
    public static void main(String[] args) throws Exception {
        MyClassLoader customClassLoader = new MyClassLoader();
        Class<?> clazz = customClassLoader.loadClass("HelloWorld");
        Object instance = clazz.getDeclaredConstructor().newInstance();
        Method method = clazz.getMethod("sayHello");
        method.invoke(instance);
    }
}

class MyClassLoader extends ClassLoader {
    public Class<?> loadClass(String name) throws ClassNotFoundException {
        if ("HelloWorld".equals(name)) {
            byte[] classData = getClassData(); // Припустимо, що це метод для отримання байт-коду класу
            return defineClass(null, classData, 0, classData.length);
        }
        return super.loadClass(name);
    }

    private byte[] getClassData() {
        // Приклад байт-коду для HelloWorld
        return new byte[]{/* байт-код */};
    }
}

class HelloWorld {
    public void sayHello() {
        System.out.println("Привіт, світ!");
    }
}
