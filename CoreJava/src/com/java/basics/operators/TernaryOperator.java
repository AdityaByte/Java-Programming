package com.java.basics.operators;

// Ternary Operators are basically used in functional style of programming in java.
// The Ternary Operator is a shorthand version of the if-else statement. It has three operands and hence the name Ternary.
// The general format is , condition ? if true : if false ===> condition ? if statement : else statement
public class TernaryOperator {
    public static void main(String[] args) {
        int a = 80;
        int b = 70;
        System.out.println(a > b ? "Hello world" : "World hello"); // Prints hello world cause the condition is true.
    }
}
