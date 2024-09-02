package org.khnure.lect4classes.ex3dynamic;

// Головний клас з методом main для демонстрації
public class InnerNonStaticNestedClassDemo {

    private int outerVar = 2;

    private int getOuterVar() {
        return outerVar;
    }

    // Нестатичний вкладений клас, доступний через MainClass.NestedClass
    public class NestedClass {
        private String instanceField = "Інстанційне поле";
        private static String staticField = "Статичне поле";

        // Метод екземпляра у вкладеному класі
        public void instanceMethod() {
            System.out.println("Метод екземпляра у вкладеному класі");
        }

        // Статичний метод у вкладеному класі
        public static void staticMethod() {
            System.out.println("Статичний метод у вкладеному класі");
        }
    }

    public static void main(String[] args) {
        // Створення об'єкту головного класу для доступу до вкладеного нестатичного класу
        InnerNonStaticNestedClassDemo demo = new InnerNonStaticNestedClassDemo();
        InnerNonStaticNestedClassDemo.NestedClass nestedObject = demo.new NestedClass();

        // Виклик інстанційних полів та методів через об'єкт
        System.out.println(nestedObject.instanceField);
        nestedObject.instanceMethod();

//        demo.instanceField;

        // Виклик інстанційних полів та методів через об'єкт
//        System.out.println(nestedObject.outerVar);
//        nestedObject.getOuterVar();

        // Виклик статичних полів та методів через клас
        System.out.println(InnerNonStaticNestedClassDemo.NestedClass.staticField);
        InnerNonStaticNestedClassDemo.NestedClass.staticMethod();
    }

}
