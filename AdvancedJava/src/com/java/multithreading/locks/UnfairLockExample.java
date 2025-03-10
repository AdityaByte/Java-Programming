package com.java.multithreading.locks;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/*
 * Unfair Lock:
 * ----------------
 * - An unfair lock does **not** guarantee the order in which threads acquire the lock.
 * - When a thread releases the lock, **any waiting thread** can acquire it, even if it arrived later.
 * - This can cause **starvation**, where some threads wait longer than others.
 * - In Java, `ReentrantLock` by default uses an **unfair locking** strategy.
*/

public class UnfairLockExample {
    private final Lock lock = new ReentrantLock();

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
