package com.java.OOPs.classinfo;

// A class is a blueprint for creating objects.
// Classes are the basic building blocks of the object-oriented programming (OOP) concept.
// Multiple objects can be created from a single class, sharing common properties and methods.
// Since Java is an object-oriented programming language, there can only be one public class per file.
/*
    A class definition itself does not occupy memory at runtime. However, when a class is loaded into the JVM,
    memory is allocated for its static members, metadata, and method area.
 */
// We use the `class` keyword to create a class.
// Classes follow PascalCase as a naming convention.
// In Java, if no access modifier is specified, class members have the default (package-private) access modifier.
// Outer classes can only be `default` or `public`, and there can only be one `public` class in a file.
// Syntax:
/*
class ClassName {

}
*/

public class Class {

    // Fields / Attributes / Data members
    String name;
    int id;

    // Methods / Function / Member function
    public void method1() {
        System.out.println("I am a method inside a class...");
    }

    // Main method
    public static void main(String[] args) {
        // Creating an object of the Class
        Class c1 = new Class();
        c1.method1(); // Calling a method using the object
    }
}
