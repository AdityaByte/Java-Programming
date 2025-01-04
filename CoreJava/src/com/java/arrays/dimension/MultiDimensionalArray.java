package com.java.arrays.dimension;

// Multi Dimensional Array - An array with more than two dimensions, which can be thought of as an array of arrays of arrays (and so on).
// It can be used for storing complex data structures like 3D matrices, tables with more dimensions, etc.
public class MultiDimensionalArray {
    public static void main(String[] args) {
        int[][][] threeDimArray = {
                {
                        {1,2},
                        {3,4}
                },
                {
                        {4,5},
                        {5,6}
                }
        };

        // The above array is the three-dimensional array
        int[][][] threeDimArray2 = new int[2][2][2];

        // Iterating through a three-dimensional array, multi-dimensional array
        // Since it is a 3d array we can't iterate on a 2d space.
        for(int i=0; i<threeDimArray.length; i++){
            for(int j=0; j<threeDimArray[0].length; j++){
                for(int k=0; k<threeDimArray[0][0].length; k++){
                    System.out.print(threeDimArray[i][j][k] + " ");
                }
                System.out.println();
            }
            System.out.println();
        }
    }
}