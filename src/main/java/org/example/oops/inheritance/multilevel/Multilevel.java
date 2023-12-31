package org.example.oops.inheritance.multilevel;

import lombok.extern.slf4j.Slf4j;

class Base{
    String className1 = "base";
}

class intermediatory extends Base{
    String className2 = "intermediatory";
}


class Derived extends intermediatory{
    String className3 = "Derived";
}

/*Multilevel Inheritance*/
public class Multilevel {
    public static void main(String[] args) {
        Derived derived = new Derived();
        System.out.println(derived.className1);
        System.out.println(derived.className2);
        System.out.println(derived.className3);
    }
}
