package com.java.OOPs.inheritance;

// Acquring properties of the Super class to the Sub class is called inheritance.
// Private data members are not inherited.

class Car {
    protected byte wheels = 4;

    Car() {
        System.out.println("This is the car class");
    }

    public void func() {
        System.out.println("this is the super class function.");
    }
}

class Honda extends Car{
    Honda() {
        // super(); // It calls the super class constructor first then next one.
        super.func();
        System.out.println("This is the honda class");
    }
}

public class SingleInheritance {
    public static void main(String[] args) {
        Honda honda = new Honda();
    }
}
