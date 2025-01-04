package com.java.controlflow.iterative;

// The continue statement is used to skip the current iteration of a loop
// and move to the next iteration without executing the remaining code in the loop body for that iteration.
// Syntax: continue;

public class ContinueStatement {
    public static void main(String[] args) {
        for (int i = 1; i <= 5; i++) {
            // Skipping even numbers using the continue statement
            if (i % 2 == 0) {
                continue; // Skip the current iteration if 'i' is even
            }
            System.out.println("Value of i: " + i);
        }
    }
}
