package com.java.controlflow.iterative;

// A loop inside a loop is known as a nested loop.
public class NestedLoop {
    public static void main(String[] args) {
        // Nested For loop
        // Printing out a square block using nested loop
        for(int i=0; i<5; i++){
            for(int j=0; j<5; j++){
                System.out.print("$ ");
            }
            System.out.println();
        }
    }
}
