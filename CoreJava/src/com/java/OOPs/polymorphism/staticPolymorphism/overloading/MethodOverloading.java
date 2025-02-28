package com.java.OOPs.polymorphism.staticPolymorphism.overloading;

/*
 * Static polymorphism - Compile time polymorphism 
 * As per the context of java the Java compiler which compiles the java file to the bytecode decides which version of a
 * particular method is being called at runtime as per the signature of the method.
 * 
 * Method Overloading - Overloading means existance of different methods of same name but different signature means of
 * different parameters and return type
 */

class Arithmetic {
    
    // Here we have different methods for sum and for subtraction on the context of different return type

    int sum(int a, int b) {
        System.out.println("int method with 2 params is called");
        return a + b;
    }

    float sum(float a, float b) {
        System.out.println("Float method with 2 params is called");
        return a + b;
    }

    // Here we have some methods that take varargs
    
    int sum(int ...nums) {
        System.out.println("Int method with mutli params in called");
        int sum = 0;
        for(int num: nums) {
            sum += num;
        }
        return sum;
    }

    float sum(float ...nums) {
        System.out.println("Float method with multi params is called");
        float sum = 0.0f; // It has some default value if it is not initialized.
        for(float num: nums) {
            sum += num;
        }
        return sum;
    }

}

public class MethodOverloading {
    public static void main(String[] args) {
        Arithmetic arithmetic = new Arithmetic();
        System.out.println(arithmetic.sum(10.9f, 10));
        System.out.println(arithmetic.sum(10,20,30,40,50));
    }
}
