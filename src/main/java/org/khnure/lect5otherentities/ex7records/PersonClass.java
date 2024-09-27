package org.khnure.lect5otherentities.ex7records;

public class PersonClass {

    private final String name;
    private final int age;
    private final Address address;  // Вкладений клас Address

    // Конструктор класу Person
    public PersonClass(String name, int age, Address address) {
        this.name = name;
        this.age = age;
        this.address = address;
    }

    // Геттери для полів
    public String getName() { return name; }
    public int getAge() { return age; }
    public Address getAddress() { return address; }

    @Override
    public String toString() {
        return "PersonClass{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", address=" + address +
                '}';
    }

    // Вкладений клас Address
    public static class Address {
        private final String street;
        private final String city;
        private final String zipCode;

        // Конструктор класу Address
        public Address(String street, String city, String zipCode) {
            this.street = street;
            this.city = city;
            this.zipCode = zipCode;
        }

        // Геттери для полів
        public String getStreet() { return street; }
        public String getCity() { return city; }
        public String getZipCode() { return zipCode; }

        @Override
        public String toString() {
            return "Address{" +
                    "street='" + street + '\'' +
                    ", city='" + city + '\'' +
                    ", zipCode='" + zipCode + '\'' +
                    '}';
        }
    }

    // Статичний метод для створення нового екземпляру Address
    public static Address createAddress(String street, String city, String zipCode) {
        return new Address(street, city, zipCode);
    }
}
