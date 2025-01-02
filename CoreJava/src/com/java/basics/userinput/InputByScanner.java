package com.java.basics.userinput;

import java.util.Scanner;

// If we want to take a input from the user at the command line interface then we have to do this
// We have to import the Scanner class which comes in the java.util package then we can take input.
public class InputByScanner {
    public static void main(String[] args) {
        // Here we have to create an object / instance of the scanner class
        Scanner scan = new Scanner(System.in); // Inside the paranthesis means we have to give an argument to the constructor of the scanner class.
        // Now we can take input from the user
        // If we want to input a sentence or a word
        String sentence = scan.nextLine();
        // If we only want to input a word the upcoming words after the whitespace are gets rejected.
        String word = scan.next();
        // If we want to take a input of a byte, short, integer, float, double and a boolean
        scan.nextByte();
        scan.nextShort();
        scan.nextInt();
        scan.nextLong();
        scan.nextFloat();
        scan.nextDouble();
        scan.nextBoolean();

        // The above method of taking inputs directly from like nextInt has some bugs so the preferred way to doing that
        // Firstly we have to take the input in the form of String then we can parse it to desired DataType.

        int a = Integer.parseInt(scan.next()); // This is how we can do that....
    }
}
