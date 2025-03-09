package com.java.multithreading.methods;

public class MyThread extends Thread{

    public MyThread() {

    }

    public MyThread(String name) {
        // Here we can also change the name of the thread.
        //setName(name);

        // You can change the name of the thread by calling the constructor of the Thread class too.
        super(name);
    }
    
    @Override
    public void run() {
        // Code for learning normal methods before priority ones.
        // try {
        //     System.out.println(Thread.currentThread().getName());
        //     Thread.sleep(1000);
        // } catch (Exception e) {
        //     System.out.println(e.getMessage());
        // }

        // Code for learning priority
        // for (int i=0; i<5; i++) {
        //     System.out.println(Thread.currentThread().getName() + " - Priority: " + Thread.currentThread().getPriority() + " - count: " + i);
        //     try {
        //         Thread.sleep(500);
        //     } catch (InterruptedException e) {
        //         System.out.println(e.getMessage());
        //     }
        // }

        // Code for learning the interrupt method.
        // try {
        //     System.out.println("Hello world");
        //     Thread.sleep(200);
        // } catch (InterruptedException e) {
        //     System.out.println("Interruped exception occured : " + e);
        // }

        // Code for learning the yield method.
        // for(int i=0; i<5; i++) {
        //     System.out.println(Thread.currentThread().getName() + " is running...");
        //     Thread.yield(); // This will tell that give a chance to the other thread too.
        // }

        // Code for the daemon thread.
        for( ; ; ){ // Infinite loop
            System.out.println("Hello world");
        }
    }

}
