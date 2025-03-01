package com.java.exceptionHandling.throwKeyword;

import java.io.FileNotFoundException;
import java.io.IOException;

// If we want to explicitly throw an exception we can use the throw keyword.

public class Main {
    public static void main(String[] args) throws Exception{
        //method1();
        // method2();
        method3();
    }

    public static void method1() {
        throw new RuntimeException("Exception occured at method1"); // This is an unchecked exception.
    }

    public static void method2() {
        try {
            throw new IOException(); // This is the checked exception so we have to catch it.
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    // We can also do this for throwing out the unchecked exceptions
    public static void method3() throws IOException{
        throw new FileNotFoundException("File not found dude."); // Here we're passing a message to the constructor.
    }
}
