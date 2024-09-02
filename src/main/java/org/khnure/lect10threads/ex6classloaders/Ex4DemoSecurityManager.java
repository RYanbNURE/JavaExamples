package org.khnure.lect10threads.ex6classloaders;

import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;

// Приклад, який показує, як зламати безпековий менеджер у Java
public class Ex4DemoSecurityManager {
    public static void main(String[] args) {
        System.setSecurityManager(new SecurityManager() {
            @Override
            public void checkPackageAccess(String pkg) {
                throw new SecurityException("Доступ до пакету заборонено");
            }
        });

        try {
            Class<?> clazz = Class.forName("java.lang.System");
            Object instance = clazz.getDeclaredConstructor().newInstance();
            Method method = clazz.getMethod("exit", int.class);
            method.invoke(instance, 0);
        } catch (Exception e) {
            System.err.println("Помилка: " + e.getMessage());
        }
    }

}
