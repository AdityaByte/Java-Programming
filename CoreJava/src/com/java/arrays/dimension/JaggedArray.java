package com.java.arrays.dimension;


// Jagged Array is a type of array in which the member array can be of different sizes.
// Example int[][] arr = {{1,2},{1,4,4},{1}}};
// Here you can see that the number of colum for rows are different.
public class JaggedArray {
    public static void main(String[] args) {
        // Declaration and initialization of jagged array
        // DataType[][] array_name = new DataType[n][] , n-no of rows
        /*
            array_name[] = new data_type[n1]        //n1= no. of columns in row-1
            array_name[] = new data_type[n2]       //n2= no. of columns in row-2
            array_name[] = new data_type[n3]       //n3= no. of columns in row-3
                                               .
                                               .
                                               .
            array_name[] = new data_type[nk]        //nk=no. of columns in row-n
         */

        /*
        // Method 2
        int arr_name[][] = new int[][]  {
                new int[] {10, 20, 30 ,40},
                new int[] {50, 60, 70, 80, 90, 100},
                new int[] {110, 120}
        };
        // Method 3
        int[][] arr_name = {
                new int[] {10, 20, 30 ,40},
                new int[] {50, 60, 70, 80, 90, 100},
                new int[] {110, 120}
        };
        // Method 4
        int[][] arr_name = {
                {10, 20, 30 ,40},
                {50, 60, 70, 80, 90, 100},
                {110, 120}
        };
        */

        // 1. method 1
        int[][] jaggedArray = new int[2][]; // It can have 2 rows but variable column
        jaggedArray[0] = new int[2];
        jaggedArray[1] = new int[5];

        // 2. Method 2
        int arr[][] = new int[][]{
                new int[] {10,20,30},
                new int[] {23,12,423,23,12}
        };

        // 3. Method 3
        int[][] arr1 = new int[][]{
                new int[] {10,20,30},
                new int[] {23,12,423,23,12}
        };

        // 4. Method 4
        int[][] arr2 = {
                {1,2,3},
                {2,43,5,6},
                {1,2}
        };
    }
}
