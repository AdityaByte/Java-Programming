package com.java.controlflow.iterative;

// The break and continue statements fall under jump control flow statements.

// The break statement is used to terminate loops and switch cases prematurely.
// When a break statement is encountered inside a loop, the loop stops execution immediately,
// and control transfers to the first statement after the loop.
// Syntax: break;

public class BreakStatement {
    public static void main(String[] args) {
        // Breaking the loop when the value of 'i' becomes 3
        for (int i = 0; i < 5; i++) {
            System.out.println("Value of i = " + i);
            if (i == 3) {
                break; // Break statement
            }
        }
    }
}
