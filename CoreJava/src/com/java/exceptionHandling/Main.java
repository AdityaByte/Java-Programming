package com.java.exceptionHandling;

// Handling exception in java 
// Exceptions are the unexpected error that came up to the program so we have to handle them efficiently
// Note : Understand the exception hierarchy and try to use the exact exception name for better readability and maintainability.

public class Main {
    public static void main(String[] args) {
        int numerators[] = {2,4,6,10};
        int denominators[] = {1,2,0,4};

        // Here wo cases runs smoothly but in the third case it gives out some exception which was the arithmetic exception.
        for(int i=0; i<numerators.length; i++) {
            System.out.println(divide(numerators[i], denominators[i]));
        }

        anotherMethod();
    }

    // We have a function out here which performs the divide operation
    private static int divide(int a, int b) {
        // Here this block will throw out some error so we have to catch it using the try catch block
        // try {
            // block which throw out some error.
        // } catch (Exception e) {
            // Catching the exception in this block.
        // }

        try{
            return a/b;
        } 
        catch (ArithmeticException e) {
            System.out.println(e); // Prints out the error and then return the value.
            return -1;
        }
    }

    // Here we have another method which throw out some errors
    private static void anotherMethod() {
        try {
            Student student = null; // We have assigned this to null;
            student.setName("aditya"); // This will throw out the null pointer exception.
        } catch (ArithmeticException e) {
            System.out.println("Arithmetic exception occured.");
        } catch (NullPointerException e) {
            System.out.println("Null pointer exception occured.");
        } catch (Exception e) { // As a general case cause this is the parent class of each exception.
            System.out.println(e);
        }
    }

}


class Student{
    String name;

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }
}