package com.java.singeltonDesign;

//Singelton design pattern
public class Main {
    public static void main(String[] args) {
        //School school = new School(); // Can't create out an instance.
        School school = School.getInstance();
    }
}
