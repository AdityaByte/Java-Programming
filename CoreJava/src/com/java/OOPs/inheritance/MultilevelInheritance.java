package com.java.OOPs.inheritance;

// If one class is inherited from the other class and the class is also a super class for some other classes 
// then this type of inheritance is called as multilevel inheritance.

class Parent {
    Parent() {
        System.out.println("This is the Parent class");
    }
}

class Child extends Parent {
    Child() {
        System.out.println("This is the Child class");
    }
}

class GrandChild extends Child {
    GrandChild() {
        System.out.println("This is the Grand Child class");
    }
}

public class MultilevelInheritance {
    public static void main(String[] args) {
        Parent obj = new GrandChild();
    }
}
