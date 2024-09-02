package org.khnure.lect4classes.ex4local;

public class LocalInnerClassExample {
    // Глобальна змінна
    private int globalVar = 10;

    // Метод, в якому створюється локальний внутрішній клас
    public void display() {
        // Локальна змінна
        int localVar = 20;

        // Локальний внутрішній клас
        class LocalInnerClass {
            private int innerVar = 30;

            // Метод локального внутрішнього класу
            public void display() {
                System.out.println("Глобальна змінна: " + globalVar); // Виводить значення глобальної змінної
                System.out.println("Локальна змінна: " + localVar);   // Виводить значення локальної змінної
                System.out.println("Змінна в локальному внутрішньому класі: " + innerVar); // Виводить значення змінної в локальному внутрішньому класі
            }
        }

        // Створення екземпляру локального внутрішнього класу та виклик його методу
        LocalInnerClass localInner = new LocalInnerClass();
        localInner.display();
    }

    public static void main(String[] args) {
        // Створення екземпляру зовнішнього класу та виклик його методу
        LocalInnerClassExample outer = new LocalInnerClassExample();
        outer.display();
    }
}
/*
### Коментарі:
1. `public class LocalInnerClassExample {` - Створюється зовнішній клас з ім'ям `LocalInnerClassExample`.
2. `private int globalVar = 10;` - Оголошується приватна глобальна змінна `globalVar` з початковим значенням 10.
3. `public void display() {` - Визначається публічний метод `display` для зовнішнього класу.
4. `int localVar = 20;` - Оголошується локальна змінна `localVar` з початковим значенням 20.
5. `class LocalInnerClass {` - В методі `display` визначається локальний внутрішній клас з ім'ям `LocalInnerClass`.
6. `private int innerVar = 30;` - Оголошується приватна змінна `innerVar` в локальному внутрішньому класі з початковим значенням 30.
7. `public void display() {` - Визначається публічний метод `display` для локального внутрішнього класу.
8. `System.out.println("Глобальна змінна: " + globalVar);` - Виводиться значення глобальної змінної.
9. `System.out.println("Локальна змінна: " + localVar);` - Виводиться значення локальної змінної.
10. `System.out.println("Змінна в локальному внутрішньому класі: " + innerVar);` - Виводиться значення змінної в локальному внутрішньому класі.
11. `LocalInnerClass localInner = new LocalInnerClass();` - Створюється екземпляр локального внутрішнього класу.
12. `localInner.display();` - Викликається метод `display` для локального внутрішнього класу.
13. `public static void main(String[] args) {` - Головний метод, який запускає виконання програми.
14. `LocalInnerClassExample outer = new LocalInnerClassExample();` - Створюється екземпляр зовнішнього класу.
15. `outer.display();` - Викликається метод `display` для зовнішнього класу.

Цей приклад демонструє, як локальний внутрішній клас може мати доступ до змінних та методів свого батьківського методу, а також до глобальних змінних зовнішнього
класу.
 */