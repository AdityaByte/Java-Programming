package com.java.OOPs.polymorphism.staticPolymorphism.overloading;

/*
 * Constructor Overloading : 
 * Having different constructor inside a same class with different signature is constructor overloading.
 * It is the type of compile time polymorphism.
 */

class StudentInformation {
    private long id;
    private String name;
    private int age;
    
    public StudentInformation() {
        this.id = 1001;
        this.name = "Aditya";
        this.age  = 20;
    }

    public StudentInformation(long id) {
        this.id = id;
    }

    public StudentInformation(long id, String name) {
        this.id = id;
        this.name = name;
    }

    public StudentInformation(long id, String name, int age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }

    public String toString() {
        return "Name is " + this.name + " and id is " + this.id + " and age is " + this.age;
    }
}

public class ConstructorOverloading {
    public static void main(String[] args) {
        StudentInformation student = new StudentInformation(10, "lakshya");
        System.out.println(student);
    }
}
