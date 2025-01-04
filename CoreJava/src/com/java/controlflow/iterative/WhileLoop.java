package com.java.controlflow.iterative;

// While loop - Used when the number of iterations is not predetermined.
// The while loop executes as long as the specified condition evaluates to true.
// Once the condition evaluates to false, the loop stops immediately.
// If you can't handle the while loop properly then it as a result in infinite loop.
// Syntax:
/*
while(condition{
// Statement
// Update expression
}
 */
public class WhileLoop {
    public static void main(String[] args) {

        // 1. Increment while loop
        int i = 0;
        System.out.println("Increment while loop");
        while(i<10){
            System.out.println("Value of i is " + i);
            i++; // Here we have to manually increase the value
        }

        // 2. Decrement while loop
        int j = 10;
        System.out.println("Decrement while loop");
        while(j>0){
            System.out.println("Value of j is " + j);
            j--;
        }
    }
}
