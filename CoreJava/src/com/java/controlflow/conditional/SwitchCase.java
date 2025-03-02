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

        // After the version of java12 we don't need to write the break statment explicitly 

        String data = "WEDNESDAY";

        switch (data) {
            case "MONDAY" -> {
                System.out.println("MONDAY"); // In this syntax we don't need to write the break statement.
            }
            case "TUESDAY" -> {
                System.out.println("TUESDAY");
            }
            default -> {
                System.out.println("WEEKEND");
            }
        }

        // There is an other syntax which come in java 12 where we can return out the values.

        String months = "JAN";

        String monthResult = switch (months) {
            case "JAN" -> "Month is january";
            case "FEB" -> "Month is februrary";
            // Here we have to handle all case or we can write the default case if you're dealing with enums or all.
            default -> "Month is not in data";
        };

        System.out.println(monthResult);
    }
}
