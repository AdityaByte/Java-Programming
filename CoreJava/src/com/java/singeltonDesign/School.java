package com.java.singeltonDesign;

/*
 * Singelton design pattern :
 * - Singelton design pattern allows to only one instance of a class is being
 * created rather than multiple instances.
 */

public class School {
    // For making it singelton class we have to declare it's constructor private so that 
    // noone can create the instance of that class
    
    private School() {}

    private static School school = new School(); // Created an instance.

    public static School getInstance() {
        return school;
    }
}
