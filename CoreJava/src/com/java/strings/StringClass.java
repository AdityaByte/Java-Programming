package com.java.strings;

// String in java - String is just a sequence of character,word.
// String are the non-primitive datatypes in java
// Strings are immutable in java means we cannot change it state in java.
/*
The creation of string in java takes place in two ways -
1. Static way - By this way the string that have been created is stored in string pool in heap memory.
    This way is also known as creation of string by string literal.
    String referenceVariable = "Value";
2. Using new keyword - when we create a string using the new keyword then the string is create as an object and it is stored in
    non-pool in normal heap memory.
    String referenceVariable = new String("Value");

 Note - The reference Variables are stored in stack memory.
 */
public class StringClass {
    public static void main(String[] args) {
        // This is how we create a string using a string literal
        String name1 = "aditya";
        String name2 = "aditya";
        // Since both strings have the same value, they point to the same object in the String Pool.
        // The reference variables 'name' and 'name2' point to the same memory location in the String Pool.
        System.out.println(name1 == name2); // It returns true cause they are pointing to the same object which is stored at same memory location.

        String n1 = new String("aditya");
        String n2 = new String("aditya");
        // But when we compare these two object of string
        System.out.println(n1 == n2); // It will return false cause they are pointing to different memory location and different object.

        // let us take an example of how the strings are immutable in java
        String word = "aditya";
        word.concat("Hello");
        System.out.println(word); // It prints out aditya cause the strings are immutable
        word = word.concat("Hello"); // Here when we reassign the value to word it the reference variable word points to the new year and the old string is collected by the garbage collector.

    }
}
