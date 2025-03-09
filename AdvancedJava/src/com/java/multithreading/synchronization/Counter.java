package com.java.multithreading.synchronization;

public class Counter {

    private int count = 0;

    /*
     * By making it synchrnoized when one thread is increasing the count
     * the other thread wait and vice versa.
     */
    public /*synchronized*/ void increment() {
        synchronized (this) { // Here this means we are taking about the current instance.
            // This is useful when we just want to make a block synchronized.
            count++;
        }
    }

    public int getCount() {
        return count;
    }
}
