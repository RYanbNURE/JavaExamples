package org.khnure.lect5otherentities.ex1interfaces;

// Головний клас для демонстрації використання інтерфейсів в Java
public class Main {

    public static void main(String[] args) {
        // Створення об'єктів, які реалізують інтерфейс Printable
        Printable book = new Book("1984", "George Orwell");
        Printable magazine = new Magazine("National Geographic", 30);

        // Виклик методів через інтерфейс Printable
        printInfo(book);
        printInfo(magazine);
    }

    // Метод для друку інформації про об'єкти, які реалізують інтерфейс Printable
    public static void printInfo(Printable printable) {
        printable.print(); // Викликає метод print() визначений у інтерфейсі Printable
    }
}

/*
### Коментарі до коду:
1. `public class Main` - Головний клас для демонстрації використання інтерфейсів в Java.
2. `public static void main(String[] args)` - Головний метод, який запускається першим у програмі.
3. `Printable book = new Book("1984", "George Orwell");` - Створення об'єкта класу Book, що реалізує інтерфейс Printable.
4. `Printable magazine = new Magazine("National Geographic", 30);` - Створення об'єкта класу Magazine, що реалізує інтерфейс Printable.
5. `printInfo(book);` - Виклик методу printInfo з аргументом book, який приймає будь-який об'єкт, що реалізує інтерфейс Printable.
6. `printInfo(magazine);` - Виклик методу printInfo з аргументом magazine, аналогічно попередньому виклику.
7. `interface Printable` - Оголошення інтерфейсу Printable з обов'язковим для реалізації методом print().
8. `public void print()` - Метод, який повинен бути реалізований у класах, що реалізують цей інтерфейс.
9. `class Book implements Printable` - Клас Book, що реалізує інтерфейс Printable.
10. `private String title;` - Приватна змінна для зберігання назви книги.
11. `private String author;` - Приватна змінна для зберігання автора книги.
12. `public Book(String title, String author)` - Конструктор класу Book, ініціалізує змінні title та author.
13. `printable.print();` - Виклик методу print() визначеного у інтерфейсі Printable для будь-якого об'єкта, що реалізує цей інтерфейс.
14. `class Magazine implements Printable` - Клас Magazine, що реалізує інтерфейс Printable.
15. `private String name;` - Приватна змінна для зберігання назви журналу.
16. `private int issueNumber;` - Приватна змінна для зберігання номера випуску журналу.
17. `public Magazine(String name, int issueNumber)` - Конструктор класу Magazine, ініціалізує змінні name та issueNumber.
 */