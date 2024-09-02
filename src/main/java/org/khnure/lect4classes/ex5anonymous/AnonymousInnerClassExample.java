package org.khnure.lect4classes.ex5anonymous;

// Основной класс, що містить анонімну внутрішню класу
public class AnonymousInnerClassExample {
    // Закритий інтегральний змінна, яка буде використовуватися в анонімному класі
    private int hiddenValue = 10;

    // Метод, який повертає об'єкт-інтерфейс з анонімним класом
    public MyInterface getMyInterfaceInstance() {
        return new MyInterface() {
            // Перевизначення методу інтерфейсу
            @Override
            public void doSomething() {
                System.out.println("Виконуємо дію зі значенням: " + hiddenValue);
            }
        };
    }

    // Інтерфейс, який буде реалізований в анонімному класі
    interface MyInterface {
        void doSomething();
    }

    public static void main(String[] args) {
        AnonymousInnerClassExample example = new AnonymousInnerClassExample();
        // Отримання екземпляру інтерфейсу та виклик методу
        MyInterface myIface = example.getMyInterfaceInstance();
        myIface.doSomething(); // Виведе: Виконуємо дію зі значенням: 10
    }
}
/*
### Огляд коду:

1. **Клас `AnonymousInnerClassExample`**: Це головний клас, який містить анонімну внутрішню класу.
2. **Закрита змінна `hiddenValue`**: Ця змінна є приватною і використовується в анонімному класі для демонстрації доступу до неї.
3. **Метод `getMyInterfaceInstance()`**: Цей метод повертає екземпляр інтерфейсу `MyInterface`, реалізованого у вигляді анонімного класу.
4. **Інтерфейс `MyInterface`**: Визначає абстрактний метод `doSomething()`, який буде перевизначено в анонімному класі.
5. **Анонімний клас**: Реалізує інтерфейс `MyInterface` та перевизначає його метод `doSomething()`, виводячи значення закритої змінної `hiddenValue`.
6. **Метод `main`**: Створює екземпляр головного класу, отримує екземпляр інтерфейсу через метод `getMyInterfaceInstance()` та викликає його метод
`doSomething()`.
 */