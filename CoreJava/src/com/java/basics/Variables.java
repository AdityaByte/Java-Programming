package com.java.basics;

// Variables - Variables are the container that store value since java is a strictly typed language
// so we have to specify each thing in it while declaring a variable
// Variables are generally stored in stack memory
// Syntax - DataType nameOfVariable = Value;
// so here we have to name a variable in camelCase convention.
// Important concept - so if i want to add a thing here like when we declare a variable no memory is allocated at compile time the memory is allocated at runtime means
// Like when we declare a variable like name1 so it has a string type so string is of 8 bytes so the compiler
// allocates a space of 8 bytes in the memory ( RAM ) and when we run the program the memory gets allocated at the space.
public class Variables {
    public static void main(String[] args){

        // Declaration
        String name1;
        // Initialization
        name1 = "aditya";

        // DateType referenceVariable = Value;
        int a = 10; // int - datatype, a = name of variable or we can call it reference variable and 10 is the actual value that store in memory.
        String name = "aditya";
        float f1 = 10.2f;
        double d1 = 12.1;
        short s1 = 1222;
        byte b1 = 2;
        long l1 = 1142331L;
        char c = 'c';
        boolean b = true;


        // Here i want to tell you more about variables -
        /*
        Types of variable -
        1. Local variable - whose scope is limited within the curly braces is the local variable.
        2. Static variable - static variables are the variables of class any member of the class can use this variable if its access specifier is public.
        3. Instance variable - Instance variable are the variable which are associated with object.
         */
        {
            // It is a local variable we cannot access it outside the braces.
            int localVariable = 100;
        }
        //System.out.println(localVariable); // it gives an error
        // we will learn static and instance variable in oop.
    }
}
