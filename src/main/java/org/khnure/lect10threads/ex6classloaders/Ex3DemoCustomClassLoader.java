package org.khnure.lect10threads.ex6classloaders;

import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;

// Навчальний приклад створення власного завантажувача класів з кешуванням
public class Ex3DemoCustomClassLoader {
    public static void main(String[] args) throws Exception {
        CustomClassLoader loader = new CustomClassLoader();
        Class<?> clazz = loader.loadClass("HelloWorld");
        Object instance = clazz.getDeclaredConstructor().newInstance();
        Method method = clazz.getMethod("sayHello");
        method.invoke(instance);
    }
}

class CustomClassLoader extends ClassLoader {
    private Map<String, byte[]> classCache = new HashMap<>();

    @Override
    public Class<?> loadClass(String name) throws ClassNotFoundException {
        if (classCache.containsKey(name)) {
            return defineClass(null, classCache.get(name), 0, classCache.get(name).length);
        }
        try {
            byte[] classData = getClassData(); // Припустимо, що це метод для отримання байт-коду класу
            classCache.put(name, classData);
            return defineClass(null, classData, 0, classData.length);
        } catch (Exception e) {
            throw new ClassNotFoundException("Клас не знайдено: " + name, e);
        }
    }

    private byte[] getClassData() {
        // Приклад байт-коду для HelloWorld
        return new byte[]{/* байт-код */};
    }

}
