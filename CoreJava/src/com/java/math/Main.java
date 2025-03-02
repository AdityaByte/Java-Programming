package com.java.math;

// java.lang package is already imported in every java file.
// In the java.lang package there is a Math class which has some methods useful in mathematical operations.
// Such as finding a Max, Min and round off etc.

public class Main {
    public static void main(String[] args) {
        int a = 10;
        int b = 11;
        int max = Math.max(a, b);
        int min = Math.min(a, b);
        System.out.println("Max number is " + max + " Min Number is " + min);
    
        int c = -11;
        // If we want to make a negative value absolute then
        System.out.println("Absolute value is" + Math.abs(c));

        double d = 1.12d;
        // Greatest and nearest integer to d is ceil.
        System.out.println("Ceiling value of d " + Math.ceil(d));
    
        System.out.println("Floor value of d " + Math.floor(d));
        
        System.out.println("Rounding off to nearest integer of d " + Math.round(d));
    
        int e = 144;
        System.out.println(Math.sqrt(e)); // Returns a double

        int f = 12;
        System.out.println(Math.pow(f, 2.1));

        System.out.println(Math.log(10));
        System.out.println(Math.log10(10));

        // Trignometric methods too in this package

        System.out.println(Math.PI); // Constant value
        System.out.println(Math.round(Math.random() * 10)); // Generating a random number from 1 to 10
        
        // It has too methods for toDegree and toRadians methods.

        System.out.println(Math.nextAfter(1, 0));
    }
}
