package com.java.basics;

// Java is a strongly typed language, so we must specify the type of data when declaring a variable.
// Data types are keywords that inform the compiler about the type of data being used.

// Types of Data in Java
/*
There are two types of data types in Java:

1. Primitive Data Types:
   - These are predefined by the Java language and represent simple values.
   - Since the primitive datatypes are immutable in java their value cannot be changed after their creation, but it can be assigned to a new value.
   - Examples: byte, short, int, long, char, boolean, float, double.

2. Non-Primitive Data Types:
   - These are user-defined or built using Java's object-oriented features.
   - The behavior of the non-primitive datatypes depends on while class is defining them like we can change the state of ArrayList after its creation but we
        cannot change the state of a string after its creation cause it is immutatble.
   - Examples: String, arrays, classes, interfaces, etc.
*/
public class DataType {
    public static void main(String[] args) {
        // Primitive Data Types
        byte byte1 = 123;       // Default value: 0, Size: 1 byte, Range: -128 to 127
        short short1 = 23122;   // Default value: 0, Size: 2 bytes, Range: -32,768 to 32,767
        int number = 10;        // Default value: 0, Size: 4 bytes, Commonly used for integers
        long long1 = 232121212L;// Default value: 0, Size: 8 bytes, For large integers
        float decimal = 3.14f;  // Default value: 0.0f, Size: 4 bytes, Single-precision floating point
        double double1 = 2312.12;// Default value: 0.0d, Size: 8 bytes, Double-precision floating point
        char letter = 'A';      // Default value: '\u0000', Size: 2 bytes, Stores a single character
        boolean flag = true;    // Default value: false, Size: 1 bit, Represents true/false

        // Non-Primitive Data Types
        String text = "Hello, World!"; // Sequence of characters, Default value: null
        int[] numbers = {1, 2, 3};     // Array of integers, Default value: null

        // Displaying primitive data
        System.out.println("Byte Value: " + byte1);
        System.out.println("Short Value: " + short1);
        System.out.println("Integer Value: " + number);
        System.out.println("Long Value: " + long1);
        System.out.println("Float Value: " + decimal);
        System.out.println("Double Value: " + double1);
        System.out.println("Character Value: " + letter);
        System.out.println("Boolean Value: " + flag);

        // Displaying non-primitive data
        System.out.println("String Value: " + text);
        System.out.print("Array Values: ");
        for (int num : numbers) {
            System.out.print(num + " ");
        }
    }
}
