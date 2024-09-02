package org.khnure.lect10threads.ex6classloaders;

import java.lang.reflect.Method;
import java.net.URL;
import java.net.URLClassLoader;

// Використання JAR файлу як частини classpath у Java
public class Ex6DemoJARClassPath {
    public static void main(String[] args) throws Exception {
        URL url = new URL("file:///path/to/your.jar");
        URLClassLoader loader = new URLClassLoader(new URL[]{url});
        Class<?> clazz = loader.loadClass("HelloWorld");
        Object instance = clazz.getDeclaredConstructor().newInstance();
        Method method = clazz.getMethod("sayHello");
        method.invoke(instance);
    }

}
