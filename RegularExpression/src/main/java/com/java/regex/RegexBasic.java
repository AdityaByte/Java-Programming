package com.java.regex;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Regular Expression in Java:
 * - Regular expression are used for different aspects such as:
 * 1. For matching out a pattern.
 * 2. For validating the text.
 * 3. For searching for a particular pattern.
 * and so on.
 */

public class RegexBasic {

    /**
     * @param args
     * Regex is an api in java through which we can use regex.
     * If we want to check a particular data to a string we use regex.
     * Java has 3 classes and 1 interface for regex-
     * 1. Pattern class - for creating a pattern.
     * 2. Matcher class - It performs the match operation to the string.
     * 3. PatternSyntaxException class - If there is a syntax error in the regex then this exception is throwed.
     * 4. MatchResult Interface - It prints the boolean result if the match occurred.
     *
     * Note: Check out my python repo where it has a file name 'snippets.txt' it has all the data
     * regarding for learning the regex despite language specific.
     */
    public static void main(String[] args) {
        // Let the user enters email, and we have to check whether the email is valid or not.
        // For that case we can use regex.
        Scanner s = new Scanner(System.in);
        System.out.print("Enter email: ");
        String email = s.next();

        String regex = "[a-zA-Z0-9_.+]+@[a-zA-Z]+[.][a-zA-Z]+";

        // Creating the pattern.
        Pattern pattern = Pattern.compile(regex);

        // Matching the email to the pattern
        Matcher matcher = pattern.matcher(email);

        boolean isMatched = matcher.matches();

        if (isMatched) {
            System.out.println("Email is valid");
        } else {
            System.out.println("Email is invalid");
        }
    }
}