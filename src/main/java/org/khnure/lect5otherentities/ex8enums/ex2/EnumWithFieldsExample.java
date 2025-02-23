package org.khnure.lect5otherentities.ex8enums.ex2;

//Enum з полями та конструктором

//Методи в enum

//Використання параметрів для кожного значення enum

//Обчислення на основі значень enum

public class EnumWithFieldsExample {
    enum Planet {
        MERCURY(3.303e+23, 2.4397e6),
        VENUS(4.869e+24, 6.0518e6),
        EARTH(5.976e+24, 6.37814e6);

        private final double mass;   // в кілограмах
        private final double radius; // в метрах

        // Конструктор
        Planet(double mass, double radius) {
            this.mass = mass;
            this.radius = radius;
        }

        // Метод для обчислення гравітації
        public double surfaceGravity() {
            double G = 6.67300E-11;
            return G * mass / (radius * radius);
        }

        public void printInfo() {
            System.out.printf("Планета %s: маса = %e кг, радіус = %e м, гравітація = %f м/с²%n",
                    this.name(), mass, radius, surfaceGravity());
        }
    }

    public static void main(String[] args) {
        System.out.println("Інформація про планети:");
        for (Planet planet : Planet.values()) {
            planet.printInfo();
        }

        // Порівняння гравітації
        Planet earth = Planet.EARTH;
        System.out.println("\nГравітація на Землі: " +
                earth.surfaceGravity() + " м/с²");
    }
}