package com.java.multithreading.basic;

// For creating a thread we have to extend it to Thread class 
public class NewThread extends Thread{

    // Here we have to override the run method inside the run method
    // We have to paste out the thing that we have to perform.
    @Override
    public void run() {
        int i = 1;
        while(i <= 50) {
            System.out.println("Hello " + Thread.currentThread().getName());
            i++;
        }
    }
    
}
