package com.java.exceptionHandling.tryWithResources;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
 * Try with resources : 
 * We don't need to use the try-catch-finally block more for closing out the resources manually.
 * The overall headache can be done using the try catch resources block.
 * If the class implements the AutoClosable interface in the hierarchy then the jvm automatically closes that.
 */

public class Main {
    public static void main(String[] args) {
        try(BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
            int a = Integer.parseInt(reader.readLine());
        } catch (IOException e) {
            System.out.println(e);
        }
    }
}
