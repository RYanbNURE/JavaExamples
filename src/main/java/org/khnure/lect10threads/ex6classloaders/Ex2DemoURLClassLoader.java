package org.khnure.lect10threads.ex6classloaders;

import java.lang.reflect.Method;
import java.net.URL;
import java.net.URLClassLoader;

// Використання URLClassLoader для завантаження класу з віддаленого джерела
public class Ex2DemoURLClassLoader {
    public static void main(String[] args) throws Exception {
        URL[] urls = {new URL("http://example.com/HelloWorld.class")};
        URLClassLoader loader = new URLClassLoader(urls);
        Class<?> clazz = loader.loadClass("HelloWorld");
        Object instance = clazz.getDeclaredConstructor().newInstance();
        Method method = clazz.getMethod("sayHello");
        method.invoke(instance);
    }
}
