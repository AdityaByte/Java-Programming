package com.java.strings;

/*
- StringBuilder represents a mutable sequence of characters.Unlike String class which creates a new object for each modification.
- Functionality of stringbuider is same as stringbuffer.
- It is not thread safe thus it cannot be used in multi-threaded environment, it is only used in single threaded environment.
- StringBuilder is faster than StringBuffer in most implementation.
-
 */
public class StringBuilderClass {
    public static void main(String[] args) {

        // Same as StringBuffer it has the same methods and creating technique.

        StringBuilder sb1 = new StringBuilder();
        // It has the same default capacity of 16 characters.
        System.out.println(sb1.capacity()); // It prints out the default capacity of StringBuilder.

        StringBuilder sb2 = new StringBuilder(49); // Here we specify the initial capacity of StringBuilder to 49
        System.out.println(sb2.capacity()); // Prints out 49

        // We can also create a StringBuilder using this that we can specify the String itself in it.
        StringBuilder sb3 = new StringBuilder("Aditya");
        // Here the print statement returns 22 cause the initial capacity is 16 and Aditya is of 6 character then 16 + 6 = 22
        System.out.println(sb3.capacity());
    }
}
