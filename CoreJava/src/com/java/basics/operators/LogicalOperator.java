package com.java.basics.operators;

// In the digital electronics we have learned about and, or and not gates so the logical operator performs the same.
// Types of logical operator -
/*
1. Logical And &&
2. Logical Or ||
3. Logical Not !
 These are used in control statment for decision that if we want both the statement true we use and and if we want any of the we use or.
 */
public class LogicalOperator {
    public static void main(String[] args) {
        boolean cond1 = true;
        boolean cond2 = false;
        System.out.println(cond1 && cond2); // It returns false
        System.out.println(cond1 || cond2); // It returns true
        System.out.println(!cond2); // It returns true
    }
}
