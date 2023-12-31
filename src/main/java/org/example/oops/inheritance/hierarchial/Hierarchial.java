package org.example.oops.inheritance.hierarchial;

class Base{
    String name = "BaseClass";
}
class Derived1 extends Base{
    void print(){
        System.out.println("print from Derived1 "+name);
    }
}
class Derived2 extends Base{
    void print(){
        System.out.println("print from Derived2 "+name);
    }
}
class Derived3 extends Base{
    void print(){
        System.out.println("print from Derived3 "+name);
    }
}

public class Hierarchial {
    public static void main(String[] args) {
        Derived1 derived1 =  new Derived1();
        Derived2 derived2 = new Derived2();
        Derived3 derived3 =  new Derived3();

        derived1.print();
        derived2.print();
        derived3.print();
    }
}
