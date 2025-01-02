package com.java.basics.operators;

// These operator works with a single operand they can do things like increment, decrement, make a value negative and positive and also invert a boolean.
// Example - Increment and Decrement can be of two types pre increment and post increment
// Since the primitive datatypes are mutable in java their value cannot be changed after their creation but it can be assigned to a new value.
public class UnaryOperator {
    public static void main(String[] args) {
        int a = 19;
        System.out.println(a++); // Post-increment : answer would be 19 cause first the value prints out then it would increment.
        System.out.println(a); // Now the value is 20
        System.out.println(++a); // Pre-increment : answer would be 21 cause it firstly increase the value and then print it.
        System.out.println(-a); // If we want to make a value negative then we use this.
        System.out.println(+a); // If we want to make a value positive then we use this.
        System.out.println(!true); // It inverts true to false
    }
}
