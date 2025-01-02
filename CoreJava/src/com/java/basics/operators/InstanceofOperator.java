package com.java.basics.operators;

class Person{

}

class Child extends Person{

}

public class InstanceofOperator {
    public static void main(String[] args) {
        // Here the instanceof operator is used for checking a object is an instance of which class.
        // Here we are creating object of Person class
        Person p1 = new Person();
        System.out.println(p1 instanceof Person); // It returns True.

        Child c1 = new Child();
        // Here the Child is the subclass of the Person class so the instanceof operator also checks for inheritance relationship.
        System.out.println(c1 instanceof Person);

    }
}
