package org.example.oops;

class Example{
    private String name = "Srivatsan";

    public String getName(){
        return name;
    }
}

public class Encapsulation {
    public static void main(String[] args) {
       Example example = new Example();
       String name  = example.getName();
        System.out.println(name);
    }
}
