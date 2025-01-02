package com.java.basics.operators;

/*
Arithmetic operators are used for performing arithmetic operations --
such as - addition, subtraction, Multiplication, division, modulo.
 */
public class ArithmeticOperator {
    public static void main(String[] args) {
        // Here like we have two variables
        byte a = 12;
        byte b = 20;
        // The result outs in byte cause there are of byte types we have to convert them to float for floating point values.
        System.out.println(a + b); // Here we are performing addition with the + operator
        System.out.println(a - b); // Here we are performing subtraction with the + operator
        System.out.println(a * b); // Here we are performing multiplication with the * operator
        System.out.println(b / a); // Here we are performing division with the / operator
        System.out.println(b % a); // Here it gives a remainder by using % operator
    }
}
