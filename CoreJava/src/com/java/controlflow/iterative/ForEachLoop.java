package com.java.controlflow.iterative;

// For Each Loop in Java
// If we want to iterate through a collection, array etc we use a for each loop it iterates through each element.
// It is also known as enhanced for loop.
// Syntax:
/*
for(Type of variable : collection){
// Statement using variable
}
 */
// It is commonly used to iterate over an array or a Collections class (e.g., ArrayList)
public class ForEachLoop {
    public static void main(String[] args) {
        String[] cities = {"Kinnaur", "Manipur", "Mizoram", "Tokyo", "San Jose"};
        for(String city: cities){
            System.out.println("City : " + city);
        }
    }
}
