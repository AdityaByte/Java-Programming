package com.java.multithreading.locks;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/*
 * Fair Lock:
 * ----------------
 * - A fair lock ensures that threads acquire the lock in **FIFO (First Come, First Served) order**.
 * - When a thread requests the lock, it **waits in a queue** if other threads have already requested it.
 * - This prevents **starvation**, ensuring that every thread gets a fair chance to execute.
*/

public class FairLockExample {
    private final Lock lock = new ReentrantLock(true); // True for fairness.

    public void accessSource() {
        lock.lock();
        try {
            System.out.println(Thread.currentThread().getName() + " Acquired the lock");
            Thread.sleep(100);
        } catch (InterruptedException e) {
            System.out.println(e.getMessage());
            Thread.currentThread().interrupt();
        } finally {
            System.out.println(Thread.currentThread().getName() + " Released the lock");
            lock.unlock();
        }
    }
    
    public static void main(String[] args) throws InterruptedException{
        UnfairLockExample example = new UnfairLockExample();

        Runnable task = new Runnable() {
            public void run() {
                example.accessSource();
            };
        };

        Thread t1 = new Thread(task, "Thread 1");
        Thread t2 = new Thread(task, "Thread 2");
        Thread t3 = new Thread(task, "Thread 3");
        t1.start();
        t2.start();
        t3.start();
    }
}
