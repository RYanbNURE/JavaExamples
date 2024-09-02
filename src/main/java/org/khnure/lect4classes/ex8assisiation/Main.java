package org.khnure.lect4classes.ex8assisiation;

// Головний клас для тестування нашої реалізації
public class Main {
    public static void main(String[] args) {
        // Створення об'єктів студента та книг
        Student student = new Student();
        Book book1 = new Book("Java Programming");
        Book book2 = new Book("Software Engineering");

        // Додавання книг до списку книг студента
        student.addBook(book1);
        student.addBook(book2);

        // Виведення назви кожної книги, яку має студент
        System.out.println("Книги студента:");
        for (Book book : student.getBooks()) {
            System.out.println(book.getTitle());
        }
    }
}

/*
### Опис коду:
1. **Клас `Student`**:
   - Має приватну змінну `books`, яка є списком об'єктів класу `Book`.
   - Конструктор ініціалізує цей список.
   - Метод `addBook(Book book)` додає книгу до списку.
   - Метод `getBooks()` повертає список книг студента.

2. **Клас `Book`**:
   - Має приватну змінну `title`, яка зберігає назву книги.
   - Конструктор ініціалізує цю змінну.
   - Метод `getTitle()` повертає назву книги.

3. **Головний клас `Main`**:
   - Створює об'єкт `Student`.
   - Створює кілька об'єктів `Book`.
   - Додає ці книги до списку книг студента.
   - Виводить назву кожної книги, яку має студент.
*/