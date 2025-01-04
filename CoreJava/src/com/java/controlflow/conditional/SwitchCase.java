package com.java.controlflow.conditional;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// Switch case in java
// The one important thing about switch case is that it has a time complexity of O(1) notation.
// In switch case we have to define multiple cases and pass out a variable whom we have to check the case.
// If the variable value matches the defined cases then it came to that case and runs its body.
// You have to break out ease case otherwise it will check for other case too and run the default case.
public class SwitchCase {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in)); // We are using bufferedreader for taking input.
        System.out.print("Enter day : ");
        String day = bufferedReader.readLine().trim().toLowerCase(); // Removing the spaces from left and right and converting it to lowercase.
        switch(day){
            case "monday":
                System.out.println("The day is monday");
                break;
            case "tuesday":
                System.out.println("The day is tuesday");
                break;
            case "wednesday":
                System.out.println("The day is wednesday");
                break;
            case "thrusday":
                System.out.println("The day is thrusday");
                break;
            case "friday":
                System.out.println("The day is friday");
                break;
            case "saturday":
                System.out.println("The day is saturday");
                break;
            case "sunday":
                System.out.println("The day is sunday");
                break;
            default:
                System.out.println("I don't know about any day...");
                break;
        }
    }
}
