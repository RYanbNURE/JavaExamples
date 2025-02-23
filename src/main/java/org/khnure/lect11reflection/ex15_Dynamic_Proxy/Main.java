package org.khnure.lect11reflection.ex15_Dynamic_Proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

interface MyInterface {
    void myMethod();
}

class RealClass implements MyInterface {
    public void myMethod() {
        System.out.println("Real Class Method");
    }
}

class MyInvocationHandler implements InvocationHandler {
    private final Object target;

    public MyInvocationHandler(Object target) {
        this.target = target;
    }

    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("Before invocation");
        Object result = method.invoke(target, args);
        System.out.println("After invocation");
        return result;
    }
}

public class Main {
    public static void main(String[] args) {
        MyInterface realObj = new RealClass();
        MyInterface proxyObj = (MyInterface) Proxy.newProxyInstance(
                MyInterface.class.getClassLoader(),
                new Class<?>[]{MyInterface.class},
                new MyInvocationHandler(realObj)
        );

        proxyObj.myMethod();
    }
}

// Українська: Цей приклад демонструє використання динамічного проксі за допомогою рефлексії.
