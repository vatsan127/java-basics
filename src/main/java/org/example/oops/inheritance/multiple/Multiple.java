package org.example.oops.inheritance.multiple;

interface PI1 {

    default void show()
    {
        System.out.println("Default PI1");
    }
}

// Interface 2
interface PI2 {

    // Default method
    default void show()
    {
        System.out.println("Default PI2");
    }
}

class Multiple implements PI1, PI2 {

    @Override
    public void show()
    {
        PI1.super.show();
        PI2.super.show();
    }

    public void showOfPI1() {
        PI1.super.show();
    }

    public void showOfPI2() {
        PI2.super.show();
    }

    public static void main(String args[])
    {
        Multiple d = new Multiple();
        d.show();
        System.out.println("Now Executing showOfPI1() showOfPI2()");
        d.showOfPI1();
        d.showOfPI2();
    }
}

