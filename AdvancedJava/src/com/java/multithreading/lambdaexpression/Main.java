package com.java.multithreading.lambdaexpression;

/*
 * Lambda expression is a short way of writing things - 
 * When we have a Functional Interface - 
 * Functional Interface : Interface having only a single abstract method is functional interface.
 * So we can create the implementation of the functional interface using the lambda expression instead of writing more
 * code the smaller and lesser can do the same thing.
 * Note - Lambda expressions are introduced in java 8.
 * 
 * //Syntax :
 * public interface Something {
 * public void method();
 * }
 * 
 * so remove the access specifier return type and the name too
 * keep the paranthesis () place a hypen and arrow which points to the body -> {}
 * // Final syntax :
 * (parameters) -> {
 * // Body
 * };
 */

public class Main {
    public static void main(String[] args) {
        // In the old days we do this -- for creating a thread
        Runnable runnable = new Runnable(){ // Created an instance of the runnable interface and implementation class too.
            @Override
            public void run() {
                System.out.println("This is without lambda expression");
            }
        };
        Thread thread = new Thread(runnable);
        thread.start();
        // So this is how we have to create out a thread in java in old days.

        // Modern way of creating out thread.
        Runnable runnable2 = () -> {
            System.out.println("This is the lambda expression");
        };

        Thread thread2 = new Thread(runnable2);
        thread2.start();

        // You can do this too 
        
        Thread thread3 = new Thread(() -> {
            System.out.println("This is the thread3");
        });
        thread3.start();
    }
}
