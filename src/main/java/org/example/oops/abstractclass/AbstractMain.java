package org.example.oops.abstractclass;

abstract class AbstractClass {
    /*abstract class variables which can be used by the child class*/
    /*it is not manadatory to use these variables or initialize*/
    int id;
    String name;

    /*Abstract method to implement by the child class*/
    public abstract int addPlusFive(int x);

    /*Concrete method from the abstract class which can be used by the child class*/
    public void print() {
        System.out.println("print from the Abstract concrete method ");
    }
}

public class AbstractMain extends AbstractClass {
    /*implemented abstract method*/
    public int addPlusFive(int x) {
        return x + 5;
    }

    public static void main(String[] args) {
        AbstractMain main = new AbstractMain();
        main.print();
        System.out.println(main.addPlusFive(5));
    }

}