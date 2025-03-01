package com.java.exceptionHandling.checkedException;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/*
 * Checked Exceptions : The exceptions which are being checked at compile-time are known as the checked exceptions.
 */

public class Main {
    public static void main(String[] args) {
        try {
            fileFunction();
        } catch (IOException e) { // SuperClass for IOExceptions.
            e.printStackTrace();
        }
    }

    // Here we have a method which deals with the file.
    public static void fileFunction() throws FileNotFoundException{
        FileReader fileReader = new FileReader("java.txt"); // It gives an checked exception.
        // Either we cover it using a try-catch block or we can throw out an exception using the throws keyword to aware the caller that this method 
        // Throw out a checked exception.
    }
}
