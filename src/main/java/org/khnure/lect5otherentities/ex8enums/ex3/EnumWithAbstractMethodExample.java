package org.khnure.lect5otherentities.ex8enums.ex3;

//Enum з абстрактними методами

//Різні реалізації методу для кожного значення enum

//Поліморфну поведінку enum

//Використання enum як стратегії

public class EnumWithAbstractMethodExample {
    enum Operation {
        PLUS {
            public double apply(double x, double y) {
                System.out.println("Виконується додавання");
                return x + y;
            }
        },
        MINUS {
            public double apply(double x, double y) {
                System.out.println("Виконується віднімання");
                return x - y;
            }
        },
        MULTIPLY {
            public double apply(double x, double y) {
                System.out.println("Виконується множення");
                return x * y;
            }
        };

        // Абстрактний метод, який повинен бути реалізований кожним значенням enum
        public abstract double apply(double x, double y);
    }

    public static void main(String[] args) {
        double x = 10;
        double y = 5;

        for (Operation op : Operation.values()) {
            System.out.printf("%f %s %f = %f%n",
                    x, op.name(), y, op.apply(x, y));
        }
    }
}
