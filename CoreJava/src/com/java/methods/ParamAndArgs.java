package com.java.methods;

// Parameters - Parameters are defined in the definition of a method.
// Arguments - Values passed to the method when it is called.
public class ParamAndArgs {

    /**
     * A user-defined method to remove leading and trailing spaces from a String.
     * @param str - The input String provided by the user.
     * @return A trimmed version of the input String.
     */
    static String trimString(String str) {
        // Use the strip() method to remove unnecessary spaces
        return str.strip();
    }

    /**
     * A simple static method for printing a message to the console.
     * @param prompt - The message to be printed.
     */
    static void print(String prompt) {
        System.out.println(prompt);
    }

    public static void main(String[] args) {
        // Call the trimString method and pass its result to the print method
        print(trimString("         Aditya        "));
    }
}
