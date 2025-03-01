package com.java.exceptionHandling.finallyKeyword;

import java.util.Scanner;

/*
 * Finally keyword :
 * This block if followed up by the try catch block and this block runs every time even after the return statement too.
 * Use Case : It is mainly used for closing out the resources like in golang we have defer but in this we dont have.
 */

public class Main {
    public static void main(String[] args) {
        System.out.println(divide(1, 0));
        inputMethod();
    }

    public static int divide(int a, int b) {
        try {
            return a/b;
        } catch (Exception e) {
            System.out.println("Exception occured " + e);
            return -1;
        } finally {
            System.out.println("THis is the finally block");
        }
    }

    // Use case example :
    public static void inputMethod() {
        Scanner s = new Scanner(System.in);
        try {
            int a = s.nextInt(); // If the user pass out an string to this, this will produce out exception.
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            System.out.println("Closing the scanner resource.");
            s.close();
        }
    }
}
