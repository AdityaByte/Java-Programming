package com.java.OOPs.inheritance;

class Base {
    void baseFunction() {
        System.out.println("This is the base function..");
    }
}

class Derived1 extends Base {
    void derivedFunction() {
        System.out.println("This is the derived1 function..");
    }
}

class Derived2 extends Base {
    void derivedFunction() {
        System.out.println("This is the derived2 function..");
    }
}

public class HierarchalInheritance {
    public static void main(String[] args) {
        Base b1 = new Derived1();
        Derived2 b2 = new Derived2();

        b1.baseFunction();
        // b1.derivedFunction(); // We cannot call this method cause it is not in the base class and we are taking the refernce of the Base class.
        // For accessing the method which only found in the child class you have to downcast it to the Child class.
        ((Derived1) b1).derivedFunction();
        // Note - Try to avoid the direct downcasting 
        // You have to instanceof before downcasting
        if(b1 instanceof Derived1) {
            ((Derived1) b1).derivedFunction();
        }

        b2.baseFunction();
        b2.derivedFunction(); // Now we can call this function cause we are taking the reference of the derived class.
    }
}
