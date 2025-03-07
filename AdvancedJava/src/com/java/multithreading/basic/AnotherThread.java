package com.java.multithreading.basic;

public class AnotherThread implements Runnable{
    @Override
    public void run() {
        for(int i=1; i<=50; i++) {
            System.out.println("another thread " + Thread.currentThread().getName());
        }
    }
}
