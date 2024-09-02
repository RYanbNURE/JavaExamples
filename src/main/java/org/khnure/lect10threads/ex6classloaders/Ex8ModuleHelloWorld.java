//// Використання модульної системи в Java 9 і вище для завантаження класів
//module DemoModuleSystem {
//    requires java.sql;
//    exports com.example;
//}
//
//// В цьому прикладі ми створюємо модуль, який експортує HelloWorld клас
//module com.example {
//        exports HelloWorld;
//        }

package org.khnure.lect10threads.ex6classloaders;

// Використання модульної системи в Java 9 і вище для завантаження класів

// Клас HelloWorld тепер може бути використаний в інших модулях
public class Ex8ModuleHelloWorld {
    public void sayHello() {
        System.out.println("Привіт, світ!");
    }
}
