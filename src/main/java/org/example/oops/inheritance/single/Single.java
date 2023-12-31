package org.example.oops.inheritance.single;

class Base{
    void show(){
        System.out.println("showMethod from BaseClass");
    }
    void print(){
        System.out.println("Print Method");
    }
}

class Derived extends Base{
    /*Polymorphism*/
    /*This will override the BaseClass Method*/
    void show(){
        System.out.println("showMethod from DerivedClass");
    }
}

/*Single Inheritance*/
public class Single {
    public static void main(String[] args) {
        Derived derived = new Derived();
        derived.show();
        derived.print();
    }
}
