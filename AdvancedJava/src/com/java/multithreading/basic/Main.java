package com.java.multithreading.basic;

/*
 * -> Java provides robust support for multithreading allowing developers
 * to create applications that can perform multiple tasks simutaneously, improving 
 * performance and responsiveness.
 * -> In Java, Multithreading is the concurrent execution of two or more threads to maximize
 * the utilization of the CPU.Java's multithreading capabilities are part of the 
 * java.lang package, making it easy to implement concurrent execution. 
 * -> In a single core env , java multithreading is managed by the JVM and the OS which 
 * switch between threads to give the illusion of concurrency. 
 * -> In a multi core env, jvm can distribute threads across multiple cores allowing 
 * true parallel execution of threads.
 * -> A thread is a lightweight process, the smallest unit of processing.
 * -> Java support multithreading through its java.lang.Thread class and the java.lang.Runnable interface.
 * -> When a java program starts one thread begins running immediately, which is called the main thread. This
 * thread is responsible for executing the main method of a program.
 * -> To create a new thread in java, you can either extend the Thread class or implement the
 * runnable interface.
 */

 // Note - Run method contains the code that been executed.

public class Main {
    public static void main(String[] args) {
        // System.out.println(Thread.currentThread().getName());
        
        // 1. If you creating a thread via Thread class

        NewThread newThread = new NewThread();
        newThread.start(); // Start method is called to initiate a new thread.

        // 2. If you are creating a thread using the Runnable interface.

        // Firslty we have to create the instance of the AnotherThread.
        AnotherThread anotherThread = new AnotherThread();
        // Then we have to create an object of the thread class and pass the class object which
        // implements the Runnable interface.
        Thread t1 = new Thread(anotherThread); 
        t1.start();

        int i = 0;
        while (i <= 50) {
            System.out.println("World " + Thread.currentThread().getName());
            i++;
        }
        
    }
}