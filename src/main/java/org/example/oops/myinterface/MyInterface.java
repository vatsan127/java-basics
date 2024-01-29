package org.example.oops.myinterface;

public interface MyInterface {
    /*fields*/
    /*methods*/
    void show();

    void print();

    /*
     * default Methods
     * can be overriden in the implementation class
     * used to evolve the Interfaces
     * */
    default void defaultPrint() {
        System.out.println("Print from default Method");
    }

    /*
     * static Methods
     * Similar to default Methods
     * this cannot be overridden by the implementation classes
     * */
    static void staticPint() {
        System.out.println("Print from static method");
    }
}
