package org.khnure.lect5otherentities.ex7records;

public record PersonRecord(String name, int age, Address address) {
    // Вкладений рекорд Address
    record Address(String street, String city, String zipCode) {}

    @Override
    public String toString() {
        return "PersonRecord{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", address=" + address +
                '}';
    }

    // Статичний метод для створення нового екземпляру Address
    public static Address createAddress(String street, String city, String zipCode) {
        return new Address(street, city, zipCode);
    }
}
