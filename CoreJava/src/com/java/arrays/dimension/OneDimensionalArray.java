package com.java.arrays.dimension;

// One Dimensional Array - A One Dimensional Array is a simple array where the data elements are stored in a linear sequence.
// It is also called a single-dimensional array. Each element of the array is accessed using a single index.
public class OneDimensionalArray{
    public static void main(String[] args) {
        int[] singleDimArray = {1,2,4,5,3,56,3,23};

        // Accessing element of the singleDimArray using for each loop.
        System.out.println("One dimensional array - ");
        for(int element : singleDimArray){
            System.out.println(element);
        }

        // Modifying the element of the array
        singleDimArray[4] = 100;
        singleDimArray[2] = 56;

        // Printing out the modified array
        System.out.println("Modified array - ");
        for(int element : singleDimArray){
            System.out.println(element);
        }
    }
}