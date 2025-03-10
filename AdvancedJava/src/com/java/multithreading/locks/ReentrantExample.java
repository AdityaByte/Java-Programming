package com.java.multithreading.locks;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/*
 * Deadlock :- 
 * Deadlock occurs when two or more threads are waiting for each other
 * to release a lock, creating a circular dependency.
 * 
 * Demonstrating ReentrantLock:
 * A single thread can acquire the same lock multiple times without getting blocked.
 * Here, the outerMethofd() locks the resource and calls innerMethod(), which also 
 * locks the same resource. However, since we are using ReentrantLock, the same 
 * thread can re-acquire the lock without causing a deadlock.
 */

public class ReentrantExample {
    // Since the lock is re-enterant same thread can reenter the lock. 
    private final Lock lock = new ReentrantLock();

    public void outerMethod() {
        //lock.lockInterruptibly(); // If we want the other thread to not wait till the main one 
        // is processing so we can interrupt the other thread using the lockInterruptibly method.
        lock.lock();
        try{
            System.out.println("Outer method");
            innerMethod();
        } finally {
            lock.unlock();
        }
    }

    public void innerMethod() {
        lock.lock();
        try {
            System.out.println("Inner method");    
        } finally {
            lock.unlock();
        }
    }

    public static void main(String[] args) {
        ReentrantExample rex = new ReentrantExample();
        rex.outerMethod();
    }
}
