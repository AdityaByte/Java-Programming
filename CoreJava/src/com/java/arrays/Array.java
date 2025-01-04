package com.java.arrays;

// Array - An array is a collection of similar types of data stored in contiguous memory locations.
// Arrays are mutable in java.
// Array creation can happen in two steps:

/*
1. Declaration - When you declare an array, you are only creating a reference variable.
   Memory for the elements is not allocated yet.
   Syntax: DataType[] array;

2. Initialization - When you initialize an array, memory is allocated for the array's elements.
   This can be done using the 'new' keyword, specifying the type and size of the array.
   Syntax: array = new DataType[size];
*/

public class Array {
    public static void main(String[] args) {
        // Syntax:
        /*
        1. First way :
        DataType[] referenceVariable = new DataType[size];
        2. Second way :
        DataType referenceVariable[] = new DataType[size];
        3. Third way :
        DataType[] referenceVariable = {--data--};
         */

        // Array
        int[] integerArray; // Declaration
        integerArray = new int[10]; // Initialization

        // Declaration and Initialization at the same line
        char[] characterArray = new char[10];

        // Another way of creating the array
        int integerArray1[] = new int[4]; // this is also how we can create an array.
        int integerArray2[] = {1,3,4,5,21,3};

        // Accessing the element of an array
        System.out.println(integerArray2[2]); // accessing the element at index 3

        // Creating an element
        integerArray2[1] = 60;
        System.out.println(integerArray2[1]);

    }
}
