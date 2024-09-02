package org.khnure.lect4classes.ex2static;

// Головний клас з методом main для демонстрації
public class InnerStaticNestedClassDemo {
    // Статичний вкладений клас, доступний через MainClass.NestedStaticClass
    public static class NestedStaticClass {
        private static String staticField = "Статичне поле";
        private String instanceField = "Інстанційне поле";

        // Статичний метод у вкладеному класі
        public static void staticMethod() {
            System.out.println("Статичний метод у вкладеному класі");
        }

        // Метод екземпляра у вкладеному класі
        public void instanceMethod() {
            System.out.println("Метод екземпляра у вкладеному класі");
        }
    }

    public static void main(String[] args) {
        // Створення об'єкту вкладеного статичного класу
        InnerStaticNestedClassDemo.NestedStaticClass nestedObject = new InnerStaticNestedClassDemo.NestedStaticClass();

        // Виклик статичних полів та методів через клас
        System.out.println(InnerStaticNestedClassDemo.NestedStaticClass.staticField);
        InnerStaticNestedClassDemo.NestedStaticClass.staticMethod();

        // Виклик інстанційних полів та методів через об'єкт
        nestedObject.instanceMethod();
    }

    /*
    ### Пояснення коду:
1. **Головний клас `InnerStaticNestedClassDemo`**: містить метод `main`, який є точкою входу до програми.
2. **Внутрішній статичний клас `NestedStaticClass`**: має статичне поле (`staticField`) та інстанційне поле (`instanceField`), а також статичний метод
(`staticMethod`) та метод екземпляра (`instanceMethod`).
3. У методі `main`:
   - Створений об'єкт вкладеного статичного класу через повну іменування (`InnerStaticNestedClassDemo.NestedStaticClass`).
   - Виведене значення статичного поля через клас (`InnerStaticNestedClassDemo.NestedStaticClass.staticField`).
   - Виклик статичного методу через клас (`InnerStaticNestedClassDemo.NestedStaticClass.staticMethod()`).
   - Виклик методу екземпляра через об'єкт (`nestedObject.instanceMethod()`).

Цей приклад демонструє, як використовувати внутрішні статичні вкладені класи для організації коду та доступу до членів класу з різних частин програми.
    */
}
