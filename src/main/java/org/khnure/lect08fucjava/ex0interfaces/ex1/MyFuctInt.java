package org.khnure.lect08fucjava.ex0interfaces.ex1;


public interface MyFuctInt {

//    void test();
//    void test1();

    default void test1(String arg) {
        test3(arg);
    }

    static void test2(String arg) {
        System.out.println(arg);
    }

    private void test3(String arg) {
        System.out.println(arg);
    }
}
