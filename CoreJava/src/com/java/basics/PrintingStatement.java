package com.java.basics;

// Here in this code we will discuss about printing types like how we can print things to cli using different methods that have been come with jvm.
public class PrintingStatement {

    public static void main(String[] args){
        // It prints statement with a new line character at the end.
        System.out.println("Hello, World");
        // It also prints the statement but didn't disclose the statement with a new line.
        System.out.print("Hey, There");
        // It is also a way of printing out statement like in C language we use printf.
        System.out.printf("%s\n" , "Hello world");
        // It is a way of printing out error it occurs in red line.
        System.err.println("Hello error");
    }

}
