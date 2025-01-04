package com.java.basics.userinput;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// Buffered Reader reads input line by line and, it is efficient for large inputs.
// Buffered Readers are not thread safe.
// Here we have to manually parse the data in scanner the data is parse automatically.
// Buffered reader throws IOException.
public class InputFromBufferedReader {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Enter Data - ");
        String data = bufferedReader.readLine();
        System.out.println(data);

        // If we want to take an integer we can do this
        int a = Integer.parseInt(bufferedReader.readLine()); // If the user enter a string there it will throw a NumberFormatException
        System.out.println(a);
    }
}
