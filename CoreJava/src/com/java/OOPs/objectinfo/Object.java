package com.java.OOPs.objectinfo;

// Object - Object are the instance of a class.
// A class can have multiple objects.
// The object of the same class share same properties and methods
// Object creation is occur at runtime.
// Object are created using new keyword in java.

// Let us take an example where we have a student class
class Student{

    byte id = 12;
    String name = "aditya";

    // Here we have a method which gives information about student.
    public void getInformation(){
        System.out.println("Id is " + id + " and name is " + name);
    }

}

public class Object {
    public static void main(String[] args) {
        // For creating an object
        // Syntax : ClassName referenceVariable = new ClassName();
        Student student1 = new Student(); // Here both the objects share same properties and variable.
        Student student2 = new Student();
        student1.getInformation();
        student2.getInformation();
    }
}
