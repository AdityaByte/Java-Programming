package com.java.methods;

// Function inside a class is known as Method.
// Methods are the block of code that performs a specific function.
// Methods are reusable so that it can reduce excess code for doing the same function many times
// Types of method :
/*
1. Pre-Built methods - Java provides several pre-defined methods in its standard libraries.
   Example: `System.out.println()` is a method in the `java.lang` package that
   prints the provided argument to the console.

2. User-Defined methods - These are the methods that are defined by us (Programmer) for
    doing a particular task which can be for example calculating a sum of two numbers and any type of business logic.
 */
// Syntax:
/*
Note - Non-access-specifier is optional.
Note - Exception_list is optional too.
<access-specifier> <non-access-specifier> <returnType> nameOfMethod(list_of_parameters) Exception_list {
    // Body of the method
}
 */
// Note - Before studying about method you need to study about access-specifiers and non-access-specifiers return type naming convention.
// In Java we follow camelCase as a naming convention for methods.
// Note - Two methods can't have the same name.
public class Method {

    // Here we are creating a method which makes sum of two numbers.
    // We can make it private too since we have to access that in the same class.
    // By default, default is the access specifier of the method. (Package Private)
    // The static keyword makes a method or variable belong to the class rather than any specific instance of the class.
    // A static method can be called without creating an object of the class, making it ideal for utility methods or operations
    // that do not depend on instance variables or instance-specific behavior.
    // You don't need to write default access specifier.

    // This is how we can call a method.
    static void sum(int a, int b){
        System.out.println(a + b);
    }

    // If we make out method public so we have to create a instance of this class for accessing it or using it
    public void sumMethod(int a, int b){
        System.out.println(a + b);
    }


    public static void main(String[] args) {
        sum(1, 4); // Print out 5
        Method methodObject = new Method();
        methodObject.sumMethod(1 , 4); // It prints out the same output 5
    }
}
