package com.java.arrays.memory;

// Array: An array is a collection of similar types of data elements stored in contiguous memory locations.
// Arrays can be classified based on the type of data they store as follows:
// 1. Primitive Arrays
// 2. Non-Primitive Arrays

/*
1. Primitive Arrays:
   - Primitive array are stored in stack memory.
   - These arrays store primitive data types (e.g., int, float, char) directly in contiguous memory locations.
   - The values are stored in the stack memory.
   - Example: int[] arr = {10, 11, 23};
     Stack Memory:
     Address (Index)    Data
     100                10
     104                11
     108                23
   - Here, each element is stored in a sequential memory block.

2. Non-Primitive Arrays:
   - Non-Primitive array are stored in heap memory(references are in stack memory).
   - These arrays store references to objects in contiguous memory locations, but the objects themselves are stored elsewhere in the heap memory.
   - Example: String[] arr = {"Java", "Python", "C++"};
     Stack Memory:
     Address (Index)    Reference
     200                HeapAddress1
     204                HeapAddress2
     208                HeapAddress3
     Heap Memory:
     HeapAddress1 -> "Java"
     HeapAddress2 -> "Python"
     HeapAddress3 -> "C++"
   - In this case, the references are stored contiguously in stack memory, while the actual objects are stored in heap memory.
*/

public class PrimitiveandNonPrimitiveArray {
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

        // primitive array
        int[] numbers = {10, 20, 30};
        System.out.println("First element: " + numbers[0]);

        // non-primitive array
        String[] languages = {"Java", "Python", "C++"};
        System.out.println("First language: " + languages[0]);
    }
}
