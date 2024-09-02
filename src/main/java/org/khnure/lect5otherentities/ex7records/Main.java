package org.khnure.lect5otherentities.ex7records;

public class Main {
    public static void main(String[] args) {
        // Створення екземпляру Address для класу PersonClass
        PersonClass.Address address1 = new PersonClass.Address("Main St", "Anytown", "12345");
        // Створення екземпляру PersonClass з адресою
        PersonClass person1 = new PersonClass("John Doe", 30, address1);
        System.out.println(person1);

        // Створення екземпляру Address для рекорду PersonRecord
        PersonRecord.Address address2 = new PersonRecord.Address("Main St", "Anytown", "12345");
        // Створення екземпляру PersonRecord з адресою
        PersonRecord person2 = new PersonRecord("John Doe", 30, address2);
        System.out.println(person2);
    }
}

/*
### Коментарі:
1. `public class PersonClass` - Оголошуємо клас `PersonClass` з ім'ям та віком.
2. `private final String name;` - Приватне, незмінне текстове поле для імені.
3. `private final int age;` - Приватне, незмінне ціле числове поле для віку.
4. `private final Address address;` - Приватне, незмінне поле для адреси (вкладений клас).
5. `public PersonClass(String name, int age, Address address)` - Конструктор класу `PersonClass`.
6. `public String getName()` - Геттер для імені.
7. `public int getAge()` - Геттер для віку.
8. `public Address getAddress()` - Геттер для адреси.
9. `@Override public String toString()` - Перевизначений метод для представлення об'єкта у вигляді рядка.
10. `public static class Address` - Вкладений статичний клас `Address`.
11. `private final String street;` - Приватне, незмінне текстове поле для вулиці.
12. `private final String city;` - Приватне, незмінне текстове поле для міста.
13. `private final String zipCode;` - Приватне, незмінне текстове поле для поштового індексу.
14. `public Address(String street, String city, String zipCode)` - Конструктор класу `Address`.
15. `public String getStreet()` - Геттер для вулиці.
16. `public String getCity()` - Геттер для міста.
17. `public String getZipCode()` - Геттер для поштового індексу.
18. `@Override public String toString()` - Перевизначений метод для представлення об'єкта у вигляді рядка.
19. `public static Address createAddress(String street, String city, String zipCode)` - Статичний метод для створення нового екземпляру `Address`.
20. `record PersonRecord(String name, int age, Address address)` - Оголошуємо рекорд `PersonRecord` з ім'ям та віком.
21. `record Address(String street, String city, String zipCode)` - Вкладений рекорд `Address`.
22. `public static Address createAddress(String street, String city, String zipCode)` - Статичний метод для створення нового екземпляру `Address`.
23. `@Override public String toString()` - Перевизначений метод для представлення об'єкта у вигляді рядка.
24. `public static void main(String[] args)` - Головний метод класу `Main` для демонстрації роботи з `PersonClass` та `PersonRecord`.
25. `PersonClass.Address address1 = new PersonClass.Address("Main St", "Anytown", "12345");` - Створення екземпляру адреси для класу `PersonClass`.
26. `PersonClass person1 = new PersonClass("John Doe", 30, address1);` - Створення екземпляра `PersonClass` з ім'ям "John Doe", віком 30 та адресою.
27. `System.out.println(person1);` - Вивід інформації про `person1`.
28. `PersonRecord.Address address2 = new PersonRecord.Address("Main St", "Anytown", "12345");` - Створення екземпляру адреси для рекорду `PersonRecord`.
29. `PersonRecord person2 = new PersonRecord("John Doe", 30, address2);` - Створення екземпляра `PersonRecord` з ім'ям "John Doe", віком 30 та адресою.
30. `System.out.println(person2);` - Вивід інформації про `person2`.
 */