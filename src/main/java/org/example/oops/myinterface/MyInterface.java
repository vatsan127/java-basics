package org.example.oops.myinterface;

public interface MyInterface {
    /*fields*/
    /*methods*/
    void show();

    void print();

    /*default*/
    default void defaultPrint() {
        System.out.println("Print from default Method");
    }

    /*static*/
    static void staticPint() {
        System.out.println("Print from static method");
    }
}
