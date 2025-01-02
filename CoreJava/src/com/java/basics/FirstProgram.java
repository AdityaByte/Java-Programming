package com.java.basics;

// Here this is the first program of Java.
// So let me you give you a brief introduction about java.
// Java is a purely Object-Oriented-Programming Language.
// Everything in java is associated with classes and object

// So this is the public class, and it has a main method which is the entry point of the java program.
public class FirstProgram {

    // This is the main method every program or java software must have a main method which tells the jvm that where to start and what to do.
    // So as we come to the naming convention of the main method it is public so what the jvm can find it
    // , it is static cause jvm don't need to create the object of it and void means it returns nothing.
    // and the main method takes a array of string type as an argument.
    // We can pass arguments such like that - javac program.class arg1 arg2 ....
    public static void main(String[] args){
        // So here we go to that line by the help of this we can print out statement to the terminal command line interface.
        // System is a final class out is a variable and println is a method
        System.out.println("Hello, World");
    }
}
