package com.java.OOPs.interfaces.MutipleInheritance;

// Here we are learning how can we implement multiple inheritance in java with the help of interfaces.

interface Interface1 {
    default void function1() {
        System.out.println("This is the function1 of interface1");
    }
}

interface Interface2 {
    default void function1() {
        System.out.println("This is the function1 of interface2");
    }
}

class DemoClass implements Interface1, Interface2 {
    // Since the same signature methods are found inside both the interface we have to explicitly override the function1 
    // and want to define that which method we have to call for avoiding the ambiguity situation.

    @Override
    public void function1() {
        Interface1.super.function1();
        Interface2.super.function1(); // This is kinda similar to scope resolution operator in c++.
    }
}

public class Main {
    public static void main(String[] args) {
        DemoClass i1 = new DemoClass(); // Since objects are created at runtime so the method is called of whose object is being created.
        i1.function1();
    }
}
