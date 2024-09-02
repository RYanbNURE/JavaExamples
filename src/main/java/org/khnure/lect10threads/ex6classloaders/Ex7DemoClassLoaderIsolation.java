package org.khnure.lect10threads.ex6classloaders;

// Приклад, який демонструє, як зламати ізоляцію між завантажувачами класів
public class Ex7DemoClassLoaderIsolation {
    public static void main(String[] args) throws Exception {
        CustomClassLoader loader1 = new CustomClassLoader();
        Class<?> clazz1 = loader1.loadClass("HelloWorld");

        CustomClassLoader loader2 = new CustomClassLoader();
        Class<?> clazz2 = loader2.loadClass("HelloWorld");

        System.out.println(clazz1 == clazz2); // Повинно бути false, якщо класи різні
    }

}
