package com.java.arrays.dimension;

// Two dimensional is a type of array in which every element of the array is itself an array.
// In this type of array the elements are accessed by 2 index.
public class TwoDimensionalArray {
    public static void main(String[] args) {
        int[][] twoDimArray = new int[2][3];
        // The above array can be represented as
        int[][] twoDimArray2 = {{1,2,3}, {4,5,6}};

        // Iterating over a 2 dimensional array -

        for(int i=0; i<twoDimArray2.length; i++){
            for(int j=0; j<twoDimArray2[0].length; j++){
                System.out.print(twoDimArray2[i][j] + " ");
            }
            System.out.println();
        }
    }
}