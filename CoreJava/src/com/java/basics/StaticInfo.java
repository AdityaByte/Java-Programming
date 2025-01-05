package com.java.basics;

/**
 * Demonstrates the behavior of static elements in Java.
 *
 * Key Points:
 * - Static members (blocks, variables, methods) are loaded and executed first when the class is loaded into memory.
 * - Static blocks are executed only once when the class is loaded by the JVM.
 */
public class StaticInfo {

    // Static block - executed when the class is loaded
    static {
        System.out.println("This is the static block. It executes before the main method when the class is loaded.");
    }

    // Main method - the entry point of the application
    public static void main(String[] args) {
        System.out.println("This is the main method. It executes after the static block.");
    }

    /*
     * Expected Output:
     * 1. This is the static block
     * 2. This is the main method
     */
}
