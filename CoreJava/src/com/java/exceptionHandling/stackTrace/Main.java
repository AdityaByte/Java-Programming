package com.java.exceptionHandling.stackTrace;

/*
 * Stack Trace is a way of giving a detailed information about the method calls.
 */

public class Main {
    public static void main(String[] args) {
        
        try{
            // Here we are calling the level3 method
            level3(); // On calling this it will prints out the detail description about where the exception is being occured.
        } catch (ArrayIndexOutOfBoundsException e) {
            // StackTraceElement[] stackTraceElements = e.getStackTrace();
            // for(int i=0; i<stackTraceElements.length; i++) {
            //     System.out.println(stackTraceElements[i]);
            // }
            // Instead of writing the upper thing we can use the other method of e.printStackTrace();
            e.printStackTrace();
        }
    }

    public static void level1() {
        int[] arr = {1,2,3,4};
        System.out.println(arr[5]); // This will gives us an error of ArrayIndexOutofBoundsException.
    }

    // This method calls the level1 method.
    public static void level2() {
        level1();
    }

    // This method calls the level2 method
    public static void level3() {
        level2();
    }
}
