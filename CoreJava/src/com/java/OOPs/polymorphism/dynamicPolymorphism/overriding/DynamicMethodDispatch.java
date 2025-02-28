package com.java.OOPs.polymorphism.dynamicPolymorphism.overriding;

/* Dynamic Method Dispatch : 
 * Dynamically resolving the method call at runtime based on the actual 
 * object being created in the heap memory, regardless of the reference type. 
 * The method that gets executed belongs to the object’s class, not necessarily the reference type.
 */


class Animal {

    public void makeSound() {
        System.out.println("Animal Sound....");
    }

}

class Dog extends Animal {

    @Override
    public void makeSound() {
        System.out.println("Dog Sound....");
    }

}

public class DynamicMethodDispatch {
    public static void main(String[] args) {
        // Here we are creating the reference of the base class and object of the derived class.
        Animal animal = new Dog();
        animal.makeSound();
    }
}